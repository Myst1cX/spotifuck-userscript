package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public int f5114a;

    /* renamed from: b  reason: collision with root package name */
    public int f5115b;

    /* renamed from: c  reason: collision with root package name */
    public float f5116c;

    /* renamed from: d  reason: collision with root package name */
    public float f5117d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f5141g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f5116c = obtainStyledAttributes.getFloat(index, this.f5116c);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.f5114a);
                this.f5114a = i2;
                this.f5114a = n.f5130d[i2];
            } else if (index == 4) {
                this.f5115b = obtainStyledAttributes.getInt(index, this.f5115b);
            } else if (index == 3) {
                this.f5117d = obtainStyledAttributes.getFloat(index, this.f5117d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
