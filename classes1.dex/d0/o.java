package d0;

import A.b;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import j0.C0160w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import n.C0190e;
import n.C0191f;
import n.C0197l;
import n.C0199n;
import n.C0209x;

public final class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2489a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2490b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2491c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f2492d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f2489a = i;
        this.e = obj;
        this.f2490b = obj2;
        this.f2491c = obj3;
        this.f2492d = obj4;
    }

    public final void run() {
        switch (this.f2489a) {
            case 0:
                IBinder binder = ((Messenger) ((b) this.f2490b).f2g).getBinder();
                b bVar = (b) this.e;
                c cVar = (c) ((q) bVar.f2g).f2501j.getOrDefault(binder, (Object) null);
                String str = (String) this.f2491c;
                if (cVar == null) {
                    Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + str);
                    return;
                }
                ((q) bVar.f2g).getClass();
                HashMap hashMap = cVar.e;
                IBinder iBinder = (IBinder) this.f2492d;
                boolean z2 = false;
                if (iBinder != null) {
                    List list = (List) hashMap.get(str);
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (iBinder == ((M.b) it2.next()).f479a) {
                                it2.remove();
                                z2 = true;
                            }
                        }
                        if (list.size() == 0) {
                            hashMap.remove(str);
                        }
                    }
                } else if (hashMap.remove(str) != null) {
                    z2 = true;
                }
                if (!z2) {
                    Log.w("MBServiceCompat", "removeSubscription called for " + str + " which is not subscribed");
                    return;
                }
                return;
            default:
                C0190e eVar = (C0190e) this.f2490b;
                if (eVar != null) {
                    C0160w wVar = (C0160w) this.e;
                    ((C0191f) wVar.f3516f).f3839E = true;
                    eVar.f3833b.c(false);
                    ((C0191f) wVar.f3516f).f3839E = false;
                }
                C0199n nVar = (C0199n) this.f2491c;
                if (nVar.isEnabled() && nVar.hasSubMenu()) {
                    ((C0197l) this.f2492d).q(nVar, (C0209x) null, 4);
                    return;
                }
                return;
        }
    }
}
