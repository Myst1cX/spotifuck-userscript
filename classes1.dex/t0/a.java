package T0;

import Z0.c;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class a extends AbstractList implements List, a1.a {

    /* renamed from: d  reason: collision with root package name */
    public static final Object[] f922d = new Object[0];

    /* renamed from: a  reason: collision with root package name */
    public int f923a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f924b = f922d;

    /* renamed from: c  reason: collision with root package name */
    public int f925c;

    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.f925c;
        if (i < 0 || i > i3) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i3);
        } else if (i == i3) {
            addLast(obj);
        } else if (i == 0) {
            addFirst(obj);
        } else {
            b(i3 + 1);
            int d2 = d(this.f923a + i);
            int i4 = this.f925c;
            if (i < ((i4 + 1) >> 1)) {
                if (d2 == 0) {
                    Object[] objArr = this.f924b;
                    c.e("<this>", objArr);
                    d2 = objArr.length;
                }
                int i5 = d2 - 1;
                int i6 = this.f923a;
                if (i6 == 0) {
                    Object[] objArr2 = this.f924b;
                    c.e("<this>", objArr2);
                    i2 = objArr2.length - 1;
                } else {
                    i2 = i6 - 1;
                }
                int i7 = this.f923a;
                if (i5 >= i7) {
                    Object[] objArr3 = this.f924b;
                    objArr3[i2] = objArr3[i7];
                    b.f(objArr3, objArr3, i7, i7 + 1, i5 + 1);
                } else {
                    Object[] objArr4 = this.f924b;
                    b.f(objArr4, objArr4, i7 - 1, i7, objArr4.length);
                    Object[] objArr5 = this.f924b;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    b.f(objArr5, objArr5, 0, 1, i5 + 1);
                }
                this.f924b[i5] = obj;
                this.f923a = i2;
            } else {
                int d3 = d(this.f923a + i4);
                if (d2 < d3) {
                    Object[] objArr6 = this.f924b;
                    b.f(objArr6, objArr6, d2 + 1, d2, d3);
                } else {
                    Object[] objArr7 = this.f924b;
                    b.f(objArr7, objArr7, 1, 0, d3);
                    Object[] objArr8 = this.f924b;
                    objArr8[0] = objArr8[objArr8.length - 1];
                    b.f(objArr8, objArr8, d2 + 1, d2, objArr8.length - 1);
                }
                this.f924b[d2] = obj;
            }
            this.f925c++;
        }
    }

    public final boolean addAll(int i, Collection collection) {
        c.e("elements", collection);
        int i2 = this.f925c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        } else if (collection.isEmpty()) {
            return false;
        } else {
            int i3 = this.f925c;
            if (i == i3) {
                return addAll(collection);
            }
            b(collection.size() + i3);
            int d2 = d(this.f923a + this.f925c);
            int d3 = d(this.f923a + i);
            int size = collection.size();
            if (i < ((this.f925c + 1) >> 1)) {
                int i4 = this.f923a;
                int i5 = i4 - size;
                if (d3 < i4) {
                    Object[] objArr = this.f924b;
                    b.f(objArr, objArr, i5, i4, objArr.length);
                    if (size >= d3) {
                        Object[] objArr2 = this.f924b;
                        b.f(objArr2, objArr2, objArr2.length - size, 0, d3);
                    } else {
                        Object[] objArr3 = this.f924b;
                        b.f(objArr3, objArr3, objArr3.length - size, 0, size);
                        Object[] objArr4 = this.f924b;
                        b.f(objArr4, objArr4, 0, size, d3);
                    }
                } else if (i5 >= 0) {
                    Object[] objArr5 = this.f924b;
                    b.f(objArr5, objArr5, i5, i4, d3);
                } else {
                    Object[] objArr6 = this.f924b;
                    i5 += objArr6.length;
                    int i6 = d3 - i4;
                    int length = objArr6.length - i5;
                    if (length >= i6) {
                        b.f(objArr6, objArr6, i5, i4, d3);
                    } else {
                        b.f(objArr6, objArr6, i5, i4, i4 + length);
                        Object[] objArr7 = this.f924b;
                        b.f(objArr7, objArr7, 0, this.f923a + length, d3);
                    }
                }
                this.f923a = i5;
                int i7 = d3 - size;
                if (i7 < 0) {
                    i7 += this.f924b.length;
                }
                a(i7, collection);
            } else {
                int i8 = d3 + size;
                if (d3 < d2) {
                    int i9 = size + d2;
                    Object[] objArr8 = this.f924b;
                    if (i9 <= objArr8.length) {
                        b.f(objArr8, objArr8, i8, d3, d2);
                    } else if (i8 >= objArr8.length) {
                        b.f(objArr8, objArr8, i8 - objArr8.length, d3, d2);
                    } else {
                        int length2 = d2 - (i9 - objArr8.length);
                        b.f(objArr8, objArr8, 0, length2, d2);
                        Object[] objArr9 = this.f924b;
                        b.f(objArr9, objArr9, i8, d3, length2);
                    }
                } else {
                    Object[] objArr10 = this.f924b;
                    b.f(objArr10, objArr10, size, 0, d2);
                    Object[] objArr11 = this.f924b;
                    if (i8 >= objArr11.length) {
                        b.f(objArr11, objArr11, i8 - objArr11.length, d3, objArr11.length);
                    } else {
                        b.f(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                        Object[] objArr12 = this.f924b;
                        b.f(objArr12, objArr12, i8, d3, objArr12.length - size);
                    }
                }
                a(d3, collection);
            }
            return true;
        }
    }

    public final Object remove(int i) {
        int i2 = this.f925c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        } else if (i == i2 - 1) {
            return removeLast();
        } else {
            if (i == 0) {
                return removeFirst();
            }
            int d2 = d(this.f923a + i);
            Object[] objArr = this.f924b;
            Object obj = objArr[d2];
            int i3 = this.f925c;
            if (i < (i3 >> 1)) {
                int i4 = this.f923a;
                if (d2 >= i4) {
                    b.f(objArr, objArr, i4 + 1, i4, d2);
                } else {
                    b.f(objArr, objArr, 1, 0, d2);
                    Object[] objArr2 = this.f924b;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i5 = this.f923a;
                    b.f(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
                }
                Object[] objArr3 = this.f924b;
                int i6 = this.f923a;
                objArr3[i6] = null;
                this.f923a = c(i6);
            } else {
                int d3 = d((i3 - 1) + this.f923a);
                if (d2 <= d3) {
                    Object[] objArr4 = this.f924b;
                    b.f(objArr4, objArr4, d2, d2 + 1, d3 + 1);
                } else {
                    Object[] objArr5 = this.f924b;
                    b.f(objArr5, objArr5, d2, d2 + 1, objArr5.length);
                    Object[] objArr6 = this.f924b;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    b.f(objArr6, objArr6, 0, 1, d3 + 1);
                }
                this.f924b[d3] = null;
            }
            this.f925c--;
            return obj;
        }
    }

    public final Object[] toArray() {
        return toArray(new Object[this.f925c]);
    }

    public final void addFirst(Object obj) {
        b(this.f925c + 1);
        int i = this.f923a;
        if (i == 0) {
            Object[] objArr = this.f924b;
            c.e("<this>", objArr);
            i = objArr.length;
        }
        int i2 = i - 1;
        this.f923a = i2;
        this.f924b[i2] = obj;
        this.f925c++;
    }

    public final void addLast(Object obj) {
        b(this.f925c + 1);
        this.f924b[d(this.f923a + this.f925c)] = obj;
        this.f925c++;
    }

    public final void b(int i) {
        if (i >= 0) {
            Object[] objArr = this.f924b;
            if (i > objArr.length) {
                if (objArr == f922d) {
                    if (i < 10) {
                        i = 10;
                    }
                    this.f924b = new Object[i];
                    return;
                }
                int length = objArr.length;
                int i2 = length + (length >> 1);
                if (i2 - i < 0) {
                    i2 = i;
                }
                if (i2 - 2147483639 > 0) {
                    if (i > 2147483639) {
                        i2 = Integer.MAX_VALUE;
                    } else {
                        i2 = 2147483639;
                    }
                }
                Object[] objArr2 = new Object[i2];
                b.f(objArr, objArr2, 0, this.f923a, objArr.length);
                Object[] objArr3 = this.f924b;
                int length2 = objArr3.length;
                int i3 = this.f923a;
                b.f(objArr3, objArr2, length2 - i3, 0, i3);
                this.f923a = 0;
                this.f924b = objArr2;
                return;
            }
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int c(int i) {
        Object[] objArr = this.f924b;
        c.e("<this>", objArr);
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final void clear() {
        int d2 = d(this.f923a + this.f925c);
        int i = this.f923a;
        if (i < d2) {
            Object[] objArr = this.f924b;
            c.e("<this>", objArr);
            Arrays.fill(objArr, i, d2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f924b;
            Arrays.fill(objArr2, this.f923a, objArr2.length, (Object) null);
            Object[] objArr3 = this.f924b;
            c.e("<this>", objArr3);
            Arrays.fill(objArr3, 0, d2, (Object) null);
        }
        this.f923a = 0;
        this.f925c = 0;
    }

    public final int d(int i) {
        Object[] objArr = this.f924b;
        if (i >= objArr.length) {
            return i - objArr.length;
        }
        return i;
    }

    public final Object get(int i) {
        int i2 = this.f925c;
        if (i >= 0 && i < i2) {
            return this.f924b[d(this.f923a + i)];
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }

    public final int indexOf(Object obj) {
        int i;
        int d2 = d(this.f923a + this.f925c);
        int i2 = this.f923a;
        if (i2 < d2) {
            while (i2 < d2) {
                if (c.a(obj, this.f924b[i2])) {
                    i = this.f923a;
                } else {
                    i2++;
                }
            }
            return -1;
        } else if (i2 < d2) {
            return -1;
        } else {
            int length = this.f924b.length;
            while (true) {
                if (i2 >= length) {
                    int i3 = 0;
                    while (i3 < d2) {
                        if (c.a(obj, this.f924b[i3])) {
                            i2 = i3 + this.f924b.length;
                            i = this.f923a;
                        } else {
                            i3++;
                        }
                    }
                    return -1;
                } else if (c.a(obj, this.f924b[i2])) {
                    i = this.f923a;
                    break;
                } else {
                    i2++;
                }
            }
        }
        return i2 - i;
    }

    public final boolean isEmpty() {
        if (this.f925c == 0) {
            return true;
        }
        return false;
    }

    public final int lastIndexOf(Object obj) {
        int i;
        int i2;
        int d2 = d(this.f923a + this.f925c);
        int i3 = this.f923a;
        if (i3 < d2) {
            i = d2 - 1;
            if (i3 <= i) {
                while (!c.a(obj, this.f924b[i])) {
                    if (i != i3) {
                        i--;
                    }
                }
                i2 = this.f923a;
            }
            return -1;
        }
        if (i3 > d2) {
            int i4 = d2 - 1;
            while (true) {
                if (-1 >= i4) {
                    Object[] objArr = this.f924b;
                    c.e("<this>", objArr);
                    int length = objArr.length - 1;
                    int i5 = this.f923a;
                    if (i5 <= length) {
                        while (!c.a(obj, this.f924b[i])) {
                            if (i != i5) {
                                length = i - 1;
                            }
                        }
                        i2 = this.f923a;
                    }
                } else if (c.a(obj, this.f924b[i4])) {
                    i = i4 + this.f924b.length;
                    i2 = this.f923a;
                    break;
                } else {
                    i4--;
                }
            }
        }
        return -1;
        return i - i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean removeAll(java.util.Collection r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            Z0.c.e(r0, r12)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0093
            java.lang.Object[] r0 = r11.f924b
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            goto L_0x0093
        L_0x0013:
            int r0 = r11.f923a
            int r2 = r11.f925c
            int r0 = r0 + r2
            int r0 = r11.d(r0)
            int r2 = r11.f923a
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x0046
            r5 = r2
        L_0x0023:
            if (r2 >= r0) goto L_0x003b
            java.lang.Object[] r6 = r11.f924b
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 != 0) goto L_0x0037
            java.lang.Object[] r7 = r11.f924b
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x0038
        L_0x0037:
            r1 = 1
        L_0x0038:
            int r2 = r2 + 1
            goto L_0x0023
        L_0x003b:
            java.lang.Object[] r12 = r11.f924b
            java.lang.String r2 = "<this>"
            Z0.c.e(r2, r12)
            java.util.Arrays.fill(r12, r5, r0, r3)
            goto L_0x0086
        L_0x0046:
            java.lang.Object[] r5 = r11.f924b
            int r5 = r5.length
            r6 = r2
            r7 = 0
        L_0x004b:
            if (r2 >= r5) goto L_0x0065
            java.lang.Object[] r8 = r11.f924b
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 != 0) goto L_0x0061
            java.lang.Object[] r8 = r11.f924b
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0062
        L_0x0061:
            r7 = 1
        L_0x0062:
            int r2 = r2 + 1
            goto L_0x004b
        L_0x0065:
            int r2 = r11.d(r6)
            r5 = r2
        L_0x006a:
            if (r1 >= r0) goto L_0x0085
            java.lang.Object[] r2 = r11.f924b
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 != 0) goto L_0x0081
            java.lang.Object[] r2 = r11.f924b
            r2[r5] = r6
            int r5 = r11.c(r5)
            goto L_0x0082
        L_0x0081:
            r7 = 1
        L_0x0082:
            int r1 = r1 + 1
            goto L_0x006a
        L_0x0085:
            r1 = r7
        L_0x0086:
            if (r1 == 0) goto L_0x0093
            int r12 = r11.f923a
            int r5 = r5 - r12
            if (r5 >= 0) goto L_0x0091
            java.lang.Object[] r12 = r11.f924b
            int r12 = r12.length
            int r5 = r5 + r12
        L_0x0091:
            r11.f925c = r5
        L_0x0093:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.a.removeAll(java.util.Collection):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean retainAll(java.util.Collection r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            Z0.c.e(r0, r12)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0093
            java.lang.Object[] r0 = r11.f924b
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            goto L_0x0093
        L_0x0013:
            int r0 = r11.f923a
            int r2 = r11.f925c
            int r0 = r0 + r2
            int r0 = r11.d(r0)
            int r2 = r11.f923a
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x0046
            r5 = r2
        L_0x0023:
            if (r2 >= r0) goto L_0x003b
            java.lang.Object[] r6 = r11.f924b
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L_0x0037
            java.lang.Object[] r7 = r11.f924b
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x0038
        L_0x0037:
            r1 = 1
        L_0x0038:
            int r2 = r2 + 1
            goto L_0x0023
        L_0x003b:
            java.lang.Object[] r12 = r11.f924b
            java.lang.String r2 = "<this>"
            Z0.c.e(r2, r12)
            java.util.Arrays.fill(r12, r5, r0, r3)
            goto L_0x0086
        L_0x0046:
            java.lang.Object[] r5 = r11.f924b
            int r5 = r5.length
            r6 = r2
            r7 = 0
        L_0x004b:
            if (r2 >= r5) goto L_0x0065
            java.lang.Object[] r8 = r11.f924b
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x0061
            java.lang.Object[] r8 = r11.f924b
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0062
        L_0x0061:
            r7 = 1
        L_0x0062:
            int r2 = r2 + 1
            goto L_0x004b
        L_0x0065:
            int r2 = r11.d(r6)
            r5 = r2
        L_0x006a:
            if (r1 >= r0) goto L_0x0085
            java.lang.Object[] r2 = r11.f924b
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 == 0) goto L_0x0081
            java.lang.Object[] r2 = r11.f924b
            r2[r5] = r6
            int r5 = r11.c(r5)
            goto L_0x0082
        L_0x0081:
            r7 = 1
        L_0x0082:
            int r1 = r1 + 1
            goto L_0x006a
        L_0x0085:
            r1 = r7
        L_0x0086:
            if (r1 == 0) goto L_0x0093
            int r12 = r11.f923a
            int r5 = r5 - r12
            if (r5 >= 0) goto L_0x0091
            java.lang.Object[] r12 = r11.f924b
            int r12 = r12.length
            int r5 = r5 + r12
        L_0x0091:
            r11.f925c = r5
        L_0x0093:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.a.retainAll(java.util.Collection):boolean");
    }

    public final Object set(int i, Object obj) {
        int i2 = this.f925c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
        int d2 = d(this.f923a + i);
        Object[] objArr = this.f924b;
        Object obj2 = objArr[d2];
        objArr[d2] = obj;
        return obj2;
    }

    public final int size() {
        return this.f925c;
    }

    public final void a(int i, Collection collection) {
        Iterator it2 = collection.iterator();
        int length = this.f924b.length;
        while (i < length && it2.hasNext()) {
            this.f924b[i] = it2.next();
            i++;
        }
        int i2 = this.f923a;
        for (int i3 = 0; i3 < i2 && it2.hasNext(); i3++) {
            this.f924b[i3] = it2.next();
        }
        this.f925c = collection.size() + this.f925c;
    }

    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            Object[] objArr = this.f924b;
            int i = this.f923a;
            Object obj = objArr[i];
            objArr[i] = null;
            this.f923a = c(i);
            this.f925c--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            int d2 = d((this.f925c - 1) + this.f923a);
            Object[] objArr = this.f924b;
            Object obj = objArr[d2];
            objArr[d2] = null;
            this.f925c--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object[] toArray(Object[] objArr) {
        c.e("array", objArr);
        int length = objArr.length;
        int i = this.f925c;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            c.c("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>", newInstance);
            objArr = (Object[]) newInstance;
        }
        int d2 = d(this.f923a + this.f925c);
        int i2 = this.f923a;
        if (i2 < d2) {
            b.f(this.f924b, objArr, 0, i2, d2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f924b;
            b.f(objArr2, objArr, 0, this.f923a, objArr2.length);
            Object[] objArr3 = this.f924b;
            b.f(objArr3, objArr, objArr3.length - this.f923a, 0, d2);
        }
        int length2 = objArr.length;
        int i3 = this.f925c;
        if (length2 > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    public final boolean addAll(Collection collection) {
        c.e("elements", collection);
        if (collection.isEmpty()) {
            return false;
        }
        b(collection.size() + this.f925c);
        a(d(this.f923a + this.f925c), collection);
        return true;
    }
}
