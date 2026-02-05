package m1;

import java.util.logging.Level;
import java.util.logging.Logger;
import r1.e;
import r1.q;
import r1.v;
import r1.x;

public final class t implements v {

    /* renamed from: a  reason: collision with root package name */
    public final q f3758a;

    /* renamed from: b  reason: collision with root package name */
    public int f3759b;

    /* renamed from: c  reason: collision with root package name */
    public byte f3760c;

    /* renamed from: d  reason: collision with root package name */
    public int f3761d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public short f3762f;

    public final long e(e eVar, long j2) {
        int i;
        int l2;
        do {
            int i2 = this.e;
            q qVar = this.f3758a;
            if (i2 == 0) {
                qVar.q((long) this.f3762f);
                this.f3762f = 0;
                if ((this.f3760c & 4) != 0) {
                    return -1;
                }
                i = this.f3761d;
                int m2 = u.m(qVar);
                this.e = m2;
                this.f3759b = m2;
                byte i3 = (byte) (qVar.i() & 255);
                this.f3760c = (byte) (qVar.i() & 255);
                Logger logger = u.e;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(f.a(true, this.f3761d, this.f3759b, i3, this.f3760c));
                }
                l2 = qVar.l() & Integer.MAX_VALUE;
                this.f3761d = l2;
                if (i3 != 9) {
                    f.c("%s != TYPE_CONTINUATION", Byte.valueOf(i3));
                    throw null;
                }
            } else {
                long e2 = qVar.e(eVar, Math.min(8192, (long) i2));
                if (e2 == -1) {
                    return -1;
                }
                this.e = (int) (((long) this.e) - e2);
                return e2;
            }
        } while (l2 == i);
        f.c("TYPE_CONTINUATION streamId changed", new Object[0]);
        throw null;
    }

    public final x a() {
        return this.f3758a.f4599b.a();
    }

    public final void close() {
    }

    public t(q qVar) {
        this.f3758a = qVar;
    }
}
