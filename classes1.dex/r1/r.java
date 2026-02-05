package r1;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f4601a;

    /* renamed from: b  reason: collision with root package name */
    public int f4602b;

    /* renamed from: c  reason: collision with root package name */
    public int f4603c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4604d;
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public r f4605f;

    /* renamed from: g  reason: collision with root package name */
    public r f4606g;

    public r() {
        this.f4601a = new byte[8192];
        this.e = true;
        this.f4604d = false;
    }

    public final r c() {
        this.f4604d = true;
        return new r(this.f4601a, this.f4602b, this.f4603c);
    }

    public final r a() {
        r rVar;
        r rVar2 = this.f4605f;
        if (rVar2 != this) {
            rVar = rVar2;
        } else {
            rVar = null;
        }
        r rVar3 = this.f4606g;
        rVar3.f4605f = rVar2;
        this.f4605f.f4606g = rVar3;
        this.f4605f = null;
        this.f4606g = null;
        return rVar;
    }

    public final void b(r rVar) {
        rVar.f4606g = this;
        rVar.f4605f = this.f4605f;
        this.f4605f.f4606g = rVar;
        this.f4605f = rVar;
    }

    public final void d(r rVar, int i) {
        if (rVar.e) {
            int i2 = rVar.f4603c;
            int i3 = i2 + i;
            byte[] bArr = rVar.f4601a;
            if (i3 > 8192) {
                if (!rVar.f4604d) {
                    int i4 = rVar.f4602b;
                    if (i3 - i4 <= 8192) {
                        System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
                        rVar.f4603c -= rVar.f4602b;
                        rVar.f4602b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f4601a, this.f4602b, bArr, rVar.f4603c, i);
            rVar.f4603c += i;
            this.f4602b += i;
            return;
        }
        throw new IllegalArgumentException();
    }

    public r(byte[] bArr, int i, int i2) {
        this.f4601a = bArr;
        this.f4602b = i;
        this.f4603c = i2;
        this.f4604d = true;
        this.e = false;
    }
}
