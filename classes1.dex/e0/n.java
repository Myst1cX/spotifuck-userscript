package E0;

import N.D;
import N.Q;
import android.view.View;
import java.util.WeakHashMap;

public final class n implements View.OnAttachStateChangeListener {
    public final void onViewDetachedFromWindow(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = Q.f509a;
        D.c(view);
    }
}
