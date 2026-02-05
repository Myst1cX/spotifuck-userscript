package N;

import android.view.View;
import android.view.ViewParent;

public abstract class W {
    public static boolean a(ViewParent viewParent, View view, float f2, float f3, boolean z2) {
        return viewParent.onNestedFling(view, f2, f3, z2);
    }

    public static boolean b(ViewParent viewParent, View view, float f2, float f3) {
        return viewParent.onNestedPreFling(view, f2, f3);
    }

    public static void c(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        viewParent.onNestedPreScroll(view, i, i2, iArr);
    }

    public static void d(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        viewParent.onNestedScroll(view, i, i2, i3, i4);
    }

    public static void e(ViewParent viewParent, View view, View view2, int i) {
        viewParent.onNestedScrollAccepted(view, view2, i);
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i) {
        return viewParent.onStartNestedScroll(view, view2, i);
    }

    public static void g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
