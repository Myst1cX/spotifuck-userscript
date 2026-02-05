package com.google.android.material.floatingactionbutton;

import A.c;
import A.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import q0.C0322a;

public class FloatingActionButton$BaseBehavior<T> extends c {
    public FloatingActionButton$BaseBehavior() {
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0322a.f4489g);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    public final boolean a(View view) {
        throw new ClassCastException();
    }

    public final void c(f fVar) {
        if (fVar.f10h == 0) {
            fVar.f10h = 80;
        }
    }

    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }
}
