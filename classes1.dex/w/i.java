package w;

import v.C0347d;
import v.h;

public final class i extends o {
    public final boolean k() {
        return false;
    }

    public final void a(d dVar) {
        f fVar = this.f4899h;
        if (fVar.f4873c && !fVar.f4878j) {
            fVar.d((int) ((((float) ((f) fVar.f4880l.get(0)).f4876g) * ((h) this.f4894b).f4841q0) + 0.5f));
        }
    }

    public final void d() {
        C0347d dVar = this.f4894b;
        h hVar = (h) dVar;
        int i = hVar.f4842r0;
        int i2 = hVar.f4843s0;
        int i3 = hVar.f4845u0;
        f fVar = this.f4899h;
        if (i3 == 1) {
            if (i != -1) {
                fVar.f4880l.add(dVar.f4726T.f4739d.f4899h);
                this.f4894b.f4726T.f4739d.f4899h.f4879k.add(fVar);
                fVar.f4875f = i;
            } else if (i2 != -1) {
                fVar.f4880l.add(dVar.f4726T.f4739d.i);
                this.f4894b.f4726T.f4739d.i.f4879k.add(fVar);
                fVar.f4875f = -i2;
            } else {
                fVar.f4872b = true;
                fVar.f4880l.add(dVar.f4726T.f4739d.i);
                this.f4894b.f4726T.f4739d.i.f4879k.add(fVar);
            }
            m(this.f4894b.f4739d.f4899h);
            m(this.f4894b.f4739d.i);
            return;
        }
        if (i != -1) {
            fVar.f4880l.add(dVar.f4726T.e.f4899h);
            this.f4894b.f4726T.e.f4899h.f4879k.add(fVar);
            fVar.f4875f = i;
        } else if (i2 != -1) {
            fVar.f4880l.add(dVar.f4726T.e.i);
            this.f4894b.f4726T.e.i.f4879k.add(fVar);
            fVar.f4875f = -i2;
        } else {
            fVar.f4872b = true;
            fVar.f4880l.add(dVar.f4726T.e.i);
            this.f4894b.f4726T.e.i.f4879k.add(fVar);
        }
        m(this.f4894b.e.f4899h);
        m(this.f4894b.e.i);
    }

    public final void e() {
        C0347d dVar = this.f4894b;
        int i = ((h) dVar).f4845u0;
        f fVar = this.f4899h;
        if (i == 1) {
            dVar.f4731Y = fVar.f4876g;
        } else {
            dVar.f4732Z = fVar.f4876g;
        }
    }

    public final void f() {
        this.f4899h.c();
    }

    public final void m(f fVar) {
        f fVar2 = this.f4899h;
        fVar2.f4879k.add(fVar);
        fVar.f4880l.add(fVar2);
    }
}
