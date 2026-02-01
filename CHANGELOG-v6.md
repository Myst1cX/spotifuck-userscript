# Spotifuck v6 Changelog

## Version 6.0.0 - Browser-Focused Port from v1.6.4

### Overview
Port of Spotifuck Android app v1.6.4 features to browser userscript. Focus on browser-compatible features, excluding Android-specific functionality.

### New Features ✨

#### Enhanced Ad Blocking
- **Tracking Domain Blocking**: Now blocks sentry.io, fastly-insights.com, googlesyndication.com, doubleclick.net
- **Expanded Audio Ad Detection**: More comprehensive list of audio ad URL patterns
- **Smart Filtering**: Excludes legitimate content (podz-content, gew4-spclient) from blocking
- Console logging for all blocked requests

#### Now Playing Panel Toggle Button
- Custom SVG button added next to lyrics button
- Toggles the Now Playing view panel on/off
- Visual active state indicator (green when panel open)
- Styled to match Spotify's UI design language
- CSS class: `.npbtn` with hover and active states

#### Classic Login Helper
- Automatically adds "Email + Password Classic Login" link on login page
- Simplifies login process by adding direct link to `?allow_password=1`
- Styled button with blue background for visibility

#### Code Quality Improvements
- **Better Variable Naming**: All element references use descriptive names
  - `playPauseButton` instead of `pb`
  - `skipForwardButton` instead of `fb`
  - `nowPlayingButton` for new button
  - `leftSidebar` instead of `ls`
- **Comprehensive Logging**: Console.log statements on every critical function
  - All function entries logged with `[Spotifuck v6]` prefix
  - Element found/not found states logged
  - Action confirmations logged
  - Easy debugging for contributors

#### Playback Control Enhancements
- **Fixed actSeek()**: Now uses `pos + 1` for better seek precision (from v1.6.4)
- **Improved actAddToFav()**: Better timing and state management when removing favorites
- All functions include detailed console logging

### Technical Changes 🔧

#### DOM Selector Updates
- Updated Now Playing panel detection to use `#Desktop_PanelContainer_Id`
- Better video player detection: `.VideoPlayer__container video`
- More robust element selection throughout

#### CSS Additions
```css
/* Now Playing Panel Toggle Button */
button.npbtn {
    background: transparent;
    border: none;
    color: var(--text-subdued, #a7a7a7);
    cursor: pointer;
    padding: 8px;
    display: inline-flex;
    align-items: center;
    justify-content: center;
    border-radius: 4px;
    transition: color 0.2s;
}

button.npbtn:hover {
    color: var(--text-base, #fff);
}

button.npbtn.active {
    color: var(--text-bright-accent, #1ed760);
}
```

### Excluded Features ❌

Based on user feedback, the following Android-specific features were intentionally excluded:

- **Library Fetching System**: Browser already has native library access
  - `fetchAllLibrary()` - Not needed
  - `parseLibrary()` - Not needed
  - `checkMediaLib()` - Not needed
  - Token extraction for API calls - Not needed

- **Android Power Management**: Browser-incompatible
  - `manageTShut()` - Auto-shutdown timer
  - `manageTSleep()` - Auto-sleep timer
  - `wakeUp()` / `wakeOff()` - Wake lock functions

- **AndBridge Functions**: WebView-specific
  - Simplified to console-only implementations where needed
  - No actual Android bridge communication

### Migration from v5

#### What's Changed
- Enhanced ad blocking with more domains
- New Now Playing toggle button available
- Better logging throughout for debugging
- Fixed seek precision issue
- Classic login helper on login page

#### What's the Same
- All CSS/UI styling from v5 maintained
- Playback controls API unchanged
- Sidebar toggle functionality identical
- Autoplay logic unchanged
- Track status reporter unchanged

#### Breaking Changes
- None - v6 is backward compatible with v5 usage

### Testing Checklist

- [ ] Verify enhanced ad blocking on Spotify Web Player
- [ ] Test Now Playing toggle button functionality
- [ ] Check classic login helper on login page
- [ ] Validate all playback controls (play, pause, skip, seek, repeat, favorite)
- [ ] Confirm sidebar toggle works correctly
- [ ] Review console logs for proper debugging output
- [ ] Test on Firefox mobile browser
- [ ] Verify CSS styling matches expectations
- [ ] Check autoplay functionality
- [ ] Validate track status reporting

### Development Notes

#### Variable Naming Convention
All DOM element references follow this pattern:
- Use full descriptive names: `playPauseButton`, `skipBackButton`
- No single-letter variables (except loop counters)
- Clarify element type in name where helpful

#### Logging Convention
All console logs follow this format:
```javascript
console.log('[Spotifuck v6] <Function/Action>: <details>');
```

Examples:
- `[Spotifuck v6] actPlayPause() called, play: true`
- `[Spotifuck v6] Blocked audio ad: https://...`
- `[Spotifuck v6] Now Playing button clicked`

### Known Issues

None identified at release. Please report issues at:
https://github.com/Myst1cX/spotifuck-userscript/issues

### Credits

- Ported from Spotifuck Android app v1.6.4 (reverse-engineered)
- Original Spotifuck by deviato (4pda.to)
- Userscript adaptation by Myst1cX

### License

MIT License - See LICENSE file for details
