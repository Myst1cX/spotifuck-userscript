package O;

import android.view.accessibility.AccessibilityNodeInfo;

public abstract class g {
    public static Object a(int i, float f2, float f3, float f4) {
        return new AccessibilityNodeInfo.RangeInfo(i, f2, f3, f4);
    }

    public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
