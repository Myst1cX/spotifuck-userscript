package n0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: n0.z  reason: case insensitive filesystem */
public abstract class C0245z {
    public static void a(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    public static void b(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public static void c(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
