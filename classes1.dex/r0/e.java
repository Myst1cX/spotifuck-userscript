package R0;

import Q0.E;
import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import it.deviato.spotifuck.AppSingleton;

public final class e extends WebViewClient {
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        Context context = AppSingleton.f3142f;
        webView.evaluateJavascript("(function(){window.screen.__defineGetter__('width',function(){return 1920;});window.screen.__defineGetter__('height',function(){return 1080;});window.screen.__defineGetter__('availWidth',function(){return 1920;});window.screen.__defineGetter__('availHeight',function(){return 1040;});window.__defineGetter__('innerWidth',function(){return 1920;});window.__defineGetter__('innerHeight',function(){return 978;});window.navigator.__defineGetter__('vendor',function(){return 'Google Inc.';});window.navigator.__defineGetter__('productSub',function(){return '20030107';});window.navigator.__defineGetter__('platform',function(){return 'Win32';});window.navigator.__defineGetter__('oscpu',function(){return 'null';});})()", (ValueCallback) null);
        super.onPageStarted(webView, str, bitmap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x011e, code lost:
        if (r4 != null) goto L_0x00e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r13, android.webkit.WebResourceRequest r14) {
        /*
            r12 = this;
            java.lang.String r0 = "audio/mpeg"
            android.net.Uri r1 = r14.getUrl()
            java.lang.String r1 = r1.toString()
            java.util.Map r2 = r14.getRequestHeaders()
            r3 = 0
            java.net.URL r4 = new java.net.URL     // Catch:{ Exception -> 0x0115, all -> 0x0113 }
            r4.<init>(r1)     // Catch:{ Exception -> 0x0115, all -> 0x0113 }
            java.net.URLConnection r4 = r4.openConnection()     // Catch:{ Exception -> 0x0115, all -> 0x0113 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ Exception -> 0x0115, all -> 0x0113 }
            java.lang.String r14 = r14.getMethod()     // Catch:{ Exception -> 0x0049 }
            r4.setRequestMethod(r14)     // Catch:{ Exception -> 0x0049 }
            java.util.Set r14 = r2.entrySet()     // Catch:{ Exception -> 0x0049 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ Exception -> 0x0049 }
        L_0x0029:
            boolean r2 = r14.hasNext()     // Catch:{ Exception -> 0x0049 }
            if (r2 == 0) goto L_0x004c
            java.lang.Object r2 = r14.next()     // Catch:{ Exception -> 0x0049 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ Exception -> 0x0049 }
            java.lang.Object r5 = r2.getKey()     // Catch:{ Exception -> 0x0049 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0049 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ Exception -> 0x0049 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0049 }
            r4.setRequestProperty(r5, r2)     // Catch:{ Exception -> 0x0049 }
            goto L_0x0029
        L_0x0045:
            r13 = move-exception
            r3 = r4
            goto L_0x0122
        L_0x0049:
            r13 = move-exception
            goto L_0x0117
        L_0x004c:
            r4.connect()     // Catch:{ Exception -> 0x0049 }
            java.lang.String r14 = r4.getContentType()     // Catch:{ Exception -> 0x0049 }
            java.lang.String r2 = "doubleclick.net"
            boolean r2 = r1.contains(r2)     // Catch:{ Exception -> 0x0049 }
            if (r2 != 0) goto L_0x00ed
            java.lang.String r2 = "googlesyndication.com"
            boolean r2 = r1.contains(r2)     // Catch:{ Exception -> 0x0049 }
            if (r2 != 0) goto L_0x00ed
            java.lang.String r2 = "fastly-insights.com"
            boolean r2 = r1.contains(r2)     // Catch:{ Exception -> 0x0049 }
            if (r2 != 0) goto L_0x00ed
            java.lang.String r2 = "sentry.io"
            boolean r2 = r1.contains(r2)     // Catch:{ Exception -> 0x0049 }
            if (r2 == 0) goto L_0x0075
            goto L_0x00ed
        L_0x0075:
            if (r14 == 0) goto L_0x00e9
            boolean r14 = r14.equals(r0)     // Catch:{ Exception -> 0x0049 }
            if (r14 == 0) goto L_0x00e9
            java.lang.String r14 = "podz-content"
            boolean r14 = r1.contains(r14)     // Catch:{ Exception -> 0x0049 }
            if (r14 != 0) goto L_0x00e9
            java.lang.String r14 = "gew4-spclient"
            boolean r14 = r1.contains(r14)     // Catch:{ Exception -> 0x0049 }
            if (r14 != 0) goto L_0x00e9
            java.lang.String r14 = "akamaized.net/audio/"
            boolean r14 = r1.contains(r14)     // Catch:{ Exception -> 0x0049 }
            if (r14 != 0) goto L_0x00cd
            java.lang.String r14 = "scdn.co/audio/"
            boolean r14 = r1.contains(r14)     // Catch:{ Exception -> 0x0049 }
            if (r14 != 0) goto L_0x00cd
            java.lang.String r14 = "scdn.co/mp3-ad/"
            boolean r14 = r1.contains(r14)     // Catch:{ Exception -> 0x0049 }
            if (r14 != 0) goto L_0x00cd
            java.lang.String r14 = "spotifycdn.com/audio/"
            boolean r14 = r1.contains(r14)     // Catch:{ Exception -> 0x0049 }
            if (r14 != 0) goto L_0x00cd
            java.lang.String r14 = "amillionads.com"
            boolean r14 = r1.contains(r14)     // Catch:{ Exception -> 0x0049 }
            if (r14 != 0) goto L_0x00cd
            java.lang.String r14 = "2mdn.net"
            boolean r14 = r1.contains(r14)     // Catch:{ Exception -> 0x0049 }
            if (r14 != 0) goto L_0x00cd
            java.lang.String r14 = "adxcel.com"
            boolean r14 = r1.contains(r14)     // Catch:{ Exception -> 0x0049 }
            if (r14 != 0) goto L_0x00cd
            java.lang.String r14 = "adstudio-assets.scdn.co"
            boolean r14 = r1.contains(r14)     // Catch:{ Exception -> 0x0049 }
            if (r14 == 0) goto L_0x00e9
        L_0x00cd:
            java.lang.String r14 = "adblock"
            R0.f.deferMessage(r14)     // Catch:{ Exception -> 0x0049 }
            android.content.Context r13 = r13.getContext()     // Catch:{ Exception -> 0x0049 }
            android.content.res.AssetManager r13 = r13.getAssets()     // Catch:{ Exception -> 0x0049 }
            java.lang.String r14 = "silent.mp3"
            java.io.InputStream r13 = r13.open(r14)     // Catch:{ Exception -> 0x0049 }
            android.webkit.WebResourceResponse r14 = new android.webkit.WebResourceResponse     // Catch:{ Exception -> 0x0049 }
            r14.<init>(r0, r3, r13)     // Catch:{ Exception -> 0x0049 }
            r4.disconnect()
            return r14
        L_0x00e9:
            r4.disconnect()
            goto L_0x0121
        L_0x00ed:
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ Exception -> 0x0049 }
            r10.<init>()     // Catch:{ Exception -> 0x0049 }
            java.lang.String r13 = "Access-Control-Allow-Origin"
            java.lang.String r14 = "*"
            r10.put(r13, r14)     // Catch:{ Exception -> 0x0049 }
            android.webkit.WebResourceResponse r13 = new android.webkit.WebResourceResponse     // Catch:{ Exception -> 0x0049 }
            java.lang.String r6 = "text/plain"
            java.lang.String r7 = "utf-8"
            java.lang.String r9 = "OK"
            java.io.ByteArrayInputStream r11 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x0049 }
            r14 = 0
            byte[] r14 = new byte[r14]     // Catch:{ Exception -> 0x0049 }
            r11.<init>(r14)     // Catch:{ Exception -> 0x0049 }
            r8 = 200(0xc8, float:2.8E-43)
            r5 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0049 }
            r4.disconnect()
            return r13
        L_0x0113:
            r13 = move-exception
            goto L_0x0122
        L_0x0115:
            r13 = move-exception
            r4 = r3
        L_0x0117:
            java.lang.String r14 = "Spotifuck"
            java.lang.String r0 = "Error intercepting request"
            android.util.Log.e(r14, r0, r13)     // Catch:{ all -> 0x0045 }
            if (r4 == 0) goto L_0x0121
            goto L_0x00e9
        L_0x0121:
            return r3
        L_0x0122:
            if (r3 == 0) goto L_0x0127
            r3.disconnect()
        L_0x0127:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.e.shouldInterceptRequest(android.webkit.WebView, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
    }

    public final void onPageFinished(WebView webView, String str) {
        String str2;
        super.onPageFinished(webView, str);
        if (str.startsWith("https://www.facebook.com/privacy/consent/gdp/")) {
            webView.evaluateJavascript("(function(){document.querySelector('#facebook div[role=button]').click();})();", (ValueCallback) null);
        } else if (str.endsWith("/login")) {
            webView.evaluateJavascript("(function(){let gl=document.querySelector('section>div>div>div>div>a:first-child:not(.fuckd)');if(gl) {  let cl=document.createElement('a');  cl.className='fuckd';  cl.innerText='Email + Password Classic Login';  cl.style.cssText='display:block;padding:10px;margin:10px 0;color:white;font-weight:bold;text-decoration:none;border:1px solid #ddd;background:#339;border-radius:30px';  cl.href='?allow_password=1';  gl.parentNode.insertBefore(cl,gl);}})();", (ValueCallback) null);
        }
        if (AppSingleton.f3149n) {
            if (AppSingleton.f3153r) {
                str2 = "let reqPause=false,firstPlay=true,ulFlag=false,ffDone=false,npOpen=false;featVer=`web-player_${new Date().toISOString().split('T')[0]}_${Date.now()}_${Math.floor(Math.random()*0xFFFFFFF).toString(16).padStart(7,'0')}`;lastState=null;lastPos=null;playing=false;pfint=null;afint=null;cssint=null;aaint=null;window.updMedia=function(){  const currState=track+'|'+artist+'|'+playing+'|'+repmode+'|'+isfav;  if(currState!==lastState) {    lastState=currState;    const values={artist:artist,track:track,playing:playing,repeat:repmode,fav:isfav,duration:duration,position:position,cover:cover};    AndBridge.recMediaStatus(JSON.stringify(values));  }  else {    if(Math.abs(position-lastPos)>4000) AndBridge.recMediaPosition(position);    lastPos=position;  }};window.fetchAllLibrary=async function(){  const limit=50;  let offset=0;  let allItems=[];  let hasMore=true;  while(hasMore){    const resp=await oriFetch('https://api-partner.spotify.com/pathfinder/v2/query',{      method:'POST',      headers:{        'Authorization':window.spotAuthToken,'Client-Token':window.spotCliToken,'Content-Type':'application/json;charset=UTF-8'      },      body:JSON.stringify({        variables:{          filters:[],order:null,textFilter:'',features:['LIKED_SONGS','YOUR_EPISODES_V2','PRERELEASES','EVENTS'],          limit:limit,offset:offset,flatten:false,expandedFolders:[],folderUri:null,includeFoldersWhenFlattening:true        },        operationName:'libraryV3',        extensions:{          persistedQuery:{version:1,sha256Hash:'0082bf82412db50128add72dbdb73e2961d59100b9cbf41fb25c568bd8bc358b'}        }      })    });    if(!resp.ok){      const text=await resp.text();      throw new Error(`Error HTTP ${resp.status}: ${text}`);    }    const data=await resp.json();    const items=data?.data?.me?.libraryV3?.items||[];    allItems=allItems.concat(items);    if(items.length<limit) {      hasMore=false;    } else {      offset+=limit;    }  }  return allItems;};window.parseLibrary=function(items) {  const res={playlists:[],albums:[],artists:[],podcasts:[]};  items.forEach(({item})=>{    const data=item.data;    if(!data||!data.__typename) return;    switch(data.__typename) {      case 'PseudoPlaylist':        res.playlists.push({          id:data.uri,name:data.name,image:data.image?.sources?.[0]?.url||null        });        break;      case 'Playlist':        res.playlists.push({          id:data.uri,name:data.name,image:data.images?.items?.[0]?.sources?.[0]?.url||null        });        break;      case 'Album':        res.albums.push({          id:data.uri,name:data.name,image:data.coverArt?.sources?.[0]?.url||null,          artists:data.artists?.items?.map(a=>a.profile?.name).filter(Boolean)||[]        });        break;      case 'Artist':        res.artists.push({          id:data.uri,name:data.profile?.name,image:data.visuals?.avatarImage?.sources?.[0]?.url||null        });        break;      case 'Podcast':        res.podcasts.push({          id:data.uri,name:data.name,image:data.coverArt?.sources?.[0]?.url||null,          artists:data.publisher?.name?[data.publisher.name]:[]        });        break;      default:        break;    }  });  return res;};window.checkMediaLib=function(){  if(typeof window.mediaLib==='undefined'&&window.spotCliToken&&window.spotAuthToken&&window.spotDevId) {    fetchAllLibrary().then(allItems=>{      console.log('✅ FetchAllLibrary OK. Items:'+allItems.length);      window.mediaLib=parseLibrary(allItems);    }).catch(err=>{      console.error('❌ FetchAllLibrary Error:',err);    });  }};";
            } else {
                str2 = "let reqPause=false,firstPlay=true,ulFlag=false,ffDone=false,npOpen=false;featVer=`web-player_${new Date().toISOString().split('T')[0]}_${Date.now()}_${Math.floor(Math.random()*0xFFFFFFF).toString(16).padStart(7,'0')}`;lastState=null;lastPos=null;playing=false;pfint=null;afint=null;cssint=null;aaint=null;";
            }
            String f2 = E.f(E.f(E.f(str2, "const oriFetch=window.fetch;window.fetch=async function(...args) {  const [url,opts]=args;  const ts=new Date().toISOString().slice(11,23);  const method=opts?.method?.toUpperCase?.()||'GET';  const headers=opts?.headers||{};  if(method==='POST'&&url.includes('/track-playback/v1/devices')&&opts?.body){    const body=JSON.parse(opts.body);    const deviceId=body?.device?.device_id;    if(deviceId&&deviceId!==window.spotDevId){      window.spotDevId=deviceId;      /*console.log(`🌐 [${ts}] [${method}] → ${url}`);      console.log('📻 Device ID body:',deviceId);*/      typeof checkMediaLib==='function'&&checkMediaLib();    }  }  else if(method==='POST'&&url.includes('/pathfinder/v2/query')&&opts?.body){    const body=JSON.parse(opts.body);    if(body?.operationName==='isCurated'){      const currUri=body?.variables?.uris?.[0];      if(currUri&&currUri!==window.currUri){        window.currUri=currUri;        /*console.log(`🌐 [${ts}] [${method}] → ${url}`);        console.log('🎵 Current URI:',currUri);*/      }    }  }  else {    let match=url.match(/\\/connect-state\\/v1\\/player\\/(?:command|transfer)\\/from\\/([^/]+)\\/to\\/([^/]+)/);    if(match?.[2]&&match[2]!==window.spotDevId) {      window.spotDevId=match[2];      /*console.log(`🌐 [${ts}] [${method}] → ${url}`);      console.log('📻 Device ID change:',window.spotDevId);*/      typeof checkMediaLib==='function'&&checkMediaLib();    }  }  const cliToken=headers['Client-Token']||headers['client-token'];  if(cliToken&&cliToken!==window.spotCliToken) {    window.spotCliToken=cliToken;    /*console.log(`🌐 [${ts}] [${method}] → ${url}`);    console.log('🎧 Client Token found:',cliToken);*/    typeof checkMediaLib==='function'&&checkMediaLib();  }  const authHead=headers.Authorization||headers.authorization;  if(authHead?.startsWith('Bearer ')&&authHead!==window.spotAuthToken) {    window.spotAuthToken=authHead;    /*console.log(`🌐 [${ts}] [${method}] → ${url}`);    console.log('🔑 Auth Token found:',authHead);*/    typeof checkMediaLib==='function'&&checkMediaLib();  }  if(ffDone&&url.includes('/track-playback/')&&method==='PUT') {    const paused=opts?.body?JSON.parse(opts?.body)?.state_ref?.paused:undefined;    if(paused===true&&playing) { console.log('#Track-Playback: Pause'); manageAll(false); }    else if(paused===false&&!playing) { console.log('#Track-Playback: Play'); manageAll(true); }  }  try {    const resp=await oriFetch(url,opts);    if(resp.status===404&&url.includes('connect-state')&&url.includes('/command/from/')) {      AndBridge.deferMessage('reload');      console.log('Player Locked: reload');      location.reload();    }"), "    return resp;  } catch(err) {    /*console.error('❌ Error in Fetch Request:', err);    console.error('🔍 Name:', err.name);    console.error('📄 Message:', err.message);    console.error('📌 Stack:', err.stack);*/    throw err;  }};window.playFromUri=function(uri) {  console.log('#PlayFromUri:'+uri);  let type=uri.match(/^spotify:([^:]+)/)?.[1];  if(type=='user') type='your_library';  oriFetch(`https://gew4-spclient.spotify.com/connect-state/v1/player/command/from/${window.spotDevId}/to/${window.spotDevId}`, {    method:'POST',    headers:{'Authorization':window.spotAuthToken,'Client-Token':window.spotCliToken,'Content-Type':'application/json'},    body:JSON.stringify({command:{        context:{uri:uri,url:'context://'+uri,metadata:{}},        play_origin:{          feature_identifier:type,          feature_version:featVer,          referrer_identifier:'your_library'},        options:{license:'tft',skip_to:{},player_options_override:{}},        /*logging_params:{          page_instance_ids:[crypto.randomUUID()],          interaction_ids:[crypto.randomUUID()],          command_id:crypto.randomUUID().replace(/-/g,'')        },*/endpoint:'play'}    })  });};window.firstFuck=function(){ if(pfint) clearInterval(pfint); pfint=setInterval(()=>{  /*console.log('pf_tick');*/  if(playing&&document.visibilityState=='hidden'&&!!document.querySelector('.VideoPlayer__container video')) AndBridge.wakeUp();  else if(!AndBridge.isWoke()&&document.visibilityState=='visible'&&!document.querySelector('.VideoPlayer__container video')) AndBridge.wakeOff();  if(typeof npBtn=='undefined') {    let lyBtn=document.querySelector('button[data-testid=lyrics-button]:not(.fuckd)');    if(lyBtn) {      lyBtn.classList.add('fuckd');      npBtn=document.createElement('button');      npBtn.className='npbtn';      npBtn.onclick=clickNP;      npBtn.innerHTML=`<svg viewBox=\"0 0 16 17\"><rect x=\"1\" y=\"0.75\" width=\"14\" height=\"15.5\" rx=\"2\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"1.5\"/><path d=\"M 6 5 L 6 5.9160156 L 9.6933594 8.5 L 6 11.080078 L 6 12 L 11 8.5 L 6 5 z\" stroke=\"currentColor\" stroke-width=\"1.2\"/></svg>`;      lyBtn.parentNode.insertBefore(npBtn,lyBtn);      closeNowPlay();    }  }  let pb=document.querySelector('aside button[data-testid=control-button-playpause]:not(.fuckd)');  if(pb) {    AndBridge.playLoaded();    console.log('#pBtn fuckd');    pb.classList.add('fuckd');    window.pBtn=pb;    pBtn.addEventListener('click',()=>{      console.log('PlayClicked');      if(pBtn.getAttribute('aria-label')!=='Play') {        console.log('Pause Req');        reqPause=true;        ulFlag=false;        manageWake(false);      }      else if(!ulFlag) {        reqPause=false;        manageWake(true);        console.log('Adding Unlocker');        ulFlag=true;        setTimeout(()=>{          console.log('Unlocker Timeout Reached');          if(ulFlag&&pBtn.getAttribute('aria-label')==='Play') {            AndBridge.deferMessage('unlock');            console.log('#Unlocking!');            actSkipForward();            trigUnlock();          }          else if(ulFlag) {            console.log('Playing, Removing Unlocker');            ulFlag=false;          }        },10000);      }    });    if(!ffDone){      ffDone=true;      AndBridge.manageTShut(true);      AndBridge.manageTSleep(false);      console.log('FirstFuck Adding All Features');      addAutoFeatures(); addCSSJSHack(); addAndAuto();      setTimeout(()=>{manageAll(playing)},10000);    }  } },5000);};firstFuck();window.manageWake=function(enable){  if(enable) {    if(document.visibilityState=='hidden') AndBridge.wakeUp();  }  else {    if(!AndBridge.isWoke()&&document.visibilityState=='visible') AndBridge.wakeOff();  }};window.manageAll=function(play){  playing=play;  typeof updMedia==='function'&&updMedia();  AndBridge.manageTShut(!play);  AndBridge.manageTSleep(play);  if(play) {    console.log('StartingIntervals');    firstFuck(); addAutoFeatures(); addCSSJSHack(); addAndAuto();  }  else {    console.log('KillingIntervals');    if(pfint) clearInterval(pfint);    if(afint) clearInterval(afint);    if(cssint) clearInterval(cssint);    if(aaint) clearInterval(aaint);  }};window.clickNP=function(){  let rBtn=document.querySelector('#Desktop_PanelContainer_Id').parentNode.parentNode.nextElementSibling.querySelector('button');  if(rBtn) {    let npHid=document.querySelector('#Desktop_PanelContainer_Id').parentNode.parentNode.ariaHidden;    if(npHid&&npHid=='true') npBtn.classList.add('active'); else npBtn.classList.remove('active');    rBtn.click();  }};window.closeNowPlay=function(){  let rc=document.querySelector('#Desktop_PanelContainer_Id');  if(rc&&rc.parentNode.parentNode.ariaHidden=='false') { console.log('#Close NowPlaying'); clickNP(); }};window.trigUnlock=function(){  let uint=setInterval(()=>{    if(pBtn.disabled) {      AndBridge.deferMessage('reload');      window.location.reload();    }    else if(pBtn.getAttribute('aria-label')!=='Play') {      clearInterval(uint);      ulFlag=false;      console.log('#Unlocked OK!');    }  },3000);};window.actPlayPause=function(play) {  console.log('PlayPause:'+play);  if('pBtn' in window) {    if(pBtn.getAttribute('aria-label')==='Play') { if(play) pBtn.click(); }    else { if(!play) pBtn.click(); }  }};window.actSkipBack=function() {  console.log('SkipBack');  let bb=document.querySelector('button[data-testid=control-button-skip-back]');  if(bb) { manageWake(true); bb.click(); }};window.actSkipForward=function() {  console.log('SkipForward');  let fb=document.querySelector('button[data-testid=control-button-skip-forward]');  if(fb) { manageWake(true); fb.click(); }};window.actRepeat=function() {  console.log('RepeatClick');  let rb=document.querySelector('button[data-testid=control-button-repeat]');  if(rb) {    if(repmode=='false') repmode='true'; else if(repmode=='true') repmode='mixed'; else repmode='false';    updMedia(); rb.click();  }};window.actAddToFav=function() {  console.log('AddToFav');  let fb=document.querySelector('div[data-testid=now-playing-widget]>div:last-child>button');  if(fb) {    if(fb.getAttribute('aria-checked')==='false') { fb.click(); isfav=true; updMedia(); }    else {      manageWake(true);      fb.click();      let rfint=setInterval(()=>{        manageWake(true);        let fr=document.querySelector('#context-menu button[role=menuitemcheckbox][aria-checked=true]');        if(fr) {          clearInterval(rfint);          fr.click();          setTimeout(()=>{            let sb=document.querySelector('#context-menu button[type=submit]');            if(sb) { sb.click(); isfav=false; updMedia(); }            manageWake(false);          },500);        }      },1000);    }  }};window.actSeek=function(pos) {  let rg=document.querySelector('div[data-testid=playback-progressbar] input[type=range]');  rg.value=pos+1;  rg.dispatchEvent(new Event('change',{bubbles:true}));};"), "window.addAutoFeatures=function(){  console.log('Adding AutoFeatures');");
            if (AppSingleton.f3146k.equals("onetime")) {
                f2 = E.f(f2, "  if('pBtn' in window&&firstPlay&&pBtn.getAttribute('aria-label')==='Play') {    console.log('#OneTime AutoPlay');    pBtn.click();    firstPlay=false;  }");
            }
            if (AppSingleton.f3151p || AppSingleton.f3150o || AppSingleton.f3146k.equals("permanent")) {
                String f3 = E.f(f2, "if(afint) clearInterval(afint);afint=setInterval(()=>{  /*console.log('af_tick');*/");
                if (AppSingleton.f3151p) {
                    f3 = E.f(f3, "  closeNowPlay();");
                }
                if (AppSingleton.f3150o) {
                    f3 = E.f(f3, "  let ft=document.querySelector('aside div.encore-bright-accent-set button');  if(ft) {    console.log('#Take Control');    ft.click();    setTimeout(()=>{      let cb=document.querySelector('aside ul[role=list] li[role=listitem] div[role=button]');      if(cb) cb.click();    },500);  }");
                }
                if (AppSingleton.f3146k.equals("permanent")) {
                    f3 = E.f(f3, "  if('pBtn' in window&&!reqPause&&!ulFlag&&pBtn.getAttribute('aria-label')==='Play') {console.log('#Permanent AutoPlay'); pBtn.click();}");
                }
                f2 = E.f(f3, "},5000);");
            }
            String f4 = E.f(E.f(f2, "};"), "window.addAndAuto=function(){");
            if (AppSingleton.f3153r) {
                f4 = E.f(f4, "if(aaint) clearInterval(aaint);aaint=setInterval(()=>{  /*console.log('aa_tick');*/  let ta=document.querySelector('a[data-testid=context-item-link]');  if(ta) track=ta.text; else track=null;  let aa=document.querySelector('a[data-testid=context-item-info-artist]');  if(!aa) aa=document.querySelector('a[data-testid=context-item-info-show]');  if(aa) artist=aa.text; else artist='';  /*if('pBtn' in window&&pBtn.getAttribute('aria-label')==='Play') realplay=false; else realplay=true;*/  let rr=document.querySelector('button[data-testid=control-button-repeat]');  if(rr) repmode=rr.getAttribute('aria-checked'); else repmode='false';  let fb=document.querySelector('div[data-testid=now-playing-widget]>div:last-child>button');  if(fb&&fb.getAttribute('aria-checked')==='true') isfav=true; else isfav=false;   let rg=document.querySelector('div[data-testid=playback-progressbar] input[type=range]');  if(rg) { duration=parseInt(rg.getAttribute('max')); position=parseInt(rg.getAttribute('value')); }  else { duration=null; position=null; }  let im=document.querySelector('img[data-testid=cover-art-image]');  if(im) cover=im.src; else cover=null;  updMedia();},2000);");
            }
            String f5 = E.f(E.f(f4, "};"), "window.addCSSJSHack=function(){");
            if (AppSingleton.f3147l.equals("csshack")) {
                f5 = E.f(f5, "if(cssint) clearInterval(cssint);cssint=setInterval(function(){  /*console.log('css_tick');*/  let lb=document.querySelector('#Desktop_LeftSidebar_Id header>div>div:first-child button:not(.fuckd)');  if(lb) {    console.log('LibBtnFuckd');    window.lBtn=lb;    lb.classList.add('fuckd','lbtn');    lb.style.padding=0;    lb.style.height='20px';    lb.addEventListener('click',function(){setTimeout(()=>switchLs(),0)});    switchLs();    AndBridge.cssInjected();  }  let lbit=document.querySelector('#Desktop_LeftSidebar_Id div[role=grid]:not(.fuckd)');  if(lbit) {    lbit.classList.add('fuckd');    lbit.addEventListener('click',()=>{setTimeout(()=>{      console.log('AutoCloseLib');      lBtn.click();      closeNowPlay();    },0)});  }  let hb=document.querySelector('#global-nav-bar button[data-testid=home-button]:not(.fuckd)');  if(hb) {    hb.classList.add('fuckd');    hb.addEventListener('click',()=>{ closeNowPlay(); });  }  let sr=document.querySelector('input[data-testid=search-input]:not(.fuckd)');  if(sr) {    sr.classList.add('fuckd');    sr.addEventListener('focus',()=>{      let npb=document.querySelector('aside[data-testid=now-playing-bar]');      if(npb) npb.style.display='none';      closeNowPlay();    });    sr.addEventListener('blur',()=>{      let npb=document.querySelector('aside[data-testid=now-playing-bar]');      if(npb) npb.style.display='flex';    });  }  let ub=document.querySelector('button[data-testid=user-widget-link]:not(.fuckd)');  if(ub) {    ub.classList.add('fuckd');    ub.addEventListener('click',()=>{ closeNowPlay(); });  }},5000);");
            }
            String f6 = E.f(f5 + "window.switchLs=function(){  let ls=document.querySelector('#Desktop_LeftSidebar_Id');  if(ls) {    let exp=ls.querySelector('nav>div>div:first-child').classList.length;    if(exp==2) {      console.log('Expanded');      ls.style.position='fixed';      ls.style.width='100%';      ls.style.height='92%';      ls.style.left=0;      ls.style.zIndex=20;      let lh=ls.querySelector('header>div>div:first-child h1');      lh.innerHTML='✖ &nbsp; " + AppSingleton.f3142f.getString(2131755234) + "';    }    else {      console.log('Collapsed');      ls.style.zIndex=1;      ls.style.position='fixed';      ls.style.top='0';      ls.style.left='60px';      ls.style.width='48px';      ls.style.height='48px';    }  }};", "};");
            if (AppSingleton.f3147l.equals("csshack")) {
                f6 = E.f(f6, "let st=document.createElement('style');st.textContent='body{min-width:100%!important;min-height:100%!important} .os-scrollbar{--os-size:6px!important} .contentSpacing{padding:0} div[data-testid=root]{--panel-gap:0!important} #main-view+div,#main-view+div>div{overflow:hidden!important;width:auto} #main-view+div>div>div>div:nth-child(2)>div{width:100vw!important} div[data-encore-id=banner],#global-nav-bar>div:first-of-type,#global-nav-bar a[href=\"/download\"],button[data-testid=fullscreen-mode-button],div.main-view-container__mh-footer-container{display:none!important} section[data-testid=artist-page]>div>div:first-child:not([data-encore-id]){height:25vh} div[data-testid=tracklist-row]{padding:0 10px 0 0;grid-gap:0} div[data-testid=tracklist-row] button:not([data-testid=add-to-playlist-button]){transform:scale(1.3)!important;opacity:0.6!important} div[data-testid=tracklist-row] button:{-webkit-margin-end:0!important} div[data-testid=tracklist-row] button:hover{color:#2d6!important} div[data-testid=tracklist-row]>div:first-child>div:first-child{height:24px;min-height:24px;min-width:24px;margin:0 8px!important} [aria-colcount=\"3\"] div[data-testid=tracklist-row]{grid-template-columns:[index] var(--tracklist-index-column-width,40px) [first] minmax(120px,var(--col1,4fr)) [last] minmax(82px,var(--col2,1fr))!important} [aria-colcount=\"4\"] div[data-testid=tracklist-row]{grid-template-columns:[index] var(--tracklist-index-column-width,40px) [first] minmax(120px,var(--col1,4fr)) [var1] minmax(120px,var(--col2,2fr)) [last] minmax(82px,var(--col3,1fr))!important} [aria-colcount=\"5\"] div[data-testid=tracklist-row]{grid-template-columns:[index] var(--tracklist-index-column-width,40px) [first] minmax(120px,var(--col1,6fr)) [var1] minmax(120px,var(--col2,4fr)) [var2] minmax(120px,var(--col3,3fr)) [last] minmax(82px,var(--col4,1fr))!important} section[data-testid=track-page]>div.contentSpacing>div:nth-child(2) [aria-colcount=\"2\"] div[data-testid=tracklist-row]{grid-template-columns:[first] minmax(120px,var(--col0,4fr)) [last] minmax(82px,var(--col1,1fr))!important} section[data-testid=track-page]>div.contentSpacing>div:nth-child(2) [aria-colcount=\"3\"] div[data-testid=tracklist-row]{grid-template-columns:[first] minmax(120px,var(--col0,4fr)) [var1] minmax(120px,var(--col1,2fr)) [last] minmax(82px,var(--col2,1fr))!important} .npbtn{cursor:pointer;color:#b3b3b3;background:transparent;border:none;width:32px;height:32px;padding:8px} .npbtn.active{color:#1db954} *{--content-spacing:10px} section[data-testid=home-page] .contentSpacing{padding:0 10px!important;overflow:hidden} div[data-testid=grid-container]{margin-inline:0!important;column-gap:0!important;overflow:hidden!important} div[data-testid=action-bar-row],div[data-testid=topbar-content]{padding:5px 10px} div[data-testid=track-list]>div:first-child,div[data-testid=playlist-tracklist]>div:first-child{margin:0!important;padding:0!important} main>section:not([data-testid=artist-page])>div:first-child{height:auto!important;min-height:auto!important;padding:10px} section[data-testid=track-page]>div>div.contentSpacing>div:last-child{overflow:hidden} section[data-testid=artist-page]>div>div:first-child>div.contentSpacing{padding:10px} section[data-testid=artist-page] div[data-testid=grid-container] h2,section[data-testid=artist-page] section[data-testid=component-shelf]{padding:0 10px} main>section h1.encore-text-headline-large{font-size:22px!important} section[data-testid=artist-page] span.encore-text-headline-large{font-size:26px!important} section[data-testid=track-page] h1{font-size:20px!important} aside[data-testid=now-playing-bar]{min-width:100%!important;box-shadow:0 0 6px #440000;background:linear-gradient(to bottom,#770000,#330000)!important} aside[data-testid=now-playing-bar]>div:first-child{margin-top:2px;flex-direction:column!important;height:auto!important} aside[data-testid=now-playing-bar]>div>div{width:100%!important} aside[data-testid=now-playing-bar]>div>div:last-child>div{min-height:32px;margin:5px 10px} aside[data-testid=now-playing-bar]>div>div:last-child button{transform:scale(1.15);margin:0 5px} div[data-testid=general-controls]{margin:15px 0 25px} div[data-testid=general-controls] button{transform:scale(1.4)!important;margin:0 8px!important} div[data-testid=player-controls]{margin:5px 0} div[data-testid=now-playing-widget]{justify-content:center;overflow:hidden} form[role=search]{z-index:10;margin-left:48px;max-width:88%} div[data-testid=now-playing-widget]>div:last-child>button{transform:scale(1.3)} div[data-testid=now-playing-widget]>div:first-child{display:none!important} div[data-testid=now-playing-widget]>div:nth-child(2){display:flex!important;overflow:hidden!important} div[data-testid=now-playing-widget]>div:nth-child(2) span{font-size:13px!important;height:20px!important;margin:0!important} div[data-testid=now-playing-widget]>div:nth-child(2)>div{min-width:auto;max-width:66%} [data-tippy-root]{overflow:hidden!important} [data-tippy-root],[data-tippy-root] *{transition:none!important;transform:none!important} div[data-testid=hover-or-focus-tooltip],#Desktop_LeftSidebar_Id header>div>div:last-child{display:none!important}#Desktop_LeftSidebar_Id>nav>div{min-height:48px;border-radius:25px} .YourLibraryX{overflow:hidden;background:var(--background-elevated-base)!important}.YourLibraryX header{padding:14px} ';document.head.appendChild(st);");
            }
            if (AppSingleton.f3152q) {
                f6 = E.f(f6, "let aled=document.createElement('style');aled.textContent='.encore-dark-theme{--background-base:#000;--background-highlight:#000;--background-elevated-base:#000;--background-elevated-highlight:#000;--background-elevated-press:#000;--background-tinted-base:#000}  aside[data-testid=now-playing-bar]{background:#000!important;box-shadow:none;border-top:1px solid #666}';document.head.appendChild(aled);");
            }
            webView.evaluateJavascript(f6.replaceAll("console\\.log\\([^)]+\\);", ""), (ValueCallback) null);
            return;
        }
        webView.evaluateJavascript("(function() {let l=document.querySelector('button[data-testid=web-player-link]');if(l) { AndBridge.loginDetected(); l.click(); }})();", (ValueCallback) null);
    }
}
