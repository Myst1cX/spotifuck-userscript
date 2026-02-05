package r;

import java.util.LinkedHashMap;
import java.util.Locale;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f4530a;

    /* renamed from: b  reason: collision with root package name */
    public int f4531b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4532c;

    /* renamed from: d  reason: collision with root package name */
    public int f4533d;
    public int e;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r3) {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            int r0 = r2.f4531b     // Catch:{ all -> 0x0012 }
            if (r0 < 0) goto L_0x0047
            java.util.LinkedHashMap r0 = r2.f4530a     // Catch:{ all -> 0x0012 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0014
            int r0 = r2.f4531b     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x0047
            goto L_0x0014
        L_0x0012:
            r3 = move-exception
            goto L_0x0066
        L_0x0014:
            int r0 = r2.f4531b     // Catch:{ all -> 0x0012 }
            if (r0 <= r3) goto L_0x0045
            java.util.LinkedHashMap r0 = r2.f4530a     // Catch:{ all -> 0x0012 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0021
            goto L_0x0045
        L_0x0021:
            java.util.LinkedHashMap r0 = r2.f4530a     // Catch:{ all -> 0x0012 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0012 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0012 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0012 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0012 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0012 }
            r0.getValue()     // Catch:{ all -> 0x0012 }
            java.util.LinkedHashMap r0 = r2.f4530a     // Catch:{ all -> 0x0012 }
            r0.remove(r1)     // Catch:{ all -> 0x0012 }
            int r0 = r2.f4531b     // Catch:{ all -> 0x0012 }
            int r0 = r0 + -1
            r2.f4531b = r0     // Catch:{ all -> 0x0012 }
            monitor-exit(r2)     // Catch:{ all -> 0x0012 }
            goto L_0x0000
        L_0x0045:
            monitor-exit(r2)     // Catch:{ all -> 0x0012 }
            return
        L_0x0047:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0012 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0012 }
            r0.<init>()     // Catch:{ all -> 0x0012 }
            java.lang.Class r1 = r2.getClass()     // Catch:{ all -> 0x0012 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0012 }
            r0.append(r1)     // Catch:{ all -> 0x0012 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0012 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0012 }
            r3.<init>(r0)     // Catch:{ all -> 0x0012 }
            throw r3     // Catch:{ all -> 0x0012 }
        L_0x0066:
            monitor-exit(r2)     // Catch:{ all -> 0x0012 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: r.f.c(int):void");
    }

    public final Object a(Object obj) {
        if (obj != null) {
            synchronized (this) {
                try {
                    Object obj2 = this.f4530a.get(obj);
                    if (obj2 != null) {
                        this.f4533d++;
                        return obj2;
                    }
                    this.e++;
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            throw new NullPointerException("key == null");
        }
    }

    public final Object b(Object obj, Object obj2) {
        Object put;
        if (obj != null) {
            synchronized (this) {
                try {
                    this.f4531b++;
                    put = this.f4530a.put(obj, obj2);
                    if (put != null) {
                        this.f4531b--;
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            c(this.f4532c);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    public final synchronized String toString() {
        int i;
        int i2;
        int i3;
        int i4;
        try {
            i = this.f4533d;
            i2 = this.e;
            int i5 = i + i2;
            if (i5 != 0) {
                i3 = (i * 100) / i5;
            } else {
                i3 = 0;
            }
            Locale locale = Locale.US;
            i4 = this.f4532c;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return "LruCache[maxSize=" + i4 + ",hits=" + i + ",misses=" + i2 + ",hitRate=" + i3 + "%]";
    }

    public f(int i) {
        if (i > 0) {
            this.f4532c = i;
            this.f4530a = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
}
