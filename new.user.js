// ==UserScript==
// @name         Spotifuck - Complete Spotify Web Player Enhancement
// @namespace    https://github.com/Myst1cX/spotifuck-userscript
// @version      5.0.0
// @description  Complete port of Spotifuck Android app 1.5.0 functionality - UI enhancements, ad blocking, playback controls, client spoofing, and Facebook consent automation
// @author       Myst1cX (ported from Spotifuck Android app 1.5.0)
// @match        https://open.spotify.com/*
// @match        https://www.facebook.com/privacy/consent/gdp/*
// @match        https://www.facebook.com/tr*
// @match        https://www.facebook.com/dialog*
// @match        https://*.facebook.com/*/consent*
// @grant        GM_addStyle
// @run-at       document-start
// @homepageURL  https://github.com/Myst1cX/spotifuck-userscript
// @supportURL   https://github.com/Myst1cX/spotifuck-userscript/issues
// @updateURL    https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/new.user.js
// @downloadURL  https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/new.user.js
// ==/UserScript==

/**
 * SPOTIFUCK USERSCRIPT v5.0.0
 * 
 * Complete port of Spotifuck Android app 1.5.0 functionality to desktop browsers.
 * This userscript replicates all JavaScript and CSS logic from the Android app,
 * targeting open.spotify.com and Facebook consent pages for maximum feature parity.
 * 
 * All features are enabled by default with no configuration required.
 * Variable names use clear, descriptive naming for maintainability.
 * 
 * Features ported from Android app:
 * - Client Spoofing: Desktop environment simulation
 * - UI/UX Enhancements: Complete mobile-friendly interface modifications  
 * - Silent Ad Blocking: DOM-based ad muting and request interception
 * - Playback Controls: All programmatic player control functions
 * - Facebook Consent Automation: Automatic GDPR consent handling
 * - Autoplay Logic: Immediate and permanent autoplay modes
 * - Sidebar Management: Enhanced navigation with responsive behavior
 * - Search Interface: Improved search focus handling
 * - Status Monitoring: Track playback monitoring (console logging only)
 * - CSS Hacks: All visual enhancements and layout modifications
 */

