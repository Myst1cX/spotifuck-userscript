package N;

import C0.c;
import android.os.Build;
import android.view.animation.Interpolator;

public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public i0 f559a;

    public j0(int i, Interpolator interpolator, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f559a = new h0(c.i(i, interpolator, j2));
        } else {
            this.f559a = new i0(i, interpolator, j2);
        }
    }
}
