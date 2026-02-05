package t;

import E.j;
import M.c;
import android.support.v4.media.session.t;
import java.util.Arrays;
import v.C0346c;

/* renamed from: t.c  reason: case insensitive filesystem */
public final class C0337c {

    /* renamed from: q  reason: collision with root package name */
    public static boolean f4648q;

    /* renamed from: a  reason: collision with root package name */
    public int f4649a = 1000;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4650b = false;

    /* renamed from: c  reason: collision with root package name */
    public int f4651c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final C0338d f4652d;
    public int e = 32;

    /* renamed from: f  reason: collision with root package name */
    public int f4653f = 32;

    /* renamed from: g  reason: collision with root package name */
    public C0336b[] f4654g = new C0336b[32];

    /* renamed from: h  reason: collision with root package name */
    public boolean f4655h = false;
    public boolean[] i = new boolean[32];

    /* renamed from: j  reason: collision with root package name */
    public int f4656j = 1;

    /* renamed from: k  reason: collision with root package name */
    public int f4657k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f4658l = 32;

    /* renamed from: m  reason: collision with root package name */
    public final t f4659m;

    /* renamed from: n  reason: collision with root package name */
    public C0340f[] f4660n = new C0340f[1000];

    /* renamed from: o  reason: collision with root package name */
    public int f4661o = 0;

    /* renamed from: p  reason: collision with root package name */
    public C0336b f4662p;

    public final void i() {
        for (int i2 = 0; i2 < this.f4657k; i2++) {
            C0336b bVar = this.f4654g[i2];
            bVar.f4644a.e = bVar.f4645b;
        }
    }

