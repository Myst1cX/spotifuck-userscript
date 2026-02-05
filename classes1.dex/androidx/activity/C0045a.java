package androidx.activity;

import Z0.c;
import android.window.BackEvent;

/* renamed from: androidx.activity.a  reason: case insensitive filesystem */
public abstract class C0045a {
    public static float a(BackEvent backEvent) {
        c.e("backEvent", backEvent);
        return backEvent.getProgress();
    }

    public static int b(BackEvent backEvent) {
        c.e("backEvent", backEvent);
        return backEvent.getSwipeEdge();
    }

    public static float c(BackEvent backEvent) {
        c.e("backEvent", backEvent);
        return backEvent.getTouchX();
    }

    public static float d(BackEvent backEvent) {
        c.e("backEvent", backEvent);
        return backEvent.getTouchY();
    }
}
