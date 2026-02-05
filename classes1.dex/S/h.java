package s;

import Q0.E;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class h implements Future {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f4629d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e;

    /* renamed from: f  reason: collision with root package name */
    public static final C0327a f4630f;

    /* renamed from: g  reason: collision with root package name */
    public static final Object f4631g = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f4632a;

    /* renamed from: b  reason: collision with root package name */
    public volatile C0330d f4633b;

    /* renamed from: c  reason: collision with root package name */
    public volatile C0333g f4634c;

    public static Object d(h hVar) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = hVar.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void e(C0333g gVar) {
        gVar.f4627a = null;
        while (true) {
            C0333g gVar2 = this.f4634c;
            if (gVar2 != C0333g.f4626c) {
                C0333g gVar3 = null;
                while (gVar2 != null) {
                    C0333g gVar4 = gVar2.f4628b;
                    if (gVar2.f4627a != null) {
                        gVar3 = gVar2;
                    } else if (gVar3 != null) {
                        gVar3.f4628b = gVar4;
                        if (gVar3.f4627a == null) {
                        }
                    } else if (!f4630f.c(this, gVar2, gVar4)) {
                    }
                    gVar2 = gVar4;
                }
                return;
            }
            return;
        }
    }

    public final Object get(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f4632a;
            if (obj != null) {
                return c(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C0333g gVar = this.f4634c;
                C0333g gVar2 = C0333g.f4626c;
                if (gVar != gVar2) {
                    C0333g gVar3 = new C0333g();
                    do {
                        C0327a aVar = f4630f;
                        aVar.d(gVar3, gVar);
                        if (aVar.c(this, gVar, gVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f4632a;
                                    if (obj2 != null) {
                                        return c(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    e(gVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            e(gVar3);
                        } else {
                            gVar = this.f4634c;
                        }
                    } while (gVar != gVar2);
                }
                return c(this.f4632a);
            }
            while (nanos > 0) {
                Object obj3 = this.f4632a;
                if (obj3 != null) {
                    return c(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String hVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String f2 = E.f(str, " (plus ");
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z2 = i == 0 || nanos2 > 1000;
                if (i > 0) {
                    String str2 = f2 + convert + " " + lowerCase;
                    if (z2) {
                        str2 = E.f(str2, ",");
                    }
                    f2 = E.f(str2, " ");
                }
                if (z2) {
                    f2 = f2 + nanos2 + " nanoseconds ";
                }
                str = E.f(f2, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(E.f(str, " but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + hVar);
        }
        throw new InterruptedException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: s.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: s.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: s.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = "b"
            java.lang.String r1 = "a"
            java.lang.Class<s.g> r2 = s.C0333g.class
            java.lang.String r3 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r4 = "false"
            java.lang.String r3 = java.lang.System.getProperty(r3, r4)
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            f4629d = r3
            java.lang.Class<s.h> r3 = s.h.class
            java.lang.String r4 = r3.getName()
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            e = r4
            s.e r4 = new s.e     // Catch:{ all -> 0x0044 }
            java.lang.Class<java.lang.Thread> r5 = java.lang.Thread.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r5, r1)     // Catch:{ all -> 0x0044 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r5 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r5)     // Catch:{ all -> 0x0044 }
            java.lang.Class<s.d> r2 = s.C0330d.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r0)     // Catch:{ all -> 0x0044 }
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r0, r1)     // Catch:{ all -> 0x0044 }
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0044 }
            r0 = 0
            goto L_0x004a
        L_0x0044:
            r0 = move-exception
            s.f r4 = new s.f
            r4.<init>()
        L_0x004a:
            f4630f = r4
            if (r0 == 0) goto L_0x0057
            java.util.logging.Logger r1 = e
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0057:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f4631g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.h.<clinit>():void");
    }

    public static void b(h hVar) {
        C0333g gVar;
        C0330d dVar;
        do {
            gVar = hVar.f4634c;
        } while (!f4630f.c(hVar, gVar, C0333g.f4626c));
        while (gVar != null) {
            Thread thread = gVar.f4627a;
            if (thread != null) {
                gVar.f4627a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f4628b;
        }
        do {
            dVar = hVar.f4633b;
        } while (!f4630f.a(hVar, dVar));
        C0330d dVar2 = null;
        while (dVar != null) {
            C0330d dVar3 = dVar.f4621a;
            dVar.f4621a = dVar2;
            dVar2 = dVar;
            dVar = dVar3;
        }
        while (dVar2 != null) {
            dVar2 = dVar2.f4621a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", e2);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof C0328b) {
            CancellationException cancellationException = ((C0328b) obj).f4619a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        } else if (obj instanceof C0329c) {
            ((C0329c) obj).getClass();
            throw new ExecutionException((Throwable) null);
        } else if (obj == f4631g) {
            return null;
        } else {
            return obj;
        }
    }

    public final void a(StringBuilder sb) {
        String str;
        try {
            Object d2 = d(this);
            sb.append("SUCCESS, result=[");
            if (d2 == this) {
                str = "this future";
            } else {
                str = String.valueOf(d2);
            }
            sb.append(str);
            sb.append("]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public final boolean cancel(boolean z2) {
        C0328b bVar;
        Object obj = this.f4632a;
        if (obj != null) {
            return false;
        }
        if (f4629d) {
            bVar = new C0328b(z2, new CancellationException("Future.cancel() was called."));
        } else if (z2) {
            bVar = C0328b.f4617b;
        } else {
            bVar = C0328b.f4618c;
        }
        if (!f4630f.b(this, obj, bVar)) {
            return false;
        }
        b(this);
        return true;
    }

    public final boolean isCancelled() {
        return this.f4632a instanceof C0328b;
    }

    public final boolean isDone() {
        if (this.f4632a != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f4632a instanceof C0328b) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f4632a;
            if (obj2 != null) {
                return c(obj2);
            }
            C0333g gVar = this.f4634c;
            C0333g gVar2 = C0333g.f4626c;
            if (gVar != gVar2) {
                C0333g gVar3 = new C0333g();
                do {
                    C0327a aVar = f4630f;
                    aVar.d(gVar3, gVar);
                    if (aVar.c(this, gVar, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4632a;
                            } else {
                                e(gVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    gVar = this.f4634c;
                } while (gVar != gVar2);
            }
            return c(this.f4632a);
        }
        throw new InterruptedException();
    }
}
