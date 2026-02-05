package n0;

import K0.e;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* renamed from: n0.w  reason: case insensitive filesystem */
public abstract class C0242w {

    /* renamed from: a  reason: collision with root package name */
    public static final e f4031a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0221b f4032b = new C0221b(Float.class, "translationAlpha", 5);

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f4031a = new e(25);
        } else if (i >= 23) {
            f4031a = new e(25);
        } else if (i >= 22) {
            f4031a = new e(25);
        } else {
            f4031a = new e(25);
        }
        new C0221b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        f4031a.n(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        f4031a.p(view, i);
    }
}
