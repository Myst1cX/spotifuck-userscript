package E0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f190a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal f191b = new ThreadLocal();

    public static void a(ViewGroup viewGroup, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewGroup) {
            View view2 = (View) parent;
            a(viewGroup, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
