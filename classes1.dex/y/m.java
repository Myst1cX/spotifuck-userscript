package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

public final class m {

    /* renamed from: n  reason: collision with root package name */
    public static final SparseIntArray f5118n;

    /* renamed from: a  reason: collision with root package name */
    public float f5119a;

    /* renamed from: b  reason: collision with root package name */
    public float f5120b;

    /* renamed from: c  reason: collision with root package name */
    public float f5121c;

    /* renamed from: d  reason: collision with root package name */
    public float f5122d;
    public float e;

    /* renamed from: f  reason: collision with root package name */
    public float f5123f;

    /* renamed from: g  reason: collision with root package name */
    public float f5124g;

    /* renamed from: h  reason: collision with root package name */
    public int f5125h;
    public float i;

    /* renamed from: j  reason: collision with root package name */
    public float f5126j;

    /* renamed from: k  reason: collision with root package name */
    public float f5127k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5128l;

    /* renamed from: m  reason: collision with root package name */
    public float f5129m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5118n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            switch (f5118n.get(index)) {
                case 1:
                    this.f5119a = obtainStyledAttributes.getFloat(index, this.f5119a);
                    break;
                case 2:
                    this.f5120b = obtainStyledAttributes.getFloat(index, this.f5120b);
                    break;
                case 3:
                    this.f5121c = obtainStyledAttributes.getFloat(index, this.f5121c);
                    break;
                case 4:
                    this.f5122d = obtainStyledAttributes.getFloat(index, this.f5122d);
                    break;
                case 5:
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                    break;
                case 6:
                    this.f5123f = obtainStyledAttributes.getDimension(index, this.f5123f);
                    break;
                case 7:
                    this.f5124g = obtainStyledAttributes.getDimension(index, this.f5124g);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.f5126j = obtainStyledAttributes.getDimension(index, this.f5126j);
                    break;
                case 10:
                    this.f5127k = obtainStyledAttributes.getDimension(index, this.f5127k);
                    break;
                case 11:
                    this.f5128l = true;
                    this.f5129m = obtainStyledAttributes.getDimension(index, this.f5129m);
                    break;
                case 12:
                    this.f5125h = n.f(obtainStyledAttributes, index, this.f5125h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
