// ==UserScript==
// @name         Spotifuck - Complete Spotify Web Player Enhancement
// @namespace    https://github.com/Myst1cX/spotifuck-userscript
// @version      4.0.0
// @description  Complete port of Spotifuck Android app functionality - UI enhancements, ad blocking, playback controls, client spoofing, and Facebook consent automation
// @author       Myst1cX (ported from Spotifuck Android app)
// @match        https://open.spotify.com/*
// @match        https://www.facebook.com/tr*
// @match        https://www.facebook.com/dialog*
// @match        https://*.facebook.com/*/consent*
// @grant        GM_addStyle
// @run-at       document-start
// @homepageURL  https://github.com/Myst1cX/spotifuck-userscript
// @supportURL   https://github.com/Myst1cX/spotifuck-userscript/issues
// @updateURL    https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/v4-final.user.js
// @downloadURL  https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/v4-final.user.js
// ==/UserScript==

/**
 * SPOTIFUCK USERSCRIPT v4.0.0
 * 
 * Complete port of Spotifuck Android app functionality to desktop browsers.
 * Provides comprehensive UI enhancements, ad blocking, playback controls,
 * client spoofing, and automation features for Spotify Web Player.
 * 
 * Features:
 * - UI/UX Enhancements: Mobile-friendly interface modifications
 * - Silent Ad Blocking: DOM-based ad muting and replacement
 * - Playback Controls: Programmatic player control functions
 * - Client Spoofing: Desktop environment simulation
 * - Facebook Consent Automation: Automatic consent handling
 * - Sidebar Management: Enhanced navigation controls
 * - Search Focus Handling: Improved search interface behavior
 * - Status Reporting: Track playback monitoring (without bridge calls)
 * 
 * All features are enabled by default with no configuration required.
 * Variable names use clear, descriptive naming for maintainability.
 */

