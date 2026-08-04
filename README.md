## Spotifuck Mobile

A userscript that ports the Spotifuck Android mod's mobile UI (bottom nav, full-screen library) and playback-reliability fixes onto the Spotify Web Player, adds a compact player mode ported separately from kitbodega/SpotiKit, and layers a full premium-spoof/ad-cleanup/Force-English engine on top. Works on an actual phone browser or on desktop if you just prefer the mobile-style layout.

> **Recommended userscript manager:** [Violentmonkey](https://violentmonkey.github.io/) or [Tampermonkey](https://www.tampermonkey.net/)    
> Want a desktop version?    
> See [SpotiwebJS](https://github.com/Myst1cX/spotifuck-userscript/blob/main/spotiwebjs/README.md) in this same repo. (fix link later)

## Index

- [Features](#features)
  - [Mobile-like layout](#mobile-like-layout)
  - [Compact player mode](#compact-player-mode)
  - [Now Playing View button restoration & guard system](#now-playing-view-button-restoration--guard-system)
  - [AMOLED mode](#amoled-mode)
  - [Force English](#force-english)
  - [Visual Premium Spoof](#visual-premium-spoof)
  - [Ad-Slot Cleanup (DOM only, doesn't touch actual audio ads)](#ad-slot-cleanup)
  - [Play/Pause reliability fix](#playpause-reliability-fix)
  - [Library folder-navigation fix](#library-folder-navigation-fix)
  - [Debug Logging & Replacement Log](#debug-logging--replacement-log)
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

Ported from the reverse-engineered Spotifuck Android APK (`r0/e.java`), with the bottom nav bar itself ported from kitbodega/SpotiKit's own mobile layout:

- A fixed Home/Search/Library bottom nav bar. Home and Search navigate via `history.pushState`; Library performs a real click on Spotify's own native library toggle (routed through one shared, guarded function so manual clicks, the auto-close-on-playlist trigger, and the nav tab itself can never end up double-firing on the button).
- The native sidebar is hidden by default and only appears as a full-screen overlay while the library is open; it auto-closes when you tap into a track, album, or playlist, but **not** when you tap into a folder, so browsing into a playlist still works (see [Library folder-navigation fix](#library-folder-navigation-fix)).
- The native top header (home icon, bell, upgrade button, profile menu) and the native search input are hidden by default and only shown while the bottom nav's Search tab is active.
- The now-playing player sits fixed just above the nav bar, and `#main-view`'s height tracks the player's live-measured height via `ResizeObserver`, so scrollable content never runs behind the player or the nav.
- Library-open state persists across in-app navigation for the current page load and auto-closes if you switch to Home/Search while it's open.

### Compact player mode

A thin toggle strip pinned to the player bar, ported from kitbodega/SpotiKit's `#sp-player-toggle`/`.minimized` feature and adapted to this script's fixed full-width bottom bar layout.
Collapses the player down to artwork, title/artist, the Play/Pause button, and the library-action button - "Add to Liked Songs" / "Add to playlist" / "Add to Your Episodes" / "Remove recommendation" for Smart Shuffle tracks, whichever currently applies - plus a thin draggable scrubber; the rest of the secondary controls (Queue, Connect, volume, PiP, fullscreen, NPV, lyrics) stay hidden along with the progress bar. Play/Pause is the real full-player button, physically reparented into the strip rather than cloned, so it keeps its own listeners/icon/aria state automatically; the library-action slot is a React-owned node that can't be moved the same way, so it gets a synthetic proxy kept in sync by a `MutationObserver` on `now-playing-widget` instead (rebuilt whenever the track changes or the liked-state morphs, so it never goes stale or forwards a click to the wrong button). The Smart Shuffle `enhance-badge` is realigned against the artist text via a live `getBoundingClientRect()`-measured `translateY()`, recalculated on every track change, in both compact and full player. Your last-picked mode (compact or full) is remembered across reloads via GM storage - kitbodega/SpotiKit's own version has no such persistence at all, so it resets on every page load.

### Now Playing View button restoration & guard system

The old `Now Playing View` button toggle was ported directly from the reverse-engineered Spotifuck APK (`r0/e.java`) and enrichened with a guard system that assures only authorized clicks open the `Now Playing View` panel. Panel-toggle logic - `clickNP()`/`closeNowPlay()`/`isNpvOpen()`/`npvGuardObserver` - later carried over into SpotiwebJS as well. Adds the Now Playing View button next to the lyrics button (the old npv button's position), which replaces Spotify's new sidebar strip native toggle (that now gets auto-closed). Only clicks through that button, or the player-bar album art (considered a native toggle aswell), are treated as authorized opens - a `MutationObserver` auto-closes the panel any other time it becomes visible (on page load, if activated by a stray native toggle/track change/another script...). `isNpvOpen()` reads the shared right-side panel container's own `aria-label`/class directly (`"Now playing view"`/`.NowPlayingView` vs `"Queue"` vs `"Connect to a device"`) rather than querying into it, and a separate short-lived guard window covers real Queue/Connect clicks, so the panel guard doesn't mistake either of those for an unauthorized Now Playing View open and close them by accident. The native miniplayer/PiP toggle button is also hidden.

### AMOLED mode

Pure-black AMOLED theme, ported from the same Spotifuck apk (`r0/e.java` line 207) - also later carried over into SpotiwebJS. Forces the player bar and the app's dark-theme background variables to pure black. Always on, not tied to either spoof toggle. Later widened to cover the Library overlay which would previously fail to inherit the style and fall back to Spotify's default dark gray theme.

### Force English

Originally added in v6.3 of spotifuck-mobile.user.js as the browser-side equivalent of the reverse-engineered Spotifuck app's own locale-forcing (its `ForceEn` behavior, which forces the app's Android Configuration locale to English before loading its WebView) - there's no app Configuration to set in a browser, so this spoofs `navigator.language`/`navigator.languages` to `en-US` at document-start, redirects `www.spotify.com` off non-English `xx-yy` region-language paths (e.g. `/si-sl/` &rarr; `/si-en/`) and off `/intl-xx/` prefixes, and flips the account's actual language setting at `open.spotify.com/preferences` through a hidden iframe - then verifies the change stuck on the next load and retries a capped number of times if it didn't. The region-code table this relies on (which countries have no English storefront, which ones use a bare country code for English, etc.) is hand-checked against Spotify's own `/spotify.com/select-your-country-region/` listing and then ported back here, replacing the script's own initially smaller allowlist. The `www.spotify.com` region-path redirect is gated behind the "Visual Premium Spoof (www.spotify.com)" toggle - turning that off also stops this redirect. The `/intl-xx/` URL correction and the account-setting flip don't run immediately at document-start; they wait for the player's Play/Pause button (or, for signed-out sessions, the `sign-up bar` prompt) to actually exist first, since running that correction before Spotify's own SPA has started hydrating could leave the page stuck mid-load.

Everything else here is keyed off English aria-labels, so without this the script just silently stops matching on non-English accounts.

### Visual Premium Spoof

Adopted from SpotiwebJS/kitbodega's original SpotiKit code and extended independently since. Rewrites the free-tier UI to look like a Premium account: swaps "Free"/"Spotify Free"/"Free plan" text for "Premium Individual" and "1 Free account" copy for "1 Premium account" wherever it appears in headings, spans, badges, and plan cards, recoloring the matched elements pink. Relabels "Get/Buy/Join Premium" buttons to a disabled "DONT JOIN PREMIUM", and "Explore/View plans" to a disabled "Manage plan" - both click-blocked, not just relabeled. Hides the upgrade button, the install-app link, "Premium Plans" menu links, and any "Try"-prefixed buttons, and turns empty/"—"/"No"/"Free"-containing pricing-table cells into green checkmarks. Rebuilds the account page's compact upgrade banner into "Edit profile"/"Payment method" buttons that link to the account's own region-correct URL (`https://www.spotify.com/<region>/account/...`, derived from the account's actual locale rather than hardcoded), instead of an upgrade nag. On `www.spotify.com`'s Premium/Duo/Student/Family plan pages, replaces the entire page content with a "You dont need Spotify Premium. Trust me." message and a link home, and on `payments.spotify.com`, replaces the checkout page with a "DONT WASTE YOUR MONEY ON SPOTIFY" message and disables the checkout/payment buttons (forms, submit buttons, and the "Add new card" button) so they no-op instead of submitting. The "Add new card" button is also blocked separately on `www.spotify.com`'s own account payment-methods page (`/account/payment-methods/`, aliased with `/account/saved-payment-cards/`), since that's a different host than the checkout blocker above and needs its own gate.

Toggleable per site (one switch for `open.spotify.com`, a second for `www.spotify.com` **and** `payments.spotify.com` together) from the userscript-manager menu, saved via GM storage, enabled by default.

### Ad-Slot Cleanup

Removes ad-slot-container elements (and a couple of specific ad-button classes) from the DOM on `open.spotify.com`, via a `MutationObserver` on `document.body`. Cosmetic only - doesn't touch the actual audio ad requests (see [Ad-Blocking (actual audio ads)](#ad-blocking-actual-audio-ads) below for that). Ships bundled with the premium spoof and is gated behind the same "Visual Premium Spoof (open.spotify.com)" toggle - turning that off also turns this off.

### Play/Pause reliability fix

A watchdog ported from the original Android mod (`firstFuck`/`addCSSJSHack` in `r0/e.java`) that can force-unstick the Play/Pause button if it's still showing "Play" a while after being clicked - a quirk carried over from the source APK, not a Spotify Web Player bug this script otherwise causes.

### Library folder-navigation fix

The original Spotifuck behavior auto-closed the library on any item selection, including folders; this version specifically detects folder clicks (via their `aria-labelledby`/`aria-describedby` containing a `:folder:` marker) and keeps the library open for those while still auto-closing for actual tracks/albums/playlists.

### Debug Logging & Replacement Log

Every text swap the premium spoof makes is recorded (selector, before/after text, times applied); a "📋 Show everything replaced so far" menu command dumps it as a table in the console. Separately, a "Debug Logging (console)" menu toggle (off by default) turns on verbose `[SPFDBG]` console logging for every click handler, selector match, and state change the script makes - filter your browser console by `SPFDBG` to isolate it.

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

> Spotifuck Mobile doesn't block the audio ads themselves - the ad-slot removal function is just DOM cleanup. Aims to remove Spotify's client-side ad-slot container (data-testid="ad-slot-container"), related ad-* UI wrappers, and an associated button from the DOM as they appear, using a MutationObserver. For true audio ad blocking, use a reliable adblocker depending on yoor browser. On Firefox and its non-chromium forks (no MV3 support), use: **[uBlock Origin](https://addons.mozilla.org/en-US/firefox/addon/ublock-origin/)** or **[uSpot](https://github.com/Myst1cX/uSpot/releases/)** alongside it. More on the difference [here](https://github.com/Myst1cX/uSpot/blob/main/README.md#uspot-vs-ublock-origin-what-is-the-difference). On Chromium browsers without MV2 support (MV3 only), use: **[Spotify Ad Blocker - Blockify](https://chromewebstore.google.com/detail/spotify-ad-blocker-blocki/nfmlkliedggdodlbgghmmchhgckjoaml).**

## Notes

> - Client-side only, doesn't touch Spotify's servers.
> - Doesn't change any account data except the language setting, and only if Force English needs to flip it.
> - Needs a userscript manager (Tampermonkey or Violentmonkey preferably).
> - This is the mobile-layout option. For the plain desktop web player with no layout changes, see [SpotiwebJS](https://github.com/Myst1cX/spotifuck-userscript/blob/main/spotiwebjs/README.md).

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
