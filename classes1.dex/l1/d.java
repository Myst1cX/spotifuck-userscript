package l1;

import h1.c;
import java.net.ProtocolException;
import r1.e;
import r1.k;
import r1.u;
import r1.x;

public final class d implements u {

    /* renamed from: a  reason: collision with root package name */
    public final k f3601a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3602b;

    /* renamed from: c  reason: collision with root package name */
    public long f3603c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f3604d;

    public final x a() {
        return this.f3601a;
    }

    public final void b(e eVar, long j2) {
        if (!this.f3602b) {
            long j3 = eVar.f4579b;
            byte[] bArr = c.f3086a;
            if (j2 < 0 || 0 > j3 || j3 < j2) {
                throw new ArrayIndexOutOfBoundsException();
            } else if (j2 <= this.f3603c) {
                this.f3604d.f3608d.b(eVar, j2);
                this.f3603c -= j2;
            } else {
                throw new ProtocolException("expected " + this.f3603c + " bytes but received " + j2);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final void close() {
        if (!this.f3602b) {
            this.f3602b = true;
            if (this.f3603c <= 0) {
                g gVar = this.f3604d;
                gVar.getClass();
                k kVar = this.f3601a;
                x xVar = kVar.e;
                kVar.e = x.f4612d;
                xVar.a();
                xVar.b();
                gVar.e = 3;
                return;
            }
            throw new ProtocolException("unexpected end of stream");
        }
    }

    public final void flush() {
        if (!this.f3602b) {
            this.f3604d.f3608d.flush();
        }
    }

    public d(g gVar, long j2) {
        this.f3604d = gVar;
        this.f3601a = new k(gVar.f3608d.f4596b.a());
        this.f3603c = j2;
    }
}
