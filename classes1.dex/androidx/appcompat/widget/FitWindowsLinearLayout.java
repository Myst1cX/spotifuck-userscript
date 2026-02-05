package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import o.C0311w0;

public class FitWindowsLinearLayout extends LinearLayout {
    public void setOnFitSystemWindowsListener(C0311w0 w0Var) {
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }
}
