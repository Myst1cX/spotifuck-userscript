package N;

import F.c;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

public final class w0 {

    /* renamed from: b  reason: collision with root package name */
    public static final w0 f596b;

    /* renamed from: a  reason: collision with root package name */
    public final u0 f597a;

    public w0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f597a = new t0(this, windowInsets);
        } else if (i >= 29) {
            this.f597a = new s0(this, windowInsets);
        } else if (i >= 28) {
            this.f597a = new r0(this, windowInsets);
        } else {
            this.f597a = new q0(this, windowInsets);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f596b = t0.f590q;
        } else {
            f596b = u0.f594b;
        }
    }

    public static c e(c cVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, cVar.f225a - i);
        int max2 = Math.max(0, cVar.f226b - i2);
        int max3 = Math.max(0, cVar.f227c - i3);
        int max4 = Math.max(0, cVar.f228d - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return cVar;
        }
        return c.b(max, max2, max3, max4);
    }

    public static w0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        w0 w0Var = new w0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            w0 h2 = Q.h(view);
            u0 u0Var = w0Var.f597a;
            u0Var.p(h2);
            u0Var.d(view.getRootView());
        }
        return w0Var;
    }

    public final int a() {
        return this.f597a.j().f228d;
    }

    public final int b() {
        return this.f597a.j().f225a;
    }

    public final int c() {
        return this.f597a.j().f227c;
    }

    public final int d() {
        return this.f597a.j().f226b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        return Objects.equals(this.f597a, ((w0) obj).f597a);
    }

    public final WindowInsets f() {
        u0 u0Var = this.f597a;
        if (u0Var instanceof p0) {
            return ((p0) u0Var).f580c;
        }
        return null;
    }

    public final int hashCode() {
        u0 u0Var = this.f597a;
        if (u0Var == null) {
            return 0;
        }
        return u0Var.hashCode();
    }

    public w0() {
        this.f597a = new u0(this);
    }
}
