package r1;

public abstract class j implements v {

    /* renamed from: a  reason: collision with root package name */
    public final v f4585a;

    public final x a() {
        return this.f4585a.a();
    }

    public void close() {
        this.f4585a.close();
    }

    public long e(e eVar, long j2) {
        return this.f4585a.e(eVar, 8192);
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.f4585a.toString() + ")";
    }

    public j(v vVar) {
        if (vVar != null) {
            this.f4585a = vVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }
}
