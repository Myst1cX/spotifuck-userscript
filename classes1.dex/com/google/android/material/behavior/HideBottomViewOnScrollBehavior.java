package com.google.android.material.behavior;

import A.c;
import N.Y;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p0.C0320a;
import r0.C0324a;

public class HideBottomViewOnScrollBehavior<V extends View> extends c {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f2096a = new LinkedHashSet();

    /* renamed from: b  reason: collision with root package name */
    public int f2097b;

    /* renamed from: c  reason: collision with root package name */
    public int f2098c;

    /* renamed from: d  reason: collision with root package name */
    public TimeInterpolator f2099d;
    public TimeInterpolator e;

    /* renamed from: f  reason: collision with root package name */
    public int f2100f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f2101g = 2;

    /* renamed from: h  reason: collision with root package name */
    public ViewPropertyAnimator f2102h;

    public HideBottomViewOnScrollBehavior() {
    }

    public boolean o(View view, int i, int i2) {
        if (i == 2) {
            return true;
        }
        return false;
    }

    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f2096a;
        if (i > 0) {
            if (this.f2101g != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.f2102h;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.f2101g = 1;
                Iterator it2 = linkedHashSet.iterator();
                if (!it2.hasNext()) {
                    int i4 = this.f2100f;
                    this.f2102h = view.animate().translationY((float) i4).setInterpolator(this.e).setDuration((long) this.f2098c).setListener(new Y(5, (Object) this));
                    return;
                }
                it2.next().getClass();
                throw new ClassCastException();
            }
        } else if (i < 0 && this.f2101g != 2) {
            ViewPropertyAnimator viewPropertyAnimator2 = this.f2102h;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            this.f2101g = 2;
            Iterator it3 = linkedHashSet.iterator();
            if (!it3.hasNext()) {
                this.f2102h = view.animate().translationY((float) 0).setInterpolator(this.f2099d).setDuration((long) this.f2097b).setListener(new Y(5, (Object) this));
                return;
            }
            it3.next().getClass();
            throw new ClassCastException();
        }
    }

    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f2100f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f2097b = C0320a.q0(view.getContext(), 2130969422, 225);
        this.f2098c = C0320a.q0(view.getContext(), 2130969428, 175);
        this.f2099d = C0320a.r0(view.getContext(), 2130969438, C0324a.f4558d);
        this.e = C0320a.r0(view.getContext(), 2130969438, C0324a.f4557c);
        return false;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
