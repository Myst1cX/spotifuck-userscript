package com.google.android.material.datepicker;

import K0.e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import p0.C0320a;
import q0.C0322a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final e f2220a;

    /* renamed from: b  reason: collision with root package name */
    public final e f2221b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C0320a.s0(context, 2130969363, j.class.getCanonicalName()).data, C0322a.f4493l);
        e.a(context, obtainStyledAttributes.getResourceId(4, 0));
        e.a(context, obtainStyledAttributes.getResourceId(2, 0));
        e.a(context, obtainStyledAttributes.getResourceId(3, 0));
        e.a(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList J2 = C0320a.J(context, obtainStyledAttributes, 7);
        this.f2220a = e.a(context, obtainStyledAttributes.getResourceId(9, 0));
        e.a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f2221b = e.a(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(J2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
