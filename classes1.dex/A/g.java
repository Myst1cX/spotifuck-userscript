package A;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final class g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f17f;

    public final boolean onPreDraw() {
        this.f17f.p(0);
        return true;
    }

    public g(CoordinatorLayout coordinatorLayout) {
        this.f17f = coordinatorLayout;
    }
}
