package N0;

import N.D;
import N.Q;
import O.b;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import n.C0184C;
import n.C0191f;

public final class o implements View.OnAttachStateChangeListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f649f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f650g;

    public /* synthetic */ o(int i, Object obj) {
        this.f649f = i;
        this.f650g = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.f650g;
        switch (this.f649f) {
            case 0:
                q qVar = (q) obj;
                if (qVar.f675z != null && (accessibilityManager = qVar.f674y) != null) {
                    WeakHashMap weakHashMap = Q.f509a;
                    if (qVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new b(qVar.f675z));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = Q.f509a;
                D.c(view2);
                return;
            default:
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f649f) {
            case 0:
                q qVar = (q) this.f650g;
                k kVar = qVar.f675z;
                if (kVar != null && (accessibilityManager = qVar.f674y) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new b(kVar));
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                C0191f fVar = (C0191f) this.f650g;
                ViewTreeObserver viewTreeObserver = fVar.f3837C;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.f3837C = view.getViewTreeObserver();
                    }
                    fVar.f3837C.removeGlobalOnLayoutListener(fVar.f3846n);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                C0184C c2 = (C0184C) this.f650g;
                ViewTreeObserver viewTreeObserver2 = c2.f3806t;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        c2.f3806t = view.getViewTreeObserver();
                    }
                    c2.f3806t.removeGlobalOnLayoutListener(c2.f3800n);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }
}
