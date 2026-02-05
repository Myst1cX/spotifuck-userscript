package v;

import android.support.v4.media.session.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import t.C0337c;
import w.C0351b;
import w.e;
import y.f;

/* renamed from: v.e  reason: case insensitive filesystem */
public final class C0348e extends C0347d {
    public int A0;

    /* renamed from: B0  reason: collision with root package name */
    public C0345b[] f4772B0;

    /* renamed from: C0  reason: collision with root package name */
    public C0345b[] f4773C0;

    /* renamed from: D0  reason: collision with root package name */
    public int f4774D0;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f4775E0;
    public boolean F0;

    /* renamed from: G0  reason: collision with root package name */
    public WeakReference f4776G0;

    /* renamed from: H0  reason: collision with root package name */
    public WeakReference f4777H0;

    /* renamed from: I0  reason: collision with root package name */
    public WeakReference f4778I0;

    /* renamed from: J0  reason: collision with root package name */
    public WeakReference f4779J0;

    /* renamed from: K0  reason: collision with root package name */
    public final HashSet f4780K0;

    /* renamed from: L0  reason: collision with root package name */
    public final C0351b f4781L0;

    /* renamed from: q0  reason: collision with root package name */
    public ArrayList f4782q0 = new ArrayList();

    /* renamed from: r0  reason: collision with root package name */
    public final t f4783r0 = new t(this);

    /* renamed from: s0  reason: collision with root package name */
    public final e f4784s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f4785t0;

    /* renamed from: u0  reason: collision with root package name */
    public f f4786u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f4787v0;

    /* renamed from: w0  reason: collision with root package name */
    public final C0337c f4788w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f4789x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f4790y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f4791z0;

