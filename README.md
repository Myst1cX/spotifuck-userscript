## SPOTIFUCK USERSCRIPT v6

> Complete port of the Spotifuck Android app to Spotify Web Player for mobile browsers (primarily Firefox).  
> Reverse-engineered from the latest APK and optimized for web use.
> Provides **enhanced ad blocking**, **comprehensive UI overhaul**, **playback controls**, **library management**, **desktop client spoofing**, and more.  
> **Recommended userscript manager:** [Violentmonkey](https://violentmonkey.github.io/)

## Features (v6)

> **🚫 ENHANCED AD BLOCKING**  
> - Blocks tracking domains (doubleclick.net, googlesyndication.com, fastly-insights.com, sentry.io)
> - Blocks audio ad sources (scdn.co/audio/, spotifycdn.com/audio/, akamaized.net/audio/, etc.)
> - Blocks ad networks (amillionads.com, 2mdn.net, adxcel.com, adstudio-assets.scdn.co)
> - Whitelists legitimate content (podcasts, player API)
> - Silent MP3 replacement for blocked ads
>
> **📡 FETCH API INTERCEPTOR**  
> - Automatically captures Spotify auth tokens, client tokens, and device IDs
> - Monitors playback state changes in real-time
> - Auto-reloads on player lock errors
> - Comprehensive timestamped logging
>
> **📚 MEDIA LIBRARY FETCHER** (Optional, Configurable)
> - Auto-fetches all user library items (playlists, albums, artists, podcasts)
> - Parses and structures library data
> - Triggered automatically when tokens are captured
>
> **🎮 PLAYBACK CONTROL API**  
> - `spotifyPlayPause(play)` - Play/pause control
> - `spotifySkipBack()` / `spotifySkipForward()` - Track navigation
> - `spotifyToggleRepeat()` - Cycle repeat modes
> - `spotifyToggleFavorite()` - Add/remove favorites
> - `spotifySeek(positionMs)` - Seek to position
> - `spotifyPlayFromUri(uri)` - Play specific URI
>
> **📊 MEDIA STATE TRACKING**  
> - Real-time tracking of current track, artist, position, duration
> - Play/pause state monitoring
> - Repeat mode tracking
> - Favorite status tracking
> - Cover art URL tracking
> - Position jump detection
>
> **🎨 COMPREHENSIVE UI OVERHAUL**  
> - Optimized tracklist layouts (responsive 3/4/5 column grids)
> - Enhanced now-playing bar (vertical layout, gradient background)
> - Library sidebar fullscreen toggle with close button
> - Auto-close library after item selection (configurable)
> - Search focus handling (hides now-playing bar)
> - Content spacing optimizations
> - Typography adjustments
> - Button scaling and positioning
>
> **🔓 SMART FEATURES**  
> - Unlock mechanism - Detects stuck playback and auto-skips
> - Take Control - Auto-handles device conflicts (configurable)
> - Play button hooking with 10s unlock timeout
> - Disabled button detection with page reload
>
> **🎭 CLIENT SPOOFING**  
> - Desktop screen dimensions (1920x1080)
> - Navigator properties (Win32, Google Inc.)
> - Early injection to unlock desktop features
>
> **🌑 AMOLED THEME** (Optional, Configurable)
> - Pure black backgrounds for OLED screens
> - Default: OFF (easily enabled via userscript manager settings)
>
> **📝 COMPREHENSIVE LOGGING**  
> - All features include detailed console logs for debugging
> - Token capture events
> - Playback control actions
> - UI modifications
> - Media state updates
> - Error handling and warnings

## Screenshots

> (Coming Soon)

## Installation

> 1. Download the latest version of Firefox (Original version! - Nightly or other releases might break your userscript manager).
> 2. Install [Violentmonkey](https://violentmonkey.github.io/)  
> 3. Recommended: [Ublock Origin](https://addons.mozilla.org/en-US/firefox/addon/ublock-origin/)
> 4. Recommended: [Spotify AdBlocker](https://greasyfork.org/en/scripts/522592-spotify-adblocker)
> 5. Recommended - for stock lyrics button: [Cigi Spotify Translator](https://greasyfork.org/en/scripts/523415-cigi-spotify-translator)
> 6. Recommended: [Spotify Lyrics+](https://raw.githubusercontent.com/Myst1cX/spotify-web-lyrics-plus/main/pip-gui.user.js)
> 7. Install [Spotifuck v6](https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-v6.user.js)
> 8. Install Chameleon extension
> 9. Chameleon extension settings > Profile Panel (globe icon) > Select Random Profile (Desktop)
> 10. Chameleon extension settings > Options Panel > Select the 'Profile' option under the 'Screen size' option
> 11. Go back to Firefox browser > Firefox Settings > Site settings > Click on "DRM-controlled content" and select "Allowed"
> 12. Restart Firefox
> 13. Open Spotify Web and login to your account
> 14. The interface should be mobile-friendly > If it ever resets, repeat steps 7 and 8 > Keep Desktop Mode Disabled 

## Configuration (Optional)

> **Userscript Manager Settings** (Violentmonkey/Tampermonkey)
> 
> You can customize these settings in your userscript manager:
> - `amoled_theme` - Enable pure black AMOLED theme (default: false)
> - `auto_fetch_library` - Auto-fetch user library on token capture (default: true)
> - `take_control` - Auto-take control on device conflicts (default: true)
> - `auto_close_library` - Close library after item selection (default: true)

* * *
> **TIP 1:** All UI changes and playback controls apply instantly. No configuration needed!
>
> **TIP 2:** Add Spotify Web Player to your home screen for a PWA-like experience.
>
> **TIP 3:** Check the browser console (F12) for detailed logs of all features and actions.

* * *

> For feedback or bug reports, open an issue:  
> [https://github.com/Myst1cX/spotifuck-userscript/issues](https://github.com/Myst1cX/spotifuck-userscript/issues)

## Credits

> 1. **Ported from** [Spotifuck](https://4pda.to/forum/index.php?showtopic=248440&view=findpost&p=137957887) (UI hacks, playback, spoofing, ad block logic).
> 2. **Powered by** [Spotify](https://open.spotify.com/).

## License

> This project is licensed under the [MIT License](https://github.com/Myst1cX/spotifuck-userscript/blob/main/LICENSE).
