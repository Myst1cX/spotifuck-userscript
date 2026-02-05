package r1;

import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.logging.Logger;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class l implements v {

    /* renamed from: a  reason: collision with root package name */
    public int f4586a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final q f4587b;

    /* renamed from: c  reason: collision with root package name */
    public final Inflater f4588c;

    /* renamed from: d  reason: collision with root package name */
    public final m f4589d;
    public final CRC32 e = new CRC32();

    public static void f(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }

    public final x a() {
        return this.f4587b.f4599b.a();
    }

    public final void close() {
        this.f4589d.close();
    }

    public final long e(e eVar, long j2) {
        q qVar;
        boolean z2;
        e eVar2;
        long j3;
        e eVar3 = eVar;
        int i = this.f4586a;
        CRC32 crc32 = this.e;
        q qVar2 = this.f4587b;
        if (i == 0) {
            qVar2.p(10);
            e eVar4 = qVar2.f4598a;
            byte h2 = eVar4.h(3);
            if (((h2 >> 1) & 1) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                eVar2 = eVar4;
                g(eVar4, 0, 10);
            } else {
                eVar2 = eVar4;
            }
            f("ID1ID2", 8075, qVar2.m());
            qVar2.q(8);
            if (((h2 >> 2) & 1) == 1) {
                qVar2.p(2);
                if (z2) {
                    g(eVar2, 0, 2);
                }
                short o2 = eVar2.o();
                Charset charset = y.f4616a;
                long j4 = (long) ((short) (((o2 & 255) << 8) | ((o2 & 65280) >>> 8)));
                qVar2.p(j4);
                if (z2) {
                    g(eVar2, 0, j4);
                    j3 = j4;
                } else {
                    j3 = j4;
                }
                qVar2.q(j3);
            }
            if (((h2 >> 3) & 1) == 1) {
                q qVar3 = qVar2;
                long g2 = qVar2.g((byte) 0, 0, Long.MAX_VALUE);
                if (g2 != -1) {
                    if (z2) {
                        qVar = qVar3;
                        g(eVar2, 0, g2 + 1);
                    } else {
                        qVar = qVar3;
                    }
                    qVar.q(g2 + 1);
                } else {
                    throw new EOFException();
                }
            } else {
                qVar = qVar2;
            }
            if (((h2 >> 4) & 1) == 1) {
                long g3 = qVar.g((byte) 0, 0, Long.MAX_VALUE);
                if (g3 != -1) {
                    if (z2) {
                        g(eVar2, 0, g3 + 1);
                    }
                    qVar.q(g3 + 1);
                } else {
                    throw new EOFException();
                }
            }
            if (z2) {
                qVar.p(2);
                short o3 = eVar2.o();
                Charset charset2 = y.f4616a;
                f("FHCRC", (short) (((o3 & 255) << 8) | ((o3 & 65280) >>> 8)), (short) ((int) crc32.getValue()));
                crc32.reset();
            }
            this.f4586a = 1;
        } else {
            qVar = qVar2;
        }
        if (this.f4586a == 1) {
            long j5 = eVar3.f4579b;
            long e2 = this.f4589d.e(eVar3, 8192);
            if (e2 != -1) {
                g(eVar, j5, e2);
                return e2;
            }
            this.f4586a = 2;
        }
        if (this.f4586a == 2) {
            qVar.p(4);
            e eVar5 = qVar.f4598a;
            int n2 = eVar5.n();
            Charset charset3 = y.f4616a;
            f("CRC", ((n2 & 255) << 24) | ((n2 & -16777216) >>> 24) | ((n2 & 16711680) >>> 8) | ((n2 & 65280) << 8), (int) crc32.getValue());
            qVar.p(4);
            int n3 = eVar5.n();
            f("ISIZE", ((n3 & 255) << 24) | ((n3 & -16777216) >>> 24) | ((n3 & 16711680) >>> 8) | ((n3 & 65280) << 8), (int) this.f4588c.getBytesWritten());
            this.f4586a = 3;
            if (!qVar.f()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1;
    }

    public final void g(e eVar, long j2, long j3) {
        r rVar = eVar.f4578a;
        while (true) {
            int i = rVar.f4603c;
            int i2 = rVar.f4602b;
            if (j2 < ((long) (i - i2))) {
                break;
            }
            j2 -= (long) (i - i2);
            rVar = rVar.f4605f;
        }
        while (j3 > 0) {
            int i3 = (int) (((long) rVar.f4602b) + j2);
            int min = (int) Math.min((long) (rVar.f4603c - i3), j3);
            this.e.update(rVar.f4601a, i3, min);
            j3 -= (long) min;
            rVar = rVar.f4605f;
            j2 = 0;
        }
    }

    public l(v vVar) {
        if (vVar != null) {
            Inflater inflater = new Inflater(true);
            this.f4588c = inflater;
            Logger logger = o.f4594a;
            q qVar = new q(vVar);
            this.f4587b = qVar;
            this.f4589d = new m(qVar, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }
}
