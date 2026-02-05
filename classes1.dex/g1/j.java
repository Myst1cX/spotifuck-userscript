package g1;

import java.util.concurrent.TimeUnit;

public final class j {

    /* renamed from: n  reason: collision with root package name */
    public static final j f2707n;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2708a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2709b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2710c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2711d;
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2712f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2713g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2714h;
    public final int i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f2715j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f2716k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f2717l;

    /* renamed from: m  reason: collision with root package name */
    public String f2718m;

    public j(boolean z2, boolean z3, int i2, int i3, boolean z4, boolean z5, boolean z6, int i4, int i5, boolean z7, boolean z8, boolean z9, String str) {
        this.f2708a = z2;
        this.f2709b = z3;
        this.f2710c = i2;
        this.f2711d = i3;
        this.e = z4;
        this.f2712f = z5;
        this.f2713g = z6;
        this.f2714h = i4;
        this.i = i5;
        this.f2715j = z7;
        this.f2716k = z8;
        this.f2717l = z9;
        this.f2718m = str;
    }

    static {
        i iVar = new i();
        iVar.f2704b = true;
        new j(iVar);
        i iVar2 = new i();
        iVar2.f2706d = true;
        int i2 = Integer.MAX_VALUE;
        long seconds = TimeUnit.SECONDS.toSeconds((long) Integer.MAX_VALUE);
        if (seconds <= 2147483647L) {
            i2 = (int) seconds;
        }
        iVar2.f2703a = i2;
        f2707n = new j(iVar2);
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 192 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static g1.j a(g1.s r22) {
        /*
            r0 = r22
            int r1 = r22.d()
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x001a:
            if (r6 >= r1) goto L_0x0158
            java.lang.String r2 = r0.b(r6)
            java.lang.String r5 = r0.e(r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0032
            if (r8 == 0) goto L_0x0030
        L_0x002e:
            r7 = 0
            goto L_0x003b
        L_0x0030:
            r8 = r5
            goto L_0x003b
        L_0x0032:
            java.lang.String r3 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x0151
            goto L_0x002e
        L_0x003b:
            r2 = 0
        L_0x003c:
            int r3 = r5.length()
            if (r2 >= r3) goto L_0x0151
            java.lang.String r3 = "=,;"
            int r3 = k1.d.e(r5, r2, r3)
            java.lang.String r2 = r5.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            int r4 = r5.length()
            if (r3 == r4) goto L_0x0066
            char r4 = r5.charAt(r3)
            r0 = 44
            if (r4 == r0) goto L_0x0066
            char r0 = r5.charAt(r3)
            r4 = 59
            if (r0 != r4) goto L_0x007b
        L_0x0066:
            r4 = 1
            goto L_0x00ab
        L_0x0068:
            int r0 = r5.length()
            if (r3 >= r0) goto L_0x007e
            char r0 = r5.charAt(r3)
            r4 = 32
            if (r0 == r4) goto L_0x007b
            r4 = 9
            if (r0 == r4) goto L_0x007b
            goto L_0x007e
        L_0x007b:
            int r3 = r3 + 1
            goto L_0x0068
        L_0x007e:
            int r0 = r5.length()
            if (r3 >= r0) goto L_0x009b
            char r0 = r5.charAt(r3)
            r4 = 34
            if (r0 != r4) goto L_0x009b
            int r3 = r3 + 1
            java.lang.String r0 = "\""
            int r0 = k1.d.e(r5, r3, r0)
            java.lang.String r3 = r5.substring(r3, r0)
            r4 = 1
            int r0 = r0 + r4
            goto L_0x00af
        L_0x009b:
            r4 = 1
            java.lang.String r0 = ",;"
            int r0 = k1.d.e(r5, r3, r0)
            java.lang.String r3 = r5.substring(r3, r0)
            java.lang.String r3 = r3.trim()
            goto L_0x00af
        L_0x00ab:
            int r3 = r3 + 1
            r0 = r3
            r3 = 0
        L_0x00af:
            java.lang.String r4 = "no-cache"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00bb
            r4 = -1
            r9 = 1
            goto L_0x014c
        L_0x00bb:
            java.lang.String r4 = "no-store"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00c7
            r4 = -1
            r10 = 1
            goto L_0x014c
        L_0x00c7:
            java.lang.String r4 = "max-age"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00d7
            r4 = -1
            int r2 = k1.d.c(r3, r4)
            r11 = r2
            goto L_0x014c
        L_0x00d7:
            java.lang.String r4 = "s-maxage"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00e7
            r4 = -1
            int r2 = k1.d.c(r3, r4)
            r12 = r2
            goto L_0x014c
        L_0x00e7:
            java.lang.String r4 = "private"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00f2
            r4 = -1
            r13 = 1
            goto L_0x014c
        L_0x00f2:
            java.lang.String r4 = "public"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00fd
            r4 = -1
            r14 = 1
            goto L_0x014c
        L_0x00fd:
            java.lang.String r4 = "must-revalidate"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x0108
            r4 = -1
            r15 = 1
            goto L_0x014c
        L_0x0108:
            java.lang.String r4 = "max-stale"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x011b
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r2 = k1.d.c(r3, r2)
            r16 = r2
            r4 = -1
            goto L_0x014c
        L_0x011b:
            java.lang.String r4 = "min-fresh"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x012b
            r4 = -1
            int r2 = k1.d.c(r3, r4)
            r17 = r2
            goto L_0x014c
        L_0x012b:
            r4 = -1
            java.lang.String r3 = "only-if-cached"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L_0x0137
            r18 = 1
            goto L_0x014c
        L_0x0137:
            java.lang.String r3 = "no-transform"
            boolean r3 = r3.equalsIgnoreCase(r2)
            if (r3 == 0) goto L_0x0142
            r19 = 1
            goto L_0x014c
        L_0x0142:
            java.lang.String r3 = "immutable"
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x014c
            r20 = 1
        L_0x014c:
            r2 = r0
            r0 = r22
            goto L_0x003c
        L_0x0151:
            r4 = -1
            int r6 = r6 + 1
            r0 = r22
            goto L_0x001a
        L_0x0158:
            if (r7 != 0) goto L_0x015d
            r21 = 0
            goto L_0x015f
        L_0x015d:
            r21 = r8
        L_0x015f:
            g1.j r0 = new g1.j
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.j.a(g1.s):g1.j");
    }

    public final String toString() {
        String str = this.f2718m;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f2708a) {
                sb.append("no-cache, ");
            }
            if (this.f2709b) {
                sb.append("no-store, ");
            }
            int i2 = this.f2710c;
            if (i2 != -1) {
                sb.append("max-age=");
                sb.append(i2);
                sb.append(", ");
            }
            int i3 = this.f2711d;
            if (i3 != -1) {
                sb.append("s-maxage=");
                sb.append(i3);
                sb.append(", ");
            }
            if (this.e) {
                sb.append("private, ");
            }
            if (this.f2712f) {
                sb.append("public, ");
            }
            if (this.f2713g) {
                sb.append("must-revalidate, ");
            }
            int i4 = this.f2714h;
            if (i4 != -1) {
                sb.append("max-stale=");
                sb.append(i4);
                sb.append(", ");
            }
            int i5 = this.i;
            if (i5 != -1) {
                sb.append("min-fresh=");
                sb.append(i5);
                sb.append(", ");
            }
            if (this.f2715j) {
                sb.append("only-if-cached, ");
            }
            if (this.f2716k) {
                sb.append("no-transform, ");
            }
            if (this.f2717l) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                str = "";
            } else {
                sb.delete(sb.length() - 2, sb.length());
                str = sb.toString();
            }
            this.f2718m = str;
        }
        return str;
    }

    public j(i iVar) {
        this.f2708a = iVar.f2704b;
        this.f2709b = iVar.f2705c;
        this.f2710c = -1;
        this.f2711d = -1;
        this.e = false;
        this.f2712f = false;
        this.f2713g = false;
        this.f2714h = iVar.f2703a;
        this.i = -1;
        this.f2715j = iVar.f2706d;
        this.f2716k = false;
        this.f2717l = false;
    }
}
