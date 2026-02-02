// ==UserScript==
// @name         Spotifuck Userscript v6
// @namespace    https://github.com/Myst1cX/spotifuck-userscript
// @version      6.0.0
// @description  Spotifuck 1.6.4 UI improvements with pure black AMOLED mode, enhanced ad blocking, and better selectors
// @author       Myst1cX (adapted from Spotifuck app v1.6.4)
// @match        https://open.spotify.com/*
// @grant        GM_addStyle
// @run-at       document-start
// @homepageURL  https://github.com/Myst1cX/spotifuck-userscript
// @supportURL   https://github.com/Myst1cX/spotifuck-userscript/issues
// @updateURL    https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-v6.user.js
// @downloadURL  https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-v6.user.js
// ==/UserScript==

(function() {
    'use strict';

    console.log('[Spotifuck v6] Initializing...');

    // --- Spoof screen and navigator properties (run as early as possible) ---
    const spoofScript = `
        Object.defineProperty(window.screen, 'width', {get: () => 1920});
        Object.defineProperty(window.screen, 'height', {get: () => 1080});
        Object.defineProperty(window.screen, 'availWidth', {get: () => 1920});
        Object.defineProperty(window.screen, 'availHeight', {get: () => 1040});
        Object.defineProperty(window, 'innerWidth', {get: () => 1920});
        Object.defineProperty(window, 'innerHeight', {get: () => 978});
        Object.defineProperty(window.navigator, 'vendor', {get: () => 'Google Inc.'});
        Object.defineProperty(window.navigator, 'productSub', {get: () => '20030107'});
        Object.defineProperty(window.navigator, 'platform', {get: () => 'Win32'});
        Object.defineProperty(window.navigator, 'oscpu', {get: () => 'Windows NT 10.0; Win64; x64'});
    `;
    const scriptNode = document.createElement('script');
    scriptNode.textContent = spoofScript;
    document.documentElement.appendChild(scriptNode);
    scriptNode.remove();

    // --- Inject Spotifuck CSS hacks ---
    GM_addStyle(`
            body {
                min-width: 100% !important;
                min-height: 100% !important;
            }

            .os-scrollbar {
                --os-size: 6px !important;
            }

            .contentSpacing {
                padding: 0;
            }

            div[data-testid="root"] {
                --panel-gap: 0 !important;
            }

            /* Enhanced right panel width fix from v1.6.4 */
            #main-view + div,
            #main-view + div > div {
                overflow: hidden !important;
                width: auto;
            }

            #main-view + div > div > div > div:nth-child(2) > div {
                width: 100vw !important;
            }

            /* Hide unnecessary UI elements */
            div[data-encore-id="banner"],
            #global-nav-bar > div:first-of-type,
            #global-nav-bar a[href="/download"],
            button[data-testid="fullscreen-mode-button"],
            div.main-view-container__mh-footer-container,
            div[data-testid="hover-or-focus-tooltip"],
            #Desktop_LeftSidebar_Id header > div > div:last-child {
                display: none !important;
            }

            /* Artist page layout optimization */
            section[data-testid="artist-page"] > div > div:first-child:not([data-encore-id]) {
                height: 25vh;
            }

            /* Enhanced tracklist styling */
            div[data-testid="tracklist-row"] {
                padding: 0 10px 0 0;
                grid-gap: 0;
            }

            div[data-testid="tracklist-row"] button:not([data-testid="add-to-playlist-button"]) {
                transform: scale(1.3) !important;
                opacity: 0.6 !important;
                -webkit-margin-end: 0 !important;
            }

            div[data-testid="tracklist-row"] button:hover {
                color: #2d6 !important;
            }

            div[data-testid="tracklist-row"] > div:first-child > div:first-child {
                height: 24px;
                min-height: 24px;
                min-width: 24px;
                margin: 0 8px !important;
            }

            /* Responsive grid columns for different layouts */
            [aria-colcount="3"] div[data-testid="tracklist-row"] {
                grid-template-columns: [index] var(--tracklist-index-column-width,40px) [first] minmax(120px,var(--col1,4fr)) [last] minmax(82px,var(--col2,1fr)) !important;
            }

            [aria-colcount="4"] div[data-testid="tracklist-row"] {
                grid-template-columns: [index] var(--tracklist-index-column-width,40px) [first] minmax(120px,var(--col1,4fr)) [var1] minmax(120px,var(--col2,2fr)) [last] minmax(82px,var(--col3,1fr)) !important;
            }

            [aria-colcount="5"] div[data-testid="tracklist-row"] {
                grid-template-columns: [index] var(--tracklist-index-column-width,40px) [first] minmax(120px,var(--col1,6fr)) [var1] minmax(120px,var(--col2,4fr)) [var2] minmax(120px,var(--col3,3fr)) [last] minmax(82px,var(--col4,1fr)) !important;
            }

            /* Track page specific layouts */
            section[data-testid="track-page"] > div.contentSpacing > div:nth-child(2) [aria-colcount="2"] div[data-testid="tracklist-row"] {
                grid-template-columns: [first] minmax(120px,var(--col0,4fr)) [last] minmax(82px,var(--col1,1fr)) !important;
            }

            section[data-testid="track-page"] > div.contentSpacing > div:nth-child(2) [aria-colcount="3"] div[data-testid="tracklist-row"] {
                grid-template-columns: [first] minmax(120px,var(--col0,4fr)) [var1] minmax(120px,var(--col1,2fr)) [last] minmax(82px,var(--col2,1fr)) !important;
            }

            /* Content spacing and layout fixes */
            * {
                --content-spacing: 10px;
            }

            section[data-testid="home-page"] .contentSpacing {
                padding: 0 10px !important;
                overflow: hidden;
            }

            div[data-testid="grid-container"] {
                margin-inline: 0 !important;
                column-gap: 0 !important;
                overflow: hidden !important;
            }

            div[data-testid="action-bar-row"],
            div[data-testid="topbar-content"] {
                padding: 5px 10px;
            }

            div[data-testid="track-list"] > div:first-child,
            div[data-testid="playlist-tracklist"] > div:first-child {
                margin: 0 !important;
                padding: 0 !important;
            }

            main > section:not([data-testid="artist-page"]) > div:first-child {
                height: auto !important;
                min-height: auto !important;
                padding: 10px;
            }

            section[data-testid="track-page"] > div > div.contentSpacing > div:last-child {
                overflow: hidden;
            }

            section[data-testid="artist-page"] > div > div:first-child > div.contentSpacing {
                padding: 10px;
            }

            section[data-testid="artist-page"] div[data-testid="grid-container"] h2,
            section[data-testid="artist-page"] section[data-testid="component-shelf"] {
                padding: 0 10px;
            }

            /* Typography enhancements */
            main > section h1.encore-text-headline-large {
                font-size: 22px !important;
            }

            section[data-testid="artist-page"] span.encore-text-headline-large {
                font-size: 26px !important;
            }

            section[data-testid="track-page"] h1 {
                font-size: 20px !important;
            }

            /* Enhanced now playing bar styling - Pure Black AMOLED Mode */
            aside[data-testid="now-playing-bar"] {
                min-width: 100% !important;
                background: #000 !important;
                box-shadow: none;
                border-top: 1px solid #666;
            }
            aside[data-testid="now-playing-bar"] > div:first-child {
                margin-top: 2px;
                flex-direction: column !important;
                height: auto !important;
            }
            aside[data-testid="now-playing-bar"] > div > div {
                width: 100% !important;
            }

            aside[data-testid="now-playing-bar"] > div > div:last-child > div {
                min-height: 32px;
                margin: 5px 10px;
            }

            aside[data-testid="now-playing-bar"] > div > div:last-child button {
                transform: scale(1.15);
                margin: 0 5px;
            }

            /* Player controls enhancement */
            div[data-testid="general-controls"] {
                margin: 15px 0 25px;
            }

            div[data-testid="general-controls"] button {
                transform: scale(1.4) !important;
                margin: 0 8px !important;
            }

            div[data-testid="player-controls"] {
                margin: 5px 0;
            }

            /* Now playing widget optimization */
            div[data-testid="now-playing-widget"] {
                justify-content: center;
                overflow: hidden;
            }

            /* Enhanced search form positioning - v1.6.4 improvement */
            form[role="search"] {
                z-index: 10;
                margin-left: 48px;
                max-width: 88%;
            }

            div[data-testid="now-playing-widget"] > div:last-child > button {
                transform: scale(1.3);
            }

            div[data-testid="now-playing-widget"] > div:first-child {
                display: none !important;
            }

            div[data-testid="now-playing-widget"] > div:nth-child(2) {
                display: flex !important;
                overflow: hidden !important;
            }

            div[data-testid="now-playing-widget"] > div:nth-child(2) span {
                font-size: 13px !important;
                height: 20px !important;
                margin: 0 !important;
            }

            div[data-testid="now-playing-widget"] > div:nth-child(2) > div {
                min-width: auto;
                max-width: 66%;
            }

            /* Tooltip and transition fixes */
            [data-tippy-root] {
                overflow: hidden !important;
            }

            [data-tippy-root],
            [data-tippy-root] * {
                transition: none !important;
                transform: none !important;
            }

            .YourLibraryX header {
                padding: 14px;
            }

            /* Library button in navbar (shown when sidebar is closed) */
            .spotifuck-lib-nav-btn {
                display: none;
                align-items: center;
                gap: 8px;
                background: transparent;
                border: none;
                color: #b3b3b3;
                cursor: pointer;
                padding: 8px 12px;
                border-radius: 20px;
                font-size: 14px;
                font-weight: 700;
                transition: all 0.2s;
            }

            .spotifuck-lib-nav-btn.visible {
                display: flex;
            }

            .spotifuck-lib-nav-btn:hover {
                background: rgba(255, 255, 255, 0.1);
                color: #fff;
            }

            .spotifuck-lib-nav-btn svg {
                width: 20px;
                height: 20px;
            }

            /* Hide sidebar when closed */
            #Desktop_LeftSidebar_Id.spotifuck-hidden {
                display: none !important;
            }
        `);

    // --- Main JavaScript injection for web player ---
    const mainScript = `
        (function() {
            // State variables with improved naming from v1.6.4
            let requestedPause = false;
            let firstPlay = true;
            let unlockFlag = false;
            let firstFuckDone = false;
            let lastState = null;
            let lastPosition = null;
            let isPlaying = false;
            
            // Interval IDs
            let playbackFeaturesInterval = null;
            let autoFeaturesInterval = null;
            let cssHackInterval = null;
            let mediaAutoInterval = null;

            // Store original fetch for ad blocking
            const originalFetch = window.fetch;

            // --- Simple Fetch Interception for Playback State Detection ---
            window.fetch = async function(...args) {
                const [url, options] = args;
                const method = options?.method?.toUpperCase?.() || 'GET';

                // Detect play/pause from track-playback API
                if (firstFuckDone && url.includes('/track-playback/') && method === 'PUT') {
                    try {
                        const paused = options?.body ? JSON.parse(options.body)?.state_ref?.paused : undefined;
                        if (paused === true && isPlaying) {
                            console.log('[Spotifuck v6] Pause detected');
                            manageAllFeatures(false);
                        } else if (paused === false && !isPlaying) {
                            console.log('[Spotifuck v6] Play detected');
                            manageAllFeatures(true);
                        }
                    } catch(e) {}
                }

                // Execute original fetch
                try {
                    const response = await originalFetch(url, options);
                    
                    // Handle player locked state (404 on connect-state)
                    if (response.status === 404 && url.includes('connect-state') && url.includes('/command/from/')) {
                        console.log('[Spotifuck v6] Player locked, reloading...');
                        location.reload();
                    }
                    
                    return response;
                } catch(error) {
                    throw error;
                }
            };

            // --- Main Playback Features Monitoring ---
            window.setupPlaybackFeatures = function() {
                if (playbackFeaturesInterval) clearInterval(playbackFeaturesInterval);
                
                playbackFeaturesInterval = setInterval(() => {
                    // Setup play/pause button
                    const playPauseButton = document.querySelector('aside button[data-testid="control-button-playpause"]:not(.fuckd)');
                    if (playPauseButton) {
                        playPauseButton.classList.add('fuckd');
                        window.playPauseButton = playPauseButton;

                        playPauseButton.addEventListener('click', () => {
                            if (playPauseButton.getAttribute('aria-label') !== 'Play') {
                                console.log('[Spotifuck v6] Pause requested');
                                requestedPause = true;
                                unlockFlag = false;
                            } else if (!unlockFlag) {
                                requestedPause = false;
                                unlockFlag = true;
                                
                                setTimeout(() => {
                                    if (unlockFlag && playPauseButton.getAttribute('aria-label') === 'Play') {
                                        console.log('[Spotifuck v6] Unlocking player...');
                                        skipForward();
                                        triggerUnlock();
                                    } else if (unlockFlag) {
                                        unlockFlag = false;
                                    }
                                }, 10000);
                            }
                        });

                        if (!firstFuckDone) {
                            firstFuckDone = true;
                            console.log('[Spotifuck v6] Playback features initialized');
                            addAutoFeatures();
                            addCSSHacks();
                            addMediaAutoUpdate();
                        }
                    }
                }, 5000);
            };

            // Initialize playback features
            setupPlaybackFeatures();

            // --- Feature Management ---
            window.manageAllFeatures = function(play) {
                isPlaying = play;

                if (play) {
                    setupPlaybackFeatures();
                    addAutoFeatures();
                    addCSSHacks();
                    addMediaAutoUpdate();
                } else {
                    if (playbackFeaturesInterval) clearInterval(playbackFeaturesInterval);
                    if (autoFeaturesInterval) clearInterval(autoFeaturesInterval);
                    if (cssHackInterval) clearInterval(cssHackInterval);
                    if (mediaAutoInterval) clearInterval(mediaAutoInterval);
                }
            };

            // --- Unlock mechanism ---
            window.triggerUnlock = function() {
                const unlockInterval = setInterval(() => {
                    if (window.playPauseButton?.disabled) {
                        window.location.reload();
                    } else if (window.playPauseButton?.getAttribute('aria-label') !== 'Play') {
                        clearInterval(unlockInterval);
                        unlockFlag = false;
                        console.log('[Spotifuck v6] Unlocked');
                    }
                }, 3000);
            };

            // --- Playback Control Functions ---
            window.playPause = function(shouldPlay) {
                if ('playPauseButton' in window) {
                    const isCurrentlyPaused = window.playPauseButton.getAttribute('aria-label') === 'Play';
                    if (isCurrentlyPaused && shouldPlay) {
                        window.playPauseButton.click();
                    } else if (!isCurrentlyPaused && !shouldPlay) {
                        window.playPauseButton.click();
                    }
                }
            };

            window.skipBack = function() {
                const skipBackButton = document.querySelector('button[data-testid="control-button-skip-back"]');
                if (skipBackButton) skipBackButton.click();
            };

            window.skipForward = function() {
                const skipForwardButton = document.querySelector('button[data-testid="control-button-skip-forward"]');
                if (skipForwardButton) skipForwardButton.click();
            };

            window.toggleRepeat = function() {
                const repeatButton = document.querySelector('button[data-testid="control-button-repeat"]');
                if (repeatButton) repeatButton.click();
            };

            window.toggleFavorite = function() {
                const favoriteButton = document.querySelector('div[data-testid="now-playing-widget"] > div:last-child > button');
                if (favoriteButton) {
                    const isFavorite = favoriteButton.getAttribute('aria-checked') === 'true';
                    
                    if (!isFavorite) {
                        favoriteButton.click();
                    } else {
                        favoriteButton.click();
                        
                        const removeInterval = setInterval(() => {
                            const removeMenuItem = document.querySelector('#context-menu button[role="menuitemcheckbox"][aria-checked="true"]');
                            if (removeMenuItem) {
                                clearInterval(removeInterval);
                                removeMenuItem.click();
                                
                                setTimeout(() => {
                                    const submitButton = document.querySelector('#context-menu button[type="submit"]');
                                    if (submitButton) submitButton.click();
                                }, 500);
                            }
                        }, 1000);
                    }
                }
            };

            window.seekToPosition = function(position) {
                const progressBar = document.querySelector('div[data-testid="playback-progressbar"] input[type="range"]');
                if (progressBar) {
                    // Improved seek precision with +1ms offset (v1.6.4)
                    // The +1ms offset prevents timing edge cases where seeking to exact position
                    // may not trigger playback due to Spotify's internal rounding/comparison logic
                    progressBar.value = position + 1;
                    progressBar.dispatchEvent(new Event('change', { bubbles: true }));
                }
            };

            // --- Auto Features ---
            window.addAutoFeatures = function() {
                // One-time autoplay on load
                if ('playPauseButton' in window && firstPlay && 
                    window.playPauseButton.getAttribute('aria-label') === 'Play') {
                    console.log('[Spotifuck v6] Autoplay triggered');
                    window.playPauseButton.click();
                    firstPlay = false;
                }
            };

            // --- Media Status Updates ---
            window.addMediaAutoUpdate = function() {
                if (mediaAutoInterval) clearInterval(mediaAutoInterval);
                
                mediaAutoInterval = setInterval(() => {
                    const trackLink = document.querySelector('a[data-testid="context-item-link"]');
                    const trackTitle = trackLink ? trackLink.text : null;
                    
                    const artistLink = document.querySelector('a[data-testid="context-item-info-artist"]');
                    const artistName = artistLink ? artistLink.text : '';
                    
                    const repeatButton = document.querySelector('button[data-testid="control-button-repeat"]');
                    const repeatMode = repeatButton ? repeatButton.getAttribute('aria-checked') : 'false';
                    
                    const favoriteButton = document.querySelector('div[data-testid="now-playing-widget"] > div:last-child > button');
                    const isFavorite = (favoriteButton && favoriteButton.getAttribute('aria-checked') === 'true');
                    
                    const progressBar = document.querySelector('div[data-testid="playback-progressbar"] input[type="range"]');
                    const duration = progressBar ? parseInt(progressBar.getAttribute('max')) : null;
                    const position = progressBar ? parseInt(progressBar.getAttribute('value')) : null;
                    
                    const coverImage = document.querySelector('img[data-testid="cover-art-image"]');
                    const coverUrl = coverImage ? coverImage.src : null;
                    
                    const currentState = trackTitle + '|' + artistName + '|' + isPlaying + '|' + repeatMode + '|' + isFavorite;
                    
                    if (currentState !== lastState) {
                        lastState = currentState;
                        console.log('[Spotifuck v6] Playing:', trackTitle, 'by', artistName);
                    }
                }, 2000);
            };

            // --- CSS/JS Hacks for Sidebar ---
            // Library button in sidebar header toggles between expanded/collapsed states
            // When expanded: h1 shows "✖ Close Library", full-screen overlay
            // When collapsed: small button in corner
            // Special: When h1 shows "✖ Close Library", clicking moves button to navbar
            window.addCSSHacks = function() {
                if (cssHackInterval) clearInterval(cssHackInterval);
                
                cssHackInterval = setInterval(() => {
                    const sidebar = document.querySelector('#Desktop_LeftSidebar_Id');
                    const sidebarHidden = sidebar?.classList.contains('spotifuck-hidden');
                    
                    // If sidebar is hidden, ensure navbar button is visible
                    if (sidebarHidden) {
                        ensureNavbarButton();
                    }
                    
                    // Library button setup - finds the button in sidebar header
                    if (!sidebarHidden) {
                        const libraryButton = document.querySelector('#Desktop_LeftSidebar_Id header > div > div:first-child button:not(.fuckd)');
                        if (libraryButton) {
                            console.log('[Spotifuck v6] Library button configured');
                            window.libraryButton = libraryButton;
                            libraryButton.classList.add('fuckd', 'lbtn');
                            libraryButton.style.padding = '0';
                            libraryButton.style.height = '20px';
                            libraryButton.addEventListener('click', () => {
                                setTimeout(() => {
                                    // Check if clicking "✖ Close Library" - if so, offer to move to navbar
                                    const h1 = sidebar.querySelector('header > div > div:first-child h1');
                                    if (h1 && h1.innerHTML.includes('✖')) {
                                        // User clicked close - move to navbar
                                        moveSidebarToNavbar();
                                    } else {
                                        // Normal toggle
                                        switchLeftSidebar();
                                    }
                                }, 0);
                            });
                            switchLeftSidebar();
                        }

                        // Library grid items auto-close on selection
                        const libraryGridItems = document.querySelector('#Desktop_LeftSidebar_Id div[role="grid"]:not(.fuckd)');
                        if (libraryGridItems) {
                            libraryGridItems.classList.add('fuckd');
                            libraryGridItems.addEventListener('click', () => {
                                setTimeout(() => {
                                    console.log('[Spotifuck v6] Auto-closing library');
                                    if (window.libraryButton) window.libraryButton.click();
                                }, 0);
                            });
                        }
                    }

                    // Search input handling
                    const searchInput = document.querySelector('input[data-testid="search-input"]:not(.fuckd)');
                    if (searchInput) {
                        searchInput.classList.add('fuckd');
                        searchInput.addEventListener('focus', () => {
                            const nowPlayingBar = document.querySelector('aside[data-testid="now-playing-bar"]');
                            if (nowPlayingBar) nowPlayingBar.style.display = 'none';
                        });
                        searchInput.addEventListener('blur', () => {
                            const nowPlayingBar = document.querySelector('aside[data-testid="now-playing-bar"]');
                            if (nowPlayingBar) nowPlayingBar.style.display = 'flex';
                        });
                    }
                }, 5000);
            };

            // --- Move Sidebar to Navbar ---
            window.moveSidebarToNavbar = function() {
                console.log('[Spotifuck v6] Moving library to navbar');
                const sidebar = document.querySelector('#Desktop_LeftSidebar_Id');
                if (sidebar) {
                    sidebar.classList.add('spotifuck-hidden');
                    // Store preference
                    try {
                        localStorage.setItem('spotifuck-lib-in-navbar', 'true');
                    } catch(e) {}
                }
                ensureNavbarButton();
            };

            // --- Ensure Navbar Button Exists ---
            window.ensureNavbarButton = function() {
                if (document.querySelector('.spotifuck-lib-nav-btn')) return;
                
                const navBar = document.querySelector('#global-nav-bar');
                const homeButton = document.querySelector('#global-nav-bar button[data-testid="home-button"]');
                
                if (navBar && homeButton) {
                    console.log('[Spotifuck v6] Creating library button in navbar');
                    
                    const libBtn = document.createElement('button');
                    libBtn.className = 'spotifuck-lib-nav-btn visible';
                    libBtn.innerHTML = \`
                        <svg viewBox="0 0 24 24" fill="currentColor">
                            <path d="M3 22a1 1 0 0 1-1-1V3a1 1 0 0 1 2 0v18a1 1 0 0 1-1 1zM15.5 2.134A1 1 0 0 0 14 3v18a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V6.464a1 1 0 0 0-.5-.866l-6-3.464zM9 2a1 1 0 0 0-1 1v18a1 1 0 1 0 2 0V3a1 1 0 0 0-1-1z"/>
                        </svg>
                        <span>Library</span>
                    \`;
                    
                    libBtn.addEventListener('click', () => {
                        openLibraryOverlay();
                    });
                    
                    // Insert after home button
                    homeButton.parentNode.insertBefore(libBtn, homeButton.nextSibling);
                    window.navLibBtn = libBtn;
                }
            };

            // --- Open Library Overlay ---
            window.openLibraryOverlay = function() {
                console.log('[Spotifuck v6] Opening library overlay');
                const sidebar = document.querySelector('#Desktop_LeftSidebar_Id');
                if (!sidebar) return;
                
                // Temporarily show sidebar, expand it, then hide after interaction
                sidebar.classList.remove('spotifuck-hidden');
                sidebar.style.position = 'fixed';
                sidebar.style.width = '100%';
                sidebar.style.height = '92%';
                sidebar.style.left = '0';
                sidebar.style.top = '0';
                sidebar.style.zIndex = '999';
                
                const libraryHeader = sidebar.querySelector('header > div > div:first-child h1');
                if (libraryHeader) {
                    libraryHeader.innerHTML = '✖ &nbsp; Close Library';
                }
                
                // Click anywhere in library closes it
                const closeOverlay = (e) => {
                    const gridItems = sidebar.querySelector('div[role="grid"]');
                    if (gridItems && gridItems.contains(e.target)) {
                        // User clicked a library item - let it navigate, then close
                        setTimeout(() => {
                            sidebar.classList.add('spotifuck-hidden');
                            document.removeEventListener('click', closeOverlay);
                        }, 100);
                    } else if (libraryHeader && libraryHeader.contains(e.target)) {
                        // User clicked close button
                        sidebar.classList.add('spotifuck-hidden');
                        document.removeEventListener('click', closeOverlay);
                    }
                };
                
                setTimeout(() => {
                    document.addEventListener('click', closeOverlay);
                }, 100);
            };

            // --- Sidebar Toggle Logic ---
            // Toggles sidebar between expanded (full overlay) and collapsed (small button) states
            // When expanded, h1 text changes to "✖ Close Library"
            window.switchLeftSidebar = function() {
                const leftSidebar = document.querySelector('#Desktop_LeftSidebar_Id');
                if (!leftSidebar) return;

                const navFirstChild = leftSidebar.querySelector('nav > div > div:first-child');
                if (!navFirstChild) return;

                const isExpanded = navFirstChild.classList.length === 2;

                if (isExpanded) {
                    // Expanded state - Show full library as overlay
                    console.log('[Spotifuck v6] Expanding sidebar');
                    leftSidebar.style.position = 'fixed';
                    leftSidebar.style.width = '100%';
                    leftSidebar.style.height = '92%';
                    leftSidebar.style.left = '0';
                    leftSidebar.style.zIndex = '20';
                    
                    const libraryHeader = leftSidebar.querySelector('header > div > div:first-child h1');
                    if (libraryHeader) {
                        libraryHeader.innerHTML = '✖ &nbsp; Close Library';
                    }
                } else {
                    // Collapsed state - Show as small button (v1.6.4 improved dimensions)
                    console.log('[Spotifuck v6] Collapsing sidebar');
                    leftSidebar.style.zIndex = '1';
                    leftSidebar.style.position = 'fixed';
                    leftSidebar.style.top = '0';
                    leftSidebar.style.left = '60px';
                    leftSidebar.style.width = '48px';
                    leftSidebar.style.height = '48px';
                }
            };

            // --- Check if library was moved to navbar on previous session ---
            (function checkLibraryState() {
                try {
                    const inNavbar = localStorage.getItem('spotifuck-lib-in-navbar');
                    if (inNavbar === 'true') {
                        setTimeout(() => {
                            const sidebar = document.querySelector('#Desktop_LeftSidebar_Id');
                            if (sidebar) {
                                sidebar.classList.add('spotifuck-hidden');
                                console.log('[Spotifuck v6] Library restored to navbar');
                                ensureNavbarButton();
                            }
                        }, 1000);
                    }
                } catch(e) {}
            })();

            console.log('[Spotifuck v6] Ready');
        })();
    `;

    const scriptElement = document.createElement('script');
    scriptElement.textContent = mainScript;
    (document.head || document.documentElement).appendChild(scriptElement);
    scriptElement.remove();

    // --- Enhanced Silent Audio Ad Blocking ---
    const adBlockScript = `
        (function() {
            const originalFetch = window.fetch;
            const silentAudioBlob = new Blob([new Uint8Array(44)], { type: 'audio/wav' });
            
            window.fetch = function(resource, init) {
                const url = (typeof resource === 'string') ? resource : resource.url;
                
                // Block known ad domains and audio ads
                if (url && (
                    url.includes('audio/mpeg') ||
                    url.includes('doubleclick.net') ||
                    url.includes('googlesyndication.com') ||
                    url.includes('fastly-insights.com') ||
                    url.includes('sentry.io') ||
                    url.includes('mp3-ad') ||
                    url.includes('amillionads.com') ||
                    url.includes('2mdn.net') ||
                    url.includes('adxcel.com') ||
                    url.includes('adstudio-assets.scdn.co')
                )) {
                    // Don't block podcast content or actual music
                    if (!url.includes('podz-content') && !url.includes('gew4-spclient')) {
                        console.log('[Spotifuck v6] Ad blocked');
                        return Promise.resolve(new Response(silentAudioBlob, {
                            status: 200,
                            statusText: 'OK',
                            headers: { 'Content-Type': 'audio/wav' }
                        }));
                    }
                }
                
                return originalFetch.apply(this, arguments);
            };
        })();
    `;
    
    const adBlockScriptElement = document.createElement('script');
    adBlockScriptElement.textContent = adBlockScript;
    (document.head || document.documentElement).appendChild(adBlockScriptElement);
    adBlockScriptElement.remove();

    console.log('[Spotifuck v6] Ready');
})();
