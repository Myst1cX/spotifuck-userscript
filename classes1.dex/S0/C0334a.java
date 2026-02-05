package s0;

import A.c;
import N.Q;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.datepicker.k;

/* renamed from: s0.a  reason: case insensitive filesystem */
public abstract class C0334a extends c {

    /* renamed from: a  reason: collision with root package name */
    public k f4635a;

    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f4635a == null) {
            this.f4635a = new k(view);
        }
        k kVar = this.f4635a;
        View view2 = kVar.f2247f;
        kVar.f2248g = view2.getTop();
        kVar.f2249h = view2.getLeft();
        k kVar2 = this.f4635a;
        View view3 = kVar2.f2247f;
        Q.k(view3, 0 - (view3.getTop() - kVar2.f2248g));
        Q.j(view3, 0 - (view3.getLeft() - kVar2.f2249h));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
