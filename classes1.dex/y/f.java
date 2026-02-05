package y;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f5016a;

    /* renamed from: b  reason: collision with root package name */
    public int f5017b;

    /* renamed from: c  reason: collision with root package name */
    public int f5018c;

    /* renamed from: d  reason: collision with root package name */
    public int f5019d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f5020f;

    /* renamed from: g  reason: collision with root package name */
    public int f5021g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f5022h;

    public static boolean a(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824 && ((mode == Integer.MIN_VALUE || mode == 0) && i3 == size)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ed, code lost:
        if (r10 == 2) goto L_0x00f1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(v.C0347d r18, w.C0351b r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            if (r1 != 0) goto L_0x0009
            return
        L_0x0009:
            int r3 = r1.f4745g0
            r4 = 8
            r5 = 0
            if (r3 != r4) goto L_0x0017
            r2.e = r5
            r2.f4858f = r5
            r2.f4859g = r5
            return
        L_0x0017:
            v.d r3 = r1.f4726T
            if (r3 != 0) goto L_0x001c
            return
        L_0x001c:
            y.s r3 = androidx.constraintlayout.widget.ConstraintLayout.f1420u
            androidx.constraintlayout.widget.ConstraintLayout r3 = r0.f5022h
            r3.getClass()
            int r4 = r2.f4854a
            int r6 = r2.f4855b
            int r7 = r2.f4856c
            int r8 = r2.f4857d
            int r9 = r0.f5017b
            int r10 = r0.f5018c
            int r9 = r9 + r10
            int r10 = r0.f5019d
            android.view.View r11 = r1.f4743f0
            int r12 = t.C0339e.a(r4)
            v.c r13 = r1.f4717K
            v.c r14 = r1.I
            r15 = 1
            r5 = 2
            if (r12 == 0) goto L_0x00a8
            if (r12 == r15) goto L_0x009e
            if (r12 == r5) goto L_0x005e
            r7 = 3
            if (r12 == r7) goto L_0x004a
            r7 = 0
            goto L_0x00af
        L_0x004a:
            int r7 = r0.f5020f
            if (r14 == 0) goto L_0x0051
            int r12 = r14.f4706g
            goto L_0x0052
        L_0x0051:
            r12 = 0
        L_0x0052:
            if (r13 == 0) goto L_0x0057
            int r5 = r13.f4706g
            int r12 = r12 + r5
        L_0x0057:
            int r10 = r10 + r12
            r5 = -1
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r10, r5)
            goto L_0x00af
        L_0x005e:
            int r5 = r0.f5020f
            r7 = -2
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r10, r7)
            int r7 = r1.f4763r
            if (r7 != r15) goto L_0x006b
            r7 = 1
            goto L_0x006c
        L_0x006b:
            r7 = 0
        L_0x006c:
            int r10 = r2.f4861j
            r12 = 2
            if (r10 == r15) goto L_0x0073
            if (r10 != r12) goto L_0x0091
        L_0x0073:
            int r10 = r11.getMeasuredHeight()
            int r15 = r18.k()
            if (r10 != r15) goto L_0x007f
            r10 = 1
            goto L_0x0080
        L_0x007f:
            r10 = 0
        L_0x0080:
            int r15 = r2.f4861j
            if (r15 == r12) goto L_0x0093
            if (r7 == 0) goto L_0x0093
            if (r7 == 0) goto L_0x008a
            if (r10 != 0) goto L_0x0093
        L_0x008a:
            boolean r7 = r18.A()
            if (r7 == 0) goto L_0x0091
            goto L_0x0093
        L_0x0091:
            r7 = r5
            goto L_0x00af
        L_0x0093:
            int r5 = r18.q()
            r12 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r12)
            goto L_0x0091
        L_0x009e:
            r12 = 1073741824(0x40000000, float:2.0)
            int r5 = r0.f5020f
            r7 = -2
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r10, r7)
            goto L_0x0091
        L_0x00a8:
            r12 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r12)
            goto L_0x0091
        L_0x00af:
            int r5 = t.C0339e.a(r6)
            if (r5 == 0) goto L_0x0123
            r10 = 1
            if (r5 == r10) goto L_0x0119
            r8 = 2
            if (r5 == r8) goto L_0x00d9
            r8 = 3
            if (r5 == r8) goto L_0x00c1
            r5 = 0
            goto L_0x0129
        L_0x00c1:
            int r5 = r0.f5021g
            if (r14 == 0) goto L_0x00ca
            v.c r8 = r1.f4716J
            int r8 = r8.f4706g
            goto L_0x00cb
        L_0x00ca:
            r8 = 0
        L_0x00cb:
            if (r13 == 0) goto L_0x00d2
            v.c r10 = r1.f4718L
            int r10 = r10.f4706g
            int r8 = r8 + r10
        L_0x00d2:
            int r9 = r9 + r8
            r8 = -1
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r9, r8)
            goto L_0x0129
        L_0x00d9:
            int r5 = r0.f5021g
            r8 = -2
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r9, r8)
            int r8 = r1.f4764s
            r9 = 1
            if (r8 != r9) goto L_0x00e7
            r8 = 1
            goto L_0x00e8
        L_0x00e7:
            r8 = 0
        L_0x00e8:
            int r10 = r2.f4861j
            if (r10 == r9) goto L_0x00f0
            r9 = 2
            if (r10 != r9) goto L_0x0129
            goto L_0x00f1
        L_0x00f0:
            r9 = 2
        L_0x00f1:
            int r10 = r11.getMeasuredWidth()
            int r12 = r18.q()
            if (r10 != r12) goto L_0x00fd
            r10 = 1
            goto L_0x00fe
        L_0x00fd:
            r10 = 0
        L_0x00fe:
            int r12 = r2.f4861j
            if (r12 == r9) goto L_0x010e
            if (r8 == 0) goto L_0x010e
            if (r8 == 0) goto L_0x0108
            if (r10 != 0) goto L_0x010e
        L_0x0108:
            boolean r8 = r18.B()
            if (r8 == 0) goto L_0x0129
        L_0x010e:
            int r5 = r18.k()
            r10 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r10)
            goto L_0x0129
        L_0x0119:
            r10 = 1073741824(0x40000000, float:2.0)
            int r5 = r0.f5021g
            r8 = -2
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r9, r8)
            goto L_0x0129
        L_0x0123:
            r10 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r10)
        L_0x0129:
            v.d r8 = r1.f4726T
            v.e r8 = (v.C0348e) r8
            if (r8 == 0) goto L_0x0198
            int r9 = r3.f1428n
            r10 = 256(0x100, float:3.59E-43)
            boolean r9 = v.j.c(r9, r10)
            if (r9 == 0) goto L_0x0198
            int r9 = r11.getMeasuredWidth()
            int r10 = r18.q()
            if (r9 != r10) goto L_0x0198
            int r9 = r11.getMeasuredWidth()
            int r10 = r8.q()
            if (r9 >= r10) goto L_0x0198
            int r9 = r11.getMeasuredHeight()
            int r10 = r18.k()
            if (r9 != r10) goto L_0x0198
            int r9 = r11.getMeasuredHeight()
            int r8 = r8.k()
            if (r9 >= r8) goto L_0x0198
            int r8 = r11.getBaseline()
            int r9 = r1.f4734a0
            if (r8 != r9) goto L_0x0198
            boolean r8 = r18.z()
            if (r8 != 0) goto L_0x0198
            int r8 = r1.f4714G
            int r9 = r18.q()
            boolean r8 = a(r8, r7, r9)
            if (r8 == 0) goto L_0x0198
            int r8 = r1.f4715H
            int r9 = r18.k()
            boolean r8 = a(r8, r5, r9)
            if (r8 == 0) goto L_0x0198
            int r3 = r18.q()
            r2.e = r3
            int r3 = r18.k()
            r2.f4858f = r3
            int r1 = r1.f4734a0
            r2.f4859g = r1
            return
        L_0x0198:
            r8 = 3
            if (r4 != r8) goto L_0x019d
            r9 = 1
            goto L_0x019e
        L_0x019d:
            r9 = 0
        L_0x019e:
            if (r6 != r8) goto L_0x01a2
            r8 = 1
            goto L_0x01a3
        L_0x01a2:
            r8 = 0
        L_0x01a3:
            r10 = 4
            r12 = 1
            if (r6 == r10) goto L_0x01ac
            if (r6 != r12) goto L_0x01aa
            goto L_0x01ac
        L_0x01aa:
            r6 = 0
            goto L_0x01ad
        L_0x01ac:
            r6 = 1
        L_0x01ad:
            if (r4 == r10) goto L_0x01b4
            if (r4 != r12) goto L_0x01b2
            goto L_0x01b4
        L_0x01b2:
            r10 = 0
            goto L_0x01b5
        L_0x01b4:
            r10 = 1
        L_0x01b5:
            r4 = 0
            if (r9 == 0) goto L_0x01c0
            float r12 = r1.f4729W
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x01c0
            r12 = 1
            goto L_0x01c1
        L_0x01c0:
            r12 = 0
        L_0x01c1:
            if (r8 == 0) goto L_0x01cb
            float r13 = r1.f4729W
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x01cb
            r4 = 1
            goto L_0x01cc
        L_0x01cb:
            r4 = 0
        L_0x01cc:
            if (r11 != 0) goto L_0x01cf
            return
        L_0x01cf:
            android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
            y.e r13 = (y.e) r13
            int r14 = r2.f4861j
            r15 = 1
            if (r14 == r15) goto L_0x01f1
            r15 = 2
            if (r14 == r15) goto L_0x01f1
            if (r9 == 0) goto L_0x01f1
            int r9 = r1.f4763r
            if (r9 != 0) goto L_0x01f1
            if (r8 == 0) goto L_0x01f1
            int r8 = r1.f4764s
            if (r8 == 0) goto L_0x01ea
            goto L_0x01f1
        L_0x01ea:
            r0 = 0
            r3 = -1
            r8 = 0
            r10 = 0
            r15 = 0
            goto L_0x0296
        L_0x01f1:
            boolean r8 = r11 instanceof y.t
            if (r8 == 0) goto L_0x0203
            boolean r8 = r1 instanceof v.g
            if (r8 == 0) goto L_0x0203
            r8 = r1
            v.g r8 = (v.g) r8
            r9 = r11
            y.t r9 = (y.t) r9
            r9.j(r8, r7, r5)
            goto L_0x0206
        L_0x0203:
            r11.measure(r7, r5)
        L_0x0206:
            r1.f4714G = r7
            r1.f4715H = r5
            r8 = 0
            r1.f4744g = r8
            int r8 = r11.getMeasuredWidth()
            int r9 = r11.getMeasuredHeight()
            int r14 = r11.getBaseline()
            int r15 = r1.f4766u
            if (r15 <= 0) goto L_0x0222
            int r15 = java.lang.Math.max(r15, r8)
            goto L_0x0223
        L_0x0222:
            r15 = r8
        L_0x0223:
            int r0 = r1.f4767v
            if (r0 <= 0) goto L_0x022b
            int r15 = java.lang.Math.min(r0, r15)
        L_0x022b:
            int r0 = r1.f4769x
            if (r0 <= 0) goto L_0x0236
            int r0 = java.lang.Math.max(r0, r9)
            r16 = r5
            goto L_0x0239
        L_0x0236:
            r16 = r5
            r0 = r9
        L_0x0239:
            int r5 = r1.f4770y
            if (r5 <= 0) goto L_0x0241
            int r0 = java.lang.Math.min(r5, r0)
        L_0x0241:
            int r3 = r3.f1428n
            r5 = 1
            boolean r3 = v.j.c(r3, r5)
            if (r3 != 0) goto L_0x0263
            r3 = 1056964608(0x3f000000, float:0.5)
            if (r12 == 0) goto L_0x0259
            if (r6 == 0) goto L_0x0259
            float r4 = r1.f4729W
            float r5 = (float) r0
            float r5 = r5 * r4
            float r5 = r5 + r3
            int r3 = (int) r5
            r15 = r3
            goto L_0x0263
        L_0x0259:
            if (r4 == 0) goto L_0x0263
            if (r10 == 0) goto L_0x0263
            float r0 = r1.f4729W
            float r4 = (float) r15
            float r4 = r4 / r0
            float r4 = r4 + r3
            int r0 = (int) r4
        L_0x0263:
            if (r8 != r15) goto L_0x026c
            if (r9 == r0) goto L_0x0268
            goto L_0x026c
        L_0x0268:
            r8 = r14
            r3 = -1
            r10 = 0
            goto L_0x0296
        L_0x026c:
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == r15) goto L_0x0274
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r3)
        L_0x0274:
            if (r9 == r0) goto L_0x027b
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x027d
        L_0x027b:
            r5 = r16
        L_0x027d:
            r11.measure(r7, r5)
            r1.f4714G = r7
            r1.f4715H = r5
            r10 = 0
            r1.f4744g = r10
            int r8 = r11.getMeasuredWidth()
            int r0 = r11.getMeasuredHeight()
            int r3 = r11.getBaseline()
            r15 = r8
            r8 = r3
            r3 = -1
        L_0x0296:
            if (r8 == r3) goto L_0x029a
            r3 = 1
            goto L_0x029b
        L_0x029a:
            r3 = 0
        L_0x029b:
            int r4 = r2.f4856c
            if (r15 != r4) goto L_0x02a6
            int r4 = r2.f4857d
            if (r0 == r4) goto L_0x02a4
            goto L_0x02a6
        L_0x02a4:
            r5 = 0
            goto L_0x02a7
        L_0x02a6:
            r5 = 1
        L_0x02a7:
            r2.i = r5
            boolean r4 = r13.f4982c0
            if (r4 == 0) goto L_0x02af
            r10 = 1
            goto L_0x02b0
        L_0x02af:
            r10 = r3
        L_0x02b0:
            if (r10 == 0) goto L_0x02bc
            r3 = -1
            if (r8 == r3) goto L_0x02bc
            int r1 = r1.f4734a0
            if (r1 == r8) goto L_0x02bc
            r1 = 1
            r2.i = r1
        L_0x02bc:
            r2.e = r15
            r2.f4858f = r0
            r2.f4860h = r10
            r2.f4859g = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y.f.b(v.d, w.b):void");
    }

    public f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f5022h = constraintLayout;
        this.f5016a = constraintLayout2;
    }
}
