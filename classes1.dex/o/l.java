package O;

import A.b;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

public class l extends AccessibilityNodeProvider {

    /* renamed from: a  reason: collision with root package name */
    public final b f753a;

    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        k t2 = this.f753a.t(i);
        if (t2 == null) {
            return null;
        }
        return t2.f751a;
    }

    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f753a.getClass();
        return null;
    }

    public final AccessibilityNodeInfo findFocus(int i) {
        k u2 = this.f753a.u(i);
        if (u2 == null) {
            return null;
        }
        return u2.f751a;
    }

    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f753a.A(i, i2, bundle);
    }

    public l(b bVar) {
        this.f753a = bVar;
    }
}
