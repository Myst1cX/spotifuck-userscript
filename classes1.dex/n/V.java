package N;

import android.content.Context;
import android.os.Build;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

public abstract class V {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f515a;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f515a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", (Class[]) null);
            } catch (Exception unused) {
            }
        }
    }

    public static float a(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f515a) != null) {
            try {
                return (float) ((Integer) method.invoke(viewConfiguration, (Object[]) null)).intValue();
            } catch (Exception unused) {
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }
}
