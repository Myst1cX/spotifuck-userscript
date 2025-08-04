// ==UserScript==
// @name         Spotifuck Userscript v4 - Complete Android Port
// @namespace    https://github.com/Myst1cX/spotifuck-userscript
// @version      4.3.0
// @description  Complete port of Spotifuck Android app (AppSingleton.java + R0.e.java) with full feature parity
// @author       Myst1cX (ported from Spotifuck Android app)
// @match        https://open.spotify.com/*
// @grant        GM_addStyle
// @run-at       document-start
// @homepageURL  https://github.com/Myst1cX/spotifuck-userscript
// @supportURL   https://github.com/Myst1cX/spotifuck-userscript/issues
// @updateURL    https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-v4.user.js
// @downloadURL  https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-v4.user.js
// ==/UserScript==

(function() {
    'use strict';

    // === SPOTIFUCK STATE MANAGEMENT ===
    // Port of AppSingleton.java configuration system using localStorage
    
    class SpotifuckConfig {
        constructor() {
            // Default values matching AppSingleton.java defaults
            this.serviceEnabled = this.getBoolean("ServiceOn", true);           // AppSingleton.m
            this.isLoggedIn = this.getBoolean("LoggedIn", false);               // AppSingleton.n
            this.autoPlayMode = this.getString("APlayMode", "disabled");        // AppSingleton.k 
            this.shouldCloseNowPlaying = this.getBoolean("CloseNowPlay", false); // AppSingleton.p
            this.shouldTakeControl = this.getBoolean("TakeControl", true);      // AppSingleton.o
            this.guiMode = this.getString("GuiMode", "csshack");                // AppSingleton.l
            this.androidAutoEnabled = this.getBoolean("AndAuto", true);         // AppSingleton.q
            this.swipeStopEnabled = this.getBoolean("SwipeStop", true);         // AppSingleton.r
            this.autoSleepDuration = parseInt(this.getString("AutoSleep", "0")); // AppSingleton.t
            this.forceEnglish = this.getBoolean("ForceEn", false);              // AppSingleton.s
            
            // Runtime state variables (non-persistent)
            this.mainActivityRef = null;        // AppSingleton.g (WeakReference simulation)
            this.webViewInstance = null;        // AppSingleton.j (c type WebView)
            this.webViewClientInstance = null;  // AppSingleton.w (e type)
            this.isInitialized = false;         // AppSingleton.u
        }
        
        getBoolean(key, defaultValue) {
            const stored = localStorage.getItem(`spotifuck_${key}`);
            return stored !== null ? stored === 'true' : defaultValue;
        }
        
        getString(key, defaultValue) {
            return localStorage.getItem(`spotifuck_${key}`) || defaultValue;
        }
        
        setBoolean(key, value) {
            localStorage.setItem(`spotifuck_${key}`, value.toString());
        }
        
        setString(key, value) {
            localStorage.setItem(`spotifuck_${key}`, value);
        }
        
        // Update login status - called when login is detected
        updateLoginStatus(isLoggedIn) {
            this.isLoggedIn = isLoggedIn;
            this.setBoolean("LoggedIn", isLoggedIn);
        }
    }
    
    // Global configuration instance (replaces AppSingleton static variables)
    const spotifuckState = new SpotifuckConfig();

    // === CLIENT SPOOFING ===
    // Port of R0.e.onPageStarted() - spoof screen and navigator properties
    // Matches exact values from Android WebView: 1920x1080 desktop Chrome on Windows
    function injectClientSpoofing() {
        const spoofScript = `
            (function(){
                // Screen dimensions spoofing - matches R0.e.onPageStarted
                window.screen.__defineGetter__('width', function(){return 1920;});
                window.screen.__defineGetter__('height', function(){return 1080;});
                window.screen.__defineGetter__('availWidth', function(){return 1920;});
                window.screen.__defineGetter__('availHeight', function(){return 1040;});
                
                // Window dimensions spoofing
                window.__defineGetter__('innerWidth', function(){return 1920;});
                window.__defineGetter__('innerHeight', function(){return 978;});
                
                // Navigator spoofing to match desktop Chrome
                window.navigator.__defineGetter__('vendor', function(){return 'Google Inc.';});
                window.navigator.__defineGetter__('productSub', function(){return '20030107';});
                window.navigator.__defineGetter__('platform', function(){return 'Win32';});
                window.navigator.__defineGetter__('oscpu', function(){return 'null';});
            })();
        `;
        const scriptElement = document.createElement('script');
        scriptElement.textContent = spoofScript;
        document.documentElement.appendChild(scriptElement);
        scriptElement.remove();
    }
    
    // Apply client spoofing immediately
    injectClientSpoofing();

    // === ANDBRIDGE SIMULATION ===
    // Port of android.webkit.addJavascriptInterface() functionality
    // Simulates the native Android bridge for JavaScript communication
    
    class AndBridgeSimulator {
        constructor(config) {
            this.config = config;
            this.isScreenWake = false;
            this.mediaStatusCallback = null;
            this.positionCallback = null;
        }
        
        // Wake management methods (screen wake simulation)
        wakeUp() {
            this.isScreenWake = true;
            console.log('[AndBridge] Screen wake up');
        }
        
        wakeOff() {
            this.isScreenWake = false;
            console.log('[AndBridge] Screen wake off');
        }
        
        isWoke() {
            return this.isScreenWake;
        }
        
        // Playback state management
        playLoaded() {
            console.log('[AndBridge] Play button loaded and ready');
        }
        
        manageSleep(enableSleep) {
            console.log(`[AndBridge] Sleep management: ${enableSleep ? 'enabled' : 'disabled'}`);
        }
        
        // CSS injection notification
        cssInjected() {
            console.log('[AndBridge] CSS hacks successfully injected');
        }
        
        // Login detection
        loginDetected() {
            console.log('[AndBridge] Login detected, updating state');
            this.config.updateLoginStatus(true);
        }
        
        // Message system for UI actions
        deferMessage(action) {
            console.log(`[AndBridge] Deferred message: ${action}`);
            switch(action) {
                case 'reload':
                    setTimeout(() => window.location.reload(), 1000);
                    break;
                case 'unlock':
                    console.log('[AndBridge] Player unlock requested');
                    break;
                case 'adblock':
                    console.log('[AndBridge] Ad blocked');
                    break;
            }
        }
        
        // Media status reporting (replaces native Android callbacks)
        recMediaStatus(mediaDataJson) {
            const mediaData = JSON.parse(mediaDataJson);
            console.log('[AndBridge] Media status:', mediaData);
            if (this.mediaStatusCallback) {
                this.mediaStatusCallback(mediaData);
            }
        }
        
        recMediaPosition(position) {
            console.log(`[AndBridge] Position update: ${position}ms`);
            if (this.positionCallback) {
                this.positionCallback(position);
            }
        }
    }
    
    // Global AndBridge instance
    const andBridge = new AndBridgeSimulator(spotifuckState);

    // === CORE JAVASCRIPT INJECTION SYSTEM ===
    // Port of R0.e.onPageFinished() - complex conditional JavaScript injection
    
    class SpotifuckJavaScriptInjector {
        constructor(config, bridge) {
            this.config = config;
            this.bridge = bridge;
            this.intervalIds = {
                playbackFeatures: null,    // pfint - main playback interval
                autoFeatures: null,        // afint - auto features interval  
                cssHacks: null,           // cssint - CSS hacks interval
                androidAuto: null         // aaint - android auto interval
            };
        }
        
        // Main injection method called on page finished loading
        injectMainFeatures() {
            if (!this.config.isLoggedIn) {
                this.injectLoginDetector();
                return;
            }
            
            // Build core JavaScript based on autoplay mode
            let coreScript = this.buildCorePlaybackScript();
            
            // Add auto features if enabled
            if (this.config.shouldCloseNowPlaying || this.config.shouldTakeControl || 
                this.config.autoPlayMode === "permanent") {
                coreScript += this.buildAutoFeaturesScript();
            }
            
            // Add Android Auto features if enabled
            if (this.config.androidAutoEnabled) {
                coreScript += this.buildAndroidAutoScript();
            }
            
            // Add CSS hacks if enabled
            if (this.config.guiMode === "csshack") {
                coreScript += this.buildCSSHacksScript();
                coreScript += this.buildStyleInjection();
            }
            
            // Inject the complete script
            this.executeScript(coreScript);
        }
        
        // Build core playback and control script
        buildCorePlaybackScript() {
            const autoPlayType = this.config.autoPlayMode;
            const baseScript = `
                // Global state variables (ported from R0.e.java)
                let requestedPause = false;
                let isFirstPlay = true; 
                let autoLockFlag = false;
                let firstFuckFlag = false;
                let lastMediaState = null;
                let lastPosition = null;
                let isCurrentlyPlaying = false;
                let playbackFeaturesInterval = null;
                let autoFeaturesInterval = null;
                let cssHacksInterval = null;
                let androidAutoInterval = null;
                
                // Fetch interception for tracking playback state
                const originalFetch = window.fetch;
                window.fetch = async function(...args) {
                    const [url, opts] = args;
                    const method = opts?.method?.toUpperCase?.() || 'GET';
                    
                    // Track playback state changes via PUT requests to track-playback
                    if (firstFuckFlag && url.includes('/track-playback/') && method === 'PUT') {
                        const pausedState = opts?.body ? JSON.parse(opts?.body)?.state_ref?.paused : undefined;
                        if (pausedState && isCurrentlyPlaying) {
                            console.log('#Track-Playback: Pause detected');
                            manageAllFeatures(false);
                        } else if (!pausedState && !isCurrentlyPlaying) {
                            console.log('#Track-Playback: Play detected');
                            manageAllFeatures(true);
                        }
                    }
                    
                    try {
                        const response = await originalFetch(url, opts);
                        
                        // Handle player lock detection (404 on connect-state command)
                        if (response.status === 404 && url.includes('connect-state') && 
                            url.includes('/command/from/')) {
                            AndBridge.deferMessage('reload');
                            console.log('Player locked detected - requesting reload');
                            location.reload();
                        }
                        
                        return response;
                    } catch (err) {
                        console.error('Fetch request error:', err);
                        throw err;
                    }
                };
                
                // Main playback features manager (firstFuck function from R0.e.java)
                window.initializePlaybackFeatures = function() {
                    if (playbackFeaturesInterval) clearInterval(playbackFeaturesInterval);
                    
                    playbackFeaturesInterval = setInterval(() => {
                        // Wake management for hidden tab with video
                        if (isCurrentlyPlaying && document.visibilityState === 'hidden' && 
                            !!document.querySelector('video')) {
                            AndBridge.wakeUp();
                        } else if (!AndBridge.isWoke() && document.visibilityState === 'visible' && 
                                 !document.querySelector('video')) {
                            AndBridge.wakeOff();
                        }
                        
                        // Find and initialize play/pause button
                        let playPauseButton = document.querySelector('aside button[data-testid=control-button-playpause]:not(.spotifuck-initialized)');
                        if (playPauseButton) {
                            AndBridge.playLoaded();
                            console.log('#Play button initialized');
                            playPauseButton.classList.add('spotifuck-initialized');
                            window.primaryPlayButton = playPauseButton;
                            
                            // Add click handler for unlock mechanism
                            playPauseButton.addEventListener('click', () => {
                                console.log('Play button clicked');
                                const currentLabel = playPauseButton.getAttribute('aria-label');
                                
                                if (currentLabel !== 'Play') {
                                    console.log('Pause requested by user');
                                    requestedPause = true;
                                    autoLockFlag = false;
                                    manageWakeState(false);
                                } else if (!autoLockFlag) {
                                    requestedPause = false;
                                    manageWakeState(true);
                                    console.log('Adding unlock mechanism');
                                    autoLockFlag = true;
                                    
                                    // 10-second timeout for unlock mechanism
                                    setTimeout(() => {
                                        console.log('Unlock timeout reached');
                                        if (autoLockFlag && playPauseButton.getAttribute('aria-label') === 'Play') {
                                            AndBridge.deferMessage('unlock');
                                            console.log('#Initiating unlock sequence');
                                            performSkipForward();
                                            triggerUnlockSequence();
                                        } else if (autoLockFlag) {
                                            console.log('Playing detected, removing unlock mechanism');
                                            autoLockFlag = false;
                                        }
                                    }, 10000);
                                }
                            });
                            
                            // Initialize all features on first button detection
                            if (!firstFuckFlag) {
                                firstFuckFlag = true;
                                AndBridge.manageSleep(false);
                                console.log('Initializing all Spotifuck features');
                                initializeAutoFeatures();
                                initializeCSSHacks();
                                initializeAndroidAuto();
                            }
                        }
                    }, 5000);
                };
                
                // Initialize playback features
                initializePlaybackFeatures();
                
                // Wake state management
                window.manageWakeState = function(enableWake) {
                    if (enableWake) {
                        if (document.visibilityState === 'hidden') {
                            AndBridge.wakeUp();
                        }
                    } else {
                        if (!AndBridge.isWoke() && document.visibilityState === 'visible') {
                            AndBridge.wakeOff();
                        }
                    }
                };
                
                // Global feature state management
                window.manageAllFeatures = function(isPlaying) {
                    isCurrentlyPlaying = isPlaying;
                    if (typeof updateMediaStatus === 'function') {
                        updateMediaStatus();
                    }
                    AndBridge.manageSleep(!isPlaying);
                    
                    if (isPlaying) {
                        console.log('Starting all intervals');
                        initializePlaybackFeatures();
                        initializeAutoFeatures();
                        initializeCSSHacks();
                        initializeAndroidAuto();
                    } else {
                        console.log('Stopping all intervals');
                        if (playbackFeaturesInterval) clearInterval(playbackFeaturesInterval);
                        if (autoFeaturesInterval) clearInterval(autoFeaturesInterval);
                        if (cssHacksInterval) clearInterval(cssHacksInterval);
                        if (androidAutoInterval) clearInterval(androidAutoInterval);
                    }
                };
                
                // Close Now Playing view
                window.closeNowPlayingView = function() {
                    let closeButton = document.querySelector('button[data-testid=control-button-npv][aria-pressed=true]');
                    if (closeButton) {
                        console.log('#Closing Now Playing view');
                        closeButton.click();
                    }
                };
                
                // Unlock sequence for locked players
                window.triggerUnlockSequence = function() {
                    let unlockInterval = setInterval(() => {
                        if (window.primaryPlayButton && window.primaryPlayButton.disabled) {
                            AndBridge.deferMessage('reload');
                            window.location.reload();
                        } else if (window.primaryPlayButton && 
                                 window.primaryPlayButton.getAttribute('aria-label') !== 'Play') {
                            clearInterval(unlockInterval);
                            autoLockFlag = false;
                            console.log('#Player successfully unlocked');
                        }
                    }, 3000);
                };
            `;
            
            return baseScript + this.getPlaybackControlMethods();
        }
        
        // Playback control methods (action functions from R0.e.java)
        getPlaybackControlMethods() {
            return `
                // Playback control methods (ported from R0.e.java action functions)
                window.performPlayPause = function(shouldPlay) {
                    console.log('PlayPause action:', shouldPlay);
                    if ('primaryPlayButton' in window) {
                        const currentLabel = primaryPlayButton.getAttribute('aria-label');
                        if (currentLabel === 'Play') {
                            if (shouldPlay) primaryPlayButton.click();
                        } else {
                            if (!shouldPlay) primaryPlayButton.click();
                        }
                    }
                };
                
                window.performSkipBack = function() {
                    console.log('Skip back action');
                    let skipBackButton = document.querySelector('button[data-testid=control-button-skip-back]');
                    if (skipBackButton) {
                        manageWakeState(true);
                        skipBackButton.click();
                    }
                };
                
                window.performSkipForward = function() {
                    console.log('Skip forward action');
                    let skipForwardButton = document.querySelector('button[data-testid=control-button-skip-forward]');
                    if (skipForwardButton) {
                        manageWakeState(true);
                        skipForwardButton.click();
                    }
                };
                
                window.performRepeatToggle = function() {
                    console.log('Repeat toggle action');
                    let repeatButton = document.querySelector('button[data-testid=control-button-repeat]');
                    if (repeatButton) {
                        // Update repeat mode tracking
                        if (window.currentRepeatMode === 'false') {
                            window.currentRepeatMode = 'true';
                        } else if (window.currentRepeatMode === 'true') {
                            window.currentRepeatMode = 'mixed';
                        } else {
                            window.currentRepeatMode = 'false';
                        }
                        updateMediaStatus();
                        repeatButton.click();
                    }
                };
                
                window.performAddToFavorites = function() {
                    console.log('Add to favorites action');
                    let favoriteButton = document.querySelector('div[data-testid=now-playing-widget]>div:last-child>button');
                    if (favoriteButton) {
                        if (favoriteButton.getAttribute('aria-checked') === 'false') {
                            favoriteButton.click();
                            window.currentTrackFavorited = true;
                            updateMediaStatus();
                        } else {
                            // Remove from favorites with context menu
                            favoriteButton.click();
                            let removeInterval = setInterval(() => {
                                let removeOption = document.querySelector('#context-menu button[role=menuitemcheckbox][aria-checked=true]');
                                if (removeOption) {
                                    clearInterval(removeInterval);
                                    removeOption.click();
                                    setTimeout(() => {
                                        let submitButton = document.querySelector('#context-menu button[type=submit]');
                                        if (submitButton) {
                                            submitButton.click();
                                            window.currentTrackFavorited = false;
                                            updateMediaStatus();
                                        }
                                    }, 500);
                                }
                            }, 1000);
                        }
                    }
                };
                
                window.performSeek = function(position) {
                    let progressBar = document.querySelector('div[data-testid=playback-progressbar] input[type=range]');
                    if (progressBar) {
                        progressBar.value = position;
                        progressBar.dispatchEvent(new Event('change', {bubbles: true}));
                    }
                };
            `;
        }
        
        // Build auto features script based on configuration
        buildAutoFeaturesScript() {
            let autoScript = `
                // Auto features initialization
                window.initializeAutoFeatures = function() {
                    console.log('Initializing auto features');
            `;
            
            // Add one-time autoplay for "onetime" mode
            if (this.config.autoPlayMode === "onetime") {
                autoScript += `
                    if ('primaryPlayButton' in window && isFirstPlay && 
                        primaryPlayButton.getAttribute('aria-label') === 'Play') {
                        console.log('#One-time autoplay triggered');
                        primaryPlayButton.click();
                        isFirstPlay = false;
                    }
                `;
            }
            
            // Add interval-based auto features
            if (this.config.shouldCloseNowPlaying || this.config.shouldTakeControl || 
                this.config.autoPlayMode === "permanent") {
                
                autoScript += `
                    if (autoFeaturesInterval) clearInterval(autoFeaturesInterval);
                    autoFeaturesInterval = setInterval(() => {
                `;
                
                // Close Now Playing feature
                if (this.config.shouldCloseNowPlaying) {
                    autoScript += `
                        closeNowPlayingView();
                    `;
                }
                
                // Take Control feature  
                if (this.config.shouldTakeControl) {
                    autoScript += `
                        let takeControlButton = document.querySelector('aside div.encore-bright-accent-set button');
                        if (takeControlButton) {
                            console.log('#Taking playback control');
                            takeControlButton.click();
                            setTimeout(() => {
                                let controlOption = document.querySelector('aside ul[role=list] li[role=listitem] div[role=button]');
                                if (controlOption) controlOption.click();
                            }, 500);
                        }
                    `;
                }
                
                // Permanent autoplay
                if (this.config.autoPlayMode === "permanent") {
                    autoScript += `
                        if ('primaryPlayButton' in window && !requestedPause && !autoLockFlag && 
                            primaryPlayButton.getAttribute('aria-label') === 'Play') {
                            console.log('#Permanent autoplay triggered');
                            primaryPlayButton.click();
                        }
                    `;
                }
                
                autoScript += `
                    }, 5000);
                `;
            }
            
            autoScript += '};';
            return autoScript;
        }
        
        // Login detector for non-logged-in users
        injectLoginDetector() {
            const loginScript = `
                (function() {
                    let loginButton = document.querySelector('button[data-testid=web-player-link]');
                    if (loginButton) {
                        AndBridge.loginDetected();
                        loginButton.click();
                    }
                })();
            `;
            this.executeScript(loginScript);
        }
        
        // Execute JavaScript in page context
        executeScript(scriptContent) {
            // Remove console.log statements if needed (like in original R0.e.java)
            const cleanedScript = scriptContent.replaceAll(/console\.log\('[^']+'\);/g, "");
            
            const scriptElement = document.createElement('script');
            scriptElement.textContent = cleanedScript;
            document.documentElement.appendChild(scriptElement);
            scriptElement.remove();
        }
    }
    
    // Global JavaScript injector instance
    const jsInjector = new SpotifuckJavaScriptInjector(spotifuckState, andBridge);

    // === ANDROID AUTO AND CSS FEATURES ===
    // Continue SpotifuckJavaScriptInjector class methods
    
    SpotifuckJavaScriptInjector.prototype.buildAndroidAutoScript = function() {
        if (!this.config.androidAutoEnabled) return '';
        
        return `
            // Android Auto features (media status reporting and library management)
            window.initializeAndroidAuto = function() {
                if (androidAutoInterval) clearInterval(androidAutoInterval);
                
                androidAutoInterval = setInterval(() => {
                    // Extract current track information
                    let trackElement = document.querySelector('a[data-testid=context-item-link]');
                    if (trackElement) window.currentTrack = trackElement.text;
                    else window.currentTrack = null;
                    
                    let artistElement = document.querySelector('a[data-testid=context-item-info-artist]');
                    if (!artistElement) artistElement = document.querySelector('a[data-testid=context-item-info-show]');
                    if (artistElement) window.currentArtist = artistElement.text;
                    else window.currentArtist = '';
                    
                    // Extract repeat mode
                    let repeatButton = document.querySelector('button[data-testid=control-button-repeat]');
                    if (repeatButton) window.currentRepeatMode = repeatButton.getAttribute('aria-checked');
                    else window.currentRepeatMode = 'false';
                    
                    // Extract favorite status
                    let favoriteButton = document.querySelector('div[data-testid=now-playing-widget]>div:last-child>button');
                    if (favoriteButton && favoriteButton.getAttribute('aria-checked') === 'true') {
                        window.currentTrackFavorited = true;
                    } else {
                        window.currentTrackFavorited = false;
                    }
                    
                    // Extract playback position and duration
                    let progressBar = document.querySelector('div[data-testid=playback-progressbar] input[type=range]');
                    if (progressBar) {
                        window.currentDuration = parseInt(progressBar.getAttribute('max'));
                        window.currentPosition = parseInt(progressBar.getAttribute('value'));
                    } else {
                        window.currentDuration = null;
                        window.currentPosition = null;
                    }
                    
                    // Extract cover art
                    let coverImage = document.querySelector('img[data-testid=cover-art-image]');
                    if (coverImage) window.currentCoverArt = coverImage.src;
                    else window.currentCoverArt = null;
                    
                    // Update media status
                    updateMediaStatus();
                }, 2000);
                
                // Media status update function
                window.updateMediaStatus = function() {
                    const currentState = currentTrack + '|' + currentArtist + '|' + isCurrentlyPlaying + '|' + 
                                       currentRepeatMode + '|' + currentTrackFavorited;
                    
                    if (currentState !== lastMediaState) {
                        lastMediaState = currentState;
                        const mediaValues = {
                            artist: currentArtist,
                            track: currentTrack,
                            playing: isCurrentlyPlaying,
                            repeat: currentRepeatMode,
                            fav: currentTrackFavorited,
                            duration: currentDuration,
                            position: currentPosition,
                            cover: currentCoverArt
                        };
                        AndBridge.recMediaStatus(JSON.stringify(mediaValues));
                    } else {
                        // Report position changes if significant (>4 seconds)
                        if (Math.abs(currentPosition - lastPosition) > 4000) {
                            AndBridge.recMediaPosition(currentPosition);
                        }
                        lastPosition = currentPosition;
                    }
                };
                
                // Media library building and playback
                window.buildAndPlayMedia = function(index = -1) {
                    if (!window.libraryButton.querySelector(':scope>h1')) {
                        window.libraryButton.click();
                    }
                    
                    let mediaInterval = setInterval(() => {
                        if (document.querySelector('div[role=grid] div[role=gridcell]>div button')) {
                            clearInterval(mediaInterval);
                            console.log('Building media library');
                            
                            let libraryRows = document.querySelectorAll('div[role=grid] div[role=gridcell]>div');
                            let titles = [], kinds = [], images = [], buttons = [];
                            
                            Array.from(libraryRows).forEach(node => {
                                const img = node.querySelector('img');
                                const btn = node.querySelector('button');
                                if (img) {
                                    titles.push(img.alt);
                                    
                                    // Extract media type from aria-labelledby
                                    let kind = node.getAttribute('aria-labelledby');
                                    if (kind && (match = kind.match(/listrow-title-spotify:([^:]+):/))) {
                                        kinds.push((match[1].charAt(0).toUpperCase() + match[1].slice(1)).replace('Collection', 'Playlist'));
                                    } else {
                                        kinds.push('-');
                                    }
                                    
                                    images.push(img.src);
                                    buttons.push(btn);
                                }
                            });
                            
                            window.mediaInfo = {titles, kinds, images};
                            
                            if (index === -1) {
                                window.libraryButton.click();
                            } else {
                                manageWakeState(true);
                                buttons[index].click();
                            }
                        }
                    }, 500);
                };
            };
        `;
    };
    
    SpotifuckJavaScriptInjector.prototype.buildCSSHacksScript = function() {
        if (this.config.guiMode !== "csshack") return '';
        
        return `
            // CSS hacks and UI modifications
            window.initializeCSSHacks = function() {
                if (cssHacksInterval) clearInterval(cssHacksInterval);
                
                cssHacksInterval = setInterval(function() {
                    // Library button initialization and toggle
                    let libraryButton = document.querySelector('#Desktop_LeftSidebar_Id header>div>div:first-child button:not(.spotifuck-library-init)');
                    if (libraryButton) {
                        console.log('Initializing library button');
                        window.libraryButton = libraryButton;
                        libraryButton.classList.add('spotifuck-library-init', 'spotifuck-library-btn');
                        libraryButton.style.padding = '0';
                        libraryButton.style.height = '20px';
                        libraryButton.addEventListener('click', function() {
                            setTimeout(() => toggleLeftSidebar(), 0);
                        });
                        toggleLeftSidebar();
                        AndBridge.cssInjected();
                    }
                    
                    // Library grid auto-close functionality
                    let libraryGrid = document.querySelector('#Desktop_LeftSidebar_Id div[role=grid]:not(.spotifuck-grid-init)');
                    if (libraryGrid) {
                        libraryGrid.classList.add('spotifuck-grid-init');
                        libraryGrid.addEventListener('click', () => {
                            setTimeout(() => {
                                console.log('Auto-closing library');
                                window.libraryButton.click();
                                closeNowPlayingView();
                            }, 0);
                        });
                    }
                    
                    // Home button click handler
                    let homeButton = document.querySelector('#global-nav-bar button[data-testid=home-button]:not(.spotifuck-home-init)');
                    if (homeButton) {
                        homeButton.classList.add('spotifuck-home-init');
                        homeButton.addEventListener('click', () => {
                            closeNowPlayingView();
                        });
                    }
                    
                    // Search input focus/blur handlers
                    let searchInput = document.querySelector('input[data-testid=search-input]:not(.spotifuck-search-init)');
                    if (searchInput) {
                        searchInput.classList.add('spotifuck-search-init');
                        searchInput.addEventListener('focus', () => {
                            let nowPlayingBar = document.querySelector('aside[data-testid=now-playing-bar]');
                            if (nowPlayingBar) nowPlayingBar.style.display = 'none';
                            closeNowPlayingView();
                        });
                        searchInput.addEventListener('blur', () => {
                            let nowPlayingBar = document.querySelector('aside[data-testid=now-playing-bar]');
                            if (nowPlayingBar) nowPlayingBar.style.display = 'flex';
                        });
                    }
                    
                    // User widget click handler
                    let userButton = document.querySelector('button[data-testid=user-widget-link]:not(.spotifuck-user-init)');
                    if (userButton) {
                        userButton.classList.add('spotifuck-user-init');
                        userButton.addEventListener('click', () => {
                            closeNowPlayingView();
                        });
                    }
                }, 5000);
                
                // Sidebar toggle functionality
                window.toggleLeftSidebar = function() {
                    let leftSidebar = document.querySelector('#Desktop_LeftSidebar_Id');
                    if (leftSidebar) {
                        let navFirstChild = leftSidebar.querySelector('nav>div>div:first-child');
                        let isExpanded = navFirstChild.classList.length === 2;
                        
                        if (isExpanded) {
                            console.log('Expanding sidebar');
                            leftSidebar.style.position = 'fixed';
                            leftSidebar.style.width = '100%';
                            leftSidebar.style.height = '92%';
                            leftSidebar.style.left = '0';
                            leftSidebar.style.zIndex = '20';
                            let libraryHeader = leftSidebar.querySelector('header>div>div:first-child h1');
                            libraryHeader.innerText = '✖ Close Library';
                        } else {
                            console.log('Collapsing sidebar');
                            leftSidebar.style.zIndex = '1';
                            leftSidebar.style.position = 'fixed';
                            leftSidebar.style.top = '2px';
                            leftSidebar.style.left = '60px';
                            leftSidebar.style.width = '50px';
                            leftSidebar.style.height = '40px';
                        }
                    }
                };
            };
        `;
    };
    
    SpotifuckJavaScriptInjector.prototype.buildStyleInjection = function() {
        if (this.config.guiMode !== "csshack") return '';
        
        return `
            // Inject comprehensive CSS styles
            let styleElement = document.createElement('style');
            styleElement.textContent = 'body{min-width:100%!important;min-height:100%!important} .os-scrollbar{--os-size:6px!important} .contentSpacing{padding:0} div[data-testid=root]{--panel-gap:0!important} #main-view+div{overflow:hidden!important;} div[data-encore-id=banner],#global-nav-bar>div:first-of-type,#global-nav-bar a[href="/download"],button[data-testid=fullscreen-mode-button],div.main-view-container__mh-footer-container{display:none!important} section[data-testid=artist-page]>div>div:first-child:not([data-encore-id]){height:25vh} div[data-testid=tracklist-row]{padding:0 10px 0 0;grid-gap:0} div[data-testid=tracklist-row] button:not([data-testid=add-to-playlist-button]){transform:scale(1.3)!important;opacity:0.6!important} div[data-testid=tracklist-row] button:{-webkit-margin-end:0!important} div[data-testid=tracklist-row] button:hover{color:#2d6!important} div[data-testid=tracklist-row]>div:first-child>div:first-child{height:24px;min-height:24px;min-width:24px;margin:0 8px!important} [aria-colcount="3"] div[data-testid=tracklist-row]{grid-template-columns:[index] var(--tracklist-index-column-width,40px) [first] minmax(120px,var(--col1,4fr)) [last] minmax(82px,var(--col2,1fr))!important} [aria-colcount="4"] div[data-testid=tracklist-row]{grid-template-columns:[index] var(--tracklist-index-column-width,40px) [first] minmax(120px,var(--col1,4fr)) [var1] minmax(120px,var(--col2,2fr)) [last] minmax(82px,var(--col3,1fr))!important} [aria-colcount="5"] div[data-testid=tracklist-row]{grid-template-columns:[index] var(--tracklist-index-column-width,40px) [first] minmax(120px,var(--col1,6fr)) [var1] minmax(120px,var(--col2,4fr)) [var2] minmax(120px,var(--col3,3fr)) [last] minmax(82px,var(--col4,1fr))!important} section[data-testid=track-page]>div.contentSpacing>div:nth-child(2) [aria-colcount="2"] div[data-testid=tracklist-row]{grid-template-columns:[first] minmax(120px,var(--col0,4fr)) [last] minmax(82px,var(--col1,1fr))!important} section[data-testid=track-page]>div.contentSpacing>div:nth-child(2) [aria-colcount="3"] div[data-testid=tracklist-row]{grid-template-columns:[first] minmax(120px,var(--col0,4fr)) [var1] minmax(120px,var(--col1,2fr)) [last] minmax(82px,var(--col2,1fr))!important} *{--content-spacing:10px} section[data-testid=home-page] .contentSpacing{padding:0 10px!important;overflow:hidden} div[data-testid=grid-container]{margin-inline:0!important;column-gap:0!important;overflow:hidden!important} div[data-testid=action-bar-row],div[data-testid=topbar-content]{padding:5px 10px} div[data-testid=track-list]>div:first-child,div[data-testid=playlist-tracklist]>div:first-child{margin:0!important;padding:0!important} main>section:not([data-testid=artist-page])>div:first-child{height:auto!important;min-height:auto!important;padding:10px} section[data-testid=track-page]>div>div.contentSpacing>div:last-child{overflow:hidden} section[data-testid=artist-page]>div>div:first-child>div.contentSpacing{padding:10px} section[data-testid=artist-page] div[data-testid=grid-container] h2,section[data-testid=artist-page] section[data-testid=component-shelf]{padding:0 10px} main>section h1.encore-text-headline-large{font-size:22px!important} section[data-testid=artist-page] span.encore-text-headline-large{font-size:26px!important} section[data-testid=track-page] h1{font-size:20px!important} aside[data-testid=now-playing-bar]{min-width:100%!important;box-shadow:0 0 6px #440000;background:linear-gradient(to bottom,#770000,#330000)!important} aside[data-testid=now-playing-bar]>div:first-child{margin-top:2px;flex-direction:column!important;height:auto!important} aside[data-testid=now-playing-bar]>div>div{width:100%!important} aside[data-testid=now-playing-bar]>div>div:last-child>div{min-height:32px;margin:5px 10px} aside[data-testid=now-playing-bar]>div>div:last-child button{transform:scale(1.15);margin:0 5px} div[data-testid=general-controls]{margin:15px 0 25px} div[data-testid=general-controls] button{transform:scale(1.4)!important;margin:0 8px!important} div[data-testid=player-controls]{margin:5px 0} div[data-testid=now-playing-widget]{justify-content:center;overflow:hidden} form[role=search]{z-index:10;margin-left:50px} div[data-testid=now-playing-widget]>div:last-child>button{transform:scale(1.3)} div[data-testid=now-playing-widget]>div:first-child{display:none!important} div[data-testid=now-playing-widget]>div:nth-child(2){display:flex!important;overflow:hidden!important} div[data-testid=now-playing-widget]>div:nth-child(2) span{font-size:13px!important;height:20px!important;margin:0!important} div[data-testid=now-playing-widget]>div:nth-child(2)>div{min-width:auto;max-width:66%} [data-tippy-root],[data-tippy-root] *{transition:none!important;transform:none!important;overflow:hidden!important} div[data-testid=hover-or-focus-tooltip],#Desktop_LeftSidebar_Id header>div>div:last-child{display:none!important} ';
            document.head.appendChild(styleElement);
        `;
    };

    // === AD BLOCKING SYSTEM ===
    // Port of R0.e.shouldInterceptRequest() - comprehensive ad blocking
    
    class SpotifuckAdBlocker {
        constructor(bridge) {
            this.bridge = bridge;
            this.silentAudioBlob = this.createSilentAudio();
            this.originalFetch = window.fetch;
            this.setupFetchInterception();
        }
        
        // Create silent audio blob for ad replacement
        createSilentAudio() {
            // Create minimal WAV header for silent audio
            const buffer = new ArrayBuffer(44);
            const view = new DataView(buffer);
            
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
            view.setUint32(24, 8000, true);
            view.setUint32(28, 8000, true);
            view.setUint16(32, 1, true);
            view.setUint16(34, 8, true);
            writeString(36, 'data');
            view.setUint32(40, 0, true);
            
            return new Blob([buffer], { type: 'audio/wav' });
        }
        
        // Setup fetch interception for ad blocking
        setupFetchInterception() {
            window.fetch = async (...args) => {
                const [resource, init] = args;
                const url = (typeof resource === 'string') ? resource : resource.url;
                
                if (this.shouldBlockRequest(url)) {
                    this.bridge.deferMessage('adblock');
                    console.log('[AdBlock] Blocked:', url);
                    
                    // Return silent audio for audio ad requests
                    if (url.includes('audio/mpeg') || url.includes('.mp3')) {
                        return new Response(this.silentAudioBlob, {
                            status: 200,
                            statusText: 'OK',
                            headers: { 
                                'Content-Type': 'audio/wav',
                                'Access-Control-Allow-Origin': '*'
                            }
                        });
                    }
                    
                    // Return empty response for other ad requests
                    return new Response(new ArrayBuffer(0), {
                        status: 200,
                        statusText: 'OK',
                        headers: { 
                            'Content-Type': 'text/plain',
                            'Access-Control-Allow-Origin': '*'
                        }
                    });
                }
                
                // Let non-ad requests through
                return this.originalFetch.apply(this, args);
            };
        }
        
        // Check if request should be blocked (port of R0.e.shouldInterceptRequest logic)
        shouldBlockRequest(url) {
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
            
            // Block known ad domains
            for (const domain of adDomains) {
                if (url.includes(domain)) {
                    return true;
                }
            }
            
            // Block audio ads (but allow legitimate content)
            if (url.includes('audio/mpeg') || url.includes('.mp3')) {
                const allowedAudioSources = [
                    'podz-content',
                    'gew4-spclient'
                ];
                
                // Don't block allowed audio sources
                for (const allowed of allowedAudioSources) {
                    if (url.includes(allowed)) {
                        return false;
                    }
                }
                
                // Block audio from ad-related paths
                const adAudioPaths = [
                    'akamaized.net/audio/',
                    'scdn.co/audio/',
                    'scdn.co/mp3-ad/',
                    'spotifycdn.com/audio/'
                ];
                
                for (const adPath of adAudioPaths) {
                    if (url.includes(adPath)) {
                        return true;
                    }
                }
            }
            
            return false;
        }
    }

    // === MAIN INITIALIZATION ===
    // Port of WebView initialization and page lifecycle management
    
    class SpotifuckApp {
        constructor() {
            this.config = spotifuckState;
            this.bridge = andBridge;
            this.injector = jsInjector;
            this.adBlocker = new SpotifuckAdBlocker(this.bridge);
            this.isInitialized = false;
            
            // Expose AndBridge to global scope for injected scripts
            window.AndBridge = this.bridge;
        }
        
        // Main initialization - called when page is ready
        initialize() {
            if (this.isInitialized) return;
            
            console.log('[Spotifuck] Initializing complete Android app port...');
            
            // Inject main features based on login status
            this.injector.injectMainFeatures();
            
            // Set up periodic re-injection for dynamic content
            this.setupPeriodicInjection();
            
            this.isInitialized = true;
            console.log('[Spotifuck] Initialization complete');
        }
        
        // Setup periodic injection to handle dynamic content loading
        setupPeriodicInjection() {
            // Re-inject features every 10 seconds to handle page navigation
            setInterval(() => {
                if (document.querySelector('#Desktop_LeftSidebar_Id')) {
                    this.injector.injectMainFeatures();
                }
            }, 10000);
        }
        
        // Handle Facebook consent pages (from R0.e.java)
        handleFacebookConsent() {
            if (window.location.href.startsWith('https://www.facebook.com/privacy/consent/gdp/')) {
                const consentButton = document.querySelector('#facebook div[role=button]');
                if (consentButton) {
                    consentButton.click();
                    console.log('[Spotifuck] Facebook consent handled');
                }
            }
        }
    }
    
    // Global app instance
    const spotifuckApp = new SpotifuckApp();

    // === LIFECYCLE MANAGEMENT ===
    // Handle page loading states and initialization timing
    
    // Handle immediate initialization for early loading
    if (document.readyState === 'loading') {
        document.addEventListener('DOMContentLoaded', () => {
            setTimeout(() => spotifuckApp.initialize(), 1000);
        });
    } else {
        setTimeout(() => spotifuckApp.initialize(), 1000);
    }
    
    // Handle Facebook consent on page load
    document.addEventListener('DOMContentLoaded', () => {
        spotifuckApp.handleFacebookConsent();
    });
    
    // Re-initialize on navigation changes (SPA behavior)
    let lastUrl = location.href;
    new MutationObserver(() => {
        const url = location.href;
        if (url !== lastUrl) {
            lastUrl = url;
            console.log('[Spotifuck] Navigation detected, re-initializing...');
            setTimeout(() => {
                spotifuckApp.handleFacebookConsent();
                spotifuckApp.injector.injectMainFeatures();
            }, 2000);
        }
    }).observe(document, { subtree: true, childList: true });

})();
