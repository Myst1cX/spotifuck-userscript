package r0;

import android.animation.TimeInterpolator;

/* renamed from: r0.c  reason: case insensitive filesystem */
public final class C0326c {

    /* renamed from: a  reason: collision with root package name */
    public long f4561a;

    /* renamed from: b  reason: collision with root package name */
    public long f4562b;

    /* renamed from: c  reason: collision with root package name */
    public TimeInterpolator f4563c;

    /* renamed from: d  reason: collision with root package name */
    public int f4564d;
    public int e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f4563c;
        if (timeInterpolator != null) {
            return timeInterpolator;
        }
        return C0324a.f4556b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0326c)) {
            return false;
        }
        C0326c cVar = (C0326c) obj;
        if (this.f4561a == cVar.f4561a && this.f4562b == cVar.f4562b && this.f4564d == cVar.f4564d && this.e == cVar.e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f4561a;
        long j3 = this.f4562b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.f4564d) * 31) + this.e;
    }

    public final String toString() {
        return "\n" + C0326c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f4561a + " duration: " + this.f4562b + " interpolator: " + a().getClass() + " repeatCount: " + this.f4564d + " repeatMode: " + this.e + "}\n";
    }
}
