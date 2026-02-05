package r1;

import java.io.IOException;
import java.io.InputStream;
import m1.x;

public final class b implements v {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4568a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4569b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f4570c;

    public b(x xVar, InputStream inputStream) {
        this.f4569b = xVar;
        this.f4570c = inputStream;
    }

    public b(x xVar, b bVar) {
        this.f4570c = xVar;
        this.f4569b = bVar;
    }

    public final x a() {
        switch (this.f4568a) {
            case 0:
                return (x) this.f4570c;
            default:
                return (x) this.f4569b;
        }
    }

    public final void close() {
        switch (this.f4568a) {
            case 0:
                x xVar = (x) this.f4570c;
                try {
                    ((b) this.f4569b).close();
                    xVar.j(true);
                    return;
                } catch (IOException e) {
                    e = e;
                    if (xVar.k()) {
                        e = xVar.l(e);
                    }
                    throw e;
                } catch (Throwable th) {
                    xVar.j(false);
                    throw th;
                }
            default:
                ((InputStream) this.f4570c).close();
                return;
        }
    }

    public final long e(e eVar, long j2) {
        switch (this.f4568a) {
            case 0:
                x xVar = (x) this.f4570c;
                xVar.i();
                try {
                    long e = ((b) this.f4569b).e(eVar, 8192);
                    xVar.j(true);
                    return e;
                } catch (IOException e2) {
                    e = e2;
                    if (xVar.k()) {
                        e = xVar.l(e);
                    }
                    throw e;
                } catch (Throwable th) {
                    xVar.j(false);
                    throw th;
                }
            default:
                try {
                    ((x) this.f4569b).f();
                    r t2 = eVar.t(1);
                    int read = ((InputStream) this.f4570c).read(t2.f4601a, t2.f4603c, (int) Math.min(8192, (long) (8192 - t2.f4603c)));
                    if (read == -1) {
                        return -1;
                    }
                    t2.f4603c += read;
                    long j3 = (long) read;
                    eVar.f4579b += j3;
                    return j3;
                } catch (AssertionError e3) {
                    if (e3.getCause() == null || e3.getMessage() == null || !e3.getMessage().contains("getsockname failed")) {
                        throw e3;
                    }
                    throw new IOException(e3);
                }
        }
    }

    public final String toString() {
        switch (this.f4568a) {
            case 0:
                return "AsyncTimeout.source(" + ((b) this.f4569b) + ")";
            default:
                return "source(" + ((InputStream) this.f4570c) + ")";
        }
    }
}
