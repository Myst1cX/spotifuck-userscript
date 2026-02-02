# Spotifuck v6 - Summary of Changes

## What v6 Includes

### ✅ Core Features from v1.6.4
- **Pure Black AMOLED Mode**: Playback controls and library overlay use pure black (#000) background for OLED displays
- **Improved CSS Selectors**: Better layout fixes from v1.6.4 (right panel width, search bar positioning)
- **Better Variable Naming**: `unlockFlag`, `firstFuckDone` (clearer than v5's `alFlag`, `ffFlag`)
- **Enhanced Video Detection**: `.VideoPlayer__container video` selector for better ad blocking
- **Improved Seek Precision**: +1ms offset to prevent timing edge cases

### ✅ NEW: Custom Navigation Integration
- **Library Button in Nav Bar**: Positioned between Home and Search buttons
- **Full-Screen Library Overlay**: Takes over main screen when activated
- **Hidden Sidebar**: Desktop_LeftSidebar_Id hidden but used for data extraction
- **Native Spotify Integration**: Click-through to original library items

### ✅ All v5 Features Maintained
- Screen/navigator spoofing (1920×1080 desktop)
- Complete CSS UI overhaul for mobile
- Silent audio ad blocking
- Playback controls (play/pause, skip, repeat, favorite, seek)
- Autoplay on load
- Media status tracking
- Player unlock mechanism

### ❌ What Was Removed (Per User Request)
- Library sync system (fetchAllLibrary, parseLibrary, checkMediaLibrary)
- Enhanced token/device detection
- playFromUri function
- Now playing panel toggle button
- Login page enhancement
- Excessive console logging (kept only essential logs)
- Sidebar toggle mechanism (replaced with nav bar button)

## Key Improvements Over Previous Versions

1. **Navigation Integration**: Library button now in top nav bar, not sidebar
2. **Better UX**: Full-screen overlay instead of sidebar expansion
3. **AMOLED Mode**: Pure black throughout (overlay + playback controls)
4. **Better Code Quality**: Clearer variable names throughout
5. **Modern Selectors**: v1.6.4's improved CSS selectors
6. **Cleaner Interface**: No visible sidebar clutter

## New UI Layout

```
┌─────────────────────────────────────────┐
│ [🏠 Home] [📚 Library] [🔍 Search] ... │ ← Library button here
├─────────────────────────────────────────┤
│                                         │
│         Main Content Area               │
│                                         │
└─────────────────────────────────────────┘

When Library Clicked:
┌─────────────────────────────────────────┐
│ [🏠 Home] [📚 Library*] [🔍 Search] ... │
├─────────────────────────────────────────┤
│ Your Library                      [✖]  │
│─────────────────────────────────────────│
│  📀 Playlist 1    📀 Playlist 2        │
│  📀 Album 1       📀 Album 2           │
│  ...                                    │
│                                         │
└─────────────────────────────────────────┘
```

## Files Structure

```
spotifuck-userscript/
├── spotifuck-v6.user.js          # Main userscript (updated)
├── LIBRARY_BUTTON_GUIDE.md       # Updated technical documentation
└── V6_SUMMARY.md                 # This file
```

## Console Logging

Only essential logs with `[Spotifuck v6]` prefix:
- `"Initializing..."` - Script start
- `"Creating library button in nav bar"` - Button creation
- `"Library overlay created"` - Overlay setup
- `"Library overlay shown with X items"` - Content loaded
- `"Library overlay hidden"` - Overlay closed
- `"Autoplay triggered"` - One-time autoplay
- `"Pause detected"` / `"Play detected"` - State changes
- `"Ad blocked"` - Audio ad intercepted
- `"Player locked, reloading..."` - Error handling
- `"Unlocking player..."` - Unlock mechanism
- `"Playing: [track] by [artist]"` - Media updates
- `"Ready"` - Initialization complete

## Usage

1. Install Tampermonkey/Violentmonkey in Firefox for Android
2. Install the userscript
3. Navigate to open.spotify.com
4. Click "Your Library" button in top nav bar (between Home and Search)
5. Select any library item to navigate to it
6. Overlay closes automatically after selection

## Browser Compatibility

- **Primary**: Firefox for Android with Tampermonkey
- **Secondary**: Chrome/Edge desktop
- **Tested**: open.spotify.com web player

## Performance

- **Intervals**: 5-second polling for dynamic element detection
- **Memory**: Lightweight, no heavy API calls
- **CPU**: Minimal impact from simplified fetch interception
- **DOM Cloning**: Library grid cloned only when overlay opens

## Technical Highlights

### Library Button Creation
```javascript
const libraryBtn = document.createElement('button');
libraryBtn.className = 'spotifuck-library-btn';
// Inserted before search button in nav bar
searchButton.parentNode.insertBefore(libraryBtn, searchButton);
```

### Content Extraction
```javascript
// Clone library grid from hidden sidebar
const libraryGrid = document.querySelector('#Desktop_LeftSidebar_Id div[role="grid"]');
const clonedGrid = libraryGrid.cloneNode(true);
```

### Click Proxy
```javascript
// Clicking overlay item triggers original item
originalItems[index].click();
setTimeout(() => toggleLibraryOverlay(), 300);
```

## Future Enhancements (If Needed)

The removed features (library sync, token detection, playFromUri) are preserved in git history and can be re-enabled if desired in future versions.

## Support

For issues or questions, see:
- [LIBRARY_BUTTON_GUIDE.md](LIBRARY_BUTTON_GUIDE.md) - Detailed technical documentation
- [GitHub Issues](https://github.com/Myst1cX/spotifuck-userscript/issues)

