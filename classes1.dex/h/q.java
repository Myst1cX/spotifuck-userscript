package h;

import E.o;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class q implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3024a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque f3025b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public final r f3026c;

    /* renamed from: d  reason: collision with root package name */
    public Runnable f3027d;

    public final void a() {
        synchronized (this.f3024a) {
            try {
                Runnable runnable = (Runnable) this.f3025b.poll();
                this.f3027d = runnable;
                if (runnable != null) {
                    this.f3026c.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void execute(Runnable runnable) {
        synchronized (this.f3024a) {
            try {
                this.f3025b.add(new o(this, runnable, 2));
                if (this.f3027d == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public q(r rVar) {
        this.f3026c = rVar;
    }
}
