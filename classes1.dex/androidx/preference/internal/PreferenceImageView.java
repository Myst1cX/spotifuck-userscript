package androidx.preference.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import g0.z;

@SuppressLint({"AppCompatCustomView"})
public class PreferenceImageView extends ImageView {

    /* renamed from: f  reason: collision with root package name */
    public int f1952f = Integer.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    public int f1953g = Integer.MAX_VALUE;

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.f2628j, 0, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(3, Integer.MAX_VALUE));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(2, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }

    public int getMaxHeight() {
        return this.f1953g;
    }

    public int getMaxWidth() {
        return this.f1952f;
    }

    public void setMaxHeight(int i) {
        this.f1953g = i;
        super.setMaxHeight(i);
    }

    public void setMaxWidth(int i) {
        this.f1952f = i;
        super.setMaxWidth(i);
    }

    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i = View.MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i2);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i2 = View.MeasureSpec.makeMeasureSpec(maxHeight, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i, i2);
    }
}