(function() {
    'use strict';
    
    // ===========================
    // CONSTANTS AND CONFIGURATION
    // ===========================
    
    const SCRIPT_NAME = '[Spotifuck]';
    const VERSION = '5.0.0';
    
    // Timing constants
    const STATUS_UPDATE_INTERVAL = 2000; // Status monitoring interval (ms)
    const UI_INJECTION_INTERVAL = 5000; // UI fix re-injection interval (ms)
    const AUTOPLAY_CHECK_INTERVAL = 5000; // Autoplay detection interval (ms)
    const INITIALIZATION_RETRY_INTERVAL = 1000; // Initialization retry interval (ms)
    const CSS_INJECTION_INTERVAL = 5000; // CSS re-injection interval (ms)
    
    // Spotify element selectors (descriptive naming for maintainability)
    const SPOTIFY_SELECTORS = {
        // Playback controls
        playPauseButton: 'aside button[data-testid="control-button-playpause"]',
        skipBackButton: 'button[data-testid="control-button-skip-back"]',
        skipForwardButton: 'button[data-testid="control-button-skip-forward"]',
        repeatButton: 'button[data-testid="control-button-repeat"]',
        playbackProgressBar: 'div[data-testid="playback-progressbar"] input[type="range"]',
        generalControlsContainer: 'div[data-testid="general-controls"]',
        playerControlsContainer: 'div[data-testid="player-controls"]',
        
        // UI layout elements
        nowPlayingBar: 'aside[data-testid="now-playing-bar"]',
        nowPlayingWidget: 'div[data-testid="now-playing-widget"]',
        leftSidebar: '#Desktop_LeftSidebar_Id',
        globalNavigationBar: '#global-nav-bar',
        searchInput: 'input[data-testid="search-input"]',
        nowPlayingViewButton: 'button[data-testid="control-button-npv"]',
        fullscreenButton: 'button[data-testid="fullscreen-mode-button"]',
        homeButton: 'button[data-testid="home-button"]',
        
        // Content elements
        trackTitleLink: 'a[data-testid="context-item-link"]',
        artistNameLink: 'a[data-testid="context-item-info-artist"]',
        albumCoverImage: 'img[data-testid="cover-art-image"]',
        trackListContainer: 'div[data-testid="track-list"]',
        favoriteButton: 'div[data-testid="now-playing-widget"] > div:last-child > button',
        
        // Layout structure
        rootContainer: 'div[data-testid="root"]',
        mainViewContainer: '#main-view',
        contentSpacingContainer: 'div.contentSpacing',
        footerContainer: 'div.main-view-container__mh-footer-container'
    };
    
    // Facebook consent selectors
    const FACEBOOK_SELECTORS = {
        consentButton: '#facebook div[role="button"]',
        acceptButton: 'button[data-testid="cookie-policy-manage-dialog-accept-button"]',
        allowButton: 'button[aria-label*="Accept"], button[aria-label*="Allow"]'
    };
    
    // ===========================
    // CLIENT SPOOFING SYSTEM
    // ===========================
    
    /**
     * Spoofs browser and device properties to simulate desktop environment
     * Replicates the exact spoofing logic from Android app onPageStarted method
     */
    function injectDesktopClientSpoofing() {
        const spoofingScript = `
            (function() {
                // Screen dimension spoofing - exactly as in Android app
                window.screen.__defineGetter__('width', function() { return 1920; });
                window.screen.__defineGetter__('height', function() { return 1080; });
                window.screen.__defineGetter__('availWidth', function() { return 1920; });
                window.screen.__defineGetter__('availHeight', function() { return 1040; });
                
                // Window dimension spoofing
                window.__defineGetter__('innerWidth', function() { return 1920; });
                window.__defineGetter__('innerHeight', function() { return 978; });
                
                // Navigator properties spoofing - exactly as in Android app
                window.navigator.__defineGetter__('vendor', function() { return 'Google Inc.'; });
                window.navigator.__defineGetter__('productSub', function() { return '20030107'; });
                window.navigator.__defineGetter__('platform', function() { return 'Win32'; });
                window.navigator.__defineGetter__('oscpu', function() { return 'null'; });
                
                console.log('${SCRIPT_NAME} Desktop client spoofing applied');
            })();
        `;
        
        const scriptElement = document.createElement('script');
        scriptElement.textContent = spoofingScript;
        document.documentElement.appendChild(scriptElement);
        scriptElement.remove();
    }
    
    // ===========================
    // FACEBOOK CONSENT AUTOMATION
    // ===========================
    
    /**
     * Handles Facebook GDPR consent pages automatically
     * Replicates the exact logic from Android app onPageFinished method
     */
    function handleFacebookConsentAutomation() {
        if (!window.location.href.startsWith("https://www.facebook.com/privacy/consent/gdp/")) {
            return;
        }
        
        console.log(`${SCRIPT_NAME} Facebook GDPR consent page detected`);
        
        // Exact implementation from Android app
        const consentClickScript = `
            (function() {
                const facebookConsentButton = document.querySelector('#facebook div[role="button"]');
                if (facebookConsentButton) {
                    facebookConsentButton.click();
                    console.log('${SCRIPT_NAME} Facebook consent button clicked automatically');
                } else {
                    console.log('${SCRIPT_NAME} Facebook consent button not found');
                }
            })();
        `;
        
        // Execute immediately
        const scriptElement = document.createElement('script');
        scriptElement.textContent = consentClickScript;
        document.documentElement.appendChild(scriptElement);
        scriptElement.remove();
        
        // Also try common consent selectors as fallback
        setTimeout(() => {
            const fallbackSelectors = [
                'button[data-testid="cookie-policy-manage-dialog-accept-button"]',
                'button[aria-label*="Accept"]',
                'button[aria-label*="Allow"]'
            ];
            
            for (const selector of fallbackSelectors) {
                const button = document.querySelector(selector);
                if (button && button.offsetParent !== null) {
                    button.click();
                    console.log(`${SCRIPT_NAME} Facebook consent accepted via fallback:`, selector);
                    break;
                }
            }
        }, 1000);
    }
    
    // ===========================
    // COMPREHENSIVE CSS INJECTION
    // ===========================
    
    /**
     * Injects comprehensive CSS styles ported from Android app CSS hacks
     * Includes all layout modifications and mobile-friendly enhancements
     */
    function injectComprehensiveCSSHacks() {
        GM_addStyle(`
            /* ===== GLOBAL LAYOUT FOUNDATION ===== */
            /* Replicates Android app body and container styling */
            body {
                min-width: 100% !important;
                min-height: 100% !important;
            }
            
            div[data-testid="root"] {
                --panel-gap: 0 !important;
            }
            
            /* ===== NAVIGATION AND HEADER CLEANUP ===== */
            /* Hides elements as specified in Android app CSS injection */
            #global-nav-bar > div:first-of-type {
                display: none !important;
            }
            
            #global-nav-bar a[href="/download"] {
                display: none !important;
            }
            
            #Desktop_LeftSidebar_Id header > div > div:last-child {
                display: none !important;
            }
            
            div.main-view-container__mh-footer-container {
                display: none !important;
            }
            
            button[data-testid="fullscreen-mode-button"] {
                display: none !important;
            }
            
            /* ===== NOW PLAYING BAR ENHANCEMENT ===== */
            /* Replicates Android app now playing bar styling */
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
            
            /* ===== PLAYER CONTROLS ENHANCEMENT ===== */
            /* Matches Android app control button scaling and spacing */
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
            }
            
            button[data-testid="control-button-npv"],
            button[data-testid="control-button-npv"] ~ button {
                transform: scale(1.15) !important;
                margin: 0 5px !important;
            }
            
            /* ===== CONTENT AREA OPTIMIZATION ===== */
            /* Android app content spacing and overflow handling */
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
            
            /* ===== NOW PLAYING WIDGET STYLING ===== */
            /* Matches Android app now playing widget layout */
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
            
            /* ===== TOOLTIP AND TRANSITION OPTIMIZATION ===== */
            /* Disables tooltips and transitions as in Android app */
            [data-tippy-root],
            [data-tippy-root] * {
                transition: none !important;
                transform: none !important;
            }
            
            div[data-testid="hover-or-focus-tooltip"] {
                display: none !important;
            }
            
            /* ===== SEARCH INTERFACE ENHANCEMENT ===== */
            /* Android app search styling */
            form[role="search"] {
                z-index: 10 !important;
                margin-left: 50px !important;
            }
            
            /* ===== CONTENT OVERFLOW MANAGEMENT ===== */
            section > div > div.contentSpacing > div {
                overflow: hidden !important;
            }
            
            #main-view + * {
                overflow: hidden !important;
            }
        `);
        
        console.log(`${SCRIPT_NAME} Comprehensive CSS hacks injected`);
    }
    
    // ===========================
    // ADVANCED SIDEBAR MANAGEMENT
    // ===========================
    
    /**
     * Manages left sidebar toggle with enhanced responsive behavior
     * Replicates Android app sidebar toggle logic with improvements
     */
    function manageLeftSidebarToggle() {
        const leftSidebarContainer = document.querySelector(SPOTIFY_SELECTORS.leftSidebar);
        if (!leftSidebarContainer) return false;
        
        const navigationFirstChild = leftSidebarContainer.querySelector('nav > div > div:first-child');
        if (!navigationFirstChild) return false;
        
        const isCurrentlyExpanded = navigationFirstChild.classList.length === 2;
        
        if (isCurrentlyExpanded) {
            // Expanded state: Full overlay mode
            console.log(`${SCRIPT_NAME} Sidebar expanded`);
            leftSidebarContainer.style.position = 'fixed';
            leftSidebarContainer.style.width = '100%';
            leftSidebarContainer.style.height = '92%';
            leftSidebarContainer.style.left = '0';
            leftSidebarContainer.style.zIndex = '20';
            
            const libraryHeaderTitle = leftSidebarContainer.querySelector('header > div > div:first-child h1');
            if (libraryHeaderTitle) {
                libraryHeaderTitle.innerText = '✖ Close Library';
            }
        } else {
            // Collapsed state: Mini floating position
            console.log(`${SCRIPT_NAME} Sidebar collapsed`);
            leftSidebarContainer.style.zIndex = '1';
            leftSidebarContainer.style.position = 'fixed';
            leftSidebarContainer.style.top = '2px';
            leftSidebarContainer.style.left = '60px';
            leftSidebarContainer.style.width = '50px';
            leftSidebarContainer.style.height = '40px';
        }
        
        return true;
    }
    
    /**
     * Injects enhanced sidebar controls and event listeners
     * Prevents duplicate initialization using marker classes
     */
    function injectSidebarControlEnhancements() {
        // Prevent duplicate injection
        if (document.querySelector('#Desktop_LeftSidebar_Id .spotifuck-sidebar-enhanced')) return;
        
        const libraryToggleButton = document.querySelector('#Desktop_LeftSidebar_Id header > div > div:first-child button:not(.spotifuck-sidebar-enhanced)');
        if (libraryToggleButton) {
            libraryToggleButton.classList.add('spotifuck-sidebar-enhanced');
            libraryToggleButton.style.padding = '0';
            libraryToggleButton.style.height = '20px';
            
            libraryToggleButton.addEventListener('click', function() {
                setTimeout(() => manageLeftSidebarToggle(), 0);
            });
            
            manageLeftSidebarToggle();
            console.log(`${SCRIPT_NAME} Sidebar toggle button enhanced`);
        }
        
        const libraryGridContainer = document.querySelector('#Desktop_LeftSidebar_Id div[role="grid"]:not(.spotifuck-sidebar-enhanced)');
        if (libraryGridContainer) {
            libraryGridContainer.classList.add('spotifuck-sidebar-enhanced');
            libraryGridContainer.addEventListener('click', function() {
                setTimeout(() => {
                    const enhancedToggleButton = document.querySelector('button.spotifuck-sidebar-enhanced');
                    if (enhancedToggleButton) enhancedToggleButton.click();
                }, 0);
            });
        }
        
        // Hide create playlist button
        const createPlaylistButton = document.querySelector('#Desktop_LeftSidebar_Id header > div > div:last-child');
        if (createPlaylistButton) createPlaylistButton.style.display = 'none';
        
        // Hide footer container
        const footerContainer = document.querySelector(SPOTIFY_SELECTORS.footerContainer);
        if (footerContainer) footerContainer.style.display = 'none';
    }
    
    // ===========================
    // SEARCH INTERFACE MANAGEMENT
    // ===========================
    
    /**
     * Manages search input focus behavior for better UX
     * Hides/shows now playing bar during search interaction
     */
    function addSearchInterfaceManagement() {
        const searchInputField = document.querySelector(`${SPOTIFY_SELECTORS.searchInput}:not(.spotifuck-search-enhanced)`);
        if (!searchInputField) return;
        
        searchInputField.classList.add('spotifuck-search-enhanced');
        
        searchInputField.addEventListener('focus', () => {
            const nowPlayingBarContainer = document.querySelector(SPOTIFY_SELECTORS.nowPlayingBar);
            if (nowPlayingBarContainer) {
                nowPlayingBarContainer.style.display = 'none';
            }
            
            const nowPlayingViewButton = document.querySelector(`${SPOTIFY_SELECTORS.nowPlayingViewButton}[aria-pressed="true"]`);
            if (nowPlayingViewButton) nowPlayingViewButton.click();
            
            console.log(`${SCRIPT_NAME} Search focused - now playing bar hidden`);
        });
        
        searchInputField.addEventListener('blur', () => {
            const nowPlayingBarContainer = document.querySelector(SPOTIFY_SELECTORS.nowPlayingBar);
            if (nowPlayingBarContainer) {
                nowPlayingBarContainer.style.display = 'inherit';
            }
            
            console.log(`${SCRIPT_NAME} Search blurred - now playing bar restored`);
        });
        
        console.log(`${SCRIPT_NAME} Search interface management added`);
    }
    
    // ===========================
    // PLAYBACK CONTROL FUNCTIONS
    // ===========================
    
    /**
     * Controls play/pause functionality
     * Replicates Android app actPlayPause function exactly
     */
    window.actPlayPause = function(shouldPlay) {
        console.log(`${SCRIPT_NAME} PlayPause action: ${shouldPlay}`);
        
        if ('playPauseButton' in window) {
            const currentAriaLabel = window.playPauseButton.getAttribute('aria-label');
            if (currentAriaLabel === 'Play') {
                if (shouldPlay) window.playPauseButton.click();
            } else {
                if (!shouldPlay) window.playPauseButton.click();
            }
        } else {
            const playPauseButtonElement = document.querySelector(SPOTIFY_SELECTORS.playPauseButton);
            if (playPauseButtonElement) {
                const currentAriaLabel = playPauseButtonElement.getAttribute('aria-label');
                if (currentAriaLabel === 'Play') {
                    if (shouldPlay === undefined || shouldPlay) playPauseButtonElement.click();
                } else {
                    if (shouldPlay === undefined || !shouldPlay) playPauseButtonElement.click();
                }
            }
        }
    };
    
    /**
     * Skips to previous track
     * Replicates Android app actSkipBack function exactly
     */
    window.actSkipBack = function() {
        console.log(`${SCRIPT_NAME} Skip back action`);
        const skipBackButtonElement = document.querySelector(SPOTIFY_SELECTORS.skipBackButton);
        if (skipBackButtonElement) skipBackButtonElement.click();
    };
    
    /**
     * Skips to next track  
     * Replicates Android app actSkipForward function exactly
     */
    window.actSkipForward = function() {
        console.log(`${SCRIPT_NAME} Skip forward action`);
        const skipForwardButtonElement = document.querySelector(SPOTIFY_SELECTORS.skipForwardButton);
        if (skipForwardButtonElement) skipForwardButtonElement.click();
    };
    
    /**
     * Toggles repeat mode
     * Replicates Android app actRepeat function exactly  
     */
    window.actRepeat = function() {
        console.log(`${SCRIPT_NAME} Repeat toggle action`);
        const repeatButtonElement = document.querySelector(SPOTIFY_SELECTORS.repeatButton);
        if (repeatButtonElement) repeatButtonElement.click();
    };
    
    /**
     * Toggles favorite status for current track
     * Replicates Android app actAddToFav function exactly
     */
    window.actAddToFav = function() {
        console.log(`${SCRIPT_NAME} Add to favorites action`);
        const favoriteButtonElement = document.querySelector(SPOTIFY_SELECTORS.favoriteButton);
        if (favoriteButtonElement) {
            if (favoriteButtonElement.getAttribute('aria-checked') === 'false') {
                favoriteButtonElement.click();
            } else {
                favoriteButtonElement.click();
                const removeFromFavoritesInterval = setInterval(() => {
                    const contextMenuCheckboxButton = document.querySelector('#context-menu button[role="menuitemcheckbox"][aria-checked="true"]');
                    if (contextMenuCheckboxButton) {
                        clearInterval(removeFromFavoritesInterval);
                        contextMenuCheckboxButton.click();
                        setTimeout(() => {
                            const submitButton = document.querySelector('#context-menu button[type="submit"]');
                            if (submitButton) submitButton.click();
                        }, 500);
                    }
                }, 1000);
            }
        }
    };
    
    /**
     * Seeks to specific position in track
     * Replicates Android app actSeek function exactly
     */
    window.actSeek = function(targetPosition) {
        const progressBarElement = document.querySelector(SPOTIFY_SELECTORS.playbackProgressBar);
        if (progressBarElement) {
            progressBarElement.value = targetPosition;
            progressBarElement.dispatchEvent(new Event('change', { bubbles: true }));
        }
    };
    
    // ===========================
    // ADVANCED AUTOPLAY SYSTEM
    // ===========================
    
    /**
     * Implements comprehensive autoplay functionality
     * Replicates Android app autoplay logic for both onetime and permanent modes
     */
    function initializeAdvancedAutoplaySystem() {
        let hasRequestedPause = false;
        let isAutoplayLocked = false;
        let hasFeaturesAdded = false;
        
        const autoplayMonitoringInterval = setInterval(function() {
            const playPauseButtonElement = document.querySelector(`${SPOTIFY_SELECTORS.playPauseButton}:not(.spotifuck-autoplay-enhanced)`);
            if (playPauseButtonElement) {
                console.log(`${SCRIPT_NAME} Play button detected and enhanced`);
                playPauseButtonElement.classList.add('spotifuck-autoplay-enhanced');
                window.playPauseButton = playPauseButtonElement;
                
                if (!hasFeaturesAdded) {
                    hasFeaturesAdded = true;
                    console.log(`${SCRIPT_NAME} Adding autoplay features`);
                    addAutoplayFeatures();
                }
                
                playPauseButtonElement.addEventListener('click', () => {
                    console.log(`${SCRIPT_NAME} Play button clicked`);
                    if (playPauseButtonElement.getAttribute('aria-label') !== 'Play') {
                        console.log(`${SCRIPT_NAME} Pause requested`);
                        hasRequestedPause = true;
                        isAutoplayLocked = false;
                    } else if (!isAutoplayLocked) {
                        hasRequestedPause = false;
                        console.log(`${SCRIPT_NAME} Adding unlock mechanism`);
                        isAutoplayLocked = true;
                        setTimeout(() => {
                            console.log(`${SCRIPT_NAME} Unlock timeout reached`);
                            if (isAutoplayLocked && playPauseButtonElement.getAttribute('aria-label') === 'Play') {
                                console.log(`${SCRIPT_NAME} Triggering unlock sequence`);
                                window.actSkipForward();
                                triggerUnlockSequence();
                            } else if (isAutoplayLocked) {
                                console.log(`${SCRIPT_NAME} Playing detected, removing unlock`);
                                isAutoplayLocked = false;
                            }
                        }, 10000);
                    }
                });
            }
        }, AUTOPLAY_CHECK_INTERVAL);
        
        // Trigger unlock sequence function
        window.triggerUnlockSequence = function() {
            const unlockMonitoringInterval = setInterval(() => {
                if (window.playPauseButton.disabled) {
                    console.log(`${SCRIPT_NAME} Player disabled, reloading page`);
                    window.location.reload();
                } else if (window.playPauseButton.getAttribute('aria-label') !== 'Play') {
                    clearInterval(unlockMonitoringInterval);
                    isAutoplayLocked = false;
                    console.log(`${SCRIPT_NAME} Unlock sequence completed successfully`);
                }
            }, 3000);
        };
        
        // Add autoplay features function
        window.addAutoplayFeatures = function() {
            console.log(`${SCRIPT_NAME} Autoplay features added`);
            
            // Immediate autoplay (onetime mode equivalent)
            console.log(`${SCRIPT_NAME} Onetime autoplay triggered`);
            if ('playPauseButton' in window && window.playPauseButton.getAttribute('aria-label') === 'Play') {
                window.playPauseButton.click();
            }
            
            // Additional features can be added here as needed
            addCloseNowPlayingViewFeature();
            addTakeControlFeature();
            addPermanentAutoplayFeature();
        };
        
        console.log(`${SCRIPT_NAME} Advanced autoplay system initialized`);
    }
    
    /**
     * Close now playing view feature
     * Replicates Android app close now playing view logic
     */
    function addCloseNowPlayingViewFeature() {
        setInterval(() => {
            const closeNowPlayingButton = document.querySelector('button[data-testid="control-button-npv"][aria-pressed="true"]');
            if (closeNowPlayingButton) {
                console.log(`${SCRIPT_NAME} Closing now playing view`);
                closeNowPlayingButton.click();
            }
        }, AUTOPLAY_CHECK_INTERVAL);
    }
    
    /**
     * Take control feature for device handover
     * Replicates Android app take control logic
     */
    function addTakeControlFeature() {
        setInterval(() => {
            const takeControlButton = document.querySelector('aside div.encore-bright-accent-set button');
            if (takeControlButton) {
                console.log(`${SCRIPT_NAME} Taking control of playback`);
                takeControlButton.click();
                setTimeout(() => {
                    const deviceSelectionButton = document.querySelector('aside ul[role="list"] li[role="listitem"] div[role="button"]');
                    if (deviceSelectionButton) deviceSelectionButton.click();
                }, 500);
            }
        }, AUTOPLAY_CHECK_INTERVAL);
    }
    
    /**
     * Permanent autoplay feature
     * Replicates Android app permanent autoplay mode
     */
    function addPermanentAutoplayFeature() {
        setInterval(() => {
            if ('playPauseButton' in window && !hasRequestedPause && !isAutoplayLocked && 
                window.playPauseButton.getAttribute('aria-label') === 'Play') {
                console.log(`${SCRIPT_NAME} Permanent autoplay triggered`);
                window.playPauseButton.click();
            }
        }, AUTOPLAY_CHECK_INTERVAL);
    }
    
    // ===========================
    // COMPREHENSIVE STATUS MONITORING
    // ===========================
    
    /**
     * Comprehensive track status monitoring and reporting
     * Replicates Android app player status reporting without AndBridge calls
     */
    function initializeStatusMonitoringSystem() {
        let lastStatusState = null;
        let lastPositionValue = null;
        
        const statusMonitoringInterval = setInterval(() => {
            try {
                // Track information extraction
                const trackTitleElement = document.querySelector(SPOTIFY_SELECTORS.trackTitleLink);
                const currentTrackTitle = trackTitleElement ? trackTitleElement.textContent : null;
                
                const artistNameElement = document.querySelector(SPOTIFY_SELECTORS.artistNameLink);
                const currentArtistName = artistNameElement ? artistNameElement.textContent : null;
                
                // Playback state detection
                const currentPlayingState = ('playPauseButton' in window && window.playPauseButton.getAttribute('aria-label') === 'Play') ? false : true;
                
                // Repeat state detection
                const repeatButtonElement = document.querySelector(SPOTIFY_SELECTORS.repeatButton);
                const currentRepeatState = repeatButtonElement ? repeatButtonElement.getAttribute('aria-checked') : 'false';
                
                // Favorite state detection
                const favoriteButtonElement = document.querySelector(SPOTIFY_SELECTORS.favoriteButton);
                const isFavorited = favoriteButtonElement && favoriteButtonElement.getAttribute('aria-checked') === 'true';
                
                // Progress information
                const progressBarElement = document.querySelector(SPOTIFY_SELECTORS.playbackProgressBar);
                let currentDuration = null;
                let currentPosition = null;
                if (progressBarElement) {
                    currentDuration = parseInt(progressBarElement.getAttribute('max'));
                    currentPosition = parseInt(progressBarElement.getAttribute('value'));
                }
                
                // Album cover information
                const albumCoverElement = document.querySelector(SPOTIFY_SELECTORS.albumCoverImage);
                const currentAlbumCover = albumCoverElement ? albumCoverElement.src : null;
                
                // Create status state identifier
                const currentStatusState = `${currentTrackTitle}|${currentArtistName}|${currentPlayingState}|${currentRepeatState}|${isFavorited}`;
                
                // Check for state changes
                if (currentStatusState !== lastStatusState) {
                    lastStatusState = currentStatusState;
                    const statusValues = {
                        artist: currentArtistName,
                        track: currentTrackTitle,
                        playing: currentPlayingState,
                        repeat: currentRepeatState,
                        fav: isFavorited,
                        duration: currentDuration,
                        position: currentPosition,
                        cover: currentAlbumCover
                    };
                    
                    // Console logging instead of AndBridge.playerStatus call
                    console.log(`${SCRIPT_NAME} Status Update:`, JSON.stringify(statusValues));
                } else {
                    // Position updates with throttling
                    if (currentPosition !== null && Math.abs(currentPosition - lastPositionValue) > 4000) {
                        // Console logging instead of AndBridge.trackPosition call  
                        console.log(`${SCRIPT_NAME} Position Update:`, currentPosition);
                        lastPositionValue = currentPosition;
                    }
                }
                
            } catch (error) {
                console.error(`${SCRIPT_NAME} Status monitoring error:`, error);
            }
        }, STATUS_UPDATE_INTERVAL);
        
        console.log(`${SCRIPT_NAME} Status monitoring system initialized`);
        return statusMonitoringInterval;
    }
    
    // ===========================
    // ADVANCED AD BLOCKING SYSTEM  
    // ===========================
    
    /**
     * Comprehensive ad blocking using multiple strategies
     * Replicates Android app shouldInterceptRequest method using userscript APIs
     */
    function initializeAdvancedAdBlockingSystem() {
        // Strategy 1: Request interception (replicates WebView request blocking)
        const originalFetch = window.fetch;
        const silentAudioBlob = createSilentAudioBlob();
        
        window.fetch = function(requestResource, requestInit) {
            const requestUrl = (typeof requestResource === 'string') ? requestResource : requestResource.url;
            
            // Block doubleclick.net and googlesyndication.com (exact Android app logic)
            if (requestUrl.includes('doubleclick.net') || requestUrl.includes('googlesyndication.com')) {
                console.log(`${SCRIPT_NAME} Blocked ad network request:`, requestUrl);
                return Promise.resolve(new Response(null, {
                    status: 200,
                    statusText: 'OK',
                    headers: { 'Content-Type': 'text/plain' }
                }));
            }
            
            // Block fastly-insights.com (exact Android app logic)
            if (requestUrl.includes('fastly-insights.com')) {
                console.log(`${SCRIPT_NAME} Blocked analytics request:`, requestUrl);
                return Promise.resolve(new Response(null, {
                    status: 200,
                    statusText: 'OK',
                    headers: { 'Content-Type': 'text/plain' }
                }));
            }
            
            // Replace audio/mpeg with silent audio (replicates silent.mp3 replacement)
            if (requestUrl.includes('audio/mpeg') || (requestInit && requestInit.headers && 
                JSON.stringify(requestInit.headers).includes('audio/mpeg'))) {
                console.log(`${SCRIPT_NAME} Replaced audio ad with silent audio:`, requestUrl);
                return Promise.resolve(new Response(silentAudioBlob, {
                    status: 200,
                    statusText: 'OK',
                    headers: { 'Content-Type': 'audio/mpeg' }
                }));
            }
            
            return originalFetch.apply(this, arguments);
        };
        
        // Strategy 2: XMLHttpRequest interception
        const originalXMLHttpRequest = window.XMLHttpRequest;
        window.XMLHttpRequest = function() {
            const xhr = new originalXMLHttpRequest();
            const originalOpen = xhr.open;
            
            xhr.open = function(method, url, async, user, password) {
                if (url.includes('doubleclick.net') || url.includes('googlesyndication.com') || 
                    url.includes('fastly-insights.com')) {
                    console.log(`${SCRIPT_NAME} Blocked XHR ad request:`, url);
                    // Return a minimal response
                    setTimeout(() => {
                        Object.defineProperty(xhr, 'readyState', { value: 4 });
                        Object.defineProperty(xhr, 'status', { value: 200 });
                        Object.defineProperty(xhr, 'response', { value: '' });
                        if (xhr.onreadystatechange) xhr.onreadystatechange();
                    }, 0);
                    return;
                }
                return originalOpen.apply(this, arguments);
            };
            
            return xhr;
        };
        
        // Strategy 3: DOM-based ad element removal
        const adElementObserver = new MutationObserver((mutations) => {
            mutations.forEach((mutation) => {
                mutation.addedNodes.forEach((node) => {
                    if (node.nodeType === Node.ELEMENT_NODE) {
                        removeAdElements(node);
                    }
                });
            });
        });
        
        if (document.body) {
            adElementObserver.observe(document.body, {
                childList: true,
                subtree: true
            });
        }
        
        console.log(`${SCRIPT_NAME} Advanced ad blocking system initialized`);
    }
    
    /**
     * Creates a silent audio blob to replace ad audio
     * Replicates Android app silent.mp3 functionality
     */
    function createSilentAudioBlob() {
        // Create minimal WAV file with silence (44 byte header + no data)
        const arrayBuffer = new ArrayBuffer(44);
        const view = new DataView(arrayBuffer);
        
        // WAV header creation
        const writeString = (offset, string) => {
            for (let i = 0; i < string.length; i++) {
                view.setUint8(offset + i, string.charCodeAt(i));
            }
        };
        
        writeString(0, 'RIFF');
        view.setUint32(4, 36, true);
        writeString(8, 'WAVE');
        writeString(12, 'fmt ');
        view.setUint32(16, 16, true);
        view.setUint16(20, 1, true);
        view.setUint16(22, 1, true);
        view.setUint32(24, 44100, true);
        view.setUint32(28, 88200, true);
        view.setUint16(32, 2, true);
        view.setUint16(34, 16, true);
        writeString(36, 'data');
        view.setUint32(40, 0, true);
        
        return new Blob([arrayBuffer], { type: 'audio/mpeg' });
    }
    
    /**
     * Removes ad-related DOM elements
     */
    function removeAdElements(containerElement) {
        const adElementSelectors = [
            '[data-testid*="ad"]',
            '[data-testid*="advertisement"]',
            '[class*="ad-"]',
            '[class*="advertisement"]',
            '[id*="ad-"]',
            'iframe[src*="doubleclick"]',
            'iframe[src*="googlesyndication"]'
        ];
        
        adElementSelectors.forEach(selector => {
            const adElements = containerElement.querySelectorAll(selector);
            adElements.forEach(element => {
                element.remove();
                console.log(`${SCRIPT_NAME} Removed ad element:`, selector);
            });
        });
    }
    
    // ===========================
    // HOME BUTTON ENHANCEMENT
    // ===========================
    
    /**
     * Enhances home button to close now playing view
     * Replicates Android app home button click behavior
     */
    function addHomeButtonEnhancement() {
        const homeButtonElement = document.querySelector(`${SPOTIFY_SELECTORS.homeButton}:not(.spotifuck-home-enhanced)`);
        if (homeButtonElement) {
            homeButtonElement.classList.add('spotifuck-home-enhanced');
            homeButtonElement.addEventListener('click', () => {
                const nowPlayingViewButton = document.querySelector(`${SPOTIFY_SELECTORS.nowPlayingViewButton}[aria-pressed="true"]`);
                if (nowPlayingViewButton) nowPlayingViewButton.click();
            });
            console.log(`${SCRIPT_NAME} Home button enhanced`);
        }
    }
    
    // ===========================
    // MEDIA LIBRARY MANAGEMENT
    // ===========================
    
    /**
     * Media library building and playlist management
     * Replicates Android app mediaBuildPlay functionality
     */
    window.mediaBuildPlay = function(playlistIndex = -1) {
        const libraryToggleButton = window.libraryToggleButton || document.querySelector('#Desktop_LeftSidebar_Id header > div > div:first-child button');
        
        if (!libraryToggleButton.querySelector(':scope > h1')) {
            libraryToggleButton.click();
        }
        
        const mediaTimerInterval = setInterval(() => {
            if (document.querySelector('div[role="grid"] div[role="gridcell"] > div button')) {
                clearInterval(mediaTimerInterval);
                console.log(`${SCRIPT_NAME} Building media library`);
                
                const libraryRowElements = document.querySelectorAll('div[role="grid"] div[role="gridcell"] > div');
                let playlistTitles = [], playlistKinds = [], playlistImages = [], playlistButtons = [];
                
                Array.from(libraryRowElements).forEach(node => {
                    const imageElement = node.querySelector('img');
                    const buttonElement = node.querySelector('button');
                    if (imageElement) {
                        playlistTitles.push(imageElement.alt);
                        
                        const kindAttribute = node.getAttribute('aria-labelledby');
                        if (kindAttribute && (match = kindAttribute.match(/listrow-title-spotify:([^:]+):/))) {
                            playlistKinds.push((match[1].charAt(0).toUpperCase() + match[1].slice(1)).replace('Collection', 'Playlist'));
                        } else {
                            playlistKinds.push('-');
                        }
                        
                        playlistImages.push(imageElement.src);
                        playlistButtons.push(buttonElement);
                    }
                });
                
                window.mediaInfo = { playlistTitles, playlistKinds, playlistImages };
                
                if (playlistIndex === -1) {
                    libraryToggleButton.click();
                } else {
                    playlistButtons[playlistIndex].click();
                }
            }
        }, 500);
    };
    
    // ===========================
    // INITIALIZATION SYSTEM
    // ===========================
    
    /**
     * Main initialization function for all Spotifuck features
     * Coordinates feature initialization and handles retries
     */
    function initializeSpotifuckFeatures() {
        console.log(`${SCRIPT_NAME} Initializing all features...`);
        
        // UI enhancements
        injectSidebarControlEnhancements();
        addSearchInterfaceManagement();
        addHomeButtonEnhancement();
        
        // Store library toggle button reference
        window.libraryToggleButton = document.querySelector('#Desktop_LeftSidebar_Id header > div > div:first-child button');
        
        return true;
    }
    
    /**
     * Checks if core Spotify interface elements are available
     */
    function isSpotifyInterfaceReady() {
        return document.querySelector(SPOTIFY_SELECTORS.leftSidebar) !== null;
    }
    
    /**
     * Periodic UI enhancement re-injection
     * Handles Spotify's dynamic content updates and SPA navigation
     */
    function startPeriodicUIEnhancementUpdates() {
        setInterval(() => {
            injectSidebarControlEnhancements();
            addSearchInterfaceManagement();
            addHomeButtonEnhancement();
        }, UI_INJECTION_INTERVAL);
        
        console.log(`${SCRIPT_NAME} Periodic UI enhancement updates started`);
    }
    
    /**
     * Spotify login detection and redirection
     * Replicates Android app login detection logic
     */
    function handleSpotifyLoginRedirection() {
        const webPlayerLink = document.querySelector('button[data-testid="web-player-link"]');
        if (webPlayerLink) {
            console.log(`${SCRIPT_NAME} Spotify login detected, redirecting to web player`);
            webPlayerLink.click();
        }
    }
    
    // ===========================
    // MAIN EXECUTION FLOW
    // ===========================
    
    // Immediate execution for time-sensitive features
    injectDesktopClientSpoofing();
    injectComprehensiveCSSHacks();
    
    // Handle Facebook consent pages if detected
    if (window.location.href.startsWith("https://www.facebook.com/privacy/consent/gdp/")) {
        handleFacebookConsentAutomation();
        return; // Exit early for Facebook pages
    }
    
    // Initialize core systems
    initializeAdvancedAdBlockingSystem();
    initializeAdvancedAutoplaySystem();
    initializeStatusMonitoringSystem();
    
    // Wait for Spotify interface to be ready
    const spotifyReadinessInterval = setInterval(() => {
        if (isSpotifyInterfaceReady()) {
            initializeSpotifuckFeatures();
            clearInterval(spotifyReadinessInterval);
            
            // Start periodic maintenance tasks
            startPeriodicUIEnhancementUpdates();
            
            console.log(`${SCRIPT_NAME} Full initialization completed successfully`);
        } else {
            // Check for login redirection
            handleSpotifyLoginRedirection();
        }
    }, INITIALIZATION_RETRY_INTERVAL);
    
    // Initialization timeout safety mechanism
    setTimeout(() => {
        clearInterval(spotifyReadinessInterval);
        console.warn(`${SCRIPT_NAME} Initialization timeout reached - some features may not be available`);
    }, 30000);
    
    // Export global interface for debugging and external access
    window.SpotifuckUserscript = {
        version: VERSION,
        timestamp: new Date().toISOString(),
        features: {
            'Client Spoofing': true,
            'UI/CSS Enhancements': true,
            'Advanced Ad Blocking': true,
            'Playback Controls': true,
            'Facebook Consent Automation': true,
            'Autoplay System': true,
            'Status Monitoring': true,
            'Sidebar Management': true,
            'Search Interface': true,
            'Media Library Management': true
        },
        controls: {
            playPause: window.actPlayPause,
            skipBack: window.actSkipBack,
            skipForward: window.actSkipForward,
            repeat: window.actRepeat,
            addToFavorites: window.actAddToFav,
            seek: window.actSeek,
            mediaBuildPlay: window.mediaBuildPlay
        },
        elements: SPOTIFY_SELECTORS
    };
    
    console.log(`${SCRIPT_NAME} v${VERSION} loaded successfully with all Android app features ported`);
    console.log(`${SCRIPT_NAME} Available controls:`, Object.keys(window.SpotifuckUserscript.controls));
    console.log(`${SCRIPT_NAME} Feature status:`, window.SpotifuckUserscript.features);
    
})();
