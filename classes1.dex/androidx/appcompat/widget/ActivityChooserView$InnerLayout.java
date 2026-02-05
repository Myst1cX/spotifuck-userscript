package androidx.appcompat.widget;

import T0.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f1318f = {16842964};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1318f);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(0);
        } else {
            drawable = g.n(context, resourceId);
        }
        setBackgroundDrawable(drawable);
        obtainStyledAttributes.recycle();
    }
}
