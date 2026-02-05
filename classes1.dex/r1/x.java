package r1;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class x {

    /* renamed from: d  reason: collision with root package name */
    public static final w f4612d = new Object();

    /* renamed from: a  reason: collision with root package name */
    public boolean f4613a;

    /* renamed from: b  reason: collision with root package name */
    public long f4614b;

    /* renamed from: c  reason: collision with root package name */
    public long f4615c;

    public x a() {
        this.f4613a = false;
        return this;
    }

    public x d(long j2) {
        this.f4613a = true;
        this.f4614b = j2;
        return this;
    }

    public x b() {
        this.f4615c = 0;
        return this;
    }

    public long c() {
        if (this.f4613a) {
            return this.f4614b;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean e() {
        return this.f4613a;
    }

    public x g(long j2, TimeUnit timeUnit) {
        if (j2 < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j2);
        } else if (timeUnit != null) {
            this.f4615c = timeUnit.toNanos(j2);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public void f() {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        } else if (this.f4613a && this.f4614b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}
