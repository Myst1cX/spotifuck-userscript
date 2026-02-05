package j0;

/* renamed from: j0.c  reason: case insensitive filesystem */
public final class C0141c {

    /* renamed from: a  reason: collision with root package name */
    public long f3360a = 0;

    /* renamed from: b  reason: collision with root package name */
    public C0141c f3361b;

    public final void a(int i) {
        if (i >= 64) {
            C0141c cVar = this.f3361b;
            if (cVar != null) {
                cVar.a(i - 64);
                return;
            }
            return;
        }
        this.f3360a &= ~(1 << i);
    }

    public final int b(int i) {
        C0141c cVar = this.f3361b;
        if (cVar == null) {
            if (i >= 64) {
                return Long.bitCount(this.f3360a);
            }
            return Long.bitCount(this.f3360a & ((1 << i) - 1));
        } else if (i < 64) {
            return Long.bitCount(this.f3360a & ((1 << i) - 1));
        } else {
            return Long.bitCount(this.f3360a) + cVar.b(i - 64);
        }
    }

    public final void c() {
        if (this.f3361b == null) {
            this.f3361b = new C0141c();
        }
    }

    public final boolean d(int i) {
        if (i >= 64) {
            c();
            return this.f3361b.d(i - 64);
        } else if ((this.f3360a & (1 << i)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final void e(int i, boolean z2) {
        boolean z3;
        if (i >= 64) {
            c();
            this.f3361b.e(i - 64, z2);
            return;
        }
        long j2 = this.f3360a;
        if ((Long.MIN_VALUE & j2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        long j3 = (1 << i) - 1;
        this.f3360a = ((j2 & (~j3)) << 1) | (j2 & j3);
        if (z2) {
            h(i);
        } else {
            a(i);
        }
        if (z3 || this.f3361b != null) {
            c();
            this.f3361b.e(0, z3);
        }
    }

    public final boolean f(int i) {
        boolean z2;
        if (i >= 64) {
            c();
            return this.f3361b.f(i - 64);
        }
        long j2 = 1 << i;
        long j3 = this.f3360a;
        if ((j3 & j2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j4 = j3 & (~j2);
        this.f3360a = j4;
        long j5 = j2 - 1;
        this.f3360a = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
        C0141c cVar = this.f3361b;
        if (cVar != null) {
            if (cVar.d(0)) {
                h(63);
            }
            this.f3361b.f(0);
        }
        return z2;
    }

    public final void g() {
        this.f3360a = 0;
        C0141c cVar = this.f3361b;
        if (cVar != null) {
            cVar.g();
        }
    }

    public final void h(int i) {
        if (i >= 64) {
            c();
            this.f3361b.h(i - 64);
            return;
        }
        this.f3360a |= 1 << i;
    }

    public final String toString() {
        if (this.f3361b == null) {
            return Long.toBinaryString(this.f3360a);
        }
        return this.f3361b.toString() + "xx" + Long.toBinaryString(this.f3360a);
    }
}
