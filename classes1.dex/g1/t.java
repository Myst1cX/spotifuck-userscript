package g1;

import java.util.ArrayList;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public String f2767a;

    /* renamed from: b  reason: collision with root package name */
    public String f2768b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f2769c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f2770d;
    public int e = -1;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f2771f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f2772g;

    /* renamed from: h  reason: collision with root package name */
    public String f2773h;

    public final u a() {
        if (this.f2767a == null) {
            throw new IllegalStateException("scheme == null");
        } else if (this.f2770d != null) {
            return new u(this);
        } else {
            throw new IllegalStateException("host == null");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x020d, code lost:
        if (r1 <= 65535) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        if (r7 == ':') goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0234 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x01e6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(g1.u r26, java.lang.String r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r9 = r27
            int r2 = r27.length()
            r10 = 0
            int r8 = h1.c.q(r9, r10, r2)
            int r2 = r27.length()
            int r11 = h1.c.r(r9, r8, r2)
            int r2 = r11 - r8
            r12 = 2
            r13 = 58
            r14 = -1
            if (r2 >= r12) goto L_0x0021
        L_0x001f:
            r2 = -1
            goto L_0x0061
        L_0x0021:
            char r2 = r9.charAt(r8)
            r3 = 90
            r4 = 65
            r5 = 122(0x7a, float:1.71E-43)
            r6 = 97
            if (r2 < r6) goto L_0x0031
            if (r2 <= r5) goto L_0x0036
        L_0x0031:
            if (r2 < r4) goto L_0x001f
            if (r2 <= r3) goto L_0x0036
            goto L_0x001f
        L_0x0036:
            int r2 = r8 + 1
        L_0x0038:
            if (r2 >= r11) goto L_0x001f
            char r7 = r9.charAt(r2)
            if (r7 < r6) goto L_0x0042
            if (r7 <= r5) goto L_0x005e
        L_0x0042:
            if (r7 < r4) goto L_0x0046
            if (r7 <= r3) goto L_0x005e
        L_0x0046:
            r15 = 48
            if (r7 < r15) goto L_0x004e
            r15 = 57
            if (r7 <= r15) goto L_0x005e
        L_0x004e:
            r15 = 43
            if (r7 == r15) goto L_0x005e
            r15 = 45
            if (r7 == r15) goto L_0x005e
            r15 = 46
            if (r7 != r15) goto L_0x005b
            goto L_0x005e
        L_0x005b:
            if (r7 != r13) goto L_0x001f
            goto L_0x0061
        L_0x005e:
            int r2 = r2 + 1
            goto L_0x0038
        L_0x0061:
            if (r2 == r14) goto L_0x008f
            r3 = 1
            java.lang.String r5 = "https:"
            r6 = 0
            r7 = 6
            r2 = r27
            r4 = r8
            boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x0078
            java.lang.String r2 = "https"
            r0.f2767a = r2
            int r8 = r8 + 6
            goto L_0x0095
        L_0x0078:
            r3 = 1
            java.lang.String r5 = "http:"
            r6 = 0
            r7 = 5
            r2 = r27
            r4 = r8
            boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x008d
            java.lang.String r2 = "http"
            r0.f2767a = r2
            int r8 = r8 + 5
            goto L_0x0095
        L_0x008d:
            r1 = 3
            return r1
        L_0x008f:
            if (r1 == 0) goto L_0x0349
            java.lang.String r2 = r1.f2774a
            r0.f2767a = r2
        L_0x0095:
            r2 = r8
            r3 = 0
        L_0x0097:
            r15 = 47
            r7 = 92
            if (r2 >= r11) goto L_0x00aa
            char r4 = r9.charAt(r2)
            if (r4 == r7) goto L_0x00a5
            if (r4 != r15) goto L_0x00aa
        L_0x00a5:
            int r3 = r3 + 1
            int r2 = r2 + 1
            goto L_0x0097
        L_0x00aa:
            java.util.ArrayList r6 = r0.f2771f
            r16 = 1
            r5 = 63
            r4 = 35
            if (r3 >= r12) goto L_0x010d
            if (r1 == 0) goto L_0x010d
            java.lang.String r2 = r1.f2774a
            java.lang.String r12 = r0.f2767a
            boolean r2 = r2.equals(r12)
            if (r2 != 0) goto L_0x00c1
            goto L_0x010d
        L_0x00c1:
            java.lang.String r2 = r26.f()
            r0.f2768b = r2
            java.lang.String r2 = r26.c()
            r0.f2769c = r2
            java.lang.String r2 = r1.f2777d
            r0.f2770d = r2
            int r2 = r1.e
            r0.e = r2
            r6.clear()
            java.util.ArrayList r2 = r26.d()
            r6.addAll(r2)
            if (r8 == r11) goto L_0x00e7
            char r2 = r9.charAt(r8)
            if (r2 != r4) goto L_0x0109
        L_0x00e7:
            java.lang.String r17 = r26.e()
            if (r17 == 0) goto L_0x0106
            int r19 = r17.length()
            r21 = 1
            r22 = 0
            r18 = 0
            java.lang.String r20 = " \"'<>#"
            r23 = 1
            r24 = 1
            java.lang.String r1 = g1.u.a(r17, r18, r19, r20, r21, r22, r23, r24)
            java.util.ArrayList r1 = g1.u.k(r1)
            goto L_0x0107
        L_0x0106:
            r1 = 0
        L_0x0107:
            r0.f2772g = r1
        L_0x0109:
            r20 = r6
            goto L_0x0237
        L_0x010d:
            int r8 = r8 + r3
            r2 = r8
            r12 = 0
            r17 = 0
        L_0x0112:
            java.lang.String r1 = "@/\\?#"
            int r8 = h1.c.h(r9, r2, r11, r1)
            if (r8 == r11) goto L_0x011f
            char r1 = r9.charAt(r8)
            goto L_0x0120
        L_0x011f:
            r1 = -1
        L_0x0120:
            if (r1 == r14) goto L_0x01c6
            if (r1 == r4) goto L_0x01c6
            if (r1 == r15) goto L_0x01c6
            if (r1 == r7) goto L_0x01c6
            if (r1 == r5) goto L_0x01c6
            r3 = 64
            if (r1 == r3) goto L_0x0132
            r20 = r6
            goto L_0x01b8
        L_0x0132:
            java.lang.String r3 = "%40"
            if (r12 != 0) goto L_0x018d
            int r1 = h1.c.g(r9, r2, r8, r13)
            r18 = 0
            r19 = 0
            java.lang.String r20 = " \"':;<=>@[]^`{}|/\\?#"
            r21 = 1
            r22 = 1
            r26 = r1
            r1 = r27
            r15 = r3
            r3 = r26
            r4 = r20
            r5 = r21
            r20 = r6
            r6 = r18
            r7 = r19
            r14 = r8
            r8 = r22
            java.lang.String r1 = g1.u.a(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r17 == 0) goto L_0x0172
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.f2768b
            r2.append(r3)
            r2.append(r15)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x0172:
            r0.f2768b = r1
            r1 = r26
            if (r1 == r14) goto L_0x018a
            int r2 = r1 + 1
            r6 = 0
            r7 = 0
            java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
            r5 = 1
            r8 = 1
            r1 = r27
            r3 = r14
            java.lang.String r1 = g1.u.a(r1, r2, r3, r4, r5, r6, r7, r8)
            r0.f2769c = r1
            r12 = 1
        L_0x018a:
            r17 = 1
            goto L_0x01b6
        L_0x018d:
            r15 = r3
            r20 = r6
            r14 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = r0.f2769c
            r8.append(r1)
            r8.append(r15)
            r6 = 0
            r7 = 0
            java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
            r5 = 1
            r15 = 1
            r1 = r27
            r3 = r14
            r10 = r8
            r8 = r15
            java.lang.String r1 = g1.u.a(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.append(r1)
            java.lang.String r1 = r10.toString()
            r0.f2769c = r1
        L_0x01b6:
            int r2 = r14 + 1
        L_0x01b8:
            r6 = r20
            r4 = 35
            r5 = 63
            r7 = 92
            r10 = 0
            r14 = -1
            r15 = 47
            goto L_0x0112
        L_0x01c6:
            r20 = r6
            r14 = r8
            r8 = r2
        L_0x01ca:
            if (r8 >= r14) goto L_0x01e6
            char r1 = r9.charAt(r8)
            if (r1 == r13) goto L_0x01e7
            r3 = 91
            if (r1 == r3) goto L_0x01d7
            goto L_0x01e3
        L_0x01d7:
            int r8 = r8 + 1
            if (r8 >= r14) goto L_0x01e3
            char r1 = r9.charAt(r8)
            r3 = 93
            if (r1 != r3) goto L_0x01d7
        L_0x01e3:
            int r8 = r8 + 1
            goto L_0x01ca
        L_0x01e6:
            r8 = r14
        L_0x01e7:
            int r3 = r8 + 1
            if (r3 >= r14) goto L_0x021d
            r1 = 0
            java.lang.String r2 = g1.u.h(r9, r2, r8, r1)
            java.lang.String r1 = h1.c.b(r2)
            r0.f2770d = r1
            java.lang.String r4 = ""
            r8 = 1
            r5 = 0
            r6 = 0
            r7 = 0
            r1 = r27
            r2 = r3
            r3 = r14
            java.lang.String r1 = g1.u.a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ NumberFormatException -> 0x0212 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0212 }
            if (r1 <= 0) goto L_0x0210
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r1 > r2) goto L_0x0210
            goto L_0x0214
        L_0x0210:
            r1 = -1
            goto L_0x0214
        L_0x0212:
            goto L_0x0210
        L_0x0214:
            r0.e = r1
            r2 = -1
            if (r1 != r2) goto L_0x021b
            r1 = 4
            return r1
        L_0x021b:
            r10 = 0
            goto L_0x0230
        L_0x021d:
            r10 = 0
            java.lang.String r1 = g1.u.h(r9, r2, r8, r10)
            java.lang.String r1 = h1.c.b(r1)
            r0.f2770d = r1
            java.lang.String r1 = r0.f2767a
            int r1 = g1.u.b(r1)
            r0.e = r1
        L_0x0230:
            java.lang.String r1 = r0.f2770d
            if (r1 != 0) goto L_0x0236
            r1 = 5
            return r1
        L_0x0236:
            r8 = r14
        L_0x0237:
            java.lang.String r1 = "?#"
            int r12 = h1.c.h(r9, r8, r11, r1)
            if (r8 != r12) goto L_0x0241
            goto L_0x0306
        L_0x0241:
            char r1 = r9.charAt(r8)
            java.lang.String r13 = ""
            r2 = 47
            if (r1 == r2) goto L_0x024f
            r2 = 92
            if (r1 != r2) goto L_0x0252
        L_0x024f:
            r14 = r20
            goto L_0x025e
        L_0x0252:
            int r1 = r20.size()
            int r1 = r1 + -1
            r14 = r20
            r14.set(r1, r13)
            goto L_0x0266
        L_0x025e:
            r14.clear()
            r14.add(r13)
            int r8 = r8 + 1
        L_0x0266:
            r2 = r8
        L_0x0267:
            if (r2 >= r12) goto L_0x0306
            java.lang.String r1 = "/\\"
            int r15 = h1.c.h(r9, r2, r12, r1)
            if (r15 >= r12) goto L_0x0274
            r17 = 1
            goto L_0x0276
        L_0x0274:
            r17 = 0
        L_0x0276:
            r6 = 0
            r7 = 0
            java.lang.String r4 = " \"<>^`{}|/\\?#"
            r5 = 1
            r8 = 1
            r1 = r27
            r3 = r15
            java.lang.String r1 = g1.u.a(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r2 = "."
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x02ff
            java.lang.String r2 = "%2e"
            boolean r2 = r1.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0294
            goto L_0x02ff
        L_0x0294:
            java.lang.String r2 = ".."
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x02da
            java.lang.String r2 = "%2e."
            boolean r2 = r1.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x02da
            java.lang.String r2 = ".%2e"
            boolean r2 = r1.equalsIgnoreCase(r2)
            if (r2 != 0) goto L_0x02da
            java.lang.String r2 = "%2e%2e"
            boolean r2 = r1.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x02b5
            goto L_0x02da
        L_0x02b5:
            int r2 = r14.size()
            int r2 = r2 + -1
            java.lang.Object r2 = r14.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x02d1
            int r2 = r14.size()
            int r2 = r2 + -1
            r14.set(r2, r1)
            goto L_0x02d4
        L_0x02d1:
            r14.add(r1)
        L_0x02d4:
            if (r17 == 0) goto L_0x02ff
            r14.add(r13)
            goto L_0x02ff
        L_0x02da:
            int r1 = r14.size()
            int r1 = r1 + -1
            java.lang.Object r1 = r14.remove(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x02fc
            boolean r1 = r14.isEmpty()
            if (r1 != 0) goto L_0x02fc
            int r1 = r14.size()
            int r1 = r1 + -1
            r14.set(r1, r13)
            goto L_0x02ff
        L_0x02fc:
            r14.add(r13)
        L_0x02ff:
            if (r17 == 0) goto L_0x0303
            int r15 = r15 + 1
        L_0x0303:
            r2 = r15
            goto L_0x0267
        L_0x0306:
            if (r12 >= r11) goto L_0x032d
            char r1 = r9.charAt(r12)
            r2 = 63
            if (r1 != r2) goto L_0x032d
            r10 = 35
            int r13 = h1.c.g(r9, r12, r11, r10)
            int r2 = r12 + 1
            r6 = 0
            r7 = 1
            java.lang.String r4 = " \"'<>#"
            r5 = 1
            r8 = 1
            r1 = r27
            r3 = r13
            java.lang.String r1 = g1.u.a(r1, r2, r3, r4, r5, r6, r7, r8)
            java.util.ArrayList r1 = g1.u.k(r1)
            r0.f2772g = r1
            r12 = r13
            goto L_0x032f
        L_0x032d:
            r10 = 35
        L_0x032f:
            if (r12 >= r11) goto L_0x0348
            char r1 = r9.charAt(r12)
            if (r1 != r10) goto L_0x0348
            int r2 = r12 + 1
            r6 = 0
            r7 = 0
            java.lang.String r4 = ""
            r5 = 1
            r8 = 0
            r1 = r27
            r3 = r11
            java.lang.String r1 = g1.u.a(r1, r2, r3, r4, r5, r6, r7, r8)
            r0.f2773h = r1
        L_0x0348:
            return r16
        L_0x0349:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.t.b(g1.u, java.lang.String):int");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2767a);
        sb.append("://");
        if (!this.f2768b.isEmpty() || !this.f2769c.isEmpty()) {
            sb.append(this.f2768b);
            if (!this.f2769c.isEmpty()) {
                sb.append(':');
                sb.append(this.f2769c);
            }
            sb.append('@');
        }
        if (this.f2770d.indexOf(58) != -1) {
            sb.append('[');
            sb.append(this.f2770d);
            sb.append(']');
        } else {
            sb.append(this.f2770d);
        }
        int i = this.e;
        if (i == -1) {
            i = u.b(this.f2767a);
        }
        if (i != u.b(this.f2767a)) {
            sb.append(':');
            sb.append(i);
        }
        ArrayList arrayList = this.f2771f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append((String) arrayList.get(i2));
        }
        if (this.f2772g != null) {
            sb.append('?');
            u.g(sb, this.f2772g);
        }
        if (this.f2773h != null) {
            sb.append('#');
            sb.append(this.f2773h);
        }
        return sb.toString();
    }

    public t() {
        ArrayList arrayList = new ArrayList();
        this.f2771f = arrayList;
        arrayList.add("");
    }
}
