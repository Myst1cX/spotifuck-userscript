package I0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import p0.C0320a;

public abstract class c {
    /* access modifiers changed from: private */
    public static Drawable b(Context context, int i) {
        ColorStateList colorStateList;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setShape(1);
        InsetDrawable insetDrawable = new InsetDrawable(gradientDrawable, i, i, i, i);
        ColorStateList valueOf = ColorStateList.valueOf(0);
        TypedValue o02 = C0320a.o0(context, 2130968836);
        if (o02 != null) {
            int i2 = o02.resourceId;
            if (i2 != 0) {
                colorStateList = C0320a.I(context, i2);
            } else {
                colorStateList = ColorStateList.valueOf(o02.data);
            }
        } else {
            colorStateList = null;
        }
        if (colorStateList != null) {
            valueOf = colorStateList;
        }
        return new RippleDrawable(valueOf, (Drawable) null, insetDrawable);
    }
}
