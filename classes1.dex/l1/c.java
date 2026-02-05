package l1;

import A.b;
import g1.C0103b;
import g1.s;
import g1.u;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import k1.d;
import r1.e;
import r1.q;

public final class c extends a {
    public final u e;

    /* renamed from: f  reason: collision with root package name */
    public long f3598f = -1;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3599g = true;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ g f3600h;

    public final long e(e eVar, long j2) {
        long j3;
        e eVar2;
        byte h2;
        if (this.f3592b) {
            throw new IllegalStateException("closed");
        } else if (!this.f3599g) {
            return -1;
        } else {
            long j4 = this.f3598f;
            if (j4 == 0 || j4 == -1) {
                g gVar = this.f3600h;
                if (j4 != -1) {
                    gVar.f3607c.n(Long.MAX_VALUE);
                }
                try {
                    q qVar = gVar.f3607c;
                    q qVar2 = gVar.f3607c;
                    qVar.p(1);
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        boolean o2 = qVar.o((long) i2);
                        eVar2 = qVar.f4598a;
                        if (!o2) {
                            break;
                        }
                        h2 = eVar2.h((long) i);
                        if ((h2 < 48 || h2 > 57) && (h2 < 97 || h2 > 102)) {
                            if (h2 < 65) {
                                break;
                            } else if (h2 > 70) {
                                break;
                            }
                        }
                        i = i2;
                    }
                    if (i != 0) {
                        this.f3598f = eVar2.m();
                        String trim = qVar2.n(Long.MAX_VALUE).trim();
                        if (this.f3598f < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f3598f + trim + "\"");
                        }
                        if (this.f3598f == 0) {
                            this.f3599g = false;
                            C0103b bVar = gVar.f3605a.f2805f;
                            b bVar2 = new b(27);
                            while (true) {
                                String n2 = qVar2.n(gVar.f3609f);
                                gVar.f3609f -= (long) n2.length();
                                if (n2.length() == 0) {
                                    break;
                                }
                                C0103b.e.getClass();
                                bVar2.q(n2);
                            }
                            d.d(bVar, this.e, new s(bVar2));
                            f(true, (IOException) null);
                        }
                        if (!this.f3599g) {
                            return -1;
                        }
                        j3 = -1;
                    } else {
                        throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(h2)}));
                    }
                } catch (NumberFormatException e2) {
                    throw new ProtocolException(e2.getMessage());
                }
            } else {
                j3 = -1;
            }
            long e3 = super.e(eVar, Math.min(8192, this.f3598f));
            if (e3 != j3) {
                this.f3598f -= e3;
                return e3;
            }
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            f(false, protocolException);
            throw protocolException;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(g gVar, u uVar) {
        super(gVar);
        this.f3600h = gVar;
        this.e = uVar;
    }

    public final void close() {
        boolean z2;
        if (!this.f3592b) {
            if (this.f3599g) {
                try {
                    z2 = h1.c.p(this, 100, TimeUnit.MILLISECONDS);
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
}
