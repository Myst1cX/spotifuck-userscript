package r1;

import java.io.IOException;
import java.io.InputStream;

public final class d extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4575a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f4576b;

    public /* synthetic */ d(g gVar, int i) {
        this.f4575a = i;
        this.f4576b = gVar;
    }

    public final int read() {
        switch (this.f4575a) {
            case 0:
                e eVar = (e) this.f4576b;
                if (eVar.f4579b > 0) {
                    return eVar.j() & 255;
                }
                return -1;
            default:
                q qVar = (q) this.f4576b;
                if (!qVar.f4600c) {
                    e eVar2 = qVar.f4598a;
                    if (eVar2.f4579b == 0 && qVar.f4599b.e(eVar2, 8192) == -1) {
                        return -1;
                    }
                    return eVar2.j() & 255;
                }
                throw new IOException("closed");
        }
    }

    private final void f() {
    }

    public final int available() {
        switch (this.f4575a) {
            case 0:
                return (int) Math.min(((e) this.f4576b).f4579b, 2147483647L);
            default:
                q qVar = (q) this.f4576b;
                if (!qVar.f4600c) {
                    return (int) Math.min(qVar.f4598a.f4579b, 2147483647L);
                }
                throw new IOException("closed");
        }
    }

    public final void close() {
        switch (this.f4575a) {
            case 0:
                return;
            default:
                ((q) this.f4576b).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f4575a) {
            case 0:
                return ((e) this.f4576b) + ".inputStream()";
            default:
                return ((q) this.f4576b) + ".inputStream()";
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        switch (this.f4575a) {
            case 0:
                return ((e) this.f4576b).i(bArr, i, i2);
            default:
                q qVar = (q) this.f4576b;
                if (!qVar.f4600c) {
                    y.a((long) bArr.length, (long) i, (long) i2);
                    e eVar = qVar.f4598a;
                    if (eVar.f4579b == 0 && qVar.f4599b.e(eVar, 8192) == -1) {
                        return -1;
                    }
                    return eVar.i(bArr, i, i2);
                }
                throw new IOException("closed");
        }
    }
}
