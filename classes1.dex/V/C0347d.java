package v;

import Q0.E;
import android.support.v4.media.session.t;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import t.C0337c;
import t.C0339e;
import w.c;
import w.f;
import w.k;
import w.m;
import w.o;

/* renamed from: v.d  reason: case insensitive filesystem */
public class C0347d {

    /* renamed from: A  reason: collision with root package name */
    public int f4708A;

    /* renamed from: B  reason: collision with root package name */
    public float f4709B;

    /* renamed from: C  reason: collision with root package name */
    public final int[] f4710C;

    /* renamed from: D  reason: collision with root package name */
    public float f4711D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f4712E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f4713F;

    /* renamed from: G  reason: collision with root package name */
    public int f4714G;

    /* renamed from: H  reason: collision with root package name */
    public int f4715H;
    public final C0346c I;

    /* renamed from: J  reason: collision with root package name */
    public final C0346c f4716J;

    /* renamed from: K  reason: collision with root package name */
    public final C0346c f4717K;

    /* renamed from: L  reason: collision with root package name */
    public final C0346c f4718L;

    /* renamed from: M  reason: collision with root package name */
    public final C0346c f4719M;

    /* renamed from: N  reason: collision with root package name */
    public final C0346c f4720N;

    /* renamed from: O  reason: collision with root package name */
    public final C0346c f4721O;

    /* renamed from: P  reason: collision with root package name */
    public final C0346c f4722P;

    /* renamed from: Q  reason: collision with root package name */
    public final C0346c[] f4723Q;

    /* renamed from: R  reason: collision with root package name */
    public final ArrayList f4724R;

    /* renamed from: S  reason: collision with root package name */
    public final boolean[] f4725S;

    /* renamed from: T  reason: collision with root package name */
    public C0347d f4726T;

    /* renamed from: U  reason: collision with root package name */
    public int f4727U;

    /* renamed from: V  reason: collision with root package name */
    public int f4728V;

    /* renamed from: W  reason: collision with root package name */
    public float f4729W;

    /* renamed from: X  reason: collision with root package name */
    public int f4730X;

    /* renamed from: Y  reason: collision with root package name */
    public int f4731Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f4732Z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f4733a = false;

    /* renamed from: a0  reason: collision with root package name */
    public int f4734a0;

    /* renamed from: b  reason: collision with root package name */
    public c f4735b;

    /* renamed from: b0  reason: collision with root package name */
    public int f4736b0;

    /* renamed from: c  reason: collision with root package name */
    public c f4737c;

    /* renamed from: c0  reason: collision with root package name */
    public int f4738c0;

    /* renamed from: d  reason: collision with root package name */
    public k f4739d = null;

    /* renamed from: d0  reason: collision with root package name */
    public float f4740d0;
    public m e = null;

    /* renamed from: e0  reason: collision with root package name */
    public float f4741e0;

    /* renamed from: f  reason: collision with root package name */
    public final boolean[] f4742f = {true, true};

    /* renamed from: f0  reason: collision with root package name */
    public View f4743f0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4744g = true;

    /* renamed from: g0  reason: collision with root package name */
    public int f4745g0;

    /* renamed from: h  reason: collision with root package name */
    public int f4746h = -1;

    /* renamed from: h0  reason: collision with root package name */
    public String f4747h0;
    public int i = -1;

    /* renamed from: i0  reason: collision with root package name */
    public int f4748i0;

    /* renamed from: j  reason: collision with root package name */
    public String f4749j;

    /* renamed from: j0  reason: collision with root package name */
    public int f4750j0;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4751k;

    /* renamed from: k0  reason: collision with root package name */
    public final float[] f4752k0;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4753l;

    /* renamed from: l0  reason: collision with root package name */
    public final C0347d[] f4754l0;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4755m;
    public final C0347d[] m0;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4756n;

    /* renamed from: n0  reason: collision with root package name */
    public int f4757n0;

    /* renamed from: o  reason: collision with root package name */
    public int f4758o;

    /* renamed from: o0  reason: collision with root package name */
    public int f4759o0;

    /* renamed from: p  reason: collision with root package name */
    public int f4760p;

    /* renamed from: p0  reason: collision with root package name */
    public final int[] f4761p0;

    /* renamed from: q  reason: collision with root package name */
    public int f4762q;

    /* renamed from: r  reason: collision with root package name */
    public int f4763r;

    /* renamed from: s  reason: collision with root package name */
    public int f4764s;

    /* renamed from: t  reason: collision with root package name */
    public final int[] f4765t;

    /* renamed from: u  reason: collision with root package name */
    public int f4766u;

    /* renamed from: v  reason: collision with root package name */
    public int f4767v;

    /* renamed from: w  reason: collision with root package name */
    public float f4768w;

    /* renamed from: x  reason: collision with root package name */
    public int f4769x;

    /* renamed from: y  reason: collision with root package name */
    public int f4770y;

    /* renamed from: z  reason: collision with root package name */
    public float f4771z;

    public static void o(StringBuilder sb, String str, int i2, int i3, int i4, int i5, int i6, float f2, int i7) {
        String str2;
        sb.append(str);
        sb.append(" :  {\n");
        if (i7 == 1) {
            str2 = "FIXED";
        } else if (i7 == 2) {
            str2 = "WRAP_CONTENT";
        } else if (i7 == 3) {
            str2 = "MATCH_CONSTRAINT";
        } else if (i7 == 4) {
            str2 = "MATCH_PARENT";
        } else {
            throw null;
        }
        if (!"FIXED".equals(str2)) {
            sb.append("      behavior");
            sb.append(" :   ");
            sb.append(str2);
            sb.append(",\n");
        }
        G(i2, 0, "      size", sb);
        G(i3, 0, "      min", sb);
        G(i4, Integer.MAX_VALUE, "      max", sb);
        G(i5, 0, "      matchMin", sb);
        G(i6, 0, "      matchDef", sb);
        H(sb, "      matchPercent", f2, 1.0f);
        sb.append("    },\n");
    }

