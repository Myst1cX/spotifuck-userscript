package Q0;

import java.util.concurrent.FutureTask;
import t.C0339e;

public final class x extends FutureTask implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public final C0037f f852a;

    public x(C0037f fVar) {
        super(fVar, (Object) null);
        this.f852a = fVar;
    }

    public final int compareTo(Object obj) {
        C0037f fVar = this.f852a;
        int i = fVar.f809r;
        C0037f fVar2 = ((x) obj).f852a;
        int i2 = fVar2.f809r;
        if (i == i2) {
            return fVar.f794a - fVar2.f794a;
        }
        return C0339e.a(i2) - C0339e.a(i);
    }
}
