package m1;

import h1.a;
import java.io.IOException;
import r1.e;

public final class l extends a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f3723b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f3724c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f3725d;
    public final /* synthetic */ s e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(s sVar, Object[] objArr, int i, e eVar, int i2, boolean z2) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.e = sVar;
        this.f3723b = i;
        this.f3724c = eVar;
        this.f3725d = i2;
    }

    public final void a() {
        try {
            C c2 = this.e.f3747j;
            e eVar = this.f3724c;
            int i = this.f3725d;
            c2.getClass();
            eVar.s((long) i);
            this.e.f3755r.l(this.f3723b, 6);
            synchronized (this.e) {
                this.e.f3757t.remove(Integer.valueOf(this.f3723b));
            }
        } catch (IOException unused) {
        }
    }
}
