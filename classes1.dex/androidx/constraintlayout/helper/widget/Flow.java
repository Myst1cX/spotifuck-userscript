package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.HashMap;
import v.C0347d;
import v.g;
import v.i;
import y.r;
import y.t;

public class Flow extends t {

    /* renamed from: o  reason: collision with root package name */
    public final g f1419o;

    public final void h(C0347d dVar, boolean z2) {
        g gVar = this.f1419o;
        int i = gVar.f4835u0;
        if (i <= 0 && gVar.f4836v0 <= 0) {
            return;
        }
        if (z2) {
            gVar.f4837w0 = gVar.f4836v0;
            gVar.f4838x0 = i;
            return;
        }
        gVar.f4837w0 = i;
        gVar.f4838x0 = gVar.f4836v0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v0, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: v.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v3, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v92, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v77, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v10, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v94, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v7, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v8, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v9, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x07bd  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x07c2  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x07d6  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x07d9  */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x07f5  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x07f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(v.g r42, int r43, int r44) {
        /*
            r41 = this;
            r0 = r41
            r9 = r42
            int r10 = android.view.View.MeasureSpec.getMode(r43)
            int r11 = android.view.View.MeasureSpec.getSize(r43)
            int r12 = android.view.View.MeasureSpec.getMode(r44)
            int r13 = android.view.View.MeasureSpec.getSize(r44)
            if (r9 == 0) goto L_0x0804
            int r1 = r9.f4848r0
            r14 = 2
            r15 = 3
            r8 = 0
            r7 = 1
            if (r1 <= 0) goto L_0x0085
            v.d r1 = r9.f4726T
            if (r1 == 0) goto L_0x0027
            v.e r1 = (v.C0348e) r1
            y.f r1 = r1.f4786u0
            goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            if (r1 != 0) goto L_0x0032
            r9.f4840z0 = r8
            r9.A0 = r8
            r9.f4839y0 = r8
            goto L_0x07fa
        L_0x0032:
            r3 = 0
        L_0x0033:
            int r4 = r9.f4848r0
            if (r3 >= r4) goto L_0x0085
            v.d[] r4 = r9.f4847q0
            r4 = r4[r3]
            if (r4 != 0) goto L_0x003e
            goto L_0x0082
        L_0x003e:
            boolean r5 = r4 instanceof v.h
            if (r5 == 0) goto L_0x0043
            goto L_0x0082
        L_0x0043:
            int r5 = r4.j(r8)
            int r6 = r4.j(r7)
            if (r5 != r15) goto L_0x0058
            int r2 = r4.f4763r
            if (r2 == r7) goto L_0x0058
            if (r6 != r15) goto L_0x0058
            int r2 = r4.f4764s
            if (r2 == r7) goto L_0x0058
            goto L_0x0082
        L_0x0058:
            if (r5 != r15) goto L_0x005b
            r5 = 2
        L_0x005b:
            if (r6 != r15) goto L_0x005e
            r6 = 2
        L_0x005e:
            w.b r2 = r9.f4808B0
            r2.f4854a = r5
            r2.f4855b = r6
            int r5 = r4.q()
            r2.f4856c = r5
            int r5 = r4.k()
            r2.f4857d = r5
            r1.b(r4, r2)
            int r5 = r2.e
            r4.O(r5)
            int r5 = r2.f4858f
            r4.L(r5)
            int r2 = r2.f4859g
            r4.I(r2)
        L_0x0082:
            int r3 = r3 + 1
            goto L_0x0033
        L_0x0085:
            int r6 = r9.f4837w0
            int r5 = r9.f4838x0
            int r4 = r9.f4833s0
            int r3 = r9.f4834t0
            int[] r2 = new int[r14]
            int r1 = r11 - r6
            int r1 = r1 - r5
            int r15 = r9.f4827V0
            if (r15 != r7) goto L_0x0099
            int r1 = r13 - r4
            int r1 = r1 - r3
        L_0x0099:
            r14 = -1
            if (r15 != 0) goto L_0x00a9
            int r15 = r9.f4810D0
            if (r15 != r14) goto L_0x00a2
            r9.f4810D0 = r8
        L_0x00a2:
            int r15 = r9.f4811E0
            if (r15 != r14) goto L_0x00b5
            r9.f4811E0 = r8
            goto L_0x00b5
        L_0x00a9:
            int r15 = r9.f4810D0
            if (r15 != r14) goto L_0x00af
            r9.f4810D0 = r8
        L_0x00af:
            int r15 = r9.f4811E0
            if (r15 != r14) goto L_0x00b5
            r9.f4811E0 = r8
        L_0x00b5:
            v.d[] r14 = r9.f4847q0
            r15 = 0
            r17 = 0
        L_0x00ba:
            int r8 = r9.f4848r0
            r7 = 8
            if (r15 >= r8) goto L_0x00ce
            v.d[] r8 = r9.f4847q0
            r8 = r8[r15]
            int r8 = r8.f4745g0
            if (r8 != r7) goto L_0x00ca
            int r17 = r17 + 1
        L_0x00ca:
            int r15 = r15 + 1
            r7 = 1
            goto L_0x00ba
        L_0x00ce:
            if (r17 <= 0) goto L_0x00f3
            int r8 = r8 - r17
            v.d[] r14 = new v.C0347d[r8]
            r8 = 0
            r15 = 0
        L_0x00d6:
            int r7 = r9.f4848r0
            if (r15 >= r7) goto L_0x00f3
            v.d[] r7 = r9.f4847q0
            r7 = r7[r15]
            r20 = r1
            int r1 = r7.f4745g0
            r21 = r2
            r2 = 8
            if (r1 == r2) goto L_0x00ec
            r14[r8] = r7
            int r8 = r8 + 1
        L_0x00ec:
            int r15 = r15 + 1
            r1 = r20
            r2 = r21
            goto L_0x00d6
        L_0x00f3:
            r20 = r1
            r21 = r2
            r15 = r14
            r14 = r8
            r9.f4831a1 = r15
            r9.f4832b1 = r14
            int r1 = r9.f4825T0
            java.util.ArrayList r8 = r9.f4828W0
            if (r1 == 0) goto L_0x0718
            v.c r7 = r9.f4716J
            v.c r2 = r9.I
            v.c r0 = r9.f4717K
            r27 = r0
            v.c r0 = r9.f4718L
            r28 = r0
            int[] r0 = r9.f4761p0
            r17 = r7
            r7 = 1
            if (r1 == r7) goto L_0x04f0
            r7 = 2
            if (r1 == r7) goto L_0x039b
            r7 = 3
            if (r1 == r7) goto L_0x0132
        L_0x011c:
            r31 = r3
            r32 = r4
            r33 = r5
            r34 = r6
            r39 = r10
            r38 = r11
            r29 = r12
            r35 = r13
            r30 = r21
        L_0x012e:
            r1 = 0
            r2 = 1
            goto L_0x07a9
        L_0x0132:
            int r7 = r9.f4827V0
            if (r14 != 0) goto L_0x0137
            goto L_0x011c
        L_0x0137:
            r8.clear()
            v.f r1 = new v.f
            r22 = r4
            v.c r4 = r9.I
            r23 = r5
            v.c r5 = r9.f4716J
            r24 = r6
            v.c r6 = r9.f4717K
            r25 = r8
            v.c r8 = r9.f4718L
            r43 = r1
            r29 = r20
            r20 = r2
            r30 = r21
            r2 = r42
            r31 = r3
            r3 = r7
            r32 = r22
            r33 = r23
            r34 = r24
            r36 = r7
            r35 = r13
            r13 = 1
            r7 = r8
            r13 = r25
            r8 = r29
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r13.add(r1)
            if (r36 != 0) goto L_0x0212
            r2 = 0
            r3 = 0
            r4 = 0
            r8 = 0
        L_0x0175:
            if (r8 >= r14) goto L_0x0206
            r5 = 1
            int r2 = r2 + r5
            r7 = r15[r8]
            r6 = r29
            int r18 = r9.U(r7, r6)
            int[] r5 = r7.f4761p0
            r29 = r12
            r12 = 0
            r5 = r5[r12]
            r12 = 3
            if (r5 != r12) goto L_0x018d
            int r3 = r3 + 1
        L_0x018d:
            r12 = r3
            if (r4 == r6) goto L_0x0197
            int r3 = r9.f4821P0
            int r3 = r3 + r4
            int r3 = r3 + r18
            if (r3 <= r6) goto L_0x019d
        L_0x0197:
            v.d r3 = r1.f4793b
            if (r3 == 0) goto L_0x019d
            r3 = 1
            goto L_0x019e
        L_0x019d:
            r3 = 0
        L_0x019e:
            if (r3 != 0) goto L_0x01a9
            if (r8 <= 0) goto L_0x01a9
            int r5 = r9.f4826U0
            if (r5 <= 0) goto L_0x01a9
            if (r2 <= r5) goto L_0x01a9
            r3 = 1
        L_0x01a9:
            if (r3 == 0) goto L_0x01e0
            v.f r5 = new v.f
            v.c r4 = r9.I
            v.c r3 = r9.f4716J
            v.c r2 = r9.f4717K
            v.c r1 = r9.f4718L
            r19 = r1
            r1 = r5
            r21 = r2
            r2 = r42
            r22 = r3
            r3 = r36
            r43 = r12
            r12 = r5
            r5 = r22
            r37 = r6
            r6 = r21
            r38 = r11
            r11 = r7
            r7 = r19
            r39 = r10
            r10 = r8
            r8 = r37
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r12.f4803n = r10
            r13.add(r12)
            r1 = r12
            r4 = r18
            r2 = 1
            goto L_0x01f5
        L_0x01e0:
            r37 = r6
            r39 = r10
            r38 = r11
            r43 = r12
            r11 = r7
            r10 = r8
            if (r10 <= 0) goto L_0x01f3
            int r3 = r9.f4821P0
            int r3 = r3 + r18
            int r3 = r3 + r4
            r4 = r3
            goto L_0x01f5
        L_0x01f3:
            r4 = r18
        L_0x01f5:
            r1.a(r11)
            int r8 = r10 + 1
            r3 = r43
            r12 = r29
            r29 = r37
            r11 = r38
            r10 = r39
            goto L_0x0175
        L_0x0206:
            r39 = r10
            r38 = r11
            r37 = r29
            r29 = r12
            r12 = r37
            goto L_0x0290
        L_0x0212:
            r39 = r10
            r38 = r11
            r37 = r29
            r29 = r12
            r2 = 0
            r3 = 0
            r8 = 0
            r10 = 0
        L_0x021e:
            if (r10 >= r14) goto L_0x028d
            r4 = 1
            int r8 = r8 + r4
            r11 = r15[r10]
            r12 = r37
            int r18 = r9.T(r11, r12)
            int[] r5 = r11.f4761p0
            r5 = r5[r4]
            r4 = 3
            if (r5 != r4) goto L_0x0233
            int r2 = r2 + 1
        L_0x0233:
            r19 = r2
            if (r3 == r12) goto L_0x023e
            int r2 = r9.f4822Q0
            int r2 = r2 + r3
            int r2 = r2 + r18
            if (r2 <= r12) goto L_0x0244
        L_0x023e:
            v.d r2 = r1.f4793b
            if (r2 == 0) goto L_0x0244
            r2 = 1
            goto L_0x0245
        L_0x0244:
            r2 = 0
        L_0x0245:
            if (r2 != 0) goto L_0x0251
            if (r10 <= 0) goto L_0x0251
            int r4 = r9.f4826U0
            if (r4 <= 0) goto L_0x0251
            if (r8 <= r4) goto L_0x0251
            r7 = 1
            goto L_0x0252
        L_0x0251:
            r7 = r2
        L_0x0252:
            if (r7 == 0) goto L_0x0274
            v.f r8 = new v.f
            v.c r4 = r9.I
            v.c r5 = r9.f4716J
            v.c r6 = r9.f4717K
            v.c r7 = r9.f4718L
            r1 = r8
            r2 = r42
            r3 = r36
            r37 = r15
            r15 = r8
            r8 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r15.f4803n = r10
            r13.add(r15)
            r1 = r15
            r3 = r18
            r8 = 1
            goto L_0x0281
        L_0x0274:
            r37 = r15
            if (r10 <= 0) goto L_0x027f
            int r2 = r9.f4822Q0
            int r2 = r2 + r18
            int r2 = r2 + r3
            r3 = r2
            goto L_0x0281
        L_0x027f:
            r3 = r18
        L_0x0281:
            r1.a(r11)
            int r10 = r10 + 1
            r2 = r19
            r15 = r37
            r37 = r12
            goto L_0x021e
        L_0x028d:
            r12 = r37
            r3 = r2
        L_0x0290:
            int r1 = r13.size()
            int r2 = r9.f4837w0
            int r4 = r9.f4833s0
            int r5 = r9.f4838x0
            int r6 = r9.f4834t0
            r7 = 0
            r8 = r0[r7]
            r7 = 2
            if (r8 == r7) goto L_0x02aa
            r8 = 1
            r0 = r0[r8]
            if (r0 != r7) goto L_0x02a8
            goto L_0x02aa
        L_0x02a8:
            r8 = 0
            goto L_0x02ab
        L_0x02aa:
            r8 = 1
        L_0x02ab:
            if (r3 <= 0) goto L_0x02d0
            if (r8 == 0) goto L_0x02d0
            r8 = 0
        L_0x02b0:
            if (r8 >= r1) goto L_0x02d0
            java.lang.Object r0 = r13.get(r8)
            v.f r0 = (v.f) r0
            if (r36 != 0) goto L_0x02c4
            int r3 = r0.d()
            int r3 = r12 - r3
            r0.e(r3)
            goto L_0x02cd
        L_0x02c4:
            int r3 = r0.c()
            int r3 = r12 - r3
            r0.e(r3)
        L_0x02cd:
            int r8 = r8 + 1
            goto L_0x02b0
        L_0x02d0:
            r7 = r2
            r10 = r4
            r4 = r17
            r3 = r20
            r14 = r27
            r11 = r28
            r0 = 0
            r2 = 0
            r8 = 0
        L_0x02dd:
            if (r8 >= r1) goto L_0x0393
            java.lang.Object r15 = r13.get(r8)
            v.f r15 = (v.f) r15
            if (r36 != 0) goto L_0x0339
            int r6 = r1 + -1
            if (r8 >= r6) goto L_0x02fc
            int r6 = r8 + 1
            java.lang.Object r6 = r13.get(r6)
            v.f r6 = (v.f) r6
            v.d r6 = r6.f4793b
            v.c r6 = r6.f4716J
            r11 = r6
            r40 = r13
            r6 = 0
            goto L_0x0302
        L_0x02fc:
            int r6 = r9.f4834t0
            r40 = r13
            r11 = r28
        L_0x0302:
            v.d r13 = r15.f4793b
            v.c r13 = r13.f4718L
            r16 = r15
            r17 = r36
            r18 = r3
            r19 = r4
            r20 = r14
            r21 = r11
            r22 = r7
            r23 = r10
            r24 = r5
            r25 = r6
            r26 = r12
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r4 = r15.d()
            int r0 = java.lang.Math.max(r0, r4)
            int r4 = r15.c()
            int r4 = r4 + r2
            if (r8 <= 0) goto L_0x0331
            int r2 = r9.f4822Q0
            int r4 = r4 + r2
        L_0x0331:
            r43 = r1
            r2 = r4
            r4 = r13
            r13 = r40
            r10 = 0
            goto L_0x038d
        L_0x0339:
            r40 = r13
            int r5 = r1 + -1
            if (r8 >= r5) goto L_0x0352
            int r5 = r8 + 1
            r13 = r40
            java.lang.Object r5 = r13.get(r5)
            v.f r5 = (v.f) r5
            v.d r5 = r5.f4793b
            v.c r5 = r5.I
            r43 = r1
            r14 = r5
            r5 = 0
            goto L_0x035a
        L_0x0352:
            r13 = r40
            int r5 = r9.f4838x0
            r43 = r1
            r14 = r27
        L_0x035a:
            v.d r1 = r15.f4793b
            v.c r1 = r1.f4717K
            r16 = r15
            r17 = r36
            r18 = r3
            r19 = r4
            r20 = r14
            r21 = r11
            r22 = r7
            r23 = r10
            r24 = r5
            r25 = r6
            r26 = r12
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r3 = r15.d()
            int r3 = r3 + r0
            int r0 = r15.c()
            int r0 = java.lang.Math.max(r2, r0)
            if (r8 <= 0) goto L_0x0389
            int r2 = r9.f4821P0
            int r3 = r3 + r2
        L_0x0389:
            r2 = r0
            r0 = r3
            r7 = 0
            r3 = r1
        L_0x038d:
            int r8 = r8 + 1
            r1 = r43
            goto L_0x02dd
        L_0x0393:
            r1 = 0
            r30[r1] = r0
            r0 = 1
            r30[r0] = r2
            goto L_0x012e
        L_0x039b:
            r31 = r3
            r32 = r4
            r33 = r5
            r34 = r6
            r39 = r10
            r38 = r11
            r29 = r12
            r35 = r13
            r37 = r15
            r12 = r20
            r30 = r21
            int r0 = r9.f4827V0
            if (r0 != 0) goto L_0x03da
            int r8 = r9.f4826U0
            if (r8 > 0) goto L_0x03d8
            r1 = 0
            r2 = 0
            r8 = 0
        L_0x03bc:
            if (r8 >= r14) goto L_0x03d6
            if (r8 <= 0) goto L_0x03c3
            int r3 = r9.f4821P0
            int r1 = r1 + r3
        L_0x03c3:
            r3 = r37[r8]
            if (r3 != 0) goto L_0x03c8
            goto L_0x03d3
        L_0x03c8:
            int r3 = r9.U(r3, r12)
            int r3 = r3 + r1
            if (r3 <= r12) goto L_0x03d0
            goto L_0x03d6
        L_0x03d0:
            int r2 = r2 + 1
            r1 = r3
        L_0x03d3:
            int r8 = r8 + 1
            goto L_0x03bc
        L_0x03d6:
            r8 = 0
            goto L_0x03fd
        L_0x03d8:
            r2 = r8
            goto L_0x03d6
        L_0x03da:
            int r8 = r9.f4826U0
            if (r8 > 0) goto L_0x03fc
            r1 = 0
            r2 = 0
            r8 = 0
        L_0x03e1:
            if (r8 >= r14) goto L_0x03fb
            if (r8 <= 0) goto L_0x03e8
            int r3 = r9.f4822Q0
            int r1 = r1 + r3
        L_0x03e8:
            r3 = r37[r8]
            if (r3 != 0) goto L_0x03ed
            goto L_0x03f8
        L_0x03ed:
            int r3 = r9.T(r3, r12)
            int r3 = r3 + r1
            if (r3 <= r12) goto L_0x03f5
            goto L_0x03fb
        L_0x03f5:
            int r2 = r2 + 1
            r1 = r3
        L_0x03f8:
            int r8 = r8 + 1
            goto L_0x03e1
        L_0x03fb:
            r8 = r2
        L_0x03fc:
            r2 = 0
        L_0x03fd:
            int[] r1 = r9.f4830Z0
            if (r1 != 0) goto L_0x0406
            r1 = 2
            int[] r1 = new int[r1]
            r9.f4830Z0 = r1
        L_0x0406:
            if (r8 != 0) goto L_0x040b
            r1 = 1
            if (r0 == r1) goto L_0x040f
        L_0x040b:
            if (r2 != 0) goto L_0x0412
            if (r0 != 0) goto L_0x0412
        L_0x040f:
            r1 = r8
            r8 = 1
            goto L_0x0414
        L_0x0412:
            r1 = r8
            r8 = 0
        L_0x0414:
            if (r8 != 0) goto L_0x04e6
            if (r0 != 0) goto L_0x0422
            float r1 = (float) r14
            float r3 = (float) r2
            float r1 = r1 / r3
            double r3 = (double) r1
            double r3 = java.lang.Math.ceil(r3)
            int r1 = (int) r3
            goto L_0x042b
        L_0x0422:
            float r2 = (float) r14
            float r3 = (float) r1
            float r2 = r2 / r3
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
        L_0x042b:
            v.d[] r3 = r9.f4829Y0
            if (r3 == 0) goto L_0x0432
            int r4 = r3.length
            if (r4 >= r2) goto L_0x0434
        L_0x0432:
            r4 = 0
            goto L_0x0439
        L_0x0434:
            r4 = 0
            java.util.Arrays.fill(r3, r4)
            goto L_0x043d
        L_0x0439:
            v.d[] r3 = new v.C0347d[r2]
            r9.f4829Y0 = r3
        L_0x043d:
            v.d[] r3 = r9.X0
            if (r3 == 0) goto L_0x0449
            int r5 = r3.length
            if (r5 >= r1) goto L_0x0445
            goto L_0x0449
        L_0x0445:
            java.util.Arrays.fill(r3, r4)
            goto L_0x044d
        L_0x0449:
            v.d[] r3 = new v.C0347d[r1]
            r9.X0 = r3
        L_0x044d:
            r3 = 0
        L_0x044e:
            if (r3 >= r2) goto L_0x0499
            r4 = 0
        L_0x0451:
            if (r4 >= r1) goto L_0x0494
            int r5 = r4 * r2
            int r5 = r5 + r3
            r6 = 1
            if (r0 != r6) goto L_0x045c
            int r5 = r3 * r1
            int r5 = r5 + r4
        L_0x045c:
            r10 = r37
            int r6 = r10.length
            if (r5 < r6) goto L_0x0462
            goto L_0x048f
        L_0x0462:
            r5 = r10[r5]
            if (r5 != 0) goto L_0x0467
            goto L_0x048f
        L_0x0467:
            int r6 = r9.U(r5, r12)
            v.d[] r7 = r9.f4829Y0
            r7 = r7[r3]
            if (r7 == 0) goto L_0x0477
            int r7 = r7.q()
            if (r7 >= r6) goto L_0x047b
        L_0x0477:
            v.d[] r6 = r9.f4829Y0
            r6[r3] = r5
        L_0x047b:
            int r6 = r9.T(r5, r12)
            v.d[] r7 = r9.X0
            r7 = r7[r4]
            if (r7 == 0) goto L_0x048b
            int r7 = r7.k()
            if (r7 >= r6) goto L_0x048f
        L_0x048b:
            v.d[] r6 = r9.X0
            r6[r4] = r5
        L_0x048f:
            int r4 = r4 + 1
            r37 = r10
            goto L_0x0451
        L_0x0494:
            r10 = r37
            int r3 = r3 + 1
            goto L_0x044e
        L_0x0499:
            r10 = r37
            r3 = 0
            r4 = 0
        L_0x049d:
            if (r3 >= r2) goto L_0x04b3
            v.d[] r5 = r9.f4829Y0
            r5 = r5[r3]
            if (r5 == 0) goto L_0x04b0
            if (r3 <= 0) goto L_0x04aa
            int r6 = r9.f4821P0
            int r4 = r4 + r6
        L_0x04aa:
            int r5 = r9.U(r5, r12)
            int r5 = r5 + r4
            r4 = r5
        L_0x04b0:
            int r3 = r3 + 1
            goto L_0x049d
        L_0x04b3:
            r3 = 0
            r5 = 0
        L_0x04b5:
            if (r3 >= r1) goto L_0x04cb
            v.d[] r6 = r9.X0
            r6 = r6[r3]
            if (r6 == 0) goto L_0x04c8
            if (r3 <= 0) goto L_0x04c2
            int r7 = r9.f4822Q0
            int r5 = r5 + r7
        L_0x04c2:
            int r6 = r9.T(r6, r12)
            int r6 = r6 + r5
            r5 = r6
        L_0x04c8:
            int r3 = r3 + 1
            goto L_0x04b5
        L_0x04cb:
            r3 = 0
            r30[r3] = r4
            r3 = 1
            r30[r3] = r5
            if (r0 != 0) goto L_0x04dc
            if (r4 <= r12) goto L_0x04da
            if (r2 <= r3) goto L_0x04da
            int r2 = r2 + -1
            goto L_0x04e2
        L_0x04da:
            r8 = 1
            goto L_0x04e2
        L_0x04dc:
            if (r5 <= r12) goto L_0x04da
            if (r1 <= r3) goto L_0x04da
            int r1 = r1 + -1
        L_0x04e2:
            r37 = r10
            goto L_0x0414
        L_0x04e6:
            r3 = 1
            int[] r0 = r9.f4830Z0
            r4 = 0
            r0[r4] = r2
            r0[r3] = r1
            goto L_0x012e
        L_0x04f0:
            r31 = r3
            r32 = r4
            r33 = r5
            r34 = r6
            r39 = r10
            r38 = r11
            r29 = r12
            r35 = r13
            r10 = r15
            r12 = r20
            r30 = r21
            r20 = r2
            r13 = r8
            int r11 = r9.f4827V0
            if (r14 != 0) goto L_0x050e
            goto L_0x012e
        L_0x050e:
            r13.clear()
            v.f r15 = new v.f
            v.c r4 = r9.I
            v.c r5 = r9.f4716J
            v.c r6 = r9.f4717K
            v.c r7 = r9.f4718L
            r1 = r15
            r2 = r42
            r3 = r11
            r8 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r13.add(r15)
            if (r11 != 0) goto L_0x05a3
            r2 = r15
            r1 = 0
            r8 = 0
            r15 = 0
        L_0x052c:
            if (r15 >= r14) goto L_0x059d
            r7 = r10[r15]
            int r18 = r9.U(r7, r12)
            int[] r3 = r7.f4761p0
            r4 = 0
            r3 = r3[r4]
            r4 = 3
            if (r3 != r4) goto L_0x053e
            int r8 = r8 + 1
        L_0x053e:
            r19 = r8
            if (r1 == r12) goto L_0x0549
            int r3 = r9.f4821P0
            int r3 = r3 + r1
            int r3 = r3 + r18
            if (r3 <= r12) goto L_0x054f
        L_0x0549:
            v.d r3 = r2.f4793b
            if (r3 == 0) goto L_0x054f
            r8 = 1
            goto L_0x0550
        L_0x054f:
            r8 = 0
        L_0x0550:
            if (r8 != 0) goto L_0x055d
            if (r15 <= 0) goto L_0x055d
            int r3 = r9.f4826U0
            if (r3 <= 0) goto L_0x055d
            int r3 = r15 % r3
            if (r3 != 0) goto L_0x055d
            r8 = 1
        L_0x055d:
            if (r8 == 0) goto L_0x0584
            v.f r8 = new v.f
            v.c r4 = r9.I
            v.c r5 = r9.f4716J
            v.c r6 = r9.f4717K
            v.c r3 = r9.f4718L
            r1 = r8
            r2 = r42
            r21 = r3
            r3 = r11
            r22 = r0
            r0 = r7
            r7 = r21
            r36 = r11
            r11 = r8
            r8 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r11.f4803n = r15
            r13.add(r11)
            r2 = r11
        L_0x0581:
            r1 = r18
            goto L_0x0591
        L_0x0584:
            r22 = r0
            r0 = r7
            r36 = r11
            if (r15 <= 0) goto L_0x0581
            int r3 = r9.f4821P0
            int r3 = r3 + r18
            int r3 = r3 + r1
            r1 = r3
        L_0x0591:
            r2.a(r0)
            int r15 = r15 + 1
            r8 = r19
            r0 = r22
            r11 = r36
            goto L_0x052c
        L_0x059d:
            r22 = r0
            r36 = r11
            goto L_0x060d
        L_0x05a3:
            r22 = r0
            r36 = r11
            r0 = 0
            r1 = 0
            r8 = 0
        L_0x05aa:
            if (r0 >= r14) goto L_0x060d
            r11 = r10[r0]
            int r18 = r9.T(r11, r12)
            int[] r2 = r11.f4761p0
            r3 = 1
            r2 = r2[r3]
            r7 = 3
            if (r2 != r7) goto L_0x05bc
            int r8 = r8 + 1
        L_0x05bc:
            r19 = r8
            if (r1 == r12) goto L_0x05c7
            int r2 = r9.f4822Q0
            int r2 = r2 + r1
            int r2 = r2 + r18
            if (r2 <= r12) goto L_0x05cd
        L_0x05c7:
            v.d r2 = r15.f4793b
            if (r2 == 0) goto L_0x05cd
            r8 = 1
            goto L_0x05ce
        L_0x05cd:
            r8 = 0
        L_0x05ce:
            if (r8 != 0) goto L_0x05db
            if (r0 <= 0) goto L_0x05db
            int r2 = r9.f4826U0
            if (r2 <= 0) goto L_0x05db
            int r2 = r0 % r2
            if (r2 != 0) goto L_0x05db
            r8 = 1
        L_0x05db:
            if (r8 == 0) goto L_0x05fb
            v.f r15 = new v.f
            v.c r4 = r9.I
            v.c r5 = r9.f4716J
            v.c r6 = r9.f4717K
            v.c r8 = r9.f4718L
            r1 = r15
            r2 = r42
            r3 = r36
            r21 = 3
            r7 = r8
            r8 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r15.f4803n = r0
            r13.add(r15)
        L_0x05f8:
            r1 = r18
            goto L_0x0605
        L_0x05fb:
            r21 = 3
            if (r0 <= 0) goto L_0x05f8
            int r2 = r9.f4822Q0
            int r2 = r2 + r18
            int r2 = r2 + r1
            r1 = r2
        L_0x0605:
            r15.a(r11)
            int r0 = r0 + 1
            r8 = r19
            goto L_0x05aa
        L_0x060d:
            int r0 = r13.size()
            int r1 = r9.f4837w0
            int r2 = r9.f4833s0
            int r3 = r9.f4838x0
            int r4 = r9.f4834t0
            r5 = 0
            r6 = r22[r5]
            r5 = 2
            if (r6 == r5) goto L_0x0627
            r6 = 1
            r7 = r22[r6]
            if (r7 != r5) goto L_0x0625
            goto L_0x0627
        L_0x0625:
            r5 = 0
            goto L_0x0628
        L_0x0627:
            r5 = 1
        L_0x0628:
            if (r8 <= 0) goto L_0x064d
            if (r5 == 0) goto L_0x064d
            r8 = 0
        L_0x062d:
            if (r8 >= r0) goto L_0x064d
            java.lang.Object r5 = r13.get(r8)
            v.f r5 = (v.f) r5
            if (r36 != 0) goto L_0x0641
            int r6 = r5.d()
            int r6 = r12 - r6
            r5.e(r6)
            goto L_0x064a
        L_0x0641:
            int r6 = r5.c()
            int r6 = r12 - r6
            r5.e(r6)
        L_0x064a:
            int r8 = r8 + 1
            goto L_0x062d
        L_0x064d:
            r7 = r1
            r10 = r2
            r6 = r17
            r5 = r20
            r14 = r27
            r11 = r28
            r1 = 0
            r2 = 0
            r8 = 0
        L_0x065a:
            if (r8 >= r0) goto L_0x0710
            java.lang.Object r15 = r13.get(r8)
            v.f r15 = (v.f) r15
            if (r36 != 0) goto L_0x06b6
            int r4 = r0 + -1
            if (r8 >= r4) goto L_0x0679
            int r4 = r8 + 1
            java.lang.Object r4 = r13.get(r4)
            v.f r4 = (v.f) r4
            v.d r4 = r4.f4793b
            v.c r4 = r4.f4716J
            r11 = r4
            r40 = r13
            r4 = 0
            goto L_0x067f
        L_0x0679:
            int r4 = r9.f4834t0
            r40 = r13
            r11 = r28
        L_0x067f:
            v.d r13 = r15.f4793b
            v.c r13 = r13.f4718L
            r16 = r15
            r17 = r36
            r18 = r5
            r19 = r6
            r20 = r14
            r21 = r11
            r22 = r7
            r23 = r10
            r24 = r3
            r25 = r4
            r26 = r12
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r6 = r15.d()
            int r1 = java.lang.Math.max(r1, r6)
            int r6 = r15.c()
            int r6 = r6 + r2
            if (r8 <= 0) goto L_0x06ae
            int r2 = r9.f4822Q0
            int r6 = r6 + r2
        L_0x06ae:
            r43 = r0
            r2 = r6
            r6 = r13
            r13 = r40
            r10 = 0
            goto L_0x070a
        L_0x06b6:
            r40 = r13
            int r3 = r0 + -1
            if (r8 >= r3) goto L_0x06cf
            int r3 = r8 + 1
            r13 = r40
            java.lang.Object r3 = r13.get(r3)
            v.f r3 = (v.f) r3
            v.d r3 = r3.f4793b
            v.c r3 = r3.I
            r43 = r0
            r14 = r3
            r3 = 0
            goto L_0x06d7
        L_0x06cf:
            r13 = r40
            int r3 = r9.f4838x0
            r43 = r0
            r14 = r27
        L_0x06d7:
            v.d r0 = r15.f4793b
            v.c r0 = r0.f4717K
            r16 = r15
            r17 = r36
            r18 = r5
            r19 = r6
            r20 = r14
            r21 = r11
            r22 = r7
            r23 = r10
            r24 = r3
            r25 = r4
            r26 = r12
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            int r5 = r15.d()
            int r5 = r5 + r1
            int r1 = r15.c()
            int r1 = java.lang.Math.max(r2, r1)
            if (r8 <= 0) goto L_0x0706
            int r2 = r9.f4821P0
            int r5 = r5 + r2
        L_0x0706:
            r2 = r1
            r1 = r5
            r7 = 0
            r5 = r0
        L_0x070a:
            int r8 = r8 + 1
            r0 = r43
            goto L_0x065a
        L_0x0710:
            r0 = 0
            r30[r0] = r1
            r0 = 1
            r30[r0] = r2
            goto L_0x012e
        L_0x0718:
            r31 = r3
            r32 = r4
            r33 = r5
            r34 = r6
            r39 = r10
            r38 = r11
            r29 = r12
            r35 = r13
            r10 = r15
            r12 = r20
            r30 = r21
            r13 = r8
            int r0 = r9.f4827V0
            if (r14 != 0) goto L_0x0734
            goto L_0x012e
        L_0x0734:
            int r1 = r13.size()
            if (r1 != 0) goto L_0x0750
            v.f r11 = new v.f
            v.c r4 = r9.I
            v.c r5 = r9.f4716J
            v.c r6 = r9.f4717K
            v.c r7 = r9.f4718L
            r1 = r11
            r2 = r42
            r3 = r0
            r8 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r13.add(r11)
            goto L_0x0790
        L_0x0750:
            r1 = 0
            java.lang.Object r2 = r13.get(r1)
            r11 = r2
            v.f r11 = (v.f) r11
            r11.f4794c = r1
            r2 = 0
            r11.f4793b = r2
            r11.f4801l = r1
            r11.f4802m = r1
            r11.f4803n = r1
            r11.f4804o = r1
            r11.f4805p = r1
            int r1 = r9.f4837w0
            int r2 = r9.f4833s0
            int r3 = r9.f4838x0
            int r4 = r9.f4834t0
            v.c r5 = r9.f4717K
            v.c r6 = r9.f4718L
            v.c r7 = r9.I
            v.c r8 = r9.f4716J
            r16 = r11
            r17 = r0
            r18 = r7
            r19 = r8
            r20 = r5
            r21 = r6
            r22 = r1
            r23 = r2
            r24 = r3
            r25 = r4
            r26 = r12
            r16.f(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x0790:
            r8 = 0
        L_0x0791:
            if (r8 >= r14) goto L_0x079b
            r0 = r10[r8]
            r11.a(r0)
            int r8 = r8 + 1
            goto L_0x0791
        L_0x079b:
            int r0 = r11.d()
            r1 = 0
            r30[r1] = r0
            int r0 = r11.c()
            r2 = 1
            r30[r2] = r0
        L_0x07a9:
            r0 = r30[r1]
            int r0 = r0 + r34
            int r0 = r0 + r33
            r3 = r30[r2]
            int r3 = r3 + r32
            int r3 = r3 + r31
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = r39
            if (r6 != r5) goto L_0x07c2
            r0 = r29
            r11 = r38
            goto L_0x07d4
        L_0x07c2:
            if (r6 != r4) goto L_0x07cd
            r7 = r38
            int r11 = java.lang.Math.min(r0, r7)
        L_0x07ca:
            r0 = r29
            goto L_0x07d4
        L_0x07cd:
            if (r6 != 0) goto L_0x07d1
            r11 = r0
            goto L_0x07ca
        L_0x07d1:
            r0 = r29
            r11 = 0
        L_0x07d4:
            if (r0 != r5) goto L_0x07d9
            r13 = r35
            goto L_0x07e7
        L_0x07d9:
            if (r0 != r4) goto L_0x07e2
            r4 = r35
            int r13 = java.lang.Math.min(r3, r4)
            goto L_0x07e7
        L_0x07e2:
            if (r0 != 0) goto L_0x07e6
            r13 = r3
            goto L_0x07e7
        L_0x07e6:
            r13 = 0
        L_0x07e7:
            r9.f4840z0 = r11
            r9.A0 = r13
            r9.O(r11)
            r9.L(r13)
            int r0 = r9.f4848r0
            if (r0 <= 0) goto L_0x07f7
            r8 = 1
            goto L_0x07f8
        L_0x07f7:
            r8 = 0
        L_0x07f8:
            r9.f4839y0 = r8
        L_0x07fa:
            int r0 = r9.f4840z0
            int r1 = r9.A0
            r2 = r41
            r2.setMeasuredDimension(r0, r1)
            goto L_0x0809
        L_0x0804:
            r2 = r0
            r0 = 0
            r2.setMeasuredDimension(r0, r0)
        L_0x0809:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.j(v.g, int, int):void");
    }

    public final void onMeasure(int i, int i2) {
        j(this.f1419o, i, i2);
    }

    public void setFirstHorizontalBias(float f2) {
        this.f1419o.f4817L0 = f2;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f1419o.F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f2) {
        this.f1419o.f4818M0 = f2;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f1419o.f4812G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f1419o.f4823R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f2) {
        this.f1419o.f4815J0 = f2;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f1419o.f4821P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f1419o.f4810D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f2) {
        this.f1419o.f4819N0 = f2;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f1419o.f4813H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f2) {
        this.f1419o.f4820O0 = f2;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f1419o.f4814I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f1419o.f4826U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f1419o.f4827V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        g gVar = this.f1419o;
        gVar.f4833s0 = i;
        gVar.f4834t0 = i;
        gVar.f4835u0 = i;
        gVar.f4836v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f1419o.f4834t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f1419o.f4837w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f1419o.f4838x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f1419o.f4833s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f1419o.f4824S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f2) {
        this.f1419o.f4816K0 = f2;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f1419o.f4822Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f1419o.f4811E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f1419o.f4825T0 = i;
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [v.i, v.g] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, w.b] */
    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4945f = new int[32];
        this.f4950l = new HashMap();
        this.f4947h = context;
        super.g(attributeSet);
        ? iVar = new i();
        iVar.f4833s0 = 0;
        iVar.f4834t0 = 0;
        iVar.f4835u0 = 0;
        iVar.f4836v0 = 0;
        iVar.f4837w0 = 0;
        iVar.f4838x0 = 0;
        iVar.f4839y0 = false;
        iVar.f4840z0 = 0;
        iVar.A0 = 0;
        iVar.f4808B0 = new Object();
        iVar.f4809C0 = null;
        iVar.f4810D0 = -1;
        iVar.f4811E0 = -1;
        iVar.F0 = -1;
        iVar.f4812G0 = -1;
        iVar.f4813H0 = -1;
        iVar.f4814I0 = -1;
        iVar.f4815J0 = 0.5f;
        iVar.f4816K0 = 0.5f;
        iVar.f4817L0 = 0.5f;
        iVar.f4818M0 = 0.5f;
        iVar.f4819N0 = 0.5f;
        iVar.f4820O0 = 0.5f;
        iVar.f4821P0 = 0;
        iVar.f4822Q0 = 0;
        iVar.f4823R0 = 2;
        iVar.f4824S0 = 2;
        iVar.f4825T0 = 0;
        iVar.f4826U0 = -1;
        iVar.f4827V0 = 0;
        iVar.f4828W0 = new ArrayList();
        iVar.X0 = null;
        iVar.f4829Y0 = null;
        iVar.f4830Z0 = null;
        iVar.f4832b1 = 0;
        this.f1419o = iVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f5137b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f1419o.f4827V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar = this.f1419o;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar.f4833s0 = dimensionPixelSize;
                    gVar.f4834t0 = dimensionPixelSize;
                    gVar.f4835u0 = dimensionPixelSize;
                    gVar.f4836v0 = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar2 = this.f1419o;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f4835u0 = dimensionPixelSize2;
                    gVar2.f4837w0 = dimensionPixelSize2;
                    gVar2.f4838x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f1419o.f4836v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f1419o.f4837w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f1419o.f4833s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f1419o.f4838x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f1419o.f4834t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f1419o.f4825T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f1419o.f4810D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f1419o.f4811E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f1419o.F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f1419o.f4813H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f1419o.f4812G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f1419o.f4814I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f1419o.f4815J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f1419o.f4817L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f1419o.f4819N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f1419o.f4818M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f1419o.f4820O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f1419o.f4816K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f1419o.f4823R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f1419o.f4824S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f1419o.f4821P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f1419o.f4822Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f1419o.f4826U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.i = this.f1419o;
        i();
    }
}
