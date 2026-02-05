package com.google.android.material.behavior;

import A.c;
import N.Q;
import O.f;
import V.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j0.C0160w;
import java.util.WeakHashMap;
import t0.C0341a;

public class SwipeDismissBehavior<V extends View> extends c {

    /* renamed from: a  reason: collision with root package name */
    public e f2103a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2104b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2105c;

    /* renamed from: d  reason: collision with root package name */
    public int f2106d = 2;
    public float e = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    public float f2107f = 0.5f;

    /* renamed from: g  reason: collision with root package name */
    public final C0341a f2108g = new C0341a(this);

    public boolean r(View view) {
        return true;
    }

    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2 = this.f2104b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f2104b = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2104b = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f2103a == null) {
            this.f2103a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f2108g);
        }
        if (this.f2105c || !this.f2103a.p(motionEvent)) {
            return false;
        }
        return true;
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = Q.f509a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            Q.m(view, 1048576);
            Q.i(view, 0);
            if (r(view)) {
                Q.n(view, f.f742j, new C0160w(this));
            }
        }
        return false;
    }

    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f2103a == null) {
            return false;
        }
        if (this.f2105c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f2103a.j(motionEvent);
        return true;
    }
}
