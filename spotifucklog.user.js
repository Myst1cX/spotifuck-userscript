// ==UserScript==
// @name         Spotifuck Log (finally cleaned up library, it's fixed. will consider appending back to header, in a clean manner)
// @namespace    https://github.com/Myst1cX/spotifuck-userscript
// @version      6.7.log
// @description  Full Spotifuck 1.6.4 UI hack (with minor tweaks) + playback control + force English UI + visual premium spoof
// @author       Myst1cX (adapted from Spotifuck app)
// @match        *://open.spotify.com/*
// @match        https://www.spotify.com/*/account/*
// @match        https://www.spotify.com/*/premium/*
// @match        https://www.spotify.com/*/duo/*
// @match        https://www.spotify.com/*/student/*
// @match        https://www.spotify.com/*/family/*
// @match        https://payments.spotify.com/*
// @grant        GM_addStyle
// @grant        GM_registerMenuCommand
// @grant        GM_setValue
// @grant        GM_getValue
// @run-at       document-start
// @homepageURL  https://github.com/Myst1cX/spotifuck-userscript
// @supportURL   https://github.com/Myst1cX/spotifuck-userscript/issues
// @updateURL    https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifucklog.user.js
// @downloadURL  https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifucklog.user.js
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

 * Newly added (v6.4) - Fixed "Force English" (v6.3 was not working at all)
 * - forceEnglish() actually forces English now. The v6.3 version only overrode
 *   navigator.language and stripped the /intl-xx/ URL prefix, both of which only
 *   affect a single page load - the aria-labels Spotify actually renders (e.g.
 *   "Open Your Library") are driven by the account-level language preference at
 *   open.spotify.com/preferences, which is saved server-side. forceEnglish() now
 *   also flips that setting to "en" once, via a hidden iframe so it doesn't
 *   disrupt whatever the user is looking at, then reloads the page so the change
 *   actually takes effect. A localStorage flag means this only runs once ever, and skips the reload
 *   entirely if the account was already set to English.

 * Newly added (v6.4.fix) - Fixed "Force English" again (v6.4 had some bug cases)
 * - Fixed a case where, if a user landed directly on /preferences (rather than
 *   via the hidden iframe), the code that watches for the language <select> to
 *   appear never actually started watching - it silently did nothing and timed
 *   out. Now it waits for the page to finish loading first if needed.
 * - Removed the old "only ever run once" localStorage flag. It assumed the
 *   account language setting only ever changes via this script, so once set,
 *   it stopped checking forever - meaning if the user manually changed the
 *   account language afterward, the script would never notice or fix it again.
 *   It now re-checks the actual setting on every real page load instead.
 * - The dispatched change event is no longer trusted as proof the setting
 *   actually saved. It's now verified on the next load before being treated as
 *   done, with a capped number of retries if it didn't stick.

 * Newly added (v6.5) - Fixed "Force English" again (:D)
 * - Fixed a race where the hidden iframe's "did it finish loading" check and
 *   its 15-second give-up timer could both fire for the same attempt if the
 *   timing landed close together, causing the same logic to run twice. Now
 *   whichever one happens first is the only one that's acted on.
 * - Fixed a race where redirecting away from a non-English /intl-xx/ URL
 *   didn't stop the rest of forceEnglish() from also running against that
 *   same (already-leaving) page. It now stops immediately after triggering
 *   that redirect instead.

 * Newly added (v6.6):
 * a) Improved forceEnglish() to now also redirect www.spotify.com off non-English region path segments (e.g. /mx/ -> /us/)
 * b) Ported the visual premium spoof & payment-page blockers from Spotikit/SpotiwebJS.user.js (v7.0.fork)
 * - CREDITS TO: kitbodega for the code logic - kitbodega/SpotiKit/SpotiwebJS(obsolete).user.js
 * - Added the PINK/GREEN constants, REPLACE text-swap map, and runPremium()) from SpotiwebJS
 * - Fork's expansion: the scan/replace pass is now MutationObserver-driven (only re-scans changed
 *   nodes) instead of a full document.body walk on a timer, and every swap is logged (selector, before/after, times applied);
 *   viewable via a new "Show everything replaced so far" userscript menu command.
 * - Added the @match lines for www.spotify.com/*account,premium,duo,student,family/*
 *   and payments.spotify.com/* so the spoof/blockers actually have pages to run on.
 * - Added two independent userscript-manager menu toggles (via
 *   GM_registerMenuCommand + GM_setValue/GM_getValue), since the spoof
 *   behaves differently depending on which site it's touching:
 *   1. "Visual Premium Spoof (open.spotify.com)" - the in-player text/badge
 *       relabeling and the account widgets that render inside the web player.
 *   HOW DOES IT WORK: Ad-slot removal MutationObserver (ordinary ad-banner DOM removal, same idea as a standard ad-blocker filter;
 *   can't touch anything server-enforced), scoped to open.spotify.com)
 *   2. "Visual Premium Spoof (www.spotify.com)" - the account site
 *       (spotify.com /premium, /duo, /student, /family, purchase pages) and the payments.spotify.com blockers/redirects
 *   HOW DOES IT WORK: Text nodes are taken over by overlays that affirm you do not need Premium.
 *   Each toggle is independent, persists via GM storage, and reloads the page to apply. Both toggles are enabled by default.

 * Newly added (v6.7):
 * - Fixed AutoCloseLib (what happens when you click a playlist while the library is open,
 *   which is supposed to auto-close the library and take you to the playlist) leaving a
 *   glitched, overlapping cluster of icons in the header instead of cleanly closing.
 *
 *   Plain-language: closing the library used to be done by just shrinking its box down to
 *   48x48 pixels with CSS, without ever telling Spotify's own page that the library was
 *   actually closed. So Spotify kept drawing the full "library is open" screen (all its
 *   buttons, the search bar, the whole playlist list) and it all got squashed into that
 *   tiny box - that's the glitch. The fix is to do a real click on Spotify's own
 *   open/close button instead, so Spotify closes it properly itself.
 *
 *   Dev: switchLs(true, ...) (the forceCollapse branch) only ever set inline CSS
 *   (position/width/height fixed to 48x48) on #Desktop_LeftSidebar_Id - it never
 *   triggered Spotify's own React re-render into collapsed markup, so the fully expanded
 *   header/grid stayed mounted and got clipped into the 48x48 box.
 *   Fix: grid-autoclose (the code that runs 150ms after you click a playlist, so
 *   Spotify's own navigation has time to start first) now calls .click() on Spotify's own
 *   library toggle button directly, then resets our own tracked state (dataset.fuckExpanded)
 *   and clears any leftover inline styles from our fullscreen-overlay EXPAND branch, instead
 *   of forcing the 48x48 CSS itself. Tested and confirmed this does not break folder-depth
 *   navigation (a stale comment on the old code claimed a real click would - it doesn't;
 *   collapsing from inside a folder and reopening returns to the same folder correctly).
 *   No custom button injection needed either - Spotify's real collapsed header already has
 *   a working, correctly-labeled toggle button in that spot.
 *
 * - Second bug found during testing of the above fix: the .click() we just added also
 *   fired OUR OWN existing click listener on that same button (the one that normally
 *   handles manual clicks), which unconditionally re-opened the fullscreen overlay a
 *   moment later - right on top of the library Spotify had just properly closed. Result:
 *   a black screen showing only playlist artwork, with everything else stuck hidden
 *   underneath our own overlay.
 *   Fix: a one-shot flag (suppressLibBtnHandler) is set immediately before this specific
 *   synthetic click and read (then cleared) by our click listener, so only that one
 *   synthetic click skips our own re-open logic. Spotify's native handling of the click,
 *   and every real click from the user, are completely unaffected.
 *
 * - Third bug found during a second round of testing: after the two fixes above, manually
 *   clicking the library toggle to close it (not the auto-close case, just an ordinary
 *   click) stopped working entirely - the library no longer collapsed at all.
 *   Cause: this was a mistake in the first version of this fix. switchLs()'s COLLAPSE
 *   branch (the "else" side of the expand/collapse toggle) is not only reached by the old,
 *   now-removed 48x48-forcing behavior - it is also the exact same branch every ordinary
 *   manual collapse click runs through. Commenting that branch out to remove the old
 *   48x48 code broke manual collapsing entirely, since nothing else in that branch was
 *   replaced.
 *   Fix: the COLLAPSE branch now does what grid-autoclose does - lets Spotify's own click
 *   handling collapse the real layout (this already happens automatically for a manual
 *   click, since it's a real click to begin with), and simply clears the inline styles our
 *   own EXPAND branch had set (position/width/height/left/top/zIndex), so Spotify's real
 *   collapsed layout can show through cleanly instead of our old fullscreen overlay hiding
 *   it. The old 48x48-forcing code and the now-always-false forceCollapse parameter it
 *   depended on have been removed entirely (not just commented out) - it's fully replaced
 *   by the click-based approach above, so keeping it around as dead code served no purpose.
 */


