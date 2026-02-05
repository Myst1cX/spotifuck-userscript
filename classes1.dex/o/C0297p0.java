package o;

import G.h;
import G.i;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* renamed from: o.p0  reason: case insensitive filesystem */
public abstract class C0297p0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f4281a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f4282b = new int[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Rect f4283c = new Rect();

    public static PorterDuff.Mode c(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static Rect b(Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Insets a2 = C0295o0.a(drawable);
            return new Rect(a2.left, a2.top, a2.right, a2.bottom);
        }
        if (drawable instanceof h) {
            drawable = ((i) ((h) drawable)).f256k;
        }
        if (i >= 29) {
            boolean z2 = C0293n0.f4267a;
        } else if (C0293n0.f4267a) {
            try {
                Object invoke = C0293n0.f4268b.invoke(drawable, (Object[]) null);
                if (invoke != null) {
                    return new Rect(C0293n0.f4269c.getInt(invoke), C0293n0.f4270d.getInt(invoke), C0293n0.e.getInt(invoke), C0293n0.f4271f.getInt(invoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f4283c;
    }

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        int[] iArr = f4281a;
        int[] iArr2 = f4282b;
        if (i == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(iArr);
            } else {
                drawable.setState(iArr2);
            }
            drawable.setState(state);
        } else if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state2 = drawable.getState();
            if (state2 == null || state2.length == 0) {
                drawable.setState(iArr);
            } else {
                drawable.setState(iArr2);
            }
            drawable.setState(state2);
        }
    }
}
