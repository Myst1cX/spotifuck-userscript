package g1;

import i1.f;
import java.util.logging.Logger;
import r1.g;
import r1.o;
import r1.q;

/* renamed from: g1.f  reason: case insensitive filesystem */
public final class C0107f extends E {

    /* renamed from: a  reason: collision with root package name */
    public final f f2688a;

    /* renamed from: b  reason: collision with root package name */
    public final q f2689b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2690c;

    public final long f() {
        try {
            String str = this.f2690c;
            if (str != null) {
                return Long.parseLong(str);
            }
            return -1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final g g() {
        return this.f2689b;
    }

    public C0107f(f fVar, String str) {
        this.f2688a = fVar;
        this.f2690c = str;
        C0106e eVar = new C0106e(fVar.f3115c[1], fVar);
        Logger logger = o.f4594a;
        this.f2689b = new q(eVar);
    }
}
