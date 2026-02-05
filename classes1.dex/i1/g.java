package i1;

import N0.B;
import Q0.E;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import n1.a;
import r1.o;
import r1.p;
import r1.x;

public final class g implements Closeable, Flushable {

    /* renamed from: u  reason: collision with root package name */
    public static final Pattern f3117u = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: a  reason: collision with root package name */
    public final a f3118a;

    /* renamed from: b  reason: collision with root package name */
    public final File f3119b;

    /* renamed from: c  reason: collision with root package name */
    public final File f3120c;

    /* renamed from: d  reason: collision with root package name */
    public final File f3121d;
    public final File e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3122f;

    /* renamed from: g  reason: collision with root package name */
    public final long f3123g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3124h;
    public long i = 0;

    /* renamed from: j  reason: collision with root package name */
    public p f3125j;

    /* renamed from: k  reason: collision with root package name */
    public final LinkedHashMap f3126k = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: l  reason: collision with root package name */
    public int f3127l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3128m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3129n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3130o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3131p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3132q;

    /* renamed from: r  reason: collision with root package name */
    public long f3133r = 0;

    /* renamed from: s  reason: collision with root package name */
    public final ThreadPoolExecutor f3134s;

    /* renamed from: t  reason: collision with root package name */
    public final B f3135t = new B(12, this);

    public final synchronized void close() {
        try {
            if (this.f3129n) {
                if (!this.f3130o) {
                    for (e eVar : (e[]) this.f3126k.values().toArray(new e[this.f3126k.size()])) {
                        d dVar = eVar.f3110f;
                        if (dVar != null) {
                            dVar.a();
                        }
                    }
                    s();
                    this.f3125j.close();
                    this.f3125j = null;
                    this.f3130o = true;
                    return;
                }
            }
            this.f3130o = true;
        } finally {
            while (true) {
            }
        }
    }

