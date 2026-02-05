package y;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import u.C0342a;

public final class k {

    /* renamed from: j  reason: collision with root package name */
    public static final SparseIntArray f5106j;

    /* renamed from: a  reason: collision with root package name */
    public int f5107a;

    /* renamed from: b  reason: collision with root package name */
    public int f5108b;

    /* renamed from: c  reason: collision with root package name */
    public int f5109c;

    /* renamed from: d  reason: collision with root package name */
    public float f5110d;
    public float e;

    /* renamed from: f  reason: collision with root package name */
    public float f5111f;

    /* renamed from: g  reason: collision with root package name */
    public int f5112g;

    /* renamed from: h  reason: collision with root package name */
    public String f5113h;
    public int i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5106j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f5140f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            switch (f5106j.get(index)) {
                case 1:
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                    break;
                case 2:
                    this.f5109c = obtainStyledAttributes.getInt(index, this.f5109c);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type != 3) {
                        String str = C0342a.f4680a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    } else {
                        obtainStyledAttributes.getString(index);
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f5107a = n.f(obtainStyledAttributes, index, this.f5107a);
                    break;
                case 6:
                    this.f5108b = obtainStyledAttributes.getInteger(index, this.f5108b);
                    break;
                case 7:
                    this.f5110d = obtainStyledAttributes.getFloat(index, this.f5110d);
                    break;
                case 8:
                    this.f5112g = obtainStyledAttributes.getInteger(index, this.f5112g);
                    break;
                case 9:
                    this.f5111f = obtainStyledAttributes.getFloat(index, this.f5111f);
                    break;
                case 10:
                    int i3 = obtainStyledAttributes.peekValue(index).type;
                    if (i3 != 1) {
                        if (i3 != 3) {
                            obtainStyledAttributes.getInteger(index, this.i);
                            break;
                        } else {
                            String string = obtainStyledAttributes.getString(index);
                            this.f5113h = string;
                            if (string.indexOf("/") <= 0) {
                                break;
                            } else {
                                this.i = obtainStyledAttributes.getResourceId(index, -1);
                                break;
                            }
                        }
                    } else {
                        this.i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
