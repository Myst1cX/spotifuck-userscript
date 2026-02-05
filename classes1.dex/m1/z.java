package m1;

import K.j;
import Q0.E;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import r1.e;
import r1.p;
import r1.r;

public final class z implements Closeable {

    /* renamed from: g  reason: collision with root package name */
    public static final Logger f3787g = Logger.getLogger(f.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final p f3788a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3789b;

    /* renamed from: c  reason: collision with root package name */
    public final e f3790c;

    /* renamed from: d  reason: collision with root package name */
    public int f3791d = 16384;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final C0181d f3792f;

    public final synchronized void close() {
        this.e = true;
        this.f3788a.close();
    }

    public final synchronized void f(j jVar) {
        int i;
        try {
            if (!this.e) {
                int i2 = this.f3791d;
                int i3 = jVar.f332f;
                if ((i3 & 32) != 0) {
                    i2 = ((int[]) jVar.f333g)[5];
                }
                this.f3791d = i2;
                int i4 = -1;
                if ((i3 & 2) != 0) {
                    i = ((int[]) jVar.f333g)[1];
                } else {
                    i = -1;
                }
                if (i != -1) {
                    C0181d dVar = this.f3792f;
                    if ((i3 & 2) != 0) {
                        i4 = ((int[]) jVar.f333g)[1];
                    }
                    int min = Math.min(i4, 16384);
                    int i5 = dVar.f3696d;
                    if (i5 != min) {
                        if (min < i5) {
                            dVar.f3694b = Math.min(dVar.f3694b, min);
                        }
                        dVar.f3695c = true;
                        dVar.f3696d = min;
                        int i6 = dVar.f3699h;
                        if (min < i6) {
                            if (min == 0) {
                                Arrays.fill(dVar.e, (Object) null);
                                dVar.f3697f = dVar.e.length - 1;
                                dVar.f3698g = 0;
                                dVar.f3699h = 0;
                            } else {
                                dVar.a(i6 - min);
                            }
                        }
                    }
                }
                h(0, 0, (byte) 4, (byte) 1);
                this.f3788a.flush();
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void flush() {
        if (!this.e) {
            this.f3788a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void g(boolean z2, int i, e eVar, int i2) {
        byte b2;
        if (!this.e) {
            if (z2) {
                b2 = (byte) 1;
            } else {
                b2 = 0;
            }
            h(i, i2, (byte) 0, b2);
            if (i2 > 0) {
                this.f3788a.b(eVar, (long) i2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void h(int i, int i2, byte b2, byte b3) {
        Level level = Level.FINE;
        Logger logger = f3787g;
        if (logger.isLoggable(level)) {
            logger.fine(f.a(false, i, i2, b2, b3));
        }
        int i3 = this.f3791d;
        if (i2 > i3) {
            f.b("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        } else if ((Integer.MIN_VALUE & i) == 0) {
            p pVar = this.f3788a;
            pVar.d((i2 >>> 16) & 255);
            pVar.d((i2 >>> 8) & 255);
            pVar.d(i2 & 255);
            pVar.d(b2 & 255);
            pVar.d(b3 & 255);
            pVar.i(i & Integer.MAX_VALUE);
        } else {
            f.b("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        }
    }

    public final synchronized void i(byte[] bArr, int i, int i2) {
        try {
            if (this.e) {
                throw new IOException("closed");
            } else if (E.d(i2) != -1) {
                h(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f3788a.i(i);
                this.f3788a.i(E.d(i2));
                if (bArr.length > 0) {
                    this.f3788a.g(bArr);
                }
                this.f3788a.flush();
            } else {
                f.b("errorCode.httpCode == -1", new Object[0]);
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void k(int i, int i2, boolean z2) {
        if (!this.e) {
            h(0, 8, (byte) 6, z2 ? (byte) 1 : 0);
            this.f3788a.i(i);
            this.f3788a.i(i2);
            this.f3788a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void l(int i, int i2) {
        if (this.e) {
            throw new IOException("closed");
        } else if (E.d(i2) != -1) {
            h(i, 4, (byte) 3, (byte) 0);
            this.f3788a.i(E.d(i2));
            this.f3788a.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void m(j jVar) {
        int i;
        try {
            if (!this.e) {
                h(0, Integer.bitCount(jVar.f332f) * 6, (byte) 4, (byte) 0);
                for (int i2 = 0; i2 < 10; i2++) {
                    boolean z2 = true;
                    if (((1 << i2) & jVar.f332f) == 0) {
                        z2 = false;
                    }
                    if (z2) {
                        if (i2 == 4) {
                            i = 3;
                        } else if (i2 == 7) {
                            i = 4;
                        } else {
                            i = i2;
                        }
                        p pVar = this.f3788a;
                        if (!pVar.f4597c) {
                            e eVar = pVar.f4595a;
                            r t2 = eVar.t(2);
                            int i3 = t2.f4603c;
                            byte[] bArr = t2.f4601a;
                            bArr[i3] = (byte) ((i >>> 8) & 255);
                            bArr[i3 + 1] = (byte) (i & 255);
                            t2.f4603c = i3 + 2;
                            eVar.f4579b += 2;
                            pVar.f();
                            this.f3788a.i(((int[]) jVar.f333g)[i2]);
                        } else {
                            throw new IllegalStateException("closed");
                        }
                    }
                }
                this.f3788a.flush();
            } else {
                throw new IOException("closed");
            }
        } finally {
        }
    }

    public final synchronized void n(boolean z2, int i, ArrayList arrayList) {
        if (!this.e) {
            j(z2, i, arrayList);
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void o(int i, long j2) {
        if (this.e) {
            throw new IOException("closed");
        } else if (j2 == 0 || j2 > 2147483647L) {
            f.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j2));
            throw null;
        } else {
            h(i, 4, (byte) 8, (byte) 0);
            this.f3788a.i((int) j2);
            this.f3788a.flush();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(boolean r18, int r19, java.util.ArrayList r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r0.e
            if (r2 != 0) goto L_0x0145
            m1.d r2 = r0.f3792f
            boolean r3 = r2.f3695c
            r4 = 0
            if (r3 == 0) goto L_0x0028
            int r3 = r2.f3694b
            int r5 = r2.f3696d
            r6 = 32
            r7 = 31
            if (r3 >= r5) goto L_0x001c
            r2.d(r3, r7, r6)
        L_0x001c:
            r2.f3695c = r4
            r3 = 2147483647(0x7fffffff, float:NaN)
            r2.f3694b = r3
            int r3 = r2.f3696d
            r2.d(r3, r7, r6)
        L_0x0028:
            int r3 = r20.size()
            r5 = 0
        L_0x002d:
            r6 = 1
            if (r5 >= r3) goto L_0x00ff
            r7 = r20
            java.lang.Object r8 = r7.get(r5)
            m1.b r8 = (m1.C0179b) r8
            r1.h r9 = r8.f3683a
            r1.h r9 = r9.n()
            java.util.Map r10 = m1.e.f3701b
            java.lang.Object r10 = r10.get(r9)
            java.lang.Integer r10 = (java.lang.Integer) r10
            r11 = -1
            r1.h r12 = r8.f3684b
            if (r10 == 0) goto L_0x007a
            int r10 = r10.intValue()
            int r13 = r10 + 1
            if (r13 <= r6) goto L_0x0077
            r14 = 8
            if (r13 >= r14) goto L_0x0077
            m1.b[] r14 = m1.e.f3700a
            r15 = r14[r10]
            r1.h r15 = r15.f3684b
            boolean r15 = h1.c.i(r15, r12)
            if (r15 == 0) goto L_0x0065
            r10 = r13
            goto L_0x007c
        L_0x0065:
            r14 = r14[r13]
            r1.h r14 = r14.f3684b
            boolean r14 = h1.c.i(r14, r12)
            if (r14 == 0) goto L_0x0077
            int r10 = r10 + 2
            r16 = r13
            r13 = r10
            r10 = r16
            goto L_0x007c
        L_0x0077:
            r10 = r13
        L_0x0078:
            r13 = -1
            goto L_0x007c
        L_0x007a:
            r10 = -1
            goto L_0x0078
        L_0x007c:
            if (r13 != r11) goto L_0x00b4
            int r14 = r2.f3697f
            int r14 = r14 + r6
            m1.b[] r6 = r2.e
            int r6 = r6.length
        L_0x0084:
            if (r14 >= r6) goto L_0x00b4
            m1.b[] r15 = r2.e
            r15 = r15[r14]
            r1.h r15 = r15.f3683a
            boolean r15 = h1.c.i(r15, r9)
            if (r15 == 0) goto L_0x00b1
            m1.b[] r15 = r2.e
            r15 = r15[r14]
            r1.h r15 = r15.f3684b
            boolean r15 = h1.c.i(r15, r12)
            if (r15 == 0) goto L_0x00a7
            int r6 = r2.f3697f
            int r14 = r14 - r6
            m1.b[] r6 = m1.e.f3700a
            int r6 = r6.length
            int r13 = r14 + r6
            goto L_0x00b4
        L_0x00a7:
            if (r10 != r11) goto L_0x00b1
            int r10 = r2.f3697f
            int r10 = r14 - r10
            m1.b[] r15 = m1.e.f3700a
            int r15 = r15.length
            int r10 = r10 + r15
        L_0x00b1:
            int r14 = r14 + 1
            goto L_0x0084
        L_0x00b4:
            if (r13 == r11) goto L_0x00be
            r6 = 127(0x7f, float:1.78E-43)
            r8 = 128(0x80, float:1.794E-43)
            r2.d(r13, r6, r8)
            goto L_0x00fb
        L_0x00be:
            r6 = 64
            if (r10 != r11) goto L_0x00d1
            r1.e r10 = r2.f3693a
            r10.v(r6)
            r2.c(r9)
            r2.c(r12)
            r2.b(r8)
            goto L_0x00fb
        L_0x00d1:
            r1.h r11 = m1.C0179b.f3679d
            r9.getClass()
            byte[] r13 = r11.f4581a
            int r13 = r13.length
            boolean r11 = r9.k(r11, r13)
            if (r11 == 0) goto L_0x00f0
            r1.h r11 = m1.C0179b.i
            boolean r9 = r11.equals(r9)
            if (r9 != 0) goto L_0x00f0
            r6 = 15
            r2.d(r10, r6, r4)
            r2.c(r12)
            goto L_0x00fb
        L_0x00f0:
            r9 = 63
            r2.d(r10, r9, r6)
            r2.c(r12)
            r2.b(r8)
        L_0x00fb:
            int r5 = r5 + 1
            goto L_0x002d
        L_0x00ff:
            r1.e r2 = r0.f3790c
            long r7 = r2.f4579b
            int r3 = r0.f3791d
            long r9 = (long) r3
            long r9 = java.lang.Math.min(r9, r7)
            int r3 = (int) r9
            long r9 = (long) r3
            r5 = 4
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0113
            r12 = 4
            goto L_0x0114
        L_0x0113:
            r12 = 0
        L_0x0114:
            if (r18 == 0) goto L_0x0119
            r12 = r12 | 1
            byte r12 = (byte) r12
        L_0x0119:
            r0.h(r1, r3, r6, r12)
            r1.p r3 = r0.f3788a
            r3.b(r2, r9)
            if (r11 <= 0) goto L_0x0144
            long r7 = r7 - r9
        L_0x0124:
            r9 = 0
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x0144
            int r6 = r0.f3791d
            long r11 = (long) r6
            long r11 = java.lang.Math.min(r11, r7)
            int r6 = (int) r11
            long r11 = (long) r6
            long r7 = r7 - r11
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 != 0) goto L_0x013a
            r9 = 4
            goto L_0x013b
        L_0x013a:
            r9 = 0
        L_0x013b:
            r10 = 9
            r0.h(r1, r6, r10, r9)
            r3.b(r2, r11)
            goto L_0x0124
        L_0x0144:
            return
        L_0x0145:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "closed"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.z.j(boolean, int, java.util.ArrayList):void");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [r1.e, java.lang.Object] */
    public z(p pVar, boolean z2) {
        this.f3788a = pVar;
        this.f3789b = z2;
        ? obj = new Object();
        this.f3790c = obj;
        this.f3792f = new C0181d(obj);
    }
}
