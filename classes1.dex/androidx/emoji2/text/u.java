package androidx.emoji2.text;

import A.k;
import W.a;
import java.nio.ByteBuffer;

public final class u {

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal f1546d = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    public final int f1547a;

    /* renamed from: b  reason: collision with root package name */
    public final k f1548b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f1549c = 0;

    /* JADX WARNING: type inference failed for: r1v3, types: [N.C, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final W.a c() {
        /*
            r4 = this;
            java.lang.ThreadLocal r0 = f1546d
            java.lang.Object r1 = r0.get()
            W.a r1 = (W.a) r1
            if (r1 != 0) goto L_0x0012
            W.a r1 = new W.a
            r1.<init>()
            r0.set(r1)
        L_0x0012:
            A.k r0 = r4.f1548b
            java.lang.Object r0 = r0.f21f
            W.b r0 = (W.b) r0
            r2 = 6
            int r2 = r0.a(r2)
            if (r2 == 0) goto L_0x005e
            int r3 = r0.f497a
            int r2 = r2 + r3
            java.lang.Object r3 = r0.f500d
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.getInt(r2)
            int r3 = r3 + r2
            int r3 = r3 + 4
            int r2 = r4.f1547a
            int r2 = r2 * 4
            int r2 = r2 + r3
            java.lang.Object r3 = r0.f500d
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.getInt(r2)
            int r3 = r3 + r2
            java.lang.Object r0 = r0.f500d
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r1.f500d = r0
            if (r0 == 0) goto L_0x0057
            r1.f497a = r3
            int r0 = r0.getInt(r3)
            int r3 = r3 - r0
            r1.f498b = r3
            java.lang.Object r0 = r1.f500d
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            short r0 = r0.getShort(r3)
            r1.f499c = r0
            goto L_0x005e
        L_0x0057:
            r0 = 0
            r1.f497a = r0
            r1.f498b = r0
            r1.f499c = r0
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.u.c():W.a");
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        a c2 = c();
        int a2 = c2.a(4);
        if (a2 != 0) {
            i = ((ByteBuffer) c2.f500d).getInt(a2 + c2.f497a);
        } else {
            i = 0;
        }
        sb.append(Integer.toHexString(i));
        sb.append(", codepoints:");
        int b2 = b();
        for (int i2 = 0; i2 < b2; i2++) {
            sb.append(Integer.toHexString(a(i2)));
            sb.append(" ");
        }
        return sb.toString();
    }

    public u(k kVar, int i) {
        this.f1548b = kVar;
        this.f1547a = i;
    }

    public final int a(int i) {
        a c2 = c();
        int a2 = c2.a(16);
        if (a2 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c2.f500d;
        int i2 = a2 + c2.f497a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final int b() {
        a c2 = c();
        int a2 = c2.a(16);
        if (a2 == 0) {
            return 0;
        }
        int i = a2 + c2.f497a;
        return ((ByteBuffer) c2.f500d).getInt(((ByteBuffer) c2.f500d).getInt(i) + i);
    }
}
