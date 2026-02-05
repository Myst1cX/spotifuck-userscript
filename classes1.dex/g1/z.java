package g1;

import A.b;
import java.util.ArrayList;
import k1.e;
import k1.f;

public final class z implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public final x f2827a;

    /* renamed from: b  reason: collision with root package name */
    public final f f2828b;

    /* renamed from: c  reason: collision with root package name */
    public C0103b f2829c;

    /* renamed from: d  reason: collision with root package name */
    public final A f2830d;
    public boolean e;

    public final C a() {
        b bVar;
        ArrayList arrayList = new ArrayList();
        x xVar = this.f2827a;
        arrayList.addAll(xVar.f2802b);
        arrayList.add(this.f2828b);
        arrayList.add(new i1.b(2, xVar.f2805f));
        h hVar = xVar.f2806g;
        if (hVar != null) {
            bVar = hVar.f2701a;
        } else {
            bVar = null;
        }
        arrayList.add(new i1.b(0, bVar));
        arrayList.add(new i1.b(1, xVar));
        arrayList.addAll(xVar.f2803c);
        arrayList.add(new Object());
        C0103b bVar2 = this.f2829c;
        A a2 = this.f2830d;
        return new e(arrayList, (j1.f) null, (k1.b) null, (j1.b) null, 0, a2, this, bVar2, xVar.f2818t, xVar.f2819u, xVar.f2820v).a(a2);
    }

    public final Object clone() {
        A a2 = this.f2830d;
        x xVar = this.f2827a;
        z zVar = new z(xVar, a2);
        xVar.f2804d.getClass();
        zVar.f2829c = C0103b.f2680d;
        return zVar;
    }

    public z(x xVar, A a2) {
        this.f2827a = xVar;
        this.f2830d = a2;
        this.f2828b = new f(xVar);
    }
}
