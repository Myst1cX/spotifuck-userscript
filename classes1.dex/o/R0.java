package o;

public final class R0 {

    /* renamed from: a  reason: collision with root package name */
    public int f4130a;

    /* renamed from: b  reason: collision with root package name */
    public int f4131b;

    /* renamed from: c  reason: collision with root package name */
    public int f4132c;

    /* renamed from: d  reason: collision with root package name */
    public int f4133d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f4134f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4135g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4136h;

    public final void a(int i, int i2) {
        this.f4132c = i;
        this.f4133d = i2;
        this.f4136h = true;
        if (this.f4135g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f4130a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f4131b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f4130a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f4131b = i2;
        }
    }
}
