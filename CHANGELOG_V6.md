# Spotifuck v6 Changelog

## Version 6.0.0 - February 2, 2026

### 🎉 Major Release - Complete Rewrite from Reverse-Engineered Android App

This version is a complete port of the latest Spotifuck Android app, reverse-engineered from `classes1.dex` and optimized for web use. **All Android-specific features have been removed**, focusing only on web-applicable functionality.

---

## 🆕 New Features

### Enhanced Ad Blocking
- **Extended Domain Blocking**: Now blocks tracking/analytics domains
  - `doubleclick.net`
  - `googlesyndication.com`
  - `fastly-insights.com`
  - `sentry.io`
- **Audio Ad Source Blocking**: Comprehensive blocking of ad audio sources
  - `scdn.co/audio/`
  - `scdn.co/mp3-ad/`
  - `spotifycdn.com/audio/`
  - `akamaized.net/audio/`
  - `amillionads.com`
  - `2mdn.net`
  - `adxcel.com`
  - `adstudio-assets.scdn.co`
- **Smart Whitelisting**: Excludes legitimate content
  - `podz-content` (podcasts)
  - `gew4-spclient` (Spotify player API)

### Fetch API Interceptor
- Automatically captures Spotify tokens and IDs from network requests:
  - `spotifyAuthToken` (Authorization: Bearer header)
  - `spotifyClientToken` (Client-Token header)
  - `spotifyDeviceId` (from multiple endpoints)
  - `currentPlayingUri` (current context)
- Monitors playback state changes from API calls
- Auto-reloads page on 404 player lock errors
- Timestamped logging for all interceptions

### Media Library Fetcher (Optional)
- `fetchAllLibrary()` - Paginated fetching of all user library items
- `parseLibrary()` - Parses and structures data by type:
  - Playlists (including pseudo-playlists)
  - Albums (with artist info)
  - Artists (with images)
  - Podcasts (with publisher info)
- `checkAndFetchMediaLibrary()` - Auto-triggers when all tokens are captured
- Configurable via `auto_fetch_library` setting

### Comprehensive Playback Control API
New global functions for external control:
- `spotifyPlayPause(play)` - Play or pause playback
- `spotifySkipBack()` - Skip to previous track
- `spotifySkipForward()` - Skip to next track
- `spotifyToggleRepeat()` - Cycle through repeat modes (off → context → track)
- `spotifyToggleFavorite()` - Add/remove track from favorites (with smart context menu handling)
- `spotifySeek(positionMs)` - Seek to specific position in milliseconds
- `spotifyPlayFromUri(uri)` - Play any Spotify URI (playlist, album, track, artist, etc.)

### Real-Time Media State Tracking
- Tracks and logs changes to:
  - Current track name
  - Current artist/show name
  - Playback position (milliseconds)
  - Track duration (milliseconds)
  - Play/pause state
  - Repeat mode (off/context/track)
  - Favorite status (is track liked?)
  - Cover art URL
- `updateMediaState()` - Detects state changes and logs them
- Position jump detection (logs jumps > 4 seconds)
- Updates every 2 seconds

### Smart Unlock Mechanism
- Detects stuck playback (play button stuck on "Play")
- 10-second timeout with auto-skip and unlock
- Monitors for disabled button state (reloads page if detected)
- Prevents indefinite loading states

### Take Control Feature (Configurable)
- Auto-detects device conflict prompts
- Automatically clicks "Take Control" button
- Confirms selection in device list
- Configurable via `take_control` setting

### Library Management
- Fullscreen library sidebar toggle
- Auto-close library after item selection (configurable)
- Styled close button ("✖ Close Library")
- Smart positioning (collapsed state maintains icon visibility)

### Enhanced UI Interactions
- **Search Focus Handling**: Hides now-playing bar when search is focused
- **Button Hooking**: All interactive elements are monitored and enhanced
- **Smooth Transitions**: Optimized animations and state changes

### AMOLED Theme (Optional)
- Pure black (`#000`) backgrounds for all elements
- Optimized for OLED screens (prevents burn-in)
- Minimal power consumption on OLED displays
- Configurable via `amoled_theme` setting (default: OFF)
- Easily togglable through userscript manager

