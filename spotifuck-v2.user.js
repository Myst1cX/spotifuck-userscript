// ==UserScript==
// @name         Spotifuck 4
// @namespace    https://github.com/yourname/spotifuck-userscript
// @version      4.0.0
// @description  Full Spotifuck 1.4.1 UI hack + playback control + spoof + silent ad blocking on open.spotify.com
// @author       ChatGPT (adapted from Spotifuck reverse-engineering)
// @match        https://open.spotify.com/*
// @grant        GM_addStyle
// @run-at       document-start
// @homepageURL  https://github.com/Myst1cX/spotifuck-userscript
// @supportURL   https://github.com/Myst1cX/spotifuck-userscript/issues
// @updateURL    https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-v2.user.js
// @downloadURL  https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-v2.user.js
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
        body {
            min-width: 100% !important;
            min-height: 100% !important;
        }
        div[data-testid="root"] {
            --panel-gap: 0 !important;
        }
        #global-nav-bar > div:first-of-type,
        #global-nav-bar a[href="/download"],
        #Desktop_LeftSidebar_Id header > div > div:last-child,
        div.main-view-container__mh-footer-container,
        button[data-testid="fullscreen-mode-button"] {
            display: none !important;
        }
        aside[data-testid="now-playing-bar"] {
            min-width: 100% !important;
            background: #330000 !important;
        }
        aside[data-testid="now-playing-bar"] > div {
            margin-top: 2px !important;
            flex-direction: column !important;
            height: auto !important;
        }
        aside[data-testid="now-playing-bar"] > div > div {
            width: 100% !important;
        }
        div[data-testid="player-controls"] {
            margin: 5px 0 !important;
        }
        div[data-testid="general-controls"] button {
            transform: scale(1.4) !important;
            margin: 0 8px !important;
        }
        button[data-testid="control-button-npv"] {
            transform: scale(1.15) !important;
            margin: 0 5px !important;
        }
        main > section > div.contentSpacing {
            padding: 0 10px !important;
            overflow: hidden !important;
        }
        div[data-testid="track-list"] > div:first-child {
            top: 0 !important;
            background: transparent !important;
        }
        div[data-testid="now-playing-widget"] {
            justify-content: center !important;
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
        }
        [data-tippy-root],
        [data-tippy-root] * {
            transition: none !important;
            transform: none !important;
        }
        section > div > div.contentSpacing > div {
            overflow: hidden !important;
        }
        form[role="search"] {
            z-index: 10 !important;
        }
    `);

    // --- Sidebar toggle logic ---
    function switchLs() {
        const ls = document.querySelector('#Desktop_LeftSidebar_Id');
        if (!ls) return;
        const navFirstChild = ls.querySelector('nav > div > div:first-child');
        if (!navFirstChild) return;
        const exp = navFirstChild.classList.length;
        if (exp === 2) {
            // Expanded
            ls.style.position = 'fixed';
            ls.style.width = '100%';
            ls.style.height = '92%';
            ls.style.left = '0';
            ls.style.zIndex = '20';
            const lh = ls.querySelector('header > div > div:first-child h1');
            if (lh) lh.innerText = '✖ Close Library';
        } else {
            // Collapsed
            ls.style.zIndex = '1';
            ls.style.position = 'fixed';
            ls.style.top = '2px';
            ls.style.left = '120px';
            ls.style.width = '50px';
            ls.style.height = '40px';
        }
    }

    // --- Inject custom styles and event listeners for sidebar buttons ---
    function injectSidebarFixes() {
        // Prevent double-inject
        if (document.querySelector('#Desktop_LeftSidebar_Id .fuckd')) return;

        const lb = document.querySelector('#Desktop_LeftSidebar_Id header > div > div:first-child button:not(.fuckd)');
        if (lb) {
            lb.classList.add('fuckd');
            lb.style.padding = '0';
            lb.style.height = '20px';
            lb.addEventListener('click', () => setTimeout(switchLs, 0));
            switchLs();
        }

        const lbit = document.querySelector('#Desktop_LeftSidebar_Id div[role=grid]:not(.fuckd)');
        if (lbit) {
            lbit.classList.add('fuckd');
            lbit.addEventListener('click', () => setTimeout(() => {
                const lbb = document.querySelector('button.fuckd');
                if (lbb) lbb.click();
            }, 0));
        }

        const cb = document.querySelector('#Desktop_LeftSidebar_Id header > div > div:last-child');
        if (cb) cb.style.display = 'none';

        const ft = document.querySelector('div.main-view-container__mh-footer-container');
        if (ft) ft.style.display = 'none';
    }

    // --- Hide now playing bar on search focus ---
    function addSearchFocusListeners() {
        const sr = document.querySelector('input[data-testid=search-input]:not(.fuckd)');
        if (!sr) return;
        sr.classList.add('fuckd');
        sr.addEventListener('focus', () => {
            const npb = document.querySelector('aside[data-testid=now-playing-bar]');
            if (npb) npb.style.display = 'none';
            const cb = document.querySelector('button[data-testid=control-button-npv][aria-pressed=true]');
            if (cb) cb.click();
        });
        sr.addEventListener('blur', () => {
            const npb = document.querySelector('aside[data-testid=now-playing-bar]');
            if (npb) npb.style.display = 'inherit';
        });
    }

    // --- Playback control injection ---
    window.actPlayPause = function(play) {
        const pb = document.querySelector('aside button[data-testid=control-button-playpause]');
        if (!pb) return;
        const ariaLabel = pb.getAttribute('aria-label');
        if (ariaLabel === 'Play') {
            if (play === undefined || play) pb.click();
        } else {
            if (play === undefined || !play) pb.click();
        }
    };
    window.actSkipBack = function() {
        const bb = document.querySelector('button[data-testid=control-button-skip-back]');
        if (bb) bb.click();
    };
    window.actSkipForward = function() {
        const fb = document.querySelector('button[data-testid=control-button-skip-forward]');
        if (fb) fb.click();
    };
    window.actSeek = function(pos) {
        const rg = document.querySelector('div[data-testid=playback-progressbar] input[type=range]');
        if (!rg) return;
        rg.value = pos;
        rg.dispatchEvent(new Event('change', { bubbles: true }));
    };

    function updateMediaSession() {
    const track = document.querySelector('a[data-testid=context-item-link]');
    const artist = document.querySelector('a[data-testid=context-item-info-artist]');
    const cover = document.querySelector('img[data-testid=cover-art-image]');
    const pb = document.querySelector('aside button[data-testid=control-button-playpause]');
    const playing = pb && pb.getAttribute('aria-label') !== 'Play';

    if ('mediaSession' in navigator) {
        navigator.mediaSession.metadata = new window.MediaMetadata({
            title: track ? track.text : 'No Track',
            artist: artist ? artist.text : 'No Artist',
            album: '', // Optional, set if you want
            artwork: cover ? [{ src: cover.src, sizes: '512x512', type: 'image/png' }] : []
        });

        navigator.mediaSession.playbackState = playing ? "playing" : "paused";

        navigator.mediaSession.setActionHandler('play',    () => window.actPlayPause(true));
        navigator.mediaSession.setActionHandler('pause',   () => window.actPlayPause(false));
        navigator.mediaSession.setActionHandler('previoustrack', window.actSkipBack);
        navigator.mediaSession.setActionHandler('nexttrack',     window.actSkipForward);
        // You can also add seek handlers if needed
    }
}

// Keep media session updated on track change
setInterval(updateMediaSession, 2000);
    
    // --- Track status reporting (mock AndBridge) ---
    (function trackStatusReporter() {
        let lastState = null;
        setInterval(() => {
            const ta = document.querySelector('a[data-testid=context-item-link]');
            const track = ta ? ta.text : null;
            const aa = document.querySelector('a[data-testid=context-item-info-artist]');
            const artist = aa ? aa.text : null;
            const pb = document.querySelector('aside button[data-testid=control-button-playpause]');
            const playing = pb && pb.getAttribute('aria-label') !== 'Play';
            const rg = document.querySelector('div[data-testid=playback-progressbar] input[type=range]');
            const duration = rg ? parseInt(rg.getAttribute('max')) : null;
            const position = rg ? parseInt(rg.value) : null;
            const im = document.querySelector('img[data-testid=cover-art-image]');
            const cover = im ? im.src : null;
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
            const pb = document.querySelector('aside button[data-testid=control-button-playpause][aria-label=Play]');
            if (pb && !playClicked) {
                pb.click();
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
        addSearchFocusListeners();
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
        addSearchFocusListeners();
    }, 5000);

    // --- Spotifuck Browser Notification Playback Controls ---
    if ('Notification' in window && 'serviceWorker' in navigator) {
        if (Notification.permission !== 'granted' && Notification.permission !== 'denied') {
            Notification.requestPermission();
        }

        function getTrackStatus() {
            const track = document.querySelector('a[data-testid=context-item-link]');
            const artist = document.querySelector('a[data-testid=context-item-info-artist]');
            const pb = document.querySelector('aside button[data-testid=control-button-playpause]');
            const playing = pb && pb.getAttribute('aria-label') !== 'Play';
            const cover = document.querySelector('img[data-testid=cover-art-image]');
            return {
                track: track ? track.text : 'No Track',
                artist: artist ? artist.text : 'No Artist',
                playing,
                cover: cover ? cover.src : 'https://open.spotify.com/favicon.ico'
            };
        }

        function injectServiceWorker() {
            if (!window._spotifuck_sw_injected) {
                window._spotifuck_sw_injected = true;
                const swCode = `
