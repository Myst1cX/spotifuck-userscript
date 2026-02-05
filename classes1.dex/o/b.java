package O;

import N.Q;
import N0.k;
import N0.l;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;
import p0.C0320a;

public final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final k f738a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f738a.equals(((b) obj).f738a);
    }

    public final int hashCode() {
        return this.f738a.hashCode();
    }

    public final void onTouchExplorationStateChanged(boolean z2) {
        int i;
        l lVar = (l) this.f738a.f634a;
        AutoCompleteTextView autoCompleteTextView = lVar.f637h;
        if (autoCompleteTextView != null && !C0320a.b0(autoCompleteTextView)) {
            if (z2) {
                i = 2;
            } else {
                i = 1;
            }
            WeakHashMap weakHashMap = Q.f509a;
            lVar.f679d.setImportantForAccessibility(i);
        }
    }

    public b(k kVar) {
        this.f738a = kVar;
    }
}
