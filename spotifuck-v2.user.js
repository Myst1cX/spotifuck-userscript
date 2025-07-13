// ==UserScript==
// @name         Spotifuck 2
// @namespace    https://github.com/yourname/spotifuck-userscript
// @version      2.0.0
// @description  Full Spotifuck 1.4.1 UI hack + playback control + spoof + silent ad blocking on open.spotify.com
// @author       ChatGPT (adapted from Spotifuck reverse-engineering)
// @match        https://open.spotify.com/*
// @grant        GM_addStyle
// @run-at       document-start
// @homepageURL  https://github.com/Myst1cX/spotifuck-userscript
// @supportURL   https://github.com/Myst1cX/spotifuck-userscript/issues
// @updateURL    https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck.user.js
// @downloadURL  https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck.user.js
// ==/UserScript==

(function() {
    'use strict';

    // ... [YOUR EXISTING CODE] ...

    // --- Spoof screen and navigator properties (run as early as possible) ---
    // ... [existing code unchanged] ...

    // --- Inject Spotifuck CSS hacks ---
    // ... [existing code unchanged] ...

    // --- Sidebar toggle logic ---
    // ... [existing code unchanged] ...

    // --- Inject custom styles and event listeners for sidebar buttons ---
    // ... [existing code unchanged] ...

    // --- Hide now playing bar on search focus ---
    // ... [existing code unchanged] ...

    // --- Playback control injection ---
    // ... [existing code unchanged] ...

    // --- Track status reporting (mock AndBridge) ---
    // ... [existing code unchanged] ...

    // --- Autoplay logic ---
    // ... [existing code unchanged] ...

    // --- Silent audio ad blocking by intercepting fetch() ---
    // ... [existing code unchanged] ...

    // --- Initialization ---
    // ... [existing code unchanged] ...

    // --- Wait for page content to load and inject fixes periodically ---
    // ... [existing code unchanged] ...

    // --- Spotifuck Browser Notification Playback Controls ---
    // All notification-related logic is INSIDE the main IIFE!
    if ('Notification' in window && 'serviceWorker' in navigator) {
        // Request permission ASAP
        if (Notification.permission !== 'granted' && Notification.permission !== 'denied') {
            Notification.requestPermission();
        }

        // Utility function to get current track info and cover
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

        // Service worker logic to handle notification actions
        function injectServiceWorker() {
            // Only inject if not already present
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
                // Create spotifuck-sw.js in the browser
                const blob = new Blob([swCode], { type: 'application/javascript' });
                const swUrl = URL.createObjectURL(blob);
                navigator.serviceWorker.register(swUrl, {scope: './'});
            }
        }

        // Show notification with playback controls
        function showSpotifuckNotification() {
            if (Notification.permission !== 'granted') return;

            const status = getTrackStatus();

            // Register a service worker for notification actions, if not done
            injectServiceWorker();

            navigator.serviceWorker.getRegistration().then(function(reg) {
                if (!reg) return;
                // Construct notification options (only up to 2 action buttons may show in some browsers!)
                const notifOptions = {
                    body: `${status.artist} — ${status.track}`,
                    icon: status.cover,
                    badge: status.cover,
                    image: status.cover,
                    actions: [
                        {
                            action: 'prev',
                            title: '⏮ Prev'
                        },
                        {
                            action: status.playing ? 'pause' : 'play',
                            title: status.playing ? '⏸ Pause' : '▶ Play'
                        },
                        {
                            action: 'next',
                            title: '⏭ Next'
                        }
                    ],
                    tag: 'spotifuck-player',
                    renotify: true
                };

                reg.showNotification('Spotifuck Player', notifOptions);
            });
        }

        // Listen for messages from service worker and trigger playback actions
        navigator.serviceWorker.addEventListener('message', function(event) {
            if (event.data && event.data.cmd) {
                if (event.data.cmd === 'prev') window.actSkipBack();
                if (event.data.cmd === 'toggle') window.actPlayPause();
                if (event.data.cmd === 'next') window.actSkipForward();
            }
        });

        // Show notification on track change (every 8s)
        let lastNotifState = '';
        setInterval(() => {
            const status = getTrackStatus();
            const state = `${status.track}|${status.artist}|${status.playing}`;
            if (state !== lastNotifState) {
                lastNotifState = state;
                showSpotifuckNotification();
            }
        }, 8000); // update every 8s

        // Optional: expose manual trigger
        window.showSpotifuckNotification = showSpotifuckNotification;
    }
})();
