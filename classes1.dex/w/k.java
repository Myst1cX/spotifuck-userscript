package w;

public final class k extends o {

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f4883k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f2, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f2) + 0.5f);
            int i9 = (int) ((((float) i6) / f2) + 0.5f);
            if (i8 <= i6) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f2) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            iArr[0] = i6;
            iArr[1] = (int) ((((float) i6) * f2) + 0.5f);
        }
    }

    public final void f() {
        this.f4895c = null;
        this.f4899h.c();
        this.i.c();
        this.e.c();
        this.f4898g = false;
    }

    public final void n() {
        this.f4898g = false;
        f fVar = this.f4899h;
        fVar.c();
        fVar.f4878j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.f4878j = false;
        this.e.f4878j = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0247, code lost:
        if (r3 != 1) goto L_0x02a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(w.d r24) {
        /*
            r23 = this;
            r0 = r23
            int r1 = r0.f4900j
            int r1 = t.C0339e.a(r1)
            r2 = 0
            r3 = 3
            if (r1 == r3) goto L_0x0389
            w.g r1 = r0.e
            boolean r4 = r1.f4878j
            w.f r5 = r0.f4899h
            w.f r6 = r0.i
            r7 = 1056964608(0x3f000000, float:0.5)
            r8 = 1
            if (r4 != 0) goto L_0x02a5
            int r4 = r0.f4896d
            if (r4 != r3) goto L_0x02a5
            v.d r4 = r0.f4894b
            int r9 = r4.f4763r
            r10 = 2
            if (r9 == r10) goto L_0x028d
            if (r9 == r3) goto L_0x0028
            goto L_0x02a5
        L_0x0028:
            int r9 = r4.f4764s
            r10 = -1
            if (r9 == 0) goto L_0x0062
            if (r9 != r3) goto L_0x0030
            goto L_0x0062
        L_0x0030:
            int r9 = r4.f4730X
            if (r9 == r10) goto L_0x0053
            if (r9 == 0) goto L_0x0048
            if (r9 == r8) goto L_0x003a
            r4 = 0
            goto L_0x005d
        L_0x003a:
            w.m r9 = r4.e
            w.g r9 = r9.e
            int r9 = r9.f4876g
            float r9 = (float) r9
            float r4 = r4.f4729W
        L_0x0043:
            float r9 = r9 * r4
        L_0x0045:
            float r9 = r9 + r7
            int r4 = (int) r9
            goto L_0x005d
        L_0x0048:
            w.m r9 = r4.e
            w.g r9 = r9.e
            int r9 = r9.f4876g
            float r9 = (float) r9
            float r4 = r4.f4729W
            float r9 = r9 / r4
            goto L_0x0045
        L_0x0053:
            w.m r9 = r4.e
            w.g r9 = r9.e
            int r9 = r9.f4876g
            float r9 = (float) r9
            float r4 = r4.f4729W
            goto L_0x0043
        L_0x005d:
            r1.d(r4)
            goto L_0x02a5
        L_0x0062:
            w.m r9 = r4.e
            w.f r11 = r9.f4899h
            w.f r9 = r9.i
            v.c r12 = r4.I
            v.c r12 = r12.f4705f
            if (r12 == 0) goto L_0x0070
            r12 = 1
            goto L_0x0071
        L_0x0070:
            r12 = 0
        L_0x0071:
            v.c r13 = r4.f4716J
            v.c r13 = r13.f4705f
            if (r13 == 0) goto L_0x0079
            r13 = 1
            goto L_0x007a
        L_0x0079:
            r13 = 0
        L_0x007a:
            v.c r14 = r4.f4717K
            v.c r14 = r14.f4705f
            if (r14 == 0) goto L_0x0082
            r14 = 1
            goto L_0x0083
        L_0x0082:
            r14 = 0
        L_0x0083:
            v.c r15 = r4.f4718L
            v.c r15 = r15.f4705f
            if (r15 == 0) goto L_0x008b
            r15 = 1
            goto L_0x008c
        L_0x008b:
            r15 = 0
        L_0x008c:
            int r3 = r4.f4730X
            if (r12 == 0) goto L_0x01a4
            if (r13 == 0) goto L_0x01a4
            if (r14 == 0) goto L_0x01a4
            if (r15 == 0) goto L_0x01a4
            float r4 = r4.f4729W
            boolean r10 = r11.f4878j
            int[] r12 = f4883k
            if (r10 == 0) goto L_0x00ed
            boolean r10 = r9.f4878j
            if (r10 == 0) goto L_0x00ed
            boolean r7 = r5.f4873c
            if (r7 == 0) goto L_0x00ec
            boolean r7 = r6.f4873c
            if (r7 != 0) goto L_0x00ab
            goto L_0x00ec
        L_0x00ab:
            java.util.ArrayList r7 = r5.f4880l
            java.lang.Object r7 = r7.get(r2)
            w.f r7 = (w.f) r7
            int r7 = r7.f4876g
            int r5 = r5.f4875f
            int r17 = r7 + r5
            java.util.ArrayList r5 = r6.f4880l
            java.lang.Object r5 = r5.get(r2)
            w.f r5 = (w.f) r5
            int r5 = r5.f4876g
            int r6 = r6.f4875f
            int r18 = r5 - r6
            int r5 = r11.f4876g
            int r6 = r11.f4875f
            int r19 = r5 + r6
            int r5 = r9.f4876g
            int r6 = r9.f4875f
            int r20 = r5 - r6
            r16 = r12
            r21 = r4
            r22 = r3
            m(r16, r17, r18, r19, r20, r21, r22)
            r2 = r12[r2]
            r1.d(r2)
            v.d r1 = r0.f4894b
            w.m r1 = r1.e
            w.g r1 = r1.e
            r2 = r12[r8]
            r1.d(r2)
        L_0x00ec:
            return
        L_0x00ed:
            boolean r10 = r5.f4878j
            java.util.ArrayList r13 = r11.f4880l
            if (r10 == 0) goto L_0x0141
            boolean r10 = r6.f4878j
            if (r10 == 0) goto L_0x0141
            boolean r10 = r11.f4873c
            if (r10 == 0) goto L_0x0140
            boolean r10 = r9.f4873c
            if (r10 != 0) goto L_0x0100
            goto L_0x0140
        L_0x0100:
            int r10 = r5.f4876g
            int r14 = r5.f4875f
            int r17 = r10 + r14
            int r10 = r6.f4876g
            int r14 = r6.f4875f
            int r18 = r10 - r14
            java.lang.Object r10 = r13.get(r2)
            w.f r10 = (w.f) r10
            int r10 = r10.f4876g
            int r14 = r11.f4875f
            int r19 = r10 + r14
            java.util.ArrayList r10 = r9.f4880l
            java.lang.Object r10 = r10.get(r2)
            w.f r10 = (w.f) r10
            int r10 = r10.f4876g
            int r14 = r9.f4875f
            int r20 = r10 - r14
            r16 = r12
            r21 = r4
            r22 = r3
            m(r16, r17, r18, r19, r20, r21, r22)
            r10 = r12[r2]
            r1.d(r10)
            v.d r10 = r0.f4894b
            w.m r10 = r10.e
            w.g r10 = r10.e
            r14 = r12[r8]
            r10.d(r14)
            goto L_0x0141
        L_0x0140:
            return
        L_0x0141:
            boolean r10 = r5.f4873c
            if (r10 == 0) goto L_0x01a3
            boolean r10 = r6.f4873c
            if (r10 == 0) goto L_0x01a3
            boolean r10 = r11.f4873c
            if (r10 == 0) goto L_0x01a3
            boolean r10 = r9.f4873c
            if (r10 != 0) goto L_0x0152
            goto L_0x01a3
        L_0x0152:
            java.util.ArrayList r10 = r5.f4880l
            java.lang.Object r10 = r10.get(r2)
            w.f r10 = (w.f) r10
            int r10 = r10.f4876g
            int r14 = r5.f4875f
            int r17 = r10 + r14
            java.util.ArrayList r10 = r6.f4880l
            java.lang.Object r10 = r10.get(r2)
            w.f r10 = (w.f) r10
            int r10 = r10.f4876g
            int r14 = r6.f4875f
            int r18 = r10 - r14
            java.lang.Object r10 = r13.get(r2)
            w.f r10 = (w.f) r10
            int r10 = r10.f4876g
            int r11 = r11.f4875f
            int r19 = r10 + r11
            java.util.ArrayList r10 = r9.f4880l
            java.lang.Object r10 = r10.get(r2)
            w.f r10 = (w.f) r10
            int r10 = r10.f4876g
            int r9 = r9.f4875f
            int r20 = r10 - r9
            r16 = r12
            r21 = r4
            r22 = r3
            m(r16, r17, r18, r19, r20, r21, r22)
            r3 = r12[r2]
            r1.d(r3)
            v.d r3 = r0.f4894b
            w.m r3 = r3.e
            w.g r3 = r3.e
            r4 = r12[r8]
            r3.d(r4)
            goto L_0x02a5
        L_0x01a3:
            return
        L_0x01a4:
            if (r12 == 0) goto L_0x021a
            if (r14 == 0) goto L_0x021a
            boolean r9 = r5.f4873c
            if (r9 == 0) goto L_0x0219
            boolean r9 = r6.f4873c
            if (r9 != 0) goto L_0x01b1
            goto L_0x0219
        L_0x01b1:
            float r4 = r4.f4729W
            java.util.ArrayList r9 = r5.f4880l
            java.lang.Object r9 = r9.get(r2)
            w.f r9 = (w.f) r9
            int r9 = r9.f4876g
            int r11 = r5.f4875f
            int r9 = r9 + r11
            java.util.ArrayList r11 = r6.f4880l
            java.lang.Object r11 = r11.get(r2)
            w.f r11 = (w.f) r11
            int r11 = r11.f4876g
            int r12 = r6.f4875f
            int r11 = r11 - r12
            if (r3 == r10) goto L_0x01f7
            if (r3 == 0) goto L_0x01f7
            if (r3 == r8) goto L_0x01d5
            goto L_0x02a5
        L_0x01d5:
            int r11 = r11 - r9
            int r3 = r0.g(r11, r2)
            float r9 = (float) r3
            float r9 = r9 / r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r8)
            if (r9 == r10) goto L_0x01e9
            float r3 = (float) r10
            float r3 = r3 * r4
            float r3 = r3 + r7
            int r3 = (int) r3
        L_0x01e9:
            r1.d(r3)
            v.d r3 = r0.f4894b
            w.m r3 = r3.e
            w.g r3 = r3.e
            r3.d(r10)
            goto L_0x02a5
        L_0x01f7:
            int r11 = r11 - r9
            int r3 = r0.g(r11, r2)
            float r9 = (float) r3
            float r9 = r9 * r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r8)
            if (r9 == r10) goto L_0x020b
            float r3 = (float) r10
            float r3 = r3 / r4
            float r3 = r3 + r7
            int r3 = (int) r3
        L_0x020b:
            r1.d(r3)
            v.d r3 = r0.f4894b
            w.m r3 = r3.e
            w.g r3 = r3.e
            r3.d(r10)
            goto L_0x02a5
        L_0x0219:
            return
        L_0x021a:
            if (r13 == 0) goto L_0x02a5
            if (r15 == 0) goto L_0x02a5
            boolean r12 = r11.f4873c
            if (r12 == 0) goto L_0x028c
            boolean r12 = r9.f4873c
            if (r12 != 0) goto L_0x0227
            goto L_0x028c
        L_0x0227:
            float r4 = r4.f4729W
            java.util.ArrayList r12 = r11.f4880l
            java.lang.Object r12 = r12.get(r2)
            w.f r12 = (w.f) r12
            int r12 = r12.f4876g
            int r11 = r11.f4875f
            int r12 = r12 + r11
            java.util.ArrayList r11 = r9.f4880l
            java.lang.Object r11 = r11.get(r2)
            w.f r11 = (w.f) r11
            int r11 = r11.f4876g
            int r9 = r9.f4875f
            int r11 = r11 - r9
            if (r3 == r10) goto L_0x026b
            if (r3 == 0) goto L_0x024a
            if (r3 == r8) goto L_0x026b
            goto L_0x02a5
        L_0x024a:
            int r11 = r11 - r12
            int r3 = r0.g(r11, r8)
            float r9 = (float) r3
            float r9 = r9 * r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r2)
            if (r9 == r10) goto L_0x025e
            float r3 = (float) r10
            float r3 = r3 / r4
            float r3 = r3 + r7
            int r3 = (int) r3
        L_0x025e:
            r1.d(r10)
            v.d r4 = r0.f4894b
            w.m r4 = r4.e
            w.g r4 = r4.e
            r4.d(r3)
            goto L_0x02a5
        L_0x026b:
            int r11 = r11 - r12
            int r3 = r0.g(r11, r8)
            float r9 = (float) r3
            float r9 = r9 / r4
            float r9 = r9 + r7
            int r9 = (int) r9
            int r10 = r0.g(r9, r2)
            if (r9 == r10) goto L_0x027f
            float r3 = (float) r10
            float r3 = r3 * r4
            float r3 = r3 + r7
            int r3 = (int) r3
        L_0x027f:
            r1.d(r10)
            v.d r4 = r0.f4894b
            w.m r4 = r4.e
            w.g r4 = r4.e
            r4.d(r3)
            goto L_0x02a5
        L_0x028c:
            return
        L_0x028d:
            v.d r3 = r4.f4726T
            if (r3 == 0) goto L_0x02a5
            w.k r3 = r3.f4739d
            w.g r3 = r3.e
            boolean r9 = r3.f4878j
            if (r9 == 0) goto L_0x02a5
            float r4 = r4.f4768w
            int r3 = r3.f4876g
            float r3 = (float) r3
            float r3 = r3 * r4
            float r3 = r3 + r7
            int r3 = (int) r3
            r1.d(r3)
        L_0x02a5:
            boolean r3 = r5.f4873c
            if (r3 == 0) goto L_0x0388
            boolean r3 = r6.f4873c
            if (r3 != 0) goto L_0x02af
            goto L_0x0388
        L_0x02af:
            boolean r3 = r5.f4878j
            if (r3 == 0) goto L_0x02bc
            boolean r3 = r6.f4878j
            if (r3 == 0) goto L_0x02bc
            boolean r3 = r1.f4878j
            if (r3 == 0) goto L_0x02bc
            return
        L_0x02bc:
            boolean r3 = r1.f4878j
            if (r3 != 0) goto L_0x02f7
            int r3 = r0.f4896d
            r4 = 3
            if (r3 != r4) goto L_0x02f7
            v.d r3 = r0.f4894b
            int r4 = r3.f4763r
            if (r4 != 0) goto L_0x02f7
            boolean r3 = r3.x()
            if (r3 != 0) goto L_0x02f7
            java.util.ArrayList r3 = r5.f4880l
            java.lang.Object r3 = r3.get(r2)
            w.f r3 = (w.f) r3
            java.util.ArrayList r4 = r6.f4880l
            java.lang.Object r2 = r4.get(r2)
            w.f r2 = (w.f) r2
            int r3 = r3.f4876g
            int r4 = r5.f4875f
            int r3 = r3 + r4
            int r2 = r2.f4876g
            int r4 = r6.f4875f
            int r2 = r2 + r4
            int r4 = r2 - r3
            r5.d(r3)
            r6.d(r2)
            r1.d(r4)
            return
        L_0x02f7:
            boolean r3 = r1.f4878j
            if (r3 != 0) goto L_0x0348
            int r3 = r0.f4896d
            r4 = 3
            if (r3 != r4) goto L_0x0348
            int r3 = r0.f4893a
            if (r3 != r8) goto L_0x0348
            java.util.ArrayList r3 = r5.f4880l
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0348
            java.util.ArrayList r3 = r6.f4880l
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0348
            java.util.ArrayList r3 = r5.f4880l
            java.lang.Object r3 = r3.get(r2)
            w.f r3 = (w.f) r3
            java.util.ArrayList r4 = r6.f4880l
            java.lang.Object r4 = r4.get(r2)
            w.f r4 = (w.f) r4
            int r3 = r3.f4876g
            int r8 = r5.f4875f
            int r3 = r3 + r8
            int r4 = r4.f4876g
            int r8 = r6.f4875f
            int r4 = r4 + r8
            int r4 = r4 - r3
            int r3 = r1.f4881m
            int r3 = java.lang.Math.min(r4, r3)
            v.d r4 = r0.f4894b
            int r8 = r4.f4767v
            int r4 = r4.f4766u
            int r3 = java.lang.Math.max(r4, r3)
            if (r8 <= 0) goto L_0x0345
            int r3 = java.lang.Math.min(r8, r3)
        L_0x0345:
            r1.d(r3)
        L_0x0348:
            boolean r3 = r1.f4878j
            if (r3 != 0) goto L_0x034d
            return
        L_0x034d:
            java.util.ArrayList r3 = r5.f4880l
            java.lang.Object r3 = r3.get(r2)
            w.f r3 = (w.f) r3
            java.util.ArrayList r4 = r6.f4880l
            java.lang.Object r2 = r4.get(r2)
            w.f r2 = (w.f) r2
            int r4 = r3.f4876g
            int r8 = r5.f4875f
            int r8 = r8 + r4
            int r9 = r2.f4876g
            int r10 = r6.f4875f
            int r10 = r10 + r9
            v.d r11 = r0.f4894b
            float r11 = r11.f4740d0
            if (r3 != r2) goto L_0x0370
            r11 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0372
        L_0x0370:
            r4 = r8
            r9 = r10
        L_0x0372:
            int r9 = r9 - r4
            int r2 = r1.f4876g
            int r9 = r9 - r2
            float r2 = (float) r4
            float r2 = r2 + r7
            float r3 = (float) r9
            float r3 = r3 * r11
            float r3 = r3 + r2
            int r2 = (int) r3
            r5.d(r2)
            int r2 = r5.f4876g
            int r1 = r1.f4876g
            int r2 = r2 + r1
            r6.d(r2)
        L_0x0388:
            return
        L_0x0389:
            v.d r1 = r0.f4894b
            v.c r3 = r1.I
            v.c r1 = r1.f4717K
            r0.l(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.k.a(w.d):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
        r0 = r11.f4894b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r11 = this;
            v.d r0 = r11.f4894b
            boolean r1 = r0.f4733a
            w.g r2 = r11.e
            if (r1 == 0) goto L_0x000f
            int r0 = r0.q()
            r2.d(r0)
        L_0x000f:
            boolean r0 = r2.f4878j
            w.f r1 = r11.i
            w.f r3 = r11.f4899h
            r4 = 1
            r5 = 3
            r6 = 4
            r7 = 0
            if (r0 != 0) goto L_0x0076
            v.d r0 = r11.f4894b
            int[] r8 = r0.f4761p0
            r8 = r8[r7]
            r11.f4896d = r8
            if (r8 == r5) goto L_0x00a6
            if (r8 != r6) goto L_0x006c
            v.d r9 = r0.f4726T
            if (r9 == 0) goto L_0x006c
            int[] r10 = r9.f4761p0
            r10 = r10[r7]
            if (r10 == r4) goto L_0x0033
            if (r10 != r6) goto L_0x006c
        L_0x0033:
            int r0 = r9.q()
            v.d r4 = r11.f4894b
            v.c r4 = r4.I
            int r4 = r4.e()
            int r0 = r0 - r4
            v.d r4 = r11.f4894b
            v.c r4 = r4.f4717K
            int r4 = r4.e()
            int r0 = r0 - r4
            w.k r4 = r9.f4739d
            w.f r4 = r4.f4899h
            v.d r5 = r11.f4894b
            v.c r5 = r5.I
            int r5 = r5.e()
            w.o.b(r3, r4, r5)
            w.k r3 = r9.f4739d
            w.f r3 = r3.i
            v.d r4 = r11.f4894b
            v.c r4 = r4.f4717K
            int r4 = r4.e()
            int r4 = -r4
            w.o.b(r1, r3, r4)
            r2.d(r0)
            return
        L_0x006c:
            if (r8 != r4) goto L_0x00a6
            int r0 = r0.q()
            r2.d(r0)
            goto L_0x00a6
        L_0x0076:
            int r0 = r11.f4896d
            if (r0 != r6) goto L_0x00a6
            v.d r0 = r11.f4894b
            v.d r8 = r0.f4726T
            if (r8 == 0) goto L_0x00a6
            int[] r9 = r8.f4761p0
            r9 = r9[r7]
            if (r9 == r4) goto L_0x0088
            if (r9 != r6) goto L_0x00a6
        L_0x0088:
            w.k r2 = r8.f4739d
            w.f r2 = r2.f4899h
            v.c r0 = r0.I
            int r0 = r0.e()
            w.o.b(r3, r2, r0)
            w.k r0 = r8.f4739d
            w.f r0 = r0.i
            v.d r2 = r11.f4894b
            v.c r2 = r2.f4717K
            int r2 = r2.e()
            int r2 = -r2
            w.o.b(r1, r0, r2)
            return
        L_0x00a6:
            boolean r0 = r2.f4878j
            if (r0 == 0) goto L_0x017d
            v.d r0 = r11.f4894b
            boolean r8 = r0.f4733a
            if (r8 == 0) goto L_0x017d
            v.c[] r5 = r0.f4723Q
            r6 = r5[r7]
            v.c r8 = r6.f4705f
            if (r8 == 0) goto L_0x0118
            r9 = r5[r4]
            v.c r9 = r9.f4705f
            if (r9 == 0) goto L_0x0118
            boolean r0 = r0.x()
            if (r0 == 0) goto L_0x00df
            v.d r0 = r11.f4894b
            v.c[] r0 = r0.f4723Q
            r0 = r0[r7]
            int r0 = r0.e()
            r3.f4875f = r0
            v.d r0 = r11.f4894b
            v.c[] r0 = r0.f4723Q
            r0 = r0[r4]
            int r0 = r0.e()
            int r0 = -r0
            r1.f4875f = r0
            goto L_0x0313
        L_0x00df:
            v.d r0 = r11.f4894b
            v.c[] r0 = r0.f4723Q
            r0 = r0[r7]
            w.f r0 = w.o.h(r0)
            if (r0 == 0) goto L_0x00f8
            v.d r2 = r11.f4894b
            v.c[] r2 = r2.f4723Q
            r2 = r2[r7]
            int r2 = r2.e()
            w.o.b(r3, r0, r2)
        L_0x00f8:
            v.d r0 = r11.f4894b
            v.c[] r0 = r0.f4723Q
            r0 = r0[r4]
            w.f r0 = w.o.h(r0)
            if (r0 == 0) goto L_0x0112
            v.d r2 = r11.f4894b
            v.c[] r2 = r2.f4723Q
            r2 = r2[r4]
            int r2 = r2.e()
            int r2 = -r2
            w.o.b(r1, r0, r2)
        L_0x0112:
            r3.f4872b = r4
            r1.f4872b = r4
            goto L_0x0313
        L_0x0118:
            if (r8 == 0) goto L_0x0134
            w.f r0 = w.o.h(r6)
            if (r0 == 0) goto L_0x0313
            v.d r4 = r11.f4894b
            v.c[] r4 = r4.f4723Q
            r4 = r4[r7]
            int r4 = r4.e()
            w.o.b(r3, r0, r4)
            int r0 = r2.f4876g
            w.o.b(r1, r3, r0)
            goto L_0x0313
        L_0x0134:
            r5 = r5[r4]
            v.c r6 = r5.f4705f
            if (r6 == 0) goto L_0x0156
            w.f r0 = w.o.h(r5)
            if (r0 == 0) goto L_0x0313
            v.d r5 = r11.f4894b
            v.c[] r5 = r5.f4723Q
            r4 = r5[r4]
            int r4 = r4.e()
            int r4 = -r4
            w.o.b(r1, r0, r4)
            int r0 = r2.f4876g
            int r0 = -r0
            w.o.b(r3, r1, r0)
            goto L_0x0313
        L_0x0156:
            boolean r4 = r0 instanceof v.i
            if (r4 != 0) goto L_0x0313
            v.d r4 = r0.f4726T
            if (r4 == 0) goto L_0x0313
            r4 = 7
            v.c r0 = r0.i(r4)
            v.c r0 = r0.f4705f
            if (r0 != 0) goto L_0x0313
            v.d r0 = r11.f4894b
            v.d r4 = r0.f4726T
            w.k r4 = r4.f4739d
            w.f r4 = r4.f4899h
            int r0 = r0.r()
            w.o.b(r3, r4, r0)
            int r0 = r2.f4876g
            w.o.b(r1, r3, r0)
            goto L_0x0313
        L_0x017d:
            int r0 = r11.f4896d
            if (r0 != r5) goto L_0x0273
            v.d r0 = r11.f4894b
            int r8 = r0.f4763r
            r9 = 2
            if (r8 == r9) goto L_0x0254
            if (r8 == r5) goto L_0x018c
            goto L_0x0273
        L_0x018c:
            int r8 = r0.f4764s
            if (r8 != r5) goto L_0x0219
            r3.f4871a = r11
            r1.f4871a = r11
            w.m r5 = r0.e
            w.f r8 = r5.f4899h
            r8.f4871a = r11
            w.f r5 = r5.i
            r5.f4871a = r11
            r2.f4871a = r11
            boolean r0 = r0.y()
            if (r0 == 0) goto L_0x01ee
            java.util.ArrayList r0 = r2.f4880l
            v.d r5 = r11.f4894b
            w.m r5 = r5.e
            w.g r5 = r5.e
            r0.add(r5)
            v.d r0 = r11.f4894b
            w.m r0 = r0.e
            w.g r0 = r0.e
            java.util.ArrayList r0 = r0.f4879k
            r0.add(r2)
            v.d r0 = r11.f4894b
            w.m r0 = r0.e
            w.g r5 = r0.e
            r5.f4871a = r11
            java.util.ArrayList r5 = r2.f4880l
            w.f r0 = r0.f4899h
            r5.add(r0)
            java.util.ArrayList r0 = r2.f4880l
            v.d r5 = r11.f4894b
            w.m r5 = r5.e
            w.f r5 = r5.i
            r0.add(r5)
            v.d r0 = r11.f4894b
            w.m r0 = r0.e
            w.f r0 = r0.f4899h
            java.util.ArrayList r0 = r0.f4879k
            r0.add(r2)
            v.d r0 = r11.f4894b
            w.m r0 = r0.e
            w.f r0 = r0.i
            java.util.ArrayList r0 = r0.f4879k
            r0.add(r2)
            goto L_0x0273
        L_0x01ee:
            v.d r0 = r11.f4894b
            boolean r0 = r0.x()
            if (r0 == 0) goto L_0x020d
            v.d r0 = r11.f4894b
            w.m r0 = r0.e
            w.g r0 = r0.e
            java.util.ArrayList r0 = r0.f4880l
            r0.add(r2)
            java.util.ArrayList r0 = r2.f4879k
            v.d r5 = r11.f4894b
            w.m r5 = r5.e
            w.g r5 = r5.e
            r0.add(r5)
            goto L_0x0273
        L_0x020d:
            v.d r0 = r11.f4894b
            w.m r0 = r0.e
            w.g r0 = r0.e
            java.util.ArrayList r0 = r0.f4880l
            r0.add(r2)
            goto L_0x0273
        L_0x0219:
            w.m r0 = r0.e
            w.g r0 = r0.e
            java.util.ArrayList r5 = r2.f4880l
            r5.add(r0)
            java.util.ArrayList r0 = r0.f4879k
            r0.add(r2)
            v.d r0 = r11.f4894b
            w.m r0 = r0.e
            w.f r0 = r0.f4899h
            java.util.ArrayList r0 = r0.f4879k
            r0.add(r2)
            v.d r0 = r11.f4894b
            w.m r0 = r0.e
            w.f r0 = r0.i
            java.util.ArrayList r0 = r0.f4879k
            r0.add(r2)
            r2.f4872b = r4
            java.util.ArrayList r0 = r2.f4879k
            r0.add(r3)
            java.util.ArrayList r0 = r2.f4879k
            r0.add(r1)
            java.util.ArrayList r0 = r3.f4880l
            r0.add(r2)
            java.util.ArrayList r0 = r1.f4880l
            r0.add(r2)
            goto L_0x0273
        L_0x0254:
            v.d r0 = r0.f4726T
            if (r0 != 0) goto L_0x0259
            goto L_0x0273
        L_0x0259:
            w.m r0 = r0.e
            w.g r0 = r0.e
            java.util.ArrayList r5 = r2.f4880l
            r5.add(r0)
            java.util.ArrayList r0 = r0.f4879k
            r0.add(r2)
            r2.f4872b = r4
            java.util.ArrayList r0 = r2.f4879k
            r0.add(r3)
            java.util.ArrayList r0 = r2.f4879k
            r0.add(r1)
        L_0x0273:
            v.d r0 = r11.f4894b
            v.c[] r5 = r0.f4723Q
            r8 = r5[r7]
            v.c r9 = r8.f4705f
            if (r9 == 0) goto L_0x02c5
            r10 = r5[r4]
            v.c r10 = r10.f4705f
            if (r10 == 0) goto L_0x02c5
            boolean r0 = r0.x()
            if (r0 == 0) goto L_0x02a4
            v.d r0 = r11.f4894b
            v.c[] r0 = r0.f4723Q
            r0 = r0[r7]
            int r0 = r0.e()
            r3.f4875f = r0
            v.d r0 = r11.f4894b
            v.c[] r0 = r0.f4723Q
            r0 = r0[r4]
            int r0 = r0.e()
            int r0 = -r0
            r1.f4875f = r0
            goto L_0x0313
        L_0x02a4:
            v.d r0 = r11.f4894b
            v.c[] r0 = r0.f4723Q
            r0 = r0[r7]
            w.f r0 = w.o.h(r0)
            v.d r1 = r11.f4894b
            v.c[] r1 = r1.f4723Q
            r1 = r1[r4]
            w.f r1 = w.o.h(r1)
            if (r0 == 0) goto L_0x02bd
            r0.b(r11)
        L_0x02bd:
            if (r1 == 0) goto L_0x02c2
            r1.b(r11)
        L_0x02c2:
            r11.f4900j = r6
            goto L_0x0313
        L_0x02c5:
            if (r9 == 0) goto L_0x02de
            w.f r0 = w.o.h(r8)
            if (r0 == 0) goto L_0x0313
            v.d r5 = r11.f4894b
            v.c[] r5 = r5.f4723Q
            r5 = r5[r7]
            int r5 = r5.e()
            w.o.b(r3, r0, r5)
            r11.c(r1, r3, r4, r2)
            goto L_0x0313
        L_0x02de:
            r5 = r5[r4]
            v.c r6 = r5.f4705f
            if (r6 == 0) goto L_0x02fd
            w.f r0 = w.o.h(r5)
            if (r0 == 0) goto L_0x0313
            v.d r5 = r11.f4894b
            v.c[] r5 = r5.f4723Q
            r4 = r5[r4]
            int r4 = r4.e()
            int r4 = -r4
            w.o.b(r1, r0, r4)
            r0 = -1
            r11.c(r3, r1, r0, r2)
            goto L_0x0313
        L_0x02fd:
            boolean r5 = r0 instanceof v.i
            if (r5 != 0) goto L_0x0313
            v.d r5 = r0.f4726T
            if (r5 == 0) goto L_0x0313
            w.k r5 = r5.f4739d
            w.f r5 = r5.f4899h
            int r0 = r0.r()
            w.o.b(r3, r5, r0)
            r11.c(r1, r3, r4, r2)
        L_0x0313:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.k.d():void");
    }

    public final void e() {
        f fVar = this.f4899h;
        if (fVar.f4878j) {
            this.f4894b.f4731Y = fVar.f4876g;
        }
    }

    public final boolean k() {
        if (this.f4896d != 3 || this.f4894b.f4763r == 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f4894b.f4747h0;
    }
}
