package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class TouchObserverFrameLayout extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    public View.OnTouchListener f2309f;

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.f2309f;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f2309f = onTouchListener;
    }

    public TouchObserverFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
