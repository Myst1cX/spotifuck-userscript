package m;

import android.view.MenuItem;
import java.lang.reflect.Method;

public final class f implements MenuItem.OnMenuItemClickListener {

    /* renamed from: h  reason: collision with root package name */
    public static final Class[] f3624h = {MenuItem.class};

    /* renamed from: f  reason: collision with root package name */
    public Object f3625f;

    /* renamed from: g  reason: collision with root package name */
    public Method f3626g;

    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f3626g;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f3625f;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, new Object[]{menuItem})).booleanValue();
            }
            method.invoke(obj, new Object[]{menuItem});
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
