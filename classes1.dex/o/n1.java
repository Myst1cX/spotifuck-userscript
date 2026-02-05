package o;

import android.os.Build;
import java.lang.reflect.Method;

public abstract class n1 {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f4272a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f4273b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f4274c;

    static {
        boolean z2;
        if (Build.VERSION.SDK_INT >= 27) {
            z2 = true;
        } else {
            z2 = false;
        }
        f4274c = z2;
    }
}
