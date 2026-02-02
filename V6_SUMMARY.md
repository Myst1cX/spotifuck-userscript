# Spotifuck v6 - Summary of Changes

## What v6 Includes (Simplified from initial proposal)

### ✅ Core Features from v1.6.4
- **Pure Black AMOLED Mode**: Playback controls use pure black (#000) background for OLED displays
- **Improved CSS Selectors**: Better layout fixes from v1.6.4 (right panel width, search bar positioning)
- **Better Variable Naming**: `unlockFlag`, `firstFuckDone` (clearer than v5's `alFlag`, `ffFlag`)
- **Enhanced Video Detection**: `.VideoPlayer__container video` selector for better ad blocking
- **Improved Seek Precision**: +1ms offset to prevent timing edge cases
- **Updated Sidebar Dimensions**: 48×48px collapsed state (improved from v5's 50×40px)

### ✅ All v5 Features Maintained
- Screen/navigator spoofing (1920×1080 desktop)
- Complete CSS UI overhaul for mobile
- Sidebar toggle (library button) functionality
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

## Key Improvements Over v5

1. **AMOLED Mode**: Pure black playback controls (no more gradient)
2. **Better Code Quality**: Clearer variable names throughout
3. **Documentation**: Inline comments explaining library button behavior
4. **Refined Logging**: Only logs what's necessary for debugging
5. **Modern Selectors**: v1.6.4's improved CSS selectors

## Files Structure

```
spotifuck-userscript/
├── spotifuck-v6.user.js          # Main userscript (673 lines)
├── LIBRARY_BUTTON_GUIDE.md       # Detailed library button documentation
└── V6_SUMMARY.md                 # This file
```

## Console Logging

Only essential logs with `[Spotifuck v6]` prefix:
- `"Initializing..."` - Script start
- `"Library button configured"` - Button setup
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
4. Enjoy clean mobile UI with pure black AMOLED mode

## Browser Compatibility

- **Primary**: Firefox for Android with Tampermonkey
- **Secondary**: Chrome/Edge desktop
- **Tested**: open.spotify.com web player

## Performance

- **Intervals**: 5-second polling for dynamic element detection
- **Memory**: Lightweight, no heavy API calls
- **CPU**: Minimal impact from simplified fetch interception

## Future Enhancements (If Needed)

The removed features (library sync, token detection, playFromUri) are preserved in git history and can be re-enabled if desired in future versions.

## Support

For issues or questions, see:
- [LIBRARY_BUTTON_GUIDE.md](LIBRARY_BUTTON_GUIDE.md) - Detailed technical documentation
- [GitHub Issues](https://github.com/Myst1cX/spotifuck-userscript/issues)
