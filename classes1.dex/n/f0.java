package N;

import E.j;
import a0.a;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;

public final class f0 extends i0 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f  reason: collision with root package name */
    public static final a f540f = new a();

    /* renamed from: g  reason: collision with root package name */
    public static final DecelerateInterpolator f541g = new DecelerateInterpolator();

    public static void e(View view) {
        C0004d j2 = j(view);
        if (j2 != null) {
            ((View) j2.f532j).setTranslationY(0.0f);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i));
            }
        }
    }

    public static void f(View view, WindowInsets windowInsets, boolean z2) {
        C0004d j2 = j(view);
        if (j2 != null) {
            j2.f530g = windowInsets;
            if (!z2) {
                int[] iArr = (int[]) j2.f533k;
                ((View) j2.f532j).getLocationOnScreen(iArr);
                z2 = true;
                j2.f531h = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), windowInsets, z2);
            }
        }
    }

    public static void g(View view, w0 w0Var, List list) {
        C0004d j2 = j(view);
        if (j2 != null) {
            j2.c(w0Var, list);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), w0Var, list);
            }
        }
    }

    public static void h(View view, j jVar) {
        C0004d j2 = j(view);
        if (j2 != null) {
            View view2 = (View) j2.f532j;
            int[] iArr = (int[]) j2.f533k;
            view2.getLocationOnScreen(iArr);
            int i = j2.f531h - iArr[1];
            j2.i = i;
            view2.setTranslationY((float) i);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                h(viewGroup.getChildAt(i2), jVar);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        if (view.getTag(2131296729) != null) {
            return windowInsets;
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    public static C0004d j(View view) {
        Object tag = view.getTag(2131296737);
        if (tag instanceof e0) {
            return ((e0) tag).f537a;
        }
        return null;
    }
}
