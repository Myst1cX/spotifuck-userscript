package L;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f456a;

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f456a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public static String a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return d.c(d.a(d.b(locale)));
        }
        try {
            return c.a((Locale) f456a.invoke((Object) null, new Object[]{locale}));
        } catch (InvocationTargetException e) {
            Log.w("ICUCompat", e);
            return c.a(locale);
        } catch (IllegalAccessException e2) {
            Log.w("ICUCompat", e2);
            return c.a(locale);
        }
    }
}
