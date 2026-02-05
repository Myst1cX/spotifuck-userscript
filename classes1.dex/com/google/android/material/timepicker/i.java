package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

public final class i implements View.OnTouchListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ GestureDetector f2448f;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f2448f.onTouchEvent(motionEvent);
        }
        return false;
    }

    public i(GestureDetector gestureDetector) {
        this.f2448f = gestureDetector;
    }
}
