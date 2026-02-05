package O0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import o.C0273d0;
import p0.C0320a;
import q0.C0322a;

public final class a extends C0273d0 {
    public static int h(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            int i3 = iArr[i2];
            TypedValue typedValue = new TypedValue();
            if (!typedArray.getValue(i3, typedValue) || typedValue.type != 2) {
                i = typedArray.getDimensionPixelSize(i3, -1);
            } else {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i = dimensionPixelSize;
            }
        }
        return i;
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (C0320a.p0(context, 2130969750, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, C0322a.f4498q);
            int h2 = h(getContext(), obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (h2 >= 0) {
                setLineHeight(h2);
            }
        }
    }
}
