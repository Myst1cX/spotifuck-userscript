package n0;

import android.os.Build;
import android.view.View;

/* renamed from: n0.D  reason: case insensitive filesystem */
public class C0215D extends C0213B {

    /* renamed from: r  reason: collision with root package name */
    public static boolean f3946r = true;

    public void p(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.p(view, i);
        } else if (f3946r) {
            try {
                C0214C.a(view, i);
            } catch (NoSuchMethodError unused) {
                f3946r = false;
            }
        }
    }
}
