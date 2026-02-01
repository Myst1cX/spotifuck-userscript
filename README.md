## SPOTIFUCK USERSCRIPT

> Ports the full Spotifuck 1.6.4 UI hack experience directly to the Spotify Web Player for use in the Firefox mobile browser.  
> Provides **UI enhancements**, **playback controls**, **desktop client spoof**, and **enhanced ad blocking** for a cleaner and unrestricted Spotify experience.  
> **Recommended userscript manager:** [Violentmonkey](https://violentmonkey.github.io/)

### Latest Version: v6
> **NEW in v6:** Enhanced ad blocking (blocks 7+ tracking domains), improved seek precision (+1 fix), comprehensive debug logging (50+ console statements), and better code maintainability with descriptive variable names.

## Features

> **UI HACKS & ENHANCEMENTS**  
> Customizes the Spotify Web Player's interface for a desktop-like experience.  
> Removes unnecessary elements, expands panels, and tweaks layout for maximum usability.
>
> **PLAYBACK CONTROL**  
> Instantly play, pause, skip, seek, and control playback with injected functions.  
> Exposes global JS functions for automation and integration.
>
> **CLIENT SPOOFING**  
> Spoofs browser and device properties to unlock desktop features (e.g., screen size, platform, vendor).
>
> **SILENT AD BLOCKING (Enhanced in v6)**  
> Blocks audio ads by intercepting requests and replacing them with silent audio.  
> Also blocks tracking domains: sentry.io, fastly-insights.com, googlesyndication.com, doubleclick.net, and more.  
> No visual interruptions or delays.
>
> **SIDEBAR & SEARCH FIXES**  
> Adds improved sidebar toggle, fixes for library/playlist navigation, and better search behavior.
>
> **STATUS REPORTING & DEBUG LOGGING (Enhanced in v6)**  
> Logs current playback status (track, artist, progress) for debugging and automation.  
> 50+ comprehensive console logs on all critical functions for easy troubleshooting.

## Screenshots

> (Coming Soon)

## Installation

> 1. Download the latest version of Firefox (Original version! - Nightly or other releases might break your userscript manager).
> 2. Install [Violentmonkey](https://violentmonkey.github.io/)  
> 3. Recommended: [Ublock Origin](https://addons.mozilla.org/en-US/firefox/addon/ublock-origin/)
> 4. Recommended: [Spotify AdBlocker](https://greasyfork.org/en/scripts/522592-spotify-adblocker)
> 5. Recommended - for stock lyrics button: [Cigi Spotify Translator](https://greasyfork.org/en/scripts/523415-cigi-spotify-translator)
> 6. Recommended: [Spotify Lyrics+](https://raw.githubusercontent.com/Myst1cX/spotify-web-lyrics-plus/main/pip-gui.user.js)
> 7. Install [Spotifuck v6](https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-v6.user.js) (or [v5](https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-v5.user.js) for older version)
> 8. Install Chameleon extension
> 9. Chameleon extension settings > Profile Panel (globe icon) > Select Random Profile (Desktop)
> 10. Chameleon extension settings > Options Panel > Select the 'Profile' option under the 'Screen size' option
> 11. Go back to Firefox browser > Firefox Settings > Site settings > Click on "DRM-controlled content" and select "Allowed"
> 12. Restart Firefox
> 13. Open Spotify Web and login to your account
> 14. The interface should be mobile-friendly > If it ever resets, repeat steps 7 and 8 > Keep Desktop Mode Disabled 

* * *
> **TIP 1:** All UI changes and playback controls apply instantly. No configuration needed!
>
> **TIP 2:** Add Spotify Web Player to your home screen for a PWA-like experience.  

* * *

> For feedback or bug reports, open an issue:  
> [https://github.com/Myst1cX/spotifuck-userscript/issues](https://github.com/Myst1cX/spotifuck-userscript/issues)

## Credits

> 1. **Ported from** [Spotifuck](https://4pda.to/forum/index.php?showtopic=248440&view=findpost&p=137957887) (UI hacks, playback, spoofing, ad block logic).
> 2. **Powered by** [Spotify](https://open.spotify.com/).

## License

> This project is licensed under the [MIT License](https://github.com/Myst1cX/spotifuck-userscript/blob/main/LICENSE).
