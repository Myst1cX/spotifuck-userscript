// ==UserScript==
// @name         Spotifuck Userscript v6
// @namespace    https://github.com/Myst1cX/spotifuck-userscript
// @version      6.0.0
// @description  Full Spotifuck 1.6.4 port with library sync, enhanced UI controls, improved ad blocking, and comprehensive logging
// @author       Myst1cX (adapted from Spotifuck app v1.6.4)
// @match        https://open.spotify.com/*
// @match        https://accounts.spotify.com/*
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
        console.log('[Spotifuck v6] Screen/navigator properties spoofed');
    `;
    const scriptNode = document.createElement('script');
    scriptNode.textContent = spoofScript;
    document.documentElement.appendChild(scriptNode);
    scriptNode.remove();

    // --- Inject Spotifuck CSS hacks ---
    console.log('[Spotifuck v6] Injecting CSS styles...');
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

            /* Now Playing Panel Toggle Button - NEW in v6 */
            .npbtn {
                cursor: pointer;
                color: #b3b3b3;
                background: transparent;
                border: none;
                width: 32px;
                height: 32px;
                padding: 8px;
            }

            .npbtn.active {
                color: #1db954;
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

            /* Sidebar navigation styling - v1.6.4 enhancement */
            #Desktop_LeftSidebar_Id > nav > div {
                min-height: 48px;
                border-radius: 25px;
            }

            /* Library container styling - v1.6.4 */
            .YourLibraryX {
                overflow: hidden;
                background: var(--background-elevated-base) !important;
            }

            .YourLibraryX header {
                padding: 14px;
            }

            /* Optional: Pure Black OLED Dark Mode - Uncomment to enable */
            /*
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
            */
        `);

    // --- Main JavaScript injection for web player ---
    const mainScript = `
        (function() {
            console.log('[Spotifuck v6] Main script initializing...');

            // State variables with improved naming (v1.6.4)
            let requestedPause = false;
            let firstPlay = true;
            let unlockFlag = false;  // Renamed from alFlag for clarity
            let firstFuckDone = false;  // Renamed from ffFlag for clarity
            let nowPlayingPanelOpen = false;
            
            // Feature version tracking for API calls
            const featureVersion = \`web-player_\${new Date().toISOString().split('T')[0]}_\${Date.now()}_\${Math.floor(Math.random()*0xFFFFFFF).toString(16).padStart(7,'0')}\`;
            console.log('[Spotifuck v6] Feature version:', featureVersion);
            
            let lastState = null;
            let lastPosition = null;
            let isPlaying = false;
            
            // Interval IDs
            let playbackFeaturesInterval = null;
            let autoFeaturesInterval = null;
            let cssHackInterval = null;
            let mediaAutoInterval = null;

            // Store original fetch for API interception
            const originalFetch = window.fetch;

            // --- Enhanced Fetch Interception with Token Capture (v1.6.4) ---
            console.log('[Spotifuck v6] Setting up enhanced fetch interception...');
            window.fetch = async function(...args) {
                const [url, options] = args;
                const method = options?.method?.toUpperCase?.() || 'GET';
                const headers = options?.headers || {};

                // Capture device ID from device registration
                if (method === 'POST' && url.includes('/track-playback/v1/devices') && options?.body) {
                    try {
                        const body = JSON.parse(options.body);
                        const deviceId = body?.device?.device_id;
                        if (deviceId && deviceId !== window.spotifyDeviceId) {
                            window.spotifyDeviceId = deviceId;
                            console.log('[Spotifuck v6] Device ID captured:', deviceId);
                            if (typeof checkMediaLibrary === 'function') checkMediaLibrary();
                        }
                    } catch(e) { console.error('[Spotifuck v6] Device ID parse error:', e); }
                }
                
                // Capture current URI from GraphQL queries
                else if (method === 'POST' && url.includes('/pathfinder/v2/query') && options?.body) {
                    try {
                        const body = JSON.parse(options.body);
                        if (body?.operationName === 'isCurated') {
                            const currentUri = body?.variables?.uris?.[0];
                            if (currentUri && currentUri !== window.currentPlayingUri) {
                                window.currentPlayingUri = currentUri;
                                console.log('[Spotifuck v6] Current URI:', currentUri);
                            }
                        }
                    } catch(e) { console.error('[Spotifuck v6] URI parse error:', e); }
                }
                
                // Capture device ID from connect-state transfers
                else {
                    const transferMatch = url.match(/\\/connect-state\\/v1\\/player\\/(?:command|transfer)\\/from\\/([^/]+)\\/to\\/([^/]+)/);
                    if (transferMatch?.[2] && transferMatch[2] !== window.spotifyDeviceId) {
                        window.spotifyDeviceId = transferMatch[2];
                        console.log('[Spotifuck v6] Device ID from transfer:', window.spotifyDeviceId);
                        if (typeof checkMediaLibrary === 'function') checkMediaLibrary();
                    }
                }

                // Capture Client-Token
                const clientToken = headers['Client-Token'] || headers['client-token'];
                if (clientToken && clientToken !== window.spotifyClientToken) {
                    window.spotifyClientToken = clientToken;
                    console.log('[Spotifuck v6] Client Token captured');
                    if (typeof checkMediaLibrary === 'function') checkMediaLibrary();
                }

                // Capture Authorization token
                const authHeader = headers.Authorization || headers.authorization;
                if (authHeader?.startsWith('Bearer ') && authHeader !== window.spotifyAuthToken) {
                    window.spotifyAuthToken = authHeader;
                    console.log('[Spotifuck v6] Auth Token captured');
                    if (typeof checkMediaLibrary === 'function') checkMediaLibrary();
                }

                // Detect play/pause from track-playback API
                if (firstFuckDone && url.includes('/track-playback/') && method === 'PUT') {
                    try {
                        const paused = options?.body ? JSON.parse(options.body)?.state_ref?.paused : undefined;
                        if (paused === true && isPlaying) {
                            console.log('[Spotifuck v6] Track-Playback: Pause detected');
                            manageAllFeatures(false);
                        } else if (paused === false && !isPlaying) {
                            console.log('[Spotifuck v6] Track-Playback: Play detected');
                            manageAllFeatures(true);
                        }
                    } catch(e) { console.error('[Spotifuck v6] Playback state parse error:', e); }
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
                    console.error('[Spotifuck v6] Fetch error:', error.message);
                    throw error;
                }
            };

            // --- Library Sync Functions (NEW in v1.6.4) ---
            window.fetchAllLibrary = async function() {
                console.log('[Spotifuck v6] Fetching complete library...');
                const limit = 50;
                let offset = 0;
                let allItems = [];
                let hasMore = true;

                while (hasMore) {
                    try {
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
                    } catch(error) {
                        console.error('[Spotifuck v6] Library fetch error:', error);
                        throw error;
                    }
                }

                console.log(\`[Spotifuck v6] ✅ Library fetched successfully: \${allItems.length} items\`);
                return allItems;
            };

            window.parseLibrary = function(items) {
                console.log('[Spotifuck v6] Parsing library items...');
                const result = {
                    playlists: [],
                    albums: [],
                    artists: [],
                    podcasts: []
                };

                items.forEach(({item}) => {
                    const data = item.data;
                    if (!data || !data.__typename) return;

                    switch(data.__typename) {
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
                                artists: data.publisher?.name ? [data.publisher.name] : []
                            });
                            break;
                        default:
                            break;
                    }
                });

                console.log('[Spotifuck v6] Library parsed:', {
                    playlists: result.playlists.length,
                    albums: result.albums.length,
                    artists: result.artists.length,
                    podcasts: result.podcasts.length
                });

                return result;
            };

            window.checkMediaLibrary = function() {
                if (typeof window.spotifyMediaLibrary === 'undefined' && 
                    window.spotifyClientToken && 
                    window.spotifyAuthToken && 
                    window.spotifyDeviceId) {
                    console.log('[Spotifuck v6] All tokens available, fetching library...');
                    fetchAllLibrary()
                        .then(allItems => {
                            window.spotifyMediaLibrary = parseLibrary(allItems);
                            console.log('[Spotifuck v6] ✅ Media library ready');
                        })
                        .catch(error => {
                            console.error('[Spotifuck v6] ❌ Library fetch failed:', error);
                        });
                }
            };

            // --- Direct Playback Function (NEW in v1.6.4) ---
            window.playFromUri = function(uri) {
                console.log('[Spotifuck v6] Playing from URI:', uri);
                
                if (!window.spotifyDeviceId || !window.spotifyAuthToken || !window.spotifyClientToken) {
                    console.error('[Spotifuck v6] Cannot play: Missing tokens or device ID');
                    return;
                }

                let type = uri.match(/^spotify:([^:]+)/)?.[1];
                if (type === 'user') type = 'your_library';

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
                                feature_identifier: type,
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
                })
                .then(response => {
                    if (response.ok) {
                        console.log('[Spotifuck v6] ✅ Playback started successfully');
                    } else {
                        console.error('[Spotifuck v6] ❌ Playback failed:', response.status);
                    }
                })
                .catch(error => {
                    console.error('[Spotifuck v6] ❌ Playback error:', error);
                });
            };

            // --- Main Playback Features Monitoring ---
            window.setupPlaybackFeatures = function() {
                console.log('[Spotifuck v6] Setting up playback features...');
                
                if (playbackFeaturesInterval) clearInterval(playbackFeaturesInterval);
                
                playbackFeaturesInterval = setInterval(() => {
                    // Improved video detection (v1.6.4)
                    const videoPlayer = document.querySelector('.VideoPlayer__container video');
                    if (isPlaying && document.visibilityState === 'hidden' && videoPlayer) {
                        console.log('[Spotifuck v6] Video playing in background');
                    }

                    // Add Now Playing Panel toggle button (NEW in v1.6.4)
                    if (typeof window.nowPlayingPanelButton === 'undefined') {
                        const lyricsButton = document.querySelector('button[data-testid="lyrics-button"]:not(.fuckd)');
                        if (lyricsButton) {
                            console.log('[Spotifuck v6] Creating Now Playing Panel button...');
                            lyricsButton.classList.add('fuckd');
                            
                            const nowPlayingButton = document.createElement('button');
                            nowPlayingButton.className = 'npbtn';
                            nowPlayingButton.onclick = toggleNowPlayingPanel;
                            nowPlayingButton.innerHTML = \`<svg viewBox="0 0 16 17"><rect x="1" y="0.75" width="14" height="15.5" rx="2" fill="none" stroke="currentColor" stroke-width="1.5"/><path d="M 6 5 L 6 5.9160156 L 9.6933594 8.5 L 6 11.080078 L 6 12 L 11 8.5 L 6 5 z" stroke="currentColor" stroke-width="1.2"/></svg>\`;
                            
                            lyricsButton.parentNode.insertBefore(nowPlayingButton, lyricsButton);
                            window.nowPlayingPanelButton = nowPlayingButton;
                            
                            console.log('[Spotifuck v6] ✅ Now Playing Panel button added');
                            closeNowPlayingPanel();
                        }
                    }

                    // Setup play/pause button
                    const playPauseButton = document.querySelector('aside button[data-testid="control-button-playpause"]:not(.fuckd)');
                    if (playPauseButton) {
                        console.log('[Spotifuck v6] Play/pause button found, setting up listener...');
                        playPauseButton.classList.add('fuckd');
                        window.playPauseButton = playPauseButton;

                        playPauseButton.addEventListener('click', () => {
                            console.log('[Spotifuck v6] Play button clicked');
                            
                            if (playPauseButton.getAttribute('aria-label') !== 'Play') {
                                console.log('[Spotifuck v6] Pause requested');
                                requestedPause = true;
                                unlockFlag = false;
                            } else if (!unlockFlag) {
                                requestedPause = false;
                                console.log('[Spotifuck v6] Adding unlock mechanism...');
                                unlockFlag = true;
                                
                                setTimeout(() => {
                                    console.log('[Spotifuck v6] Unlock timeout reached');
                                    if (unlockFlag && playPauseButton.getAttribute('aria-label') === 'Play') {
                                        console.log('[Spotifuck v6] 🔓 Triggering unlock...');
                                        skipForward();
                                        triggerUnlock();
                                    } else if (unlockFlag) {
                                        console.log('[Spotifuck v6] Playing, removing unlock flag');
                                        unlockFlag = false;
                                    }
                                }, 10000);
                            }
                        });

                        if (!firstFuckDone) {
                            firstFuckDone = true;
                            console.log('[Spotifuck v6] ✅ First initialization complete, adding all features...');
                            addAutoFeatures();
                            addCSSHacks();
                            addMediaAutoUpdate();
                            
                            setTimeout(() => {
                                manageAllFeatures(isPlaying);
                            }, 10000);
                        }
                    }
                }, 5000);
            };

            // Initialize playback features
            setupPlaybackFeatures();

            // --- Feature Management ---
            window.manageAllFeatures = function(play) {
                isPlaying = play;
                console.log(\`[Spotifuck v6] Managing all features, playing: \${play}\`);
                
                if (typeof updateMediaStatus === 'function') {
                    updateMediaStatus();
                }

                if (play) {
                    console.log('[Spotifuck v6] Starting all intervals...');
                    setupPlaybackFeatures();
                    addAutoFeatures();
                    addCSSHacks();
                    addMediaAutoUpdate();
                } else {
                    console.log('[Spotifuck v6] Stopping all intervals...');
                    if (playbackFeaturesInterval) clearInterval(playbackFeaturesInterval);
                    if (autoFeaturesInterval) clearInterval(autoFeaturesInterval);
                    if (cssHackInterval) clearInterval(cssHackInterval);
                    if (mediaAutoInterval) clearInterval(mediaAutoInterval);
                }
            };

            // --- Now Playing Panel Control (NEW in v1.6.4) ---
            window.toggleNowPlayingPanel = function() {
                console.log('[Spotifuck v6] Toggling Now Playing Panel...');
                const panelContainer = document.querySelector('#Desktop_PanelContainer_Id');
                if (panelContainer) {
                    const rightSideButton = panelContainer.parentNode.parentNode.nextElementSibling?.querySelector('button');
                    if (rightSideButton) {
                        const isHidden = panelContainer.parentNode.parentNode.ariaHidden;
                        
                        if (isHidden === 'true') {
                            window.nowPlayingPanelButton?.classList.add('active');
                        } else {
                            window.nowPlayingPanelButton?.classList.remove('active');
                        }
                        
                        rightSideButton.click();
                        console.log('[Spotifuck v6] ✅ Panel toggled');
                    }
                }
            };

            window.closeNowPlayingPanel = function() {
                const panelContainer = document.querySelector('#Desktop_PanelContainer_Id');
                if (panelContainer && panelContainer.parentNode.parentNode.ariaHidden === 'false') {
                    console.log('[Spotifuck v6] Closing Now Playing Panel...');
                    toggleNowPlayingPanel();
                }
            };

            // --- Unlock mechanism ---
            window.triggerUnlock = function() {
                console.log('[Spotifuck v6] Starting unlock sequence...');
                const unlockInterval = setInterval(() => {
                    if (window.playPauseButton?.disabled) {
                        console.log('[Spotifuck v6] Button disabled, reloading page...');
                        window.location.reload();
                    } else if (window.playPauseButton?.getAttribute('aria-label') !== 'Play') {
                        clearInterval(unlockInterval);
                        unlockFlag = false;
                        console.log('[Spotifuck v6] ✅ Unlocked successfully!');
                    }
                }, 3000);
            };

            // --- Playback Control Functions ---
            window.playPause = function(shouldPlay) {
                console.log('[Spotifuck v6] PlayPause called:', shouldPlay);
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
                console.log('[Spotifuck v6] Skip back');
                const skipBackButton = document.querySelector('button[data-testid="control-button-skip-back"]');
                if (skipBackButton) skipBackButton.click();
            };

            window.skipForward = function() {
                console.log('[Spotifuck v6] Skip forward');
                const skipForwardButton = document.querySelector('button[data-testid="control-button-skip-forward"]');
                if (skipForwardButton) skipForwardButton.click();
            };

            window.toggleRepeat = function() {
                console.log('[Spotifuck v6] Toggle repeat');
                const repeatButton = document.querySelector('button[data-testid="control-button-repeat"]');
                if (repeatButton) {
                    repeatButton.click();
                    if (typeof updateMediaStatus === 'function') {
                        updateMediaStatus();
                    }
                }
            };

            window.toggleFavorite = function() {
                console.log('[Spotifuck v6] Toggle favorite');
                const favoriteButton = document.querySelector('div[data-testid="now-playing-widget"] > div:last-child > button');
                if (favoriteButton) {
                    const isFavorite = favoriteButton.getAttribute('aria-checked') === 'true';
                    
                    if (!isFavorite) {
                        console.log('[Spotifuck v6] Adding to favorites...');
                        favoriteButton.click();
                        if (typeof updateMediaStatus === 'function') {
                            updateMediaStatus();
                        }
                    } else {
                        console.log('[Spotifuck v6] Removing from favorites...');
                        favoriteButton.click();
                        
                        const removeInterval = setInterval(() => {
                            const removeMenuItem = document.querySelector('#context-menu button[role="menuitemcheckbox"][aria-checked="true"]');
                            if (removeMenuItem) {
                                clearInterval(removeInterval);
                                removeMenuItem.click();
                                
                                setTimeout(() => {
                                    const submitButton = document.querySelector('#context-menu button[type="submit"]');
                                    if (submitButton) {
                                        submitButton.click();
                                        if (typeof updateMediaStatus === 'function') {
                                            updateMediaStatus();
                                        }
                                    }
                                }, 500);
                            }
                        }, 1000);
                    }
                }
            };

            window.seekToPosition = function(position) {
                console.log('[Spotifuck v6] Seeking to position:', position);
                const progressBar = document.querySelector('div[data-testid="playback-progressbar"] input[type="range"]');
                if (progressBar) {
                    // Improved seek precision with +1ms offset (v1.6.4)
                    progressBar.value = position + 1;
                    progressBar.dispatchEvent(new Event('change', { bubbles: true }));
                    console.log('[Spotifuck v6] ✅ Seek complete');
                }
            };

            // --- Auto Features ---
            window.addAutoFeatures = function() {
                console.log('[Spotifuck v6] Adding auto features...');
                
                // One-time autoplay on load
                if ('playPauseButton' in window && firstPlay && 
                    window.playPauseButton.getAttribute('aria-label') === 'Play') {
                    console.log('[Spotifuck v6] 🎵 Triggering autoplay...');
                    window.playPauseButton.click();
                    firstPlay = false;
                }
            };

            // --- Media Status Updates ---
            window.addMediaAutoUpdate = function() {
                console.log('[Spotifuck v6] Adding media auto-update...');
                
                if (mediaAutoInterval) clearInterval(mediaAutoInterval);
                
                mediaAutoInterval = setInterval(() => {
                    // Get track info
                    const trackLink = document.querySelector('a[data-testid="context-item-link"]');
                    const trackTitle = trackLink ? trackLink.text : null;
                    
                    const artistLink = document.querySelector('a[data-testid="context-item-info-artist"]');
                    const artistName = artistLink ? artistLink.text : '';
                    
                    // Get repeat mode
                    const repeatButton = document.querySelector('button[data-testid="control-button-repeat"]');
                    const repeatMode = repeatButton ? repeatButton.getAttribute('aria-checked') : 'false';
                    
                    // Get favorite status
                    const favoriteButton = document.querySelector('div[data-testid="now-playing-widget"] > div:last-child > button');
                    const isFavorite = (favoriteButton && favoriteButton.getAttribute('aria-checked') === 'true');
                    
                    // Get position and duration
                    const progressBar = document.querySelector('div[data-testid="playback-progressbar"] input[type="range"]');
                    const duration = progressBar ? parseInt(progressBar.getAttribute('max')) : null;
                    const position = progressBar ? parseInt(progressBar.getAttribute('value')) : null;
                    
                    // Get cover art
                    const coverImage = document.querySelector('img[data-testid="cover-art-image"]');
                    const coverUrl = coverImage ? coverImage.src : null;
                    
                    // Update media status
                    window.updateMediaStatus = function() {
                        const currentState = trackTitle + '|' + artistName + '|' + isPlaying + '|' + repeatMode + '|' + isFavorite;
                        
                        if (currentState !== lastState) {
                            lastState = currentState;
                            const mediaData = {
                                artist: artistName,
                                track: trackTitle,
                                playing: isPlaying,
                                repeat: repeatMode,
                                favorite: isFavorite,
                                duration: duration,
                                position: position,
                                cover: coverUrl
                            };
                            console.log('[Spotifuck v6] Media status update:', mediaData);
                        } else if (position && lastPosition && Math.abs(position - lastPosition) > 4000) {
                            console.log('[Spotifuck v6] Position update:', position);
                            lastPosition = position;
                        }
                    };
                    
                    updateMediaStatus();
                }, 2000);
            };

            // --- CSS/JS Hacks for Sidebar ---
            window.addCSSHacks = function() {
                console.log('[Spotifuck v6] Adding CSS/JS hacks...');
                
                if (cssHackInterval) clearInterval(cssHackInterval);
                
                cssHackInterval = setInterval(() => {
                    // Library button setup
                    const libraryButton = document.querySelector('#Desktop_LeftSidebar_Id header > div > div:first-child button:not(.fuckd)');
                    if (libraryButton) {
                        console.log('[Spotifuck v6] Library button found, setting up...');
                        window.libraryButton = libraryButton;
                        libraryButton.classList.add('fuckd', 'lbtn');
                        libraryButton.style.padding = '0';
                        libraryButton.style.height = '20px';
                        libraryButton.addEventListener('click', () => {
                            setTimeout(() => switchLeftSidebar(), 0);
                        });
                        switchLeftSidebar();
                        console.log('[Spotifuck v6] ✅ Library button configured');
                    }

                    // Library grid items auto-close
                    const libraryGridItems = document.querySelector('#Desktop_LeftSidebar_Id div[role="grid"]:not(.fuckd)');
                    if (libraryGridItems) {
                        libraryGridItems.classList.add('fuckd');
                        libraryGridItems.addEventListener('click', () => {
                            setTimeout(() => {
                                console.log('[Spotifuck v6] Auto-closing library...');
                                if (window.libraryButton) window.libraryButton.click();
                                closeNowPlayingPanel();
                            }, 0);
                        });
                    }

                    // Home button closes now playing panel
                    const homeButton = document.querySelector('#global-nav-bar button[data-testid="home-button"]:not(.fuckd)');
                    if (homeButton) {
                        homeButton.classList.add('fuckd');
                        homeButton.addEventListener('click', () => {
                            closeNowPlayingPanel();
                        });
                    }

                    // Search input handling
                    const searchInput = document.querySelector('input[data-testid="search-input"]:not(.fuckd)');
                    if (searchInput) {
                        searchInput.classList.add('fuckd');
                        searchInput.addEventListener('focus', () => {
                            const nowPlayingBar = document.querySelector('aside[data-testid="now-playing-bar"]');
                            if (nowPlayingBar) nowPlayingBar.style.display = 'none';
                            closeNowPlayingPanel();
                        });
                        searchInput.addEventListener('blur', () => {
                            const nowPlayingBar = document.querySelector('aside[data-testid="now-playing-bar"]');
                            if (nowPlayingBar) nowPlayingBar.style.display = 'flex';
                        });
                    }

                    // User widget closes now playing panel
                    const userWidget = document.querySelector('button[data-testid="user-widget-link"]:not(.fuckd)');
                    if (userWidget) {
                        userWidget.classList.add('fuckd');
                        userWidget.addEventListener('click', () => {
                            closeNowPlayingPanel();
                        });
                    }
                }, 5000);
            };

            // --- Sidebar Toggle Logic ---
            window.switchLeftSidebar = function() {
                console.log('[Spotifuck v6] Switching left sidebar...');
                const leftSidebar = document.querySelector('#Desktop_LeftSidebar_Id');
                if (!leftSidebar) return;

                const navFirstChild = leftSidebar.querySelector('nav > div > div:first-child');
                if (!navFirstChild) return;

                const isExpanded = navFirstChild.classList.length === 2;

                if (isExpanded) {
                    console.log('[Spotifuck v6] Expanding sidebar...');
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
                    console.log('[Spotifuck v6] Collapsing sidebar...');
                    leftSidebar.style.zIndex = '1';
                    leftSidebar.style.position = 'fixed';
                    leftSidebar.style.top = '0';
                    leftSidebar.style.left = '60px';
                    leftSidebar.style.width = '48px';
                    leftSidebar.style.height = '48px';
                }
            };

            console.log('[Spotifuck v6] ✅ Main script initialization complete');
        })();
    `;

    const scriptElement = document.createElement('script');
    scriptElement.textContent = mainScript;
    (document.head || document.documentElement).appendChild(scriptElement);
    scriptElement.remove();

    // --- Login Page Enhancement (NEW in v1.6.4) ---
    if (window.location.href.endsWith('/login')) {
        console.log('[Spotifuck v6] Login page detected, adding classic login button...');
        
        const loginEnhancementScript = `
            (function() {
                const checkInterval = setInterval(() => {
                    const googleLoginLink = document.querySelector('section > div > div > div > div > a:first-child:not(.fuckd)');
                    if (googleLoginLink) {
                        clearInterval(checkInterval);
                        console.log('[Spotifuck v6] Adding classic login button...');
                        
                        const classicLoginLink = document.createElement('a');
                        classicLoginLink.className = 'fuckd';
                        classicLoginLink.innerText = 'Email + Password Classic Login';
                        classicLoginLink.style.cssText = 'display:block;padding:10px;margin:10px 0;color:white;font-weight:bold;text-decoration:none;border:1px solid #ddd;background:#339;border-radius:30px;text-align:center;';
                        classicLoginLink.href = '?allow_password=1';
                        
                        googleLoginLink.parentNode.insertBefore(classicLoginLink, googleLoginLink);
                        console.log('[Spotifuck v6] ✅ Classic login button added');
                    }
                }, 500);
            })();
        `;
        
        const loginScript = document.createElement('script');
        loginScript.textContent = loginEnhancementScript;
        (document.head || document.documentElement).appendChild(loginScript);
        loginScript.remove();
    }

    // --- Enhanced Silent Audio Ad Blocking ---
    console.log('[Spotifuck v6] Setting up enhanced ad blocker...');
    const adBlockScript = `
        (function() {
            console.log('[Spotifuck v6] Ad blocker active');
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
                        console.log('[Spotifuck v6] 🚫 Blocked ad:', url.substring(0, 80) + '...');
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

    console.log('[Spotifuck v6] ✅ All features initialized successfully');
})();
