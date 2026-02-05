package N;

import android.view.View;
import android.view.autofill.AutofillId;
import java.util.Collection;

public abstract class H {
    public static void a(View view, Collection<View> collection, int i) {
        view.addKeyboardNavigationClusters(collection, i);
    }

    public static AutofillId b(View view) {
        return view.getAutofillId();
    }

    public static int c(View view) {
        return view.getImportantForAutofill();
    }

    public static int d(View view) {
        return view.getNextClusterForwardId();
    }

    public static boolean e(View view) {
        return view.hasExplicitFocusable();
    }

    public static boolean f(View view) {
        return view.isFocusedByDefault();
    }

    public static boolean g(View view) {
        return view.isImportantForAutofill();
    }

    public static boolean h(View view) {
        return view.isKeyboardNavigationCluster();
    }

    public static View i(View view, View view2, int i) {
        return view.keyboardNavigationClusterSearch(view2, i);
    }

    public static boolean j(View view) {
        return view.restoreDefaultFocus();
    }

    public static void k(View view, String... strArr) {
        view.setAutofillHints(strArr);
    }

    public static void l(View view, boolean z2) {
        view.setFocusedByDefault(z2);
    }

    public static void m(View view, int i) {
        view.setImportantForAutofill(i);
    }

    public static void n(View view, boolean z2) {
        view.setKeyboardNavigationCluster(z2);
    }

    public static void o(View view, int i) {
        view.setNextClusterForwardId(i);
    }

    public static void p(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }
}
