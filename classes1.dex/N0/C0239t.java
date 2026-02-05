package n0;

import android.os.Build;

/* renamed from: n0.t  reason: case insensitive filesystem */
public abstract class C0239t {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f4027a;

    static {
        boolean z2;
        if (Build.VERSION.SDK_INT >= 28) {
            z2 = true;
        } else {
            z2 = false;
        }
        f4027a = z2;
    }
}
