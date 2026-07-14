## SPOTIFUCK USERSCRIPT

> Ports the full Spotifuck 1.6.4 UI hack experience directly to the Spotify Web Player for use in the Quetta/Firefox mobile browser.  
> Provides **UI enhancements** and **injected playback controls** for a more mobile-like Spotify experience.  
> **Recommended userscript manager:** [Violentmonkey](https://violentmonkey.github.io/)

## Features

> **UI HACKS & ENHANCEMENTS**  
> Customizes the Spotify Web Player's interface for a mobile-like experience.  
> Removes unnecessary elements, expands panels, and tweaks layout for maximum usability.
>
> **PLAYBACK CONTROL**  
> Instantly play, pause, skip, seek, and control playback with injected functions.   
> Restores the old Now Playing View button toggle.   
> Auto-closes the Now Playing View (only manual toggle opens it).   
> Exposes global JS functions for automation and integration.   
>
> **SIDEBAR & SEARCH FIXES**  
> Adds improved sidebar toggle, fixes for library/playlist navigation, and better search behavior.
>
> **STATUS REPORTING**  
> Logs current playback status (track, artist, progress) for debugging and automation.

## Screenshots

> (Coming Soon)

## Installation
> NEW 'QUETTA BROWSER + USER-AGENT SWITCHER AND MANAGER' METHOD:    
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
Click [here](https://github.com/Myst1cX/uSpot/blob/main/README.md) for installation steps.   
> 8. NOTE: Keep only 1 ad-blocking extension enabled at the same time.    
> 9. NOTE: Make sure to disable Quetta's own adblock for open.spotify.com so that it doesn't interfere with the installed adblock extension.    
> Press on the three dots next to the search bar's tab counter > Click on the privacy guard (shield icon with a lock inside) > Turn off 'Blocker on This Site'      
> 11. Optional - for a lyrics translator inside the stock spotify lyrics view: [Cigi Spotify Translator (fork)](https://raw.githubusercontent.com/Myst1cX/cigi-spotify-translator-fork/main/cigi-spotify-translator-fork.user.js).    
> Click [here](https://github.com/Myst1cX/cigi-spotify-translator-fork/blob/main/README.md) for the setup and feature list.    
> 12. Recommended: [Spotify Lyrics+](https://raw.githubusercontent.com/Myst1cX/spotify-web-lyrics-plus/main/pip-gui-stable.user.js). Click [here](https://github.com/Myst1cX/spotify-web-lyrics-plus/blob/main/README.md) for the setup and feature list.    
> 13. Install [Spotifuck](https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-mobile.user.js)   
> 14. Open the Spotify web player > Press on the three dots next to the search bar's tab counter > Click on the Extensions tab > Click on the 'User-Agent Switcher and Manager' extension icon > Select the first option (a Chrome Windows 10 user agent) > Click 'Apply (this tab' and then 'Refresh Tab'.   
> 15. Spotify web player should reload. The interface should now be mobile-friendly.   
> 16. NOTE: Keep Desktop Mode (browser setting) disabled.   

* * * 

> LEGACY 'FIREFOX BROWSER + CHAMELEON EXTENSION' METHOD (SLOWER, LESS RESPONSIVE):
> 1. Download the latest version of Firefox (Original version! - Nightly or other releases might break your userscript manager).
> 2. Install [Violentmonkey](https://violentmonkey.github.io/)  
> 3. Recommended: [Ublock Origin](https://addons.mozilla.org/en-US/firefox/addon/ublock-origin/)
> 4. Alternative to Ublock Origin for blocking Spotify ads: [uSpot - Spotify Ad Blocker](https://github.com/Myst1cX/uSpot/releases). Click [here](https://github.com/Myst1cX/uSpot/blob/main/README.md) for installation steps.   
> 5. Optional - for the lyrics translator inside the stock spotify lyrics view: [Cigi Spotify Translator (fork)](https://raw.githubusercontent.com/Myst1cX/cigi-spotify-translator-fork/main/cigi-spotify-translator-fork.user.js).    
> Click [here](https://github.com/Myst1cX/cigi-spotify-translator-fork/blob/main/README.md) for the setup and feature list.    
> 6. Recommended: [Spotify Lyrics+](https://raw.githubusercontent.com/Myst1cX/spotify-web-lyrics-plus/main/pip-gui-stable.user.js). Click [here](https://github.com/Myst1cX/spotify-web-lyrics-plus/blob/main/README.md) for the setup and feature list.    
> 7. Install [Spotifuck](https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-mobile.user.js)
> 8. Install [Chameleon](https://addons.mozilla.org/en-US/android/addon/chameleon-ext/) extension   
> 9. Chameleon extension settings > Profile Panel (globe icon) > Select Random Profile (Desktop)
> 10. Chameleon extension settings > Options Panel > Select the 'Profile' option under the 'Screen size' option
> 11. Go back to Firefox browser > Firefox Settings > Site settings > Click on "DRM-controlled content" and select "Allowed"
> 12. Restart Firefox
> 13. Open Spotify Web and login to your account
> 14. The interface should be mobile-friendly > If it ever resets, try redoing the Chameleon extension configuration and refreshing the Spotify page
> 15. NOTE: Keep Desktop Mode (browser setting) disabled.

* * * 

> **TIP**: Add Spotify Web Player to your home screen for a PWA-like experience. PWA (Priority Web Application) gives you an easy access shortcut to the Spotify player.  
> **SIDE NOTE**: You can begin playing a song in the web interface and then open the Spotify app - it will let you play music there and control playback without any limitations.  

* * * 

> REMEMBER: PWA's essentially allow running an entire app in your web browser.    
> A good way of finding progressive web apps is through `store.app`  
> The degree to which you can block ads varies depending on the app, but it is often times better than using the actual app - a PWA also uses less storage than installing a native app.  

* * *

> For feedback or bug reports, open an issue:  
> [https://github.com/Myst1cX/spotifuck-userscript/issues](https://github.com/Myst1cX/spotifuck-userscript/issues)

## Credits

> 1. **Ported from** [Spotifuck](https://4pda.to/forum/index.php?showtopic=248440&view=findpost&p=137957887) (UI hacks, playback, spoofing).
> 2. **Powered by** [Spotify](https://open.spotify.com/).

## License

> This project is licensed under the [MIT License](https://github.com/Myst1cX/spotifuck-userscript/blob/main/LICENSE).
