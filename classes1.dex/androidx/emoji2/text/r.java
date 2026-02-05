package androidx.emoji2.text;

import android.util.SparseArray;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray f1540a;

    /* renamed from: b  reason: collision with root package name */
    public u f1541b;

    public r(int i) {
        this.f1540a = new SparseArray(i);
    }

    public final void a(u uVar, int i, int i2) {
        r rVar;
        int a2 = uVar.a(i);
        SparseArray sparseArray = this.f1540a;
        if (sparseArray == null) {
            rVar = null;
        } else {
            rVar = (r) sparseArray.get(a2);
        }
        if (rVar == null) {
            rVar = new r(1);
            sparseArray.put(uVar.a(i), rVar);
        }
        if (i2 > i) {
            rVar.a(uVar, i + 1, i2);
        } else {
            rVar.f1541b = uVar;
        }
    }
}
