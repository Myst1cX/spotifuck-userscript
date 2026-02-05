package r1;

public abstract class i implements u {

    /* renamed from: a  reason: collision with root package name */
    public final u f4584a;

    public final x a() {
        return this.f4584a.a();
    }

    public void b(e eVar, long j2) {
        this.f4584a.b(eVar, j2);
    }

    public void close() {
        this.f4584a.close();
    }

    public void flush() {
        this.f4584a.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.f4584a.toString() + ")";
    }

    public i(u uVar) {
        if (uVar != null) {
            this.f4584a = uVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }
}
