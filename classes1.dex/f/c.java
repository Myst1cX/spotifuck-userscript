package F;

import android.graphics.Insets;

public final class c {
    public static final c e = new c(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f225a;

    /* renamed from: b  reason: collision with root package name */
    public final int f226b;

    /* renamed from: c  reason: collision with root package name */
    public final int f227c;

    /* renamed from: d  reason: collision with root package name */
    public final int f228d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f228d == cVar.f228d && this.f225a == cVar.f225a && this.f227c == cVar.f227c && this.f226b == cVar.f226b) {
            return true;
        }
        return false;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f225a, cVar2.f225a), Math.max(cVar.f226b, cVar2.f226b), Math.max(cVar.f227c, cVar2.f227c), Math.max(cVar.f228d, cVar2.f228d));
    }

    public static c b(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return e;
        }
        return new c(i, i2, i3, i4);
    }

    public final Insets d() {
        return b.a(this.f225a, this.f226b, this.f227c, this.f228d);
    }

    public final int hashCode() {
        return (((((this.f225a * 31) + this.f226b) * 31) + this.f227c) * 31) + this.f228d;
    }

    public final String toString() {
        return "Insets{left=" + this.f225a + ", top=" + this.f226b + ", right=" + this.f227c + ", bottom=" + this.f228d + '}';
    }

    public c(int i, int i2, int i3, int i4) {
        this.f225a = i;
        this.f226b = i2;
        this.f227c = i3;
        this.f228d = i4;
    }

    public static c c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }
}
