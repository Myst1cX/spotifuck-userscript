package o;

import F.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import g.C0096a;
import p0.C0320a;

public abstract class U0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f4144a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f4145b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f4146c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f4147d = {16842919};
    public static final int[] e = {16842912};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f4148f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f4149g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C0096a.f2526j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int c(Context context, int i) {
        int[] iArr = f4149g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f4149g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = C0320a.I(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i) {
        ColorStateList d2 = d(context, i);
        if (d2 != null && d2.isStateful()) {
            return d2.getColorForState(f4145b, d2.getDefaultColor());
        }
        ThreadLocal threadLocal = f4144a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f2 = typedValue.getFloat();
        int c2 = c(context, i);
        return a.d(c2, Math.round(((float) Color.alpha(c2)) * f2));
    }
}
