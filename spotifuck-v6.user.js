// ==UserScript==
// @name         Spotifuck
// @namespace    https://github.com/Myst1cX/spotifuck-userscript
// @version      6.4.fix
// @description  Full Spotifuck 1.6.4 UI hack (with minor tweaks) + playback control
// @author       Myst1cX (adapted from Spotifuck app)
// @match        *://open.spotify.com/*
// @grant        none
// @run-at       document-start
// @homepageURL  https://github.com/Myst1cX/spotifuck-userscript
// @supportURL   https://github.com/Myst1cX/spotifuck-userscript/issues
// @updateURL    https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-v6.user.js
// @downloadURL  https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-v6.user.js
// ==/UserScript==

/*
 * Spotifuck v6 - Accurate port from reverse-engineered v1.6.4 APK
 * Based on r0/e.java from classes1.dex
 *
 * Features from APK:
 * - Library button toggle (expand 100%×100% / collapse 48×48px)
 * - Pure black AMOLED mode for playback controls
 * - Auto-close library on playlist selection (and load the playlist)
 * - UI improvements (sidebar, search bar, playback controls)
 * - CSS hacks for better mobile experience
 
 * Fixed from APK:
  * - Library folder navigation (original behavior auto-closed library on any item selection, including folders.
  
 * Newly added (v6.3):
 * - Browser-side equivalent of Spotifuck's ForceEn that forces Android app locale to English before loading its WebView
 * - (Forces English on open.spotify.com: overrides navigator.language/languages,
 *   and strips a non-English /intl-xx/ locale prefix from the URL if present.)
 * - The feature is a functional dependency because of the following buttons hardcoded to English aria-label text:
 * const libBtn = document.querySelector('#Desktop_LeftSidebar_Id header button[aria-label*="Your Library"]:not(.fuckd)');
 * if (libBtn.getAttribute('aria-label') === 'Collapse Your Library') {
 
 * Newly added (v6.4.fix) - Fixed "Force English" (v6.3 was not working at all)
 * - forceEnglish() actually forces English now. The v6.3 version only overrode
 *   navigator.language and stripped the /intl-xx/ URL prefix, both of which only
 *   affect a single page load - the aria-labels Spotify actually renders (e.g.
 *   "Open Your Library") are driven by the account-level language preference at
 *   open.spotify.com/preferences, which is saved server-side. forceEnglish() now
 *   also flips that setting to "en" once, via a hidden iframe so it doesn't
 *   disrupt whatever the user is looking at, then reloads the page so the change
 *   actually takes effect. A localStorage flag means this only runs once ever, and skips the reload
 *   entirely if the account was already set to English.
 */

