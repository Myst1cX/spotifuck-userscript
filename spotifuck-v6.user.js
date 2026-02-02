// ==UserScript==
// @name         Spotifuck v6
// @namespace    https://github.com/Myst1cX/spotifuck-userscript
// @version      6.0.0
// @description  Full Spotifuck Android app port for web - Enhanced ad blocking, UI overhaul, playback controls, library management, and more (Reverse-engineered from latest APK)
// @author       Myst1cX
// @match        https://open.spotify.com/*
// @grant        GM_addStyle
// @grant        GM_getValue
// @grant        GM_setValue
// @run-at       document-start
// @homepageURL  https://github.com/Myst1cX/spotifuck-userscript
// @supportURL   https://github.com/Myst1cX/spotifuck-userscript/issues
// @updateURL    https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-v6.user.js
// @downloadURL  https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-v6.user.js
// ==/UserScript==

(function() {
    'use strict';

    // === CONFIGURATION ===
    // User-configurable settings (can be changed via userscript manager settings)
    const CONFIG = {
        AMOLED_THEME: GM_getValue('amoled_theme', false), // Pure black theme for OLED screens
        AUTO_FETCH_LIBRARY: GM_getValue('auto_fetch_library', true), // Auto-fetch user library
        TAKE_CONTROL: GM_getValue('take_control', true), // Auto-take control on device conflicts
        AUTO_CLOSE_LIBRARY: GM_getValue('auto_close_library', true) // Auto-close library after selection
    };

    console.log('🎵 Spotifuck v6 - Initializing...');
    console.log('⚙️ Config:', CONFIG);

    // === CLIENT SPOOFING (run as early as possible) ===
    const spoofScript = `
        (function() {
            console.log('🎭 Spoofing desktop client properties...');
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
            console.log('✅ Client spoofing active');
        })();
    `;
    const scriptNode = document.createElement('script');
    scriptNode.textContent = spoofScript;
    document.documentElement.appendChild(scriptNode);
    scriptNode.remove();

    // === CSS INJECTION ===
    console.log('🎨 Injecting CSS modifications...');
    
    const baseCSS = `
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

        /* Artist page optimization */
        section[data-testid="artist-page"] > div > div:first-child:not([data-encore-id]) {
            height: 25vh;
        }

        /* Tracklist row enhancements */
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

        /* Responsive grid layouts for different column counts */
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

        /* Content spacing */
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

        /* Typography adjustments */
        main > section h1.encore-text-headline-large {
            font-size: 22px !important;
        }

        section[data-testid="artist-page"] span.encore-text-headline-large {
            font-size: 26px !important;
        }

        section[data-testid="track-page"] h1 {
            font-size: 20px !important;
        }

        /* Now playing bar enhancements */
        aside[data-testid="now-playing-bar"] {
            min-width: 100% !important;
            box-shadow: 0 0 6px #440000;
            background: linear-gradient(to bottom, #770000, #330000) !important;
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

        /* Player controls */
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

        /* Now playing widget */
        div[data-testid="now-playing-widget"] {
            justify-content: center;
            overflow: hidden;
        }

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

        /* Library sidebar */
        #Desktop_LeftSidebar_Id > nav > div {
            min-height: 48px;
            border-radius: 25px;
        }

        .YourLibraryX {
            overflow: hidden;
            background: var(--background-elevated-base) !important;
        }

        .YourLibraryX header {
            padding: 14px;
        }
    `;

    GM_addStyle(baseCSS);

    // AMOLED theme (optional)
    if (CONFIG.AMOLED_THEME) {
        console.log('🌑 Applying AMOLED theme...');
        const amoledCSS = `
            .encore-dark-theme {
                --background-base: #000;
                --background-highlight: #000;
                --background-elevated-base: #000;
                --background-elevated-highlight: #000;
                --background-elevated-press: #000;
                --background-tinted-base: #000;
            }
            
            aside[data-testid="now-playing-bar"] {
                background: #000 !important;
                box-shadow: none;
                border-top: 1px solid #666;
            }
        `;
        GM_addStyle(amoledCSS);
    }

    console.log('✅ CSS injection complete');

    // === JAVASCRIPT INJECTION ===
    // This runs in the page context (not userscript context)
    const mainScript = `
        (function() {
            console.log('📡 Starting JavaScript injection...');
            
            // === STATE VARIABLES ===
            let requestPause = false;
            let firstPlay = true;
            let unlockFlag = false;
            let firstFuckDone = false;
            let nowPlayingOpen = false;
            
            // Feature version identifier
            const featureVersion = \`web-player_\${new Date().toISOString().split('T')[0]}_\${Date.now()}_\${Math.floor(Math.random()*0xFFFFFFF).toString(16).padStart(7,'0')}\`;
            
            // Media state tracking
            let lastMediaState = null;
            let lastPosition = null;
            let isPlaying = false;
            
            // Current media info
            let currentTrack = null;
            let currentArtist = null;
            let currentDuration = null;
            let currentPosition = null;
            let currentCover = null;
            let repeatMode = 'false';
            let isFavorite = false;
            
            // Interval handles
            let playbackCheckInterval = null;
            let autoFeaturesInterval = null;
            let cssHackInterval = null;
            let mediaStateInterval = null;
            
            // === FETCH API INTERCEPTOR ===
            // Intercepts network requests to capture auth tokens and device IDs
            const originalFetch = window.fetch;
            window.fetch = async function(...args) {
                const [url, options] = args;
                const timestamp = new Date().toISOString().slice(11,23);
                const method = options?.method?.toUpperCase?.() || 'GET';
                const headers = options?.headers || {};
                
                // Capture device ID from track-playback endpoint
                if (method === 'POST' && url.includes('/track-playback/v1/devices') && options?.body) {
                    try {
                        const body = JSON.parse(options.body);
                        const deviceId = body?.device?.device_id;
                        if (deviceId && deviceId !== window.spotifyDeviceId) {
                            window.spotifyDeviceId = deviceId;
                            console.log(\`📻 [\${timestamp}] Device ID captured:\`, deviceId);
                            if (typeof checkAndFetchMediaLibrary === 'function') {
                                checkAndFetchMediaLibrary();
                            }
                        }
                    } catch (e) {
                        console.warn('Failed to parse device ID from body:', e);
                    }
                }
                // Capture current URI from pathfinder
                else if (method === 'POST' && url.includes('/pathfinder/v2/query') && options?.body) {
                    try {
                        const body = JSON.parse(options.body);
                        if (body?.operationName === 'isCurated') {
                            const currentUri = body?.variables?.uris?.[0];
                            if (currentUri && currentUri !== window.currentPlayingUri) {
                                window.currentPlayingUri = currentUri;
                                console.log(\`🎵 [\${timestamp}] Current URI:\`, currentUri);
                            }
                        }
                    } catch (e) {
                        console.warn('Failed to parse URI from pathfinder:', e);
                    }
                }
                // Capture device ID from connect-state
                else {
                    const matchDeviceId = url.match(/\\/connect-state\\/v1\\/player\\/(?:command|transfer)\\/from\\/([^/]+)\\/to\\/([^/]+)/);
                    if (matchDeviceId?.[2] && matchDeviceId[2] !== window.spotifyDeviceId) {
                        window.spotifyDeviceId = matchDeviceId[2];
                        console.log(\`📻 [\${timestamp}] Device ID from connect-state:\`, matchDeviceId[2]);
                        if (typeof checkAndFetchMediaLibrary === 'function') {
                            checkAndFetchMediaLibrary();
                        }
                    }
                }
                
                // Capture Client-Token
                const clientToken = headers['Client-Token'] || headers['client-token'];
                if (clientToken && clientToken !== window.spotifyClientToken) {
                    window.spotifyClientToken = clientToken;
                    console.log(\`🎧 [\${timestamp}] Client Token captured\`);
                    if (typeof checkAndFetchMediaLibrary === 'function') {
                        checkAndFetchMediaLibrary();
                    }
                }
                
                // Capture Authorization token
                const authHeader = headers.Authorization || headers.authorization;
                if (authHeader?.startsWith('Bearer ') && authHeader !== window.spotifyAuthToken) {
                    window.spotifyAuthToken = authHeader;
                    console.log(\`🔑 [\${timestamp}] Auth Token captured\`);
                    if (typeof checkAndFetchMediaLibrary === 'function') {
                        checkAndFetchMediaLibrary();
                    }
                }
                
                // Monitor play/pause state changes
                if (firstFuckDone && url.includes('/track-playback/') && method === 'PUT') {
                    try {
                        const paused = options?.body ? JSON.parse(options.body)?.state_ref?.paused : undefined;
                        if (paused === true && isPlaying) {
                            console.log('⏸️ Track-Playback: Pause detected');
                            manageIntervals(false);
                        } else if (paused === false && !isPlaying) {
                            console.log('▶️ Track-Playback: Play detected');
                            manageIntervals(true);
                        }
                    } catch (e) {
                        console.warn('Failed to parse playback state:', e);
                    }
                }
                
                try {
                    const response = await originalFetch(url, options);
                    
                    // Auto-reload on player lock (404 error)
                    if (response.status === 404 && url.includes('connect-state') && url.includes('/command/from/')) {
                        console.warn('⚠️ Player locked (404) - reloading page...');
                        location.reload();
                    }
                    
                    return response;
                } catch (error) {
                    console.error('❌ Fetch error:', error);
                    throw error;
                }
            };
            
            console.log('✅ Fetch interceptor installed');
            
            // === MEDIA LIBRARY FETCHER ===
            ${CONFIG.AUTO_FETCH_LIBRARY ? `
            // Fetch all user library items (playlists, albums, artists, podcasts)
            window.fetchAllLibrary = async function() {
                const limit = 50;
                let offset = 0;
                let allItems = [];
                let hasMore = true;
                
                console.log('📚 Starting library fetch...');
                
                while (hasMore) {
                    const response = await originalFetch('https://api-partner.spotify.com/pathfinder/v2/query', {
                        method: 'POST',
                        headers: {
                            'Authorization': window.spotifyAuthToken,
                            'Client-Token': window.spotifyClientToken,
                            'Content-Type': 'application/json;charset=UTF-8'
                        },
                        body: JSON.stringify({
                            variables: {
                                filters: [],
                                order: null,
                                textFilter: '',
                                features: ['LIKED_SONGS', 'YOUR_EPISODES_V2', 'PRERELEASES', 'EVENTS'],
                                limit: limit,
                                offset: offset,
                                flatten: false,
                                expandedFolders: [],
                                folderUri: null,
                                includeFoldersWhenFlattening: true
                            },
                            operationName: 'libraryV3',
                            extensions: {
                                persistedQuery: {
                                    version: 1,
                                    sha256Hash: '0082bf82412db50128add72dbdb73e2961d59100b9cbf41fb25c568bd8bc358b'
                                }
                            }
                        })
                    });
                    
                    if (!response.ok) {
                        const text = await response.text();
                        throw new Error(\`HTTP \${response.status}: \${text}\`);
                    }
                    
                    const data = await response.json();
                    const items = data?.data?.me?.libraryV3?.items || [];
                    allItems = allItems.concat(items);
                    
                    if (items.length < limit) {
                        hasMore = false;
                    } else {
                        offset += limit;
                    }
                }
                
                return allItems;
            };
            
            // Parse library items into structured format
            window.parseLibrary = function(items) {
                const result = {
                    playlists: [],
                    albums: [],
                    artists: [],
                    podcasts: []
                };
                
                items.forEach(({item}) => {
                    const data = item.data;
                    if (!data || !data.__typename) return;
                    
                    switch (data.__typename) {
                        case 'PseudoPlaylist':
                            result.playlists.push({
                                id: data.uri,
                                name: data.name,
                                image: data.image?.sources?.[0]?.url || null
                            });
                            break;
                        case 'Playlist':
                            result.playlists.push({
                                id: data.uri,
                                name: data.name,
                                image: data.images?.items?.[0]?.sources?.[0]?.url || null
                            });
                            break;
                        case 'Album':
                            result.albums.push({
                                id: data.uri,
                                name: data.name,
                                image: data.coverArt?.sources?.[0]?.url || null,
                                artists: data.artists?.items?.map(a => a.profile?.name).filter(Boolean) || []
                            });
                            break;
                        case 'Artist':
                            result.artists.push({
                                id: data.uri,
                                name: data.profile?.name,
                                image: data.visuals?.avatarImage?.sources?.[0]?.url || null
                            });
                            break;
                        case 'Podcast':
                            result.podcasts.push({
                                id: data.uri,
                                name: data.name,
                                image: data.coverArt?.sources?.[0]?.url || null,
                                publisher: data.publisher?.name ? [data.publisher.name] : []
                            });
                            break;
                    }
                });
                
                return result;
            };
            
            // Check if we have all required tokens and fetch library
            window.checkAndFetchMediaLibrary = function() {
                if (typeof window.spotifyMediaLibrary === 'undefined' && 
                    window.spotifyClientToken && 
                    window.spotifyAuthToken && 
                    window.spotifyDeviceId) {
                    
                    fetchAllLibrary()
                        .then(allItems => {
                            console.log(\`✅ Library fetched: \${allItems.length} items\`);
                            window.spotifyMediaLibrary = parseLibrary(allItems);
                            console.log('📚 Parsed library:', window.spotifyMediaLibrary);
                        })
                        .catch(error => {
                            console.error('❌ Library fetch error:', error);
                        });
                }
            };
            ` : '// Library auto-fetch disabled by config'}
            
            // === MEDIA STATE TRACKING ===
            window.updateMediaState = function() {
                const currentState = currentTrack + '|' + currentArtist + '|' + isPlaying + '|' + repeatMode + '|' + isFavorite;
                
                if (currentState !== lastMediaState) {
                    lastMediaState = currentState;
                    console.log('🎵 Media state changed:', {
                        track: currentTrack,
                        artist: currentArtist,
                        playing: isPlaying,
                        repeat: repeatMode,
                        favorite: isFavorite,
                        duration: currentDuration,
                        position: currentPosition
                    });
                } else if (currentPosition && Math.abs(currentPosition - lastPosition) > 4000) {
                    console.log(\`⏩ Position jump: \${Math.floor(currentPosition/1000)}s\`);
                    lastPosition = currentPosition;
                }
            };
            
            // === PLAYBACK CONTROL FUNCTIONS ===
            window.spotifyPlayPause = function(shouldPlay) {
                console.log('🎮 PlayPause:', shouldPlay);
                if ('playPauseButton' in window) {
                    const isCurrentlyPlaying = playPauseButton.getAttribute('aria-label') !== 'Play';
                    if (shouldPlay && !isCurrentlyPlaying) {
                        playPauseButton.click();
                    } else if (!shouldPlay && isCurrentlyPlaying) {
                        playPauseButton.click();
                    }
                }
            };
            
            window.spotifySkipBack = function() {
                console.log('⏮️ Skip back');
                const skipBackButton = document.querySelector('button[data-testid="control-button-skip-back"]');
                if (skipBackButton) {
                    skipBackButton.click();
                }
            };
            
            window.spotifySkipForward = function() {
                console.log('⏭️ Skip forward');
                const skipForwardButton = document.querySelector('button[data-testid="control-button-skip-forward"]');
                if (skipForwardButton) {
                    skipForwardButton.click();
                }
            };
            
            window.spotifyToggleRepeat = function() {
                console.log('🔁 Toggle repeat');
                const repeatButton = document.querySelector('button[data-testid="control-button-repeat"]');
                if (repeatButton) {
                    // Update our tracking
                    if (repeatMode === 'false') repeatMode = 'true';
                    else if (repeatMode === 'true') repeatMode = 'mixed';
                    else repeatMode = 'false';
                    
                    updateMediaState();
                    repeatButton.click();
                }
            };
            
            window.spotifyToggleFavorite = function() {
                console.log('💚 Toggle favorite');
                const favoriteButton = document.querySelector('div[data-testid="now-playing-widget"] > div:last-child > button');
                if (favoriteButton) {
                    const isChecked = favoriteButton.getAttribute('aria-checked') === 'true';
                    if (!isChecked) {
                        // Add to favorites
                        favoriteButton.click();
                        isFavorite = true;
                        updateMediaState();
                    } else {
                        // Remove from favorites - requires opening context menu
                        favoriteButton.click();
                        setTimeout(() => {
                            const removeButton = document.querySelector('#context-menu button[role="menuitemcheckbox"][aria-checked="true"]');
                            if (removeButton) {
                                removeButton.click();
                                setTimeout(() => {
                                    const submitButton = document.querySelector('#context-menu button[type="submit"]');
                                    if (submitButton) {
                                        submitButton.click();
                                        isFavorite = false;
                                        updateMediaState();
                                    }
                                }, 500);
                            }
                        }, 500);
                    }
                }
            };
            
            window.spotifySeek = function(positionMs) {
                console.log(\`⏩ Seek to: \${Math.floor(positionMs/1000)}s\`);
                const progressBar = document.querySelector('div[data-testid="playback-progressbar"] input[type="range"]');
                if (progressBar) {
                    progressBar.value = positionMs + 1;
                    progressBar.dispatchEvent(new Event('change', {bubbles: true}));
                }
            };
            
            window.spotifyPlayFromUri = function(uri) {
                console.log('▶️ Play from URI:', uri);
                let uriType = uri.match(/^spotify:([^:]+)/)?.[1];
                if (uriType === 'user') uriType = 'your_library';
                
                originalFetch(\`https://gew4-spclient.spotify.com/connect-state/v1/player/command/from/\${window.spotifyDeviceId}/to/\${window.spotifyDeviceId}\`, {
                    method: 'POST',
                    headers: {
                        'Authorization': window.spotifyAuthToken,
                        'Client-Token': window.spotifyClientToken,
                        'Content-Type': 'application/json'
                    },
                    body: JSON.stringify({
                        command: {
                            context: {
                                uri: uri,
                                url: 'context://' + uri,
                                metadata: {}
                            },
                            play_origin: {
                                feature_identifier: uriType,
                                feature_version: featureVersion,
                                referrer_identifier: 'your_library'
                            },
                            options: {
                                license: 'tft',
                                skip_to: {},
                                player_options_override: {}
                            },
                            endpoint: 'play'
                        }
                    })
                });
            };
            
            // === UNLOCK MECHANISM ===
            // Detects and fixes stuck playback
            window.triggerUnlock = function() {
                console.log('🔓 Triggering unlock mechanism...');
                const unlockInterval = setInterval(() => {
                    if (playPauseButton.disabled) {
                        console.warn('⚠️ Button disabled - reloading page');
                        window.location.reload();
                    } else if (playPauseButton.getAttribute('aria-label') !== 'Play') {
                        clearInterval(unlockInterval);
                        unlockFlag = false;
                        console.log('✅ Unlocked successfully');
                    }
                }, 3000);
            };
            
            // === LIBRARY SIDEBAR TOGGLE ===
            window.switchLibrarySidebar = function() {
                const sidebar = document.querySelector('#Desktop_LeftSidebar_Id');
                if (!sidebar) return;
                
                const navFirstChild = sidebar.querySelector('nav > div > div:first-child');
                if (!navFirstChild) return;
                
                const isExpanded = navFirstChild.classList.length === 2;
                
                if (isExpanded) {
                    console.log('📖 Library expanded');
                    sidebar.style.position = 'fixed';
                    sidebar.style.width = '100%';
                    sidebar.style.height = '92%';
                    sidebar.style.left = '0';
                    sidebar.style.zIndex = '20';
                    
                    const header = sidebar.querySelector('header > div > div:first-child h1');
                    if (header) {
                        header.innerHTML = '✖ &nbsp; Close Library';
                    }
                } else {
                    console.log('📕 Library collapsed');
                    sidebar.style.zIndex = '1';
                    sidebar.style.position = 'fixed';
                    sidebar.style.top = '0';
                    sidebar.style.left = '60px';
                    sidebar.style.width = '48px';
                    sidebar.style.height = '48px';
                }
            };
            
            // === INTERVAL MANAGEMENT ===
            window.manageIntervals = function(shouldStart) {
                isPlaying = shouldStart;
                updateMediaState();
                
                if (shouldStart) {
                    console.log('▶️ Starting intervals');
                    startMainLoop();
                    startAutoFeatures();
                    startCSSHacks();
                    startMediaStateTracking();
                } else {
                    console.log('⏸️ Stopping intervals');
                    if (playbackCheckInterval) clearInterval(playbackCheckInterval);
                    if (autoFeaturesInterval) clearInterval(autoFeaturesInterval);
                    if (cssHackInterval) clearInterval(cssHackInterval);
                    if (mediaStateInterval) clearInterval(mediaStateInterval);
                }
            };
            
            // === MAIN PLAYBACK LOOP ===
            window.startMainLoop = function() {
                if (playbackCheckInterval) clearInterval(playbackCheckInterval);
                
                playbackCheckInterval = setInterval(() => {
                    // Hook play/pause button
                    const playPauseBtn = document.querySelector('aside button[data-testid="control-button-playpause"]:not(.spotifuck-hooked)');
                    if (playPauseBtn) {
                        console.log('🎮 Hooking play/pause button');
                        playPauseBtn.classList.add('spotifuck-hooked');
                        window.playPauseButton = playPauseBtn;
                        
                        playPauseBtn.addEventListener('click', () => {
                            const isPlaying = playPauseBtn.getAttribute('aria-label') !== 'Play';
                            console.log(\`🎮 Play button clicked (currently \${isPlaying ? 'playing' : 'paused'})\`);
                            
                            if (isPlaying) {
                                // User clicked pause
                                console.log('⏸️ Pause requested');
                                requestPause = true;
                                unlockFlag = false;
                            } else if (!unlockFlag) {
                                // User clicked play - set up unlock mechanism
                                requestPause = false;
                                console.log('🔓 Setting up unlocker (10s timeout)');
                                unlockFlag = true;
                                
                                setTimeout(() => {
                                    if (unlockFlag && playPauseBtn.getAttribute('aria-label') === 'Play') {
                                        console.warn('⚠️ Unlock timeout reached - attempting unlock');
                                        spotifySkipForward();
                                        triggerUnlock();
                                    } else if (unlockFlag) {
                                        console.log('✅ Playing started, removing unlocker');
                                        unlockFlag = false;
                                    }
                                }, 10000);
                            }
                        });
                        
                        if (!firstFuckDone) {
                            firstFuckDone = true;
                            console.log('🎉 First initialization complete');
                            startAutoFeatures();
                            startCSSHacks();
                            startMediaStateTracking();
                            setTimeout(() => manageIntervals(isPlaying), 10000);
                        }
                    }
                }, 5000);
            };
            
            // === AUTO FEATURES ===
            window.startAutoFeatures = function() {
                if (autoFeaturesInterval) clearInterval(autoFeaturesInterval);
                
                console.log('⚙️ Starting auto features');
                
                autoFeaturesInterval = setInterval(() => {
                    ${CONFIG.TAKE_CONTROL ? `
                    // Auto-take control on device conflicts
                    const takeControlButton = document.querySelector('aside div.encore-bright-accent-set button');
                    if (takeControlButton) {
                        console.log('🎮 Taking control');
                        takeControlButton.click();
                        setTimeout(() => {
                            const confirmButton = document.querySelector('aside ul[role="list"] li[role="listitem"] div[role="button"]');
                            if (confirmButton) confirmButton.click();
                        }, 500);
                    }
                    ` : ''}
                }, 5000);
            };
            
            // === CSS/UI HACKS ===
            window.startCSSHacks = function() {
                if (cssHackInterval) clearInterval(cssHackInterval);
                
                console.log('🎨 Starting CSS/UI hacks');
                
                cssHackInterval = setInterval(() => {
                    // Hook library button
                    const libraryButton = document.querySelector('#Desktop_LeftSidebar_Id header > div > div:first-child button:not(.spotifuck-hooked)');
                    if (libraryButton) {
                        console.log('📚 Hooking library button');
                        window.libraryButton = libraryButton;
                        libraryButton.classList.add('spotifuck-hooked', 'library-btn');
                        libraryButton.style.padding = '0';
                        libraryButton.style.height = '20px';
                        libraryButton.addEventListener('click', () => {
                            setTimeout(() => switchLibrarySidebar(), 0);
                        });
                        switchLibrarySidebar();
                    }
                    
                    ${CONFIG.AUTO_CLOSE_LIBRARY ? `
                    // Auto-close library after item selection
                    const libraryGrid = document.querySelector('#Desktop_LeftSidebar_Id div[role="grid"]:not(.spotifuck-hooked)');
                    if (libraryGrid) {
                        libraryGrid.classList.add('spotifuck-hooked');
                        libraryGrid.addEventListener('click', () => {
                            setTimeout(() => {
                                console.log('📕 Auto-closing library');
                                if (libraryButton) libraryButton.click();
                            }, 0);
                        });
                    }
                    ` : ''}
                    
                    // Hook home button
                    const homeButton = document.querySelector('#global-nav-bar button[data-testid="home-button"]:not(.spotifuck-hooked)');
                    if (homeButton) {
                        homeButton.classList.add('spotifuck-hooked');
                    }
                    
                    // Hook search input (hide now-playing bar when focused)
                    const searchInput = document.querySelector('input[data-testid="search-input"]:not(.spotifuck-hooked)');
                    if (searchInput) {
                        searchInput.classList.add('spotifuck-hooked');
                        searchInput.addEventListener('focus', () => {
                            console.log('🔍 Search focused - hiding now-playing bar');
                            const nowPlayingBar = document.querySelector('aside[data-testid="now-playing-bar"]');
                            if (nowPlayingBar) nowPlayingBar.style.display = 'none';
                        });
                        searchInput.addEventListener('blur', () => {
                            console.log('🔍 Search blurred - showing now-playing bar');
                            const nowPlayingBar = document.querySelector('aside[data-testid="now-playing-bar"]');
                            if (nowPlayingBar) nowPlayingBar.style.display = 'flex';
                        });
                    }
                    
                    // Hook user button
                    const userButton = document.querySelector('button[data-testid="user-widget-link"]:not(.spotifuck-hooked)');
                    if (userButton) {
                        userButton.classList.add('spotifuck-hooked');
                    }
                }, 5000);
            };
            
            // === MEDIA STATE TRACKING ===
            window.startMediaStateTracking = function() {
                if (mediaStateInterval) clearInterval(mediaStateInterval);
                
                console.log('📊 Starting media state tracking');
                
                mediaStateInterval = setInterval(() => {
                    // Get current track name
                    const trackLink = document.querySelector('a[data-testid="context-item-link"]');
                    currentTrack = trackLink ? trackLink.textContent : null;
                    
                    // Get current artist name
                    let artistLink = document.querySelector('a[data-testid="context-item-info-artist"]');
                    if (!artistLink) artistLink = document.querySelector('a[data-testid="context-item-info-show"]');
                    currentArtist = artistLink ? artistLink.textContent : '';
                    
                    // Get repeat mode
                    const repeatButton = document.querySelector('button[data-testid="control-button-repeat"]');
                    repeatMode = repeatButton ? repeatButton.getAttribute('aria-checked') : 'false';
                    
                    // Get favorite status
                    const favoriteButton = document.querySelector('div[data-testid="now-playing-widget"] > div:last-child > button');
                    isFavorite = favoriteButton ? favoriteButton.getAttribute('aria-checked') === 'true' : false;
                    
                    // Get playback position/duration
                    const progressBar = document.querySelector('div[data-testid="playback-progressbar"] input[type="range"]');
                    if (progressBar) {
                        currentDuration = parseInt(progressBar.getAttribute('max'));
                        currentPosition = parseInt(progressBar.getAttribute('value'));
                    } else {
                        currentDuration = null;
                        currentPosition = null;
                    }
                    
                    // Get cover art
                    const coverImage = document.querySelector('img[data-testid="cover-art-image"]');
                    currentCover = coverImage ? coverImage.src : null;
                    
                    // Update state
                    updateMediaState();
                }, 2000);
            };
            
            // === INITIALIZE ===
            console.log('🚀 Starting main loop...');
            startMainLoop();
            
            console.log('✅ JavaScript injection complete');
        })();
    `;

    // Inject the main script
    const mainScriptNode = document.createElement('script');
    mainScriptNode.textContent = mainScript;
    (document.head || document.documentElement).appendChild(mainScriptNode);
    mainScriptNode.remove();

    console.log('🎵 Spotifuck v6 - Initialization complete!');
})();
