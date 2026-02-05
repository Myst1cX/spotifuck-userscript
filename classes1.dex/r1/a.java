package r1;

import java.io.IOException;
import java.io.OutputStream;
import m1.x;

public final class a implements u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4565a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4566b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f4567c;

    public a(x xVar, OutputStream outputStream) {
        this.f4566b = xVar;
        this.f4567c = outputStream;
    }

    public a(x xVar, a aVar) {
        this.f4567c = xVar;
        this.f4566b = aVar;
    }

    public final x a() {
        switch (this.f4565a) {
            case 0:
                return (x) this.f4567c;
            default:
                return (x) this.f4566b;
        }
    }

    public final void b(e eVar, long j2) {
        switch (this.f4565a) {
            case 0:
                y.a(eVar.f4579b, 0, j2);
                while (true) {
                    long j3 = 0;
                    if (j2 > 0) {
                        r rVar = eVar.f4578a;
                        while (true) {
                            if (j3 < 65536) {
                                j3 += (long) (rVar.f4603c - rVar.f4602b);
                                if (j3 >= j2) {
                                    j3 = j2;
                                } else {
                                    rVar = rVar.f4605f;
                                }
                            }
                        }
                        x xVar = (x) this.f4567c;
                        xVar.i();
                        try {
                            ((a) this.f4566b).b(eVar, j3);
                            j2 -= j3;
                            xVar.j(true);
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
                    } else {
                        return;
                    }
                }
            default:
                y.a(eVar.f4579b, 0, j2);
                while (j2 > 0) {
                    ((x) this.f4566b).f();
                    r rVar2 = eVar.f4578a;
                    int min = (int) Math.min(j2, (long) (rVar2.f4603c - rVar2.f4602b));
                    ((OutputStream) this.f4567c).write(rVar2.f4601a, rVar2.f4602b, min);
                    int i = rVar2.f4602b + min;
                    rVar2.f4602b = i;
                    long j4 = (long) min;
                    j2 -= j4;
                    eVar.f4579b -= j4;
                    if (i == rVar2.f4603c) {
                        eVar.f4578a = rVar2.a();
                        s.a(rVar2);
                    }
                }
                return;
        }
    }

    public final void close() {
        switch (this.f4565a) {
            case 0:
                x xVar = (x) this.f4567c;
                xVar.i();
                try {
                    ((a) this.f4566b).close();
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
                ((OutputStream) this.f4567c).close();
                return;
        }
    }

    public final void flush() {
        switch (this.f4565a) {
            case 0:
                x xVar = (x) this.f4567c;
                xVar.i();
                try {
                    ((a) this.f4566b).flush();
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
                ((OutputStream) this.f4567c).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f4565a) {
            case 0:
                return "AsyncTimeout.sink(" + ((a) this.f4566b) + ")";
            default:
                return "sink(" + ((OutputStream) this.f4567c) + ")";
        }
    }
}
