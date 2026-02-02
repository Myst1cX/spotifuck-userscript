# Spotifuck v6 - Library Button Guide

## Overview
This document explains how the library button works in Spotifuck v6, following the exact behavior from the reversed Spotifuck Android app code.

## Library Button Location

The library button is located in the left sidebar header:

```
Selector: #Desktop_LeftSidebar_Id header > div > div:first-child button
```

This is the native Spotify "Your Library" button that gets enhanced with toggle functionality.

## How It Works (from Reversed Code)

### 1. Button Setup
The script finds the library button and:
- Adds `.fuckd` and `.lbtn` classes to mark it as configured
- Sets padding to 0 and height to 20px for styling
- Attaches a click listener that calls `switchLeftSidebar()`
- Immediately calls `switchLeftSidebar()` to set initial state

### 2. Toggle Mechanism: `switchLeftSidebar()`

The function detects the current state by checking:
```javascript
const navFirstChild = leftSidebar.querySelector('nav > div > div:first-child');
const isExpanded = navFirstChild.classList.length === 2;
```

Spotify's native button toggles CSS classes on this element. When it has 2 classes, the sidebar is expanded.

### 3. Two States

#### Expanded State (Full Library View)
When `isExpanded === true`:
- **Position**: `fixed`
- **Size**: 100% width × 92% height
- **Location**: `left: 0`, `top: 0`
- **Z-index**: 20 (overlays main content)
- **Header Text**: Changes to **"✖ Close Library"**
- **Appearance**: Full-screen overlay showing entire library

#### Collapsed State (Small Button)
When `isExpanded === false`:
- **Position**: `fixed`
- **Size**: 48px × 48px (v1.6.4 improvement, was 50×40px in v5)
- **Location**: `left: 60px`, `top: 0`
- **Z-index**: 1 (below main content)
- **Header Text**: Shows normal library title
- **Appearance**: Small icon button in top-left corner

### 4. Auto-Close on Selection

When you click any item in the library grid:
```javascript
const libraryGridItems = document.querySelector('#Desktop_LeftSidebar_Id div[role="grid"]');
```

The script automatically:
1. Detects the click event
2. Calls `libraryButton.click()` to toggle the sidebar closed
3. Navigates to the selected content

This provides a smooth mobile experience where the library closes after you make a selection.

### 5. The "Close" Button

**Important**: There is NO separate close button!

The library button itself acts as both:
- **Open** button (when collapsed)
- **Close** button (when expanded)

When expanded, the h1 text changes to "✖ Close Library" to indicate that clicking will close it.

## Key Features

### Pure Black AMOLED Mode
Playback controls use pure black (#000) background:
```css
aside[data-testid="now-playing-bar"] {
    background: #000 !important;
    box-shadow: none;
    border-top: 1px solid #666;
}
```

### Search Input Integration
When focusing on the search input:
- Now-playing bar hides temporarily
- Provides more screen space
- Restores when search loses focus

### Improved Dimensions (v1.6.4)
Collapsed state: 48×48px (improved from v1.5.2's 50×40px)
- Better visual consistency
- Improved touch target size for mobile

## Code Flow

1. **Page Load**: Script initializes
2. **Button Detection**: Every 5 seconds, looks for library button
3. **Setup**: When found, adds event listener and initial state
4. **User Click**: Library button clicked
5. **Toggle**: `switchLeftSidebar()` checks current state
6. **Apply Styling**: Applies expanded or collapsed styles
7. **Update Text**: Changes h1 to "✖ Close Library" if expanded
8. **Selection**: User clicks library item
9. **Auto-Close**: Script triggers button click to collapse
10. **Navigate**: Spotify navigates to selected content

## Debugging

Console logging with `[Spotifuck v6]` prefix:
- `"Library button configured"` - Button found and setup
- `"Expanding sidebar"` - Sidebar going to full-screen mode
- `"Collapsing sidebar"` - Sidebar going to small button mode
- `"Auto-closing library"` - Library closing after selection

## Technical Details

### Why Check classList.length?
```javascript
const isExpanded = navFirstChild.classList.length === 2;
```
Spotify's native button adds/removes CSS classes to indicate state. When expanded, the nav element has 2 classes. This is more reliable than checking computed styles or aria attributes.

### Why setTimeout Wrapper?
```javascript
libraryButton.addEventListener('click', () => {
    setTimeout(() => switchLeftSidebar(), 0);
});
```
This defers execution to the next event loop tick, allowing Spotify's native click handler to run first and update the DOM before we apply our custom styling.

### Why 5-Second Polling?
```javascript
cssHackInterval = setInterval(() => { ... }, 5000);
```
Spotify's web player dynamically creates/destroys DOM elements during navigation. The 5-second polling ensures:
- Library button is always configured after page transitions
- Event listeners remain active
- Initial state is properly set

### Why Both nav Element AND h1?
- **nav element classes**: Used to detect current state (expanded/collapsed)
- **h1 text**: User-visible indicator that clicking will close
- They work together: check state via nav, update UI via h1

## Comparison with v5

### Same Behavior
- Library button toggles between expanded/collapsed
- h1 shows "✖ Close Library" when expanded
- Auto-closes on item selection
- Sidebar positions and z-indexes

### v1.6.4 Improvements in v6
- **Collapsed size**: 48×48px (was 50×40px)
- **Top position**: 0 (was 2px)
- **Pure black AMOLED**: Playback controls use #000
- **Better variable names**: `unlockFlag` instead of `alFlag`
- **Enhanced video detection**: `.VideoPlayer__container video`
- **Improved seek**: +1ms offset for precision

## Compatibility

- **Browser**: Firefox for Android (primary), Chrome/Edge desktop
- **Spotify**: Web Player (open.spotify.com)
- **Userscript Manager**: Tampermonkey, Violentmonkey, Greasemonkey

## Summary

The library button is a **single toggle button** in the sidebar header that:
1. Starts in collapsed state (small button in corner)
2. Click to expand → full-screen overlay with "✖ Close Library" text
3. Click again (or select item) → collapses back to small button
4. No separate buttons, overlays, or navigation bar integration needed
5. Follows the exact pattern from reversed Spotifuck Android app code
