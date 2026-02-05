package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    public FabTransformationScrimBehavior() {
    }

    public final boolean q(View view, MotionEvent motionEvent) {
        return false;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void b(View view) {
    }
}
