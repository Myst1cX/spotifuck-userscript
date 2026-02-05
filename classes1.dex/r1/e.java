package r1;

import Q0.E;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

public final class e implements g, f, Cloneable, ByteChannel {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f4577c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: a  reason: collision with root package name */
    public r f4578a;

    /* renamed from: b  reason: collision with root package name */
    public long f4579b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        long j2 = this.f4579b;
        if (j2 != eVar.f4579b) {
            return false;
        }
        long j3 = 0;
        if (j2 == 0) {
            return true;
        }
        r rVar = this.f4578a;
        r rVar2 = eVar.f4578a;
        int i = rVar.f4602b;
        int i2 = rVar2.f4602b;
        while (j3 < this.f4579b) {
            long min = (long) Math.min(rVar.f4603c - i, rVar2.f4603c - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (rVar.f4601a[i] != rVar2.f4601a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == rVar.f4603c) {
                rVar = rVar.f4605f;
                i = rVar.f4602b;
            }
            if (i2 == rVar2.f4603c) {
                rVar2 = rVar2.f4605f;
                i2 = rVar2.f4602b;
            }
            j3 += min;
        }
        return true;
    }

    public final int i(byte[] bArr, int i, int i2) {
        y.a((long) bArr.length, (long) i, (long) i2);
        r rVar = this.f4578a;
        if (rVar == null) {
            return -1;
        }
        int min = Math.min(i2, rVar.f4603c - rVar.f4602b);
        System.arraycopy(rVar.f4601a, rVar.f4602b, bArr, i, min);
        int i3 = rVar.f4602b + min;
        rVar.f4602b = i3;
        this.f4579b -= (long) min;
        if (i3 == rVar.f4603c) {
            this.f4578a = rVar.a();
            s.a(rVar);
        }
        return min;
    }

    public final boolean isOpen() {
        return true;
    }

    public final r t(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        r rVar = this.f4578a;
        if (rVar == null) {
            r b2 = s.b();
            this.f4578a = b2;
            b2.f4606g = b2;
            b2.f4605f = b2;
            return b2;
        }
        r rVar2 = rVar.f4606g;
        if (rVar2.f4603c + i <= 8192 && rVar2.e) {
            return rVar2;
        }
        r b3 = s.b();
        rVar2.b(b3);
        return b3;
    }

    public final void v(int i) {
        r t2 = t(1);
        int i2 = t2.f4603c;
        t2.f4603c = i2 + 1;
        t2.f4601a[i2] = (byte) i;
        this.f4579b++;
    }

    public final x a() {
        return x.f4612d;
    }

