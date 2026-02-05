package d0;

import A.b;
import A.k;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.t;
import java.util.ArrayList;

public class d extends MediaBrowserService {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ k f2465f;

    public d(k kVar, Context context) {
        this.f2465f = kVar;
        attachBaseContext(context);
    }

    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        b bVar = new b(23, (Object) result);
        k kVar = this.f2465f;
        kVar.getClass();
        b bVar2 = new b(str, bVar, 2);
        q qVar = (q) kVar.i;
        c cVar = qVar.f2500h;
        qVar.b(str, bVar2);
    }

    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        Bundle bundle2;
        int i2;
        Bundle bundle3;
        IBinder iBinder;
        t.j(bundle);
        Bundle bundle4 = null;
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        k kVar = this.f2465f;
        q qVar = (q) kVar.i;
        if (bundle2 == null || bundle2.getInt("extra_client_version", 0) == 0) {
            bundle3 = null;
            i2 = -1;
        } else {
            bundle2.remove("extra_client_version");
            kVar.f22g = new Messenger(qVar.f2502k);
            bundle3 = new Bundle();
            bundle3.putInt("extra_service_version", 2);
            bundle3.putBinder("extra_messenger", ((Messenger) kVar.f22g).getBinder());
            MediaSessionCompat$Token mediaSessionCompat$Token = qVar.f2503l;
            if (mediaSessionCompat$Token != null) {
                android.support.v4.media.session.d a2 = mediaSessionCompat$Token.a();
                if (a2 == null) {
                    iBinder = null;
                } else {
                    iBinder = a2.asBinder();
                }
                bundle3.putBinder("extra_session_binder", iBinder);
            } else {
                ((ArrayList) kVar.f23h).add(bundle3);
            }
            int i3 = bundle2.getInt("extra_calling_pid", -1);
            bundle2.remove("extra_calling_pid");
            i2 = i3;
        }
        c cVar = new c((q) kVar.i, str, i2, i, (b) null);
        qVar.getClass();
        if (((Messenger) kVar.f22g) != null) {
            qVar.i.add(cVar);
        }
        if (bundle3 != null) {
            bundle4 = bundle3;
        }
        return new MediaBrowserService.BrowserRoot("sfroot", bundle4);
    }
}
