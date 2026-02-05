package N;

import F.c;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

public final class c0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j0 f525a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w0 f526b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ w0 f527c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f528d;
    public final /* synthetic */ View e;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        o0 o0Var;
        float f2;
        j0 j0Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        j0 j0Var2 = this.f525a;
        j0Var2.f559a.d(animatedFraction);
        float b2 = j0Var2.f559a.b();
        PathInterpolator pathInterpolator = f0.e;
        int i = Build.VERSION.SDK_INT;
        w0 w0Var = this.f526b;
        if (i >= 30) {
            o0Var = new n0(w0Var);
        } else if (i >= 29) {
            o0Var = new m0(w0Var);
        } else {
            o0Var = new l0(w0Var);
        }
        int i2 = 1;
        while (i2 <= 256) {
            int i3 = this.f528d & i2;
            u0 u0Var = w0Var.f597a;
            if (i3 == 0) {
                o0Var.c(i2, u0Var.f(i2));
                f2 = b2;
                j0Var = j0Var2;
            } else {
                c f3 = u0Var.f(i2);
                c f4 = this.f527c.f597a.f(i2);
                float f5 = 1.0f - b2;
                f2 = b2;
                j0Var = j0Var2;
                o0Var.c(i2, w0.e(f3, (int) (((double) (((float) (f3.f225a - f4.f225a)) * f5)) + 0.5d), (int) (((double) (((float) (f3.f226b - f4.f226b)) * f5)) + 0.5d), (int) (((double) (((float) (f3.f227c - f4.f227c)) * f5)) + 0.5d), (int) (((double) (((float) (f3.f228d - f4.f228d)) * f5)) + 0.5d)));
            }
            i2 <<= 1;
            b2 = f2;
            j0Var2 = j0Var;
        }
        f0.g(this.e, o0Var.b(), Collections.singletonList(j0Var2));
    }

    public c0(j0 j0Var, w0 w0Var, w0 w0Var2, int i, View view) {
        this.f525a = j0Var;
        this.f526b = w0Var;
        this.f527c = w0Var2;
        this.f528d = i;
        this.e = view;
    }
}
