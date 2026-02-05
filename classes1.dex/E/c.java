package E;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f92a = new ThreadLocal();

    /* JADX WARNING: type inference failed for: r2v14, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0137  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList b(android.content.res.Resources r34, android.content.res.XmlResourceParser r35, android.util.AttributeSet r36, android.content.res.Resources.Theme r37) {
        /*
            r0 = r34
            r1 = r36
            r2 = r37
            java.lang.String r3 = r35.getName()
            java.lang.String r4 = "selector"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x034a
            int r3 = r35.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = 20
            int[][] r6 = new int[r5][]
            int[] r5 = new int[r5]
            r7 = 0
            r8 = 0
        L_0x0020:
            int r9 = r35.next()
            if (r9 == r4) goto L_0x0339
            int r10 = r35.getDepth()
            r11 = 3
            if (r10 >= r3) goto L_0x002f
            if (r9 == r11) goto L_0x0339
        L_0x002f:
            r12 = 2
            if (r9 != r12) goto L_0x0040
            if (r10 > r3) goto L_0x0040
            java.lang.String r9 = r35.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0046
        L_0x0040:
            r30 = r3
            r16 = 1
            goto L_0x032d
        L_0x0046:
            int[] r9 = B.a.f26a
            if (r2 != 0) goto L_0x004f
            android.content.res.TypedArray r9 = r0.obtainAttributes(r1, r9)
            goto L_0x0053
        L_0x004f:
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r1, r9, r7, r7)
        L_0x0053:
            r10 = -1
            int r13 = r9.getResourceId(r7, r10)
            r14 = -65281(0xffffffffffff00ff, float:NaN)
            r15 = 31
            if (r13 == r10) goto L_0x0092
            java.lang.ThreadLocal r10 = f92a
            java.lang.Object r16 = r10.get()
            android.util.TypedValue r16 = (android.util.TypedValue) r16
            if (r16 != 0) goto L_0x0072
            android.util.TypedValue r12 = new android.util.TypedValue
            r12.<init>()
            r10.set(r12)
            goto L_0x0074
        L_0x0072:
            r12 = r16
        L_0x0074:
            r0.getValue(r13, r12, r4)
            int r10 = r12.type
            r12 = 28
            if (r10 < r12) goto L_0x0080
            if (r10 > r15) goto L_0x0080
            goto L_0x0092
        L_0x0080:
            android.content.res.XmlResourceParser r10 = r0.getXml(r13)     // Catch:{ Exception -> 0x008d }
            android.content.res.ColorStateList r10 = a(r0, r10, r2)     // Catch:{ Exception -> 0x008d }
            int r10 = r10.getDefaultColor()     // Catch:{ Exception -> 0x008d }
            goto L_0x0096
        L_0x008d:
            int r10 = r9.getColor(r7, r14)
            goto L_0x0096
        L_0x0092:
            int r10 = r9.getColor(r7, r14)
        L_0x0096:
            boolean r12 = r9.hasValue(r4)
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r12 == 0) goto L_0x00a3
            float r11 = r9.getFloat(r4, r13)
            goto L_0x00b0
        L_0x00a3:
            boolean r12 = r9.hasValue(r11)
            if (r12 == 0) goto L_0x00ae
            float r11 = r9.getFloat(r11, r13)
            goto L_0x00b0
        L_0x00ae:
            r11 = 1065353216(0x3f800000, float:1.0)
        L_0x00b0:
            int r12 = android.os.Build.VERSION.SDK_INT
            r14 = 4
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r12 < r15) goto L_0x00c3
            r12 = 2
            boolean r15 = r9.hasValue(r12)
            if (r15 == 0) goto L_0x00c3
            float r4 = r9.getFloat(r12, r4)
            goto L_0x00c7
        L_0x00c3:
            float r4 = r9.getFloat(r14, r4)
        L_0x00c7:
            r9.recycle()
            int r9 = r36.getAttributeCount()
            int[] r12 = new int[r9]
            r14 = 0
            r15 = 0
        L_0x00d2:
            if (r15 >= r9) goto L_0x0102
            int r13 = r1.getAttributeNameResource(r15)
            r7 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r13 == r7) goto L_0x00fa
            r7 = 16843551(0x101031f, float:2.3695797E-38)
            if (r13 == r7) goto L_0x00fa
            r7 = 2130968628(0x7f040034, float:1.7545915E38)
            if (r13 == r7) goto L_0x00fa
            r7 = 2130969232(0x7f040290, float:1.754714E38)
            if (r13 == r7) goto L_0x00fa
            int r7 = r14 + 1
            r0 = 0
            boolean r19 = r1.getAttributeBooleanValue(r15, r0)
            if (r19 == 0) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            int r13 = -r13
        L_0x00f7:
            r12[r14] = r13
            r14 = r7
        L_0x00fa:
            int r15 = r15 + 1
            r0 = r34
            r7 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00d2
        L_0x0102:
            int[] r0 = android.util.StateSet.trimStateSet(r12, r14)
            r7 = 1120403456(0x42c80000, float:100.0)
            r9 = 0
            int r12 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r12 < 0) goto L_0x0115
            int r12 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r12 > 0) goto L_0x0115
            r12 = 1
        L_0x0112:
            r13 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0117
        L_0x0115:
            r12 = 0
            goto L_0x0112
        L_0x0117:
            int r14 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r14 != 0) goto L_0x0123
            if (r12 != 0) goto L_0x0123
            r30 = r3
            r16 = 1
            goto L_0x02e8
        L_0x0123:
            int r13 = android.graphics.Color.alpha(r10)
            float r13 = (float) r13
            float r13 = r13 * r11
            r11 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 + r11
            int r11 = (int) r13
            r13 = 255(0xff, float:3.57E-43)
            r14 = 0
            int r11 = p0.C0320a.l(r11, r14, r13)
            if (r12 == 0) goto L_0x02dc
            E.a r10 = E.a.a(r10)
            E.s r12 = E.s.f124k
            float r13 = r10.f82b
            double r14 = (double) r13
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r21 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r21 < 0) goto L_0x015c
            int r14 = java.lang.Math.round(r4)
            double r14 = (double) r14
            r19 = 0
            int r21 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r21 <= 0) goto L_0x015c
            int r14 = java.lang.Math.round(r4)
            double r14 = (double) r14
            r19 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r21 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r21 < 0) goto L_0x0162
        L_0x015c:
            r30 = r3
            r16 = 1
            goto L_0x02d7
        L_0x0162:
            float r10 = r10.f81a
            int r14 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r14 >= 0) goto L_0x016a
            r10 = 0
            goto L_0x0170
        L_0x016a:
            r14 = 1135869952(0x43b40000, float:360.0)
            float r10 = java.lang.Math.min(r14, r10)
        L_0x0170:
            r15 = r13
            r14 = 0
            r19 = 1
            r20 = 0
        L_0x0176:
            float r22 = r20 - r13
            float r22 = java.lang.Math.abs(r22)
            r23 = 1053609165(0x3ecccccd, float:0.4)
            int r22 = (r22 > r23 ? 1 : (r22 == r23 ? 0 : -1))
            if (r22 < 0) goto L_0x02c7
            r22 = 1148846080(0x447a0000, float:1000.0)
            r23 = 1148846080(0x447a0000, float:1000.0)
            r24 = 0
            r25 = 1120403456(0x42c80000, float:100.0)
            r26 = 0
        L_0x018d:
            float r27 = r24 - r25
            float r27 = java.lang.Math.abs(r27)
            r28 = 1008981770(0x3c23d70a, float:0.01)
            r29 = 1073741824(0x40000000, float:2.0)
            int r27 = (r27 > r28 ? 1 : (r27 == r28 ? 0 : -1))
            if (r27 <= 0) goto L_0x0282
            float r27 = r25 - r24
            float r27 = r27 / r29
            float r9 = r27 + r24
            E.a r7 = E.a.b(r9, r15, r10)
            E.s r1 = E.s.f124k
            int r1 = r7.c(r1)
            int r7 = android.graphics.Color.red(r1)
            float r7 = E.b.g(r7)
            int r30 = android.graphics.Color.green(r1)
            float r30 = E.b.g(r30)
            int r31 = android.graphics.Color.blue(r1)
            float r31 = E.b.g(r31)
            float[][] r32 = E.b.f89d
            r16 = 1
            r32 = r32[r16]
            r18 = 0
            r33 = r32[r18]
            float r7 = r7 * r33
            r33 = r32[r16]
            float r30 = r30 * r33
            float r30 = r30 + r7
            r7 = 2
            r17 = r32[r7]
            float r31 = r31 * r17
            float r31 = r31 + r30
            r17 = 1120403456(0x42c80000, float:100.0)
            float r7 = r31 / r17
            r30 = 1007753895(0x3c111aa7, float:0.008856452)
            int r30 = (r7 > r30 ? 1 : (r7 == r30 ? 0 : -1))
            if (r30 > 0) goto L_0x01f0
            r30 = 1147261687(0x4461d2f7, float:903.2963)
            float r7 = r7 * r30
            r30 = r3
            goto L_0x0200
        L_0x01f0:
            r30 = r3
            double r2 = (double) r7
            double r2 = java.lang.Math.cbrt(r2)
            float r2 = (float) r2
            r3 = 1122500608(0x42e80000, float:116.0)
            float r2 = r2 * r3
            r3 = 1098907648(0x41800000, float:16.0)
            float r7 = r2 - r3
        L_0x0200:
            float r2 = r4 - r7
            float r2 = java.lang.Math.abs(r2)
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x025a
            E.a r1 = E.a.a(r1)
            float r3 = r1.f83c
            r31 = r2
            float r2 = r1.f82b
            E.a r2 = E.a.b(r3, r2, r10)
            float r3 = r1.f84d
            r32 = r9
            float r9 = r2.f84d
            float r3 = r3 - r9
            float r9 = r1.e
            r33 = r10
            float r10 = r2.e
            float r9 = r9 - r10
            float r10 = r1.f85f
            float r2 = r2.f85f
            float r10 = r10 - r2
            float r3 = r3 * r3
            float r9 = r9 * r9
            float r9 = r9 + r3
            float r10 = r10 * r10
            float r10 = r10 + r9
            double r2 = (double) r10
            double r2 = java.lang.Math.sqrt(r2)
            r9 = 4603849755075763241(0x3fe428f5c28f5c29, double:0.63)
            double r2 = java.lang.Math.pow(r2, r9)
            r9 = 4609028894647239311(0x3ff68f5c28f5c28f, double:1.41)
            double r2 = r2 * r9
            float r2 = (float) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x0258
            r26 = r1
            r23 = r2
            r22 = r31
        L_0x0258:
            r1 = 0
            goto L_0x0261
        L_0x025a:
            r32 = r9
            r33 = r10
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0258
        L_0x0261:
            int r2 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r2 != 0) goto L_0x026c
            int r2 = (r23 > r1 ? 1 : (r23 == r1 ? 0 : -1))
            if (r2 != 0) goto L_0x026c
        L_0x0269:
            r2 = r26
            goto L_0x028e
        L_0x026c:
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0273
            r24 = r32
            goto L_0x0275
        L_0x0273:
            r25 = r32
        L_0x0275:
            r1 = r36
            r2 = r37
            r3 = r30
            r10 = r33
            r7 = 1120403456(0x42c80000, float:100.0)
            r9 = 0
            goto L_0x018d
        L_0x0282:
            r30 = r3
            r33 = r10
            r1 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            r16 = 1
            r17 = 1120403456(0x42c80000, float:100.0)
            goto L_0x0269
        L_0x028e:
            if (r19 == 0) goto L_0x02ad
            if (r2 == 0) goto L_0x0298
            int r1 = r2.c(r12)
        L_0x0296:
            r10 = r1
            goto L_0x02e0
        L_0x0298:
            float r2 = r13 - r20
            float r2 = r2 / r29
            float r15 = r2 + r20
            r1 = r36
            r2 = r37
            r3 = r30
            r10 = r33
            r7 = 1120403456(0x42c80000, float:100.0)
            r9 = 0
            r19 = 0
            goto L_0x0176
        L_0x02ad:
            if (r2 != 0) goto L_0x02b1
            r13 = r15
            goto L_0x02b4
        L_0x02b1:
            r14 = r2
            r20 = r15
        L_0x02b4:
            float r2 = r13 - r20
            float r2 = r2 / r29
            float r15 = r2 + r20
            r1 = r36
            r2 = r37
            r3 = r30
            r10 = r33
            r7 = 1120403456(0x42c80000, float:100.0)
            r9 = 0
            goto L_0x0176
        L_0x02c7:
            r30 = r3
            r16 = 1
            if (r14 != 0) goto L_0x02d2
            int r1 = E.b.f(r4)
            goto L_0x0296
        L_0x02d2:
            int r1 = r14.c(r12)
            goto L_0x0296
        L_0x02d7:
            int r1 = E.b.f(r4)
            goto L_0x0296
        L_0x02dc:
            r30 = r3
            r16 = 1
        L_0x02e0:
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r10
            int r2 = r11 << 24
            r10 = r1 | r2
        L_0x02e8:
            int r1 = r8 + 1
            int r2 = r5.length
            r3 = 8
            if (r1 <= r2) goto L_0x02fe
            r2 = 4
            if (r8 > r2) goto L_0x02f5
            r2 = 8
            goto L_0x02f7
        L_0x02f5:
            int r2 = r8 * 2
        L_0x02f7:
            int[] r2 = new int[r2]
            r4 = 0
            java.lang.System.arraycopy(r5, r4, r2, r4, r8)
            r5 = r2
        L_0x02fe:
            r5[r8] = r10
            int r2 = r6.length
            if (r1 <= r2) goto L_0x031c
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r2 = r2.getComponentType()
            r4 = 4
            if (r8 > r4) goto L_0x030f
            goto L_0x0311
        L_0x030f:
            int r3 = r8 * 2
        L_0x0311:
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r3)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r3 = 0
            java.lang.System.arraycopy(r6, r3, r2, r3, r8)
            r6 = r2
        L_0x031c:
            r6[r8] = r0
            int[][] r6 = (int[][]) r6
            r0 = r34
            r2 = r37
            r8 = r1
            r3 = r30
            r4 = 1
            r7 = 0
            r1 = r36
            goto L_0x0020
        L_0x032d:
            r0 = r34
            r1 = r36
            r2 = r37
            r3 = r30
            r4 = 1
            r7 = 0
            goto L_0x0020
        L_0x0339:
            int[] r0 = new int[r8]
            int[][] r1 = new int[r8][]
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r2, r8)
            java.lang.System.arraycopy(r6, r2, r1, r2, r8)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        L_0x034a:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r35.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid color state list tag "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E.c.b(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList a(android.content.res.Resources r4, android.content.res.XmlResourceParser r5, android.content.res.Resources.Theme r6) {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000f
            r3 = 1
            if (r1 == r3) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            if (r1 != r2) goto L_0x0016
            android.content.res.ColorStateList r4 = b(r4, r5, r0, r6)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: E.c.a(android.content.res.Resources, android.content.res.XmlResourceParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }
}
