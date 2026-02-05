package d0;

import A.b;
import android.os.IBinder;
import android.os.Messenger;

public final class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2481a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f2482b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f2483c;

    public /* synthetic */ m(b bVar, b bVar2, int i) {
        this.f2481a = i;
        this.f2483c = bVar;
        this.f2482b = bVar2;
    }

    public final void run() {
        switch (this.f2481a) {
            case 0:
                c cVar = (c) ((q) this.f2483c.f2g).f2501j.remove(((Messenger) this.f2482b.f2g).getBinder());
                if (cVar != null) {
                    ((Messenger) cVar.f2462d.f2g).getBinder().unlinkToDeath(cVar, 0);
                    return;
                }
                return;
            default:
                IBinder binder = ((Messenger) this.f2482b.f2g).getBinder();
                c cVar2 = (c) ((q) this.f2483c.f2g).f2501j.remove(binder);
                if (cVar2 != null) {
                    binder.unlinkToDeath(cVar2, 0);
                    return;
                }
                return;
        }
    }
}
