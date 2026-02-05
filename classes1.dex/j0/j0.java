package j0;

public final class j0 {

    /* renamed from: a  reason: collision with root package name */
    public int f3425a;

    /* renamed from: b  reason: collision with root package name */
    public int f3426b;

    /* renamed from: c  reason: collision with root package name */
    public int f3427c;

    /* renamed from: d  reason: collision with root package name */
    public int f3428d;
    public int e;

    public final boolean a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f3425a;
        int i5 = 2;
        if ((i4 & 7) != 0) {
            int i6 = this.f3428d;
            int i7 = this.f3426b;
            if (i6 > i7) {
                i3 = 1;
            } else if (i6 == i7) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            if ((i3 & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 112) != 0) {
            int i8 = this.f3428d;
            int i9 = this.f3427c;
            if (i8 > i9) {
                i2 = 1;
            } else if (i8 == i9) {
                i2 = 2;
            } else {
                i2 = 4;
            }
            if (((i2 << 4) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 1792) != 0) {
            int i10 = this.e;
            int i11 = this.f3426b;
            if (i10 > i11) {
                i = 1;
            } else if (i10 == i11) {
                i = 2;
            } else {
                i = 4;
            }
            if (((i << 8) & i4) == 0) {
                return false;
            }
        }
        if ((i4 & 28672) != 0) {
            int i12 = this.e;
            int i13 = this.f3427c;
            if (i12 > i13) {
                i5 = 1;
            } else if (i12 != i13) {
                i5 = 4;
            }
            if ((i4 & (i5 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