(function() {
    'use strict';

    console.log('🎵 Spotifuck v6 - APK v1.6.4 Port');

    // Global state variables
    let ulFlag = false;  // Unlock flag
    let ffDone = false;  // First fuck done (firstFuck initialization complete)
    let pfint = null;    // Primary features interval

    /**
     * forceEnglish - Force the web player to render in English.
     * open.spotify.com localizes via an /intl-xx/ URL prefix
     * Runs at document-start, before Spotify's own scripts get a chance to read navigator.language.
     */
    function forceEnglish() {
        try {
            Object.defineProperty(navigator, 'language', { get: () => 'en-US', configurable: true });
            Object.defineProperty(navigator, 'languages', { get: () => ['en-US', 'en'], configurable: true });
        } catch (e) {}

        const m = location.pathname.match(/^\/intl-([a-z]{2})(\/.*)?$/i);
        if (m && m[1].toLowerCase() !== 'en') {
            location.replace(location.origin + (m[2] || '/') + location.search + location.hash);
        }

        forceEnglishAccountSetting();
    }

    /**
     * forceEnglishAccountSetting - Flip the account-level language preference
     * (open.spotify.com/preferences, <select id="desktop.settings.selectLanguage">)
     * to "en" (the "English (English)" option - the base/US-flavored English;
     * "en-GB" is a separate option and NOT what this targets).
     * navigator.language and the /intl-xx/ URL prefix above only affect this one
     * page load - the aria-labels Spotify actually renders (e.g. "Open Your
     * Library") are driven by this account setting, which is saved server-side
     * and persists across sessions/devices once set. So this only needs to run
     * once; a localStorage flag prevents repeating it on every page load.
     * Confirmed by hand: the setter+dispatch trick below does persist the
     * setting, but the already-rendered page doesn't pick it up on its own -
     * only a reload/navigation does. So on first success this reloads the page
     * once; every load after that is a no-op (DONE_KEY already set).
     */
    function forceEnglishAccountSetting() {
        // NOTE: there used to be a permanent "spotifuckForcedEnglishAccountSetting"
        // flag here that, once set, skipped this function forever. That assumed
        // the account setting only ever changes via this script. It doesn't -
        // the user can change it manually (e.g. via /preferences directly), and
        // a permanent flag would then never notice and never re-apply English.
        // So this now re-checks the actual setting on every real page load
        // instead of trusting a one-time flag. The "already English" case is
        // cheap (one iframe load, no reload triggered), so this is fine to run
        // every time; only an actual mismatch triggers the flip+reload below.

        // Set right before we dispatch the change event and reload - tells the
        // *next* load to verify the setting actually saved instead of blindly
        // dispatching again.
        const PENDING_KEY = 'spotifuckEnglishFlipPending';
        // Caps how many times we'll retry a flip that doesn't stick within one
        // correction cycle, so a broken selector can't cause endless reloads.
        const ATTEMPTS_KEY = 'spotifuckEnglishFlipAttempts';
        const MAX_ATTEMPTS = 3;

        if (window.top !== window.self) return; // only the top frame drives this

        const verifying = localStorage.getItem(PENDING_KEY) === 'true';
        if (verifying) localStorage.removeItem(PENDING_KEY);

        // Runs `callback(doc, cleanup)` against the /preferences document,
        // either the current page (if we're already there) or a hidden iframe.
        // `cleanup()` removes the iframe if one was created; call it once done.
        const withPreferencesDoc = (callback) => {
            if (location.pathname.startsWith('/preferences')) {
                callback(document, () => {});
                return;
            }

            // Same-origin (open.spotify.com -> open.spotify.com), so
            // contentDocument access is allowed.
            const iframe = document.createElement('iframe');
            iframe.style.display = 'none';
            iframe.src = 'https://open.spotify.com/preferences';
            (document.documentElement || document.body).appendChild(iframe);

            let done = false;
            const cleanup = () => {
                if (done) return;
                done = true;
                iframe.remove();
            };

            iframe.addEventListener('load', () => {
                try {
                    callback(iframe.contentDocument, cleanup);
                } catch (e) {
                    console.log('Spotifuck: could not access preferences iframe', e);
                    cleanup();
                    callback(null, cleanup);
                }
            });

            // Safety net in case the select never appears (layout change, slow load, etc.)
            setTimeout(() => { const wasDone = done; cleanup(); if (!wasDone) callback(null, cleanup); }, 15000);
        };

        const giveUp = (reason) => {
            // Just stops this correction cycle's automatic retries - no permanent
            // flag is set, so the next real page load will simply check again.
            console.log('Spotifuck: ' + reason + ' - not retrying automatically');
        };

        const attemptFlip = () => {
            withPreferencesDoc((doc, cleanup) => {
                if (!doc) { cleanup(); giveUp('could not load preferences document'); return; }
                applyEnglishToLanguageSelect(doc, (result) => {
                    if (!result.found) {
                        cleanup();
                        giveUp('language selector not found - Spotify may have changed the settings page');
                        return;
                    }
                    if (!result.changed) {
                        cleanup();
                        localStorage.removeItem(ATTEMPTS_KEY);
                        console.log('Spotifuck: account language already English - no reload needed');
                        return;
                    }
                    // Dispatched the change event, but that only proves React
                    // saw it - not that Spotify's backend actually saved it.
                    // Reload and verify on the next load before trusting this.
                    localStorage.setItem(PENDING_KEY, 'true');
                    console.log('Spotifuck: dispatched English change - reloading to verify it saved');
                    setTimeout(() => { cleanup(); location.reload(); }, 1000);
                });
            });
        };

        if (!verifying) {
            attemptFlip();
            return;
        }

        // Verification pass: re-read (never re-dispatch blindly) the setting
        // to confirm the flip from last load actually persisted.
        withPreferencesDoc((doc, cleanup) => {
            if (!doc) { cleanup(); giveUp('could not reload preferences document to verify'); return; }
            applyEnglishToLanguageSelect(doc, (result) => {
                cleanup();
                if (result.found && result.value === 'en') {
                    localStorage.removeItem(ATTEMPTS_KEY);
                    console.log('Spotifuck: verified account language is now English');
                    return;
                }
                if (!result.found) {
                    giveUp('language selector not found during verification - Spotify may have changed the settings page');
                    return;
                }
                const attempts = parseInt(localStorage.getItem(ATTEMPTS_KEY) || '0', 10) + 1;
                if (attempts >= MAX_ATTEMPTS) {
                    giveUp('English flip did not stick after ' + attempts + ' attempt(s) - clear localStorage "' + ATTEMPTS_KEY + '" to retry');
                    return;
                }
                localStorage.setItem(ATTEMPTS_KEY, String(attempts));
                console.log('Spotifuck: flip did not stick yet, retrying (' + attempts + '/' + MAX_ATTEMPTS + ')');
                attemptFlip();
            }, { readOnly: true });
        });
    }

    /**
     * applyEnglishToLanguageSelect - Read or set the given document's language
     * <select>. In write mode (default) it flips the value to "en" and
     * dispatches a real change event so Spotify's own (React-controlled)
     * handler picks it up - a plain .value assignment gets silently overwritten
     * by React's next render, so this goes through the native property setter
     * first, same trick needed for any React-controlled input. In read-only
     * mode it just reports the current value without touching anything, used
     * to verify a previous flip actually saved.
     * @param {Document} doc - document to operate on (main doc or iframe's)
     * @param {Function} onDone - called once with a single result object:
     *   { found: boolean, value: string|null, changed: boolean }
     *   - found: whether the <select> was located at all
     *   - value: its current value ('en' on success), or null if not found
     *   - changed: true only if this call just dispatched a change (write mode)
     * @param {Object} [options]
     * @param {boolean} [options.readOnly=false] - never modify the select, just report its value
     */
    function applyEnglishToLanguageSelect(doc, onDone, { readOnly = false } = {}) {
        let settled = false;
        const resolve = (result) => {
            if (settled) return; // guards against double-fire (mutation callback racing the timeout)
            settled = true;
            onDone(result);
        };

        const trySelect = () => {
            const select = doc.getElementById('desktop.settings.selectLanguage');
            if (!select) return false;

            if (readOnly || select.value === 'en') {
                resolve({ found: true, value: select.value, changed: false });
                return true;
            }

            const win = doc.defaultView || window;
            const nativeSetter = Object.getOwnPropertyDescriptor(win.HTMLSelectElement.prototype, 'value').set;
            nativeSetter.call(select, 'en');
            select.dispatchEvent(new Event('change', { bubbles: true }));

            console.log('Spotifuck: dispatched English change on language selector');
            resolve({ found: true, value: 'en', changed: true });
            return true;
        };

        if (trySelect()) return;

        const win = doc.defaultView || window;
        const startObserving = () => {
            if (trySelect()) return; // may have appeared while we were waiting for <body>
            const observer = new win.MutationObserver(() => {
                if (trySelect()) observer.disconnect();
            });
            observer.observe(doc.body, { childList: true, subtree: true });
            setTimeout(() => {
                observer.disconnect();
                resolve({ found: false, value: null, changed: false }); // timed out - selector genuinely missing
            }, 12000);
        };

        if (doc.body) {
            // Normal case: iframe 'load' event already guarantees <body> exists.
            startObserving();
        } else {
            // document-start on the /preferences route itself, reached by
            // direct navigation - <body> hasn't been parsed yet. Previously
            // this silently skipped setting up the observer entirely and just
            // timed out doing nothing. Wait for DOMContentLoaded instead.
            doc.addEventListener('DOMContentLoaded', startObserving, { once: true });
        }
    }

    forceEnglish();

    // Note: Class name ".fuckd" used throughout is from original APK source (r0/e.java)
    // It marks elements as "already processed" to prevent duplicate event handlers

    /**
     * switchLs - Toggle library sidebar between expanded and collapsed states
     * From r0/e.java line 202: window.switchLs=function(){...}
     * @param {boolean} forceCollapse - If true, force collapse regardless of current state
     */
    window.switchLs = function(forceCollapse = false) {
        const leftSidebar = document.querySelector('#Desktop_LeftSidebar_Id');
        if (!leftSidebar) return;

        const navFirstChild = leftSidebar.querySelector('nav>div>div:first-child');
        if (!navFirstChild) return;

        // Check if expanded (classList.length === 2 means expanded in APK logic)
        const isExpanded = navFirstChild.classList.length === 2;

        if (!forceCollapse && isExpanded) {
            // Expand to full-screen overlay
            console.log('#Library: Expanded');
            leftSidebar.style.position = 'fixed';
            leftSidebar.style.width = '100%';
            leftSidebar.style.height = '100%';
            leftSidebar.style.left = '0';
            leftSidebar.style.top = '0';
            leftSidebar.style.zIndex = '20';

            const headerH1 = leftSidebar.querySelector('header>div>div:first-child h1');
            if (headerH1) {
                // Using textContent for security, then manually adding close icon
                headerH1.textContent = '✖ \u00A0 Close Library';
            }
        } else {
            // Collapse to small button
            console.log('#Library: Collapsed');
            leftSidebar.style.zIndex = '1';
            leftSidebar.style.position = 'fixed';
            leftSidebar.style.top = '0';
            leftSidebar.style.left = '60px';
            leftSidebar.style.width = '48px';
            leftSidebar.style.height = '48px';
        }
    };

    /**
     * closeNowPlay - Close the now-playing right panel if open
     * From r0/e.java line 200: window.closeNowPlay=function(){...}
     */
    window.closeNowPlay = function() {
        const panelContainer = document.querySelector('#Desktop_PanelContainer_Id');
        if (panelContainer && panelContainer.parentNode.parentNode.ariaHidden === 'false') {
            console.log('#Close NowPlaying');
            const toggleBtn = panelContainer.parentNode.parentNode.nextElementSibling?.querySelector('button');
            if (toggleBtn) toggleBtn.click();
        }
    };

    /**
     * firstFuck - Main initialization and monitoring loop
     * From r0/e.java line 178: window.firstFuck=function(){...}
     */
    window.firstFuck = function() {
        if (pfint) clearInterval(pfint);

        pfint = setInterval(() => {
            // Find and setup play button
            const playBtn = document.querySelector('aside button[data-testid=control-button-playpause]:not(.fuckd)');
            if (playBtn) {
                console.log('#pBtn fuckd');
                playBtn.classList.add('fuckd');
                window.pBtn = playBtn;

                // Add click handler
                window.pBtn.addEventListener('click', () => {
                    console.log('PlayClicked');
                    if (window.pBtn && window.pBtn.getAttribute('aria-label') !== 'Play') {
                        console.log('Pause Req');
                        ulFlag = false;
                    } else if (!ulFlag) {
                        console.log('Play Req');
                        ulFlag = true;
                        setTimeout(() => {
                            console.log('Unlocker Timeout Reached');
                            // Add null check for pBtn in timeout callback
                            if (window.pBtn && ulFlag && window.pBtn.getAttribute('aria-label') === 'Play') {
                                console.log('#Unlocking!');
                                ulFlag = false;
                            } else if (ulFlag) {
                                console.log('Playing, Removing Unlocker');
                                ulFlag = false;
                            }
                        }, 10000);
                    }
                });

                // First initialization
                if (!ffDone) {
                    ffDone = true;
                    console.log('FirstFuck Adding All Features');
                    addCSSJSHack();
                }
            }
        }, 5000);
    };

    /**
     * addCSSJSHack - Add CSS modifications and event listeners
     * From r0/e.java line 200: window.addCSSJSHack=function(){...}
     */
    window.addCSSJSHack = function() {
        // Setup library button once
        const setupLibraryButton = () => {
            // Use aria-label to identify the correct library button (not back button)
            // Library button has aria-label containing "Your Library" (either "Open Your Library" or "Collapse Your Library")
            // Back button has aria-label="Go back" which doesn't contain "Your Library"
            const libBtn = document.querySelector('#Desktop_LeftSidebar_Id header button[aria-label*="Your Library"]:not(.fuckd)');

            if (libBtn && !libBtn.classList.contains('fuckd')) {
                console.log('LibBtnFuckd');
                window.lBtn = libBtn;
                libBtn.classList.add('fuckd', 'lbtn');
                libBtn.style.padding = '0';
                libBtn.style.height = '20px';
                libBtn.addEventListener('click', function() {
                    setTimeout(() => switchLs(), 0);
                });

                // Collapse library on startup if it's expanded
                // Check if button says "Collapse" (meaning library is currently expanded)
                if (libBtn.getAttribute('aria-label') === 'Collapse Your Library') {
                    console.log('Library is expanded on startup, collapsing it...');
                    // Click the button to let Spotify update its state properly
                    // This ensures the button will show "Open your library" after collapse
                    libBtn.click();
                }
            }
        };

        // Setup library grid click handler once
        const setupLibraryGrid = () => {
            const libGrid = document.querySelector('#Desktop_LeftSidebar_Id div[role=grid]:not(.fuckd)');
            if (libGrid) {
                libGrid.classList.add('fuckd');

                libGrid.addEventListener('click', (event) => {
                    // Check if clicked element or its parent is a folder
                    let target = event.target;
                    let isFolder = false;

                    // Traverse up to 5 levels to find the button element
                    for (let i = 0; i < 5 && target; i++) {
                        // Check aria-labelledby for :folder: pattern (verified from Spotify DOM)
                        const ariaLabelledBy = target.getAttribute('aria-labelledby');
                        if (ariaLabelledBy && ariaLabelledBy.includes(':folder:')) {
                            isFolder = true;
                            console.log('Folder clicked (aria-labelledby contains ":folder:"), keeping library open');
                            break;
                        }

                        // Check aria-describedby for :folder: pattern
                        const ariaDescribedBy = target.getAttribute('aria-describedby');
                        if (ariaDescribedBy && ariaDescribedBy.includes(':folder:')) {
                            isFolder = true;
                            console.log('Folder clicked (aria-describedby contains ":folder:"), keeping library open');
                            break;
                        }

                        target = target.parentElement;
                    }

                    // Only auto-close library if it's NOT a folder
                    if (!isFolder) {
                        console.log('AutoCloseLib (playlist/item clicked)');
                        // Add delay to allow Spotify's navigation to complete first
                        // IMPORTANT: Use switchLs(true) for direct CSS collapse, NOT lBtn.click()
                        // Clicking lBtn inside folders triggers "back" navigation which cancels playlist navigation
                        setTimeout(() => {
                            switchLs(true);  // Direct collapse without clicking button
                            closeNowPlay();
                        }, 150);  // 150ms allows playlist navigation to initiate
                    }
                });
            }
        };

        // Setup home button once
        const setupHomeButton = () => {
            const homeBtn = document.querySelector('#global-nav-bar button[data-testid=home-button]:not(.fuckd)');
            if (homeBtn) {
                homeBtn.classList.add('fuckd');
                homeBtn.addEventListener('click', () => { closeNowPlay(); });
            }
        };

        // Setup search input once
        const setupSearchInput = () => {
            const searchInput = document.querySelector('input[data-testid=search-input]:not(.fuckd)');
            if (searchInput) {
                searchInput.classList.add('fuckd');
                searchInput.addEventListener('focus', () => {
                    const npBar = document.querySelector('aside[data-testid=now-playing-bar]');
                    if (npBar) npBar.style.display = 'none';
                    closeNowPlay();
                });
                searchInput.addEventListener('blur', () => {
                    const npBar = document.querySelector('aside[data-testid=now-playing-bar]');
                    if (npBar) npBar.style.display = 'flex';
                });
            }
        };

        // Setup user button once
        const setupUserButton = () => {
            const userBtn = document.querySelector('button[data-testid=user-widget-link]:not(.fuckd)');
            if (userBtn) {
                userBtn.classList.add('fuckd');
                userBtn.addEventListener('click', () => { closeNowPlay(); });
            }
        };

        // Try to setup all elements immediately
        setupLibraryButton();
        setupLibraryGrid();
        setupHomeButton();
        setupSearchInput();
        setupUserButton();

        // Use a short retry mechanism for elements that might not be ready yet
        // Check once more after 2 seconds for any missed elements
        setTimeout(() => {
            setupLibraryButton();
            setupLibraryGrid();
            setupHomeButton();
            setupSearchInput();
            setupUserButton();
        }, 2000);
    };

    /**
     * Inject CSS styles from APK
     * From r0/e.java line 204: let st=document.createElement('style');st.textContent='...'
     */
    function injectCSS() {
        const style = document.createElement('style');
        // CSS content from r0/e.java (line 204)
        style.textContent = `
body{min-width:100%!important;min-height:100%!important}
.os-scrollbar{--os-size:6px!important}
.contentSpacing{padding:0}
div[data-testid=root]{--panel-gap:0!important}
#main-view+div,#main-view+div>div{overflow:hidden!important;width:auto}
#main-view+div>div>div>div:nth-child(2)>div{width:100vw!important}
div[data-encore-id=banner],#global-nav-bar>div:first-of-type,#global-nav-bar a[href="/download"],button[data-testid=fullscreen-mode-button],div.main-view-container__mh-footer-container{display:none!important}
section[data-testid=artist-page]>div>div:first-child:not([data-encore-id]){height:25vh}
div[data-testid=tracklist-row]{padding:0 10px 0 0;grid-gap:0}
div[data-testid=tracklist-row] button:not([data-testid=add-to-playlist-button]){transform:scale(1.3)!important;opacity:0.6!important}
div[data-testid=tracklist-row] button:hover{color:#2d6!important}
div[data-testid=tracklist-row]>div:first-child>div:first-child{height:24px;min-height:24px;min-width:24px;margin:0 8px!important}
[aria-colcount="3"] div[data-testid=tracklist-row]{grid-template-columns:[index] var(--tracklist-index-column-width,40px) [first] minmax(120px,var(--col1,4fr)) [last] minmax(82px,var(--col2,1fr))!important}
[aria-colcount="4"] div[data-testid=tracklist-row]{grid-template-columns:[index] var(--tracklist-index-column-width,40px) [first] minmax(120px,var(--col1,4fr)) [var1] minmax(120px,var(--col2,2fr)) [last] minmax(82px,var(--col3,1fr))!important}
[aria-colcount="5"] div[data-testid=tracklist-row]{grid-template-columns:[index] var(--tracklist-index-column-width,40px) [first] minmax(120px,var(--col1,6fr)) [var1] minmax(120px,var(--col2,4fr)) [var2] minmax(120px,var(--col3,3fr)) [last] minmax(82px,var(--col4,1fr))!important}
section[data-testid=track-page]>div.contentSpacing>div:nth-child(2) [aria-colcount="2"] div[data-testid=tracklist-row]{grid-template-columns:[first] minmax(120px,var(--col0,4fr)) [last] minmax(82px,var(--col1,1fr))!important}
section[data-testid=track-page]>div.contentSpacing>div:nth-child(2) [aria-colcount="3"] div[data-testid=tracklist-row]{grid-template-columns:[first] minmax(120px,var(--col0,4fr)) [var1] minmax(120px,var(--col1,2fr)) [last] minmax(82px,var(--col2,1fr))!important}
*{--content-spacing:10px}
section[data-testid=home-page] .contentSpacing{padding:0 10px!important;overflow:hidden}
div[data-testid=grid-container]{margin-inline:0!important;column-gap:0!important;overflow:hidden!important}
div[data-testid=action-bar-row],div[data-testid=topbar-content]{padding:5px 10px}
div[data-testid=track-list]>div:first-child,div[data-testid=playlist-tracklist]>div:first-child{margin:0!important;padding:0!important}
main>section:not([data-testid=artist-page])>div:first-child{height:auto!important;min-height:auto!important;padding:10px}
section[data-testid=track-page]>div>div.contentSpacing>div:last-child{overflow:hidden}
section[data-testid=artist-page]>div>div:first-child>div.contentSpacing{padding:10px}
section[data-testid=artist-page] div[data-testid=grid-container] h2,section[data-testid=artist-page] section[data-testid=component-shelf]{padding:0 10px}
main>section h1.encore-text-headline-large{font-size:22px!important}
section[data-testid=artist-page] span.encore-text-headline-large{font-size:26px!important}
section[data-testid=track-page] h1{font-size:20px!important}
aside[data-testid=now-playing-bar]{min-width:100%!important;box-shadow:0 0 6px #440000;background:linear-gradient(to bottom,#770000,#330000)!important}
aside[data-testid=now-playing-bar]>div:first-child{margin-top:2px;flex-direction:column!important;height:auto!important}
aside[data-testid=now-playing-bar]>div>div{width:100%!important}
aside[data-testid=now-playing-bar]>div>div:last-child>div{min-height:32px;margin:5px 10px}
aside[data-testid=now-playing-bar]>div>div:last-child button{transform:scale(1.15);margin:0 5px}
div[data-testid=general-controls]{margin:15px 0 25px}
div[data-testid=general-controls] button{transform:scale(1.4)!important;margin:0 8px!important}
div[data-testid=player-controls]{margin:5px 0}
div[data-testid=now-playing-widget]{justify-content:center;overflow:hidden}
form[role=search]{z-index:10;margin-left:48px;max-width:88%}
div[data-testid=now-playing-widget]>div:last-child>button{transform:scale(1.3)}
div[data-testid=now-playing-widget]>div:first-child{display:none!important}
div[data-testid=now-playing-widget]>div:nth-child(2){display:flex!important;overflow:hidden!important}
div[data-testid=now-playing-widget]>div:nth-child(2) span{font-size:13px!important;height:20px!important;margin:0!important}
div[data-testid=now-playing-widget]>div:nth-child(2)>div{min-width:auto;max-width:66%}
[data-tippy-root]{overflow:hidden!important}
[data-tippy-root],[data-tippy-root] *{transition:none!important;transform:none!important}
div[data-testid=hover-or-focus-tooltip],#Desktop_LeftSidebar_Id header>div>div:last-child{display:none!important}
#Desktop_LeftSidebar_Id>nav>div{min-height:48px;border-radius:25px}
.YourLibraryX{overflow:hidden;background:var(--background-elevated-base)!important}
.YourLibraryX header{padding:14px}
        `;
        document.head.appendChild(style);

        // AMOLED pure black mode (from r0/e.java line 207)
        const amoled = document.createElement('style');
        amoled.textContent = `
.encore-dark-theme{--background-base:#000;--background-highlight:#000;--background-elevated-base:#000;--background-elevated-highlight:#000;--background-elevated-press:#000;--background-tinted-base:#000}
aside[data-testid=now-playing-bar]{background:#000!important;box-shadow:none;border-top:1px solid #666}
        `;
        document.head.appendChild(amoled);

        console.log('#CSS Injected');
    }

    // Initialize immediately
    injectCSS();
    firstFuck();

    // Add cleanup on page unload to prevent memory leaks
    window.addEventListener('beforeunload', () => {
        if (pfint) {
            clearInterval(pfint);
            pfint = null;
        }
        console.log('#Cleanup: Interval cleared');
    });

    console.log('🚀 Spotifuck v6 Ready (APK v1.6.4 Port)');
})();
