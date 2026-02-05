package h;

import android.view.LayoutInflater;
import androidx.activity.n;
import c.C0086b;

/* renamed from: h.k  reason: case insensitive filesystem */
public final class C0120k implements C0086b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0121l f3015a;

    public final void a(n nVar) {
        C0121l lVar = this.f3015a;
        s k2 = lVar.k();
        D d2 = (D) k2;
        LayoutInflater from = LayoutInflater.from(d2.f2889p);
        if (from.getFactory() == null) {
            from.setFactory2(d2);
        } else {
            boolean z2 = from.getFactory2() instanceof D;
        }
        lVar.i.f3568b.c("androidx:appcompat");
        k2.b();
    }

    public C0120k(C0121l lVar) {
        this.f3015a = lVar;
    }
}
