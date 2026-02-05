package v;

import t.C0337c;
import t.C0340f;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean[] f4849a = new boolean[3];

    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0283, code lost:
        if (r2.f4704d == r7) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0109, code lost:
        if (r4.f4704d == r13) goto L_0x010d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0436 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x04a0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x057c  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x057e  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0595  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x0598  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x059e  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x0670  */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x06b8  */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x06ba  */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x06c5  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x06c8  */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x06ce  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x06d1  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x06d5  */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x06e5  */
    /* JADX WARNING: Removed duplicated region for block: B:432:0x0113 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(v.C0348e r36, t.C0337c r37, java.util.ArrayList r38, int r39) {
        /*
            r0 = r36
            r10 = r37
            r11 = r38
            r12 = 2
            if (r39 != 0) goto L_0x0012
            int r1 = r0.f4791z0
            v.b[] r2 = r0.f4773C0
            r14 = r1
            r15 = r2
            r16 = 0
            goto L_0x001a
        L_0x0012:
            int r1 = r0.A0
            v.b[] r2 = r0.f4772B0
            r14 = r1
            r15 = r2
            r16 = 2
        L_0x001a:
            r9 = 0
        L_0x001b:
            if (r9 >= r14) goto L_0x0711
            r1 = r15[r9]
            boolean r2 = r1.f4700q
            v.d r8 = r1.f4686a
            r3 = 3
            r4 = 1
            r7 = 8
            r17 = 0
            if (r2 != 0) goto L_0x0155
            int r2 = r1.f4695l
            int r6 = r2 * 2
            r13 = r8
            r20 = r13
            r18 = 0
        L_0x0034:
            if (r18 != 0) goto L_0x011f
            int r5 = r1.i
            int r5 = r5 + r4
            r1.i = r5
            v.d[] r5 = r13.m0
            r5[r2] = r17
            v.d[] r5 = r13.f4754l0
            r5[r2] = r17
            int r5 = r13.f4745g0
            v.c[] r4 = r13.f4723Q
            if (r5 == r7) goto L_0x00ec
            r13.j(r2)
            r5 = r4[r6]
            r5.e()
            int r5 = r6 + 1
            r23 = r4[r5]
            r23.e()
            r23 = r4[r6]
            r23.e()
            r5 = r4[r5]
            r5.e()
            v.d r5 = r1.f4687b
            if (r5 != 0) goto L_0x0068
            r1.f4687b = r13
        L_0x0068:
            r1.f4689d = r13
            int[] r5 = r13.f4761p0
            r5 = r5[r2]
            if (r5 != r3) goto L_0x00ec
            int[] r7 = r13.f4765t
            r7 = r7[r2]
            if (r7 == 0) goto L_0x007e
            if (r7 == r3) goto L_0x007e
            if (r7 != r12) goto L_0x007b
            goto L_0x007e
        L_0x007b:
            r25 = r9
            goto L_0x00d0
        L_0x007e:
            int r12 = r1.f4693j
            r22 = 1
            int r12 = r12 + 1
            r1.f4693j = r12
            float[] r12 = r13.f4752k0
            r12 = r12[r2]
            r21 = 0
            int r24 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r24 <= 0) goto L_0x0095
            float r3 = r1.f4694k
            float r3 = r3 + r12
            r1.f4694k = r3
        L_0x0095:
            int r3 = r13.f4745g0
            r25 = r9
            r9 = 8
            if (r3 == r9) goto L_0x00c0
            r3 = 3
            if (r5 != r3) goto L_0x00c0
            if (r7 == 0) goto L_0x00a4
            if (r7 != r3) goto L_0x00c0
        L_0x00a4:
            r3 = 0
            int r5 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x00ad
            r3 = 1
            r1.f4697n = r3
            goto L_0x00b0
        L_0x00ad:
            r3 = 1
            r1.f4698o = r3
        L_0x00b0:
            java.util.ArrayList r3 = r1.f4692h
            if (r3 != 0) goto L_0x00bb
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.f4692h = r3
        L_0x00bb:
            java.util.ArrayList r3 = r1.f4692h
            r3.add(r13)
        L_0x00c0:
            v.d r3 = r1.f4690f
            if (r3 != 0) goto L_0x00c6
            r1.f4690f = r13
        L_0x00c6:
            v.d r3 = r1.f4691g
            if (r3 == 0) goto L_0x00ce
            v.d[] r3 = r3.f4754l0
            r3[r2] = r13
        L_0x00ce:
            r1.f4691g = r13
        L_0x00d0:
            if (r2 != 0) goto L_0x00de
            int r3 = r13.f4763r
            if (r3 == 0) goto L_0x00d7
            goto L_0x00e9
        L_0x00d7:
            int r3 = r13.f4766u
            if (r3 != 0) goto L_0x00e9
            int r3 = r13.f4767v
            goto L_0x00e9
        L_0x00de:
            int r3 = r13.f4764s
            if (r3 == 0) goto L_0x00e3
            goto L_0x00e9
        L_0x00e3:
            int r3 = r13.f4769x
            if (r3 != 0) goto L_0x00e9
            int r3 = r13.f4770y
        L_0x00e9:
            r3 = r20
            goto L_0x00ef
        L_0x00ec:
            r25 = r9
            goto L_0x00e9
        L_0x00ef:
            if (r3 == r13) goto L_0x00f5
            v.d[] r3 = r3.m0
            r3[r2] = r13
        L_0x00f5:
            int r3 = r6 + 1
            r3 = r4[r3]
            v.c r3 = r3.f4705f
            if (r3 == 0) goto L_0x010b
            v.d r3 = r3.f4704d
            v.c[] r4 = r3.f4723Q
            r4 = r4[r6]
            v.c r4 = r4.f4705f
            if (r4 == 0) goto L_0x010b
            v.d r4 = r4.f4704d
            if (r4 == r13) goto L_0x010d
        L_0x010b:
            r3 = r17
        L_0x010d:
            if (r3 == 0) goto L_0x0110
            goto L_0x0113
        L_0x0110:
            r3 = r13
            r18 = 1
        L_0x0113:
            r20 = r13
            r9 = r25
            r4 = 1
            r7 = 8
            r12 = 2
            r13 = r3
            r3 = 3
            goto L_0x0034
        L_0x011f:
            r25 = r9
            v.d r3 = r1.f4687b
            if (r3 == 0) goto L_0x012c
            v.c[] r3 = r3.f4723Q
            r3 = r3[r6]
            r3.e()
        L_0x012c:
            v.d r3 = r1.f4689d
            if (r3 == 0) goto L_0x0139
            int r6 = r6 + 1
            v.c[] r3 = r3.f4723Q
            r3 = r3[r6]
            r3.e()
        L_0x0139:
            r1.f4688c = r13
            if (r2 != 0) goto L_0x0144
            boolean r2 = r1.f4696m
            if (r2 == 0) goto L_0x0144
            r1.e = r13
            goto L_0x0146
        L_0x0144:
            r1.e = r8
        L_0x0146:
            boolean r2 = r1.f4698o
            if (r2 == 0) goto L_0x0150
            boolean r2 = r1.f4697n
            if (r2 == 0) goto L_0x0150
            r2 = 1
            goto L_0x0151
        L_0x0150:
            r2 = 0
        L_0x0151:
            r1.f4699p = r2
        L_0x0153:
            r2 = 1
            goto L_0x0158
        L_0x0155:
            r25 = r9
            goto L_0x0153
        L_0x0158:
            r1.f4700q = r2
            if (r11 == 0) goto L_0x016d
            boolean r2 = r11.contains(r8)
            if (r2 == 0) goto L_0x0163
            goto L_0x016d
        L_0x0163:
            r30 = r14
            r31 = r15
            r23 = r25
            r19 = 0
            goto L_0x0704
        L_0x016d:
            v.d r12 = r1.f4688c
            v.d r13 = r1.f4687b
            v.d r9 = r1.f4689d
            v.d r2 = r1.e
            float r3 = r1.f4694k
            int[] r4 = r0.f4761p0
            r4 = r4[r39]
            r7 = 2
            if (r4 != r7) goto L_0x0180
            r4 = 1
            goto L_0x0181
        L_0x0180:
            r4 = 0
        L_0x0181:
            if (r39 != 0) goto L_0x01a0
            int r5 = r2.f4748i0
            r6 = 1
            if (r5 != 0) goto L_0x018b
            r22 = 1
            goto L_0x018d
        L_0x018b:
            r22 = 0
        L_0x018d:
            if (r5 != r6) goto L_0x0192
            r18 = 1
            goto L_0x0194
        L_0x0192:
            r18 = 0
        L_0x0194:
            if (r5 != r7) goto L_0x0198
            r5 = 1
            goto L_0x0199
        L_0x0198:
            r5 = 0
        L_0x0199:
            r26 = r3
            r7 = r8
            r20 = r22
        L_0x019e:
            r6 = 0
            goto L_0x01bc
        L_0x01a0:
            r6 = 1
            int r5 = r2.f4750j0
            if (r5 != 0) goto L_0x01a8
            r18 = 1
            goto L_0x01aa
        L_0x01a8:
            r18 = 0
        L_0x01aa:
            if (r5 != r6) goto L_0x01ae
            r6 = 1
            goto L_0x01af
        L_0x01ae:
            r6 = 0
        L_0x01af:
            if (r5 != r7) goto L_0x01b3
            r5 = 1
            goto L_0x01b4
        L_0x01b3:
            r5 = 0
        L_0x01b4:
            r26 = r3
            r7 = r8
            r20 = r18
            r18 = r6
            goto L_0x019e
        L_0x01bc:
            v.c[] r3 = r0.f4723Q
            if (r6 != 0) goto L_0x029c
            v.c[] r11 = r7.f4723Q
            r11 = r11[r16]
            if (r5 == 0) goto L_0x01c9
            r27 = 1
            goto L_0x01cb
        L_0x01c9:
            r27 = 4
        L_0x01cb:
            int r28 = r11.e()
            r29 = r6
            int[] r6 = r7.f4761p0
            r30 = r14
            r14 = r6[r39]
            r31 = r15
            r15 = 3
            if (r14 != r15) goto L_0x01e4
            int[] r14 = r7.f4765t
            r14 = r14[r39]
            if (r14 != 0) goto L_0x01e4
            r14 = 1
            goto L_0x01e5
        L_0x01e4:
            r14 = 0
        L_0x01e5:
            v.c r15 = r11.f4705f
            if (r15 == 0) goto L_0x01f1
            if (r7 == r8) goto L_0x01f1
            int r15 = r15.e()
            int r28 = r15 + r28
        L_0x01f1:
            r15 = r28
            if (r5 == 0) goto L_0x01fe
            if (r7 == r8) goto L_0x01fe
            if (r7 == r13) goto L_0x01fe
            r28 = r2
            r27 = 8
            goto L_0x0200
        L_0x01fe:
            r28 = r2
        L_0x0200:
            v.c r2 = r11.f4705f
            if (r2 == 0) goto L_0x023e
            if (r7 != r13) goto L_0x0213
            r32 = r8
            t.f r8 = r11.i
            t.f r2 = r2.i
            r33 = r1
            r1 = 6
            r10.f(r8, r2, r15, r1)
            goto L_0x0220
        L_0x0213:
            r33 = r1
            r32 = r8
            t.f r1 = r11.i
            t.f r2 = r2.i
            r8 = 8
            r10.f(r1, r2, r15, r8)
        L_0x0220:
            if (r14 == 0) goto L_0x0226
            if (r5 != 0) goto L_0x0226
            r27 = 5
        L_0x0226:
            if (r7 != r13) goto L_0x0232
            if (r5 == 0) goto L_0x0232
            boolean[] r1 = r7.f4725S
            boolean r1 = r1[r39]
            if (r1 == 0) goto L_0x0232
            r1 = 5
            goto L_0x0234
        L_0x0232:
            r1 = r27
        L_0x0234:
            t.f r2 = r11.i
            v.c r8 = r11.f4705f
            t.f r8 = r8.i
            r10.e(r2, r8, r15, r1)
            goto L_0x0242
        L_0x023e:
            r33 = r1
            r32 = r8
        L_0x0242:
            v.c[] r1 = r7.f4723Q
            if (r4 == 0) goto L_0x026f
            int r2 = r7.f4745g0
            r8 = 8
            if (r2 == r8) goto L_0x0261
            r2 = r6[r39]
            r6 = 3
            if (r2 != r6) goto L_0x0261
            int r2 = r16 + 1
            r2 = r1[r2]
            t.f r2 = r2.i
            r6 = r1[r16]
            t.f r6 = r6.i
            r8 = 0
            r11 = 5
            r10.f(r2, r6, r8, r11)
            goto L_0x0262
        L_0x0261:
            r8 = 0
        L_0x0262:
            r2 = r1[r16]
            t.f r2 = r2.i
            r3 = r3[r16]
            t.f r3 = r3.i
            r6 = 8
            r10.f(r2, r3, r8, r6)
        L_0x026f:
            int r2 = r16 + 1
            r1 = r1[r2]
            v.c r1 = r1.f4705f
            if (r1 == 0) goto L_0x0285
            v.d r1 = r1.f4704d
            v.c[] r2 = r1.f4723Q
            r2 = r2[r16]
            v.c r2 = r2.f4705f
            if (r2 == 0) goto L_0x0285
            v.d r2 = r2.f4704d
            if (r2 == r7) goto L_0x0287
        L_0x0285:
            r1 = r17
        L_0x0287:
            if (r1 == 0) goto L_0x028d
            r7 = r1
            r6 = r29
            goto L_0x028e
        L_0x028d:
            r6 = 1
        L_0x028e:
            r11 = r38
            r2 = r28
            r14 = r30
            r15 = r31
            r8 = r32
            r1 = r33
            goto L_0x01bc
        L_0x029c:
            r33 = r1
            r28 = r2
            r32 = r8
            r30 = r14
            r31 = r15
            if (r9 == 0) goto L_0x0303
            v.c[] r1 = r12.f4723Q
            int r2 = r16 + 1
            r1 = r1[r2]
            v.c r1 = r1.f4705f
            if (r1 == 0) goto L_0x0303
            v.c[] r1 = r9.f4723Q
            r1 = r1[r2]
            int[] r6 = r9.f4761p0
            r6 = r6[r39]
            r7 = 3
            if (r6 != r7) goto L_0x02d9
            int[] r6 = r9.f4765t
            r6 = r6[r39]
            if (r6 != 0) goto L_0x02d9
            if (r5 != 0) goto L_0x02d9
            v.c r6 = r1.f4705f
            v.d r7 = r6.f4704d
            if (r7 != r0) goto L_0x02d9
            t.f r7 = r1.i
            t.f r6 = r6.i
            int r8 = r1.e()
            int r8 = -r8
            r11 = 5
            r10.e(r7, r6, r8, r11)
            goto L_0x02ef
        L_0x02d9:
            r11 = 5
            if (r5 == 0) goto L_0x02ef
            v.c r6 = r1.f4705f
            v.d r7 = r6.f4704d
            if (r7 != r0) goto L_0x02ef
            t.f r7 = r1.i
            t.f r6 = r6.i
            int r8 = r1.e()
            int r8 = -r8
            r14 = 4
            r10.e(r7, r6, r8, r14)
        L_0x02ef:
            t.f r6 = r1.i
            v.c[] r7 = r12.f4723Q
            r2 = r7[r2]
            v.c r2 = r2.f4705f
            t.f r2 = r2.i
            int r1 = r1.e()
            int r1 = -r1
            r7 = 6
            r10.g(r6, r2, r1, r7)
            goto L_0x0304
        L_0x0303:
            r11 = 5
        L_0x0304:
            if (r4 == 0) goto L_0x031b
            int r1 = r16 + 1
            r2 = r3[r1]
            t.f r2 = r2.i
            v.c[] r3 = r12.f4723Q
            r1 = r3[r1]
            t.f r3 = r1.i
            int r1 = r1.e()
            r4 = 8
            r10.f(r2, r3, r1, r4)
        L_0x031b:
            r1 = r33
            java.util.ArrayList r2 = r1.f4692h
            if (r2 == 0) goto L_0x042e
            int r3 = r2.size()
            r4 = 1
            if (r3 <= r4) goto L_0x042e
            boolean r6 = r1.f4697n
            if (r6 == 0) goto L_0x0334
            boolean r6 = r1.f4699p
            if (r6 != 0) goto L_0x0334
            int r6 = r1.f4693j
            float r6 = (float) r6
            goto L_0x0336
        L_0x0334:
            r6 = r26
        L_0x0336:
            r14 = r17
            r7 = 0
            r8 = 0
        L_0x033a:
            if (r8 >= r3) goto L_0x042e
            java.lang.Object r15 = r2.get(r8)
            v.d r15 = (v.C0347d) r15
            float[] r4 = r15.f4752k0
            r4 = r4[r39]
            v.c[] r11 = r15.f4723Q
            r21 = 0
            int r24 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
            if (r24 >= 0) goto L_0x036b
            boolean r4 = r1.f4699p
            if (r4 == 0) goto L_0x0364
            int r0 = r16 + 1
            r0 = r11[r0]
            t.f r0 = r0.i
            r4 = r11[r16]
            t.f r4 = r4.i
            r11 = 0
            r15 = 4
            r10.e(r0, r4, r11, r15)
            r24 = 4
            goto L_0x0382
        L_0x0364:
            r24 = 4
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0368:
            r21 = 0
            goto L_0x036e
        L_0x036b:
            r24 = 4
            goto L_0x0368
        L_0x036e:
            int r26 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
            if (r26 != 0) goto L_0x038c
            int r0 = r16 + 1
            r0 = r11[r0]
            t.f r0 = r0.i
            r4 = r11[r16]
            t.f r4 = r4.i
            r11 = 0
            r15 = 8
            r10.e(r0, r4, r11, r15)
        L_0x0382:
            r21 = r1
            r29 = r2
            r27 = r3
            r19 = 0
            goto L_0x0420
        L_0x038c:
            r19 = 0
            if (r14 == 0) goto L_0x0415
            v.c[] r14 = r14.f4723Q
            r0 = r14[r16]
            t.f r0 = r0.i
            int r27 = r16 + 1
            r14 = r14[r27]
            t.f r14 = r14.i
            r29 = r2
            r2 = r11[r16]
            t.f r2 = r2.i
            r11 = r11[r27]
            t.f r11 = r11.i
            r27 = r3
            t.b r3 = r37.l()
            r33 = r15
            r15 = 0
            r3.f4645b = r15
            r21 = r1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r34 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r34 == 0) goto L_0x03bd
            int r34 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r34 != 0) goto L_0x03c0
        L_0x03bd:
            r15 = 1065353216(0x3f800000, float:1.0)
            goto L_0x03fd
        L_0x03c0:
            int r34 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r34 != 0) goto L_0x03d1
            t.a r2 = r3.f4647d
            r7 = 1065353216(0x3f800000, float:1.0)
            r2.g(r0, r7)
            t.a r0 = r3.f4647d
            r0.g(r14, r1)
            goto L_0x0411
        L_0x03d1:
            r15 = 1065353216(0x3f800000, float:1.0)
            if (r26 != 0) goto L_0x03e0
            t.a r0 = r3.f4647d
            r0.g(r2, r15)
            t.a r0 = r3.f4647d
            r0.g(r11, r1)
            goto L_0x0411
        L_0x03e0:
            float r7 = r7 / r6
            float r26 = r4 / r6
            float r7 = r7 / r26
            t.a r1 = r3.f4647d
            r1.g(r0, r15)
            t.a r0 = r3.f4647d
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.g(r14, r1)
            t.a r0 = r3.f4647d
            r0.g(r11, r7)
            t.a r0 = r3.f4647d
            float r1 = -r7
            r0.g(r2, r1)
            goto L_0x0411
        L_0x03fd:
            t.a r7 = r3.f4647d
            r7.g(r0, r15)
            t.a r0 = r3.f4647d
            r0.g(r14, r1)
            t.a r0 = r3.f4647d
            r0.g(r11, r15)
            t.a r0 = r3.f4647d
            r0.g(r2, r1)
        L_0x0411:
            r10.c(r3)
            goto L_0x041d
        L_0x0415:
            r21 = r1
            r29 = r2
            r27 = r3
            r33 = r15
        L_0x041d:
            r7 = r4
            r14 = r33
        L_0x0420:
            int r8 = r8 + 1
            r4 = 1
            r11 = 5
            r0 = r36
            r1 = r21
            r3 = r27
            r2 = r29
            goto L_0x033a
        L_0x042e:
            r21 = r1
            r19 = 0
            r24 = 4
            if (r13 == 0) goto L_0x043d
            if (r13 == r9) goto L_0x043a
            if (r5 == 0) goto L_0x043d
        L_0x043a:
            r0 = r32
            goto L_0x0445
        L_0x043d:
            r14 = r9
            r15 = r25
            r0 = r32
            r11 = 2
            goto L_0x049e
        L_0x0445:
            v.c[] r0 = r0.f4723Q
            r0 = r0[r16]
            v.c[] r1 = r12.f4723Q
            int r2 = r16 + 1
            r1 = r1[r2]
            v.c r0 = r0.f4705f
            if (r0 == 0) goto L_0x0457
            t.f r0 = r0.i
            r3 = r0
            goto L_0x0459
        L_0x0457:
            r3 = r17
        L_0x0459:
            v.c r0 = r1.f4705f
            if (r0 == 0) goto L_0x0461
            t.f r0 = r0.i
            r6 = r0
            goto L_0x0463
        L_0x0461:
            r6 = r17
        L_0x0463:
            v.c[] r0 = r13.f4723Q
            r0 = r0[r16]
            if (r9 == 0) goto L_0x046d
            v.c[] r1 = r9.f4723Q
            r1 = r1[r2]
        L_0x046d:
            if (r3 == 0) goto L_0x0496
            if (r6 == 0) goto L_0x0496
            if (r39 != 0) goto L_0x0479
            r2 = r28
            float r2 = r2.f4740d0
        L_0x0477:
            r5 = r2
            goto L_0x047e
        L_0x0479:
            r2 = r28
            float r2 = r2.f4741e0
            goto L_0x0477
        L_0x047e:
            int r4 = r0.e()
            int r8 = r1.e()
            t.f r2 = r0.i
            t.f r7 = r1.i
            r0 = 7
            r1 = r37
            r11 = 2
            r14 = r9
            r15 = r25
            r9 = r0
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x049a
        L_0x0496:
            r14 = r9
            r15 = r25
            r11 = 2
        L_0x049a:
            r23 = r15
            goto L_0x06aa
        L_0x049e:
            if (r20 == 0) goto L_0x0585
            if (r13 == 0) goto L_0x0585
            r1 = r21
            int r2 = r1.f4693j
            if (r2 <= 0) goto L_0x04af
            int r1 = r1.i
            if (r1 != r2) goto L_0x04af
            r22 = 1
            goto L_0x04b1
        L_0x04af:
            r22 = 0
        L_0x04b1:
            r8 = r13
            r9 = r8
        L_0x04b3:
            if (r9 == 0) goto L_0x049a
            v.d[] r1 = r9.m0
            r1 = r1[r39]
            r7 = r1
        L_0x04ba:
            if (r7 == 0) goto L_0x04c7
            int r1 = r7.f4745g0
            r6 = 8
            if (r1 != r6) goto L_0x04c9
            v.d[] r1 = r7.m0
            r7 = r1[r39]
            goto L_0x04ba
        L_0x04c7:
            r6 = 8
        L_0x04c9:
            if (r7 != 0) goto L_0x04d5
            if (r9 != r14) goto L_0x04ce
            goto L_0x04d5
        L_0x04ce:
            r21 = r7
            r23 = r8
            r11 = r9
            goto L_0x0576
        L_0x04d5:
            v.c[] r1 = r9.f4723Q
            r2 = r1[r16]
            t.f r3 = r2.i
            v.c r4 = r2.f4705f
            if (r4 == 0) goto L_0x04e2
            t.f r4 = r4.i
            goto L_0x04e4
        L_0x04e2:
            r4 = r17
        L_0x04e4:
            if (r8 == r9) goto L_0x04ef
            v.c[] r4 = r8.f4723Q
            int r5 = r16 + 1
            r4 = r4[r5]
            t.f r4 = r4.i
            goto L_0x04fe
        L_0x04ef:
            if (r9 != r13) goto L_0x04fe
            v.c[] r4 = r0.f4723Q
            r4 = r4[r16]
            v.c r4 = r4.f4705f
            if (r4 == 0) goto L_0x04fc
            t.f r4 = r4.i
            goto L_0x04fe
        L_0x04fc:
            r4 = r17
        L_0x04fe:
            int r2 = r2.e()
            int r5 = r16 + 1
            r21 = r1[r5]
            int r21 = r21.e()
            if (r7 == 0) goto L_0x0513
            v.c[] r6 = r7.f4723Q
            r6 = r6[r16]
            t.f r11 = r6.i
            goto L_0x0520
        L_0x0513:
            v.c[] r6 = r12.f4723Q
            r6 = r6[r5]
            v.c r6 = r6.f4705f
            if (r6 == 0) goto L_0x051e
            t.f r11 = r6.i
            goto L_0x0520
        L_0x051e:
            r11 = r17
        L_0x0520:
            r1 = r1[r5]
            t.f r1 = r1.i
            if (r6 == 0) goto L_0x052c
            int r6 = r6.e()
            int r21 = r6 + r21
        L_0x052c:
            v.c[] r6 = r8.f4723Q
            r6 = r6[r5]
            int r6 = r6.e()
            int r6 = r6 + r2
            if (r3 == 0) goto L_0x04ce
            if (r4 == 0) goto L_0x04ce
            if (r11 == 0) goto L_0x04ce
            if (r1 == 0) goto L_0x04ce
            if (r9 != r13) goto L_0x0548
            v.c[] r2 = r13.f4723Q
            r2 = r2[r16]
            int r2 = r2.e()
            r6 = r2
        L_0x0548:
            if (r9 != r14) goto L_0x0554
            v.c[] r2 = r14.f4723Q
            r2 = r2[r5]
            int r2 = r2.e()
            r21 = r2
        L_0x0554:
            if (r22 == 0) goto L_0x0559
            r24 = 8
            goto L_0x055b
        L_0x0559:
            r24 = 5
        L_0x055b:
            r5 = 1056964608(0x3f000000, float:0.5)
            r25 = r1
            r1 = r37
            r2 = r3
            r3 = r4
            r4 = r6
            r23 = 8
            r6 = r11
            r11 = r7
            r7 = r25
            r23 = r8
            r8 = r21
            r21 = r11
            r11 = r9
            r9 = r24
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0576:
            int r1 = r11.f4745g0
            r9 = 8
            if (r1 == r9) goto L_0x057e
            r8 = r11
            goto L_0x0580
        L_0x057e:
            r8 = r23
        L_0x0580:
            r9 = r21
            r11 = 2
            goto L_0x04b3
        L_0x0585:
            r1 = r21
            r9 = 8
            if (r18 == 0) goto L_0x049a
            if (r13 == 0) goto L_0x049a
            int r2 = r1.f4693j
            if (r2 <= 0) goto L_0x0598
            int r1 = r1.i
            if (r1 != r2) goto L_0x0598
            r22 = 1
            goto L_0x059a
        L_0x0598:
            r22 = 0
        L_0x059a:
            r8 = r13
            r11 = r8
        L_0x059c:
            if (r11 == 0) goto L_0x0655
            v.d[] r1 = r11.m0
            r1 = r1[r39]
        L_0x05a2:
            if (r1 == 0) goto L_0x05ad
            int r2 = r1.f4745g0
            if (r2 != r9) goto L_0x05ad
            v.d[] r1 = r1.m0
            r1 = r1[r39]
            goto L_0x05a2
        L_0x05ad:
            if (r11 == r13) goto L_0x0640
            if (r11 == r14) goto L_0x0640
            if (r1 == 0) goto L_0x0640
            if (r1 != r14) goto L_0x05b8
            r7 = r17
            goto L_0x05b9
        L_0x05b8:
            r7 = r1
        L_0x05b9:
            v.c[] r1 = r11.f4723Q
            r2 = r1[r16]
            t.f r3 = r2.i
            v.c[] r4 = r8.f4723Q
            int r5 = r16 + 1
            r4 = r4[r5]
            t.f r4 = r4.i
            int r2 = r2.e()
            r6 = r1[r5]
            int r6 = r6.e()
            if (r7 == 0) goto L_0x05e5
            v.c[] r1 = r7.f4723Q
            r1 = r1[r16]
            t.f r9 = r1.i
            r21 = r7
            v.c r7 = r1.f4705f
            if (r7 == 0) goto L_0x05e2
            t.f r7 = r7.i
            goto L_0x05fb
        L_0x05e2:
            r7 = r17
            goto L_0x05fb
        L_0x05e5:
            r21 = r7
            v.c[] r7 = r14.f4723Q
            r7 = r7[r16]
            if (r7 == 0) goto L_0x05f0
            t.f r9 = r7.i
            goto L_0x05f2
        L_0x05f0:
            r9 = r17
        L_0x05f2:
            r1 = r1[r5]
            t.f r1 = r1.i
            r35 = r7
            r7 = r1
            r1 = r35
        L_0x05fb:
            if (r1 == 0) goto L_0x0605
            int r1 = r1.e()
            int r1 = r1 + r6
            r23 = r1
            goto L_0x0607
        L_0x0605:
            r23 = r6
        L_0x0607:
            v.c[] r1 = r8.f4723Q
            r1 = r1[r5]
            int r1 = r1.e()
            int r5 = r1 + r2
            if (r22 == 0) goto L_0x0616
            r25 = 8
            goto L_0x0618
        L_0x0616:
            r25 = 4
        L_0x0618:
            if (r3 == 0) goto L_0x0637
            if (r4 == 0) goto L_0x0637
            if (r9 == 0) goto L_0x0637
            if (r7 == 0) goto L_0x0637
            r6 = 1056964608(0x3f000000, float:0.5)
            r1 = r37
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r9
            r26 = r8
            r8 = r23
            r23 = r15
            r15 = 8
            r9 = r25
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x063d
        L_0x0637:
            r26 = r8
            r23 = r15
            r15 = 8
        L_0x063d:
            r1 = r21
            goto L_0x0646
        L_0x0640:
            r26 = r8
            r23 = r15
            r15 = 8
        L_0x0646:
            int r2 = r11.f4745g0
            if (r2 == r15) goto L_0x064c
            r8 = r11
            goto L_0x064e
        L_0x064c:
            r8 = r26
        L_0x064e:
            r11 = r1
            r15 = r23
            r9 = 8
            goto L_0x059c
        L_0x0655:
            r23 = r15
            v.c[] r1 = r13.f4723Q
            r1 = r1[r16]
            v.c[] r0 = r0.f4723Q
            r0 = r0[r16]
            v.c r0 = r0.f4705f
            v.c[] r2 = r14.f4723Q
            int r3 = r16 + 1
            r11 = r2[r3]
            v.c[] r2 = r12.f4723Q
            r2 = r2[r3]
            v.c r15 = r2.f4705f
            r9 = 5
            if (r0 == 0) goto L_0x067d
            if (r13 == r14) goto L_0x067f
            t.f r2 = r1.i
            t.f r0 = r0.i
            int r1 = r1.e()
            r10.e(r2, r0, r1, r9)
        L_0x067d:
            r0 = 5
            goto L_0x069a
        L_0x067f:
            if (r15 == 0) goto L_0x067d
            t.f r2 = r1.i
            t.f r3 = r0.i
            int r4 = r1.e()
            t.f r6 = r11.i
            t.f r7 = r15.i
            int r8 = r11.e()
            r5 = 1056964608(0x3f000000, float:0.5)
            r1 = r37
            r0 = 5
            r9 = r0
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x069a:
            if (r15 == 0) goto L_0x06aa
            if (r13 == r14) goto L_0x06aa
            t.f r1 = r11.i
            t.f r2 = r15.i
            int r3 = r11.e()
            int r3 = -r3
            r10.e(r1, r2, r3, r0)
        L_0x06aa:
            if (r20 != 0) goto L_0x06ae
            if (r18 == 0) goto L_0x0704
        L_0x06ae:
            if (r13 == 0) goto L_0x0704
            if (r13 == r14) goto L_0x0704
            v.c[] r0 = r13.f4723Q
            r1 = r0[r16]
            if (r14 != 0) goto L_0x06ba
            r9 = r13
            goto L_0x06bb
        L_0x06ba:
            r9 = r14
        L_0x06bb:
            int r2 = r16 + 1
            v.c[] r3 = r9.f4723Q
            r4 = r3[r2]
            v.c r5 = r1.f4705f
            if (r5 == 0) goto L_0x06c8
            t.f r5 = r5.i
            goto L_0x06ca
        L_0x06c8:
            r5 = r17
        L_0x06ca:
            v.c r6 = r4.f4705f
            if (r6 == 0) goto L_0x06d1
            t.f r6 = r6.i
            goto L_0x06d3
        L_0x06d1:
            r6 = r17
        L_0x06d3:
            if (r12 == r9) goto L_0x06e3
            v.c[] r6 = r12.f4723Q
            r6 = r6[r2]
            v.c r6 = r6.f4705f
            if (r6 == 0) goto L_0x06e1
            t.f r6 = r6.i
            r17 = r6
        L_0x06e1:
            r6 = r17
        L_0x06e3:
            if (r13 != r9) goto L_0x06e7
            r4 = r0[r2]
        L_0x06e7:
            if (r5 == 0) goto L_0x0704
            if (r6 == 0) goto L_0x0704
            int r0 = r1.e()
            r2 = r3[r2]
            int r8 = r2.e()
            t.f r2 = r1.i
            t.f r7 = r4.i
            r9 = 5
            r11 = 1056964608(0x3f000000, float:0.5)
            r1 = r37
            r3 = r5
            r4 = r0
            r5 = r11
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0704:
            int r9 = r23 + 1
            r12 = 2
            r0 = r36
            r11 = r38
            r14 = r30
            r15 = r31
            goto L_0x001b
        L_0x0711:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.j.a(v.e, t.c, java.util.ArrayList, int):void");
    }

    public static void b(C0348e eVar, C0337c cVar, C0347d dVar) {
        dVar.f4758o = -1;
        dVar.f4760p = -1;
        int i = eVar.f4761p0[0];
        int[] iArr = dVar.f4761p0;
        if (i != 2 && iArr[0] == 4) {
            C0346c cVar2 = dVar.I;
            int i2 = cVar2.f4706g;
            int q2 = eVar.q();
            C0346c cVar3 = dVar.f4717K;
            int i3 = q2 - cVar3.f4706g;
            cVar2.i = cVar.k(cVar2);
            cVar3.i = cVar.k(cVar3);
            cVar.d(cVar2.i, i2);
            cVar.d(cVar3.i, i3);
            dVar.f4758o = 2;
            dVar.f4731Y = i2;
            int i4 = i3 - i2;
            dVar.f4727U = i4;
            int i5 = dVar.f4736b0;
            if (i4 < i5) {
                dVar.f4727U = i5;
            }
        }
        if (eVar.f4761p0[1] != 2 && iArr[1] == 4) {
            C0346c cVar4 = dVar.f4716J;
            int i6 = cVar4.f4706g;
            int k2 = eVar.k();
            C0346c cVar5 = dVar.f4718L;
            int i7 = k2 - cVar5.f4706g;
            cVar4.i = cVar.k(cVar4);
            cVar5.i = cVar.k(cVar5);
            cVar.d(cVar4.i, i6);
            cVar.d(cVar5.i, i7);
            if (dVar.f4734a0 > 0 || dVar.f4745g0 == 8) {
                C0346c cVar6 = dVar.f4719M;
                C0340f k3 = cVar.k(cVar6);
                cVar6.i = k3;
                cVar.d(k3, dVar.f4734a0 + i6);
            }
            dVar.f4760p = 2;
            dVar.f4732Z = i6;
            int i8 = i7 - i6;
            dVar.f4728V = i8;
            int i9 = dVar.f4738c0;
            if (i8 < i9) {
                dVar.f4728V = i9;
            }
        }
    }

    public static final boolean c(int i, int i2) {
        if ((i & i2) == i2) {
            return true;
        }
        return false;
    }
}
