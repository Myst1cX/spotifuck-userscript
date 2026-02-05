package O;

import android.view.accessibility.AccessibilityNodeInfo;

public abstract class h {
    public static j a(boolean z2, int i, int i2, int i3, int i4, boolean z3, String str, String str2) {
        return new j(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z2).setColumnIndex(i).setRowIndex(i2).setColumnSpan(i3).setRowSpan(i4).setSelected(z3).setRowTitle(str).setColumnTitle(str2).build());
    }

    public static String c(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }

    public static String d(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    public static k b(AccessibilityNodeInfo accessibilityNodeInfo, int i, int i2) {
        AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i, i2);
        if (child != null) {
            return new k(child, 0);
        }
        return null;
    }

    public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    public static k f(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i);
        if (parent != null) {
            return new k(parent, 0);
        }
        return null;
    }

    public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z2) {
        accessibilityNodeInfo.setTextSelectable(z2);
    }

    public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }
}
