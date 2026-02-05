package r;

import java.util.Collection;
import java.util.Iterator;

public final class j implements Collection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0323a f4544a;

    public final Object[] toArray() {
        C0323a aVar = this.f4544a;
        int d2 = aVar.d();
        Object[] objArr = new Object[d2];
        for (int i = 0; i < d2; i++) {
            objArr[i] = aVar.b(i, 1);
        }
        return objArr;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f4544a.a();
    }

    public final boolean contains(Object obj) {
        if (this.f4544a.f(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        if (this.f4544a.d() == 0) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new g(this.f4544a, 1);
    }

    public final boolean remove(Object obj) {
        C0323a aVar = this.f4544a;
        int f2 = aVar.f(obj);
        if (f2 < 0) {
            return false;
        }
        aVar.g(f2);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        C0323a aVar = this.f4544a;
        int d2 = aVar.d();
        int i = 0;
        boolean z2 = false;
        while (i < d2) {
            if (collection.contains(aVar.b(i, 1))) {
                aVar.g(i);
                i--;
                d2--;
                z2 = true;
            }
            i++;
        }
        return z2;
    }

    public final boolean retainAll(Collection collection) {
        C0323a aVar = this.f4544a;
        int d2 = aVar.d();
        int i = 0;
        boolean z2 = false;
        while (i < d2) {
            if (!collection.contains(aVar.b(i, 1))) {
                aVar.g(i);
                i--;
                d2--;
                z2 = true;
            }
            i++;
        }
        return z2;
    }

    public final int size() {
        return this.f4544a.d();
    }

    public j(C0323a aVar) {
        this.f4544a = aVar;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final Object[] toArray(Object[] objArr) {
        return this.f4544a.i(objArr, 1);
    }
}
