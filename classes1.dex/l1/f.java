package l1;

import java.io.IOException;
import r1.e;

public final class f extends a {
    public boolean e;

    public final void close() {
        if (!this.f3592b) {
            if (!this.e) {
                f(false, (IOException) null);
            }
            this.f3592b = true;
        }
    }

    public final long e(e eVar, long j2) {
        if (this.f3592b) {
            throw new IllegalStateException("closed");
        } else if (this.e) {
            return -1;
        } else {
            long e2 = super.e(eVar, 8192);
            if (e2 != -1) {
                return e2;
            }
            this.e = true;
            f(true, (IOException) null);
            return -1;
        }
    }
}
