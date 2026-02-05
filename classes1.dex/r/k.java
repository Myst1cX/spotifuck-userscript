package r;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class k {

    /* renamed from: d  reason: collision with root package name */
    public static Object[] f4545d;
    public static int e;

    /* renamed from: f  reason: collision with root package name */
    public static Object[] f4546f;

    /* renamed from: g  reason: collision with root package name */
    public static int f4547g;

    /* renamed from: a  reason: collision with root package name */
    public int[] f4548a = d.f4524a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f4549b = d.f4525b;

    /* renamed from: c  reason: collision with root package name */
    public int f4550c = 0;

    public static void c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (k.class) {
                try {
                    if (f4547g < 10) {
                        objArr[0] = f4546f;
                        objArr[1] = iArr;
                        for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f4546f = objArr;
                        f4547g++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (k.class) {
                try {
                    if (e < 10) {
                        objArr[0] = f4545d;
                        objArr[1] = iArr;
                        for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f4545d = objArr;
                        e++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f4550c != kVar.f4550c) {
                return false;
            }
            int i = 0;
            while (i < this.f4550c) {
                try {
                    Object h2 = h(i);
                    Object j2 = j(i);
                    Object orDefault = kVar.getOrDefault(h2, (Object) null);
                    if (j2 == null) {
                        if (orDefault != null || !kVar.containsKey(h2)) {
                            return false;
                        }
                    } else if (!j2.equals(orDefault)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f4550c != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f4550c) {
                try {
                    Object h3 = h(i2);
                    Object j3 = j(i2);
                    Object obj2 = map.get(h3);
                    if (j3 == null) {
                        if (obj2 != null || !map.containsKey(h3)) {
                            return false;
                        }
                    } else if (!j3.equals(obj2)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, (Object) null);
        if (orDefault == null) {
            return put(obj, obj2);
        }
        return orDefault;
    }

    public final Object remove(Object obj) {
        int e2 = e(obj);
        if (e2 >= 0) {
            return i(e2);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 < 0) {
            return null;
        }
        int i = (e2 << 1) + 1;
        Object[] objArr = this.f4549b;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    public final void a(int i) {
        if (i == 8) {
            synchronized (k.class) {
                try {
                    Object[] objArr = f4546f;
                    if (objArr != null) {
                        this.f4549b = objArr;
                        f4546f = (Object[]) objArr[0];
                        this.f4548a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f4547g--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i == 4) {
            synchronized (k.class) {
                try {
                    Object[] objArr2 = f4545d;
                    if (objArr2 != null) {
                        this.f4549b = objArr2;
                        f4545d = (Object[]) objArr2[0];
                        this.f4548a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        e--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f4548a = new int[i];
        this.f4549b = new Object[(i << 1)];
    }

    public final void b(int i) {
        int i2 = this.f4550c;
        int[] iArr = this.f4548a;
        if (iArr.length < i) {
            Object[] objArr = this.f4549b;
            a(i);
            if (this.f4550c > 0) {
                System.arraycopy(iArr, 0, this.f4548a, 0, i2);
                System.arraycopy(objArr, 0, this.f4549b, 0, i2 << 1);
            }
            c(iArr, objArr, i2);
        }
        if (this.f4550c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i = this.f4550c;
        if (i > 0) {
            int[] iArr = this.f4548a;
            Object[] objArr = this.f4549b;
            this.f4548a = d.f4524a;
            this.f4549b = d.f4525b;
            this.f4550c = 0;
            c(iArr, objArr, i);
        }
        if (this.f4550c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final int d(int i, Object obj) {
        int i2 = this.f4550c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a2 = d.a(i2, i, this.f4548a);
            if (a2 < 0 || obj.equals(this.f4549b[a2 << 1])) {
                return a2;
            }
            int i3 = a2 + 1;
            while (i3 < i2 && this.f4548a[i3] == i) {
                if (obj.equals(this.f4549b[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            int i4 = a2 - 1;
            while (i4 >= 0 && this.f4548a[i4] == i) {
                if (obj.equals(this.f4549b[i4 << 1])) {
                    return i4;
                }
                i4--;
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e(Object obj) {
        if (obj == null) {
            return f();
        }
        return d(obj.hashCode(), obj);
    }

    public final int f() {
        int i = this.f4550c;
        if (i == 0) {
            return -1;
        }
        try {
            int a2 = d.a(i, 0, this.f4548a);
            if (a2 < 0 || this.f4549b[a2 << 1] == null) {
                return a2;
            }
            int i2 = a2 + 1;
            while (i2 < i && this.f4548a[i2] == 0) {
                if (this.f4549b[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            int i3 = a2 - 1;
            while (i3 >= 0 && this.f4548a[i3] == 0) {
                if (this.f4549b[i3 << 1] == null) {
                    return i3;
                }
                i3--;
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int g(Object obj) {
        int i = this.f4550c * 2;
        Object[] objArr = this.f4549b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final Object h(int i) {
        return this.f4549b[i << 1];
    }

    public final int hashCode() {
        int i;
        int[] iArr = this.f4548a;
        Object[] objArr = this.f4549b;
        int i2 = this.f4550c;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj == null) {
                i = 0;
            } else {
                i = obj.hashCode();
            }
            i5 += i ^ i6;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public final Object i(int i) {
        Object[] objArr = this.f4549b;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.f4550c;
        int i4 = 0;
        if (i3 <= 1) {
            c(this.f4548a, objArr, i3);
            this.f4548a = d.f4524a;
            this.f4549b = d.f4525b;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f4548a;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr2 = this.f4549b;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i2, i8 << 1);
                }
                Object[] objArr3 = this.f4549b;
                int i9 = i5 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                a(i6);
                if (i3 == this.f4550c) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f4548a, 0, i);
                        System.arraycopy(objArr, 0, this.f4549b, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.f4548a, i, i11);
                        System.arraycopy(objArr, i10 << 1, this.f4549b, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f4550c) {
            this.f4550c = i4;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public final boolean isEmpty() {
        if (this.f4550c <= 0) {
            return true;
        }
        return false;
    }

    public final Object j(int i) {
        return this.f4549b[(i << 1) + 1];
    }

    public final Object put(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = this.f4550c;
        if (obj == null) {
            i2 = f();
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            i2 = d(hashCode, obj);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            Object[] objArr = this.f4549b;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = ~i2;
        int[] iArr = this.f4548a;
        if (i3 >= iArr.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            Object[] objArr2 = this.f4549b;
            a(i6);
            if (i3 == this.f4550c) {
                int[] iArr2 = this.f4548a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f4549b, 0, objArr2.length);
                }
                c(iArr, objArr2, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f4548a;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f4549b;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f4550c - i5) << 1);
        }
        int i8 = this.f4550c;
        if (i3 == i8) {
            int[] iArr4 = this.f4548a;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr4 = this.f4549b;
                int i9 = i5 << 1;
                objArr4[i9] = obj;
                objArr4[i9 + 1] = obj2;
                this.f4550c = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final int size() {
        return this.f4550c;
    }

    public final boolean containsKey(Object obj) {
        if (e(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (g(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 >= 0) {
            return this.f4549b[(e2 << 1) + 1];
        }
        return obj2;
    }

    public final boolean remove(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 < 0) {
            return false;
        }
        Object j2 = j(e2);
        if (obj2 != j2 && (obj2 == null || !obj2.equals(j2))) {
            return false;
        }
        i(e2);
        return true;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4550c * 28);
        sb.append('{');
        for (int i = 0; i < this.f4550c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object h2 = h(i);
            if (h2 != this) {
                sb.append(h2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object j2 = j(i);
            if (j2 != this) {
                sb.append(j2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int e2 = e(obj);
        if (e2 < 0) {
            return false;
        }
        Object j2 = j(e2);
        if (j2 != obj2 && (obj2 == null || !obj2.equals(j2))) {
            return false;
        }
        int i = (e2 << 1) + 1;
        Object[] objArr = this.f4549b;
        Object obj4 = objArr[i];
        objArr[i] = obj3;
        return true;
    }
}
