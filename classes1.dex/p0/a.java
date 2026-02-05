package P0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import m.C0176c;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f754a = {16842752, 2130969791};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f755b = {2130969385};

    public static Context a(Context context, AttributeSet attributeSet, int i, int i2) {
        boolean z2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f755b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if (!(context instanceof C0176c) || ((C0176c) context).f3613a != resourceId) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (resourceId == 0 || z2) {
            return context;
        }
        C0176c cVar = new C0176c(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f754a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            cVar.getTheme().applyStyle(resourceId2, true);
        }
        return cVar;
    }
}
