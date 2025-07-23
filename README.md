## SPOTIFUCK USERSCRIPT

> **v4.0.0**: Complete port of Spotifuck 1.5.0 Android app features to userscript  
> Provides **configurable settings**, **UI enhancements**, **auto-play logic**, **playback controls**, **Facebook consent automation**, **desktop client spoof**, and **silent ad blocking** for a fully unrestricted Spotify experience.  
> **Recommended userscript manager:** [Violentmonkey](https://violentmonkey.github.io/)

## Features

> **CONFIGURABLE SETTINGS MENU**  
> Full settings system with persistent storage across page reloads.  
> Toggle all behavioral flags via userscript menu commands with real-time indicators.
>
> **FACEBOOK CONSENT AUTOMATION**  
> Automatically detects and clicks Facebook GDP consent dialogs when logging in.  
> Supports multiple consent button selectors for maximum compatibility.
>
> **ADVANCED AUTO-PLAY LOGIC**  
> Three modes: Disabled, One-time, Permanent with intelligent unlock mechanism.  
> Includes 10-second timeout logic and automatic skip-forward on unlock failure.
>
> **UI HACKS & ENHANCEMENTS**  
> Complete mobile-friendly interface overhaul matching Spotifuck Android app.  
> Customizable sidebar, now-playing bar styling, button scaling, and layout optimization.
>
> **COMPREHENSIVE PLAYBACK CONTROL**  
> Full playback automation: play/pause, skip back/forward, seek, repeat, favorites.  
> Advanced features: take control, close now-playing overlay, media library building.
>
> **REAL-TIME STATUS MONITORING**  
> Tracks current song, artist, playback state, position, repeat mode, and favorites.  
> Logs all state changes and position updates for debugging and automation.
>
> **CLIENT SPOOFING**  
> Spoofs browser and device properties to unlock desktop features.  
> Screen size, platform, vendor, and navigator properties modification.
>
> **SILENT AD BLOCKING**  
> Intercepts fetch() and XMLHttpRequest to block audio ads from known domains.  
> Replaces ad audio with silent audio blob for seamless playback experience.
>
> **INTELLIGENT SIDEBAR MANAGEMENT**  
> Auto-toggles library sidebar with full-screen overlay and collapse states.  
> Smart search focus handling with now-playing bar visibility control.

## Screenshots

> (Coming Soon)

## Installation

> ### Quick Install (Recommended)
> 1. Install [Violentmonkey](https://violentmonkey.github.io/) browser extension
> 2. **Install Spotifuck v4:** [Click here to install](https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-v4.user.js)
> 3. Open Spotify Web Player and enjoy!
>
> ### Full Setup (Mobile Firefox)
> 1. Download the latest version of Firefox (Original version! - Nightly or other releases might break your userscript manager).
> 2. Install [Violentmonkey](https://violentmonkey.github.io/)  
> 3. Recommended: [Ublock Origin](https://addons.mozilla.org/en-US/firefox/addon/ublock-origin/)
> 4. Recommended: [Spotify AdBlocker](https://greasyfork.org/en/scripts/522592-spotify-adblocker)
> 5. Recommended - for stock lyrics button: [Cigi Spotify Translator](https://greasyfork.org/en/scripts/523415-cigi-spotify-translator)
> 6. Recommended: [Spotify Lyrics+](https://raw.githubusercontent.com/Myst1cX/spotify-web-lyrics-plus/main/pip-gui.user.js)
> 7. **Install Spotifuck v4:** [Click here to install](https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-v4.user.js)
> 8. Install Chameleon extension
> 9. Chameleon extension settings > Profile Panel (globe icon) > Select Random Profile (Desktop)
> 10. Chameleon extension settings > Options Panel > Select the 'Profile' option under the 'Screen size' option
> 11. Go back to Firefox browser > Firefox Settings > Site settings > Click on "DRM-controlled content" and select "Allowed"
> 12. Restart Firefox
> 13. Open Spotify Web and login to your account
> 14. The interface should be mobile-friendly > If it ever resets, repeat steps 7 and 8 > Keep Desktop Mode Disabled

## Settings

> **Access Settings:** Click the Violentmonkey icon → Spotifuck menu commands
>
> **Available Settings:**
> - 🔧 **Spotifuck Settings** - View all current settings
> - ⚡ **Service** - Enable/disable all Spotifuck features  
> - 🎵 **Auto-Play Mode** - Disabled / One-time / Permanent
> - ❌ **Close Now Playing** - Auto-close now playing overlay
> - 🎮 **Take Control** - Auto-click take control buttons  
> - 🎨 **GUI Mode** - CSS hacks / Minimal / Disabled
> - 🤖 **Android Auto** - Status monitoring and media features
> - 👆 **Swipe Stop** - Swipe to stop functionality
>
> All settings persist across page reloads and browser sessions. 

* * *
> **TIP 1:** All UI changes and playback controls apply instantly. Access settings via userscript menu commands.
>
> **TIP 2:** Facebook login consent is automated - no manual clicking required.
>
> **TIP 3:** Add Spotify Web Player to your home screen for a PWA-like experience.
>
> **TIP 4:** Check browser console for detailed Spotifuck operation logs.

## Version History

> **v4.0.0** - Complete Spotifuck 1.5.0 Android app port  
> - Full settings system with persistent storage  
> - Facebook consent automation  
> - Advanced auto-play with unlock logic  
> - Comprehensive UI hacks and playback controls  
> - Real-time status monitoring  
> - Enhanced ad blocking
>
> **v3.0.0** - UI hack improvements and status reporting  
> **v2.0.1** - Mobile browser optimization and silent ad blocking  
> **v1.0.0** - Initial userscript release

* * *

> For feedback or bug reports, open an issue:  
> [https://github.com/Myst1cX/spotifuck-userscript/issues](https://github.com/Myst1cX/spotifuck-userscript/issues)

## Credits

> 1. **Ported from** [Spotifuck](https://4pda.to/forum/index.php?showtopic=248440&view=findpost&p=137957887) (UI hacks, playback, spoofing, ad block logic).
> 2. **Powered by** [Spotify](https://open.spotify.com/).

## License

> This project is licensed under the [MIT License](https://github.com/Myst1cX/spotifuck-userscript/blob/main/LICENSE).
