// ==UserScript==
// @name         Spotifuck Userscript v6
// @namespace    https://github.com/Myst1cX/spotifuck-userscript
// @version      6.3.0
// @description  Full Spotifuck 1.6.4 UI hack (browser-focused) + enhanced ad blocking + playback control port on open.spotify.com
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

    console.log('[Spotifuck v6] Script initializing...');

    // --- Spoof screen and navigator properties (run as early as possible) ---
    const spoofScript = `
        console.log('[Spotifuck v6] Spoofing screen and navigator properties');
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
    const spoofScriptNode = document.createElement('script');
    spoofScriptNode.textContent = spoofScript;
    document.documentElement.appendChild(spoofScriptNode);
    spoofScriptNode.remove();
    console.log('[Spotifuck v6] Screen spoofing injected');

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

            #main-view + div {
                overflow: hidden !important;
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

            /* Hide the sidebar container but not the library button */
            #Desktop_LeftSidebar_Id {
                display: none !important;
            }

            /* Position library button in navbar */
            #Desktop_LeftSidebar_Id header > div > div:first-child button,
            #Desktop_LeftSidebar_Id header button[aria-label*="Library"],
            #Desktop_LeftSidebar_Id header button[aria-label*="library"] {
                display: block !important;
                position: fixed !important;
                top: 10px !important;
                left: 10px !important;
                z-index: 100 !important;
                margin: 0 !important;
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

            /* Enhanced now playing bar styling */
            aside[data-testid="now-playing-bar"] {
                min-width: 100% !important;
                background: #000 !important;
            }
            aside[data-testid="now-playing-bar"] > div {
                margin-top: 2px !important;
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
                margin: 5px 0 15px;
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
            [data-tippy-root],
            [data-tippy-root] * {
                transition: none !important;
                transform: none !important;
                overflow: hidden !important;
            }


        `);
    console.log('[Spotifuck v6] CSS styles injected');

    // --- Sidebar toggle logic ---
    function switchLeftSidebar() {
        console.log('[Spotifuck v6] switchLeftSidebar() called');
        const leftSidebar = document.querySelector('#Desktop_LeftSidebar_Id');
        if (!leftSidebar) {
            console.log('[Spotifuck v6] Left sidebar not found');
            return;
        }
        
        // Check if sidebar is currently hidden
        const isHidden = leftSidebar.style.display === 'none' || 
                        window.getComputedStyle(leftSidebar).display === 'none';
        
        if (isHidden) {
            console.log('[Spotifuck v6] Sidebar hidden - showing as fullscreen overlay');
            leftSidebar.style.display = 'block';
            leftSidebar.style.position = 'fixed';
            leftSidebar.style.width = '100%';
            leftSidebar.style.height = '100%';
            leftSidebar.style.left = '0';
            leftSidebar.style.top = '0';
            leftSidebar.style.zIndex = '20';
            const libraryHeader = leftSidebar.querySelector('header > div > div:first-child h1');
            if (libraryHeader) libraryHeader.innerText = '✖ Close Library';
        } else {
            console.log('[Spotifuck v6] Sidebar visible - hiding');
            leftSidebar.style.display = 'none';
            const libraryHeader = leftSidebar.querySelector('header > div > div:first-child h1');
            if (libraryHeader) libraryHeader.innerText = 'Your Library';
        }
    }

    // --- Inject custom styles and event listeners for sidebar buttons ---
    function injectSidebarFixes() {
        console.log('[Spotifuck v6] injectSidebarFixes() called');
        
        // Prevent double-inject
        if (document.querySelector('.fuckd-library-button')) {
            console.log('[Spotifuck v6] Library button already processed, skipping');
            return;
        }

        // Library button selector (matches CSS selector for consistency)
        const libraryButtonSelector = '#Desktop_LeftSidebar_Id header > div > div:first-child button, ' +
                                      '#Desktop_LeftSidebar_Id header button[aria-label*="Library"], ' +
                                      '#Desktop_LeftSidebar_Id header button[aria-label*="library"]';
        const libraryButton = document.querySelector(libraryButtonSelector);
        
        if (libraryButton) {
            console.log('[Spotifuck v6] Library button found, adding toggle handler');
            
            // Mark button as processed
            libraryButton.classList.add('fuckd-library-button');
            
            // Add click handler for toggling sidebar (setTimeout ensures Spotify's DOM updates complete)
            libraryButton.addEventListener('click', () => setTimeout(switchLeftSidebar, 0));
            
            console.log('[Spotifuck v6] Library button toggle handler attached');
        } else {
            console.log('[Spotifuck v6] Library button not found yet');
        }

        const libraryGridItems = document.querySelector('#Desktop_LeftSidebar_Id div[role=grid]:not(.fuckd)');
        if (libraryGridItems) {
            console.log('[Spotifuck v6] Library grid items found, adding click handler');
            libraryGridItems.classList.add('fuckd');
            libraryGridItems.addEventListener('click', () => setTimeout(() => {
                const libraryButtonClicked = document.querySelector('.fuckd-library-button');
                if (libraryButtonClicked) libraryButtonClicked.click();
            }, 0));
        }

        const createButton = document.querySelector('#Desktop_LeftSidebar_Id header > div > div:last-child');
        if (createButton) {
            console.log('[Spotifuck v6] Create button found, hiding');
            createButton.style.display = 'none';
        }

        const footerContainer = document.querySelector('div.main-view-container__mh-footer-container');
        if (footerContainer) {
            console.log('[Spotifuck v6] Footer container found, hiding');
            footerContainer.style.display = 'none';
        }
    }



    // --- Playback control injection ---
    window.actPlayPause = function(play) {
        console.log('[Spotifuck v6] actPlayPause() called, play:', play);
        const playPauseButton = document.querySelector('aside button[data-testid="control-button-playpause"]');
        if (!playPauseButton) {
            console.log('[Spotifuck v6] Play/pause button not found');
            return;
        }
        const ariaLabel = playPauseButton.getAttribute('aria-label');
        console.log('[Spotifuck v6] Current aria-label:', ariaLabel);
        if (ariaLabel === 'Play') {
            if (play === undefined || play) {
                console.log('[Spotifuck v6] Clicking play button');
                playPauseButton.click();
            }
        } else {
            if (play === undefined || !play) {
                console.log('[Spotifuck v6] Clicking pause button');
                playPauseButton.click();
            }
        }
    };

    window.actSkipBack = function() {
        console.log('[Spotifuck v6] actSkipBack() called');
        const skipBackButton = document.querySelector('button[data-testid="control-button-skip-back"]');
        if (skipBackButton) {
            console.log('[Spotifuck v6] Clicking skip back button');
            skipBackButton.click();
        } else {
            console.log('[Spotifuck v6] Skip back button not found');
        }
    };

    window.actSkipForward = function() {
        console.log('[Spotifuck v6] actSkipForward() called');
        const skipForwardButton = document.querySelector('button[data-testid="control-button-skip-forward"]');
        if (skipForwardButton) {
            console.log('[Spotifuck v6] Clicking skip forward button');
            skipForwardButton.click();
        } else {
            console.log('[Spotifuck v6] Skip forward button not found');
        }
    };

    window.actSeek = function(pos) {
        console.log('[Spotifuck v6] actSeek() called, position:', pos);
        const playbackProgressBar = document.querySelector('div[data-testid="playback-progressbar"] input[type="range"]');
        if (!playbackProgressBar) {
            console.log('[Spotifuck v6] Playback progress bar not found');
            return;
        }
        // v6: Added +1 for better precision
        playbackProgressBar.value = pos + 1;
        playbackProgressBar.dispatchEvent(new Event('change', { bubbles: true }));
        console.log('[Spotifuck v6] Seek position set to:', pos + 1);
    };

    window.actRepeat = function() {
        console.log('[Spotifuck v6] actRepeat() called');
        const repeatButton = document.querySelector('button[data-testid="control-button-repeat"]');
        if (repeatButton) {
            console.log('[Spotifuck v6] Clicking repeat button');
            repeatButton.click();
        } else {
            console.log('[Spotifuck v6] Repeat button not found');
        }
    };

    window.actAddToFav = function() {
        console.log('[Spotifuck v6] actAddToFav() called');
        const favButton = document.querySelector('div[data-testid="now-playing-widget"] > div:last-child > button');
        if (!favButton) {
            console.log('[Spotifuck v6] Favorite button not found');
            return;
        }
        
        const isChecked = favButton.getAttribute('aria-checked');
        console.log('[Spotifuck v6] Current favorite state:', isChecked);
        
        if (isChecked === 'false') {
            console.log('[Spotifuck v6] Adding to favorites');
            favButton.click();
        } else {
            console.log('[Spotifuck v6] Removing from favorites');
            favButton.click();
            setTimeout(() => {
                const removeButton = document.querySelector('#context-menu button[role="menuitemcheckbox"][aria-checked="true"]');
                if (removeButton) {
                    console.log('[Spotifuck v6] Clicking remove from favorites');
                    removeButton.click();
                    setTimeout(() => {
                        const submitButton = document.querySelector('#context-menu button[type="submit"]');
                        if (submitButton) {
                            console.log('[Spotifuck v6] Submitting favorite removal');
                            submitButton.click();
                        }
                    }, 500);
                }
            }, 1000);
        }
    };

    // --- Track status reporting ---
    (function trackStatusReporter() {
        console.log('[Spotifuck v6] Track status reporter initialized');
        let lastState = null;
        setInterval(() => {
            const contextItemLink = document.querySelector('a[data-testid="context-item-link"]');
            const track = contextItemLink ? contextItemLink.text : null;
            const contextItemArtist = document.querySelector('a[data-testid="context-item-info-artist"]');
            const artist = contextItemArtist ? contextItemArtist.text : null;
            const playPauseButton = document.querySelector('aside button[data-testid="control-button-playpause"]');
            const playing = playPauseButton && playPauseButton.getAttribute('aria-label') !== 'Play';
            const playbackProgressBar = document.querySelector('div[data-testid="playback-progressbar"] input[type="range"]');
            const duration = playbackProgressBar ? parseInt(playbackProgressBar.getAttribute('max')) : null;
            const position = playbackProgressBar ? parseInt(playbackProgressBar.value) : null;
            const coverArtImage = document.querySelector('img[data-testid="cover-art-image"]');
            const cover = coverArtImage ? coverArtImage.src : null;
            
            const currState = track + '|' + artist + '|' + playing;
            if (currState !== lastState) {
                lastState = currState;
                const values = { artist, track, playing, duration, position, cover };
                console.log('[Spotifuck v6] PlayerStatus:', values);
            }
        }, 1000);
    })();

    // --- Autoplay logic ---
    (function autoplayOnLoad() {
        console.log('[Spotifuck v6] Autoplay logic initialized');
        let playClicked = false;
        const interval = setInterval(() => {
            const playPauseButton = document.querySelector('aside button[data-testid="control-button-playpause"][aria-label="Play"]');
            if (playPauseButton && !playClicked) {
                console.log('[Spotifuck v6] Autoplay triggered - clicking play button');
                playPauseButton.click();
                playClicked = true;
                clearInterval(interval);
            }
        }, 1000);
    })();

    // --- v6: Enhanced ad blocking by intercepting fetch() ---
    (function enhancedAdBlocker() {
        console.log('[Spotifuck v6] Enhanced ad blocker initializing');
        const originalFetch = window.fetch;
        const silentAudioBlob = new Blob([new Uint8Array(44)], { type: 'audio/wav' });
        
        // v6: Expanded list of blocked domains
        const blockedDomains = [
            'doubleclick.net',
            'googlesyndication.com',
            'fastly-insights.com',
            'sentry.io',
            'amillionads.com',
            '2mdn.net',
            'adxcel.com'
        ];
        
        const audioAdUrls = [
            'audio/mpeg',
            'akamaized.net/audio/',
            'scdn.co/audio/',
            'scdn.co/mp3-ad/',
            'spotifycdn.com/audio/',
            'adstudio-assets.scdn.co'
        ];
        
        window.fetch = function(resource, init) {
            const url = (typeof resource === 'string') ? resource : resource.url;
            
            // Block tracking and analytics domains
            if (url && blockedDomains.some(domain => url.includes(domain))) {
                console.log('[Spotifuck v6] Blocked tracking request:', url);
                return Promise.resolve(new Response('', {
                    status: 200,
                    statusText: 'OK',
                    headers: { 'Access-Control-Allow-Origin': '*' }
                }));
            }
            
            // Block audio ads
            if (url && audioAdUrls.some(pattern => url.includes(pattern))) {
                // Don't block actual content (podz-content, gew4-spclient)
                if (url.includes('podz-content') || url.includes('gew4-spclient')) {
                    return originalFetch.apply(this, arguments);
                }
                
                console.log('[Spotifuck v6] Blocked audio ad:', url);
                return Promise.resolve(new Response(silentAudioBlob, {
                    status: 200,
                    statusText: 'OK',
                    headers: { 'Content-Type': 'audio/wav' }
                }));
            }
            
            return originalFetch.apply(this, arguments);
        };
        console.log('[Spotifuck v6] Enhanced ad blocker active');
    })();



    // --- Initialization ---
    function init() {
        console.log('[Spotifuck v6] Initializing main features');
        injectSidebarFixes();
    }

    // Wait for the page content to load and inject fixes periodically
    const readyInterval = setInterval(() => {
        if (document.querySelector('#Desktop_LeftSidebar_Id')) {
            console.log('[Spotifuck v6] Left sidebar detected, initializing');
            init();
            clearInterval(readyInterval);
        }
    }, 1000);
    
    // Periodic re-injection for dynamic content
    setInterval(() => {
        injectSidebarFixes();
    }, 5000);

    console.log('[Spotifuck v6] Script initialization complete');
})();
