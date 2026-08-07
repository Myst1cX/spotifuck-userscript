// ==UserScript==
// @name         Spotifuck Mobile
// @namespace    https://github.com/Myst1cX/spotifuck-userscript
// @version      7.18.c
// @description  Full Spotifuck 1.6.4 UI hack (with minor tweaks) + playback control + force English UI + visual premium spoof
// @author       Myst1cX (adapted from Spotifuck app)
// @match        *://open.spotify.com/*
// @match        *://www.spotify.com/*
// @match        *://payments.spotify.com/*
// @grant        GM_addStyle
// @grant        GM_registerMenuCommand
// @grant        GM_setValue
// @grant        GM_getValue
// @run-at       document-start
// @homepageURL  https://github.com/Myst1cX/spotifuck-userscript
// @supportURL   https://github.com/Myst1cX/spotifuck-userscript/issues
// @updateURL    https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-mobile.user.js
// @downloadURL  https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-mobile.user.js
// ==/UserScript==

/*
* Spotifuck v6 - Accurate port from reverse-engineered v1.6.4 APK
* Based on r0/e.java from classes1.dex
*
* Features from APK:
* - Library button toggle (expand 100%×100% / collapse 48×48px)
* - Pure black AMOLED mode for playback controls
* NOTE: currently works without needing !important on the
* .encore-dark-theme custom properties, because `.YourLibraryX{
* background:var(--background-elevated-base)!important}` in the
* bottom-nav/library-overlay block (Sixth big change) independently pins
* the library/sidebar surface. If AMOLED ever starts showing grey again
* (e.g. that rule/class gets removed or renamed in a future change, or
* Spotify adds a new panel that redeclares these vars closer to its own
* root than .encore-dark-theme sits), see the comment at the AMOLED
* style block (find it by searching: 'AMOLED pure black mode (from r0/e.java)')
* - Auto-close library on playlist selection (and load the playlist)
* - UI improvements (sidebar, search bar, playback controls)
* - CSS hacks for better mobile experience
*
* Fixed from APK:
* - Library folder navigation (original behavior auto-closed library on any item selection, including folders.
*
* Newly added (v6.3):
* - Browser-side equivalent of Spotifuck's ForceEn that forces Android app locale to English before loading its WebView
* - (Forces English on open.spotify.com: overrides navigator.language/languages,
* and strips a non-English /intl-xx/ locale prefix from the URL if present.)
* - The feature is a functional dependency because of the following buttons hardcoded to English aria-label text:
* const libBtn = document.querySelector('#Desktop_LeftSidebar_Id header button[aria-label*="Your Library"]:not(.fuckd)');
* if (libBtn.getAttribute('aria-label') === 'Collapse Your Library') {
* Newly added (v6.4) - Fixed "Force English" (v6.3 was not working at all)
* - forceEnglish() actually forces English now. The v6.3 version only overrode
* navigator.language and stripped the /intl-xx/ URL prefix, both of which only
* affect a single page load - the aria-labels Spotify actually renders (e.g.
* "Open Your Library") are driven by the account-level language preference at
* open.spotify.com/preferences, which is saved server-side. forceEnglish() now
* also flips that setting to "en" once, via a hidden iframe so it doesn't
* disrupt whatever the user is looking at, then reloads the page so the change
* actually takes effect. A localStorage flag means this only runs once ever, and skips the reload
* entirely if the account was already set to English.
*
* Newly added (v6.4.fix) - Fixed "Force English" again (v6.4 had some bug cases)
* - Fixed a case where, if a user landed directly on /preferences (rather than
* via the hidden iframe), the code that watches for the language <select> to
* appear never actually started watching - it silently did nothing and timed
* out. Now it waits for the page to finish loading first if needed.
* - Removed the old "only ever run once" localStorage flag. It assumed the
* account language setting only ever changes via this script, so once set,
* it stopped checking forever - meaning if the user manually changed the
* account language afterward, the script would never notice or fix it again.
* It now re-checks the actual setting on every real page load instead.
* - The dispatched change event is no longer trusted as proof the setting
* actually saved. It's now verified on the next load before being treated as
* done, with a capped number of retries if it didn't stick.
*
* Newly added (v6.5) - Fixed "Force English" again (:D)
* - Fixed a race where the hidden iframe's "did it finish loading" check and
* its 15-second give-up timer could both fire for the same attempt if the
* timing landed close together, causing the same logic to run twice. Now
* whichever one happens first is the only one that's acted on.
* - Fixed a race where redirecting away from a non-English /intl-xx/ URL
* didn't stop the rest of forceEnglish() from also running against that
* same (already-leaving) page. It now stops immediately after triggering
* that redirect instead.
*
* Newly added (v6.6):
* a) Improved forceEnglish() to now also redirect www.spotify.com off non-English region path segments (e.g. /mx/ -> /us/)
* b) Ported the visual premium spoof & payment-page blockers from Spotikit/SpotiwebJS.user.js (v7.0.fork)
* - CREDITS TO: kitbodega for the code logic - kitbodega/SpotiKit/SpotiwebJS(obsolete).user.js
* - Added the PINK/GREEN constants, REPLACE text-swap map, and runPremium()) from SpotiwebJS
* - Fork's expansion: the scan/replace pass is now MutationObserver-driven (only re-scans changed
* nodes) instead of a full document.body walk on a timer, and every swap is logged (selector, before/after, times applied);
* viewable via a new "Show everything replaced so far" userscript menu command.
* - Added the @match lines for www.spotify.com/*account,premium,duo,student,family/*
* and payments.spotify.com/* so the spoof/blockers actually have pages to run on.
* - Added two independent userscript-manager menu toggles (via
* GM_registerMenuCommand + GM_setValue/GM_getValue), since the spoof
* behaves differently depending on which site it's touching:
* 1. "Visual Premium Spoof (open.spotify.com)" - the in-player text/badge
*    relabeling and the account widgets that render inside the web player.
* HOW DOES IT WORK: Ad-slot removal MutationObserver (ordinary ad-banner DOM removal, same idea as a standard ad-blocker filter;
* can't touch anything server-enforced), scoped to open.spotify.com)
* 2. "Visual Premium Spoof (www.spotify.com)" - the account site
*    (spotify.com /premium, /duo, /student, /family, purchase pages) and the payments.spotify.com blockers/redirects
* HOW DOES IT WORK: Text nodes are taken over by overlays that affirm you do not need Premium.
* Each toggle is independent, persists via GM storage, and reloads the page to apply. Both toggles are enabled by default.
*
* Newly added (v6.7):
* a) Rewrote AutoCloseLibrary: closing the library (whether by clicking a
* playlist while it's open, or via the toggle itself) now does a real
* click on Spotify's own open/close button instead of forcing 48x48 CSS
* onto the sidebar. Spotify collapses its own layout properly as a
* result, instead of the old glitched, overlapping cluster of header
* icons squashed into a tiny box. All button wiring (manual clicks, the
* auto-close-on-playlist trigger, and the new bottom nav's Library tab
* below) is centralized through one shared function with a guard that
* survives Spotify re-rendering the button, so the toggle can't end up
* with duplicate click listeners double-firing on a single tap.
* b) Added a fixed Home/Search/Library bottom nav bar (#sp-bottom-nav),
* ported from kitbodega/SpotiKit's mobile layout:
* - Home/Search tabs navigate via history.pushState; Library performs
*  the same real click as (a) on Spotify's native toggle.
* - The now-playing player sits fixed just above the nav (bottom:56px);
*  AMOLED colors and control layout/scaling are unchanged. #main-view
*  is clipped into a flex column whose height tracks the player's
*  live-measured height via ResizeObserver, so scrollable content
*  never runs behind the player or nav.
* - The native sidebar (#Desktop_LeftSidebar_Id) is hidden by default
*  and only appears - as the same fullscreen overlay switchLs() already
*  builds - while the library is open. A one-time invisible prewarm
*  expand/collapse cycle on load keeps its virtualized list from
*  measuring itself as zero-size on first real open.
* - Library-open state persists across in-app navigation for the
*  current page load (cleared on a fresh load), and auto-closes if you
*  switch to Home/Search while it's open.
* - The native top header (home icon, bell, upgrade button, profile
*  menu, search input) is hidden by default and only shown while the
*  bottom nav's Search tab is active.
* c) Added a custom Now Playing view button (next to the lyrics button in
* the player bar, styled to match Spotify's own button classes) since
* Spotify's native NPV toggle is unreliable/often missing. Only clicks
* through this button, or the player-bar album art (see (e) below), are
* allowed to open the Now Playing view - a MutationObserver auto-closes
* it any other time it becomes visible (Spotify itself, another script,
* or already open on page load), so it can't pop open on its own.
* d) The internal SPFDBG console logging used throughout this script is now
* gated behind its own "Debug Logging (console)" userscript-manager menu
* toggle (off by default), instead of always printing, so an ordinary
* user's console doesn't fill up with click-by-click state logs.
* e) Fixed the player-bar album art click (Spotify's own native way to open
* the Now Playing view) getting immediately undone by the (c) guard,
* which only trusted opens made through npBtn - so clicking the album art
* looked like it did nothing. It's now a second authorized opener: a
* listener on the album art marks the click as authorized right as it
* happens, before Spotify's own click handling runs, so the guard leaves
* it alone and the album art opens/closes the Now Playing view natively,
* as instantly as npBtn.
* f) Hid the native miniplayer/PiP toggle button (button[data-testid=pip-toggle-button],
* via the existing hidden-elements CSS rule.
*
* Newly added (v6.8) - Attempted fix for Queue / Connect to a Device buttons
* not opening - NOT the actual fix, see v6.9 below
* - #Desktop_PanelContainer_Id (the right-side panel) is shared by Now
* Playing view, Queue, and Connect to a Device - all three flip the same
* aria-hidden flag when opened. The (v6.7c) NPV guard's isNpvOpen() only
* checked that shared flag, so it couldn't tell NPV apart from Queue/
* Devices - meaning it would sometimes auto-close Queue or Devices right
* after they opened, thinking it was an unauthorized NPV open. Whether it
* misfired depended on stale guard state left over from an earlier NPV
* open, which is why it looked intermittent (broken, then fine after some
* navigating around). This attempt tried to fix it by checking for
* panelContainer.querySelector('[aria-label="Now playing view"], .NowPlayingView')
* inside the panel - but that marker turned out to be on the panel
* container itself, not a descendant, so querySelector never matched.
* Net effect: isNpvOpen() always returned false and the guard stopped
* doing anything at all, letting NPV pop open unguarded. Superseded by
* v6.9.
*
* Newly added (v6.9 and v7.0) - Actual fix for the v6.8 regression above
* a) Checked the real live markup: #Desktop_PanelContainer_Id (the <aside>
* itself) carries aria-label="Now playing view" plus a .NowPlayingView
* class when showing NPV; aria-label="Queue" for Queue; and
* aria-label="Connect to a device" for the device picker - all three as
* attributes/classes on the container element itself, not on any child.
* isNpvOpen() now checks panelContainer.getAttribute('aria-label') and
* panelContainer.classList directly instead of querySelector-ing into it,
* so it correctly identifies NPV vs Queue vs Devices and the guard only
* ever acts on genuine unauthorized NPV opens.
* b) Debug logging coverage completed
* - Added dbg() calls to the functions that didn't have them yet:
* logChange, applyReplacements, scanText, runPremium's DOM-scanning pass,
* handlePremiumMutations/startPremiumObserver (the debounce),
* forceEnglish, forceEnglishAccountSetting, applyEnglishToLanguageSelect,
* and the ad-slot-removal observer.
* - forceEnglish/forceEnglishAccountSetting/applyEnglishToLanguageSelect
* used to trace via plain console.log('Spotifuck: ...') instead of
* dbg() - refactored those into dbg() so they're gated behind the same
* toggle and filterable by "SPFDBG" like everything else.
*
* Newly added (v7.1) - Ported region/English-forcing fixes from SpotiwebJS.js:
* a) forceEnglish()'s www.spotify.com redirect was still the old bare-code-only
* check (an ENGLISH_REGIONS allowlist matching /us/, /gb/, etc.) with no
* understanding of Spotify's actual dash-suffixed URLs (/si-sl/, /de-en/,
* /hk-zh/, etc.) - meaning most non-English regions were silently never
* redirected at all. Replaced with SpotiwebJS's verified region data:
* NO_ENGLISH_VARIANT (9 countries with no English storefront at all, dash
* or bare: ad, be, cd, ch, dz, es, lu, ma, tn), ENGLISH_IS_BARE (2
* countries where the BARE code is the English one, not "-en": ba, mk),
* and ENGLISH_BARE_CODES (42 bare-only countries confirmed English) - all
* hand-verified against Spotify's real /select-your-country-region/
* listing (2026-07-14, 184 countries). forceEnglish() now correctly
* redirects any non-English xx-yy URL to its English variant using this
* data instead of a 6-country allowlist.
* b) Added getCurrentRegionPrefix(), also ported from SpotiwebJS, so the
* Edit profile / Payment method banner buttons build their
* www.spotify.com/account/... URL from the current region instead of
* hardcoding /us/account/... regardless of the account's actual locale.
* c) The www.spotify.com region-path redirect in forceEnglish() now also
* checks premiumSpoofEnabledHere() and no-ops (with a dbg() log) when
* "Visual Premium Spoof (www.spotify.com)" is off, instead of running
* unconditionally regardless of that toggle.
* d) forceEnglishAccountSetting() was being called unconditionally at the
* bottom of forceEnglish() - it fired on every matched host, including
* www.spotify.com and payments.spotify.com, where its hidden iframe
* (hardcoded to https://open.spotify.com/preferences) is cross-origin and
* can never succeed, silently wasting an iframe load every page load on
* those two hosts. Now gated behind `if (HOST_IS_OPEN)`, with the skip
* logged via dbg() on the other two hosts.
* e) dbg() coverage: the two "Visual Premium Spoof" GM_registerMenuCommand
* toggles (open.spotify.com / www.spotify.com) flipped a persisted flag
* and reloaded but never logged the toggle itself - the one
* user-triggered write in the whole script with zero trace, including on
* www.spotify.com. Added dbg() calls logging from/to state before reload
* for both.
* f) add-new-card-button (on the "Add new card"/payment method flow) also
* appears on www.spotify.com's own account pages
* (/account/payment-methods/, aliased to/from
* /account/saved-payment-cards/), entirely separate from
* payments.spotify.com (the actual checkout flow already blocked via the
* payments-page blocker). That blocker is gated to
* window.location.hostname === 'payments.spotify.com', so it never ran on
* www.spotify.com at all. Added a second, narrower blocker scoped to
* HOST_IS_WWW: no overlay (this is account management, not checkout),
* just the same preventDefault/stopPropagation no-op on the button, gated
* behind premiumSpoofEnabledHere() like everything else scoped to that
* host. Also added the same button as an exact-match selector to the
* payments.spotify.com blocker itself (data-testid="add-new-card-button"
* contains neither "pay" nor "checkout", so the existing substring
* selectors never matched it there either).
* g) setupNpvButton/setupNpvWidgetTrigger/setupOtherPanelTriggers were only
* ever called twice total (once immediately, once via a fixed 2s
* setTimeout) inside addCSSJSHack() - which itself only runs once
* (ffDone latches true after the first pBtn found). firstFuck's own
* indefinite pfint polling doesn't cover this gap: it keeps retrying
* forever, but only for the play button, so once that's found these
* three never get another chance. On a slow/cold SPA load where the
* lyrics button or the player-bar album art render later than 2s (the
* same class of delay pfint's own indefinite polling exists to handle
* for the play button), they'd silently never get wired at all. Ported
* SpotiwebJS's npvSetupInterval pattern instead: these three now get
* their own indefinite setInterval(1000) that keeps retrying until both
* .npbtn and .fuckd-npv-art are confirmed present, then stops - matching
* SpotiwebJS exactly, including the same reason their "target not found
* yet" early returns still deliberately don't log through dbg() (a
* genuine continuous 1s poll now exists here too, so logging every
* missed tick would spam the console the whole time these are loading).
* The other six functions in addCSSJSHack (library button/grid, home,
* search, user button, NPV-bar height sync) keep their existing
* immediate + single 2s retry - untouched, out of scope here.
*
* Audited every other button/redirect for a similar hardcoded-locale or
* missing-toggle-gate issue (this file and SpotiwebJS.user.js) - the two
* banner buttons in (b) were the only other hardcoded-region spots found;
* everything else either has no locale in its URL (e.g. the bare
* https://www.spotify.com/ / https://open.spotify.com/ links, which rely on
* Spotify's own geo-redirect) or was already using getCurrentRegionPrefix()/
* the toggle correctly.
*
* Newly added (v7.2) - A feature I later scrapped (ignore)
*
* Newly added (v7.3):
* - Re-checked every GM_registerMenuCommand callback and click handler
* against the v6.9/v7.0 (b) coverage claims. Found two real gaps that
* audit missed: "Show everything replaced so far" and "Debug Logging
* (console)" themselves - the very act of printing the replacement
* log or flipping the debug flag was never logged, the same "one
* user-triggered action with zero trace" problem v7.1 (e) already
* fixed for the two Visual Premium Spoof toggles. Both now log via
* dbg() (Debug Logging's own toggle logs via a raw console.log
* matching dbg()'s exact output shape instead of dbg() itself, since
* dbg() is gated behind debugLoggingEnabled() and would otherwise
* never print the one line that announces logging just turned on).
*
* Newly added (v7.4 - 7.5):
* - Compact player mode: a thin toggle strip pinned to the top of the
* player bar collapses it down to artwork + title/artist only, ported
* from kitbodega/SpotiKit 7.3.2.fork's #sp-player-toggle/.minimized
* feature and adapted to this file's fixed full-width bottom bar layout
* (SpotiKit's own version targets a floating rounded card instead).
* State persists across reloads/sessions via GM_setValue (COMPACT_KEY),
* unlike SpotiKit's original sessionStorage-backed version.
* - Only Play/Pause and the library-action button (Add to playlist / Add
* to Liked Songs, whichever is currently showing) move into the strip.
* Play/Pause is the real full-player button, just reparented (moved, not
* cloned) - it keeps its existing click listener, icon, and aria state
* automatically, nothing extra to build or keep in sync. The
* library-action button can't be reparented the same trivial way (it's a
* React-owned node whose icon/label/color change with library state), so
* it gets a synthetic proxy in the strip instead, kept live via a
* MutationObserver on now-playing-widget so it never goes stale when the
* real button's icon changes or the underlying node itself gets replaced
* (track change, liked-state morph). NPV (npbtn), the real Queue button,
* the native Lyrics button, and Lyrics+ were moved into the strip in an
* earlier pass and then dropped from it - they now just stay hidden with
* the rest of the secondary-controls row, same as in full player.
* - Fixed a bug where the belt-and-suspenders stray-element cleanup sweep
* could mistake Spotify's own now-playing-widget wrapper for a leftover
* stray and delete it outright, taking the whole player - artwork,
* title/artist, everything - down with it. It now snapshots the
* widget's legitimate original children up front and only ever removes
* elements outside that snapshot (plus the strip itself and any
* moved/proxy element). The move-back logic got a matching guard: if a
* moved button's original parent was itself replaced by React while
* compact mode was on, it's now removed instead of left behind as an
* unpositioned stray, which was causing Play/Pause to render twice.
* - Compact mode grew its own thin, still-draggable scrubber pinned near
* the bottom of the 64px strip - the real progress-bar/playback-progress
* elements are unhidden and restyled in place rather than moved, the
* same "leave the real interactive DOM alone, just recolor/reposition
* around it" approach used everywhere else in compact mode. It sits 4px
* off the very bottom edge rather than flush, so the seek-position thumb
* doesn't get clipped when it grows larger on hover/highlight.
* - The compact player bar no longer caps its own total height to 64px.
* That cap used to squash the green "Playing on X device" Spotify
* Connect banner into that same fixed space whenever it was showing,
* instead of letting it sit above the compact row the way it already
* does in full player. The bar is simply position:fixed with a bottom
* offset and grows upward with its content now, same as full player.
* - Freeing up 3 of the 5 original compact-strip slots also let the
* widget row's reserved right-side padding shrink drastically, fixing
* the artist/album marquee text collapsing to near-zero width on narrow
* mobile viewports (not actually a mobile-specific bug - just not
* enough room left once padding was accounted for).
* - The "Switch to video" row (+ its bullet separator) Spotify shows
* under title/artist for tracks with a music video is now hidden in
* both compact AND full player - previously it was only hidden in
* compact mode, as a layout fix (the 64px compact row was only budgeted
* for two rows, title and artist). Targeted via the stable aria-label
* rather than the hashed wrapper class, since that's the only part of
* this row guaranteed not to change across Spotify builds.
* - setupCompactToggle() and its restore-on-load retry got folded into
* the same indefinite 1s poll (npvSetupInterval) already used for the
* three NPV-related setup functions, so a slow/cold load can't miss
* wiring compact mode the same way it could already miss wiring those.
* Same reasoning as before for not logging every "not found yet" tick
* through dbg() - it's a genuine continuous 1s poll, so logging every
* miss would spam the console the whole time these are loading. dbg()
* coverage was checked against every function touched by this change;
* logging was added at each meaningful state transition (entering/
* exiting compact mode, the strip first being inserted) - the same
* poll-tick exclusion as the existing three NPV functions was extended
* to this feature's own setup/restore calls for the same reason, and
* pure internal helpers with no state transition of their own (moving a
* node, syncing the proxy's attributes, etc.) weren't given their own
* dbg() calls, consistent with how sub-helpers elsewhere in the file
* (e.g. inside applyEnglishToLanguageSelect) are handled.
*
* Fixed (v7.6):
* - Script was breaking completely for anyone who turned on Violentmonkey's
* "allow user scripts" permission (Chrome/Quetta requires this now). That
* setting makes the script run at the true start of the page load, before
* Spotify has even created the <body> element yet. One of the very first
* things the script does is start watching <body> for changes (the Now
* Playing view guard), and watching something that doesn't exist yet threw
* an error - which, because of how the script is structured, silently
* stopped everything else below it from running too. That's why only the
* two "Visual Premium Spoof" menu items kept showing up (they're registered
* near the top, before the crash) while "Show everything replaced" and
* "Debug Logging" disappeared from the menu entirely (they're registered
* near the bottom, after it). Fixed by making the script wait for <body>
* to actually exist before it tries to watch it, instead of assuming it's
* already there. No effect on setups where this wasn't happening - it only
* adds a quick check before doing what it already did.
*
* Fixed (v7.7):
* - v7.6 fixed the script crashing on <body> not existing yet, but that
* fix uncovered a second, near-identical crash one step later: the
* function that injects all of the script's CSS (injectCSS) adds its
* <style> tags directly into <head>, and with the same "allow user
* scripts" timing as before, <head> can not exist yet either at the
* moment this runs. So it crashed the same way - one appendChild call
* failing and silently cancelling everything scheduled to run after it
* (the play/pause button hookup, the bottom nav bar, the "Ready" message
* never even printing). Fixed the same way as v7.6: the script now
* waits for <head> to exist before injecting its CSS, instead of
* assuming it's already there. Unlike waiting for <body> (which can take
* a moment), <head> normally appears within a millisecond or two of the
* page starting to load, so this doesn't introduce any visible delay or
* flash of unstyled Spotify UI before the script's CSS kicks in.
*
* Fixed (v7.8):
* - www.spotify.com was only matched on five narrow paths (* /account/*,
* * /premium/*, * /duo/*, * /student/*, * /family/*). Since www.spotify.com routes
* client-side (pushState, no full reload), landing anywhere else first (e.g.
* the homepage) meant the script never got injected at all, even after
* navigating into a matched path. Fixed by matching the whole www.spotify.com
* origin. payments.spotify.com already matched its whole origin and is only
* ever reached via a real (non-SPA) navigation, so it didn't have this bug -
* left as-is aside from the @match style pass below.
* - Side effect: the premium-spoof text/badge replacements and forceEnglish()'s
* region redirect now also run on other www.spotify.com pages, not just the
* original five.
* - All three @match lines now use *:// instead of a mix of *:// and https://,
* purely cosmetic (Spotify enforces HTTPS on all three anyway).
*
* Fixed (v7.9):
* - Fixed the v7.8 changelog note (it literally spelled out the match patters, causing
* causing the * / that were written together to close the comment block early).
* - The syntax error breaking the script is no more.
*
* Newly added (v7.10):
* - updateNPBarHeightVar() (already firing off the player's ResizeObserver + a window
* resize listener) now also publishes window.__spReservedInsets = { bottom: 56 +
* player.offsetHeight }, and fires a sp-reserved-insets-change event whenever that
* value actually changes.
* - This lets other userscripts running alongside Spotifuck - currently Lyrics+
* (pip-gui-stable) - find out how much space the bottom nav/player strip is taking
* up on mobile, so their own floating UI can stop short of it instead of being
* dragged, resized, or restored underneath it.
*
* Fixed (v7.11):
* - forceEnglish()'s /intl-xx/ URL correction and account-setting flip
* (forceEnglishAccountSetting()) used to run immediately at document-start,
* before Spotify's own SPA had even started hydrating. A user reported
* open.spotify.com getting permanently stuck never finishing its initial
* load with the script enabled; disabling the script, letting the page load
* fully, manually setting the account language to English, then re-enabling
* fixed it for them - consistent with the location.replace() call inside
* forceEnglish() racing Spotify's own startup rather than a logic bug in the
* correction itself. That work now lives in a new function,
* runIntlCorrectionOnceReady(), which waits for
* [data-testid="control-button-playpause"] to exist (the persistent
* player-bar's play/pause button, present as soon as the app shell mounts,
* even before anything is playing, and not localized like its aria-label
* is) and only then runs the correction, exactly once. navigator.language
* spoofing and the separate www.spotify.com region-path redirect are
* untouched and still run immediately at document-start as before.
* - What runIntlCorrectionOnceReady() actually does on a mismatched
* /intl-xx/ load: the page still renders in the account's saved language for
* a moment (unavoidable - we can't know whether the account setting needs
* flipping without checking it first, via a hidden /preferences iframe,
* which takes a moment). Previously that check was preceded by a separate,
* usually pointless location.replace() that stripped the /intl-xx/ prefix
* from the URL before the check even started - pointless because if the
* account setting really was still non-English, the server just redirected
* straight back to /intl-xx/ on the very next load anyway, wasting a
* navigation. That strip is gone now; the script goes straight to the
* account-setting check via forceEnglishAccountSetting(), which takes the
* /intl-xx/-stripped target path as a new optional parameter. Whatever that
* check decides to do next - flip the setting and verify, or just confirm
* it's already English, or give up because the check itself failed - it now
* navigates straight to the stripped target path in a single
* location.replace(), instead of reloading back onto the still-prefixed
* /intl-xx/ URL and relying on a later load to strip it. Net effect: one
* navigation off /intl-xx/ instead of two, and the page is never left stuck
* on /intl-xx/ even in the failure cases.
*
* Fixed (v7.12):
* - __spReservedInsets (added in v7.10 so Lyrics+'s PiP popup could stay off the reserved
* bottom nav/player strip) never actually reached Lyrics+ - this script and Lyrics+'s
* pip-gui-stable both use @grant, which puts each userscript in its own sandboxed JS
* context under Tampermonkey/Violentmonkey. Plain `window` is a per-script object there,
* not the real shared page global, so assigning window.__spReservedInsets here only ever
* set it in this script's own sandbox. Lyrics+ confirmed via its own diagnostic logging
* that it always read reserved height as 0/undefined, on every resize, with no exceptions.
* Fix: updateNPBarHeightVar() now reads/writes __spReservedInsets and dispatches
* sp-reserved-insets-change through unsafeWindow (the real page global both sandboxes
* wrap) instead of window, falling back to window if unsafeWindow isn't exposed.
* - __spReservedInsets also used to only ever expose the combined nav+player height
* (`bottom`). Lyrics+'s PiP popup read that single value for its drag/resize/restore
* clamp, so in practice it could never be dragged or resized down past the *top of the
* player* - the clamp was reserving the player's own height as off-limits too, not just
* the fixed bottom nav bar underneath it. updateNPBarHeightVar() now also publishes
* `bottomNav` (just the fixed 56px nav bar, with the player's height excluded) alongside
* the existing combined `bottom`, which is untouched, in case anything still wants the
* old combined figure. The --sp-np-bar-height CSS var and the 56px nav height math are
* otherwise untouched by any of this - only the object/event this script's write side
* goes through, and what it exposes, changed.
* - Companion fix required on Lyrics+'s side (pip-gui-stable / v17.49): it needs the
* matching change on its read side too - reading through unsafeWindow, and preferring
* `bottomNav` over `bottom` when both are present so the popup can be dragged/resized/
* restored right over the player, with only the bottom nav bar itself staying
* permanently off-limits - or none of this does anything on its own.
*
* Fixed (v7.13):
* - Compact player row grown 64px -> 68px. The scrubber (seekbar) had already been
* shifted from bottom:0 to bottom:4px (to stop its enlarged hover/highlight
* thumb from getting clipped by the row's own overflow:hidden), but the row's
* height and padding-bottom were never updated to match, so that 4px shift
* just ate 4px of dead space at the very bottom of the row instead of
* actually making room. Row padding-bottom moved 6px -> 10px (still exactly
* matching the scrubber's own bottom:4px + height:6px = 10px, same flush
* fit as the original 0px/6px pairing), and the Play/Pause + library-action
* buttons' top offset moved 32px -> 34px (half of the new 68px, same as
* before) so they stay centered on the row. This is a visual-only fit fix -
* sp-np-bar-height keeps working unmodified since it reads the row's live
* offsetHeight rather than a hardcoded figure.
*
* Fixed (v7.14):
* - Signed-out users got #spf-compact-toggle appended to the sign-up
* prompt, and tapping it exposed the real play/pause button
* (#spf-compact-play) on top of it. Cause: Spotify renders the sign-up
* prompt inside the exact same aside[data-testid=now-playing-bar] element
* as the real player, with no separate class/attribute to tell them apart,
* so setupCompactToggle() - which appends the toggle to that aside -
* matched the sign-up prompt's copy too and moveOut() relocated the
* (normally hidden there) play/pause button on tap. That same exposed
* button is also what runIntlCorrectionOnceReady() watches for before
* running its English-language/URL correction, so it was firing that
* reload for signed-out users too. Fixed both at once: setupCompactToggle()
* now checks for div[data-testid=signup-bar] and skips appending the
* toggle when it's present, and runIntlCorrectionOnceReady() now also
* gates directly on [data-testid="signup-bar"] instead of only on the
* play/pause button.
*
* Fixed (v7.15):
* a) findLibActionBtn() (the compact-mode library-action proxy, added in
* v7.5) only ever matched "Add to playlist" or "Add to Liked Songs" - both
* song-only labels. Playing a podcast episode meant this selector matched
* nothing at all, so ensureLibActionProxy() silently returned null and
* compact mode had no library-action slot whatsoever while playing a
* podcast - not a wrong button, no button. Added the podcast equivalent,
* button[aria-label="Add to Your Episodes"], as a third option in the
* selector, so the proxy now covers all three real buttons this slot can
* ever actually be.
* b) Compact mode for podcast episodes was leaving the entire secondary-
* controls wrapper (Queue/Connect/Volume/PiP/Fullscreen) visible, which
* also squeezed the title/author text down to an unreadably small width
* alongside it. The CSS rule that hides that wrapper in compact mode
* (added in v7.5) was anchored only on data-testid="lyrics-button" being
* present inside it - a deliberate choice at the time (always present for
* songs, unlike lyrics-plus-btn, which only exists if that separate
* userscript is installed), but podcast episodes have no lyrics button at
* all, so the rule never matched on a podcast in the first place. Widened
* the same :has() selector to also match on the Queue button
* (data-testid="control-button-queue") or Connect button
* (aria-label="Connect to a device") - both present regardless of track
* type - so it now correctly collapses the wrapper away for podcasts too,
* same as it already did for songs.
*
* Fixed (v7.16):
* findLibActionBtn() (the compact-mode library-action proxy) matched exactly three
* aria-labels: "Add to playlist", "Add to Liked Songs", "Add to Your Episodes" - all
* song/podcast states, but not a Smart Shuffle recommended song, where the same slot
* instead renders "Remove recommendation" next to an add-button labeled "Add to
* <playlist name>" - the destination playlist's own name, not fixed Spotify UI text,
* so it never matched any of the three exact strings. ensureLibActionProxy() found
* nothing and returned null, so no proxy was created - nothing got pulled out of
* now-playing-widget's last child before the compact CSS rule (v7.5) hid that whole
* wrapper, taking the library-action button down with it instead of surfacing it in
* the compact strip like every other track state. All four labels this slot can ever
* render - the three known ones plus every "Add to <playlist>" variant - share the
* same "Add to " prefix, so the three exact-match selectors in findLibActionBtn() are
* now one attribute-prefix selector, button[aria-label^="Add to "], scoped to
* now-playing-widget. Matches every case the old selector did plus any playlist
* Smart Shuffle recommends into, current or future, without hardcoding a name.
* "Remove recommendation" doesn't start with "Add to " so it's untouched by this -
* still hidden by the same blanket compact-mode rule, not proxied out, on purpose.
*
* RESOLVED (v7.17) - Smart Shuffle badge (data-testid="enhance-badge") now
* renders at full native size, correctly paired with the artist row, and
* precisely, visibly aligned against it, in both compact and full player:
* a) v7.16's "Switch to video" hiding rule targeted the badge's whole outer
*    wrapper (jEiAs1et4fAU3chW) via an aria-label descendant match, but that
*    wrapper also carries the badge svg as a SIBLING of the video-switch
*    block, not its parent - so on any track with a music video, hiding the
*    wrapper silently took the badge down too. The rule now reaches one
*    level deeper, into the video-switch block's own inner wrapper, so only
*    that block (and its bullet separator) is hidden and the badge renders
*    regardless of whether a video exists.
* b) In compact mode, v7.16's badge/artist container relied on Spotify's own
*    unconditional display:flex plus a compact-only flex-direction:column,
*    stacking title/badge/artist into three separate rows instead of
*    native's own 2-row grid pairing (title alone on row 1; badge and artist
*    sharing row 2). The container is now that same 2-row grid, with the
*    badge's column pinned to a fixed, non-shrinkable 12px - v7.16 sized it
*    auto, which compressed to 8px and visibly squashed the icon once
*    compact's tight ~60px of available width ran out. Tracks with no badge
*    at all (not Smart Shuffle-recommended) still kept that column and its
*    gap reserved in v7.16, pushing the artist text further right than
*    necessary; a pair of :has()-scoped rules now collapse both to 0, in
*    both modes, whenever no badge is present.
* c) v7.16 gave the badge no vertical-alignment correction at all - native
*    Spotify centers it against [data-testid="context-item-info-subtitles"]'s
*    own box rather than the artist text actually inside it, and subtitles
*    renders taller than the real glyphs, landing the badge visibly low.
*    alignEnhanceBadge() now measures the live gap between the badge and
*    [data-testid="context-item-info-artist"]'s centers via
*    getBoundingClientRect() and nudges the badge by exactly that amount via
*    a JS-applied translateY(), re-measured on every track change - no px
*    offset is hardcoded, since the gap comes from Spotify's own text/
*    line-height CSS and would go stale if that ever changes. That nudge is
*    kept fully visible by exempting only the badge's own wrapper - via a
*    :has(svg[data-testid="enhance-badge"]) rule - from a separate, blanket
*    compact-mode rule that otherwise ellipsis-truncates the title/artist
*    TEXT rows via overflow:hidden; every other row keeps truncating exactly
*    as before.
* d) Added a compact-mode proxy for "Remove recommendation" - Smart
*    Shuffle-only, matched purely by its own aria-label like the existing
*    "Add to " proxy, positioned from a live
*    getBoundingClientRect() measurement of the real button's on-screen gap
*    rather than a guessed static px value. v7.16 left this button
*    unproxied entirely, so it simply vanished under the blanket compact-
*    mode hide rule along with the rest of the buttons row.
*
* RESOLVED (v7.18) - Now Playing View's guard system ported over to full
* parity with SpotiwebJS's Sixteenth-Eighteenth changes, fixing gaps that
* only ever surfaced once Queue or Connect (not NPV) was the panel actually
* in play, plus giving npBtn a working visual "is NPV open" indicator for
* the first time:
* a) Queue and Connect used to get a second-class version of the guard - a
*    time-boxed otherPanelOpening flag that expired on a fixed 500ms timer
*    instead of on a confirmed close. Since npvGuardObserver's
*    childList/subtree observation keeps firing on unrelated DOM churn for
*    as long as Spotify's app keeps mutating - Connect's device-discovery
*    mount is the slowest of the three to settle - any callback landing
*    after the 500ms window had already expired found no record that the
*    open was authorized and closed it: exactly the "unauthorized native
*    open" case the guard exists to catch, just triggered by our own flag
*    lapsing rather than an actual stray toggle. userOpenedQueue and
*    userOpenedConnect are now full authorized-opener flags, set/cleared
*    only via the new setAuthorizedPanel(), which persist until a real
*    close is confirmed, no timer involved - structurally identical to how
*    userOpenedNPV already worked. isAnyPanelAuthorized() (true if any of
*    the three is set) and isAnyPanelOpen() (read off the shared panel's
*    [inert] attribute, which all three panel types flip identically)
*    replace label-matching as what the guard (renamed panelGuardObserver)
*    actually gates its close decision on, since the shared panel
*    container can still read Spotify's generic "Now playing view" default
*    aria-label for the very first tick after Queue or Connect opens,
*    before settling to the real value - checking that label on that tick
*    would misread a legitimate Queue/Connect open as an unauthorized NPV
*    open.
* b) The CSS block that hides Spotify's native NPV toggle by squeezing
*    #main-view's dock region to zero and force-expanding the freed space
*    to 100vw runs completely unscoped, same as it always has here -
*    SpotiwebJS scopes its equivalent behind html:not(.npv-open) to avoid
*    forcing that 100vw width while a panel is genuinely open, but on
*    mobile that width:100vw is exactly what makes NPV/Queue/Connect take
*    over the whole viewport instead of docking at their native
*    sidebar-panel size, so it's kept unscoped on purpose. (It was briefly
*    scoped behind html:not(.fuckd-panel-open) during this rewrite - a
*    class isAnyPanelOpen()/updateNpvLayoutState() still keep in sync with
*    whether any of the three panels is genuinely open, in case something
*    else needs it - but that regressed NPV/Queue/Connect back to their
*    docked native width the moment they opened, so the CSS block itself
*    was reverted to unscoped; only the JS class-tracking stayed.)
* c) Closing the panel via its own in-panel X button - Spotify's native
*    close control - never ran through closeNowPlay(), the only place that
*    used to clear the authorized flags, so the panel closed for real but
*    the guard kept believing it was still authorized; every later
*    unrelated native open (another playlist's play button, playing a
*    search result) was then wrongly trusted and never auto-closed.
*    panelGuardObserver now also detects the close side reactively: a
*    lastPanelOpen flag tracks isAnyPanelOpen()'s value across callbacks,
*    and only a genuine open-to-closed transition (panel now reads closed,
*    lastPanelOpen was true, an authorized flag is still true) clears the
*    flags - distinguishing a real X-button close from the ordinary tick
*    or two between an authorized click and Spotify's own opening
*    transition, which briefly look the same but aren't.
* d) On a cold page load, the first native click on the Queue or Connect
*    button could still get auto-closed because npvSetupInterval's polling
*    loop stopped as soon as npBtn and the album-art listener were wired,
*    without waiting for setupOtherPanelTriggers() to actually find and
*    attach capture-phase listeners to the Queue/Connect buttons - those
*    two can take longer to become reliably queryable than the player-bar
*    elements the poll was checking. The clear condition now also requires
*    both buttons' listeners to be attached before stopping, alongside
*    this file's own compact-mode stop conditions.
* e) npBtn now reliably shows a green "active" look - icon color plus a
*    small bottom dot - whenever NPV specifically is genuinely open, and
*    only then; previously it never visually reflected NPV state at all.
*    syncNpBtnVisualState() toggles a self-owned .active class on npBtn
*    based on userOpenedNPV (not isNpvOpen(), for the same stale-label
*    reason as (a) above), kept in sync by the same panelGuardObserver
*    callback that drives everything else. The .active look is styled
*    entirely by this script's own CSS, pinned with !important, rather
*    than left to whatever hashed Encore classes happen to be riding along
*    on npBtn from its one-time clone of the lyrics button - those classes
*    are Spotify's own internal build output and can be renamed on any
*    deploy, and if npBtn happened to be cloned at the exact moment the
*    lyrics button was transiently carrying Spotify's own "open" state
*    classes (a hydration race), Spotify's stylesheet would style npBtn
*    off of that instead of anything this script controls. The only state
*    a leaked class can ever contradict is the resting one - if NPV
*    genuinely was open at clone time, a leaked class and a later .active
*    toggle both agree the dot should be green rather than fighting over
*    it - so only `.npbtn:not(.active)` needs the !important override.
*
* RESOLVED (v7.18.c) - forceEnglish() now skips entirely when running
* inside the Spotify Web wrapper app, rather than always running alongside
* that app's own native locale force:
* The app's item 22 added Locale.setDefault(new Locale("en")) to its
* MainActivity's onCreate()/onResume(), which makes Chromium WebView derive
* Accept-Language: en for every request it makes (main frame, iframes,
* XHR/fetch, all of it) at the HTTP layer - including the hidden
* open.spotify.com/preferences iframe forceEnglishAccountSetting() creates,
* whose false "not English" read (caused by WebViewClient's onPageFinished/
* onPageStarted firing main-frame-only, per Android's own docs, so this
* script's own navigator.language spoof never reached that iframe) was the
* actual source of the reload-on-login bug this script's own account-
* setting-flip retry logic exists to work around. That native fix
* structurally can't be affected by injection frame-scope at all, since
* it's applied at WebView creation time, before any page - main or iframe -
* even starts loading.
* window.AndBridge only ever exists inside this app's WebView
* (addJavascriptInterface-only, never present in a real browser or
* userscript-manager context), so its presence is a reliable "the native
* fix is active" signal. forceEnglish() now checks for it first and returns
* immediately if found - skipping the navigator.language/languages spoof,
* the www.spotify.com region-path redirect, and the account-setting flip
* together, rather than just the specific flip that was confirmed broken.
* navigator.language isn't separately confirmed redundant here (the item 22
* investigation specifically tested Accept-Language, not this property),
* but Chromium's per-request Accept-Language and navigator.language both
* derive from the same embedder-supplied locale list, so this trusts the
* native fix to cover it too rather than running a second, JS-layer spoof
* alongside it indefinitely.
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
    // this to false on every close, and panelGuardObserver (renamed from npvGuardObserver once
    // it grew to cover Queue/Connect too - see below) auto-closes the panel any time it becomes
    // visible while none of the three flags below is set - i.e. NPV can only ever be opened via
    // one of those two authorized paths, never via the unreliable native toggle button
    // (unreliable/often absent - see clickNP) or programmatically by anything else.
    //
    // Queue and Connect are full authorized-opener types, structurally identical to NPV, rather
    // than the old time-boxed otherPanelOpening flag that used to cover them: a fixed timer
    // window has no way to know whether the panel had actually finished opening by the time it
    // expired - Connect's device-discovery mount in particular can keep mutating the DOM well
    // past a short window - and once the timer lapsed mid-mutation the guard had no record the
    // open was authorized and closed it anyway, exactly the "unauthorized native open" case it
    // exists to catch, just triggered by our own flag lapsing rather than by a real stray
    // toggle. userOpenedQueue/userOpenedConnect instead persist until a real close is confirmed
    // (closeNowPlay() below clears all three together via setAuthorizedPanel(null)), no timer
    // involved.
    let userOpenedQueue = false;
    let userOpenedConnect = false;
    // setAuthorizedPanel() is the single place that sets/clears all three flags - every trigger
    // (npBtn, album art, Queue button, Connect button) calls it with the panel it's about to
    // open, or null if this click is closing whichever one is currently open, so at most one of
    // the three is ever true at once, mirroring the "only one of NPV/Queue/Connect can be
    // genuinely open at a time" invariant of the shared panel container itself. Called
    // synchronously, before Spotify's own click handling runs (same "beat the mutation
    // microtask" timing clickNP() already needed - see its own comment), it also flips
    // .fuckd-panel-open on immediately when opening, rather than waiting for
    // panelGuardObserver's mutation callback to react after the fact - that class drives the
    // native-toggle-hiding CSS squeeze (see injectCSS below), and reacting to the mutation alone
    // would leave a real window, while Spotify is actively mounting the panel into the shared
    // slot, where that squeeze stays armed and crushes the panel Spotify is trying to show.
    function setAuthorizedPanel(which) { // which: 'npv' | 'queue' | 'connect' | null
        userOpenedNPV = which === 'npv';
        userOpenedQueue = which === 'queue';
        userOpenedConnect = which === 'connect';
        if (which) {
            document.documentElement.classList.add('fuckd-panel-open');
            dbg('[PanelGuard] setAuthorizedPanel: class forced on', 'html', { which });
        }
    }
    // True whenever ANY of the three panel types was opened through an authorized trigger and
    // hasn't been closed since. Deliberately doesn't care WHICH of the three: the shared
    // #Desktop_PanelContainer_Id's aria-label can still read Spotify's generic "Now playing
    // view" default for the very first mutation tick after Queue or Connect opens, before it
    // settles to the real "Queue"/"Connect to a device" value a moment later, so label-matching
    // isNpvOpen()/isQueueOpen()/isConnectOpen() checks are not a reliable way to ask "was THIS
    // open authorized" on that tick - only the flags themselves are.
    function isAnyPanelAuthorized() {
        return userOpenedNPV || userOpenedQueue || userOpenedConnect;
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

    // --- document-start safety: with Violentmonkey's "allow user scripts"
    // permission enabled, @run-at document-start now genuinely fires before
    // <body> is parsed (previously it didn't, so every MutationObserver.observe(
    // document.body, ...) call below was safe). Observing a null body throws
    // synchronously and - since this is all top-level code in one IIFE - kills
    // every statement after the first offender, silently dropping everything
    // from that point on (menu commands included). observeBody() defers the
    // .observe() call until <body> exists, same pattern already used by
    // applyEnglishToLanguageSelect's startObserving() above.
    function observeBody(observer, options) {
        if (document.body) {
            observer.observe(document.body, options);
        } else {
            document.addEventListener('DOMContentLoaded', () => {
                observer.observe(document.body, options);
            }, { once: true });
        }
    }

    // --- document-start safety, part 2: injectCSS() below does several
    // document.head.appendChild(...) calls, same document-start timing
    // problem as observeBody() above but for <head> instead of <body>. <head>
    // is usually the very first thing parsed, so this crashed far less often
    // than the <body> case - but "allow user scripts" can still catch it
    // before <head> exists, and injectCSS's first appendChild throwing kills
    // everything after it (firstFuck, the bottom nav init, etc.) the same
    // way the earlier crash did. Unlike waiting for <body> (which can take a
    // while and would delay CSS injection long enough to cause a visible
    // flash of unstyled content), this uses a MutationObserver on
    // <html> - which is always present at document-start - to catch the
    // instant <head> gets inserted, typically within a millisecond or two.
    function whenHeadReady(callback) {
        if (document.head) { callback(); return; }
        const root = document.documentElement;
        if (!root) {
            // Not even <html> exists yet (extremely early) - nothing to
            // attach an observer to, so just check again next frame.
            requestAnimationFrame(() => whenHeadReady(callback));
            return;
        }
        const observer = new MutationObserver(() => {
            if (document.head) {
                observer.disconnect();
                callback();
            }
        });
        observer.observe(root, { childList: true });
    }

    // --- Debug logging toggle (off by default; console.log spam would
    // otherwise fire on every click for every ordinary user) ---
    const DEBUG_KEY = 'spotifuck_debugLog';
    function debugLoggingEnabled() {
        try { return typeof GM_getValue === 'function' ? GM_getValue(DEBUG_KEY, false) : false; }
        catch (e) { return false; }
    }

    // --- Compact player toggle state (v7.4) - GM_setValue persists across
    // reloads/sessions (unlike sessionStorage, which is what SpotiKit's
    // original #sp-player-toggle used), so "last picked state" survives a
    // closed tab/browser restart too. Own helpers rather than reusing
    // getFlag/setFlag below, since those hardcode a `true` default (fine for
    // the premium-spoof flags they were built for, wrong here). ---
    const COMPACT_KEY = 'spotifuck_compactPlayer';
    function compactModeEnabled() {
        try { return typeof GM_getValue === 'function' ? GM_getValue(COMPACT_KEY, false) : false; }
        catch (e) { return false; }
    }
    function setCompactMode(val) {
        try { if (typeof GM_setValue === 'function') GM_setValue(COMPACT_KEY, val); } catch (e) {}
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
            () => {
                const next = !getFlag(SPOOF_OPEN_KEY);
                dbg('menu: Visual Premium Spoof (open.spotify.com) toggled', 'GM_registerMenuCommand', { from: getFlag(SPOOF_OPEN_KEY), to: next, action: 'reloading' });
                setFlag(SPOOF_OPEN_KEY, next);
                location.reload();
            }
        );
        GM_registerMenuCommand(
            (getFlag(SPOOF_WWW_KEY) ? '✅' : '❌') + ' Visual Premium Spoof (www.spotify.com)',
            () => {
                const next = !getFlag(SPOOF_WWW_KEY);
                dbg('menu: Visual Premium Spoof (www.spotify.com) toggled', 'GM_registerMenuCommand', { from: getFlag(SPOOF_WWW_KEY), to: next, action: 'reloading' });
                setFlag(SPOOF_WWW_KEY, next);
                location.reload();
            }
        );
    }

    // Shared between forceEnglish()'s redirect decision and
    // getCurrentRegionPrefix()'s button-URL decision, so both use the same
    // facts rather than duplicating/drifting apart.
    //
    // NO_ENGLISH_VARIANT / ENGLISH_IS_BARE: verified against Spotify's own
    // /select-your-country-region/ listing (2026-07-14) - covers countries
    // that DO have an xx-yy dash variant, where "yy=en" or "append -en"
    // isn't the right answer.
    //   - 9 have NO English variant at all, dash or bare: ad, be, cd, ch,
    //     dz, es, lu, ma, tn.
    //   - 2 have English as the BARE code, not "-en": ba, mk.
    const NO_ENGLISH_VARIANT = new Set(['ad', 'be', 'cd', 'ch', 'dz', 'es', 'lu', 'ma', 'tn']);
    const ENGLISH_IS_BARE = new Set(['ba', 'mk']);

    // ENGLISH_BARE_CODES: countries whose ONLY storefront is a bare code
    // (no dash variant exists to compare against) that is confirmed
    // English - either the region page is explicitly labelled "(English)",
    // or the country's official/majority language is verifiably English
    // (Commonwealth Caribbean, Anglophone Africa, Anglophone Oceania).
    // Deliberately excludes bare codes where the language is ambiguous or
    // unverified from the listing alone (e.g. cy, ge, am, bt, mn, la, uz,
    // al, mc, li) - those fall through to the /us fallback below rather
    // than being guessed at.
    const ENGLISH_BARE_CODES = new Set([
        'us', 'uk', 'au', 'nz', 'ie', 'mt', 'kh',
        'ag', 'bb', 'bs', 'dm', 'gd', 'gy', 'jm', 'kn', 'lc', 'tt', 'vc',
        'bw', 'gh', 'gm', 'lr', 'ls', 'mu', 'mw', 'ng', 'rw', 'sl', 'sz', 'zm', 'zw',
        'fj', 'fm', 'ki', 'mh', 'nr', 'pg', 'pw', 'sb', 'to', 'tv', 'ws',
    ]);

    /**
     * getCurrentRegionPrefix - Returns the region path segment (e.g. "us",
     * "si-en", "mk", "hk-zh") that should prefix any www.spotify.com/account
     * link we build ourselves.
     *
     * For dash-suffixed URLs (xx-yy), this trusts the current URL as-is,
     * since forceEnglish() runs at @run-at document-start and will have
     * already corrected it before this code executes.
     *
     * For bare-code URLs (xx, no suffix), forceEnglish() deliberately
     * leaves those untouched (see its comment), so a bare code in the URL
     * is NOT proof it's English - e.g. /jp/ or /de/ would reach here
     * unmodified. So this function checks the bare code against
     * ENGLISH_BARE_CODES (plain English-only countries) and ENGLISH_IS_BARE
     * (countries like "ba"/"mk" whose bare code IS the English variant,
     * distinct from their own dash variant, e.g. "ba" vs "ba-bs") - both
     * are cases forceEnglish() itself already treats as landing correctly
     * on English. Everything else (including ambiguous/unverified ones)
     * falls back to /us so the buttons always land somewhere readable
     * rather than carrying forward an unconfirmed or non-English locale.
     */
    function getCurrentRegionPrefix() {
        const m = location.pathname.match(/^\/([a-z]{2})(-[a-z]{2})?\//i);
        if (!m) return 'us';
        const country = m[1].toLowerCase();
        if (m[2]) return country + m[2].toLowerCase(); // dash variant, already corrected upstream
        // Bare path: valid if it's a plain English-only country (ENGLISH_BARE_CODES)
        // OR a country whose bare code IS the English variant, distinct from its own
        // dash variant (ENGLISH_IS_BARE, e.g. "ba" English vs "ba-bs" Bosnian) -
        // forceEnglish() redirects those countries TO their bare form precisely
        // because it's the English one, so this has to recognize it too or button
        // URLs built here would wrongly fall back to /us right after that redirect.
        return (ENGLISH_BARE_CODES.has(country) || ENGLISH_IS_BARE.has(country)) ? country : 'us';
    }

    /**
     * forceEnglish - Force the web player to render in English.
     * open.spotify.com localizes via an /intl-xx/ URL prefix.
     * www.spotify.com localizes via a region-language path segment (e.g.
     * /si-sl/, /de-en/, /hk-zh/).
     * Runs at document-start, before Spotify's own scripts get a chance to read navigator.language.
     */
    function forceEnglish() {
        // Item 22 (native app side) added Locale.setDefault(new Locale("en")) in
        // MainActivity's onCreate()/onResume(), which makes Chromium WebView derive
        // Accept-Language: en for every request (main frame, iframes, XHR/fetch, all of
        // it) at the HTTP layer - structurally covers what this whole function exists to
        // work around at the JS layer, including the account-setting iframe flip below
        // (forceEnglishAccountSetting()) that was the actual source of the reload-on-login
        // bug that native fix was built for. window.AndBridge only exists inside this
        // app's WebView (added by addJavascriptInterface, never present in a real
        // browser/userscript-manager context), so its presence is a reliable signal the
        // native fix is active. Skip everything below entirely rather than just the
        // account-setting flip - navigator.language/languages isn't separately confirmed
        // redundant, but Chromium's per-request Accept-Language and navigator.language
        // both derive from the same embedder-supplied locale list, so trusting the native
        // fix to cover it too rather than keeping a second, JS-layer spoof running
        // alongside it.
        if (window.AndBridge && typeof window.AndBridge.isLoggedIn === 'function') {
            dbg('forceEnglish: skipping entirely', 'window.AndBridge present', { reason: 'native app-layer ForceEn (item 22) already active - Accept-Language covers this at the HTTP layer' });
            return;
        }
        dbg('forceEnglish: spoofing navigator.language', 'navigator.language/languages', { value: 'en-US' });
        try {
            Object.defineProperty(navigator, 'language', { get: () => 'en-US', configurable: true });
            Object.defineProperty(navigator, 'languages', { get: () => ['en-US', 'en'], configurable: true });
        } catch (e) {}

        if (location.hostname === 'www.spotify.com') {
            // Gated behind the same www.spotify.com toggle
            // (premiumSpoofEnabledHere()) as everything else scoped to this
            // host, so turning "Visual Premium Spoof (www.spotify.com)" off
            // also stops this redirect instead of leaving it always-on.
            if (!premiumSpoofEnabledHere()) {
                dbg('forceEnglish: skipping region-path redirect', location.pathname, { reason: 'Visual Premium Spoof (www.spotify.com) is off' });
            } else {
            // Trust the language suffix when the URL has one (xx-yy, e.g.
            // /si-sl/, /de-en/, /hk-zh/) - Spotify's own site consistently
            // uses a 2-letter language code there, so `yy !== 'en'` is a
            // reliable signal regardless of which country `xx` is.
            // Bare codes (no suffix, e.g. /jp/, /de/, /us/) are left alone
            // here: whether a bare code is English-language varies country
            // by country with no clean pattern, so there's no safe way to
            // redirect the whole PAGE on those without assuming something
            // unverified. (getCurrentRegionPrefix() above handles this
            // differently for button URLs specifically, where landing
            // somewhere readable matters more than preserving locale.)
            const wm = location.pathname.match(/^\/([a-z]{2})-([a-z]{2})(\/.*)?$/i);
            if (wm) {
                const country = wm[1].toLowerCase();
                const lang = wm[2].toLowerCase();
                if (lang !== 'en') {
                    let target;
                    if (NO_ENGLISH_VARIANT.has(country)) {
                        // No English storefront exists for this country at
                        // all (dash or bare) - fall back to /us rather than
                        // leaving the user on a non-English page.
                        target = '/us' + (wm[3] || '/');
                    } else if (ENGLISH_IS_BARE.has(country)) {
                        target = '/' + country + (wm[3] || '/');
                    } else {
                        target = '/' + country + '-en' + (wm[3] || '/');
                    }
                    dbg('forceEnglish: redirecting off non-English language suffix', location.pathname, { to: target });
                    location.replace(location.origin + target + location.search + location.hash);
                    return;
                }
            }
            }
        }

        // The /intl-xx/ URL check and account-setting flip used to run right
        // here, immediately, at document-start - before Spotify's own SPA
        // had even started hydrating. A user reported open.spotify.com
        // getting permanently stuck never finishing its initial load with
        // the script enabled; disabling the script, letting the page load
        // fully, manually setting the account language to English, then
        // re-enabling fixed it for them - consistent with this code's own
        // location.replace() call racing Spotify's startup rather than a
        // logic bug in the correction itself. See
        // runIntlCorrectionOnceReady() below for the fix: it now waits for
        // the player UI to actually exist before doing any of this.
        runIntlCorrectionOnceReady();
    }

    // Guards so a MutationObserver storm (or multiple forceEnglish() calls,
    // if that ever happens) can't spawn overlapping waits or run the
    // correction more than once.
    let intlCorrectionRun = false;

    /**
     * runIntlCorrectionOnceReady - Waits for
     * [data-testid="control-button-playpause"] (present once Spotify's app
     * shell has mounted) OR [data-testid="signup-bar"] (the signed-out
     * landing/signup prompt, on its own timeline) to exist in the DOM, then
     * runs the /intl-xx/ URL correction and account-setting flip exactly
     * once. The signup-bar branch matters because that play/pause button is
     * kept hidden by Spotify on the signup prompt in full view - see v7.14 -
     * so without it, a signed-out session had no reliable trigger at all.
     * Neither data-testid is localized, unlike their aria-labels. This is
     * what forceEnglish() used to do immediately at document-start; see the
     * comment above its call to this function for why that was moved here
     * instead.
     */
    function runIntlCorrectionOnceReady() {
        if (intlCorrectionRun) return;

        const run = () => {
            if (intlCorrectionRun) return;
            intlCorrectionRun = true;

            const m = location.pathname.match(/^\/intl-([a-z]{2})(\/.*)?$/i);
            // Some account languages (e.g. Italian) get server-redirected to an
            // /intl-xx/ URL on every load; others (e.g. Slovenian) never do. The
            // real cause, when it happens, is the saved account-level language
            // setting (forceEnglishAccountSetting() below) - so rather than
            // stripping the URL as its own navigation and only falling through to
            // the account fix on a later load, the stripped target path is handed
            // straight to forceEnglishAccountSetting(). If it needs to flip the
            // setting, its own verification redirect lands directly on that
            // stripped path - one navigation does both jobs instead of two. If the
            // setting turns out to already be English (or the flip can't be
            // attempted at all), forceEnglishAccountSetting() falls back to
            // stripping the URL itself so this load still isn't left on
            // /intl-xx/.
            const onIntlPrefix = m && m[1].toLowerCase() !== 'en';
            const strippedTarget = onIntlPrefix ? (m[2] || '/') : null;

            if (HOST_IS_OPEN) {
                forceEnglishAccountSetting(strippedTarget);
            } else if (onIntlPrefix) {
                // Can't flip the account setting cross-origin from here, so the
                // cheap URL strip is the only correction available.
                dbg('forceEnglish: redirecting off /intl-xx/ prefix', location.pathname, { to: strippedTarget });
                location.replace(location.origin + strippedTarget + location.search + location.hash);
            } else {
                dbg('forceEnglish: skipping account-setting flip', 'forceEnglishAccountSetting()', { reason: 'not open.spotify.com - iframe to open.spotify.com/preferences would be cross-origin and always fail here' });
            }
        };

        if (document.querySelector('[data-testid="control-button-playpause"],[data-testid="signup-bar"]')) {
            run();
            return;
        }

        const observer = new MutationObserver(() => {
            if (document.querySelector('[data-testid="control-button-playpause"],[data-testid="signup-bar"]')) {
                observer.disconnect();
                run();
            }
        });
        const startObserving = () => observer.observe(document.body, { childList: true, subtree: true });
        if (document.body) {
            startObserving();
        } else {
            // document-start - <body> hasn't been parsed yet.
            document.addEventListener('DOMContentLoaded', startObserving, { once: true });
        }
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
    function forceEnglishAccountSetting(stripTarget = null) {
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

        // When called from an /intl-xx/ URL, stripTarget is the path we'd land
        // on with that prefix removed. Any navigation this function makes below
        // (the verify-reload after a flip, or the fallback strip when no flip
        // was possible) goes to this URL instead of a bare reload, so the
        // /intl-xx/ correction and the account-setting fix collapse into a
        // single navigation instead of two.
        const stripUrl = stripTarget ? (location.origin + stripTarget + location.search + location.hash) : null;
        const navigateAfter = (cleanup) => {
            cleanup();
            if (stripUrl) location.replace(stripUrl); else location.reload();
        };

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
                if (!doc) {
                    if (stripUrl) {
                        dbg('forceEnglish: redirecting off /intl-xx/ prefix', location.pathname, { to: stripTarget, reason: 'account flip unavailable - could not load preferences document' });
                        navigateAfter(cleanup);
                    } else {
                        cleanup();
                        giveUp('could not load preferences document');
                    }
                    return;
                }
                applyEnglishToLanguageSelect(doc, (result) => {
                    if (!result.found) {
                        if (stripUrl) {
                            dbg('forceEnglish: redirecting off /intl-xx/ prefix', location.pathname, { to: stripTarget, reason: 'account flip unavailable - language selector not found' });
                            navigateAfter(cleanup);
                        } else {
                            cleanup();
                            giveUp('language selector not found - Spotify may have changed the settings page');
                        }
                        return;
                    }
                    if (!result.changed) {
                        localStorage.removeItem(ATTEMPTS_KEY);
                        dbg('forceEnglishAccountSetting: language already English', '#desktop.settings.selectLanguage', { reload: false });
                        if (stripUrl) {
                            dbg('forceEnglish: redirecting off /intl-xx/ prefix', location.pathname, { to: stripTarget });
                            navigateAfter(cleanup);
                        } else {
                            cleanup();
                        }
                        return;
                    }
                    // Dispatched the change event, but that only proves React
                    // saw it - not that Spotify's backend actually saved it.
                    // Navigate and verify on the next load before trusting this -
                    // to the stripped URL if we have one, otherwise a plain reload.
                    localStorage.setItem(PENDING_KEY, 'true');
                    dbg('forceEnglishAccountSetting: dispatched change, navigating to verify', '#desktop.settings.selectLanguage', { to: stripTarget || location.pathname });
                    setTimeout(() => navigateAfter(cleanup), 1000);
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
        setAuthorizedPanel(null); // any close (any source) disarms all three "user opened it" flags
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
        // #Desktop_PanelContainer_Id is shared by NPV, Queue, and Connect to a Device - all
        // three flip the same ariaHidden flag, so checking that alone can't tell them apart.
        // Confirmed against live markup: the <aside id="Desktop_PanelContainer_Id"> element
        // ITSELF carries aria-label="Now playing view" + class "NowPlayingView" when showing
        // NPV, vs aria-label="Queue" (no NowPlayingView class) for Queue - it's an
        // attribute/class on the container, not a descendant, so we check panelContainer
        // directly rather than querySelector-ing into it.
        return panelContainer.getAttribute('aria-label') === 'Now playing view'
            || panelContainer.classList.contains('NowPlayingView');
    }

    // npBtn's green "active" look (icon color + bottom dot, see the .npbtn CSS in injectCSS
    // below) is driven off userOpenedNPV rather than isNpvOpen(), for the same stale-label
    // reason isAnyPanelAuthorized() above can't gate off label-matching either: isNpvOpen()'s
    // aria-label check can't reliably tell "NPV specifically" apart from a freshly-opening
    // Queue/Connect on the first tick.
    function syncNpBtnVisualState() {
        const npBtn = document.querySelector('.npbtn');
        if (!npBtn) return;
        npBtn.classList.toggle('active', userOpenedNPV);
    }

    // Same shared-container pattern as isNpvOpen() above, checking the container's own
    // aria-label for the other two panel types ("Queue" and "Connect to a device"
    // respectively, with no NPV-style extra class to fall back on since those don't carry one).
    function isQueueOpen() {
        const panelContainer = document.querySelector('#Desktop_PanelContainer_Id');
        if (!panelContainer) return false;
        if (panelContainer.parentNode.parentNode.ariaHidden !== 'false') return false;
        return panelContainer.getAttribute('aria-label') === 'Queue';
    }
    function isConnectOpen() {
        const panelContainer = document.querySelector('#Desktop_PanelContainer_Id');
        if (!panelContainer) return false;
        if (panelContainer.parentNode.parentNode.ariaHidden !== 'false') return false;
        return panelContainer.getAttribute('aria-label') === 'Connect to a device';
    }

    /**
     * clickNP - Toggle the Now Playing view via the same toggle button
     * closeNowPlay() already uses (#Desktop_PanelContainer_Id's parent's
     * parent's next-sibling button). NPV guard: sets the authorized-panel state based on
     * the state this click is *about* to produce, BEFORE clicking - not
     * after. panelGuardObserver's MutationObserver callback runs as a
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
            dbg('[PanelGuard] clickNP: no-op - toggle button not found', '#Desktop_PanelContainer_Id parent parent nextElementSibling button', { source });
            return;
        }
        const willOpen = !isNpvOpen();
        setAuthorizedPanel(willOpen ? 'npv' : null); // set BEFORE the click - see comment above
        dbg('[PanelGuard] clickNP: clicking toggle', '#Desktop_PanelContainer_Id parent parent nextElementSibling button', { source, willOpen });
        toggleBtn.click();
    }

    // Tracks whether ANY of the three views sharing #Desktop_PanelContainer_Id - NPV, Queue, or
    // Connect - is currently open, as a class on <html> (fuckd-panel-open). Driven off the
    // [inert] attribute directly via closest() rather than the container's own aria-hidden/
    // aria-label - confirmed via live DOM capture that all three panel types flip the same
    // [inert] attribute on the same wrapper when opened, so this one check works uniformly for
    // all three, unlike isNpvOpen()/isQueueOpen()/isConnectOpen() above, which only ever
    // recognize their own specific panel and stay label-based for that reason (still used for
    // logging/diagnostics and by clickNP()/the album-art/Queue/Connect triggers to compute
    // willOpen, just not to gate panelGuardObserver's close-or-not decision below).
    function isAnyPanelOpen() {
        const panelContainer = document.querySelector('#Desktop_PanelContainer_Id');
        if (!panelContainer) return false;
        return !panelContainer.closest('[inert]');
    }
    function updateNpvLayoutState() {
        document.documentElement.classList.toggle('fuckd-panel-open', isAnyPanelOpen());
        syncNpBtnVisualState();
    }
    updateNpvLayoutState(); // reflect default (closed) state before the panel even exists

    // --- NowPlayingView/Queue/Connect guard: only allow opens via an authorized path - npBtn
    // (clickNP)/album art for NPV, or the Queue/Connect buttons for those two (see
    // setupOtherPanelTriggers) --- Anything else that makes the shared panel container visible
    // gets auto-closed, since userOpenedNPV/userOpenedQueue/userOpenedConnect only ever become
    // true via setAuthorizedPanel(), called from one of those four triggers.
    //
    // Gates on isAnyPanelOpen() + isAnyPanelAuthorized() (any one of the three flags), not on
    // isNpvOpen()/isQueueOpen()/isConnectOpen() label-matching against a specific panel type -
    // see isAnyPanelAuthorized()'s own comment above for why those three checks can't reliably
    // tell "was this specific open authorized" apart on the first tick. isNpvOpen()/
    // isQueueOpen()/isConnectOpen() are still called below, but only to report which panel it
    // turned out to be in the debug log, not to decide whether to close it.
    //
    // Also tracks the panel's open state across callbacks (lastPanelOpen below) so the
    // stale-flag branch a few lines down only fires on a genuine open->closed TRANSITION - see
    // that branch's own comment for why a plain "currently reads closed" check would be wrong.
    let lastPanelOpen = false;
    let lastLoggedPanelState = null;
    const panelGuardObserver = new MutationObserver(() => {
        const anyOpenNow = isAnyPanelOpen();
        if (anyOpenNow) {
            if (!isAnyPanelAuthorized()) {
                const panelContainer = document.querySelector('#Desktop_PanelContainer_Id');
                dbg('[PanelGuard] autoclose: panel opened without an authorized trigger click - closing', '#Desktop_PanelContainer_Id', {
                    'panelContainer aria-label': panelContainer?.getAttribute('aria-label') ?? null,
                    isNpvOpen: isNpvOpen(), isQueueOpen: isQueueOpen(), isConnectOpen: isConnectOpen()
                });
                window.closeNowPlay('panel-guard-autoclose');
            }
        } else if (lastPanelOpen && isAnyPanelAuthorized()) {
            // The panel just transitioned from open to closed (lastPanelOpen was true,
            // isAnyPanelOpen() now reads false), but one of the three authorized flags is
            // still true. That only happens when something closed the panel WITHOUT going
            // through closeNowPlay() - the confirmed real-world case is the panel's own
            // in-panel X/close button, which triggers Spotify's native close handler directly
            // and never touches any of our code, so setAuthorizedPanel(null) never ran.
            // Without this branch the stale `true` flag persists indefinitely and the guard
            // wrongly treats the NEXT open - even a totally unrelated native one, e.g. clicking
            // another playlist's play button or playing a search result, both of which
            // auto-open NPV on their own - as still-authorized, and never auto-closes it.
            //
            // Requiring `lastPanelOpen` (true only once the panel has been genuinely seen
            // open, rather than just checking `!isAnyPanelOpen() && isAnyPanelAuthorized()` on
            // its own) matters because that plain check would also match the very FIRST
            // callback tick(s) right after an authorized click, before Spotify's (multi-tick)
            // opening transition had made the panel visible yet - "hasn't opened yet" would
            // get misread as "closed via X button", clearing the just-set authorized flag
            // mid-open, which would then make the panel's real opening tick a moment later
            // look unauthorized to the branch above and get it closed right after being told
            // to open. The pre-open ticks correctly fall through instead (lastPanelOpen is
            // still false, since the panel was never open before this click), and only a real
            // open->closed transition matches.
            dbg('[PanelGuard] stale-flag: panel closed via a path that bypassed closeNowPlay() (e.g. in-panel X button) - clearing stale authorized flag', 'html', {
                userOpenedNPV, userOpenedQueue, userOpenedConnect
            });
            setAuthorizedPanel(null);
        }
        lastPanelOpen = anyOpenNow;
        const currentPanelState = `open:${anyOpenNow}|npv:${userOpenedNPV}|queue:${userOpenedQueue}|connect:${userOpenedConnect}`;
        if (currentPanelState !== lastLoggedPanelState) {
            dbg('[PanelGuard] state changed', 'html', { isNpvOpen: isNpvOpen(), isQueueOpen: isQueueOpen(), isConnectOpen: isConnectOpen(), isAnyPanelOpen: anyOpenNow });
            lastLoggedPanelState = currentPanelState;
        }
        updateNpvLayoutState();
    });
    observeBody(panelGuardObserver, { childList: true, subtree: true, attributes: true, attributeFilter: ['aria-hidden', 'inert'] });

    // On load, close it if it's already open before any authorized trigger has fired.
    setTimeout(() => {
        if (isAnyPanelOpen() && !isAnyPanelAuthorized()) window.closeNowPlay('panel-guard-initial');
        const initialPanelState = `open:${isAnyPanelOpen()}|npv:${userOpenedNPV}|queue:${userOpenedQueue}|connect:${userOpenedConnect}`;
        if (initialPanelState !== lastLoggedPanelState) {
            dbg('[PanelGuard] initial: syncing fuckd-panel-open layout class', 'html', { isNpvOpen: isNpvOpen(), isAnyPanelOpen: isAnyPanelOpen() });
            lastLoggedPanelState = initialPanelState;
        }
        updateNpvLayoutState();
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
    //
    // FIX (v7.12): this and Lyrics+'s pip-gui-stable both use @grant, so each
    // runs in its own sandboxed JS context under Tampermonkey/Violentmonkey -
    // plain `window` is per-script there, not the real shared page global.
    // Assigning window.__spReservedInsets here never reached Lyrics+'s
    // window, so it always read reserved as 0/undefined (confirmed via
    // Lyrics+'s diagnostic logging). unsafeWindow is the real page global
    // both sandboxes wrap - read/write/dispatch this specific handshake
    // through that instead. Falls back to window if unsafeWindow isn't
    // exposed (e.g. @grant none, where window already IS the real window).
    const SP_SHARED_WINDOW = typeof unsafeWindow !== 'undefined' ? unsafeWindow : window;
    function updateNPBarHeightVar() {
        const player = document.querySelector('aside[data-testid=now-playing-bar]');
        if (player) {
            document.documentElement.style.setProperty('--sp-np-bar-height', player.offsetHeight + 'px');
            // Exposed so other userscripts (e.g. Lyrics+'s PiP popup) can keep
            // themselves out of the fixed bottom nav (56px) + player strip
            // without having to scan the DOM for it themselves. Only reassigned
            // (and only fires the change event) when a value actually moved,
            // so idle listeners aren't woken up on every no-op ResizeObserver tick.
            //
            // v7.12: also publishes bottomNav on its own (just the fixed 56px nav
            // bar, no player) alongside the existing combined `bottom`. Companion
            // change to Lyrics+ v17.53.dev - the popup's drag/resize clamp used to
            // reserve nav+player together, which meant it could never be dragged
            // or resized over the player at all. It's now allowed to cover the
            // player; only the bottom nav bar itself is still off-limits. `bottom`
            // (nav+player) is kept as-is in case anything still wants the old
            // combined figure.
            const BOTTOM_NAV_HEIGHT = 56;
            const bottom = BOTTOM_NAV_HEIGHT + player.offsetHeight;
            if (!SP_SHARED_WINDOW.__spReservedInsets ||
                SP_SHARED_WINDOW.__spReservedInsets.bottom !== bottom ||
                SP_SHARED_WINDOW.__spReservedInsets.bottomNav !== BOTTOM_NAV_HEIGHT) {
                SP_SHARED_WINDOW.__spReservedInsets = { bottom, bottomNav: BOTTOM_NAV_HEIGHT };
                SP_SHARED_WINDOW.dispatchEvent(new CustomEvent('sp-reserved-insets-change', { detail: SP_SHARED_WINDOW.__spReservedInsets }));
            }
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

    // enhance-badge (Smart Shuffle indicator) vertical alignment - see the
    // "Badge vertical alignment" CSS comment above (search enhance-badge)
    // for the full diagnosis. Short version: native Spotify centers the
    // badge against context-item-info-subtitles' box, which renders taller
    // than the artist text actually inside it, so the badge lands visibly
    // low. Rather than hardcode that gap as a fixed px (which would go
    // stale if Spotify's text/line-height CSS changes), this measures the
    // real delta between the badge and context-item-info-artist live and
    // nudges the badge by exactly that much.
    // Re-measured only via MutationObserver (badge/artist nodes get
    // replaced wholesale on track change - that's the only time this
    // actually needs to re-run in normal use). No ResizeObserver/window
    // resize listener - live font-scale/zoom changes without a track
    // change are an edge case not worth the extra observer wiring for.
    let enhanceBadgeMutationObserver = null;
    let enhanceBadgeAlignTimer = null;

    function alignEnhanceBadge() {
        const player = document.querySelector('aside[data-testid=now-playing-bar]');
        if (!player) return;
        const badge = player.querySelector('svg[data-testid="enhance-badge"]');
        if (!badge) return; // no badge on this track (or row not rendered yet)
        // Reference is always context-item-info-artist, in both modes.
        // querySelectorAll() dumps in both modes on a 2-artist track show
        // only ever ONE set of artist nodes total (one per artist, not one
        // per mode), each already repositioned to whichever mode is
        // currently active - so there's no stale/duplicate node to
        // accidentally grab, and no mode branching is needed. Querying
        // under `player` each call already scopes this to whatever's live
        // right now, in either mode.
        const ref = player.querySelector('[data-testid="context-item-info-artist"]');
        if (!ref) return;
        // Reset any previous adjustment before measuring - getBoundingClientRect
        // reflects transforms already applied, so measuring without resetting
        // first would compound the offset on every re-run instead of
        // recomputing it fresh.
        badge.style.transform = '';
        const badgeRect = badge.getBoundingClientRect();
        const refRect = ref.getBoundingClientRect();
        const delta = (badgeRect.top + badgeRect.height / 2) - (refRect.top + refRect.height / 2);
        if (Math.abs(delta) < 0.5) return; // already aligned within half a px - leave transform cleared
        badge.style.transform = `translateY(${-delta}px)`;
        dbg('alignEnhanceBadge: badge nudged to match context-item-info-artist center', 'svg[data-testid="enhance-badge"]', {
            deltaPx: delta,
            appliedTranslateY: -delta
        });
    }

    function setupEnhanceBadgeAlign() {
        const player = document.querySelector('aside[data-testid=now-playing-bar]');
        if (!player) return;
        alignEnhanceBadge();
        if (!enhanceBadgeMutationObserver) {
            enhanceBadgeMutationObserver = new MutationObserver(() => {
                clearTimeout(enhanceBadgeAlignTimer);
                // Debounced, same as handlePremiumMutations - track-change
                // renders touch a bunch of nodes in one burst, and we only
                // need to re-measure once after it settles, not per-mutation.
                enhanceBadgeAlignTimer = setTimeout(alignEnhanceBadge, 50);
            });
            enhanceBadgeMutationObserver.observe(player, { childList: true, subtree: true });
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
                            dbg('pBtn: unlocker timeout reached', 'aside button[data-testid=control-button-playpause]', {
                                ulFlag, 'pBtn aria-label right now': window.pBtn ? window.pBtn.getAttribute('aria-label') : '(pBtn not found)'
                            });
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
                    dbg('firstFuck: first pBtn found - running one-time init', 'aside button[data-testid=control-button-playpause]', {
                        action: 'calling addCSSJSHack()'
                    });
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
        // Compact player restore-on-load retry hook (v7.4) - setupCompactToggle
        // assigns this to its own enterCompact() the first time it runs. The
        // real npbtn it needs to move might not exist yet on a slow/cold load
        // (setupNpvButton runs first in the same pass, but can itself still be
        // waiting on lyBtn) - see the npvSetupInterval poll below, which calls
        // this every tick until the move has actually happened, same pattern
        // already used there for .npbtn/.fuckd-npv-art.
        let tryRestoreCompact = () => {};
        // Real implementation assigned inside setupCompactToggle() below; sweeps
        // `player` for stray direct children the moveOut/moveBack machinery lost
        // track of. See definition below for the exact set of legitimate children.
        let cleanupOrphans = () => {};

        // Setup library button once
        const setupLibraryButton = () => {
            // Use aria-label to identify the correct library button (not back button)
            // Library button has aria-label containing "Your Library" (either "Open Your Library" or "Collapse Your Library")
            // Back button has aria-label="Go back" which doesn't contain "Your Library"
            const libBtn = document.querySelector('#Desktop_LeftSidebar_Id header button[aria-label*="Your Library"]:not(.fuckd)');

            if (libBtn && !libBtn.classList.contains('fuckd')) {
                dbg('setupLibraryButton: libBtn found - wiring', '#Desktop_LeftSidebar_Id header button[aria-label*="Your Library"]', {
                    'libBtn aria-label': libBtn.getAttribute('aria-label')
                });
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
        // allow, plus clickNP()/panelGuardObserver above closeNowPlay().
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
            // No defensive strip of lyBtn's hashed "open" state classes needed here: if
            // lyBtn happens to be transiently carrying them at clone time (Spotify's own
            // hydration race), they ride along onto npBtn same as any other class, but the
            // `.npbtn:not(.active)` CSS in injectCSS below pins npBtn's resting-state color
            // and dot directly with !important, so a leaked class has nothing left it's
            // able to paint - a literal-name denylist would only work until Spotify renames
            // those hashed classes on some future deploy, where this property-level defense
            // doesn't depend on the names staying the same at all.
            npBtn.className = lyBtn.className.replace('fuckd-npv', '').trim() + ' npbtn';
            npBtn.setAttribute('aria-label', 'Now Playing view');
            npBtn.title = 'Now Playing view';
            // Filled icon (rounded-rect "panel" with a solid play-style wedge) instead
            // of the old stroke-only path, which had no fill and rendered as a sliver
            // at real button size.
            npBtn.innerHTML = `<svg data-encore-id="icon" role="img" aria-hidden="true" viewBox="0 0 16 16" style="width:16px;height:16px;fill:currentColor;"><rect x="1.25" y="0.75" width="13.5" height="14.5" rx="2" fill="none" stroke="currentColor" stroke-width="1.5"/><path d="M6 4.5v7l5.5-3.5z" fill="currentColor"/></svg>`;
            npBtn.addEventListener('click', () => clickNP('npBtn-click'));
            lyBtn.parentNode.insertBefore(npBtn, lyBtn);
            syncNpBtnVisualState(); // set the correct initial look immediately, in case NPV is
            // (unusually) already open-and-authorized at insertion time.

            // Make sure nothing is left open from before npBtn/album-art/Queue/Connect were
            // wired up. Uses the same isAnyPanelOpen()/isAnyPanelAuthorized() combo as
            // panelGuardObserver (not isNpvOpen()) since this can run while a fresh Queue/
            // Connect open is still showing the stale default aria-label described in
            // isAnyPanelAuthorized()'s comment above - checking isNpvOpen() here instead could
            // get fooled by that same stale label and wrongly close the Queue/Connect panel the
            // person just legitimately opened.
            if (isAnyPanelOpen() && !isAnyPanelAuthorized()) window.closeNowPlay('panel-guard-init');

            dbg('[PanelGuard] setupNpvButton: button inserted', 'button[data-testid="lyrics-button"]', {});
        };

        // NPV guard: the player-bar album art (div[data-testid=now-playing-widget]
        // >div:first-child) natively TOGGLES the Now Playing view on click - this is
        // a real, reliable Spotify affordance, separate from the unreliable native
        // toggle button npBtn above works around. Without this, panelGuardObserver
        // (which only trusts opens that went through an authorized trigger) would see the
        // native open and immediately undo it, making the click appear to do
        // nothing. A capture-phase listener sets the authorized-panel state to match
        // what this click is about to do - open or close, computed from isNpvOpen() same as
        // clickNP() - strictly before Spotify's own bubble-phase handler runs, so
        // by the time panelGuardObserver's mutation microtask fires, the flag
        // already reflects the correct state. This must mirror both directions
        // (not just set true): since it's a native toggle, the closing click never
        // goes through our closeNowPlay() (which is the only other place that
        // resets the flag, aside from panelGuardObserver's own stale-flag backstop), so an
        // unconditional `true` here would leave the flag
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
                // itself. Must mirror that here: if we unconditionally authorized 'npv', the
                // *closing* click (native, closeNowPlay() never runs for this path) leaves
                // userOpenedNPV stuck true, so the guard wrongly trusts the next unrelated
                // native open (e.g. playlist play button auto-opening NPV).
                const willOpen = !isNpvOpen();
                setAuthorizedPanel(willOpen ? 'npv' : null);
                dbg('[PanelGuard] npvWidget: album art clicked', 'div[data-testid="now-playing-widget"]>div:first-child', {
                    willOpen,
                    note: willOpen
                        ? 'authorized panel set to npv before Spotify\'s own click handling runs, so panelGuardObserver allows this open'
                        : 'panel was open - this click closes it natively (closeNowPlay() never runs for this path), so the authorized-panel flags are cleared here to keep guard state in sync'
                });
            }, { capture: true });
            dbg('[PanelGuard] setupNpvWidgetTrigger: listener attached', 'div[data-testid="now-playing-widget"]>div:first-child', {});
        };

        // Queue and Connect are full authorized-opener types, same pattern as the album art
        // trigger above - compute willOpen from each panel's own isQueueOpen()/isConnectOpen()
        // check, and call setAuthorizedPanel() synchronously in a capture-phase listener before
        // Spotify's own handler runs. This replaces the old time-boxed otherPanelOpening flag
        // (see userOpenedQueue/userOpenedConnect's own declaration comment for why that flag's
        // fixed timer window was the actual cause of Queue/Connect auto-closing on a cold first
        // click) - these two buttons are also real native toggles like the album art, so both
        // directions need to be computed here for the same reason: an unconditional `true`
        // would leave the flag stuck after a close.
        const setupOtherPanelTriggers = () => {
            const queueBtn = document.querySelector('button[data-testid="control-button-queue"]:not(.fuckd-other-panel)');
            if (queueBtn) {
                queueBtn.classList.add('fuckd-other-panel');
                queueBtn.addEventListener('click', () => {
                    const willOpen = !isQueueOpen();
                    setAuthorizedPanel(willOpen ? 'queue' : null);
                    dbg('[PanelGuard] otherPanel: Queue button clicked', 'button[data-testid="control-button-queue"]', { willOpen });
                }, { capture: true });
                dbg('[PanelGuard] setupOtherPanelTriggers: Queue listener attached', 'button[data-testid="control-button-queue"]', {});
            }
            const connectBtn = document.querySelector('button[aria-label="Connect to a device"]:not(.fuckd-other-panel)');
            if (connectBtn) {
                connectBtn.classList.add('fuckd-other-panel');
                connectBtn.addEventListener('click', () => {
                    const willOpen = !isConnectOpen();
                    setAuthorizedPanel(willOpen ? 'connect' : null);
                    dbg('[PanelGuard] otherPanel: Connect button clicked', 'button[aria-label="Connect to a device"]', { willOpen });
                }, { capture: true });
                dbg('[PanelGuard] setupOtherPanelTriggers: Connect listener attached', 'button[aria-label="Connect to a device"]', {});
            }
        };

        // Compact player toggle (v7.4) - ported from kitbodega/SpotiKit
        // 7.3.2.fork's #sp-player-toggle/.minimized feature. A thin strip
        // pinned to the top of the player bar; clicking it toggles compact
        // mode, which physically MOVES the three real full-player buttons
        // (npbtn - Now Playing view/lyrics, the real Queue button, the real
        // Play/Pause button) into the compact strip, then moves them back
        // to their exact original spot on exit. Because these are the same
        // nodes rather than new proxy buttons, there's nothing to keep in
        // sync - same click listeners (guard capture-phase listener on
        // Queue, clickNP() on npbtn, the unlock-flag handler on Play/Pause
        // via window.pBtn), same icons, same aria state, because it's
        // literally the same element, just reparented.
        const setupCompactToggle = () => {
            const player = document.querySelector('aside[data-testid=now-playing-bar]:not(.spf-compact-ready)');
            if (!player) return;
            player.classList.add('spf-compact-ready');
            // v7.14: Spotify reuses this exact same aside[data-testid=now-playing-bar]
            // for the signed-out signup preview (div[data-testid=signup-bar] as a
            // child) - there's no separate markup/class distinguishing it from the
            // real logged-in player bar. Without this check, this function couldn't
            // tell the two apart either, so on a signed-out load it happily appended
            // #spf-compact-toggle to the signup-bar's aside. Clicking that (very
            // real, very clickable) toggle then ran the exact same moveOut() logic
            // as on the real player, relocating the (disabled but still present)
            // play/pause button into #spf-compact-play - which is what was actually
            // showing up as "compact toggle and full view both exposed" on the
            // signup prompt. Bail out before appending anything if signup-bar is
            // present; .spf-compact-ready is still set above either way, so a
            // signed-out load doesn't get a toggle for the rest of the session.
            if (player.querySelector('[data-testid="signup-bar"]')) return;

            // Snapshot of whatever's already a legitimate child of `player` before
            // this script appends anything to it - i.e. Spotify's own widget
            // wrapper div (artwork, title/artist, all controls). cleanupOrphans()
            // must never touch these; it was mistakenly treating "no spf-compact-*
            // id" as "stray" and deleting this wrapper wholesale, which is what
            // made the whole player (and artwork/title/artist) vanish.
            const originalChildren = new Set(player.children);

            const strip = document.createElement('button');
            strip.id = 'spf-compact-toggle';
            strip.setAttribute('aria-label', 'Toggle compact player');
            player.appendChild(strip);

            // Moves a real button out to the compact strip (as a direct
            // child of `player`, positioned via CSS on compactId), recording
            // exactly where it came from so moveBack() can restore it to
            // that exact spot - not just "somewhere in its old container",
            // since insertion order matters (e.g. npbtn must land back
            // immediately before the real lyrics-button, not after it).
            const movedOut = []; // [{ el, parent, next }]
            const moveOut = (el, compactId) => {
                if (!el || el.dataset.spfCompactMoved) return;
                el.dataset.spfCompactMoved = '1';
                el.id = compactId;
                movedOut.push({ el, parent: el.parentNode, next: el.nextSibling });
                player.appendChild(el);
            };
            const moveBack = () => {
                while (movedOut.length) {
                    const { el, parent, next } = movedOut.pop();
                    delete el.dataset.spfCompactMoved;
                    el.id = '';
                    if (parent && parent.isConnected) {
                        parent.insertBefore(el, (next && next.isConnected) ? next : null);
                    } else {
                        // Original wrapper is gone (React replaced it outright while we
                        // were in compact mode) - there's nowhere valid left to put el
                        // back, and React has almost certainly already mounted a fresh
                        // replacement in the new wrapper by now. Leaving el in the tree
                        // as an unpositioned stray child of `player` (its id was just
                        // cleared above) is exactly how the play/pause-appears-twice bug
                        // happens, so remove it instead of orphaning it.
                        el.remove();
                    }
                }
            };

            // Library-action button (v7.5): same "never physically move it" reasoning as the
            // old Lyrics proxy this replaces (it's a React-owned node inside now-playing-widget's
            // last child, which the compact CSS keeps hidden) - build a synthetic proxy in the
            // compact strip that forwards clicks to the real button in place.
            // This slot is actually two different real buttons depending on liked state - "Add to
            // Liked Songs" (heart, subdued color) when the track isn't liked, which morphs into
            // "Add to playlist" (checkmark, bright-accent color) once it is - so the proxy has to
            // track whichever one is currently rendered, not just one fixed aria-label.
            // The icon/color/label can also change from elsewhere (e.g. the full Now Playing
            // view, or another instance of this button), so a one-time clone would go stale.
            // Instead a MutationObserver watches now-playing-widget itself (childList+subtree, so
            // it also survives the real button's node being replaced outright on track change or
            // liked-state morph, not just attribute flips) and re-syncs the proxy's
            // class/aria-checked/aria-label/title/icon every time.
            let libActionObserver = null;
            const findLibActionBtn = () =>
                document.querySelector('[data-testid="now-playing-widget"] button[aria-label^="Add to "]');
            const syncLibActionProxy = (proxy, realBtn) => {
                proxy.className = realBtn.className;
                proxy.setAttribute('aria-checked', realBtn.getAttribute('aria-checked') || 'false');
                const label = realBtn.getAttribute('aria-label') || 'Add to playlist';
                proxy.setAttribute('aria-label', label);
                proxy.title = label;
                proxy.innerHTML = realBtn.innerHTML;
            };
            const ensureLibActionProxy = () => {
                let proxy = document.getElementById('spf-compact-libaction');
                const realBtn = findLibActionBtn();
                if (proxy) {
                    if (realBtn) syncLibActionProxy(proxy, realBtn);
                    return proxy;
                }
                if (!realBtn) return null;
                proxy = document.createElement('button');
                proxy.id = 'spf-compact-libaction';
                syncLibActionProxy(proxy, realBtn);
                proxy.addEventListener('click', () => {
                    // Re-query rather than close over realBtn - the node may have been
                    // replaced by a track change or liked-state morph since this listener
                    // was attached.
                    findLibActionBtn()?.click();
                });
                player.appendChild(proxy);
                const widgetEl = document.querySelector('[data-testid="now-playing-widget"]');
                if (widgetEl) {
                    libActionObserver = new MutationObserver(() => {
                        const btn = findLibActionBtn();
                        const p = document.getElementById('spf-compact-libaction');
                        if (btn && p) syncLibActionProxy(p, btn);
                    });
                    libActionObserver.observe(widgetEl, {
                        childList: true, subtree: true, attributes: true,
                        attributeFilter: ['class', 'aria-checked']
                    });
                }
                return proxy;
            };
            const removeLibActionProxy = () => {
                if (libActionObserver) { libActionObserver.disconnect(); libActionObserver = null; }
                document.getElementById('spf-compact-libaction')?.remove();
            };

            // Remove-recommendation proxy (v7.17, optional): only present at all when the
            // current track is a Smart Shuffle recommendation (same container that holds the
            // enhance-badge/"Add to <playlist>" pair - see finalizzation notes). Deliberately
            // matched on its own exact aria-label, same "never touch the hashed group wrapper
            // class" reasoning as findLibActionBtn()'s aria-label^="Add to " match just above -
            // not by reaching into the shared button-group container (hJzzpZJOf7Y68h_8 at time
            // of writing), so this can't accidentally drag in or depend on its sibling "Add to"
            // button's own markup. Same "never physically move it, forward clicks instead"
            // pattern as the library-action proxy, since this is a React-owned node too.
            let removeRecObserver = null;
            const findRemoveRecBtn = () =>
                document.querySelector('[data-testid="now-playing-widget"] button[aria-label="Remove recommendation"]');
            const syncRemoveRecProxy = (proxy, realBtn) => {
                proxy.className = realBtn.className;
                proxy.innerHTML = realBtn.innerHTML;
            };
            const ensureRemoveRecProxy = () => {
                let proxy = document.getElementById('spf-compact-removerec');
                const realBtn = findRemoveRecBtn();
                if (proxy) {
                    // Track may stop being a recommendation while compact mode stays open
                    // (e.g. skipping to the next song) - the real button then disappears
                    // entirely, so the proxy has to disappear with it rather than sit there
                    // pointing at nothing.
                    if (!realBtn) { removeRemoveRecProxy(); return null; }
                    syncRemoveRecProxy(proxy, realBtn);
                    return proxy;
                }
                if (!realBtn) return null;
                proxy = document.createElement('button');
                proxy.id = 'spf-compact-removerec';
                proxy.setAttribute('aria-label', 'Remove recommendation');
                proxy.title = 'Remove recommendation';
                syncRemoveRecProxy(proxy, realBtn);
                proxy.addEventListener('click', () => {
                    // Re-query rather than close over realBtn, same reasoning as the
                    // library-action proxy - the real node can be replaced under us.
                    findRemoveRecBtn()?.click();
                });
                // Measure the ACTUAL gap from the real, still-visible container, rather than
                // guessing a px value. This must run before player.classList.add('spf-compact')
                // (see enterCompact() - ensureRemoveRecProxy() is called ahead of that line
                // specifically so this measurement can happen while the real buttons are still
                // laid out normally, not yet display:none'd by the .spf-compact last-child
                // rule). realBtn.getBoundingClientRect().right -> addToBtn's .left is the exact
                // on-screen distance between them right now, in their real, unmodified
                // container - i.e. precisely "as if the container had simply been unhidden".
                const addToBtn = findLibActionBtn();
                if (addToBtn) {
                    const removeRecRect = realBtn.getBoundingClientRect();
                    const addToRect = addToBtn.getBoundingClientRect();
                    const gap = addToRect.left - removeRecRect.right;
                    const addToWidth = addToRect.width;
                    // Sanity check - a collapsed/hidden ancestor at measurement time (or a
                    // layout Spotify hasn't finished yet) yields zero-size rects, which would
                    // produce a garbage (likely negative or ~0) offset. Only trust the
                    // measurement if both real numbers look like an actual rendered gap.
                    if (Number.isFinite(gap) && Number.isFinite(addToWidth) && addToWidth > 0) {
                        // #spf-compact-libaction sits at right:44px (see CSS) - the proxy needs
                        // to sit that same 44px, plus the real Add-to button's own on-screen
                        // width, plus the real measured gap, further from the right edge.
                        proxy.style.right = `${44 + addToWidth + gap}px`;
                        dbg('ensureRemoveRecProxy: measured live gap from real container', '[aria-label="Remove recommendation"] + [aria-label^="Add to "]', { gap, addToWidth, appliedRight: 44 + addToWidth + gap });
                    } else {
                        dbg('ensureRemoveRecProxy: live measurement looked invalid, falling back to CSS default', '[aria-label="Remove recommendation"] + [aria-label^="Add to "]', { gap, addToWidth });
                    }
                }
                player.appendChild(proxy);
                const widgetEl = document.querySelector('[data-testid="now-playing-widget"]');
                if (widgetEl) {
                    removeRecObserver = new MutationObserver(() => {
                        const btn = findRemoveRecBtn();
                        const p = document.getElementById('spf-compact-removerec');
                        if (!p) return;
                        if (!btn) { removeRemoveRecProxy(); return; }
                        syncRemoveRecProxy(p, btn);
                    });
                    removeRecObserver.observe(widgetEl, { childList: true, subtree: true });
                }
                return proxy;
            };
            const removeRemoveRecProxy = () => {
                if (removeRecObserver) { removeRecObserver.disconnect(); removeRecObserver = null; }
                document.getElementById('spf-compact-removerec')?.remove();
            };

            // Belt-and-suspenders sweep for the same failure mode moveBack()'s
            // disconnected-parent branch now guards against, but covering cases
            // moveBack() itself can't see - e.g. strays created by a session that
            // ran before this fix shipped. A direct child of `player` is only
            // legitimate if it's: the original widget wrapper (originalChildren),
            // the strip, or a moveOut'd/proxy element (id starting with
            // 'spf-compact-'). Anything else is a stray - remove it.
            cleanupOrphans = () => {
                for (const child of Array.from(player.children)) {
                    if (child === strip) continue;
                    if (originalChildren.has(child)) continue;
                    if (child.id && child.id.startsWith('spf-compact-')) continue;
                    child.remove();
                }
            };

            const enterCompact = () => {
                // v7.5: compact mode now only surfaces Play/Pause and the library-action button
                // (Add to playlist / Add to Liked Songs) - NPV, Queue, native Lyrics, and
                // Lyrics+ no longer move into the strip. Fewer buttons also means less
                // right-side padding needs reserving on the widget row (see injectCSS), which
                // was crowding the artist/album marquee text down to near-zero width on narrow
                // mobile viewports.
                moveOut(window.pBtn || document.querySelector('button[data-testid="control-button-playpause"]'), 'spf-compact-play');
                ensureLibActionProxy();
                ensureRemoveRecProxy();
                player.classList.add('spf-compact');
                setCompactMode(true);
                dbg('compactToggle: entered compact', '#spf-compact-toggle', { movedCount: movedOut.length });
            };
            const exitCompact = () => {
                moveBack();
                removeLibActionProxy();
                removeRemoveRecProxy();
                player.classList.remove('spf-compact');
                setCompactMode(false);
                dbg('compactToggle: exited compact', '#spf-compact-toggle', {});
            };

            strip.addEventListener('click', (e) => {
                e.stopPropagation();
                if (player.classList.contains('spf-compact')) exitCompact();
                else enterCompact();
            });

            // Apply persisted state (see COMPACT_KEY above). moveOut() is
            // already a no-op for anything it can't find or has already
            // moved, so calling this repeatedly (see tryRestoreCompact below)
            // is safe - it just keeps trying to grab whichever of the three
            // real buttons weren't rendered yet on the previous attempt.
            tryRestoreCompact = () => {
                if (compactModeEnabled()) enterCompact();
            };
            tryRestoreCompact();

            dbg('setupCompactToggle: strip inserted', 'aside[data-testid=now-playing-bar]', {
                restoredCompact: compactModeEnabled()
            });
        };

        // Try to setup all elements immediately
        setupLibraryButton();
        setupLibraryGrid();
        setupHomeButton();
        setupSearchInput();
        setupUserButton();
        setupNPBarHeightSync();
        setupEnhanceBadgeAlign();
        setupNpvButton();
        setupNpvWidgetTrigger();
        setupOtherPanelTriggers();
        setupCompactToggle();

        // Use a short retry mechanism for elements that might not be ready yet
        // Check once more after 2 seconds for any missed elements
        setTimeout(() => {
            setupLibraryButton();
            setupLibraryGrid();
            setupHomeButton();
            setupSearchInput();
            setupUserButton();
            setupNPBarHeightSync();
            setupEnhanceBadgeAlign();
            setupCompactToggle();
            tryRestoreCompact();
        }, 2000);

        // setupNpvButton/setupNpvWidgetTrigger/setupOtherPanelTriggers get their
        // own indefinite poll instead of the single 2s retry above - firstFuck's
        // own pfint loop keeps retrying forever, but only for the play button;
        // once that's found, ffDone latches true and this whole function never
        // runs again, so a single 2s retry was the only other chance these three
        // ever got. On a slow/cold SPA load where the lyrics button or the
        // player-bar album art take longer than 2s to render (the same class of
        // delay firstFuck's own indefinite polling exists to handle), they'd
        // silently never get wired at all. Ported SpotiwebJS's npvSetupInterval
        // pattern instead: poll every second until all are confirmed present,
        // then stop. All setup functions already no-op harmlessly once
        // already-inserted, so repeated calls are safe. The clear condition below
        // used to check only .npbtn/.fuckd-npv-art - never the Queue/Connect
        // listeners setupOtherPanelTriggers() adds. npBtn is our own element, created
        // the instant the native lyrics button exists, so it (and the album art,
        // generally present at the same time) are often wired on an earlier tick than
        // Queue/Connect's aria-label/data-testid become reliably queryable. If that
        // happens, the old condition was already satisfied and clearInterval() fired -
        // permanently stopping the poll before setupOtherPanelTriggers() ever got
        // another chance to find and wire Queue/Connect, leaving them stuck relying on
        // Spotify's own native (unauthorized, per panelGuardObserver) click handling
        // for the rest of the session. Now requires all four - npBtn, album art, Queue
        // button, and Connect button - to be wired before stopping.
        setupNpvButton();
        setupNpvWidgetTrigger();
        setupOtherPanelTriggers();
        setupCompactToggle();
        const npvSetupInterval = setInterval(() => {
            setupNpvButton();
            setupNpvWidgetTrigger();
            setupOtherPanelTriggers();
            setupCompactToggle();
            tryRestoreCompact();
            cleanupOrphans();
            const compactRestoreDone = !compactModeEnabled() || document.getElementById('spf-compact-libaction');
            if (document.querySelector('.npbtn') && document.querySelector('.fuckd-npv-art')
                && document.querySelector('button[data-testid="control-button-queue"].fuckd-other-panel')
                && document.querySelector('button[aria-label="Connect to a device"].fuckd-other-panel')
                && document.querySelector('.spf-compact-ready') && compactRestoreDone) {
                dbg('[PanelGuard] npvSetupInterval: all four triggers wired - stopping poll', 'setInterval', {});
                clearInterval(npvSetupInterval);
            }
        }, 1000);
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
/* Deliberately left unscoped (reverted from the html:not(.fuckd-panel-open) scoping
   SpotiwebJS's Sixteenth change used) - matches the old behavior of this script, where
   NPV/Queue/Connect take over the whole viewport instead of docking at their native
   sidebar-panel size/position. The scoped version stopped forcing width:100vw the moment
   a panel was genuinely open, so it fell back to Spotify's native docked width - the
   .fuckd-panel-open class (still set/tracked by isAnyPanelOpen()/updateNpvLayoutState(),
   in case something else needs it later) is simply no longer read by this block. */
div[data-testid=root]{--panel-gap:0!important}
#main-view+div,#main-view+div>div{overflow:hidden!important;width:auto!important}
#main-view+div>div>div>div:nth-child(2)>div{width:100vw!important}
/* npBtn's "active" look (Seventeenth/Eighteenth SpotiwebJS changes, ported here):
   position:relative anchors the ::after dot, since a plain <button> is position:static by
   default and the cloned lyBtn classes don't supply that. The :not(.active) rules pin the
   resting icon color and turn the dot off with !important - not to fight anything of ours,
   but to override Spotify's own hashed "open"-state classes on the off chance they were
   riding along on lyBtn's className at the exact moment it was cloned into npBtn (see
   setupNpvButton's own comment on that hydration race). That race can only ever coincide
   with NPV genuinely being open at clone time, in which case a leaked class and .active's
   own rules already agree the icon should be green - the resting state is the only one a
   leaked class could ever contradict, which is exactly the one pinned here. */
.npbtn{position:relative}
.npbtn:not(.active){color:var(--text-subdued,#b3b3b3)!important}
.npbtn:not(.active)::after{content:none!important}
.npbtn:not(.active):hover,.npbtn:not(.active):focus{color:var(--text-base,#fff)!important}
.npbtn.active{color:#1db954}
.npbtn.active:hover,.npbtn.active:focus{color:#1db954!important}
.npbtn.active::after{content:"";background-color:#1db954;border-radius:50%;width:4px;height:4px;display:block;position:absolute;bottom:0;left:50%;transform:translate(-50%)}
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
     * Uncomment this line to hide the track-info block on the left side of the player bar (album art which one can click to then display NPV)
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
        // If this ever starts showing grey instead of black (main view,
        // sidebar, library, or any other themed surface - not the player
        // bar below, which has its own !important and is independent of
        // this): the six custom properties above currently lack
        // !important, which is normally required because CSS custom
        // properties resolve from the NEAREST ancestor that declares them,
        // not by selector specificity - if Spotify redeclares one of these
        // vars closer to a panel's own root than this top-level
        // .encore-dark-theme rule sits, a plain declaration loses that
        // proximity race. This currently isn't a problem here because
        // `.YourLibraryX{background:var(--background-elevated-base)
        // !important}` in the bottom-nav/library-overlay block (Sixth big
        // change, search this file for YourLibraryX) independently pins
        // the one surface that would otherwise lose that race. If that
        // rule/class ever changes or a newly affected surface appears, the
        // fix is simply adding !important to each of the six properties
        // below (confirmed sufficient on its own, no per-element rules
        // needed, when this exact scenario hit SpotiwebJS/desktop, which
        // has no equivalent of the YourLibraryX pin).
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
        // --- Compact player mode (v7.4) - ported from kitbodega/SpotiKit
        // 7.3.2.fork's .minimized feature, adapted to this file's fixed
        // full-width bottom bar (SpotiKit's own version targets a floating
        // rounded card instead - different base layout, same testid-driven
        // hide/show strategy). Kept as its own <style> element so none of
        // the existing CSS above has to be touched. ---
        const compactPlayer = document.createElement('style');
        compactPlayer.textContent = `

aside[data-testid=now-playing-bar].spf-compact{
  /* No height/max-height cap here anymore (v7.5) - that was locking the
     aside's TOTAL height to exactly 64px, which included the "Playing on
     X device" connect banner whenever it's present, squashing it into
     that fixed space instead of letting it sit above the compact row like
     it already does in full-player mode. The aside has no height cap
     there either (see the base position:fixed;bottom:56px rule below,
     max-height:40vh is just a safety ceiling) - it's simply
     position:fixed with a bottom offset, so it naturally grows upward as
     its content (compact row + banner, when present) grows taller.
     Capping just the compact ROW below (div:first-child) to 64px instead
     reproduces the same compact look without fighting that mechanism. */
  padding:0!important
}
aside[data-testid=now-playing-bar].spf-compact [data-testid=playback-position],
aside[data-testid=now-playing-bar].spf-compact [data-testid=playback-duration],
aside[data-testid=now-playing-bar].spf-compact div[data-testid=now-playing-widget]>div:last-child{
  display:none!important
}
/* Hide just the secondary-controls wrapper (Lyrics+, npbtn, native lyrics/
   queue/connect/volume/pip/fullscreen) - none of which appear in compact
   mode anymore (v7.5). Anchored on stable testid/aria-label attributes
   (never hashed CSS-module classnames, which silently stop matching the
   moment Spotify changes a build hash) rather than the wrapper's own class.
   v7.15: originally anchored on data-testid="lyrics-button" alone (always
   present for songs, unlike lyrics-plus-btn which only exists if that
   separate userscript is installed) - but podcast episodes have no lyrics
   button at all, so this never matched on a podcast, leaving the entire
   wrapper (Queue/Connect/Volume/PiP/Fullscreen) visible and eating into the
   title/author area's available width, on top of just not collapsing away
   like it does for songs. Widened to also match on the Queue button
   (data-testid="control-button-queue") or Connect button
   (aria-label="Connect to a device") - both present on every track type,
   song or podcast - so this now correctly fires either way.
   IMPORTANT: this must NOT be a blanket "~ div" rule catching every
   sibling after the now-playing-widget wrapper - that was the previous
   (buggy) approach, and it also caught the player-controls wrapper, which
   needs to stay visible for the scrubber below. A second rule then tried
   to re-show player-controls, but since both rules use !important,
   specificity (not source order) decides the winner - and the blanket
   hide rule was, non-obviously, MORE specific (its :has() argument had an
   extra type selector), so the scrubber stayed hidden no matter what the
   second rule said. Targeting the secondary-controls wrapper directly
   sidesteps that fight entirely - there's nothing left it needs to be
   un-hidden from. */
aside[data-testid=now-playing-bar].spf-compact>div:first-child>div:has([data-testid="lyrics-button"],[data-testid="control-button-queue"],[aria-label="Connect to a device"]){
  display:none!important
}
/* The player-controls wrapper is never hidden in the first place (see
   above) - just restyled directly into a thin scrubber pinned near the
   bottom edge of the compact strip.
   Plain language: this 4px buffer is what keeps the little circle
   marking the current playback position fully visible when it's
   highlighted (tapped/hovered), instead of getting clipped off - whether
   or not the bottom nav bar (Home/Search/Library) or the green Spotify
   Connect banner (shown when casting to a device you're not currently
   viewing from) happen to be sitting under the player bar at the time.
   Dev/technical: bottom:4px, not 0 - the row above has overflow:hidden,
   and the seek-position thumb grows larger on hover/highlight than the
   6px track itself, so flush against the very bottom edge let the
   enlarged thumb get clipped by that overflow. This buffer keeps it
   fully visible when highlighted. */
aside[data-testid=now-playing-bar].spf-compact>div:first-child>div:has([data-testid="player-controls"]){
  display:flex!important;
  position:absolute!important;
  left:0!important;
  right:0!important;
  bottom:4px!important;
  height:6px!important;
  padding:0!important;
  margin:0!important;
  overflow:visible!important;
  z-index:5
}
/* Hide the transport buttons (shuffle/prev/next/repeat/translate) - Play/
   Pause itself is pulled out separately into #spf-compact-play, so nothing
   in this row is needed in compact mode. Force the position/scrubber/
   duration row and the scrubber itself to fill the now 6px-tall wrapper -
   :has() again rather than that row's own hashed class. */
aside[data-testid=now-playing-bar].spf-compact [data-testid="general-controls"]{
  display:none!important
}
aside[data-testid=now-playing-bar].spf-compact [data-testid="player-controls"],
aside[data-testid=now-playing-bar].spf-compact [data-testid="player-controls"] div:has([data-testid="playback-progressbar"]),
aside[data-testid=now-playing-bar].spf-compact [data-testid="playback-progressbar"]{
  display:flex!important;
  width:100%!important;
  height:100%!important;
  align-items:center!important;
  margin:0!important;
  padding:0!important
}
aside[data-testid=now-playing-bar].spf-compact>div:first-child>div:has(div[data-testid=now-playing-widget]){
  display:flex!important;
  flex:1!important;
  min-width:0!important;
  overflow:hidden!important
}
aside[data-testid=now-playing-bar].spf-compact>div:first-child{
  display:flex!important;
  flex-direction:row!important;
  align-items:center!important;
  /* Explicit 68px, not height:100% - the aside itself no longer has a
     fixed height to inherit a percentage from (see above), so this row is
     now what actually defines the compact row's height.
     68px, not 64px: the scrubber below sits at bottom:4px (not bottom:0)
     so its enlarged hover/highlight thumb doesn't get clipped by this
     row's overflow:hidden. That 4px shift moved the scrubber up but left
     the row's own height unchanged, so the row grew a 4px dead strip at
     its very bottom (below the scrubber, above nothing) instead of
     actually giving the scrubber room - shrinking the usable/padded area
     by 4px without shrinking anything visible to compensate. Growing the
     row by that same 4px (64->68) turns that dead strip into real,
     intentional height instead, so the padding-bottom below can widen to
     match and everything above (artwork/title/artist, Play/Pause,
     library-action) keeps the exact same breathing room relative to the
     scrubber that it had before the scrubber moved. */
  height:68px!important;
  min-height:68px!important;
  max-height:68px!important;
  overflow:hidden!important;
  position:relative!important;
  /* Only two buttons now (Play/Pause + Add-to-playlist, right:8/44 below)
     instead of the old five (which needed 256px) - this was the actual
     cause of the artist/album marquee text collapsing to near-zero width
     on narrow viewports; bottom:10px (was 6px, +4 to match the row's own
     +4px above) keeps content clear of the scrubber, whose top edge
     (bottom:4px + height:6px = 10px) now sits flush against this
     padding's edge again, same as the 6px/6px flush fit before the
     scrubber moved up. */
  padding:0 84px 10px 8px!important
}
aside[data-testid=now-playing-bar].spf-compact div[data-testid=now-playing-widget]{
  flex:1!important;
  min-width:0!important;
  display:flex!important;
  flex-direction:row!important;
  align-items:center!important;
  justify-content:flex-start!important;
  gap:8px!important;
  height:100%!important;
  overflow:hidden!important
}
aside[data-testid=now-playing-bar].spf-compact div[data-testid=now-playing-widget]>div:first-child{
  width:44px!important;
  height:44px!important;
  min-width:44px!important;
  flex-shrink:0!important;
  border-radius:4px!important;
  overflow:hidden!important
}
aside[data-testid=now-playing-bar].spf-compact div[data-testid=now-playing-widget]>div:first-child img{
  width:100%!important;
  height:100%!important;
  object-fit:cover!important;
  border-radius:4px!important
}
aside[data-testid=now-playing-bar].spf-compact div[data-testid=now-playing-widget]>div:nth-child(2){
  display:grid!important;
  grid-template-columns:12px 1fr!important;
  grid-template-rows:auto auto!important;
  align-items:center!important;
  justify-content:center!important;
  column-gap:4px!important;
  row-gap:0!important;
  min-width:0!important;
  max-width:none!important;
  overflow:hidden!important
}
/* Title spans both grid columns on row 1, alone - matches native's own
   title-gets-its-own-line behavior (see native dump: title top=540 vs
   badge/artist top~557/558, i.e. two rows, title on its own). */
aside[data-testid=now-playing-bar].spf-compact div[data-testid=now-playing-widget]>div:nth-child(2)>div:first-child{
  grid-column:1/3!important;
  grid-row:1!important
}
/* Badge wrapper (jEiAs1et4fAU3chW) - row 2, column 1. Grid's align-items:
   center on the row keeps it vertically centered against the artist text
   next to it, and the 4px column-gap reproduces the native ~4px gap
   between badge and artist (native: subtitle.left 104 - badge.left 88 -
   badge.width 12 = 4). This is the same relation the badge already has,
   by coincidence of flex-row + align-items:center, in the non-compact
   (fully expanded) player bar - this rule just gets compact mode to the
   same relation via a 2-row grid instead of 1 row, since compact needs
   the title on its own line above.
   Column 1 is a fixed 12px (not auto): with auto, getComputedStyle
   showed the badge's own track getting compressed from 12px to 8px in
   compact mode specifically, distorting the icon (12px height stayed,
   only width shrank) - col's available width there (~60px, squeezed by
   the 44px album art + compact bar) isn't enough for badge(12)+gap(4)+
   artist's max-content text, and grid's auto tracks are allowed to
   shrink below max-content when space is tight, unlike fixed-length
   tracks. Pinning column 1 to 12px makes it non-shrinkable so the badge
   always renders at native size; the artist column (1fr) absorbs
   whatever width is left and truncates via the nowrap/overflow rules
   below, same as it already did before this fix. */
aside[data-testid=now-playing-bar].spf-compact div[data-testid=now-playing-widget]>div:nth-child(2)>div:nth-child(2){
  grid-column:1!important;
  grid-row:2!important
}
/* Artist row - row 2, column 2 (the remaining 1fr track), right next to
   the badge instead of stacked below it. */
aside[data-testid=now-playing-bar].spf-compact div[data-testid=now-playing-widget]>div:nth-child(2)>div:nth-child(3){
  grid-column:2!important;
  grid-row:2!important;
  min-width:0!important
}
aside[data-testid=now-playing-bar].spf-compact div[data-testid=now-playing-widget]>div:nth-child(2)>div{
  white-space:nowrap!important;
  overflow:hidden!important;
  max-width:100%!important
}
/* Badge-clip fix - the blanket rule above exists to ellipsis-truncate the
   title/artist TEXT rows, but as a generic ">div:nth-child(2)>div" selector
   it also matches the badge wrapper (jEiAs1et4fAU3chW), which holds nothing
   but a 12x12 svg with no text to truncate. overflow:hidden on that wrapper
   clips alignEnhanceBadge()'s live-measured translateY() nudge (see JS
   below) whenever the measured offset pushes the badge past the wrapper's
   own tight, content-sized 12px box. This selector matches that same
   wrapper specifically (scoped to only wrappers that actually contain an
   enhance-badge svg) but is more specific than the blanket rule above (an
   extra :has() clause), so it wins and flips overflow back to visible for
   just that one wrapper - leaving white-space/max-width, and everything
   else about how the wrapper sizes and tracks, untouched. Tracks with no
   badge don't match :has() here, so they're unaffected and still get
   overflow:hidden from the rule above - harmless, since that empty wrapper
   is already collapsed to ~0 size by the "Badge-absent reclaim" rules
   below regardless. */
aside[data-testid=now-playing-bar].spf-compact div[data-testid=now-playing-widget]>div:nth-child(2)>div:has(svg[data-testid="enhance-badge"]){
  overflow:visible!important
}
/* The music-video "Switch to video" row (+ its bullet separator) is a third
   sibling row alongside title/artist inside nth-child(2) whenever a track
   has an associated video. Initially only hidden in compact mode, where
   the 64px row was only ever budgeted for two rows (title, artist) and
   the extra row pushed both into less vertical space than they need.
   Now (v7.5) hidden in full player too, unconditionally - not just a
   compact-mode layout fix anymore, so the .spf-compact scope was dropped
   from the selector. Targeted via the stable aria-label rather than the
   hashed wrapper class, since that's the only part of this row guaranteed
   not to change across Spotify builds.
   v7.17: this used to select the OUTER wrapper (nth-child(2)'s direct
   child) - call it jEiAs1et4fAU3chW, matching Spotify's own class at time
   of writing. That element also carries the enhance-badge svg
   (data-testid="enhance-badge", Smart Shuffle recommendation indicator)
   as a SIBLING of the "Switch to video" block, not a descendant of it -
   so hiding the outer wrapper whenever a video existed was silently
   taking the badge down with it too. The "Switch to video" aria-label
   actually lives one level deeper, inside its own inner wrapper
   (joq0zH0yEoIsJoXJ at time of writing - not targeted directly since,
   like all hashed classnames here, it isn't guaranteed stable). Going one
   extra >div deeper reaches that inner wrapper specifically, so only the
   video-switch button + bullet get hidden - the badge svg, being a
   sibling one level up, is untouched either way a track does or doesn't
   have a video. */
aside[data-testid=now-playing-bar] div[data-testid=now-playing-widget]>div:nth-child(2)>div>div:has([aria-label="Switch to video"]){
  display:none!important
}
/* enhance-badge (Smart Shuffle recommendation indicator, data-testid=
   "enhance-badge") - shown whether or not the track also has a video (see
   fix above: the video block next to it, when present, is hidden without
   touching this). No layout CSS is given to the badge svg or its
   jEiAs1et4fAU3chW wrapper directly - Spotify's own native class on that
   wrapper already renders it correctly (vertically centered against the
   artist-name row, ~4px to its left) once it's placed in the same grid
   row as that artist row. Getting it into that row is handled entirely
   by the col-level grid rules above (nth-child(2) and its nth-child(2)/
   nth-child(3) children) - measured via getComputedStyle dumps in both
   modes:
   - Native (no spotifuck): col is display:grid, title on row 1 alone,
     badge+artist sharing row 2 - which is exactly why the badge already
     lines up with the artist row with no extra CSS needed.
   - An unconditional (non-.spf-compact) rule elsewhere in this file
     forces col to display:flex!important, which drops that native grid.
     In the full/expanded player this still happens to look right,
     because flex-direction defaults to row and badge is already ordered
     directly before the artist row in the DOM - one row, three inline
     items, native gap preserved by coincidence.
   - In compact mode specifically, an added flex-direction:column turned
     that same flex container into 3 stacked rows (title, badge, artist
     each on their own line) - the badge lost its pairing with the artist
     row entirely, which is the bug this was reported against.
   The col-level rules above replace that flex-column with an explicit
   2-row grid (title spans row 1; badge in row 2/col 1; artist in row 2/
   col 2) to restore the same row-pairing natively achieved by grid,
   without touching the badge/wrapper CSS itself. If a future
   misalignment shows up, fix it by matching jEiAs1et4fAU3chW's native
   rules / the col-level grid placement, not by adding CSS to the badge
   directly. */

/* Badge vertical alignment - the badge is centered (align-items:center)
   against the row's [data-testid="context-item-info-subtitles"] box, not
   against the actual artist text inside it. Measured via
   getBoundingClientRect() in both compact and full player: subtitles'
   top edge matches the artist anchor's top edge exactly, but subtitles
   renders taller, with all of the extra height sitting below the artist
   text - so centering the badge against that taller box lands it a few
   px lower than the artist glyphs' real center.
   This gap comes from Spotify's own text/line-height CSS
   (encore-text-marginal etc.), which this script doesn't control and
   can't assume stays fixed - so it's corrected in JS instead of a
   hardcoded px offset here (see alignEnhanceBadge()/
   setupEnhanceBadgeAlign() below). No static transform is applied in CSS
   on purpose - leave it to the JS so there's only one source of truth
   for the offset.
   context-item-info-artist is used as the reference in both modes:
   querySelectorAll() dumps of it in both modes on a multi-artist track
   show only one artist node per artist (not one per mode), each already
   repositioned to whichever mode is active - no stale duplicate to
   accidentally grab. Scoping the query under player on each call is
   enough to always get the live, correct node. */

/* Badge-absent reclaim - tracks that were NOT Smart Shuffle-recommended
   never get an <svg data-testid="enhance-badge"> at all, but the wrapper
   div around where it WOULD go (col's 2nd child, jEiAs1et4fAU3chW at time
   of writing) still exists in the DOM regardless - Spotify doesn't
   conditionally render/remove that wrapper, it just ends up 0x0 because
   there's nothing inside it. The bug: the *positioning* we give that slot
   is hardcoded and doesn't know or care whether a badge is actually
   present, so it keeps reserving space for one that isn't there:
   - Compact mode: grid-template-columns:12px 1fr above pins column 1 to
     a fixed 12px + the 4px column-gap regardless of content, so the
     artist column starts 16px further right than it needs to.
   - Full/expanded player: col.children[1]'s own native margin survives
     even at width/height:0 (confirmed via getComputedStyle dump - wrapper
     left=733.15/width=0, artist left=737.15, a leftover ~4px gap with
     nothing to justify it).
   :has() lets us detect "no badge svg inside this wrapper" without any
   JS/MutationObserver, and zero out exactly the reservation each mode
   added - collapsing column 1 + its gap in the grid, and stripping
   whatever margin/padding the wrapper still carries in the flex case -
   so the artist text reclaims the same title-aligned left edge it'd have
   if the wrapper were never in the DOM at all. Scoped with :not(:has())
   so tracks that DO have the badge are completely untouched by this. */
aside[data-testid=now-playing-bar].spf-compact div[data-testid=now-playing-widget]>div:nth-child(2):not(:has(svg[data-testid="enhance-badge"])){
  grid-template-columns:0 1fr!important;
  column-gap:0!important
}
div[data-testid=now-playing-widget]>div:nth-child(2)>div:nth-child(2):not(:has(svg[data-testid="enhance-badge"])){
  margin:0!important;
  padding:0!important;
  min-width:0!important;
  width:0!important
}

/* Toggle strip - thin bar pinned to the top of the player bar in both full
   and compact states, click to switch between them. Position/size ported
   directly from SpotiKit's #sp-player-toggle. */
#spf-compact-toggle{
  position:absolute;
  top:4px;
  left:50%;
  transform:translateX(-50%);
  width:40px;
  height:5px;
  border-radius:3px;
  background:rgba(255,255,255,0.2);
  border:none;
  cursor:pointer;
  z-index:10;
  padding:0;
  transition:background 0.2s, width 0.2s
}
#spf-compact-toggle:hover{background:rgba(255,255,255,0.4);width:50px}

/* Compact-mode slots for Play/Pause (real element, moved) and the
   library-action button - Add to playlist / Add to Liked Songs, whichever
   is currently rendered (synthetic proxy, see ensureLibActionProxy) -
   positioning only. Play/Pause keeps its real Encore classes/SVG/aria
   state since it's the actual full-player button, just reparented; the
   proxy clones whatever the real button currently looks like. These ids
   only exist on an element while it's actually inside the compact strip
   (assigned by moveOut()/ensureLibActionProxy(), cleared by moveBack()/
   removeLibActionProxy() - see setupCompactToggle), so no
   :not(.spf-compact) guard is needed here.
   top:34px (not top:50%!) - both buttons are appended directly to the
   aside, not to the 68px compact row itself, and the aside's own height is
   no longer fixed (see the aside-level .spf-compact rule above - that's
   what lets the green "Playing on X device" banner get its own space
   instead of being squashed). 50% would center against whatever the
   aside's CURRENT total height happens to be (68px content row alone, or
   68px + the banner's height on top of it), which is exactly why they sat
   low whenever the banner was present - and also slightly low even
   without it, since 50% of the aside's real rendered height was never
   quite exactly 34px once box-shadow/border are accounted for. The
   compact row is always flush with the aside's own TOP edge regardless of
   whether the banner is occupying space below it, so a fixed 34px from
   the top (half of the row's own fixed 68px height, grown from 64px to
   give the scrubber below room without eating into anyone else's space -
   see the row's own height comment above) reliably lands on the row's
   center either way. */
#spf-compact-play,#spf-compact-libaction,#spf-compact-removerec{
  position:absolute!important;
  top:34px!important;
  transform:translateY(-50%)!important;
  margin:0!important;
  z-index:10
}
#spf-compact-play{right:8px}
#spf-compact-libaction{right:44px}
/* Remove-recommendation proxy (only exists at all when the current track
   is a Smart Shuffle recommendation - see ensureRemoveRecProxy). Its real
   right-offset is set as an inline style by ensureRemoveRecProxy(), which
   measures the actual on-screen gap from the real "Remove recommendation"
   / "Add to <playlist>" buttons while they're still visible (i.e. the true
   distance you'd see if the container were simply unhidden) - this
   :root default is only a fallback for the rare case that measurement
   comes back invalid (e.g. layout not settled yet), not the real value. */
:root{--spf-removerec-gap:36px}
#spf-compact-removerec{right:calc(44px + var(--spf-removerec-gap))}

/* Play/Pause is a real Encore Primary button - filled white circle, icon
   colored dark via its own encore-inverted-light-set inner span - which
   made it look like a different, bigger control than the plain icon-only
   library-action proxy sitting right next to it. Stripped down here to a
   bare white icon instead. Once the circle/padding chrome is gone, the two
   already match in size on their own - both icons use the same
   --encore-graphic-size-decorative-smaller sizing token in their native
   markup - so no explicit width/height override or scale() hack is needed
   (the previous scale(1.3) on the library-action button is removed; it
   was only there to compensate for Play/Pause's oversized circle). */
#spf-compact-play{
  background:transparent!important;
  box-shadow:none!important;
  padding:0!important;
  width:auto!important;
  height:auto!important;
  min-width:0!important;
  color:#fff!important
}
#spf-compact-play .e-10451-button-primary__inner{
  background:transparent!important
}
#spf-compact-play svg,
#spf-compact-play svg path{
  fill:#fff!important
}
        `;
        document.head.appendChild(compactPlayer);
        console.log('#CSS Injected');
    }

    // Initialize immediately
    if (HOST_IS_OPEN) {
        whenHeadReady(() => {
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
        });
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
                const profileUrl = `https://www.spotify.com/${getCurrentRegionPrefix()}/account/profile/`;
                dbg('premiumBanner left (Edit profile): clicked', '.__sp custom div (replaces [data-testid="compact-banner"])', {
                    action: 'redirecting to ' + profileUrl
                });
                window.location.href = profileUrl;
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
                const paymentUrl = `https://www.spotify.com/${getCurrentRegionPrefix()}/account/saved-payment-cards/`;
                dbg('premiumBanner right (Payment method): clicked', '.__sp custom div (replaces [data-testid="compact-banner"])', {
                    action: 'redirecting to ' + paymentUrl
                });
                window.location.href = paymentUrl;
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
            // [data-testid*="pay"] and [data-testid*="checkout"] don't catch
            // everything - e.g. data-testid="add-new-card-button" contains
            // neither substring. Adding it as an exact match rather than
            // widening to [data-testid*="card"], since that broader pattern
            // would also match unrelated things like a "discard-button"
            // testid (the substring "card-button" sits inside "discard-
            // button" too).
            const BLOCK_SELECTOR = 'form, button[type="submit"], [data-testid*="pay"], [data-testid*="checkout"], [data-testid="add-new-card-button"]';
            document.querySelectorAll(BLOCK_SELECTOR).forEach(el => {
                el.onclick = e => {
                    dbg('payments page blocker: clicked', BLOCK_SELECTOR, {
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
        observeBody(premiumObserver, {
            childList: true,
            subtree: true,
            characterData: true,
        });
        dbg('startPremiumObserver: MutationObserver (re)started', 'document.body', { childList: true, subtree: true, characterData: true });
    }
    startPremiumObserver();

    if (typeof GM_registerMenuCommand === 'function') {
        GM_registerMenuCommand('\ud83d\udccb Show everything replaced so far (console)', () => {
            dbg('menu: Show everything replaced so far (console) clicked', 'GM_registerMenuCommand', {});
            printReplacementLog();
            alert('Current text replacements have been logged to the console. Open DevTools (Press F12 or Right click and Inspect), then select the Logs tab under Console to view it.');
        });
    }

    if (typeof GM_registerMenuCommand === 'function') {
        GM_registerMenuCommand(
            (debugLoggingEnabled() ? '✅' : '❌') + ' Debug Logging (console)',
            () => {
                const next = !debugLoggingEnabled();
                // Not dbg() - dbg() is gated behind debugLoggingEnabled(), which is
                // still false at the moment logging gets turned on, so it would
                // swallow the one line that announces logging just turned on.
                // Raw console.log matching dbg()'s exact output shape instead.
                console.log('%c[SPFDBG] menu: Debug Logging (console) toggled', 'color:#1ed760;font-weight:bold;', 'selector:', 'GM_registerMenuCommand', { from: debugLoggingEnabled(), to: next, action: 'reloading' });
                setFlag(DEBUG_KEY, next);
                location.reload();
            }
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
        observeBody(adObserver, { childList: true, subtree: true });
        window.addEventListener('beforeunload', () => adObserver.disconnect());
    }

    // add-new-card-button blocker for www.spotify.com's own account pages
    // (/account/payment-methods/, aliased with /account/saved-payment-cards/ -
    // same page reachable under either path). Entirely separate from the
    // payments.spotify.com checkout blocker above (BLOCK_SELECTOR inside
    // premium spoof handling), which is gated to that different hostname and
    // so never touches this page. No overlay here (account management, not
    // checkout) - just the same preventDefault/stopPropagation no-op on the
    // button, gated behind HOST_IS_WWW + premiumSpoofEnabledHere() (the
    // www.spotify.com toggle), matching everything else scoped to that host.
    // Path-matched via location.pathname.includes(...) against both known
    // paths rather than a hardcoded locale segment, since the region prefix
    // varies per account (si-en, us, mx-es, etc) and isn't always normalized
    // to a fixed value.
    if (HOST_IS_WWW) {
        const blockWwwAddCardButton = () => {
            if (!premiumSpoofEnabledHere()) return;
            if (!location.pathname.includes('/account/payment-methods/') &&
                !location.pathname.includes('/account/saved-payment-cards/')) return;
            document.querySelectorAll('[data-testid="add-new-card-button"]:not([data-sp-done])').forEach(el => {
                el.dataset.spDone = '1';
                el.onclick = e => {
                    dbg('www add-new-card-button: clicked', '[data-testid="add-new-card-button"]', { action: 'preventDefault + stopPropagation (click is a no-op)' });
                    e.preventDefault(); e.stopPropagation();
                };
            });
        };
        blockWwwAddCardButton();
        const wwwCardObserver = new MutationObserver(blockWwwAddCardButton);
        observeBody(wwwCardObserver, { childList: true, subtree: true });
        window.addEventListener('beforeunload', () => wwwCardObserver.disconnect());
    }

})();