    public final void R(C0347d dVar, int i) {
        if (i == 0) {
            int i2 = this.f4791z0 + 1;
            C0345b[] bVarArr = this.f4773C0;
            if (i2 >= bVarArr.length) {
                this.f4773C0 = (C0345b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            C0345b[] bVarArr2 = this.f4773C0;
            int i3 = this.f4791z0;
            bVarArr2[i3] = new C0345b(dVar, 0, this.f4787v0);
            this.f4791z0 = i3 + 1;
        } else if (i == 1) {
            int i4 = this.A0 + 1;
            C0345b[] bVarArr3 = this.f4772B0;
            if (i4 >= bVarArr3.length) {
                this.f4772B0 = (C0345b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            C0345b[] bVarArr4 = this.f4772B0;
            int i5 = this.A0;
            bVarArr4[i5] = new C0345b(dVar, 1, this.f4787v0);
            this.A0 = i5 + 1;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v81, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v75, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: int[]} */
    /* JADX WARNING: type inference failed for: r6v5, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: type inference failed for: r5v52, types: [java.lang.Object, w.b] */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02a5, code lost:
        r27 = r0;
        r26 = r3;
        r25 = r7;
        r28 = r8;
        r8 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0611, code lost:
        r5 = r21;
        r4 = r25;
        r3 = r27;
        r2 = r28;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x05dd  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x061c  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0635  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x063b  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0651  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x066a  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x066c  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x068a  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x068c  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x0696  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x06b3  */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x071b A[SYNTHETIC, Splitter:B:433:0x071b] */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0741 A[SYNTHETIC, Splitter:B:440:0x0741] */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x0774 A[Catch:{ Exception -> 0x0799 }] */
    /* JADX WARNING: Removed duplicated region for block: B:474:0x079d A[Catch:{ Exception -> 0x0791 }] */
    /* JADX WARNING: Removed duplicated region for block: B:482:0x07c2  */
    /* JADX WARNING: Removed duplicated region for block: B:491:0x07ff  */
    /* JADX WARNING: Removed duplicated region for block: B:502:0x0826 A[LOOP:34: B:501:0x0824->B:502:0x0826, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:514:0x088c  */
    /* JADX WARNING: Removed duplicated region for block: B:515:0x0898  */
    /* JADX WARNING: Removed duplicated region for block: B:518:0x08ab  */
    /* JADX WARNING: Removed duplicated region for block: B:519:0x08b4  */
    /* JADX WARNING: Removed duplicated region for block: B:521:0x08b8  */
    /* JADX WARNING: Removed duplicated region for block: B:534:0x08ef  */
    /* JADX WARNING: Removed duplicated region for block: B:536:0x08f3  */
    /* JADX WARNING: Removed duplicated region for block: B:540:0x0900  */
    /* JADX WARNING: Removed duplicated region for block: B:632:0x08f4 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void U() {
        /*
            r31 = this;
            r1 = r31
            r2 = 0
            r1.f4731Y = r2
            r1.f4732Z = r2
            r1.f4775E0 = r2
            r1.F0 = r2
            java.util.ArrayList r0 = r1.f4782q0
            int r3 = r0.size()
            int r0 = r31.q()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r31.k()
            int r4 = java.lang.Math.max(r2, r4)
            int[] r5 = r1.f4761p0
            r6 = 1
            r7 = r5[r6]
            r8 = r5[r2]
            int r9 = r1.f4785t0
            v.c r10 = r1.f4716J
            v.c r11 = r1.I
            if (r9 != 0) goto L_0x0256
            int r9 = r1.f4774D0
            boolean r9 = v.j.c(r9, r6)
            if (r9 == 0) goto L_0x0256
            y.f r9 = r1.f4786u0
            r14 = r5[r2]
            r15 = r5[r6]
            r31.E()
            java.util.ArrayList r12 = r1.f4782q0
            int r13 = r12.size()
        L_0x0047:
            if (r2 >= r13) goto L_0x0055
            java.lang.Object r18 = r12.get(r2)
            v.d r18 = (v.C0347d) r18
            r18.E()
            int r2 = r2 + 1
            goto L_0x0047
        L_0x0055:
            boolean r2 = r1.f4787v0
            if (r14 != r6) goto L_0x0062
            int r14 = r31.q()
            r6 = 0
            r1.J(r6, r14)
            goto L_0x0068
        L_0x0062:
            r6 = 0
            r11.l(r6)
            r1.f4731Y = r6
        L_0x0068:
            r6 = 0
            r14 = 0
            r19 = 0
        L_0x006c:
            r20 = 1056964608(0x3f000000, float:0.5)
            if (r6 >= r13) goto L_0x00d7
            java.lang.Object r21 = r12.get(r6)
            r22 = r11
            r11 = r21
            v.d r11 = (v.C0347d) r11
            r21 = r4
            boolean r4 = r11 instanceof v.h
            if (r4 == 0) goto L_0x00be
            v.h r11 = (v.h) r11
            int r4 = r11.f4845u0
            r23 = r5
            r5 = 1
            if (r4 != r5) goto L_0x00ce
            int r4 = r11.f4842r0
            r5 = -1
            if (r4 == r5) goto L_0x0092
            r11.R(r4)
            goto L_0x00bc
        L_0x0092:
            int r4 = r11.f4843s0
            if (r4 == r5) goto L_0x00a7
            boolean r4 = r31.A()
            if (r4 == 0) goto L_0x00a7
            int r4 = r31.q()
            int r5 = r11.f4843s0
            int r4 = r4 - r5
            r11.R(r4)
            goto L_0x00bc
        L_0x00a7:
            boolean r4 = r31.A()
            if (r4 == 0) goto L_0x00bc
            float r4 = r11.f4841q0
            int r5 = r31.q()
            float r5 = (float) r5
            float r4 = r4 * r5
            float r4 = r4 + r20
            int r4 = (int) r4
            r11.R(r4)
        L_0x00bc:
            r14 = 1
            goto L_0x00ce
        L_0x00be:
            r23 = r5
            boolean r4 = r11 instanceof v.C0344a
            if (r4 == 0) goto L_0x00ce
            v.a r11 = (v.C0344a) r11
            int r4 = r11.U()
            if (r4 != 0) goto L_0x00ce
            r19 = 1
        L_0x00ce:
            int r6 = r6 + 1
            r4 = r21
            r11 = r22
            r5 = r23
            goto L_0x006c
        L_0x00d7:
            r21 = r4
            r23 = r5
            r22 = r11
            if (r14 == 0) goto L_0x00fc
            r4 = 0
        L_0x00e0:
            if (r4 >= r13) goto L_0x00fc
            java.lang.Object r5 = r12.get(r4)
            v.d r5 = (v.C0347d) r5
            boolean r6 = r5 instanceof v.h
            if (r6 == 0) goto L_0x00f8
            v.h r5 = (v.h) r5
            int r6 = r5.f4845u0
            r11 = 1
            if (r6 != r11) goto L_0x00f8
            r6 = 0
            w.h.c(r6, r5, r9, r2)
            goto L_0x00f9
        L_0x00f8:
            r6 = 0
        L_0x00f9:
            int r4 = r4 + 1
            goto L_0x00e0
        L_0x00fc:
            r6 = 0
            w.h.c(r6, r1, r9, r2)
            if (r19 == 0) goto L_0x0126
            r4 = 0
        L_0x0103:
            if (r4 >= r13) goto L_0x0126
            java.lang.Object r5 = r12.get(r4)
            v.d r5 = (v.C0347d) r5
            boolean r6 = r5 instanceof v.C0344a
            if (r6 == 0) goto L_0x0122
            v.a r5 = (v.C0344a) r5
            int r6 = r5.U()
            if (r6 != 0) goto L_0x0122
            boolean r6 = r5.T()
            if (r6 == 0) goto L_0x0122
            r6 = 1
            w.h.c(r6, r5, r9, r2)
            goto L_0x0123
        L_0x0122:
            r6 = 1
        L_0x0123:
            int r4 = r4 + 1
            goto L_0x0103
        L_0x0126:
            r6 = 1
            if (r15 != r6) goto L_0x0132
            int r4 = r31.k()
            r5 = 0
            r1.K(r5, r4)
            goto L_0x0138
        L_0x0132:
            r5 = 0
            r10.l(r5)
            r1.f4732Z = r5
        L_0x0138:
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x013b:
            if (r4 >= r13) goto L_0x0193
            java.lang.Object r11 = r12.get(r4)
            v.d r11 = (v.C0347d) r11
            boolean r14 = r11 instanceof v.h
            if (r14 == 0) goto L_0x0182
            v.h r11 = (v.h) r11
            int r14 = r11.f4845u0
            if (r14 != 0) goto L_0x0190
            int r5 = r11.f4842r0
            r14 = -1
            if (r5 == r14) goto L_0x0156
            r11.R(r5)
            goto L_0x0180
        L_0x0156:
            int r5 = r11.f4843s0
            if (r5 == r14) goto L_0x016b
            boolean r5 = r31.B()
            if (r5 == 0) goto L_0x016b
            int r5 = r31.k()
            int r14 = r11.f4843s0
            int r5 = r5 - r14
            r11.R(r5)
            goto L_0x0180
        L_0x016b:
            boolean r5 = r31.B()
            if (r5 == 0) goto L_0x0180
            float r5 = r11.f4841q0
            int r14 = r31.k()
            float r14 = (float) r14
            float r5 = r5 * r14
            float r5 = r5 + r20
            int r5 = (int) r5
            r11.R(r5)
        L_0x0180:
            r5 = 1
            goto L_0x0190
        L_0x0182:
            boolean r14 = r11 instanceof v.C0344a
            if (r14 == 0) goto L_0x0190
            v.a r11 = (v.C0344a) r11
            int r11 = r11.U()
            r14 = 1
            if (r11 != r14) goto L_0x0190
            r6 = 1
        L_0x0190:
            int r4 = r4 + 1
            goto L_0x013b
        L_0x0193:
            if (r5 == 0) goto L_0x01af
            r4 = 0
        L_0x0196:
            if (r4 >= r13) goto L_0x01af
            java.lang.Object r5 = r12.get(r4)
            v.d r5 = (v.C0347d) r5
            boolean r11 = r5 instanceof v.h
            if (r11 == 0) goto L_0x01ac
            v.h r5 = (v.h) r5
            int r11 = r5.f4845u0
            if (r11 != 0) goto L_0x01ac
            r11 = 1
            w.h.i(r11, r5, r9)
        L_0x01ac:
            int r4 = r4 + 1
            goto L_0x0196
        L_0x01af:
            r4 = 0
            w.h.i(r4, r1, r9)
            if (r6 == 0) goto L_0x01d7
            r4 = 0
        L_0x01b6:
            if (r4 >= r13) goto L_0x01d7
            java.lang.Object r5 = r12.get(r4)
            v.d r5 = (v.C0347d) r5
            boolean r6 = r5 instanceof v.C0344a
            if (r6 == 0) goto L_0x01d4
            v.a r5 = (v.C0344a) r5
            int r6 = r5.U()
            r11 = 1
            if (r6 != r11) goto L_0x01d4
            boolean r6 = r5.T()
            if (r6 == 0) goto L_0x01d4
            w.h.i(r11, r5, r9)
        L_0x01d4:
            int r4 = r4 + 1
            goto L_0x01b6
        L_0x01d7:
            r4 = 0
        L_0x01d8:
            if (r4 >= r13) goto L_0x0210
            java.lang.Object r5 = r12.get(r4)
            v.d r5 = (v.C0347d) r5
            boolean r6 = r5.z()
            if (r6 == 0) goto L_0x020d
            boolean r6 = w.h.a(r5)
            if (r6 == 0) goto L_0x020d
            w.b r6 = w.h.f4882a
            V(r5, r9, r6)
            boolean r6 = r5 instanceof v.h
            if (r6 == 0) goto L_0x0206
            r6 = r5
            v.h r6 = (v.h) r6
            int r6 = r6.f4845u0
            if (r6 != 0) goto L_0x0201
            r6 = 0
            w.h.i(r6, r5, r9)
            goto L_0x020d
        L_0x0201:
            r6 = 0
            w.h.c(r6, r5, r9, r2)
            goto L_0x020d
        L_0x0206:
            r6 = 0
            w.h.c(r6, r5, r9, r2)
            w.h.i(r6, r5, r9)
        L_0x020d:
            int r4 = r4 + 1
            goto L_0x01d8
        L_0x0210:
            r2 = 0
        L_0x0211:
            if (r2 >= r3) goto L_0x025c
            java.util.ArrayList r4 = r1.f4782q0
            java.lang.Object r4 = r4.get(r2)
            v.d r4 = (v.C0347d) r4
            boolean r5 = r4.z()
            if (r5 == 0) goto L_0x0253
            boolean r5 = r4 instanceof v.h
            if (r5 != 0) goto L_0x0253
            boolean r5 = r4 instanceof v.C0344a
            if (r5 != 0) goto L_0x0253
            boolean r5 = r4 instanceof v.g
            if (r5 != 0) goto L_0x0253
            boolean r5 = r4.f4713F
            if (r5 != 0) goto L_0x0253
            r5 = 0
            int r6 = r4.j(r5)
            r5 = 1
            int r9 = r4.j(r5)
            r11 = 3
            if (r6 != r11) goto L_0x0249
            int r6 = r4.f4763r
            if (r6 == r5) goto L_0x0249
            if (r9 != r11) goto L_0x0249
            int r6 = r4.f4764s
            if (r6 == r5) goto L_0x0249
            goto L_0x0253
        L_0x0249:
            w.b r5 = new w.b
            r5.<init>()
            y.f r6 = r1.f4786u0
            V(r4, r6, r5)
        L_0x0253:
            int r2 = r2 + 1
            goto L_0x0211
        L_0x0256:
            r21 = r4
            r23 = r5
            r22 = r11
        L_0x025c:
            t.c r2 = r1.f4788w0
            r5 = 2
            if (r3 <= r5) goto L_0x0266
            if (r8 == r5) goto L_0x0275
            if (r7 != r5) goto L_0x0266
            goto L_0x0275
        L_0x0266:
            r26 = r3
            r4 = r7
            r24 = r10
            r5 = r21
            r3 = r0
            r30 = r8
            r8 = r2
            r2 = r30
            goto L_0x0658
        L_0x0275:
            int r9 = r1.f4774D0
            r11 = 1024(0x400, float:1.435E-42)
            boolean r9 = v.j.c(r9, r11)
            if (r9 == 0) goto L_0x0266
            y.f r9 = r1.f4786u0
            java.util.ArrayList r11 = r1.f4782q0
            int r12 = r11.size()
            r13 = 0
        L_0x0288:
            if (r13 >= r12) goto L_0x02bb
            java.lang.Object r14 = r11.get(r13)
            v.d r14 = (v.C0347d) r14
            r15 = 0
            r6 = r23[r15]
            r18 = 1
            r5 = r23[r18]
            int[] r4 = r14.f4761p0
            r24 = r10
            r10 = r4[r15]
            r4 = r4[r18]
            boolean r4 = w.h.h(r6, r5, r10, r4)
            if (r4 != 0) goto L_0x02b0
        L_0x02a5:
            r27 = r0
            r26 = r3
            r25 = r7
            r28 = r8
            r8 = r2
            goto L_0x0611
        L_0x02b0:
            boolean r4 = r14 instanceof v.g
            if (r4 == 0) goto L_0x02b5
            goto L_0x02a5
        L_0x02b5:
            int r13 = r13 + 1
            r10 = r24
            r5 = 2
            goto L_0x0288
        L_0x02bb:
            r24 = r10
            r4 = 0
            r5 = 0
            r6 = 0
            r10 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x02c4:
            if (r4 >= r12) goto L_0x03a5
            java.lang.Object r25 = r11.get(r4)
            r26 = r3
            r3 = r25
            v.d r3 = (v.C0347d) r3
            r25 = r7
            r17 = 0
            r7 = r23[r17]
            r27 = r0
            r18 = 1
            r0 = r23[r18]
            r28 = r8
            int[] r8 = r3.f4761p0
            r29 = r2
            r2 = r8[r17]
            r8 = r8[r18]
            boolean r0 = w.h.h(r7, r0, r2, r8)
            if (r0 != 0) goto L_0x02f1
            w.b r0 = r1.f4781L0
            V(r3, r9, r0)
        L_0x02f1:
            boolean r0 = r3 instanceof v.h
            if (r0 == 0) goto L_0x0315
            r2 = r3
            v.h r2 = (v.h) r2
            int r7 = r2.f4845u0
            if (r7 != 0) goto L_0x0306
            if (r10 != 0) goto L_0x0303
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x0303:
            r10.add(r2)
        L_0x0306:
            int r7 = r2.f4845u0
            r8 = 1
            if (r7 != r8) goto L_0x0315
            if (r5 != 0) goto L_0x0312
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x0312:
            r5.add(r2)
        L_0x0315:
            boolean r2 = r3 instanceof v.i
            if (r2 == 0) goto L_0x0359
            boolean r2 = r3 instanceof v.C0344a
            if (r2 == 0) goto L_0x0342
            r2 = r3
            v.a r2 = (v.C0344a) r2
            int r7 = r2.U()
            if (r7 != 0) goto L_0x0330
            if (r6 != 0) goto L_0x032d
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x032d:
            r6.add(r2)
        L_0x0330:
            int r7 = r2.U()
            r8 = 1
            if (r7 != r8) goto L_0x0359
            if (r13 != 0) goto L_0x033e
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x033e:
            r13.add(r2)
            goto L_0x0359
        L_0x0342:
            r2 = r3
            v.i r2 = (v.i) r2
            if (r6 != 0) goto L_0x034c
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x034c:
            r6.add(r2)
            if (r13 != 0) goto L_0x0356
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x0356:
            r13.add(r2)
        L_0x0359:
            v.c r2 = r3.I
            v.c r2 = r2.f4705f
            if (r2 != 0) goto L_0x0375
            v.c r2 = r3.f4717K
            v.c r2 = r2.f4705f
            if (r2 != 0) goto L_0x0375
            if (r0 != 0) goto L_0x0375
            boolean r2 = r3 instanceof v.C0344a
            if (r2 != 0) goto L_0x0375
            if (r14 != 0) goto L_0x0372
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x0372:
            r14.add(r3)
        L_0x0375:
            v.c r2 = r3.f4716J
            v.c r2 = r2.f4705f
            if (r2 != 0) goto L_0x0397
            v.c r2 = r3.f4718L
            v.c r2 = r2.f4705f
            if (r2 != 0) goto L_0x0397
            v.c r2 = r3.f4719M
            v.c r2 = r2.f4705f
            if (r2 != 0) goto L_0x0397
            if (r0 != 0) goto L_0x0397
            boolean r0 = r3 instanceof v.C0344a
            if (r0 != 0) goto L_0x0397
            if (r15 != 0) goto L_0x0394
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L_0x0394:
            r15.add(r3)
        L_0x0397:
            int r4 = r4 + 1
            r7 = r25
            r3 = r26
            r0 = r27
            r8 = r28
            r2 = r29
            goto L_0x02c4
        L_0x03a5:
            r27 = r0
            r29 = r2
            r26 = r3
            r25 = r7
            r28 = r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r5 == 0) goto L_0x03cc
            java.util.Iterator r2 = r5.iterator()
        L_0x03ba:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03cc
            java.lang.Object r3 = r2.next()
            v.h r3 = (v.h) r3
            r4 = 0
            r5 = 0
            w.h.b(r3, r4, r0, r5)
            goto L_0x03ba
        L_0x03cc:
            r4 = 0
            r5 = 0
            if (r6 == 0) goto L_0x03ed
            java.util.Iterator r2 = r6.iterator()
        L_0x03d4:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03ed
            java.lang.Object r3 = r2.next()
            v.i r3 = (v.i) r3
            w.n r6 = w.h.b(r3, r4, r0, r5)
            r3.R(r4, r0, r6)
            r6.a(r0)
            r4 = 0
            r5 = 0
            goto L_0x03d4
        L_0x03ed:
            r2 = 2
            v.c r3 = r1.i(r2)
            java.util.HashSet r2 = r3.f4701a
            if (r2 == 0) goto L_0x040e
            java.util.Iterator r2 = r2.iterator()
        L_0x03fa:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x040e
            java.lang.Object r3 = r2.next()
            v.c r3 = (v.C0346c) r3
            v.d r3 = r3.f4704d
            r4 = 0
            r5 = 0
            w.h.b(r3, r4, r0, r5)
            goto L_0x03fa
        L_0x040e:
            r2 = 4
            v.c r2 = r1.i(r2)
            java.util.HashSet r2 = r2.f4701a
            if (r2 == 0) goto L_0x042f
            java.util.Iterator r2 = r2.iterator()
        L_0x041b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x042f
            java.lang.Object r3 = r2.next()
            v.c r3 = (v.C0346c) r3
            v.d r3 = r3.f4704d
            r4 = 0
            r5 = 0
            w.h.b(r3, r4, r0, r5)
            goto L_0x041b
        L_0x042f:
            r2 = 7
            v.c r3 = r1.i(r2)
            java.util.HashSet r3 = r3.f4701a
            if (r3 == 0) goto L_0x0450
            java.util.Iterator r3 = r3.iterator()
        L_0x043c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0450
            java.lang.Object r4 = r3.next()
            v.c r4 = (v.C0346c) r4
            v.d r4 = r4.f4704d
            r5 = 0
            r6 = 0
            w.h.b(r4, r5, r0, r6)
            goto L_0x043c
        L_0x0450:
            r5 = 0
            r6 = 0
            if (r14 == 0) goto L_0x0468
            java.util.Iterator r3 = r14.iterator()
        L_0x0458:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0468
            java.lang.Object r4 = r3.next()
            v.d r4 = (v.C0347d) r4
            w.h.b(r4, r5, r0, r6)
            goto L_0x0458
        L_0x0468:
            if (r10 == 0) goto L_0x047f
            java.util.Iterator r3 = r10.iterator()
        L_0x046e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x047f
            java.lang.Object r4 = r3.next()
            v.h r4 = (v.h) r4
            r5 = 1
            w.h.b(r4, r5, r0, r6)
            goto L_0x046e
        L_0x047f:
            r5 = 1
            if (r13 == 0) goto L_0x049f
            java.util.Iterator r3 = r13.iterator()
        L_0x0486:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x049f
            java.lang.Object r4 = r3.next()
            v.i r4 = (v.i) r4
            w.n r7 = w.h.b(r4, r5, r0, r6)
            r4.R(r5, r0, r7)
            r7.a(r0)
            r5 = 1
            r6 = 0
            goto L_0x0486
        L_0x049f:
            r3 = 3
            v.c r4 = r1.i(r3)
            java.util.HashSet r3 = r4.f4701a
            if (r3 == 0) goto L_0x04c0
            java.util.Iterator r3 = r3.iterator()
        L_0x04ac:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04c0
            java.lang.Object r4 = r3.next()
            v.c r4 = (v.C0346c) r4
            v.d r4 = r4.f4704d
            r5 = 1
            r6 = 0
            w.h.b(r4, r5, r0, r6)
            goto L_0x04ac
        L_0x04c0:
            r3 = 6
            v.c r3 = r1.i(r3)
            java.util.HashSet r3 = r3.f4701a
            if (r3 == 0) goto L_0x04e1
            java.util.Iterator r3 = r3.iterator()
        L_0x04cd:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04e1
            java.lang.Object r4 = r3.next()
            v.c r4 = (v.C0346c) r4
            v.d r4 = r4.f4704d
            r5 = 1
            r6 = 0
            w.h.b(r4, r5, r0, r6)
            goto L_0x04cd
        L_0x04e1:
            r3 = 5
            v.c r4 = r1.i(r3)
            java.util.HashSet r3 = r4.f4701a
            if (r3 == 0) goto L_0x0502
            java.util.Iterator r3 = r3.iterator()
        L_0x04ee:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0502
            java.lang.Object r4 = r3.next()
            v.c r4 = (v.C0346c) r4
            v.d r4 = r4.f4704d
            r5 = 1
            r6 = 0
            w.h.b(r4, r5, r0, r6)
            goto L_0x04ee
        L_0x0502:
            v.c r2 = r1.i(r2)
            java.util.HashSet r2 = r2.f4701a
            if (r2 == 0) goto L_0x0522
            java.util.Iterator r2 = r2.iterator()
        L_0x050e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0522
            java.lang.Object r3 = r2.next()
            v.c r3 = (v.C0346c) r3
            v.d r3 = r3.f4704d
            r4 = 1
            r5 = 0
            w.h.b(r3, r4, r0, r5)
            goto L_0x050e
        L_0x0522:
            r4 = 1
            r5 = 0
            if (r15 == 0) goto L_0x053a
            java.util.Iterator r2 = r15.iterator()
        L_0x052a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x053a
            java.lang.Object r3 = r2.next()
            v.d r3 = (v.C0347d) r3
            w.h.b(r3, r4, r0, r5)
            goto L_0x052a
        L_0x053a:
            r2 = 0
        L_0x053b:
            if (r2 >= r12) goto L_0x0591
            java.lang.Object r3 = r11.get(r2)
            v.d r3 = (v.C0347d) r3
            int[] r4 = r3.f4761p0
            r5 = 0
            r6 = r4[r5]
            r5 = 3
            if (r6 != r5) goto L_0x058e
            r6 = 1
            r4 = r4[r6]
            if (r4 != r5) goto L_0x058e
            int r4 = r3.f4757n0
            int r6 = r0.size()
            r7 = 0
        L_0x0557:
            if (r7 >= r6) goto L_0x0567
            java.lang.Object r8 = r0.get(r7)
            w.n r8 = (w.n) r8
            int r9 = r8.f4890b
            if (r4 != r9) goto L_0x0564
            goto L_0x0568
        L_0x0564:
            int r7 = r7 + 1
            goto L_0x0557
        L_0x0567:
            r8 = 0
        L_0x0568:
            int r3 = r3.f4759o0
            int r4 = r0.size()
            r6 = 0
        L_0x056f:
            if (r6 >= r4) goto L_0x057f
            java.lang.Object r7 = r0.get(r6)
            w.n r7 = (w.n) r7
            int r9 = r7.f4890b
            if (r3 != r9) goto L_0x057c
            goto L_0x0580
        L_0x057c:
            int r6 = r6 + 1
            goto L_0x056f
        L_0x057f:
            r7 = 0
        L_0x0580:
            if (r8 == 0) goto L_0x058e
            if (r7 == 0) goto L_0x058e
            r3 = 0
            r8.c(r3, r7)
            r3 = 2
            r7.f4891c = r3
            r0.remove(r8)
        L_0x058e:
            int r2 = r2 + 1
            goto L_0x053b
        L_0x0591:
            int r2 = r0.size()
            r3 = 1
            if (r2 > r3) goto L_0x059c
            r8 = r29
            goto L_0x0611
        L_0x059c:
            r2 = 0
            r3 = r23[r2]
            r2 = 2
            if (r3 != r2) goto L_0x05d4
            java.util.Iterator r2 = r0.iterator()
            r3 = 0
            r4 = 0
        L_0x05a8:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x05c8
            java.lang.Object r5 = r2.next()
            w.n r5 = (w.n) r5
            int r6 = r5.f4891c
            r7 = 1
            if (r6 != r7) goto L_0x05ba
            goto L_0x05a8
        L_0x05ba:
            r8 = r29
            r6 = 0
            int r9 = r5.b(r8, r6)
            if (r9 <= r3) goto L_0x05c5
            r4 = r5
            r3 = r9
        L_0x05c5:
            r29 = r8
            goto L_0x05a8
        L_0x05c8:
            r8 = r29
            r7 = 1
            if (r4 == 0) goto L_0x05d7
            r1.M(r7)
            r1.O(r3)
            goto L_0x05d8
        L_0x05d4:
            r8 = r29
            r7 = 1
        L_0x05d7:
            r4 = 0
        L_0x05d8:
            r2 = r23[r7]
            r3 = 2
            if (r2 != r3) goto L_0x0608
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = 0
        L_0x05e3:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x05fe
            java.lang.Object r5 = r0.next()
            w.n r5 = (w.n) r5
            int r6 = r5.f4891c
            if (r6 != 0) goto L_0x05f4
            goto L_0x05e3
        L_0x05f4:
            r6 = 1
            int r7 = r5.b(r8, r6)
            if (r7 <= r2) goto L_0x05e3
            r3 = r5
            r2 = r7
            goto L_0x05e3
        L_0x05fe:
            r6 = 1
            if (r3 == 0) goto L_0x0608
            r1.N(r6)
            r1.L(r2)
            goto L_0x0609
        L_0x0608:
            r3 = 0
        L_0x0609:
            if (r4 != 0) goto L_0x060d
            if (r3 == 0) goto L_0x0611
        L_0x060d:
            r2 = r28
            r3 = 2
            goto L_0x061a
        L_0x0611:
            r5 = r21
            r4 = r25
            r3 = r27
            r2 = r28
            goto L_0x0658
        L_0x061a:
            if (r2 != r3) goto L_0x0635
            int r0 = r31.q()
            r3 = r27
            if (r3 >= r0) goto L_0x062d
            if (r3 <= 0) goto L_0x062d
            r1.O(r3)
            r4 = 1
            r1.f4775E0 = r4
            goto L_0x0637
        L_0x062d:
            int r0 = r31.q()
        L_0x0631:
            r4 = r25
            r3 = 2
            goto L_0x0639
        L_0x0635:
            r3 = r27
        L_0x0637:
            r0 = r3
            goto L_0x0631
        L_0x0639:
            if (r4 != r3) goto L_0x0651
            int r3 = r31.k()
            r5 = r21
            if (r5 >= r3) goto L_0x064c
            if (r5 <= 0) goto L_0x064c
            r1.L(r5)
            r3 = 1
            r1.F0 = r3
            goto L_0x0653
        L_0x064c:
            int r3 = r31.k()
            goto L_0x0654
        L_0x0651:
            r5 = r21
        L_0x0653:
            r3 = r5
        L_0x0654:
            r5 = r3
            r3 = r0
            r0 = 1
            goto L_0x0659
        L_0x0658:
            r0 = 0
        L_0x0659:
            r6 = 64
            boolean r7 = r1.W(r6)
            if (r7 != 0) goto L_0x066c
            r7 = 128(0x80, float:1.794E-43)
            boolean r7 = r1.W(r7)
            if (r7 == 0) goto L_0x066a
            goto L_0x066c
        L_0x066a:
            r7 = 0
            goto L_0x066d
        L_0x066c:
            r7 = 1
        L_0x066d:
            r8.getClass()
            r9 = 0
            r8.f4655h = r9
            int r10 = r1.f4774D0
            if (r10 == 0) goto L_0x067d
            if (r7 == 0) goto L_0x067d
            r7 = 1
            r8.f4655h = r7
            goto L_0x067e
        L_0x067d:
            r7 = 1
        L_0x067e:
            java.util.ArrayList r10 = r1.f4782q0
            r11 = r23[r9]
            r12 = 2
            if (r11 == r12) goto L_0x068c
            r11 = r23[r7]
            if (r11 != r12) goto L_0x068a
            goto L_0x068c
        L_0x068a:
            r7 = 0
            goto L_0x068d
        L_0x068c:
            r7 = 1
        L_0x068d:
            r1.f4791z0 = r9
            r1.A0 = r9
            r11 = r26
            r9 = 0
        L_0x0694:
            if (r9 >= r11) goto L_0x06aa
            java.util.ArrayList r12 = r1.f4782q0
            java.lang.Object r12 = r12.get(r9)
            v.d r12 = (v.C0347d) r12
            boolean r13 = r12 instanceof v.C0348e
            if (r13 == 0) goto L_0x06a7
            v.e r12 = (v.C0348e) r12
            r12.U()
        L_0x06a7:
            int r9 = r9 + 1
            goto L_0x0694
        L_0x06aa:
            boolean r9 = r1.W(r6)
            r12 = r0
            r0 = 0
            r13 = 1
        L_0x06b1:
            if (r13 == 0) goto L_0x08fa
            r14 = 1
            int r15 = r0 + 1
            r8.t()     // Catch:{ Exception -> 0x06d2 }
            r14 = 0
            r1.f4791z0 = r14     // Catch:{ Exception -> 0x06d2 }
            r1.A0 = r14     // Catch:{ Exception -> 0x06d2 }
            r1.g(r8)     // Catch:{ Exception -> 0x06d2 }
            r0 = 0
        L_0x06c2:
            if (r0 >= r11) goto L_0x06d9
            java.util.ArrayList r14 = r1.f4782q0     // Catch:{ Exception -> 0x06d2 }
            java.lang.Object r14 = r14.get(r0)     // Catch:{ Exception -> 0x06d2 }
            v.d r14 = (v.C0347d) r14     // Catch:{ Exception -> 0x06d2 }
            r14.g(r8)     // Catch:{ Exception -> 0x06d2 }
            int r0 = r0 + 1
            goto L_0x06c2
        L_0x06d2:
            r0 = move-exception
            r21 = r12
            r6 = 0
        L_0x06d6:
            r14 = 5
            goto L_0x07a8
        L_0x06d9:
            r1.S(r8)     // Catch:{ Exception -> 0x06d2 }
            java.lang.ref.WeakReference r0 = r1.f4776G0     // Catch:{ Exception -> 0x07a4 }
            if (r0 == 0) goto L_0x0715
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0711 }
            if (r0 == 0) goto L_0x0715
            java.lang.ref.WeakReference r0 = r1.f4776G0     // Catch:{ Exception -> 0x0711 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0711 }
            v.c r0 = (v.C0346c) r0     // Catch:{ Exception -> 0x0711 }
            r14 = r24
            t.f r13 = r8.k(r14)     // Catch:{ Exception -> 0x070b }
            t.c r6 = r1.f4788w0     // Catch:{ Exception -> 0x070b }
            t.f r0 = r6.k(r0)     // Catch:{ Exception -> 0x070b }
            r21 = r12
            r24 = r14
            r12 = 5
            r14 = 0
            r6.f(r0, r13, r14, r12)     // Catch:{ Exception -> 0x0707 }
            r6 = 0
            r1.f4776G0 = r6     // Catch:{ Exception -> 0x0707 }
            goto L_0x0717
        L_0x0707:
            r0 = move-exception
        L_0x0708:
            r6 = 0
            r13 = 1
            goto L_0x06d6
        L_0x070b:
            r0 = move-exception
            r21 = r12
            r24 = r14
            goto L_0x0708
        L_0x0711:
            r0 = move-exception
            r21 = r12
            goto L_0x0708
        L_0x0715:
            r21 = r12
        L_0x0717:
            java.lang.ref.WeakReference r0 = r1.f4778I0     // Catch:{ Exception -> 0x0799 }
            if (r0 == 0) goto L_0x073d
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0707 }
            if (r0 == 0) goto L_0x073d
            java.lang.ref.WeakReference r0 = r1.f4778I0     // Catch:{ Exception -> 0x0707 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0707 }
            v.c r0 = (v.C0346c) r0     // Catch:{ Exception -> 0x0707 }
            v.c r6 = r1.f4718L     // Catch:{ Exception -> 0x0707 }
            t.f r6 = r8.k(r6)     // Catch:{ Exception -> 0x0707 }
            t.c r12 = r1.f4788w0     // Catch:{ Exception -> 0x0707 }
            t.f r0 = r12.k(r0)     // Catch:{ Exception -> 0x0707 }
            r13 = 0
            r14 = 5
            r12.f(r6, r0, r13, r14)     // Catch:{ Exception -> 0x0707 }
            r6 = 0
            r1.f4778I0 = r6     // Catch:{ Exception -> 0x0707 }
        L_0x073d:
            java.lang.ref.WeakReference r0 = r1.f4777H0     // Catch:{ Exception -> 0x0799 }
            if (r0 == 0) goto L_0x076a
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0707 }
            if (r0 == 0) goto L_0x076a
            java.lang.ref.WeakReference r0 = r1.f4777H0     // Catch:{ Exception -> 0x0707 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0707 }
            v.c r0 = (v.C0346c) r0     // Catch:{ Exception -> 0x0707 }
            r6 = r22
            t.f r12 = r8.k(r6)     // Catch:{ Exception -> 0x0766 }
            t.c r13 = r1.f4788w0     // Catch:{ Exception -> 0x0766 }
            t.f r0 = r13.k(r0)     // Catch:{ Exception -> 0x0766 }
            r22 = r6
            r6 = 5
            r14 = 0
            r13.f(r0, r12, r14, r6)     // Catch:{ Exception -> 0x0707 }
            r6 = 0
            r1.f4777H0 = r6     // Catch:{ Exception -> 0x0707 }
            goto L_0x076a
        L_0x0766:
            r0 = move-exception
            r22 = r6
            goto L_0x0708
        L_0x076a:
            java.lang.ref.WeakReference r0 = r1.f4779J0     // Catch:{ Exception -> 0x0799 }
            if (r0 == 0) goto L_0x079d
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0799 }
            if (r0 == 0) goto L_0x079d
            java.lang.ref.WeakReference r0 = r1.f4779J0     // Catch:{ Exception -> 0x0799 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0799 }
            v.c r0 = (v.C0346c) r0     // Catch:{ Exception -> 0x0799 }
            v.c r6 = r1.f4717K     // Catch:{ Exception -> 0x0799 }
            t.f r6 = r8.k(r6)     // Catch:{ Exception -> 0x0799 }
            t.c r12 = r1.f4788w0     // Catch:{ Exception -> 0x0797 }
            t.f r0 = r12.k(r0)     // Catch:{ Exception -> 0x0797 }
            r13 = 0
            r14 = 5
            r12.f(r6, r0, r13, r14)     // Catch:{ Exception -> 0x0794 }
            r6 = 0
            r1.f4779J0 = r6     // Catch:{ Exception -> 0x0791 }
            goto L_0x079f
        L_0x0791:
            r0 = move-exception
        L_0x0792:
            r13 = 1
            goto L_0x07a8
        L_0x0794:
            r0 = move-exception
            r6 = 0
            goto L_0x0792
        L_0x0797:
            r0 = move-exception
            goto L_0x079a
        L_0x0799:
            r0 = move-exception
        L_0x079a:
            r6 = 0
            r14 = 5
            goto L_0x0792
        L_0x079d:
            r6 = 0
            r14 = 5
        L_0x079f:
            r8.p()     // Catch:{ Exception -> 0x0791 }
            r13 = 1
            goto L_0x07be
        L_0x07a4:
            r0 = move-exception
            r21 = r12
            goto L_0x079a
        L_0x07a8:
            r0.printStackTrace()
            java.io.PrintStream r12 = java.lang.System.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r14 = "EXCEPTION : "
            r6.<init>(r14)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r12.println(r0)
        L_0x07be:
            boolean[] r0 = v.j.f4849a
            if (r13 == 0) goto L_0x07ff
            r6 = 0
            r12 = 2
            r0[r12] = r6
            r6 = 64
            boolean r12 = r1.W(r6)
            r1.Q(r8, r12)
            java.util.ArrayList r13 = r1.f4782q0
            int r13 = r13.size()
            r14 = 0
            r16 = 0
        L_0x07d8:
            if (r14 >= r13) goto L_0x07fd
            java.util.ArrayList r6 = r1.f4782q0
            java.lang.Object r6 = r6.get(r14)
            v.d r6 = (v.C0347d) r6
            r6.Q(r8, r12)
            r26 = r12
            int r12 = r6.f4746h
            r27 = r13
            r13 = -1
            if (r12 != r13) goto L_0x07f2
            int r6 = r6.i
            if (r6 == r13) goto L_0x07f4
        L_0x07f2:
            r16 = 1
        L_0x07f4:
            int r14 = r14 + 1
            r12 = r26
            r13 = r27
            r6 = 64
            goto L_0x07d8
        L_0x07fd:
            r13 = -1
            goto L_0x0816
        L_0x07ff:
            r13 = -1
            r1.Q(r8, r9)
            r6 = 0
        L_0x0804:
            if (r6 >= r11) goto L_0x0814
            java.util.ArrayList r12 = r1.f4782q0
            java.lang.Object r12 = r12.get(r6)
            v.d r12 = (v.C0347d) r12
            r12.Q(r8, r9)
            int r6 = r6 + 1
            goto L_0x0804
        L_0x0814:
            r16 = 0
        L_0x0816:
            r6 = 8
            if (r7 == 0) goto L_0x087c
            if (r15 >= r6) goto L_0x087c
            r12 = 2
            boolean r0 = r0[r12]
            if (r0 == 0) goto L_0x087c
            r0 = 0
            r12 = 0
            r14 = 0
        L_0x0824:
            if (r0 >= r11) goto L_0x084b
            java.util.ArrayList r13 = r1.f4782q0
            java.lang.Object r13 = r13.get(r0)
            v.d r13 = (v.C0347d) r13
            int r6 = r13.f4731Y
            int r27 = r13.q()
            int r6 = r27 + r6
            int r12 = java.lang.Math.max(r12, r6)
            int r6 = r13.f4732Z
            int r13 = r13.k()
            int r13 = r13 + r6
            int r14 = java.lang.Math.max(r14, r13)
            int r0 = r0 + 1
            r6 = 8
            r13 = -1
            goto L_0x0824
        L_0x084b:
            int r0 = r1.f4736b0
            int r0 = java.lang.Math.max(r0, r12)
            int r6 = r1.f4738c0
            int r6 = java.lang.Math.max(r6, r14)
            r12 = 2
            if (r2 != r12) goto L_0x086a
            int r13 = r31.q()
            if (r13 >= r0) goto L_0x086a
            r1.O(r0)
            r13 = 0
            r23[r13] = r12
            r16 = 1
            r21 = 1
        L_0x086a:
            if (r4 != r12) goto L_0x087c
            int r0 = r31.k()
            if (r0 >= r6) goto L_0x087c
            r1.L(r6)
            r6 = 1
            r23[r6] = r12
            r16 = 1
            r21 = 1
        L_0x087c:
            int r0 = r1.f4736b0
            int r6 = r31.q()
            int r0 = java.lang.Math.max(r0, r6)
            int r6 = r31.q()
            if (r0 <= r6) goto L_0x0898
            r1.O(r0)
            r6 = 1
            r12 = 0
            r23[r12] = r6
            r16 = 1
            r18 = 1
            goto L_0x089b
        L_0x0898:
            r6 = 1
            r18 = r21
        L_0x089b:
            int r0 = r1.f4738c0
            int r12 = r31.k()
            int r0 = java.lang.Math.max(r0, r12)
            int r12 = r31.k()
            if (r0 <= r12) goto L_0x08b4
            r1.L(r0)
            r23[r6] = r6
            r0 = 1
            r16 = 1
            goto L_0x08b6
        L_0x08b4:
            r0 = r18
        L_0x08b6:
            if (r0 != 0) goto L_0x08ef
            r12 = 0
            r13 = r23[r12]
            r14 = 2
            if (r13 != r14) goto L_0x08d0
            if (r3 <= 0) goto L_0x08d0
            int r13 = r31.q()
            if (r13 <= r3) goto L_0x08d0
            r1.f4775E0 = r6
            r23[r12] = r6
            r1.O(r3)
            r0 = 1
            r16 = 1
        L_0x08d0:
            r12 = r23[r6]
            r13 = 2
            if (r12 != r13) goto L_0x08e9
            if (r5 <= 0) goto L_0x08e9
            int r12 = r31.k()
            if (r12 <= r5) goto L_0x08e9
            r1.F0 = r6
            r23[r6] = r6
            r1.L(r5)
            r0 = 8
            r6 = 1
            r12 = 1
            goto L_0x08f1
        L_0x08e9:
            r12 = r0
            r6 = r16
            r0 = 8
            goto L_0x08f1
        L_0x08ef:
            r13 = 2
            goto L_0x08e9
        L_0x08f1:
            if (r15 <= r0) goto L_0x08f4
            r6 = 0
        L_0x08f4:
            r13 = r6
            r0 = r15
            r6 = 64
            goto L_0x06b1
        L_0x08fa:
            r21 = r12
            r1.f4782q0 = r10
            if (r21 == 0) goto L_0x0906
            r3 = 0
            r23[r3] = r2
            r2 = 1
            r23[r2] = r4
        L_0x0906:
            android.support.v4.media.session.t r0 = r8.f4659m
            r1.F(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C0348e.U():void");
    }

    public static void V(C0347d dVar, f fVar, C0351b bVar) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        int i2;
        if (fVar != null) {
            if (dVar.f4745g0 == 8 || (dVar instanceof h) || (dVar instanceof C0344a)) {
                bVar.e = 0;
                bVar.f4858f = 0;
                return;
            }
            int[] iArr = dVar.f4761p0;
            bVar.f4854a = iArr[0];
            bVar.f4855b = iArr[1];
            bVar.f4856c = dVar.q();
            bVar.f4857d = dVar.k();
            bVar.i = false;
            bVar.f4861j = 0;
            if (bVar.f4854a == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bVar.f4855b == 3) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z2 || dVar.f4729W <= 0.0f) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z3 || dVar.f4729W <= 0.0f) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (z2 && dVar.t(0) && dVar.f4763r == 0 && !z4) {
                bVar.f4854a = 2;
                if (z3 && dVar.f4764s == 0) {
                    bVar.f4854a = 1;
                }
                z2 = false;
            }
            if (z3 && dVar.t(1) && dVar.f4764s == 0 && !z5) {
                bVar.f4855b = 2;
                if (z2 && dVar.f4763r == 0) {
                    bVar.f4855b = 1;
                }
                z3 = false;
            }
            if (dVar.A()) {
                bVar.f4854a = 1;
                z2 = false;
            }
            if (dVar.B()) {
                bVar.f4855b = 1;
                z3 = false;
            }
            int[] iArr2 = dVar.f4765t;
            if (z4) {
                if (iArr2[0] == 4) {
                    bVar.f4854a = 1;
                } else if (!z3) {
                    if (bVar.f4855b == 1) {
                        i2 = bVar.f4857d;
                    } else {
                        bVar.f4854a = 2;
                        fVar.b(dVar, bVar);
                        i2 = bVar.f4858f;
                    }
                    bVar.f4854a = 1;
                    bVar.f4856c = (int) (dVar.f4729W * ((float) i2));
                }
            }
            if (z5) {
                if (iArr2[1] == 4) {
                    bVar.f4855b = 1;
                } else if (!z2) {
                    if (bVar.f4854a == 1) {
                        i = bVar.f4856c;
                    } else {
                        bVar.f4855b = 2;
                        fVar.b(dVar, bVar);
                        i = bVar.e;
                    }
                    bVar.f4855b = 1;
                    if (dVar.f4730X == -1) {
                        bVar.f4857d = (int) (((float) i) / dVar.f4729W);
                    } else {
                        bVar.f4857d = (int) (dVar.f4729W * ((float) i));
                    }
                }
            }
            fVar.b(dVar, bVar);
            dVar.O(bVar.e);
            dVar.L(bVar.f4858f);
            dVar.f4712E = bVar.f4860h;
            dVar.I(bVar.f4859g);
            bVar.f4861j = 0;
        }
    }

    public final void C() {
        this.f4788w0.t();
        this.f4789x0 = 0;
        this.f4790y0 = 0;
        this.f4782q0.clear();
        super.C();
    }

    public final void S(C0337c cVar) {
        int i;
        boolean W2 = W(64);
        b(cVar, W2);
        int size = this.f4782q0.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0347d dVar = (C0347d) this.f4782q0.get(i2);
            boolean[] zArr = dVar.f4725S;
            zArr[0] = false;
            zArr[1] = false;
            if (dVar instanceof C0344a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i3 = 0; i3 < size; i3++) {
                C0347d dVar2 = (C0347d) this.f4782q0.get(i3);
                if (dVar2 instanceof C0344a) {
                    C0344a aVar = (C0344a) dVar2;
                    for (int i4 = 0; i4 < aVar.f4848r0; i4++) {
                        C0347d dVar3 = aVar.f4847q0[i4];
                        if (aVar.f4683t0 || dVar3.c()) {
                            int i5 = aVar.f4682s0;
                            if (i5 == 0 || i5 == 1) {
                                dVar3.f4725S[0] = true;
                            } else if (i5 == 2 || i5 == 3) {
                                dVar3.f4725S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f4780K0;
        hashSet.clear();
        for (int i6 = 0; i6 < size; i6++) {
            C0347d dVar4 = (C0347d) this.f4782q0.get(i6);
            dVar4.getClass();
            boolean z3 = dVar4 instanceof g;
            if (z3 || (dVar4 instanceof h)) {
                if (z3) {
                    hashSet.add(dVar4);
                } else {
                    dVar4.b(cVar, W2);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it2 = hashSet.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                g gVar = (g) ((C0347d) it2.next());
                int i7 = 0;
                while (true) {
                    if (i7 < gVar.f4848r0) {
                        if (hashSet.contains(gVar.f4847q0[i7])) {
                            gVar.b(cVar, W2);
                            hashSet.remove(gVar);
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    ((C0347d) it3.next()).b(cVar, W2);
                }
                hashSet.clear();
            }
        }
        if (C0337c.f4648q) {
            HashSet hashSet2 = new HashSet();
            for (int i8 = 0; i8 < size; i8++) {
                C0347d dVar5 = (C0347d) this.f4782q0.get(i8);
                dVar5.getClass();
                if (!(dVar5 instanceof g) && !(dVar5 instanceof h)) {
                    hashSet2.add(dVar5);
                }
            }
            if (this.f4761p0[0] == 2) {
                i = 0;
            } else {
                i = 1;
            }
            a(this, cVar, hashSet2, i, false);
            Iterator it4 = hashSet2.iterator();
            while (it4.hasNext()) {
                C0347d dVar6 = (C0347d) it4.next();
                j.b(this, cVar, dVar6);
                dVar6.b(cVar, W2);
            }
        } else {
            for (int i9 = 0; i9 < size; i9++) {
                C0347d dVar7 = (C0347d) this.f4782q0.get(i9);
                if (dVar7 instanceof C0348e) {
                    int[] iArr = dVar7.f4761p0;
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    if (i10 == 2) {
                        dVar7.M(1);
                    }
                    if (i11 == 2) {
                        dVar7.N(1);
                    }
                    dVar7.b(cVar, W2);
                    if (i10 == 2) {
                        dVar7.M(i10);
                    }
                    if (i11 == 2) {
                        dVar7.N(i11);
                    }
                } else {
                    j.b(this, cVar, dVar7);
                    if (!(dVar7 instanceof g) && !(dVar7 instanceof h)) {
                        dVar7.b(cVar, W2);
                    }
                }
            }
        }
        if (this.f4791z0 > 0) {
            j.a(this, cVar, (ArrayList) null, 0);
        }
        if (this.A0 > 0) {
            j.a(this, cVar, (ArrayList) null, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0108 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean T(int r14, boolean r15) {
        /*
            r13 = this;
            w.e r0 = r13.f4784s0
            v.e r1 = r0.f4864a
            r2 = 0
            int r3 = r1.j(r2)
            r4 = 1
            int r5 = r1.j(r4)
            int r6 = r1.r()
            int r7 = r1.s()
            java.util.ArrayList r8 = r0.e
            if (r15 == 0) goto L_0x006f
            r9 = 2
            if (r3 == r9) goto L_0x001f
            if (r5 != r9) goto L_0x006f
        L_0x001f:
            java.util.Iterator r10 = r8.iterator()
        L_0x0023:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x003a
            java.lang.Object r11 = r10.next()
            w.o r11 = (w.o) r11
            int r12 = r11.f4897f
            if (r12 != r14) goto L_0x0023
            boolean r11 = r11.k()
            if (r11 != 0) goto L_0x0023
            r15 = 0
        L_0x003a:
            if (r14 != 0) goto L_0x0056
            if (r15 == 0) goto L_0x006f
            if (r3 != r9) goto L_0x006f
            r1.M(r4)
            int r15 = r0.d(r1, r2)
            r1.O(r15)
            w.k r15 = r1.f4739d
            w.g r15 = r15.e
            int r9 = r1.q()
            r15.d(r9)
            goto L_0x006f
        L_0x0056:
            if (r15 == 0) goto L_0x006f
            if (r5 != r9) goto L_0x006f
            r1.N(r4)
            int r15 = r0.d(r1, r4)
            r1.L(r15)
            w.m r15 = r1.e
            w.g r15 = r15.e
            int r9 = r1.k()
            r15.d(r9)
        L_0x006f:
            int[] r15 = r1.f4761p0
            r9 = 4
            if (r14 != 0) goto L_0x0090
            r15 = r15[r2]
            if (r15 == r4) goto L_0x007a
            if (r15 != r9) goto L_0x0097
        L_0x007a:
            int r15 = r1.q()
            int r15 = r15 + r6
            w.k r7 = r1.f4739d
            w.f r7 = r7.i
            r7.d(r15)
            w.k r7 = r1.f4739d
            w.g r7 = r7.e
            int r15 = r15 - r6
            r7.d(r15)
        L_0x008e:
            r15 = 1
            goto L_0x00ae
        L_0x0090:
            r15 = r15[r4]
            if (r15 == r4) goto L_0x0099
            if (r15 != r9) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            r15 = 0
            goto L_0x00ae
        L_0x0099:
            int r15 = r1.k()
            int r15 = r15 + r7
            w.m r6 = r1.e
            w.f r6 = r6.i
            r6.d(r15)
            w.m r6 = r1.e
            w.g r6 = r6.e
            int r15 = r15 - r7
            r6.d(r15)
            goto L_0x008e
        L_0x00ae:
            r0.g()
            java.util.Iterator r0 = r8.iterator()
        L_0x00b5:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x00d3
            java.lang.Object r6 = r0.next()
            w.o r6 = (w.o) r6
            int r7 = r6.f4897f
            if (r7 == r14) goto L_0x00c6
            goto L_0x00b5
        L_0x00c6:
            v.d r7 = r6.f4894b
            if (r7 != r1) goto L_0x00cf
            boolean r7 = r6.f4898g
            if (r7 != 0) goto L_0x00cf
            goto L_0x00b5
        L_0x00cf:
            r6.e()
            goto L_0x00b5
        L_0x00d3:
            java.util.Iterator r0 = r8.iterator()
        L_0x00d7:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0108
            java.lang.Object r6 = r0.next()
            w.o r6 = (w.o) r6
            int r7 = r6.f4897f
            if (r7 == r14) goto L_0x00e8
            goto L_0x00d7
        L_0x00e8:
            if (r15 != 0) goto L_0x00ef
            v.d r7 = r6.f4894b
            if (r7 != r1) goto L_0x00ef
            goto L_0x00d7
        L_0x00ef:
            w.f r7 = r6.f4899h
            boolean r7 = r7.f4878j
            if (r7 != 0) goto L_0x00f6
            goto L_0x0109
        L_0x00f6:
            w.f r7 = r6.i
            boolean r7 = r7.f4878j
            if (r7 != 0) goto L_0x00fd
            goto L_0x0109
        L_0x00fd:
            boolean r7 = r6 instanceof w.c
            if (r7 != 0) goto L_0x00d7
            w.g r6 = r6.e
            boolean r6 = r6.f4878j
            if (r6 != 0) goto L_0x00d7
            goto L_0x0109
        L_0x0108:
            r2 = 1
        L_0x0109:
            r1.M(r3)
            r1.N(r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C0348e.T(int, boolean):boolean");
    }

    public final boolean W(int i) {
        if ((this.f4774D0 & i) == i) {
            return true;
        }
        return false;
    }

    public final void n(StringBuilder sb) {
        sb.append(this.f4749j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f4727U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f4728V);
        sb.append("\n");
        Iterator it2 = this.f4782q0.iterator();
        while (it2.hasNext()) {
            ((C0347d) it2.next()).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, w.e] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, w.b] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, w.b] */
    public C0348e() {
        ? obj = new Object();
        obj.f4865b = true;
        obj.f4866c = true;
        obj.e = new ArrayList();
        new ArrayList();
        obj.f4868f = null;
        obj.f4869g = new Object();
        obj.f4870h = new ArrayList();
        obj.f4864a = this;
        obj.f4867d = this;
        this.f4784s0 = obj;
        this.f4786u0 = null;
        this.f4787v0 = false;
        this.f4788w0 = new C0337c();
        this.f4791z0 = 0;
        this.A0 = 0;
        this.f4772B0 = new C0345b[4];
        this.f4773C0 = new C0345b[4];
        this.f4774D0 = 257;
        this.f4775E0 = false;
        this.F0 = false;
        this.f4776G0 = null;
        this.f4777H0 = null;
        this.f4778I0 = null;
        this.f4779J0 = null;
        this.f4780K0 = new HashSet();
        this.f4781L0 = new Object();
    }

    public final void F(t tVar) {
        super.F(tVar);
        int size = this.f4782q0.size();
        for (int i = 0; i < size; i++) {
            ((C0347d) this.f4782q0.get(i)).F(tVar);
        }
    }

    public final void P(boolean z2, boolean z3) {
        super.P(z2, z3);
        int size = this.f4782q0.size();
        for (int i = 0; i < size; i++) {
            ((C0347d) this.f4782q0.get(i)).P(z2, z3);
        }
    }
}
