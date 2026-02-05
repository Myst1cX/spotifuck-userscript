package T0;

import Z0.c;
import a1.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class e implements Map, Serializable, a {

    /* renamed from: a  reason: collision with root package name */
    public static final e f928a = new Object();

    public final boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        c.e("value", (Void) obj);
        return false;
    }

    public final /* bridge */ Set entrySet() {
        return f.f929a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Map) || !((Map) obj).isEmpty()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ Set keySet() {
        return f.f929a;
    }

    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return d.f927a;
    }
}
