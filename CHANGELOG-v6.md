# Spotifuck v6 Changelog

## Version 6.0.0 - Browser-Focused Port from v1.6.4

### Overview
Port of Spotifuck Android app v1.6.4 features to browser userscript. **Browser-only features**: enhanced ad blocking, improved playback controls, comprehensive logging. **Excluded**: Android-specific features (timers, wake locks, library API), Now Playing button (separate script), login helpers, video detection.

### New Features ✨

#### Enhanced Ad Blocking
- **Tracking Domain Blocking**: Now blocks sentry.io, fastly-insights.com, googlesyndication.com, doubleclick.net, amillionads.com, 2mdn.net, adxcel.com
- **Expanded Audio Ad Detection**: More comprehensive list of audio ad URL patterns including scdn.co/mp3-ad/, adstudio-assets.scdn.co
- **Smart Filtering**: Excludes legitimate content (podz-content, gew4-spclient) from blocking
- Console logging for all blocked requests

#### Code Quality Improvements
- **Better Variable Naming**: All element references use descriptive names
  - `playPauseButton` instead of `pb`
  - `skipForwardButton` instead of `fb`
  - `leftSidebar` instead of `ls`
  - `playbackProgressBar` instead of `rg`
- **Comprehensive Logging**: 50+ console.log statements on every critical function
  - All function entries logged with `[Spotifuck v6]` prefix
  - Element found/not found states logged
  - Action confirmations logged
  - Easy debugging for contributors

#### Playback Control Enhancements
- **Fixed actSeek()**: Now uses `pos + 1` for better seek precision (from v1.6.4)
- **Improved actAddToFav()**: Better timing and state management when removing favorites
- All functions include detailed console logging

### Technical Changes 🔧

#### Maintained from v5
- All CSS/UI styling and enhancements
- Sidebar toggle functionality
- Screen/navigator spoofing
- Autoplay logic
- Track status reporter
- All layout optimizations

### Excluded Features ❌

Based on user requirements, the following features were intentionally excluded:

**Android-Specific (Not browser-compatible)**
- Library fetching system (browser has native access)
  - `fetchAllLibrary()` - Not needed
  - `parseLibrary()` - Not needed
  - `checkMediaLib()` - Not needed
  - Token extraction for API calls - Not needed
- Android power management (browser-incompatible)
  - `manageTShut()` - Auto-shutdown timer
  - `manageTSleep()` - Auto-sleep timer
  - `wakeUp()` / `wakeOff()` - Wake lock functions
  
**Handled by Separate Scripts**
- Now Playing panel toggle button (user has separate script for this)
- Classic login helper (not needed)

**Not Needed for Browser**
- `playFromUri()` - Direct URI playback via API (power user feature)
- Video player detection - Android WebView specific

### Migration from v5

#### What's Changed
- Enhanced ad blocking with 7 tracking domains + expanded audio ad patterns
- Better variable naming throughout for maintainability
- 50+ console.log statements for comprehensive debugging
- Fixed seek precision issue (pos + 1)

#### What's the Same
- All CSS/UI styling from v5 maintained
- Playback controls API unchanged
- Sidebar toggle functionality identical
- Autoplay logic unchanged
- Track status reporter unchanged

#### Breaking Changes
- None - v6 is backward compatible with v5 usage

### File Statistics
- **Lines**: 569
- **Console logs**: 50+
- **Size**: ~27 KB

### Testing Checklist

- [ ] Verify enhanced ad blocking blocks tracking domains (check console for blocked requests)
- [ ] Test audio ad blocking (should see "Blocked audio ad" in console)
- [ ] Validate all playback controls (play, pause, skip, seek, repeat, favorite)
- [ ] Confirm sidebar toggle works correctly
- [ ] Review console logs for proper debugging output (use "[Spotifuck v6]" filter)
- [ ] Test on Firefox mobile browser
- [ ] Verify CSS styling matches v5
- [ ] Check autoplay functionality
- [ ] Validate track status reporting
- [ ] Test seek precision with pos + 1 fix

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
- `[Spotifuck v6] Seek position set to: 12345`

### Known Issues

None identified at release. Please report issues at:
https://github.com/Myst1cX/spotifuck-userscript/issues

### Credits

- Ported from Spotifuck Android app v1.6.4 (reverse-engineered)
- Original Spotifuck by deviato (4pda.to)
- Userscript adaptation by Myst1cX

### License

MIT License - See LICENSE file for details
