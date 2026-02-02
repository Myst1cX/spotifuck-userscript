# Spotifuck v6 - Library Button Guide

## Overview
This document explains how the library button works in Spotifuck v6 and the custom navigation integration.

## Library Button Location

**New in v6:** The library button is now located in the top navigation bar, positioned between the Home and Search buttons.

```
Location: #global-nav-bar
Created dynamically as: .spotifuck-library-btn
```

The original Spotify left sidebar (`#Desktop_LeftSidebar_Id`) is completely hidden but still used internally to extract library data.

## How It Works

### 1. Button Creation
The script creates a custom library button in the navigation bar:
- Finds `#global-nav-bar` and the search button
- Creates a new button with library icon and "Your Library" text
- Inserts it before the search button (between Home and Search)
- Styled with `.spotifuck-library-btn` class

### 2. Library Overlay

When you click the library button:

#### Overlay Display
- **Full-screen overlay** appears below the navigation bar (top: 64px)
- **Background**: Pure black (#000) for AMOLED displays
- **Z-index**: 1000 (above all other content)
- **Header**: Shows "Your Library" title with close button (✖)

#### Content Population
1. Script extracts the library grid from the hidden `#Desktop_LeftSidebar_Id`
2. Clones the grid content into the overlay
3. Adds click handlers to each library item
4. When an item is clicked:
   - Triggers the corresponding item in the hidden sidebar
   - Closes the overlay after 300ms
   - Navigates to the selected content

### 3. Toggle States

The overlay has two states:

#### Hidden (Default)
- `display: none`
- Library button shows normal color (#b3b3b3)

#### Shown (Active)
- `display: block` (via `.show` class)
- Library button highlighted with `.active` class
- Full-screen overlay visible with library grid
- Scrollable content if needed

### 4. Close Actions

The overlay can be closed by:
- Clicking the ✖ close button in the overlay header
- Clicking the library button again
- Automatically after selecting a library item

## Key Features

### Pure Black AMOLED Mode
The overlay uses pure black background for OLED screens:
```css
.spotifuck-library-overlay {
    background: #000;
}
```

### Responsive Design
- Adapts to any screen size
- Full viewport coverage below nav bar
- Scrollable content area

### Custom Styling
```css
.spotifuck-library-btn {
    /* Styled like native Spotify nav buttons */
    padding: 8px 16px;
    border-radius: 24px;
    /* Hover effects for better UX */
}
```

## Code Flow

1. **Initialization**: Script loads on `document-start`
2. **CSS Injection**: Sidebar hidden, overlay styles added
3. **Button Creation**: Custom library button added to nav bar every 5 seconds
4. **Overlay Creation**: Full-screen overlay container created
5. **Click Handler**: User clicks library button
6. **Content Load**: Library grid cloned from hidden sidebar
7. **Item Selection**: Click handlers route to original items
8. **Auto-close**: Overlay closes after navigation

## Debugging

Console logging with `[Spotifuck v6]` prefix:
- `"Creating library button in nav bar"` - Button creation
- `"Library overlay created"` - Overlay container setup
- `"Library overlay shown with X items"` - Content loaded
- `"Library overlay hidden"` - Overlay closed
- `"Library grid not ready yet"` - Waiting for Spotify to load

## Technical Details

### Why Hide the Sidebar?
The native Spotify sidebar (`#Desktop_LeftSidebar_Id`) is hidden with `display: none` but not removed. This allows:
- Spotify's library system to function normally
- Content to be extracted and displayed in our custom overlay
- Native click handlers and navigation to work seamlessly

### Why Clone the Grid?
```javascript
const clonedGrid = libraryGrid.cloneNode(true);
```
We clone the grid to:
- Avoid interfering with Spotify's DOM structure
- Maintain native functionality
- Allow custom styling in the overlay

### Why Proxy Clicks?
```javascript
originalItems[index].click();
```
When you click an item in the overlay, we find the corresponding original item and trigger its click event. This ensures:
- Spotify's navigation works correctly
- All native features are preserved
- No need to reimplement Spotify's routing

### 5-Second Polling
The button and overlay are checked/created every 5 seconds to handle:
- Dynamic page loading
- Route changes within Spotify
- DOM element recreation

## Navigation Bar Structure

After initialization:
```
#global-nav-bar
├── Home button
├── .spotifuck-library-btn ← Our custom button
│   ├── SVG icon (library)
│   └── "Your Library" text
├── Search button
└── (other buttons...)
```

## Overlay Structure

```
.spotifuck-library-overlay
├── .spotifuck-library-overlay-header
│   ├── h1 "Your Library"
│   └── .spotifuck-library-close-btn (✖)
└── .spotifuck-library-content
    └── (cloned library grid)
```

## Changes from Previous Version

### What Changed
1. **Sidebar**: Hidden completely (was toggleable overlay)
2. **Button Location**: Top navigation bar (was inside sidebar)
3. **Button Style**: Spotify-native look (was custom styled in sidebar)
4. **Library Display**: Full-screen overlay (was sidebar expansion)
5. **Positioning**: Between Home and Search (was left side of screen)

### What Stayed
- Pure black AMOLED mode
- Auto-close on selection
- All library functionality
- Click-through to original items

## Compatibility

- **Browser**: Firefox for Android (primary), Chrome/Edge desktop
- **Spotify**: Web Player (open.spotify.com)
- **Userscript Manager**: Tampermonkey, Violentmonkey, Greasemonkey
- **Layout**: Works with Spotify's current navigation structure

## Troubleshooting

### Library Button Not Appearing
- Wait 5 seconds for polling cycle
- Check that `#global-nav-bar` exists
- Verify search button is present
- Check console for creation message

### Library Empty
- Spotify may still be loading
- Try clicking library button again after a few seconds
- Check if hidden sidebar has content

### Items Not Clickable
- Ensure overlay is fully loaded
- Check console for error messages
- Verify original sidebar items exist

## Support

For issues or questions, see:
- [V6_SUMMARY.md](V6_SUMMARY.md) - Feature overview
- [GitHub Issues](https://github.com/Myst1cX/spotifuck-userscript/issues)

