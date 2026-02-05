package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

public final class w implements View.OnAttachStateChangeListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ M f1782f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ x f1783g;

    public final void onViewDetachedFromWindow(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        M m2 = this.f1782f;
        m2.k();
        C0055i.f((ViewGroup) m2.f1630c.f1737J.getParent(), this.f1783g.f1784f.D()).e();
    }

    public w(x xVar, M m2) {
        this.f1783g = xVar;
        this.f1782f = m2;
    }
}
