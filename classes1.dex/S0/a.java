package S0;

import Z0.c;
import java.io.Serializable;

public final class a implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Object f882a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f883b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (c.a(this.f882a, aVar.f882a) && c.a(this.f883b, aVar.f883b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        Object obj = this.f882a;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        int i3 = i * 31;
        Object obj2 = this.f883b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "(" + this.f882a + ", " + this.f883b + ')';
    }

    public a(Object obj, Object obj2) {
        this.f882a = obj;
        this.f883b = obj2;
    }
}
