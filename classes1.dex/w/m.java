package w;

import t.C0339e;
import v.C0347d;

public final class m extends o {

    /* renamed from: k  reason: collision with root package name */
    public f f4886k;

    /* renamed from: l  reason: collision with root package name */
    public C0350a f4887l;

    public final void f() {
        this.f4895c = null;
        this.f4899h.c();
        this.i.c();
        this.f4886k.c();
        this.e.c();
        this.f4898g = false;
    }

    public final void m() {
        this.f4898g = false;
        f fVar = this.f4899h;
        fVar.c();
        fVar.f4878j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.f4878j = false;
        f fVar3 = this.f4886k;
        fVar3.c();
        fVar3.f4878j = false;
        this.e.f4878j = false;
    }

    public final void a(d dVar) {
        int i;
        float f2;
        float f3;
        float f4;
        if (C0339e.a(this.f4900j) != 3) {
            g gVar = this.e;
            if (gVar.f4873c && !gVar.f4878j && this.f4896d == 3) {
                C0347d dVar2 = this.f4894b;
                int i2 = dVar2.f4764s;
                if (i2 == 2) {
                    C0347d dVar3 = dVar2.f4726T;
                    if (dVar3 != null) {
                        g gVar2 = dVar3.e.e;
                        if (gVar2.f4878j) {
                            gVar.d((int) ((((float) gVar2.f4876g) * dVar2.f4771z) + 0.5f));
                        }
                    }
                } else if (i2 == 3) {
                    g gVar3 = dVar2.f4739d.e;
                    if (gVar3.f4878j) {
                        int i3 = dVar2.f4730X;
                        if (i3 == -1) {
                            f2 = (float) gVar3.f4876g;
                            f3 = dVar2.f4729W;
                        } else if (i3 == 0) {
                            f4 = ((float) gVar3.f4876g) * dVar2.f4729W;
                            i = (int) (f4 + 0.5f);
                            gVar.d(i);
                        } else if (i3 != 1) {
                            i = 0;
                            gVar.d(i);
                        } else {
                            f2 = (float) gVar3.f4876g;
                            f3 = dVar2.f4729W;
                        }
                        f4 = f2 / f3;
                        i = (int) (f4 + 0.5f);
                        gVar.d(i);
                    }
                }
            }
            f fVar = this.f4899h;
            if (fVar.f4873c) {
                f fVar2 = this.i;
                if (fVar2.f4873c) {
                    if (!fVar.f4878j || !fVar2.f4878j || !gVar.f4878j) {
                        if (!gVar.f4878j && this.f4896d == 3) {
                            C0347d dVar4 = this.f4894b;
                            if (dVar4.f4763r == 0 && !dVar4.y()) {
                                int i4 = ((f) fVar.f4880l.get(0)).f4876g + fVar.f4875f;
                                int i5 = ((f) fVar2.f4880l.get(0)).f4876g + fVar2.f4875f;
                                fVar.d(i4);
                                fVar2.d(i5);
                                gVar.d(i5 - i4);
                                return;
                            }
                        }
                        if (!gVar.f4878j && this.f4896d == 3 && this.f4893a == 1 && fVar.f4880l.size() > 0 && fVar2.f4880l.size() > 0) {
                            int i6 = (((f) fVar2.f4880l.get(0)).f4876g + fVar2.f4875f) - (((f) fVar.f4880l.get(0)).f4876g + fVar.f4875f);
                            int i7 = gVar.f4881m;
                            if (i6 < i7) {
                                gVar.d(i6);
                            } else {
                                gVar.d(i7);
                            }
                        }
                        if (gVar.f4878j && fVar.f4880l.size() > 0 && fVar2.f4880l.size() > 0) {
                            f fVar3 = (f) fVar.f4880l.get(0);
                            f fVar4 = (f) fVar2.f4880l.get(0);
                            int i8 = fVar3.f4876g;
                            int i9 = fVar.f4875f + i8;
                            int i10 = fVar4.f4876g;
                            int i11 = fVar2.f4875f + i10;
                            float f5 = this.f4894b.f4741e0;
                            if (fVar3 == fVar4) {
                                f5 = 0.5f;
                            } else {
                                i8 = i9;
                                i10 = i11;
                            }
                            fVar.d((int) ((((float) ((i10 - i8) - gVar.f4876g)) * f5) + ((float) i8) + 0.5f));
                            fVar2.d(fVar.f4876g + gVar.f4876g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C0347d dVar5 = this.f4894b;
        l(dVar5.f4716J, dVar5.f4718L, 1);
    }

    /* JADX WARNING: type inference failed for: r0v124, types: [w.g, w.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        r0 = r14.f4894b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r14 = this;
            v.d r0 = r14.f4894b
            boolean r1 = r0.f4733a
            w.g r2 = r14.e
            if (r1 == 0) goto L_0x000f
            int r0 = r0.k()
            r2.d(r0)
        L_0x000f:
            boolean r0 = r2.f4878j
            w.f r1 = r14.i
            w.f r3 = r14.f4899h
            r4 = 3
            r5 = 1
            r6 = 4
            if (r0 != 0) goto L_0x0084
            v.d r0 = r14.f4894b
            int[] r7 = r0.f4761p0
            r7 = r7[r5]
            r14.f4896d = r7
            boolean r0 = r0.f4712E
            if (r0 == 0) goto L_0x002d
            w.a r0 = new w.a
            r0.<init>(r14)
            r14.f4887l = r0
        L_0x002d:
            int r0 = r14.f4896d
            if (r0 == r4) goto L_0x00b2
            if (r0 != r6) goto L_0x0078
            v.d r7 = r14.f4894b
            v.d r7 = r7.f4726T
            if (r7 == 0) goto L_0x0078
            int[] r8 = r7.f4761p0
            r8 = r8[r5]
            if (r8 != r5) goto L_0x0078
            int r0 = r7.k()
            v.d r4 = r14.f4894b
            v.c r4 = r4.f4716J
            int r4 = r4.e()
            int r0 = r0 - r4
            v.d r4 = r14.f4894b
            v.c r4 = r4.f4718L
            int r4 = r4.e()
            int r0 = r0 - r4
            w.m r4 = r7.e
            w.f r4 = r4.f4899h
            v.d r5 = r14.f4894b
            v.c r5 = r5.f4716J
            int r5 = r5.e()
            w.o.b(r3, r4, r5)
            w.m r3 = r7.e
            w.f r3 = r3.i
            v.d r4 = r14.f4894b
            v.c r4 = r4.f4718L
            int r4 = r4.e()
            int r4 = -r4
            w.o.b(r1, r3, r4)
            r2.d(r0)
            return
        L_0x0078:
            if (r0 != r5) goto L_0x00b2
            v.d r0 = r14.f4894b
            int r0 = r0.k()
            r2.d(r0)
            goto L_0x00b2
        L_0x0084:
            int r0 = r14.f4896d
            if (r0 != r6) goto L_0x00b2
            v.d r0 = r14.f4894b
            v.d r7 = r0.f4726T
            if (r7 == 0) goto L_0x00b2
            int[] r8 = r7.f4761p0
            r8 = r8[r5]
            if (r8 != r5) goto L_0x00b2
            w.m r2 = r7.e
            w.f r2 = r2.f4899h
            v.c r0 = r0.f4716J
            int r0 = r0.e()
            w.o.b(r3, r2, r0)
            w.m r0 = r7.e
            w.f r0 = r0.i
            v.d r2 = r14.f4894b
            v.c r2 = r2.f4718L
            int r2 = r2.e()
            int r2 = -r2
            w.o.b(r1, r0, r2)
            return
        L_0x00b2:
            boolean r0 = r2.f4878j
            w.f r7 = r14.f4886k
            r8 = 0
            r9 = 2
            if (r0 == 0) goto L_0x01d6
            v.d r10 = r14.f4894b
            boolean r11 = r10.f4733a
            if (r11 == 0) goto L_0x01d6
            v.c[] r0 = r10.f4723Q
            r11 = r0[r9]
            v.c r12 = r11.f4705f
            if (r12 == 0) goto L_0x0132
            r13 = r0[r4]
            v.c r13 = r13.f4705f
            if (r13 == 0) goto L_0x0132
            boolean r0 = r10.y()
            if (r0 == 0) goto L_0x00ee
            v.d r0 = r14.f4894b
            v.c[] r0 = r0.f4723Q
            r0 = r0[r9]
            int r0 = r0.e()
            r3.f4875f = r0
            v.d r0 = r14.f4894b
            v.c[] r0 = r0.f4723Q
            r0 = r0[r4]
            int r0 = r0.e()
            int r0 = -r0
            r1.f4875f = r0
            goto L_0x0125
        L_0x00ee:
            v.d r0 = r14.f4894b
            v.c[] r0 = r0.f4723Q
            r0 = r0[r9]
            w.f r0 = w.o.h(r0)
            if (r0 == 0) goto L_0x0107
            v.d r2 = r14.f4894b
            v.c[] r2 = r2.f4723Q
            r2 = r2[r9]
            int r2 = r2.e()
            w.o.b(r3, r0, r2)
        L_0x0107:
            v.d r0 = r14.f4894b
            v.c[] r0 = r0.f4723Q
            r0 = r0[r4]
            w.f r0 = w.o.h(r0)
            if (r0 == 0) goto L_0x0121
            v.d r2 = r14.f4894b
            v.c[] r2 = r2.f4723Q
            r2 = r2[r4]
            int r2 = r2.e()
            int r2 = -r2
            w.o.b(r1, r0, r2)
        L_0x0121:
            r3.f4872b = r5
            r1.f4872b = r5
        L_0x0125:
            v.d r0 = r14.f4894b
            boolean r1 = r0.f4712E
            if (r1 == 0) goto L_0x036c
            int r0 = r0.f4734a0
            w.o.b(r7, r3, r0)
            goto L_0x036c
        L_0x0132:
            if (r12 == 0) goto L_0x0159
            w.f r0 = w.o.h(r11)
            if (r0 == 0) goto L_0x036c
            v.d r4 = r14.f4894b
            v.c[] r4 = r4.f4723Q
            r4 = r4[r9]
            int r4 = r4.e()
            w.o.b(r3, r0, r4)
            int r0 = r2.f4876g
            w.o.b(r1, r3, r0)
            v.d r0 = r14.f4894b
            boolean r1 = r0.f4712E
            if (r1 == 0) goto L_0x036c
            int r0 = r0.f4734a0
            w.o.b(r7, r3, r0)
            goto L_0x036c
        L_0x0159:
            r5 = r0[r4]
            v.c r9 = r5.f4705f
            if (r9 == 0) goto L_0x0186
            w.f r0 = w.o.h(r5)
            if (r0 == 0) goto L_0x0179
            v.d r5 = r14.f4894b
            v.c[] r5 = r5.f4723Q
            r4 = r5[r4]
            int r4 = r4.e()
            int r4 = -r4
            w.o.b(r1, r0, r4)
            int r0 = r2.f4876g
            int r0 = -r0
            w.o.b(r3, r1, r0)
        L_0x0179:
            v.d r0 = r14.f4894b
            boolean r1 = r0.f4712E
            if (r1 == 0) goto L_0x036c
            int r0 = r0.f4734a0
            w.o.b(r7, r3, r0)
            goto L_0x036c
        L_0x0186:
            r0 = r0[r6]
            v.c r4 = r0.f4705f
            if (r4 == 0) goto L_0x01a4
            w.f r0 = w.o.h(r0)
            if (r0 == 0) goto L_0x036c
            w.o.b(r7, r0, r8)
            v.d r0 = r14.f4894b
            int r0 = r0.f4734a0
            int r0 = -r0
            w.o.b(r3, r7, r0)
            int r0 = r2.f4876g
            w.o.b(r1, r3, r0)
            goto L_0x036c
        L_0x01a4:
            boolean r0 = r10 instanceof v.i
            if (r0 != 0) goto L_0x036c
            v.d r0 = r10.f4726T
            if (r0 == 0) goto L_0x036c
            r0 = 7
            v.c r0 = r10.i(r0)
            v.c r0 = r0.f4705f
            if (r0 != 0) goto L_0x036c
            v.d r0 = r14.f4894b
            v.d r4 = r0.f4726T
            w.m r4 = r4.e
            w.f r4 = r4.f4899h
            int r0 = r0.s()
            w.o.b(r3, r4, r0)
            int r0 = r2.f4876g
            w.o.b(r1, r3, r0)
            v.d r0 = r14.f4894b
            boolean r1 = r0.f4712E
            if (r1 == 0) goto L_0x036c
            int r0 = r0.f4734a0
            w.o.b(r7, r3, r0)
            goto L_0x036c
        L_0x01d6:
            if (r0 != 0) goto L_0x022d
            int r0 = r14.f4896d
            if (r0 != r4) goto L_0x022d
            v.d r0 = r14.f4894b
            int r10 = r0.f4764s
            if (r10 == r9) goto L_0x020d
            if (r10 == r4) goto L_0x01e5
            goto L_0x0230
        L_0x01e5:
            boolean r0 = r0.y()
            if (r0 != 0) goto L_0x0230
            v.d r0 = r14.f4894b
            int r10 = r0.f4763r
            if (r10 != r4) goto L_0x01f2
            goto L_0x0230
        L_0x01f2:
            w.k r0 = r0.f4739d
            w.g r0 = r0.e
            java.util.ArrayList r10 = r2.f4880l
            r10.add(r0)
            java.util.ArrayList r0 = r0.f4879k
            r0.add(r2)
            r2.f4872b = r5
            java.util.ArrayList r0 = r2.f4879k
            r0.add(r3)
            java.util.ArrayList r0 = r2.f4879k
            r0.add(r1)
            goto L_0x0230
        L_0x020d:
            v.d r0 = r0.f4726T
            if (r0 != 0) goto L_0x0212
            goto L_0x0230
        L_0x0212:
            w.m r0 = r0.e
            w.g r0 = r0.e
            java.util.ArrayList r10 = r2.f4880l
            r10.add(r0)
            java.util.ArrayList r0 = r0.f4879k
            r0.add(r2)
            r2.f4872b = r5
            java.util.ArrayList r0 = r2.f4879k
            r0.add(r3)
            java.util.ArrayList r0 = r2.f4879k
            r0.add(r1)
            goto L_0x0230
        L_0x022d:
            r2.b(r14)
        L_0x0230:
            v.d r0 = r14.f4894b
            v.c[] r10 = r0.f4723Q
            r11 = r10[r9]
            v.c r12 = r11.f4705f
            if (r12 == 0) goto L_0x028d
            r13 = r10[r4]
            v.c r13 = r13.f4705f
            if (r13 == 0) goto L_0x028d
            boolean r0 = r0.y()
            if (r0 == 0) goto L_0x0260
            v.d r0 = r14.f4894b
            v.c[] r0 = r0.f4723Q
            r0 = r0[r9]
            int r0 = r0.e()
            r3.f4875f = r0
            v.d r0 = r14.f4894b
            v.c[] r0 = r0.f4723Q
            r0 = r0[r4]
            int r0 = r0.e()
            int r0 = -r0
            r1.f4875f = r0
            goto L_0x0280
        L_0x0260:
            v.d r0 = r14.f4894b
            v.c[] r0 = r0.f4723Q
            r0 = r0[r9]
            w.f r0 = w.o.h(r0)
            v.d r1 = r14.f4894b
            v.c[] r1 = r1.f4723Q
            r1 = r1[r4]
            w.f r1 = w.o.h(r1)
            if (r0 == 0) goto L_0x0279
            r0.b(r14)
        L_0x0279:
            if (r1 == 0) goto L_0x027e
            r1.b(r14)
        L_0x027e:
            r14.f4900j = r6
        L_0x0280:
            v.d r0 = r14.f4894b
            boolean r0 = r0.f4712E
            if (r0 == 0) goto L_0x0362
            w.a r0 = r14.f4887l
            r14.c(r7, r3, r5, r0)
            goto L_0x0362
        L_0x028d:
            r13 = 0
            if (r12 == 0) goto L_0x02d9
            w.f r0 = w.o.h(r11)
            if (r0 == 0) goto L_0x0362
            v.d r6 = r14.f4894b
            v.c[] r6 = r6.f4723Q
            r6 = r6[r9]
            int r6 = r6.e()
            w.o.b(r3, r0, r6)
            r14.c(r1, r3, r5, r2)
            v.d r0 = r14.f4894b
            boolean r0 = r0.f4712E
            if (r0 == 0) goto L_0x02b1
            w.a r0 = r14.f4887l
            r14.c(r7, r3, r5, r0)
        L_0x02b1:
            int r0 = r14.f4896d
            if (r0 != r4) goto L_0x0362
            v.d r0 = r14.f4894b
            float r1 = r0.f4729W
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x0362
            w.k r0 = r0.f4739d
            int r1 = r0.f4896d
            if (r1 != r4) goto L_0x0362
            w.g r0 = r0.e
            java.util.ArrayList r0 = r0.f4879k
            r0.add(r2)
            java.util.ArrayList r0 = r2.f4880l
            v.d r1 = r14.f4894b
            w.k r1 = r1.f4739d
            w.g r1 = r1.e
            r0.add(r1)
            r2.f4871a = r14
            goto L_0x0362
        L_0x02d9:
            r9 = r10[r4]
            v.c r11 = r9.f4705f
            r12 = -1
            if (r11 == 0) goto L_0x0303
            w.f r0 = w.o.h(r9)
            if (r0 == 0) goto L_0x0362
            v.d r6 = r14.f4894b
            v.c[] r6 = r6.f4723Q
            r4 = r6[r4]
            int r4 = r4.e()
            int r4 = -r4
            w.o.b(r1, r0, r4)
            r14.c(r3, r1, r12, r2)
            v.d r0 = r14.f4894b
            boolean r0 = r0.f4712E
            if (r0 == 0) goto L_0x0362
            w.a r0 = r14.f4887l
            r14.c(r7, r3, r5, r0)
            goto L_0x0362
        L_0x0303:
            r6 = r10[r6]
            v.c r9 = r6.f4705f
            if (r9 == 0) goto L_0x031b
            w.f r0 = w.o.h(r6)
            if (r0 == 0) goto L_0x0362
            w.o.b(r7, r0, r8)
            w.a r0 = r14.f4887l
            r14.c(r3, r7, r12, r0)
            r14.c(r1, r3, r5, r2)
            goto L_0x0362
        L_0x031b:
            boolean r6 = r0 instanceof v.i
            if (r6 != 0) goto L_0x0362
            v.d r6 = r0.f4726T
            if (r6 == 0) goto L_0x0362
            w.m r6 = r6.e
            w.f r6 = r6.f4899h
            int r0 = r0.s()
            w.o.b(r3, r6, r0)
            r14.c(r1, r3, r5, r2)
            v.d r0 = r14.f4894b
            boolean r0 = r0.f4712E
            if (r0 == 0) goto L_0x033c
            w.a r0 = r14.f4887l
            r14.c(r7, r3, r5, r0)
        L_0x033c:
            int r0 = r14.f4896d
            if (r0 != r4) goto L_0x0362
            v.d r0 = r14.f4894b
            float r1 = r0.f4729W
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x0362
            w.k r0 = r0.f4739d
            int r1 = r0.f4896d
            if (r1 != r4) goto L_0x0362
            w.g r0 = r0.e
            java.util.ArrayList r0 = r0.f4879k
            r0.add(r2)
            java.util.ArrayList r0 = r2.f4880l
            v.d r1 = r14.f4894b
            w.k r1 = r1.f4739d
            w.g r1 = r1.e
            r0.add(r1)
            r2.f4871a = r14
        L_0x0362:
            java.util.ArrayList r0 = r2.f4880l
            int r0 = r0.size()
            if (r0 != 0) goto L_0x036c
            r2.f4873c = r5
        L_0x036c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.m.d():void");
    }

    public final void e() {
        f fVar = this.f4899h;
        if (fVar.f4878j) {
            this.f4894b.f4732Z = fVar.f4876g;
        }
    }

    public final boolean k() {
        if (this.f4896d != 3 || this.f4894b.f4764s == 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "VerticalRun " + this.f4894b.f4747h0;
    }
}
