package E;

import android.content.res.ColorStateList;
import android.graphics.Shader;
import g1.y;
import java.net.ProtocolException;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f93a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f94b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f95c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f96d;

    public d(y yVar, int i, String str) {
        this.f95c = yVar;
        this.f94b = i;
        this.f96d = str;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r15v14, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r10v21, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c8, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r3.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static E.d a(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            r0 = r29
            r1 = r31
            java.lang.String r2 = "gradient"
            android.content.res.XmlResourceParser r3 = r29.getXml(r30)
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r3)
        L_0x000e:
            int r5 = r3.next()
            r6 = 2
            r7 = 1
            if (r5 == r6) goto L_0x0019
            if (r5 == r7) goto L_0x0019
            goto L_0x000e
        L_0x0019:
            if (r5 != r6) goto L_0x028b
            java.lang.String r5 = r3.getName()
            r5.getClass()
            r8 = 0
            boolean r9 = r5.equals(r2)
            if (r9 != 0) goto L_0x005d
            java.lang.String r2 = "selector"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x003f
            android.content.res.ColorStateList r0 = E.c.b(r0, r3, r4, r1)
            E.d r1 = new E.d
            int r2 = r0.getDefaultColor()
            r1.<init>((android.graphics.Shader) r8, (android.content.res.ColorStateList) r0, (int) r2)
            return r1
        L_0x003f:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": unsupported complex color tag "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x005d:
            java.lang.String r5 = r3.getName()
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x026d
            int[] r2 = B.a.f29d
            android.content.res.TypedArray r2 = E.b.h(r0, r1, r4, r2)
            java.lang.String r5 = "startX"
            boolean r5 = E.b.e(r3, r5)
            r9 = 0
            if (r5 != 0) goto L_0x0078
            r11 = 0
            goto L_0x007f
        L_0x0078:
            r5 = 8
            float r5 = r2.getFloat(r5, r9)
            r11 = r5
        L_0x007f:
            java.lang.String r5 = "startY"
            boolean r5 = E.b.e(r3, r5)
            if (r5 != 0) goto L_0x0089
            r12 = 0
            goto L_0x0090
        L_0x0089:
            r5 = 9
            float r5 = r2.getFloat(r5, r9)
            r12 = r5
        L_0x0090:
            java.lang.String r5 = "endX"
            boolean r5 = E.b.e(r3, r5)
            if (r5 != 0) goto L_0x009a
            r13 = 0
            goto L_0x00a1
        L_0x009a:
            r5 = 10
            float r5 = r2.getFloat(r5, r9)
            r13 = r5
        L_0x00a1:
            java.lang.String r5 = "endY"
            boolean r5 = E.b.e(r3, r5)
            if (r5 != 0) goto L_0x00ab
            r14 = 0
            goto L_0x00b2
        L_0x00ab:
            r5 = 11
            float r5 = r2.getFloat(r5, r9)
            r14 = r5
        L_0x00b2:
            java.lang.String r5 = "centerX"
            boolean r5 = E.b.e(r3, r5)
            r10 = 3
            if (r5 != 0) goto L_0x00bd
            r5 = 0
            goto L_0x00c1
        L_0x00bd:
            float r5 = r2.getFloat(r10, r9)
        L_0x00c1:
            java.lang.String r15 = "centerY"
            boolean r15 = E.b.e(r3, r15)
            if (r15 != 0) goto L_0x00cb
            r15 = 0
            goto L_0x00d0
        L_0x00cb:
            r15 = 4
            float r15 = r2.getFloat(r15, r9)
        L_0x00d0:
            java.lang.String r8 = "type"
            boolean r8 = E.b.e(r3, r8)
            r10 = 0
            if (r8 != 0) goto L_0x00db
            r8 = 0
            goto L_0x00df
        L_0x00db:
            int r8 = r2.getInt(r6, r10)
        L_0x00df:
            java.lang.String r6 = "startColor"
            boolean r6 = E.b.e(r3, r6)
            if (r6 != 0) goto L_0x00e9
            r6 = 0
            goto L_0x00ed
        L_0x00e9:
            int r6 = r2.getColor(r10, r10)
        L_0x00ed:
            java.lang.String r9 = "centerColor"
            boolean r19 = E.b.e(r3, r9)
            boolean r9 = E.b.e(r3, r9)
            if (r9 != 0) goto L_0x00fb
            r9 = 0
            goto L_0x0100
        L_0x00fb:
            r9 = 7
            int r9 = r2.getColor(r9, r10)
        L_0x0100:
            java.lang.String r7 = "endColor"
            boolean r7 = E.b.e(r3, r7)
            if (r7 != 0) goto L_0x010a
            r7 = 0
            goto L_0x0111
        L_0x010a:
            r7 = 1
            int r21 = r2.getColor(r7, r10)
            r7 = r21
        L_0x0111:
            java.lang.String r10 = "tileMode"
            boolean r10 = E.b.e(r3, r10)
            if (r10 != 0) goto L_0x011d
            r22 = r5
            r5 = 0
            goto L_0x0126
        L_0x011d:
            r10 = 6
            r22 = r5
            r5 = 0
            int r10 = r2.getInt(r10, r5)
            r5 = r10
        L_0x0126:
            java.lang.String r10 = "gradientRadius"
            boolean r10 = E.b.e(r3, r10)
            if (r10 != 0) goto L_0x0132
            r23 = r15
            r10 = 0
            goto L_0x013a
        L_0x0132:
            r10 = 5
            r23 = r15
            r15 = 0
            float r10 = r2.getFloat(r10, r15)
        L_0x013a:
            r2.recycle()
            int r2 = r3.getDepth()
            r15 = 1
            int r2 = r2 + r15
            java.util.ArrayList r15 = new java.util.ArrayList
            r24 = r10
            r10 = 20
            r15.<init>(r10)
            r25 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r10)
        L_0x0153:
            int r10 = r3.next()
            r26 = r13
            r13 = 1
            if (r10 == r13) goto L_0x01c9
            int r13 = r3.getDepth()
            r27 = r12
            if (r13 >= r2) goto L_0x0167
            r12 = 3
            if (r10 == r12) goto L_0x01cb
        L_0x0167:
            r12 = 2
            if (r10 == r12) goto L_0x016f
        L_0x016a:
            r13 = r26
            r12 = r27
            goto L_0x0153
        L_0x016f:
            if (r13 > r2) goto L_0x016a
            java.lang.String r10 = r3.getName()
            java.lang.String r12 = "item"
            boolean r10 = r10.equals(r12)
            if (r10 != 0) goto L_0x017e
            goto L_0x016a
        L_0x017e:
            int[] r10 = B.a.e
            android.content.res.TypedArray r10 = E.b.h(r0, r1, r4, r10)
            r12 = 0
            boolean r13 = r10.hasValue(r12)
            r12 = 1
            boolean r20 = r10.hasValue(r12)
            if (r13 == 0) goto L_0x01ae
            if (r20 == 0) goto L_0x01ae
            r13 = 0
            int r21 = r10.getColor(r13, r13)
            r13 = 0
            float r28 = r10.getFloat(r12, r13)
            r10.recycle()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r21)
            r14.add(r10)
            java.lang.Float r10 = java.lang.Float.valueOf(r28)
            r15.add(r10)
            goto L_0x016a
        L_0x01ae:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01c9:
            r27 = r12
        L_0x01cb:
            int r0 = r14.size()
            if (r0 <= 0) goto L_0x01d7
            E.j r0 = new E.j
            r0.<init>((java.util.ArrayList) r14, (java.util.ArrayList) r15)
            goto L_0x01d8
        L_0x01d7:
            r0 = 0
        L_0x01d8:
            if (r0 == 0) goto L_0x01dc
        L_0x01da:
            r1 = 1
            goto L_0x01ea
        L_0x01dc:
            if (r19 == 0) goto L_0x01e4
            E.j r0 = new E.j
            r0.<init>((int) r6, (int) r9, (int) r7)
            goto L_0x01da
        L_0x01e4:
            E.j r0 = new E.j
            r0.<init>((int) r6, (int) r7)
            goto L_0x01da
        L_0x01ea:
            if (r8 == r1) goto L_0x022a
            r2 = 2
            if (r8 == r2) goto L_0x0217
            android.graphics.LinearGradient r3 = new android.graphics.LinearGradient
            if (r5 == r1) goto L_0x01fd
            if (r5 == r2) goto L_0x01fa
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
        L_0x01f7:
            r17 = r1
            goto L_0x0200
        L_0x01fa:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x01f7
        L_0x01fd:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.REPEAT
            goto L_0x01f7
        L_0x0200:
            java.lang.Object r1 = r0.f108g
            r15 = r1
            int[] r15 = (int[]) r15
            java.lang.Object r0 = r0.f109h
            r16 = r0
            float[] r16 = (float[]) r16
            r1 = 0
            r10 = r3
            r12 = r27
            r13 = r26
            r14 = r25
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x025e
        L_0x0217:
            r1 = 0
            android.graphics.SweepGradient r3 = new android.graphics.SweepGradient
            java.lang.Object r2 = r0.f108g
            int[] r2 = (int[]) r2
            java.lang.Object r0 = r0.f109h
            float[] r0 = (float[]) r0
            r9 = r22
            r15 = r23
            r3.<init>(r9, r15, r2, r0)
            goto L_0x025e
        L_0x022a:
            r9 = r22
            r15 = r23
            r1 = 0
            r2 = 0
            int r2 = (r24 > r2 ? 1 : (r24 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0265
            android.graphics.RadialGradient r3 = new android.graphics.RadialGradient
            r2 = 1
            if (r5 == r2) goto L_0x0244
            r2 = 2
            if (r5 == r2) goto L_0x0241
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.CLAMP
        L_0x023e:
            r21 = r2
            goto L_0x0247
        L_0x0241:
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x023e
        L_0x0244:
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.REPEAT
            goto L_0x023e
        L_0x0247:
            java.lang.Object r2 = r0.f108g
            r19 = r2
            int[] r19 = (int[]) r19
            java.lang.Object r0 = r0.f109h
            r20 = r0
            float[] r20 = (float[]) r20
            r0 = r15
            r15 = r3
            r16 = r9
            r17 = r0
            r18 = r24
            r15.<init>(r16, r17, r18, r19, r20, r21)
        L_0x025e:
            E.d r0 = new E.d
            r2 = 0
            r0.<init>((android.graphics.Shader) r3, (android.content.res.ColorStateList) r2, (int) r1)
            return r0
        L_0x0265:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r0.<init>(r1)
            throw r0
        L_0x026d:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid gradient color tag "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x028b:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E.d.a(android.content.res.Resources, int, android.content.res.Resources$Theme):E.d");
    }

    public static d c(String str) {
        int i;
        String str2;
        boolean startsWith = str.startsWith("HTTP/1.");
        y yVar = y.HTTP_1_0;
        if (startsWith) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt == 1) {
                    yVar = y.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
            }
        } else if (str.startsWith("ICY ")) {
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() <= i2) {
                    str2 = "";
                } else if (str.charAt(i2) == ' ') {
                    str2 = str.substring(i + 4);
                } else {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                return new d(yVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public boolean b() {
        ColorStateList colorStateList;
        if (((Shader) this.f95c) != null || (colorStateList = (ColorStateList) this.f96d) == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    public String toString() {
        String str;
        switch (this.f93a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                if (((y) this.f95c) == y.HTTP_1_0) {
                    str = "HTTP/1.0";
                } else {
                    str = "HTTP/1.1";
                }
                sb.append(str);
                sb.append(' ');
                sb.append(this.f94b);
                String str2 = (String) this.f96d;
                if (str2 != null) {
                    sb.append(' ');
                    sb.append(str2);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public d(Shader shader, ColorStateList colorStateList, int i) {
        this.f95c = shader;
        this.f96d = colorStateList;
        this.f94b = i;
    }
}
