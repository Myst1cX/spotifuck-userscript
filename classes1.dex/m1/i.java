package m1;

import h1.a;
import java.io.IOException;

public final class i extends a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f3714b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f3715c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ s f3716d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(s sVar, Object[] objArr, int i, int i2) {
        super("OkHttp %s stream %d", objArr);
        this.f3716d = sVar;
        this.f3714b = i;
        this.f3715c = i2;
    }

    public final void a() {
        s sVar = this.f3716d;
        try {
            sVar.f3755r.l(this.f3714b, this.f3715c);
        } catch (IOException unused) {
            sVar.g();
        }
    }
}
