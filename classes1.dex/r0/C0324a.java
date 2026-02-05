package r0;

import a0.a;
import a0.b;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: r0.a  reason: case insensitive filesystem */
public abstract class C0324a {

    /* renamed from: a  reason: collision with root package name */
    public static final LinearInterpolator f4555a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final a f4556b = new b(a.f1053d);

    /* renamed from: c  reason: collision with root package name */
    public static final a f4557c = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final a f4558d = new b(a.e);

    public static float a(float f2, float f3, float f4) {
        return ((f3 - f2) * f4) + f2;
    }

    public static int c(int i, int i2, float f2) {
        return Math.round(f2 * ((float) (i2 - i))) + i;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [a0.a, a0.b] */
    /* JADX WARNING: type inference failed for: r0v3, types: [a0.a, a0.b] */
    static {
        new DecelerateInterpolator();
    }

    public static float b(float f2, float f3, float f4, float f5, float f6) {
        if (f6 <= f4) {
            return f2;
        }
        if (f6 >= f5) {
            return f3;
        }
        return a(f2, f3, (f6 - f4) / (f5 - f4));
    }
}