(function() {
    'use strict';

    console.log('🎵 Spotifuck v6 - APK v1.6.4 Port');

    // Global state variables
    let ulFlag = false;  // Unlock flag
    let ffDone = false;  // First fuck done (firstFuck initialization complete)
    let pfint = null;    // Primary features interval
    let pendingLibCollapse = null;  // Timeout id for the delayed auto-collapse-on-navigate
    let suppressLibBtnHandler = false;  // v6.7: set true right before a synthetic click on the
    // native library toggle (grid-autoclose), so our own libBtn 'click' listener (which fires
    // on that same synthetic click) skips scheduling switchLs() for it. Consumed (reset to
    // false) on read, so it only ever suppresses the one synthetic click, never a real one.

    // --- Debug logging (v6.7) ---
    // Every click handler in this script logs through dbg() with the same shape:
    //   dbg('event name', 'selector used to find the element', { ...state/details })
    // For handlers that open/alter a view (switchLs, closeNowPlay), the function
    // itself logs a second line showing exactly what changed (dataset/style
    // before -> after), so you can see both "what was clicked" and "what the
    // script then did to the view" in sequence.
    // Filter your console by "SPFDBG" to isolate just this script's click activity.
    function dbg(event, selector, details) {
        console.log(`%c[SPFDBG] ${event}`, 'color:#1ed760;font-weight:bold;', 'selector:', selector, details || '');
    }

    // --- Per-site visual premium spoof toggles (v6.6) ---
    const SPOOF_OPEN_KEY = 'spotifuck_premSpoofOpen';
    const SPOOF_WWW_KEY = 'spotifuck_premSpoofWWW';
    const HOST_IS_OPEN = location.hostname === 'open.spotify.com';
    const HOST_IS_WWW = location.hostname === 'www.spotify.com' || location.hostname === 'payments.spotify.com';

    function getFlag(key) {
        try { return typeof GM_getValue === 'function' ? GM_getValue(key, true) : true; }
        catch (e) { return true; }
    }
    function setFlag(key, val) {
        try { if (typeof GM_setValue === 'function') GM_setValue(key, val); } catch (e) {}
    }
    function premiumSpoofEnabledHere() {
        if (HOST_IS_OPEN) return getFlag(SPOOF_OPEN_KEY);
        if (HOST_IS_WWW) return getFlag(SPOOF_WWW_KEY);
        return false;
    }

    if (typeof GM_registerMenuCommand === 'function') {
        GM_registerMenuCommand(
            (getFlag(SPOOF_OPEN_KEY) ? '✅' : '❌') + ' Visual Premium Spoof (open.spotify.com)',
            () => { setFlag(SPOOF_OPEN_KEY, !getFlag(SPOOF_OPEN_KEY)); location.reload(); }
        );
        GM_registerMenuCommand(
            (getFlag(SPOOF_WWW_KEY) ? '✅' : '❌') + ' Visual Premium Spoof (www.spotify.com)',
            () => { setFlag(SPOOF_WWW_KEY, !getFlag(SPOOF_WWW_KEY)); location.reload(); }
        );
    }

    /**
     * forceEnglish - Force the web player to render in English.
     * open.spotify.com localizes via an /intl-xx/ URL prefix.
     * www.spotify.com localizes via a leading region path segment (e.g. /mx/, /es/).
     * Runs at document-start, before Spotify's own scripts get a chance to read navigator.language.
     */
    function forceEnglish() {
        try {
            Object.defineProperty(navigator, 'language', { get: () => 'en-US', configurable: true });
            Object.defineProperty(navigator, 'languages', { get: () => ['en-US', 'en'], configurable: true });
        } catch (e) {}

        // www.spotify.com: redirect off any non-English-region path segment so the
        // marketing/account pages themselves load in English (ported from
        // SpotiwebJS.js's forceEnglish, v6.6).
        if (location.hostname === 'www.spotify.com') {
            const ENGLISH_REGIONS = ['us', 'gb', 'ca', 'au', 'ie', 'nz'];
            const wm = location.pathname.match(/^\/([a-z]{2})(\/.*)?$/i);
            if (wm && !ENGLISH_REGIONS.includes(wm[1].toLowerCase())) {
                location.replace(location.origin + '/us' + (wm[2] || '/') + location.search + location.hash);
                return;
            }
        }

        const m = location.pathname.match(/^\/intl-([a-z]{2})(\/.*)?$/i);
        if (m && m[1].toLowerCase() !== 'en') {
            location.replace(location.origin + (m[2] || '/') + location.search + location.hash);
            return; // navigation is pending - don't run forceEnglishAccountSetting()
                     // against a page that's about to be torn down; it'll run
                     // fresh on the load this redirect produces instead.
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
     * Library") are driven by this account setting, which is saved server-side.
     * Because the user can change this setting manually at any time, this
     * re-checks the current value on every real page load rather than trusting
     * a one-time flag - the check itself is cheap (one hidden-iframe load) when
     * the setting is already English, and only triggers a flip + reload when
     * it's actually wrong. A flip is verified on the following load before
     * being treated as done, with a capped number of retries if it didn't
     * stick server-side.
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
            let settled = false;
            const fire = (doc, cleanup) => {
                if (settled) return; // guards against load/error/timeout all racing to call this
                settled = true;
                callback(doc, cleanup);
            };

            if (location.pathname.startsWith('/preferences')) {
                fire(document, () => {});
                return;
            }

            // Same-origin (open.spotify.com -> open.spotify.com), so
            // contentDocument access is allowed.
            const iframe = document.createElement('iframe');
            iframe.style.display = 'none';
            iframe.src = 'https://open.spotify.com/preferences';
            (document.documentElement || document.body).appendChild(iframe);

            let removed = false;
            const cleanup = () => {
                if (removed) return;
                removed = true;
                iframe.remove();
            };

            iframe.addEventListener('load', () => {
                try {
                    fire(iframe.contentDocument, cleanup);
                } catch (e) {
                    console.log('Spotifuck: could not access preferences iframe', e);
                    cleanup();
                    fire(null, cleanup);
                }
            });

            // Safety net in case the select never appears (layout change, slow load, etc.)
            setTimeout(() => { cleanup(); fire(null, cleanup); }, 15000);
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
     * switchLs - Toggle library sidebar between expanded (fullscreen overlay) and collapsed
     * (Spotify's own native narrow layout) states.
     * From r0/e.java line 202: window.switchLs=function(){...}
     *
     * Plain-language: this is the function that opens or closes the big "Your Library"
     * screen. It looks at whether the library is currently open (tracked on the sidebar
     * element itself, see isExpanded below) and does the opposite.
     *
     * @param {string} source - debug-only: which caller invoked this (see dbg() calls at each call site)
     */
    window.switchLs = function(source = 'unknown') {
        // Cancel a still-pending delayed auto-collapse (see setupLibraryGrid below).
        // Without this, quickly reopening the library after clicking a playlist
        // could get immediately re-collapsed by that stale queued timeout firing
        // after this call - the "glitches even more" symptom.
        if (pendingLibCollapse !== null) {
            clearTimeout(pendingLibCollapse);
            pendingLibCollapse = null;
            dbg('switchLs: cancelled pending auto-collapse', '#Desktop_LeftSidebar_Id', { source });
        }

        const leftSidebar = document.querySelector('#Desktop_LeftSidebar_Id');
        if (!leftSidebar) {
            dbg('switchLs: ABORTED - #Desktop_LeftSidebar_Id not found', '#Desktop_LeftSidebar_Id', { source });
            return;
        }

        const navFirstChild = leftSidebar.querySelector('nav>div>div:first-child');
        if (!navFirstChild) {
            dbg('switchLs: ABORTED - nav>div>div:first-child not found', 'nav>div>div:first-child', { source });
            return;
        }

        // NOTE: We used to infer state from `navFirstChild.classList.length === 2`
        // (ported from the APK's DOM). On the desktop web player, Spotify's own
        // re-renders change how many classes this wrapper has independent of
        // whether the library is actually expanded/collapsed, which caused the
        // toggle to occasionally flip the wrong way (icon/header desyncing from
        // the real panel size - rapid Expanded/Collapsed flicker).
        // Instead, track our own state on the sidebar element - we're the only
        // code that ever calls switchLs(), so this can never desync.
        const isExpanded = leftSidebar.dataset.fuckExpanded === 'true';
        const libBtnNow = document.querySelector('#Desktop_LeftSidebar_Id header button[aria-label*="Your Library"]');

        dbg('switchLs: called', '#Desktop_LeftSidebar_Id', {
            source,
            'dataset.fuckExpanded (before)': leftSidebar.dataset.fuckExpanded ?? '(unset)',
            'computed isExpanded': isExpanded,
            'real libBtn aria-label right now': libBtnNow ? libBtnNow.getAttribute('aria-label') : '(libBtn not found)',
            willTakeBranch: isExpanded ? 'COLLAPSE' : 'EXPAND'
        });

        if (!isExpanded) {
            // Expand to full-screen overlay
            console.log('#Library: Expanded');
            leftSidebar.dataset.fuckExpanded = 'true';
            leftSidebar.style.position = 'fixed';
            leftSidebar.style.width = '100%';
            leftSidebar.style.height = '100%';
            leftSidebar.style.left = '0';
            leftSidebar.style.top = '0';
            leftSidebar.style.zIndex = '20';

            const headerH1 = leftSidebar.querySelector('header>div>div:first-child h1');
            if (headerH1) {
                const prevText = headerH1.textContent;
                // Using textContent for security, then manually adding close icon
                headerH1.textContent = '✖ \u00A0 Close Library';
                dbg('switchLs: view manipulated (EXPAND)', 'header>div>div:first-child h1', {
                    source, 'headerH1.textContent before': prevText, 'headerH1.textContent after': headerH1.textContent,
                    'sidebar style set': 'position:fixed; width:100%; height:100%; left:0; top:0; z-index:20'
                });
            } else {
                dbg('switchLs: view manipulated (EXPAND) - header h1 NOT FOUND, icon not updated', 'header>div>div:first-child h1', { source });
            }
        } else {
            // COLLAPSE branch.
            //
            // Plain-language version: this runs whenever the library should go from the
            // big "Your Library" screen back to the small state. We used to do this by
            // squeezing the library box down to 48x48 pixels ourselves with CSS - but
            // Spotify's own page never found out the library was supposed to be closed,
            // so all its buttons and the playlist list stayed fully drawn and just got
            // squashed into that tiny box (that was the "glitched icon" bug). The real
            // fix is to let Spotify collapse itself the normal way (a real click already
            // does this - same idea used for auto-close-after-picking-a-playlist in
            // v6.7), and here we just clean up after our own fullscreen overlay so it
            // doesn't stay stuck on top of Spotify's now-properly-collapsed page.
            //
            // Dev version: this branch is reached by every collapse, manual or automatic
            // (switchLs(source) always lands here whenever isExpanded is true - see the
            // willTakeBranch calculation above). We don't touch Spotify's own layout at all
            // here; we only clear the inline styles the EXPAND branch above set
            // (position/width/height/left/top/zIndex), since Spotify's real collapsed
            // layout should render underneath once our forced overlay is gone. grid-autoclose
            // (v6.7) additionally fires a real click on the native toggle before this ever
            // runs, so Spotify's own collapse logic has already run by the time we get here.
            console.log('#Library: Collapsed');
            leftSidebar.dataset.fuckExpanded = 'false';
            leftSidebar.style.position = '';
            leftSidebar.style.width = '';
            leftSidebar.style.height = '';
            leftSidebar.style.left = '';
            leftSidebar.style.top = '';
            leftSidebar.style.zIndex = '';
            dbg('switchLs: view manipulated (COLLAPSE)', '#Desktop_LeftSidebar_Id', {
                source,
                note: 'cleared fullscreen-overlay inline styles (position/width/height/left/top/zIndex) - native collapsed layout shows through underneath (v6.7)'
            });
        }
    };

    /**
     * closeNowPlay - Close the now-playing right panel if open
     * From r0/e.java line 200: window.closeNowPlay=function(){...}
     */
    window.closeNowPlay = function(source = 'unknown') {
        const panelContainer = document.querySelector('#Desktop_PanelContainer_Id');
        if (!panelContainer) {
            dbg('closeNowPlay: no-op - #Desktop_PanelContainer_Id not found', '#Desktop_PanelContainer_Id', { source });
            return;
        }
        const ariaHidden = panelContainer.parentNode.parentNode.ariaHidden;
        if (ariaHidden === 'false') {
            console.log('#Close NowPlaying');
            const toggleBtn = panelContainer.parentNode.parentNode.nextElementSibling?.querySelector('button');
            dbg('closeNowPlay: view manipulated', '#Desktop_PanelContainer_Id parent parent nextElementSibling button', {
                source,
                'panel ariaHidden (before)': ariaHidden,
                action: toggleBtn ? 'clicked the toggle button to close the panel' : 'toggle button NOT FOUND - could not close',
                'toggleBtn aria-label': toggleBtn ? toggleBtn.getAttribute('aria-label') : null
            });
            if (toggleBtn) toggleBtn.click();
        } else {
            dbg('closeNowPlay: no-op - panel already hidden', '#Desktop_PanelContainer_Id', { source, ariaHidden });
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
                    const ariaLabelAtClick = window.pBtn.getAttribute('aria-label');
                    dbg('pBtn: clicked', 'aside button[data-testid=control-button-playpause]', {
                        'aria-label at click time': ariaLabelAtClick, ulFlag
                    });
                    if (window.pBtn && window.pBtn.getAttribute('aria-label') !== 'Play') {
                        console.log('Pause Req');
                        ulFlag = false;
                        dbg('pBtn: decision', 'aside button[data-testid=control-button-playpause]', { decision: 'Pause requested, ulFlag reset to false' });
                    } else if (!ulFlag) {
                        console.log('Play Req');
                        ulFlag = true;
                        dbg('pBtn: decision', 'aside button[data-testid=control-button-playpause]', { decision: 'Play requested, ulFlag set true, arming 10s unlocker timeout' });
                        setTimeout(() => {
                            console.log('Unlocker Timeout Reached');
                            // Add null check for pBtn in timeout callback
                            if (window.pBtn && ulFlag && window.pBtn.getAttribute('aria-label') === 'Play') {
                                console.log('#Unlocking!');
                                ulFlag = false;
                                dbg('pBtn: unlocker timeout fired', 'aside button[data-testid=control-button-playpause]', { action: 'still shows Play after 10s - forcing unlock, ulFlag reset' });
                            } else if (ulFlag) {
                                console.log('Playing, Removing Unlocker');
                                ulFlag = false;
                                dbg('pBtn: unlocker timeout fired', 'aside button[data-testid=control-button-playpause]', { action: 'no longer shows Play (playback started) - unlocker removed, ulFlag reset' });
                            }
                        }, 10000);
                    } else {
                        dbg('pBtn: decision', 'aside button[data-testid=control-button-playpause]', { decision: 'ignored - unlocker already pending (ulFlag true)' });
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
                    if (suppressLibBtnHandler) {
                        // This click was a synthetic one fired by grid-autoclose (nativeToggle.click()),
                        // not a real user click. Native Spotify's own handler still runs normally either
                        // way - we're only skipping OUR switchLs() scheduling for this one click so it
                        // doesn't fight the collapse grid-autoclose just triggered. See v6.7 changelog.
                        suppressLibBtnHandler = false;
                        dbg('libBtn: clicked (synthetic, suppressed)', '#Desktop_LeftSidebar_Id header button[aria-label*="Your Library"]', {
                            'aria-label at click time': libBtn.getAttribute('aria-label'),
                            note: 'synthetic click from grid-autoclose - skipping switchLs() scheduling'
                        });
                        return;
                    }
                    dbg('libBtn: clicked', '#Desktop_LeftSidebar_Id header button[aria-label*="Your Library"]', {
                        'aria-label at click time': libBtn.getAttribute('aria-label'),
                        note: 'native Spotify click handler also runs on this same event; our switchLs() runs after via setTimeout 0'
                    });
                    setTimeout(() => switchLs('libBtn-click'), 0);
                });

                // Collapse library on startup if it's expanded
                // Check if button says "Collapse" (meaning library is currently expanded)
                if (libBtn.getAttribute('aria-label') === 'Collapse Your Library') {
                    console.log('Library is expanded on startup, collapsing it...');
                    dbg('libBtn: startup collapse triggered', '#Desktop_LeftSidebar_Id header button[aria-label*="Your Library"]', {
                        reason: 'aria-label was "Collapse Your Library" on script init, meaning library was expanded - forcing collapse via a real click',
                        action: 'calling libBtn.click() (real click, not switchLs directly) so Spotify updates its own state/aria-label too'
                    });
                    // Click the button to let Spotify update its state properly
                    // This ensures the button will show "Open your library" after collapse
                    suppressLibBtnHandler = true;
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
                    const traversalLog = [];

                    // Traverse up to 5 levels to find the button element
                    for (let i = 0; i < 5 && target; i++) {
                        traversalLog.push({
                            level: i, tag: target.tagName,
                            'aria-labelledby': target.getAttribute('aria-labelledby'),
                            'aria-describedby': target.getAttribute('aria-describedby')
                        });
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

                    dbg('libGrid: clicked', '#Desktop_LeftSidebar_Id div[role=grid]', {
                        'clicked element': event.target.tagName + (event.target.className ? '.' + String(event.target.className).split(' ').join('.') : ''),
                        isFolder, traversal: traversalLog
                    });

                    // Only auto-close library if it's NOT a folder
                    if (!isFolder) {
                        console.log('AutoCloseLib (playlist/item clicked)');
                        // Add delay to allow Spotify's navigation to complete first
                        // Uses a real click on the native toggle instead of CSS-only forcing, so Spotify's
                        // own layout actually switches to collapsed markup (see v6.7 changelog).
                        // Tracked in pendingLibCollapse so a later switchLs() call (e.g. the user
                        // reopening the library right away) can cancel this before it fires.
                        if (pendingLibCollapse !== null) clearTimeout(pendingLibCollapse);
                        dbg('libGrid: scheduling delayed auto-collapse', '#Desktop_LeftSidebar_Id div[role=grid]', {
                            delayMs: 150, note: 'will click native libBtn (if expanded) + closeNowPlay() in 150ms unless cancelled by another switchLs() call first'
                        });
                        pendingLibCollapse = setTimeout(() => {
                            pendingLibCollapse = null;
                            dbg('libGrid: delayed auto-collapse FIRING now', '#Desktop_LeftSidebar_Id div[role=grid]', {});
                            const sidebar = document.querySelector('#Desktop_LeftSidebar_Id');
                            const nativeToggle = sidebar ? sidebar.querySelector('header button[aria-label*="Your Library"]') : null;
                            if (nativeToggle && nativeToggle.getAttribute('aria-label') === 'Collapse Your Library') {
                                suppressLibBtnHandler = true;
                                nativeToggle.click();
                            }
                            if (sidebar) {
                                sidebar.dataset.fuckExpanded = 'false';
                                sidebar.style.position = '';
                                sidebar.style.width = '';
                                sidebar.style.height = '';
                                sidebar.style.left = '';
                                sidebar.style.top = '';
                                sidebar.style.zIndex = '';
                            }
                            closeNowPlay('grid-autoclose');
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
                homeBtn.addEventListener('click', () => {
                    dbg('homeBtn: clicked', '#global-nav-bar button[data-testid=home-button]', { action: 'calling closeNowPlay()' });
                    closeNowPlay('homeBtn-click');
                });
            }
        };

        // Setup search input once
        const setupSearchInput = () => {
            const searchInput = document.querySelector('input[data-testid=search-input]:not(.fuckd)');
            if (searchInput) {
                searchInput.classList.add('fuckd');
                searchInput.addEventListener('focus', () => {
                    const npBar = document.querySelector('aside[data-testid=now-playing-bar]');
                    dbg('searchInput: focus', 'input[data-testid=search-input]', {
                        action: 'hiding aside[data-testid=now-playing-bar] and calling closeNowPlay()',
                        'npBar found': !!npBar
                    });
                    if (npBar) npBar.style.display = 'none';
                    closeNowPlay('searchInput-focus');
                });
                searchInput.addEventListener('blur', () => {
                    const npBar = document.querySelector('aside[data-testid=now-playing-bar]');
                    dbg('searchInput: blur', 'input[data-testid=search-input]', {
                        action: 'restoring aside[data-testid=now-playing-bar] display:flex',
                        'npBar found': !!npBar
                    });
                    if (npBar) npBar.style.display = 'flex';
                });
            }
        };

        // Setup user button once
        const setupUserButton = () => {
            const userBtn = document.querySelector('button[data-testid=user-widget-link]:not(.fuckd)');
            if (userBtn) {
                userBtn.classList.add('fuckd');
                userBtn.addEventListener('click', () => {
                    dbg('userBtn: clicked', 'button[data-testid=user-widget-link]', { action: 'calling closeNowPlay()' });
                    closeNowPlay('userBtn-click');
                });
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
    if (HOST_IS_OPEN) {
        injectCSS();
        firstFuck();
    }

    // Add cleanup on page unload to prevent memory leaks
    window.addEventListener('beforeunload', () => {
        if (pfint) {
            clearInterval(pfint);
            pfint = null;
        }
        console.log('#Cleanup: Interval cleared');
    });

    console.log('🚀 Spotifuck v6 Ready (APK v1.6.4 Port)');
    console.log('%c[SPFDBG] filter this console by "SPFDBG" to see every button click, selector, and resulting view change', 'color:#1ed760;font-weight:bold;');

    // --- Visual premium spoof & payment-page takeovers (ported from Myst1cX/SpotiwebJS.js, v7.0.fork)
    const PINK = '#FFD2D7';
    const GREEN = '#1ed760';
    const REPLACE = {
        "Spotify Free": "Premium Individual",
        "1 Free account": "1 Premium account",
        "1 free account": "1 Premium account",
        "Music with ads": "Listen to music ad-free",
        "Music listening with ad breaks": "Listen to music ad-free",
        "Shuffle play": "Play any song",
        "Songs play in shuffle": "Play any song",
        "Online only": "Download for offline listening",
        "Streaming only": "Download for offline listening",
        "No downloads": "Download for offline listening",
        "Basic audio quality": "Very high audio quality",
        "Normal audio quality": "Very high audio quality",
        "Limited skips": "Unlimited skips",
        "Free plan": "Premium Individual",
    };

    const replacementLog = new Map();
    function logChange(selector, from, to) {
        const key = `${selector}\u0000${from}\u0000${to}`;
        const existing = replacementLog.get(key);
        if (existing) existing.times_applied++;
        else replacementLog.set(key, { selector, old_text: from, new_text: to, times_applied: 1 });
    }
    function printReplacementLog() {
        if (replacementLog.size === 0) {
            console.log('[Spotifuck] Nothing has been replaced yet.');
            return;
        }
        console.log(`[Spotifuck] ${replacementLog.size} distinct change(s) made so far:`);
        console.table(Array.from(replacementLog.values()));
    }
    function applyReplacements(node) {
        let v = node.nodeValue;
        if (v == null) return;
        let c = false;
        for (const [from, to] of Object.entries(REPLACE)) {
            if (v.includes(from)) {
                v = v.replaceAll(from, to);
                c = true;
                logChange('(page text)', from, to);
            }
        }
        if (c) node.nodeValue = v;
    }
    function scanText(root) {
        if (!root) return;
        const w = document.createTreeWalker(root, NodeFilter.SHOW_TEXT, null, false);
        let n;
        while (n = w.nextNode()) applyReplacements(n);
    }

    function runPremium() {
        document.querySelectorAll('.encore-text-title-medium, [class*="title-medium"]').forEach(el => {
            if ((el.textContent || '').trim() === 'Premium Individual') {
                el.style.color = window.location.href.includes('/subscription/manage/') ? '#000' : PINK;
                const parent = el.closest('[class*="Hjkjj"], [class*="hjkjj"]');
                if (parent) {
                    parent.style.background = PINK;
                    parent.style.color = '#000';
                }
            }
        });
        const planCard = document.querySelector('[data-testid="plan-card"]');
        if (planCard && !planCard.querySelector('.__sp_logo')) {
            planCard.style.position = 'relative';
            const logo = document.createElement('img');
            logo.className = '__sp_logo';
            logo.src = 'https://i.ibb.co/jPMD5S3K/3-sin-t-tulo-20260704011012.png';
            logo.style.cssText = 'position:absolute;top:8px;right:8px;width:24px;height:24px;z-index:10;pointer-events:none;';
            planCard.appendChild(logo);
            const msg = document.createElement('p');
            msg.textContent = 'Your Premium Individual NEVER expires. Dont pay Spotify, fuck their monopoly!';
            msg.style.cssText = 'color:#B3B3B3;font-size:14px;margin:8px 0;text-align:left;line-height:1.4;padding:0 4px;';
            const btnRow = planCard.querySelector('[class*="dCZPlm"], .sc-3b07dd39-3');
            if (btnRow) btnRow.parentNode.insertBefore(msg, btnRow);
        }
        document.querySelectorAll('h1, h2, h3, h4, strong, span, div[class*="plan"], div[class*="Plan"]').forEach(el => {
            const t = (el.textContent || '').trim();
            if (t === 'Free' || t === 'Spotify Free' || t === 'Free plan') {
                logChange('h1,h2,h3,h4,strong,span,div[class*="plan"]', t, 'Premium Individual');
                el.textContent = 'Premium Individual';
                el.style.color = PINK;
                el.style.fontWeight = '700';
            }
        });
        document.querySelectorAll('a, button, [role="button"]').forEach(el => {
            const orig = (el.innerText || el.textContent || '').trim();
            const t = orig.toLowerCase();
            if (/^(get|buy|join)\s*premium/.test(t)) {
                logChange('a, button, [role="button"]', orig, 'DONT JOIN PREMIUM');
                el.textContent = 'DONT JOIN PREMIUM';
                el.style.cssText += `background:${PINK}!important;color:#000!important;border:none!important;border-radius:20px!important;font-weight:700!important;pointer-events:none!important;cursor:default!important;`;
                el.onclick = e => {
                    dbg('spoofed "DONT JOIN PREMIUM" button: clicked', 'a, button, [role="button"] (originally Get/Buy/Join Premium)', { action: 'preventDefault + stopPropagation (click is a no-op)' });
                    e.preventDefault(); e.stopPropagation();
                };
            }

            if (/^(explore|view)\s*plans/.test(t)) {
                logChange('a, button, [role="button"]', orig, 'Manage plan');
                el.textContent = 'Manage plan';
                el.style.cssText += `background:transparent!important;color:#fff!important;border:1px solid #727272!important;border-radius:20px!important;font-weight:700!important;pointer-events:none!important;cursor:default!important;`;
                el.onclick = e => {
                    dbg('spoofed "Manage plan" button: clicked', 'a, button, [role="button"] (originally Explore/View plans)', { action: 'preventDefault + stopPropagation (click is a no-op)' });
                    e.preventDefault(); e.stopPropagation();
                };
            }
            if (/^try/.test(t) && !el.dataset.spDone) {
                logChange('a, button, [role="button"]', orig, '(hidden)');
                el.style.display = 'none';
                el.dataset.spDone = '1';
            }
        });
        document.querySelectorAll('[class*="badge"], [class*="Badge"]').forEach(el => {
            if (/^free$/i.test(el.textContent.trim())) {
                logChange('[class*="badge"]', el.textContent.trim(), 'PREMIUM');
                el.textContent = 'PREMIUM';
                el.style.background = PINK;
                el.style.color = '#000';
            }
        });
        document.querySelectorAll('table').forEach(tbl => {
            tbl.querySelectorAll('td, th').forEach(cell => {
                const t = cell.textContent.trim().toLowerCase();
                if (!t || t === '\u2014' || t === '-' || t === 'no' || /free/.test(t)) {
                    logChange('table td, th', t || '(empty)', '\u2713');
                    cell.innerHTML = `<span style="color:${GREEN};font-weight:700;">\u2713</span>`;
                }
            });
        });
        document.querySelectorAll('span[data-encore-id="text"]').forEach(el => {
            const t = el.textContent.trim();
            if (t === 'Download for offline listening') {
                logChange('span[data-encore-id="text"]', t, 'Spotify wont fuck you');
                el.textContent = 'Spotify wont fuck you';
            }
        });
        const upgradeBtn = document.querySelector('[data-testid="upgrade-button"]:not([data-sp-done])');
        if (upgradeBtn) { logChange('[data-testid="upgrade-button"]', upgradeBtn.textContent.trim(), '(hidden)'); upgradeBtn.style.display = 'none'; upgradeBtn.dataset.spDone = '1'; }
        const installBtn = document.querySelector('a[href="/download"]:not([data-sp-done])');
        if (installBtn) { logChange('a[href="/download"]', 'install app link', '(hidden)'); installBtn.style.display = 'none'; installBtn.dataset.spDone = '1'; }
        const premiumMenu = document.querySelector('a[href*="premium/?ref=web_loggedin_upgrade_menu"]:not([data-sp-done])');
        if (premiumMenu) { logChange('a[href*="premium/?ref=web_loggedin_upgrade_menu"]', premiumMenu.textContent.trim(), '(hidden)'); premiumMenu.style.display = 'none'; premiumMenu.dataset.spDone = '1'; }
        const planesXpath = document.evaluate(
            '//a[text()="Premium Plans"] | //span[text()="Premium Plans"] | //div[text()="Premium Plans"]',
            document, null, XPathResult.UNORDERED_NODE_SNAPSHOT_TYPE, null
        );
        for (let i = 0; i < planesXpath.snapshotLength; i++) {
            const nd = planesXpath.snapshotItem(i);
            if (nd && nd.nodeType === 1 && !nd.dataset.spDone) {
                logChange('(xpath) Premium Plans text', nd.textContent.trim(), '(hidden)');
                nd.style.display = 'none';
                nd.dataset.spDone = '1';
            }
        }
        document.querySelectorAll('[aria-label*="Premium Plans"], [data-ga-action="premium"], [data-ga-category="menu"] a, a[href*="/premium/"]').forEach(el => {
            if (el.dataset.spDone) return;
            const t = el.textContent.trim();
            if (t === 'Premium Plans') {
                logChange('[aria-label*="Premium Plans"] / [data-ga-action="premium"] / a[href*="/premium/"]', t, '(hidden)');
                el.style.display = 'none';
                el.dataset.spDone = '1';
            }
        });
        const premiumBanner = document.querySelector('[data-testid="compact-banner"]:not([data-sp-done])');
        if (premiumBanner) {
            logChange('[data-testid="compact-banner"]', '(original upgrade banner)', 'Edit profile / Payment method buttons');
            premiumBanner.dataset.spDone = '1';
            const wrapper = premiumBanner.closest('.sc-dad329a7-0, [class*="dad329a7"]');
            if (wrapper) {
                wrapper.style.width = '100%';
            }
            premiumBanner.style.cssText += `
                display:flex !important;
                flex-direction:row !important;
                background:#2A2A2A !important;
                cursor:default !important;
                padding:0 !important;
                border-radius:8px !important;
                overflow:hidden !important;
                min-width:unset !important;
                width:100% !important;
            `;
            const left = document.createElement('div');
            left.style.cssText = 'flex:1;display:flex;flex-direction:column;align-items:center;justify-content:center;row-gap:var(--encore-spacing-tighter-2);padding:var(--encore-spacing-looser) var(--encore-spacing-tighter-2);cursor:pointer;';
            const pencilSvg = document.createElementNS('http://www.w3.org/2000/svg', 'svg');
            pencilSvg.setAttribute('viewBox', '0 0 16 16');
            pencilSvg.setAttribute('role', 'img');
            pencilSvg.setAttribute('aria-hidden', 'true');
            pencilSvg.style.cssText = 'width:var(--encore-graphic-size-decorative-base);height:var(--encore-graphic-size-decorative-base);';
            pencilSvg.innerHTML = `<path fill="white" d="M11.838.714a2.438 2.438 0 0 1 3.448 3.448l-9.841 9.841c-.358.358-.79.633-1.267.806l-3.173 1.146a.75.75 0 0 1-.96-.96l1.146-3.173c.173-.476.448-.909.806-1.267l9.84-9.84zm2.387 1.06a.94.94 0 0 0-1.327 0l-9.84 9.842a1.95 1.95 0 0 0-.456.716L2 14.002l1.669-.604a1.95 1.95 0 0 0 .716-.455l9.841-9.841a.94.94 0 0 0 0-1.327z"/>`;
            const leftText = document.createElement('span');
            leftText.className = 'e-10561-text encore-text-body-small-bold';
            leftText.style.cssText = 'color:var(--text-base);text-align:center;';
            leftText.textContent = 'Edit profile';
            left.appendChild(pencilSvg);
            left.appendChild(leftText);
            left.onclick = e => {
                e.stopPropagation();
                dbg('premiumBanner left (Edit profile): clicked', '.__sp custom div (replaces [data-testid="compact-banner"])', {
                    action: 'redirecting to https://www.spotify.com/us/account/profile/'
                });
                window.location.href = 'https://www.spotify.com/us/account/profile/';
            };
            const right = document.createElement('div');
            right.style.cssText = 'flex:1;display:flex;flex-direction:column;align-items:center;justify-content:center;row-gap:var(--encore-spacing-tighter-2);padding:var(--encore-spacing-looser) var(--encore-spacing-tighter-2);cursor:pointer;border-left:1px solid #404040;';
            const cardSvg = document.createElementNS('http://www.w3.org/2000/svg', 'svg');
            cardSvg.setAttribute('viewBox', '0 0 16 16');
            cardSvg.setAttribute('role', 'img');
            cardSvg.setAttribute('aria-hidden', 'true');
            cardSvg.style.cssText = 'width:var(--encore-graphic-size-decorative-base);height:var(--encore-graphic-size-decorative-base);';
            cardSvg.innerHTML = `<path fill="white" d="M4 11.5h4V10H4z"/><path fill="white" d="M0 3.75C0 2.784.784 2 1.75 2h12.5c.966 0 1.75.784 1.75 1.75v9.5A1.75 1.75 0 0 1 14.25 15H1.75A1.75 1.75 0 0 1 0 13.25zm1.75-.25a.25.25 0 0 0-.25.25V6h13V3.75a.25.25 0 0 0-.25-.25zm-.25 9.75c0 .138.112.25.25.25h12.5a.25.25 0 0 0 .25-.25V7.5h-13z"/>`;
            const rightText = document.createElement('span');
            rightText.className = 'e-10561-text encore-text-body-small-bold';
            rightText.style.cssText = 'color:var(--text-base);text-align:center;';
            rightText.textContent = 'Payment method';
            right.appendChild(cardSvg);
            right.appendChild(rightText);
            right.onclick = e => {
                e.stopPropagation();
                dbg('premiumBanner right (Payment method): clicked', '.__sp custom div (replaces [data-testid="compact-banner"])', {
                    action: 'redirecting to https://www.spotify.com/us/account/saved-payment-cards/'
                });
                window.location.href = 'https://www.spotify.com/us/account/saved-payment-cards/';
            };
            premiumBanner.innerHTML = '';
            premiumBanner.appendChild(left);
            premiumBanner.appendChild(right);
        }
        if (/\/premium\/|\/duo\/|\/student\/|\/family\//.test(window.location.href) && !document.querySelector('.__sp_premium_done')) {
            logChange('main / #__next (plan purchase page)', '(original plan page content)', '"You dont need Premium" overlay');
            const main = document.querySelector('main') || document.getElementById('__next') || document.body;
            const wrapper = document.createElement('div');
            wrapper.className = '__sp_premium_done';
            wrapper.style.cssText = 'display:flex;flex-direction:column;align-items:center;justify-content:center;min-height:60vh;text-align:center;padding:40px;background:#121212;color:#fff;';
            wrapper.innerHTML = `
                <h1 style="font-size:32px;font-weight:700;margin-bottom:16px;color:#fff;">You dont need Spotify Premium. Trust me.</h1>
                <a href="https://www.spotify.com/" style="display:inline-block;padding:14px 40px;background:#1ed760;color:#000;border-radius:20px;font-weight:700;font-size:16px;text-decoration:none;cursor:pointer;">Back to home</a>
            `;
            main.innerHTML = '';
            main.appendChild(wrapper);
        }
        if (window.location.hostname === 'payments.spotify.com' && !document.querySelector('.__sp_pay_done')) {
            logChange('main / #root (payments page)', '(original checkout page content)', '"DONT WASTE YOUR MONEY" overlay');
            const main = document.querySelector('main') || document.getElementById('root') || document.body;
            const wrapper = document.createElement('div');
            wrapper.className = '__sp_pay_done';
            wrapper.style.cssText = 'display:flex;flex-direction:column;align-items:center;justify-content:center;min-height:100vh;text-align:center;padding:40px;background:#121212;color:#fff;';
            wrapper.innerHTML = `
                <h1 style="font-size:36px;font-weight:700;margin-bottom:16px;color:#fff;">DONT WASTE YOUR MONEY ON SPOTIFY</h1>
                <p style="font-size:18px;margin-bottom:24px;color:#b3b3b3;">Dont give them a cent. Use Spotifuck for free.</p>
                <a href="https://open.spotify.com/" style="display:inline-block;padding:14px 40px;background:#1ed760;color:#000;border-radius:20px;font-weight:700;font-size:16px;text-decoration:none;cursor:pointer;">Back to free Spotify</a>
            `;
            main.innerHTML = '';
            main.appendChild(wrapper);
            document.querySelectorAll('form, button[type="submit"], [data-testid*="pay"], [data-testid*="checkout"]').forEach(el => {
                el.onclick = e => {
                    dbg('payments page blocker: clicked', 'form, button[type="submit"], [data-testid*="pay"], [data-testid*="checkout"]', {
                        'element tag': el.tagName, action: 'preventDefault + stopPropagation (click is a no-op)'
                    });
                    e.preventDefault(); e.stopPropagation();
                };
            });
        }
    }

    // Single gated entry point: both the timed passes below and the mutation
    // observer funnel through this so premiumSpoofEnabledHere() is the one
    // switch that turns the whole spoof pass on/off for the current host.
    function premiumPass(changedRoot) {
        if (!premiumSpoofEnabledHere()) return;
        if (changedRoot) scanText(changedRoot);
        else scanText(document.body);
        runPremium();
    }

    setTimeout(() => premiumPass(document.body), 300);
    setTimeout(() => premiumPass(document.body), 1200);

    let premTimer;
    let pendingNodes = new Set();
    let pendingTextNodes = new Set();
    let premiumObserver = null;

    function handlePremiumMutations(mutations) {
        if (!premiumSpoofEnabledHere()) return;
        for (const m of mutations) {
            if (m.type === 'childList') {
                m.addedNodes.forEach(node => {
                    if (node.nodeType === 1) pendingNodes.add(node);
                });
            } else if (m.type === 'characterData') {
                pendingTextNodes.add(m.target);
            }
        }
        clearTimeout(premTimer);
        premTimer = setTimeout(() => {
            if (pendingNodes.size > 0 && pendingNodes.size <= 20) {
                pendingNodes.forEach(node => scanText(node));
            } else if (pendingNodes.size > 20) {
                scanText(document.body);
            }
            pendingNodes.clear();
            pendingTextNodes.forEach(node => applyReplacements(node));
            pendingTextNodes.clear();
            runPremium();
        }, 400);
    }

    function startPremiumObserver() {
        if (premiumObserver) premiumObserver.disconnect();
        premiumObserver = new MutationObserver(handlePremiumMutations);
        premiumObserver.observe(document.body, {
            childList: true,
            subtree: true,
            characterData: true,
        });
    }
    startPremiumObserver();

    if (typeof GM_registerMenuCommand === 'function') {
        GM_registerMenuCommand('\ud83d\udccb Show everything replaced so far (console)', () => {
            printReplacementLog();
            alert('Current text replacements have been logged to the console. Open DevTools (Press F12 or Right click and Inspect), then select the Logs tab under Console to view it.');
        });
    }

    // --- Ad-slot banner removal (ported from SpotiwebJS.user.js's second IIFE, v7.0.fork) ---
    // Real DOM removal of ad-banner containers on the free/ad-supported tier -
    // this is ordinary ad-block behavior (comparable to a standard ad-blocker
    // filter rule), not a premium-entitlement bypass: it can't touch anything
    // server-enforced like bitrate, offline downloads, or skip limits.
    // Scoped to open.spotify.com (where the web player's ad slots actually
    // render) and gated by the same open.spotify.com toggle as the rest of
    // the spoof, since it ships bundled with it in the source.
    if (HOST_IS_OPEN) {
        const removeAdElements = () => {
            if (!premiumSpoofEnabledHere()) return;
            document.querySelectorAll('[data-testid="ad-slot-container"], [class*="ad-"]').forEach(el => el.remove());
            document.querySelectorAll('.ButtonInner-sc-14ud5tc-0.fcsOIN').forEach(el => el.remove());
        };
        const adObserver = new MutationObserver(removeAdElements);
        adObserver.observe(document.body, { childList: true, subtree: true });
        window.addEventListener('beforeunload', () => adObserver.disconnect());
    }
})();
