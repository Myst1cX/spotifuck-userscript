package n0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: n0.E  reason: case insensitive filesystem */
public final class C0216E extends C0215D {
    public final float f(View view) {
        return view.getTransitionAlpha();
    }

    public final void n(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    public final void o(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    public final void p(View view, int i) {
        view.setTransitionVisibility(i);
    }

    public final void q(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public final void r(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
