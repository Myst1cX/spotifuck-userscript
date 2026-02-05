package N;

import F.c;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public abstract class p0 extends u0 {

    /* renamed from: h  reason: collision with root package name */
    public static boolean f576h;
    public static Method i;

    /* renamed from: j  reason: collision with root package name */
    public static Class f577j;

    /* renamed from: k  reason: collision with root package name */
    public static Field f578k;

    /* renamed from: l  reason: collision with root package name */
    public static Field f579l;

    /* renamed from: c  reason: collision with root package name */
    public final WindowInsets f580c;

    /* renamed from: d  reason: collision with root package name */
    public c[] f581d;
    public c e = null;

    /* renamed from: f  reason: collision with root package name */
    public w0 f582f;

    /* renamed from: g  reason: collision with root package name */
    public c f583g;

    @SuppressLint({"PrivateApi"})
    private static void v() {
        try {
            i = View.class.getDeclaredMethod("getViewRootImpl", (Class[]) null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f577j = cls;
            f578k = cls.getDeclaredField("mVisibleInsets");
            f579l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f578k.setAccessible(true);
            f579l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f576h = true;
    }

    public c f(int i2) {
        return r(i2, false);
    }

    public w0 l(int i2, int i3, int i4, int i5) {
        o0 o0Var;
        w0 g2 = w0.g((View) null, this.f580c);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            o0Var = new n0(g2);
        } else if (i6 >= 29) {
            o0Var = new m0(g2);
        } else {
            o0Var = new l0(g2);
        }
        o0Var.g(w0.e(j(), i2, i3, i4, i5));
        o0Var.e(w0.e(h(), i2, i3, i4, i5));
        return o0Var.b();
    }

    public c s(int i2, boolean z2) {
        int i3;
        C0010j jVar;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if (i2 != 1) {
            c cVar = null;
            if (i2 != 2) {
                c cVar2 = c.e;
                if (i2 == 8) {
                    c[] cVarArr = this.f581d;
                    if (cVarArr != null) {
                        cVar = cVarArr[3];
                    }
                    if (cVar != null) {
                        return cVar;
                    }
                    c j2 = j();
                    c t2 = t();
                    int i8 = j2.f228d;
                    if (i8 > t2.f228d) {
                        return c.b(0, 0, 0, i8);
                    }
                    c cVar3 = this.f583g;
                    if (cVar3 == null || cVar3.equals(cVar2) || (i3 = this.f583g.f228d) <= t2.f228d) {
                        return cVar2;
                    }
                    return c.b(0, 0, 0, i3);
                } else if (i2 == 16) {
                    return i();
                } else {
                    if (i2 == 32) {
                        return g();
                    }
                    if (i2 == 64) {
                        return k();
                    }
                    if (i2 != 128) {
                        return cVar2;
                    }
                    w0 w0Var = this.f582f;
                    if (w0Var != null) {
                        jVar = w0Var.f597a.e();
                    } else {
                        jVar = e();
                    }
                    if (jVar == null) {
                        return cVar2;
                    }
                    int i9 = Build.VERSION.SDK_INT;
                    if (i9 >= 28) {
                        i4 = C0009i.d(jVar.f558a);
                    } else {
                        i4 = 0;
                    }
                    if (i9 >= 28) {
                        i5 = C0009i.f(jVar.f558a);
                    } else {
                        i5 = 0;
                    }
                    if (i9 >= 28) {
                        i6 = C0009i.e(jVar.f558a);
                    } else {
                        i6 = 0;
                    }
                    if (i9 >= 28) {
                        i7 = C0009i.c(jVar.f558a);
                    }
                    return c.b(i4, i5, i6, i7);
                }
            } else if (z2) {
                c t3 = t();
                c h2 = h();
                return c.b(Math.max(t3.f225a, h2.f225a), 0, Math.max(t3.f227c, h2.f227c), Math.max(t3.f228d, h2.f228d));
            } else {
                c j3 = j();
                w0 w0Var2 = this.f582f;
                if (w0Var2 != null) {
                    cVar = w0Var2.f597a.h();
                }
                int i10 = j3.f228d;
                if (cVar != null) {
                    i10 = Math.min(i10, cVar.f228d);
                }
                return c.b(j3.f225a, 0, j3.f227c, i10);
            }
        } else if (z2) {
            return c.b(0, Math.max(t().f226b, j().f226b), 0, 0);
        } else {
            return c.b(0, j().f226b, 0, 0);
        }
    }

    @SuppressLint({"WrongConstant"})
    private c r(int i2, boolean z2) {
        c cVar = c.e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                cVar = c.a(cVar, s(i3, z2));
            }
        }
        return cVar;
    }

    private c t() {
        w0 w0Var = this.f582f;
        if (w0Var != null) {
            return w0Var.f597a.h();
        }
        return c.e;
    }

    private c u(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f576h) {
                v();
            }
            Method method = i;
            if (!(method == null || f577j == null || f578k == null)) {
                try {
                    Object invoke = method.invoke(view, (Object[]) null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f578k.get(f579l.get(invoke));
                    if (rect != null) {
                        return c.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    return null;
                } catch (ReflectiveOperationException e2) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    public final c j() {
        if (this.e == null) {
            WindowInsets windowInsets = this.f580c;
            this.e = c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    public boolean n() {
        return this.f580c.isRound();
    }

    public void o(c[] cVarArr) {
        this.f581d = cVarArr;
    }

    public void p(w0 w0Var) {
        this.f582f = w0Var;
    }

    public void w(c cVar) {
        this.f583g = cVar;
    }

    public p0(w0 w0Var, WindowInsets windowInsets) {
        super(w0Var);
        this.f580c = windowInsets;
    }

    public void d(View view) {
        c u2 = u(view);
        if (u2 == null) {
            u2 = c.e;
        }
        w(u2);
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f583g, ((p0) obj).f583g);
    }
}
