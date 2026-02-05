package N;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

public abstract class k0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Field f560a;

    /* renamed from: b  reason: collision with root package name */
    public static final Field f561b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f562c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f563d = true;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f560a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f561b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f562c = declaredField3;
            declaredField3.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
        }
    }
}
