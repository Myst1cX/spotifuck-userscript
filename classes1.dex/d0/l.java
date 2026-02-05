package d0;

import A.b;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.i;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import it.deviato.spotifuck.WebService;
import java.util.Iterator;

public final class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2476a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f2477b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f2478c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f2479d;
    public final /* synthetic */ int e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b f2480f;

    public l(b bVar, b bVar2, String str, int i, int i2, Bundle bundle) {
        this.f2480f = bVar;
        this.f2477b = bVar2;
        this.f2479d = str;
        this.f2478c = i;
        this.e = i2;
    }

    public l(b bVar, b bVar2, int i, String str, int i2, Bundle bundle) {
        this.f2480f = bVar;
        this.f2477b = bVar2;
        this.f2478c = i;
        this.f2479d = str;
        this.e = i2;
    }

    public final void run() {
        c cVar;
        switch (this.f2476a) {
            case 0:
                b bVar = this.f2477b;
                IBinder binder = ((Messenger) bVar.f2g).getBinder();
                b bVar2 = this.f2480f;
                ((q) bVar2.f2g).f2501j.remove(binder);
                String str = this.f2479d;
                c cVar2 = new c((q) bVar2.f2g, str, this.f2478c, this.e, bVar);
                q qVar = (q) bVar2.f2g;
                qVar.getClass();
                ((WebService) qVar).getClass();
                cVar2.f2463f = new i((Bundle) null);
                qVar.getClass();
                if (cVar2.f2463f == null) {
                    try {
                        bVar.C(2, (Bundle) null);
                        return;
                    } catch (RemoteException unused) {
                        Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=".concat(str));
                        return;
                    }
                } else {
                    try {
                        qVar.f2501j.put(binder, cVar2);
                        binder.linkToDeath(cVar2, 0);
                        MediaSessionCompat$Token mediaSessionCompat$Token = qVar.f2503l;
                        if (mediaSessionCompat$Token != null) {
                            i iVar = cVar2.f2463f;
                            iVar.getClass();
                            Bundle bundle = iVar.f1083a;
                            if (bundle == null) {
                                bundle = new Bundle();
                            }
                            bundle.putInt("extra_service_version", 2);
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("data_media_item_id", "sfroot");
                            bundle2.putParcelable("data_media_session_token", mediaSessionCompat$Token);
                            bundle2.putBundle("data_root_hints", bundle);
                            bVar.C(1, bundle2);
                            return;
                        }
                        return;
                    } catch (RemoteException unused2) {
                        Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=".concat(str));
                        qVar.f2501j.remove(binder);
                        return;
                    }
                }
            default:
                b bVar3 = this.f2477b;
                IBinder binder2 = ((Messenger) bVar3.f2g).getBinder();
                b bVar4 = this.f2480f;
                ((q) bVar4.f2g).f2501j.remove(binder2);
                q qVar2 = (q) bVar4.f2g;
                Iterator it2 = qVar2.i.iterator();
                while (true) {
                    cVar = null;
                    if (it2.hasNext()) {
                        c cVar3 = (c) it2.next();
                        if (cVar3.f2461c == this.f2478c) {
                            if (TextUtils.isEmpty(this.f2479d) || this.e <= 0) {
                                cVar = new c((q) bVar4.f2g, cVar3.f2459a, cVar3.f2460b, cVar3.f2461c, bVar3);
                            }
                            it2.remove();
                        }
                    }
                }
                if (cVar == null) {
                    cVar = new c((q) bVar4.f2g, this.f2479d, this.e, this.f2478c, bVar3);
                }
                qVar2.f2501j.put(binder2, cVar);
                try {
                    binder2.linkToDeath(cVar, 0);
                    return;
                } catch (RemoteException unused3) {
                    Log.w("MBServiceCompat", "IBinder is already dead.");
                    return;
                }
        }
    }
}
