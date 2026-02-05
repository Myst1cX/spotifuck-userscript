package h;

import O.d;
import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.w;
import java.util.Objects;

public abstract class y {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, D d2) {
        Objects.requireNonNull(d2);
        w wVar = new w(1, d2);
        d.e(obj).registerOnBackInvokedCallback(1000000, wVar);
        return wVar;
    }

    public static void c(Object obj, Object obj2) {
        d.e(obj).unregisterOnBackInvokedCallback(d.b(obj2));
    }
}
