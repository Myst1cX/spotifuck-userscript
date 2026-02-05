package com.google.android.material.appbar;

import A.c;
import A.f;
import N.Q;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import p0.C0320a;
import q0.C0322a;
import s0.C0334a;

public class AppBarLayout$ScrollingViewBehavior extends C0334a {

    /* renamed from: b  reason: collision with root package name */
    public final int f2089b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public final void b(View view) {
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
        }
    }

    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i;
        c cVar = ((f) view2.getLayoutParams()).f4a;
        if (cVar instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) cVar).getClass();
            int i2 = this.f2089b;
            if (i2 == 0) {
                i = 0;
            } else {
                i = C0320a.l((int) (0.0f * ((float) i2)), 0, i2);
            }
            Q.k(view, bottom - i);
        }
        return false;
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    public final void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0322a.f4502u);
        this.f2089b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
