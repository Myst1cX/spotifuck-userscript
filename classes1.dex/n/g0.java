package N;

import C0.c;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class g0 extends WindowInsetsAnimation.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final C0004d f543a;

    /* renamed from: b  reason: collision with root package name */
    public List f544b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f545c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f546d = new HashMap();

    public g0(C0004d dVar) {
        super(0);
        this.f543a = dVar;
    }

    public final j0 a(WindowInsetsAnimation windowInsetsAnimation) {
        j0 j0Var = (j0) this.f546d.get(windowInsetsAnimation);
        if (j0Var == null) {
            j0Var = new j0(0, (Interpolator) null, 0);
            if (Build.VERSION.SDK_INT >= 30) {
                j0Var.f559a = new h0(windowInsetsAnimation);
            }
            this.f546d.put(windowInsetsAnimation, j0Var);
        }
        return j0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C0004d dVar = this.f543a;
        a(windowInsetsAnimation);
        ((View) dVar.f532j).setTranslationY(0.0f);
        this.f546d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C0004d dVar = this.f543a;
        a(windowInsetsAnimation);
        int[] iArr = (int[]) dVar.f533k;
        ((View) dVar.f532j).getLocationOnScreen(iArr);
        dVar.f531h = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f545c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f545c = arrayList2;
            this.f544b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j2 = c.j(list.get(size));
            j0 a2 = a(j2);
            a2.f559a.d(j2.getFraction());
            this.f545c.add(a2);
        }
        C0004d dVar = this.f543a;
        w0 g2 = w0.g((View) null, windowInsets);
        dVar.c(g2, this.f544b);
        return g2.f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C0004d dVar = this.f543a;
        a(windowInsetsAnimation);
        F.c c2 = F.c.c(bounds.getLowerBound());
        F.c c3 = F.c.c(bounds.getUpperBound());
        View view = (View) dVar.f532j;
        int[] iArr = (int[]) dVar.f533k;
        view.getLocationOnScreen(iArr);
        int i = dVar.f531h - iArr[1];
        dVar.i = i;
        view.setTranslationY((float) i);
        c.l();
        return c.h(c2.d(), c3.d());
    }
}
