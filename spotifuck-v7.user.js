// ==UserScript==
// @name         Spotifuck Userscript v7
// @namespace    https://github.com/yourname/spotifuck-userscript
// @version      4.5.0
// @description  Full Spotifuck 1.4.1 UI hack + playback control + client spoof + silent ad blocking port on open.spotify.com
// @author       Myst1cX (adapted from Spotifuck app)
// @match        https://open.spotify.com/*
// @grant        GM_addStyle
// @run-at       document-start
// @homepageURL  https://github.com/Myst1cX/spotifuck-userscript
// @supportURL   https://github.com/Myst1cX/spotifuck-userscript/issues
// @updateURL    https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-v7.user.js
// @downloadURL  https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-v7.user.js
// ==/UserScript==

(function() {
    'use strict';

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
            /* Core body and root styling */
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
                margin: 5px 0 15px; // Original proportions -> margin: 15px 0 25px;
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

            form[role="search"] {
                z-index: 10;
                margin-left: 50px;
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
        `;
    
    // --- Sidebar toggle logic ---
    function switchLeftSidebar() {
        const leftSidebar = document.querySelector('#Desktop_LeftSidebar_Id');
        if (!leftSidebar) return;
        const navFirstChild = leftSidebar.querySelector('nav > div > div:first-child');
        if (!navFirstChild) return;
        const isExpanded = navFirstChild.classList.length === 2;
        if (isExpanded) {
            // Expanded
            leftSidebar.style.position = 'fixed';
            leftSidebar.style.width = '100%';
            leftSidebar.style.height = '92%';
            leftSidebar.style.left = '0';
            leftSidebar.style.zIndex = '20';
            const libraryHeader = leftSidebar.querySelector('header > div > div:first-child h1');
            if (libraryHeader) libraryHeader.innerText = '✖ Close Library';
        } else {
            // Collapsed
            leftSidebar.style.zIndex = '1';
            leftSidebar.style.position = 'fixed';
            leftSidebar.style.top = '2px';
            leftSidebar.style.left = '120px';
            leftSidebar.style.width = '50px';
            leftSidebar.style.height = '40px';
        }
    }

    // --- Inject custom styles and event listeners for sidebar buttons ---
    function injectSidebarFixes() {
        // Prevent double-inject
        if (document.querySelector('#Desktop_LeftSidebar_Id .fuckd')) return;

        const libraryButton = document.querySelector('#Desktop_LeftSidebar_Id header > div > div:first-child button:not(.fuckd)');
        if (libraryButton) {
            libraryButton.classList.add('fuckd');
            libraryButton.style.padding = '0';
            libraryButton.style.height = '20px';
            libraryButton.addEventListener('click', () => setTimeout(switchLeftSidebar, 0));
            switchLeftSidebar();
        }

        const libraryGridItems = document.querySelector('#Desktop_LeftSidebar_Id div[role=grid]:not(.fuckd)');
        if (libraryGridItems) {
            libraryGridItems.classList.add('fuckd');
            libraryGridItems.addEventListener('click', () => setTimeout(() => {
                const libraryButtonClicked = document.querySelector('button.fuckd');
                if (libraryButtonClicked) libraryButtonClicked.click();
            }, 0));
        }

        const createButton = document.querySelector('#Desktop_LeftSidebar_Id header > div > div:last-child');
        if (createButton) createButton.style.display = 'none';

        const footerContainer = document.querySelector('div.main-view-container__mh-footer-container');
        if (footerContainer) footerContainer.style.display = 'none';
    }

// --- Forcibly hide NowPlayingView and its button in the playback controls menu ---
/* The following code is already present in Spotify Lyrics+ Userscript, hence I commented it out below: */

    /*
    
    const styleId = 'lyricsplus-hide-npv-style';
    if (!document.getElementById(styleId)) {
        const style = document.createElement('style');
        style.id = styleId;
        style.textContent = `
            .NowPlayingView,
            .OTfMDdomT5S7B5dbYTT8:has(.NowPlayingView) {
                width: 0 !important;
                display: none !important;
            }
            [data-testid=control-button-npv] {
                display: none !important;
            }
        `;
        document.head.appendChild(style);
    }

    */

    // --- Playback control injection ---
    window.actPlayPause = function(play) {
        const playPauseButton = document.querySelector('aside button[data-testid=control-button-playpause]');
        if (!playPauseButton) return;
        const ariaLabel = playPauseButton.getAttribute('aria-label');
        if (ariaLabel === 'Play') {
            if (play === undefined || play) playPauseButton.click();
        } else {
            if (play === undefined || !play) playPauseButton.click();
        }
    };
    window.actSkipBack = function() {
        const skipBackButton = document.querySelector('button[data-testid=control-button-skip-back]');
        if (skipBackButton) skipBackButton.click();
    };
    window.actSkipForward = function() {
        const skipForwardButton = document.querySelector('button[data-testid=control-button-skip-forward]');
        if (skipForwardButton) skipForwardButton.click();
    };
    window.actSeek = function(pos) {
        const playbackProgressBar = document.querySelector('div[data-testid=playback-progressbar] input[type=range]');
        if (!playbackProgressBar) return;
        playbackProgressBar.value = pos;
        playbackProgressBar.dispatchEvent(new Event('change', { bubbles: true }));
    };

    // --- Track status reporting (mock AndBridge) ---
    (function trackStatusReporter() {
        let lastState = null;
        setInterval(() => {
            const contextItemLink = document.querySelector('a[data-testid=context-item-link]');
            const track = contextItemLink ? contextItemLink.text : null;
            const contextItemArtist = document.querySelector('a[data-testid=context-item-info-artist]');
            const artist = contextItemArtist ? contextItemArtist.text : null;
            const playPauseButton = document.querySelector('aside button[data-testid=control-button-playpause]');
            const playing = playPauseButton && playPauseButton.getAttribute('aria-label') !== 'Play';
            const playbackProgressBar = document.querySelector('div[data-testid=playback-progressbar] input[type=range]');
            const duration = playbackProgressBar ? parseInt(playbackProgressBar.getAttribute('max')) : null;
            const position = playbackProgressBar ? parseInt(playbackProgressBar.value) : null;
            const coverArtImage = document.querySelector('img[data-testid=cover-art-image]');
            const cover = coverArtImage ? coverArtImage.src : null;
            const currState = track + '|' + artist + '|' + playing;
            if (currState !== lastState) {
                lastState = currState;
                const values = { artist, track, playing, duration, position, cover };
                console.log('[Spotifuck] PlayerStatus:', values);
            }
        }, 1000);
    })();

    // --- Autoplay logic ---
    (function autoplayOnLoad() {
        let playClicked = false;
        const interval = setInterval(() => {
            const playPauseButton = document.querySelector('aside button[data-testid=control-button-playpause][aria-label=Play]');
            if (playPauseButton && !playClicked) {
                playPauseButton.click();
                playClicked = true;
                console.log('[Spotifuck] Autoplay triggered');
                clearInterval(interval);
            }
        }, 1000);
    })();

    // --- Silent audio ad blocking by intercepting fetch() ---
    (function silentAudioAdBlocker() {
        const originalFetch = window.fetch;
        const silentAudioBlob = new Blob([new Uint8Array(44)], { type: 'audio/wav' });
        window.fetch = function(resource, init) {
            const url = (typeof resource === 'string') ? resource : resource.url;
            if (url && url.includes('audio/mpeg')) {
                console.log('[Spotifuck] Blocking audio ad:', url);
                return Promise.resolve(new Response(silentAudioBlob, {
                    status: 200,
                    statusText: 'OK',
                    headers: { 'Content-Type': 'audio/wav' }
                }));
            }
            return originalFetch.apply(this, arguments);
        };
    })();

    // --- Initialization ---
    function init() {
        injectSidebarFixes();

    }

    // Wait for the page content to load and inject fixes periodically
    const readyInterval = setInterval(() => {
        if (document.querySelector('#Desktop_LeftSidebar_Id')) {
            init();
            clearInterval(readyInterval);
        }
    }, 1000);
    setInterval(() => {
        injectSidebarFixes();
    }, 5000);
 })();
