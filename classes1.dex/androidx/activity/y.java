package androidx.activity;

import R0.h;
import T0.a;
import Z0.c;

public final class y implements c {

    /* renamed from: a  reason: collision with root package name */
    public final h f1211a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ A f1212b;

    public final void cancel() {
        A a2 = this.f1212b;
        a aVar = a2.f1135b;
        h hVar = this.f1211a;
        aVar.remove((Object) hVar);
        if (c.a(a2.f1136c, hVar)) {
            hVar.getClass();
            a2.f1136c = null;
        }
        hVar.f862b.remove(this);
        z zVar = hVar.f863c;
        if (zVar != null) {
            zVar.a();
        }
        hVar.f863c = null;
    }

    public y(A a2, h hVar) {
        c.e("onBackPressedCallback", hVar);
        this.f1212b = a2;
        this.f1211a = hVar;
    }
}
