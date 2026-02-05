package q;

import java.util.Iterator;

public final class d extends e implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public c f4475a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4476b = true;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f4477c;

    public final void a(c cVar) {
        boolean z2;
        c cVar2 = this.f4475a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f4474d;
            this.f4475a = cVar3;
            if (cVar3 == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f4476b = z2;
        }
    }

    public final boolean hasNext() {
        if (!this.f4476b) {
            c cVar = this.f4475a;
            if (cVar == null || cVar.f4473c == null) {
                return false;
            }
            return true;
        } else if (this.f4477c.f4478a != null) {
            return true;
        } else {
            return false;
        }
    }

    public final Object next() {
        c cVar;
        if (this.f4476b) {
            this.f4476b = false;
            this.f4475a = this.f4477c.f4478a;
        } else {
            c cVar2 = this.f4475a;
            if (cVar2 != null) {
                cVar = cVar2.f4473c;
            } else {
                cVar = null;
            }
            this.f4475a = cVar;
        }
        return this.f4475a;
    }

    public d(f fVar) {
        this.f4477c = fVar;
    }
}
