package n0;

import K0.e;
import android.view.View;

/* renamed from: n0.B  reason: case insensitive filesystem */
public class C0213B extends e {

    /* renamed from: q  reason: collision with root package name */
    public static boolean f3945q = true;

    public void n(View view, int i, int i2, int i3, int i4) {
        if (f3945q) {
            try {
                C0212A.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f3945q = false;
            }
        }
    }
}
