/*
 * Decompiled with Procyon 0.5.36.
 */
package R0;

import java.net.URLConnection;
import android.view.View;
import java.util.Iterator;
import android.util.Log;
import java.io.InputStream;
import java.util.Map;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map$Entry;
import java.net.URL;
import java.net.HttpURLConnection;
import android.webkit.WebResourceResponse;
import android.webkit.WebResourceRequest;
import android.content.Context;
import android.graphics.Bitmap;
import Q0.E;
import it.deviato.spotifuck.AppSingleton;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public final class e extends WebViewClient
{
    public final void onPageFinished(final WebView webView, String s) {
        super.onPageFinished(webView, s);
        if (s.startsWith("https://www.facebook.com/privacy/consent/gdp/")) {
            webView.evaluateJavascript("(function(){document.querySelector('#facebook div[role=button]').click();})();", (ValueCallback)null);
        }
        if (AppSingleton.n) {
            if (AppSingleton.k.equals("onetime")) {
                s = "let reqPause=false,firstPlay=true,alFlag=false,ffFlag=false;lastState=null;lastPos=null;playing=false;pfint=null;afint=null;cssint=null;aaint=null;const oriFetch=window.fetch;window.fetch=async function(...args) {  const [url,opts]=args;  const ts=new Date().toLocaleTimeString();  const method=opts?.method?.toUpperCase?.()||'GET';  if(ffFlag&&url.includes('/track-playback/')&&method==='PUT') {    const paused=opts?.body?JSON.parse(opts?.body)?.state_ref?.paused:undefined;    if(paused&&playing) { console.log('#Track-Playback: Pause'); manageAll(false); }    else if(!paused&&!playing) { console.log('#Track-Playback: Play'); manageAll(true); }  }  try {    const resp=await oriFetch(url,opts);    if(resp.status===404&&url.includes('connect-state')&&url.includes('/command/from/')) {      AndBridge.deferMessage('reload');      console.log('Player Locked: reload');      location.reload();    }    return resp;  } catch(err) {    console.error('Error in Fetch Request:',err);    throw err;  }};window.firstFuck=function(){ if(pfint) clearInterval(pfint); pfint=setInterval(()=>{  /*console.log('pf_tick');*/  if(playing&&document.visibilityState=='hidden'&&!!document.querySelector('video')) AndBridge.wakeUp();  else if(!AndBridge.isWoke()&&document.visibilityState=='visible'&&!document.querySelector('video')) AndBridge.wakeOff();  let pb=document.querySelector('aside button[data-testid=control-button-playpause]:not(.fuckd)');  if(pb) {    AndBridge.playLoaded();    console.log('#pBtn fuckd');    pb.classList.add('fuckd');    window.pBtn=pb;    pBtn.addEventListener('click',()=>{      console.log('PlayClicked');      if(pBtn.getAttribute('aria-label')!=='Play') {        console.log('Pause Req');        reqPause=true;        alFlag=false;        manageWake(false);      }      else if(!alFlag) {        reqPause=false;        manageWake(true);        console.log('Adding Unlocker');        alFlag=true;        setTimeout(()=>{          console.log('Unlocker Timeout Reached');          if(alFlag&&pBtn.getAttribute('aria-label')==='Play') {            AndBridge.deferMessage('unlock');            console.log('#Unlocking!');            actSkipForward();            trigUnlock();          }          else if(alFlag) {            console.log('Playing, Removing Unlocker');            alFlag=false;          }        },10000);      }    });    if(!ffFlag){      ffFlag=true;      AndBridge.manageSleep(false);      console.log('FirstFuck Adding All Features');      addAutoFeatures(); addCSSJSHack(); addAndAuto();    }  } },5000);};firstFuck();window.manageWake=function(enable){  if(enable) {    if(document.visibilityState=='hidden') AndBridge.wakeUp();  }  else {    if(!AndBridge.isWoke()&&document.visibilityState=='visible') AndBridge.wakeOff();  }};window.manageAll=function(play){  playing=play;  typeof updMedia==='function'&&updMedia();  AndBridge.manageSleep(!play);  if(start) {    console.log('StartingIntervals');    firstFuck(); addAutoFeatures(); addCSSJSHack(); addAndAuto();  }  else {    console.log('KillingIntervals');    if(pfint) clearInterval(pfint);    if(afint) clearInterval(afint);    if(cssint) clearInterval(cssint);    if(aaint) clearInterval(aaint);  }};window.closeNowPlay=function(){  let cb=document.querySelector('button[data-testid=control-button-npv][aria-pressed=true]');  if(cb) { console.log('#Close NowPlaying'); cb.click(); }};window.trigUnlock=function(){  let uint=setInterval(()=>{    if(pBtn.disabled) {      AndBridge.deferMessage('reload');      window.location.reload();    }    else if(pBtn.getAttribute('aria-label')!=='Play') {      clearInterval(uint);      alFlag=false;      console.log('#Unlocked OK!');    }  },3000);};window.actPlayPause=function(play) {  console.log('PlayPause:'+play);  if('pBtn' in window) {    if(pBtn.getAttribute('aria-label')==='Play') { if(play) pBtn.click(); }    else { if(!play) pBtn.click(); }  }};window.actSkipBack=function() {  console.log('SkipBack');  let bb=document.querySelector('button[data-testid=control-button-skip-back]');  if(bb) { manageWake(true); bb.click(); }};window.actSkipForward=function() {  console.log('SkipForward');  let fb=document.querySelector('button[data-testid=control-button-skip-forward]');  if(fb) { manageWake(true); fb.click(); }};window.actRepeat=function() {  console.log('RepeatClick');  let rb=document.querySelector('button[data-testid=control-button-repeat]');  if(rb) {    if(repmode=='false') repmode='true'; else if(repmode=='true') repmode='mixed'; else repmode='false';    updMedia(); rb.click();  }};window.actAddToFav=function() {  console.log('AddToFav');  let fb=document.querySelector('div[data-testid=now-playing-widget]>div:last-child>button');  if(fb) {    if(fb.getAttribute('aria-checked')==='false') { fb.click(); isfav=true; updMedia(); }    else {      fb.click();      let rfint=setInterval(()=>{        let fr=document.querySelector('#context-menu button[role=menuitemcheckbox][aria-checked=true]');        if(fr) {          clearInterval(rfint);          fr.click();          setTimeout(()=>{            let sb=document.querySelector('#context-menu button[type=submit]');            if(sb) { sb.click(); isfav=false; updMedia(); }          },500);        }      },1000);    }  }};window.actSeek=function(pos) {  let rg=document.querySelector('div[data-testid=playback-progressbar] input[type=range]');  rg.value=pos;  rg.dispatchEvent(new Event('change',{bubbles:true}));};window.addAutoFeatures=function(){  console.log('Adding AutoFeatures');  if('pBtn' in window&&firstPlay&&pBtn.getAttribute('aria-label')==='Play') {    console.log('#OneTime AutoPlay');    pBtn.click();    firstPlay=false;  }";
            }
            else {
                s = "let reqPause=false,firstPlay=true,alFlag=false,ffFlag=false;lastState=null;lastPos=null;playing=false;pfint=null;afint=null;cssint=null;aaint=null;const oriFetch=window.fetch;window.fetch=async function(...args) {  const [url,opts]=args;  const ts=new Date().toLocaleTimeString();  const method=opts?.method?.toUpperCase?.()||'GET';  if(ffFlag&&url.includes('/track-playback/')&&method==='PUT') {    const paused=opts?.body?JSON.parse(opts?.body)?.state_ref?.paused:undefined;    if(paused&&playing) { console.log('#Track-Playback: Pause'); manageAll(false); }    else if(!paused&&!playing) { console.log('#Track-Playback: Play'); manageAll(true); }  }  try {    const resp=await oriFetch(url,opts);    if(resp.status===404&&url.includes('connect-state')&&url.includes('/command/from/')) {      AndBridge.deferMessage('reload');      console.log('Player Locked: reload');      location.reload();    }    return resp;  } catch(err) {    console.error('Error in Fetch Request:',err);    throw err;  }};window.firstFuck=function(){ if(pfint) clearInterval(pfint); pfint=setInterval(()=>{  /*console.log('pf_tick');*/  if(playing&&document.visibilityState=='hidden'&&!!document.querySelector('video')) AndBridge.wakeUp();  else if(!AndBridge.isWoke()&&document.visibilityState=='visible'&&!document.querySelector('video')) AndBridge.wakeOff();  let pb=document.querySelector('aside button[data-testid=control-button-playpause]:not(.fuckd)');  if(pb) {    AndBridge.playLoaded();    console.log('#pBtn fuckd');    pb.classList.add('fuckd');    window.pBtn=pb;    pBtn.addEventListener('click',()=>{      console.log('PlayClicked');      if(pBtn.getAttribute('aria-label')!=='Play') {        console.log('Pause Req');        reqPause=true;        alFlag=false;        manageWake(false);      }      else if(!alFlag) {        reqPause=false;        manageWake(true);        console.log('Adding Unlocker');        alFlag=true;        setTimeout(()=>{          console.log('Unlocker Timeout Reached');          if(alFlag&&pBtn.getAttribute('aria-label')==='Play') {            AndBridge.deferMessage('unlock');            console.log('#Unlocking!');            actSkipForward();            trigUnlock();          }          else if(alFlag) {            console.log('Playing, Removing Unlocker');            alFlag=false;          }        },10000);      }    });    if(!ffFlag){      ffFlag=true;      AndBridge.manageSleep(false);      console.log('FirstFuck Adding All Features');      addAutoFeatures(); addCSSJSHack(); addAndAuto();    }  } },5000);};firstFuck();window.manageWake=function(enable){  if(enable) {    if(document.visibilityState=='hidden') AndBridge.wakeUp();  }  else {    if(!AndBridge.isWoke()&&document.visibilityState=='visible') AndBridge.wakeOff();  }};window.manageAll=function(play){  playing=play;  typeof updMedia==='function'&&updMedia();  AndBridge.manageSleep(!play);  if(start) {    console.log('StartingIntervals');    firstFuck(); addAutoFeatures(); addCSSJSHack(); addAndAuto();  }  else {    console.log('KillingIntervals');    if(pfint) clearInterval(pfint);    if(afint) clearInterval(afint);    if(cssint) clearInterval(cssint);    if(aaint) clearInterval(aaint);  }};window.closeNowPlay=function(){  let cb=document.querySelector('button[data-testid=control-button-npv][aria-pressed=true]');  if(cb) { console.log('#Close NowPlaying'); cb.click(); }};window.trigUnlock=function(){  let uint=setInterval(()=>{    if(pBtn.disabled) {      AndBridge.deferMessage('reload');      window.location.reload();    }    else if(pBtn.getAttribute('aria-label')!=='Play') {      clearInterval(uint);      alFlag=false;      console.log('#Unlocked OK!');    }  },3000);};window.actPlayPause=function(play) {  console.log('PlayPause:'+play);  if('pBtn' in window) {    if(pBtn.getAttribute('aria-label')==='Play') { if(play) pBtn.click(); }    else { if(!play) pBtn.click(); }  }};window.actSkipBack=function() {  console.log('SkipBack');  let bb=document.querySelector('button[data-testid=control-button-skip-back]');  if(bb) { manageWake(true); bb.click(); }};window.actSkipForward=function() {  console.log('SkipForward');  let fb=document.querySelector('button[data-testid=control-button-skip-forward]');  if(fb) { manageWake(true); fb.click(); }};window.actRepeat=function() {  console.log('RepeatClick');  let rb=document.querySelector('button[data-testid=control-button-repeat]');  if(rb) {    if(repmode=='false') repmode='true'; else if(repmode=='true') repmode='mixed'; else repmode='false';    updMedia(); rb.click();  }};window.actAddToFav=function() {  console.log('AddToFav');  let fb=document.querySelector('div[data-testid=now-playing-widget]>div:last-child>button');  if(fb) {    if(fb.getAttribute('aria-checked')==='false') { fb.click(); isfav=true; updMedia(); }    else {      fb.click();      let rfint=setInterval(()=>{        let fr=document.querySelector('#context-menu button[role=menuitemcheckbox][aria-checked=true]');        if(fr) {          clearInterval(rfint);          fr.click();          setTimeout(()=>{            let sb=document.querySelector('#context-menu button[type=submit]');            if(sb) { sb.click(); isfav=false; updMedia(); }          },500);        }      },1000);    }  }};window.actSeek=function(pos) {  let rg=document.querySelector('div[data-testid=playback-progressbar] input[type=range]');  rg.value=pos;  rg.dispatchEvent(new Event('change',{bubbles:true}));};window.addAutoFeatures=function(){  console.log('Adding AutoFeatures');";
            }
            String f = null;
            Label_0137: {
                if (!AppSingleton.p && !AppSingleton.o) {
                    f = s;
                    if (!AppSingleton.k.equals("permanent")) {
                        break Label_0137;
                    }
                }
                final String s2 = s = E.f(s, "if(afint) clearInterval(afint);afint=setInterval(()=>{  /*console.log('af_tick');*/");
                if (AppSingleton.p) {
                    s = E.f(s2, "  closeNowPlay();");
                }
                String f2 = s;
                if (AppSingleton.o) {
                    f2 = E.f(s, "  let ft=document.querySelector('aside div.encore-bright-accent-set button');  if(ft) {    console.log('#Take Control');    ft.click();    setTimeout(()=>{      let cb=document.querySelector('aside ul[role=list] li[role=listitem] div[role=button]');      if(cb) cb.click();    },500);  }");
                }
                s = f2;
                if (AppSingleton.k.equals("permanent")) {
                    s = E.f(f2, "  if('pBtn' in window&&!reqPause&&!alFlag&&pBtn.getAttribute('aria-label')==='Play') {console.log('#Permanent AutoPlay'); pBtn.click();}");
                }
                f = E.f(s, "},5000);");
            }
            final String s3 = s = E.f(E.f(f, "};"), "window.addAndAuto=function(){");
            if (AppSingleton.q) {
                s = E.f(s3, "if(aaint) clearInterval(aaint);aaint=setInterval(()=>{  /*console.log('aa_tick');*/  let ta=document.querySelector('a[data-testid=context-item-link]');  if(ta) track=ta.text; else track=null;  let aa=document.querySelector('a[data-testid=context-item-info-artist]');  if(!aa) aa=document.querySelector('a[data-testid=context-item-info-show]');  if(aa) artist=aa.text; else artist='';  /*if('pBtn' in window&&pBtn.getAttribute('aria-label')==='Play') realplay=false; else realplay=true;*/  let rr=document.querySelector('button[data-testid=control-button-repeat]');  if(rr) repmode=rr.getAttribute('aria-checked'); else repmode='false';  let fb=document.querySelector('div[data-testid=now-playing-widget]>div:last-child>button');  if(fb&&fb.getAttribute('aria-checked')==='true') isfav=true; else isfav=false;   let rg=document.querySelector('div[data-testid=playback-progressbar] input[type=range]');  if(rg) { duration=parseInt(rg.getAttribute('max')); position=parseInt(rg.getAttribute('value')); }  else { duration=null; position=null; }  let im=document.querySelector('img[data-testid=cover-art-image]');  if(im) cover=im.src; else cover=null;  updMedia();},2000);window.updMedia=function(){  const currState=track+'|'+artist+'|'+playing+'|'+repmode+'|'+isfav;  if(currState!==lastState) {    lastState=currState;    const values={artist:artist,track:track,playing:playing,repeat:repmode,fav:isfav,duration:duration,position:position,cover:cover};    AndBridge.recMediaStatus(JSON.stringify(values));  }  else {    if(Math.abs(position-lastPos)>4000) AndBridge.recMediaPosition(position);    lastPos=position;  }};window.mediaBuildPlay=function(idx=-1){  if(!lBtn.querySelector(':scope>h1')) lBtn.click();  let mint=setInterval(()=>{    if(document.querySelector('div[role=grid] div[role=gridcell]>div button')) {      clearInterval(mint);      console.log('MediaBuilding');      let lbr=document.querySelectorAll('div[role=grid] div[role=gridcell]>div');      let tits=[],knds=[],imgs=[],btns=[];      Array.from(lbr).forEach(node => {        const img=node.querySelector('img');        const btn=node.querySelector('button');        if(img) {          tits.push(img.alt);          knd=node.getAttribute('aria-labelledby');          if(knd&&(match=knd.match(/listrow-title-spotify:([^:]+):/)))            knds.push((match[1].charAt(0).toUpperCase()+match[1].slice(1)).replace('Collection','Playlist'));          else knds.push('-');          imgs.push(img.src);          btns.push(btn);        }      });      window.mediaInfo={tits,knds,imgs};      if(idx==-1) lBtn.click();      else { manageWake(true); btns[idx].click(); }    }  },500);};");
            }
            final String s4 = s = E.f(E.f(s, "};"), "window.addCSSJSHack=function(){");
            if (AppSingleton.l.equals("csshack")) {
                s = E.f(s4, "if(cssint) clearInterval(cssint);cssint=setInterval(function(){  /*console.log('css_tick');*/  let lb=document.querySelector('#Desktop_LeftSidebar_Id header>div>div:first-child button:not(.fuckd)');  if(lb) {    console.log('LibBtnFuckd');    window.lBtn=lb;    lb.classList.add('fuckd','lbtn');    lb.style.padding=0;    lb.style.height='20px';    lb.addEventListener('click',function(){setTimeout(()=>switchLs(),0)});    switchLs();    AndBridge.cssInjected();  }  let lbit=document.querySelector('#Desktop_LeftSidebar_Id div[role=grid]:not(.fuckd)');  if(lbit) {    lbit.classList.add('fuckd');    lbit.addEventListener('click',()=>{setTimeout(()=>{      console.log('AutoCloseLib');      lBtn.click();      closeNowPlay();    },0)});  }  let hb=document.querySelector('#global-nav-bar button[data-testid=home-button]:not(.fuckd)');  if(hb) {    hb.classList.add('fuckd');    hb.addEventListener('click',()=>{ closeNowPlay(); });  }  let sr=document.querySelector('input[data-testid=search-input]:not(.fuckd)');  if(sr) {    sr.classList.add('fuckd');    sr.addEventListener('focus',()=>{      let npb=document.querySelector('aside[data-testid=now-playing-bar]');      if(npb) npb.style.display='none';      closeNowPlay();    });    sr.addEventListener('blur',()=>{      let npb=document.querySelector('aside[data-testid=now-playing-bar]');      if(npb) npb.style.display='flex';    });  }  let ub=document.querySelector('button[data-testid=user-widget-link]:not(.fuckd)');  if(ub) {    ub.classList.add('fuckd');    ub.addEventListener('click',()=>{ closeNowPlay(); });  }},5000);");
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append("window.switchLs=function(){  let ls=document.querySelector('#Desktop_LeftSidebar_Id');  if(ls) {    let exp=ls.querySelector('nav>div>div:first-child').classList.length;;    if(exp==2) {      console.log('Expanded');      ls.style.position='fixed';      ls.style.width='100%';      ls.style.height='92%';      ls.style.left=0;      ls.style.zIndex=20;      let lh=ls.querySelector('header>div>div:first-child h1');      lh.innerText='\u2716 ");
            sb.append(AppSingleton.f.getString(2131755217));
            sb.append("';    }    else {      console.log('Collapsed');      ls.style.zIndex=1;      ls.style.position='fixed';      ls.style.top='2px';      ls.style.left='60px';      ls.style.width='50px';      ls.style.height='40px';    }  }};");
            final String s5 = s = E.f(sb.toString(), "};");
            if (AppSingleton.l.equals("csshack")) {
                                s = E.f(s5, "let st=document.createElement('style');st.textContent='body{min-width:100%!important;min-height:100%!important} .os-scrollbar{--os-size:6px!important} .contentSpacing{padding:0} div[data-testid=root]{--panel-gap:0!important} #main-view+div{overflow:hidden!important;} div[data-encore-id=banner],#global-nav-bar>div:first-of-type,#global-nav-bar a[href=\"/download\"],button[data-testid=fullscreen-mode-button],div.main-view-container__mh-footer-container{display:none!important} section[data-testid=artist-page]>div>div:first-child:not([data-encore-id]){height:25vh} div[data-testid=tracklist-row]{padding:0 10px 0 0;grid-gap:0} div[data-testid=tracklist-row] button:not([data-testid=add-to-playlist-button]){transform:scale(1.3)!important;opacity:0.6!important} div[data-testid=tracklist-row] button:{-webkit-margin-end:0!important} div[data-testid=tracklist-row] button:hover{color:#2d6!important} div[data-testid=tracklist-row]>div:first-child>div:first-child{height:24px;min-height:24px;min-width:24px;margin:0 8px!important} [aria-colcount=\"3\"] div[data-testid=tracklist-row]{grid-template-columns:[index] var(--tracklist-index-column-width,40px) [first] minmax(120px,var(--col1,4fr)) [last] minmax(82px,var(--col2,1fr))!important} [aria-colcount=\"4\"] div[data-testid=tracklist-row]{grid-template-columns:[index] var(--tracklist-index-column-width,40px) [first] minmax(120px,var(--col1,4fr)) [var1] minmax(120px,var(--col2,2fr)) [last] minmax(82px,var(--col3,1fr))!important} [aria-colcount=\"5\"] div[data-testid=tracklist-row]{grid-template-columns:[index] var(--tracklist-index-column-width,40px) [first] minmax(120px,var(--col1,6fr)) [var1] minmax(120px,var(--col2,4fr)) [var2] minmax(120px,var(--col3,3fr)) [last] minmax(82px,var(--col4,1fr))!important} section[data-testid=track-page]>div.contentSpacing>div:nth-child(2) [aria-colcount=\"2\"] div[data-testid=tracklist-row]{grid-template-columns:[first] minmax(120px,var(--col0,4fr)) [last] minmax(82px,var(--col1,1fr))!important} section[data-testid=track-page]>div.contentSpacing>div:nth-child(2) [aria-colcount=\"3\"] div[data-testid=tracklist-row]{grid-template-columns:[first] minmax(120px,var(--col0,4fr)) [var1] minmax(120px,var(--col1,2fr)) [last] minmax(82px,var(--col2,1fr))!important} *{--content-spacing:10px} section[data-testid=home-page] .contentSpacing{padding:0 10px!important;overflow:hidden} div[data-testid=grid-container]{margin-inline:0!important;column-gap:0!important;overflow:hidden!important} div[data-testid=action-bar-row],div[data-testid=topbar-content]{padding:5px 10px} div[data-testid=track-list]>div:first-child,div[data-testid=playlist-tracklist]>div:first-child{margin:0!important;padding:0!important} main>section:not([data-testid=artist-page])>div:first-child{height:auto!important;min-height:auto!important;padding:10px} section[data-testid=track-page]>div>div.contentSpacing>div:last-child{overflow:hidden} section[data-testid=artist-page]>div>div:first-child>div.contentSpacing{padding:10px} section[data-testid=artist-page] div[data-testid=grid-container] h2,section[data-testid=artist-page] section[data-testid=component-shelf]{padding:0 10px} main>section h1.encore-text-headline-large{font-size:22px!important} section[data-testid=artist-page] span.encore-text-headline-large{font-size:26px!important} section[data-testid=track-page] h1{font-size:20px!important} aside[data-testid=now-playing-bar]{min-width:100%!important;box-shadow:0 0 6px #440000;background:linear-gradient(to bottom,#770000,#330000)!important} aside[data-testid=now-playing-bar]>div:first-child{margin-top:2px;flex-direction:column!important;height:auto!important} aside[data-testid=now-playing-bar]>div>div{width:100%!important} aside[data-testid=now-playing-bar]>div>div:last-child>div{min-height:32px;margin:5px 10px} aside[data-testid=now-playing-bar]>div>div:last-child button{transform:scale(1.15);margin:0 5px} div[data-testid=general-controls]{margin:15px 0 25px} div[data-testid=general-controls] button{transform:scale(1.4)!important;margin:0 8px!important} div[data-testid=player-controls]{margin:5px 0} div[data-testid=now-playing-widget]{justify-content:center;overflow:hidden} form[role=search]{z-index:10;margin-left:50px} div[data-testid=now-playing-widget]>div:last-child>button{transform:scale(1.3)} div[data-testid=now-playing-widget]>div:first-child{display:none!important} div[data-testid=now-playing-widget]>div:nth-child(2){display:flex!important;overflow:hidden!important} div[data-testid=now-playing-widget]>div:nth-child(2) span{font-size:13px!important;height:20px!important;margin:0!important} div[data-testid=now-playing-widget]>div:nth-child(2)>div{min-width:auto;max-width:66%} [data-tippy-root],[data-tippy-root] *{transition:none!important;transform:none!important;overflow:hidden!important} div[data-testid=hover-or-focus-tooltip],#Desktop_LeftSidebar_Id header>div>div:last-child{display:none!important} ';document.head.appendChild(st);");
            }
            webView.evaluateJavascript(s.replaceAll("console\\.log\\('[^']+'\\);", ""), (ValueCallback)null);
        }
        else {
            webView.evaluateJavascript("(function() {let l=document.querySelector('button[data-testid=web-player-link]');if(l) { AndBridge.loginDetected(); l.click(); }})();", (ValueCallback)null);
        }
    }
    
    public final void onPageStarted(final WebView webView, final String s, final Bitmap bitmap) {
        final Context f = AppSingleton.f;
        webView.evaluateJavascript("(function(){window.screen.__defineGetter__('width',function(){return 1920;});window.screen.__defineGetter__('height',function(){return 1080;});window.screen.__defineGetter__('availWidth',function(){return 1920;});window.screen.__defineGetter__('availHeight',function(){return 1040;});window.__defineGetter__('innerWidth',function(){return 1920;});window.__defineGetter__('innerHeight',function(){return 978;});window.navigator.__defineGetter__('vendor',function(){return 'Google Inc.';});window.navigator.__defineGetter__('productSub',function(){return '20030107';});window.navigator.__defineGetter__('platform',function(){return 'Win32';});window.navigator.__defineGetter__('oscpu',function(){return 'null';});})()", (ValueCallback)null);
        super.onPageStarted(webView, s, bitmap);
    }
    
    public final WebResourceResponse shouldInterceptRequest(final WebView webView, final WebResourceRequest webResourceRequest) {
        while (true) {
            final String string = webResourceRequest.getUrl().toString();
            final Map requestHeaders = webResourceRequest.getRequestHeaders();
            Object o = null;
            Object o3 = null;
            Label_0538: {
                while (true) {
                    try {
                        final HttpURLConnection httpURLConnection = (HttpURLConnection)(o = new URL(string).openConnection());
                        View view = null;
                        try {
                            try {
                                httpURLConnection.setRequestMethod(webResourceRequest.getMethod());
                                o = httpURLConnection;
                                final Iterator iterator = requestHeaders.entrySet().iterator();
                                while (true) {
                                    o = httpURLConnection;
                                    if (!iterator.hasNext()) {
                                        break;
                                    }
                                    o = httpURLConnection;
                                    final Map$Entry map$Entry = (Map$Entry)iterator.next();
                                    o = httpURLConnection;
                                    ((URLConnection)httpURLConnection).setRequestProperty((String)map$Entry.getKey(), (String)map$Entry.getValue());
                                }
                            }
                            finally {
                                view = (View)o;
                            }
                        }
                        catch (Exception ex2) {}
                        o = httpURLConnection;
                        ((URLConnection)httpURLConnection).connect();
                        o = httpURLConnection;
                        final String contentType = ((URLConnection)httpURLConnection).getContentType();
                        o = httpURLConnection;
                        if (!string.contains("doubleclick.net")) {
                            o = httpURLConnection;
                            if (!string.contains("googlesyndication.com")) {
                                o = httpURLConnection;
                                if (!string.contains("fastly-insights.com")) {
                                    o = httpURLConnection;
                                    if (!string.contains("sentry.io")) {
                                        Object o2 = httpURLConnection;
                                        if (contentType != null) {
                                            o = httpURLConnection;
                                            o2 = httpURLConnection;
                                            if (contentType.equals("audio/mpeg")) {
                                                o = httpURLConnection;
                                                o2 = httpURLConnection;
                                                if (!string.contains("podz-content")) {
                                                    o = httpURLConnection;
                                                    o2 = httpURLConnection;
                                                    if (!string.contains("gew4-spclient")) {
                                                        o = httpURLConnection;
                                                        if (!string.contains("akamaized.net/audio/")) {
                                                            o = httpURLConnection;
                                                            if (!string.contains("scdn.co/audio/")) {
                                                                o = httpURLConnection;
                                                                if (!string.contains("scdn.co/mp3-ad/")) {
                                                                    o = httpURLConnection;
                                                                    if (!string.contains("spotifycdn.com/audio/")) {
                                                                        o = httpURLConnection;
                                                                        if (!string.contains("amillionads.com")) {
                                                                            o = httpURLConnection;
                                                                            if (!string.contains("2mdn.net")) {
                                                                                o = httpURLConnection;
                                                                                if (!string.contains("adxcel.com")) {
                                                                                    o = httpURLConnection;
                                                                                    o2 = httpURLConnection;
                                                                                    if (!string.contains("adstudio-assets.scdn.co")) {
                                                                                        break Label_0421;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        o = httpURLConnection;
                                                        g.deferMessage("adblock");
                                                        o = httpURLConnection;
                                                        final WebResourceResponse webResourceResponse = new WebResourceResponse("audio/mpeg", (String)null, view.getContext().getAssets().open("silent.mp3"));
                                                        httpURLConnection.disconnect();
                                                        return webResourceResponse;
                                                    }
                                                }
                                            }
                                        }
                                        ((HttpURLConnection)o2).disconnect();
                                        return null;
                                    }
                                }
                            }
                        }
                        o = httpURLConnection;
                        o = httpURLConnection;
                        final HashMap hashMap = new HashMap();
                        o = httpURLConnection;
                        hashMap.put("Access-Control-Allow-Origin", "*");
                        o = httpURLConnection;
                        o = httpURLConnection;
                        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[0]);
                        o = httpURLConnection;
                        final WebResourceResponse webResourceResponse2 = new WebResourceResponse("text/plain", "utf-8", 200, "OK", (Map)hashMap, (InputStream)byteArrayInputStream);
                        httpURLConnection.disconnect();
                        return webResourceResponse2;
                    }
                    catch (Exception ex) {
                        o3 = null;
                    }
                    finally {
                        o3 = o;
                        break Label_0538;
                    }
                    o = o3;
                    final Exception ex;
                    Log.e("Spotifuck", "Error intercepting request", (Throwable)ex);
                    if (o3 != null) {
                        final Object o2 = o3;
                        continue;
                    }
                    break;
                }
                return null;
            }
            if (o3 != null) {
                ((HttpURLConnection)o3).disconnect();
            }
        }
    }
}
