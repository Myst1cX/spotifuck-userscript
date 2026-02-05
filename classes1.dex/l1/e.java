package l1;

import h1.c;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

public final class e extends a {
    public long e;

    public final void close() {
        boolean z2;
        if (!this.f3592b) {
            if (this.e != 0) {
                try {
                    z2 = c.p(this, 100, TimeUnit.MILLISECONDS);
                } catch (IOException unused) {
                    z2 = false;
                }
                if (!z2) {
                    f(false, (IOException) null);
                }
            }
            this.f3592b = true;
        }
    }

    public final long e(r1.e eVar, long j2) {
        if (!this.f3592b) {
            long j3 = this.e;
            if (j3 == 0) {
                return -1;
            }
            long e2 = super.e(eVar, Math.min(j3, 8192));
            if (e2 != -1) {
                long j4 = this.e - e2;
                this.e = j4;
                if (j4 == 0) {
                    f(true, (IOException) null);
                }
                return e2;
            }
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            f(false, protocolException);
            throw protocolException;
        }
        throw new IllegalStateException("closed");
    }
}
