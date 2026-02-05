package r;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class h implements Set {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4538a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0323a f4539b;

    public /* synthetic */ h(C0323a aVar, int i) {
        this.f4538a = i;
        this.f4539b = aVar;
    }

    public final Object[] toArray(Object[] objArr) {
        switch (this.f4538a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f4539b.i(objArr, 0);
        }
    }

    public final boolean add(Object obj) {
        switch (this.f4538a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean addAll(Collection collection) {
        switch (this.f4538a) {
            case 0:
                C0323a aVar = this.f4539b;
                int d2 = aVar.d();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    switch (aVar.f4514d) {
                        case 0:
                            ((b) aVar.e).put(key, value);
                            break;
                        default:
                            ((c) aVar.e).add(key);
                            break;
                    }
                }
                if (d2 != aVar.d()) {
                    return true;
                }
                return false;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        switch (this.f4538a) {
            case 0:
                this.f4539b.a();
                return;
            default:
                this.f4539b.a();
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r5 = (java.util.Map.Entry) r5;
        r0 = r5.getKey();
        r2 = r4.f4539b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean contains(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f4538a
            switch(r0) {
                case 0: goto L_0x0011;
                default: goto L_0x0005;
            }
        L_0x0005:
            r.a r0 = r4.f4539b
            int r5 = r0.e(r5)
            if (r5 < 0) goto L_0x000f
            r5 = 1
            goto L_0x0010
        L_0x000f:
            r5 = 0
        L_0x0010:
            return r5
        L_0x0011:
            boolean r0 = r5 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 != 0) goto L_0x0017
            goto L_0x003a
        L_0x0017:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r0 = r5.getKey()
            r.a r2 = r4.f4539b
            int r0 = r2.e(r0)
            if (r0 >= 0) goto L_0x0026
            goto L_0x003a
        L_0x0026:
            r3 = 1
            java.lang.Object r0 = r2.b(r0, r3)
            java.lang.Object r5 = r5.getValue()
            if (r0 == r5) goto L_0x0039
            if (r0 == 0) goto L_0x003a
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L_0x003a
        L_0x0039:
            r1 = 1
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r.h.contains(java.lang.Object):boolean");
    }

    public final boolean containsAll(Collection collection) {
        switch (this.f4538a) {
            case 0:
                for (Object contains : collection) {
                    if (!contains(contains)) {
                        return false;
                    }
                }
                return true;
            default:
                Map c2 = this.f4539b.c();
                for (Object containsKey : collection) {
                    if (!c2.containsKey(containsKey)) {
                        return false;
                    }
                }
                return true;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f4538a) {
            case 0:
                return C0323a.h(this, obj);
            default:
                return C0323a.h(this, obj);
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        switch (this.f4538a) {
            case 0:
                C0323a aVar = this.f4539b;
                int i4 = 0;
                for (int d2 = aVar.d() - 1; d2 >= 0; d2--) {
                    Object b2 = aVar.b(d2, 0);
                    Object b3 = aVar.b(d2, 1);
                    if (b2 == null) {
                        i = 0;
                    } else {
                        i = b2.hashCode();
                    }
                    if (b3 == null) {
                        i2 = 0;
                    } else {
                        i2 = b3.hashCode();
                    }
                    i4 += i ^ i2;
                }
                return i4;
            default:
                C0323a aVar2 = this.f4539b;
                int i5 = 0;
                for (int d3 = aVar2.d() - 1; d3 >= 0; d3--) {
                    Object b4 = aVar2.b(d3, 0);
                    if (b4 == null) {
                        i3 = 0;
                    } else {
                        i3 = b4.hashCode();
                    }
                    i5 += i3;
                }
                return i5;
        }
    }

    public final boolean isEmpty() {
        switch (this.f4538a) {
            case 0:
                if (this.f4539b.d() == 0) {
                    return true;
                }
                return false;
            default:
                if (this.f4539b.d() == 0) {
                    return true;
                }
                return false;
        }
    }

    public final Iterator iterator() {
        switch (this.f4538a) {
            case 0:
                return new i(this.f4539b);
            default:
                return new g(this.f4539b, 0);
        }
    }

    public final boolean remove(Object obj) {
        switch (this.f4538a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0323a aVar = this.f4539b;
                int e = aVar.e(obj);
                if (e < 0) {
                    return false;
                }
                aVar.g(e);
                return true;
        }
    }

    public final boolean removeAll(Collection collection) {
        switch (this.f4538a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map c2 = this.f4539b.c();
                int size = c2.size();
                for (Object remove : collection) {
                    c2.remove(remove);
                }
                if (size != c2.size()) {
                    return true;
                }
                return false;
        }
    }

    public final boolean retainAll(Collection collection) {
        switch (this.f4538a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map c2 = this.f4539b.c();
                int size = c2.size();
                Iterator it2 = c2.keySet().iterator();
                while (it2.hasNext()) {
                    if (!collection.contains(it2.next())) {
                        it2.remove();
                    }
                }
                if (size != c2.size()) {
                    return true;
                }
                return false;
        }
    }

    public final int size() {
        switch (this.f4538a) {
            case 0:
                return this.f4539b.d();
            default:
                return this.f4539b.d();
        }
    }

    public final Object[] toArray() {
        switch (this.f4538a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0323a aVar = this.f4539b;
                int d2 = aVar.d();
                Object[] objArr = new Object[d2];
                for (int i = 0; i < d2; i++) {
                    objArr[i] = aVar.b(i, 0);
                }
                return objArr;
        }
    }
}
