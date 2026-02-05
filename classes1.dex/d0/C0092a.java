package d0;

import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import r.b;

/* renamed from: d0.a  reason: case insensitive filesystem */
public final class C0092a extends k {
    public final /* synthetic */ c e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f2455f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Bundle f2456g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ q f2457h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0092a(q qVar, Object obj, c cVar, String str, Bundle bundle) {
        super(obj);
        this.f2457h = qVar;
        this.e = cVar;
        this.f2455f = str;
        this.f2456g = bundle;
    }

    public final void c(ArrayList arrayList) {
        String str = this.f2455f;
        b bVar = this.f2457h.f2501j;
        c cVar = this.e;
        A.b bVar2 = cVar.f2462d;
        if (bVar.getOrDefault(((Messenger) bVar2.f2g).getBinder(), (Object) null) != cVar) {
            int i = q.f2497m;
            return;
        }
        int i2 = this.f2475d & 1;
        Bundle bundle = this.f2456g;
        List list = arrayList;
        if (i2 != 0) {
            list = q.a(arrayList, bundle);
        }
        try {
            bVar2.y(str, list, bundle);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + str + " package=" + cVar.f2459a);
        }
    }
}
