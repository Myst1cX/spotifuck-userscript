// ==UserScript==
// @name         Spotifuck
// @namespace    https://github.com/Myst1cX/spotifuck-userscript
// @version      6.9
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
 * a) Rewrote AutoCloseLibrary: closing the library (whether by clicking a
 *   playlist while it's open, or via the toggle itself) now does a real
 *   click on Spotify's own open/close button instead of forcing 48x48 CSS
 *   onto the sidebar. Spotify collapses its own layout properly as a
 *   result, instead of the old glitched, overlapping cluster of header
 *   icons squashed into a tiny box. All button wiring (manual clicks, the
 *   auto-close-on-playlist trigger, and the new bottom nav's Library tab
 *   below) is centralized through one shared function with a guard that
 *   survives Spotify re-rendering the button, so the toggle can't end up
 *   with duplicate click listeners double-firing on a single tap.
 * b) Added a fixed Home/Search/Library bottom nav bar (#sp-bottom-nav),
 *   ported from kitbodega/SpotiKit's mobile layout:
 *   - Home/Search tabs navigate via history.pushState; Library performs
 *     the same real click as (a) on Spotify's native toggle.
 *   - The now-playing player sits fixed just above the nav (bottom:56px);
 *     AMOLED colors and control layout/scaling are unchanged. #main-view
 *     is clipped into a flex column whose height tracks the player's
 *     live-measured height via ResizeObserver, so scrollable content
 *     never runs behind the player or nav.
 *   - The native sidebar (#Desktop_LeftSidebar_Id) is hidden by default
 *     and only appears - as the same fullscreen overlay switchLs() already
 *     builds - while the library is open. A one-time invisible prewarm
 *     expand/collapse cycle on load keeps its virtualized list from
 *     measuring itself as zero-size on first real open.
 *   - Library-open state persists across in-app navigation for the
 *     current page load (cleared on a fresh load), and auto-closes if you
 *     switch to Home/Search while it's open.
 *   - The native top header (home icon, bell, upgrade button, profile
 *     menu, search input) is hidden by default and only shown while the
 *     bottom nav's Search tab is active.
 * c) Added a custom Now Playing view button (next to the lyrics button in
 *   the player bar, styled to match Spotify's own button classes) since
 *   Spotify's native NPV toggle is unreliable/often missing. Only clicks
 *   through this button, or the player-bar album art (see (e) below), are
 *   allowed to open the Now Playing view - a MutationObserver auto-closes
 *   it any other time it becomes visible (Spotify itself, another script,
 *   or already open on page load), so it can't pop open on its own.
 * d) The internal SPFDBG console logging used throughout this script is now
 *   gated behind its own "Debug Logging (console)" userscript-manager menu
 *   toggle (off by default), instead of always printing, so an ordinary
 *   user's console doesn't fill up with click-by-click state logs.
 * e) Fixed the player-bar album art click (Spotify's own native way to open
 *   the Now Playing view) getting immediately undone by the (c) guard,
 *   which only trusted opens made through npBtn - so clicking the album art
 *   looked like it did nothing. It's now a second authorized opener: a
 *   listener on the album art marks the click as authorized right as it
 *   happens, before Spotify's own click handling runs, so the guard leaves
 *   it alone and the album art opens/closes the Now Playing view natively,
 *   as instantly as npBtn.
 * f) Hid the native miniplayer/PiP toggle button (button[data-testid=pip-toggle-button],
 *   via the existing hidden-elements CSS rule.

 * Newly added (v6.8) - Attempted fix for Queue / Connect to a Device buttons
 *   not opening - NOT the actual fix, see v6.9 below
 * - #Desktop_PanelContainer_Id (the right-side panel) is shared by Now
 *   Playing view, Queue, and Connect to a Device - all three flip the same
 *   aria-hidden flag when opened. The (v6.7c) NPV guard's isNpvOpen() only
 *   checked that shared flag, so it couldn't tell NPV apart from Queue/
 *   Devices - meaning it would sometimes auto-close Queue or Devices right
 *   after they opened, thinking it was an unauthorized NPV open. Whether it
 *   misfired depended on stale guard state left over from an earlier NPV
 *   open, which is why it looked intermittent (broken, then fine after some
 *   navigating around). This attempt tried to fix it by checking for
 *   panelContainer.querySelector('[aria-label="Now playing view"], .NowPlayingView')
 *   inside the panel - but that marker turned out to be on the panel
 *   container itself, not a descendant, so querySelector never matched.
 *   Net effect: isNpvOpen() always returned false and the guard stopped
 *   doing anything at all, letting NPV pop open unguarded. Superseded by
 *   v6.9.
 *
 * Newly added (v6.9) - Actual fix for the v6.8 regression above
 * - Checked the real live markup: #Desktop_PanelContainer_Id (the <aside>
 *   itself) carries aria-label="Now playing view" plus a .NowPlayingView
 *   class when showing NPV; aria-label="Queue" for Queue; and
 *   aria-label="Connect to a device" for the device picker - all three as
 *   attributes/classes on the container element itself, not on any child.
 *   isNpvOpen() now checks panelContainer.getAttribute('aria-label') and
 *   panelContainer.classList directly instead of querySelector-ing into it,
 *   so it correctly identifies NPV vs Queue vs Devices and the guard only
 *   ever acts on genuine unauthorized NPV opens.
 *
 * Newly added (v6.9, cont.) - Debug logging coverage completed
 * - Added dbg() calls to the functions that didn't have them yet:
 *   logChange, applyReplacements, scanText, runPremium's DOM-scanning pass,
 *   handlePremiumMutations/startPremiumObserver (the debounce),
 *   forceEnglish, forceEnglishAccountSetting, applyEnglishToLanguageSelect,
 *   and the ad-slot-removal observer.
 * - forceEnglish/forceEnglishAccountSetting/applyEnglishToLanguageSelect
 *   used to trace via plain console.log('Spotifuck: ...') instead of
 *   dbg() - refactored those into dbg() so they're gated behind the same
 *   toggle and filterable by "SPFDBG" like everything else.
 * - Moved the "Debug Logging (console)" menu command to the bottom of the
 *   userscript-manager menu (was 1st, now 4th/last, after the two spoof
 *   toggles and "Show everything replaced so far").
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
    let userOpenedNPV = false;  // NPV guard: true right after an authorized open (our npBtn -
    // see setupNpvButton - or a real click on the player-bar album art, see
    // setupNpvWidgetTrigger) successfully opens the Now Playing view. closeNowPlay() resets
    // this to false on every close, and npvGuardObserver auto-closes the panel any time it
    // becomes visible while this is false - i.e. NPV can only ever be opened via one of those
    // two authorized paths, never via the unreliable native toggle button
    // (unreliable/often absent - see clickNP) or programmatically by anything else.
    let otherPanelOpening = false;  // Queue/Connect guard: true for a short window after a
    // Queue or Connect click, set via capture-phase listener (same trick as the album-art
    // authorized-opener - see setupOtherPanelTriggers) before Spotify's own handler runs.
    // Needed because npvGuardObserver's childList/subtree observation (below) fires on every
    // DOM mutation anywhere in document.body, not just the one aria-hidden flip - Spotify's
    // app mutates constantly, so a single click produces a burst of guard-callback
    // invocations. The flag can't be cleared after the first of those (that reopens the same
    // race it's meant to close), so markOtherPanelOpening() below lets it expire on its own
    // short timer instead, covering the whole opening transition regardless of how many
    // mutations fire during it.
    let otherPanelOpeningTimer = null;
    function markOtherPanelOpening() {
        otherPanelOpening = true;
        clearTimeout(otherPanelOpeningTimer);
        otherPanelOpeningTimer = setTimeout(() => { otherPanelOpening = false; }, 500);
    }

    // --- Bottom nav / library-overlay-persistence state (v6.7) ---
    const LIB_OPEN_KEY = 'spf_library_open';  // sessionStorage key, cleared on every fresh page load (see init)
    let lastActiveTab = null;
    let lastBodyClass = '';
    let lastNavPath = '';
    let bottomNavEl = null;
    let npBarResizeObserver = null;

    // --- Debug logging (v6.7) ---
    // Every click handler in this script logs through dbg() with the same shape:
    //   dbg('event name', 'selector used to find the element', { ...state/details })
    // For handlers that open/alter a view (switchLs, closeNowPlay), the function
    // itself logs a second line showing exactly what changed (dataset/style
    // before -> after), so you can see both "what was clicked" and "what the
    // script then did to the view" in sequence.
    // Filter your console by "SPFDBG" to isolate just this script's click activity.
    function dbg(event, selector, details) {
        if (!debugLoggingEnabled()) return;
        console.log(`%c[SPFDBG] ${event}`, 'color:#1ed760;font-weight:bold;', 'selector:', selector, details || '');
    }

    // --- Debug logging toggle (off by default; console.log spam would
    // otherwise fire on every click for every ordinary user) ---
    const DEBUG_KEY = 'spotifuck_debugLog';
    function debugLoggingEnabled() {
        try { return typeof GM_getValue === 'function' ? GM_getValue(DEBUG_KEY, false) : false; }
        catch (e) { return false; }
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
        dbg('forceEnglish: spoofing navigator.language', 'navigator.language/languages', { value: 'en-US' });
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
                dbg('forceEnglish: redirecting off non-English region path', location.pathname, { to: '/us' + (wm[2] || '/') });
                location.replace(location.origin + '/us' + (wm[2] || '/') + location.search + location.hash);
                return;
            }
        }

        const m = location.pathname.match(/^\/intl-([a-z]{2})(\/.*)?$/i);
        if (m && m[1].toLowerCase() !== 'en') {
            dbg('forceEnglish: redirecting off /intl-xx/ prefix', location.pathname, { to: m[2] || '/' });
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
                    dbg('forceEnglishAccountSetting: could not access preferences iframe', 'iframe.contentDocument', { error: String(e) });
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
            dbg('forceEnglishAccountSetting: giving up', '(language flip retry)', { reason });
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
                        dbg('forceEnglishAccountSetting: language already English', '#desktop.settings.selectLanguage', { reload: false });
                        return;
                    }
                    // Dispatched the change event, but that only proves React
                    // saw it - not that Spotify's backend actually saved it.
                    // Reload and verify on the next load before trusting this.
                    localStorage.setItem(PENDING_KEY, 'true');
                    dbg('forceEnglishAccountSetting: dispatched change, reloading to verify', '#desktop.settings.selectLanguage', { reload: true });
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
                    dbg('forceEnglishAccountSetting: verified language is English', '#desktop.settings.selectLanguage', {});
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
                dbg('forceEnglishAccountSetting: flip did not stick, retrying', '#desktop.settings.selectLanguage', { attempts, max: MAX_ATTEMPTS });
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

            dbg('applyEnglishToLanguageSelect: dispatched change event', '#desktop.settings.selectLanguage', {});
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
            // v6.7: persist across SPA nav + sync bottom nav's active tab highlight.
            sessionStorage.setItem(LIB_OPEN_KEY, 'true');
            if (typeof updateActiveTab === 'function') updateActiveTab();
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
            // v6.7: clear persistence + sync bottom nav's active tab highlight.
            sessionStorage.removeItem(LIB_OPEN_KEY);
            if (typeof updateActiveTab === 'function') updateActiveTab();
        }
    };

    /**
     * closeNowPlay - Close the now-playing right panel if open
     * From r0/e.java line 200: window.closeNowPlay=function(){...}
     */
    window.closeNowPlay = function(source = 'unknown') {
        userOpenedNPV = false; // NPV guard: any close (any source) disarms the "user opened it" flag
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
     * isNpvOpen - Whether the Now Playing view panel is currently visible.
     */
    function isNpvOpen() {
        const panelContainer = document.querySelector('#Desktop_PanelContainer_Id');
        if (!panelContainer) return false;
        if (panelContainer.parentNode.parentNode.ariaHidden !== 'false') return false;
        // #Desktop_PanelContainer_Id is shared by NPV, Queue, and (possibly)
        // Connect to a Device - all three flip the same ariaHidden flag, so
        // checking that alone can't tell them apart. Confirmed against live
        // markup: the <aside id="Desktop_PanelContainer_Id"> element ITSELF
        // carries aria-label="Now playing view" + class "NowPlayingView" when
        // showing NPV, vs aria-label="Queue" (no NowPlayingView class) for
        // Queue - it's an attribute/class on the container, not a descendant,
        // so we check panelContainer directly rather than querySelector-ing
        // into it.
        return panelContainer.getAttribute('aria-label') === 'Now playing view'
            || panelContainer.classList.contains('NowPlayingView');
    }

    /**
     * clickNP - Toggle the Now Playing view via the same toggle button
     * closeNowPlay() already uses (#Desktop_PanelContainer_Id's parent's
     * parent's next-sibling button). NPV guard: sets userOpenedNPV based on
     * the state this click is *about* to produce, BEFORE clicking - not
     * after. npvGuardObserver's MutationObserver callback runs as a
     * microtask, which fires before a setTimeout(0) macrotask ever gets a
     * chance to run, so setting the flag after the click loses the race:
     * the guard sees ariaHidden flip to visible while the flag is still
     * false and closes it out from under us, every time. Setting it first
     * means the guard's microtask always sees the correct value already in
     * place by the time it runs. This is one of two authorized paths that
     * set userOpenedNPV - the other is the direct click on the player-bar
     * album art (see setupNpvWidgetTrigger). clickNP() itself is only ever
     * called from our own npBtn (see setupNpvButton) - the native toggle
     * button (data-testid="control-button-npv") is unreliable/often absent,
     * so this doesn't depend on it.
     */
    function clickNP(source = 'npBtn-click') {
        const panelContainer = document.querySelector('#Desktop_PanelContainer_Id');
        const toggleBtn = panelContainer?.parentNode.parentNode.nextElementSibling?.querySelector('button');
        if (!toggleBtn) {
            dbg('clickNP: no-op - toggle button not found', '#Desktop_PanelContainer_Id parent parent nextElementSibling button', { source });
            return;
        }
        const willOpen = !isNpvOpen();
        userOpenedNPV = willOpen; // set BEFORE the click - see comment above
        dbg('clickNP: clicking toggle', '#Desktop_PanelContainer_Id parent parent nextElementSibling button', { source, willOpen });
        toggleBtn.click();
    }

    // --- NowPlayingView guard: only allow opens via an authorized path -
    // npBtn (clickNP, setupNpvButton) or the native album art click
    // (setupNpvWidgetTrigger) ---
    // Anything else that makes the panel visible - Spotify itself, another
    // script, a stray native control - gets auto-closed, since userOpenedNPV
    // only ever becomes true via one of those two paths.
    const npvGuardObserver = new MutationObserver(() => {
        if (isNpvOpen() && !userOpenedNPV && !otherPanelOpening) {
            const panelContainer = document.querySelector('#Desktop_PanelContainer_Id');
            dbg('NPV guard: panel opened without npBtn click - closing', '#Desktop_PanelContainer_Id', {
                'panelContainer aria-label': panelContainer?.getAttribute('aria-label') ?? null
            });
            window.closeNowPlay('npv-guard-autoclose');
        }
    });
    npvGuardObserver.observe(document.body, { childList: true, subtree: true, attributes: true, attributeFilter: ['aria-hidden'] });

    // On load, close it if it's already open before any npBtn click has happened.
    setTimeout(() => {
        if (isNpvOpen() && !userOpenedNPV) {
            window.closeNowPlay('npv-guard-initial');
        }
    }, 1000);

    // ==========================================================================
    // v6.7: Bottom nav bar (Home/Search/Library) + supporting layout state.
    // Ported from kitbodega/SpotiKit's 7.3.2.fork (open source, see file header).
    // All library open/close still goes through switchLs()/real native clicks
    // above (v6.7) - nothing here reimplements that, it only drives it.
    // ==========================================================================

    const FALLBACK_SVGS = {
        home: '<svg role="img" aria-hidden="true" viewBox="0 0 24 24"><path d="M12.5 3.247a1 1 0 0 0-1 0L4 7.577V20h4.5v-6a1 1 0 0 1 1-1h5a1 1 0 0 1 1 1v6H20V7.577zm-2-1.732a3 3 0 0 1 3 0l7.5 4.33a2 2 0 0 1 1 1.732V21a1 1 0 0 1-1 1h-6.5a1 1 0 0 1-1-1v-6h-3v6a1 1 0 0 1-1 1H3a1 1 0 0 1-1-1V7.577a2 2 0 0 1 1-1.732z"/></svg>',
        search: '<svg role="img" aria-hidden="true" viewBox="0 0 24 24"><path d="M10.533 1.279c-5.18 0-9.407 4.14-9.407 9.279s4.226 9.279 9.407 9.279c2.234 0 4.29-.77 5.907-2.057l4.353 4.353a1 1 0 1 0 1.414-1.414l-4.344-4.344a9.157 9.157 0 0 0 2.077-5.817c0-5.14-4.226-9.28-9.407-9.28zm-7.407 9.279c0-4.006 3.302-7.279 7.407-7.279s7.407 3.273 7.407 7.279-3.302 7.279-7.407 7.279-7.407-3.273-7.407-7.279z"/></svg>',
        library: '<svg role="img" aria-hidden="true" viewBox="0 0 24 24"><path d="M14.5 2.134a1 1 0 0 1 1 0l6 3.464a1 1 0 0 1 .5.866V21a1 1 0 0 1-1 1h-6a1 1 0 0 1-1-1V3a1 1 0 0 1 .5-.866M16 4.732V20h4V7.041zM3 22a1 1 0 0 1-1-1V3a1 1 0 0 1 2 0v18a1 1 0 0 1-1 1m6 0a1 1 0 0 1-1-1V3a1 1 0 0 1 2 0v18a1 1 0 0 1-1 1"/></svg>'
    };

    function createBottomNav() {
        if (document.getElementById('sp-bottom-nav')) return;

        const nav = document.createElement('div');
        nav.id = 'sp-bottom-nav';
        bottomNavEl = nav;

        const tabs = [
            { name: 'home', label: 'Home' },
            { name: 'search', label: 'Search' },
            { name: 'library', label: 'Library' }
        ];

        const frag = document.createDocumentFragment();
        tabs.forEach(({ name, label }) => {
            const btn = document.createElement('button');
            btn.dataset.tab = name;
            btn.innerHTML = `${FALLBACK_SVGS[name]}<span>${label}</span>`;
            btn.addEventListener('click', () => handleTabClick(name));
            frag.appendChild(btn);
        });

        nav.appendChild(frag);
        const mainView = document.querySelector('.Root__main-view') || document.querySelector('div[data-testid=main-view]') || document.body;
        mainView.appendChild(nav);
        updateActiveTab();
    }

    // Single source of truth for wiring the native "Your Library" toggle
    // button's click listener. v6.7 bug: this used to be two independent
    // copies of the same wiring code - one inside addCSSJSHack's
    // setupLibraryButton (v6.7), and a second one duplicated here in
    // ensureLibButtonWired for the new bottom nav (v6.7) - each with its own
    // local .fuckd guard. Because #Desktop_LeftSidebar_Id is display:none
    // whenever the library is collapsed, the *only* way to reach the Library
    // tab is through the bottom nav, so ensureLibButtonWired's copy always
    // ran - and depending on exactly when it ran relative to
    // setupLibraryButton's own passes (immediate + 2s retry), the two copies
    // could each end up believing they were the first to wire the button,
    // attaching two separate click listeners to it. A single click then
    // scheduled switchLs() twice back-to-back: the first call expanded the
    // library, the second (seeing it now already expanded) collapsed it
    // straight back - a one-frame flash, then stuck closed no matter how many
    // times you clicked it after that. Fix: both setupLibraryButton and
    // ensureLibButtonWired now just call this one function on whatever
    // element they found, so there is only ever one guard and only ever one
    // listener, however either of them gets invoked.
    //
    // v6.7 fix: the shared guard above (checking libBtn.classList.contains
    // ('fuckd')) still wasn't enough - ensureLibButtonWired() re-queries this
    // exact button every time the bottom nav's Library tab is tapped, and
    // Spotify's own re-render of the button (switching its icon/aria-label
    // between Open<->Collapse) recomputes its class attribute, wiping the
    // 'fuckd'/'lbtn' classes we'd added - but NOT the click listener we'd
    // already attached (listeners aren't tied to attributes). So the next tap
    // saw no '.fuckd', believed the button unwired, and attached a *second*
    // listener to the very same node. Every click after that fired both
    // listeners, scheduling switchLs() twice back-to-back (the exact
    // EXPAND-then-immediately-COLLAPSE flash from Issue 1) - permanently,
    // since neither listener is ever removed. Fix: track "already wired" via
    // a plain JS property on the element (__spLibBtnWired) instead of a DOM
    // class - Spotify's own re-renders only touch attributes/props it
    // manages (class, aria-label, etc.), so a property we invented ourselves
    // is invisible to it and can never get wiped out from under us. The
    // 'fuckd'/'lbtn' classes are still added (used elsewhere as the general
    // "already processed" convention and for the inline padding/height
    // styling below), just no longer relied on as the guard.
    function wireLibraryButton(libBtn) {
        if (!libBtn || libBtn.__spLibBtnWired) return;
        libBtn.__spLibBtnWired = true;
        window.lBtn = libBtn;
        libBtn.classList.add('fuckd', 'lbtn');
        libBtn.style.padding = '0';
        libBtn.style.height = '20px';
        libBtn.addEventListener('click', function() {
            if (suppressLibBtnHandler) {
                suppressLibBtnHandler = false;
                dbg('libBtn: clicked (synthetic, suppressed)', '#Desktop_LeftSidebar_Id header button[aria-label*="Your Library"]', {
                    'aria-label at click time': libBtn.getAttribute('aria-label'),
                    note: 'synthetic click - skipping switchLs() scheduling'
                });
                return;
            }
            dbg('libBtn: clicked', '#Desktop_LeftSidebar_Id header button[aria-label*="Your Library"]', {
                'aria-label at click time': libBtn.getAttribute('aria-label'),
                note: 'native Spotify click handler also runs on this same event; our switchLs() runs after via setTimeout 0'
            });
            setTimeout(() => switchLs('libBtn-click'), 0);
        });
    }

    // Makes sure the native sidebar "Your Library" header button has our click
    // listener attached, even if addCSSJSHack/setupLibraryButton hasn't run yet
    // by the time the bottom nav's Library tab gets tapped (createBottomNav
    // initializes independently of firstFuck's playBtn-gated loop). Delegates
    // to wireLibraryButton() (see above) instead of wiring it directly, so
    // there's only ever one listener attached either way.
    function ensureLibButtonWired() {
        const libBtn = document.querySelector('#Desktop_LeftSidebar_Id header button[aria-label*="Your Library"]');
        wireLibraryButton(libBtn);
        return libBtn || window.lBtn || null;
    }

    // Closes the library via the same real-click mechanism as Trigger 1/2
    // (never CSS-only forcing), used when the bottom nav's Home/Search tab is
    // tapped while the library overlay is open.
    function collapseLibraryViaRealClick(source) {
        const sidebar = document.querySelector('#Desktop_LeftSidebar_Id');
        if (!sidebar || sidebar.dataset.fuckExpanded !== 'true') {
            dbg('collapseLibraryViaRealClick: no-op - already collapsed or sidebar not found', '#Desktop_LeftSidebar_Id', {
                source, found: !!sidebar, fuckExpanded: sidebar ? sidebar.dataset.fuckExpanded : null
            });
            return;
        }
        if (pendingLibCollapse !== null) {
            clearTimeout(pendingLibCollapse);
            pendingLibCollapse = null;
        }
        const nativeToggle = sidebar.querySelector('header button[aria-label*="Your Library"]');
        if (nativeToggle && nativeToggle.getAttribute('aria-label') === 'Collapse Your Library') {
            suppressLibBtnHandler = true;
            nativeToggle.click();
        }
        sidebar.dataset.fuckExpanded = 'false';
        sidebar.style.position = '';
        sidebar.style.width = '';
        sidebar.style.height = '';
        sidebar.style.left = '';
        sidebar.style.top = '';
        sidebar.style.zIndex = '';
        sessionStorage.removeItem(LIB_OPEN_KEY);
        if (typeof updateActiveTab === 'function') updateActiveTab();
        dbg('collapseLibraryViaRealClick: collapsed', '#Desktop_LeftSidebar_Id', { source });
    }

    // Restores the library to expanded via the same real-click mechanism as
    // Trigger 1/2 (never a direct dataset/CSS write), used by onLocationChange
    // below to restore library-open state after an in-app SPA navigation.
    // v6.7 fix: this used to set dataset.fuckExpanded/CSS/header text
    // directly, bypassing switchLs() - the one invariant spotifucklog's
    // switchLs() relies on ("we're the only code that ever calls switchLs(),
    // so this can never desync") only holds if nothing else ever writes
    // dataset.fuckExpanded directly. That direct write could leave our
    // tracked state saying "expanded" while Spotify's own native toggle
    // still showed "Open Your Library" (never actually told to open) - so a
    // subsequent click branched off the wrong state and switchLs() had to
    // self-correct with a second call, causing a visible flash. Fix: do a
    // real click on the native toggle instead, exactly like Trigger 1/2, so
    // switchLs() is again the only writer of dataset.fuckExpanded.
    function expandLibraryViaRealClick(source) {
        const sidebar = document.querySelector('#Desktop_LeftSidebar_Id');
        if (!sidebar || sidebar.dataset.fuckExpanded === 'true') {
            dbg('expandLibraryViaRealClick: no-op - already expanded or sidebar not found', '#Desktop_LeftSidebar_Id', {
                source, found: !!sidebar, fuckExpanded: sidebar ? sidebar.dataset.fuckExpanded : null
            });
            return;
        }
        const nativeToggle = ensureLibButtonWired();
        if (nativeToggle && nativeToggle.getAttribute('aria-label') === 'Open Your Library') {
            nativeToggle.click();
            dbg('expandLibraryViaRealClick: triggered native click to restore expanded state', '#Desktop_LeftSidebar_Id', { source });
        } else {
            dbg('expandLibraryViaRealClick: native toggle not in expected state or not found - skipped', '#Desktop_LeftSidebar_Id', {
                source, ariaLabel: nativeToggle ? nativeToggle.getAttribute('aria-label') : null
            });
        }
    }

    function handleTabClick(name) {
        dbg('handleTabClick: called', '#sp-bottom-nav button', { name });
        if (name === 'library') {
            // Real click on Spotify's own toggle - fires Spotify's native handler
            // plus our libBtn listener (setTimeout(0) => switchLs()), exactly like
            // a manual click (Trigger 1). Never calls switchLs() directly here,
            // so it can never double-fire.
            const libBtn = ensureLibButtonWired();
            if (libBtn) {
                libBtn.click();
            } else {
                dbg('handleTabClick: library tab - native toggle not found yet', '#Desktop_LeftSidebar_Id header button[aria-label*="Your Library"]', {});
            }
            return;
        }

        collapseLibraryViaRealClick('bottomNav-' + name + '-tab');

        if (name === 'search') {
            if (!location.pathname.startsWith('/search')) {
                history.pushState(null, '', '/search');
                window.dispatchEvent(new PopStateEvent('popstate'));
            }
            return;
        }

        if (name === 'home') {
            if (location.pathname !== '/') {
                history.pushState(null, '', '/');
                window.dispatchEvent(new PopStateEvent('popstate'));
            }
            return;
        }
    }

    function updateActiveTab() {
        const leftSidebar = document.querySelector('#Desktop_LeftSidebar_Id');
        const isLibraryExpanded = !!leftSidebar && leftSidebar.dataset.fuckExpanded === 'true';
        const path = location.pathname;
        let active = null;
        if (isLibraryExpanded) active = 'library';
        else if (path === '/' || path === '/home') active = 'home';
        else if (path.startsWith('/search')) active = 'search';

        if (active === lastActiveTab) return;
        lastActiveTab = active;

        const nav = bottomNavEl || document.getElementById('sp-bottom-nav');
        if (!nav) return;
        const buttons = nav.children;
        for (let i = 0; i < buttons.length; i++) {
            const btn = buttons[i];
            btn.classList.toggle('active', btn.dataset.tab === active);
        }
    }

    // Ported from SpotiKit: drives the header-visibility CSS (#global-nav-bar /
    // native search input are hidden except when body carries "sp-search").
    function updateBodyClass() {
        const path = location.pathname;
        let cls = '';
        if (path === '/' || path === '/home') cls = 'sp-home';
        else if (path.startsWith('/search')) cls = 'sp-search';
        else if (path.startsWith('/collection')) cls = 'sp-collection';
        else if (path.startsWith('/playlist')) cls = 'sp-playlist';
        else if (path.startsWith('/album')) cls = 'sp-album';
        else if (path.startsWith('/artist')) cls = 'sp-artist';
        else if (path.startsWith('/track')) cls = 'sp-track';

        if (cls === lastBodyClass) return;
        if (lastBodyClass) document.body.classList.remove(lastBodyClass);
        if (cls) document.body.classList.add(cls);
        lastBodyClass = cls;
    }

    function onLocationChange() {
        if (location.pathname === lastNavPath) return;
        lastNavPath = location.pathname;
        updateBodyClass();
        if (typeof updateActiveTab === 'function') updateActiveTab();

        if (sessionStorage.getItem(LIB_OPEN_KEY) === 'true') {
            const leftSidebar = document.querySelector('#Desktop_LeftSidebar_Id');
            if (leftSidebar && leftSidebar.dataset.fuckExpanded !== 'true') {
                // v6.7 fix: restore via a real click (expandLibraryViaRealClick)
                // instead of writing dataset.fuckExpanded/CSS/header text here
                // directly - see that function's comment for why the direct
                // write caused a dataset/native desync (Issue 1).
                expandLibraryViaRealClick('onLocationChange-restore');
            }
        }
    }

    function hookHistory() {
        const origPush = history.pushState;
        const origReplace = history.replaceState;
        history.pushState = function() {
            origPush.apply(this, arguments);
            onLocationChange();
        };
        history.replaceState = function() {
            origReplace.apply(this, arguments);
            onLocationChange();
        };
        window.addEventListener('popstate', onLocationChange);
    }

    // --- Silent one-time library prewarm (ported from SpotiKit) ---
    // The sidebar's virtualized list/grid measures its container on mount, but
    // it now sits at display:none up to that point (see injectCSS's
    // #Desktop_LeftSidebar_Id rule) - so the actual first real expand would
    // measure a stale zero-size box and render broken, only fixing itself once
    // toggled again. This runs the exact same expand/settle/collapse cycle once,
    // fully invisibly (visibility:hidden + pointer-events:none via .sp-prewarm,
    // layered on the real [data-fuck-expanded="true"] CSS so it's laid out
    // identically to a genuine open), before the user ever touches the Library
    // tab. Bypasses switchLs() entirely (no header text/sessionStorage change).
    let libraryPrewarmed = false;
    let libraryPrewarmAttempts = 0;
    function prewarmLibrarySidebar() {
        if (libraryPrewarmed) return;
        const leftSidebar = document.querySelector('#Desktop_LeftSidebar_Id');
        if (!leftSidebar) {
            libraryPrewarmAttempts++;
            if (libraryPrewarmAttempts < 100) setTimeout(prewarmLibrarySidebar, 100);
            return;
        }
        libraryPrewarmed = true;

        leftSidebar.classList.add('sp-prewarm');
        leftSidebar.dataset.fuckExpanded = 'true';

        requestAnimationFrame(() => {
            requestAnimationFrame(() => {
                const list = leftSidebar.querySelector('[role="list"],[role="grid"],div[class*="view-container"]');
                if (list) {
                    list.scrollBy(0, 1);
                    list.scrollBy(0, -1);
                }
                window.dispatchEvent(new Event('resize'));

                setTimeout(() => {
                    delete leftSidebar.dataset.fuckExpanded;
                    leftSidebar.classList.remove('sp-prewarm');
                    window.dispatchEvent(new Event('resize'));
                    console.log('#Library: pre-warmed silently - first real open should render correctly now');
                }, 60);
            });
        });
    }

    // Collapsed/minimized mini-player state doesn't exist here - Spotifucklog's
    // playback controls card is always shown expanded. Its real height still
    // varies with content though, so this keeps --sp-np-bar-height in sync via
    // a live ResizeObserver - the #main-view clip CSS (injectCSS) subtracts that
    // variable, plus the bottom nav's fixed 56px, from 100dvh.
    function updateNPBarHeightVar() {
        const player = document.querySelector('aside[data-testid=now-playing-bar]');
        if (player) {
            document.documentElement.style.setProperty('--sp-np-bar-height', player.offsetHeight + 'px');
        }
    }
    function setupNPBarHeightSync() {
        const player = document.querySelector('aside[data-testid=now-playing-bar]');
        if (!player) return;
        updateNPBarHeightVar();
        if (!npBarResizeObserver && typeof ResizeObserver !== 'undefined') {
            npBarResizeObserver = new ResizeObserver(() => updateNPBarHeightVar());
            npBarResizeObserver.observe(player);
        }
        if (!player.dataset.heightSyncReady) {
            player.dataset.heightSyncReady = '1';
            window.addEventListener('resize', updateNPBarHeightVar);
        }
    }

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
                // v6.7 fix: delegate to the single shared wireLibraryButton() helper
                // (see its definition near ensureLibButtonWired below) instead of
                // wiring the listener here directly - having two separate copies of
                // this wiring was the cause of the double-switchLs()-call library bug.
                wireLibraryButton(libBtn);

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
                            // v6.7: this collapse path bypasses switchLs() entirely (see comment
                            // above), so it needs its own persistence-clear + active-tab sync too.
                            sessionStorage.removeItem(LIB_OPEN_KEY);
                            if (typeof updateActiveTab === 'function') updateActiveTab();
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

        // NPV guard: builds our own Now Playing view toggle button next to the
        // lyrics button, since the native toggle (data-testid="control-button-npv")
        // is unreliable/often absent. This is the only *added* click path -
        // see setupNpvWidgetTrigger() below for the other legitimate native
        // path (the player-bar album art) that the guard is also taught to
        // allow, plus clickNP()/npvGuardObserver above closeNowPlay().
        const setupNpvButton = () => {
            if (document.querySelector('.npbtn')) return; // already inserted
            const lyBtn = document.querySelector('button[data-testid="lyrics-button"]:not(.fuckd-npv)');
            if (!lyBtn) return;
            lyBtn.classList.add('fuckd-npv');

            const npBtn = document.createElement('button');
            // Clone lyBtn's own classes (Spotify's real Encore button classes) so
            // npBtn automatically gets the same size/padding/hover/scale as every
            // other player-bar button, instead of rendering as an unstyled native
            // <button> (which is what was making it look like a thin line before).
            npBtn.className = lyBtn.className.replace('fuckd-npv', '').trim() + ' npbtn';
            npBtn.setAttribute('aria-label', 'Now Playing view');
            npBtn.title = 'Now Playing view';
            // Filled icon (rounded-rect "panel" with a solid play-style wedge) instead
            // of the old stroke-only path, which had no fill and rendered as a sliver
            // at real button size.
            npBtn.innerHTML = `<svg data-encore-id="icon" role="img" aria-hidden="true" viewBox="0 0 16 16" style="width:16px;height:16px;fill:currentColor;"><rect x="1.25" y="0.75" width="13.5" height="14.5" rx="2" fill="none" stroke="currentColor" stroke-width="1.5"/><path d="M6 4.5v7l5.5-3.5z" fill="currentColor"/></svg>`;
            npBtn.addEventListener('click', () => clickNP('npBtn-click'));
            lyBtn.parentNode.insertBefore(npBtn, lyBtn);

            // Make sure NPV starts closed - at this point only npBtn is wired
            // as an authorized opener (setupNpvWidgetTrigger runs separately).
            if (isNpvOpen() && !userOpenedNPV) window.closeNowPlay('npv-guard-init');

            dbg('setupNpvButton: button inserted', 'button[data-testid="lyrics-button"]', {});
        };

        // NPV guard: the player-bar album art (div[data-testid=now-playing-widget]
        // >div:first-child) natively TOGGLES the Now Playing view on click - this is
        // a real, reliable Spotify affordance, separate from the unreliable native
        // toggle button npBtn above works around. Without this, npvGuardObserver
        // (which only trusts opens that went through clickNP()) would see the
        // native open and immediately undo it, making the click appear to do
        // nothing. A capture-phase listener sets userOpenedNPV to match what this
        // click is about to do - open or close, computed from isNpvOpen() same as
        // clickNP() - strictly before Spotify's own bubble-phase handler runs, so
        // by the time npvGuardObserver's mutation microtask fires, userOpenedNPV
        // already reflects the correct state. This must mirror both directions
        // (not just set true): since it's a native toggle, the closing click never
        // goes through our closeNowPlay() (which is the only other place that
        // resets the flag), so an unconditional `true` here would leave the flag
        // stuck true after a close and cause the guard to wrongly trust the next
        // unrelated native open. Nothing is clicked synthetically here (unlike
        // clickNP()), so there's no risk of a second, self-inflicted toggle undoing
        // Spotify's own native one.
        const setupNpvWidgetTrigger = () => {
            const artEl = document.querySelector('div[data-testid="now-playing-widget"]>div:first-child:not(.fuckd-npv-art)');
            if (!artEl) return;
            artEl.classList.add('fuckd-npv-art');
            artEl.addEventListener('click', () => {
                // Album art is a native toggle - a click can either open OR close NPV
                // depending on current state, unlike npBtn where clickNP() computes this
                // itself. Must mirror that here: if we unconditionally set true, the
                // *closing* click (native, closeNowPlay() never runs for this path) leaves
                // userOpenedNPV stuck true, so the guard wrongly trusts the next unrelated
                // native open (e.g. playlist play button auto-opening NPV).
                const willOpen = !isNpvOpen();
                userOpenedNPV = willOpen;
                dbg('npvWidget: album art clicked', 'div[data-testid="now-playing-widget"]>div:first-child', {
                    willOpen,
                    note: willOpen
                        ? 'userOpenedNPV set true before Spotify\'s own click handling runs, so npvGuardObserver allows this open'
                        : 'panel was open - this click closes it natively (closeNowPlay() never runs for this path), so userOpenedNPV reset to false here to keep guard state in sync'
                });
            }, { capture: true });
            dbg('setupNpvWidgetTrigger: listener attached', 'div[data-testid="now-playing-widget"]>div:first-child', {});
        };

        // Same authorized-opener trick as setupNpvWidgetTrigger above, but for Queue and
        // Connect - marks otherPanelOpening=true the instant the click lands (capture
        // phase, before Spotify's own handler runs), so npvGuardObserver's mutation
        // callback sees it already set and doesn't mistake the shared panel's still-stale
        // "Now playing view" label for an unauthorized NPV open.
        const setupOtherPanelTriggers = () => {
            const queueBtn = document.querySelector('button[data-testid="control-button-queue"]:not(.fuckd-other-panel)');
            if (queueBtn) {
                queueBtn.classList.add('fuckd-other-panel');
                queueBtn.addEventListener('click', () => {
                    markOtherPanelOpening();
                    dbg('otherPanel: Queue button clicked', 'button[data-testid="control-button-queue"]', {});
                }, { capture: true });
            }
            const connectBtn = document.querySelector('button[aria-label="Connect to a device"]:not(.fuckd-other-panel)');
            if (connectBtn) {
                connectBtn.classList.add('fuckd-other-panel');
                connectBtn.addEventListener('click', () => {
                    markOtherPanelOpening();
                    dbg('otherPanel: Connect button clicked', 'button[aria-label="Connect to a device"]', {});
                }, { capture: true });
            }
        };

        // Try to setup all elements immediately
        setupLibraryButton();
        setupLibraryGrid();
        setupHomeButton();
        setupSearchInput();
        setupUserButton();
        setupNPBarHeightSync();
        setupNpvButton();
        setupNpvWidgetTrigger();
        setupOtherPanelTriggers();

        // Use a short retry mechanism for elements that might not be ready yet
        // Check once more after 2 seconds for any missed elements
        setTimeout(() => {
            setupLibraryButton();
            setupLibraryGrid();
            setupHomeButton();
            setupSearchInput();
            setupUserButton();
            setupNPBarHeightSync();
            setupNpvButton();
            setupNpvWidgetTrigger();
            setupOtherPanelTriggers();
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
div[data-encore-id=banner],#global-nav-bar>div:first-of-type,#global-nav-bar a[href="/download"],button[data-testid=fullscreen-mode-button],button[data-testid=pip-toggle-button],div.main-view-container__mh-footer-container{display:none!important}
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

/**
     * Unhides the track-info block on the left side of the player bar (album art which one can click to then display NPV)
     * div[data-testid=now-playing-widget]>div:first-child{display:none!important}
     */

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

        // --- Bottom nav bar + library-overlay layout + header visibility (v6.7) ---
        // Kept as its own <style> element (rather than merged into the blocks
        // above) so none of the existing v6.7 CSS above has to be touched.
        const bottomNavLayout = document.createElement('style');
        bottomNavLayout.textContent = `
/* Sidebar now reached only through the bottom nav's Library tab - hidden by
   default, full-screen overlay (unchanged from v6.7) once switchLs() sets
   dataset.fuckExpanded="true". */
#Desktop_LeftSidebar_Id{
  display:none!important
}
#Desktop_LeftSidebar_Id[data-fuck-expanded="true"]{
  display:flex!important;
  flex-direction:column!important
}
/* Silent-prewarm pass (see prewarmLibrarySidebar): same [data-fuck-expanded="true"]
   layout as a real open, laid out identically, but invisible and inert. */
#Desktop_LeftSidebar_Id.sp-prewarm[data-fuck-expanded="true"]{
  visibility:hidden!important;
  pointer-events:none!important
}

/* main-view becomes a clipped flex column so its scrollable content stops
   above the player+nav instead of scrolling on behind them. */
.Root__main-view,
div[data-testid=main-view],
#main-view{
  display:flex!important;
  flex-direction:column!important;
  min-height:0!important;
  overflow:hidden!important;
}
div[data-testid=main-view],
#main-view{
  height:calc(100dvh - var(--sp-np-bar-height, 0px) - 56px)!important;
  max-height:calc(100dvh - var(--sp-np-bar-height, 0px) - 56px)!important;
  overflow-y:auto!important;
  overflow-x:hidden!important;
  padding-bottom:0!important;
}
@supports not (height: 100dvh) {
  div[data-testid=main-view],
  #main-view{
    height:calc(100vh - var(--sp-np-bar-height, 0px) - 56px)!important;
    max-height:calc(100vh - var(--sp-np-bar-height, 0px) - 56px)!important;
  }
}

#sp-bottom-nav{
  position:fixed!important;
  left:0!important;
  right:0!important;
  bottom:0!important;
  width:100%!important;
  height:56px;
  background:#000!important;
  border:none!important;
  border-top:1px solid #666!important;
  box-shadow:none!important;
  display:flex;
  align-items:center;
  justify-content:space-around;
  padding:0 8px;
  z-index:9999!important;
  contain:layout style paint
}
#sp-bottom-nav button{
  flex:1;
  display:flex;
  flex-direction:column;
  align-items:center;
  justify-content:center;
  gap:2px;
  background:none!important;
  border:none;
  color:#b3b3b3;
  cursor:pointer;
  padding:4px 0;
  transition:color 0.15s;
  height:100%
}
#sp-bottom-nav button.active{color:#fff}
#sp-bottom-nav button svg{width:24px;height:24px;fill:currentColor}
#sp-bottom-nav button span{font-size:10px;letter-spacing:0.5px}

/* Player position only - colors/box-shadow/border/control scaling above (v6.7
   CSS + AMOLED block) are untouched. It now sits fixed, directly above the new
   bottom nav, instead of in normal document flow. */
aside[data-testid=now-playing-bar]{
  margin:0!important;
  position:fixed!important;
  left:0!important;
  right:0!important;
  bottom:56px!important;
  z-index:9998!important;
  max-height:40vh!important;
  overflow-y:auto!important;
  contain:layout style paint
}

/* Home/Search now live in the bottom nav - top header (home icon, bell,
   upgrade button, profile menu) and the native search input are hidden by
   default, shown only while the Search tab is active (body.sp-search). */
#global-nav-bar{display:none!important}
body.sp-search #global-nav-bar{display:flex!important}
/* Home already lives in the bottom nav - strip the native Home icon back out
   of global-nav-bar even while the rest of the bar is shown for search, so it
   doesn't duplicate the bottom nav's Home tab. Ported from SpotiKit 7.3.2.fork,
   missing here previously (the bar-level show/hide above was ported but this
   button-level follow-up rule wasn't, leaving native Home visible during search). */
#global-nav-bar button[data-testid=home-button],
#global-nav-bar a[aria-label*="Home"],
#global-nav-bar a[aria-label*="Inicio"]{display:none!important}
input[data-testid="search-input"]{display:none!important}
body.sp-search input[data-testid="search-input"]{display:flex!important}
        `;
        document.head.appendChild(bottomNavLayout);

        console.log('#CSS Injected');
    }

    // Initialize immediately
    if (HOST_IS_OPEN) {
        injectCSS();
        firstFuck();

        // v6.7: bottom nav init - independent of firstFuck's playBtn-gated pass,
        // so Home/Search/Library are available as soon as the body exists.
        // Also clears any stale library-open flag from a previous tab/session
        // before onLocationChange can act on it (fresh page load always starts
        // collapsed, per v6.7's own startup-collapse behavior).
        sessionStorage.removeItem(LIB_OPEN_KEY);
        const waitForBottomNavBody = setInterval(() => {
            if (document.body) {
                clearInterval(waitForBottomNavBody);
                lastNavPath = location.pathname;
                updateBodyClass();
                createBottomNav();
                hookHistory();
                prewarmLibrarySidebar();
            }
        }, 100);
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
        dbg('logChange: replacement recorded', selector, { from, to });
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
        if (c) {
            dbg('applyReplacements: text node updated', '(text node)', { before: node.nodeValue, after: v });
            node.nodeValue = v;
        }
    }
    function scanText(root) {
        if (!root) return;
        dbg('scanText: DOM scan pass', 'TreeWalker(root, SHOW_TEXT)', { root: root === document.body ? 'document.body' : (root.id || root.className || root.nodeName) });
        const w = document.createTreeWalker(root, NodeFilter.SHOW_TEXT, null, false);
        let n;
        while (n = w.nextNode()) applyReplacements(n);
    }

    function runPremium() {
        dbg('runPremium: DOM scan pass running', 'document', {});
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
            dbg('handlePremiumMutations: debounced scan running', 'MutationObserver(document.body)', { pendingNodes: pendingNodes.size, pendingTextNodes: pendingTextNodes.size });
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
        dbg('startPremiumObserver: MutationObserver (re)started', 'document.body', { childList: true, subtree: true, characterData: true });
    }
    startPremiumObserver();

    if (typeof GM_registerMenuCommand === 'function') {
        GM_registerMenuCommand('\ud83d\udccb Show everything replaced so far (console)', () => {
            printReplacementLog();
            alert('Current text replacements have been logged to the console. Open DevTools (Press F12 or Right click and Inspect), then select the Logs tab under Console to view it.');
        });
    }

    if (typeof GM_registerMenuCommand === 'function') {
        GM_registerMenuCommand(
            (debugLoggingEnabled() ? '✅' : '❌') + ' Debug Logging (console)',
            () => { setFlag(DEBUG_KEY, !debugLoggingEnabled()); location.reload(); }
        );
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
            const adSlots = document.querySelectorAll('[data-testid="ad-slot-container"], [class*="ad-"]');
            const adButtons = document.querySelectorAll('.ButtonInner-sc-14ud5tc-0.fcsOIN');
            if (adSlots.length || adButtons.length) {
                dbg('removeAdElements: ad elements removed', '[data-testid="ad-slot-container"], [class*="ad-"], .ButtonInner-sc-14ud5tc-0.fcsOIN', { adSlots: adSlots.length, adButtons: adButtons.length });
            }
            adSlots.forEach(el => el.remove());
            adButtons.forEach(el => el.remove());
        };
        const adObserver = new MutationObserver(removeAdElements);
        adObserver.observe(document.body, { childList: true, subtree: true });
        window.addEventListener('beforeunload', () => adObserver.disconnect());
    }
})();
