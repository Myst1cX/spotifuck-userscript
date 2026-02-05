package com.google.android.material.timepicker;

import N.C0002b;
import O.f;
import O.j;
import O.k;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

public final class c extends C0002b {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2441d;

    public c(ClockFaceView clockFaceView) {
        this.f2441d = clockFaceView;
    }

    public final void d(View view, k kVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f523a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f751a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(2131296545)).intValue();
        if (intValue > 0) {
            View view2 = (View) this.f2441d.f2413C.get(intValue - 1);
            if (Build.VERSION.SDK_INT >= 22) {
                accessibilityNodeInfo.setTraversalAfter(view2);
            }
        }
        kVar.i(j.a(view.isSelected(), 0, 1, intValue, 1));
        accessibilityNodeInfo.setClickable(true);
        kVar.b(f.e);
    }

    public final boolean g(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.g(view, i, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f2441d;
        view.getHitRect(clockFaceView.f2424z);
        float centerX = (float) clockFaceView.f2424z.centerX();
        float centerY = (float) clockFaceView.f2424z.centerY();
        clockFaceView.f2423y.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
        clockFaceView.f2423y.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
        return true;
    }
}
