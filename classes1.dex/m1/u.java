package m1;

import Q0.E;
import h1.c;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import r1.h;
import r1.q;
import t.C0339e;

public final class u implements Closeable {
    public static final Logger e = Logger.getLogger(f.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final q f3763a;

    /* renamed from: b  reason: collision with root package name */
    public final t f3764b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3765c;

    /* renamed from: d  reason: collision with root package name */
    public final C0180c f3766d;

    public final boolean g(boolean z2, q qVar) {
        int i;
        try {
            this.f3763a.p(9);
            int m2 = m(this.f3763a);
            if (m2 < 0 || m2 > 16384) {
                f.c("FRAME_SIZE_ERROR: %s", Integer.valueOf(m2));
                throw null;
            }
            byte i2 = (byte) (this.f3763a.i() & 255);
            if (!z2 || i2 == 4) {
                byte i3 = (byte) (this.f3763a.i() & 255);
                int l2 = this.f3763a.l();
                int i4 = Integer.MAX_VALUE & l2;
                Logger logger = e;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(f.a(true, i4, m2, i2, i3));
                }
                switch (i2) {
                    case 0:
                        i(qVar, m2, i3, i4);
                        break;
                    case 1:
                        l(qVar, m2, i3, i4);
                        break;
                    case 2:
                        if (m2 != 5) {
                            f.c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(m2));
                            throw null;
                        } else if (i4 != 0) {
                            q qVar2 = this.f3763a;
                            qVar2.l();
                            qVar2.i();
                            qVar.getClass();
                            break;
                        } else {
                            f.c("TYPE_PRIORITY streamId == 0", new Object[0]);
                            throw null;
                        }
                    case 3:
                        if (m2 != 4) {
                            f.c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(m2));
                            throw null;
                        } else if (i4 != 0) {
                            int l3 = this.f3763a.l();
                            int[] b2 = C0339e.b(11);
                            int length = b2.length;
                            int i5 = 0;
                            while (true) {
                                if (i5 < length) {
                                    i = b2[i5];
                                    if (E.d(i) != l3) {
                                        i5++;
                                    }
                                } else {
                                    i = 0;
                                }
                            }
                            if (i != 0) {
                                s sVar = (s) qVar.f3736c;
                                sVar.getClass();
                                if (i4 != 0 && (l2 & 1) == 0) {
                                    sVar.i.execute(new k(sVar, new Object[]{sVar.f3743d, Integer.valueOf(i4)}, i4, i));
                                    break;
                                } else {
                                    y j2 = sVar.j(i4);
                                    if (j2 != null) {
                                        j2.j(i);
                                        break;
                                    }
                                }
                            } else {
                                f.c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(l3));
                                throw null;
                            }
                        } else {
                            f.c("TYPE_RST_STREAM streamId == 0", new Object[0]);
                            throw null;
                        }
                        break;
                    case 4:
                        p(qVar, m2, i3, i4);
                        break;
                    case 5:
                        o(qVar, m2, i3, i4);
                        break;
                    case 6:
                        n(qVar, m2, i3, i4);
                        break;
                    case 7:
                        j(qVar, m2, i4);
                        break;
                    case 8:
                        if (m2 == 4) {
                            long l4 = ((long) this.f3763a.l()) & 2147483647L;
                            int i6 = (l4 > 0 ? 1 : (l4 == 0 ? 0 : -1));
                            if (i6 != 0) {
                                if (i4 != 0) {
                                    y h2 = ((s) qVar.f3736c).h(i4);
                                    if (h2 != null) {
                                        synchronized (h2) {
                                            h2.f3779b += l4;
                                            if (i6 > 0) {
                                                h2.notifyAll();
                                            }
                                        }
                                        break;
                                    }
                                } else {
                                    synchronized (((s) qVar.f3736c)) {
                                        s sVar2 = (s) qVar.f3736c;
                                        sVar2.f3750m += l4;
                                        sVar2.notifyAll();
                                    }
                                    break;
                                }
                            } else {
                                f.c("windowSizeIncrement was 0", Long.valueOf(l4));
                                throw null;
                            }
                        } else {
                            f.c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(m2));
                            throw null;
                        }
                        break;
                    default:
                        this.f3763a.q((long) m2);
                        break;
                }
                return true;
            }
            f.c("Expected a SETTINGS frame but was %s", Byte.valueOf(i2));
            throw null;
        } catch (IOException unused) {
            return false;
        }
    }

    public final void h(q qVar) {
        if (!this.f3765c) {
            h hVar = f.f3702a;
            h j2 = this.f3763a.j((long) hVar.f4581a.length);
            Level level = Level.FINE;
            Logger logger = e;
            if (logger.isLoggable(level)) {
                String h2 = j2.h();
                byte[] bArr = c.f3086a;
                Locale locale = Locale.US;
                logger.fine("<< CONNECTION " + h2);
            }
            if (!hVar.equals(j2)) {
                f.c("Expected a connection header but was %s", j2.o());
                throw null;
            }
        } else if (!g(true, qVar)) {
            f.c("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
    }

    public final void j(q qVar, int i, int i2) {
        int i3;
        y[] yVarArr;
        if (i < 8) {
            f.c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        } else if (i2 == 0) {
            int l2 = this.f3763a.l();
            int l3 = this.f3763a.l();
            int i4 = i - 8;
            int[] b2 = C0339e.b(11);
            int length = b2.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    i3 = 0;
                    break;
                }
                i3 = b2[i5];
                if (E.d(i3) == l3) {
                    break;
                }
                i5++;
            }
            if (i3 != 0) {
                h hVar = h.e;
                if (i4 > 0) {
                    hVar = this.f3763a.j((long) i4);
                }
                qVar.getClass();
                hVar.l();
                synchronized (((s) qVar.f3736c)) {
                    yVarArr = (y[]) ((s) qVar.f3736c).f3742c.values().toArray(new y[((s) qVar.f3736c).f3742c.size()]);
                    ((s) qVar.f3736c).f3745g = true;
                }
                for (y yVar : yVarArr) {
                    if (yVar.f3780c > l2 && yVar.f()) {
                        yVar.j(5);
                        ((s) qVar.f3736c).j(yVar.f3780c);
                    }
                }
                return;
            }
            f.c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(l3));
            throw null;
        } else {
            f.c("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c5, code lost:
        r13.i(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c8, code lost:
        if (r3 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ca, code lost:
        r13.h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(m1.q r11, int r12, byte r13, int r14) {
        /*
            r10 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            if (r14 == 0) goto L_0x00d0
            r3 = r13 & 1
            if (r3 == 0) goto L_0x000b
            r3 = 1
            goto L_0x000c
        L_0x000b:
            r3 = 0
        L_0x000c:
            r4 = r13 & 8
            if (r4 == 0) goto L_0x001a
            r1.q r4 = r10.f3763a
            byte r4 = r4.i()
            r4 = r4 & 255(0xff, float:3.57E-43)
            short r4 = (short) r4
            goto L_0x001b
        L_0x001a:
            r4 = 0
        L_0x001b:
            r5 = r13 & 32
            if (r5 == 0) goto L_0x002c
            r1.q r5 = r10.f3763a
            r5.l()
            r5.i()
            r11.getClass()
            int r12 = r12 + -5
        L_0x002c:
            int r12 = f(r12, r13, r4)
            java.util.ArrayList r9 = r10.k(r12, r4, r13, r14)
            java.lang.Object r12 = r11.f3736c
            m1.s r12 = (m1.s) r12
            r12.getClass()
            if (r14 == 0) goto L_0x0065
            r12 = r14 & 1
            if (r12 != 0) goto L_0x0065
            java.lang.Object r11 = r11.f3736c
            r5 = r11
            m1.s r5 = (m1.s) r5
            r5.getClass()
            java.util.concurrent.ThreadPoolExecutor r11 = r5.i     // Catch:{ RejectedExecutionException -> 0x00cd }
            m1.k r12 = new m1.k     // Catch:{ RejectedExecutionException -> 0x00cd }
            java.lang.String r13 = r5.f3743d     // Catch:{ RejectedExecutionException -> 0x00cd }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)     // Catch:{ RejectedExecutionException -> 0x00cd }
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch:{ RejectedExecutionException -> 0x00cd }
            r6[r2] = r13     // Catch:{ RejectedExecutionException -> 0x00cd }
            r6[r1] = r4     // Catch:{ RejectedExecutionException -> 0x00cd }
            r4 = r12
            r7 = r14
            r8 = r9
            r9 = r3
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ RejectedExecutionException -> 0x00cd }
            r11.execute(r12)     // Catch:{ RejectedExecutionException -> 0x00cd }
            goto L_0x00cd
        L_0x0065:
            java.lang.Object r12 = r11.f3736c
            m1.s r12 = (m1.s) r12
            monitor-enter(r12)
            java.lang.Object r13 = r11.f3736c     // Catch:{ all -> 0x007f }
            m1.s r13 = (m1.s) r13     // Catch:{ all -> 0x007f }
            m1.y r13 = r13.h(r14)     // Catch:{ all -> 0x007f }
            if (r13 != 0) goto L_0x00c4
            java.lang.Object r13 = r11.f3736c     // Catch:{ all -> 0x007f }
            r6 = r13
            m1.s r6 = (m1.s) r6     // Catch:{ all -> 0x007f }
            boolean r13 = r6.f3745g     // Catch:{ all -> 0x007f }
            if (r13 == 0) goto L_0x0081
            monitor-exit(r12)     // Catch:{ all -> 0x007f }
            goto L_0x00cd
        L_0x007f:
            r11 = move-exception
            goto L_0x00ce
        L_0x0081:
            int r13 = r6.e     // Catch:{ all -> 0x007f }
            if (r14 > r13) goto L_0x0087
            monitor-exit(r12)     // Catch:{ all -> 0x007f }
            goto L_0x00cd
        L_0x0087:
            int r13 = r14 % 2
            int r4 = r6.f3744f     // Catch:{ all -> 0x007f }
            int r4 = r4 % r0
            if (r13 != r4) goto L_0x0090
            monitor-exit(r12)     // Catch:{ all -> 0x007f }
            goto L_0x00cd
        L_0x0090:
            m1.y r13 = new m1.y     // Catch:{ all -> 0x007f }
            r7 = 0
            r4 = r13
            r5 = r14
            r8 = r3
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x007f }
            java.lang.Object r3 = r11.f3736c     // Catch:{ all -> 0x007f }
            m1.s r3 = (m1.s) r3     // Catch:{ all -> 0x007f }
            r3.e = r14     // Catch:{ all -> 0x007f }
            java.util.LinkedHashMap r3 = r3.f3742c     // Catch:{ all -> 0x007f }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x007f }
            r3.put(r4, r13)     // Catch:{ all -> 0x007f }
            java.util.concurrent.ThreadPoolExecutor r3 = m1.s.f3739u     // Catch:{ all -> 0x007f }
            m1.q r4 = new m1.q     // Catch:{ all -> 0x007f }
            java.lang.Object r5 = r11.f3736c     // Catch:{ all -> 0x007f }
            m1.s r5 = (m1.s) r5     // Catch:{ all -> 0x007f }
            java.lang.String r5 = r5.f3743d     // Catch:{ all -> 0x007f }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x007f }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x007f }
            r0[r2] = r5     // Catch:{ all -> 0x007f }
            r0[r1] = r14     // Catch:{ all -> 0x007f }
            r4.<init>((m1.q) r11, (java.lang.Object[]) r0, (m1.y) r13)     // Catch:{ all -> 0x007f }
            r3.execute(r4)     // Catch:{ all -> 0x007f }
            monitor-exit(r12)     // Catch:{ all -> 0x007f }
            goto L_0x00cd
        L_0x00c4:
            monitor-exit(r12)     // Catch:{ all -> 0x007f }
            r13.i(r9)
            if (r3 == 0) goto L_0x00cd
            r13.h()
        L_0x00cd:
            return
        L_0x00ce:
            monitor-exit(r12)     // Catch:{ all -> 0x007f }
            throw r11
        L_0x00d0:
            java.lang.String r11 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            java.lang.Object[] r12 = new java.lang.Object[r2]
            m1.f.c(r11, r12)
            r11 = 0
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.u.l(m1.q, int, byte, int):void");
    }

    public final void n(q qVar, int i, byte b2, int i2) {
        boolean z2;
        if (i != 8) {
            f.c("TYPE_PING length != 8: %s", Integer.valueOf(i));
            throw null;
        } else if (i2 == 0) {
            int l2 = this.f3763a.l();
            int l3 = this.f3763a.l();
            if ((b2 & 1) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            qVar.getClass();
            if (z2) {
                synchronized (((s) qVar.f3736c)) {
                    s sVar = (s) qVar.f3736c;
                    sVar.f3748k = false;
                    sVar.notifyAll();
                }
                return;
            }
            try {
                s sVar2 = (s) qVar.f3736c;
                sVar2.f3746h.execute(new p(sVar2, true, l2, l3));
            } catch (RejectedExecutionException unused) {
            }
        } else {
            f.c("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
    }

    public final void o(q qVar, int i, byte b2, int i2) {
        short s2;
        if (i2 != 0) {
            if ((b2 & 8) != 0) {
                s2 = (short) (this.f3763a.i() & 255);
            } else {
                s2 = 0;
            }
            int l2 = this.f3763a.l() & Integer.MAX_VALUE;
            ArrayList k2 = k(f(i - 4, b2, s2), s2, b2, i2);
            s sVar = (s) qVar.f3736c;
            synchronized (sVar) {
                try {
                    if (sVar.f3757t.contains(Integer.valueOf(l2))) {
                        sVar.m(l2, 2);
                        return;
                    }
                    sVar.f3757t.add(Integer.valueOf(l2));
                    try {
                        sVar.i.execute(new k(sVar, new Object[]{sVar.f3743d, Integer.valueOf(l2)}, l2, k2));
                    } catch (RejectedExecutionException unused) {
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        } else {
            f.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:38|39|(5:42|(1:44)(1:45)|(2:47|105)(2:48|104)|49|40)|50|51|52|53|(1:67)(4:56|(3:58|(1:60)|61)|64|(1:66))|68|69) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00c2 */
    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0137  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(m1.q r10, int r11, byte r12, int r13) {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            if (r13 != 0) goto L_0x015e
            r12 = r12 & r0
            if (r12 == 0) goto L_0x0016
            if (r11 != 0) goto L_0x000e
            r10.getClass()
            return
        L_0x000e:
            java.lang.String r10 = "FRAME_SIZE_ERROR ack frame should be empty!"
            java.lang.Object[] r11 = new java.lang.Object[r1]
            m1.f.c(r10, r11)
            throw r2
        L_0x0016:
            int r12 = r11 % 6
            if (r12 != 0) goto L_0x0150
            K.j r12 = new K.j
            r12.<init>()
            r13 = 0
        L_0x0020:
            if (r13 >= r11) goto L_0x0078
            r1.q r3 = r9.f3763a
            short r3 = r3.m()
            r4 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r4
            r1.q r4 = r9.f3763a
            int r4 = r4.l()
            r5 = 2
            if (r3 == r5) goto L_0x0065
            r5 = 3
            r6 = 4
            if (r3 == r5) goto L_0x0063
            if (r3 == r6) goto L_0x0057
            r5 = 5
            if (r3 == r5) goto L_0x003f
            goto L_0x0072
        L_0x003f:
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r4 < r5) goto L_0x0049
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            if (r4 > r5) goto L_0x0049
            goto L_0x0072
        L_0x0049:
            java.lang.String r10 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r12 = new java.lang.Object[r0]
            r12[r1] = r11
            m1.f.c(r10, r12)
            throw r2
        L_0x0057:
            if (r4 < 0) goto L_0x005b
            r3 = 7
            goto L_0x0072
        L_0x005b:
            java.lang.String r10 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            java.lang.Object[] r11 = new java.lang.Object[r1]
            m1.f.c(r10, r11)
            throw r2
        L_0x0063:
            r3 = 4
            goto L_0x0072
        L_0x0065:
            if (r4 == 0) goto L_0x0072
            if (r4 != r0) goto L_0x006a
            goto L_0x0072
        L_0x006a:
            java.lang.String r10 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            java.lang.Object[] r11 = new java.lang.Object[r1]
            m1.f.c(r10, r11)
            throw r2
        L_0x0072:
            r12.d(r3, r4)
            int r13 = r13 + 6
            goto L_0x0020
        L_0x0078:
            java.lang.Object r11 = r10.f3736c
            r13 = r11
            m1.s r13 = (m1.s) r13
            monitor-enter(r13)
            java.lang.Object r11 = r10.f3736c     // Catch:{ all -> 0x00f0 }
            m1.s r11 = (m1.s) r11     // Catch:{ all -> 0x00f0 }
            K.j r11 = r11.f3752o     // Catch:{ all -> 0x00f0 }
            int r11 = r11.b()     // Catch:{ all -> 0x00f0 }
            java.lang.Object r3 = r10.f3736c     // Catch:{ all -> 0x00f0 }
            m1.s r3 = (m1.s) r3     // Catch:{ all -> 0x00f0 }
            K.j r3 = r3.f3752o     // Catch:{ all -> 0x00f0 }
            r3.getClass()     // Catch:{ all -> 0x00f0 }
            r4 = 0
        L_0x0092:
            r5 = 10
            if (r4 >= r5) goto L_0x00ae
            int r5 = r0 << r4
            int r6 = r12.f332f     // Catch:{ all -> 0x00f0 }
            r5 = r5 & r6
            if (r5 == 0) goto L_0x009f
            r5 = 1
            goto L_0x00a0
        L_0x009f:
            r5 = 0
        L_0x00a0:
            if (r5 != 0) goto L_0x00a3
            goto L_0x00ac
        L_0x00a3:
            java.lang.Object r5 = r12.f333g     // Catch:{ all -> 0x00f0 }
            int[] r5 = (int[]) r5     // Catch:{ all -> 0x00f0 }
            r5 = r5[r4]     // Catch:{ all -> 0x00f0 }
            r3.d(r4, r5)     // Catch:{ all -> 0x00f0 }
        L_0x00ac:
            int r4 = r4 + r0
            goto L_0x0092
        L_0x00ae:
            java.lang.Object r3 = r10.f3736c     // Catch:{ RejectedExecutionException -> 0x00c2 }
            m1.s r3 = (m1.s) r3     // Catch:{ RejectedExecutionException -> 0x00c2 }
            java.util.concurrent.ScheduledThreadPoolExecutor r4 = r3.f3746h     // Catch:{ RejectedExecutionException -> 0x00c2 }
            m1.q r5 = new m1.q     // Catch:{ RejectedExecutionException -> 0x00c2 }
            java.lang.String r3 = r3.f3743d     // Catch:{ RejectedExecutionException -> 0x00c2 }
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch:{ RejectedExecutionException -> 0x00c2 }
            r6[r1] = r3     // Catch:{ RejectedExecutionException -> 0x00c2 }
            r5.<init>((m1.q) r10, (java.lang.Object[]) r6, (K.j) r12)     // Catch:{ RejectedExecutionException -> 0x00c2 }
            r4.execute(r5)     // Catch:{ RejectedExecutionException -> 0x00c2 }
        L_0x00c2:
            java.lang.Object r12 = r10.f3736c     // Catch:{ all -> 0x00f0 }
            m1.s r12 = (m1.s) r12     // Catch:{ all -> 0x00f0 }
            K.j r12 = r12.f3752o     // Catch:{ all -> 0x00f0 }
            int r12 = r12.b()     // Catch:{ all -> 0x00f0 }
            r3 = -1
            r4 = 0
            if (r12 == r3) goto L_0x011b
            if (r12 == r11) goto L_0x011b
            int r12 = r12 - r11
            long r11 = (long) r12     // Catch:{ all -> 0x00f0 }
            java.lang.Object r3 = r10.f3736c     // Catch:{ all -> 0x00f0 }
            m1.s r3 = (m1.s) r3     // Catch:{ all -> 0x00f0 }
            boolean r6 = r3.f3753p     // Catch:{ all -> 0x00f0 }
            if (r6 != 0) goto L_0x00f2
            long r6 = r3.f3750m     // Catch:{ all -> 0x00f0 }
            long r6 = r6 + r11
            r3.f3750m = r6     // Catch:{ all -> 0x00f0 }
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00e9
            r3.notifyAll()     // Catch:{ all -> 0x00f0 }
        L_0x00e9:
            java.lang.Object r3 = r10.f3736c     // Catch:{ all -> 0x00f0 }
            m1.s r3 = (m1.s) r3     // Catch:{ all -> 0x00f0 }
            r3.f3753p = r0     // Catch:{ all -> 0x00f0 }
            goto L_0x00f2
        L_0x00f0:
            r10 = move-exception
            goto L_0x014e
        L_0x00f2:
            java.lang.Object r3 = r10.f3736c     // Catch:{ all -> 0x00f0 }
            m1.s r3 = (m1.s) r3     // Catch:{ all -> 0x00f0 }
            java.util.LinkedHashMap r3 = r3.f3742c     // Catch:{ all -> 0x00f0 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x00f0 }
            if (r3 != 0) goto L_0x011c
            java.lang.Object r2 = r10.f3736c     // Catch:{ all -> 0x00f0 }
            m1.s r2 = (m1.s) r2     // Catch:{ all -> 0x00f0 }
            java.util.LinkedHashMap r2 = r2.f3742c     // Catch:{ all -> 0x00f0 }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x00f0 }
            java.lang.Object r3 = r10.f3736c     // Catch:{ all -> 0x00f0 }
            m1.s r3 = (m1.s) r3     // Catch:{ all -> 0x00f0 }
            java.util.LinkedHashMap r3 = r3.f3742c     // Catch:{ all -> 0x00f0 }
            int r3 = r3.size()     // Catch:{ all -> 0x00f0 }
            m1.y[] r3 = new m1.y[r3]     // Catch:{ all -> 0x00f0 }
            java.lang.Object[] r2 = r2.toArray(r3)     // Catch:{ all -> 0x00f0 }
            m1.y[] r2 = (m1.y[]) r2     // Catch:{ all -> 0x00f0 }
            goto L_0x011c
        L_0x011b:
            r11 = r4
        L_0x011c:
            java.util.concurrent.ThreadPoolExecutor r3 = m1.s.f3739u     // Catch:{ all -> 0x00f0 }
            m1.r r6 = new m1.r     // Catch:{ all -> 0x00f0 }
            java.lang.Object r7 = r10.f3736c     // Catch:{ all -> 0x00f0 }
            m1.s r7 = (m1.s) r7     // Catch:{ all -> 0x00f0 }
            java.lang.String r7 = r7.f3743d     // Catch:{ all -> 0x00f0 }
            java.lang.Object[] r8 = new java.lang.Object[r0]     // Catch:{ all -> 0x00f0 }
            r8[r1] = r7     // Catch:{ all -> 0x00f0 }
            r6.<init>(r10, r8)     // Catch:{ all -> 0x00f0 }
            r3.execute(r6)     // Catch:{ all -> 0x00f0 }
            monitor-exit(r13)     // Catch:{ all -> 0x00f0 }
            if (r2 == 0) goto L_0x014d
            int r10 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x014d
            int r13 = r2.length
        L_0x0138:
            if (r1 >= r13) goto L_0x014d
            r3 = r2[r1]
            monitor-enter(r3)
            long r4 = r3.f3779b     // Catch:{ all -> 0x014a }
            long r4 = r4 + r11
            r3.f3779b = r4     // Catch:{ all -> 0x014a }
            if (r10 <= 0) goto L_0x0147
            r3.notifyAll()     // Catch:{ all -> 0x014a }
        L_0x0147:
            monitor-exit(r3)     // Catch:{ all -> 0x014a }
            int r1 = r1 + r0
            goto L_0x0138
        L_0x014a:
            r10 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x014a }
            throw r10
        L_0x014d:
            return
        L_0x014e:
            monitor-exit(r13)     // Catch:{ all -> 0x00f0 }
            throw r10
        L_0x0150:
            java.lang.String r10 = "TYPE_SETTINGS length %% 6 != 0: %s"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r12 = new java.lang.Object[r0]
            r12[r1] = r11
            m1.f.c(r10, r12)
            throw r2
        L_0x015e:
            java.lang.String r10 = "TYPE_SETTINGS streamId != 0"
            java.lang.Object[] r11 = new java.lang.Object[r1]
            m1.f.c(r10, r11)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.u.p(m1.q, int, byte, int):void");
    }

    public static int f(int i, byte b2, short s2) {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s2 <= i) {
            return (short) (i - s2);
        }
        f.c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s2), Integer.valueOf(i));
        throw null;
    }

    public final void close() {
        this.f3763a.close();
    }

    /* JADX WARNING: type inference failed for: r6v9, types: [r1.e, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012d, code lost:
        if (r16 == false) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012f, code lost:
        r6.h();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(m1.q r19, int r20, byte r21, int r22) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r21
            r5 = r22
            r3 = 2
            r4 = 1
            r6 = 0
            r7 = 0
            if (r5 == 0) goto L_0x0142
            r8 = r2 & 1
            if (r8 == 0) goto L_0x0014
            r8 = 1
            goto L_0x0015
        L_0x0014:
            r8 = 0
        L_0x0015:
            r9 = r2 & 32
            if (r9 != 0) goto L_0x0139
            r6 = r2 & 8
            if (r6 == 0) goto L_0x002a
            r1.q r6 = r1.f3763a
            byte r6 = r6.i()
            r6 = r6 & 255(0xff, float:3.57E-43)
            short r6 = (short) r6
            r9 = r6
            r6 = r20
            goto L_0x002d
        L_0x002a:
            r6 = r20
            r9 = 0
        L_0x002d:
            int r10 = f(r6, r2, r9)
            r1.q r2 = r1.f3763a
            java.lang.Object r6 = r0.f3736c
            m1.s r6 = (m1.s) r6
            r6.getClass()
            if (r5 == 0) goto L_0x0093
            r6 = r5 & 1
            if (r6 != 0) goto L_0x0093
            java.lang.Object r0 = r0.f3736c
            m1.s r0 = (m1.s) r0
            r0.getClass()
            r1.e r6 = new r1.e
            r6.<init>()
            long r11 = (long) r10
            r2.p(r11)
            r2.e(r6, r11)
            long r13 = r6.f4579b
            int r2 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0077
            java.util.concurrent.ThreadPoolExecutor r11 = r0.i
            m1.l r12 = new m1.l
            java.lang.Integer r2 = java.lang.Integer.valueOf(r22)
            java.lang.String r13 = r0.f3743d
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r7] = r13
            r14[r4] = r2
            r2 = r12
            r3 = r0
            r4 = r14
            r5 = r22
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r11.execute(r12)
            goto L_0x0132
        L_0x0077:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r3 = r6.f4579b
            r2.append(r3)
            java.lang.String r3 = " != "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0093:
            java.lang.Object r6 = r0.f3736c
            m1.s r6 = (m1.s) r6
            m1.y r6 = r6.h(r5)
            if (r6 != 0) goto L_0x00aa
            java.lang.Object r0 = r0.f3736c
            m1.s r0 = (m1.s) r0
            r0.m(r5, r3)
            long r3 = (long) r10
            r2.q(r3)
            goto L_0x0132
        L_0x00aa:
            m1.w r0 = r6.f3783g
            long r10 = (long) r10
        L_0x00ad:
            r12 = 0
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x0128
            m1.y r3 = r0.f3775f
            monitor-enter(r3)
            boolean r5 = r0.e     // Catch:{ all -> 0x0125 }
            r1.e r14 = r0.f3772b     // Catch:{ all -> 0x0125 }
            long r14 = r14.f4579b     // Catch:{ all -> 0x0125 }
            long r14 = r14 + r10
            r16 = r8
            long r7 = r0.f3773c     // Catch:{ all -> 0x0125 }
            int r17 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r17 <= 0) goto L_0x00c7
            r7 = 1
            goto L_0x00c8
        L_0x00c7:
            r7 = 0
        L_0x00c8:
            monitor-exit(r3)     // Catch:{ all -> 0x0125 }
            if (r7 == 0) goto L_0x00e0
            r2.q(r10)
            m1.y r0 = r0.f3775f
            r2 = 4
            boolean r3 = r0.d(r2)
            if (r3 != 0) goto L_0x00d8
            goto L_0x012d
        L_0x00d8:
            m1.s r3 = r0.f3781d
            int r0 = r0.f3780c
            r3.m(r0, r2)
            goto L_0x012d
        L_0x00e0:
            if (r5 == 0) goto L_0x00e6
            r2.q(r10)
            goto L_0x012d
        L_0x00e6:
            r1.e r3 = r0.f3771a
            long r7 = r2.e(r3, r10)
            r14 = -1
            int r3 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r3 == 0) goto L_0x011f
            long r10 = r10 - r7
            m1.y r3 = r0.f3775f
            monitor-enter(r3)
            r1.e r5 = r0.f3772b     // Catch:{ all -> 0x0116 }
            long r7 = r5.f4579b     // Catch:{ all -> 0x0116 }
            int r17 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r17 != 0) goto L_0x0100
            r7 = 1
            goto L_0x0101
        L_0x0100:
            r7 = 0
        L_0x0101:
            r1.e r8 = r0.f3771a     // Catch:{ all -> 0x0116 }
        L_0x0103:
            r12 = 8192(0x2000, double:4.0474E-320)
            long r12 = r8.e(r5, r12)     // Catch:{ all -> 0x0116 }
            int r17 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r17 == 0) goto L_0x010e
            goto L_0x0103
        L_0x010e:
            if (r7 == 0) goto L_0x0118
            m1.y r5 = r0.f3775f     // Catch:{ all -> 0x0116 }
            r5.notifyAll()     // Catch:{ all -> 0x0116 }
            goto L_0x0118
        L_0x0116:
            r0 = move-exception
            goto L_0x011d
        L_0x0118:
            monitor-exit(r3)     // Catch:{ all -> 0x0116 }
            r8 = r16
            r7 = 0
            goto L_0x00ad
        L_0x011d:
            monitor-exit(r3)     // Catch:{ all -> 0x0116 }
            throw r0
        L_0x011f:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        L_0x0125:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0125 }
            throw r0
        L_0x0128:
            r16 = r8
            r0.getClass()
        L_0x012d:
            if (r16 == 0) goto L_0x0132
            r6.h()
        L_0x0132:
            r1.q r0 = r1.f3763a
            long r2 = (long) r9
            r0.q(r2)
            return
        L_0x0139:
            java.lang.String r0 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            m1.f.c(r0, r2)
            throw r6
        L_0x0142:
            r2 = 0
            java.lang.String r0 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            m1.f.c(r0, r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.u.i(m1.q, int, byte, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        throw new java.io.IOException(Q0.E.e("Header index too large ", r4));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList k(int r3, short r4, byte r5, int r6) {
        /*
            r2 = this;
            m1.t r0 = r2.f3764b
            r0.e = r3
            r0.f3759b = r3
            r0.f3762f = r4
            r0.f3760c = r5
            r0.f3761d = r6
        L_0x000c:
            m1.c r3 = r2.f3766d
            r1.q r4 = r3.f3687b
            boolean r5 = r4.f()
            java.util.ArrayList r6 = r3.f3686a
            if (r5 != 0) goto L_0x011d
            byte r4 = r4.i()
            r5 = r4 & 255(0xff, float:3.57E-43)
            r0 = 128(0x80, float:1.794E-43)
            if (r5 == r0) goto L_0x0115
            r1 = r4 & 128(0x80, float:1.794E-43)
            if (r1 != r0) goto L_0x005f
            r4 = 127(0x7f, float:1.78E-43)
            int r4 = r3.e(r5, r4)
            int r5 = r4 + -1
            if (r5 < 0) goto L_0x003d
            m1.b[] r0 = m1.e.f3700a
            int r1 = r0.length
            int r1 = r1 + -1
            if (r5 > r1) goto L_0x003d
            r3 = r0[r5]
            r6.add(r3)
            goto L_0x000c
        L_0x003d:
            m1.b[] r0 = m1.e.f3700a
            int r0 = r0.length
            int r5 = r5 - r0
            int r0 = r3.f3690f
            int r0 = r0 + 1
            int r0 = r0 + r5
            if (r0 < 0) goto L_0x0053
            m1.b[] r3 = r3.e
            int r5 = r3.length
            if (r0 >= r5) goto L_0x0053
            r3 = r3[r0]
            r6.add(r3)
            goto L_0x000c
        L_0x0053:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r5 = "Header index too large "
            java.lang.String r4 = Q0.E.e(r5, r4)
            r3.<init>(r4)
            throw r3
        L_0x005f:
            r0 = 64
            if (r5 != r0) goto L_0x0077
            r1.h r4 = r3.d()
            m1.e.a(r4)
            r1.h r5 = r3.d()
            m1.b r6 = new m1.b
            r6.<init>((r1.h) r4, (r1.h) r5)
            r3.c(r6)
            goto L_0x000c
        L_0x0077:
            r1 = r4 & 64
            if (r1 != r0) goto L_0x0095
            r4 = 63
            int r4 = r3.e(r5, r4)
            int r4 = r4 + -1
            r1.h r4 = r3.b(r4)
            r1.h r5 = r3.d()
            m1.b r6 = new m1.b
            r6.<init>((r1.h) r4, (r1.h) r5)
            r3.c(r6)
            goto L_0x000c
        L_0x0095:
            r4 = r4 & 32
            r0 = 32
            if (r4 != r0) goto L_0x00df
            r4 = 31
            int r4 = r3.e(r5, r4)
            r3.f3689d = r4
            if (r4 < 0) goto L_0x00c9
            int r5 = r3.f3688c
            if (r4 > r5) goto L_0x00c9
            int r5 = r3.f3692h
            if (r4 >= r5) goto L_0x000c
            if (r4 != 0) goto L_0x00c3
            m1.b[] r4 = r3.e
            r5 = 0
            java.util.Arrays.fill(r4, r5)
            m1.b[] r4 = r3.e
            int r4 = r4.length
            int r4 = r4 + -1
            r3.f3690f = r4
            r4 = 0
            r3.f3691g = r4
            r3.f3692h = r4
            goto L_0x000c
        L_0x00c3:
            int r5 = r5 - r4
            r3.a(r5)
            goto L_0x000c
        L_0x00c9:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Invalid dynamic table size update "
            r5.<init>(r6)
            int r3 = r3.f3689d
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L_0x00df:
            r4 = 16
            if (r5 == r4) goto L_0x0100
            if (r5 != 0) goto L_0x00e6
            goto L_0x0100
        L_0x00e6:
            r4 = 15
            int r4 = r3.e(r5, r4)
            int r4 = r4 + -1
            r1.h r4 = r3.b(r4)
            r1.h r3 = r3.d()
            m1.b r5 = new m1.b
            r5.<init>((r1.h) r4, (r1.h) r3)
            r6.add(r5)
            goto L_0x000c
        L_0x0100:
            r1.h r4 = r3.d()
            m1.e.a(r4)
            r1.h r3 = r3.d()
            m1.b r5 = new m1.b
            r5.<init>((r1.h) r4, (r1.h) r3)
            r6.add(r5)
            goto L_0x000c
        L_0x0115:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "index == 0"
            r3.<init>(r4)
            throw r3
        L_0x011d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r6)
            r6.clear()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.u.k(int, short, byte, int):java.util.ArrayList");
    }

    public u(q qVar, boolean z2) {
        this.f3763a = qVar;
        this.f3765c = z2;
        t tVar = new t(qVar);
        this.f3764b = tVar;
        this.f3766d = new C0180c(tVar);
    }

    public static int m(q qVar) {
        return (qVar.i() & 255) | ((qVar.i() & 255) << 16) | ((qVar.i() & 255) << 8);
    }
}
