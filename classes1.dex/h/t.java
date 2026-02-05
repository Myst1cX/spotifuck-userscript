package h;

import N.Q;
import N.Z;
import android.view.ViewGroup;

public final class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3036a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ D f3037b;

    public /* synthetic */ t(D d2, int i) {
        this.f3036a = i;
        this.f3037b = d2;
    }

    public final void run() {
        boolean z2;
        ViewGroup viewGroup;
        switch (this.f3036a) {
            case 0:
                D d2 = this.f3037b;
                if ((d2.f2881f0 & 1) != 0) {
                    d2.t(0);
                }
                if ((d2.f2881f0 & 4096) != 0) {
                    d2.t(108);
                }
                d2.f2880e0 = false;
                d2.f2881f0 = 0;
                return;
            default:
                D d3 = this.f3037b;
                d3.f2852B.showAtLocation(d3.f2851A, 55, 0, 0);
                Z z3 = d3.f2854D;
                if (z3 != null) {
                    z3.b();
                }
                if (!d3.f2856F || (viewGroup = d3.f2857G) == null || !viewGroup.isLaidOut()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    d3.f2851A.setAlpha(0.0f);
                    Z a2 = Q.a(d3.f2851A);
                    a2.a(1.0f);
                    d3.f2854D = a2;
                    a2.d(new v(0, this));
                    return;
                }
                d3.f2851A.setAlpha(1.0f);
                d3.f2851A.setVisibility(0);
                return;
        }
    }
}
