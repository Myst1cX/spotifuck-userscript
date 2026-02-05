package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2440f;

    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f2440f;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f2423y.i) - clockFaceView.f2417G;
        if (height != clockFaceView.f2443w) {
            clockFaceView.f2443w = height;
            clockFaceView.m();
            int i = clockFaceView.f2443w;
            ClockHandView clockHandView = clockFaceView.f2423y;
            clockHandView.f2435q = i;
            clockHandView.invalidate();
        }
        return true;
    }

    public b(ClockFaceView clockFaceView) {
        this.f2440f = clockFaceView;
    }
}
