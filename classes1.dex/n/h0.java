package N;

import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

public final class h0 extends i0 {
    public final WindowInsetsAnimation e;

    public h0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, (Interpolator) null, 0);
        this.e = windowInsetsAnimation;
    }

    public final long a() {
        return this.e.getDurationMillis();
    }

    public final float b() {
        return this.e.getInterpolatedFraction();
    }

    public final int c() {
        return this.e.getTypeMask();
    }

    public final void d(float f2) {
        this.e.setFraction(f2);
    }
}
