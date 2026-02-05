package T0;

import Q0.E;
import Z0.c;
import a1.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class d implements List, Serializable, RandomAccess, a {

    /* renamed from: a  reason: collision with root package name */
    public static final d f927a = new Object();

    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int hashCode() {
        return 1;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final ListIterator listIterator() {
        return c.f926a;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
        if (!(obj instanceof List) || !((List) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    public final Object get(int i) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        c.e("element", (Void) obj);
        return -1;
    }

    public final Iterator iterator() {
        return c.f926a;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        c.e("element", (Void) obj);
        return -1;
    }

    public final ListIterator listIterator(int i) {
        if (i == 0) {
            return c.f926a;
        }
        throw new IndexOutOfBoundsException(E.e("Index: ", i));
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

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2);
    }

    public final Object[] toArray(Object[] objArr) {
        c.e("array", objArr);
        return c.h(this, objArr);
    }

    public final String toString() {
        return "[]";
    }
}
