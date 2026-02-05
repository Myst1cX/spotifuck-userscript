package r;

public final class l implements Cloneable {

    /* renamed from: d  reason: collision with root package name */
    public static final Object f4551d = new Object();

    /* renamed from: a  reason: collision with root package name */
    public int[] f4552a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f4553b;

    /* renamed from: c  reason: collision with root package name */
    public int f4554c;

    public final void a(int i, Object obj) {
        int i2 = this.f4554c;
        if (i2 == 0 || i > this.f4552a[i2 - 1]) {
            if (i2 >= this.f4552a.length) {
                int i3 = (i2 + 1) * 4;
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
                int i6 = i3 / 4;
                int[] iArr = new int[i6];
                Object[] objArr = new Object[i6];
                int[] iArr2 = this.f4552a;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f4553b;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f4552a = iArr;
                this.f4553b = objArr;
            }
            this.f4552a[i2] = i;
            this.f4553b[i2] = obj;
            this.f4554c = i2 + 1;
            return;
        }
        d(i, obj);
    }

    public final Object c(int i, Integer num) {
        Object obj;
        int a2 = d.a(this.f4554c, i, this.f4552a);
        if (a2 < 0 || (obj = this.f4553b[a2]) == f4551d) {
            return num;
        }
        return obj;
    }

    public final void d(int i, Object obj) {
        int a2 = d.a(this.f4554c, i, this.f4552a);
        if (a2 >= 0) {
            this.f4553b[a2] = obj;
            return;
        }
        int i2 = ~a2;
        int i3 = this.f4554c;
        if (i2 < i3) {
            Object[] objArr = this.f4553b;
            if (objArr[i2] == f4551d) {
                this.f4552a[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.f4552a.length) {
            int i4 = (i3 + 1) * 4;
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
            int i7 = i4 / 4;
            int[] iArr = new int[i7];
            Object[] objArr2 = new Object[i7];
            int[] iArr2 = this.f4552a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f4553b;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f4552a = iArr;
            this.f4553b = objArr2;
        }
        int i8 = this.f4554c - i2;
        if (i8 != 0) {
            int[] iArr3 = this.f4552a;
            int i9 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i9, i8);
            Object[] objArr4 = this.f4553b;
            System.arraycopy(objArr4, i2, objArr4, i9, this.f4554c - i2);
        }
        this.f4552a[i2] = i;
        this.f4553b[i2] = obj;
        this.f4554c++;
    }

    public final String toString() {
        int i = this.f4554c;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f4554c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(this.f4552a[i2]);
            sb.append('=');
            Object obj = this.f4553b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public l() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.f4552a = new int[i4];
        this.f4553b = new Object[i4];
    }

    /* renamed from: b */
    public final l clone() {
        try {
            l lVar = (l) super.clone();
            lVar.f4552a = (int[]) this.f4552a.clone();
            lVar.f4553b = (Object[]) this.f4553b.clone();
            return lVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
