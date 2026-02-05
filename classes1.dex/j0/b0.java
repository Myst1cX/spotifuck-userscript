package j0;

import A.b;
import N.C0002b;
import O.k;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

public final class b0 extends C0002b {

    /* renamed from: d  reason: collision with root package name */
    public final c0 f3359d;
    public final WeakHashMap e = new WeakHashMap();

    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C0002b bVar = (C0002b) this.e.get(view);
        if (bVar != null) {
            return bVar.a(view, accessibilityEvent);
        }
        return this.f523a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final b b(View view) {
        C0002b bVar = (C0002b) this.e.get(view);
        if (bVar != null) {
            return bVar.b(view);
        }
        return super.b(view);
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C0002b bVar = (C0002b) this.e.get(view);
        if (bVar != null) {
            bVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    public final void d(View view, k kVar) {
        c0 c0Var = this.f3359d;
        boolean K2 = c0Var.f3362d.K();
        View.AccessibilityDelegate accessibilityDelegate = this.f523a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f751a;
        if (!K2) {
            RecyclerView recyclerView = c0Var.f3362d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().U(view, kVar);
                C0002b bVar = (C0002b) this.e.get(view);
                if (bVar != null) {
                    bVar.d(view, kVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C0002b bVar = (C0002b) this.e.get(view);
        if (bVar != null) {
            bVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0002b bVar = (C0002b) this.e.get(viewGroup);
        if (bVar != null) {
            return bVar.f(viewGroup, view, accessibilityEvent);
        }
        return this.f523a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public final boolean g(View view, int i, Bundle bundle) {
        c0 c0Var = this.f3359d;
        if (!c0Var.f3362d.K()) {
            RecyclerView recyclerView = c0Var.f3362d;
            if (recyclerView.getLayoutManager() != null) {
                C0002b bVar = (C0002b) this.e.get(view);
                if (bVar != null) {
                    if (bVar.g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i, bundle)) {
                    return true;
                }
                Q q2 = recyclerView.getLayoutManager().f3278b.f2010g;
                return false;
            }
        }
        return super.g(view, i, bundle);
    }

    public final void h(View view, int i) {
        C0002b bVar = (C0002b) this.e.get(view);
        if (bVar != null) {
            bVar.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C0002b bVar = (C0002b) this.e.get(view);
        if (bVar != null) {
            bVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }

    public b0(c0 c0Var) {
        this.f3359d = c0Var;
    }
}
