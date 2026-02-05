package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final float f5023a = Float.NaN;

    /* renamed from: b  reason: collision with root package name */
    public final float f5024b = Float.NaN;

    /* renamed from: c  reason: collision with root package name */
    public final float f5025c = Float.NaN;

    /* renamed from: d  reason: collision with root package name */
    public final float f5026d = Float.NaN;
    public final int e = -1;

    public g(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f5143j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.e);
                this.e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f5026d = obtainStyledAttributes.getDimension(index, this.f5026d);
            } else if (index == 2) {
                this.f5024b = obtainStyledAttributes.getDimension(index, this.f5024b);
            } else if (index == 3) {
                this.f5025c = obtainStyledAttributes.getDimension(index, this.f5025c);
            } else if (index == 4) {
                this.f5023a = obtainStyledAttributes.getDimension(index, this.f5023a);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
