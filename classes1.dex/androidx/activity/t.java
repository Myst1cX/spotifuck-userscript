package androidx.activity;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

public final class t extends q {

    /* renamed from: a  reason: collision with root package name */
    public final Field f1198a;

    /* renamed from: b  reason: collision with root package name */
    public final Field f1199b;

    /* renamed from: c  reason: collision with root package name */
    public final Field f1200c;

    public final View c(InputMethodManager inputMethodManager) {
        try {
            return (View) this.f1199b.get(inputMethodManager);
        } catch (ClassCastException | IllegalAccessException unused) {
            return null;
        }
    }

    public final boolean a(InputMethodManager inputMethodManager) {
        try {
            this.f1200c.set(inputMethodManager, (Object) null);
            return true;
        } catch (IllegalAccessException unused) {
            return false;
        }
    }

    public final Object b(InputMethodManager inputMethodManager) {
        try {
            return this.f1198a.get(inputMethodManager);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    public t(Field field, Field field2, Field field3) {
        this.f1198a = field;
        this.f1199b = field2;
        this.f1200c = field3;
    }
}
