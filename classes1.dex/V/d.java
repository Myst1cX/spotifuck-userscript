package V;

import android.view.animation.Interpolator;

public final class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f957a;

    public /* synthetic */ d(int i) {
        this.f957a = i;
    }

    public final float getInterpolation(float f2) {
        switch (this.f957a) {
            case 0:
                float f3 = f2 - 1.0f;
                return (f3 * f3 * f3 * f3 * f3) + 1.0f;
            default:
                float f4 = f2 - 1.0f;
                return (f4 * f4 * f4 * f4 * f4) + 1.0f;
        }
    }
}
