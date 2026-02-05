package N;

import E.j;
import F.c;
import K.n;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;

public final class e0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    public final C0004d f537a;

    /* renamed from: b  reason: collision with root package name */
    public w0 f538b;

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        u0 u0Var;
        Interpolator interpolator;
        View view2 = view;
        WindowInsets windowInsets2 = windowInsets;
        if (!view.isLaidOut()) {
            this.f538b = w0.g(view, windowInsets);
            return f0.i(view, windowInsets);
        }
        w0 g2 = w0.g(view, windowInsets);
        if (this.f538b == null) {
            this.f538b = Q.h(view);
        }
        if (this.f538b == null) {
            this.f538b = g2;
            return f0.i(view, windowInsets);
        }
        C0004d j2 = f0.j(view);
        if (j2 != null && Objects.equals((WindowInsets) j2.f530g, windowInsets2)) {
            return f0.i(view, windowInsets);
        }
        w0 w0Var = this.f538b;
        int i = 0;
        int i2 = 1;
        while (true) {
            u0Var = g2.f597a;
            if (i2 > 256) {
                break;
            }
            if (!u0Var.f(i2).equals(w0Var.f597a.f(i2))) {
                i |= i2;
            }
            i2 <<= 1;
        }
        if (i == 0) {
            return f0.i(view, windowInsets);
        }
        w0 w0Var2 = this.f538b;
        if ((i & 8) == 0) {
            interpolator = f0.f541g;
        } else if (u0Var.f(8).f228d > w0Var2.f597a.f(8).f228d) {
            interpolator = f0.e;
        } else {
            interpolator = f0.f540f;
        }
        j0 j0Var = new j0(i, interpolator, 160);
        j0Var.f559a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(j0Var.f559a.a());
        c f2 = u0Var.f(i);
        c f3 = w0Var2.f597a.f(i);
        int min = Math.min(f2.f225a, f3.f225a);
        int i3 = f2.f226b;
        int i4 = f3.f226b;
        int min2 = Math.min(i3, i4);
        int i5 = f2.f227c;
        int i6 = f3.f227c;
        int min3 = Math.min(i5, i6);
        ValueAnimator valueAnimator = duration;
        int i7 = f2.f228d;
        int i8 = i;
        int i9 = f3.f228d;
        j jVar = new j((Object) c.b(min, min2, min3, Math.min(i7, i9)), (Object) c.b(Math.max(f2.f225a, f3.f225a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)), 3);
        f0.f(view2, windowInsets2, false);
        ValueAnimator valueAnimator2 = valueAnimator;
        valueAnimator2.addUpdateListener(new c0(j0Var, g2, w0Var2, i8, view));
        valueAnimator2.addListener(new d0(j0Var, view2));
        C0020u.a(view2, new n(view2, j0Var, jVar, valueAnimator2));
        this.f538b = g2;
        return f0.i(view, windowInsets);
    }

    public e0(View view, C0004d dVar) {
        w0 w0Var;
        o0 o0Var;
        this.f537a = dVar;
        w0 h2 = Q.h(view);
        if (h2 != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                o0Var = new n0(h2);
            } else if (i >= 29) {
                o0Var = new m0(h2);
            } else {
                o0Var = new l0(h2);
            }
            w0Var = o0Var.b();
        } else {
            w0Var = null;
        }
        this.f538b = w0Var;
    }
}
