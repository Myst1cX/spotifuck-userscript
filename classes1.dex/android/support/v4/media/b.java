package android.support.v4.media;

import E.j;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.d;
import android.support.v4.media.session.f;
import android.support.v4.media.session.n;
import android.util.Log;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;

public final class b extends MediaBrowser.ConnectionCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f0.b f1073a;

    /* JADX WARNING: type inference failed for: r5v5, types: [android.support.v4.media.session.c, java.lang.Object] */
    public final void onConnected() {
        f fVar;
        d dVar;
        MediaSessionCompat$Token mediaSessionCompat$Token;
        f0.b bVar = this.f1073a;
        c cVar = (c) bVar.f2514b;
        MediaSessionCompat$Token mediaSessionCompat$Token2 = null;
        if (cVar != null) {
            MediaBrowser mediaBrowser = cVar.f1075b;
            try {
                Bundle extras = mediaBrowser.getExtras();
                if (extras != null) {
                    extras.getInt("extra_service_version", 0);
                    IBinder binder = extras.getBinder("extra_messenger");
                    if (binder != null) {
                        j jVar = new j(5, false);
                        jVar.f108g = new Messenger(binder);
                        jVar.f109h = cVar.f1076c;
                        cVar.f1078f = jVar;
                        a aVar = cVar.f1077d;
                        Messenger messenger = new Messenger(aVar);
                        cVar.f1079g = messenger;
                        aVar.getClass();
                        aVar.f1072b = new WeakReference(messenger);
                        try {
                            j jVar2 = cVar.f1078f;
                            Context context = cVar.f1074a;
                            Messenger messenger2 = cVar.f1079g;
                            jVar2.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putString("data_package_name", context.getPackageName());
                            bundle.putInt("data_calling_pid", Process.myPid());
                            bundle.putBundle("data_root_hints", (Bundle) jVar2.f109h);
                            jVar2.M(6, bundle, messenger2);
                        } catch (RemoteException unused) {
                        }
                    }
                    IBinder binder2 = extras.getBinder("extra_session_binder");
                    int i = n.f1119c;
                    if (binder2 == null) {
                        dVar = null;
                    } else {
                        IInterface queryLocalInterface = binder2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof d)) {
                            ? obj = new Object();
                            obj.f1111b = binder2;
                            dVar = obj;
                        } else {
                            dVar = (d) queryLocalInterface;
                        }
                    }
                    if (dVar != null) {
                        MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
                        if (sessionToken != null) {
                            mediaSessionCompat$Token = new MediaSessionCompat$Token(sessionToken, dVar);
                        } else {
                            mediaSessionCompat$Token = null;
                        }
                        cVar.f1080h = mediaSessionCompat$Token;
                    }
                }
            } catch (IllegalStateException e) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
            }
        }
        c cVar2 = ((f) bVar.f2517f).f1082a;
        if (cVar2.f1080h == null) {
            MediaSession.Token sessionToken2 = cVar2.f1075b.getSessionToken();
            if (sessionToken2 != null) {
                mediaSessionCompat$Token2 = new MediaSessionCompat$Token(sessionToken2, (d) null);
            }
            cVar2.f1080h = mediaSessionCompat$Token2;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token3 = cVar2.f1080h;
        if (mediaSessionCompat$Token3 != null) {
            Collections.synchronizedSet(new HashSet());
            int i2 = Build.VERSION.SDK_INT;
            Context context2 = (Context) bVar.f2515c;
            if (i2 >= 29) {
                fVar = new f(context2, mediaSessionCompat$Token3);
            } else {
                fVar = new f(context2, mediaSessionCompat$Token3);
            }
            KeyEvent keyEvent = (KeyEvent) ((Intent) bVar.f2516d).getParcelableExtra("android.intent.extra.KEY_EVENT");
            if (keyEvent != null) {
                fVar.f1113a.dispatchMediaButtonEvent(keyEvent);
                bVar.c();
                return;
            }
            throw new IllegalArgumentException("KeyEvent may not be null");
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public b(f0.b bVar) {
        this.f1073a = bVar;
    }

    public final void onConnectionFailed() {
        f0.b bVar = this.f1073a;
        c cVar = (c) bVar.f2514b;
        if (cVar != null) {
            cVar.getClass();
        }
        bVar.c();
    }

    public final void onConnectionSuspended() {
        f0.b bVar = this.f1073a;
        c cVar = (c) bVar.f2514b;
        if (cVar != null) {
            cVar.f1078f = null;
            cVar.f1079g = null;
            cVar.f1080h = null;
            a aVar = cVar.f1077d;
            aVar.getClass();
            aVar.f1072b = new WeakReference((Object) null);
        }
        bVar.c();
    }
}
