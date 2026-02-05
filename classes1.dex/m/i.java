package m;

import o.f1;
import p0.C0320a;

public final class i extends C0320a {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f3661o = 0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3662p;

    /* renamed from: q  reason: collision with root package name */
    public int f3663q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f3664r;

    public i(j jVar) {
        this.f3664r = jVar;
        this.f3662p = false;
        this.f3663q = 0;
    }

    public final void a() {
        switch (this.f3661o) {
            case 0:
                int i = this.f3663q + 1;
                this.f3663q = i;
                j jVar = (j) this.f3664r;
                if (i == jVar.f3665a.size()) {
                    C0320a aVar = jVar.f3668d;
                    if (aVar != null) {
                        aVar.a();
                    }
                    this.f3663q = 0;
                    this.f3662p = false;
                    jVar.e = false;
                    return;
                }
                return;
            default:
                if (!this.f3662p) {
                    ((f1) this.f3664r).f4188a.setVisibility(this.f3663q);
                    return;
                }
                return;
        }
    }

    public void b() {
        switch (this.f3661o) {
            case 1:
                this.f3662p = true;
                return;
            default:
                return;
        }
    }

    public final void c() {
        switch (this.f3661o) {
            case 0:
                if (!this.f3662p) {
                    this.f3662p = true;
                    C0320a aVar = ((j) this.f3664r).f3668d;
                    if (aVar != null) {
                        aVar.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((f1) this.f3664r).f4188a.setVisibility(0);
                return;
        }
    }

    public i(f1 f1Var, int i) {
        this.f3664r = f1Var;
        this.f3663q = i;
        this.f3662p = false;
    }
}
