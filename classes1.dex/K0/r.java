package K0;

import android.graphics.Matrix;
import android.graphics.Path;

public final class r extends s {

    /* renamed from: b  reason: collision with root package name */
    public float f437b;

    /* renamed from: c  reason: collision with root package name */
    public float f438c;

    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f439a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f437b, this.f438c);
        path.transform(matrix);
    }
}
