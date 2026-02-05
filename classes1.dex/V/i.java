package v;

import java.util.ArrayList;
import w.h;
import w.n;

public abstract class i extends C0347d {

    /* renamed from: q0  reason: collision with root package name */
    public C0347d[] f4847q0 = new C0347d[4];

    /* renamed from: r0  reason: collision with root package name */
    public int f4848r0 = 0;

    public final void R(int i, ArrayList arrayList, n nVar) {
        for (int i2 = 0; i2 < this.f4848r0; i2++) {
            C0347d dVar = this.f4847q0[i2];
            ArrayList arrayList2 = nVar.f4889a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i3 = 0; i3 < this.f4848r0; i3++) {
            h.b(this.f4847q0[i3], i, arrayList, nVar);
        }
    }

    public void S() {
    }
}
