package o;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.w;
import java.util.Objects;

public abstract class Z0 {
    public static void c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    public static void d(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    public static OnBackInvokedDispatcher a(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new w(2, runnable);
    }
}
