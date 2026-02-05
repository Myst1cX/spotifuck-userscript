package M;

import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f479a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f480b;

    public final int hashCode() {
        int i;
        int i2 = 0;
        Object obj = this.f479a;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        Object obj2 = this.f480b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return i2 ^ i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f479a, this.f479a) || !Objects.equals(bVar.f480b, this.f480b)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "Pair{" + this.f479a + " " + this.f480b + "}";
    }

    public b(Object obj, Object obj2) {
        this.f479a = obj;
        this.f480b = obj2;
    }
}