    public final void b(e eVar, long j2) {
        r rVar;
        r rVar2;
        int i;
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (eVar != this) {
            y.a(eVar.f4579b, 0, j2);
            while (j2 > 0) {
                r rVar3 = eVar.f4578a;
                int i2 = rVar3.f4603c - rVar3.f4602b;
                int i3 = 0;
                if (j2 < ((long) i2)) {
                    r rVar4 = this.f4578a;
                    if (rVar4 != null) {
                        rVar = rVar4.f4606g;
                    } else {
                        rVar = null;
                    }
                    if (rVar != null && rVar.e) {
                        long j3 = ((long) rVar.f4603c) + j2;
                        if (rVar.f4604d) {
                            i = 0;
                        } else {
                            i = rVar.f4602b;
                        }
                        if (j3 - ((long) i) <= 8192) {
                            rVar3.d(rVar, (int) j2);
                            eVar.f4579b -= j2;
                            this.f4579b += j2;
                            return;
                        }
                    }
                    int i4 = (int) j2;
                    if (i4 <= 0 || i4 > i2) {
                        throw new IllegalArgumentException();
                    }
                    if (i4 >= 1024) {
                        rVar2 = rVar3.c();
                    } else {
                        rVar2 = s.b();
                        System.arraycopy(rVar3.f4601a, rVar3.f4602b, rVar2.f4601a, 0, i4);
                    }
                    rVar2.f4603c = rVar2.f4602b + i4;
                    rVar3.f4602b += i4;
                    rVar3.f4606g.b(rVar2);
                    eVar.f4578a = rVar2;
                }
                r rVar5 = eVar.f4578a;
                long j4 = (long) (rVar5.f4603c - rVar5.f4602b);
                eVar.f4578a = rVar5.a();
                r rVar6 = this.f4578a;
                if (rVar6 == null) {
                    this.f4578a = rVar5;
                    rVar5.f4606g = rVar5;
                    rVar5.f4605f = rVar5;
                } else {
                    rVar6.f4606g.b(rVar5);
                    r rVar7 = rVar5.f4606g;
                    if (rVar7 == rVar5) {
                        throw new IllegalStateException();
                    } else if (rVar7.e) {
                        int i5 = rVar5.f4603c - rVar5.f4602b;
                        int i6 = 8192 - rVar7.f4603c;
                        if (!rVar7.f4604d) {
                            i3 = rVar7.f4602b;
                        }
                        if (i5 <= i6 + i3) {
                            rVar5.d(rVar7, i5);
                            rVar5.a();
                            s.a(rVar5);
                        }
                    }
                }
                eVar.f4579b -= j4;
                this.f4579b += j4;
                j2 -= j4;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [r1.e, java.lang.Object] */
    public final Object clone() {
        ? obj = new Object();
        if (this.f4579b != 0) {
            r c2 = this.f4578a.c();
            obj.f4578a = c2;
            c2.f4606g = c2;
            c2.f4605f = c2;
            r rVar = this.f4578a;
            while (true) {
                rVar = rVar.f4605f;
                if (rVar == this.f4578a) {
                    break;
                }
                obj.f4578a.f4606g.b(rVar.c());
            }
            obj.f4579b = this.f4579b;
        }
        return obj;
    }

    public final void close() {
    }

    public final long e(e eVar, long j2) {
        if (eVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j2 >= 0) {
            long j3 = this.f4579b;
            if (j3 == 0) {
                return -1;
            }
            if (j2 > j3) {
                j2 = j3;
            }
            eVar.b(this, j2);
            return j2;
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        }
    }

    public final void f(e eVar, long j2, long j3) {
        if (eVar != null) {
            y.a(this.f4579b, j2, j3);
            if (j3 != 0) {
                eVar.f4579b += j3;
                r rVar = this.f4578a;
                while (true) {
                    long j4 = (long) (rVar.f4603c - rVar.f4602b);
                    if (j2 < j4) {
                        break;
                    }
                    j2 -= j4;
                    rVar = rVar.f4605f;
                }
                while (j3 > 0) {
                    r c2 = rVar.c();
                    int i = (int) (((long) c2.f4602b) + j2);
                    c2.f4602b = i;
                    c2.f4603c = Math.min(i + ((int) j3), c2.f4603c);
                    r rVar2 = eVar.f4578a;
                    if (rVar2 == null) {
                        c2.f4606g = c2;
                        c2.f4605f = c2;
                        eVar.f4578a = c2;
                    } else {
                        rVar2.f4606g.b(c2);
                    }
                    j3 -= (long) (c2.f4603c - c2.f4602b);
                    rVar = rVar.f4605f;
                    j2 = 0;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("out == null");
    }

    public final void flush() {
    }

    public final boolean g() {
        if (this.f4579b == 0) {
            return true;
        }
        return false;
    }

    public final byte h(long j2) {
        int i;
        y.a(this.f4579b, j2, 1);
        long j3 = this.f4579b;
        if (j3 - j2 > j2) {
            r rVar = this.f4578a;
            while (true) {
                int i2 = rVar.f4603c;
                int i3 = rVar.f4602b;
                long j4 = (long) (i2 - i3);
                if (j2 < j4) {
                    return rVar.f4601a[i3 + ((int) j2)];
                }
                j2 -= j4;
                rVar = rVar.f4605f;
            }
        } else {
            long j5 = j2 - j3;
            r rVar2 = this.f4578a;
            do {
                rVar2 = rVar2.f4606g;
                int i4 = rVar2.f4603c;
                i = rVar2.f4602b;
                j5 += (long) (i4 - i);
            } while (j5 < 0);
            return rVar2.f4601a[i + ((int) j5)];
        }
    }

    public final int hashCode() {
        r rVar = this.f4578a;
        if (rVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = rVar.f4603c;
            for (int i3 = rVar.f4602b; i3 < i2; i3++) {
                i = (i * 31) + rVar.f4601a[i3];
            }
            rVar = rVar.f4605f;
        } while (rVar != this.f4578a);
        return i;
    }

    public final byte j() {
        long j2 = this.f4579b;
        if (j2 != 0) {
            r rVar = this.f4578a;
            int i = rVar.f4602b;
            int i2 = rVar.f4603c;
            int i3 = i + 1;
            byte b2 = rVar.f4601a[i];
            this.f4579b = j2 - 1;
            if (i3 == i2) {
                this.f4578a = rVar.a();
                s.a(rVar);
            } else {
                rVar.f4602b = i3;
            }
            return b2;
        }
        throw new IllegalStateException("size == 0");
    }

    public final byte[] k(long j2) {
        y.a(this.f4579b, 0, j2);
        if (j2 <= 2147483647L) {
            int i = (int) j2;
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i(bArr, i2, i - i2);
                if (i3 != -1) {
                    i2 += i3;
                } else {
                    throw new EOFException();
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j2);
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [r1.e, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r2 != false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        r1.j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        throw new java.lang.NumberFormatException("Number too large: ".concat(r1.q()));
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008b A[EDGE_INSN: B:47:0x008b->B:29:0x008b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long l() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f4579b
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00aa
            r1 = 0
            r5 = -7
            r6 = r5
            r2 = 0
            r4 = r3
            r3 = 0
        L_0x0011:
            r1.r r8 = r0.f4578a
            byte[] r9 = r8.f4601a
            int r10 = r8.f4602b
            int r11 = r8.f4603c
        L_0x0019:
            if (r10 >= r11) goto L_0x008b
            byte r12 = r9[r10]
            r13 = 48
            if (r12 < r13) goto L_0x005f
            r13 = 57
            if (r12 > r13) goto L_0x005f
            int r13 = 48 - r12
            r14 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x003f
            if (r16 != 0) goto L_0x0038
            long r14 = (long) r13
            int r16 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r16 >= 0) goto L_0x0038
            goto L_0x003f
        L_0x0038:
            r14 = 10
            long r4 = r4 * r14
            long r12 = (long) r13
            long r4 = r4 + r12
            goto L_0x006a
        L_0x003f:
            r1.e r1 = new r1.e
            r1.<init>()
            r1.w(r4)
            r1.v(r12)
            if (r2 != 0) goto L_0x004f
            r1.j()
        L_0x004f:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r1 = r1.q()
            java.lang.String r3 = "Number too large: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L_0x005f:
            r13 = 45
            r14 = 1
            if (r12 != r13) goto L_0x006f
            if (r1 != 0) goto L_0x006f
            r12 = 1
            long r6 = r6 - r12
            r2 = 1
        L_0x006a:
            int r10 = r10 + 1
            int r1 = r1 + 1
            goto L_0x0019
        L_0x006f:
            if (r1 == 0) goto L_0x0073
            r3 = 1
            goto L_0x008b
        L_0x0073:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.<init>(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r12)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x008b:
            if (r10 != r11) goto L_0x0097
            r1.r r9 = r8.a()
            r0.f4578a = r9
            r1.s.a(r8)
            goto L_0x0099
        L_0x0097:
            r8.f4602b = r10
        L_0x0099:
            if (r3 != 0) goto L_0x009f
            r1.r r8 = r0.f4578a
            if (r8 != 0) goto L_0x0011
        L_0x009f:
            long r6 = r0.f4579b
            long r8 = (long) r1
            long r6 = r6 - r8
            r0.f4579b = r6
            if (r2 == 0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            long r4 = -r4
        L_0x00a9:
            return r4
        L_0x00aa:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "size == 0"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.e.l():long");
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [r1.e, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007e, code lost:
        if (r8 != r9) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0080, code lost:
        r15.f4578a = r6.a();
        r1.s.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
        r6.f4602b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008c, code lost:
        if (r1 != false) goto L_0x0092;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0066 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long m() {
        /*
            r15 = this;
            long r0 = r15.f4579b
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0099
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x000b:
            r1.r r6 = r15.f4578a
            byte[] r7 = r6.f4601a
            int r8 = r6.f4602b
            int r9 = r6.f4603c
        L_0x0013:
            if (r8 >= r9) goto L_0x007e
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0022
            r11 = 57
            if (r10 > r11) goto L_0x0022
            int r11 = r10 + -48
            goto L_0x0037
        L_0x0022:
            r11 = 97
            if (r10 < r11) goto L_0x002d
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x002d
            int r11 = r10 + -87
            goto L_0x0037
        L_0x002d:
            r11 = 65
            if (r10 < r11) goto L_0x0062
            r11 = 70
            if (r10 > r11) goto L_0x0062
            int r11 = r10 + -55
        L_0x0037:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x0047
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0013
        L_0x0047:
            r1.e r0 = new r1.e
            r0.<init>()
            r0.x(r4)
            r0.v(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.q()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L_0x0062:
            if (r0 == 0) goto L_0x0066
            r1 = 1
            goto L_0x007e
        L_0x0066:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x007e:
            if (r8 != r9) goto L_0x008a
            r1.r r7 = r6.a()
            r15.f4578a = r7
            r1.s.a(r6)
            goto L_0x008c
        L_0x008a:
            r6.f4602b = r8
        L_0x008c:
            if (r1 != 0) goto L_0x0092
            r1.r r6 = r15.f4578a
            if (r6 != 0) goto L_0x000b
        L_0x0092:
            long r1 = r15.f4579b
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f4579b = r1
            return r4
        L_0x0099:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.e.m():long");
    }

    public final int n() {
        long j2 = this.f4579b;
        if (j2 >= 4) {
            r rVar = this.f4578a;
            int i = rVar.f4602b;
            int i2 = rVar.f4603c;
            if (i2 - i < 4) {
                return ((j() & 255) << 24) | ((j() & 255) << 16) | ((j() & 255) << 8) | (j() & 255);
            }
            byte[] bArr = rVar.f4601a;
            byte b2 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
            int i3 = i + 3;
            int i4 = i + 4;
            byte b3 = b2 | ((bArr[i + 2] & 255) << 8) | (bArr[i3] & 255);
            this.f4579b = j2 - 4;
            if (i4 == i2) {
                this.f4578a = rVar.a();
                s.a(rVar);
            } else {
                rVar.f4602b = i4;
            }
            return b3;
        }
        throw new IllegalStateException("size < 4: " + this.f4579b);
    }

    public final short o() {
        long j2 = this.f4579b;
        if (j2 >= 2) {
            r rVar = this.f4578a;
            int i = rVar.f4602b;
            int i2 = rVar.f4603c;
            if (i2 - i < 2) {
                return (short) (((j() & 255) << 8) | (j() & 255));
            }
            int i3 = i + 1;
            byte[] bArr = rVar.f4601a;
            int i4 = i + 2;
            byte b2 = (bArr[i3] & 255) | ((bArr[i] & 255) << 8);
            this.f4579b = j2 - 2;
            if (i4 == i2) {
                this.f4578a = rVar.a();
                s.a(rVar);
            } else {
                rVar.f4602b = i4;
            }
            return (short) b2;
        }
        throw new IllegalStateException("size < 2: " + this.f4579b);
    }

    public final String p(long j2) {
        Charset charset = y.f4616a;
        y.a(this.f4579b, 0, j2);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j2 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j2);
        } else if (j2 == 0) {
            return "";
        } else {
            r rVar = this.f4578a;
            int i = rVar.f4602b;
            if (((long) i) + j2 > ((long) rVar.f4603c)) {
                return new String(k(j2), charset);
            }
            String str = new String(rVar.f4601a, i, (int) j2, charset);
            int i2 = (int) (((long) rVar.f4602b) + j2);
            rVar.f4602b = i2;
            this.f4579b -= j2;
            if (i2 == rVar.f4603c) {
                this.f4578a = rVar.a();
                s.a(rVar);
            }
            return str;
        }
    }

    public final String q() {
        try {
            long j2 = this.f4579b;
            Charset charset = y.f4616a;
            return p(j2);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final String r(long j2) {
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (h(j3) == 13) {
                Charset charset = y.f4616a;
                String p2 = p(j3);
                s(2);
                return p2;
            }
        }
        Charset charset2 = y.f4616a;
        String p3 = p(j2);
        s(1);
        return p3;
    }

    public final int read(ByteBuffer byteBuffer) {
        r rVar = this.f4578a;
        if (rVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), rVar.f4603c - rVar.f4602b);
        byteBuffer.put(rVar.f4601a, rVar.f4602b, min);
        int i = rVar.f4602b + min;
        rVar.f4602b = i;
        this.f4579b -= (long) min;
        if (i == rVar.f4603c) {
            this.f4578a = rVar.a();
            s.a(rVar);
        }
        return min;
    }

    public final void s(long j2) {
        while (j2 > 0) {
            r rVar = this.f4578a;
            if (rVar != null) {
                int min = (int) Math.min(j2, (long) (rVar.f4603c - rVar.f4602b));
                long j3 = (long) min;
                this.f4579b -= j3;
                j2 -= j3;
                r rVar2 = this.f4578a;
                int i = rVar2.f4602b + min;
                rVar2.f4602b = i;
                if (i == rVar2.f4603c) {
                    this.f4578a = rVar2.a();
                    s.a(rVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final String toString() {
        h hVar;
        long j2 = this.f4579b;
        if (j2 <= 2147483647L) {
            int i = (int) j2;
            if (i == 0) {
                hVar = h.e;
            } else {
                hVar = new t(this, i);
            }
            return hVar.toString();
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f4579b);
    }

    public final void u(byte[] bArr, int i) {
        if (bArr != null) {
            int i2 = 0;
            long j2 = (long) i;
            y.a((long) bArr.length, (long) 0, j2);
            while (i2 < i) {
                r t2 = t(1);
                int min = Math.min(i - i2, 8192 - t2.f4603c);
                System.arraycopy(bArr, i2, t2.f4601a, t2.f4603c, min);
                i2 += min;
                t2.f4603c += min;
            }
            this.f4579b += j2;
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final void w(long j2) {
        byte[] bArr;
        int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i == 0) {
            v(48);
            return;
        }
        int i2 = 1;
        boolean z2 = false;
        if (i < 0) {
            j2 = -j2;
            if (j2 < 0) {
                y("-9223372036854775808", 0, 20);
                return;
            }
            z2 = true;
        }
        if (j2 < 100000000) {
            if (j2 < 10000) {
                if (j2 < 100) {
                    if (j2 >= 10) {
                        i2 = 2;
                    }
                } else if (j2 < 1000) {
                    i2 = 3;
                } else {
                    i2 = 4;
                }
            } else if (j2 < 1000000) {
                if (j2 < 100000) {
                    i2 = 5;
                } else {
                    i2 = 6;
                }
            } else if (j2 < 10000000) {
                i2 = 7;
            } else {
                i2 = 8;
            }
        } else if (j2 < 1000000000000L) {
            if (j2 < 10000000000L) {
                if (j2 < 1000000000) {
                    i2 = 9;
                } else {
                    i2 = 10;
                }
            } else if (j2 < 100000000000L) {
                i2 = 11;
            } else {
                i2 = 12;
            }
        } else if (j2 < 1000000000000000L) {
            if (j2 < 10000000000000L) {
                i2 = 13;
            } else if (j2 < 100000000000000L) {
                i2 = 14;
            } else {
                i2 = 15;
            }
        } else if (j2 < 100000000000000000L) {
            if (j2 < 10000000000000000L) {
                i2 = 16;
            } else {
                i2 = 17;
            }
        } else if (j2 < 1000000000000000000L) {
            i2 = 18;
        } else {
            i2 = 19;
        }
        if (z2) {
            i2++;
        }
        r t2 = t(i2);
        int i3 = t2.f4603c + i2;
        while (true) {
            bArr = t2.f4601a;
            if (j2 == 0) {
                break;
            }
            i3--;
            bArr[i3] = f4577c[(int) (j2 % 10)];
            j2 /= 10;
        }
        if (z2) {
            bArr[i3 - 1] = 45;
        }
        t2.f4603c += i2;
        this.f4579b += (long) i2;
    }

    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                r t2 = t(1);
                int min = Math.min(i, 8192 - t2.f4603c);
                byteBuffer.get(t2.f4601a, t2.f4603c, min);
                i -= min;
                t2.f4603c += min;
            }
            this.f4579b += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final void x(long j2) {
        if (j2 == 0) {
            v(48);
            return;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j2)) / 4) + 1;
        r t2 = t(numberOfTrailingZeros);
        int i = t2.f4603c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            t2.f4601a[i2] = f4577c[(int) (15 & j2)];
            j2 >>>= 4;
        }
        t2.f4603c += numberOfTrailingZeros;
        this.f4579b += (long) numberOfTrailingZeros;
    }

    public final void y(String str, int i, int i2) {
        char c2;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalArgumentException(E.e("beginIndex < 0: ", i));
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    r t2 = t(1);
                    int i3 = t2.f4603c - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    byte[] bArr = t2.f4601a;
                    bArr[i + i3] = (byte) charAt;
                    while (i4 < min) {
                        char charAt2 = str.charAt(i4);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i4 + i3] = (byte) charAt2;
                        i4++;
                    }
                    int i5 = t2.f4603c;
                    int i6 = (i3 + i4) - i5;
                    t2.f4603c = i5 + i6;
                    this.f4579b += (long) i6;
                    i = i4;
                } else {
                    if (charAt < 2048) {
                        v((charAt >> 6) | 192);
                        v((charAt & '?') | 128);
                    } else if (charAt < 55296 || charAt > 57343) {
                        v((charAt >> 12) | 224);
                        v(((charAt >> 6) & 63) | 128);
                        v((charAt & '?') | 128);
                    } else {
                        int i7 = i + 1;
                        if (i7 < i2) {
                            c2 = str.charAt(i7);
                        } else {
                            c2 = 0;
                        }
                        if (charAt > 56319 || c2 < 56320 || c2 > 57343) {
                            v(63);
                            i = i7;
                        } else {
                            int i8 = (((charAt & 10239) << 10) | (9215 & c2)) + 0;
                            v((i8 >> 18) | 240);
                            v(((i8 >> 12) & 63) | 128);
                            v(((i8 >> 6) & 63) | 128);
                            v((i8 & 63) | 128);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
    }

    public final void z(int i) {
        if (i < 128) {
            v(i);
        } else if (i < 2048) {
            v((i >> 6) | 192);
            v((i & 63) | 128);
        } else if (i < 65536) {
            if (i < 55296 || i > 57343) {
                v((i >> 12) | 224);
                v(((i >> 6) & 63) | 128);
                v((i & 63) | 128);
                return;
            }
            v(63);
        } else if (i <= 1114111) {
            v((i >> 18) | 240);
            v(((i >> 12) & 63) | 128);
            v(((i >> 6) & 63) | 128);
            v((i & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
    }

    public final f c(String str) {
        y(str, 0, str.length());
        return this;
    }

    public final /* bridge */ /* synthetic */ f d(int i) {
        v(i);
        return this;
    }
}
