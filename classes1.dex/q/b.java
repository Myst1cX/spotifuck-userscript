package q;

import java.util.Iterator;

public final class b extends e implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public c f4468a;

    /* renamed from: b  reason: collision with root package name */
    public c f4469b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f4470c;

    public b(c cVar, c cVar2, int i) {
        this.f4470c = i;
        this.f4468a = cVar2;
        this.f4469b = cVar;
    }

    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f4468a == cVar && cVar == this.f4469b) {
            this.f4469b = null;
            this.f4468a = null;
        }
        c cVar4 = this.f4468a;
        if (cVar4 == cVar) {
            switch (this.f4470c) {
                case 0:
                    cVar2 = cVar4.f4474d;
                    break;
                default:
                    cVar2 = cVar4.f4473c;
                    break;
            }
            this.f4468a = cVar2;
        }
        c cVar5 = this.f4469b;
        if (cVar5 == cVar) {
            c cVar6 = this.f4468a;
            if (!(cVar5 == cVar6 || cVar6 == null)) {
                cVar3 = b(cVar5);
            }
            this.f4469b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f4470c) {
            case 0:
                return cVar.f4473c;
            default:
                return cVar.f4474d;
        }
    }

    public final boolean hasNext() {
        if (this.f4469b != null) {
            return true;
        }
        return false;
    }

    public final Object next() {
        c cVar;
        c cVar2 = this.f4469b;
        c cVar3 = this.f4468a;
        if (cVar2 == cVar3 || cVar3 == null) {
            cVar = null;
        } else {
            cVar = b(cVar2);
        }
        this.f4469b = cVar;
        return cVar2;
    }
}