    public final synchronized void f() {
        if (k()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void flush() {
        if (this.f3129n) {
            f();
            s();
            this.f3125j.flush();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void g(i1.d r9, boolean r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            i1.e r0 = r9.f3102a     // Catch:{ all -> 0x002d }
            i1.d r1 = r0.f3110f     // Catch:{ all -> 0x002d }
            if (r1 != r9) goto L_0x010d
            r1 = 0
            if (r10 == 0) goto L_0x004d
            boolean r2 = r0.e     // Catch:{ all -> 0x002d }
            if (r2 != 0) goto L_0x004d
            r2 = 0
        L_0x000f:
            int r3 = r8.f3124h     // Catch:{ all -> 0x002d }
            if (r2 >= r3) goto L_0x004d
            boolean[] r3 = r9.f3103b     // Catch:{ all -> 0x002d }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x0033
            n1.a r3 = r8.f3118a     // Catch:{ all -> 0x002d }
            java.io.File[] r4 = r0.f3109d     // Catch:{ all -> 0x002d }
            r4 = r4[r2]     // Catch:{ all -> 0x002d }
            r3.getClass()     // Catch:{ all -> 0x002d }
            boolean r3 = r4.exists()     // Catch:{ all -> 0x002d }
            if (r3 != 0) goto L_0x0030
            r9.a()     // Catch:{ all -> 0x002d }
            monitor-exit(r8)
            return
        L_0x002d:
            r9 = move-exception
            goto L_0x0113
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x0033:
            r9.a()     // Catch:{ all -> 0x002d }
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x002d }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x002d }
            r10.<init>()     // Catch:{ all -> 0x002d }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r10.append(r0)     // Catch:{ all -> 0x002d }
            r10.append(r2)     // Catch:{ all -> 0x002d }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x002d }
            r9.<init>(r10)     // Catch:{ all -> 0x002d }
            throw r9     // Catch:{ all -> 0x002d }
        L_0x004d:
            r9 = 0
        L_0x004e:
            int r2 = r8.f3124h     // Catch:{ all -> 0x002d }
            if (r9 >= r2) goto L_0x008c
            java.io.File[] r2 = r0.f3109d     // Catch:{ all -> 0x002d }
            r2 = r2[r9]     // Catch:{ all -> 0x002d }
            if (r10 == 0) goto L_0x0084
            n1.a r3 = r8.f3118a     // Catch:{ all -> 0x002d }
            r3.getClass()     // Catch:{ all -> 0x002d }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x0089
            java.io.File[] r3 = r0.f3108c     // Catch:{ all -> 0x002d }
            r3 = r3[r9]     // Catch:{ all -> 0x002d }
            n1.a r4 = r8.f3118a     // Catch:{ all -> 0x002d }
            r4.c(r2, r3)     // Catch:{ all -> 0x002d }
            long[] r2 = r0.f3107b     // Catch:{ all -> 0x002d }
            r4 = r2[r9]     // Catch:{ all -> 0x002d }
            n1.a r2 = r8.f3118a     // Catch:{ all -> 0x002d }
            r2.getClass()     // Catch:{ all -> 0x002d }
            long r2 = r3.length()     // Catch:{ all -> 0x002d }
            long[] r6 = r0.f3107b     // Catch:{ all -> 0x002d }
            r6[r9] = r2     // Catch:{ all -> 0x002d }
            long r6 = r8.i     // Catch:{ all -> 0x002d }
            long r6 = r6 - r4
            long r6 = r6 + r2
            r8.i = r6     // Catch:{ all -> 0x002d }
            goto L_0x0089
        L_0x0084:
            n1.a r3 = r8.f3118a     // Catch:{ all -> 0x002d }
            r3.a(r2)     // Catch:{ all -> 0x002d }
        L_0x0089:
            int r9 = r9 + 1
            goto L_0x004e
        L_0x008c:
            int r9 = r8.f3127l     // Catch:{ all -> 0x002d }
            r2 = 1
            int r9 = r9 + r2
            r8.f3127l = r9     // Catch:{ all -> 0x002d }
            r9 = 0
            r0.f3110f = r9     // Catch:{ all -> 0x002d }
            boolean r9 = r0.e     // Catch:{ all -> 0x002d }
            r9 = r9 | r10
            r3 = 32
            r4 = 10
            if (r9 == 0) goto L_0x00d4
            r0.e = r2     // Catch:{ all -> 0x002d }
            r1.p r9 = r8.f3125j     // Catch:{ all -> 0x002d }
            java.lang.String r2 = "CLEAN"
            r9.c(r2)     // Catch:{ all -> 0x002d }
            r9.d(r3)     // Catch:{ all -> 0x002d }
            r1.p r9 = r8.f3125j     // Catch:{ all -> 0x002d }
            java.lang.String r2 = r0.f3106a     // Catch:{ all -> 0x002d }
            r9.c(r2)     // Catch:{ all -> 0x002d }
            r1.p r9 = r8.f3125j     // Catch:{ all -> 0x002d }
            long[] r2 = r0.f3107b     // Catch:{ all -> 0x002d }
            int r5 = r2.length     // Catch:{ all -> 0x002d }
        L_0x00b6:
            if (r1 >= r5) goto L_0x00c3
            r6 = r2[r1]     // Catch:{ all -> 0x002d }
            r9.d(r3)     // Catch:{ all -> 0x002d }
            r9.h(r6)     // Catch:{ all -> 0x002d }
            int r1 = r1 + 1
            goto L_0x00b6
        L_0x00c3:
            r1.p r9 = r8.f3125j     // Catch:{ all -> 0x002d }
            r9.d(r4)     // Catch:{ all -> 0x002d }
            if (r10 == 0) goto L_0x00f1
            long r9 = r8.f3133r     // Catch:{ all -> 0x002d }
            r1 = 1
            long r1 = r1 + r9
            r8.f3133r = r1     // Catch:{ all -> 0x002d }
            r0.f3111g = r9     // Catch:{ all -> 0x002d }
            goto L_0x00f1
        L_0x00d4:
            java.util.LinkedHashMap r9 = r8.f3126k     // Catch:{ all -> 0x002d }
            java.lang.String r10 = r0.f3106a     // Catch:{ all -> 0x002d }
            r9.remove(r10)     // Catch:{ all -> 0x002d }
            r1.p r9 = r8.f3125j     // Catch:{ all -> 0x002d }
            java.lang.String r10 = "REMOVE"
            r9.c(r10)     // Catch:{ all -> 0x002d }
            r9.d(r3)     // Catch:{ all -> 0x002d }
            r1.p r9 = r8.f3125j     // Catch:{ all -> 0x002d }
            java.lang.String r10 = r0.f3106a     // Catch:{ all -> 0x002d }
            r9.c(r10)     // Catch:{ all -> 0x002d }
            r1.p r9 = r8.f3125j     // Catch:{ all -> 0x002d }
            r9.d(r4)     // Catch:{ all -> 0x002d }
        L_0x00f1:
            r1.p r9 = r8.f3125j     // Catch:{ all -> 0x002d }
            r9.flush()     // Catch:{ all -> 0x002d }
            long r9 = r8.i     // Catch:{ all -> 0x002d }
            long r0 = r8.f3123g     // Catch:{ all -> 0x002d }
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0104
            boolean r9 = r8.l()     // Catch:{ all -> 0x002d }
            if (r9 == 0) goto L_0x010b
        L_0x0104:
            java.util.concurrent.ThreadPoolExecutor r9 = r8.f3134s     // Catch:{ all -> 0x002d }
            N0.B r10 = r8.f3135t     // Catch:{ all -> 0x002d }
            r9.execute(r10)     // Catch:{ all -> 0x002d }
        L_0x010b:
            monitor-exit(r8)
            return
        L_0x010d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x002d }
            r9.<init>()     // Catch:{ all -> 0x002d }
            throw r9     // Catch:{ all -> 0x002d }
        L_0x0113:
            monitor-exit(r8)     // Catch:{ all -> 0x002d }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.g.g(i1.d, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized i1.d h(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.j()     // Catch:{ all -> 0x0022 }
            r5.f()     // Catch:{ all -> 0x0022 }
            t(r6)     // Catch:{ all -> 0x0022 }
            java.util.LinkedHashMap r0 = r5.f3126k     // Catch:{ all -> 0x0022 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0022 }
            i1.e r0 = (i1.e) r0     // Catch:{ all -> 0x0022 }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0026
            if (r0 == 0) goto L_0x0024
            long r1 = r0.f3111g     // Catch:{ all -> 0x0022 }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0026
            goto L_0x0024
        L_0x0022:
            r6 = move-exception
            goto L_0x0074
        L_0x0024:
            monitor-exit(r5)
            return r3
        L_0x0026:
            if (r0 == 0) goto L_0x002e
            i1.d r7 = r0.f3110f     // Catch:{ all -> 0x0022 }
            if (r7 == 0) goto L_0x002e
            monitor-exit(r5)
            return r3
        L_0x002e:
            boolean r7 = r5.f3131p     // Catch:{ all -> 0x0022 }
            if (r7 != 0) goto L_0x006b
            boolean r7 = r5.f3132q     // Catch:{ all -> 0x0022 }
            if (r7 == 0) goto L_0x0037
            goto L_0x006b
        L_0x0037:
            r1.p r7 = r5.f3125j     // Catch:{ all -> 0x0022 }
            java.lang.String r8 = "DIRTY"
            r7.c(r8)     // Catch:{ all -> 0x0022 }
            r8 = 32
            r7.d(r8)     // Catch:{ all -> 0x0022 }
            r7.c(r6)     // Catch:{ all -> 0x0022 }
            r8 = 10
            r7.d(r8)     // Catch:{ all -> 0x0022 }
            r1.p r7 = r5.f3125j     // Catch:{ all -> 0x0022 }
            r7.flush()     // Catch:{ all -> 0x0022 }
            boolean r7 = r5.f3128m     // Catch:{ all -> 0x0022 }
            if (r7 == 0) goto L_0x0056
            monitor-exit(r5)
            return r3
        L_0x0056:
            if (r0 != 0) goto L_0x0062
            i1.e r0 = new i1.e     // Catch:{ all -> 0x0022 }
            r0.<init>(r5, r6)     // Catch:{ all -> 0x0022 }
            java.util.LinkedHashMap r7 = r5.f3126k     // Catch:{ all -> 0x0022 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0022 }
        L_0x0062:
            i1.d r6 = new i1.d     // Catch:{ all -> 0x0022 }
            r6.<init>(r5, r0)     // Catch:{ all -> 0x0022 }
            r0.f3110f = r6     // Catch:{ all -> 0x0022 }
            monitor-exit(r5)
            return r6
        L_0x006b:
            java.util.concurrent.ThreadPoolExecutor r6 = r5.f3134s     // Catch:{ all -> 0x0022 }
            N0.B r7 = r5.f3135t     // Catch:{ all -> 0x0022 }
            r6.execute(r7)     // Catch:{ all -> 0x0022 }
            monitor-exit(r5)
            return r3
        L_0x0074:
            monitor-exit(r5)     // Catch:{ all -> 0x0022 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.g.h(java.lang.String, long):i1.d");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized i1.f i(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.j()     // Catch:{ all -> 0x004a }
            r3.f()     // Catch:{ all -> 0x004a }
            t(r4)     // Catch:{ all -> 0x004a }
            java.util.LinkedHashMap r0 = r3.f3126k     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x004a }
            i1.e r0 = (i1.e) r0     // Catch:{ all -> 0x004a }
            r1 = 0
            if (r0 == 0) goto L_0x004e
            boolean r2 = r0.e     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x001a
            goto L_0x004e
        L_0x001a:
            i1.f r0 = r0.a()     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            int r1 = r3.f3127l     // Catch:{ all -> 0x004a }
            int r1 = r1 + 1
            r3.f3127l = r1     // Catch:{ all -> 0x004a }
            r1.p r1 = r3.f3125j     // Catch:{ all -> 0x004a }
            java.lang.String r2 = "READ"
            r1.c(r2)     // Catch:{ all -> 0x004a }
            r2 = 32
            r1.d(r2)     // Catch:{ all -> 0x004a }
            r1.c(r4)     // Catch:{ all -> 0x004a }
            r4 = 10
            r1.d(r4)     // Catch:{ all -> 0x004a }
            boolean r4 = r3.l()     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x004c
            java.util.concurrent.ThreadPoolExecutor r4 = r3.f3134s     // Catch:{ all -> 0x004a }
            N0.B r1 = r3.f3135t     // Catch:{ all -> 0x004a }
            r4.execute(r1)     // Catch:{ all -> 0x004a }
            goto L_0x004c
        L_0x004a:
            r4 = move-exception
            goto L_0x0050
        L_0x004c:
            monitor-exit(r3)
            return r0
        L_0x004e:
            monitor-exit(r3)
            return r1
        L_0x0050:
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.g.i(java.lang.String):i1.f");
    }

