package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class ClippableRoundedCornerLayout extends FrameLayout {
    public float getCornerRadius() {
        return 0.0f;
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }
}
