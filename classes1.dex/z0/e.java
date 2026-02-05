package Z0;

public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public final Class f1012a;

    public final Class a() {
        return this.f1012a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (c.a(this.f1012a, ((e) obj).f1012a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1012a.hashCode();
    }

    public final String toString() {
        return this.f1012a.toString() + " (Kotlin reflection is not available)";
    }

    public e(Class cls) {
        this.f1012a = cls;
    }
}
