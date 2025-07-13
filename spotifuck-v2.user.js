// ==UserScript==
// @name         Spotifuck Web Userscript (Full Port)
// @namespace    http://tampermonkey.net/
// @version      1.0.0
// @description  Full port of Spotifuck: Adblock, UI tweaks, playback bar hacks, autoplay, now playing toggle, etc.
// @author       Spotifuck Recode
// @match        https://open.spotify.com/*
// @grant        none
// @homepageURL  https://github.com/Myst1cX/spotifuck-userscript
// @supportURL   https://github.com/Myst1cX/spotifuck-userscript/issues
// @updateURL    https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-userscript-v2.user.js
// @downloadURL  https://raw.githubusercontent.com/Myst1cX/spotifuck-userscript/main/spotifuck-userscript-v2.user.js
// ==/UserScript==

(function() {
  'use strict';

  // Spoof screen/navigator
  Object.defineProperties(window.screen, {
    width: { get: () => 1920 },
    height: { get: () => 1080 },
    availWidth: { get: () => 1920 },
    availHeight: { get: () => 1040 }
  });

  Object.defineProperties(window, {
    innerWidth: { get: () => 1920 },
    innerHeight: { get: () => 978 }
  });

  Object.defineProperties(navigator, {
    vendor: { get: () => 'Google Inc.' },
    productSub: { get: () => '20030107' },
    platform: { get: () => 'Win32' },
    oscpu: { get: () => 'Windows NT 10.0; Win64; x64' }
  });

  const injectStyle = () => {
    const style = document.createElement('style');
    style.textContent = `
      main>section>div.contentSpacing{padding:0 10px!important;overflow:hidden}
      div[data-testid=track-list]>div:first-child{top:0!important;background:transparent}
      div[data-testid=now-playing-widget]{justify-content:center}
      form[role=search]{z-index:10}
      div[data-testid=now-playing-widget]>div:first-child{display:none}
      div[data-testid=now-playing-widget]>div:nth-child(2){
        display:flex;overflow:hidden
      }
      div[data-testid=now-playing-widget]>div:nth-child(2) span{
        font-size:13px!important;height:20px!important;margin:0!important
      }
      div[data-testid=now-playing-widget]>div:nth-child(2)>div{min-width:auto}
      [data-tippy-root],[data-tippy-root] *{
        transition:none!important;transform:none!important
      }
      section>div>div.contentSpacing>div{overflow:hidden}
    `;
    document.head.appendChild(style);
  };

  const waitForEl = (selector, cb) => {
    const int = setInterval(() => {
      const el = document.querySelector(selector);
      if (el) {
        clearInterval(int);
        cb(el);
      }
    }, 300);
  };

  const setupPlaybackUI = () => {
    const npb = document.querySelector('aside[data-testid=now-playing-bar]');
    if (npb) {
      npb.style.minWidth = '100%';
      npb.style.background = '#330000';

      const npc = npb.querySelector(':scope>div');
      if (npc) {
        npc.style.marginTop = '2px';
        npc.style.flexDirection = 'column';
        npc.style.height = 'auto';
        npc.querySelectorAll(':scope>div').forEach(i => i.style.width = '100%');
      }
    }

    const ctr = document.querySelector('div[data-testid=player-controls]')?.parentNode;
    if (ctr) ctr.style.margin = '5px 0';

    const gct = ctr?.querySelector('div[data-testid=general-controls]');
    if (gct) {
      gct.style.margin = '15px 0 25px';
      gct.querySelectorAll('button').forEach(i => {
        i.style.transform = 'scale(1.4)';
        i.style.margin = '0 8px';
      });
    }

    const bts = document.querySelector('button[data-testid=control-button-npv]')?.parentNode;
    if (bts) {
      bts.style.margin = '5px 0';
      bts.querySelectorAll('button').forEach(i => {
        i.style.transform = 'scale(1.15)';
        i.style.margin = '0 5px';
      });
    }

    const fs = document.querySelector('button[data-testid=fullscreen-mode-button]');
    if (fs) fs.style.display = 'none';

    const sr = document.querySelector('input[data-testid=search-input]:not(.fuckd)');
    if (sr) {
      sr.classList.add('fuckd');
      sr.addEventListener('focus', () => {
        npb.style.display = 'none';
        const cb = document.querySelector('button[data-testid=control-button-npv][aria-pressed=true]');
        if (cb) cb.click();
      });
      sr.addEventListener('blur', () => {
        npb.style.display = 'inherit';
      });
    }
  };

  const setupNowPlayingButton = () => {
    const parent = document.querySelector('div[data-testid=player-controls]');
    if (!parent || parent.querySelector('.np-toggle')) return;

    const btn = document.createElement('button');
    btn.textContent = 'Now Playing';
    btn.className = 'np-toggle';
    btn.style.marginLeft = '10px';
    btn.style.background = '#1db954';
    btn.style.color = 'white';
    btn.style.border = 'none';
    btn.style.padding = '5px 10px';
    btn.style.borderRadius = '5px';
    btn.style.cursor = 'pointer';

    btn.onclick = () => {
      const cb = document.querySelector('button[data-testid=control-button-npv]');
      if (cb) cb.click();
    };

    parent.appendChild(btn);
  };

  const setupAutoPlay = () => {
    const int = setInterval(() => {
      const pb = document.querySelector('button[data-testid=control-button-playpause][aria-label=Play]');
      if (pb) {
        pb.click();
        clearInterval(int);
      }
    }, 5000);
    setTimeout(() => clearInterval(int), 30000);
  };

  const silentAdWatcher = () => {
    const observer = new MutationObserver(() => {
      const ad = document.querySelector('audio[src*=".mp3"]:not([data-ad-checked])');
      if (ad) {
        ad.setAttribute('data-ad-checked', '1');
        ad.muted = true;
        ad.volume = 0;
        console.log('[Spotifuck] Muted possible ad audio');
      }
    });
    observer.observe(document.body, { childList: true, subtree: true });
  };

  const loopStatusPoll = () => {
    let lastState = null;
    setInterval(() => {
      const track = document.querySelector('a[data-testid=context-item-link]')?.textContent ?? '';
      const artist = document.querySelector('a[data-testid=context-item-info-artist]')?.textContent ?? '';
      const pb = document.querySelector('aside button[data-testid=control-button-playpause]');
      const playing = pb?.getAttribute('aria-label') !== 'Play';

      const range = document.querySelector('div[data-testid=playback-progressbar] input[type=range]');
      const pos = parseInt(range?.value ?? '0');
      const dur = parseInt(range?.max ?? '0');

      const cover = document.querySelector('img[data-testid=cover-art-image]')?.src;

      const currState = `${track}|${artist}|${playing}`;
      if (currState !== lastState) {
        lastState = currState;
        console.log('[Spotifuck] Now playing:', { track, artist, playing, duration: dur, position: pos, cover });
      }
    }, 1000);
  };

  const init = () => {
    injectStyle();
    waitForEl('aside[data-testid=now-playing-bar]', () => {
      setupPlaybackUI();
      setupNowPlayingButton();
      setupAutoPlay();
      silentAdWatcher();
      loopStatusPoll();
    });
  };

  // Run when DOM is ready
  if (document.readyState === 'loading') {
    document.addEventListener('DOMContentLoaded', init);
  } else {
    init();
  }
})();