    public final synchronized boolean k() {
        return this.f3130o;
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [java.lang.Object, r1.x] */
    /* JADX WARNING: type inference failed for: r2v11, types: [java.lang.Object, r1.x] */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.getParentFile().mkdirs();
        r0 = r1.o.f4594a;
        r3 = new r1.a((r1.x) new java.lang.Object(), (java.io.OutputStream) new java.io.FileOutputStream(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a1, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fc, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void q() {
        /*
            r9 = this;
            monitor-enter(r9)
            r1.p r0 = r9.f3125j     // Catch:{ all -> 0x0009 }
            if (r0 == 0) goto L_0x000c
            r0.close()     // Catch:{ all -> 0x0009 }
            goto L_0x000c
        L_0x0009:
            r0 = move-exception
            goto L_0x00fd
        L_0x000c:
            n1.a r0 = r9.f3118a     // Catch:{ all -> 0x0009 }
            java.io.File r1 = r9.f3121d     // Catch:{ all -> 0x0009 }
            r0.getClass()     // Catch:{ all -> 0x0009 }
            java.util.logging.Logger r0 = r1.o.f4594a     // Catch:{ FileNotFoundException -> 0x002f }
            if (r1 == 0) goto L_0x0027
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x002f }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x002f }
            r1.x r2 = new r1.x     // Catch:{ FileNotFoundException -> 0x002f }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x002f }
            r1.a r3 = new r1.a     // Catch:{ FileNotFoundException -> 0x002f }
            r3.<init>((r1.x) r2, (java.io.OutputStream) r0)     // Catch:{ FileNotFoundException -> 0x002f }
            goto L_0x0047
        L_0x0027:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ FileNotFoundException -> 0x002f }
            java.lang.String r2 = "file == null"
            r0.<init>(r2)     // Catch:{ FileNotFoundException -> 0x002f }
            throw r0     // Catch:{ FileNotFoundException -> 0x002f }
        L_0x002f:
            java.io.File r0 = r1.getParentFile()     // Catch:{ all -> 0x0009 }
            r0.mkdirs()     // Catch:{ all -> 0x0009 }
            java.util.logging.Logger r0 = r1.o.f4594a     // Catch:{ all -> 0x0009 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x0009 }
            r0.<init>(r1)     // Catch:{ all -> 0x0009 }
            r1.x r1 = new r1.x     // Catch:{ all -> 0x0009 }
            r1.<init>()     // Catch:{ all -> 0x0009 }
            r1.a r3 = new r1.a     // Catch:{ all -> 0x0009 }
            r3.<init>((r1.x) r1, (java.io.OutputStream) r0)     // Catch:{ all -> 0x0009 }
        L_0x0047:
            r1.p r0 = new r1.p     // Catch:{ all -> 0x0009 }
            r0.<init>(r3)     // Catch:{ all -> 0x0009 }
            java.lang.String r1 = "libcore.io.DiskLruCache"
            r0.c(r1)     // Catch:{ all -> 0x00a1 }
            r1 = 10
            r0.d(r1)     // Catch:{ all -> 0x00a1 }
            java.lang.String r2 = "1"
            r0.c(r2)     // Catch:{ all -> 0x00a1 }
            r0.d(r1)     // Catch:{ all -> 0x00a1 }
            int r2 = r9.f3122f     // Catch:{ all -> 0x00a1 }
            long r2 = (long) r2     // Catch:{ all -> 0x00a1 }
            r0.h(r2)     // Catch:{ all -> 0x00a1 }
            r0.d(r1)     // Catch:{ all -> 0x00a1 }
            int r2 = r9.f3124h     // Catch:{ all -> 0x00a1 }
            long r2 = (long) r2     // Catch:{ all -> 0x00a1 }
            r0.h(r2)     // Catch:{ all -> 0x00a1 }
            r0.d(r1)     // Catch:{ all -> 0x00a1 }
            r0.d(r1)     // Catch:{ all -> 0x00a1 }
            java.util.LinkedHashMap r2 = r9.f3126k     // Catch:{ all -> 0x00a1 }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x00a1 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00a1 }
        L_0x007d:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00a1 }
            r4 = 0
            if (r3 == 0) goto L_0x00c4
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00a1 }
            i1.e r3 = (i1.e) r3     // Catch:{ all -> 0x00a1 }
            i1.d r5 = r3.f3110f     // Catch:{ all -> 0x00a1 }
            r6 = 32
            if (r5 == 0) goto L_0x00a3
            java.lang.String r4 = "DIRTY"
            r0.c(r4)     // Catch:{ all -> 0x00a1 }
            r0.d(r6)     // Catch:{ all -> 0x00a1 }
            java.lang.String r3 = r3.f3106a     // Catch:{ all -> 0x00a1 }
            r0.c(r3)     // Catch:{ all -> 0x00a1 }
            r0.d(r1)     // Catch:{ all -> 0x00a1 }
            goto L_0x007d
        L_0x00a1:
            r1 = move-exception
            goto L_0x00f9
        L_0x00a3:
            java.lang.String r5 = "CLEAN"
            r0.c(r5)     // Catch:{ all -> 0x00a1 }
            r0.d(r6)     // Catch:{ all -> 0x00a1 }
            java.lang.String r5 = r3.f3106a     // Catch:{ all -> 0x00a1 }
            r0.c(r5)     // Catch:{ all -> 0x00a1 }
            long[] r3 = r3.f3107b     // Catch:{ all -> 0x00a1 }
            int r5 = r3.length     // Catch:{ all -> 0x00a1 }
        L_0x00b3:
            if (r4 >= r5) goto L_0x00c0
            r7 = r3[r4]     // Catch:{ all -> 0x00a1 }
            r0.d(r6)     // Catch:{ all -> 0x00a1 }
            r0.h(r7)     // Catch:{ all -> 0x00a1 }
            int r4 = r4 + 1
            goto L_0x00b3
        L_0x00c0:
            r0.d(r1)     // Catch:{ all -> 0x00a1 }
            goto L_0x007d
        L_0x00c4:
            r0.close()     // Catch:{ all -> 0x0009 }
            n1.a r0 = r9.f3118a     // Catch:{ all -> 0x0009 }
            java.io.File r1 = r9.f3120c     // Catch:{ all -> 0x0009 }
            r0.getClass()     // Catch:{ all -> 0x0009 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x0009 }
            if (r0 == 0) goto L_0x00dd
            n1.a r0 = r9.f3118a     // Catch:{ all -> 0x0009 }
            java.io.File r1 = r9.f3120c     // Catch:{ all -> 0x0009 }
            java.io.File r2 = r9.e     // Catch:{ all -> 0x0009 }
            r0.c(r1, r2)     // Catch:{ all -> 0x0009 }
        L_0x00dd:
            n1.a r0 = r9.f3118a     // Catch:{ all -> 0x0009 }
            java.io.File r1 = r9.f3121d     // Catch:{ all -> 0x0009 }
            java.io.File r2 = r9.f3120c     // Catch:{ all -> 0x0009 }
            r0.c(r1, r2)     // Catch:{ all -> 0x0009 }
            n1.a r0 = r9.f3118a     // Catch:{ all -> 0x0009 }
            java.io.File r1 = r9.e     // Catch:{ all -> 0x0009 }
            r0.a(r1)     // Catch:{ all -> 0x0009 }
            r1.p r0 = r9.m()     // Catch:{ all -> 0x0009 }
            r9.f3125j = r0     // Catch:{ all -> 0x0009 }
            r9.f3128m = r4     // Catch:{ all -> 0x0009 }
            r9.f3132q = r4     // Catch:{ all -> 0x0009 }
            monitor-exit(r9)
            return
        L_0x00f9:
            r0.close()     // Catch:{ all -> 0x0009 }
            throw r1     // Catch:{ all -> 0x0009 }
        L_0x00fd:
            monitor-exit(r9)     // Catch:{ all -> 0x0009 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.g.q():void");
    }

    public g(File file, long j2, ThreadPoolExecutor threadPoolExecutor) {
        a aVar = a.f4033a;
        this.f3118a = aVar;
        this.f3119b = file;
        this.f3122f = 201105;
        this.f3120c = new File(file, "journal");
        this.f3121d = new File(file, "journal.tmp");
        this.e = new File(file, "journal.bkp");
        this.f3124h = 2;
        this.f3123g = j2;
        this.f3134s = threadPoolExecutor;
    }

    public static void t(String str) {
        if (!f3117u.matcher(str).matches()) {
            throw new IllegalArgumentException(E.g("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    public final synchronized void j() {
        try {
            if (!this.f3129n) {
                a aVar = this.f3118a;
                File file = this.e;
                aVar.getClass();
                if (file.exists()) {
                    a aVar2 = this.f3118a;
                    File file2 = this.f3120c;
                    aVar2.getClass();
                    if (file2.exists()) {
                        this.f3118a.a(this.e);
                    } else {
                        this.f3118a.c(this.e, this.f3120c);
                    }
                }
                a aVar3 = this.f3118a;
                File file3 = this.f3120c;
                aVar3.getClass();
                if (file3.exists()) {
                    o();
                    n();
                    this.f3129n = true;
                    return;
                }
                q();
                this.f3129n = true;
            }
        } catch (IOException e2) {
            o1.g gVar = o1.g.f4433a;
            gVar.k(5, "DiskLruCache " + this.f3119b + " is corrupt: " + e2.getMessage() + ", removing", e2);
            close();
            this.f3118a.b(this.f3119b);
            this.f3130o = false;
        } catch (Throwable th) {
            this.f3130o = false;
            throw th;
        }
    }

    public final boolean l() {
        int i2 = this.f3127l;
        if (i2 < 2000 || i2 < this.f3126k.size()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, r1.x] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, r1.x] */
    public final p m() {
        r1.a aVar;
        File file = this.f3120c;
        this.f3118a.getClass();
        try {
            Logger logger = o.f4594a;
            if (file != null) {
                aVar = new r1.a((x) new Object(), (OutputStream) new FileOutputStream(file, true));
                return new p(new c(this, aVar, 0));
            }
            throw new IllegalArgumentException("file == null");
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = o.f4594a;
            aVar = new r1.a((x) new Object(), (OutputStream) new FileOutputStream(file, true));
        }
    }

    public final void n() {
        File file = this.f3121d;
        a aVar = this.f3118a;
        aVar.a(file);
        Iterator it2 = this.f3126k.values().iterator();
        while (it2.hasNext()) {
            e eVar = (e) it2.next();
            d dVar = eVar.f3110f;
            int i2 = this.f3124h;
            int i3 = 0;
            if (dVar == null) {
                while (i3 < i2) {
                    this.i += eVar.f3107b[i3];
                    i3++;
                }
            } else {
                eVar.f3110f = null;
                while (i3 < i2) {
                    aVar.a(eVar.f3108c[i3]);
                    aVar.a(eVar.f3109d[i3]);
                    i3++;
                }
                it2.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:19|20|(1:22)(1:23)|24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r11.f3127l = r0 - r11.f3126k.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0080, code lost:
        if (r3.f() == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0082, code lost:
        q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0086, code lost:
        r11.f3125j = m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008f, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0073 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:26:0x0090=Splitter:B:26:0x0090, B:19:0x0073=Splitter:B:19:0x0073} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o() {
        /*
            r11 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            java.io.File r2 = r11.f3120c
            n1.a r3 = r11.f3118a
            r3.getClass()
            java.util.logging.Logger r3 = r1.o.f4594a
            if (r2 == 0) goto L_0x00bd
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r2)
            r1.b r2 = r1.o.b(r3)
            r1.q r3 = new r1.q
            r3.<init>(r2)
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r2 = r3.n(r4)     // Catch:{ all -> 0x0071 }
            java.lang.String r6 = r3.n(r4)     // Catch:{ all -> 0x0071 }
            java.lang.String r7 = r3.n(r4)     // Catch:{ all -> 0x0071 }
            java.lang.String r8 = r3.n(r4)     // Catch:{ all -> 0x0071 }
            java.lang.String r9 = r3.n(r4)     // Catch:{ all -> 0x0071 }
            java.lang.String r10 = "libcore.io.DiskLruCache"
            boolean r10 = r10.equals(r2)     // Catch:{ all -> 0x0071 }
            if (r10 == 0) goto L_0x0090
            java.lang.String r10 = "1"
            boolean r10 = r10.equals(r6)     // Catch:{ all -> 0x0071 }
            if (r10 == 0) goto L_0x0090
            int r10 = r11.f3122f     // Catch:{ all -> 0x0071 }
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch:{ all -> 0x0071 }
            boolean r7 = r10.equals(r7)     // Catch:{ all -> 0x0071 }
            if (r7 == 0) goto L_0x0090
            int r7 = r11.f3124h     // Catch:{ all -> 0x0071 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x0071 }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0071 }
            if (r7 == 0) goto L_0x0090
            java.lang.String r7 = ""
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x0071 }
            if (r7 == 0) goto L_0x0090
            r0 = 0
        L_0x0067:
            java.lang.String r1 = r3.n(r4)     // Catch:{ EOFException -> 0x0073 }
            r11.p(r1)     // Catch:{ EOFException -> 0x0073 }
            int r0 = r0 + 1
            goto L_0x0067
        L_0x0071:
            r0 = move-exception
            goto L_0x00b9
        L_0x0073:
            java.util.LinkedHashMap r1 = r11.f3126k     // Catch:{ all -> 0x0071 }
            int r1 = r1.size()     // Catch:{ all -> 0x0071 }
            int r0 = r0 - r1
            r11.f3127l = r0     // Catch:{ all -> 0x0071 }
            boolean r0 = r3.f()     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x0086
            r11.q()     // Catch:{ all -> 0x0071 }
            goto L_0x008c
        L_0x0086:
            r1.p r0 = r11.m()     // Catch:{ all -> 0x0071 }
            r11.f3125j = r0     // Catch:{ all -> 0x0071 }
        L_0x008c:
            h1.c.c(r3)
            return
        L_0x0090:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0071 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r5.<init>(r1)     // Catch:{ all -> 0x0071 }
            r5.append(r2)     // Catch:{ all -> 0x0071 }
            r5.append(r0)     // Catch:{ all -> 0x0071 }
            r5.append(r6)     // Catch:{ all -> 0x0071 }
            r5.append(r0)     // Catch:{ all -> 0x0071 }
            r5.append(r8)     // Catch:{ all -> 0x0071 }
            r5.append(r0)     // Catch:{ all -> 0x0071 }
            r5.append(r9)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = "]"
            r5.append(r0)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0071 }
            r4.<init>(r0)     // Catch:{ all -> 0x0071 }
            throw r4     // Catch:{ all -> 0x0071 }
        L_0x00b9:
            h1.c.c(r3)
            throw r0
        L_0x00bd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "file == null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.g.o():void");
    }

    public final void p(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i2 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i2);
            LinkedHashMap linkedHashMap = this.f3126k;
            if (indexOf2 == -1) {
                str2 = str.substring(i2);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    linkedHashMap.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i2, indexOf2);
            }
            e eVar = (e) linkedHashMap.get(str2);
            if (eVar == null) {
                eVar = new e(this, str2);
                linkedHashMap.put(str2, eVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                eVar.e = true;
                eVar.f3110f = null;
                if (split.length == eVar.f3112h.f3124h) {
                    int i3 = 0;
                    while (i3 < split.length) {
                        try {
                            eVar.f3107b[i3] = Long.parseLong(split[i3]);
                            i3++;
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                eVar.f3110f = new d(this, eVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        } else {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    public final void r(e eVar) {
        d dVar = eVar.f3110f;
        if (dVar != null) {
            dVar.c();
        }
        for (int i2 = 0; i2 < this.f3124h; i2++) {
            this.f3118a.a(eVar.f3108c[i2]);
            long j2 = this.i;
            long[] jArr = eVar.f3107b;
            this.i = j2 - jArr[i2];
            jArr[i2] = 0;
        }
        this.f3127l++;
        p pVar = this.f3125j;
        pVar.c("REMOVE");
        pVar.d(32);
        String str = eVar.f3106a;
        pVar.c(str);
        pVar.d(10);
        this.f3126k.remove(str);
        if (l()) {
            this.f3134s.execute(this.f3135t);
        }
    }

    public final void s() {
        while (this.i > this.f3123g) {
            r((e) this.f3126k.values().iterator().next());
        }
        this.f3131p = false;
    }
}
