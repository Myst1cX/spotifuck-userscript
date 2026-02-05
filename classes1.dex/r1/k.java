package r1;

import java.util.concurrent.TimeUnit;

public final class k extends x {
    public x e;

    public final x a() {
        return this.e.a();
    }

    public final x b() {
        return this.e.b();
    }

    public final long c() {
        return this.e.c();
    }

    public final x d(long j2) {
        return this.e.d(j2);
    }

    public final boolean e() {
        return this.e.e();
    }

    public final void f() {
        this.e.f();
    }

    public final x g(long j2, TimeUnit timeUnit) {
        return this.e.g(j2, timeUnit);
    }

    public k(x xVar) {
        if (xVar != null) {
            this.e = xVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }
}
