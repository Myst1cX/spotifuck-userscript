package j0;

import android.util.SparseArray;

public final class P {

    /* renamed from: a  reason: collision with root package name */
    public SparseArray f3298a;

    /* renamed from: b  reason: collision with root package name */
    public int f3299b;

    public final O a(int i) {
        SparseArray sparseArray = this.f3298a;
        O o2 = (O) sparseArray.get(i);
        if (o2 != null) {
            return o2;
        }
        O o3 = new O();
        sparseArray.put(i, o3);
        return o3;
    }
}
