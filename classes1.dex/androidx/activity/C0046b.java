package androidx.activity;

import Z0.c;
import android.window.BackEvent;

/* renamed from: androidx.activity.b  reason: case insensitive filesystem */
public final class C0046b {

    /* renamed from: a  reason: collision with root package name */
    public final float f1147a;

    /* renamed from: b  reason: collision with root package name */
    public final float f1148b;

    /* renamed from: c  reason: collision with root package name */
    public final float f1149c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1150d;

    public C0046b(BackEvent backEvent) {
        c.e("backEvent", backEvent);
        float c2 = C0045a.c(backEvent);
        float d2 = C0045a.d(backEvent);
        float a2 = C0045a.a(backEvent);
        int b2 = C0045a.b(backEvent);
        this.f1147a = c2;
        this.f1148b = d2;
        this.f1149c = a2;
        this.f1150d = b2;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f1147a + ", touchY=" + this.f1148b + ", progress=" + this.f1149c + ", swipeEdge=" + this.f1150d + '}';
    }
}
