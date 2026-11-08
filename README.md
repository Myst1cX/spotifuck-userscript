## Spotifuck Mobile

_Applies to script version **7.37**._

A mobile-layout userscript for the Spotify Web Player: ports the Spotifuck Android mod's mobile UI (bottom nav, full-screen library) and playback-reliability fixes onto the Spotify Web Player, adds a compact player mode ported separately from kitbodega/SpotiKit, and layers a premium-spoof/Force-English engine, a pill-style toast look, a hover marquee for long titles, and an AMOLED theme on top. Works on an actual phone browser or on desktop if you just prefer the mobile-style layout.

> **Recommended userscript manager:** [Violentmonkey](https://violentmonkey.github.io/) or [Tampermonkey](https://www.tampermonkey.net/)    
> Want a desktop version?    
> See [SpotiwebJS](https://github.com/Myst1cX/SpotiKit/blob/main/README.md) in this same repo.

## Index

- [Features](#features)
  - [Mobile-like layout](#mobile-like-layout)
  - [Compact player mode](#compact-player-mode)
  - [Now Playing View, Queue, and Connect panel guard system](#now-playing-view-queue-and-connect-panel-guard-system)
  - [AMOLED mode](#amoled-mode)
  - [Toast style](#toast-style)
  - [Title/artist marquee](#titleartist-marquee)
  - [Reduced motion and lyrics-flash fix](#reduced-motion-and-lyrics-flash-fix)
  - [Force English](#force-english)
  - [Visual Premium Spoof](#visual-premium-spoof)
  - [Play/Pause reliability fix](#playpause-reliability-fix)
  - [Library folder-navigation fix](#library-folder-navigation-fix)
  - [Debug Logging & Replacement Log](#debug-logging--replacement-log)
  - [Efficient Scanning](#efficient-scanning)
  - [Globals for scripting/automation](#globals-for-scriptingautomation)
  - [Spotify Web app integration (`window.AndBridge`)](#spotify-web-app-integration-windowandbridge)
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
- The now-playing player sits fixed just above the bottom nav bar, and `#main-view`'s height tracks the player's live-measured height via `ResizeObserver`, so scrollable content never runs behind the player or the nav. On the Search tab, where Spotify lays its top nav out as a real 48px row, that row's live height (`--sp-gnav-height`) is subtracted too, so the view doesn't overhang the player.
- The open library overlay is capped at the screen height minus the player's current height minus the 56px nav, so the bottom of the list is never hidden behind the player or nav (and the player stays visible while the library is open).
- Spotify's confirmation toasts ("Added to queue" etc.) are lifted to sit above the player and nav instead of being hidden behind them (see [Toast style](#toast-style)).
- On page load the library is expanded and collapsed once, invisibly, so its virtualized list doesn't measure itself as zero-size the first time you really open it.
- Library-open state persists across in-app navigation for the current page load and auto-closes if you switch to Home/Search while it's open.

### Compact player mode

A thin toggle strip pinned to the player bar, ported from kitbodega/SpotiKit's `#sp-player-toggle`/`.minimized` feature and adapted to this script's fixed full-width bottom bar layout.
Collapses the player down to artwork, title/artist, the Play/Pause button, and the library-action button - "Add to Liked Songs" / "Add to playlist" / "Add to Your Episodes" / "Remove recommendation" for Smart Shuffle tracks, whichever currently applies - plus a thin draggable scrubber; the rest of the secondary controls (Queue, Connect, volume, PiP, fullscreen, NPV, lyrics) stay hidden along with the progress bar. Play/Pause is the real full-player button, physically reparented into the strip rather than cloned, so it keeps its own listeners/icon/aria state automatically; the library-action slot is a React-owned node that can't be moved the same way, so it gets a synthetic proxy kept in sync by a `MutationObserver` on `now-playing-widget-v2` instead (rebuilt whenever the track changes or the liked-state morphs, so it never goes stale or forwards a click to the wrong button). The Smart Shuffle `enhance-badge` is realigned against the artist text via a live `getBoundingClientRect()`-measured `translateY()`, recalculated on every track change, in both compact and full player. Your last-picked mode (compact or full) is remembered across reloads via GM storage - kitbodega/SpotiKit's own version has no such persistence at all, so it resets on every page load.

Compact mode is also hardened against Spotify's re-renders and slow launches: the expanded bar is pre-hidden at load while compact is on (so it never flashes first; a failsafe drops the pre-hide after 8s if compact never takes over), the compact state is tracked by the script and re-applied if Spotify's re-render wipes the player's class attribute (which used to leave two "Add to playlist" checks and no play button), and if React re-renders the controls and leaves the moved Play/Pause button as a dead copy, the live one is detected and moved into the strip. In the full player, the track row keeps a minimum height so the bar no longer shrinks and jumps back while Spotify empties the widget on a track change, and the "Playing on X device" banner is no longer squeezed.

### Now Playing View, Queue, and Connect panel guard system

The old `Now Playing View` button toggle was ported directly from the reverse-engineered Spotifuck APK (`r0/e.java`) and enrichened with a guard system. `npBtn` is that restored toggle, built to sit and look exactly where the button used to live, next to the lyrics button - it exists specifically to replace Spotify's own current native arrow toggle in the sidebar, which is redundant now and gets hidden separately: a CSS block (`styleId 'npv-guard-hide-native-toggle-style'`) squeezes the ancestor region that native arrow lives in down to zero effective width and force-expands the freed space to `100vw`. That `100vw` expansion is left unscoped on purpose (unlike SpotiwebJS's desktop equivalent, which scopes it behind `html:not(.fuckd-panel-open)` and therefore still sets that class, which this script no longer does) so it keeps applying while a panel is genuinely open too - on mobile that's what makes NPV/Queue/Connect take over the whole viewport instead of docking at their native sidebar-panel size. The guard itself treats Now Playing View, Queue, and Connect to a Device as three interchangeable panels sharing a single DOM slot, and authorizes opens/closes per-panel instead of only recognizing NPV.   
a) Because `npBtn` is our own restored button rather than a live Spotify control, nothing else is listening for clicks on it - so clicking it just calls our own `clickNP()`, which does two things back-to-back: first it tells the guard this open/close is authorized (`setAuthorizedPanel('npv'|null)`), then it clicks Spotify's actual (hidden) native toggle button on the person's behalf to make the panel really open or close. Since both steps are our own code running one after the other, there's no race to worry about. The Queue button and the Connect button are different - those are Spotify's real, currently-live buttons, already wired with Spotify's own click handler, so our script adds one more listener on top rather than replacing anything. The player-bar album art works the same way, except the listener is delegated from the persistent `now-playing-widget-v2` container (checking that the click landed on `cover-art-button`) rather than attached to the button itself, because React can replace that button on a track change and take a direct listener with it. That extra listener runs in the capture phase (`{ capture: true }`), which always fires before the normal listener Spotify itself uses, and calls `setAuthorizedPanel('npv'|'queue'|'connect'|null)` there - the panel name if this click is about to open it, `null` if it's about to close whichever one is currently open - so the guard already knows it was authorized a beat before Spotify's own handler even starts opening the panel.    
b) `panelGuardObserver` (renamed from `npvGuardObserver` once it grew to cover all three) decides whether to auto-close a panel purely from whether the shared container is open at all (`isAnyPanelOpen()`, read off its `inert` attribute) and whether any of the three was authorized (`isAnyPanelAuthorized()`) - not from label-matching against a specific panel type, because Spotify briefly renders the shared container with its default "Now playing view" label for the very first tick after Queue or Connect opens too, before it settles to the correct "Queue"/"Connect to a device" value a moment later; checking the label on that first tick would misread a legitimate Queue/Connect open as an unauthorized NPV open. `isNpvOpen()`/`isQueueOpen()`/`isConnectOpen()` are still used throughout - by `clickNP()` and the album art/Queue/Connect listeners, to work out whether a given click is opening or closing that specific panel, and by the guard's own `dbg()` diagnostics - just no longer to decide whether `panelGuardObserver` auto-closes something.      
c) Since the panel's own in-panel close button closes it through Spotify's native handler directly and never touches this script's `closeNowPlay()`, the observer also watches for a genuine open-to-closed transition and clears a lingering authorized flag the moment it sees one that didn't go through `closeNowPlay()`, so a later, unrelated native open (a playlist auto-opening NPV, say) isn't wrongly trusted just because the previous session was never explicitly closed.         
d) `setupNpvButton()` also runs its own cleanup check the moment it inserts `npBtn`, closing anything already left open from before the guard existed. It deliberately checks the same way `panelGuardObserver` does - `isAnyPanelOpen()`/`isAnyPanelAuthorized()` - rather than checking `isNpvOpen()` specifically. The reason: this cleanup only ever runs once, right when `npBtn` first gets inserted, and if that moment happens to coincide with someone freshly opening Queue or Connect, `isNpvOpen()` could get fooled by the same stale label issue from (b) - it would see the generic "Now playing view" label still lingering and wrongly conclude NPV was open, and then close the Queue/Connect panel the person just opened on purpose. Checking "is *any* panel open, and was it authorized" instead avoids that entirely. Separately, the cold-load setup poll itself doesn't stop until it's wired all four triggers - `npBtn`, album art, Queue, and Connect - since the latter two can take longer to become reliably queryable than the player-bar elements, and stopping early would leave them stuck on Spotify's own native, unauthorized handling for the rest of the session.      
*(Mobile's own old poll-stop condition only ever checked for `npBtn`/album art [and compact-mode readiness], never for the Queue/Connect listeners `setupOtherPanelTriggers()` adds - so on a load where those two rendered before Queue/Connect's attributes became queryable, the poll would stop early and leave Queue/Connect stuck on Spotify's native, unauthorized handling for the rest of the session. This "require all four" fix was ported over from SpotiwebJS to close that gap.)*     
e) `npBtn` also shows whether NPV specifically is open right now - a green icon plus a small dot underneath, values chosen to match the small indicator dot Spotify's own toggle used to show. This isn't set at click time by `npBtn`'s own handler; it's kept in sync by the same `panelGuardObserver` mutation callback that drives everything else above, reading straight off `userOpenedNPV` rather than off Spotify's DOM/aria-label (for the same reason as (b) - that label can't reliably tell NPV apart from a freshly-opening Queue/Connect on the first tick), so the icon only ever turns green when NPV specifically, not Queue or Connect, was the thing authorized open, and it re-syncs on its own the moment Spotify's real DOM changes rather than needing another click to catch up. `npBtn` is built once by cloning the lyrics button's own classes, which is what gives it Spotify's real button sizing, padding, and hover/focus feedback for free instead of needing to be hand-styled from scratch - but its resting-state color, and the dot's presence, are pinned directly by this script's own CSS with `!important` rather than left to whatever classes happen to be riding along on that clone. That matters because those classes are Spotify's own internal, hashed build output, not a stable public API - they can be renamed on any Spotify deploy - and if `npBtn` happened to be cloned at the exact moment the lyrics button was transiently carrying whatever class Spotify currently uses to mark that state, Spotify's own stylesheet would style `npBtn` off of that instead of anything this script controls, making the icon look "open" even while NPV is genuinely closed. The green/active-state color and the dot itself don't need that same `!important` treatment: the cloned Spotify classes on `npBtn` are only ever set once, at that same clone moment, and never touched again afterward (only `npBtn`'s own `.active` class keeps changing, via `classList.toggle`) - so the only way a leaked class could ever be present at all is if NPV genuinely was open at clone time, in which case the leaked class and a later authorized `.active` toggle both agree the icon should be green, rather than fighting over it. The resting state is the only one a leaked class can actually contradict, which is exactly the state pinned with `!important`.    

The native miniplayer/PiP toggle and the native fullscreen toggle are also hidden.

### AMOLED mode

Pure-black AMOLED theme, ported from the same Spotifuck apk (`r0/e.java` line 207) - also later carried over into SpotiwebJS. Forces the player bar and the app's dark-theme background variables (declared with `!important`, so Spotify's own closer redeclarations can't win) to pure black. Always on, not tied to either spoof toggle, and injected as its own style block on every matched host, so `www.spotify.com` account pages and `payments.spotify.com` are black too, not just `open.spotify.com`. The avatar/user menu on `open.spotify.com` doesn't read those variables, so it is pinned black directly (`#context-menu ul[role="menu"]`). The "Edit profile"/"Payment method" banner on `www.spotify.com` sets its own inline background, so that is `#000` too. Later widened to cover the Library overlay and some other overlays which would previously fail to inherit the style and fall back to Spotify's default dark gray theme.

### Toast style

Spotify's pop-up messages (such as "Added to queue" or "Added to Liked Songs") are restyled as a rounded pill: a bold single-line title, a round cover image or icon, and pill-shaped action buttons. There are three colour looks. `amoled` (the default) is pure black with the same thin outline as the player and nav bars. `dark` is dark grey with a blurred backdrop. `normal` keeps Spotify's own white colours in the same pill shape. Inside the Spotify Web app the look is picked in Settings > "Toast notification style" (Mobile mode only). Standalone, change `TOAST_STYLE_DEFAULT` in the script.

Toasts sit just above the player and nav bars and stack upward, slide in with a small overshoot, can be swiped sideways to dismiss, and animate out instead of vanishing. The round icon needs a browser with `:has()` support (Chromium 105+); on older ones the icon stays square. Shape, Dark colours and animations are adapted from Spotilol's ToastFix (see [Credits](#credits)).

### Title/artist marquee

Long track titles and artist names scroll sideways instead of being cut off - in the player bar, the Now Playing view, and anywhere else on the page that uses Spotify's marquee structure. It's the script's own copy of Spotify's marquee component (`spfMarquee`), needed because Spotify's marquee never runs on a phone: it only creates its animations when reduced motion is off. It scrolls by the exact overflow distance at a steady speed, plays once on its own after a short wait when a song starts, reverses at the end, and afterwards pauses when the pointer enters and plays when it leaves. It re-measures once a second and leaves alone any row where Spotify made its own animation. In the full player the title/artist column was reshaped so both lines can actually overflow, with a small gap between them so they don't overlap while scrolling.

### Reduced motion and lyrics-flash fix

Every JavaScript `prefers-reduced-motion` query is answered with "reduce" regardless of the device setting, so Spotify's own animations (about thirty components share that check) stay off everywhere; CSS `@media` rules are not affected. Separately, `document.startViewTransition` is replaced with a version that runs Spotify's callback immediately and paints nothing: Spotify opens and closes the lyrics view inside a view transition, whose snapshot used to flash over the fixed player bar and bottom nav. Lyrics still open and close normally, only the cross-fade is gone.

### Force English

Originally added in v6.3 of spotifuck-mobile.user.js as the browser-side equivalent of the reverse-engineered Spotifuck app's own locale-forcing (its `ForceEn` behavior, which forces the app's Android Configuration locale to English before loading its WebView) - there's no app Configuration to set in a browser, so this spoofs `navigator.language`/`navigator.languages` to `en-US` at document-start, redirects `www.spotify.com` off non-English `xx-yy` region-language paths (e.g. `/si-sl/` &rarr; `/si-en/`) and off `/intl-xx/` prefixes, and flips the account's actual language setting at `open.spotify.com/preferences` through a hidden iframe - then verifies the change stuck on the next load and retries a capped number of times if it didn't. The region-code table this relies on (which countries have no English storefront, which ones use a bare country code for English, etc.) is hand-checked against Spotify's own `/spotify.com/select-your-country-region/` listing and then ported back here, replacing the script's own initially smaller allowlist. Force English doesn't depend on either spoof toggle: the `www.spotify.com` region-path redirect, the `/intl-xx/` correction and the account-language flip all run whether the spoof is on or off. The `/intl-xx/` URL correction and the account-setting flip don't run immediately at document-start; they wait for the player's Play/Pause button (or, for signed-out sessions, the `sign-up bar` prompt) to actually exist first, since running that correction before Spotify's own SPA has started hydrating could leave the page stuck mid-load.

Everything else here is keyed off English aria-labels, so without this the script just silently stops matching on non-English accounts.

### Visual Premium Spoof

Adopted from SpotiwebJS/kitbodega's original SpotiKit code and extended independently since. Rewrites the free-tier UI to look like a Premium account, handled per page so that as little as possible runs in the background:

- **`open.spotify.com` - CSS only.** The "Explore Premium" upgrade button, the "Upgrade to Premium" link in the avatar menu (which only appears after the avatar is clicked), the install-app link, and the "Spotify Plans" list in the page footer are hidden with CSS. No observer, no timed pass, no text replacement. Each hidden element is still reported once in the replacement log (see [Debug Logging & Replacement Log](#debug-logging--replacement-log)).
- **`www.spotify.com` account and other pages - a JS pass.** Swaps "Free"/"Spotify Free"/"Free plan" text for "Premium Individual" and "1 Free account" copy for "1 Premium account" wherever it appears in headings, spans, badges, and plan cards, recoloring the matched elements pink. A table of plan-comparison phrases is rewritten the same way ("Music with ads" → "Listen to music ad-free", "Shuffle play" → "Play any song", "Limited skips" → "Unlimited skips", the audio-quality and offline-listening lines), "Download for offline listening" then becomes "Spotify wont fuck you", and badges reading "Free" become a pink "PREMIUM". The plan card also gets a small logo and a "Your Premium Individual NEVER expires…" message above its buttons. Relabels "Get/Buy/Join Premium" buttons to a disabled "DONT JOIN PREMIUM", and "Explore/View plans" to a disabled "Manage plan" - both click-blocked, not just relabeled. Hides "Premium Plans" menu links and any "Try"-prefixed buttons, and turns empty/—/"No"/"Free"-containing pricing-table cells into green checkmarks. Rebuilds the account page's compact upgrade banner into "Edit profile"/"Payment method" buttons that link to the account's own region-correct URL (`https://www.spotify.com/<region>/account/...`, derived from the account's actual locale rather than hardcoded), instead of an upgrade nag. The "Add new card" button is blocked on the account payment-methods page (`/account/payment-methods/`, aliased with `/account/saved-payment-cards/`).
- **`www.spotify.com` plan pages (`/premium/`, `/duo/`, `/student/`, `/family/`) - a CSS cover.** The whole page, header and footer included, is replaced with "You dont need Spotify Premium. Trust me." and a "Back to Spotify" button that goes straight to `open.spotify.com`.
- **`payments.spotify.com` checkout - a CSS cover.** Everything Spotify renders is hidden under a "DONT WASTE YOUR MONEY ON SPOTIFY" / "Dont give them a cent. Use Spotifuck for free." page with the same "Back to Spotify" button. Because the checkout is display-hidden rather than patched, nothing on it can be clicked and no JavaScript runs on that host beyond adding the one link.

Toggleable per site (one switch for `open.spotify.com`, a second for `www.spotify.com` **and** `payments.spotify.com` together) from the userscript-manager menu, saved via GM storage, enabled by default. Toggling reloads the page.

### Play/Pause reliability fix

A watchdog ported from the original Android mod (`firstFuck`/`addCSSJSHack` in `r0/e.java`) that can force-unstick the Play/Pause button if it's still showing "Play" a while after being clicked - a quirk carried over from the source APK, not a Spotify Web Player bug this script otherwise causes.

Startup is also quicker than the original: the init loop now checks once immediately and then again on DOM changes (throttled) until the first init has happened, instead of waiting for its 5-second interval, so the nav, player-bar setup and compact restore no longer lag several seconds behind the page. The 5-second interval stays afterwards to re-wire play buttons Spotify re-renders later.

### Library folder-navigation fix

The original Spotifuck behavior auto-closed the library on any item selection, including folders; this version specifically detects folder clicks (via their `aria-labelledby`/`aria-describedby` containing a `:folder:` marker) and keeps the library open for those while still auto-closing for actual tracks/albums/playlists.

### Debug Logging & Replacement Log

Every text swap the premium spoof makes, and every element it hides with CSS, is recorded (selector, before/after text, times applied); a "📋 Show everything replaced so far" menu command dumps it as a table in the console. Separately, a "Debug Logging (console)" menu toggle (off by default) turns on verbose `[SPFDBG]` console logging for every click handler, selector match, and state change the script makes - filter your browser console by `SPFDBG` to isolate it. Coverage includes the injected style blocks (logged once, with their size), the class and CSS-variable changes that switch layout on and off (`--sp-np-bar-height`, `--sp-gnav-height`, active nav tab, route class), and a `selector MISS (outdated?)` warning when one of Spotify's generated class names the spoof relies on stops matching after a Spotify deploy.

### Efficient Scanning

Nothing here does a blind full-page walk on a timer. `open.spotify.com` and `payments.spotify.com` run no scanning at all (CSS does the work). On the `www.spotify.com` pages that use the text pass, it runs once shortly after load, retries once more only if the first pass changed nothing (page not rendered yet), and then a debounced `MutationObserver` re-scans only for content added later; the script's own edits are discarded from the observer's queue so they don't trigger another pass. The "Add new card" watcher is only created on the payment-methods page.

### Globals for scripting/automation

`window.switchLs(source)` toggles the library overlay open/closed, and `window.closeNowPlay(source)` force-closes the Now Playing/Queue/Connect panel if open - these two are meant for communication with other scripts (at the moment with the Spotify Web Lyrics+ userscript) or manual console use. The script also assigns `window.firstFuck`/`window.addCSSJSHack` (its own internal init/monitoring loop, ported 1:1 from the Android APK's naming) and caches `window.pBtn`/`window.lBtn` (the current play/pause and library button elements) on `window` - these exist for internal reasons rather than as a public API, and shouldn't be relied on the way `switchLs`/`closeNowPlay` can be. Separately, it publishes `__spReservedInsets` (`{ bottom, bottomNav }`, the combined and nav-only heights of the fixed bottom nav/player strip) and fires a `sp-reserved-insets-change` event whenever that value changes - written through `unsafeWindow` rather than plain `window` so it's actually visible to other sandboxed userscripts, currently consumed by the Spotify Web Lyrics+ userscript (pip-gui-stable.user.js) to keep its floating PiP popup from being dragged, resized, or restored underneath the reserved area. The script does not expose separate play/pause/skip/seek or now-playing-status functions - playback itself is still driven entirely through Spotify's own player.

### Spotify Web app integration (`window.AndBridge`)

The same script also runs inside the Spotifuck Spotify Web Android app's WebView (it is loaded when Spotifuck Mode is set to Mobile), and it detects that by the presence of `window.AndBridge` (Force English specifically checks that `AndBridge.isLoggedIn` is a function), an object that only exists there (never in a normal browser or userscript manager). The app feature-detects each method, so an older app with a newer script, or the reverse, just falls back to the script's own defaults. When the bridge is present, the script and the app talk to each other like this:

- **Force English:** the app sets its default locale to English before the WebView is created, so every request already carries `Accept-Language: en`, and the script skips only its `navigator.language` spoof. The `www.spotify.com` region-path redirect (kept as a harmless safety net) and the account-language flip still run, which also stops the interface language from being switched away from English, since the script's selectors depend on English labels.
- **Toast style:** the look is read from `AndBridge.getToastStyle()` (app v1.43+; Settings > "Toast notification style", shown only in Mobile mode), accepting only `amoled`, `dark` or `normal` and falling back to `TOAST_STYLE_DEFAULT` otherwise. The app reloads the page when you return to it after changing the setting.
- **Compact player:** the saved compact/full state lives in the app (`getCompactPlayer`/`setCompactPlayer`, app v1.44+), because the app needs it at page start, before the script exists, and it survives the logout storage wipe. The script hands its pre-hide CSS to the app through `setCompactPreCss()` on every load; on the next launch the app injects it from `onPageStarted`, before the page draws, when compact was last on and Spotifuck Mode is Mobile (with an 8-second failsafe if the script never loads). In a plain userscript manager the state stays in GM storage and the script injects the pre-hide itself at document-start.
- **Debug logging:** when the app's Settings > Debug Logging is on (app v1.52+), `dbg()` lines are also forwarded through `AndBridge.dbgt` under the tag `us.spotifuck-mobile` and show up in the app's Logger. Nothing is stored while it's off.
- **Loading:** from app v1.44 the app downloads the script natively at page start, in parallel with the page load, and injects it once the page has finished loading. It is still fetched fresh on every launch, with no cache.
- **Userscript-manager features:** the app's loader provides simple stand-ins for the `GM_*` functions, and its `GM_registerMenuCommand` does nothing. The menu toggles and the replacement-log command are therefore only available in a real userscript manager; inside the app the toggles keep their defaults.

In a normal browser none of this runs and the script falls back to GM storage and its own defaults.

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

> Spotifuck Mobile doesn't block ads. An earlier DOM ad-slot cleanup was removed in v7.32 because its observer rescanned the whole page on every change and didn't remove ads reliably. For real ad blocking, use a reliable adblocker depending on your browser. On Firefox and its non-chromium forks (no MV3 support), use: **[uBlock Origin](https://addons.mozilla.org/en-US/firefox/addon/ublock-origin/)** or **[uSpot](https://github.com/Myst1cX/uSpot/releases/)** alongside it. More on the difference [here](https://github.com/Myst1cX/uSpot/blob/main/README.md#uspot-vs-ublock-origin-what-is-the-difference). On Chromium browsers without MV2 support (MV3 only), use: **[Spotify Ad Blocker - Blockify](https://chromewebstore.google.com/detail/spotify-ad-blocker-blocki/nfmlkliedggdodlbgghmmchhgckjoaml).**

## Notes

> - Client-side only, doesn't touch Spotify's servers.
> - Doesn't change any account data except the language setting, and only if Force English needs to flip it.
> - Needs a userscript manager (Tampermonkey or Violentmonkey preferably).
> - This is the mobile-layout option.

## Feedback

> Open an issue at [https://github.com/Myst1cX/spotifuck-userscript/issues](https://github.com/Myst1cX/spotifuck-userscript/issues)

## Credits

1. **Ported from** [Spotifuck](https://4pda.to/forum/index.php?showtopic=248440&view=findpost&p=137957887), the original Android mod (reverse-engineered from `r0/e.java`) - the mobile UI hacks (bottom nav's underlying toggle logic, full-screen library), the Play/Pause reliability watchdog, the Now Playing View button toggle, AMOLED mode, and the original Force English implementation all trace back to it. The Now Playing View guard, AMOLED mode, and Force English were later carried over into SpotiwebJS as well; Force English's region-code table, AMOLED's extension to `www.spotify.com`/`payments.spotify.com`, and the avatar-menu fix were in turn refined there and ported back here.
2. **Bottom nav bar layout and Compact player mode ported from** [kitbodega/SpotiKit](https://github.com/kitbodega/SpotiKit)'s mobile layout and its `#sp-player-toggle`/`.minimized` feature respectively.
3. **Visual Premium Spoof adopted from** SpotiwebJS, which itself builds on kitbodega's original SpotiKit code - credited directly in this script's own changelog.
4. **Toast look and animations adapted from** `lyssadev/Spotilol` (`ToastFix.kt`, repository currently unavailable): the pill shape, title and button styling, Dark colours, entrance animation, swipe-to-dismiss, exit animation and stack spacing. The logic is re-implemented here; the AMOLED and Normal looks, the positioning above the player and nav bars, and the round-icon fix are this script's own.        
5. All porting, adaptation, and independent extensions by Myst1cX.      
6. **Powered by** [Spotify](https://open.spotify.com/).       

## License

> Licensed under the [MIT License](https://github.com/Myst1cX/spotifuck-userscript/blob/main/LICENSE).
