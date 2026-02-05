package w;

import java.util.Iterator;

public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f4881m;

    public final void d(int i) {
        if (!this.f4878j) {
            this.f4878j = true;
            this.f4876g = i;
            Iterator it2 = this.f4879k.iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                dVar.a(dVar);
            }
        }
    }

    public g(o oVar) {
        super(oVar);
        if (oVar instanceof k) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }
}
