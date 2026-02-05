package N;

import F.c;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public final class l0 extends o0 {
    public static Field e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f564f;

    /* renamed from: g  reason: collision with root package name */
    public static Constructor f565g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f566h;

    /* renamed from: c  reason: collision with root package name */
    public WindowInsets f567c;

    /* renamed from: d  reason: collision with root package name */
    public c f568d;

    public l0() {
        this.f567c = i();
    }

    private static WindowInsets i() {
        Class<WindowInsets> cls = WindowInsets.class;
        if (!f564f) {
            try {
                e = cls.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            f564f = true;
        }
        Field field = e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!f566h) {
            try {
                f565g = cls.getConstructor(new Class[]{Rect.class});
            } catch (ReflectiveOperationException unused3) {
            }
            f566h = true;
        }
        Constructor constructor = f565g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Object[]{new Rect()});
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    public void e(c cVar) {
        this.f568d = cVar;
    }

    public void g(c cVar) {
        WindowInsets windowInsets = this.f567c;
        if (windowInsets != null) {
            this.f567c = windowInsets.replaceSystemWindowInsets(cVar.f225a, cVar.f226b, cVar.f227c, cVar.f228d);
        }
    }

    public l0(w0 w0Var) {
        super(w0Var);
        this.f567c = w0Var.f();
    }

    public w0 b() {
        a();
        w0 g2 = w0.g((View) null, this.f567c);
        c[] cVarArr = this.f575b;
        u0 u0Var = g2.f597a;
        u0Var.o(cVarArr);
        u0Var.q(this.f568d);
        return g2;
    }
}
