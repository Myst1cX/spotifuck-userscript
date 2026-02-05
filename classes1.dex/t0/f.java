package T0;

import Z0.c;
import a1.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class f implements Set, Serializable, a {

    /* renamed from: a  reason: collision with root package name */
    public static final f f929a = new Object();

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final Object[] toArray() {
        return c.g(this);
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        c.e("element", (Void) obj);
        return false;
    }

    public final boolean containsAll(Collection collection) {
        c.e("elements", collection);
        return collection.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Set) || !((Set) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    public final Iterator iterator() {
        return c.f926a;
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object[] toArray(Object[] objArr) {
        c.e("array", objArr);
        return c.h(this, objArr);
    }

    public final String toString() {
        return "[]";
    }
}
