package v;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f4792a;

    /* renamed from: b  reason: collision with root package name */
    public C0347d f4793b = null;

    /* renamed from: c  reason: collision with root package name */
    public int f4794c = 0;

    /* renamed from: d  reason: collision with root package name */
    public C0346c f4795d;
    public C0346c e;

    /* renamed from: f  reason: collision with root package name */
    public C0346c f4796f;

    /* renamed from: g  reason: collision with root package name */
    public C0346c f4797g;

    /* renamed from: h  reason: collision with root package name */
    public int f4798h = 0;
    public int i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f4799j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f4800k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f4801l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f4802m = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f4803n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f4804o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f4805p = 0;

    /* renamed from: q  reason: collision with root package name */
    public int f4806q = 0;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ g f4807r;

    public final void a(C0347d dVar) {
        int i2 = this.f4792a;
        int i3 = 0;
        g gVar = this.f4807r;
        if (i2 == 0) {
            int U2 = gVar.U(dVar, this.f4806q);
            if (dVar.f4761p0[0] == 3) {
                this.f4805p++;
                U2 = 0;
            }
            int i4 = gVar.f4821P0;
            if (dVar.f4745g0 != 8) {
                i3 = i4;
            }
            this.f4801l = U2 + i3 + this.f4801l;
            int T2 = gVar.T(dVar, this.f4806q);
            if (this.f4793b == null || this.f4794c < T2) {
                this.f4793b = dVar;
                this.f4794c = T2;
                this.f4802m = T2;
            }
        } else {
            int U3 = gVar.U(dVar, this.f4806q);
            int T3 = gVar.T(dVar, this.f4806q);
            if (dVar.f4761p0[1] == 3) {
                this.f4805p++;
                T3 = 0;
            }
            int i5 = gVar.f4822Q0;
            if (dVar.f4745g0 != 8) {
                i3 = i5;
            }
            this.f4802m = T3 + i3 + this.f4802m;
            if (this.f4793b == null || this.f4794c < U3) {
                this.f4793b = dVar;
                this.f4794c = U3;
                this.f4801l = U3;
            }
        }
        this.f4804o++;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:224:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(int r21, boolean r22, boolean r23) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.f4804o
            r2 = 0
            r3 = 0
        L_0x0006:
            v.g r4 = r0.f4807r
            if (r3 >= r1) goto L_0x001e
            int r5 = r0.f4803n
            int r5 = r5 + r3
            int r6 = r4.f4832b1
            if (r5 < r6) goto L_0x0012
            goto L_0x001e
        L_0x0012:
            v.d[] r4 = r4.f4831a1
            r4 = r4[r5]
            if (r4 == 0) goto L_0x001b
            r4.D()
        L_0x001b:
            int r3 = r3 + 1
            goto L_0x0006
        L_0x001e:
            if (r1 == 0) goto L_0x02d0
            v.d r3 = r0.f4793b
            if (r3 != 0) goto L_0x0026
            goto L_0x02d0
        L_0x0026:
            if (r23 == 0) goto L_0x002c
            if (r21 != 0) goto L_0x002c
            r5 = 1
            goto L_0x002d
        L_0x002c:
            r5 = 0
        L_0x002d:
            r6 = -1
            r7 = 0
            r8 = -1
            r9 = -1
        L_0x0031:
            if (r7 >= r1) goto L_0x0053
            if (r22 == 0) goto L_0x0039
            int r10 = r1 + -1
            int r10 = r10 - r7
            goto L_0x003a
        L_0x0039:
            r10 = r7
        L_0x003a:
            int r11 = r0.f4803n
            int r11 = r11 + r10
            int r10 = r4.f4832b1
            if (r11 < r10) goto L_0x0042
            goto L_0x0053
        L_0x0042:
            v.d[] r10 = r4.f4831a1
            r10 = r10[r11]
            if (r10 == 0) goto L_0x0050
            int r10 = r10.f4745g0
            if (r10 != 0) goto L_0x0050
            if (r8 != r6) goto L_0x004f
            r8 = r7
        L_0x004f:
            r9 = r7
        L_0x0050:
            int r7 = r7 + 1
            goto L_0x0031
        L_0x0053:
            int r7 = r0.f4792a
            if (r7 != 0) goto L_0x01ad
            v.d r7 = r0.f4793b
            int r11 = r4.f4811E0
            r7.f4750j0 = r11
            int r11 = r0.i
            if (r21 <= 0) goto L_0x0064
            int r12 = r4.f4822Q0
            int r11 = r11 + r12
        L_0x0064:
            v.c r12 = r0.e
            v.c r13 = r7.f4716J
            r13.a(r12, r11)
            v.c r11 = r7.f4718L
            if (r23 == 0) goto L_0x0076
            v.c r12 = r0.f4797g
            int r14 = r0.f4800k
            r11.a(r12, r14)
        L_0x0076:
            if (r21 <= 0) goto L_0x0081
            v.c r12 = r0.e
            v.d r12 = r12.f4704d
            v.c r12 = r12.f4718L
            r12.a(r13, r2)
        L_0x0081:
            int r12 = r4.f4824S0
            r14 = 3
            if (r12 != r14) goto L_0x00a8
            boolean r12 = r7.f4712E
            if (r12 != 0) goto L_0x00a8
            r12 = 0
        L_0x008b:
            if (r12 >= r1) goto L_0x00a8
            if (r22 == 0) goto L_0x0093
            int r15 = r1 + -1
            int r15 = r15 - r12
            goto L_0x0094
        L_0x0093:
            r15 = r12
        L_0x0094:
            int r10 = r0.f4803n
            int r10 = r10 + r15
            int r15 = r4.f4832b1
            if (r10 < r15) goto L_0x009c
            goto L_0x00a8
        L_0x009c:
            v.d[] r15 = r4.f4831a1
            r10 = r15[r10]
            boolean r15 = r10.f4712E
            if (r15 == 0) goto L_0x00a5
            goto L_0x00a9
        L_0x00a5:
            int r12 = r12 + 1
            goto L_0x008b
        L_0x00a8:
            r10 = r7
        L_0x00a9:
            r12 = 0
            r15 = 0
        L_0x00ab:
            if (r15 >= r1) goto L_0x02d0
            if (r22 == 0) goto L_0x00b4
            int r16 = r1 + -1
            int r16 = r16 - r15
            goto L_0x00b6
        L_0x00b4:
            r16 = r15
        L_0x00b6:
            int r14 = r0.f4803n
            int r14 = r14 + r16
            int r3 = r4.f4832b1
            if (r14 < r3) goto L_0x00c0
            goto L_0x02d0
        L_0x00c0:
            v.d[] r3 = r4.f4831a1
            r3 = r3[r14]
            if (r3 != 0) goto L_0x00cb
            r17 = r1
            r2 = 3
            goto L_0x01a4
        L_0x00cb:
            v.c r14 = r3.I
            if (r15 != 0) goto L_0x00d6
            v.c r2 = r0.f4795d
            int r6 = r0.f4798h
            r3.f(r14, r2, r6)
        L_0x00d6:
            if (r16 != 0) goto L_0x0122
            int r2 = r4.f4810D0
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r22 == 0) goto L_0x00e5
            r16 = r2
            float r2 = r4.f4815J0
            float r2 = r6 - r2
            goto L_0x00e9
        L_0x00e5:
            r16 = r2
            float r2 = r4.f4815J0
        L_0x00e9:
            int r6 = r0.f4803n
            if (r6 != 0) goto L_0x0105
            int r6 = r4.F0
            r18 = r2
            r2 = -1
            if (r6 == r2) goto L_0x0107
            if (r22 == 0) goto L_0x00fd
            float r2 = r4.f4817L0
            r16 = 1065353216(0x3f800000, float:1.0)
            float r2 = r16 - r2
            goto L_0x00ff
        L_0x00fd:
            float r2 = r4.f4817L0
        L_0x00ff:
            r19 = r6
            r6 = r2
            r2 = r19
            goto L_0x011e
        L_0x0105:
            r18 = r2
        L_0x0107:
            if (r23 == 0) goto L_0x011a
            int r2 = r4.f4813H0
            r6 = -1
            if (r2 == r6) goto L_0x011a
            if (r22 == 0) goto L_0x0117
            float r6 = r4.f4819N0
            r16 = 1065353216(0x3f800000, float:1.0)
            float r6 = r16 - r6
            goto L_0x011e
        L_0x0117:
            float r6 = r4.f4819N0
            goto L_0x011e
        L_0x011a:
            r2 = r16
            r6 = r18
        L_0x011e:
            r3.f4748i0 = r2
            r3.f4740d0 = r6
        L_0x0122:
            int r2 = r1 + -1
            if (r15 != r2) goto L_0x0132
            v.c r2 = r0.f4796f
            int r6 = r0.f4799j
            r17 = r1
            v.c r1 = r3.f4717K
            r3.f(r1, r2, r6)
            goto L_0x0134
        L_0x0132:
            r17 = r1
        L_0x0134:
            if (r12 == 0) goto L_0x015c
            int r1 = r4.f4821P0
            v.c r2 = r12.f4717K
            r14.a(r2, r1)
            if (r15 != r8) goto L_0x0149
            int r1 = r0.f4798h
            boolean r6 = r14.h()
            if (r6 == 0) goto L_0x0149
            r14.f4707h = r1
        L_0x0149:
            r1 = 0
            r2.a(r14, r1)
            r1 = 1
            int r6 = r9 + 1
            if (r15 != r6) goto L_0x015c
            int r1 = r0.f4799j
            boolean r6 = r2.h()
            if (r6 == 0) goto L_0x015c
            r2.f4707h = r1
        L_0x015c:
            if (r3 == r7) goto L_0x01a2
            int r1 = r4.f4824S0
            r2 = 3
            if (r1 != r2) goto L_0x0176
            boolean r6 = r10.f4712E
            if (r6 == 0) goto L_0x0176
            if (r3 == r10) goto L_0x0176
            boolean r6 = r3.f4712E
            if (r6 == 0) goto L_0x0176
            v.c r1 = r3.f4719M
            v.c r6 = r10.f4719M
            r12 = 0
            r1.a(r6, r12)
            goto L_0x01a3
        L_0x0176:
            v.c r6 = r3.f4716J
            if (r1 == 0) goto L_0x019d
            v.c r12 = r3.f4718L
            r14 = 1
            if (r1 == r14) goto L_0x0198
            if (r5 == 0) goto L_0x0190
            v.c r1 = r0.e
            int r14 = r0.i
            r6.a(r1, r14)
            v.c r1 = r0.f4797g
            int r6 = r0.f4800k
            r12.a(r1, r6)
            goto L_0x01a3
        L_0x0190:
            r1 = 0
            r6.a(r13, r1)
            r12.a(r11, r1)
            goto L_0x01a3
        L_0x0198:
            r1 = 0
            r12.a(r11, r1)
            goto L_0x01a3
        L_0x019d:
            r1 = 0
            r6.a(r13, r1)
            goto L_0x01a3
        L_0x01a2:
            r2 = 3
        L_0x01a3:
            r12 = r3
        L_0x01a4:
            int r15 = r15 + 1
            r1 = r17
            r2 = 0
            r6 = -1
            r14 = 3
            goto L_0x00ab
        L_0x01ad:
            r17 = r1
            v.d r1 = r0.f4793b
            int r2 = r4.f4810D0
            r1.f4748i0 = r2
            int r2 = r0.f4798h
            if (r21 <= 0) goto L_0x01bc
            int r3 = r4.f4821P0
            int r2 = r2 + r3
        L_0x01bc:
            v.c r3 = r1.I
            v.c r6 = r1.f4717K
            if (r22 == 0) goto L_0x01dd
            v.c r7 = r0.f4796f
            r6.a(r7, r2)
            if (r23 == 0) goto L_0x01d0
            v.c r2 = r0.f4795d
            int r7 = r0.f4799j
            r3.a(r2, r7)
        L_0x01d0:
            if (r21 <= 0) goto L_0x01f7
            v.c r2 = r0.f4796f
            v.d r2 = r2.f4704d
            v.c r2 = r2.I
            r7 = 0
            r2.a(r6, r7)
            goto L_0x01f7
        L_0x01dd:
            v.c r7 = r0.f4795d
            r3.a(r7, r2)
            if (r23 == 0) goto L_0x01eb
            v.c r2 = r0.f4796f
            int r7 = r0.f4799j
            r6.a(r2, r7)
        L_0x01eb:
            if (r21 <= 0) goto L_0x01f7
            v.c r2 = r0.f4795d
            v.d r2 = r2.f4704d
            v.c r2 = r2.f4717K
            r7 = 0
            r2.a(r3, r7)
        L_0x01f7:
            r7 = r17
            r2 = 0
            r10 = 0
        L_0x01fb:
            if (r2 >= r7) goto L_0x02d0
            int r11 = r0.f4803n
            int r11 = r11 + r2
            int r12 = r4.f4832b1
            if (r11 < r12) goto L_0x0206
            goto L_0x02d0
        L_0x0206:
            v.d[] r12 = r4.f4831a1
            r11 = r12[r11]
            if (r11 != 0) goto L_0x0210
            r13 = 0
            r15 = 1
            goto L_0x02cc
        L_0x0210:
            v.c r12 = r11.f4716J
            if (r2 != 0) goto L_0x0240
            v.c r13 = r0.e
            int r14 = r0.i
            r11.f(r12, r13, r14)
            int r13 = r4.f4811E0
            float r14 = r4.f4816K0
            int r15 = r0.f4803n
            if (r15 != 0) goto L_0x022d
            int r15 = r4.f4812G0
            r16 = r13
            r13 = -1
            if (r15 == r13) goto L_0x0230
            float r14 = r4.f4818M0
            goto L_0x023b
        L_0x022d:
            r16 = r13
            r13 = -1
        L_0x0230:
            if (r23 == 0) goto L_0x0239
            int r15 = r4.f4814I0
            if (r15 == r13) goto L_0x0239
            float r14 = r4.f4820O0
            goto L_0x023b
        L_0x0239:
            r15 = r16
        L_0x023b:
            r11.f4750j0 = r15
            r11.f4741e0 = r14
            goto L_0x0241
        L_0x0240:
            r13 = -1
        L_0x0241:
            int r14 = r7 + -1
            if (r2 != r14) goto L_0x024e
            v.c r14 = r0.f4797g
            int r15 = r0.f4800k
            v.c r13 = r11.f4718L
            r11.f(r13, r14, r15)
        L_0x024e:
            if (r10 == 0) goto L_0x0276
            int r13 = r4.f4822Q0
            v.c r10 = r10.f4718L
            r12.a(r10, r13)
            if (r2 != r8) goto L_0x0263
            int r13 = r0.i
            boolean r14 = r12.h()
            if (r14 == 0) goto L_0x0263
            r12.f4707h = r13
        L_0x0263:
            r13 = 0
            r10.a(r12, r13)
            r12 = 1
            int r13 = r9 + 1
            if (r2 != r13) goto L_0x0276
            int r12 = r0.f4800k
            boolean r13 = r10.h()
            if (r13 == 0) goto L_0x0276
            r10.f4707h = r12
        L_0x0276:
            if (r11 == r1) goto L_0x029a
            v.c r10 = r11.f4717K
            v.c r12 = r11.I
            r13 = 2
            if (r22 == 0) goto L_0x029d
            int r14 = r4.f4823R0
            if (r14 == 0) goto L_0x0296
            r15 = 1
            if (r14 == r15) goto L_0x0291
            if (r14 == r13) goto L_0x0289
            goto L_0x029a
        L_0x0289:
            r13 = 0
            r12.a(r3, r13)
            r10.a(r6, r13)
            goto L_0x029a
        L_0x0291:
            r13 = 0
            r12.a(r3, r13)
            goto L_0x029a
        L_0x0296:
            r13 = 0
            r10.a(r6, r13)
        L_0x029a:
            r13 = 0
            r15 = 1
            goto L_0x02cb
        L_0x029d:
            int r14 = r4.f4823R0
            if (r14 == 0) goto L_0x02c6
            r15 = 1
            if (r14 == r15) goto L_0x02c1
            if (r14 == r13) goto L_0x02a8
        L_0x02a6:
            r13 = 0
            goto L_0x02cb
        L_0x02a8:
            if (r5 == 0) goto L_0x02b9
            v.c r13 = r0.f4795d
            int r14 = r0.f4798h
            r12.a(r13, r14)
            v.c r12 = r0.f4796f
            int r13 = r0.f4799j
            r10.a(r12, r13)
            goto L_0x02a6
        L_0x02b9:
            r13 = 0
            r12.a(r3, r13)
            r10.a(r6, r13)
            goto L_0x02cb
        L_0x02c1:
            r13 = 0
            r10.a(r6, r13)
            goto L_0x02cb
        L_0x02c6:
            r13 = 0
            r15 = 1
            r12.a(r3, r13)
        L_0x02cb:
            r10 = r11
        L_0x02cc:
            int r2 = r2 + 1
            goto L_0x01fb
        L_0x02d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.f.b(int, boolean, boolean):void");
    }

    public final int c() {
        if (this.f4792a == 1) {
            return this.f4802m - this.f4807r.f4822Q0;
        }
        return this.f4802m;
    }

    public final int d() {
        if (this.f4792a == 0) {
            return this.f4801l - this.f4807r.f4821P0;
        }
        return this.f4801l;
    }

    public final void e(int i2) {
        g gVar;
        int i3;
        int i4 = this.f4805p;
        if (i4 != 0) {
            int i5 = this.f4804o;
            int i6 = i2 / i4;
            int i7 = 0;
            while (true) {
                gVar = this.f4807r;
                if (i7 >= i5 || (i3 = this.f4803n + i7) >= gVar.f4832b1) {
                    this.f4801l = 0;
                    this.f4802m = 0;
                    this.f4793b = null;
                    this.f4794c = 0;
                    int i8 = this.f4804o;
                    int i9 = 0;
                } else {
                    C0347d dVar = gVar.f4831a1[i3];
                    if (this.f4792a == 0) {
                        if (dVar != null) {
                            int[] iArr = dVar.f4761p0;
                            if (iArr[0] == 3 && dVar.f4763r == 0) {
                                gVar.V(1, i6, iArr[1], dVar.k(), dVar);
                            }
                        }
                    } else if (dVar != null) {
                        int[] iArr2 = dVar.f4761p0;
                        if (iArr2[1] == 3 && dVar.f4764s == 0) {
                            gVar.V(iArr2[0], dVar.q(), 1, i6, dVar);
                        }
                    }
                    i7++;
                }
            }
            this.f4801l = 0;
            this.f4802m = 0;
            this.f4793b = null;
            this.f4794c = 0;
            int i82 = this.f4804o;
            int i92 = 0;
            while (i92 < i82) {
                int i10 = this.f4803n + i92;
                if (i10 < gVar.f4832b1) {
                    C0347d dVar2 = gVar.f4831a1[i10];
                    if (this.f4792a == 0) {
                        int q2 = dVar2.q();
                        int i11 = gVar.f4821P0;
                        if (dVar2.f4745g0 == 8) {
                            i11 = 0;
                        }
                        this.f4801l = q2 + i11 + this.f4801l;
                        int T2 = gVar.T(dVar2, this.f4806q);
                        if (this.f4793b == null || this.f4794c < T2) {
                            this.f4793b = dVar2;
                            this.f4794c = T2;
                            this.f4802m = T2;
                        }
                    } else {
                        int U2 = gVar.U(dVar2, this.f4806q);
                        int T3 = gVar.T(dVar2, this.f4806q);
                        int i12 = gVar.f4822Q0;
                        if (dVar2.f4745g0 == 8) {
                            i12 = 0;
                        }
                        this.f4802m = T3 + i12 + this.f4802m;
                        if (this.f4793b == null || this.f4794c < U2) {
                            this.f4793b = dVar2;
                            this.f4794c = U2;
                            this.f4801l = U2;
                        }
                    }
                    i92++;
                } else {
                    return;
                }
            }
        }
    }

    public final void f(int i2, C0346c cVar, C0346c cVar2, C0346c cVar3, C0346c cVar4, int i3, int i4, int i5, int i6, int i7) {
        this.f4792a = i2;
        this.f4795d = cVar;
        this.e = cVar2;
        this.f4796f = cVar3;
        this.f4797g = cVar4;
        this.f4798h = i3;
        this.i = i4;
        this.f4799j = i5;
        this.f4800k = i6;
        this.f4806q = i7;
    }

    public f(g gVar, int i2, C0346c cVar, C0346c cVar2, C0346c cVar3, C0346c cVar4, int i3) {
        this.f4807r = gVar;
        this.f4792a = i2;
        this.f4795d = cVar;
        this.e = cVar2;
        this.f4796f = cVar3;
        this.f4797g = cVar4;
        this.f4798h = gVar.f4837w0;
        this.i = gVar.f4833s0;
        this.f4799j = gVar.f4838x0;
        this.f4800k = gVar.f4834t0;
        this.f4806q = i3;
    }
}
