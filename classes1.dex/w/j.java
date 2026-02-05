package w;

import java.util.Iterator;
import v.C0344a;
import v.C0347d;

public final class j extends o {
    public final void f() {
        this.f4895c = null;
        this.f4899h.c();
    }

    public final boolean k() {
        return false;
    }

    public final void a(d dVar) {
        C0344a aVar = (C0344a) this.f4894b;
        int i = aVar.f4682s0;
        f fVar = this.f4899h;
        Iterator it2 = fVar.f4880l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it2.hasNext()) {
            int i4 = ((f) it2.next()).f4876g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            fVar.d(i3 + aVar.f4684u0);
        } else {
            fVar.d(i2 + aVar.f4684u0);
        }
    }

    public final void d() {
        C0347d dVar = this.f4894b;
        if (dVar instanceof C0344a) {
            f fVar = this.f4899h;
            fVar.f4872b = true;
            C0344a aVar = (C0344a) dVar;
            int i = aVar.f4682s0;
            boolean z2 = aVar.f4683t0;
            int i2 = 0;
            if (i == 0) {
                fVar.e = 4;
                while (i2 < aVar.f4848r0) {
                    C0347d dVar2 = aVar.f4847q0[i2];
                    if (z2 || dVar2.f4745g0 != 8) {
                        f fVar2 = dVar2.f4739d.f4899h;
                        fVar2.f4879k.add(fVar);
                        fVar.f4880l.add(fVar2);
                    }
                    i2++;
                }
                m(this.f4894b.f4739d.f4899h);
                m(this.f4894b.f4739d.i);
            } else if (i == 1) {
                fVar.e = 5;
                while (i2 < aVar.f4848r0) {
                    C0347d dVar3 = aVar.f4847q0[i2];
                    if (z2 || dVar3.f4745g0 != 8) {
                        f fVar3 = dVar3.f4739d.i;
                        fVar3.f4879k.add(fVar);
                        fVar.f4880l.add(fVar3);
                    }
                    i2++;
                }
                m(this.f4894b.f4739d.f4899h);
                m(this.f4894b.f4739d.i);
            } else if (i == 2) {
                fVar.e = 6;
                while (i2 < aVar.f4848r0) {
                    C0347d dVar4 = aVar.f4847q0[i2];
                    if (z2 || dVar4.f4745g0 != 8) {
                        f fVar4 = dVar4.e.f4899h;
                        fVar4.f4879k.add(fVar);
                        fVar.f4880l.add(fVar4);
                    }
                    i2++;
                }
                m(this.f4894b.e.f4899h);
                m(this.f4894b.e.i);
            } else if (i == 3) {
                fVar.e = 7;
                while (i2 < aVar.f4848r0) {
                    C0347d dVar5 = aVar.f4847q0[i2];
                    if (z2 || dVar5.f4745g0 != 8) {
                        f fVar5 = dVar5.e.i;
                        fVar5.f4879k.add(fVar);
                        fVar.f4880l.add(fVar5);
                    }
                    i2++;
                }
                m(this.f4894b.e.f4899h);
                m(this.f4894b.e.i);
            }
        }
    }

    public final void e() {
        C0347d dVar = this.f4894b;
        if (dVar instanceof C0344a) {
            int i = ((C0344a) dVar).f4682s0;
            f fVar = this.f4899h;
            if (i == 0 || i == 1) {
                dVar.f4731Y = fVar.f4876g;
            } else {
                dVar.f4732Z = fVar.f4876g;
            }
        }
    }

    public final void m(f fVar) {
        f fVar2 = this.f4899h;
        fVar2.f4879k.add(fVar);
        fVar.f4880l.add(fVar2);
    }
}