(function() {
    'use strict';
    
    // ===========================
    // CONSTANTS AND CONFIGURATION
    // ===========================
    
    const SCRIPT_NAME = '[Spotifuck]';
    const UPDATE_INTERVAL = 1000; // Status check interval (ms)
    const UI_INJECTION_INTERVAL = 5000; // UI fix re-injection interval (ms)
    const INITIALIZATION_RETRY_INTERVAL = 1000; // Initialization retry interval (ms)
    
    // Spotify element selectors (using official data-testid attributes)
    const SELECTORS = {
        // Playback controls
        playPauseButton: 'aside button[data-testid="control-button-playpause"]',
        skipBackButton: 'button[data-testid="control-button-skip-back"]',
        skipForwardButton: 'button[data-testid="control-button-skip-forward"]',
        playbackProgressBar: 'div[data-testid="playback-progressbar"] input[type="range"]',
        playerControls: 'div[data-testid="player-controls"]',
        generalControls: 'div[data-testid="general-controls"]',
        
        // UI elements
        nowPlayingBar: 'aside[data-testid="now-playing-bar"]',
        nowPlayingWidget: 'div[data-testid="now-playing-widget"]',
        leftSidebar: '#Desktop_LeftSidebar_Id',
        searchInput: 'input[data-testid="search-input"]',
        controlButtonNpv: 'button[data-testid="control-button-npv"]',
        fullscreenButton: 'button[data-testid="fullscreen-mode-button"]',
        
        // Content elements
        contextItemLink: 'a[data-testid="context-item-link"]',
        contextItemArtist: 'a[data-testid="context-item-info-artist"]',
        coverArtImage: 'img[data-testid="cover-art-image"]',
        trackList: 'div[data-testid="track-list"]',
        
        // Layout elements
        root: 'div[data-testid="root"]',
        globalNavBar: '#global-nav-bar',
        footerContainer: 'div.main-view-container__mh-footer-container',
        contentSpacing: 'div.contentSpacing'
    };
    
    // ===========================
    // CLIENT SPOOFING & ENVIRONMENT SETUP
    // ===========================
    
    /**
     * Spoofs browser and device properties to simulate desktop environment
     * This unlocks desktop-only features and improves compatibility
     */
    function injectClientSpoofing() {
        const spoofingScript = `
            // Screen dimensions spoofing
            Object.defineProperty(window.screen, 'width', {
                get: () => 1920,
                configurable: true
            });
            Object.defineProperty(window.screen, 'height', {
                get: () => 1080,
                configurable: true
            });
            Object.defineProperty(window.screen, 'availWidth', {
                get: () => 1920,
                configurable: true
            });
            Object.defineProperty(window.screen, 'availHeight', {
                get: () => 1040,
                configurable: true
            });
            
            // Window dimensions spoofing
            Object.defineProperty(window, 'innerWidth', {
                get: () => 1920,
                configurable: true
            });
            Object.defineProperty(window, 'innerHeight', {
                get: () => 978,
                configurable: true
            });
            
            // Navigator properties spoofing for desktop simulation
            Object.defineProperty(window.navigator, 'vendor', {
                get: () => 'Google Inc.',
                configurable: true
            });
            Object.defineProperty(window.navigator, 'productSub', {
                get: () => '20030107',
                configurable: true
            });
            Object.defineProperty(window.navigator, 'platform', {
                get: () => 'Win32',
                configurable: true
            });
            Object.defineProperty(window.navigator, 'oscpu', {
                get: () => 'Windows NT 10.0; Win64; x64',
                configurable: true
            });
            
            console.log('${SCRIPT_NAME} Client spoofing initialized');
        `;
        
        const scriptElement = document.createElement('script');
        scriptElement.textContent = spoofingScript;
        document.documentElement.appendChild(scriptElement);
        scriptElement.remove();
    }
    
    // ===========================
    // CSS STYLING AND UI ENHANCEMENTS
    // ===========================
    
    /**
     * Injects comprehensive CSS styles for mobile-friendly UI enhancements
     * Includes layout modifications, control enhancements, and visual improvements
     */
    function injectSpotifuckStyles() {
        GM_addStyle(`
            /* ===== GLOBAL LAYOUT ENHANCEMENTS ===== */
            body {
                min-width: 100% !important;
                min-height: 100% !important;
                overflow-x: hidden !important;
            }
            
            div[data-testid="root"] {
                --panel-gap: 0 !important;
            }
            
            /* ===== HEADER AND NAVIGATION CLEANUP ===== */
            #global-nav-bar > div:first-of-type,
            #global-nav-bar a[href="/download"],
            #Desktop_LeftSidebar_Id header > div > div:last-child,
            div.main-view-container__mh-footer-container,
            button[data-testid="fullscreen-mode-button"] {
                display: none !important;
            }
            
            /* ===== NOW PLAYING BAR ENHANCEMENTS ===== */
            aside[data-testid="now-playing-bar"] {
                min-width: 100% !important;
                background: #000000 !important;
                border-top: 1px solid #282828 !important;
                box-shadow: 0 -2px 10px rgba(0, 0, 0, 0.3) !important;
            }
            
            aside[data-testid="now-playing-bar"] > div {
                margin-top: 2px !important;
                flex-direction: column !important;
                height: auto !important;
                padding: 8px !important;
            }
            
            aside[data-testid="now-playing-bar"] > div > div {
                width: 100% !important;
                margin: 2px 0 !important;
            }
            
            /* ===== PLAYER CONTROLS ENHANCEMENT ===== */
            div[data-testid="player-controls"] {
                margin: 5px 0 !important;
                padding: 5px !important;
            }
            
            div[data-testid="general-controls"] button {
                transform: scale(1.4) !important;
                margin: 0 8px !important;
                transition: transform 0.2s ease !important;
            }
            
            div[data-testid="general-controls"] button:hover {
                transform: scale(1.5) !important;
            }
            
            button[data-testid="control-button-npv"] {
                transform: scale(1.15) !important;
                margin: 0 5px !important;
            }
            
            /* ===== CONTENT AREA OPTIMIZATION ===== */
            main > section > div.contentSpacing {
                padding: 0 10px !important;
                overflow: hidden !important;
            }
            
            div[data-testid="track-list"] > div:first-child {
                top: 0 !important;
                background: transparent !important;
                backdrop-filter: blur(10px) !important;
            }
            
            /* ===== NOW PLAYING WIDGET ENHANCEMENT ===== */
            div[data-testid="now-playing-widget"] {
                justify-content: center !important;
                padding: 8px !important;
            }
            
            div[data-testid="now-playing-widget"] > div:first-child {
                display: none !important;
            }
            
            div[data-testid="now-playing-widget"] > div:nth-child(2) {
                display: flex !important;
                overflow: hidden !important;
                text-align: center !important;
            }
            
            div[data-testid="now-playing-widget"] > div:nth-child(2) span {
                font-size: 13px !important;
                height: 20px !important;
                margin: 0 !important;
                line-height: 20px !important;
            }
            
            div[data-testid="now-playing-widget"] > div:nth-child(2) > div {
                min-width: auto !important;
                flex: 1 !important;
            }
            
            /* ===== TOOLTIP AND TRANSITION IMPROVEMENTS ===== */
            [data-tippy-root],
            [data-tippy-root] * {
                transition: none !important;
                transform: none !important;
            }
            
            /* ===== CONTENT OVERFLOW HANDLING ===== */
            section > div > div.contentSpacing > div {
                overflow: hidden !important;
            }
            
            /* ===== SEARCH INTERFACE ENHANCEMENT ===== */
            form[role="search"] {
                z-index: 10 !important;
                background: rgba(0, 0, 0, 0.8) !important;
                backdrop-filter: blur(10px) !important;
                border-radius: 8px !important;
            }
            
            /* ===== MOBILE RESPONSIVENESS ===== */
            @media (max-width: 768px) {
                div[data-testid="general-controls"] button {
                    transform: scale(1.6) !important;
                    margin: 0 10px !important;
                }
                
                div[data-testid="now-playing-widget"] > div:nth-child(2) span {
                    font-size: 12px !important;
                }
            }
            
            /* ===== AD CONTENT HIDING ===== */
            [data-testid*="ad"],
            [data-testid*="advertisement"],
            [class*="ad-"],
            [class*="advertisement"] {
                display: none !important;
                visibility: hidden !important;
                opacity: 0 !important;
            }
            
            /* ===== ACCESSIBILITY IMPROVEMENTS ===== */
            button[aria-label*="play"],
            button[aria-label*="pause"],
            button[aria-label*="skip"] {
                outline: 2px solid transparent !important;
                transition: outline-color 0.2s ease !important;
            }
            
            button[aria-label*="play"]:focus,
            button[aria-label*="pause"]:focus,
            button[aria-label*="skip"]:focus {
                outline-color: #1db954 !important;
            }
        `);
        
        console.log(`${SCRIPT_NAME} CSS styles injected`);
    }
    
    // ===========================
    // SIDEBAR MANAGEMENT SYSTEM
    // ===========================
    
    /**
     * Manages left sidebar toggle functionality and responsive behavior
     * Provides mobile-friendly sidebar experience with proper state management
     */
    function manageSidebarToggle() {
        const leftSidebar = document.querySelector(SELECTORS.leftSidebar);
        if (!leftSidebar) return false;
        
        const navigationFirstChild = leftSidebar.querySelector('nav > div > div:first-child');
        if (!navigationFirstChild) return false;
        
        const isExpanded = navigationFirstChild.classList.length === 2;
        
        if (isExpanded) {
            // Expanded state: Full overlay mode
            leftSidebar.style.position = 'fixed';
            leftSidebar.style.width = '100%';
            leftSidebar.style.height = '92%';
            leftSidebar.style.left = '0';
            leftSidebar.style.top = '0';
            leftSidebar.style.zIndex = '20';
            leftSidebar.style.backgroundColor = 'rgba(0, 0, 0, 0.95)';
            leftSidebar.style.backdropFilter = 'blur(10px)';
            
            const libraryHeader = leftSidebar.querySelector('header > div > div:first-child h1');
            if (libraryHeader) libraryHeader.innerText = '✖ Close Library';
        } else {
            // Collapsed state: Mini floating button
            leftSidebar.style.zIndex = '1';
            leftSidebar.style.position = 'fixed';
            leftSidebar.style.top = '2px';
            leftSidebar.style.left = '120px';
            leftSidebar.style.width = '50px';
            leftSidebar.style.height = '40px';
            leftSidebar.style.backgroundColor = 'transparent';
            leftSidebar.style.backdropFilter = 'none';
        }
        
        return true;
    }
    
    /**
     * Injects sidebar control enhancements and event listeners
     * Handles click events and prevents duplicate initialization
     */
    function injectSidebarEnhancements() {
        // Prevent duplicate injection using marker class
        if (document.querySelector('#Desktop_LeftSidebar_Id .spotifuck-enhanced')) return;
        
        const libraryToggleButton = document.querySelector('#Desktop_LeftSidebar_Id header > div > div:first-child button:not(.spotifuck-enhanced)');
        if (libraryToggleButton) {
            libraryToggleButton.classList.add('spotifuck-enhanced');
            libraryToggleButton.style.padding = '0';
            libraryToggleButton.style.height = '20px';
            libraryToggleButton.style.borderRadius = '4px';
            libraryToggleButton.style.transition = 'all 0.2s ease';
            
            libraryToggleButton.addEventListener('click', () => {
                setTimeout(manageSidebarToggle, 0);
            });
            
            manageSidebarToggle();
        }
        
        const libraryGridItems = document.querySelector('#Desktop_LeftSidebar_Id div[role="grid"]:not(.spotifuck-enhanced)');
        if (libraryGridItems) {
            libraryGridItems.classList.add('spotifuck-enhanced');
            libraryGridItems.addEventListener('click', () => {
                setTimeout(() => {
                    const enhancedLibraryButton = document.querySelector('button.spotifuck-enhanced');
                    if (enhancedLibraryButton) enhancedLibraryButton.click();
                }, 0);
            });
        }
        
        // Hide unnecessary elements
        const createPlaylistButton = document.querySelector('#Desktop_LeftSidebar_Id header > div > div:last-child');
        if (createPlaylistButton) createPlaylistButton.style.display = 'none';
        
        const footerContainer = document.querySelector(SELECTORS.footerContainer);
        if (footerContainer) footerContainer.style.display = 'none';
        
        console.log(`${SCRIPT_NAME} Sidebar enhancements applied`);
    }
    
    // ===========================
    // SEARCH INTERFACE MANAGEMENT
    // ===========================
    
    /**
     * Manages search input focus behavior and now playing bar visibility
     * Provides better UX by hiding/showing elements during search interaction
     */
    function addSearchFocusManagement() {
        const searchInput = document.querySelector(`${SELECTORS.searchInput}:not(.spotifuck-enhanced)`);
        if (!searchInput) return;
        
        searchInput.classList.add('spotifuck-enhanced');
        
        searchInput.addEventListener('focus', () => {
            const nowPlayingBar = document.querySelector(SELECTORS.nowPlayingBar);
            if (nowPlayingBar) {
                nowPlayingBar.style.display = 'none';
                nowPlayingBar.style.transition = 'all 0.3s ease';
            }
            
            const controlButtonNpv = document.querySelector(`${SELECTORS.controlButtonNpv}[aria-pressed="true"]`);
            if (controlButtonNpv) controlButtonNpv.click();
            
            console.log(`${SCRIPT_NAME} Search focused - hiding now playing bar`);
        });
        
        searchInput.addEventListener('blur', () => {
            setTimeout(() => {
                const nowPlayingBar = document.querySelector(SELECTORS.nowPlayingBar);
                if (nowPlayingBar) {
                    nowPlayingBar.style.display = 'inherit';
                }
                console.log(`${SCRIPT_NAME} Search blurred - showing now playing bar`);
            }, 100);
        });
        
        console.log(`${SCRIPT_NAME} Search focus management added`);
    }
    
    // ===========================
    // PLAYBACK CONTROL FUNCTIONS
    // ===========================
    
    /**
     * Global playback control functions for external access
     * These functions provide programmatic control over Spotify playback
     */
    
    /**
     * Controls play/pause functionality
     * @param {boolean} play - True to play, false to pause, undefined to toggle
     */
    window.actPlayPause = function(play) {
        const playPauseButton = document.querySelector(SELECTORS.playPauseButton);
        if (!playPauseButton) {
            console.warn(`${SCRIPT_NAME} Play/pause button not found`);
            return false;
        }
        
        const ariaLabel = playPauseButton.getAttribute('aria-label');
        const isCurrentlyPaused = ariaLabel === 'Play';
        
        if (play === undefined) {
            // Toggle mode
            playPauseButton.click();
        } else if (play && isCurrentlyPaused) {
            // Want to play and currently paused
            playPauseButton.click();
        } else if (!play && !isCurrentlyPaused) {
            // Want to pause and currently playing
            playPauseButton.click();
        }
        
        console.log(`${SCRIPT_NAME} Play/pause action: ${play === undefined ? 'toggle' : play ? 'play' : 'pause'}`);
        return true;
    };
    
    /**
     * Skips to previous track
     */
    window.actSkipBack = function() {
        const skipBackButton = document.querySelector(SELECTORS.skipBackButton);
        if (skipBackButton) {
            skipBackButton.click();
            console.log(`${SCRIPT_NAME} Skip back action`);
            return true;
        }
        console.warn(`${SCRIPT_NAME} Skip back button not found`);
        return false;
    };
    
    /**
     * Skips to next track
     */
    window.actSkipForward = function() {
        const skipForwardButton = document.querySelector(SELECTORS.skipForwardButton);
        if (skipForwardButton) {
            skipForwardButton.click();
            console.log(`${SCRIPT_NAME} Skip forward action`);
            return true;
        }
        console.warn(`${SCRIPT_NAME} Skip forward button not found`);
        return false;
    };
    
    /**
     * Seeks to specific position in track
     * @param {number} position - Position to seek to (0-100 or actual time value)
     */
    window.actSeek = function(position) {
        const playbackProgressBar = document.querySelector(SELECTORS.playbackProgressBar);
        if (!playbackProgressBar) {
            console.warn(`${SCRIPT_NAME} Progress bar not found`);
            return false;
        }
        
        const maxValue = parseInt(playbackProgressBar.getAttribute('max'));
        const seekValue = position > 100 ? position : (position / 100) * maxValue;
        
        playbackProgressBar.value = seekValue;
        playbackProgressBar.dispatchEvent(new Event('change', { bubbles: true }));
        playbackProgressBar.dispatchEvent(new Event('input', { bubbles: true }));
        
        console.log(`${SCRIPT_NAME} Seek action: ${position} -> ${seekValue}`);
        return true;
    };
    
    // ===========================
    // TRACK STATUS MONITORING
    // ===========================
    
    /**
     * Comprehensive track status monitoring and reporting
     * Monitors playback state and track information without AndBridge calls
     */
    function initializeTrackStatusMonitoring() {
        let lastTrackState = null;
        let lastPositionUpdate = 0;
        
        const monitoringInterval = setInterval(() => {
            try {
                // Track information
                const contextItemLink = document.querySelector(SELECTORS.contextItemLink);
                const trackTitle = contextItemLink ? contextItemLink.textContent.trim() : null;
                
                const contextItemArtist = document.querySelector(SELECTORS.contextItemArtist);
                const artistName = contextItemArtist ? contextItemArtist.textContent.trim() : null;
                
                // Playback state
                const playPauseButton = document.querySelector(SELECTORS.playPauseButton);
                const isPlaying = playPauseButton && playPauseButton.getAttribute('aria-label') !== 'Play';
                
                // Progress information
                const playbackProgressBar = document.querySelector(SELECTORS.playbackProgressBar);
                const duration = playbackProgressBar ? parseInt(playbackProgressBar.getAttribute('max')) : null;
                const position = playbackProgressBar ? parseInt(playbackProgressBar.value) : null;
                
                // Cover art
                const coverArtImage = document.querySelector(SELECTORS.coverArtImage);
                const coverUrl = coverArtImage ? coverArtImage.src : null;
                
                // Create state identifier
                const currentTrackState = `${trackTitle}|${artistName}|${isPlaying}`;
                
                // Check for track changes
                if (currentTrackState !== lastTrackState) {
                    lastTrackState = currentTrackState;
                    
                    const trackInfo = {
                        artist: artistName,
                        track: trackTitle,
                        playing: isPlaying,
                        duration: duration,
                        position: position,
                        cover: coverUrl,
                        timestamp: Date.now()
                    };
                    
                    // Log status (replaces AndBridge.playerStatus call)
                    console.log(`${SCRIPT_NAME} Track Status:`, trackInfo);
                    
                    // Trigger custom event for external listeners
                    window.dispatchEvent(new CustomEvent('spotifuck:trackChange', {
                        detail: trackInfo
                    }));
                }
                
                // Position updates (throttled)
                if (position !== null && Date.now() - lastPositionUpdate > 5000) {
                    lastPositionUpdate = Date.now();
                    // Replaces AndBridge.trackPosition call
                    window.dispatchEvent(new CustomEvent('spotifuck:positionUpdate', {
                        detail: { position: position, timestamp: Date.now() }
                    }));
                }
                
            } catch (error) {
                console.error(`${SCRIPT_NAME} Status monitoring error:`, error);
            }
        }, UPDATE_INTERVAL);
        
        console.log(`${SCRIPT_NAME} Track status monitoring initialized`);
        return monitoringInterval;
    }
    
    // ===========================
    // AUTOPLAY FUNCTIONALITY
    // ===========================
    
    /**
     * Implements autoplay functionality for immediate playback
     * Automatically starts playback when player becomes available
     */
    function initializeAutoplay() {
        let autoplayAttempted = false;
        let attemptCount = 0;
        const maxAttempts = 30; // 30 seconds of attempts
        
        const autoplayInterval = setInterval(() => {
            attemptCount++;
            
            if (autoplayAttempted || attemptCount > maxAttempts) {
                clearInterval(autoplayInterval);
                return;
            }
            
            const playPauseButton = document.querySelector(`${SELECTORS.playPauseButton}[aria-label="Play"]`);
            if (playPauseButton) {
                playPauseButton.click();
                autoplayAttempted = true;
                console.log(`${SCRIPT_NAME} Autoplay triggered successfully`);
                clearInterval(autoplayInterval);
            }
        }, UPDATE_INTERVAL);
        
        console.log(`${SCRIPT_NAME} Autoplay monitoring started`);
    }
    
    // ===========================
    // ADVANCED AD BLOCKING SYSTEM
    // ===========================
    
    /**
     * Comprehensive ad blocking using multiple strategies
     * Includes request interception, DOM manipulation, and audio muting
     */
    function initializeAdvancedAdBlocking() {
        // Strategy 1: Request interception for audio ads
        const originalFetch = window.fetch;
        const silentAudioBlob = createSilentAudioBlob();
        
        window.fetch = function(resource, init) {
            const url = (typeof resource === 'string') ? resource : resource.url;
            
            if (url && isAdRequest(url)) {
                console.log(`${SCRIPT_NAME} Blocked ad request:`, url);
                return Promise.resolve(new Response(silentAudioBlob, {
                    status: 200,
                    statusText: 'OK',
                    headers: { 'Content-Type': 'audio/wav' }
                }));
            }
            
            return originalFetch.apply(this, arguments);
        };
        
        // Strategy 2: DOM-based ad element removal
        const adElementObserver = new MutationObserver((mutations) => {
            mutations.forEach((mutation) => {
                mutation.addedNodes.forEach((node) => {
                    if (node.nodeType === Node.ELEMENT_NODE) {
                        removeAdElements(node);
                    }
                });
            });
        });
        
        adElementObserver.observe(document.body, {
            childList: true,
            subtree: true
        });
        
        // Strategy 3: Audio element muting
        interceptAudioElements();
        
        console.log(`${SCRIPT_NAME} Advanced ad blocking initialized`);
    }
    
    /**
     * Creates a silent audio blob for ad replacement
     */
    function createSilentAudioBlob() {
        // Create minimal WAV file with silence
        const arrayBuffer = new ArrayBuffer(44);
        const view = new DataView(arrayBuffer);
        
        // WAV header
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
        
        return new Blob([arrayBuffer], { type: 'audio/wav' });
    }
    
    /**
     * Determines if a URL is an ad request
     */
    function isAdRequest(url) {
        const adPatterns = [
            /audio\/mpeg.*ad/i,
            /doubleclick/i,
            /googleadservices/i,
            /googlesyndication/i,
            /amazon-adsystem/i,
            /facebook\.com\/tr/i,
            /spotify\.com.*ad/i,
            /spclient\.wg\.spotify\.com.*ad/i
        ];
        
        return adPatterns.some(pattern => pattern.test(url));
    }
    
    /**
     * Removes ad-related DOM elements
     */
    function removeAdElements(container) {
        const adSelectors = [
            '[data-testid*="ad"]',
            '[data-testid*="advertisement"]',
            '[class*="ad-"]',
            '[class*="advertisement"]',
            '[id*="ad-"]',
            '[id*="advertisement"]',
            'iframe[src*="doubleclick"]',
            'iframe[src*="googlesyndication"]'
        ];
        
        adSelectors.forEach(selector => {
            const adElements = container.querySelectorAll(selector);
            adElements.forEach(element => {
                element.remove();
                console.log(`${SCRIPT_NAME} Removed ad element:`, selector);
            });
        });
    }
    
    /**
     * Intercepts and mutes audio elements used for ads
     */
    function interceptAudioElements() {
        const originalCreateElement = document.createElement;
        document.createElement = function(tagName) {
            const element = originalCreateElement.call(this, tagName);
            
            if (tagName.toLowerCase() === 'audio') {
                // Monitor audio source changes
                const originalSetAttribute = element.setAttribute;
                element.setAttribute = function(name, value) {
                    if (name === 'src' && isAdRequest(value)) {
                        console.log(`${SCRIPT_NAME} Muted ad audio:`, value);
                        element.muted = true;
                        element.volume = 0;
                        return;
                    }
                    return originalSetAttribute.call(this, name, value);
                };
            }
            
            return element;
        };
    }
    
    // ===========================
    // FACEBOOK CONSENT AUTOMATION
    // ===========================
    
    /**
     * Handles Facebook consent pages automatically
     * Automatically accepts or dismisses Facebook tracking consent dialogs
     */
    function handleFacebookConsent() {
        if (!window.location.hostname.includes('facebook.com')) return;
        
        console.log(`${SCRIPT_NAME} Facebook consent page detected`);
        
        // Common consent dialog selectors
        const consentSelectors = [
            'button[data-testid="cookie-policy-manage-dialog-accept-button"]',
            'button[data-cookiebanner="accept_button"]',
            'button[aria-label*="Accept"]',
            'button[aria-label*="Allow"]',
            'button:contains("Accept All")',
            'button:contains("Allow All")',
            '[data-testid*="accept"]',
            '[role="button"][aria-label*="accept" i]'
        ];
        
        // Try to find and click consent buttons
        let consentHandled = false;
        const handleConsent = () => {
            for (const selector of consentSelectors) {
                const button = document.querySelector(selector);
                if (button && button.offsetParent !== null) { // Check if visible
                    button.click();
                    console.log(`${SCRIPT_NAME} Facebook consent accepted:`, selector);
                    consentHandled = true;
                    return true;
                }
            }
            return false;
        };
        
        // Immediate attempt
        if (handleConsent()) return;
        
        // Monitor for dynamic consent dialogs
        const consentObserver = new MutationObserver(() => {
            if (!consentHandled && handleConsent()) {
                consentObserver.disconnect();
            }
        });
        
        consentObserver.observe(document.body, {
            childList: true,
            subtree: true
        });
        
        // Timeout after 10 seconds
        setTimeout(() => {
            consentObserver.disconnect();
            if (!consentHandled) {
                console.log(`${SCRIPT_NAME} Facebook consent automation timeout`);
            }
        }, 10000);
    }
    
    // ===========================
    // INITIALIZATION SYSTEM
    // ===========================
    
    /**
     * Main initialization function
     * Coordinates all feature initialization and handles retries
     */
    function initializeSpotifuck() {
        console.log(`${SCRIPT_NAME} Initializing comprehensive enhancements...`);
        
        // Apply UI enhancements
        injectSidebarEnhancements();
        addSearchFocusManagement();
        
        return true;
    }
    
    /**
     * Checks if core Spotify elements are available
     */
    function isSpotifyReady() {
        return document.querySelector(SELECTORS.leftSidebar) !== null;
    }
    
    /**
     * Periodic UI enhancement re-injection
     * Handles Spotify's dynamic content updates
     */
    function startPeriodicUIUpdates() {
        setInterval(() => {
            injectSidebarEnhancements();
            addSearchFocusManagement();
        }, UI_INJECTION_INTERVAL);
        
        console.log(`${SCRIPT_NAME} Periodic UI updates started`);
    }
    
    // ===========================
    // MAIN EXECUTION
    // ===========================
    
    // Initialize client spoofing immediately
    injectClientSpoofing();
    
    // Apply CSS styles immediately
    injectSpotifuckStyles();
    
    // Handle Facebook consent if on Facebook domain
    if (window.location.hostname.includes('facebook.com')) {
        handleFacebookConsent();
        return; // Exit early for Facebook pages
    }
    
    // Initialize advanced ad blocking
    initializeAdvancedAdBlocking();
    
    // Initialize autoplay
    initializeAutoplay();
    
    // Initialize track status monitoring
    initializeTrackStatusMonitoring();
    
    // Wait for Spotify to be ready and initialize features
    const initializationInterval = setInterval(() => {
        if (isSpotifyReady()) {
            initializeSpotifuck();
            clearInterval(initializationInterval);
            
            // Start periodic updates
            startPeriodicUIUpdates();
            
            console.log(`${SCRIPT_NAME} Full initialization completed successfully`);
        }
    }, INITIALIZATION_RETRY_INTERVAL);
    
    // Initialization timeout (30 seconds)
    setTimeout(() => {
        clearInterval(initializationInterval);
        console.warn(`${SCRIPT_NAME} Initialization timeout - some features may not be available`);
    }, 30000);
    
    // Export version info for debugging
    window.SpotifuckUserscript = {
        version: '4.0.0',
        features: [
            'UI Enhancements',
            'Advanced Ad Blocking',
            'Playback Controls',
            'Client Spoofing',
            'Facebook Consent Automation',
            'Track Status Monitoring',
            'Sidebar Management',
            'Search Focus Handling',
            'Autoplay'
        ],
        controls: {
            playPause: window.actPlayPause,
            skipBack: window.actSkipBack,
            skipForward: window.actSkipForward,
            seek: window.actSeek
        }
    };
    
    console.log(`${SCRIPT_NAME} v4.0.0 loaded successfully`);
    console.log(`${SCRIPT_NAME} Available controls:`, Object.keys(window.SpotifuckUserscript.controls));
    
})();
