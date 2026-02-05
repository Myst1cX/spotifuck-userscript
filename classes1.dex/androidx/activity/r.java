package androidx.activity;

import Y0.a;
import Z0.d;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

public final class r extends d implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final r f1196a = new d(0);

    public final Object a() {
        Class<InputMethodManager> cls = InputMethodManager.class;
        try {
            Field declaredField = cls.getDeclaredField("mServedView");
            declaredField.setAccessible(true);
            Field declaredField2 = cls.getDeclaredField("mNextServedView");
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mH");
            declaredField3.setAccessible(true);
            return new t(declaredField3, declaredField, declaredField2);
        } catch (NoSuchFieldException unused) {
            return s.f1197a;
        }
    }
}
