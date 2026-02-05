package m1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import y.n;
import y.r;

public final class A {

    /* renamed from: a  reason: collision with root package name */
    public final int f3670a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3671b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f3672c;

    public A(Context context, XmlResourceParser xmlResourceParser) {
        this.f3672c = new ArrayList();
        this.f3671b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f5142h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f3670a = obtainStyledAttributes.getResourceId(index, this.f3670a);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f3671b);
                this.f3671b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public A() {
        this.f3672c = new A[256];
        this.f3670a = 0;
        this.f3671b = 0;
    }

    public A(int i, int i2) {
        this.f3672c = null;
        this.f3670a = i;
        int i3 = i2 & 7;
        this.f3671b = i3 == 0 ? 8 : i3;
    }
}
