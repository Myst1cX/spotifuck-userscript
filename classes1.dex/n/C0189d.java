package n;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import o.C0259N;
import o.C0262Q;
import o.M0;

/* renamed from: n.d  reason: case insensitive filesystem */
public final class C0189d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3830f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f3831g;

    public /* synthetic */ C0189d(int i, Object obj) {
        this.f3830f = i;
        this.f3831g = obj;
    }

    public final void onGlobalLayout() {
        switch (this.f3830f) {
            case 0:
                C0191f fVar = (C0191f) this.f3831g;
                if (fVar.a()) {
                    ArrayList arrayList = fVar.f3845m;
                    if (arrayList.size() > 0 && !((C0190e) arrayList.get(0)).f3832a.f4072D) {
                        View view = fVar.f3852t;
                        if (view == null || !view.isShown()) {
                            fVar.dismiss();
                            return;
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((C0190e) it2.next()).f3832a.i();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C0184C c2 = (C0184C) this.f3831g;
                if (c2.a()) {
                    M0 m0 = c2.f3799m;
                    if (!m0.f4072D) {
                        View view2 = c2.f3804r;
                        if (view2 == null || !view2.isShown()) {
                            c2.dismiss();
                            return;
                        } else {
                            m0.i();
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                C0262Q q2 = (C0262Q) this.f3831g;
                if (!q2.getInternalPopup().a()) {
                    q2.f4127k.f(q2.getTextDirection(), q2.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = q2.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    return;
                }
                return;
            default:
                C0259N n2 = (C0259N) this.f3831g;
                C0262Q q3 = n2.f4111M;
                n2.getClass();
                if (!q3.isAttachedToWindow() || !q3.getGlobalVisibleRect(n2.f4109K)) {
                    n2.dismiss();
                    return;
                }
                n2.s();
                n2.i();
                return;
        }
    }
}
