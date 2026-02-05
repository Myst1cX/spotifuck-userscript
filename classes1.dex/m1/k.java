package m1;

import h1.a;
import java.io.IOException;
import java.util.ArrayList;

public final class k extends a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f3720b = 2;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f3721c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ s f3722d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(s sVar, Object[] objArr, int i, ArrayList arrayList) {
        super("OkHttp %s Push Request[%s]", objArr);
        this.f3722d = sVar;
        this.f3721c = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(s sVar, Object[] objArr, int i, ArrayList arrayList, boolean z2) {
        super("OkHttp %s Push Headers[%s]", objArr);
        this.f3722d = sVar;
        this.f3721c = i;
    }

    private final void b() {
        this.f3722d.f3747j.getClass();
        try {
            this.f3722d.f3755r.l(this.f3721c, 6);
            synchronized (this.f3722d) {
                this.f3722d.f3757t.remove(Integer.valueOf(this.f3721c));
            }
        } catch (IOException unused) {
        }
    }

    private final void c() {
        this.f3722d.f3747j.getClass();
        try {
            this.f3722d.f3755r.l(this.f3721c, 6);
            synchronized (this.f3722d) {
                this.f3722d.f3757t.remove(Integer.valueOf(this.f3721c));
            }
        } catch (IOException unused) {
        }
    }

    public final void a() {
        switch (this.f3720b) {
            case 0:
                b();
                return;
            case 1:
                c();
                return;
            default:
                this.f3722d.f3747j.getClass();
                synchronized (this.f3722d) {
                    this.f3722d.f3757t.remove(Integer.valueOf(this.f3721c));
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(s sVar, Object[] objArr, int i, int i2) {
        super("OkHttp %s Push Reset[%s]", objArr);
        this.f3722d = sVar;
        this.f3721c = i;
    }
}
