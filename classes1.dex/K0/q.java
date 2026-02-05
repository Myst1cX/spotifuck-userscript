package K0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

public final class q extends s {

    /* renamed from: h  reason: collision with root package name */
    public static final RectF f431h = new RectF();

    /* renamed from: b  reason: collision with root package name */
    public final float f432b;

    /* renamed from: c  reason: collision with root package name */
    public final float f433c;

    /* renamed from: d  reason: collision with root package name */
    public final float f434d;
    public final float e;

    /* renamed from: f  reason: collision with root package name */
    public float f435f;

    /* renamed from: g  reason: collision with root package name */
    public float f436g;

    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f439a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f431h;
        rectF.set(this.f432b, this.f433c, this.f434d, this.e);
        path.arcTo(rectF, this.f435f, this.f436g, false);
        path.transform(matrix);
    }

    public q(float f2, float f3, float f4, float f5) {
        this.f432b = f2;
        this.f433c = f3;
        this.f434d = f4;
        this.e = f5;
    }
}
