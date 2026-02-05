package r;

public final class e implements Cloneable {
    public static final Object e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public boolean f4526a = false;

    /* renamed from: b  reason: collision with root package name */
    public long[] f4527b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f4528c;

    /* renamed from: d  reason: collision with root package name */
    public int f4529d;

    public final void a(long j2, Long l2) {
        int i = this.f4529d;
        if (i == 0 || j2 > this.f4527b[i - 1]) {
            if (this.f4526a && i >= this.f4527b.length) {
                d();
            }
            int i2 = this.f4529d;
            if (i2 >= this.f4527b.length) {
                int i3 = (i2 + 1) * 8;
                int i4 = 4;
                while (true) {
                    if (i4 >= 32) {
                        break;
                    }
                    int i5 = (1 << i4) - 12;
                    if (i3 <= i5) {
                        i3 = i5;
                        break;
                    }
                    i4++;
                }
                int i6 = i3 / 8;
                long[] jArr = new long[i6];
                Object[] objArr = new Object[i6];
                long[] jArr2 = this.f4527b;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f4528c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f4527b = jArr;
                this.f4528c = objArr;
            }
            this.f4527b[i2] = j2;
            this.f4528c[i2] = l2;
            this.f4529d = i2 + 1;
            return;
        }
        f(j2, l2);
    }

    public final void b() {
        int i = this.f4529d;
        Object[] objArr = this.f4528c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f4529d = 0;
        this.f4526a = false;
    }

    public final void d() {
        int i = this.f4529d;
        long[] jArr = this.f4527b;
        Object[] objArr = this.f4528c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != e) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f4526a = false;
        this.f4529d = i2;
    }

    public final Object e(long j2, Long l2) {
        Object obj;
        int b2 = d.b(this.f4527b, this.f4529d, j2);
        if (b2 < 0 || (obj = this.f4528c[b2]) == e) {
            return l2;
        }
        return obj;
    }

    public final void f(long j2, Object obj) {
        int b2 = d.b(this.f4527b, this.f4529d, j2);
        if (b2 >= 0) {
            this.f4528c[b2] = obj;
            return;
        }
        int i = ~b2;
        int i2 = this.f4529d;
        if (i < i2) {
            Object[] objArr = this.f4528c;
            if (objArr[i] == e) {
                this.f4527b[i] = j2;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f4526a && i2 >= this.f4527b.length) {
            d();
            i = ~d.b(this.f4527b, this.f4529d, j2);
        }
        int i3 = this.f4529d;
        if (i3 >= this.f4527b.length) {
            int i4 = (i3 + 1) * 8;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 8;
            long[] jArr = new long[i7];
            Object[] objArr2 = new Object[i7];
            long[] jArr2 = this.f4527b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f4528c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f4527b = jArr;
            this.f4528c = objArr2;
        }
        int i8 = this.f4529d - i;
        if (i8 != 0) {
            long[] jArr3 = this.f4527b;
            int i9 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i9, i8);
            Object[] objArr4 = this.f4528c;
            System.arraycopy(objArr4, i, objArr4, i9, this.f4529d - i);
        }
        this.f4527b[i] = j2;
        this.f4528c[i] = obj;
        this.f4529d++;
    }

    public final int g() {
        if (this.f4526a) {
            d();
        }
        return this.f4529d;
    }

    public final Object h(int i) {
        if (this.f4526a) {
            d();
        }
        return this.f4528c[i];
    }

    public e() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.f4527b = new long[i4];
        this.f4528c = new Object[i4];
    }

    /* renamed from: c */
    public final e clone() {
        try {
            e eVar = (e) super.clone();
            eVar.f4527b = (long[]) this.f4527b.clone();
            eVar.f4528c = (Object[]) this.f4528c.clone();
            return eVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4529d * 28);
        sb.append('{');
        for (int i = 0; i < this.f4529d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f4526a) {
                d();
            }
            sb.append(this.f4527b[i]);
            sb.append('=');
            Object h2 = h(i);
            if (h2 != this) {
                sb.append(h2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
