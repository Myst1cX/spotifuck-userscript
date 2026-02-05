package g1;

import N0.B;
import h1.c;
import j0.C0160w;
import j1.b;
import j1.e;
import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o1.g;

public final class n {

    /* renamed from: g  reason: collision with root package name */
    public static final ThreadPoolExecutor f2736g;

    /* renamed from: a  reason: collision with root package name */
    public final int f2737a = 5;

    /* renamed from: b  reason: collision with root package name */
    public final long f2738b;

    /* renamed from: c  reason: collision with root package name */
    public final B f2739c = new B(11, this);

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f2740d = new ArrayDeque();
    public final C0160w e = new C0160w();

    /* renamed from: f  reason: collision with root package name */
    public boolean f2741f;

    public final long a(long j2) {
        synchronized (this) {
            try {
                Iterator it2 = this.f2740d.iterator();
                b bVar = null;
                long j3 = Long.MIN_VALUE;
                int i = 0;
                int i2 = 0;
                while (it2.hasNext()) {
                    b bVar2 = (b) it2.next();
                    if (b(bVar2, j2) > 0) {
                        i2++;
                    } else {
                        i++;
                        long j4 = j2 - bVar2.f3539o;
                        if (j4 > j3) {
                            bVar = bVar2;
                            j3 = j4;
                        }
                    }
                }
                long j5 = this.f2738b;
                if (j3 < j5) {
                    if (i <= this.f2737a) {
                        if (i > 0) {
                            long j6 = j5 - j3;
                            return j6;
                        } else if (i2 > 0) {
                            return j5;
                        } else {
                            this.f2741f = false;
                            return -1;
                        }
                    }
                }
                this.f2740d.remove(bVar);
                c.d(bVar.e);
                return 0;
            } finally {
                while (true) {
                }
            }
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = c.f3086a;
        f2736g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, timeUnit, synchronousQueue, new h1.b("OkHttp ConnectionPool", true));
    }

    public n() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f2738b = timeUnit.toNanos(5);
    }

    public final int b(b bVar, long j2) {
        ArrayList arrayList = bVar.f3538n;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                g.f4433a.l("A connection to " + bVar.f3529c.f2660a.f2669a + " was leaked. Did you forget to close a response body?", ((e) reference).f3548a);
                arrayList.remove(i);
                bVar.f3535k = true;
                if (arrayList.isEmpty()) {
                    bVar.f3539o = j2 - this.f2738b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
