package com.google.android.material.snackbar;

import A.b;
import K0.e;
import M0.c;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h  reason: collision with root package name */
    public final e f2330h;

    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f2330h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (b.f0h == null) {
                    b.f0h = new b(4);
                }
                synchronized (b.f0h.f2g) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (b.f0h == null) {
                b.f0h = new b(4);
            }
            b.f0h.z();
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    public final boolean r(View view) {
        this.f2330h.getClass();
        return view instanceof c;
    }

    public BaseTransientBottomBar$Behavior() {
        e eVar = new e(2);
        this.e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f2107f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f2106d = 0;
        this.f2330h = eVar;
    }
}
