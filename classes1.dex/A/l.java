package A;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f24a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal f25b = new ThreadLocal();

    public static void a(CoordinatorLayout coordinatorLayout, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != coordinatorLayout) {
            View view2 = (View) parent;
            a(coordinatorLayout, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
