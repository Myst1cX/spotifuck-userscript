package r1;

import java.io.EOFException;
import java.nio.ByteBuffer;

public final class q implements g {

    /* renamed from: a  reason: collision with root package name */
    public final e f4598a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final v f4599b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4600c;

    public final x a() {
        return this.f4599b.a();
    }

    public final void close() {
        if (!this.f4600c) {
            this.f4600c = true;
            this.f4599b.close();
            e eVar = this.f4598a;
            try {
                eVar.s(eVar.f4579b);
            } catch (EOFException e) {
                throw new AssertionError(e);
            }
        }
    }

    public final long e(e eVar, long j2) {
        if (eVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        } else if (!this.f4600c) {
            e eVar2 = this.f4598a;
            if (eVar2.f4579b == 0 && this.f4599b.e(eVar2, 8192) == -1) {
                return -1;
            }
            return eVar2.e(eVar, Math.min(j2, eVar2.f4579b));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final boolean f() {
        if (!this.f4600c) {
            e eVar = this.f4598a;
            if (!eVar.g() || this.f4599b.e(eVar, 8192) != -1) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("closed");
    }

    public final long g(byte b2, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        long j7;
        r rVar;
        long j8;
        long j9 = j3;
        if (!this.f4600c) {
            long j10 = 0;
            if (j9 >= 0) {
                while (j10 < j9) {
                    e eVar = this.f4598a;
                    eVar.getClass();
                    if (j10 < 0 || j9 < j10) {
                        long j11 = eVar.f4579b;
                        throw new IllegalArgumentException("size=" + j11 + " fromIndex=" + j10 + " toIndex=" + j9);
                    }
                    long j12 = eVar.f4579b;
                    if (j9 > j12) {
                        j4 = j12;
                    } else {
                        j4 = j9;
                    }
                    if (j10 != j4 && (rVar = eVar.f4578a) != null) {
                        if (j12 - j10 < j10) {
                            while (j12 > j10) {
                                rVar = rVar.f4606g;
                                j12 -= (long) (rVar.f4603c - rVar.f4602b);
                            }
                            j8 = j10;
                        } else {
                            r rVar2 = rVar;
                            long j13 = 0;
                            while (true) {
                                long j14 = ((long) (rVar2.f4603c - rVar2.f4602b)) + j13;
                                if (j14 >= j10) {
                                    break;
                                }
                                rVar2 = rVar2.f4605f;
                                j13 = j14;
                            }
                            j8 = j10;
                            long j15 = j13;
                            rVar = rVar2;
                            j12 = j15;
                        }
                        while (true) {
                            if (j12 >= j4) {
                                break;
                            }
                            byte[] bArr = rVar.f4601a;
                            j5 = j10;
                            int min = (int) Math.min((long) rVar.f4603c, (((long) rVar.f4602b) + j4) - j12);
                            for (int i = (int) ((((long) rVar.f4602b) + j8) - j12); i < min; i++) {
                                if (bArr[i] == b2) {
                                    j6 = ((long) (i - rVar.f4602b)) + j12;
                                    j7 = -1;
                                    break;
                                }
                            }
                            byte b3 = b2;
                            j8 = j12 + ((long) (rVar.f4603c - rVar.f4602b));
                            rVar = rVar.f4605f;
                            j12 = j8;
                            j10 = j5;
                        }
                    }
                    byte b4 = b2;
                    j5 = j10;
                    j7 = -1;
                    j6 = -1;
                    if (j6 != j7) {
                        return j6;
                    }
                    long j16 = eVar.f4579b;
                    if (j16 >= j9 || this.f4599b.e(eVar, 8192) == j7) {
                        return j7;
                    }
                    j10 = Math.max(j5, j16);
                }
                return -1;
            }
            throw new IllegalArgumentException("fromIndex=0 toIndex=" + j9);
        }
        throw new IllegalStateException("closed");
    }

    public final boolean h(long j2, h hVar) {
        byte[] bArr = hVar.f4581a;
        int length = bArr.length;
        if (this.f4600c) {
            throw new IllegalStateException("closed");
        } else if (j2 < 0 || length < 0 || bArr.length < length) {
            return false;
        } else {
            for (int i = 0; i < length; i++) {
                long j3 = ((long) i) + j2;
                if (!o(1 + j3) || this.f4598a.h(j3) != hVar.f4581a[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    public final byte i() {
        p(1);
        return this.f4598a.j();
    }

    public final boolean isOpen() {
        return !this.f4600c;
    }

    public final void k(byte[] bArr) {
        e eVar = this.f4598a;
        int i = 0;
        try {
            p((long) bArr.length);
            while (i < bArr.length) {
                int i2 = eVar.i(bArr, i, bArr.length - i);
                if (i2 != -1) {
                    i += i2;
                } else {
                    throw new EOFException();
                }
            }
        } catch (EOFException e) {
            while (true) {
                long j2 = eVar.f4579b;
                if (j2 > 0) {
                    int i3 = eVar.i(bArr, i, (int) j2);
                    if (i3 != -1) {
                        i += i3;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    public final int l() {
        p(4);
        return this.f4598a.n();
    }

    public final short m() {
        p(2);
        return this.f4598a.o();
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [r1.e, java.lang.Object] */
    public final String n(long j2) {
        long j3;
        long j4 = j2;
        if (j4 >= 0) {
            if (j4 == Long.MAX_VALUE) {
                j3 = Long.MAX_VALUE;
            } else {
                j3 = j4 + 1;
            }
            long g2 = g((byte) 10, 0, j3);
            e eVar = this.f4598a;
            if (g2 != -1) {
                return eVar.r(g2);
            }
            if (j3 < Long.MAX_VALUE && o(j3) && eVar.h(j3 - 1) == 13 && o(1 + j3) && eVar.h(j3) == 10) {
                return eVar.r(j3);
            }
            ? obj = new Object();
            eVar.f(obj, 0, Math.min(32, eVar.f4579b));
            StringBuilder sb = new StringBuilder("\\n not found: limit=");
            sb.append(Math.min(eVar.f4579b, j4));
            sb.append(" content=");
            try {
                sb.append(new h(obj.k(obj.f4579b)).h());
                sb.append(8230);
                throw new EOFException(sb.toString());
            } catch (EOFException e) {
                throw new AssertionError(e);
            }
        } else {
            throw new IllegalArgumentException("limit < 0: " + j4);
        }
    }

    public final boolean o(long j2) {
        e eVar;
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        } else if (!this.f4600c) {
            do {
                eVar = this.f4598a;
                if (eVar.f4579b >= j2) {
                    return true;
                }
            } while (this.f4599b.e(eVar, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final void q(long j2) {
        if (!this.f4600c) {
            while (j2 > 0) {
                e eVar = this.f4598a;
                if (eVar.f4579b == 0 && this.f4599b.e(eVar, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j2, eVar.f4579b);
                eVar.s(min);
                j2 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final int read(ByteBuffer byteBuffer) {
        e eVar = this.f4598a;
        if (eVar.f4579b == 0 && this.f4599b.e(eVar, 8192) == -1) {
            return -1;
        }
        return eVar.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.f4599b + ")";
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [r1.e, java.lang.Object] */
    public q(v vVar) {
        if (vVar != null) {
            this.f4599b = vVar;
            return;
        }
        throw new NullPointerException("source == null");
    }

    public final h j(long j2) {
        p(j2);
        e eVar = this.f4598a;
        eVar.getClass();
        return new h(eVar.k(j2));
    }

    public final void p(long j2) {
        if (!o(j2)) {
            throw new EOFException();
        }
    }
}
