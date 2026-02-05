package q;

import java.util.Map;

public final class c implements Map.Entry {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4471a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4472b;

    /* renamed from: c  reason: collision with root package name */
    public c f4473c;

    /* renamed from: d  reason: collision with root package name */
    public c f4474d;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f4471a.equals(cVar.f4471a) || !this.f4472b.equals(cVar.f4472b)) {
            return false;
        }
        return true;
    }

    public final Object getKey() {
        return this.f4471a;
    }

    public final Object getValue() {
        return this.f4472b;
    }

    public final int hashCode() {
        return this.f4471a.hashCode() ^ this.f4472b.hashCode();
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f4471a + "=" + this.f4472b;
    }

    public c(Object obj, Object obj2) {
        this.f4471a = obj;
        this.f4472b = obj2;
    }
}
