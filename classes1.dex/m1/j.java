package m1;

import h1.a;
import java.io.IOException;

public final class j extends a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f3717b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f3718c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ s f3719d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(s sVar, Object[] objArr, int i, long j2) {
        super("OkHttp Window Update %s stream %d", objArr);
        this.f3719d = sVar;
        this.f3717b = i;
        this.f3718c = j2;
    }

    public final void a() {
        s sVar = this.f3719d;
        try {
            sVar.f3755r.o(this.f3717b, this.f3718c);
        } catch (IOException unused) {
            sVar.g();
        }
    }
}
