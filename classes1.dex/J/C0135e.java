package j;

import G.g;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: j.e  reason: case insensitive filesystem */
public final class C0135e extends C0137g implements g {

    /* renamed from: s  reason: collision with root package name */
    public C0132b f3240s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3241t;

    /* renamed from: u  reason: collision with root package name */
    public C0132b f3242u;

    /* renamed from: v  reason: collision with root package name */
    public T0.g f3243v;

    /* renamed from: w  reason: collision with root package name */
    public int f3244w = -1;

    /* renamed from: x  reason: collision with root package name */
    public int f3245x = -1;

    /* renamed from: y  reason: collision with root package name */
    public boolean f3246y;

    public final boolean isStateful() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0276, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static j.C0135e e(android.content.Context r20, android.content.res.Resources r21, android.content.res.XmlResourceParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            java.lang.String r5 = r22.getName()
            java.lang.String r6 = "animated-selector"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0277
            j.e r5 = new j.e
            r6 = 0
            r5.<init>(r6, r6)
            int[] r7 = k.C0165b.f3559a
            android.content.res.TypedArray r7 = E.b.h(r1, r4, r3, r7)
            r8 = 1
            boolean r9 = r7.getBoolean(r8, r8)
            r5.setVisible(r9, r8)
            j.b r9 = r5.f3242u
            int r10 = r9.f3214d
            int r11 = k.C0164a.b(r7)
            r10 = r10 | r11
            r9.f3214d = r10
            boolean r10 = r9.i
            r11 = 2
            boolean r10 = r7.getBoolean(r11, r10)
            r9.i = r10
            boolean r10 = r9.f3220l
            r12 = 3
            boolean r10 = r7.getBoolean(r12, r10)
            r9.f3220l = r10
            int r10 = r9.f3233y
            r13 = 4
            int r10 = r7.getInt(r13, r10)
            r9.f3233y = r10
            r10 = 5
            int r14 = r9.f3234z
            int r10 = r7.getInt(r10, r14)
            r9.f3234z = r10
            boolean r9 = r9.f3231w
            r10 = 0
            boolean r9 = r7.getBoolean(r10, r9)
            r5.setDither(r9)
            j.b r9 = r5.f3250f
            if (r1 == 0) goto L_0x007e
            r9.f3212b = r1
            android.util.DisplayMetrics r14 = r21.getDisplayMetrics()
            int r14 = r14.densityDpi
            if (r14 != 0) goto L_0x0073
            r14 = 160(0xa0, float:2.24E-43)
        L_0x0073:
            int r15 = r9.f3213c
            r9.f3213c = r14
            if (r15 == r14) goto L_0x0081
            r9.f3221m = r10
            r9.f3218j = r10
            goto L_0x0081
        L_0x007e:
            r9.getClass()
        L_0x0081:
            r7.recycle()
            int r7 = r22.getDepth()
            int r7 = r7 + r8
        L_0x0089:
            int r9 = r22.next()
            if (r9 == r8) goto L_0x026f
            int r14 = r22.getDepth()
            if (r14 >= r7) goto L_0x0097
            if (r9 == r12) goto L_0x026f
        L_0x0097:
            if (r9 == r11) goto L_0x009a
            goto L_0x0089
        L_0x009a:
            if (r14 <= r7) goto L_0x009d
            goto L_0x0089
        L_0x009d:
            java.lang.String r9 = r22.getName()
            java.lang.String r14 = "item"
            boolean r9 = r9.equals(r14)
            r14 = -1
            if (r9 == 0) goto L_0x016e
            int[] r9 = k.C0165b.f3560b
            android.content.res.TypedArray r9 = E.b.h(r1, r4, r3, r9)
            int r15 = r9.getResourceId(r10, r10)
            int r14 = r9.getResourceId(r8, r14)
            if (r14 <= 0) goto L_0x00c3
            o.P0 r6 = o.P0.d()
            android.graphics.drawable.Drawable r6 = r6.f(r0, r14)
            goto L_0x00c4
        L_0x00c3:
            r6 = 0
        L_0x00c4:
            r9.recycle()
            int r9 = r23.getAttributeCount()
            int[] r14 = new int[r9]
            r8 = 0
            r12 = 0
        L_0x00cf:
            if (r12 >= r9) goto L_0x00f3
            int r11 = r3.getAttributeNameResource(r12)
            if (r11 == 0) goto L_0x00ee
            r13 = 16842960(0x10100d0, float:2.369414E-38)
            if (r11 == r13) goto L_0x00ee
            r13 = 16843161(0x1010199, float:2.3694704E-38)
            if (r11 == r13) goto L_0x00ee
            int r13 = r8 + 1
            boolean r16 = r3.getAttributeBooleanValue(r12, r10)
            if (r16 == 0) goto L_0x00ea
            goto L_0x00eb
        L_0x00ea:
            int r11 = -r11
        L_0x00eb:
            r14[r8] = r11
            r8 = r13
        L_0x00ee:
            int r12 = r12 + 1
            r11 = 2
            r13 = 4
            goto L_0x00cf
        L_0x00f3:
            int[] r8 = android.util.StateSet.trimStateSet(r14, r8)
            java.lang.String r9 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r6 != 0) goto L_0x0139
        L_0x00fb:
            int r6 = r22.next()
            r11 = 4
            if (r6 != r11) goto L_0x0103
            goto L_0x00fb
        L_0x0103:
            r11 = 2
            if (r6 != r11) goto L_0x0120
            java.lang.String r6 = r22.getName()
            java.lang.String r11 = "vector"
            boolean r6 = r6.equals(r11)
            if (r6 == 0) goto L_0x011b
            o0.r r6 = new o0.r
            r6.<init>()
            r6.inflate(r1, r2, r3, r4)
            goto L_0x0139
        L_0x011b:
            android.graphics.drawable.Drawable r6 = k.C0164a.a(r21, r22, r23, r24)
            goto L_0x0139
        L_0x0120:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r22.getPositionDescription()
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0139:
            if (r6 == 0) goto L_0x0155
            j.b r9 = r5.f3242u
            int r6 = r9.a(r6)
            int[][] r11 = r9.f3209H
            r11[r6] = r8
            r.l r8 = r9.f3210J
            java.lang.Integer r9 = java.lang.Integer.valueOf(r15)
            r8.d(r6, r9)
        L_0x014e:
            r6 = 0
            r8 = 1
        L_0x0150:
            r11 = 2
            r12 = 3
            r13 = 4
            goto L_0x0089
        L_0x0155:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r22.getPositionDescription()
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x016e:
            java.lang.String r6 = r22.getName()
            java.lang.String r8 = "transition"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0267
            int[] r6 = k.C0165b.f3561c
            android.content.res.TypedArray r6 = E.b.h(r1, r4, r3, r6)
            r8 = 2
            int r9 = r6.getResourceId(r8, r14)
            r8 = 1
            int r11 = r6.getResourceId(r8, r14)
            int r12 = r6.getResourceId(r10, r14)
            if (r12 <= 0) goto L_0x019a
            o.P0 r13 = o.P0.d()
            android.graphics.drawable.Drawable r12 = r13.f(r0, r12)
        L_0x0198:
            r13 = 3
            goto L_0x019c
        L_0x019a:
            r12 = 0
            goto L_0x0198
        L_0x019c:
            boolean r15 = r6.getBoolean(r13, r10)
            r6.recycle()
            java.lang.String r6 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r12 != 0) goto L_0x01e6
        L_0x01a7:
            int r12 = r22.next()
            r8 = 4
            if (r12 != r8) goto L_0x01b0
            r8 = 1
            goto L_0x01a7
        L_0x01b0:
            r8 = 2
            if (r12 != r8) goto L_0x01cd
            java.lang.String r12 = r22.getName()
            java.lang.String r8 = "animated-vector"
            boolean r8 = r12.equals(r8)
            if (r8 == 0) goto L_0x01c8
            o0.f r12 = new o0.f
            r12.<init>(r0)
            r12.inflate(r1, r2, r3, r4)
            goto L_0x01e6
        L_0x01c8:
            android.graphics.drawable.Drawable r12 = k.C0164a.a(r21, r22, r23, r24)
            goto L_0x01e6
        L_0x01cd:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r22.getPositionDescription()
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01e6:
            if (r12 == 0) goto L_0x024e
            if (r9 == r14) goto L_0x0233
            if (r11 == r14) goto L_0x0233
            j.b r6 = r5.f3242u
            int r8 = r6.a(r12)
            long r13 = (long) r9
            r9 = 32
            long r16 = r13 << r9
            long r11 = (long) r11
            long r9 = r16 | r11
            if (r15 == 0) goto L_0x0202
            r16 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L_0x0204
        L_0x0202:
            r16 = 0
        L_0x0204:
            r.e r0 = r6.I
            long r1 = (long) r8
            long r18 = r1 | r16
            java.lang.Long r8 = java.lang.Long.valueOf(r18)
            r0.a(r9, r8)
            if (r15 == 0) goto L_0x0228
            r0 = 32
            long r8 = r11 << r0
            long r8 = r8 | r13
            r.e r0 = r6.I
            r10 = 4294967296(0x100000000, double:2.121995791E-314)
            long r1 = r1 | r10
            long r1 = r1 | r16
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.a(r8, r1)
        L_0x0228:
            r0 = r20
            r1 = r21
            r2 = r22
            r6 = 0
            r8 = 1
            r10 = 0
            goto L_0x0150
        L_0x0233:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r22.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x024e:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r22.getPositionDescription()
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0267:
            r0 = r20
            r1 = r21
            r2 = r22
            goto L_0x014e
        L_0x026f:
            int[] r0 = r5.getState()
            r5.onStateChange(r0)
            return r5
        L_0x0277:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r22.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid animated-selector tag "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0135e.e(android.content.Context, android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):j.e");
    }

    public final void d(C0132b bVar) {
        this.f3250f = bVar;
        int i = this.f3255l;
        if (i >= 0) {
            Drawable d2 = bVar.d(i);
            this.f3252h = d2;
            if (d2 != null) {
                b(d2);
            }
        }
        this.i = null;
        this.f3240s = bVar;
        this.f3242u = bVar;
    }

    public final Drawable f() {
        if (!this.f3241t) {
            super.mutate();
            C0132b bVar = this.f3240s;
            bVar.I = bVar.I.clone();
            bVar.f3210J = bVar.f3210J.clone();
            this.f3241t = true;
        }
        return this;
    }

    public final Drawable mutate() {
        if (!this.f3246y) {
            f();
            C0132b bVar = this.f3242u;
            bVar.I = bVar.I.clone();
            bVar.f3210J = bVar.f3210J.clone();
            this.f3246y = true;
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0106, code lost:
        if (c(r3) != false) goto L_0x0108;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onStateChange(int[] r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            j.b r2 = r0.f3242u
            int r3 = r2.e(r1)
            if (r3 < 0) goto L_0x000d
            goto L_0x0013
        L_0x000d:
            int[] r3 = android.util.StateSet.WILD_CARD
            int r3 = r2.e(r3)
        L_0x0013:
            int r2 = r0.f3255l
            r4 = 0
            if (r3 == r2) goto L_0x0109
            T0.g r5 = r0.f3243v
            r6 = 1
            if (r5 == 0) goto L_0x003d
            int r2 = r0.f3244w
            if (r3 != r2) goto L_0x0023
            goto L_0x0108
        L_0x0023:
            int r2 = r0.f3245x
            if (r3 != r2) goto L_0x0038
            boolean r2 = r5.e()
            if (r2 == 0) goto L_0x0038
            r5.K()
            int r2 = r0.f3245x
            r0.f3244w = r2
            r0.f3245x = r3
            goto L_0x0108
        L_0x0038:
            int r2 = r0.f3244w
            r5.P()
        L_0x003d:
            r5 = 0
            r0.f3243v = r5
            r5 = -1
            r0.f3245x = r5
            r0.f3244w = r5
            j.b r5 = r0.f3242u
            if (r2 >= 0) goto L_0x004e
            r5.getClass()
            r7 = 0
            goto L_0x005e
        L_0x004e:
            r.l r7 = r5.f3210J
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            java.lang.Object r7 = r7.c(r2, r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
        L_0x005e:
            if (r3 >= 0) goto L_0x0062
            r8 = 0
            goto L_0x0072
        L_0x0062:
            r.l r8 = r5.f3210J
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            java.lang.Object r8 = r8.c(r3, r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
        L_0x0072:
            if (r8 == 0) goto L_0x0102
            if (r7 != 0) goto L_0x0078
            goto L_0x0102
        L_0x0078:
            long r9 = (long) r7
            r7 = 32
            long r9 = r9 << r7
            long r7 = (long) r8
            long r7 = r7 | r9
            r.e r9 = r5.I
            r10 = -1
            java.lang.Long r12 = java.lang.Long.valueOf(r10)
            java.lang.Object r9 = r9.e(r7, r12)
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            int r9 = (int) r12
            if (r9 >= 0) goto L_0x0094
            goto L_0x0102
        L_0x0094:
            r.e r12 = r5.I
            java.lang.Long r13 = java.lang.Long.valueOf(r10)
            java.lang.Object r12 = r12.e(r7, r13)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            r14 = 8589934592(0x200000000, double:4.243991582E-314)
            long r12 = r12 & r14
            r14 = 0
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x00b2
            r12 = 1
            goto L_0x00b3
        L_0x00b2:
            r12 = 0
        L_0x00b3:
            r0.c(r9)
            android.graphics.drawable.Drawable r9 = r0.f3252h
            boolean r13 = r9 instanceof android.graphics.drawable.AnimationDrawable
            if (r13 == 0) goto L_0x00df
            r.e r5 = r5.I
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.Object r5 = r5.e(r7, r10)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            r10 = 4294967296(0x100000000, double:2.121995791E-314)
            long r7 = r7 & r10
            int r5 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x00d7
            r4 = 1
        L_0x00d7:
            j.c r5 = new j.c
            android.graphics.drawable.AnimationDrawable r9 = (android.graphics.drawable.AnimationDrawable) r9
            r5.<init>(r9, r4, r12)
            goto L_0x00f8
        L_0x00df:
            boolean r5 = r9 instanceof o0.f
            if (r5 == 0) goto L_0x00ec
            j.a r5 = new j.a
            o0.f r9 = (o0.f) r9
            r4 = 1
            r5.<init>(r9, r4)
            goto L_0x00f8
        L_0x00ec:
            boolean r5 = r9 instanceof android.graphics.drawable.Animatable
            if (r5 == 0) goto L_0x0102
            j.a r5 = new j.a
            android.graphics.drawable.Animatable r9 = (android.graphics.drawable.Animatable) r9
            r4 = 0
            r5.<init>(r9, r4)
        L_0x00f8:
            r5.O()
            r0.f3243v = r5
            r0.f3245x = r2
            r0.f3244w = r3
            goto L_0x0108
        L_0x0102:
            boolean r2 = r0.c(r3)
            if (r2 == 0) goto L_0x0109
        L_0x0108:
            r4 = 1
        L_0x0109:
            android.graphics.drawable.Drawable r2 = r0.f3252h
            if (r2 == 0) goto L_0x0112
            boolean r1 = r2.setState(r1)
            r4 = r4 | r1
        L_0x0112:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0135e.onStateChange(int[]):boolean");
    }

    public C0135e(C0132b bVar, Resources resources) {
        this.f3253j = 255;
        this.f3255l = -1;
        d(new C0132b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        T0.g gVar = this.f3243v;
        if (gVar != null) {
            gVar.P();
            this.f3243v = null;
            c(this.f3244w);
            this.f3244w = -1;
            this.f3245x = -1;
        }
    }

    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        T0.g gVar = this.f3243v;
        if (gVar != null && (visible || z3)) {
            if (z2) {
                gVar.O();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
