package com.google.android.material.datepicker;

import N.r;
import N.w0;
import android.view.View;

public final class k implements r {

    /* renamed from: f  reason: collision with root package name */
    public final View f2247f;

    /* renamed from: g  reason: collision with root package name */
    public int f2248g;

    /* renamed from: h  reason: collision with root package name */
    public int f2249h;

    public k(View view) {
        this.f2247f = view;
    }

    public w0 l(View view, w0 w0Var) {
        int i = w0Var.f597a.f(7).f226b;
        View view2 = this.f2247f;
        int i2 = this.f2248g;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f2249h + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return w0Var;
    }

    public k(View view, int i, int i2) {
        this.f2248g = i;
        this.f2247f = view;
        this.f2249h = i2;
    }
}
