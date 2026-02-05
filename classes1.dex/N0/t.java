package N0;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

public final class t extends View.AccessibilityDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f684a;

    public t(u uVar) {
        this.f684a = uVar;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.f684a.f693h.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
