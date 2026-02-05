package o;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: o.u0  reason: case insensitive filesystem */
public abstract class C0307u0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Field f4305a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        f4305a = field;
    }
}
