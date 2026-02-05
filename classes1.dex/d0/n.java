package d0;

import A.b;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import b.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2484a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f2485b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f2486c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Bundle f2487d;
    public final /* synthetic */ b e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f2488f;

    public n(b bVar, b bVar2, String str, IBinder iBinder, Bundle bundle) {
        this.e = bVar;
        this.f2485b = bVar2;
        this.f2486c = str;
        this.f2488f = iBinder;
        this.f2487d = bundle;
    }

    public n(b bVar, b bVar2, String str, Bundle bundle, d dVar) {
        this.e = bVar;
        this.f2485b = bVar2;
        this.f2486c = str;
        this.f2487d = bundle;
        this.f2488f = dVar;
    }

    public final void run() {
        switch (this.f2484a) {
            case 0:
                IBinder binder = ((Messenger) this.f2485b.f2g).getBinder();
                b bVar = this.e;
                c cVar = (c) ((q) bVar.f2g).f2501j.getOrDefault(binder, (Object) null);
                if (cVar == null) {
                    Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + this.f2486c);
                    return;
                }
                q qVar = (q) bVar.f2g;
                qVar.getClass();
                HashMap hashMap = cVar.e;
                String str = this.f2486c;
                List list = (List) hashMap.get(str);
                if (list == null) {
                    list = new ArrayList();
                }
                Iterator it2 = list.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    IBinder iBinder = (IBinder) this.f2488f;
                    Bundle bundle = this.f2487d;
                    if (hasNext) {
                        M.b bVar2 = (M.b) it2.next();
                        if (iBinder == bVar2.f479a) {
                            Bundle bundle2 = (Bundle) bVar2.f480b;
                            if (bundle != bundle2) {
                                if (bundle == null) {
                                    if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                        return;
                                    }
                                } else if (bundle2 == null) {
                                    if (bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                                        return;
                                    }
                                } else if (bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    } else {
                        list.add(new M.b(iBinder, bundle));
                        hashMap.put(str, list);
                        C0092a aVar = new C0092a(qVar, str, cVar, str, bundle);
                        if (bundle == null) {
                            qVar.b(str, aVar);
                        } else {
                            aVar.f2475d = 1;
                            qVar.b(str, aVar);
                        }
                        if (!aVar.b()) {
                            throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + cVar.f2459a + " id=" + str);
                        }
                        return;
                    }
                }
            default:
                IBinder binder2 = ((Messenger) this.f2485b.f2g).getBinder();
                b bVar3 = this.e;
                if (((c) ((q) bVar3.f2g).f2501j.getOrDefault(binder2, (Object) null)) == null) {
                    Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.f2486c + ", extras=" + this.f2487d);
                    return;
                }
                ((q) bVar3.f2g).getClass();
                ((d) this.f2488f).b(-1, (Bundle) null);
                return;
        }
    }
}
