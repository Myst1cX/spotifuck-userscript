// ==UserScript==
// @name         Spotifuck Web Port
// @namespace    https://github.com/developer-krushna/
// @version      1.4.1-web
// @description  Full Spotifuck logic for Spotify Web Player: autoplay, custom bar, ad block, spoofing, controls, now playing
// @author       Ported by ChatGPT
// @match        https://open.spotify.com/*
// @grant        none
// ==/UserScript==

(function () {
  'use strict';

  const log = (...args) => console.log('[Spotifuck]', ...args);

  const spoofProps = () => {
    const spoofScript = document.createElement('script');
    spoofScript.textContent = `
      (() => {
        Object.defineProperty(screen, 'width', { get: () => 1920 });
        Object.defineProperty(screen, 'height', { get: () => 1080 });
        Object.defineProperty(screen, 'availWidth', { get: () => 1920 });
        Object.defineProperty(screen, 'availHeight', { get: () => 1040 });
        Object.defineProperty(window, 'innerWidth', { get: () => 1920 });
        Object.defineProperty(window, 'innerHeight', { get: () => 978 });
        Object.defineProperty(navigator, 'vendor', { get: () => 'Google Inc.' });
        Object.defineProperty(navigator, 'productSub', { get: () => '20030107' });
        Object.defineProperty(navigator, 'platform', { get: () => 'Win32' });
        Object.defineProperty(navigator, 'oscpu', { get: () => 'Windows NT 10.0; Win64; x64' });
      })();
    `;
    document.documentElement.appendChild(spoofScript);
    spoofScript.remove();
  };

  const injectStyle = () => {
    const style = document.createElement('style');
    style.textContent = `
      body { min-width: 100% !important; min-height: 100% !important; }
      #global-nav-bar > div:first-child, #global-nav-bar a[href="/download"], button[data-testid="fullscreen-mode-button"] {
        display: none !important;
      }
      aside[data-testid="now-playing-bar"] {
        min-width: 100%;
        background: #330000 !important;
      }
      aside[data-testid="now-playing-bar"] > div {
        margin-top: 2px;
        flex-direction: column;
        height: auto;
      }
      aside[data-testid="now-playing-bar"] > div > div {
        width: 100% !important;
      }
      div[data-testid="player-controls"] {
        margin: 5px 0;
      }
      div[data-testid="general-controls"] {
        margin: 15px 0 25px;
      }
      div[data-testid="general-controls"] button {
        transform: scale(1.4);
        margin: 0 8px;
      }
      button[data-testid="control-button-npv"] {
        transform: scale(1.15);
        margin: 0 5px;
      }
    `;
    document.head.appendChild(style);
  };

  const autoplayLogic = () => {
    const tryPlay = () => {
      const playBtn = document.querySelector('button[data-testid="control-button-playpause"][aria-label="Play"]');
      if (playBtn) {
        log('Autoplaying...');
        playBtn.click();
        clearInterval(playCheck);
      }
    };
    const playCheck = setInterval(tryPlay, 3000);
    setTimeout(() => clearInterval(playCheck), 20000);
  };

  const injectToggleNowPlayingButton = () => {
    const interval = setInterval(() => {
      const bar = document.querySelector('aside[data-testid="now-playing-bar"]');
      const controls = bar?.querySelector('[data-testid="player-controls"]');
      if (!controls || bar.querySelector('.npv-toggle')) return;

      const btn = document.createElement('button');
      btn.textContent = '🎵';
      btn.className = 'npv-toggle';
      btn.style.cssText = 'margin-left:8px;font-size:18px;';
      btn.onclick = () => {
        const npvBtn = document.querySelector('button[data-testid="control-button-npv"]');
        if (npvBtn) npvBtn.click();
      };
      controls.appendChild(btn);
      clearInterval(interval);
      log('Now Playing toggle button injected.');
    }, 1000);
  };

  const injectNotificationTabControls = () => {
    const interval = setInterval(() => {
      const notif = document.querySelector('[data-testid="notifications-tab"]');
      if (!notif || notif.querySelector('.notif-controls')) return;

      const container = document.createElement('div');
      container.className = 'notif-controls';
      container.style.cssText = 'margin:10px 0;display:flex;gap:10px;justify-content:center;';

      const btn = (label, testid, action) => {
        const el = document.createElement('button');
        el.textContent = label;
        el.onclick = () => {
          const target = document.querySelector(`button[data-testid="${testid}"]`);
          if (target) target.click();
        };
        return el;
      };

      container.appendChild(btn('⏮', 'control-button-skip-back'));
      container.appendChild(btn('▶️/⏸', 'control-button-playpause'));
      container.appendChild(btn('⏭', 'control-button-skip-forward'));
      notif.prepend(container);
      clearInterval(interval);
      log('Playback controls injected into notifications tab.');
    }, 2000);
  };

  const blockAudioAds = () => {
    const observer = new MutationObserver(() => {
      const audios = [...document.querySelectorAll('audio')];
      for (const audio of audios) {
        const src = audio.src || '';
        if (src.includes('.doubleclick.') || src.includes('googlesyndication') || src.includes('fastly-insights')) {
          audio.src = '';
          log('Blocked audio ad:', src);
        }
      }
    });
    observer.observe(document.body, { childList: true, subtree: true });
  };

  // Run
  spoofProps();
  injectStyle();
  autoplayLogic();
  injectToggleNowPlayingButton();
  injectNotificationTabControls();
  blockAudioAds();
})();

