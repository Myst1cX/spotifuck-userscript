package h;

import E.j;
import N.D;
import N.Q;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
import p0.C0320a;

public final class L extends C0320a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f2918o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ N f2919p;

    public /* synthetic */ L(N n2, int i) {
        this.f2918o = i;
        this.f2919p = n2;
    }

    public final void a() {
        View view;
        N n2 = this.f2919p;
        switch (this.f2918o) {
            case 0:
                if (n2.f2948z && (view = n2.f2940r) != null) {
                    view.setTranslationY(0.0f);
                    n2.f2937o.setTranslationY(0.0f);
                }
                n2.f2937o.setVisibility(8);
                n2.f2937o.setTransitioning(false);
                n2.f2929D = null;
                j jVar = n2.f2944v;
                if (jVar != null) {
                    jVar.E(n2.f2943u);
                    n2.f2943u = null;
                    n2.f2944v = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = n2.f2936n;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = Q.f509a;
                    D.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                n2.f2929D = null;
                n2.f2937o.requestLayout();
                return;
        }
    }
}
