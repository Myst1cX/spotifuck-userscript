package a0;

import android.view.animation.Interpolator;

public abstract class b implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f1054a;

    /* renamed from: b  reason: collision with root package name */
    public final float f1055b;

    public final float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f1054a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f2), fArr.length - 2);
        float f3 = this.f1055b;
        float f4 = fArr[min];
        return ((fArr[min + 1] - f4) * ((f2 - (((float) min) * f3)) / f3)) + f4;
    }

    public b(float[] fArr) {
        this.f1054a = fArr;
        this.f1055b = 1.0f / ((float) (fArr.length - 1));
    }
}