    public final C0340f k(Object obj) {
        C0340f fVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f4656j + 1 >= this.f4653f) {
            o();
        }
        if (obj instanceof C0346c) {
            C0346c cVar = (C0346c) obj;
            fVar = cVar.i;
            if (fVar == null) {
                cVar.k();
                fVar = cVar.i;
            }
            int i2 = fVar.f4668b;
            t tVar = this.f4659m;
            if (i2 == -1 || i2 > this.f4651c || ((C0340f[]) tVar.f1133d)[i2] == null) {
                if (i2 != -1) {
                    fVar.c();
                }
                int i3 = this.f4651c + 1;
                this.f4651c = i3;
                this.f4656j++;
                fVar.f4668b = i3;
                fVar.f4676l = 1;
                ((C0340f[]) tVar.f1133d)[i3] = fVar;
            }
        }
        return fVar;
    }

    public final void s() {
        for (int i2 = 0; i2 < this.f4657k; i2++) {
            C0336b bVar = this.f4654g[i2];
            if (bVar != null) {
                ((c) this.f4659m.f1131b).b(bVar);
            }
            this.f4654g[i2] = null;
        }
    }

    public final void t() {
        t tVar;
        int i2 = 0;
        while (true) {
            tVar = this.f4659m;
            C0340f[] fVarArr = (C0340f[]) tVar.f1133d;
            if (i2 >= fVarArr.length) {
                break;
            }
            C0340f fVar = fVarArr[i2];
            if (fVar != null) {
                fVar.c();
            }
            i2++;
        }
        c cVar = (c) tVar.f1132c;
        C0340f[] fVarArr2 = this.f4660n;
        int i3 = this.f4661o;
        cVar.getClass();
        if (i3 > fVarArr2.length) {
            i3 = fVarArr2.length;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            C0340f fVar2 = fVarArr2[i4];
            int i5 = cVar.f482b;
            Object[] objArr = cVar.f481a;
            if (i5 < objArr.length) {
                objArr[i5] = fVar2;
                cVar.f482b = i5 + 1;
            }
        }
        this.f4661o = 0;
        Arrays.fill((C0340f[]) tVar.f1133d, (Object) null);
        this.f4651c = 0;
        C0338d dVar = this.f4652d;
        dVar.f4665h = 0;
        dVar.f4645b = 0.0f;
        this.f4656j = 1;
        for (int i6 = 0; i6 < this.f4657k; i6++) {
            C0336b bVar = this.f4654g[i6];
        }
        s();
        this.f4657k = 0;
        this.f4662p = new C0336b(tVar);
    }

    public static int n(Object obj) {
        C0340f fVar = ((C0346c) obj).i;
        if (fVar != null) {
            return (int) (fVar.e + 0.5f);
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: t.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final t.C0340f a(int r6) {
        /*
            r5 = this;
            android.support.v4.media.session.t r0 = r5.f4659m
            java.lang.Object r0 = r0.f1132c
            M.c r0 = (M.c) r0
            int r1 = r0.f482b
            r2 = 0
            if (r1 <= 0) goto L_0x0016
            int r1 = r1 + -1
            java.lang.Object[] r3 = r0.f481a
            r4 = r3[r1]
            r3[r1] = r2
            r0.f482b = r1
            r2 = r4
        L_0x0016:
            t.f r2 = (t.C0340f) r2
            if (r2 != 0) goto L_0x0022
            t.f r2 = new t.f
            r2.<init>(r6)
            r2.f4676l = r6
            goto L_0x0027
        L_0x0022:
            r2.c()
            r2.f4676l = r6
        L_0x0027:
            int r6 = r5.f4661o
            int r0 = r5.f4649a
            if (r6 < r0) goto L_0x003b
            int r0 = r0 * 2
            r5.f4649a = r0
            t.f[] r6 = r5.f4660n
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            t.f[] r6 = (t.C0340f[]) r6
            r5.f4660n = r6
        L_0x003b:
            t.f[] r6 = r5.f4660n
            int r0 = r5.f4661o
            int r1 = r0 + 1
            r5.f4661o = r1
            r6[r0] = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C0337c.a(int):t.f");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d2, code lost:
        if (r4.f4675k <= 1) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d6, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e0, code lost:
        if (r4.f4675k <= 1) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00f7, code lost:
        if (r4.f4675k <= 1) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00fb, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0105, code lost:
        if (r4.f4675k <= 1) goto L_0x00f9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:147:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(t.C0336b r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.f4657k
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.f4658l
            if (r2 >= r4) goto L_0x0013
            int r2 = r0.f4656j
            int r2 = r2 + r3
            int r4 = r0.f4653f
            if (r2 < r4) goto L_0x0016
        L_0x0013:
            r16.o()
        L_0x0016:
            boolean r2 = r1.e
            if (r2 != 0) goto L_0x01c4
            t.b[] r2 = r0.f4654g
            int r2 = r2.length
            r5 = -1
            if (r2 != 0) goto L_0x0021
            goto L_0x007d
        L_0x0021:
            r2 = 0
        L_0x0022:
            if (r2 != 0) goto L_0x006d
            t.a r6 = r1.f4647d
            int r6 = r6.d()
            r7 = 0
        L_0x002b:
            java.util.ArrayList r8 = r1.f4646c
            if (r7 >= r6) goto L_0x0044
            t.a r9 = r1.f4647d
            t.f r9 = r9.e(r7)
            int r10 = r9.f4669c
            if (r10 != r5) goto L_0x003e
            boolean r10 = r9.f4671f
            if (r10 != 0) goto L_0x003e
            goto L_0x0041
        L_0x003e:
            r8.add(r9)
        L_0x0041:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x0044:
            int r6 = r8.size()
            if (r6 <= 0) goto L_0x006b
            r7 = 0
        L_0x004b:
            if (r7 >= r6) goto L_0x0067
            java.lang.Object r9 = r8.get(r7)
            t.f r9 = (t.C0340f) r9
            boolean r10 = r9.f4671f
            if (r10 == 0) goto L_0x005b
            r1.h(r0, r9, r3)
            goto L_0x0064
        L_0x005b:
            t.b[] r10 = r0.f4654g
            int r9 = r9.f4669c
            r9 = r10[r9]
            r1.i(r0, r9, r3)
        L_0x0064:
            int r7 = r7 + 1
            goto L_0x004b
        L_0x0067:
            r8.clear()
            goto L_0x0022
        L_0x006b:
            r2 = 1
            goto L_0x0022
        L_0x006d:
            t.f r2 = r1.f4644a
            if (r2 == 0) goto L_0x007d
            t.a r2 = r1.f4647d
            int r2 = r2.d()
            if (r2 != 0) goto L_0x007d
            r1.e = r3
            r0.f4650b = r3
        L_0x007d:
            boolean r2 = r17.e()
            if (r2 == 0) goto L_0x0084
            return
        L_0x0084:
            float r2 = r1.f4645b
            r6 = 0
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x00ae
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r7
            r1.f4645b = r2
            t.a r2 = r1.f4647d
            int r7 = r2.f4642h
            r8 = 0
        L_0x0096:
            r9 = -1
            if (r7 == r9) goto L_0x00ae
            int r9 = r2.f4636a
            if (r8 >= r9) goto L_0x00ae
            float[] r9 = r2.f4641g
            r10 = r9[r7]
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r10 = r10 * r11
            r9[r7] = r10
            int[] r9 = r2.f4640f
            r7 = r9[r7]
            int r8 = r8 + 1
            goto L_0x0096
        L_0x00ae:
            t.a r2 = r1.f4647d
            int r2 = r2.d()
            r7 = 0
            r9 = r7
            r10 = r9
            r8 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x00bc:
            if (r8 >= r2) goto L_0x0115
            t.a r15 = r1.f4647d
            float r15 = r15.f(r8)
            t.a r4 = r1.f4647d
            t.f r4 = r4.e(r8)
            int r5 = r4.f4676l
            if (r5 != r3) goto L_0x00ed
            if (r9 != 0) goto L_0x00da
            int r5 = r4.f4675k
            if (r5 > r3) goto L_0x00d6
        L_0x00d4:
            r12 = 1
            goto L_0x00d7
        L_0x00d6:
            r12 = 0
        L_0x00d7:
            r9 = r4
            r11 = r15
            goto L_0x0111
        L_0x00da:
            int r5 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00e3
            int r5 = r4.f4675k
            if (r5 > r3) goto L_0x00d6
            goto L_0x00d4
        L_0x00e3:
            if (r12 != 0) goto L_0x0111
            int r5 = r4.f4675k
            if (r5 > r3) goto L_0x0111
            r9 = r4
            r11 = r15
            r12 = 1
            goto L_0x0111
        L_0x00ed:
            if (r9 != 0) goto L_0x0111
            int r5 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0111
            if (r10 != 0) goto L_0x00ff
            int r5 = r4.f4675k
            if (r5 > r3) goto L_0x00fb
        L_0x00f9:
            r14 = 1
            goto L_0x00fc
        L_0x00fb:
            r14 = 0
        L_0x00fc:
            r10 = r4
            r13 = r15
            goto L_0x0111
        L_0x00ff:
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x0108
            int r5 = r4.f4675k
            if (r5 > r3) goto L_0x00fb
            goto L_0x00f9
        L_0x0108:
            if (r14 != 0) goto L_0x0111
            int r5 = r4.f4675k
            if (r5 > r3) goto L_0x0111
            r10 = r4
            r13 = r15
            r14 = 1
        L_0x0111:
            int r8 = r8 + 1
            r5 = -1
            goto L_0x00bc
        L_0x0115:
            if (r9 == 0) goto L_0x0118
            goto L_0x0119
        L_0x0118:
            r9 = r10
        L_0x0119:
            if (r9 != 0) goto L_0x011d
            r2 = 1
            goto L_0x0121
        L_0x011d:
            r1.g(r9)
            r2 = 0
        L_0x0121:
            t.a r4 = r1.f4647d
            int r4 = r4.d()
            if (r4 != 0) goto L_0x012b
            r1.e = r3
        L_0x012b:
            if (r2 == 0) goto L_0x01b3
            int r2 = r0.f4656j
            int r2 = r2 + r3
            int r4 = r0.f4653f
            if (r2 < r4) goto L_0x0137
            r16.o()
        L_0x0137:
            r2 = 3
            t.f r2 = r0.a(r2)
            int r4 = r0.f4651c
            int r4 = r4 + r3
            r0.f4651c = r4
            int r5 = r0.f4656j
            int r5 = r5 + r3
            r0.f4656j = r5
            r2.f4668b = r4
            android.support.v4.media.session.t r5 = r0.f4659m
            java.lang.Object r8 = r5.f1133d
            t.f[] r8 = (t.C0340f[]) r8
            r8[r4] = r2
            r1.f4644a = r2
            int r4 = r0.f4657k
            r16.h(r17)
            int r8 = r0.f4657k
            int r4 = r4 + r3
            if (r8 != r4) goto L_0x01b3
            t.b r4 = r0.f4662p
            r4.getClass()
            r4.f4644a = r7
            t.a r8 = r4.f4647d
            r8.b()
            r8 = 0
        L_0x0169:
            t.a r9 = r1.f4647d
            int r9 = r9.d()
            if (r8 >= r9) goto L_0x0185
            t.a r9 = r1.f4647d
            t.f r9 = r9.e(r8)
            t.a r10 = r1.f4647d
            float r10 = r10.f(r8)
            t.a r11 = r4.f4647d
            r11.a(r9, r10, r3)
            int r8 = r8 + 1
            goto L_0x0169
        L_0x0185:
            t.b r4 = r0.f4662p
            r0.r(r4)
            int r4 = r2.f4669c
            r8 = -1
            if (r4 != r8) goto L_0x01b1
            t.f r4 = r1.f4644a
            if (r4 != r2) goto L_0x019c
            t.f r2 = r1.f(r7, r2)
            if (r2 == 0) goto L_0x019c
            r1.g(r2)
        L_0x019c:
            boolean r2 = r1.e
            if (r2 != 0) goto L_0x01a5
            t.f r2 = r1.f4644a
            r2.e(r0, r1)
        L_0x01a5:
            java.lang.Object r2 = r5.f1131b
            M.c r2 = (M.c) r2
            r2.b(r1)
            int r2 = r0.f4657k
            int r2 = r2 - r3
            r0.f4657k = r2
        L_0x01b1:
            r4 = 1
            goto L_0x01b4
        L_0x01b3:
            r4 = 0
        L_0x01b4:
            t.f r2 = r1.f4644a
            if (r2 == 0) goto L_0x01c3
            int r2 = r2.f4676l
            if (r2 == r3) goto L_0x01c5
            float r2 = r1.f4645b
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x01c3
            goto L_0x01c5
        L_0x01c3:
            return
        L_0x01c4:
            r4 = 0
        L_0x01c5:
            if (r4 != 0) goto L_0x01ca
            r16.h(r17)
        L_0x01ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C0337c.c(t.b):void");
    }

    public final void d(C0340f fVar, int i2) {
        int i3 = fVar.f4669c;
        if (i3 == -1) {
            fVar.d(this, (float) i2);
            for (int i4 = 0; i4 < this.f4651c + 1; i4++) {
                C0340f fVar2 = ((C0340f[]) this.f4659m.f1133d)[i4];
            }
        } else if (i3 != -1) {
            C0336b bVar = this.f4654g[i3];
            if (bVar.e) {
                bVar.f4645b = (float) i2;
            } else if (bVar.f4647d.d() == 0) {
                bVar.e = true;
                bVar.f4645b = (float) i2;
            } else {
                C0336b l2 = l();
                if (i2 < 0) {
                    l2.f4645b = (float) (i2 * -1);
                    l2.f4647d.g(fVar, 1.0f);
                } else {
                    l2.f4645b = (float) i2;
                    l2.f4647d.g(fVar, -1.0f);
                }
                c(l2);
            }
        } else {
            C0336b l3 = l();
            l3.f4644a = fVar;
            float f2 = (float) i2;
            fVar.e = f2;
            l3.f4645b = f2;
            l3.e = true;
            c(l3);
        }
    }

    public final void e(C0340f fVar, C0340f fVar2, int i2, int i3) {
        if (i3 == 8 && fVar2.f4671f && fVar.f4669c == -1) {
            fVar.d(this, fVar2.e + ((float) i2));
            return;
        }
        C0336b l2 = l();
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            l2.f4645b = (float) i2;
        }
        if (!z2) {
            l2.f4647d.g(fVar, -1.0f);
            l2.f4647d.g(fVar2, 1.0f);
        } else {
            l2.f4647d.g(fVar, 1.0f);
            l2.f4647d.g(fVar2, -1.0f);
        }
        if (i3 != 8) {
            l2.a(this, i3);
        }
        c(l2);
    }

    public final void h(C0336b bVar) {
        int i2;
        if (bVar.e) {
            bVar.f4644a.d(this, bVar.f4645b);
        } else {
            C0336b[] bVarArr = this.f4654g;
            int i3 = this.f4657k;
            bVarArr[i3] = bVar;
            C0340f fVar = bVar.f4644a;
            fVar.f4669c = i3;
            this.f4657k = i3 + 1;
            fVar.e(this, bVar);
        }
        if (this.f4650b) {
            int i4 = 0;
            while (i4 < this.f4657k) {
                if (this.f4654g[i4] == null) {
                    System.out.println("WTF");
                }
                C0336b bVar2 = this.f4654g[i4];
                if (bVar2 != null && bVar2.e) {
                    bVar2.f4644a.d(this, bVar2.f4645b);
                    ((c) this.f4659m.f1131b).b(bVar2);
                    this.f4654g[i4] = null;
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (true) {
                        i2 = this.f4657k;
                        if (i5 >= i2) {
                            break;
                        }
                        C0336b[] bVarArr2 = this.f4654g;
                        int i7 = i5 - 1;
                        C0336b bVar3 = bVarArr2[i5];
                        bVarArr2[i7] = bVar3;
                        C0340f fVar2 = bVar3.f4644a;
                        if (fVar2.f4669c == i5) {
                            fVar2.f4669c = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i2) {
                        this.f4654g[i6] = null;
                    }
                    this.f4657k = i2 - 1;
                    i4--;
                }
                i4++;
            }
            this.f4650b = false;
        }
    }

    public final C0340f j(int i2) {
        if (this.f4656j + 1 >= this.f4653f) {
            o();
        }
        C0340f a2 = a(4);
        int i3 = this.f4651c + 1;
        this.f4651c = i3;
        this.f4656j++;
        a2.f4668b = i3;
        a2.f4670d = i2;
        ((C0340f[]) this.f4659m.f1133d)[i3] = a2;
        C0338d dVar = this.f4652d;
        dVar.i.f108g = a2;
        float[] fArr = a2.f4673h;
        Arrays.fill(fArr, 0.0f);
        fArr[a2.f4670d] = 1.0f;
        dVar.j(a2);
        return a2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: t.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final t.C0336b l() {
        /*
            r6 = this;
            android.support.v4.media.session.t r0 = r6.f4659m
            java.lang.Object r1 = r0.f1131b
            M.c r1 = (M.c) r1
            int r2 = r1.f482b
            r3 = 0
            if (r2 <= 0) goto L_0x0016
            int r2 = r2 + -1
            java.lang.Object[] r4 = r1.f481a
            r5 = r4[r2]
            r4[r2] = r3
            r1.f482b = r2
            goto L_0x0017
        L_0x0016:
            r5 = r3
        L_0x0017:
            t.b r5 = (t.C0336b) r5
            if (r5 != 0) goto L_0x0021
            t.b r5 = new t.b
            r5.<init>(r0)
            goto L_0x002e
        L_0x0021:
            r5.f4644a = r3
            t.a r0 = r5.f4647d
            r0.b()
            r0 = 0
            r5.f4645b = r0
            r0 = 0
            r5.e = r0
        L_0x002e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C0337c.l():t.b");
    }

    public final C0340f m() {
        if (this.f4656j + 1 >= this.f4653f) {
            o();
        }
        C0340f a2 = a(3);
        int i2 = this.f4651c + 1;
        this.f4651c = i2;
        this.f4656j++;
        a2.f4668b = i2;
        ((C0340f[]) this.f4659m.f1133d)[i2] = a2;
        return a2;
    }

    public final void o() {
        int i2 = this.e * 2;
        this.e = i2;
        this.f4654g = (C0336b[]) Arrays.copyOf(this.f4654g, i2);
        t tVar = this.f4659m;
        tVar.f1133d = (C0340f[]) Arrays.copyOf((C0340f[]) tVar.f1133d, this.e);
        int i3 = this.e;
        this.i = new boolean[i3];
        this.f4653f = i3;
        this.f4658l = i3;
    }

    public final void p() {
        C0338d dVar = this.f4652d;
        if (dVar.e()) {
            i();
        } else if (this.f4655h) {
            for (int i2 = 0; i2 < this.f4657k; i2++) {
                if (!this.f4654g[i2].e) {
                    q(dVar);
                    return;
                }
            }
            i();
        } else {
            q(dVar);
        }
    }

    public final void q(C0338d dVar) {
        int i2 = 0;
        while (true) {
            if (i2 >= this.f4657k) {
                break;
            }
            C0336b bVar = this.f4654g[i2];
            int i3 = 1;
            if (bVar.f4644a.f4676l != 1) {
                float f2 = 0.0f;
                if (bVar.f4645b < 0.0f) {
                    boolean z2 = false;
                    int i4 = 0;
                    while (!z2) {
                        i4 += i3;
                        float f3 = Float.MAX_VALUE;
                        int i5 = 0;
                        int i6 = -1;
                        int i7 = -1;
                        int i8 = 0;
                        while (i5 < this.f4657k) {
                            C0336b bVar2 = this.f4654g[i5];
                            if (bVar2.f4644a.f4676l != i3 && !bVar2.e && bVar2.f4645b < f2) {
                                int d2 = bVar2.f4647d.d();
                                int i9 = 0;
                                while (i9 < d2) {
                                    C0340f e2 = bVar2.f4647d.e(i9);
                                    float c2 = bVar2.f4647d.c(e2);
                                    if (c2 > f2) {
                                        for (int i10 = 0; i10 < 9; i10++) {
                                            float f4 = e2.f4672g[i10] / c2;
                                            if ((f4 < f3 && i10 == i8) || i10 > i8) {
                                                i8 = i10;
                                                i7 = e2.f4668b;
                                                i6 = i5;
                                                f3 = f4;
                                            }
                                        }
                                    }
                                    i9++;
                                    f2 = 0.0f;
                                }
                            }
                            i5++;
                            f2 = 0.0f;
                            i3 = 1;
                        }
                        if (i6 != -1) {
                            C0336b bVar3 = this.f4654g[i6];
                            bVar3.f4644a.f4669c = -1;
                            bVar3.g(((C0340f[]) this.f4659m.f1133d)[i7]);
                            C0340f fVar = bVar3.f4644a;
                            fVar.f4669c = i6;
                            fVar.e(this, bVar3);
                        } else {
                            z2 = true;
                        }
                        if (i4 > this.f4656j / 2) {
                            z2 = true;
                        }
                        f2 = 0.0f;
                        i3 = 1;
                    }
                }
            }
            i2++;
        }
        r(dVar);
        i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0090 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(t.C0336b r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 0
            r3 = 0
        L_0x0006:
            int r4 = r0.f4656j
            if (r3 >= r4) goto L_0x0011
            boolean[] r4 = r0.i
            r4[r3] = r2
            int r3 = r3 + 1
            goto L_0x0006
        L_0x0011:
            r3 = 0
            r4 = 0
        L_0x0013:
            if (r3 != 0) goto L_0x00ae
            r5 = 1
            int r4 = r4 + r5
            int r6 = r0.f4656j
            int r6 = r6 * 2
            if (r4 < r6) goto L_0x001e
            return
        L_0x001e:
            t.f r6 = r1.f4644a
            if (r6 == 0) goto L_0x0028
            boolean[] r7 = r0.i
            int r6 = r6.f4668b
            r7[r6] = r5
        L_0x0028:
            boolean[] r6 = r0.i
            t.f r6 = r1.d(r6)
            if (r6 == 0) goto L_0x003b
            boolean[] r7 = r0.i
            int r8 = r6.f4668b
            boolean r9 = r7[r8]
            if (r9 == 0) goto L_0x0039
            return
        L_0x0039:
            r7[r8] = r5
        L_0x003b:
            if (r6 == 0) goto L_0x00aa
            r7 = -1
            r8 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r9 = 0
            r10 = -1
        L_0x0043:
            int r11 = r0.f4657k
            if (r9 >= r11) goto L_0x0095
            t.b[] r11 = r0.f4654g
            r11 = r11[r9]
            t.f r12 = r11.f4644a
            int r12 = r12.f4676l
            if (r12 != r5) goto L_0x0052
            goto L_0x0090
        L_0x0052:
            boolean r12 = r11.e
            if (r12 == 0) goto L_0x0057
            goto L_0x0090
        L_0x0057:
            t.a r12 = r11.f4647d
            int r13 = r12.f4642h
            r15 = -1
            if (r13 != r15) goto L_0x0060
        L_0x005e:
            r14 = 0
            goto L_0x0079
        L_0x0060:
            r2 = 0
        L_0x0061:
            if (r13 == r15) goto L_0x005e
            int r5 = r12.f4636a
            if (r2 >= r5) goto L_0x005e
            int[] r5 = r12.e
            r5 = r5[r13]
            int r14 = r6.f4668b
            if (r5 != r14) goto L_0x0071
            r14 = 1
            goto L_0x0079
        L_0x0071:
            int[] r5 = r12.f4640f
            r13 = r5[r13]
            int r2 = r2 + 1
            r5 = 1
            goto L_0x0061
        L_0x0079:
            if (r14 == 0) goto L_0x0090
            t.a r2 = r11.f4647d
            float r2 = r2.c(r6)
            r5 = 0
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x0090
            float r5 = r11.f4645b
            float r5 = -r5
            float r5 = r5 / r2
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0090
            r8 = r5
            r10 = r9
        L_0x0090:
            int r9 = r9 + 1
            r2 = 0
            r5 = 1
            goto L_0x0043
        L_0x0095:
            if (r10 <= r7) goto L_0x00ab
            t.b[] r2 = r0.f4654g
            r2 = r2[r10]
            t.f r5 = r2.f4644a
            r5.f4669c = r7
            r2.g(r6)
            t.f r5 = r2.f4644a
            r5.f4669c = r10
            r5.e(r0, r2)
            goto L_0x00ab
        L_0x00aa:
            r3 = 1
        L_0x00ab:
            r2 = 0
            goto L_0x0013
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C0337c.r(t.b):void");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [t.b, t.d] */
    public C0337c() {
        s();
        t tVar = new t(11);
        tVar.f1131b = new c();
        tVar.f1132c = new c();
        tVar.f1133d = new C0340f[32];
        this.f4659m = tVar;
        ? bVar = new C0336b(tVar);
        bVar.f4663f = new C0340f[128];
        bVar.f4664g = new C0340f[128];
        bVar.f4665h = 0;
        bVar.i = new j((C0338d) bVar);
        this.f4652d = bVar;
        this.f4662p = new C0336b(tVar);
    }

    public final void b(C0340f fVar, C0340f fVar2, int i2, float f2, C0340f fVar3, C0340f fVar4, int i3, int i4) {
        C0336b l2 = l();
        if (fVar2 == fVar3) {
            l2.f4647d.g(fVar, 1.0f);
            l2.f4647d.g(fVar4, 1.0f);
            l2.f4647d.g(fVar2, -2.0f);
        } else if (f2 == 0.5f) {
            l2.f4647d.g(fVar, 1.0f);
            l2.f4647d.g(fVar2, -1.0f);
            l2.f4647d.g(fVar3, -1.0f);
            l2.f4647d.g(fVar4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                l2.f4645b = (float) ((-i2) + i3);
            }
        } else if (f2 <= 0.0f) {
            l2.f4647d.g(fVar, -1.0f);
            l2.f4647d.g(fVar2, 1.0f);
            l2.f4645b = (float) i2;
        } else if (f2 >= 1.0f) {
            l2.f4647d.g(fVar4, -1.0f);
            l2.f4647d.g(fVar3, 1.0f);
            l2.f4645b = (float) (-i3);
        } else {
            float f3 = 1.0f - f2;
            l2.f4647d.g(fVar, f3 * 1.0f);
            l2.f4647d.g(fVar2, f3 * -1.0f);
            l2.f4647d.g(fVar3, -1.0f * f2);
            l2.f4647d.g(fVar4, 1.0f * f2);
            if (i2 > 0 || i3 > 0) {
                l2.f4645b = (((float) i3) * f2) + (((float) (-i2)) * f3);
            }
        }
        if (i4 != 8) {
            l2.a(this, i4);
        }
        c(l2);
    }

    public final void f(C0340f fVar, C0340f fVar2, int i2, int i3) {
        C0336b l2 = l();
        C0340f m2 = m();
        m2.f4670d = 0;
        l2.b(fVar, fVar2, m2, i2);
        if (i3 != 8) {
            l2.f4647d.g(j(i3), (float) ((int) (l2.f4647d.c(m2) * -1.0f)));
        }
        c(l2);
    }

    public final void g(C0340f fVar, C0340f fVar2, int i2, int i3) {
        C0336b l2 = l();
        C0340f m2 = m();
        m2.f4670d = 0;
        l2.c(fVar, fVar2, m2, i2);
        if (i3 != 8) {
            l2.f4647d.g(j(i3), (float) ((int) (l2.f4647d.c(m2) * -1.0f)));
        }
        c(l2);
    }
}
