package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class UnPressableLinearLayout extends LinearLayout {
    public final void dispatchSetPressed(boolean z2) {
    }

    public UnPressableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
