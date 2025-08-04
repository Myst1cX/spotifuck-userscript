// ==UserScript==
// @name         Testing v%
// @namespace    https://github.com/Myst1cX/spotifuck-userscript
// @version      5.0.0
// @description  Complete Spotifuck 1.5.0 port with all features: UI hacks, auto-play, controls, consent automation, ad blocking
// @author       Myst1cX (ported from Spotifuck Android app)
// @match        https://open.spotify.com/*
// @match        https://www.facebook.com/privacy/consent/gdp/*
// @match        https://www.facebook.com/*
// @grant        GM_addStyle
// @grant        GM_setValue
// @grant        GM_getValue
// @grant        GM_registerMenuCommand
// @run-at       document-start
// @homepageURL  https://github.com/Myst1cX/spotifuck-userscript
// @supportURL   https://github.com/Myst1cX/spotifuck-userscript/issues
// @updateURL    https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-v5.user.js
// @downloadURL  https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-v5.user.js
// ==/UserScript==

(function() {
    'use strict';

    // ===========================================
    // SETTINGS SYSTEM
    // ===========================================

    // Default settings matching Java AppSingleton initialization
    const defaultSettings = {
        ServiceOn: true,
        LoggedIn: false,
        APlayMode: "disabled", // "disabled", "onetime", "permanent"
        CloseNowPlay: true,
        TakeControl: true,
        GuiMode: "csshack", // "csshack" or other modes
        AndAuto: true,
        SwipeStop: false
    };

    // Load settings from storage
    let settings = {};
    for (const [key, defaultValue] of Object.entries(defaultSettings)) {
        settings[key] = GM_getValue(key, defaultValue);
    }

    // Settings menu commands
    function registerSettingsMenu() {
        GM_registerMenuCommand(`🔧 Spotifuck Settings`, () => {
            showSettingsDialog();
        });

        GM_registerMenuCommand(`⚡ Service: ${settings.ServiceOn ? 'ON' : 'OFF'}`, () => {
            toggleSetting('ServiceOn');
        });

        GM_registerMenuCommand(`🎵 Auto-Play: ${settings.APlayMode}`, () => {
            cycleSetting('APlayMode', ['disabled', 'onetime', 'permanent']);
        });

        GM_registerMenuCommand(`❌ Close Now Playing: ${settings.CloseNowPlay ? 'ON' : 'OFF'}`, () => {
            toggleSetting('CloseNowPlay');
        });

        GM_registerMenuCommand(`🎮 Take Control: ${settings.TakeControl ? 'ON' : 'OFF'}`, () => {
            toggleSetting('TakeControl');
        });

        GM_registerMenuCommand(`🎨 GUI Mode: ${settings.GuiMode}`, () => {
            cycleSetting('GuiMode', ['csshack', 'minimal', 'disabled']);
        });

        GM_registerMenuCommand(`🤖 Android Auto: ${settings.AndAuto ? 'ON' : 'OFF'}`, () => {
            toggleSetting('AndAuto');
        });

        GM_registerMenuCommand(`👆 Swipe Stop: ${settings.SwipeStop ? 'ON' : 'OFF'}`, () => {
            toggleSetting('SwipeStop');
        });
    }

    function toggleSetting(key) {
        settings[key] = !settings[key];
        GM_setValue(key, settings[key]);
        console.log(`[Spotifuck] ${key}: ${settings[key]}`);
        location.reload(); // Reload to apply changes
    }

    function cycleSetting(key, values) {
        const currentIndex = values.indexOf(settings[key]);
        const nextIndex = (currentIndex + 1) % values.length;
        settings[key] = values[nextIndex];
        GM_setValue(key, settings[key]);
        console.log(`[Spotifuck] ${key}: ${settings[key]}`);
        location.reload(); // Reload to apply changes
    }

    function showSettingsDialog() {
        const dialog = `
Current Spotifuck Settings:
━━━━━━━━━━━━━━━━━━━━━━━━━━━━
⚡ Service: ${settings.ServiceOn ? 'ON' : 'OFF'}
🔐 Logged In: ${settings.LoggedIn ? 'YES' : 'NO'}
🎵 Auto-Play Mode: ${settings.APlayMode}
❌ Close Now Playing: ${settings.CloseNowPlay ? 'ON' : 'OFF'}
🎮 Take Control: ${settings.TakeControl ? 'ON' : 'OFF'}
🎨 GUI Mode: ${settings.GuiMode}
🤖 Android Auto: ${settings.AndAuto ? 'ON' : 'OFF'}
👆 Swipe Stop: ${settings.SwipeStop ? 'ON' : 'OFF'}
━━━━━━━━━━━━━━━━━━━━━━━━━━━━

Use individual menu commands to toggle settings.
Changes require page reload to take effect.`;
        alert(dialog);
    }

    // ===========================================
    // CLIENT SPOOFING (Early Execution)
    // ===========================================

    // Spoof browser properties immediately to avoid detection
    const spoofScript = `
        (function() {
            // Screen properties spoofing
            Object.defineProperty(window.screen, 'width', {get: () => 1920, configurable: true});
            Object.defineProperty(window.screen, 'height', {get: () => 1080, configurable: true});
            Object.defineProperty(window.screen, 'availWidth', {get: () => 1920, configurable: true});
            Object.defineProperty(window.screen, 'availHeight', {get: () => 1040, configurable: true});
            
            // Window properties spoofing
            Object.defineProperty(window, 'innerWidth', {get: () => 1920, configurable: true});
            Object.defineProperty(window, 'innerHeight', {get: () => 978, configurable: true});
            
            // Navigator properties spoofing
            Object.defineProperty(window.navigator, 'vendor', {get: () => 'Google Inc.', configurable: true});
            Object.defineProperty(window.navigator, 'productSub', {get: () => '20030107', configurable: true});
            Object.defineProperty(window.navigator, 'platform', {get: () => 'Win32', configurable: true});
            Object.defineProperty(window.navigator, 'oscpu', {get: () => 'Windows NT 10.0; Win64; x64', configurable: true});
            
            console.log('[Spotifuck] Client spoofing applied');
        })();
    `;

    // Inject spoofing script immediately
    const spoofScriptElement = document.createElement('script');
    spoofScriptElement.textContent = spoofScript;
    (document.head || document.documentElement).appendChild(spoofScriptElement);
    spoofScriptElement.remove();

    // ===========================================
    // FACEBOOK CONSENT AUTOMATION
    // ===========================================

    function handleFacebookConsent() {
        if (window.location.href.startsWith('https://www.facebook.com/privacy/consent/gdp/')) {
            console.log('[Spotifuck] Facebook consent page detected, auto-clicking consent button...');
            
            // Wait for page to load then click consent button
            setTimeout(() => {
                const consentButton = document.querySelector('#facebook div[role=button]');
                if (consentButton) {
                    console.log('[Spotifuck] Clicking Facebook consent button');
                    consentButton.click();
                } else {
                    console.log('[Spotifuck] Facebook consent button not found, trying alternative selectors...');
                    // Try alternative selectors
                    const alternatives = [
                        'button[data-testid="accept-button"]',
                        'button[data-testid="cookie-policy-manage-dialog-accept-button"]',
                        'div[role="button"]:contains("Accept")',
                        'button:contains("Accept")',
                        'div[role="button"]:contains("Agree")',
                        'button:contains("Agree")'
                    ];
                    
                    for (const selector of alternatives) {
                        const btn = document.querySelector(selector);
                        if (btn) {
                            console.log(`[Spotifuck] Found consent button with selector: ${selector}`);
                            btn.click();
                            break;
                        }
                    }
                }
            }, 1000);
        }
    }

    // ===========================================
    // SILENT AUDIO AD BLOCKING
    // ===========================================

    function setupAudioAdBlocking() {
        // Create silent audio blob
        const silentAudioData = new Uint8Array([
            0x52, 0x49, 0x46, 0x46, 0x24, 0x00, 0x00, 0x00, 0x57, 0x41, 0x56, 0x45, 0x66, 0x6D, 0x74, 0x20,
            0x10, 0x00, 0x00, 0x00, 0x01, 0x00, 0x01, 0x00, 0x44, 0xAC, 0x00, 0x00, 0x88, 0x58, 0x01, 0x00,
            0x02, 0x00, 0x10, 0x00, 0x64, 0x61, 0x74, 0x61, 0x00, 0x00, 0x00, 0x00
        ]);
        const silentAudioBlob = new Blob([silentAudioData], { type: 'audio/wav' });
        const silentAudioUrl = URL.createObjectURL(silentAudioBlob);

        // Intercept fetch requests
        const originalFetch = window.fetch;
        window.fetch = function(resource, init) {
            const url = (typeof resource === 'string') ? resource : resource.url;
            
            // Block known ad domains and audio/mpeg content from ad sources
            if (url && (
                url.includes('doubleclick.net') ||
                url.includes('googlesyndication.com') ||
                url.includes('fastly-insights.com') ||
                (url.includes('audio/mpeg') && (
                    url.includes('ads') || 
                    url.includes('advertising') ||
                    url.includes('doubleclick') ||
                    url.includes('googlesyndication')
                ))
            )) {
                console.log('[Spotifuck] Blocking audio ad request:', url);
                return Promise.resolve(new Response(silentAudioBlob, {
                    status: 200,
                    statusText: 'OK',
                    headers: { 'Content-Type': 'audio/wav' }
                }));
            }
            
            return originalFetch.apply(this, arguments);
        };

        // Intercept XMLHttpRequest for additional ad blocking
        const originalXHROpen = XMLHttpRequest.prototype.open;
        XMLHttpRequest.prototype.open = function(method, url, ...args) {
            if (url && (
                url.includes('doubleclick.net') ||
                url.includes('googlesyndication.com') ||
                url.includes('fastly-insights.com')
            )) {
                console.log('[Spotifuck] Blocking XHR ad request:', url);
                // Replace with silent audio URL
                url = silentAudioUrl;
            }
            return originalXHROpen.call(this, method, url, ...args);
        };

        console.log('[Spotifuck] Audio ad blocking enabled');
    }

    // ===========================================
    // CSS UI HACKS
    // ===========================================

    function applyCssHacks() {
        if (settings.GuiMode !== 'csshack') {
            console.log('[Spotifuck] CSS hacks disabled via settings');
            return;
        }

        const cssHacks = `
            /* Body and root styling */
            body {
                min-width: 100% !important;
                min-height: 100% !important;
            }
            
            div[data-testid="root"] {
                --panel-gap: 0 !important;
            }
            
            /* Hide unnecessary elements */
            #global-nav-bar > div:first-of-type,
            #global-nav-bar a[href="/download"],
            #Desktop_LeftSidebar_Id header > div > div:last-child,
            div.main-view-container__mh-footer-container,
            button[data-testid="fullscreen-mode-button"] {
                display: none !important;
            }
            
            /* Now playing bar enhancements */
            aside[data-testid="now-playing-bar"] {
                min-width: 100% !important;
                box-shadow: 0 0 6px #440000 !important;
                background: linear-gradient(to bottom, #770000, #330000) !important;
            }
            
            aside[data-testid="now-playing-bar"] > div {
                margin-top: 2px !important;
                flex-direction: column !important;
                height: auto !important;
            }
            
            aside[data-testid="now-playing-bar"] > div > div {
                width: 100% !important;
            }
            
            /* Player controls styling */
            div[data-testid="player-controls"] {
                margin: 5px 0 !important;
            }
            
            div[data-testid="general-controls"] {
                margin: 15px 0 25px !important;
            }
            
            div[data-testid="general-controls"] button {
                transform: scale(1.4) !important;
                margin: 0 8px !important;
            }
            
            button[data-testid="control-button-npv"] {
                margin: 5px 10px !important;
                transform: scale(1.15) !important;
            }
            
            /* Content area styling */
            main > section > div.contentSpacing {
                padding: 0 10px !important;
                overflow: hidden !important;
            }
            
            div[data-testid="track-list"] > div:first-child {
                top: 0 !important;
                background: transparent !important;
            }
            
            div[data-testid="tracklist-row"] button {
                opacity: 0.6 !important;
            }
            
            /* Now playing widget */
            div[data-testid="now-playing-widget"] {
                justify-content: center !important;
                overflow: hidden !important;
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
                min-width: auto !important;
                max-width: 66% !important;
            }
            
            /* Tooltip and transition fixes */
            [data-tippy-root],
            [data-tippy-root] * {
                transition: none !important;
                transform: none !important;
            }
            
            div[data-testid="hover-or-focus-tooltip"] {
                display: none !important;
            }
            
            /* Search form positioning */
            form[role="search"] {
                z-index: 10 !important;
                margin-left: 50px !important;
            }
            
            /* Content spacing */
            section > div > div.contentSpacing > div {
                overflow: hidden !important;
            }
        `;

        GM_addStyle(cssHacks);
        console.log('[Spotifuck] CSS UI hacks applied');
    }

    // ===========================================
    // PLAYBACK CONTROLS
    // ===========================================

    let playButtonElement = null;
    let leftSidebarButton = null;
    let autoFeaturesAdded = false;
    let requestPause = false;
    let autoPlayFlag = false;

    // Global playback control functions
    window.actPlayPause = function(play) {
        console.log('[Spotifuck] PlayPause:', play);
        if (playButtonElement) {
            const isPlaying = playButtonElement.getAttribute('aria-label') !== 'Play';
            if (play === undefined) {
                // Toggle
                playButtonElement.click();
            } else if (play && !isPlaying) {
                // Play
                playButtonElement.click();
            } else if (!play && isPlaying) {
                // Pause
                playButtonElement.click();
            }
        }
    };

    window.actSkipBack = function() {
        console.log('[Spotifuck] SkipBack');
        const skipBackButton = document.querySelector('button[data-testid="control-button-skip-back"]');
        if (skipBackButton) skipBackButton.click();
    };

    window.actSkipForward = function() {
        console.log('[Spotifuck] SkipForward');
        const skipForwardButton = document.querySelector('button[data-testid="control-button-skip-forward"]');
        if (skipForwardButton) skipForwardButton.click();
    };

    window.actRepeat = function() {
        console.log('[Spotifuck] RepeatClick');
        const repeatButton = document.querySelector('button[data-testid="control-button-repeat"]');
        if (repeatButton) repeatButton.click();
    };

    window.actAddToFav = function() {
        console.log('[Spotifuck] AddToFav');
        const favButton = document.querySelector('div[data-testid="now-playing-widget"] > div:last-child > button');
        if (favButton) {
            if (favButton.getAttribute('aria-checked') === 'false') {
                favButton.click();
            } else {
                favButton.click();
                // Handle remove from favorites flow
                const removeInterval = setInterval(() => {
                    const removeButton = document.querySelector('#context-menu button[role="menuitemcheckbox"][aria-checked="true"]');
                    if (removeButton) {
                        clearInterval(removeInterval);
                        removeButton.click();
                        setTimeout(() => {
                            const submitButton = document.querySelector('#context-menu button[type="submit"]');
                            if (submitButton) submitButton.click();
                        }, 500);
                    }
                }, 1000);
            }
        }
    };

    window.actSeek = function(position) {
        console.log('[Spotifuck] Seek to:', position);
        const progressBar = document.querySelector('div[data-testid="playback-progressbar"] input[type="range"]');
        if (progressBar) {
            progressBar.value = position;
            progressBar.dispatchEvent(new Event('change', { bubbles: true }));
        }
    };

    // ===========================================
    // AUTO-PLAY LOGIC
    // ===========================================

    function setupAutoPlayLogic() {
        if (!settings.ServiceOn) {
            console.log('[Spotifuck] Service disabled, skipping auto-play setup');
            return;
        }

        const autoPlayInterval = setInterval(() => {
            const playButton = document.querySelector('aside button[data-testid="control-button-playpause"]:not(.spotifuck-handled)');
            
            if (playButton) {
                console.log('[Spotifuck] Play button found and handled');
                playButton.classList.add('spotifuck-handled');
                playButtonElement = playButton;
                
                if (!autoFeaturesAdded) {
                    autoFeaturesAdded = true;
                    console.log('[Spotifuck] Adding auto features');
                    addAutoFeatures();
                }

                // Add click listener for unlock logic
                playButton.addEventListener('click', () => {
                    console.log('[Spotifuck] Play button clicked');
                    const isCurrentlyPlaying = playButton.getAttribute('aria-label') !== 'Play';
                    
                    if (isCurrentlyPlaying) {
                        console.log('[Spotifuck] Pause requested');
                        requestPause = true;
                        autoPlayFlag = false;
                    } else if (!autoPlayFlag) {
                        requestPause = false;
                        console.log('[Spotifuck] Adding unlocker timeout');
                        autoPlayFlag = true;
                        
                        setTimeout(() => {
                            console.log('[Spotifuck] Unlocker timeout reached');
                            const stillPaused = playButton.getAttribute('aria-label') === 'Play';
                            
                            if (autoPlayFlag && stillPaused) {
                                console.log('[Spotifuck] Unlocking via skip forward');
                                actSkipForward();
                                triggerUnlock();
                            } else if (autoPlayFlag) {
                                console.log('[Spotifuck] Playing detected, removing unlocker');
                                autoPlayFlag = false;
                            }
                        }, 10000); // 10 second timeout as in Java code
                    }
                });
            }
        }, 5000);

        console.log('[Spotifuck] Auto-play logic initialized');
    }

    function triggerUnlock() {
        const unlockInterval = setInterval(() => {
            if (playButtonElement) {
                if (playButtonElement.disabled) {
                    console.log('[Spotifuck] Button disabled, reloading page');
                    window.location.reload();
                } else if (playButtonElement.getAttribute('aria-label') !== 'Play') {
                    clearInterval(unlockInterval);
                    autoPlayFlag = false;
                    console.log('[Spotifuck] Unlock successful!');
                }
            }
        }, 3000);
    }

    function addAutoFeatures() {
        console.log('[Spotifuck] Adding auto features');
        
        // Handle different auto-play modes
        if (settings.APlayMode === 'onetime' || settings.APlayMode === 'permanent') {
            console.log(`[Spotifuck] Auto-play mode: ${settings.APlayMode}`);
            
            if (settings.APlayMode === 'onetime') {
                // One-time auto-play
                if (playButtonElement && playButtonElement.getAttribute('aria-label') === 'Play') {
                    console.log('[Spotifuck] One-time auto-play triggered');
                    playButtonElement.click();
                }
            } else if (settings.APlayMode === 'permanent') {
                // Permanent auto-play
                const permanentAutoPlayInterval = setInterval(() => {
                    if (playButtonElement && !requestPause && !autoPlayFlag && 
                        playButtonElement.getAttribute('aria-label') === 'Play') {
                        console.log('[Spotifuck] Permanent auto-play triggered');
                        playButtonElement.click();
                    }
                }, 5000);
            }
        }

        // Handle CloseNowPlay feature
        if (settings.CloseNowPlay) {
            const closeNowPlayInterval = setInterval(() => {
                const nowPlayingOverlay = document.querySelector('button[data-testid="control-button-npv"][aria-pressed="true"]');
                if (nowPlayingOverlay) {
                    console.log('[Spotifuck] Closing now playing overlay');
                    nowPlayingOverlay.click();
                }
            }, 5000);
        }

        // Handle TakeControl feature
        if (settings.TakeControl) {
            const takeControlInterval = setInterval(() => {
                const takeControlButton = document.querySelector('aside div.encore-bright-accent-set button');
                if (takeControlButton) {
                    console.log('[Spotifuck] Taking control');
                    takeControlButton.click();
                    setTimeout(() => {
                        const controlOption = document.querySelector('aside ul[role="list"] li[role="listitem"] div[role="button"]');
                        if (controlOption) controlOption.click();
                    }, 500);
                }
            }, 5000);
        }
    }

    // ===========================================
    // SIDEBAR MANAGEMENT
    // ===========================================

    function setupSidebarManagement() {
        const sidebarInterval = setInterval(() => {
            // Handle library button
            const libraryButton = document.querySelector('#Desktop_LeftSidebar_Id header > div > div:first-child button:not(.spotifuck-sidebar-handled)');
            if (libraryButton) {
                libraryButton.classList.add('spotifuck-sidebar-handled');
                libraryButton.style.padding = '0';
                libraryButton.style.height = '20px';
                libraryButton.addEventListener('click', () => setTimeout(switchLeftSidebar, 0));
                leftSidebarButton = libraryButton;
                switchLeftSidebar();
                console.log('[Spotifuck] Sidebar management initialized');
            }

            // Handle grid clicks
            const libraryGrid = document.querySelector('#Desktop_LeftSidebar_Id div[role="grid"]:not(.spotifuck-grid-handled)');
            if (libraryGrid) {
                libraryGrid.classList.add('spotifuck-grid-handled');
                libraryGrid.addEventListener('click', () => setTimeout(() => {
                    if (leftSidebarButton) leftSidebarButton.click();
                }, 0));
            }

            // Handle search input focus
            const searchInput = document.querySelector('input[data-testid="search-input"]:not(.spotifuck-search-handled)');
            if (searchInput) {
                searchInput.classList.add('spotifuck-search-handled');
                searchInput.addEventListener('focus', () => {
                    const nowPlayingBar = document.querySelector('aside[data-testid="now-playing-bar"]');
                    if (nowPlayingBar) nowPlayingBar.style.display = 'none';
                    const nowPlayingButton = document.querySelector('button[data-testid="control-button-npv"][aria-pressed="true"]');
                    if (nowPlayingButton) nowPlayingButton.click();
                });
                searchInput.addEventListener('blur', () => {
                    const nowPlayingBar = document.querySelector('aside[data-testid="now-playing-bar"]');
                    if (nowPlayingBar) nowPlayingBar.style.display = 'inherit';
                });
            }

            // Handle home button
            const homeButton = document.querySelector('#global-nav-bar button[data-testid="home-button"]:not(.spotifuck-home-handled)');
            if (homeButton) {
                homeButton.classList.add('spotifuck-home-handled');
                homeButton.addEventListener('click', () => {
                    const nowPlayingButton = document.querySelector('button[data-testid="control-button-npv"][aria-pressed="true"]');
                    if (nowPlayingButton) nowPlayingButton.click();
                });
            }
        }, 5000);
    }

    function switchLeftSidebar() {
        const leftSidebar = document.querySelector('#Desktop_LeftSidebar_Id');
        if (!leftSidebar) return;

        const navFirstChild = leftSidebar.querySelector('nav > div > div:first-child');
        if (!navFirstChild) return;

        const isExpanded = navFirstChild.classList.length === 2;
        
        if (isExpanded) {
            console.log('[Spotifuck] Sidebar expanded');
            leftSidebar.style.position = 'fixed';
            leftSidebar.style.width = '100%';
            leftSidebar.style.height = '92%';
            leftSidebar.style.left = '0';
            leftSidebar.style.zIndex = '20';
            
            const libraryHeader = leftSidebar.querySelector('header > div > div:first-child h1');
            if (libraryHeader) libraryHeader.innerText = '✖ Library';
        } else {
            console.log('[Spotifuck] Sidebar collapsed');
            leftSidebar.style.zIndex = '1';
            leftSidebar.style.position = 'fixed';
            leftSidebar.style.top = '2px';
            leftSidebar.style.left = '60px';
            leftSidebar.style.width = '50px';
            leftSidebar.style.height = '40px';
        }
    }

    // ===========================================
    // STATUS MONITORING
    // ===========================================

    function setupStatusMonitoring() {
        if (!settings.AndAuto) {
            console.log('[Spotifuck] Android Auto disabled, skipping status monitoring');
            return;
        }

        let lastState = null;
        let lastPosition = null;
        
        const statusInterval = setInterval(() => {
            // Get track info
            const trackElement = document.querySelector('a[data-testid="context-item-link"]');
            const track = trackElement ? trackElement.textContent : null;
            
            const artistElement = document.querySelector('a[data-testid="context-item-info-artist"]');
            const artist = artistElement ? artistElement.textContent : null;
            
            // Get playback state
            const isPlaying = playButtonElement && playButtonElement.getAttribute('aria-label') !== 'Play';
            
            // Get repeat state
            const repeatButton = document.querySelector('button[data-testid="control-button-repeat"]');
            const repeatState = repeatButton ? repeatButton.getAttribute('aria-checked') : 'false';
            
            // Get favorite state
            const favButton = document.querySelector('div[data-testid="now-playing-widget"] > div:last-child > button');
            const isFavorite = favButton && favButton.getAttribute('aria-checked') === 'true';
            
            // Get position and duration
            const progressBar = document.querySelector('div[data-testid="playback-progressbar"] input[type="range"]');
            const duration = progressBar ? parseInt(progressBar.getAttribute('max')) : null;
            const position = progressBar ? parseInt(progressBar.value) : null;
            
            // Get cover art
            const coverElement = document.querySelector('img[data-testid="cover-art-image"]');
            const coverUrl = coverElement ? coverElement.src : null;
            
            // Create state string for change detection
            const currentState = `${track}|${artist}|${isPlaying}|${repeatState}|${isFavorite}`;
            
            // Report state changes
            if (currentState !== lastState) {
                lastState = currentState;
                const statusData = {
                    artist: artist,
                    track: track,
                    playing: isPlaying,
                    repeat: repeatState,
                    favorite: isFavorite,
                    duration: duration,
                    position: position,
                    cover: coverUrl
                };
                console.log('[Spotifuck] Player Status:', JSON.stringify(statusData));
            }
            
            // Report position changes
            if (position !== null && lastPosition !== null && Math.abs(position - lastPosition) > 4000) {
                console.log('[Spotifuck] Track Position:', position);
            }
            lastPosition = position;
            
        }, 2000);

        console.log('[Spotifuck] Status monitoring enabled');
    }

    // ===========================================
    // MEDIA LIBRARY BUILDING
    // ===========================================

    window.mediaBuildPlay = function(index = -1) {
        if (!leftSidebarButton || !leftSidebarButton.querySelector(':scope > h1')) {
            if (leftSidebarButton) leftSidebarButton.click();
        }
        
        const mediaInterval = setInterval(() => {
            const mediaItems = document.querySelectorAll('div[role="grid"] div[role="gridcell"] > div button');
            if (mediaItems.length > 0) {
                clearInterval(mediaInterval);
                console.log('[Spotifuck] Building media library');
                
                const libraryItems = document.querySelectorAll('div[role="grid"] div[role="gridcell"] > div');
                const titles = [], kinds = [], images = [], buttons = [];
                
                Array.from(libraryItems).forEach(node => {
                    const img = node.querySelector('img');
                    const btn = node.querySelector('button');
                    if (img && btn) {
                        titles.push(img.alt);
                        
                        const kindAttr = node.getAttribute('aria-labelledby');
                        if (kindAttr) {
                            const match = kindAttr.match(/listrow-title-spotify:([^:]+):/);
                            if (match) {
                                const kind = match[1].charAt(0).toUpperCase() + match[1].slice(1);
                                kinds.push(kind.replace('Collection', 'Playlist'));
                            } else {
                                kinds.push('-');
                            }
                        } else {
                            kinds.push('-');
                        }
                        
                        images.push(img.src);
                        buttons.push(btn);
                    }
                });
                
                window.mediaInfo = { titles, kinds, images };
                console.log('[Spotifuck] Media info built:', window.mediaInfo);
                
                if (index === -1) {
                    if (leftSidebarButton) leftSidebarButton.click();
                } else if (buttons[index]) {
                    buttons[index].click();
                }
            }
        }, 500);
    };

    // ===========================================
    // LOGIN DETECTION
    // ===========================================

    function setupLoginDetection() {
        const loginInterval = setInterval(() => {
            const webPlayerLink = document.querySelector('button[data-testid="web-player-link"]');
            if (webPlayerLink) {
                console.log('[Spotifuck] Login detected, clicking web player link');
                settings.LoggedIn = true;
                GM_setValue('LoggedIn', true);
                webPlayerLink.click();
            }
        }, 2000);
    }

    // ===========================================
    // INITIALIZATION
    // ===========================================

    function initializeSpotifuck() {
        console.log('[Spotifuck] v4.0.0 initializing...');
        console.log('[Spotifuck] Settings:', settings);

        // Register settings menu
        registerSettingsMenu();

        // Handle Facebook consent if on Facebook
        if (window.location.hostname.includes('facebook.com')) {
            handleFacebookConsent();
            return; // Don't run Spotify-specific features on Facebook
        }

        // Only run on Spotify
        if (!window.location.hostname.includes('spotify.com')) {
            return;
        }

        // Apply CSS hacks
        applyCssHacks();

        // Setup audio ad blocking
        setupAudioAdBlocking();

        // Wait for page to load before setting up features
        const initInterval = setInterval(() => {
            const spotifyElements = document.querySelector('#Desktop_LeftSidebar_Id') || 
                                  document.querySelector('button[data-testid="web-player-link"]');
            
            if (spotifyElements) {
                clearInterval(initInterval);
                
                // Initialize core features
                setupAutoPlayLogic();
                setupSidebarManagement();
                setupStatusMonitoring();
                setupLoginDetection();
                
                console.log('[Spotifuck] Initialization complete');
            }
        }, 1000);

        // Continue running periodic checks
        setInterval(() => {
            if (settings.ServiceOn) {
                setupSidebarManagement();
            }
        }, 10000);
    }

    // Start initialization
    if (document.readyState === 'loading') {
        document.addEventListener('DOMContentLoaded', initializeSpotifuck);
    } else {
        initializeSpotifuck();
    }

})();
