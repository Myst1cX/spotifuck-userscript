package g1;

import A.b;
import h1.c;
import i1.g;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import r1.e;
import r1.q;

public final class h implements Closeable, Flushable {

    /* renamed from: a  reason: collision with root package name */
    public final b f2701a = new b(26, (Object) this);

    /* renamed from: b  reason: collision with root package name */
    public final g f2702b;

    public static int f(q qVar) {
        e eVar;
        byte h2;
        try {
            qVar.p(1);
            int i = 0;
            while (true) {
                int i2 = i + 1;
                boolean o2 = qVar.o((long) i2);
                eVar = qVar.f4598a;
                if (!o2) {
                    break;
                }
                h2 = eVar.h((long) i);
                if (h2 < 48 || h2 > 57) {
                    if (i != 0) {
                        break;
                    } else if (h2 != 45) {
                        break;
                    }
                }
                i = i2;
            }
            if (i != 0) {
                long l2 = eVar.l();
                String n2 = qVar.n(Long.MAX_VALUE);
                if (l2 >= 0 && l2 <= 2147483647L && n2.isEmpty()) {
                    return (int) l2;
                }
                throw new IOException("expected an int but was \"" + l2 + n2 + "\"");
            }
            throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", new Object[]{Byte.valueOf(h2)}));
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    public final void close() {
        this.f2702b.close();
    }

    public final void flush() {
        this.f2702b.flush();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(g1.A r6) {
        /*
            r5 = this;
            i1.g r0 = r5.f2702b
            g1.u r6 = r6.f2632a
            java.lang.String r6 = r6.f2780h
            r1.h r6 = r1.h.f(r6)
            java.lang.String r1 = "MD5"
            r1.h r6 = r6.e(r1)
            java.lang.String r6 = r6.h()
            monitor-enter(r0)
            r0.j()     // Catch:{ all -> 0x0039 }
            r0.f()     // Catch:{ all -> 0x0039 }
            i1.g.t(r6)     // Catch:{ all -> 0x0039 }
            java.util.LinkedHashMap r1 = r0.f3126k     // Catch:{ all -> 0x0039 }
            java.lang.Object r6 = r1.get(r6)     // Catch:{ all -> 0x0039 }
            i1.e r6 = (i1.e) r6     // Catch:{ all -> 0x0039 }
            if (r6 != 0) goto L_0x002a
            monitor-exit(r0)
            goto L_0x003c
        L_0x002a:
            r0.r(r6)     // Catch:{ all -> 0x0039 }
            long r1 = r0.i     // Catch:{ all -> 0x0039 }
            long r3 = r0.f3123g     // Catch:{ all -> 0x0039 }
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x003b
            r6 = 0
            r0.f3131p = r6     // Catch:{ all -> 0x0039 }
            goto L_0x003b
        L_0x0039:
            r6 = move-exception
            goto L_0x003d
        L_0x003b:
            monitor-exit(r0)
        L_0x003c:
            return
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.h.g(g1.A):void");
    }

    public h(File file, long j2) {
        Pattern pattern = g.f3117u;
        if (j2 > 0) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            byte[] bArr = c.f3086a;
            this.f2702b = new g(file, j2, new ThreadPoolExecutor(0, 1, 60, timeUnit, linkedBlockingQueue, new h1.b("OkHttp DiskLruCache", true)));
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
}
