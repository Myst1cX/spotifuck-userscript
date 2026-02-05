package n0;

import T0.g;
import android.view.ViewGroup;

/* renamed from: n0.d  reason: case insensitive filesystem */
public final class C0223d extends C0233n {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3967a = false;

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup f3968b;

    public final void a() {
        g.Q(this.f3968b, false);
    }

    public final void b(C0232m mVar) {
        if (!this.f3967a) {
            g.Q(this.f3968b, false);
        }
        mVar.x(this);
    }

    public final void d() {
        g.Q(this.f3968b, true);
    }

    public final void g(C0232m mVar) {
        g.Q(this.f3968b, false);
        this.f3967a = true;
    }

    public C0223d(ViewGroup viewGroup) {
        this.f3968b = viewGroup;
    }
}
