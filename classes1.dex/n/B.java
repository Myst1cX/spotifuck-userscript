package N;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;

public final class B implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

    /* renamed from: f  reason: collision with root package name */
    public final WeakHashMap f496f = new WeakHashMap();

    public final void onGlobalLayout() {
        boolean z2;
        int i;
        if (Build.VERSION.SDK_INT < 28) {
            for (Map.Entry entry : this.f496f.entrySet()) {
                View view = (View) entry.getKey();
                boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                if (!view.isShown() || view.getWindowVisibility() != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (booleanValue != z2) {
                    if (z2) {
                        i = 16;
                    } else {
                        i = 32;
                    }
                    Q.i(view, i);
                    entry.setValue(Boolean.valueOf(z2));
                }
            }
        }
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
}