### Comprehensive Logging System
Every feature includes detailed console logs:
- 🎭 Client spoofing initialization
- 🎨 CSS injection status
- 📡 Fetch interceptions (with timestamps)
- 🎮 Playback control actions
- 📚 Library fetch progress
- 📊 Media state changes
- 🔓 Unlock mechanism activity
- ⚠️ Warnings and errors

**Total**: 51 unique log points throughout the codebase

---

## ⚙️ Configuration System

New userscript manager settings (GM_getValue/GM_setValue):

```javascript
CONFIG = {
    AMOLED_THEME: false,        // Pure black theme
    AUTO_FETCH_LIBRARY: true,   // Auto-fetch user library
    TAKE_CONTROL: true,         // Auto-take control on conflicts
    AUTO_CLOSE_LIBRARY: true    // Auto-close library after selection
}
```

Users can change these values in Violentmonkey/Tampermonkey settings without editing code.

---

## 🎨 UI/CSS Improvements

### Enhanced Tracklist Layouts
- Responsive grid systems for 3/4/5 column layouts
- Optimized for track, album, and playlist views
- Better spacing and alignment
- Hover effects with color highlights

### Now-Playing Bar Overhaul
- Vertical layout (stacked elements)
- Gradient background (#770000 to #330000)
- Better button scaling (1.15x to 1.4x)
- Optimized spacing and margins

### Typography Adjustments
- Headlines: 22px
- Artist page titles: 26px
- Track page titles: 20px
- Now-playing widget text: 13px

### Content Spacing
- Consistent 10px content spacing
- Optimized padding for mobile screens
- No unnecessary gaps or overflow

---

## 🚫 Removed Features

These Android-specific features were **intentionally excluded**:

- ❌ Wake lock management (`wakeUp()`, `wakeOff()`, `AndBridge.isWoke()`)
- ❌ Auto-shutdown timers (`manageTShut()`)
- ❌ Auto-sleep timers (`manageTSleep()`)
- ❌ Android Auto integration
- ❌ Video player wake management
- ❌ Device control takeover for Android devices
- ❌ Close Now Playing button (per user request)

---

## 📦 Technical Details

- **Total Lines**: 1,021
- **Console Logs**: 51 unique log points
- **Window Functions**: 52 global functions exposed
- **Userscript Grants**: 
  - `GM_addStyle` (CSS injection)
  - `GM_getValue` (read settings)
  - `GM_setValue` (save settings)
- **Run-At**: `document-start` (early injection for spoofing)

---

## 🔧 Breaking Changes from v5

1. **Different global function names**: 
   - Old: `actPlayPause()` → New: `spotifyPlayPause()`
   - Old: `actSkipForward()` → New: `spotifySkipForward()`
   - Old: `actSkipBack()` → New: `spotifySkipBack()`
   - Old: `actRepeat()` → New: `spotifyToggleRepeat()`
   - Old: `actAddToFav()` → New: `spotifyToggleFavorite()`
   - Old: `actSeek()` → New: `spotifySeek()`
   
2. **New configuration system**: Settings now use GM_getValue/GM_setValue

3. **Removed features**: No more Android-specific functionality

---

## 📝 Usage Notes

### For Users
- Install via Violentmonkey/Tampermonkey
- Configure settings in userscript manager (optional)
- Check console (F12) for detailed logs
- All features work automatically

### For Developers
- All playback functions are exposed globally
- Token variables available: `window.spotifyAuthToken`, `window.spotifyClientToken`, `window.spotifyDeviceId`
- Media library data: `window.spotifyMediaLibrary` (if auto-fetch enabled)
- Comprehensive logging for debugging

---

## 🐛 Known Issues

None currently. Please report issues at: https://github.com/Myst1cX/spotifuck-userscript/issues

---

## 🙏 Credits

- Reverse-engineered from Spotifuck Android APK (latest version)
- Ported and optimized for web by Myst1cX
- Based on `classes1.dex/r0/e.java` injection logic
- Community feedback and testing

---

## 📄 License

MIT License - Same as previous versions
