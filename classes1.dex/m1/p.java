package m1;

import h1.a;
import java.io.IOException;

public final class p extends a {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3732b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3733c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3734d;
    public final /* synthetic */ s e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(s sVar, boolean z2, int i, int i2) {
        super("OkHttp %s ping %08x%08x", sVar.f3743d, Integer.valueOf(i), Integer.valueOf(i2));
        this.e = sVar;
        this.f3732b = z2;
        this.f3733c = i;
        this.f3734d = i2;
    }

    public final void a() {
        boolean z2;
        s sVar = this.e;
        boolean z3 = this.f3732b;
        int i = this.f3733c;
        int i2 = this.f3734d;
        if (!z3) {
            synchronized (sVar) {
                z2 = sVar.f3748k;
                sVar.f3748k = true;
            }
            if (z2) {
                sVar.g();
                return;
            }
        } else {
            sVar.getClass();
        }
        try {
            sVar.f3755r.k(i, i2, z3);
        } catch (IOException unused) {
            sVar.g();
        }
    }
}
