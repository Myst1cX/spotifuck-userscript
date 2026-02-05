package i1;

import java.io.IOException;
import r1.a;
import r1.e;
import r1.i;

public final class c extends i {

    /* renamed from: b  reason: collision with root package name */
    public boolean f3099b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f3100c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f3101d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, a aVar, int i) {
        super(aVar);
        this.f3100c = i;
        this.f3101d = obj;
    }

    public final void b(e eVar, long j2) {
        if (this.f3099b) {
            eVar.s(j2);
            return;
        }
        try {
            super.b(eVar, j2);
        } catch (IOException unused) {
            this.f3099b = true;
            f();
        }
    }

    public final void close() {
        if (!this.f3099b) {
            try {
                super.close();
            } catch (IOException unused) {
                this.f3099b = true;
                f();
            }
        }
    }

    public final void f() {
        switch (this.f3100c) {
            case 0:
                ((g) this.f3101d).f3128m = true;
                return;
            default:
                synchronized (((d) this.f3101d).f3105d) {
                    ((d) this.f3101d).c();
                }
                return;
        }
    }

    public final void flush() {
        if (!this.f3099b) {
            try {
                super.flush();
            } catch (IOException unused) {
                this.f3099b = true;
                f();
            }
        }
    }
}
