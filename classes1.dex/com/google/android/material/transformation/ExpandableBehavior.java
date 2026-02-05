package com.google.android.material.transformation;

import A.c;
import N.Q;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;

@Deprecated
public abstract class ExpandableBehavior extends c {
    public ExpandableBehavior() {
    }

    public abstract void b(View view);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = Q.f509a;
        if (!view.isLaidOut()) {
            ArrayList j2 = coordinatorLayout.j(view);
            int size = j2.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) j2.get(i2);
                b(view);
            }
        }
        return false;
    }

    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }
}