self.addEventListener('notificationclick', function(event) {
    event.notification.close();
    if (event.action === 'prev') {
        self.clients.matchAll().then(function(clients) {
            clients.forEach(function(client) {
                client.postMessage({cmd: 'prev'});
            });
        });
    } else if (event.action === 'play' || event.action === 'pause') {
        self.clients.matchAll().then(function(clients) {
            clients.forEach(function(client) {
                client.postMessage({cmd: 'toggle'});
            });
        });
    } else if (event.action === 'next') {
        self.clients.matchAll().then(function(clients) {
            clients.forEach(function(client) {
                client.postMessage({cmd: 'next'});
            });
        });
    }
}, false);
`;
                const blob = new Blob([swCode], { type: 'application/javascript' });
                const swUrl = URL.createObjectURL(blob);
                navigator.serviceWorker.register(swUrl, {scope: './'});
            }
        }

        function showSpotifuckNotification() {
            if (Notification.permission !== 'granted') return;
            injectServiceWorker();
            const status = getTrackStatus();
            navigator.serviceWorker.getRegistration().then(function(reg) {
                if (!reg) return;
                const notifOptions = {
                    body: `${status.artist} — ${status.track}`,
                    icon: status.cover,
                    badge: status.cover,
                    image: status.cover,
                    actions: [
                        { action: 'prev', title: '⏮ Prev' },
                        { action: status.playing ? 'pause' : 'play', title: status.playing ? '⏸ Pause' : '▶ Play' },
                        { action: 'next', title: '⏭ Next' }
                    ],
                    tag: 'spotifuck-player',
                    renotify: true
                };
                reg.showNotification('Spotifuck Player', notifOptions);
            });
        }

        navigator.serviceWorker.addEventListener('message', function(event) {
            if (event.data && event.data.cmd) {
                if (event.data.cmd === 'prev') window.actSkipBack();
                if (event.data.cmd === 'toggle') window.actPlayPause();
                if (event.data.cmd === 'next') window.actSkipForward();
            }
        });

        let lastNotifState = '';
        setInterval(() => {
            const status = getTrackStatus();
            const state = `${status.track}|${status.artist}|${status.playing}`;
            if (state !== lastNotifState) {
                lastNotifState = state;
                showSpotifuckNotification();
            }
        }, 8000);

        window.showSpotifuckNotification = showSpotifuckNotification;
    }
})();
