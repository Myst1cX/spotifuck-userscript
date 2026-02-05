package androidx.activity;

import Z0.c;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import h.C0121l;

public abstract class i {
    public static void b(Object obj, Object obj2) {
        c.e("dispatcher", obj);
        c.e("callback", obj2);
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) obj2);
    }

    public static void c(Object obj, Object obj2) {
        c.e("dispatcher", obj);
        c.e("callback", obj2);
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    public static OnBackInvokedDispatcher a(C0121l lVar) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = lVar.getOnBackInvokedDispatcher();
        c.d("activity.getOnBackInvokedDispatcher()", onBackInvokedDispatcher);
        return onBackInvokedDispatcher;
    }
}
