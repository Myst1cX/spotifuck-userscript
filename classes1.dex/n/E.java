package N;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

public final class E implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    public w0 f501a = null;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f502b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ r f503c;

    public E(View view, r rVar) {
        this.f502b = view;
        this.f503c = rVar;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        w0 g2 = w0.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        r rVar = this.f503c;
        if (i < 30) {
            F.a(windowInsets, this.f502b);
            if (g2.equals(this.f501a)) {
                return rVar.l(view, g2).f();
            }
        }
        this.f501a = g2;
        w0 l2 = rVar.l(view, g2);
        if (i >= 30) {
            return l2.f();
        }
        WeakHashMap weakHashMap = Q.f509a;
        D.c(view);
        return l2.f();
    }
}
