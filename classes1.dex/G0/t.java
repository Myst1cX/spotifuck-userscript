package g0;

import androidx.preference.Preference;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final int f2592a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2593b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2594c;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (g0.t) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof g0.t
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            g0.t r4 = (g0.t) r4
            int r0 = r4.f2592a
            int r2 = r3.f2592a
            if (r2 != r0) goto L_0x001f
            int r0 = r3.f2593b
            int r2 = r4.f2593b
            if (r0 != r2) goto L_0x001f
            java.lang.String r0 = r3.f2594c
            java.lang.String r4 = r4.f2594c
            boolean r4 = android.text.TextUtils.equals(r0, r4)
            if (r4 == 0) goto L_0x001f
            r1 = 1
        L_0x001f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.t.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.f2594c.hashCode() + ((((527 + this.f2592a) * 31) + this.f2593b) * 31);
    }

    public t(Preference preference) {
        this.f2594c = preference.getClass().getName();
        this.f2592a = preference.f1890D;
        this.f2593b = preference.f1891E;
    }
}
