package m1;

import java.io.IOException;
import r1.e;
import r1.j;

public final class g extends j {

    /* renamed from: b  reason: collision with root package name */
    public boolean f3706b = false;

    /* renamed from: c  reason: collision with root package name */
    public long f3707c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h f3708d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(h hVar, w wVar) {
        super(wVar);
        this.f3708d = hVar;
    }

    public final long e(e eVar, long j2) {
        try {
            long e = this.f4585a.e(eVar, 8192);
            if (e > 0) {
                this.f3707c += e;
            }
            return e;
        } catch (IOException e2) {
            if (!this.f3706b) {
                this.f3706b = true;
                h hVar = this.f3708d;
                hVar.f3711b.h(false, hVar, e2);
            }
            throw e2;
        }
    }

    public final void close() {
        super.close();
        if (!this.f3706b) {
            this.f3706b = true;
            h hVar = this.f3708d;
            hVar.f3711b.h(false, hVar, (IOException) null);
        }
    }
}
