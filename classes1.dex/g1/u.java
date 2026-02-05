package g1;

import h1.c;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class u {
    public static final char[] i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    public final String f2774a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2775b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2776c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2777d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final List f2778f;

    /* renamed from: g  reason: collision with root package name */
    public final String f2779g;

    /* renamed from: h  reason: collision with root package name */
    public final String f2780h;

    /* JADX WARNING: type inference failed for: r1v1, types: [r1.e, java.lang.Object] */
    public static String h(String str, int i2, int i3, boolean z2) {
        int i4;
        int i5 = i2;
        while (i5 < i3) {
            char charAt = str.charAt(i5);
            if (charAt == '%' || (charAt == '+' && z2)) {
                ? obj = new Object();
                obj.y(str, i2, i5);
                while (i5 < i3) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt == 37 && (i4 = i5 + 2) < i3) {
                        int e2 = c.e(str.charAt(i5 + 1));
                        int e3 = c.e(str.charAt(i4));
                        if (!(e2 == -1 || e3 == -1)) {
                            obj.v((e2 << 4) + e3);
                            i5 = i4;
                            i5 += Character.charCount(codePointAt);
                        }
                    } else if (codePointAt == 43 && z2) {
                        obj.v(32);
                        i5 += Character.charCount(codePointAt);
                    }
                    obj.z(codePointAt);
                    i5 += Character.charCount(codePointAt);
                }
                return obj.q();
            }
            i5++;
        }
        return str.substring(i2, i3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: r1.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: r1.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: r1.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: r1.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: r1.e} */
    /* JADX WARNING: type inference failed for: r4v1, types: [r1.e, java.lang.Object] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23) {
        /*
            r0 = r16
            r1 = r18
            r2 = r19
            r3 = r17
        L_0x0008:
            if (r3 >= r1) goto L_0x00cc
            int r4 = r0.codePointAt(r3)
            r5 = 43
            r6 = 37
            r7 = -1
            r8 = 128(0x80, float:1.794E-43)
            r9 = 127(0x7f, float:1.78E-43)
            r10 = 32
            if (r4 < r10) goto L_0x003e
            if (r4 == r9) goto L_0x003e
            if (r4 < r8) goto L_0x0021
            if (r23 != 0) goto L_0x003e
        L_0x0021:
            int r11 = r2.indexOf(r4)
            if (r11 != r7) goto L_0x003e
            if (r4 != r6) goto L_0x0033
            if (r20 == 0) goto L_0x003e
            if (r21 == 0) goto L_0x0033
            boolean r11 = j(r0, r3, r1)
            if (r11 == 0) goto L_0x003e
        L_0x0033:
            if (r4 != r5) goto L_0x0038
            if (r22 == 0) goto L_0x0038
            goto L_0x003e
        L_0x0038:
            int r4 = java.lang.Character.charCount(r4)
            int r3 = r3 + r4
            goto L_0x0008
        L_0x003e:
            r1.e r4 = new r1.e
            r4.<init>()
            r11 = r17
            r4.y(r0, r11, r3)
            r11 = 0
        L_0x0049:
            if (r3 >= r1) goto L_0x00c7
            int r12 = r0.codePointAt(r3)
            if (r20 == 0) goto L_0x0062
            r13 = 9
            if (r12 == r13) goto L_0x00c1
            r13 = 10
            if (r12 == r13) goto L_0x00c1
            r13 = 12
            if (r12 == r13) goto L_0x00c1
            r13 = 13
            if (r12 != r13) goto L_0x0062
            goto L_0x00c1
        L_0x0062:
            if (r12 != r5) goto L_0x0076
            if (r22 == 0) goto L_0x0076
            if (r20 == 0) goto L_0x006b
            java.lang.String r13 = "+"
            goto L_0x006d
        L_0x006b:
            java.lang.String r13 = "%2B"
        L_0x006d:
            int r14 = r13.length()
            r15 = 0
            r4.y(r13, r15, r14)
            goto L_0x00c1
        L_0x0076:
            if (r12 < r10) goto L_0x0095
            if (r12 == r9) goto L_0x0095
            if (r12 < r8) goto L_0x007e
            if (r23 != 0) goto L_0x0095
        L_0x007e:
            int r13 = r2.indexOf(r12)
            if (r13 != r7) goto L_0x0095
            if (r12 != r6) goto L_0x0091
            if (r20 == 0) goto L_0x0095
            if (r21 == 0) goto L_0x0091
            boolean r13 = j(r0, r3, r1)
            if (r13 != 0) goto L_0x0091
            goto L_0x0095
        L_0x0091:
            r4.z(r12)
            goto L_0x00c1
        L_0x0095:
            if (r11 != 0) goto L_0x009c
            r1.e r11 = new r1.e
            r11.<init>()
        L_0x009c:
            r11.z(r12)
        L_0x009f:
            boolean r13 = r11.g()
            if (r13 != 0) goto L_0x00c1
            byte r13 = r11.j()
            r14 = r13 & 255(0xff, float:3.57E-43)
            r4.v(r6)
            char[] r15 = i
            int r14 = r14 >> 4
            r14 = r14 & 15
            char r14 = r15[r14]
            r4.v(r14)
            r13 = r13 & 15
            char r13 = r15[r13]
            r4.v(r13)
            goto L_0x009f
        L_0x00c1:
            int r12 = java.lang.Character.charCount(r12)
            int r3 = r3 + r12
            goto L_0x0049
        L_0x00c7:
            java.lang.String r0 = r4.q()
            return r0
        L_0x00cc:
            r11 = r17
            java.lang.String r0 = r16.substring(r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.u.a(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean):java.lang.String");
    }

    public static int b(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return 443;
        }
        return -1;
    }

    public static boolean j(String str, int i2, int i3) {
        int i4 = i2 + 2;
        if (i4 >= i3 || str.charAt(i2) != '%' || c.e(str.charAt(i2 + 1)) == -1 || c.e(str.charAt(i4)) == -1) {
            return false;
        }
        return true;
    }

    public static ArrayList k(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int indexOf = str.indexOf(38, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i2);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i2, indexOf));
                arrayList.add((Object) null);
            } else {
                arrayList.add(str.substring(i2, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i2 = indexOf + 1;
        }
        return arrayList;
    }

    public final String c() {
        if (this.f2776c.isEmpty()) {
            return "";
        }
        String str = this.f2780h;
        return str.substring(str.indexOf(58, this.f2774a.length() + 3) + 1, str.indexOf(64));
    }

    public final ArrayList d() {
        String str = this.f2780h;
        int indexOf = str.indexOf(47, this.f2774a.length() + 3);
        int h2 = c.h(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < h2) {
            int i2 = indexOf + 1;
            int g2 = c.g(str, i2, h2, '/');
            arrayList.add(str.substring(i2, g2));
            indexOf = g2;
        }
        return arrayList;
    }

    public final String e() {
        if (this.f2778f == null) {
            return null;
        }
        String str = this.f2780h;
        int indexOf = str.indexOf(63) + 1;
        return str.substring(indexOf, c.g(str, indexOf, str.length(), '#'));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u) || !((u) obj).f2780h.equals(this.f2780h)) {
            return false;
        }
        return true;
    }

    public final String f() {
        if (this.f2775b.isEmpty()) {
            return "";
        }
        int length = this.f2774a.length() + 3;
        String str = this.f2780h;
        return str.substring(length, c.h(str, length, str.length(), ":@"));
    }

    public final int hashCode() {
        return this.f2780h.hashCode();
    }

    public final URI l() {
        ArrayList arrayList;
        t tVar = new t();
        String str = this.f2774a;
        tVar.f2767a = str;
        tVar.f2768b = f();
        tVar.f2769c = c();
        tVar.f2770d = this.f2777d;
        int b2 = b(str);
        int i2 = this.e;
        if (i2 == b2) {
            i2 = -1;
        }
        tVar.e = i2;
        ArrayList arrayList2 = tVar.f2771f;
        arrayList2.clear();
        arrayList2.addAll(d());
        String e2 = e();
        String str2 = null;
        if (e2 != null) {
            arrayList = k(a(e2, 0, e2.length(), " \"'<>#", true, false, true, true));
        } else {
            arrayList = null;
        }
        tVar.f2772g = arrayList;
        if (this.f2779g != null) {
            String str3 = this.f2780h;
            str2 = str3.substring(str3.indexOf(35) + 1);
        }
        tVar.f2773h = str2;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            String str4 = (String) arrayList2.get(i3);
            arrayList2.set(i3, a(str4, 0, str4.length(), "[]", true, true, false, true));
        }
        ArrayList arrayList3 = tVar.f2772g;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str5 = (String) tVar.f2772g.get(i4);
                if (str5 != null) {
                    tVar.f2772g.set(i4, a(str5, 0, str5.length(), "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str6 = tVar.f2773h;
        if (str6 != null) {
            tVar.f2773h = a(str6, 0, str6.length(), " \"#<>\\^`{|}", true, true, false, false);
        }
        String tVar2 = tVar.toString();
        try {
            return new URI(tVar2);
        } catch (URISyntaxException e3) {
            try {
                return URI.create(tVar2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e3);
            }
        }
    }

    public final String toString() {
        return this.f2780h;
    }

    public u(t tVar) {
        List list;
        this.f2774a = tVar.f2767a;
        String str = tVar.f2768b;
        this.f2775b = h(str, 0, str.length(), false);
        String str2 = tVar.f2769c;
        this.f2776c = h(str2, 0, str2.length(), false);
        this.f2777d = tVar.f2770d;
        int i2 = tVar.e;
        this.e = i2 == -1 ? b(tVar.f2767a) : i2;
        i(tVar.f2771f, false);
        ArrayList arrayList = tVar.f2772g;
        String str3 = null;
        if (arrayList != null) {
            list = i(arrayList, true);
        } else {
            list = null;
        }
        this.f2778f = list;
        String str4 = tVar.f2773h;
        this.f2779g = str4 != null ? h(str4, 0, str4.length(), false) : str3;
        this.f2780h = tVar.toString();
    }

    public static void g(StringBuilder sb, List list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            String str = (String) list.get(i2);
            String str2 = (String) list.get(i2 + 1);
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    public static List i(ArrayList arrayList, boolean z2) {
        String str;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            String str2 = (String) arrayList.get(i2);
            if (str2 != null) {
                str = h(str2, 0, str2.length(), z2);
            } else {
                str = null;
            }
            arrayList2.add(str);
        }
        return Collections.unmodifiableList(arrayList2);
    }
}
