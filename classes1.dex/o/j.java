package O;

import android.view.accessibility.AccessibilityNodeInfo;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityNodeInfo.CollectionItemInfo f749a;

    public static j a(boolean z2, int i, int i2, int i3, int i4) {
        return new j(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z2));
    }

    public j(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f749a = collectionItemInfo;
    }
}
