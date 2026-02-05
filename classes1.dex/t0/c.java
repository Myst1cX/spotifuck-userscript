package T0;

import a1.a;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class c implements ListIterator, a {

    /* renamed from: a  reason: collision with root package name */
    public static final c f926a = new Object();

    public final boolean hasNext() {
        return false;
    }

    public final boolean hasPrevious() {
        return false;
    }

    public final int nextIndex() {
        return 0;
    }

    public final int previousIndex() {
        return -1;
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final Object previous() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
