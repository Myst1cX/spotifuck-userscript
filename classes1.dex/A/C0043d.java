package a;

/* renamed from: a.d  reason: case insensitive filesystem */
public final class C0043d {

    /* renamed from: a  reason: collision with root package name */
    public final long f1026a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1027b;

    public final String toString() {
        return this.f1026a + "/" + this.f1027b;
    }

    public C0043d(long j2, long j3) {
        if (j3 == 0) {
            this.f1026a = 0;
            this.f1027b = 1;
            return;
        }
        this.f1026a = j2;
        this.f1027b = j3;
    }
}
