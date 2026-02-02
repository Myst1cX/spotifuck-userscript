# Spotifuck v6 - Library Button Guide

## Overview
This document explains how the library button works in Spotifuck v6 and how the sidebar toggle mechanism operates.

## Library Button Location

The library button is located in the left sidebar of the Spotify web player:

```
Selector: #Desktop_LeftSidebar_Id header > div > div:first-child button
```

This is the "Your Library" button that Spotify provides by default in their web interface.

## How It Works

### 1. Button Detection & Setup
The script finds the library button every 5 seconds (via `addCSSHacks()` function) and:
- Adds the `.fuckd` class to mark it as configured
- Styles it (removes padding, sets height to 20px)
- Attaches a click listener that triggers `switchLeftSidebar()`

### 2. Sidebar States

The sidebar has two states:

#### Collapsed State (Default mobile view)
- **Dimensions**: 48px × 48px
- **Position**: Fixed at top-left (top: 0, left: 60px)
- **Z-index**: 1 (below main content)
- **Appearance**: Small icon button

#### Expanded State (Full library view)
- **Dimensions**: 100% width × 92% height
- **Position**: Fixed at (left: 0)
- **Z-index**: 20 (overlays main content)
- **Header text**: Changed to "✖ Close Library"
- **Appearance**: Full overlay showing entire library

### 3. Toggle Detection

The script detects which state the sidebar is in by checking:
```javascript
const navFirstChild = leftSidebar.querySelector('nav > div > div:first-child');
const isExpanded = navFirstChild.classList.length === 2;
```

When Spotify's native button is clicked, it toggles classes on this element, which we detect to apply the appropriate styling.

### 4. Auto-Close on Item Selection

When you click on any item in the library grid:
```javascript
const libraryGridItems = document.querySelector('#Desktop_LeftSidebar_Id div[role="grid"]');
```

The script automatically:
1. Detects the click
2. Closes the library by triggering the button click again
3. This provides a smooth mobile experience

## Key Features

### Pure Black AMOLED Mode
The playback controls use pure black (#000) background for OLED screens:
```css
aside[data-testid="now-playing-bar"] {
    background: #000 !important;
    box-shadow: none;
    border-top: 1px solid #666;
}
```

### Search Input Integration
When focusing on the search input:
- The now-playing bar hides (display: none)
- Provides more screen space for search results
- Restores on blur

### Improved Dimensions (v1.6.4)
The collapsed state uses 48×48px (improved from v1.5.2's 50×40px) for better visual consistency and mobile touch target sizing.

## Code Flow

1. **Initialization**: Script loads on `document-start`
2. **CSS Injection**: All styles applied via GM_addStyle
3. **Feature Setup**: `setupPlaybackFeatures()` runs every 5 seconds
4. **CSS Hacks**: `addCSSHacks()` configures library button every 5 seconds
5. **Click Handler**: User clicks library button
6. **Toggle Function**: `switchLeftSidebar()` detects current state and applies opposite state styles

## Debugging

All critical actions have console logging with `[Spotifuck v6]` prefix:
- `"Library button configured"` - Button found and setup complete
- `"Pause detected"` / `"Play detected"` - Playback state changes
- `"Autoplay triggered"` - One-time autoplay on load
- `"Ad blocked"` - Audio ad intercepted
- `"Player locked, reloading..."` - 404 error on connect-state
- `"Unlocking player..."` - Unlock mechanism triggered

## Technical Details

### Why the 5-second intervals?
Spotify's web player dynamically creates and destroys DOM elements. The 5-second polling ensures:
- Library button is always configured even after page transitions
- Search input handlers remain active
- Playback button is properly hooked

### Why the setTimeout wrapper?
```javascript
setTimeout(() => switchLeftSidebar(), 0);
```
This defers execution to the next event loop tick, allowing Spotify's native click handler to execute first and update the DOM state before we apply our styling.

### Why check classList.length?
```javascript
const isExpanded = navFirstChild.classList.length === 2;
```
Spotify adds/removes CSS classes to indicate sidebar state. When expanded, the element has 2 classes; when collapsed, it has fewer. This is more reliable than checking computed styles.

## Compatibility

- **Browser**: Firefox for Android (primary), Chrome/Edge desktop
- **Spotify**: Web Player (open.spotify.com)
- **Userscript Manager**: Tampermonkey, Violentmonkey, Greasemonkey

## Changes from v5 to v6

1. **Pure Black AMOLED**: Enabled by default (was gradient in v5)
2. **Improved dimensions**: 48×48px collapsed (was 50×40px)
3. **Better variable names**: `unlockFlag` instead of `alFlag`
4. **Enhanced ad blocking**: Better video detection with `.VideoPlayer__container video`
5. **Cleaner logging**: Only essential messages
6. **Removed**: Library sync, token capture, playFromUri, now-playing panel button, login enhancement
