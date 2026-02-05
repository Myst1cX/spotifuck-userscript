package com.google.android.material.theme;

import E0.m;
import N0.x;
import P0.a;
import T.b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import h.G;
import o.C0249D;
import o.C0273d0;
import o.C0294o;
import o.C0296p;
import o.C0298q;
import p0.C0320a;
import q0.C0322a;
import y0.C0358c;

public class MaterialComponentsViewInflater extends G {
    public final C0294o a(Context context, AttributeSet attributeSet) {
        return new x(context, attributeSet);
    }

    public final C0296p b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    public final C0298q c(Context context, AttributeSet attributeSet) {
        return new C0358c(context, attributeSet);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [o.D, android.widget.CompoundButton, android.view.View, G0.a] */
    public final C0249D d(Context context, AttributeSet attributeSet) {
        ? d2 = new C0249D(a.a(context, attributeSet, 2130969548, 2131821627), attributeSet);
        Context context2 = d2.getContext();
        TypedArray f2 = m.f(context2, attributeSet, C0322a.f4496o, 2130969548, 2131821627, new int[0]);
        if (f2.hasValue(0)) {
            b.c(d2, C0320a.J(context2, f2, 0));
        }
        d2.f263k = f2.getBoolean(1, false);
        f2.recycle();
        return d2;
    }

    public final C0273d0 e(Context context, AttributeSet attributeSet) {
        C0273d0 d0Var = new C0273d0(a.a(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = d0Var.getContext();
        if (C0320a.p0(context2, 2130969750, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = C0322a.f4499r;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int h2 = O0.a.h(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (h2 == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, C0322a.f4498q);
                    int h3 = O0.a.h(d0Var.getContext(), obtainStyledAttributes3, 1, 2);
                    obtainStyledAttributes3.recycle();
                    if (h3 >= 0) {
                        d0Var.setLineHeight(h3);
                    }
                }
            }
        }
        return d0Var;
    }
}
