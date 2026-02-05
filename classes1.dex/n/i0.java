package N;

import android.view.animation.Interpolator;

public abstract class i0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f554a;

    /* renamed from: b  reason: collision with root package name */
    public float f555b;

    /* renamed from: c  reason: collision with root package name */
    public final Interpolator f556c;

    /* renamed from: d  reason: collision with root package name */
    public final long f557d;

    public long a() {
        return this.f557d;
    }

    public float b() {
        Interpolator interpolator = this.f556c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f555b);
        }
        return this.f555b;
    }

    public int c() {
        return this.f554a;
    }

    public void d(float f2) {
        this.f555b = f2;
    }

    public i0(int i, Interpolator interpolator, long j2) {
        this.f554a = i;
        this.f556c = interpolator;
        this.f557d = j2;
    }
}
