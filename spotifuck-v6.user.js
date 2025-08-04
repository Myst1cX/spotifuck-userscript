// ==UserScript==
// @name         Spotifuck Userscript v6
// @namespace    https://github.com/Myst1cX/spotifuck-userscript
// @version      6.0.0
// @description  Advanced Spotifuck port with enhanced maintainability: UI hacks, auto-play, controls, consent automation, ad blocking with latest reverse-engineered features
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
// @updateURL    https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-v6.user.js
// @downloadURL  https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-v6.user.js
// ==/UserScript==

(function() {
    'use strict';

    // ===============
    // SETTINGS SYSTEM
    // ===============

    // Default settings matching latest Java AppSingleton initialization
    const defaultSettings = {
        ServiceOn: true,
        LoggedIn: false,
        APlayMode: "disabled", // "disabled", "onetime", "permanent"
        TakeControl: true,
        GuiMode: "csshack", // "csshack", "minimal", "disabled"
        AndAuto: true,
        SwipeStop: true,    // Updated from Java: default true
        AutoSleep: 0,       // Added from Java: auto-sleep timer
        ForceEn: true      // Added from Java: force English
    };

    // Load settings from userscript manager storage
    let settings = {};
    for (const [key, defaultValue] of Object.entries(defaultSettings)) {
        settings[key] = GM_getValue(key, defaultValue);
    }

    // Settings menu commands using userscript manager's built-in UI
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

        GM_registerMenuCommand(`💤 Auto Sleep: ${settings.AutoSleep}min`, () => {
            cycleSetting('AutoSleep', [0, 5, 10, 15, 30, 60]);
        });

        GM_registerMenuCommand(`🌐 Force English: ${settings.ForceEn ? 'ON' : 'OFF'}`, () => {
            toggleSetting('ForceEn');
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
🎮 Take Control: ${settings.TakeControl ? 'ON' : 'OFF'}
🎨 GUI Mode: ${settings.GuiMode}
🤖 Android Auto: ${settings.AndAuto ? 'ON' : 'OFF'}
👆 Swipe Stop: ${settings.SwipeStop ? 'ON' : 'OFF'}
💤 Auto Sleep: ${settings.AutoSleep} minutes
🌐 Force English: ${settings.ForceEn ? 'ON' : 'OFF'}
━━━━━━━━━━━━━━━━━━━━━━━━━━━━

Use individual menu commands to toggle settings.
Changes require page reload to take effect.`;
        alert(dialog);
    }

    // ===========================================
    // CLIENT SPOOFING (Early Execution)
    // ===========================================

    // Enhanced browser spoofing based on latest reverse engineering
    const clientSpoofScript = `
        (function() {
            // Screen properties spoofing - consistent desktop resolution
            Object.defineProperty(window.screen, 'width', {get: () => 1920, configurable: true});
            Object.defineProperty(window.screen, 'height', {get: () => 1080, configurable: true});
            Object.defineProperty(window.screen, 'availWidth', {get: () => 1920, configurable: true});
            Object.defineProperty(window.screen, 'availHeight', {get: () => 1040, configurable: true});

            // Window properties spoofing
            Object.defineProperty(window, 'innerWidth', {get: () => 1920, configurable: true});
            Object.defineProperty(window, 'innerHeight', {get: () => 978, configurable: true});

            // Navigator properties spoofing - Chrome desktop simulation
            Object.defineProperty(window.navigator, 'vendor', {get: () => 'Google Inc.', configurable: true});
            Object.defineProperty(window.navigator, 'productSub', {get: () => '20030107', configurable: true});
            Object.defineProperty(window.navigator, 'platform', {get: () => 'Win32', configurable: true});
            Object.defineProperty(window.navigator, 'oscpu', {get: () => 'Windows NT 10.0; Win64; x64', configurable: true});

            console.log('[Spotifuck] Enhanced client spoofing applied');
        })();
    `;

    // Inject spoofing script immediately for early execution
    const spoofScriptElement = document.createElement('script');
    spoofScriptElement.textContent = clientSpoofScript;
    (document.head || document.documentElement).appendChild(spoofScriptElement);
    spoofScriptElement.remove();

    // ===========================
    // FACEBOOK CONSENT AUTOMATION
    // ===========================

    function handleFacebookConsentAutomation() {
        if (window.location.href.startsWith('https://www.facebook.com/privacy/consent/gdp/')) {
            console.log('[Spotifuck] Facebook consent page detected, auto-clicking consent button...');

            // Wait for page to load then click consent button
            setTimeout(() => {
                const facebookConsentButton = document.querySelector('#facebook div[role=button]');
                if (facebookConsentButton) {
                    console.log('[Spotifuck] Clicking Facebook consent button');
                    facebookConsentButton.click();
                } else {
                    console.log('[Spotifuck] Facebook consent button not found, trying alternative selectors...');
                    // Try alternative consent button selectors
                    const alternativeSelectors = [
                        'button[data-testid="accept-button"]',
                        'button[data-testid="cookie-policy-manage-dialog-accept-button"]',
                        'div[role="button"]:contains("Accept")',
                        'button:contains("Accept")',
                        'div[role="button"]:contains("Agree")',
                        'button:contains("Agree")'
                    ];

                    for (const selector of alternativeSelectors) {
                        const alternativeButton = document.querySelector(selector);
                        if (alternativeButton) {
                            console.log(`[Spotifuck] Found consent button with selector: ${selector}`);
                            alternativeButton.click();
                            break;
                        }
                    }
                }
            }, 1000);
        }
    }

    // ========================
    // SILENT AUDIO AD BLOCKING
    // ========================

    function setupEnhancedAudioAdBlocking() {
        // Create silent audio blob for ad replacement
        const silentAudioData = new Uint8Array([
            0x52, 0x49, 0x46, 0x46, 0x24, 0x00, 0x00, 0x00, 0x57, 0x41, 0x56, 0x45, 0x66, 0x6D, 0x74, 0x20,
            0x10, 0x00, 0x00, 0x00, 0x01, 0x00, 0x01, 0x00, 0x44, 0xAC, 0x00, 0x00, 0x88, 0x58, 0x01, 0x00,
            0x02, 0x00, 0x10, 0x00, 0x64, 0x61, 0x74, 0x61, 0x00, 0x00, 0x00, 0x00
        ]);
        const silentAudioBlob = new Blob([silentAudioData], { type: 'audio/wav' });
        const silentAudioUrl = URL.createObjectURL(silentAudioBlob);

        // Enhanced ad domain detection based on reverse engineering
        const adDomains = [
            'doubleclick.net',
            'googlesyndication.com',
            'fastly-insights.com',
            'sentry.io',
            'amillionads.com',
            '2mdn.net',
            'adxcel.com',
            'adstudio-assets.scdn.co'
        ];

        // Enhanced audio ad pattern detection
        const audioAdPatterns = [
            'scdn.co/mp3-ad/',
            'audio/mpeg',
            'ads',
            'advertising',
            'doubleclick',
            'googlesyndication'
        ];

        // Intercept fetch requests for ad blocking
        const originalFetch = window.fetch;
        window.fetch = function(resource, init) {
            const url = (typeof resource === 'string') ? resource : resource.url;

            // Enhanced ad detection logic
            if (url && (
                adDomains.some(domain => url.includes(domain)) ||
                (url.includes('audio/mpeg') && audioAdPatterns.some(pattern => url.includes(pattern)) &&
                 !url.includes('podz-content') && !url.includes('gew4-spclient') &&
                 !url.includes('akamaized.net/audio/') && !url.includes('scdn.co/audio/') &&
                 !url.includes('spotifycdn.com/audio/'))
            )) {
                console.log('[Spotifuck] Blocking audio ad request:', url);
                return Promise.resolve(new Response(silentAudioBlob, {
                    status: 200,
                    statusText: 'OK',
                    headers: {
                        'Content-Type': 'audio/wav',
                        'Access-Control-Allow-Origin': '*'
                    }
                }));
            }

            return originalFetch.apply(this, arguments);
        };

        // Enhanced XMLHttpRequest interception for ad blocking
        const originalXHROpen = XMLHttpRequest.prototype.open;
        XMLHttpRequest.prototype.open = function(method, url, ...args) {
            if (url && adDomains.some(domain => url.includes(domain))) {
                console.log('[Spotifuck] Blocking XHR ad request:', url);
                // Replace with silent audio URL
                url = silentAudioUrl;
            }
            return originalXHROpen.call(this, method, url, ...args);
        };

        console.log('[Spotifuck] Enhanced audio ad blocking enabled');
    }

    // ========================================
    // NOW PLAYING VIEW REMOVAL (Commented Out)
    // ========================================

    /*

    function hideNowPlayingView() {
        const nowPlayingStyleId = 'spotifuck-hide-npv-style';
        if (!document.getElementById(nowPlayingStyleId)) {
            const nowPlayingStyle = document.createElement('style');
            nowPlayingStyle.id = nowPlayingStyleId;
            nowPlayingStyle.textContent = `
                .NowPlayingView,
                .OTfMDdomT5S7B5dbYTT8:has(.NowPlayingView) {
                    width: 0 !important;
                    display: none !important;
                }
                [data-testid=control-button-npv] {
                    display: none !important;
                }
            `;
            document.head.appendChild(nowPlayingStyle);
            console.log('[Spotifuck] NowPlaying view hidden');
        }
    }
    */

    // ==========================
    // PLAYBACK CONTROL INJECTION
    // ==========================

    // Simple, reliable playback control functions from v4
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

    window.actSeek = function(position) {
        const playbackProgressBar = document.querySelector('div[data-testid=playback-progressbar] input[type=range]');
        if (!playbackProgressBar) return;
        playbackProgressBar.value = position;
        playbackProgressBar.dispatchEvent(new Event('change', { bubbles: true }));
    };

    // Enhanced control functions based on latest reverse engineering
    window.actRepeat = function() {
        console.log('[Spotifuck] RepeatClick');
        const repeatButton = document.querySelector('button[data-testid=control-button-repeat]');
        if (repeatButton) repeatButton.click();
    };

    window.actAddToFav = function() {
        console.log('[Spotifuck] AddToFav');
        const favoriteButton = document.querySelector('div[data-testid=now-playing-widget] > div:last-child > button');
        if (favoriteButton) {
            if (favoriteButton.getAttribute('aria-checked') === 'false') {
                favoriteButton.click();
            } else {
                favoriteButton.click();
                // Handle remove from favorites flow
                const removeFromFavoritesInterval = setInterval(() => {
                    const removeButton = document.querySelector('#context-menu button[role=menuitemcheckbox][aria-checked=true]');
                    if (removeButton) {
                        clearInterval(removeFromFavoritesInterval);
                        removeButton.click();
                        setTimeout(() => {
                            const submitButton = document.querySelector('#context-menu button[type=submit]');
                            if (submitButton) submitButton.click();
                        }, 500);
                    }
                }, 1000);
            }
        }
    };

    // ============
    // CSS UI HACKS
    // ============

    function applyEnhancedCssHacks() {
        if (settings.GuiMode !== 'csshack') {
            console.log('[Spotifuck] CSS hacks disabled via settings');
            return;
        }

        // Enhanced CSS based on latest reverse engineering from R0.e.java
        const enhancedCssHacks = `
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

        GM_addStyle(enhancedCssHacks);
        console.log('[Spotifuck] Enhanced CSS UI hacks applied');
    }

    // ========================
    // ENHANCED AUTO-PLAY LOGIC
    // ========================

    let playButtonElement = null;
    let leftSidebarButton = null;
    let autoFeaturesAdded = false;
    let requestPause = false;
    let autoPlayFlag = false;
    let firstPlay = true;

    function setupEnhancedAutoPlayLogic() {
        if (!settings.ServiceOn) {
            console.log('[Spotifuck] Service disabled, skipping auto-play setup');
            return;
        }

        const playButtonDetectionInterval = setInterval(() => {
            const playButton = document.querySelector('aside button[data-testid="control-button-playpause"]:not(.spotifuck-handled)');

            if (playButton) {
                console.log('[Spotifuck] Play button found and configured');
                playButton.classList.add('spotifuck-handled');
                playButtonElement = playButton;

                if (!autoFeaturesAdded) {
                    autoFeaturesAdded = true;
                    console.log('[Spotifuck] Adding enhanced auto features');
                    addEnhancedAutoFeatures();
                }

                // Enhanced click listener with unlock logic from reverse engineering
                playButton.addEventListener('click', () => {
                    console.log('[Spotifuck] Play button clicked');
                    const isCurrentlyPlaying = playButton.getAttribute('aria-label') !== 'Play';

                    if (isCurrentlyPlaying) {
                        console.log('[Spotifuck] Pause requested');
                        requestPause = true;
                        autoPlayFlag = false;
                    } else if (!autoPlayFlag) {
                        requestPause = false;
                        console.log('[Spotifuck] Adding unlock mechanism');
                        autoPlayFlag = true;

                        // Enhanced unlock timeout from reverse engineering (10 seconds)
                        setTimeout(() => {
                            console.log('[Spotifuck] Unlock timeout reached');
                            const stillPaused = playButton.getAttribute('aria-label') === 'Play';

                            if (autoPlayFlag && stillPaused) {
                                console.log('[Spotifuck] Unlocking via skip forward');
                                actSkipForward();
                                triggerUnlockSequence();
                            } else if (autoPlayFlag) {
                                console.log('[Spotifuck] Playing detected, removing unlock flag');
                                autoPlayFlag = false;
                            }
                        }, 10000); // 10 second timeout as in Java code
                    }
                });
            }
        }, 5000);

        console.log('[Spotifuck] Enhanced auto-play logic initialized');
    }

    function triggerUnlockSequence() {
        const unlockCheckInterval = setInterval(() => {
            if (playButtonElement) {
                if (playButtonElement.disabled) {
                    console.log('[Spotifuck] Button disabled, reloading page');
                    window.location.reload();
                } else if (playButtonElement.getAttribute('aria-label') !== 'Play') {
                    clearInterval(unlockCheckInterval);
                    autoPlayFlag = false;
                    console.log('[Spotifuck] Unlock successful!');
                }
            }
        }, 3000);
    }

    function addEnhancedAutoFeatures() {
        console.log('[Spotifuck] Adding enhanced auto features');

        // Enhanced auto-play modes based on latest reverse engineering
        if (settings.APlayMode === 'onetime' || settings.APlayMode === 'permanent') {
            console.log(`[Spotifuck] Auto-play mode: ${settings.APlayMode}`);

            if (settings.APlayMode === 'onetime') {
                // One-time auto-play
                if (playButtonElement && firstPlay && playButtonElement.getAttribute('aria-label') === 'Play') {
                    console.log('[Spotifuck] One-time auto-play triggered');
                    playButtonElement.click();
                    firstPlay = false;
                }
            } else if (settings.APlayMode === 'permanent') {
                // Permanent auto-play with enhanced logic
                const permanentAutoPlayInterval = setInterval(() => {
                    if (playButtonElement && !requestPause && !autoPlayFlag &&
                        playButtonElement.getAttribute('aria-label') === 'Play') {
                        console.log('[Spotifuck] Permanent auto-play triggered');
                        playButtonElement.click();
                    }
                }, 5000);
            }
        }

        // Enhanced TakeControl feature with improved selectors
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

    // ===========================
    // ENHANCED SIDEBAR MANAGEMENT
    // ===========================

    function setupEnhancedSidebarManagement() {
        const sidebarManagementInterval = setInterval(() => {
            // Enhanced library button handling
            const libraryButton = document.querySelector('#Desktop_LeftSidebar_Id header > div > div:first-child button:not(.spotifuck-sidebar-handled)');
            if (libraryButton) {
                libraryButton.classList.add('spotifuck-sidebar-handled', 'spotifuck-library-button');
                libraryButton.style.padding = '0';
                libraryButton.style.height = '20px';
                libraryButton.addEventListener('click', () => setTimeout(switchLeftSidebar, 0));
                leftSidebarButton = libraryButton;
                switchLeftSidebar();
                console.log('[Spotifuck] Enhanced sidebar management initialized');
            }

            // Enhanced grid click handling
            const libraryGrid = document.querySelector('#Desktop_LeftSidebar_Id div[role="grid"]:not(.spotifuck-grid-handled)');
            if (libraryGrid) {
                libraryGrid.classList.add('spotifuck-grid-handled');
                libraryGrid.addEventListener('click', () => setTimeout(() => {
                    console.log('[Spotifuck] Auto-closing library on grid click');
                    if (leftSidebarButton) leftSidebarButton.click();
                }, 0));
            }

            // Enhanced search input handling
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
                    if (nowPlayingBar) nowPlayingBar.style.display = 'flex';
                });
            }

            // Enhanced home button handling
            const homeButton = document.querySelector('#global-nav-bar button[data-testid="home-button"]:not(.spotifuck-home-handled)');
            if (homeButton) {
                homeButton.classList.add('spotifuck-home-handled');
                homeButton.addEventListener('click', () => {
                    const nowPlayingButton = document.querySelector('button[data-testid="control-button-npv"][aria-pressed="true"]');
                    if (nowPlayingButton) nowPlayingButton.click();
                });
            }

            // Enhanced user widget handling
            const userWidget = document.querySelector('button[data-testid="user-widget-link"]:not(.spotifuck-user-handled)');
            if (userWidget) {
                userWidget.classList.add('spotifuck-user-handled');
                userWidget.addEventListener('click', () => {
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

    // ==========================
    // ENHANCED STATUS MONITORING
    // ==========================

    function setupEnhancedStatusMonitoring() {
        if (!settings.AndAuto) {
            console.log('[Spotifuck] Android Auto disabled, skipping status monitoring');
            return;
        }

        let lastState = null;
        let lastPosition = null;

        const statusMonitoringInterval = setInterval(() => {
            // Enhanced track info gathering
            const trackLinkElement = document.querySelector('a[data-testid="context-item-link"]');
            const track = trackLinkElement ? trackLinkElement.textContent : null;

            let artistElement = document.querySelector('a[data-testid="context-item-info-artist"]');
            if (!artistElement) {
                // Fallback to show element for podcasts
                artistElement = document.querySelector('a[data-testid="context-item-info-show"]');
            }
            const artist = artistElement ? artistElement.textContent : '';

            // Enhanced playback state detection
            const isPlaying = playButtonElement && playButtonElement.getAttribute('aria-label') !== 'Play';

            // Enhanced repeat state detection
            const repeatButton = document.querySelector('button[data-testid="control-button-repeat"]');
            const repeatState = repeatButton ? repeatButton.getAttribute('aria-checked') : 'false';

            // Enhanced favorite state detection
            const favoriteButton = document.querySelector('div[data-testid="now-playing-widget"] > div:last-child > button');
            const isFavorite = favoriteButton && favoriteButton.getAttribute('aria-checked') === 'true';

            // Enhanced position and duration detection
            const progressBar = document.querySelector('div[data-testid="playback-progressbar"] input[type="range"]');
            const duration = progressBar ? parseInt(progressBar.getAttribute('max')) : null;
            const position = progressBar ? parseInt(progressBar.value) : null;

            // Enhanced cover art detection
            const coverElement = document.querySelector('img[data-testid="cover-art-image"]');
            const coverUrl = coverElement ? coverElement.src : null;

            // Create state string for change detection
            const currentState = `${track}|${artist}|${isPlaying}|${repeatState}|${isFavorite}`;

            // Report state changes (simulate AndBridge.recMediaStatus)
            if (currentState !== lastState) {
                lastState = currentState;
                const statusData = {
                    artist: artist,
                    track: track,
                    playing: isPlaying,
                    repeat: repeatState,
                    fav: isFavorite,
                    duration: duration,
                    position: position,
                    cover: coverUrl
                };
                console.log('[Spotifuck] Enhanced Player Status:', JSON.stringify(statusData));

                /*
                NOTE: In userscript context, we cannot call AndBridge.recMediaStatus
                This would require a native Android bridge which is not available
                The status is logged to console for debugging and potential automation
                */
            }

            // Report significant position changes (simulate AndBridge.recMediaPosition)
            if (position !== null && lastPosition !== null && Math.abs(position - lastPosition) > 4000) {
                console.log('[Spotifuck] Enhanced Track Position:', position);
                /* NOTE: AndBridge.recMediaPosition not available in userscript context */
            }
            lastPosition = position;

        }, 2000);

        console.log('[Spotifuck] Enhanced status monitoring enabled');
    }

    // ===============================
    // ENHANCED MEDIA LIBRARY BUILDING
    // ===============================

    window.mediaBuildPlay = function(index = -1) {
        /*
        NOTE: Enhanced media library building function
        This simulates the Android app's media library building functionality
        */
        if (!leftSidebarButton || !leftSidebarButton.querySelector(':scope > h1')) {
            if (leftSidebarButton) leftSidebarButton.click();
        }

        const mediaLibraryBuildInterval = setInterval(() => {
            const mediaItems = document.querySelectorAll('div[role="grid"] div[role="gridcell"] > div button');
            if (mediaItems.length > 0) {
                clearInterval(mediaLibraryBuildInterval);
                console.log('[Spotifuck] Building enhanced media library');

                const libraryItems = document.querySelectorAll('div[role="grid"] div[role="gridcell"] > div');
                const titles = [], kinds = [], images = [], buttons = [];

                Array.from(libraryItems).forEach(node => {
                    const img = node.querySelector('img');
                    const btn = node.querySelector('button');
                    if (img && btn) {
                        titles.push(img.alt);

                        // Enhanced kind detection with better parsing
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

                // Enhanced media info object
                window.mediaInfo = { titles, kinds, images };
                console.log('[Spotifuck] Enhanced media info built:', window.mediaInfo);

                if (index === -1) {
                    if (leftSidebarButton) leftSidebarButton.click();
                } else if (buttons[index]) {
                    buttons[index].click();
                }
            }
        }, 500);
    };

    // ========================
    // ENHANCED LOGIN DETECTION
    // ========================

    function setupEnhancedLoginDetection() {
        const loginDetectionInterval = setInterval(() => {
            const webPlayerLink = document.querySelector('button[data-testid="web-player-link"]');
            if (webPlayerLink) {
                console.log('[Spotifuck] Login detected, clicking web player link');
                settings.LoggedIn = true;
                GM_setValue('LoggedIn', true);
                webPlayerLink.click();
                /* NOTE: AndBridge.loginDetected() not available in userscript context */
            }
        }, 2000);
    }

    // ===========================
    // ENHANCED FETCH INTERCEPTION
    // ===========================

    function setupEnhancedFetchInterception() {
        /*
        NOTE: Enhanced fetch interception based on latest reverse engineering
        This provides better tracking of player state and unlock mechanisms
        */
        const originalFetch = window.fetch;
        window.fetch = async function(...args) {
            const [url, opts] = args;
            const method = opts?.method?.toUpperCase?.() || 'GET';

            // Enhanced track playback monitoring
            if (url.includes('/track-playback/') && method === 'PUT') {
                const paused = opts?.body ? JSON.parse(opts?.body)?.state_ref?.paused : undefined;
                if (paused && playButtonElement && playButtonElement.getAttribute('aria-label') !== 'Play') {
                    console.log('[Spotifuck] Track-Playback: Pause detected');
                } else if (!paused && playButtonElement && playButtonElement.getAttribute('aria-label') === 'Play') {
                    console.log('[Spotifuck] Track-Playback: Play detected');
                }
            }

            try {
                const response = await originalFetch(url, opts);

                // Enhanced player lock detection
                if (response.status === 404 && url.includes('connect-state') && url.includes('/command/from/')) {
                    console.log('[Spotifuck] Player locked detected, reload required');
                    /* NOTE: AndBridge.deferMessage('reload') not available in userscript context */
                    location.reload();
                }

                return response;
            } catch (error) {
                console.error('[Spotifuck] Error in fetch request:', error);
                throw error;
            }
        };

        console.log('[Spotifuck] Enhanced fetch interception enabled');
    }

    // ==============
    // INITIALIZATION
    // ==============

    function initializeSpotifuckV6() {
        console.log('[Spotifuck] v6.0.0 initializing with enhanced features...');
        console.log('[Spotifuck] Settings:', settings);

        // Register enhanced settings menu
        registerSettingsMenu();

        // Handle Facebook consent if on Facebook
        if (window.location.hostname.includes('facebook.com')) {
            handleFacebookConsentAutomation();
            return; // Don't run Spotify-specific features on Facebook
        }

        // Only run on Spotify
        if (!window.location.hostname.includes('spotify.com')) {
            return;
        }

        // Apply enhanced CSS hacks
        applyEnhancedCssHacks();

        // Setup enhanced audio ad blocking
        setupEnhancedAudioAdBlocking();

        // Setup enhanced fetch interception
        setupEnhancedFetchInterception();

        // Wait for page to load before setting up enhanced features
        const initializationInterval = setInterval(() => {
            const spotifyElements = document.querySelector('#Desktop_LeftSidebar_Id') ||
                                  document.querySelector('button[data-testid="web-player-link"]');

            if (spotifyElements) {
                clearInterval(initializationInterval);

                // Initialize enhanced core features
                setupEnhancedAutoPlayLogic();
                setupEnhancedSidebarManagement();
                setupEnhancedStatusMonitoring();
                setupEnhancedLoginDetection();

                console.log('[Spotifuck] Enhanced v6 initialization complete');
            }
        }, 1000);

        // Continue running periodic checks for dynamic content
        setInterval(() => {
            if (settings.ServiceOn) {
                setupEnhancedSidebarManagement();
            }
        }, 10000);
    }

    // Start enhanced initialization
    if (document.readyState === 'loading') {
        document.addEventListener('DOMContentLoaded', initializeSpotifuckV6);
    } else {
        initializeSpotifuckV6();
    }

})();
