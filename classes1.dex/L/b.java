package L;

import android.text.SpannableStringBuilder;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final String f452b = Character.toString(8206);

    /* renamed from: c  reason: collision with root package name */
    public static final String f453c = Character.toString(8207);

    /* renamed from: d  reason: collision with root package name */
    public static final b f454d = new b(false);
    public static final b e = new b(true);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f455a;

    static {
        j jVar = k.f466c;
    }

    public b(boolean z2) {
        j jVar = k.f464a;
        this.f455a = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0068, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0089, code lost:
        r3 = r3 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.CharSequence r9) {
        /*
            L.a r0 = new L.a
            r0.<init>(r9)
            r9 = 0
            r0.f450c = r9
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x000b:
            int r4 = r0.f450c
            int r5 = r0.f449b
            r6 = 1
            r7 = -1
            if (r4 >= r5) goto L_0x0070
            if (r1 != 0) goto L_0x0070
            java.lang.CharSequence r5 = r0.f448a
            char r4 = r5.charAt(r4)
            r0.f451d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L_0x0037
            int r4 = r0.f450c
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.f450c
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.f450c = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L_0x004b
        L_0x0037:
            int r4 = r0.f450c
            int r4 = r4 + r6
            r0.f450c = r4
            char r4 = r0.f451d
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L_0x0047
            byte[] r5 = L.a.e
            byte r4 = r5[r4]
            goto L_0x004b
        L_0x0047:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L_0x004b:
            if (r4 == 0) goto L_0x006a
            if (r4 == r6) goto L_0x0066
            r5 = 2
            if (r4 == r5) goto L_0x0066
            r5 = 9
            if (r4 == r5) goto L_0x000b
            switch(r4) {
                case 14: goto L_0x0062;
                case 15: goto L_0x0062;
                case 16: goto L_0x005e;
                case 17: goto L_0x005e;
                case 18: goto L_0x005a;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x006e
        L_0x005a:
            int r3 = r3 + -1
            r2 = 0
            goto L_0x000b
        L_0x005e:
            int r3 = r3 + 1
            r2 = 1
            goto L_0x000b
        L_0x0062:
            int r3 = r3 + 1
            r2 = -1
            goto L_0x000b
        L_0x0066:
            if (r3 != 0) goto L_0x006e
        L_0x0068:
            r9 = 1
            goto L_0x008f
        L_0x006a:
            if (r3 != 0) goto L_0x006e
        L_0x006c:
            r9 = -1
            goto L_0x008f
        L_0x006e:
            r1 = r3
            goto L_0x000b
        L_0x0070:
            if (r1 != 0) goto L_0x0073
            goto L_0x008f
        L_0x0073:
            if (r2 == 0) goto L_0x0077
            r9 = r2
            goto L_0x008f
        L_0x0077:
            int r2 = r0.f450c
            if (r2 <= 0) goto L_0x008f
            byte r2 = r0.a()
            switch(r2) {
                case 14: goto L_0x008c;
                case 15: goto L_0x008c;
                case 16: goto L_0x0086;
                case 17: goto L_0x0086;
                case 18: goto L_0x0083;
                default: goto L_0x0082;
            }
        L_0x0082:
            goto L_0x0077
        L_0x0083:
            int r3 = r3 + 1
            goto L_0x0077
        L_0x0086:
            if (r1 != r3) goto L_0x0089
            goto L_0x0068
        L_0x0089:
            int r3 = r3 + -1
            goto L_0x0077
        L_0x008c:
            if (r1 != r3) goto L_0x0089
            goto L_0x006c
        L_0x008f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: L.b.a(java.lang.CharSequence):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        r1 = r1 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(java.lang.CharSequence r7) {
        /*
            L.a r0 = new L.a
            r0.<init>(r7)
            int r7 = r0.f449b
            r0.f450c = r7
            r7 = 0
            r1 = 0
            r2 = 0
        L_0x000c:
            int r3 = r0.f450c
            if (r3 <= 0) goto L_0x0042
            byte r3 = r0.a()
            r4 = -1
            if (r3 == 0) goto L_0x003b
            r5 = 1
            if (r3 == r5) goto L_0x0035
            r6 = 2
            if (r3 == r6) goto L_0x0035
            r6 = 9
            if (r3 == r6) goto L_0x000c
            switch(r3) {
                case 14: goto L_0x0031;
                case 15: goto L_0x0031;
                case 16: goto L_0x002a;
                case 17: goto L_0x002a;
                case 18: goto L_0x0027;
                default: goto L_0x0024;
            }
        L_0x0024:
            if (r2 != 0) goto L_0x000c
            goto L_0x0040
        L_0x0027:
            int r1 = r1 + 1
            goto L_0x000c
        L_0x002a:
            if (r2 != r1) goto L_0x002e
        L_0x002c:
            r7 = 1
            goto L_0x0042
        L_0x002e:
            int r1 = r1 + -1
            goto L_0x000c
        L_0x0031:
            if (r2 != r1) goto L_0x002e
        L_0x0033:
            r7 = -1
            goto L_0x0042
        L_0x0035:
            if (r1 != 0) goto L_0x0038
            goto L_0x002c
        L_0x0038:
            if (r2 != 0) goto L_0x000c
            goto L_0x0040
        L_0x003b:
            if (r1 != 0) goto L_0x003e
            goto L_0x0033
        L_0x003e:
            if (r2 != 0) goto L_0x000c
        L_0x0040:
            r2 = r1
            goto L_0x000c
        L_0x0042:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: L.b.b(java.lang.CharSequence):int");
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        j jVar;
        String str;
        j jVar2;
        char c2;
        j jVar3 = k.f466c;
        if (charSequence == null) {
            return null;
        }
        boolean b2 = jVar3.b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (b2) {
            jVar = k.f465b;
        } else {
            jVar = k.f464a;
        }
        boolean b3 = jVar.b(charSequence, charSequence.length());
        String str2 = "";
        String str3 = f453c;
        String str4 = f452b;
        boolean z2 = this.f455a;
        if (!z2 && (b3 || a(charSequence) == 1)) {
            str = str4;
        } else if (!z2 || (b3 && a(charSequence) != -1)) {
            str = str2;
        } else {
            str = str3;
        }
        spannableStringBuilder.append(str);
        if (b2 != z2) {
            if (b2) {
                c2 = 8235;
            } else {
                c2 = 8234;
            }
            spannableStringBuilder.append(c2);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (b2) {
            jVar2 = k.f465b;
        } else {
            jVar2 = k.f464a;
        }
        boolean b4 = jVar2.b(charSequence, charSequence.length());
        if (!z2 && (b4 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z2 && (!b4 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append(str2);
        return spannableStringBuilder;
    }
}
