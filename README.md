## Spotifuck Mobile

A mobile-layout userscript for the Spotify Web Player: ports the Spotifuck Android mod's mobile UI (bottom nav, full-screen library) and playback-reliability fixes onto the Spotify Web Player, adds a compact player mode ported separately from kitbodega/SpotiKit, and layers a full premium-spoof/ad-cleanup/Force-English engine on top. Works on an actual phone browser or on desktop if you just prefer the mobile-style layout.

> **Recommended userscript manager:** [Violentmonkey](https://violentmonkey.github.io/) or [Tampermonkey](https://www.tampermonkey.net/)    
> Want a desktop version?    
> See [SpotiwebJS](https://github.com/Myst1cX/SpotiKit/blob/main/README.md) in this same repo. (fix link later)

## Index

- [Features](#features)
  - [Mobile-like layout](#mobile-like-layout)
  - [Compact player mode](#compact-player-mode)
  - [Now Playing View, Queue, and Connect panel guard system](#now-playing-view-queue-and-connect-panel-guard-system)
  - [AMOLED mode](#amoled-mode)
  - [Force English](#force-english)
  - [Visual Premium Spoof](#visual-premium-spoof)
  - [Ad-Slot Cleanup (DOM only, doesn't touch actual audio ads)](#ad-slot-cleanup-dom-only-doesnt-touch-actual-audio-ads)
  - [Play/Pause reliability fix](#playpause-reliability-fix)
  - [Library folder-navigation fix](#library-folder-navigation-fix)
  - [Debug Logging & Replacement Log](#debug-logging--replacement-log)
  - [Efficient Scanning](#efficient-scanning)
  - [Globals for scripting/automation](#globals-for-scriptingautomation)
- [Installation](#installation)
  - [a) Quetta Browser method (recommended)](#a-quetta-browser--user-agent-switcher-and-manager-method)
  - [b) Mobile installation - legacy Firefox + Chameleon method](#b-legacy-firefox-browser--chameleon-extension-method-slower-less-responsive)
- [Ad-Blocking (actual audio ad blocking)](#ad-blocking-actual-audio-ads)
- [Notes](#notes)
- [Feedback](#feedback)
- [Credits](#credits)
- [License](#license)

## Features

> Matches `open.spotify.com`, the whole `www.spotify.com` origin, and `payments.spotify.com`.

### Mobile-like layout

Ported and adapted from the reverse-engineered Spotifuk apk (`r0/e.java`), with the bottom nav bar itself taken from kitbodega/SpotiKit's own mobile layout:

- A fixed Home/Search/Library bottom nav bar. Home and Search navigate via `history.pushState`; Library performs a real click on Spotify's own native library toggle (routed through one shared, guarded function so manual clicks, the auto-close-on-playlist trigger, and the nav tab itself can never end up double-firing on the button).
- The native library sidebar is hidden by default. By pressing on the Library bottom nav bar, the library opens as a full-screen overlay; it auto-closes when you tap into a track, album, or playlist, but **not** when you tap into a folder, so browsing into a playlist still works (see [Library folder-navigation fix](#library-folder-navigation-fix)).
- The native top header (home icon, bell, upgrade button, profile menu) and the native search input are hidden from the Home tab by default and instead appear when user navigates to the Search tab.
- The now-playing player sits fixed just above the bottom nav bar, and `#main-view`'s height tracks the player's live-measured height via `ResizeObserver`, so scrollable content never runs behind the player or the nav.
- Library-open state persists across in-app navigation for the current page load and auto-closes if you switch to Home/Search while it's open.

### Compact player mode

A thin toggle strip pinned to the player bar, ported from kitbodega/SpotiKit's `#sp-player-toggle`/`.minimized` feature and adapted to this script's fixed full-width bottom bar layout.
Collapses the player down to artwork, title/artist, the Play/Pause button, and the library-action button - "Add to Liked Songs" / "Add to playlist" / "Add to Your Episodes" / "Remove recommendation" for Smart Shuffle tracks, whichever currently applies - plus a thin draggable scrubber; the rest of the secondary controls (Queue, Connect, volume, PiP, fullscreen, NPV, lyrics) stay hidden along with the progress bar. Play/Pause is the real full-player button, physically reparented into the strip rather than cloned, so it keeps its own listeners/icon/aria state automatically; the library-action slot is a React-owned node that can't be moved the same way, so it gets a synthetic proxy kept in sync by a `MutationObserver` on `now-playing-widget` instead (rebuilt whenever the track changes or the liked-state morphs, so it never goes stale or forwards a click to the wrong button). The Smart Shuffle `enhance-badge` is realigned against the artist text via a live `getBoundingClientRect()`-measured `translateY()`, recalculated on every track change, in both compact and full player. Your last-picked mode (compact or full) is remembered across reloads via GM storage - kitbodega/SpotiKit's own version has no such persistence at all, so it resets on every page load.

### Now Playing View, Queue, and Connect panel guard system

The old `Now Playing View` button toggle was ported directly from the reverse-engineered Spotifuck APK (`r0/e.java`) and enrichened with a guard system. `npBtn` is that restored toggle, built to sit and look exactly where the button used to live, next to the lyrics button - it exists specifically to replace Spotify's own current native arrow toggle in the sidebar, which is redundant now and gets hidden separately: a CSS block (`styleId 'npv-guard-hide-native-toggle-style'`) squeezes the ancestor region that native arrow lives in down to zero effective width and force-expands the freed space to `100vw`, scoped behind `html:not(.fuckd-panel-open)` so it doesn't also crush a legitimately open NPV/Queue/Connect panel. The guard itself treats Now Playing View, Queue, and Connect to a Device as three interchangeable panels sharing a single DOM slot, and authorizes opens/closes per-panel instead of only recognizing NPV.   
a) Because `npBtn` is our own restored button rather than a live Spotify control, nothing else is listening for clicks on it - so clicking it just calls our own `clickNP()`, which does two things back-to-back: first it tells the guard this open/close is authorized (`setAuthorizedPanel('npv'|null)`), then it clicks Spotify's actual (hidden) native toggle button on the person's behalf to make the panel really open or close. Since both steps are our own code running one after the other, there's no race to worry about. The player-bar album art, the Queue button, and the Connect button are different - those are Spotify's real, currently-live buttons, already wired with Spotify's own click handler, so our script adds one more listener on top rather than replacing anything. That extra listener runs in the capture phase (`{ capture: true }`), which always fires before the normal listener Spotify itself uses, and calls `setAuthorizedPanel('npv'|'queue'|'connect'|null)` there - the panel name if this click is about to open it, `null` if it's about to close whichever one is currently open - so the guard already knows it was authorized a beat before Spotify's own handler even starts opening the panel.    
b) `panelGuardObserver` (renamed from `npvGuardObserver` once it grew to cover all three) decides whether to auto-close a panel purely from whether the shared container is open at all (`isAnyPanelOpen()`, read off its `inert` attribute) and whether any of the three was authorized (`isAnyPanelAuthorized()`) - not from label-matching against a specific panel type, because Spotify briefly renders the shared container with its default "Now playing view" label for the very first tick after Queue or Connect opens too, before it settles to the correct "Queue"/"Connect to a device" value a moment later; checking the label on that first tick would misread a legitimate Queue/Connect open as an unauthorized NPV open. `isNpvOpen()`/`isQueueOpen()`/`isConnectOpen()` are still used throughout - by `clickNP()` and the album art/Queue/Connect listeners, to work out whether a given click is opening or closing that specific panel, and by the guard's own `dbg()` diagnostics - just no longer to decide whether `panelGuardObserver` auto-closes something.      
c) Since the panel's own in-panel close button closes it through Spotify's native handler directly and never touches this script's `closeNowPlay()`, the observer also watches for a genuine open-to-closed transition and clears a lingering authorized flag the moment it sees one that didn't go through `closeNowPlay()`, so a later, unrelated native open (a playlist auto-opening NPV, say) isn't wrongly trusted just because the previous session was never explicitly closed.         
d) `setupNpvButton()` also runs its own cleanup check the moment it inserts `npBtn`, closing anything already left open from before the guard existed. It deliberately checks the same way `panelGuardObserver` does - `isAnyPanelOpen()`/`isAnyPanelAuthorized()` - rather than checking `isNpvOpen()` specifically. The reason: this cleanup only ever runs once, right when `npBtn` first gets inserted, and if that moment happens to coincide with someone freshly opening Queue or Connect, `isNpvOpen()` could get fooled by the same stale label issue from (b) - it would see the generic "Now playing view" label still lingering and wrongly conclude NPV was open, and then close the Queue/Connect panel the person just opened on purpose. Checking "is *any* panel open, and was it authorized" instead avoids that entirely. Separately, the cold-load setup poll itself doesn't stop until it's wired all four triggers - `npBtn`, album art, Queue, and Connect - since the latter two can take longer to become reliably queryable than the player-bar elements, and stopping early would leave them stuck on Spotify's own native, unauthorized handling for the rest of the session.      
*(Mobile's own old poll-stop condition only ever checked for `npBtn`/album art [and compact-mode readiness], never for the Queue/Connect listeners `setupOtherPanelTriggers()` adds - so on a load where those two rendered before Queue/Connect's attributes became queryable, the poll would stop early and leave Queue/Connect stuck on Spotify's native, unauthorized handling for the rest of the session. This "require all four" fix was ported over from SpotiwebJS to close that gap.)*     
e) `npBtn` also shows whether NPV specifically is open right now - a green icon plus a small dot underneath, values chosen to match the small indicator dot Spotify's own toggle used to show. This isn't set at click time by `npBtn`'s own handler; it's kept in sync by the same `panelGuardObserver` mutation callback that drives everything else above, reading straight off `userOpenedNPV` rather than off Spotify's DOM/aria-label (for the same reason as (b) - that label can't reliably tell NPV apart from a freshly-opening Queue/Connect on the first tick), so the icon only ever turns green when NPV specifically, not Queue or Connect, was the thing authorized open, and it re-syncs on its own the moment Spotify's real DOM changes rather than needing another click to catch up. `npBtn` is built once by cloning the lyrics button's own classes, which is what gives it Spotify's real button sizing, padding, and hover/focus feedback for free instead of needing to be hand-styled from scratch - but its resting-state color, and the dot's presence, are pinned directly by this script's own CSS with `!important` rather than left to whatever classes happen to be riding along on that clone. That matters because those classes are Spotify's own internal, hashed build output, not a stable public API - they can be renamed on any Spotify deploy - and if `npBtn` happened to be cloned at the exact moment the lyrics button was transiently carrying whatever class Spotify currently uses to mark that state, Spotify's own stylesheet would style `npBtn` off of that instead of anything this script controls, making the icon look "open" even while NPV is genuinely closed. The green/active-state color and the dot itself don't need that same `!important` treatment: the cloned Spotify classes on `npBtn` are only ever set once, at that same clone moment, and never touched again afterward (only `npBtn`'s own `.active` class keeps changing, via `classList.toggle`) - so the only way a leaked class could ever be present at all is if NPV genuinely was open at clone time, in which case the leaked class and a later authorized `.active` toggle both agree the icon should be green, rather than fighting over it. The resting state is the only one a leaked class can actually contradict, which is exactly the state pinned with `!important`.    

The native miniplayer/PiP toggle and the native fullscreen toggle are also hidden.

### AMOLED mode

Pure-black AMOLED theme, ported from the same Spotifuck apk (`r0/e.java` line 207) - also later carried over into SpotiwebJS. Forces the player bar and the app's dark-theme background variables to pure black. Always on, not tied to either spoof toggle. Later widened to cover the Library overlay and some other overlays which would previously fail to inherit the style and fall back to Spotify's default dark gray theme.

### Force English

Originally added in v6.3 of spotifuck-mobile.user.js as the browser-side equivalent of the reverse-engineered Spotifuck app's own locale-forcing (its `ForceEn` behavior, which forces the app's Android Configuration locale to English before loading its WebView) - there's no app Configuration to set in a browser, so this spoofs `navigator.language`/`navigator.languages` to `en-US` at document-start, redirects `www.spotify.com` off non-English `xx-yy` region-language paths (e.g. `/si-sl/` &rarr; `/si-en/`) and off `/intl-xx/` prefixes, and flips the account's actual language setting at `open.spotify.com/preferences` through a hidden iframe - then verifies the change stuck on the next load and retries a capped number of times if it didn't. The region-code table this relies on (which countries have no English storefront, which ones use a bare country code for English, etc.) is hand-checked against Spotify's own `/spotify.com/select-your-country-region/` listing and then ported back here, replacing the script's own initially smaller allowlist. The `www.spotify.com` region-path redirect is gated behind the "Visual Premium Spoof (www.spotify.com)" toggle - turning that off also stops this redirect. The `/intl-xx/` URL correction and the account-setting flip don't run immediately at document-start; they wait for the player's Play/Pause button (or, for signed-out sessions, the `sign-up bar` prompt) to actually exist first, since running that correction before Spotify's own SPA has started hydrating could leave the page stuck mid-load.

Everything else here is keyed off English aria-labels, so without this the script just silently stops matching on non-English accounts.

### Visual Premium Spoof

Adopted from SpotiwebJS/kitbodega's original SpotiKit code and extended independently since. Rewrites the free-tier UI to look like a Premium account: swaps "Free"/"Spotify Free"/"Free plan" text for "Premium Individual" and "1 Free account" copy for "1 Premium account" wherever it appears in headings, spans, badges, and plan cards, recoloring the matched elements pink. Relabels "Get/Buy/Join Premium" buttons to a disabled "DONT JOIN PREMIUM", and "Explore/View plans" to a disabled "Manage plan" - both click-blocked, not just relabeled. Hides the upgrade button, the install-app link, "Premium Plans" menu links, and any "Try"-prefixed buttons, and turns empty/"—"/"No"/"Free"-containing pricing-table cells into green checkmarks. Rebuilds the account page's compact upgrade banner into "Edit profile"/"Payment method" buttons that link to the account's own region-correct URL (`https://www.spotify.com/<region>/account/...`, derived from the account's actual locale rather than hardcoded), instead of an upgrade nag. On `www.spotify.com`'s Premium/Duo/Student/Family plan pages, replaces the entire page content with a "You dont need Spotify Premium. Trust me." message and a link home, and on `payments.spotify.com`, replaces the checkout page with a "DONT WASTE YOUR MONEY ON SPOTIFY" message and disables the checkout/payment buttons (forms, submit buttons, and the "Add new card" button) so they no-op instead of submitting. The "Add new card" button is also blocked separately on `www.spotify.com`'s own account payment-methods page (`/account/payment-methods/`, aliased with `/account/saved-payment-cards/`), since that's a different host than the checkout blocker above and needs its own gate.

Toggleable per site (one switch for `open.spotify.com`, a second for `www.spotify.com` **and** `payments.spotify.com` together) from the userscript-manager menu, saved via GM storage, enabled by default.

### Ad-Slot Cleanup (DOM only, doesn't touch actual audio ads)

Removes ad-slot-container elements (and a couple of specific ad-button classes) from the DOM on `open.spotify.com`, via a `MutationObserver` on `document.body`. Cosmetic only - ordinary ad-blocker-style DOM removal, not a way around anything server-enforced (bitrate, offline downloads, skip limits) - and doesn't touch the actual audio ad requests (see [Ad-Blocking (actual audio ads)](#ad-blocking-actual-audio-ads) below for that). Ships bundled with the premium spoof and is gated behind the same "Visual Premium Spoof (open.spotify.com)" toggle - turning that off also turns this off.

### Play/Pause reliability fix

A watchdog ported from the original Android mod (`firstFuck`/`addCSSJSHack` in `r0/e.java`) that can force-unstick the Play/Pause button if it's still showing "Play" a while after being clicked - a quirk carried over from the source APK, not a Spotify Web Player bug this script otherwise causes.

### Library folder-navigation fix

The original Spotifuck behavior auto-closed the library on any item selection, including folders; this version specifically detects folder clicks (via their `aria-labelledby`/`aria-describedby` containing a `:folder:` marker) and keeps the library open for those while still auto-closing for actual tracks/albums/playlists.

### Debug Logging & Replacement Log

Every text swap the premium spoof makes is recorded (selector, before/after text, times applied); a "📋 Show everything replaced so far" menu command dumps it as a table in the console. Separately, a "Debug Logging (console)" menu toggle (off by default) turns on verbose `[SPFDBG]` console logging for every click handler, selector match, and state change the script makes - filter your browser console by `SPFDBG` to isolate it.

### Efficient Scanning

The text-replacement pass only re-scans nodes that actually changed (via a debounced `MutationObserver` watching both added/removed nodes and in-place text updates), not a blind full-page walk on a timer.

### Globals for scripting/automation

`window.switchLs(source)` toggles the library overlay open/closed, and `window.closeNowPlay(source)` force-closes the Now Playing/Queue/Connect panel if open - these two are meant for communication with other scripts (at the moment with the Spotify Web Lyrics+ userscript) or manual console use. The script also assigns `window.firstFuck`/`window.addCSSJSHack` (its own internal init/monitoring loop, ported 1:1 from the Android APK's naming) and caches `window.pBtn`/`window.lBtn` (the current play/pause and library button elements) on `window` - these exist for internal reasons rather than as a public API, and shouldn't be relied on the way `switchLs`/`closeNowPlay` can be. Separately, it publishes `__spReservedInsets` (`{ bottom, bottomNav }`, the combined and nav-only heights of the fixed bottom nav/player strip) and fires a `sp-reserved-insets-change` event whenever that value changes - written through `unsafeWindow` rather than plain `window` so it's actually visible to other sandboxed userscripts, currently consumed by the Spotify Web Lyrics+ userscript (pip-gui-stable.user.js) to keep its floating PiP popup from being dragged, resized, or restored underneath the reserved area. The script does not expose separate play/pause/skip/seek or now-playing-status functions - playback itself is still driven entirely through Spotify's own player.

## Installation

### a) QUETTA BROWSER + USER-AGENT SWITCHER AND MANAGER METHOD:
> Credits to: [u/soujunim/](https://www.reddit.com/r/SpotifyLatestModAPK/comments/1upaed1/mobile_browser_spotifuck_ui_and_adblock/)
>
> 1. Download and install the Quetta Browser.
> 2. Quetta Browser > Open Spotify Web and login to your account
> 3. Press on the three dots next to the search bar's tab counter.
> 4. Go to Settings > Appearance > Disable 'Enhance Dark Theme'. Now exit the Settings.
> 5. Once again press on the three dots next to the search bar's tab counter.
> 6. Click on the Extensions tab > Manage Extensions > Search Extensions and get the following:
> 'Violentmonkey', 'User-Agent Switcher and Manager', 'Spotify Ad-Blocker (Blockify)'
> 7. Backup ad-blocking extension: [uSpot - Spotify Ad Blocker](https://github.com/Myst1cX/uSpot/releases)
> Click [here](https://github.com/Myst1cX/uSpot/blob/main/README.md) for installation steps.
> 8. NOTE: Keep only 1 ad-blocking extension enabled at the same time.
> 9. NOTE: Make sure to disable Quetta's own adblock for open.spotify.com so that it doesn't interfere with the installed adblock extension. Press on the three dots next to the search bar's tab counter > Click on the privacy guard (shield icon with a lock inside) > Turn off 'Blocker on This Site'.
> 10. Optional - for a lyrics translator inside the stock spotify lyrics view: [Cigi Spotify Translator (fork)](https://raw.githubusercontent.com/Myst1cX/cigi-spotify-translator-fork/main/cigi-spotify-translator-fork.user.js).
> Click [here](https://github.com/Myst1cX/cigi-spotify-translator-fork/blob/main/README.md) for the setup and feature list.
> 11. Optional: [Spotify Lyrics+](https://raw.githubusercontent.com/Myst1cX/spotify-web-lyrics-plus/main/pip-gui-stable.user.js). Click [here](https://github.com/Myst1cX/spotify-web-lyrics-plus/blob/main/README.md) for the setup and feature list.
> 12. Install [Spotifuck Mobile](https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-mobile.user.js).
> 13. Open the Spotify web player > Press on the three dots next to the search bar's tab counter > Click on the Extensions tab > Click on the 'User-Agent Switcher and Manager' extension icon > Select the first option (a Chrome Windows 10 user agent) > Click 'Apply (this tab' and then 'Refresh Tab'.
> 14. Spotify web player should reload. The interface should now be mobile-friendly.
> 15. NOTE: Keep Desktop Mode (browser setting) disabled.

* * *

### b) LEGACY FIREFOX BROWSER + CHAMELEON EXTENSION METHOD (SLOWER, LESS RESPONSIVE):
> 1. Download the latest version of Firefox (must be the Original version; Nightly or other releases might break your userscript manager).
> 2. Install [Violentmonkey](https://violentmonkey.github.io/)
> 3. Recommended: [Ublock Origin](https://addons.mozilla.org/en-US/firefox/addon/ublock-origin/)
> 4. Alternative to Ublock Origin for blocking Spotify ads: [uSpot - Spotify Ad Blocker](https://github.com/Myst1cX/uSpot/releases). Click [here](https://github.com/Myst1cX/uSpot/blob/main/README.md) for installation steps.
> 5. Optional - for the lyrics translator inside the stock spotify lyrics view: [Cigi Spotify Translator (fork)](https://raw.githubusercontent.com/Myst1cX/cigi-spotify-translator-fork/main/cigi-spotify-translator-fork.user.js).
> Click [here](https://github.com/Myst1cX/cigi-spotify-translator-fork/blob/main/README.md) for the setup and feature list.
> 6. Optional: [Spotify Lyrics+](https://raw.githubusercontent.com/Myst1cX/spotify-web-lyrics-plus/main/pip-gui-stable.user.js). Click [here](https://github.com/Myst1cX/spotify-web-lyrics-plus/blob/main/README.md) for the setup and feature list.
> 7. Install [Spotifuck Mobile](https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-mobile.user.js).
> 8. Install [Chameleon](https://addons.mozilla.org/en-US/android/addon/chameleon-ext/) extension
> 9. Chameleon extension settings > Profile Panel (globe icon) > Select Random Profile (Desktop)
> 10. Chameleon extension settings > Options Panel > Select the 'Profile' option under the 'Screen size' option
> 11. Go back to Firefox browser > Firefox Settings > Site settings > Click on "DRM-controlled content" and select "Allowed"
> 12. Restart Firefox
> 13. Open Spotify Web and login to your account
> 14. The interface should be mobile friendly > If it ever resets, try redoing the Chameleon extension configuration and refreshing the Spotify page
> 15. NOTE: Keep Desktop Mode (browser setting) disabled.
> 16. Play a song
> 17. Click on the Lyrics+ button to open the interface popup and see the song lyrics

* * *

> **TIP**: Add Spotify Web Player to your home screen for a PWA-like experience. PWA (Priority Web Application) gives you an easy access shortcut to the Spotify player.
> **SIDE NOTE**: You can begin playing a song in the web interface and then open the Spotify app - it will let you play music there and control playback without any limitations.

* * *

> REMEMBER: PWA's essentially allow running an entire app in your web browser.
> A good way of finding progressive web apps is through `store.app`
> The degree to which you can block ads varies depending on the app, but it is often times better than using the actual app - a PWA also uses less storage than installing a native app.

* * *

## Ad-Blocking (actual audio ads)

> Spotifuck Mobile doesn't block the ad audio itself - the ad-slot removal function is just DOM cleanup. Aims to remove Spotify's client-side ad-slot container (data-testid="ad-slot-container"), related ad-* UI wrappers, and an associated button from the DOM as they appear, using a MutationObserver. For true audio ad blocking, use a reliable adblocker depending on yoor browser. On Firefox and its non-chromium forks (no MV3 support), use: **[uBlock Origin](https://addons.mozilla.org/en-US/firefox/addon/ublock-origin/)** or **[uSpot](https://github.com/Myst1cX/uSpot/releases/)** alongside it. More on the difference [here](https://github.com/Myst1cX/uSpot/blob/main/README.md#uspot-vs-ublock-origin-what-is-the-difference). On Chromium browsers without MV2 support (MV3 only), use: **[Spotify Ad Blocker - Blockify](https://chromewebstore.google.com/detail/spotify-ad-blocker-blocki/nfmlkliedggdodlbgghmmchhgckjoaml).**

## Notes

> - Client-side only, doesn't touch Spotify's servers.
> - Doesn't change any account data except the language setting, and only if Force English needs to flip it.
> - Needs a userscript manager (Tampermonkey or Violentmonkey preferably).
> - This is the mobile-layout option.

## Feedback

> Open an issue at [https://github.com/Myst1cX/spotifuck-userscript/issues](https://github.com/Myst1cX/spotifuck-userscript/issues)

## Credits

1. **Ported from** [Spotifuck](https://4pda.to/forum/index.php?showtopic=248440&view=findpost&p=137957887), the original Android mod (reverse-engineered from `r0/e.java`) - the mobile UI hacks (bottom nav's underlying toggle logic, full-screen library), the Play/Pause reliability watchdog, the Now Playing View button toggle, AMOLED mode, and the original Force English implementation all trace back to it. The Now Playing View guard, AMOLED mode, and Force English were later carried over into SpotiwebJS as well; Force English's region-code table was in turn refined there and ported back here.
2. **Bottom nav bar layout and Compact player mode ported from** [kitbodega/SpotiKit](https://github.com/kitbodega/SpotiKit)'s mobile layout and its `#sp-player-toggle`/`.minimized` feature respectively.
3. **Visual Premium Spoof and Ad-Slot Cleanup adopted from** SpotiwebJS, which itself builds on kitbodega's original SpotiKit code - credited directly in this script's own changelog.
4. All porting, adaptation, and independent extensions by Myst1cX.
5. **Powered by** [Spotify](https://open.spotify.com/).

## License

> Licensed under the [MIT License](https://github.com/Myst1cX/spotifuck-userscript/blob/main/LICENSE).
