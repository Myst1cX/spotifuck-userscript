package m1;

import K.j;
import Q0.E;
import h1.b;
import h1.c;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class s implements Closeable {

    /* renamed from: u  reason: collision with root package name */
    public static final ThreadPoolExecutor f3739u;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3740a;

    /* renamed from: b  reason: collision with root package name */
    public final o f3741b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f3742c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final String f3743d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f3744f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3745g;

    /* renamed from: h  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f3746h;
    public final ThreadPoolExecutor i;

    /* renamed from: j  reason: collision with root package name */
    public final C f3747j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3748k;

    /* renamed from: l  reason: collision with root package name */
    public long f3749l = 0;

    /* renamed from: m  reason: collision with root package name */
    public long f3750m;

    /* renamed from: n  reason: collision with root package name */
    public final j f3751n;

    /* renamed from: o  reason: collision with root package name */
    public final j f3752o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3753p;

    /* renamed from: q  reason: collision with root package name */
    public final Socket f3754q;

    /* renamed from: r  reason: collision with root package name */
    public final z f3755r;

    /* renamed from: s  reason: collision with root package name */
    public final q f3756s;

    /* renamed from: t  reason: collision with root package name */
    public final LinkedHashSet f3757t;

    public final void close() {
        f(1, 6);
    }

    public final void f(int i2, int i3) {
        y[] yVarArr = null;
        try {
            k(i2);
            e = null;
        } catch (IOException e2) {
            e = e2;
        }
        synchronized (this) {
            try {
                if (!this.f3742c.isEmpty()) {
                    yVarArr = (y[]) this.f3742c.values().toArray(new y[this.f3742c.size()]);
                    this.f3742c.clear();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (yVarArr != null) {
            for (y c2 : yVarArr) {
                try {
                    c2.c(i3);
                } catch (IOException e3) {
                    if (e != null) {
                        e = e3;
                    }
                }
            }
        }
        try {
            this.f3755r.close();
        } catch (IOException e4) {
            if (e == null) {
                e = e4;
            }
        }
        try {
            this.f3754q.close();
        } catch (IOException e5) {
            e = e5;
        }
        this.f3746h.shutdown();
        this.i.shutdown();
        if (e != null) {
            throw e;
        }
    }

    public final void g() {
        try {
            f(2, 2);
        } catch (IOException unused) {
        }
    }

    public final synchronized y h(int i2) {
        return (y) this.f3742c.get(Integer.valueOf(i2));
    }

    public final synchronized int i() {
        int i2;
        j jVar = this.f3752o;
        if ((jVar.f332f & 16) != 0) {
            i2 = ((int[]) jVar.f333g)[4];
        } else {
            i2 = Integer.MAX_VALUE;
        }
        return i2;
    }

    public final synchronized y j(int i2) {
        y yVar;
        yVar = (y) this.f3742c.remove(Integer.valueOf(i2));
        notifyAll();
        return yVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.f3755r.f3791d);
        r6 = (long) r3;
        r8.f3750m -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005b, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0056 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(int r9, boolean r10, r1.e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            m1.z r12 = r8.f3755r
            r12.g(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x005e
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.f3750m     // Catch:{ InterruptedException -> 0x0056 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0032
            java.util.LinkedHashMap r3 = r8.f3742c     // Catch:{ InterruptedException -> 0x0056 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0056 }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x0056 }
            if (r3 == 0) goto L_0x002a
            r8.wait()     // Catch:{ InterruptedException -> 0x0056 }
            goto L_0x0012
        L_0x0028:
            r9 = move-exception
            goto L_0x005c
        L_0x002a:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0056 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0056 }
            throw r9     // Catch:{ InterruptedException -> 0x0056 }
        L_0x0032:
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0028 }
            int r4 = (int) r3     // Catch:{ all -> 0x0028 }
            m1.z r3 = r8.f3755r     // Catch:{ all -> 0x0028 }
            int r3 = r3.f3791d     // Catch:{ all -> 0x0028 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0028 }
            long r4 = r8.f3750m     // Catch:{ all -> 0x0028 }
            long r6 = (long) r3     // Catch:{ all -> 0x0028 }
            long r4 = r4 - r6
            r8.f3750m = r4     // Catch:{ all -> 0x0028 }
            monitor-exit(r8)     // Catch:{ all -> 0x0028 }
            long r12 = r12 - r6
            m1.z r4 = r8.f3755r
            if (r10 == 0) goto L_0x0051
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0051
            r5 = 1
            goto L_0x0052
        L_0x0051:
            r5 = 0
        L_0x0052:
            r4.g(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0056:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0028 }
            r9.<init>()     // Catch:{ all -> 0x0028 }
            throw r9     // Catch:{ all -> 0x0028 }
        L_0x005c:
            monitor-exit(r8)     // Catch:{ all -> 0x0028 }
            throw r9
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.s.l(int, boolean, r1.e, long):void");
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = c.f3086a;
        f3739u = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, timeUnit, synchronousQueue, new b("OkHttp Http2Connection", true));
    }

    public s(m mVar) {
        int i2;
        m mVar2 = mVar;
        j jVar = new j();
        this.f3751n = jVar;
        j jVar2 = new j();
        this.f3752o = jVar2;
        this.f3753p = false;
        this.f3757t = new LinkedHashSet();
        this.f3747j = C.f3677a;
        boolean z2 = mVar2.f3730f;
        this.f3740a = z2;
        this.f3741b = mVar2.e;
        if (z2) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        this.f3744f = i2;
        if (z2) {
            this.f3744f = i2 + 2;
        }
        if (z2) {
            jVar.d(7, 16777216);
        }
        String str = mVar2.f3727b;
        this.f3743d = str;
        byte[] bArr = c.f3086a;
        Locale locale = Locale.US;
        this.f3746h = new ScheduledThreadPoolExecutor(1, new b(E.g("OkHttp ", str, " Writer"), false));
        this.i = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(E.g("OkHttp ", str, " Push Observer"), true));
        jVar2.d(7, 65535);
        jVar2.d(5, 16384);
        this.f3750m = (long) jVar2.b();
        this.f3754q = mVar2.f3726a;
        this.f3755r = new z(mVar2.f3729d, z2);
        this.f3756s = new q(this, new u(mVar2.f3728c, z2));
    }

    public final void flush() {
        this.f3755r.flush();
    }

    public final void k(int i2) {
        synchronized (this.f3755r) {
            synchronized (this) {
                if (!this.f3745g) {
                    this.f3745g = true;
                    int i3 = this.e;
                    this.f3755r.i(c.f3086a, i3, i2);
                }
            }
        }
    }

    public final void m(int i2, int i3) {
        try {
            this.f3746h.execute(new i(this, new Object[]{this.f3743d, Integer.valueOf(i2)}, i2, i3));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void n(int i2, long j2) {
        try {
            this.f3746h.execute(new j(this, new Object[]{this.f3743d, Integer.valueOf(i2)}, i2, j2));
        } catch (RejectedExecutionException unused) {
        }
    }
}
