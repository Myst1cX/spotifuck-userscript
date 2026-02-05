package S0;

import Y0.a;
import Z0.c;
import Z0.d;
import java.io.Serializable;

public final class b implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public d f884a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f885b = c.f887b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f886c = this;

    /* JADX WARNING: type inference failed for: r1v2, types: [Y0.a, Z0.d, java.lang.Object] */
    public final Object a() {
        Object obj;
        Object obj2 = this.f885b;
        Object obj3 = c.f887b;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this.f886c) {
            obj = this.f885b;
            if (obj == obj3) {
                ? r12 = this.f884a;
                c.b(r12);
                obj = r12.a();
                this.f885b = obj;
                this.f884a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f885b != c.f887b) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }

    public b(a aVar) {
        this.f884a = (d) aVar;
    }
}
