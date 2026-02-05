package L;

public final class a {
    public static final byte[] e = new byte[1792];

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f448a;

    /* renamed from: b  reason: collision with root package name */
    public final int f449b;

    /* renamed from: c  reason: collision with root package name */
    public int f450c;

    /* renamed from: d  reason: collision with root package name */
    public char f451d;

    static {
        for (int i = 0; i < 1792; i++) {
            e[i] = Character.getDirectionality(i);
        }
    }

    public final byte a() {
        CharSequence charSequence = this.f448a;
        char charAt = charSequence.charAt(this.f450c - 1);
        this.f451d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f450c);
            this.f450c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f450c--;
        char c2 = this.f451d;
        if (c2 < 1792) {
            return e[c2];
        }
        return Character.getDirectionality(c2);
    }

    public a(CharSequence charSequence) {
        this.f448a = charSequence;
        this.f449b = charSequence.length();
    }
}
