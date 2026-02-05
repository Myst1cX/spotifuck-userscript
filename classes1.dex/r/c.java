package r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class c implements Collection, Set {
    public static final int[] e = new int[0];

    /* renamed from: f  reason: collision with root package name */
    public static final Object[] f4516f = new Object[0];

    /* renamed from: g  reason: collision with root package name */
    public static Object[] f4517g;

    /* renamed from: h  reason: collision with root package name */
    public static int f4518h;
    public static Object[] i;

    /* renamed from: j  reason: collision with root package name */
    public static int f4519j;

    /* renamed from: a  reason: collision with root package name */
    public int[] f4520a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f4521b;

    /* renamed from: c  reason: collision with root package name */
    public int f4522c;

    /* renamed from: d  reason: collision with root package name */
    public C0323a f4523d;

    public static void b(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                try {
                    if (f4519j < 10) {
                        objArr[0] = i;
                        objArr[1] = iArr;
                        for (int i3 = i2 - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        i = objArr;
                        f4519j++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (c.class) {
                try {
                    if (f4518h < 10) {
                        objArr[0] = f4517g;
                        objArr[1] = iArr;
                        for (int i4 = i2 - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f4517g = objArr;
                        f4518h++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final boolean add(Object obj) {
        int i2;
        int i3;
        if (obj == null) {
            i3 = d();
            i2 = 0;
        } else {
            int hashCode = obj.hashCode();
            i2 = hashCode;
            i3 = c(hashCode, obj);
        }
        if (i3 >= 0) {
            return false;
        }
        int i4 = ~i3;
        int i5 = this.f4522c;
        int[] iArr = this.f4520a;
        if (i5 >= iArr.length) {
            int i6 = 8;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i6 = 4;
            }
            Object[] objArr = this.f4521b;
            a(i6);
            int[] iArr2 = this.f4520a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f4521b, 0, objArr.length);
            }
            b(iArr, objArr, this.f4522c);
        }
        int i7 = this.f4522c;
        if (i4 < i7) {
            int[] iArr3 = this.f4520a;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.f4521b;
            System.arraycopy(objArr2, i4, objArr2, i8, this.f4522c - i4);
        }
        this.f4520a[i4] = i2;
        this.f4521b[i4] = obj;
        this.f4522c++;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f4522c != set.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f4522c) {
                try {
                    if (!set.contains(this.f4521b[i2])) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final Object[] toArray() {
        int i2 = this.f4522c;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f4521b, 0, objArr, 0, i2);
        return objArr;
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (c.class) {
                try {
                    Object[] objArr = i;
                    if (objArr != null) {
                        this.f4521b = objArr;
                        i = (Object[]) objArr[0];
                        this.f4520a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f4519j--;
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i2 == 4) {
            synchronized (c.class) {
                try {
                    Object[] objArr2 = f4517g;
                    if (objArr2 != null) {
                        this.f4521b = objArr2;
                        f4517g = (Object[]) objArr2[0];
                        this.f4520a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f4518h--;
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f4520a = new int[i2];
        this.f4521b = new Object[i2];
    }

    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f4522c;
        int[] iArr = this.f4520a;
        boolean z2 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f4521b;
            a(size);
            int i2 = this.f4522c;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f4520a, 0, i2);
                System.arraycopy(objArr, 0, this.f4521b, 0, this.f4522c);
            }
            b(iArr, objArr, this.f4522c);
        }
        for (Object add : collection) {
            z2 |= add(add);
        }
        return z2;
    }

    public final int c(int i2, Object obj) {
        int i3 = this.f4522c;
        if (i3 == 0) {
            return -1;
        }
        int a2 = d.a(i3, i2, this.f4520a);
        if (a2 < 0 || obj.equals(this.f4521b[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.f4520a[i4] == i2) {
            if (obj.equals(this.f4521b[i4])) {
                return i4;
            }
            i4++;
        }
        int i5 = a2 - 1;
        while (i5 >= 0 && this.f4520a[i5] == i2) {
            if (obj.equals(this.f4521b[i5])) {
                return i5;
            }
            i5--;
        }
        return ~i4;
    }

    public final void clear() {
        int i2 = this.f4522c;
        if (i2 != 0) {
            b(this.f4520a, this.f4521b, i2);
            this.f4520a = e;
            this.f4521b = f4516f;
            this.f4522c = 0;
        }
    }

    public final int d() {
        int i2 = this.f4522c;
        if (i2 == 0) {
            return -1;
        }
        int a2 = d.a(i2, 0, this.f4520a);
        if (a2 < 0 || this.f4521b[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f4520a[i3] == 0) {
            if (this.f4521b[i3] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = a2 - 1;
        while (i4 >= 0 && this.f4520a[i4] == 0) {
            if (this.f4521b[i4] == null) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public final void e(int i2) {
        Object[] objArr = this.f4521b;
        Object obj = objArr[i2];
        int i3 = this.f4522c;
        if (i3 <= 1) {
            b(this.f4520a, objArr, i3);
            this.f4520a = e;
            this.f4521b = f4516f;
            this.f4522c = 0;
            return;
        }
        int[] iArr = this.f4520a;
        int i4 = 8;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            int i5 = i3 - 1;
            this.f4522c = i5;
            if (i2 < i5) {
                int i6 = i2 + 1;
                System.arraycopy(iArr, i6, iArr, i2, i5 - i2);
                Object[] objArr2 = this.f4521b;
                System.arraycopy(objArr2, i6, objArr2, i2, this.f4522c - i2);
            }
            this.f4521b[this.f4522c] = null;
            return;
        }
        if (i3 > 8) {
            i4 = i3 + (i3 >> 1);
        }
        a(i4);
        this.f4522c--;
        if (i2 > 0) {
            System.arraycopy(iArr, 0, this.f4520a, 0, i2);
            System.arraycopy(objArr, 0, this.f4521b, 0, i2);
        }
        int i7 = this.f4522c;
        if (i2 < i7) {
            int i8 = i2 + 1;
            System.arraycopy(iArr, i8, this.f4520a, i2, i7 - i2);
            System.arraycopy(objArr, i8, this.f4521b, i2, this.f4522c - i2);
        }
    }

    public final int hashCode() {
        int[] iArr = this.f4520a;
        int i2 = this.f4522c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return d();
        }
        return c(obj.hashCode(), obj);
    }

    public final boolean isEmpty() {
        if (this.f4522c <= 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        if (this.f4523d == null) {
            this.f4523d = new C0323a(1, this);
        }
        C0323a aVar = this.f4523d;
        if (aVar.f4512b == null) {
            aVar.f4512b = new h(aVar, 1);
        }
        return aVar.f4512b.iterator();
    }

    public final boolean retainAll(Collection collection) {
        boolean z2 = false;
        for (int i2 = this.f4522c - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f4521b[i2])) {
                e(i2);
                z2 = true;
            }
        }
        return z2;
    }

    public final int size() {
        return this.f4522c;
    }

    public c(int i2) {
        if (i2 == 0) {
            this.f4520a = e;
            this.f4521b = f4516f;
        } else {
            a(i2);
        }
        this.f4522c = 0;
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        e(indexOf);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        boolean z2 = false;
        for (Object remove : collection) {
            z2 |= remove(remove);
        }
        return z2;
    }

    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f4522c) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f4522c);
        }
        System.arraycopy(this.f4521b, 0, objArr, 0, this.f4522c);
        int length = objArr.length;
        int i2 = this.f4522c;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4522c * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f4522c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f4521b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
