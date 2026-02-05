package M;

public final class d extends c {

    /* renamed from: c  reason: collision with root package name */
    public final Object f483c = new Object();

    public d() {
        super(12);
    }

    public final Object a() {
        Object a2;
        synchronized (this.f483c) {
            a2 = super.a();
        }
        return a2;
    }

    public final boolean c(Object obj) {
        boolean c2;
        synchronized (this.f483c) {
            c2 = super.c(obj);
        }
        return c2;
    }
}
