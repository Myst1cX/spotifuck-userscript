package r1;

import Q0.F;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class c extends x {

    /* renamed from: h  reason: collision with root package name */
    public static final long f4571h;
    public static final long i;

    /* renamed from: j  reason: collision with root package name */
    public static c f4572j;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public c f4573f;

    /* renamed from: g  reason: collision with root package name */
    public long f4574g;

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f4571h = millis;
        i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static c h() {
        c cVar = f4572j.f4573f;
        Class<c> cls = c.class;
        if (cVar == null) {
            long nanoTime = System.nanoTime();
            cls.wait(f4571h);
            if (f4572j.f4573f != null || System.nanoTime() - nanoTime < i) {
                return null;
            }
            return f4572j;
        }
        long nanoTime2 = cVar.f4574g - System.nanoTime();
        if (nanoTime2 > 0) {
            long j2 = nanoTime2 / 1000000;
            cls.wait(j2, (int) (nanoTime2 - (1000000 * j2)));
            return null;
        }
        f4572j.f4573f = cVar.f4573f;
        cVar.f4573f = null;
        return cVar;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [r1.c, java.lang.Object] */
    public final void i() {
        c cVar;
        if (!this.e) {
            long j2 = this.f4615c;
            boolean z2 = this.f4613a;
            int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i2 != 0 || z2) {
                this.e = true;
                synchronized (c.class) {
                    try {
                        if (f4572j == null) {
                            f4572j = new Object();
                            F f2 = new F("Okio Watchdog");
                            f2.setDaemon(true);
                            f2.start();
                        }
                        long nanoTime = System.nanoTime();
                        if (i2 != 0 && z2) {
                            this.f4574g = Math.min(j2, c() - nanoTime) + nanoTime;
                        } else if (i2 != 0) {
                            this.f4574g = j2 + nanoTime;
                        } else if (z2) {
                            this.f4574g = c();
                        } else {
                            throw new AssertionError();
                        }
                        long j3 = this.f4574g - nanoTime;
                        c cVar2 = f4572j;
                        while (true) {
                            cVar = cVar2.f4573f;
                            if (cVar == null) {
                                break;
                            } else if (j3 < cVar.f4574g - nanoTime) {
                                break;
                            } else {
                                cVar2 = cVar;
                            }
                        }
                        this.f4573f = cVar;
                        cVar2.f4573f = this;
                        if (cVar2 == f4572j) {
                            c.class.notify();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    public final boolean k() {
        if (!this.e) {
            return false;
        }
        this.e = false;
        synchronized (c.class) {
            c cVar = f4572j;
            while (cVar != null) {
                c cVar2 = cVar.f4573f;
                if (cVar2 == this) {
                    cVar.f4573f = this.f4573f;
                    this.f4573f = null;
                    return false;
                }
                cVar = cVar2;
            }
            return true;
        }
    }

    public IOException l(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void m() {
    }

    public final void j(boolean z2) {
        if (k() && z2) {
            throw l((IOException) null);
        }
    }
}
