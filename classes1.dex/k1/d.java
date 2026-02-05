package k1;

import g1.C;
import g1.s;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f3573a = 0;

    static {
        Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");
    }

    public static long a(C c2) {
        String a2 = c2.f2650f.a("Content-Length");
        if (a2 == null) {
            return -1;
        }
        try {
            return Long.parseLong(a2);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static boolean b(C c2) {
        if (c2.f2646a.f2633b.equals("HEAD")) {
            return false;
        }
        int i = c2.f2648c;
        if (((i >= 100 && i < 200) || i == 204 || i == 304) && a(c2) == -1 && !"chunked".equalsIgnoreCase(c2.g("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01ee, code lost:
        if (h1.c.f3091g.matcher(r0).matches() == false) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x021f, code lost:
        if (r12 != false) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0221, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0235, code lost:
        if (r12 == false) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006d, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0324, code lost:
        if (r0 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009d, code lost:
        r3 = r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x030a A[LOOP:9: B:202:0x0307->B:204:0x030a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0389  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(g1.C0103b r32, g1.u r33, g1.s r34) {
        /*
            r1 = r33
            g1.b r0 = g1.C0103b.f2678b
            r3 = r32
            if (r3 != r0) goto L_0x0009
            return
        L_0x0009:
            java.util.regex.Pattern r0 = g1.q.f2751j
            java.lang.String r0 = "Set-Cookie"
            r4 = r34
            java.util.List r4 = r4.f(r0)
            int r5 = r4.size()
            r6 = 0
            r8 = 0
            r9 = 0
        L_0x001a:
            if (r8 >= r5) goto L_0x039e
            java.lang.Object r0 = r4.get(r8)
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            long r11 = java.lang.System.currentTimeMillis()
            int r13 = r10.length()
            r14 = 59
            int r0 = h1.c.g(r10, r6, r13, r14)
            r15 = 61
            int r7 = h1.c.g(r10, r6, r0, r15)
            if (r7 != r0) goto L_0x0041
        L_0x0039:
            r16 = r4
            r28 = r5
        L_0x003d:
            r0 = 0
            r5 = 0
            goto L_0x0385
        L_0x0041:
            int r15 = h1.c.q(r10, r6, r7)
            int r6 = h1.c.r(r10, r15, r7)
            java.lang.String r6 = r10.substring(r15, r6)
            boolean r15 = r6.isEmpty()
            if (r15 != 0) goto L_0x0074
            int r15 = r6.length()
            r14 = 0
        L_0x0058:
            if (r14 >= r15) goto L_0x006f
            char r2 = r6.charAt(r14)
            r3 = 31
            if (r2 <= r3) goto L_0x0066
            r3 = 127(0x7f, float:1.78E-43)
            if (r2 < r3) goto L_0x0068
        L_0x0066:
            r2 = 1
            goto L_0x006d
        L_0x0068:
            r2 = 1
            int r14 = r14 + r2
            r3 = r32
            goto L_0x0058
        L_0x006d:
            r3 = -1
            goto L_0x0072
        L_0x006f:
            r2 = 1
            r3 = -1
            r14 = -1
        L_0x0072:
            if (r14 == r3) goto L_0x0078
        L_0x0074:
            r16 = r4
            goto L_0x0381
        L_0x0078:
            int r7 = r7 + r2
            int r2 = h1.c.q(r10, r7, r0)
            int r3 = h1.c.r(r10, r2, r0)
            java.lang.String r2 = r10.substring(r2, r3)
            int r3 = r2.length()
            r7 = 0
        L_0x008a:
            if (r7 >= r3) goto L_0x00a0
            char r14 = r2.charAt(r7)
            r15 = 31
            if (r14 <= r15) goto L_0x0098
            r15 = 127(0x7f, float:1.78E-43)
            if (r14 < r15) goto L_0x009a
        L_0x0098:
            r14 = 1
            goto L_0x009d
        L_0x009a:
            r14 = 1
            int r7 = r7 + r14
            goto L_0x008a
        L_0x009d:
            r3 = r7
        L_0x009e:
            r7 = -1
            goto L_0x00a3
        L_0x00a0:
            r14 = 1
            r3 = -1
            goto L_0x009e
        L_0x00a3:
            if (r3 == r7) goto L_0x00a6
            goto L_0x0039
        L_0x00a6:
            int r0 = r0 + r14
            r18 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r22 = r18
            r3 = 0
            r7 = 0
            r20 = -1
            r24 = 0
            r25 = 0
            r26 = 1
            r27 = 0
        L_0x00ba:
            r28 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r30 = -9223372036854775808
            if (r0 >= r13) goto L_0x018f
            r14 = 59
            int r15 = h1.c.g(r10, r0, r13, r14)
            r16 = r4
            r14 = 61
            int r4 = h1.c.g(r10, r0, r15, r14)
            int r0 = h1.c.q(r10, r0, r4)
            int r14 = h1.c.r(r10, r0, r4)
            java.lang.String r0 = r10.substring(r0, r14)
            if (r4 >= r15) goto L_0x00ee
            r14 = 1
            int r4 = r4 + r14
            int r4 = h1.c.q(r10, r4, r15)
            int r14 = h1.c.r(r10, r4, r15)
            java.lang.String r4 = r10.substring(r4, r14)
            goto L_0x00f0
        L_0x00ee:
            java.lang.String r4 = ""
        L_0x00f0:
            java.lang.String r14 = "expires"
            boolean r14 = r0.equalsIgnoreCase(r14)
            if (r14 == 0) goto L_0x0105
            int r0 = r4.length()     // Catch:{ IllegalArgumentException -> 0x0170 }
            long r22 = g1.q.b(r4, r0)     // Catch:{ IllegalArgumentException -> 0x0170 }
        L_0x0100:
            r4 = 1
            r27 = 1
            goto L_0x0189
        L_0x0105:
            java.lang.String r14 = "max-age"
            boolean r14 = r0.equalsIgnoreCase(r14)
            if (r14 == 0) goto L_0x0135
            long r20 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x011d }
            r28 = 0
            int r0 = (r20 > r28 ? 1 : (r20 == r28 ? 0 : -1))
            if (r0 > 0) goto L_0x0118
            goto L_0x011a
        L_0x0118:
            r30 = r20
        L_0x011a:
            r20 = r30
            goto L_0x0100
        L_0x011d:
            r0 = move-exception
            r14 = r0
            java.lang.String r0 = "-?\\d+"
            boolean r0 = r4.matches(r0)     // Catch:{  }
            if (r0 == 0) goto L_0x0134
            java.lang.String r0 = "-"
            boolean r0 = r4.startsWith(r0)     // Catch:{  }
            if (r0 == 0) goto L_0x0131
            r28 = r30
        L_0x0131:
            r20 = r28
            goto L_0x0100
        L_0x0134:
            throw r14     // Catch:{  }
        L_0x0135:
            java.lang.String r14 = "domain"
            boolean r14 = r0.equalsIgnoreCase(r14)
            if (r14 == 0) goto L_0x0167
            java.lang.String r0 = "."
            boolean r14 = r4.endsWith(r0)     // Catch:{ IllegalArgumentException -> 0x0170 }
            if (r14 != 0) goto L_0x0161
            boolean r0 = r4.startsWith(r0)     // Catch:{ IllegalArgumentException -> 0x0170 }
            if (r0 == 0) goto L_0x0150
            r14 = 1
            java.lang.String r4 = r4.substring(r14)     // Catch:{ IllegalArgumentException -> 0x0170 }
        L_0x0150:
            java.lang.String r0 = h1.c.b(r4)     // Catch:{ IllegalArgumentException -> 0x0170 }
            if (r0 == 0) goto L_0x015b
            r3 = r0
            r4 = 1
            r26 = 0
            goto L_0x0189
        L_0x015b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0170 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x0170 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0170 }
        L_0x0161:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0170 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x0170 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0170 }
        L_0x0167:
            java.lang.String r14 = "path"
            boolean r14 = r0.equalsIgnoreCase(r14)
            if (r14 == 0) goto L_0x0172
            r7 = r4
        L_0x0170:
            r4 = 1
            goto L_0x0189
        L_0x0172:
            java.lang.String r4 = "secure"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x017e
            r4 = 1
            r24 = 1
            goto L_0x0189
        L_0x017e:
            java.lang.String r4 = "httponly"
            boolean r0 = r0.equalsIgnoreCase(r4)
            if (r0 == 0) goto L_0x0170
            r4 = 1
            r25 = 1
        L_0x0189:
            int r0 = r15 + 1
            r4 = r16
            goto L_0x00ba
        L_0x018f:
            r16 = r4
            int r0 = (r20 > r30 ? 1 : (r20 == r30 ? 0 : -1))
            if (r0 != 0) goto L_0x0198
            r20 = r30
            goto L_0x01be
        L_0x0198:
            r13 = -1
            int r0 = (r20 > r13 ? 1 : (r20 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x01bc
            r13 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r0 = (r20 > r13 ? 1 : (r20 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x01ab
            r13 = 1000(0x3e8, double:4.94E-321)
            long r28 = r20 * r13
        L_0x01ab:
            long r28 = r11 + r28
            int r0 = (r28 > r11 ? 1 : (r28 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x01b9
            int r0 = (r28 > r18 ? 1 : (r28 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x01b6
            goto L_0x01b9
        L_0x01b6:
            r20 = r28
            goto L_0x01be
        L_0x01b9:
            r20 = r18
            goto L_0x01be
        L_0x01bc:
            r20 = r22
        L_0x01be:
            java.lang.String r0 = r1.f2777d
            r4 = 46
            if (r3 != 0) goto L_0x01c6
            r3 = r0
            goto L_0x01f0
        L_0x01c6:
            boolean r10 = r0.equals(r3)
            if (r10 == 0) goto L_0x01cd
            goto L_0x01f0
        L_0x01cd:
            boolean r10 = r0.endsWith(r3)
            if (r10 == 0) goto L_0x0381
            int r10 = r0.length()
            int r11 = r3.length()
            int r10 = r10 - r11
            r11 = 1
            int r10 = r10 - r11
            char r10 = r0.charAt(r10)
            if (r10 != r4) goto L_0x0381
            java.util.regex.Pattern r10 = h1.c.f3091g
            java.util.regex.Matcher r10 = r10.matcher(r0)
            boolean r10 = r10.matches()
            if (r10 != 0) goto L_0x0381
        L_0x01f0:
            int r0 = r0.length()
            int r10 = r3.length()
            if (r0 == r10) goto L_0x0334
            p1.a r10 = p1.a.f4463h
            r10.getClass()
            java.lang.String r0 = java.net.IDN.toUnicode(r3)
            java.lang.String r11 = "\\."
            java.lang.String[] r11 = r0.split(r11)
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.f4464a
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0244
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.f4464a
            r12 = 0
            r13 = 1
            boolean r0 = r0.compareAndSet(r12, r13)
            if (r0 == 0) goto L_0x0244
            r12 = 0
        L_0x021c:
            r10.b()     // Catch:{ InterruptedIOException -> 0x0242, IOException -> 0x022b }
            if (r12 == 0) goto L_0x0249
        L_0x0221:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x0249
        L_0x0229:
            r0 = move-exception
            goto L_0x0238
        L_0x022b:
            r0 = move-exception
            r13 = r0
            o1.g r0 = o1.g.f4433a     // Catch:{ all -> 0x0229 }
            java.lang.String r14 = "Failed to read public suffix list"
            r15 = 5
            r0.k(r15, r14, r13)     // Catch:{ all -> 0x0229 }
            if (r12 == 0) goto L_0x0249
            goto L_0x0221
        L_0x0238:
            if (r12 == 0) goto L_0x0241
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x0241:
            throw r0
        L_0x0242:
            r12 = 1
            goto L_0x021c
        L_0x0244:
            java.util.concurrent.CountDownLatch r0 = r10.f4465b     // Catch:{ InterruptedException -> 0x0249 }
            r0.await()     // Catch:{ InterruptedException -> 0x0249 }
        L_0x0249:
            monitor-enter(r10)
            byte[] r0 = r10.f4466c     // Catch:{ all -> 0x0328 }
            if (r0 == 0) goto L_0x032a
            monitor-exit(r10)     // Catch:{ all -> 0x0328 }
            int r0 = r11.length
            byte[][] r12 = new byte[r0][]
            r13 = 0
        L_0x0253:
            int r14 = r11.length
            if (r13 >= r14) goto L_0x0263
            r14 = r11[r13]
            java.nio.charset.Charset r15 = h1.c.f3089d
            byte[] r14 = r14.getBytes(r15)
            r12[r13] = r14
            r14 = 1
            int r13 = r13 + r14
            goto L_0x0253
        L_0x0263:
            r14 = 1
            r13 = 0
        L_0x0265:
            if (r13 >= r0) goto L_0x0272
            byte[] r15 = r10.f4466c
            java.lang.String r15 = p1.a.a(r15, r12, r13)
            if (r15 == 0) goto L_0x0270
            goto L_0x0273
        L_0x0270:
            int r13 = r13 + r14
            goto L_0x0265
        L_0x0272:
            r15 = 0
        L_0x0273:
            if (r0 <= r14) goto L_0x0291
            java.lang.Object r13 = r12.clone()
            byte[][] r13 = (byte[][]) r13
            r28 = r5
            r4 = 0
        L_0x027e:
            int r5 = r13.length
            int r5 = r5 - r14
            if (r4 >= r5) goto L_0x0293
            byte[] r5 = p1.a.e
            r13[r4] = r5
            byte[] r5 = r10.f4466c
            java.lang.String r5 = p1.a.a(r5, r13, r4)
            if (r5 == 0) goto L_0x028f
            goto L_0x0294
        L_0x028f:
            int r4 = r4 + r14
            goto L_0x027e
        L_0x0291:
            r28 = r5
        L_0x0293:
            r5 = 0
        L_0x0294:
            if (r5 == 0) goto L_0x02a6
            r4 = 0
        L_0x0297:
            int r13 = r0 + -1
            if (r4 >= r13) goto L_0x02a6
            byte[] r13 = r10.f4467d
            java.lang.String r13 = p1.a.a(r13, r12, r4)
            if (r13 == 0) goto L_0x02a4
            goto L_0x02a7
        L_0x02a4:
            int r4 = r4 + r14
            goto L_0x0297
        L_0x02a6:
            r13 = 0
        L_0x02a7:
            if (r13 == 0) goto L_0x02b6
            java.lang.String r0 = "!"
            java.lang.String r0 = r0.concat(r13)
            java.lang.String r4 = "\\."
            java.lang.String[] r0 = r0.split(r4)
            goto L_0x02d9
        L_0x02b6:
            if (r15 != 0) goto L_0x02bd
            if (r5 != 0) goto L_0x02bd
            java.lang.String[] r0 = p1.a.f4462g
            goto L_0x02d9
        L_0x02bd:
            if (r15 == 0) goto L_0x02c6
            java.lang.String r0 = "\\."
            java.lang.String[] r0 = r15.split(r0)
            goto L_0x02c8
        L_0x02c6:
            java.lang.String[] r0 = p1.a.f4461f
        L_0x02c8:
            if (r5 == 0) goto L_0x02d1
            java.lang.String r4 = "\\."
            java.lang.String[] r4 = r5.split(r4)
            goto L_0x02d3
        L_0x02d1:
            java.lang.String[] r4 = p1.a.f4461f
        L_0x02d3:
            int r5 = r0.length
            int r10 = r4.length
            if (r5 <= r10) goto L_0x02d8
            goto L_0x02d9
        L_0x02d8:
            r0 = r4
        L_0x02d9:
            int r4 = r11.length
            int r5 = r0.length
            r10 = 33
            if (r4 != r5) goto L_0x02ea
            r4 = 0
            r5 = r0[r4]
            char r5 = r5.charAt(r4)
            if (r5 == r10) goto L_0x02eb
            r0 = 0
            goto L_0x0324
        L_0x02ea:
            r4 = 0
        L_0x02eb:
            r5 = r0[r4]
            char r5 = r5.charAt(r4)
            if (r5 != r10) goto L_0x02f7
            int r4 = r11.length
            int r0 = r0.length
        L_0x02f5:
            int r4 = r4 - r0
            goto L_0x02fc
        L_0x02f7:
            int r4 = r11.length
            int r0 = r0.length
            r5 = 1
            int r0 = r0 + r5
            goto L_0x02f5
        L_0x02fc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "\\."
            java.lang.String[] r5 = r3.split(r5)
        L_0x0307:
            int r10 = r5.length
            if (r4 >= r10) goto L_0x0317
            r10 = r5[r4]
            r0.append(r10)
            r10 = 46
            r0.append(r10)
            r11 = 1
            int r4 = r4 + r11
            goto L_0x0307
        L_0x0317:
            r11 = 1
            int r4 = r0.length()
            int r4 = r4 - r11
            r0.deleteCharAt(r4)
            java.lang.String r0 = r0.toString()
        L_0x0324:
            if (r0 != 0) goto L_0x0336
            goto L_0x003d
        L_0x0328:
            r0 = move-exception
            goto L_0x0332
        L_0x032a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0328 }
            java.lang.String r1 = "Unable to load publicsuffixes.gz resource from the classpath."
            r0.<init>(r1)     // Catch:{ all -> 0x0328 }
            throw r0     // Catch:{ all -> 0x0328 }
        L_0x0332:
            monitor-exit(r10)     // Catch:{ all -> 0x0328 }
            throw r0
        L_0x0334:
            r28 = r5
        L_0x0336:
            if (r7 == 0) goto L_0x0345
            java.lang.String r0 = "/"
            boolean r0 = r7.startsWith(r0)
            if (r0 != 0) goto L_0x0341
            goto L_0x0345
        L_0x0341:
            r23 = r7
            r5 = 0
            goto L_0x0373
        L_0x0345:
            java.lang.String r0 = r1.f2774a
            int r0 = r0.length()
            int r0 = r0 + 3
            java.lang.String r4 = r1.f2780h
            r5 = 47
            int r0 = r4.indexOf(r5, r0)
            int r7 = r4.length()
            java.lang.String r10 = "?#"
            int r7 = h1.c.h(r4, r0, r7, r10)
            java.lang.String r0 = r4.substring(r0, r7)
            int r4 = r0.lastIndexOf(r5)
            r5 = 0
            if (r4 == 0) goto L_0x036f
            java.lang.String r0 = r0.substring(r5, r4)
            goto L_0x0371
        L_0x036f:
            java.lang.String r0 = "/"
        L_0x0371:
            r23 = r0
        L_0x0373:
            g1.q r0 = new g1.q
            r17 = r0
            r18 = r6
            r19 = r2
            r22 = r3
            r17.<init>(r18, r19, r20, r22, r23, r24, r25, r26, r27)
            goto L_0x0385
        L_0x0381:
            r28 = r5
            r5 = 0
            r0 = 0
        L_0x0385:
            if (r0 != 0) goto L_0x0389
        L_0x0387:
            r2 = 1
            goto L_0x0394
        L_0x0389:
            if (r9 != 0) goto L_0x0390
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x0390:
            r9.add(r0)
            goto L_0x0387
        L_0x0394:
            int r8 = r8 + r2
            r6 = 0
            r3 = r32
            r4 = r16
            r5 = r28
            goto L_0x001a
        L_0x039e:
            if (r9 == 0) goto L_0x03a5
            java.util.List r0 = java.util.Collections.unmodifiableList(r9)
            goto L_0x03a9
        L_0x03a5:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x03a9:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x03b0
            return
        L_0x03b0:
            r32.getClass()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.d.d(g1.b, g1.u, g1.s):void");
    }

    public static int c(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static int e(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static Set f(s sVar) {
        Set emptySet = Collections.emptySet();
        int d2 = sVar.d();
        for (int i = 0; i < d2; i++) {
            if ("Vary".equalsIgnoreCase(sVar.b(i))) {
                String e = sVar.e(i);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                for (String trim : e.split(",")) {
                    emptySet.add(trim.trim());
                }
            }
        }
        return emptySet;
    }
}