    public final void E() {
        this.f4751k = false;
        this.f4753l = false;
        this.f4755m = false;
        this.f4756n = false;
        ArrayList arrayList = this.f4724R;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0346c cVar = (C0346c) arrayList.get(i2);
            cVar.f4703c = false;
            cVar.f4702b = 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0391 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x03e7  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0451 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x049d  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x04d1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x04e7  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x04f6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:339:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:342:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:346:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(t.C0337c r31, boolean r32, boolean r33, boolean r34, boolean r35, t.C0340f r36, t.C0340f r37, int r38, boolean r39, v.C0346c r40, v.C0346c r41, int r42, int r43, int r44, int r45, float r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, int r52, int r53, int r54, int r55, float r56, boolean r57) {
        /*
            r30 = this;
            r0 = r30
            r10 = r31
            r11 = r36
            r12 = r37
            r13 = r40
            r14 = r41
            r15 = r44
            r1 = r45
            r2 = r53
            r3 = r54
            r4 = r55
            r5 = r56
            t.f r9 = r10.k(r13)
            t.f r8 = r10.k(r14)
            v.c r6 = r13.f4705f
            t.f r7 = r10.k(r6)
            v.c r6 = r14.f4705f
            t.f r6 = r10.k(r6)
            boolean r16 = r40.h()
            boolean r17 = r41.h()
            v.c r12 = r0.f4722P
            boolean r12 = r12.h()
            if (r17 == 0) goto L_0x003f
            int r18 = r16 + 1
            goto L_0x0041
        L_0x003f:
            r18 = r16
        L_0x0041:
            if (r12 == 0) goto L_0x0045
            int r18 = r18 + 1
        L_0x0045:
            r2 = r18
            if (r47 == 0) goto L_0x004b
            r14 = 3
            goto L_0x004d
        L_0x004b:
            r14 = r52
        L_0x004d:
            int r11 = t.C0339e.a(r38)
            r19 = r6
            r6 = 1
            if (r11 == 0) goto L_0x005b
            if (r11 == r6) goto L_0x005b
            r6 = 2
            if (r11 == r6) goto L_0x005d
        L_0x005b:
            r6 = 0
            goto L_0x0061
        L_0x005d:
            r6 = 4
            if (r14 == r6) goto L_0x005b
            r6 = 1
        L_0x0061:
            int r11 = r0.f4746h
            r5 = -1
            if (r11 == r5) goto L_0x006d
            if (r32 == 0) goto L_0x006d
            r0.f4746h = r5
            r43 = 0
            goto L_0x0071
        L_0x006d:
            r11 = r43
            r43 = r6
        L_0x0071:
            int r6 = r0.i
            if (r6 == r5) goto L_0x007c
            if (r32 != 0) goto L_0x007c
            r0.i = r5
            r11 = r6
            r6 = 0
            goto L_0x007e
        L_0x007c:
            r6 = r43
        L_0x007e:
            int r5 = r0.f4745g0
            r43 = r11
            r11 = 8
            if (r5 != r11) goto L_0x0089
            r5 = 0
            r6 = 0
            goto L_0x008b
        L_0x0089:
            r5 = r43
        L_0x008b:
            if (r57 == 0) goto L_0x0098
            if (r16 != 0) goto L_0x009d
            if (r17 != 0) goto L_0x009d
            if (r12 != 0) goto L_0x009d
            r11 = r42
            r10.d(r9, r11)
        L_0x0098:
            r22 = r12
            r12 = 8
            goto L_0x00ac
        L_0x009d:
            if (r16 == 0) goto L_0x0098
            if (r17 != 0) goto L_0x0098
            int r11 = r40.e()
            r22 = r12
            r12 = 8
            r10.e(r9, r7, r11, r12)
        L_0x00ac:
            if (r6 != 0) goto L_0x00d4
            if (r39 == 0) goto L_0x00c5
            r11 = 3
            r12 = 0
            r10.e(r8, r9, r12, r11)
            r11 = 8
            if (r15 <= 0) goto L_0x00bc
            r10.f(r8, r9, r15, r11)
        L_0x00bc:
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r5) goto L_0x00cb
            r10.g(r8, r9, r1, r11)
            goto L_0x00cb
        L_0x00c5:
            r11 = 8
            r12 = 0
            r10.e(r8, r9, r5, r11)
        L_0x00cb:
            r11 = r35
            r23 = r2
            r12 = r3
            r24 = r6
            goto L_0x01a7
        L_0x00d4:
            r1 = 2
            r12 = 0
            if (r2 == r1) goto L_0x00f7
            if (r47 != 0) goto L_0x00f7
            r1 = 1
            if (r14 == r1) goto L_0x00df
            if (r14 != 0) goto L_0x00f7
        L_0x00df:
            int r1 = java.lang.Math.max(r3, r5)
            if (r4 <= 0) goto L_0x00e9
            int r1 = java.lang.Math.min(r4, r1)
        L_0x00e9:
            r5 = 8
            r10.e(r8, r9, r1, r5)
            r11 = r35
            r23 = r2
            r12 = r3
            r24 = 0
            goto L_0x01a7
        L_0x00f7:
            r1 = -2
            if (r3 != r1) goto L_0x00fb
            r3 = r5
        L_0x00fb:
            if (r4 != r1) goto L_0x00fe
            r4 = r5
        L_0x00fe:
            if (r5 <= 0) goto L_0x0104
            r1 = 1
            if (r14 == r1) goto L_0x0104
            r5 = 0
        L_0x0104:
            r1 = 8
            if (r3 <= 0) goto L_0x010f
            r10.f(r8, r9, r3, r1)
            int r5 = java.lang.Math.max(r5, r3)
        L_0x010f:
            r11 = 1
            if (r4 <= 0) goto L_0x011e
            if (r33 == 0) goto L_0x0117
            if (r14 != r11) goto L_0x0117
            goto L_0x011a
        L_0x0117:
            r10.g(r8, r9, r4, r1)
        L_0x011a:
            int r5 = java.lang.Math.min(r5, r4)
        L_0x011e:
            if (r14 != r11) goto L_0x0139
            if (r33 == 0) goto L_0x0127
            r10.e(r8, r9, r5, r1)
            r11 = 5
            goto L_0x00cb
        L_0x0127:
            if (r49 == 0) goto L_0x0131
            r11 = 5
            r10.e(r8, r9, r5, r11)
            r10.g(r8, r9, r5, r1)
            goto L_0x00cb
        L_0x0131:
            r11 = 5
            r10.e(r8, r9, r5, r11)
            r10.g(r8, r9, r5, r1)
            goto L_0x00cb
        L_0x0139:
            r1 = 2
            r11 = 5
            if (r14 != r1) goto L_0x01a1
            int r5 = r13.e
            r12 = 3
            if (r5 == r12) goto L_0x0144
            if (r5 != r11) goto L_0x0146
        L_0x0144:
            r11 = 4
            goto L_0x015c
        L_0x0146:
            v.d r5 = r0.f4726T
            v.c r5 = r5.i(r1)
            t.f r1 = r10.k(r5)
            v.d r5 = r0.f4726T
            r11 = 4
            v.c r5 = r5.i(r11)
            t.f r5 = r10.k(r5)
            goto L_0x0172
        L_0x015c:
            v.d r1 = r0.f4726T
            r5 = 3
            v.c r1 = r1.i(r5)
            t.f r1 = r10.k(r1)
            v.d r12 = r0.f4726T
            r5 = 5
            v.c r12 = r12.i(r5)
            t.f r5 = r10.k(r12)
        L_0x0172:
            t.b r12 = r31.l()
            t.a r11 = r12.f4647d
            r23 = r2
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11.g(r8, r2)
            t.a r2 = r12.f4647d
            r11 = 1065353216(0x3f800000, float:1.0)
            r2.g(r9, r11)
            t.a r2 = r12.f4647d
            r11 = r56
            r2.g(r5, r11)
            t.a r2 = r12.f4647d
            float r5 = -r11
            r2.g(r1, r5)
            r10.c(r12)
            if (r33 == 0) goto L_0x019a
            r5 = 0
            goto L_0x019b
        L_0x019a:
            r5 = r6
        L_0x019b:
            r11 = r35
            r12 = r3
            r24 = r5
            goto L_0x01a7
        L_0x01a1:
            r23 = r2
            r12 = r3
            r24 = r6
            r11 = 1
        L_0x01a7:
            if (r57 == 0) goto L_0x04e7
            if (r49 == 0) goto L_0x01ba
            r2 = r36
            r4 = r37
            r3 = r8
            r13 = r9
            r35 = r11
            r1 = r23
            r5 = 2
            r29 = 1
            goto L_0x04f4
        L_0x01ba:
            if (r16 != 0) goto L_0x01ca
            if (r17 != 0) goto L_0x01ca
            if (r22 != 0) goto L_0x01ca
            r14 = r41
            r3 = r8
            r35 = r11
            r1 = r19
        L_0x01c7:
            r4 = 5
            goto L_0x04cc
        L_0x01ca:
            if (r16 == 0) goto L_0x01e8
            if (r17 != 0) goto L_0x01e8
            v.c r1 = r13.f4705f
            v.d r1 = r1.f4704d
            if (r33 == 0) goto L_0x01db
            boolean r1 = r1 instanceof v.C0344a
            if (r1 == 0) goto L_0x01db
            r1 = 8
            goto L_0x01dc
        L_0x01db:
            r1 = 5
        L_0x01dc:
            r14 = r41
            r3 = r8
            r35 = r11
            r11 = r1
            r1 = r19
            r19 = r33
            goto L_0x04cf
        L_0x01e8:
            if (r16 != 0) goto L_0x0208
            if (r17 == 0) goto L_0x0208
            int r1 = r41.e()
            int r1 = -r1
            r6 = r19
            r2 = 8
            r10.e(r8, r6, r1, r2)
            if (r33 == 0) goto L_0x0201
            r5 = r36
            r1 = 0
            r2 = 5
            r10.f(r9, r5, r1, r2)
        L_0x0201:
            r14 = r41
            r1 = r6
            r3 = r8
            r35 = r11
            goto L_0x01c7
        L_0x0208:
            r5 = r36
            r6 = r19
            if (r16 == 0) goto L_0x0201
            if (r17 == 0) goto L_0x0201
            v.c r1 = r13.f4705f
            v.d r3 = r1.f4704d
            r2 = r41
            v.c r1 = r2.f4705f
            v.d r1 = r1.f4704d
            v.d r13 = r0.f4726T
            r16 = 6
            if (r24 == 0) goto L_0x0344
            if (r14 != 0) goto L_0x027b
            if (r4 != 0) goto L_0x024b
            if (r12 != 0) goto L_0x024b
            boolean r4 = r7.f4671f
            if (r4 == 0) goto L_0x0240
            boolean r4 = r6.f4671f
            if (r4 == 0) goto L_0x0240
            int r1 = r40.e()
            r3 = 8
            r10.e(r9, r7, r1, r3)
            int r1 = r41.e()
            int r1 = -r1
            r10.e(r8, r6, r1, r3)
            return
        L_0x0240:
            r32 = 8
            r17 = 0
            r19 = 1
            r21 = 0
            r22 = 8
            goto L_0x0255
        L_0x024b:
            r32 = 5
            r17 = 1
            r19 = 0
            r21 = 1
            r22 = 5
        L_0x0255:
            boolean r4 = r3 instanceof v.C0344a
            if (r4 != 0) goto L_0x0271
            boolean r4 = r1 instanceof v.C0344a
            if (r4 == 0) goto L_0x025e
            goto L_0x0271
        L_0x025e:
            r4 = r32
            r20 = r21
            r23 = r22
            r15 = 1
            r22 = 6
        L_0x0267:
            r21 = r19
            r19 = r17
            r17 = r14
        L_0x026d:
            r14 = r37
            goto L_0x038f
        L_0x0271:
            r4 = r32
            r20 = r21
            r15 = 1
            r22 = 6
            r23 = 4
            goto L_0x0267
        L_0x027b:
            r15 = 2
            if (r14 != r15) goto L_0x02a5
            boolean r4 = r3 instanceof v.C0344a
            if (r4 != 0) goto L_0x0296
            boolean r4 = r1 instanceof v.C0344a
            if (r4 == 0) goto L_0x0287
            goto L_0x0296
        L_0x0287:
            r17 = r14
            r4 = 5
            r15 = 1
            r19 = 1
            r20 = 1
            r21 = 0
            r22 = 6
            r23 = 5
            goto L_0x026d
        L_0x0296:
            r17 = r14
            r4 = 5
        L_0x0299:
            r15 = 1
            r19 = 1
            r20 = 1
            r21 = 0
            r22 = 6
            r23 = 4
            goto L_0x026d
        L_0x02a5:
            r15 = 1
            if (r14 != r15) goto L_0x02ad
            r17 = r14
            r4 = 8
            goto L_0x0299
        L_0x02ad:
            r15 = 3
            if (r14 != r15) goto L_0x0337
            int r15 = r0.f4708A
            r17 = r14
            r14 = -1
            if (r15 != r14) goto L_0x02dd
            if (r50 == 0) goto L_0x02cf
            r14 = r37
            r4 = 8
            r15 = 1
            r19 = 1
            r20 = 1
            r21 = 1
            if (r33 == 0) goto L_0x02cc
            r22 = 5
        L_0x02c8:
            r23 = 5
            goto L_0x038f
        L_0x02cc:
            r22 = 4
            goto L_0x02c8
        L_0x02cf:
            r14 = r37
            r4 = 8
            r15 = 1
            r19 = 1
            r20 = 1
            r21 = 1
            r22 = 8
            goto L_0x02c8
        L_0x02dd:
            if (r47 == 0) goto L_0x02fb
            r14 = r53
            r15 = 2
            if (r14 == r15) goto L_0x02ec
            r15 = 1
            if (r14 != r15) goto L_0x02e8
            goto L_0x02ed
        L_0x02e8:
            r4 = 8
            r14 = 5
            goto L_0x02ef
        L_0x02ec:
            r15 = 1
        L_0x02ed:
            r4 = 5
            r14 = 4
        L_0x02ef:
            r23 = r14
            r19 = 1
            r20 = 1
            r21 = 1
            r22 = 6
            goto L_0x026d
        L_0x02fb:
            r15 = 1
            if (r4 <= 0) goto L_0x030a
            r14 = r37
            r4 = 5
            r19 = 1
            r20 = 1
            r21 = 1
            r22 = 6
            goto L_0x02c8
        L_0x030a:
            if (r4 != 0) goto L_0x0333
            if (r12 != 0) goto L_0x0333
            if (r50 != 0) goto L_0x031f
            r14 = r37
            r4 = 5
            r19 = 1
            r20 = 1
            r21 = 1
            r22 = 6
            r23 = 8
            goto L_0x038f
        L_0x031f:
            if (r3 == r13) goto L_0x0325
            if (r1 == r13) goto L_0x0325
            r4 = 4
            goto L_0x0326
        L_0x0325:
            r4 = 5
        L_0x0326:
            r14 = r37
        L_0x0328:
            r19 = 1
            r20 = 1
            r21 = 1
        L_0x032e:
            r22 = 6
            r23 = 4
            goto L_0x038f
        L_0x0333:
            r14 = r37
            r4 = 5
            goto L_0x0328
        L_0x0337:
            r17 = r14
            r15 = 1
            r14 = r37
            r4 = 5
            r19 = 0
            r20 = 0
        L_0x0341:
            r21 = 0
            goto L_0x032e
        L_0x0344:
            r17 = r14
            r15 = 1
            boolean r4 = r7.f4671f
            if (r4 == 0) goto L_0x0387
            boolean r4 = r6.f4671f
            if (r4 == 0) goto L_0x0387
            int r1 = r40.e()
            int r3 = r41.e()
            r4 = 8
            r47 = r31
            r48 = r9
            r49 = r7
            r50 = r1
            r51 = r46
            r52 = r6
            r53 = r8
            r54 = r3
            r55 = r4
            r47.b(r48, r49, r50, r51, r52, r53, r54, r55)
            if (r33 == 0) goto L_0x0386
            if (r11 == 0) goto L_0x0386
            v.c r1 = r2.f4705f
            if (r1 == 0) goto L_0x037d
            int r5 = r41.e()
            r14 = r37
            goto L_0x0380
        L_0x037d:
            r14 = r37
            r5 = 0
        L_0x0380:
            if (r6 == r14) goto L_0x0386
            r1 = 5
            r10.f(r14, r8, r5, r1)
        L_0x0386:
            return
        L_0x0387:
            r14 = r37
            r4 = 5
            r19 = 1
            r20 = 1
            goto L_0x0341
        L_0x038f:
            if (r20 == 0) goto L_0x039a
            if (r7 != r6) goto L_0x039a
            if (r3 == r13) goto L_0x039a
            r20 = 0
            r25 = 0
            goto L_0x039c
        L_0x039a:
            r25 = 1
        L_0x039c:
            if (r19 == 0) goto L_0x03e7
            if (r24 != 0) goto L_0x03b1
            if (r48 != 0) goto L_0x03b1
            if (r50 != 0) goto L_0x03b1
            if (r7 != r5) goto L_0x03b1
            if (r6 != r14) goto L_0x03b1
            r19 = 0
            r22 = 8
            r25 = 0
            r26 = 8
            goto L_0x03b7
        L_0x03b1:
            r19 = r33
            r26 = r22
            r22 = r4
        L_0x03b7:
            int r4 = r40.e()
            int r27 = r41.e()
            r15 = r1
            r1 = r31
            r14 = r2
            r2 = r9
            r35 = r11
            r11 = r3
            r3 = r7
            r39 = r12
            r12 = r5
            r5 = r46
            r32 = r6
            r28 = 4
            r29 = 1
            r12 = r7
            r7 = r8
            r38 = r13
            r13 = r8
            r8 = r27
            r27 = r13
            r13 = r9
            r9 = r26
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            r4 = r22
        L_0x03e4:
            r6 = r25
            goto L_0x03fd
        L_0x03e7:
            r15 = r1
            r14 = r2
            r32 = r6
            r27 = r8
            r35 = r11
            r39 = r12
            r38 = r13
            r28 = 4
            r29 = 1
            r11 = r3
            r12 = r7
            r13 = r9
            r19 = r33
            goto L_0x03e4
        L_0x03fd:
            int r1 = r0.f4745g0
            r2 = 8
            if (r1 != r2) goto L_0x0410
            java.util.HashSet r1 = r14.f4701a
            if (r1 != 0) goto L_0x0408
            goto L_0x040f
        L_0x0408:
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x040f
            goto L_0x0410
        L_0x040f:
            return
        L_0x0410:
            r1 = r32
            if (r20 == 0) goto L_0x0435
            if (r19 == 0) goto L_0x0423
            if (r12 == r1) goto L_0x0423
            if (r24 != 0) goto L_0x0423
            boolean r2 = r11 instanceof v.C0344a
            if (r2 != 0) goto L_0x0422
            boolean r2 = r15 instanceof v.C0344a
            if (r2 == 0) goto L_0x0423
        L_0x0422:
            r4 = 6
        L_0x0423:
            int r2 = r40.e()
            r10.f(r13, r12, r2, r4)
            int r2 = r41.e()
            int r2 = -r2
            r3 = r27
            r10.g(r3, r1, r2, r4)
            goto L_0x0437
        L_0x0435:
            r3 = r27
        L_0x0437:
            if (r19 == 0) goto L_0x044b
            if (r51 == 0) goto L_0x044b
            boolean r2 = r11 instanceof v.C0344a
            if (r2 != 0) goto L_0x044b
            boolean r2 = r15 instanceof v.C0344a
            if (r2 != 0) goto L_0x044b
            r2 = r38
            if (r15 == r2) goto L_0x044d
            r4 = 6
            r5 = 6
            r6 = 1
            goto L_0x044f
        L_0x044b:
            r2 = r38
        L_0x044d:
            r5 = r23
        L_0x044f:
            if (r6 == 0) goto L_0x049b
            if (r21 == 0) goto L_0x047c
            if (r50 == 0) goto L_0x0457
            if (r34 == 0) goto L_0x047c
        L_0x0457:
            if (r11 == r2) goto L_0x045e
            if (r15 != r2) goto L_0x045c
            goto L_0x045e
        L_0x045c:
            r16 = r5
        L_0x045e:
            boolean r6 = r11 instanceof v.h
            if (r6 != 0) goto L_0x0466
            boolean r6 = r15 instanceof v.h
            if (r6 == 0) goto L_0x0468
        L_0x0466:
            r16 = 5
        L_0x0468:
            boolean r6 = r11 instanceof v.C0344a
            if (r6 != 0) goto L_0x0470
            boolean r6 = r15 instanceof v.C0344a
            if (r6 == 0) goto L_0x0472
        L_0x0470:
            r16 = 5
        L_0x0472:
            if (r50 == 0) goto L_0x0476
            r6 = 5
            goto L_0x0478
        L_0x0476:
            r6 = r16
        L_0x0478:
            int r5 = java.lang.Math.max(r6, r5)
        L_0x047c:
            r6 = r5
            if (r19 == 0) goto L_0x048c
            int r6 = java.lang.Math.min(r4, r6)
            if (r47 == 0) goto L_0x048c
            if (r50 != 0) goto L_0x048c
            if (r11 == r2) goto L_0x048b
            if (r15 != r2) goto L_0x048c
        L_0x048b:
            r6 = 4
        L_0x048c:
            int r2 = r40.e()
            r10.e(r13, r12, r2, r6)
            int r2 = r41.e()
            int r2 = -r2
            r10.e(r3, r1, r2, r6)
        L_0x049b:
            if (r19 == 0) goto L_0x04ae
            r2 = r36
            r4 = r12
            if (r2 != r4) goto L_0x04a7
            int r5 = r40.e()
            goto L_0x04a8
        L_0x04a7:
            r5 = 0
        L_0x04a8:
            if (r4 == r2) goto L_0x04ae
            r4 = 5
            r10.f(r13, r2, r5, r4)
        L_0x04ae:
            if (r19 == 0) goto L_0x04c3
            if (r24 == 0) goto L_0x04c3
            if (r44 != 0) goto L_0x04c3
            if (r39 != 0) goto L_0x04c3
            if (r24 == 0) goto L_0x04c5
            r4 = r17
            r2 = 3
            if (r4 != r2) goto L_0x04c5
            r2 = 0
            r4 = 8
            r10.f(r3, r13, r2, r4)
        L_0x04c3:
            r4 = 5
            goto L_0x04ca
        L_0x04c5:
            r2 = 0
            r4 = 5
            r10.f(r3, r13, r2, r4)
        L_0x04ca:
            r11 = 5
            goto L_0x04cf
        L_0x04cc:
            r19 = r33
            goto L_0x04ca
        L_0x04cf:
            if (r19 == 0) goto L_0x04e6
            if (r35 == 0) goto L_0x04e6
            v.c r2 = r14.f4705f
            if (r2 == 0) goto L_0x04de
            int r5 = r41.e()
            r4 = r37
            goto L_0x04e1
        L_0x04de:
            r4 = r37
            r5 = 0
        L_0x04e1:
            if (r1 == r4) goto L_0x04e6
            r10.f(r4, r3, r5, r11)
        L_0x04e6:
            return
        L_0x04e7:
            r2 = r36
            r4 = r37
            r3 = r8
            r13 = r9
            r35 = r11
            r1 = r23
            r29 = 1
            r5 = 2
        L_0x04f4:
            if (r1 >= r5) goto L_0x0532
            if (r33 == 0) goto L_0x0532
            if (r35 == 0) goto L_0x0532
            r1 = 0
            r5 = 8
            r10.f(r13, r2, r1, r5)
            v.c r1 = r0.f4719M
            if (r32 != 0) goto L_0x050b
            v.c r2 = r1.f4705f
            if (r2 != 0) goto L_0x0509
            goto L_0x050b
        L_0x0509:
            r6 = 0
            goto L_0x050c
        L_0x050b:
            r6 = 1
        L_0x050c:
            if (r32 != 0) goto L_0x052a
            v.c r1 = r1.f4705f
            if (r1 == 0) goto L_0x052a
            v.d r1 = r1.f4704d
            float r2 = r1.f4729W
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0529
            int[] r1 = r1.f4761p0
            r2 = 0
            r5 = r1[r2]
            r2 = 3
            if (r5 != r2) goto L_0x0529
            r1 = r1[r29]
            if (r1 != r2) goto L_0x0529
            r6 = 1
            goto L_0x052a
        L_0x0529:
            r6 = 0
        L_0x052a:
            if (r6 == 0) goto L_0x0532
            r1 = 0
            r2 = 8
            r10.f(r4, r3, r1, r2)
        L_0x0532:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C0347d.d(t.c, boolean, boolean, boolean, boolean, t.f, t.f, int, boolean, v.c, v.c, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void e(int i2, C0347d dVar, int i3, int i4) {
        boolean z2;
        if (i2 == 7) {
            if (i3 == 7) {
                C0346c i5 = i(2);
                C0346c i6 = i(4);
                C0346c i7 = i(3);
                C0346c i8 = i(5);
                boolean z3 = true;
                if ((i5 == null || !i5.h()) && (i6 == null || !i6.h())) {
                    e(2, dVar, 2, 0);
                    e(4, dVar, 4, 0);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i7 == null || !i7.h()) && (i8 == null || !i8.h())) {
                    e(3, dVar, 3, 0);
                    e(5, dVar, 5, 0);
                } else {
                    z3 = false;
                }
                if (z2 && z3) {
                    i(7).a(dVar.i(7), 0);
                } else if (z2) {
                    i(8).a(dVar.i(8), 0);
                } else if (z3) {
                    i(9).a(dVar.i(9), 0);
                }
            } else if (i3 == 2 || i3 == 4) {
                e(2, dVar, i3, 0);
                e(4, dVar, i3, 0);
                i(7).a(dVar.i(i3), 0);
            } else if (i3 == 3 || i3 == 5) {
                e(3, dVar, i3, 0);
                e(5, dVar, i3, 0);
                i(7).a(dVar.i(i3), 0);
            }
        } else if (i2 == 8 && (i3 == 2 || i3 == 4)) {
            C0346c i9 = i(2);
            C0346c i10 = dVar.i(i3);
            C0346c i11 = i(4);
            i9.a(i10, 0);
            i11.a(i10, 0);
            i(8).a(i10, 0);
        } else if (i2 == 9 && (i3 == 3 || i3 == 5)) {
            C0346c i12 = dVar.i(i3);
            i(3).a(i12, 0);
            i(5).a(i12, 0);
            i(9).a(i12, 0);
        } else if (i2 == 8 && i3 == 8) {
            i(2).a(dVar.i(2), 0);
            i(4).a(dVar.i(4), 0);
            i(8).a(dVar.i(i3), 0);
        } else if (i2 == 9 && i3 == 9) {
            i(3).a(dVar.i(3), 0);
            i(5).a(dVar.i(5), 0);
            i(9).a(dVar.i(i3), 0);
        } else {
            C0346c i13 = i(i2);
            C0346c i14 = dVar.i(i3);
            if (i13.i(i14)) {
                if (i2 == 6) {
                    C0346c i15 = i(3);
                    C0346c i16 = i(5);
                    if (i15 != null) {
                        i15.j();
                    }
                    if (i16 != null) {
                        i16.j();
                    }
                } else if (i2 == 3 || i2 == 5) {
                    C0346c i17 = i(6);
                    if (i17 != null) {
                        i17.j();
                    }
                    C0346c i18 = i(7);
                    if (i18.f4705f != i14) {
                        i18.j();
                    }
                    C0346c f2 = i(i2).f();
                    C0346c i19 = i(9);
                    if (i19.h()) {
                        f2.j();
                        i19.j();
                    }
                } else if (i2 == 2 || i2 == 4) {
                    C0346c i20 = i(7);
                    if (i20.f4705f != i14) {
                        i20.j();
                    }
                    C0346c f3 = i(i2).f();
                    C0346c i21 = i(8);
                    if (i21.h()) {
                        f3.j();
                        i21.j();
                    }
                }
                i13.a(i14, i4);
            }
        }
    }

    public void n(StringBuilder sb) {
        StringBuilder sb2 = sb;
        sb2.append("  " + this.f4749j + ":{\n");
        StringBuilder sb3 = new StringBuilder("    actualWidth:");
        sb3.append(this.f4727U);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.f4728V);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f4731Y);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f4732Z);
        sb2.append("\n");
        p(sb2, "left", this.I);
        p(sb2, "top", this.f4716J);
        p(sb2, "right", this.f4717K);
        p(sb2, "bottom", this.f4718L);
        p(sb2, "baseline", this.f4719M);
        p(sb2, "centerX", this.f4720N);
        p(sb2, "centerY", this.f4721O);
        int i2 = this.f4727U;
        int i3 = this.f4736b0;
        int[] iArr = this.f4710C;
        int i4 = iArr[0];
        int i5 = this.f4766u;
        int i6 = this.f4763r;
        float f2 = this.f4768w;
        int[] iArr2 = this.f4761p0;
        int i7 = iArr2[0];
        float[] fArr = this.f4752k0;
        float f3 = fArr[0];
        o(sb, "    width", i2, i3, i4, i5, i6, f2, i7);
        int i8 = this.f4728V;
        int i9 = this.f4738c0;
        int i10 = iArr[1];
        int i11 = this.f4769x;
        int i12 = this.f4764s;
        float f4 = this.f4771z;
        int i13 = iArr2[1];
        float f5 = fArr[1];
        o(sb, "    height", i8, i9, i10, i11, i12, f4, i13);
        float f6 = this.f4729W;
        int i14 = this.f4730X;
        if (f6 != 0.0f) {
            sb2.append("    dimensionRatio");
            sb2.append(" :  [");
            sb2.append(f6);
            sb2.append(",");
            sb2.append(i14);
            sb2.append("");
            sb2.append("],\n");
        }
        H(sb2, "    horizontalBias", this.f4740d0, 0.5f);
        H(sb2, "    verticalBias", this.f4741e0, 0.5f);
        G(this.f4748i0, 0, "    horizontalChainStyle", sb2);
        G(this.f4750j0, 0, "    verticalChainStyle", sb2);
        sb2.append("  }");
    }

    public final boolean t(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (i2 == 0) {
            if (this.I.f4705f != null) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (this.f4717K.f4705f != null) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            if (i6 + i7 < 2) {
                return true;
            }
            return false;
        }
        if (this.f4716J.f4705f != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (this.f4718L.f4705f != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        int i8 = i3 + i4;
        if (this.f4719M.f4705f != null) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        if (i8 + i5 < 2) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        r2 = r5.f4718L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r2 = r5.f4717K;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean u(int r6, int r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r6 != 0) goto L_0x0032
            v.c r6 = r5.I
            v.c r2 = r6.f4705f
            if (r2 == 0) goto L_0x0060
            boolean r2 = r2.f4703c
            if (r2 == 0) goto L_0x0060
            v.c r2 = r5.f4717K
            v.c r3 = r2.f4705f
            if (r3 == 0) goto L_0x0060
            boolean r4 = r3.f4703c
            if (r4 == 0) goto L_0x0060
            int r3 = r3.d()
            int r2 = r2.e()
            int r3 = r3 - r2
            v.c r2 = r6.f4705f
            int r2 = r2.d()
            int r6 = r6.e()
            int r6 = r6 + r2
            int r3 = r3 - r6
            if (r3 < r7) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            return r0
        L_0x0032:
            v.c r6 = r5.f4716J
            v.c r2 = r6.f4705f
            if (r2 == 0) goto L_0x0060
            boolean r2 = r2.f4703c
            if (r2 == 0) goto L_0x0060
            v.c r2 = r5.f4718L
            v.c r3 = r2.f4705f
            if (r3 == 0) goto L_0x0060
            boolean r4 = r3.f4703c
            if (r4 == 0) goto L_0x0060
            int r3 = r3.d()
            int r2 = r2.e()
            int r3 = r3 - r2
            v.c r2 = r6.f4705f
            int r2 = r2.d()
            int r6 = r6.e()
            int r6 = r6 + r2
            int r3 = r3 - r6
            if (r3 < r7) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            return r0
        L_0x0060:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C0347d.u(int, int):boolean");
    }

    public C0347d() {
        new HashMap();
        this.f4751k = false;
        this.f4753l = false;
        this.f4755m = false;
        this.f4756n = false;
        this.f4758o = -1;
        this.f4760p = -1;
        this.f4762q = 0;
        this.f4763r = 0;
        this.f4764s = 0;
        this.f4765t = new int[2];
        this.f4766u = 0;
        this.f4767v = 0;
        this.f4768w = 1.0f;
        this.f4769x = 0;
        this.f4770y = 0;
        this.f4771z = 1.0f;
        this.f4708A = -1;
        this.f4709B = 1.0f;
        this.f4710C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f4711D = Float.NaN;
        this.f4712E = false;
        this.f4713F = false;
        this.f4714G = 0;
        this.f4715H = 0;
        C0346c cVar = new C0346c(this, 2);
        this.I = cVar;
        C0346c cVar2 = new C0346c(this, 3);
        this.f4716J = cVar2;
        C0346c cVar3 = new C0346c(this, 4);
        this.f4717K = cVar3;
        C0346c cVar4 = new C0346c(this, 5);
        this.f4718L = cVar4;
        C0346c cVar5 = new C0346c(this, 6);
        this.f4719M = cVar5;
        C0346c cVar6 = new C0346c(this, 8);
        this.f4720N = cVar6;
        C0346c cVar7 = new C0346c(this, 9);
        this.f4721O = cVar7;
        C0346c cVar8 = new C0346c(this, 7);
        this.f4722P = cVar8;
        this.f4723Q = new C0346c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar8};
        ArrayList arrayList = new ArrayList();
        this.f4724R = arrayList;
        this.f4725S = new boolean[2];
        this.f4761p0 = new int[]{1, 1};
        this.f4726T = null;
        this.f4727U = 0;
        this.f4728V = 0;
        this.f4729W = 0.0f;
        this.f4730X = -1;
        this.f4731Y = 0;
        this.f4732Z = 0;
        this.f4734a0 = 0;
        this.f4740d0 = 0.5f;
        this.f4741e0 = 0.5f;
        this.f4745g0 = 0;
        this.f4747h0 = null;
        this.f4748i0 = 0;
        this.f4750j0 = 0;
        this.f4752k0 = new float[]{-1.0f, -1.0f};
        this.f4754l0 = new C0347d[]{null, null};
        this.m0 = new C0347d[]{null, null};
        this.f4757n0 = -1;
        this.f4759o0 = -1;
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        arrayList.add(cVar5);
    }

    public static void G(int i2, int i3, String str, StringBuilder sb) {
        if (i2 != i3) {
            sb.append(str);
            sb.append(" :   ");
            sb.append(i2);
            sb.append(",\n");
        }
    }

    public static void H(StringBuilder sb, String str, float f2, float f3) {
        if (f2 != f3) {
            sb.append(str);
            sb.append(" :   ");
            sb.append(f2);
            sb.append(",\n");
        }
    }

    public static void p(StringBuilder sb, String str, C0346c cVar) {
        if (cVar.f4705f != null) {
            sb.append("    ");
            sb.append(str);
            sb.append(" : [ '");
            sb.append(cVar.f4705f);
            sb.append("'");
            if (!(cVar.f4707h == Integer.MIN_VALUE && cVar.f4706g == 0)) {
                sb.append(",");
                sb.append(cVar.f4706g);
                if (cVar.f4707h != Integer.MIN_VALUE) {
                    sb.append(",");
                    sb.append(cVar.f4707h);
                    sb.append(",");
                }
            }
            sb.append(" ] ,\n");
        }
    }

    public boolean A() {
        if (this.f4751k || (this.I.f4703c && this.f4717K.f4703c)) {
            return true;
        }
        return false;
    }

    public boolean B() {
        if (this.f4753l || (this.f4716J.f4703c && this.f4718L.f4703c)) {
            return true;
        }
        return false;
    }

    public void C() {
        this.I.j();
        this.f4716J.j();
        this.f4717K.j();
        this.f4718L.j();
        this.f4719M.j();
        this.f4720N.j();
        this.f4721O.j();
        this.f4722P.j();
        this.f4726T = null;
        this.f4711D = Float.NaN;
        this.f4727U = 0;
        this.f4728V = 0;
        this.f4729W = 0.0f;
        this.f4730X = -1;
        this.f4731Y = 0;
        this.f4732Z = 0;
        this.f4734a0 = 0;
        this.f4736b0 = 0;
        this.f4738c0 = 0;
        this.f4740d0 = 0.5f;
        this.f4741e0 = 0.5f;
        int[] iArr = this.f4761p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f4743f0 = null;
        this.f4745g0 = 0;
        this.f4748i0 = 0;
        this.f4750j0 = 0;
        float[] fArr = this.f4752k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f4758o = -1;
        this.f4760p = -1;
        int[] iArr2 = this.f4710C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f4763r = 0;
        this.f4764s = 0;
        this.f4768w = 1.0f;
        this.f4771z = 1.0f;
        this.f4767v = Integer.MAX_VALUE;
        this.f4770y = Integer.MAX_VALUE;
        this.f4766u = 0;
        this.f4769x = 0;
        this.f4708A = -1;
        this.f4709B = 1.0f;
        boolean[] zArr = this.f4742f;
        zArr[0] = true;
        zArr[1] = true;
        this.f4713F = false;
        boolean[] zArr2 = this.f4725S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f4744g = true;
        int[] iArr3 = this.f4765t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f4746h = -1;
        this.i = -1;
    }

    public final void D() {
        C0347d dVar = this.f4726T;
        if (dVar != null && (dVar instanceof C0348e)) {
            ((C0348e) dVar).getClass();
        }
        ArrayList arrayList = this.f4724R;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0346c) arrayList.get(i2)).j();
        }
    }

    public void F(t tVar) {
        this.I.k();
        this.f4716J.k();
        this.f4717K.k();
        this.f4718L.k();
        this.f4719M.k();
        this.f4722P.k();
        this.f4720N.k();
        this.f4721O.k();
    }

    public final void I(int i2) {
        boolean z2;
        this.f4734a0 = i2;
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f4712E = z2;
    }

    public final void J(int i2, int i3) {
        if (!this.f4751k) {
            this.I.l(i2);
            this.f4717K.l(i3);
            this.f4731Y = i2;
            this.f4727U = i3 - i2;
            this.f4751k = true;
        }
    }

    public final void K(int i2, int i3) {
        if (!this.f4753l) {
            this.f4716J.l(i2);
            this.f4718L.l(i3);
            this.f4732Z = i2;
            this.f4728V = i3 - i2;
            if (this.f4712E) {
                this.f4719M.l(i2 + this.f4734a0);
            }
            this.f4753l = true;
        }
    }

    public final void L(int i2) {
        this.f4728V = i2;
        int i3 = this.f4738c0;
        if (i2 < i3) {
            this.f4728V = i3;
        }
    }

    public final void M(int i2) {
        this.f4761p0[0] = i2;
    }

    public final void N(int i2) {
        this.f4761p0[1] = i2;
    }

    public final void O(int i2) {
        this.f4727U = i2;
        int i3 = this.f4736b0;
        if (i2 < i3) {
            this.f4727U = i3;
        }
    }

    public void P(boolean z2, boolean z3) {
        int i2;
        int i3;
        k kVar = this.f4739d;
        boolean z4 = z2 & kVar.f4898g;
        m mVar = this.e;
        boolean z5 = z3 & mVar.f4898g;
        int i4 = kVar.f4899h.f4876g;
        int i5 = mVar.f4899h.f4876g;
        int i6 = kVar.i.f4876g;
        int i7 = mVar.i.f4876g;
        int i8 = i7 - i5;
        if (i6 - i4 < 0 || i8 < 0 || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE) {
            i6 = 0;
            i7 = 0;
            i4 = 0;
            i5 = 0;
        }
        int i9 = i6 - i4;
        int i10 = i7 - i5;
        if (z4) {
            this.f4731Y = i4;
        }
        if (z5) {
            this.f4732Z = i5;
        }
        if (this.f4745g0 == 8) {
            this.f4727U = 0;
            this.f4728V = 0;
            return;
        }
        int[] iArr = this.f4761p0;
        if (z4) {
            if (iArr[0] == 1 && i9 < (i3 = this.f4727U)) {
                i9 = i3;
            }
            this.f4727U = i9;
            int i11 = this.f4736b0;
            if (i9 < i11) {
                this.f4727U = i11;
            }
        }
        if (z5) {
            if (iArr[1] == 1 && i10 < (i2 = this.f4728V)) {
                i10 = i2;
            }
            this.f4728V = i10;
            int i12 = this.f4738c0;
            if (i10 < i12) {
                this.f4728V = i12;
            }
        }
    }

    public void Q(C0337c cVar, boolean z2) {
        int i2;
        int i3;
        m mVar;
        k kVar;
        C0346c cVar2 = this.I;
        cVar.getClass();
        int n2 = C0337c.n(cVar2);
        int n3 = C0337c.n(this.f4716J);
        int n4 = C0337c.n(this.f4717K);
        int n5 = C0337c.n(this.f4718L);
        if (z2 && (kVar = this.f4739d) != null) {
            f fVar = kVar.f4899h;
            if (fVar.f4878j) {
                f fVar2 = kVar.i;
                if (fVar2.f4878j) {
                    n2 = fVar.f4876g;
                    n4 = fVar2.f4876g;
                }
            }
        }
        if (z2 && (mVar = this.e) != null) {
            f fVar3 = mVar.f4899h;
            if (fVar3.f4878j) {
                f fVar4 = mVar.i;
                if (fVar4.f4878j) {
                    n3 = fVar3.f4876g;
                    n5 = fVar4.f4876g;
                }
            }
        }
        int i4 = n5 - n3;
        if (n4 - n2 < 0 || i4 < 0 || n2 == Integer.MIN_VALUE || n2 == Integer.MAX_VALUE || n3 == Integer.MIN_VALUE || n3 == Integer.MAX_VALUE || n4 == Integer.MIN_VALUE || n4 == Integer.MAX_VALUE || n5 == Integer.MIN_VALUE || n5 == Integer.MAX_VALUE) {
            n2 = 0;
            n3 = 0;
            n4 = 0;
            n5 = 0;
        }
        int i5 = n4 - n2;
        int i6 = n5 - n3;
        this.f4731Y = n2;
        this.f4732Z = n3;
        if (this.f4745g0 == 8) {
            this.f4727U = 0;
            this.f4728V = 0;
            return;
        }
        int[] iArr = this.f4761p0;
        int i7 = iArr[0];
        if (i7 == 1 && i5 < (i3 = this.f4727U)) {
            i5 = i3;
        }
        if (iArr[1] == 1 && i6 < (i2 = this.f4728V)) {
            i6 = i2;
        }
        this.f4727U = i5;
        this.f4728V = i6;
        int i8 = this.f4738c0;
        if (i6 < i8) {
            this.f4728V = i8;
        }
        int i9 = this.f4736b0;
        if (i5 < i9) {
            this.f4727U = i9;
        }
        int i10 = this.f4767v;
        if (i10 > 0 && i7 == 3) {
            this.f4727U = Math.min(this.f4727U, i10);
        }
        int i11 = this.f4770y;
        if (i11 > 0 && iArr[1] == 3) {
            this.f4728V = Math.min(this.f4728V, i11);
        }
        int i12 = this.f4727U;
        if (i5 != i12) {
            this.f4746h = i12;
        }
        int i13 = this.f4728V;
        if (i6 != i13) {
            this.i = i13;
        }
    }

    public final void a(C0348e eVar, C0337c cVar, HashSet hashSet, int i2, boolean z2) {
        if (z2) {
            if (hashSet.contains(this)) {
                j.b(eVar, cVar, this);
                hashSet.remove(this);
                b(cVar, eVar.W(64));
            } else {
                return;
            }
        }
        if (i2 == 0) {
            HashSet hashSet2 = this.I.f4701a;
            if (hashSet2 != null) {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    ((C0346c) it2.next()).f4704d.a(eVar, cVar, hashSet, i2, true);
                }
            }
            HashSet hashSet3 = this.f4717K.f4701a;
            if (hashSet3 != null) {
                Iterator it3 = hashSet3.iterator();
                while (it3.hasNext()) {
                    ((C0346c) it3.next()).f4704d.a(eVar, cVar, hashSet, i2, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.f4716J.f4701a;
        if (hashSet4 != null) {
            Iterator it4 = hashSet4.iterator();
            while (it4.hasNext()) {
                ((C0346c) it4.next()).f4704d.a(eVar, cVar, hashSet, i2, true);
            }
        }
        HashSet hashSet5 = this.f4718L.f4701a;
        if (hashSet5 != null) {
            Iterator it5 = hashSet5.iterator();
            while (it5.hasNext()) {
                ((C0346c) it5.next()).f4704d.a(eVar, cVar, hashSet, i2, true);
            }
        }
        HashSet hashSet6 = this.f4719M.f4701a;
        if (hashSet6 != null) {
            Iterator it6 = hashSet6.iterator();
            while (it6.hasNext()) {
                ((C0346c) it6.next()).f4704d.a(eVar, cVar, hashSet, i2, true);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0404  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x042a  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x042c  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0431  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x04b2  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x055d  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x05bf  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x05d3  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x05d5  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x05dd  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x0656  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x0659  */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x06a7  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x06af  */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x070c  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x0714  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(t.C0337c r59, boolean r60) {
        /*
            r58 = this;
            r15 = r58
            r14 = r59
            v.c r0 = r15.I
            t.f r13 = r14.k(r0)
            v.c r1 = r15.f4717K
            t.f r12 = r14.k(r1)
            v.c r2 = r15.f4716J
            t.f r9 = r14.k(r2)
            v.c r8 = r15.f4718L
            t.f r7 = r14.k(r8)
            v.c r6 = r15.f4719M
            t.f r5 = r14.k(r6)
            v.d r3 = r15.f4726T
            r4 = 2
            r11 = 0
            if (r3 == 0) goto L_0x004a
            int[] r3 = r3.f4761p0
            r10 = r3[r11]
            if (r10 != r4) goto L_0x0032
            r10 = 1
            r18 = 1
            goto L_0x0035
        L_0x0032:
            r10 = 1
            r18 = 0
        L_0x0035:
            r3 = r3[r10]
            if (r3 != r4) goto L_0x003b
            r3 = 1
            goto L_0x003c
        L_0x003b:
            r3 = 0
        L_0x003c:
            int r11 = r15.f4762q
            if (r11 == r10) goto L_0x0052
            if (r11 == r4) goto L_0x004f
            r10 = 3
            if (r11 == r10) goto L_0x004a
            r28 = r3
            r29 = r18
            goto L_0x0056
        L_0x004a:
            r28 = 0
        L_0x004c:
            r29 = 0
            goto L_0x0056
        L_0x004f:
            r28 = r3
            goto L_0x004c
        L_0x0052:
            r29 = r18
            r28 = 0
        L_0x0056:
            int r3 = r15.f4745g0
            boolean[] r10 = r15.f4725S
            r11 = 8
            if (r3 != r11) goto L_0x008d
            java.util.ArrayList r3 = r15.f4724R
            int r4 = r3.size()
            r11 = 0
        L_0x0065:
            if (r11 >= r4) goto L_0x0082
            java.lang.Object r21 = r3.get(r11)
            r22 = r3
            r3 = r21
            v.c r3 = (v.C0346c) r3
            java.util.HashSet r3 = r3.f4701a
            if (r3 != 0) goto L_0x0076
            goto L_0x007d
        L_0x0076:
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x007d
            goto L_0x008d
        L_0x007d:
            int r11 = r11 + 1
            r3 = r22
            goto L_0x0065
        L_0x0082:
            r3 = 0
            boolean r4 = r10[r3]
            if (r4 != 0) goto L_0x008d
            r3 = 1
            boolean r4 = r10[r3]
            if (r4 != 0) goto L_0x008d
            return
        L_0x008d:
            boolean r3 = r15.f4751k
            if (r3 != 0) goto L_0x0095
            boolean r4 = r15.f4753l
            if (r4 == 0) goto L_0x0172
        L_0x0095:
            if (r3 == 0) goto L_0x00f2
            int r3 = r15.f4731Y
            r14.d(r13, r3)
            int r3 = r15.f4731Y
            int r4 = r15.f4727U
            int r3 = r3 + r4
            r14.d(r12, r3)
            if (r29 == 0) goto L_0x00f2
            v.d r3 = r15.f4726T
            if (r3 == 0) goto L_0x00f2
            v.e r3 = (v.C0348e) r3
            java.lang.ref.WeakReference r4 = r3.f4777H0
            if (r4 == 0) goto L_0x00c8
            java.lang.Object r4 = r4.get()
            if (r4 == 0) goto L_0x00c8
            int r4 = r0.d()
            java.lang.ref.WeakReference r11 = r3.f4777H0
            java.lang.Object r11 = r11.get()
            v.c r11 = (v.C0346c) r11
            int r11 = r11.d()
            if (r4 <= r11) goto L_0x00cf
        L_0x00c8:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r0)
            r3.f4777H0 = r4
        L_0x00cf:
            java.lang.ref.WeakReference r4 = r3.f4779J0
            if (r4 == 0) goto L_0x00eb
            java.lang.Object r4 = r4.get()
            if (r4 == 0) goto L_0x00eb
            int r4 = r1.d()
            java.lang.ref.WeakReference r11 = r3.f4779J0
            java.lang.Object r11 = r11.get()
            v.c r11 = (v.C0346c) r11
            int r11 = r11.d()
            if (r4 <= r11) goto L_0x00f2
        L_0x00eb:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r1)
            r3.f4779J0 = r4
        L_0x00f2:
            boolean r3 = r15.f4753l
            if (r3 == 0) goto L_0x0164
            int r3 = r15.f4732Z
            r14.d(r9, r3)
            int r3 = r15.f4732Z
            int r4 = r15.f4728V
            int r3 = r3 + r4
            r14.d(r7, r3)
            java.util.HashSet r3 = r6.f4701a
            if (r3 != 0) goto L_0x0108
            goto L_0x0116
        L_0x0108:
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x0116
            int r3 = r15.f4732Z
            int r4 = r15.f4734a0
            int r3 = r3 + r4
            r14.d(r5, r3)
        L_0x0116:
            if (r28 == 0) goto L_0x0164
            v.d r3 = r15.f4726T
            if (r3 == 0) goto L_0x0164
            v.e r3 = (v.C0348e) r3
            java.lang.ref.WeakReference r4 = r3.f4776G0
            if (r4 == 0) goto L_0x013a
            java.lang.Object r4 = r4.get()
            if (r4 == 0) goto L_0x013a
            int r4 = r2.d()
            java.lang.ref.WeakReference r11 = r3.f4776G0
            java.lang.Object r11 = r11.get()
            v.c r11 = (v.C0346c) r11
            int r11 = r11.d()
            if (r4 <= r11) goto L_0x0141
        L_0x013a:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r2)
            r3.f4776G0 = r4
        L_0x0141:
            java.lang.ref.WeakReference r4 = r3.f4778I0
            if (r4 == 0) goto L_0x015d
            java.lang.Object r4 = r4.get()
            if (r4 == 0) goto L_0x015d
            int r4 = r8.d()
            java.lang.ref.WeakReference r11 = r3.f4778I0
            java.lang.Object r11 = r11.get()
            v.c r11 = (v.C0346c) r11
            int r11 = r11.d()
            if (r4 <= r11) goto L_0x0164
        L_0x015d:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r8)
            r3.f4778I0 = r4
        L_0x0164:
            boolean r3 = r15.f4751k
            if (r3 == 0) goto L_0x0172
            boolean r3 = r15.f4753l
            if (r3 == 0) goto L_0x0172
            r3 = 0
            r15.f4751k = r3
            r15.f4753l = r3
            return
        L_0x0172:
            boolean[] r4 = r15.f4742f
            if (r60 == 0) goto L_0x0205
            w.k r3 = r15.f4739d
            if (r3 == 0) goto L_0x0205
            w.m r11 = r15.e
            if (r11 == 0) goto L_0x0205
            r21 = r10
            w.f r10 = r3.f4899h
            r22 = r6
            boolean r6 = r10.f4878j
            if (r6 == 0) goto L_0x0203
            w.f r3 = r3.i
            boolean r3 = r3.f4878j
            if (r3 == 0) goto L_0x0203
            w.f r3 = r11.f4899h
            boolean r3 = r3.f4878j
            if (r3 == 0) goto L_0x0203
            w.f r3 = r11.i
            boolean r3 = r3.f4878j
            if (r3 == 0) goto L_0x0203
            int r0 = r10.f4876g
            r14.d(r13, r0)
            w.k r0 = r15.f4739d
            w.f r0 = r0.i
            int r0 = r0.f4876g
            r14.d(r12, r0)
            w.m r0 = r15.e
            w.f r0 = r0.f4899h
            int r0 = r0.f4876g
            r14.d(r9, r0)
            w.m r0 = r15.e
            w.f r0 = r0.i
            int r0 = r0.f4876g
            r14.d(r7, r0)
            w.m r0 = r15.e
            w.f r0 = r0.f4886k
            int r0 = r0.f4876g
            r14.d(r5, r0)
            v.d r0 = r15.f4726T
            if (r0 == 0) goto L_0x01fd
            if (r29 == 0) goto L_0x01e1
            r0 = 0
            boolean r1 = r4[r0]
            if (r1 == 0) goto L_0x01e1
            boolean r1 = r58.x()
            if (r1 != 0) goto L_0x01e1
            v.d r1 = r15.f4726T
            v.c r1 = r1.f4717K
            t.f r1 = r14.k(r1)
            r2 = 8
            r14.f(r1, r12, r0, r2)
        L_0x01e1:
            if (r28 == 0) goto L_0x01fd
            r0 = 1
            boolean r0 = r4[r0]
            if (r0 == 0) goto L_0x01fd
            boolean r0 = r58.y()
            if (r0 != 0) goto L_0x01fd
            v.d r0 = r15.f4726T
            v.c r0 = r0.f4718L
            t.f r0 = r14.k(r0)
            r1 = 8
            r3 = 0
            r14.f(r0, r7, r3, r1)
            goto L_0x01fe
        L_0x01fd:
            r3 = 0
        L_0x01fe:
            r15.f4751k = r3
            r15.f4753l = r3
            return
        L_0x0203:
            r3 = 0
            goto L_0x020a
        L_0x0205:
            r22 = r6
            r21 = r10
            goto L_0x0203
        L_0x020a:
            v.d r6 = r15.f4726T
            if (r6 == 0) goto L_0x0280
            boolean r6 = r15.w(r3)
            if (r6 == 0) goto L_0x021e
            v.d r6 = r15.f4726T
            v.e r6 = (v.C0348e) r6
            r6.R(r15, r3)
            r3 = 1
        L_0x021c:
            r6 = 1
            goto L_0x0223
        L_0x021e:
            boolean r3 = r58.x()
            goto L_0x021c
        L_0x0223:
            boolean r10 = r15.w(r6)
            if (r10 == 0) goto L_0x0232
            v.d r10 = r15.f4726T
            v.e r10 = (v.C0348e) r10
            r10.R(r15, r6)
            r6 = 1
            goto L_0x0236
        L_0x0232:
            boolean r6 = r58.y()
        L_0x0236:
            if (r3 != 0) goto L_0x0258
            if (r29 == 0) goto L_0x0258
            int r10 = r15.f4745g0
            r11 = 8
            if (r10 == r11) goto L_0x0258
            v.c r10 = r0.f4705f
            if (r10 != 0) goto L_0x0258
            v.c r10 = r1.f4705f
            if (r10 != 0) goto L_0x0258
            v.d r10 = r15.f4726T
            v.c r10 = r10.f4717K
            t.f r10 = r14.k(r10)
            r23 = r3
            r3 = 0
            r11 = 1
            r14.f(r10, r12, r3, r11)
            goto L_0x025a
        L_0x0258:
            r23 = r3
        L_0x025a:
            if (r6 != 0) goto L_0x027b
            if (r28 == 0) goto L_0x027b
            int r3 = r15.f4745g0
            r10 = 8
            if (r3 == r10) goto L_0x027b
            v.c r3 = r2.f4705f
            if (r3 != 0) goto L_0x027b
            v.c r3 = r8.f4705f
            if (r3 != 0) goto L_0x027b
            if (r22 != 0) goto L_0x027b
            v.d r3 = r15.f4726T
            v.c r3 = r3.f4718L
            t.f r3 = r14.k(r3)
            r10 = 1
            r11 = 0
            r14.f(r3, r7, r11, r10)
        L_0x027b:
            r30 = r6
            r31 = r23
            goto L_0x0284
        L_0x0280:
            r30 = 0
            r31 = 0
        L_0x0284:
            int r3 = r15.f4727U
            int r6 = r15.f4736b0
            if (r3 >= r6) goto L_0x028b
            goto L_0x028c
        L_0x028b:
            r6 = r3
        L_0x028c:
            int r10 = r15.f4728V
            int r11 = r15.f4738c0
            r23 = r9
            if (r10 >= r11) goto L_0x0295
            goto L_0x0296
        L_0x0295:
            r11 = r10
        L_0x0296:
            int[] r9 = r15.f4761p0
            r27 = r5
            r19 = 0
            r5 = r9[r19]
            r24 = r6
            r6 = 3
            r32 = r7
            r16 = 1
            if (r5 == r6) goto L_0x02aa
            r25 = 1
            goto L_0x02ac
        L_0x02aa:
            r25 = 0
        L_0x02ac:
            r7 = r9[r16]
            r26 = r11
            if (r7 == r6) goto L_0x02b4
            r6 = 1
            goto L_0x02b5
        L_0x02b4:
            r6 = 0
        L_0x02b5:
            int r11 = r15.f4730X
            r15.f4708A = r11
            r33 = r4
            float r4 = r15.f4729W
            r15.f4709B = r4
            r34 = r12
            int r12 = r15.f4763r
            r35 = r13
            int r13 = r15.f4764s
            r37 = 0
            int r37 = (r4 > r37 ? 1 : (r4 == r37 ? 0 : -1))
            if (r37 <= 0) goto L_0x03ed
            int r14 = r15.f4745g0
            r39 = r9
            r9 = 8
            if (r14 == r9) goto L_0x03ea
            r9 = 3
            if (r5 != r9) goto L_0x02db
            if (r12 != 0) goto L_0x02db
            r12 = 3
        L_0x02db:
            if (r7 != r9) goto L_0x02e0
            if (r13 != 0) goto L_0x02e0
            r13 = 3
        L_0x02e0:
            if (r5 != r9) goto L_0x0395
            if (r7 != r9) goto L_0x0395
            if (r12 != r9) goto L_0x0395
            if (r13 != r9) goto L_0x0395
            r9 = -1
            if (r11 != r9) goto L_0x0302
            if (r25 == 0) goto L_0x02f3
            if (r6 != 0) goto L_0x02f3
            r3 = 0
            r15.f4708A = r3
            goto L_0x0302
        L_0x02f3:
            if (r25 != 0) goto L_0x0302
            if (r6 == 0) goto L_0x0302
            r3 = 1
            r15.f4708A = r3
            if (r11 != r9) goto L_0x0302
            r3 = 1065353216(0x3f800000, float:1.0)
            float r14 = r3 / r4
            r15.f4709B = r14
        L_0x0302:
            int r3 = r15.f4708A
            if (r3 != 0) goto L_0x0314
            boolean r3 = r2.h()
            if (r3 == 0) goto L_0x0312
            boolean r3 = r8.h()
            if (r3 != 0) goto L_0x0314
        L_0x0312:
            r3 = 1
            goto L_0x0316
        L_0x0314:
            r3 = 1
            goto L_0x0319
        L_0x0316:
            r15.f4708A = r3
            goto L_0x032c
        L_0x0319:
            int r4 = r15.f4708A
            if (r4 != r3) goto L_0x032c
            boolean r3 = r0.h()
            if (r3 == 0) goto L_0x0329
            boolean r3 = r1.h()
            if (r3 != 0) goto L_0x032c
        L_0x0329:
            r3 = 0
            r15.f4708A = r3
        L_0x032c:
            int r3 = r15.f4708A
            r4 = -1
            if (r3 != r4) goto L_0x0370
            boolean r3 = r2.h()
            if (r3 == 0) goto L_0x0349
            boolean r3 = r8.h()
            if (r3 == 0) goto L_0x0349
            boolean r3 = r0.h()
            if (r3 == 0) goto L_0x0349
            boolean r3 = r1.h()
            if (r3 != 0) goto L_0x0370
        L_0x0349:
            boolean r2 = r2.h()
            if (r2 == 0) goto L_0x0359
            boolean r2 = r8.h()
            if (r2 == 0) goto L_0x0359
            r2 = 0
            r15.f4708A = r2
            goto L_0x0370
        L_0x0359:
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x0370
            boolean r0 = r1.h()
            if (r0 == 0) goto L_0x0370
            float r0 = r15.f4709B
            r1 = 1065353216(0x3f800000, float:1.0)
            float r14 = r1 / r0
            r15.f4709B = r14
            r0 = 1
            r15.f4708A = r0
        L_0x0370:
            int r0 = r15.f4708A
            r1 = -1
            if (r0 != r1) goto L_0x0392
            int r0 = r15.f4766u
            if (r0 <= 0) goto L_0x0381
            int r1 = r15.f4769x
            if (r1 != 0) goto L_0x0381
            r1 = 0
            r15.f4708A = r1
            goto L_0x0392
        L_0x0381:
            if (r0 != 0) goto L_0x0392
            int r0 = r15.f4769x
            if (r0 <= 0) goto L_0x0392
            float r0 = r15.f4709B
            r1 = 1065353216(0x3f800000, float:1.0)
            float r14 = r1 / r0
            r15.f4709B = r14
            r0 = 1
            r15.f4708A = r0
        L_0x0392:
            r14 = 1065353216(0x3f800000, float:1.0)
            goto L_0x03e1
        L_0x0395:
            r0 = 3
            if (r5 != r0) goto L_0x03b9
            if (r12 != r0) goto L_0x03b9
            r1 = 0
            r15.f4708A = r1
            float r1 = (float) r10
            float r4 = r4 * r1
            int r6 = (int) r4
            if (r7 == r0) goto L_0x03ae
            r41 = r13
            r40 = r26
            r14 = 1065353216(0x3f800000, float:1.0)
            r38 = 0
            r42 = 4
            goto L_0x03fa
        L_0x03ae:
            r42 = r12
            r41 = r13
            r40 = r26
            r14 = 1065353216(0x3f800000, float:1.0)
        L_0x03b6:
            r38 = 1
            goto L_0x03fa
        L_0x03b9:
            if (r7 != r0) goto L_0x0392
            if (r13 != r0) goto L_0x0392
            r1 = 1
            r15.f4708A = r1
            r1 = -1
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r11 != r1) goto L_0x03c9
            float r1 = r14 / r4
            r15.f4709B = r1
        L_0x03c9:
            float r1 = r15.f4709B
            float r2 = (float) r3
            float r1 = r1 * r2
            int r11 = (int) r1
            r40 = r11
            r42 = r12
            if (r5 == r0) goto L_0x03dc
            r6 = r24
            r38 = 0
            r41 = 4
            goto L_0x03fa
        L_0x03dc:
            r41 = r13
            r6 = r24
            goto L_0x03b6
        L_0x03e1:
            r42 = r12
            r41 = r13
            r6 = r24
            r40 = r26
            goto L_0x03b6
        L_0x03ea:
            r14 = 1065353216(0x3f800000, float:1.0)
            goto L_0x03f0
        L_0x03ed:
            r39 = r9
            goto L_0x03ea
        L_0x03f0:
            r42 = r12
            r41 = r13
            r6 = r24
            r40 = r26
            r38 = 0
        L_0x03fa:
            int[] r0 = r15.f4765t
            r1 = 0
            r0[r1] = r42
            r1 = 1
            r0[r1] = r41
            if (r38 == 0) goto L_0x040e
            int r0 = r15.f4708A
            r1 = -1
            if (r0 == 0) goto L_0x040b
            if (r0 != r1) goto L_0x040f
        L_0x040b:
            r37 = 1
            goto L_0x0411
        L_0x040e:
            r1 = -1
        L_0x040f:
            r37 = 0
        L_0x0411:
            if (r38 == 0) goto L_0x041e
            int r0 = r15.f4708A
            r2 = 1
            if (r0 == r2) goto L_0x041a
            if (r0 != r1) goto L_0x041e
        L_0x041a:
            r0 = 0
            r43 = 1
            goto L_0x0421
        L_0x041e:
            r0 = 0
            r43 = 0
        L_0x0421:
            r1 = r39[r0]
            r0 = 2
            if (r1 != r0) goto L_0x042c
            boolean r0 = r15 instanceof v.C0348e
            if (r0 == 0) goto L_0x042c
            r9 = 1
            goto L_0x042d
        L_0x042c:
            r9 = 0
        L_0x042d:
            if (r9 == 0) goto L_0x0431
            r13 = 0
            goto L_0x0432
        L_0x0431:
            r13 = r6
        L_0x0432:
            v.c r12 = r15.f4722P
            boolean r0 = r12.h()
            r1 = 1
            r44 = r0 ^ 1
            r0 = 0
            boolean r45 = r21[r0]
            boolean r46 = r21[r1]
            int r0 = r15.f4758o
            int[] r7 = r15.f4710C
            r47 = 0
            r4 = 2
            if (r0 == r4) goto L_0x04b4
            boolean r0 = r15.f4751k
            if (r0 != 0) goto L_0x04b4
            if (r60 == 0) goto L_0x045f
            w.k r0 = r15.f4739d
            if (r0 == 0) goto L_0x045f
            w.f r1 = r0.f4899h
            boolean r2 = r1.f4878j
            if (r2 == 0) goto L_0x045f
            w.f r0 = r0.i
            boolean r0 = r0.f4878j
            if (r0 != 0) goto L_0x0469
        L_0x045f:
            r6 = r59
            r1 = r34
            r5 = r35
            r3 = 4
            r11 = 8
            goto L_0x04c5
        L_0x0469:
            if (r60 == 0) goto L_0x04b2
            int r0 = r1.f4876g
            r6 = r59
            r5 = r35
            r3 = 4
            r6.d(r5, r0)
            w.k r0 = r15.f4739d
            w.f r0 = r0.i
            int r0 = r0.f4876g
            r1 = r34
            r6.d(r1, r0)
            v.d r0 = r15.f4726T
            if (r0 == 0) goto L_0x049e
            if (r29 == 0) goto L_0x049e
            r0 = 0
            boolean r2 = r33[r0]
            if (r2 == 0) goto L_0x049e
            boolean r2 = r58.x()
            if (r2 != 0) goto L_0x049e
            v.d r2 = r15.f4726T
            v.c r2 = r2.f4717K
            t.f r2 = r6.k(r2)
            r11 = 8
            r6.f(r2, r1, r0, r11)
        L_0x049e:
            r54 = r1
            r55 = r5
            r52 = r8
            r36 = r12
            r50 = r22
            r53 = r23
            r49 = r27
            r51 = r32
        L_0x04ae:
            r32 = r7
            goto L_0x055b
        L_0x04b2:
            r6 = r59
        L_0x04b4:
            r52 = r8
            r36 = r12
            r50 = r22
            r53 = r23
            r49 = r27
            r51 = r32
            r54 = r34
            r55 = r35
            goto L_0x04ae
        L_0x04c5:
            v.d r0 = r15.f4726T
            if (r0 == 0) goto L_0x04d2
            v.c r0 = r0.f4717K
            t.f r0 = r6.k(r0)
            r18 = r0
            goto L_0x04d4
        L_0x04d2:
            r18 = r47
        L_0x04d4:
            v.d r0 = r15.f4726T
            if (r0 == 0) goto L_0x04e2
            v.c r0 = r0.I
            t.f r0 = r6.k(r0)
            r19 = r0
        L_0x04e0:
            r0 = 0
            goto L_0x04e5
        L_0x04e2:
            r19 = r47
            goto L_0x04e0
        L_0x04e5:
            boolean r20 = r33[r0]
            r21 = r39[r0]
            int r2 = r15.f4731Y
            int r10 = r15.f4736b0
            r34 = r7[r0]
            r35 = r2
            float r2 = r15.f4740d0
            r17 = 1
            r0 = r39[r17]
            r3 = 3
            if (r0 != r3) goto L_0x04fd
            r48 = 1
            goto L_0x04ff
        L_0x04fd:
            r48 = 0
        L_0x04ff:
            int r0 = r15.f4766u
            r24 = r0
            int r0 = r15.f4767v
            r25 = r0
            float r0 = r15.f4768w
            r26 = r0
            v.c r0 = r15.I
            r16 = r10
            r10 = r0
            v.c r0 = r15.f4717K
            r3 = 0
            r11 = r0
            r0 = 1
            r17 = r35
            r35 = r2
            r2 = r0
            r0 = r58
            r36 = r1
            r1 = r59
            r3 = r29
            r4 = r28
            r49 = r27
            r27 = r5
            r5 = r20
            r50 = r22
            r6 = r19
            r51 = r32
            r32 = r7
            r7 = r18
            r52 = r8
            r8 = r21
            r53 = r23
            r54 = r36
            r36 = r12
            r12 = r17
            r55 = r27
            r14 = r16
            r15 = r34
            r16 = r35
            r17 = r37
            r18 = r48
            r19 = r31
            r20 = r30
            r21 = r45
            r22 = r42
            r23 = r41
            r27 = r44
            r0.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x055b:
            if (r60 == 0) goto L_0x05bf
            r15 = r58
            w.m r0 = r15.e
            if (r0 == 0) goto L_0x05b2
            w.f r1 = r0.f4899h
            boolean r2 = r1.f4878j
            if (r2 == 0) goto L_0x05b2
            w.f r0 = r0.i
            boolean r0 = r0.f4878j
            if (r0 == 0) goto L_0x05b2
            int r0 = r1.f4876g
            r14 = r59
            r13 = r53
            r14.d(r13, r0)
            w.m r0 = r15.e
            w.f r0 = r0.i
            int r0 = r0.f4876g
            r12 = r51
            r14.d(r12, r0)
            w.m r0 = r15.e
            w.f r0 = r0.f4886k
            int r0 = r0.f4876g
            r1 = r49
            r14.d(r1, r0)
            v.d r0 = r15.f4726T
            if (r0 == 0) goto L_0x05ac
            if (r30 != 0) goto L_0x05ac
            if (r28 == 0) goto L_0x05ac
            r9 = 1
            boolean r2 = r33[r9]
            if (r2 == 0) goto L_0x05a8
            v.c r0 = r0.f4718L
            t.f r0 = r14.k(r0)
            r2 = 8
            r8 = 0
            r14.f(r0, r12, r8, r2)
            goto L_0x05b0
        L_0x05a8:
            r2 = 8
            r8 = 0
            goto L_0x05b0
        L_0x05ac:
            r2 = 8
            r8 = 0
            r9 = 1
        L_0x05b0:
            r10 = 0
            goto L_0x05ce
        L_0x05b2:
            r14 = r59
            r1 = r49
            r12 = r51
            r13 = r53
            r2 = 8
            r8 = 0
            r9 = 1
            goto L_0x05cd
        L_0x05bf:
            r2 = 8
            r8 = 0
            r9 = 1
            r15 = r58
            r14 = r59
            r1 = r49
            r12 = r51
            r13 = r53
        L_0x05cd:
            r10 = 1
        L_0x05ce:
            int r0 = r15.f4760p
            r7 = 2
            if (r0 != r7) goto L_0x05d5
            r11 = 0
            goto L_0x05d6
        L_0x05d5:
            r11 = r10
        L_0x05d6:
            r6 = 5
            if (r11 == 0) goto L_0x06a7
            boolean r0 = r15.f4753l
            if (r0 != 0) goto L_0x06a7
            r0 = r39[r9]
            if (r0 != r7) goto L_0x05e8
            boolean r0 = r15 instanceof v.C0348e
            if (r0 == 0) goto L_0x05e8
            r16 = 1
            goto L_0x05ea
        L_0x05e8:
            r16 = 0
        L_0x05ea:
            if (r16 == 0) goto L_0x05ee
            r40 = 0
        L_0x05ee:
            v.d r0 = r15.f4726T
            if (r0 == 0) goto L_0x05fa
            v.c r0 = r0.f4718L
            t.f r0 = r14.k(r0)
            r5 = r0
            goto L_0x05fc
        L_0x05fa:
            r5 = r47
        L_0x05fc:
            v.d r0 = r15.f4726T
            if (r0 == 0) goto L_0x0608
            v.c r0 = r0.f4716J
            t.f r0 = r14.k(r0)
            r47 = r0
        L_0x0608:
            int r0 = r15.f4734a0
            if (r0 > 0) goto L_0x0610
            int r3 = r15.f4745g0
            if (r3 != r2) goto L_0x0643
        L_0x0610:
            r3 = r50
            v.c r4 = r3.f4705f
            if (r4 == 0) goto L_0x0634
            r14.e(r1, r13, r0, r2)
            v.c r0 = r3.f4705f
            t.f r0 = r14.k(r0)
            int r3 = r3.e()
            r14.e(r1, r0, r3, r2)
            if (r28 == 0) goto L_0x0631
            r0 = r52
            t.f r0 = r14.k(r0)
            r14.f(r5, r0, r8, r6)
        L_0x0631:
            r27 = 0
            goto L_0x0645
        L_0x0634:
            int r4 = r15.f4745g0
            if (r4 != r2) goto L_0x0640
            int r0 = r3.e()
            r14.e(r1, r13, r0, r2)
            goto L_0x0643
        L_0x0640:
            r14.e(r1, r13, r0, r2)
        L_0x0643:
            r27 = r44
        L_0x0645:
            boolean r17 = r33[r9]
            r18 = r39[r9]
            int r4 = r15.f4732Z
            int r3 = r15.f4738c0
            r19 = r32[r9]
            float r1 = r15.f4741e0
            r0 = r39[r8]
            r2 = 3
            if (r0 != r2) goto L_0x0659
            r20 = 1
            goto L_0x065b
        L_0x0659:
            r20 = 0
        L_0x065b:
            int r0 = r15.f4769x
            r24 = r0
            int r0 = r15.f4770y
            r25 = r0
            float r0 = r15.f4771z
            r26 = r0
            v.c r10 = r15.f4716J
            v.c r11 = r15.f4718L
            r0 = 0
            r2 = r0
            r0 = r58
            r21 = r1
            r1 = r59
            r22 = r3
            r3 = r28
            r23 = r4
            r4 = r29
            r28 = r5
            r5 = r17
            r6 = r47
            r7 = r28
            r8 = r18
            r9 = r16
            r56 = r12
            r12 = r23
            r57 = r13
            r13 = r40
            r14 = r22
            r15 = r19
            r16 = r21
            r17 = r43
            r18 = r20
            r19 = r30
            r20 = r31
            r21 = r46
            r22 = r41
            r23 = r42
            r0.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x06ab
        L_0x06a7:
            r56 = r12
            r57 = r13
        L_0x06ab:
            r0 = r58
            if (r38 == 0) goto L_0x070c
            int r1 = r0.f4708A
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 1
            if (r1 != r3) goto L_0x06e1
            float r1 = r0.f4709B
            t.b r3 = r59.l()
            t.a r4 = r3.f4647d
            r5 = r56
            r4.g(r5, r2)
            t.a r2 = r3.f4647d
            r4 = r57
            r6 = 1065353216(0x3f800000, float:1.0)
            r2.g(r4, r6)
            t.a r2 = r3.f4647d
            r7 = r54
            r2.g(r7, r1)
            t.a r2 = r3.f4647d
            float r1 = -r1
            r8 = r55
            r2.g(r8, r1)
            r1 = r59
            r1.c(r3)
            goto L_0x070e
        L_0x06e1:
            r1 = r59
            r7 = r54
            r8 = r55
            r5 = r56
            r4 = r57
            r6 = 1065353216(0x3f800000, float:1.0)
            float r3 = r0.f4709B
            t.b r9 = r59.l()
            t.a r10 = r9.f4647d
            r10.g(r7, r2)
            t.a r2 = r9.f4647d
            r2.g(r8, r6)
            t.a r2 = r9.f4647d
            r2.g(r5, r3)
            t.a r2 = r9.f4647d
            float r3 = -r3
            r2.g(r4, r3)
            r1.c(r9)
            goto L_0x070e
        L_0x070c:
            r1 = r59
        L_0x070e:
            boolean r2 = r36.h()
            if (r2 == 0) goto L_0x07c7
            r2 = r36
            v.c r3 = r2.f4705f
            v.d r3 = r3.f4704d
            float r4 = r0.f4711D
            r5 = 1119092736(0x42b40000, float:90.0)
            float r4 = r4 + r5
            double r4 = (double) r4
            double r4 = java.lang.Math.toRadians(r4)
            float r4 = (float) r4
            int r2 = r2.e()
            r5 = 2
            v.c r6 = r0.i(r5)
            t.f r6 = r1.k(r6)
            r7 = 3
            v.c r8 = r0.i(r7)
            t.f r8 = r1.k(r8)
            r9 = 4
            v.c r10 = r0.i(r9)
            t.f r10 = r1.k(r10)
            r11 = 5
            v.c r12 = r0.i(r11)
            t.f r12 = r1.k(r12)
            v.c r5 = r3.i(r5)
            t.f r5 = r1.k(r5)
            v.c r7 = r3.i(r7)
            t.f r7 = r1.k(r7)
            v.c r9 = r3.i(r9)
            t.f r9 = r1.k(r9)
            v.c r3 = r3.i(r11)
            t.f r3 = r1.k(r3)
            t.b r11 = r59.l()
            double r13 = (double) r4
            double r15 = java.lang.Math.sin(r13)
            r4 = r9
            r60 = r10
            double r9 = (double) r2
            r17 = r4
            r2 = r5
            double r4 = r15 * r9
            float r4 = (float) r4
            t.a r5 = r11.f4647d
            r15 = 1056964608(0x3f000000, float:0.5)
            r5.g(r7, r15)
            t.a r5 = r11.f4647d
            r5.g(r3, r15)
            t.a r3 = r11.f4647d
            r5 = -1090519040(0xffffffffbf000000, float:-0.5)
            r3.g(r8, r5)
            t.a r3 = r11.f4647d
            r3.g(r12, r5)
            float r3 = -r4
            r11.f4645b = r3
            r1.c(r11)
            t.b r3 = r59.l()
            double r7 = java.lang.Math.cos(r13)
            double r7 = r7 * r9
            float r4 = (float) r7
            t.a r7 = r3.f4647d
            r7.g(r2, r15)
            t.a r2 = r3.f4647d
            r7 = r17
            r2.g(r7, r15)
            t.a r2 = r3.f4647d
            r2.g(r6, r5)
            t.a r2 = r3.f4647d
            r6 = r60
            r2.g(r6, r5)
            float r2 = -r4
            r3.f4645b = r2
            r1.c(r3)
        L_0x07c7:
            r1 = 0
            r0.f4751k = r1
            r0.f4753l = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C0347d.b(t.c, boolean):void");
    }

    public boolean c() {
        if (this.f4745g0 != 8) {
            return true;
        }
        return false;
    }

    public final void f(C0346c cVar, C0346c cVar2, int i2) {
        if (cVar.f4704d == this) {
            e(cVar.e, cVar2.f4704d, cVar2.e, i2);
        }
    }

    public final void g(C0337c cVar) {
        cVar.k(this.I);
        cVar.k(this.f4716J);
        cVar.k(this.f4717K);
        cVar.k(this.f4718L);
        if (this.f4734a0 > 0) {
            cVar.k(this.f4719M);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [w.m, w.o] */
    /* JADX WARNING: type inference failed for: r0v3, types: [w.k, w.o] */
    public final void h() {
        if (this.f4739d == null) {
            ? oVar = new o(this);
            oVar.f4899h.e = 4;
            oVar.i.e = 5;
            oVar.f4897f = 0;
            this.f4739d = oVar;
        }
        if (this.e == null) {
            ? oVar2 = new o(this);
            f fVar = new f(oVar2);
            oVar2.f4886k = fVar;
            oVar2.f4887l = null;
            oVar2.f4899h.e = 6;
            oVar2.i.e = 7;
            fVar.e = 8;
            oVar2.f4897f = 1;
            this.e = oVar2;
        }
    }

    public final int j(int i2) {
        int[] iArr = this.f4761p0;
        if (i2 == 0) {
            return iArr[0];
        }
        if (i2 == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.f4745g0 == 8) {
            return 0;
        }
        return this.f4728V;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.f4718L;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final v.C0347d l(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            v.c r3 = r2.f4717K
            v.c r0 = r3.f4705f
            if (r0 == 0) goto L_0x001f
            v.c r1 = r0.f4705f
            if (r1 != r3) goto L_0x001f
            v.d r3 = r0.f4704d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            v.c r3 = r2.f4718L
            v.c r0 = r3.f4705f
            if (r0 == 0) goto L_0x001f
            v.c r1 = r0.f4705f
            if (r1 != r3) goto L_0x001f
            v.d r3 = r0.f4704d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C0347d.l(int):v.d");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.f4716J;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final v.C0347d m(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            v.c r3 = r2.I
            v.c r0 = r3.f4705f
            if (r0 == 0) goto L_0x001f
            v.c r1 = r0.f4705f
            if (r1 != r3) goto L_0x001f
            v.d r3 = r0.f4704d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            v.c r3 = r2.f4716J
            v.c r0 = r3.f4705f
            if (r0 == 0) goto L_0x001f
            v.c r1 = r0.f4705f
            if (r1 != r3) goto L_0x001f
            v.d r3 = r0.f4704d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C0347d.m(int):v.d");
    }

    public final int q() {
        if (this.f4745g0 == 8) {
            return 0;
        }
        return this.f4727U;
    }

    public final int r() {
        C0347d dVar = this.f4726T;
        if (dVar == null || !(dVar instanceof C0348e)) {
            return this.f4731Y;
        }
        return ((C0348e) dVar).f4789x0 + this.f4731Y;
    }

    public final int s() {
        C0347d dVar = this.f4726T;
        if (dVar == null || !(dVar instanceof C0348e)) {
            return this.f4732Z;
        }
        return ((C0348e) dVar).f4790y0 + this.f4732Z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        if (this.f4747h0 != null) {
            str = "id: " + this.f4747h0 + " ";
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f4731Y);
        sb.append(", ");
        sb.append(this.f4732Z);
        sb.append(") - (");
        sb.append(this.f4727U);
        sb.append(" x ");
        sb.append(this.f4728V);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r4 = r0[r4 + 1];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean w(int r4) {
        /*
            r3 = this;
            int r4 = r4 * 2
            v.c[] r0 = r3.f4723Q
            r1 = r0[r4]
            v.c r2 = r1.f4705f
            if (r2 == 0) goto L_0x001b
            v.c r2 = r2.f4705f
            if (r2 == r1) goto L_0x001b
            r1 = 1
            int r4 = r4 + r1
            r4 = r0[r4]
            v.c r0 = r4.f4705f
            if (r0 == 0) goto L_0x001b
            v.c r0 = r0.f4705f
            if (r0 != r4) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v.C0347d.w(int):boolean");
    }

    public final boolean x() {
        C0346c cVar = this.I;
        C0346c cVar2 = cVar.f4705f;
        if (cVar2 != null && cVar2.f4705f == cVar) {
            return true;
        }
        C0346c cVar3 = this.f4717K;
        C0346c cVar4 = cVar3.f4705f;
        if (cVar4 == null || cVar4.f4705f != cVar3) {
            return false;
        }
        return true;
    }

    public final boolean y() {
        C0346c cVar = this.f4716J;
        C0346c cVar2 = cVar.f4705f;
        if (cVar2 != null && cVar2.f4705f == cVar) {
            return true;
        }
        C0346c cVar3 = this.f4718L;
        C0346c cVar4 = cVar3.f4705f;
        if (cVar4 == null || cVar4.f4705f != cVar3) {
            return false;
        }
        return true;
    }

    public final boolean z() {
        if (!this.f4744g || this.f4745g0 == 8) {
            return false;
        }
        return true;
    }

    public C0346c i(int i2) {
        switch (C0339e.a(i2)) {
            case 0:
                return null;
            case 1:
                return this.I;
            case 2:
                return this.f4716J;
            case 3:
                return this.f4717K;
            case 4:
                return this.f4718L;
            case 5:
                return this.f4719M;
            case 6:
                return this.f4722P;
            case 7:
                return this.f4720N;
            case 8:
                return this.f4721O;
            default:
                throw new AssertionError(E.i(i2));
        }
    }

    public final void v(int i2, int i3, int i4, int i5, C0347d dVar) {
        i(i2).b(dVar.i(i3), i4, i5, true);
    }
}
