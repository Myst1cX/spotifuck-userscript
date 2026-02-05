package h;

import N.r;
import android.view.Window;
import n.C0197l;
import n.C0208w;
import o.C0287k0;

public final class u implements r, C0287k0, C0208w {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f3038f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ D f3039g;

    public /* synthetic */ u(D d2, int i) {
        this.f3038f = i;
        this.f3039g = d2;
    }

    public void b(C0197l lVar, boolean z2) {
        boolean z3;
        int i;
        C c2;
        switch (this.f3038f) {
            case 2:
                this.f3039g.p(lVar);
                return;
            default:
                C0197l k2 = lVar.k();
                int i2 = 0;
                if (k2 != lVar) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    lVar = k2;
                }
                D d2 = this.f3039g;
                C[] cArr = d2.f2867R;
                if (cArr != null) {
                    i = cArr.length;
                } else {
                    i = 0;
                }
                while (true) {
                    if (i2 >= i) {
                        c2 = null;
                    } else {
                        c2 = cArr[i2];
                        if (c2 == null || c2.f2840h != lVar) {
                            i2++;
                        }
                    }
                }
                if (c2 == null) {
                    return;
                }
                if (z3) {
                    d2.o(c2.f2834a, c2, k2);
                    d2.q(c2, true);
                    return;
                }
                d2.q(c2, z2);
                return;
        }
    }

    public boolean h(C0197l lVar) {
        Window.Callback callback;
        switch (this.f3038f) {
            case 2:
                Window.Callback callback2 = this.f3039g.f2890q.getCallback();
                if (callback2 == null) {
                    return true;
                }
                callback2.onMenuOpened(108, lVar);
                return true;
            default:
                if (lVar != lVar.k()) {
                    return true;
                }
                D d2 = this.f3039g;
                if (!d2.f2861L || (callback = d2.f2890q.getCallback()) == null || d2.f2872W) {
                    return true;
                }
                callback.onMenuOpened(108, lVar);
                return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ff, code lost:
        r2 = (android.view.ViewGroup.MarginLayoutParams) r2.getLayoutParams();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public N.w0 l(android.view.View r19, N.w0 r20) {
        /*
            r18 = this;
            r0 = r19
            r1 = r20
            r2 = 2
            r3 = 1
            int r5 = r20.d()
            r6 = r18
            h.D r7 = r6.f3039g
            r7.getClass()
            int r8 = r20.d()
            androidx.appcompat.widget.ActionBarContextView r9 = r7.f2851A
            r10 = 29
            if (r9 == 0) goto L_0x016b
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            boolean r9 = r9 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r9 == 0) goto L_0x016b
            androidx.appcompat.widget.ActionBarContextView r9 = r7.f2851A
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            androidx.appcompat.widget.ActionBarContextView r12 = r7.f2851A
            boolean r12 = r12.isShown()
            if (r12 == 0) goto L_0x0155
            android.graphics.Rect r12 = r7.f2884i0
            if (r12 != 0) goto L_0x0045
            android.graphics.Rect r12 = new android.graphics.Rect
            r12.<init>()
            r7.f2884i0 = r12
            android.graphics.Rect r12 = new android.graphics.Rect
            r12.<init>()
            r7.f2885j0 = r12
        L_0x0045:
            android.graphics.Rect r12 = r7.f2884i0
            android.graphics.Rect r13 = r7.f2885j0
            int r14 = r20.b()
            int r15 = r20.d()
            int r11 = r20.c()
            int r4 = r20.a()
            r12.set(r14, r15, r11, r4)
            android.view.ViewGroup r4 = r7.f2857G
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 < r10) goto L_0x0068
            boolean r2 = o.n1.f4272a
            o.m1.a(r4, r12, r13)
            goto L_0x009f
        L_0x0068:
            boolean r11 = o.n1.f4272a
            if (r11 != 0) goto L_0x008f
            o.n1.f4272a = r3
            java.lang.Class<android.view.View> r11 = android.view.View.class
            java.lang.String r14 = "computeFitSystemWindows"
            java.lang.Class[] r15 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x008e }
            java.lang.Class<android.graphics.Rect> r17 = android.graphics.Rect.class
            r16 = 0
            r15[r16] = r17     // Catch:{ NoSuchMethodException -> 0x008e }
            r15[r3] = r17     // Catch:{ NoSuchMethodException -> 0x008e }
            java.lang.reflect.Method r11 = r11.getDeclaredMethod(r14, r15)     // Catch:{ NoSuchMethodException -> 0x008e }
            o.n1.f4273b = r11     // Catch:{ NoSuchMethodException -> 0x008e }
            boolean r11 = r11.isAccessible()     // Catch:{ NoSuchMethodException -> 0x008e }
            if (r11 != 0) goto L_0x008f
            java.lang.reflect.Method r11 = o.n1.f4273b     // Catch:{ NoSuchMethodException -> 0x008e }
            r11.setAccessible(r3)     // Catch:{ NoSuchMethodException -> 0x008e }
            goto L_0x008f
        L_0x008e:
        L_0x008f:
            java.lang.reflect.Method r11 = o.n1.f4273b
            if (r11 == 0) goto L_0x009f
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x009e }
            r14 = 0
            r2[r14] = r12     // Catch:{ Exception -> 0x009e }
            r2[r3] = r13     // Catch:{ Exception -> 0x009e }
            r11.invoke(r4, r2)     // Catch:{ Exception -> 0x009e }
            goto L_0x009f
        L_0x009e:
        L_0x009f:
            int r2 = r12.top
            int r4 = r12.left
            int r11 = r12.right
            android.view.ViewGroup r12 = r7.f2857G
            N.w0 r12 = N.Q.h(r12)
            if (r12 != 0) goto L_0x00af
            r13 = 0
            goto L_0x00b3
        L_0x00af:
            int r13 = r12.b()
        L_0x00b3:
            if (r12 != 0) goto L_0x00b7
            r12 = 0
            goto L_0x00bb
        L_0x00b7:
            int r12 = r12.c()
        L_0x00bb:
            int r14 = r9.topMargin
            if (r14 != r2) goto L_0x00ca
            int r14 = r9.leftMargin
            if (r14 != r4) goto L_0x00ca
            int r14 = r9.rightMargin
            if (r14 == r11) goto L_0x00c8
            goto L_0x00ca
        L_0x00c8:
            r4 = 0
            goto L_0x00d1
        L_0x00ca:
            r9.topMargin = r2
            r9.leftMargin = r4
            r9.rightMargin = r11
            r4 = 1
        L_0x00d1:
            android.content.Context r11 = r7.f2889p
            if (r2 <= 0) goto L_0x00fb
            android.view.View r2 = r7.I
            if (r2 != 0) goto L_0x00fb
            android.view.View r2 = new android.view.View
            r2.<init>(r11)
            r7.I = r2
            r14 = 8
            r2.setVisibility(r14)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            int r15 = r9.topMargin
            r3 = 51
            r14 = -1
            r2.<init>(r14, r15, r3)
            r2.leftMargin = r13
            r2.rightMargin = r12
            android.view.ViewGroup r3 = r7.f2857G
            android.view.View r12 = r7.I
            r3.addView(r12, r14, r2)
            goto L_0x011e
        L_0x00fb:
            android.view.View r2 = r7.I
            if (r2 == 0) goto L_0x011e
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r3 = r2.height
            int r14 = r9.topMargin
            if (r3 != r14) goto L_0x0113
            int r3 = r2.leftMargin
            if (r3 != r13) goto L_0x0113
            int r3 = r2.rightMargin
            if (r3 == r12) goto L_0x011e
        L_0x0113:
            r2.height = r14
            r2.leftMargin = r13
            r2.rightMargin = r12
            android.view.View r3 = r7.I
            r3.setLayoutParams(r2)
        L_0x011e:
            android.view.View r2 = r7.I
            if (r2 == 0) goto L_0x0124
            r3 = 1
            goto L_0x0125
        L_0x0124:
            r3 = 0
        L_0x0125:
            if (r3 == 0) goto L_0x0149
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L_0x0149
            android.view.View r2 = r7.I
            int r12 = r2.getWindowSystemUiVisibility()
            r12 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x013f
            r12 = 2131099654(0x7f060006, float:1.7811667E38)
            int r11 = p0.C0320a.F(r11, r12)
            goto L_0x0146
        L_0x013f:
            r12 = 2131099653(0x7f060005, float:1.7811665E38)
            int r11 = p0.C0320a.F(r11, r12)
        L_0x0146:
            r2.setBackgroundColor(r11)
        L_0x0149:
            boolean r2 = r7.f2863N
            if (r2 != 0) goto L_0x0150
            if (r3 == 0) goto L_0x0150
            r8 = 0
        L_0x0150:
            r16 = r3
            r3 = r4
            r2 = 0
            goto L_0x0163
        L_0x0155:
            int r2 = r9.topMargin
            if (r2 == 0) goto L_0x0160
            r2 = 0
            r9.topMargin = r2
            r3 = 1
        L_0x015d:
            r16 = 0
            goto L_0x0163
        L_0x0160:
            r2 = 0
            r3 = 0
            goto L_0x015d
        L_0x0163:
            if (r3 == 0) goto L_0x016e
            androidx.appcompat.widget.ActionBarContextView r3 = r7.f2851A
            r3.setLayoutParams(r9)
            goto L_0x016e
        L_0x016b:
            r2 = 0
            r16 = 0
        L_0x016e:
            android.view.View r3 = r7.I
            if (r3 == 0) goto L_0x017b
            if (r16 == 0) goto L_0x0176
            r4 = 0
            goto L_0x0178
        L_0x0176:
            r4 = 8
        L_0x0178:
            r3.setVisibility(r4)
        L_0x017b:
            if (r5 == r8) goto L_0x01ad
            int r2 = r20.b()
            int r3 = r20.c()
            int r4 = r20.a()
            int r5 = android.os.Build.VERSION.SDK_INT
            r7 = 30
            if (r5 < r7) goto L_0x0195
            N.n0 r5 = new N.n0
            r5.<init>(r1)
            goto L_0x01a2
        L_0x0195:
            if (r5 < r10) goto L_0x019d
            N.m0 r5 = new N.m0
            r5.<init>(r1)
            goto L_0x01a2
        L_0x019d:
            N.l0 r5 = new N.l0
            r5.<init>(r1)
        L_0x01a2:
            F.c r1 = F.c.b(r2, r8, r3, r4)
            r5.g(r1)
            N.w0 r1 = r5.b()
        L_0x01ad:
            java.util.WeakHashMap r2 = N.Q.f509a
            android.view.WindowInsets r2 = r1.f()
            if (r2 == 0) goto L_0x01c3
            android.view.WindowInsets r3 = N.D.b(r0, r2)
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x01c3
            N.w0 r1 = N.w0.g(r0, r3)
        L_0x01c3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h.u.l(android.view.View, N.w0):N.w0");
    }
}
