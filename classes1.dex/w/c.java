package w;

import java.util.ArrayList;
import java.util.Iterator;
import v.C0346c;
import v.C0347d;
import v.C0348e;

public final class c extends o {

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f4862k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public int f4863l;

    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4862k;
            if (i < arrayList.size()) {
                ((o) arrayList.get(i)).e();
                i++;
            } else {
                return;
            }
        }
    }

    public final void f() {
        this.f4895c = null;
        Iterator it2 = this.f4862k.iterator();
        while (it2.hasNext()) {
            ((o) it2.next()).f();
        }
    }

    public final C0347d m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4862k;
            if (i >= arrayList.size()) {
                return null;
            }
            C0347d dVar = ((o) arrayList.get(i)).f4894b;
            if (dVar.f4745g0 != 8) {
                return dVar;
            }
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(w.d r27) {
        /*
            r26 = this;
            r0 = r26
            w.f r1 = r0.f4899h
            boolean r2 = r1.f4878j
            if (r2 == 0) goto L_0x03ca
            w.f r2 = r0.i
            boolean r3 = r2.f4878j
            if (r3 != 0) goto L_0x0010
            goto L_0x03ca
        L_0x0010:
            v.d r3 = r0.f4894b
            v.d r3 = r3.f4726T
            boolean r4 = r3 instanceof v.C0348e
            if (r4 == 0) goto L_0x001d
            v.e r3 = (v.C0348e) r3
            boolean r3 = r3.f4787v0
            goto L_0x001e
        L_0x001d:
            r3 = 0
        L_0x001e:
            int r4 = r2.f4876g
            int r6 = r1.f4876g
            int r4 = r4 - r6
            java.util.ArrayList r6 = r0.f4862k
            int r7 = r6.size()
            r8 = 0
        L_0x002a:
            r9 = -1
            r10 = 8
            if (r8 >= r7) goto L_0x003e
            java.lang.Object r11 = r6.get(r8)
            w.o r11 = (w.o) r11
            v.d r11 = r11.f4894b
            int r11 = r11.f4745g0
            if (r11 != r10) goto L_0x003f
            int r8 = r8 + 1
            goto L_0x002a
        L_0x003e:
            r8 = -1
        L_0x003f:
            int r11 = r7 + -1
            r12 = r11
        L_0x0042:
            if (r12 < 0) goto L_0x0054
            java.lang.Object r13 = r6.get(r12)
            w.o r13 = (w.o) r13
            v.d r13 = r13.f4894b
            int r13 = r13.f4745g0
            if (r13 != r10) goto L_0x0053
            int r12 = r12 + -1
            goto L_0x0042
        L_0x0053:
            r9 = r12
        L_0x0054:
            r12 = 0
        L_0x0055:
            r5 = 2
            if (r12 >= r5) goto L_0x0107
            r5 = 0
            r14 = 0
            r17 = 0
            r18 = 0
            r19 = 0
        L_0x0060:
            if (r5 >= r7) goto L_0x00ef
            java.lang.Object r20 = r6.get(r5)
            r13 = r20
            w.o r13 = (w.o) r13
            v.d r15 = r13.f4894b
            r21 = r6
            int r6 = r15.f4745g0
            if (r6 != r10) goto L_0x0076
            r23 = r8
            goto L_0x00e5
        L_0x0076:
            int r18 = r18 + 1
            if (r5 <= 0) goto L_0x0081
            if (r5 < r8) goto L_0x0081
            w.f r6 = r13.f4899h
            int r6 = r6.f4875f
            int r14 = r14 + r6
        L_0x0081:
            w.g r6 = r13.e
            int r10 = r6.f4876g
            r22 = r10
            int r10 = r13.f4896d
            r23 = r8
            r8 = 3
            if (r10 == r8) goto L_0x0090
            r8 = 1
            goto L_0x0091
        L_0x0090:
            r8 = 0
        L_0x0091:
            if (r8 == 0) goto L_0x00af
            int r6 = r0.f4897f
            if (r6 != 0) goto L_0x00a0
            w.k r10 = r15.f4739d
            w.g r10 = r10.e
            boolean r10 = r10.f4878j
            if (r10 != 0) goto L_0x00a0
            return
        L_0x00a0:
            r10 = 1
            if (r6 != r10) goto L_0x00ac
            w.m r6 = r15.e
            w.g r6 = r6.e
            boolean r6 = r6.f4878j
            if (r6 != 0) goto L_0x00ac
            return
        L_0x00ac:
            r24 = r8
            goto L_0x00c6
        L_0x00af:
            r24 = r8
            r10 = 1
            int r8 = r13.f4893a
            if (r8 != r10) goto L_0x00bf
            if (r12 != 0) goto L_0x00bf
            int r10 = r6.f4881m
            int r17 = r17 + 1
        L_0x00bc:
            r24 = 1
            goto L_0x00c8
        L_0x00bf:
            boolean r6 = r6.f4878j
            if (r6 == 0) goto L_0x00c6
            r10 = r22
            goto L_0x00bc
        L_0x00c6:
            r10 = r22
        L_0x00c8:
            if (r24 != 0) goto L_0x00da
            int r17 = r17 + 1
            float[] r6 = r15.f4752k0
            int r8 = r0.f4897f
            r6 = r6[r8]
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x00db
            float r19 = r19 + r6
            goto L_0x00db
        L_0x00da:
            int r14 = r14 + r10
        L_0x00db:
            if (r5 >= r11) goto L_0x00e5
            if (r5 >= r9) goto L_0x00e5
            w.f r6 = r13.i
            int r6 = r6.f4875f
            int r6 = -r6
            int r14 = r14 + r6
        L_0x00e5:
            int r5 = r5 + 1
            r6 = r21
            r8 = r23
            r10 = 8
            goto L_0x0060
        L_0x00ef:
            r21 = r6
            r23 = r8
            if (r14 < r4) goto L_0x0102
            if (r17 != 0) goto L_0x00f8
            goto L_0x0102
        L_0x00f8:
            int r12 = r12 + 1
            r6 = r21
            r8 = r23
            r10 = 8
            goto L_0x0055
        L_0x0102:
            r5 = r17
            r6 = r18
            goto L_0x0110
        L_0x0107:
            r21 = r6
            r23 = r8
            r5 = 0
            r6 = 0
            r14 = 0
            r19 = 0
        L_0x0110:
            int r1 = r1.f4876g
            if (r3 == 0) goto L_0x0116
            int r1 = r2.f4876g
        L_0x0116:
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r4) goto L_0x012d
            r8 = 1073741824(0x40000000, float:2.0)
            if (r3 == 0) goto L_0x0126
            int r10 = r14 - r4
            float r10 = (float) r10
            float r10 = r10 / r8
            float r10 = r10 + r2
            int r8 = (int) r10
            int r1 = r1 + r8
            goto L_0x012d
        L_0x0126:
            int r10 = r14 - r4
            float r10 = (float) r10
            float r10 = r10 / r8
            float r10 = r10 + r2
            int r8 = (int) r10
            int r1 = r1 - r8
        L_0x012d:
            if (r5 <= 0) goto L_0x0210
            int r8 = r4 - r14
            float r8 = (float) r8
            float r10 = (float) r5
            float r10 = r8 / r10
            float r10 = r10 + r2
            int r10 = (int) r10
            r12 = 0
            r13 = 0
        L_0x0139:
            if (r12 >= r7) goto L_0x01bd
            r15 = r21
            java.lang.Object r17 = r15.get(r12)
            r2 = r17
            w.o r2 = (w.o) r2
            r17 = r10
            v.d r10 = r2.f4894b
            r21 = r14
            int r14 = r10.f4745g0
            r22 = r1
            r1 = 8
            if (r14 != r1) goto L_0x0158
        L_0x0153:
            r24 = r3
            r25 = r8
            goto L_0x01ab
        L_0x0158:
            int r1 = r2.f4896d
            r14 = 3
            if (r1 != r14) goto L_0x0153
            w.g r1 = r2.e
            boolean r14 = r1.f4878j
            if (r14 != 0) goto L_0x0153
            r14 = 0
            int r16 = (r19 > r14 ? 1 : (r19 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x0179
            float[] r14 = r10.f4752k0
            r24 = r3
            int r3 = r0.f4897f
            r3 = r14[r3]
            float r3 = r3 * r8
            float r3 = r3 / r19
            r14 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r14
            int r3 = (int) r3
            goto L_0x017d
        L_0x0179:
            r24 = r3
            r3 = r17
        L_0x017d:
            int r14 = r0.f4897f
            if (r14 != 0) goto L_0x0186
            int r14 = r10.f4767v
            int r10 = r10.f4766u
            goto L_0x018a
        L_0x0186:
            int r14 = r10.f4770y
            int r10 = r10.f4769x
        L_0x018a:
            int r2 = r2.f4893a
            r25 = r8
            r8 = 1
            if (r2 != r8) goto L_0x0198
            int r2 = r1.f4881m
            int r2 = java.lang.Math.min(r3, r2)
            goto L_0x0199
        L_0x0198:
            r2 = r3
        L_0x0199:
            int r2 = java.lang.Math.max(r10, r2)
            if (r14 <= 0) goto L_0x01a3
            int r2 = java.lang.Math.min(r14, r2)
        L_0x01a3:
            if (r2 == r3) goto L_0x01a8
            int r13 = r13 + 1
            r3 = r2
        L_0x01a8:
            r1.d(r3)
        L_0x01ab:
            int r12 = r12 + 1
            r10 = r17
            r14 = r21
            r1 = r22
            r3 = r24
            r8 = r25
            r2 = 1056964608(0x3f000000, float:0.5)
            r21 = r15
            goto L_0x0139
        L_0x01bd:
            r22 = r1
            r24 = r3
            r15 = r21
            r21 = r14
            if (r13 <= 0) goto L_0x01ff
            int r5 = r5 - r13
            r1 = 0
            r14 = 0
        L_0x01ca:
            if (r1 >= r7) goto L_0x01fc
            java.lang.Object r2 = r15.get(r1)
            w.o r2 = (w.o) r2
            v.d r3 = r2.f4894b
            int r3 = r3.f4745g0
            r8 = 8
            if (r3 != r8) goto L_0x01dd
            r8 = r23
            goto L_0x01f7
        L_0x01dd:
            r8 = r23
            if (r1 <= 0) goto L_0x01e8
            if (r1 < r8) goto L_0x01e8
            w.f r3 = r2.f4899h
            int r3 = r3.f4875f
            int r14 = r14 + r3
        L_0x01e8:
            w.g r3 = r2.e
            int r3 = r3.f4876g
            int r14 = r14 + r3
            if (r1 >= r11) goto L_0x01f7
            if (r1 >= r9) goto L_0x01f7
            w.f r2 = r2.i
            int r2 = r2.f4875f
            int r2 = -r2
            int r14 = r14 + r2
        L_0x01f7:
            int r1 = r1 + 1
            r23 = r8
            goto L_0x01ca
        L_0x01fc:
            r8 = r23
            goto L_0x0203
        L_0x01ff:
            r8 = r23
            r14 = r21
        L_0x0203:
            int r1 = r0.f4863l
            r2 = 2
            if (r1 != r2) goto L_0x020e
            if (r13 != 0) goto L_0x020e
            r1 = 0
            r0.f4863l = r1
            goto L_0x021c
        L_0x020e:
            r1 = 0
            goto L_0x021c
        L_0x0210:
            r22 = r1
            r24 = r3
            r15 = r21
            r8 = r23
            r1 = 0
            r2 = 2
            r21 = r14
        L_0x021c:
            if (r14 <= r4) goto L_0x0220
            r0.f4863l = r2
        L_0x0220:
            if (r6 <= 0) goto L_0x0228
            if (r5 != 0) goto L_0x0228
            if (r8 != r9) goto L_0x0228
            r0.f4863l = r2
        L_0x0228:
            int r2 = r0.f4863l
            r3 = 1
            if (r2 != r3) goto L_0x02b4
            if (r6 <= r3) goto L_0x0233
            int r4 = r4 - r14
            int r6 = r6 - r3
            int r4 = r4 / r6
            goto L_0x023a
        L_0x0233:
            if (r6 != r3) goto L_0x0239
            int r4 = r4 - r14
            r2 = 2
            int r4 = r4 / r2
            goto L_0x023a
        L_0x0239:
            r4 = 0
        L_0x023a:
            if (r5 <= 0) goto L_0x023d
            r4 = 0
        L_0x023d:
            r1 = r22
            r5 = 0
        L_0x0240:
            if (r5 >= r7) goto L_0x03ca
            if (r24 == 0) goto L_0x0249
            int r2 = r5 + 1
            int r2 = r7 - r2
            goto L_0x024a
        L_0x0249:
            r2 = r5
        L_0x024a:
            java.lang.Object r2 = r15.get(r2)
            w.o r2 = (w.o) r2
            v.d r3 = r2.f4894b
            int r3 = r3.f4745g0
            w.f r6 = r2.i
            w.f r10 = r2.f4899h
            r12 = 8
            if (r3 != r12) goto L_0x0263
            r10.d(r1)
            r6.d(r1)
            goto L_0x02b1
        L_0x0263:
            if (r5 <= 0) goto L_0x026a
            if (r24 == 0) goto L_0x0269
            int r1 = r1 - r4
            goto L_0x026a
        L_0x0269:
            int r1 = r1 + r4
        L_0x026a:
            if (r5 <= 0) goto L_0x0277
            if (r5 < r8) goto L_0x0277
            if (r24 == 0) goto L_0x0274
            int r3 = r10.f4875f
            int r1 = r1 - r3
            goto L_0x0277
        L_0x0274:
            int r3 = r10.f4875f
            int r1 = r1 + r3
        L_0x0277:
            if (r24 == 0) goto L_0x027d
            r6.d(r1)
            goto L_0x0280
        L_0x027d:
            r10.d(r1)
        L_0x0280:
            w.g r3 = r2.e
            int r12 = r3.f4876g
            int r13 = r2.f4896d
            r14 = 3
            if (r13 != r14) goto L_0x0290
            int r13 = r2.f4893a
            r14 = 1
            if (r13 != r14) goto L_0x0290
            int r12 = r3.f4881m
        L_0x0290:
            if (r24 == 0) goto L_0x0294
            int r1 = r1 - r12
            goto L_0x0295
        L_0x0294:
            int r1 = r1 + r12
        L_0x0295:
            if (r24 == 0) goto L_0x029c
            r10.d(r1)
        L_0x029a:
            r3 = 1
            goto L_0x02a0
        L_0x029c:
            r6.d(r1)
            goto L_0x029a
        L_0x02a0:
            r2.f4898g = r3
            if (r5 >= r11) goto L_0x02b1
            if (r5 >= r9) goto L_0x02b1
            if (r24 == 0) goto L_0x02ad
            int r2 = r6.f4875f
            int r2 = -r2
            int r1 = r1 - r2
            goto L_0x02b1
        L_0x02ad:
            int r2 = r6.f4875f
            int r2 = -r2
            int r1 = r1 + r2
        L_0x02b1:
            int r5 = r5 + 1
            goto L_0x0240
        L_0x02b4:
            if (r2 != 0) goto L_0x0332
            int r4 = r4 - r14
            r2 = 1
            int r6 = r6 + r2
            int r4 = r4 / r6
            if (r5 <= 0) goto L_0x02bd
            r4 = 0
        L_0x02bd:
            r1 = r22
            r5 = 0
        L_0x02c0:
            if (r5 >= r7) goto L_0x03ca
            if (r24 == 0) goto L_0x02c9
            int r2 = r5 + 1
            int r2 = r7 - r2
            goto L_0x02ca
        L_0x02c9:
            r2 = r5
        L_0x02ca:
            java.lang.Object r2 = r15.get(r2)
            w.o r2 = (w.o) r2
            v.d r3 = r2.f4894b
            int r3 = r3.f4745g0
            w.f r6 = r2.i
            w.f r10 = r2.f4899h
            r12 = 8
            if (r3 != r12) goto L_0x02e3
            r10.d(r1)
            r6.d(r1)
            goto L_0x032f
        L_0x02e3:
            if (r24 == 0) goto L_0x02e7
            int r1 = r1 - r4
            goto L_0x02e8
        L_0x02e7:
            int r1 = r1 + r4
        L_0x02e8:
            if (r5 <= 0) goto L_0x02f5
            if (r5 < r8) goto L_0x02f5
            if (r24 == 0) goto L_0x02f2
            int r3 = r10.f4875f
            int r1 = r1 - r3
            goto L_0x02f5
        L_0x02f2:
            int r3 = r10.f4875f
            int r1 = r1 + r3
        L_0x02f5:
            if (r24 == 0) goto L_0x02fb
            r6.d(r1)
            goto L_0x02fe
        L_0x02fb:
            r10.d(r1)
        L_0x02fe:
            w.g r3 = r2.e
            int r12 = r3.f4876g
            int r13 = r2.f4896d
            r14 = 3
            if (r13 != r14) goto L_0x0312
            int r2 = r2.f4893a
            r13 = 1
            if (r2 != r13) goto L_0x0312
            int r2 = r3.f4881m
            int r12 = java.lang.Math.min(r12, r2)
        L_0x0312:
            if (r24 == 0) goto L_0x0316
            int r1 = r1 - r12
            goto L_0x0317
        L_0x0316:
            int r1 = r1 + r12
        L_0x0317:
            if (r24 == 0) goto L_0x031d
            r10.d(r1)
            goto L_0x0320
        L_0x031d:
            r6.d(r1)
        L_0x0320:
            if (r5 >= r11) goto L_0x032f
            if (r5 >= r9) goto L_0x032f
            if (r24 == 0) goto L_0x032b
            int r2 = r6.f4875f
            int r2 = -r2
            int r1 = r1 - r2
            goto L_0x032f
        L_0x032b:
            int r2 = r6.f4875f
            int r2 = -r2
            int r1 = r1 + r2
        L_0x032f:
            int r5 = r5 + 1
            goto L_0x02c0
        L_0x0332:
            r3 = 2
            if (r2 != r3) goto L_0x03ca
            int r2 = r0.f4897f
            if (r2 != 0) goto L_0x033e
            v.d r2 = r0.f4894b
            float r2 = r2.f4740d0
            goto L_0x0342
        L_0x033e:
            v.d r2 = r0.f4894b
            float r2 = r2.f4741e0
        L_0x0342:
            if (r24 == 0) goto L_0x0348
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = r3 - r2
        L_0x0348:
            int r4 = r4 - r14
            float r3 = (float) r4
            float r3 = r3 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            int r2 = (int) r3
            if (r2 < 0) goto L_0x0354
            if (r5 <= 0) goto L_0x0355
        L_0x0354:
            r2 = 0
        L_0x0355:
            if (r24 == 0) goto L_0x035a
            int r2 = r22 - r2
            goto L_0x035c
        L_0x035a:
            int r2 = r22 + r2
        L_0x035c:
            r5 = 0
        L_0x035d:
            if (r5 >= r7) goto L_0x03ca
            if (r24 == 0) goto L_0x0366
            int r1 = r5 + 1
            int r1 = r7 - r1
            goto L_0x0367
        L_0x0366:
            r1 = r5
        L_0x0367:
            java.lang.Object r1 = r15.get(r1)
            w.o r1 = (w.o) r1
            v.d r3 = r1.f4894b
            int r3 = r3.f4745g0
            w.f r4 = r1.i
            w.f r6 = r1.f4899h
            r10 = 8
            if (r3 != r10) goto L_0x0382
            r6.d(r2)
            r4.d(r2)
            r13 = 1
            r14 = 3
            goto L_0x03c7
        L_0x0382:
            if (r5 <= 0) goto L_0x038f
            if (r5 < r8) goto L_0x038f
            if (r24 == 0) goto L_0x038c
            int r3 = r6.f4875f
            int r2 = r2 - r3
            goto L_0x038f
        L_0x038c:
            int r3 = r6.f4875f
            int r2 = r2 + r3
        L_0x038f:
            if (r24 == 0) goto L_0x0395
            r4.d(r2)
            goto L_0x0398
        L_0x0395:
            r6.d(r2)
        L_0x0398:
            w.g r3 = r1.e
            int r12 = r3.f4876g
            int r13 = r1.f4896d
            r14 = 3
            if (r13 != r14) goto L_0x03a9
            int r1 = r1.f4893a
            r13 = 1
            if (r1 != r13) goto L_0x03aa
            int r12 = r3.f4881m
            goto L_0x03aa
        L_0x03a9:
            r13 = 1
        L_0x03aa:
            if (r24 == 0) goto L_0x03ae
            int r2 = r2 - r12
            goto L_0x03af
        L_0x03ae:
            int r2 = r2 + r12
        L_0x03af:
            if (r24 == 0) goto L_0x03b5
            r6.d(r2)
            goto L_0x03b8
        L_0x03b5:
            r4.d(r2)
        L_0x03b8:
            if (r5 >= r11) goto L_0x03c7
            if (r5 >= r9) goto L_0x03c7
            if (r24 == 0) goto L_0x03c3
            int r1 = r4.f4875f
            int r1 = -r1
            int r2 = r2 - r1
            goto L_0x03c7
        L_0x03c3:
            int r1 = r4.f4875f
            int r1 = -r1
            int r2 = r2 + r1
        L_0x03c7:
            int r5 = r5 + 1
            goto L_0x035d
        L_0x03ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.c.a(w.d):void");
    }

    public final void d() {
        ArrayList arrayList = this.f4862k;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((o) it2.next()).d();
        }
        int size = arrayList.size();
        if (size >= 1) {
            C0347d dVar = ((o) arrayList.get(0)).f4894b;
            C0347d dVar2 = ((o) arrayList.get(size - 1)).f4894b;
            int i = this.f4897f;
            f fVar = this.i;
            f fVar2 = this.f4899h;
            if (i == 0) {
                C0346c cVar = dVar.I;
                C0346c cVar2 = dVar2.f4717K;
                f i2 = o.i(cVar, 0);
                int e = cVar.e();
                C0347d m2 = m();
                if (m2 != null) {
                    e = m2.I.e();
                }
                if (i2 != null) {
                    o.b(fVar2, i2, e);
                }
                f i3 = o.i(cVar2, 0);
                int e2 = cVar2.e();
                C0347d n2 = n();
                if (n2 != null) {
                    e2 = n2.f4717K.e();
                }
                if (i3 != null) {
                    o.b(fVar, i3, -e2);
                }
            } else {
                C0346c cVar3 = dVar.f4716J;
                C0346c cVar4 = dVar2.f4718L;
                f i4 = o.i(cVar3, 1);
                int e3 = cVar3.e();
                C0347d m3 = m();
                if (m3 != null) {
                    e3 = m3.f4716J.e();
                }
                if (i4 != null) {
                    o.b(fVar2, i4, e3);
                }
                f i5 = o.i(cVar4, 1);
                int e4 = cVar4.e();
                C0347d n3 = n();
                if (n3 != null) {
                    e4 = n3.f4718L.e();
                }
                if (i5 != null) {
                    o.b(fVar, i5, -e4);
                }
            }
            fVar2.f4871a = this;
            fVar.f4871a = this;
        }
    }

    public final long j() {
        ArrayList arrayList = this.f4862k;
        int size = arrayList.size();
        long j2 = 0;
        for (int i = 0; i < size; i++) {
            o oVar = (o) arrayList.get(i);
            j2 = ((long) oVar.i.f4875f) + oVar.j() + j2 + ((long) oVar.f4899h.f4875f);
        }
        return j2;
    }

    public final boolean k() {
        ArrayList arrayList = this.f4862k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((o) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final C0347d n() {
        ArrayList arrayList = this.f4862k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0347d dVar = ((o) arrayList.get(size)).f4894b;
            if (dVar.f4745g0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChainRun ");
        if (this.f4897f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb.append(str);
        Iterator it2 = this.f4862k.iterator();
        while (it2.hasNext()) {
            sb.append("<");
            sb.append((o) it2.next());
            sb.append("> ");
        }
        return sb.toString();
    }

    public c(C0347d dVar, int i) {
        super(dVar);
        C0347d dVar2;
        Object obj;
        int i2;
        Object obj2;
        this.f4897f = i;
        C0347d dVar3 = this.f4894b;
        C0347d m2 = dVar3.m(i);
        while (true) {
            C0347d dVar4 = m2;
            dVar2 = dVar3;
            dVar3 = dVar4;
            if (dVar3 == null) {
                break;
            }
            m2 = dVar3.m(this.f4897f);
        }
        this.f4894b = dVar2;
        int i3 = this.f4897f;
        if (i3 == 0) {
            obj = dVar2.f4739d;
        } else if (i3 == 1) {
            obj = dVar2.e;
        } else {
            obj = null;
        }
        ArrayList arrayList = this.f4862k;
        arrayList.add(obj);
        C0347d l2 = dVar2.l(this.f4897f);
        while (l2 != null) {
            int i4 = this.f4897f;
            if (i4 == 0) {
                obj2 = l2.f4739d;
            } else if (i4 == 1) {
                obj2 = l2.e;
            } else {
                obj2 = null;
            }
            arrayList.add(obj2);
            l2 = l2.l(this.f4897f);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            o oVar = (o) it2.next();
            int i5 = this.f4897f;
            if (i5 == 0) {
                oVar.f4894b.f4735b = this;
            } else if (i5 == 1) {
                oVar.f4894b.f4737c = this;
            }
        }
        if (this.f4897f == 0 && ((C0348e) this.f4894b.f4726T).f4787v0 && arrayList.size() > 1) {
            this.f4894b = ((o) arrayList.get(arrayList.size() - 1)).f4894b;
        }
        if (this.f4897f == 0) {
            i2 = this.f4894b.f4748i0;
        } else {
            i2 = this.f4894b.f4750j0;
        }
        this.f4863l = i2;
    }
}
