package N;

import Q.a;
import android.view.View;
import android.view.autofill.AutofillId;
import java.util.Objects;
import r.k;

public abstract class J {
    public static void i(View view, a aVar) {
        view.setAutofillId((AutofillId) null);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.view.View$OnUnhandledKeyEventListener, java.lang.Object] */
    public static void a(View view, O o2) {
        k kVar = (k) view.getTag(2131296736);
        if (kVar == null) {
            kVar = new k();
            view.setTag(2131296736, kVar);
        }
        Objects.requireNonNull(o2);
        ? obj = new Object();
        kVar.put(o2, obj);
        view.addOnUnhandledKeyEventListener(obj);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, O o2) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        k kVar = (k) view.getTag(2131296736);
        if (kVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) kVar.getOrDefault(o2, (Object) null)) != null) {
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }
    }

    public static <T> T f(View view, int i) {
        return view.requireViewById(i);
    }

    public static void g(View view, boolean z2) {
        view.setAccessibilityHeading(z2);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void j(View view, boolean z2) {
        view.setScreenReaderFocusable(z2);
    }
}
