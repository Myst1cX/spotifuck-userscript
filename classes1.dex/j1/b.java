package j1;

import A.k;
import Q0.E;
import g1.A;
import g1.B;
import g1.C;
import g1.C0102a;
import g1.C0103b;
import g1.F;
import g1.n;
import g1.r;
import g1.u;
import g1.x;
import g1.y;
import h1.c;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import k1.d;
import l1.e;
import m1.h;
import m1.o;
import m1.s;
import o1.g;
import r1.p;
import r1.q;

public final class b extends o {

    /* renamed from: b  reason: collision with root package name */
    public final n f3528b;

    /* renamed from: c  reason: collision with root package name */
    public final F f3529c;

    /* renamed from: d  reason: collision with root package name */
    public Socket f3530d;
    public Socket e;

    /* renamed from: f  reason: collision with root package name */
    public r f3531f;

    /* renamed from: g  reason: collision with root package name */
    public y f3532g;

    /* renamed from: h  reason: collision with root package name */
    public s f3533h;
    public q i;

    /* renamed from: j  reason: collision with root package name */
    public p f3534j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3535k;

    /* renamed from: l  reason: collision with root package name */
    public int f3536l;

    /* renamed from: m  reason: collision with root package name */
    public int f3537m = 1;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f3538n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    public long f3539o = Long.MAX_VALUE;

    public final void b(m1.y yVar) {
        yVar.c(5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r10, int r11, int r12, boolean r13, g1.C0103b r14) {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            g1.y r2 = r9.f3532g
            if (r2 != 0) goto L_0x0116
            g1.F r2 = r9.f3529c
            g1.a r2 = r2.f2660a
            java.util.List r3 = r2.f2673f
            j1.a r4 = new j1.a
            r4.<init>(r3)
            javax.net.ssl.SSLSocketFactory r2 = r2.f2675h
            if (r2 != 0) goto L_0x004e
            g1.p r2 = g1.p.f2746f
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x0041
            g1.F r2 = r9.f3529c
            g1.a r2 = r2.f2660a
            g1.u r2 = r2.f2669a
            java.lang.String r2 = r2.f2777d
            o1.g r3 = o1.g.f4433a
            boolean r3 = r3.j(r2)
            if (r3 == 0) goto L_0x002e
            goto L_0x004e
        L_0x002e:
            j1.c r10 = new j1.c
            java.net.UnknownServiceException r11 = new java.net.UnknownServiceException
            java.lang.String r12 = "CLEARTEXT communication to "
            java.lang.String r13 = " not permitted by network security policy"
            java.lang.String r12 = Q0.E.g(r12, r2, r13)
            r11.<init>(r12)
            r10.<init>(r11)
            throw r10
        L_0x0041:
            j1.c r10 = new j1.c
            java.net.UnknownServiceException r11 = new java.net.UnknownServiceException
            java.lang.String r12 = "CLEARTEXT communication not enabled for client"
            r11.<init>(r12)
            r10.<init>(r11)
            throw r10
        L_0x004e:
            r2 = 0
            r3 = r2
        L_0x0050:
            g1.F r5 = r9.f3529c     // Catch:{ IOException -> 0x006f }
            g1.a r6 = r5.f2660a     // Catch:{ IOException -> 0x006f }
            javax.net.ssl.SSLSocketFactory r6 = r6.f2675h     // Catch:{ IOException -> 0x006f }
            if (r6 == 0) goto L_0x0064
            java.net.Proxy r5 = r5.f2661b     // Catch:{ IOException -> 0x006f }
            java.net.Proxy$Type r5 = r5.type()     // Catch:{ IOException -> 0x006f }
            java.net.Proxy$Type r6 = java.net.Proxy.Type.HTTP     // Catch:{ IOException -> 0x006f }
            if (r5 != r6) goto L_0x0064
            r5 = 1
            goto L_0x0065
        L_0x0064:
            r5 = 0
        L_0x0065:
            if (r5 == 0) goto L_0x0071
            r9.e(r10, r11, r12, r14)     // Catch:{ IOException -> 0x006f }
            java.net.Socket r5 = r9.f3530d     // Catch:{ IOException -> 0x006f }
            if (r5 != 0) goto L_0x0074
            goto L_0x007e
        L_0x006f:
            r5 = move-exception
            goto L_0x00b7
        L_0x0071:
            r9.d(r10, r11, r14)     // Catch:{ IOException -> 0x006f }
        L_0x0074:
            r9.f(r4, r14)     // Catch:{ IOException -> 0x006f }
            g1.F r5 = r9.f3529c     // Catch:{ IOException -> 0x006f }
            java.net.InetSocketAddress r5 = r5.f2662c     // Catch:{ IOException -> 0x006f }
            r14.getClass()     // Catch:{ IOException -> 0x006f }
        L_0x007e:
            g1.F r10 = r9.f3529c
            g1.a r11 = r10.f2660a
            javax.net.ssl.SSLSocketFactory r11 = r11.f2675h
            if (r11 == 0) goto L_0x00a2
            java.net.Proxy r10 = r10.f2661b
            java.net.Proxy$Type r10 = r10.type()
            java.net.Proxy$Type r11 = java.net.Proxy.Type.HTTP
            if (r10 != r11) goto L_0x00a2
            java.net.Socket r10 = r9.f3530d
            if (r10 == 0) goto L_0x0095
            goto L_0x00a2
        L_0x0095:
            java.net.ProtocolException r10 = new java.net.ProtocolException
            java.lang.String r11 = "Too many tunnel connections attempted: 21"
            r10.<init>(r11)
            j1.c r11 = new j1.c
            r11.<init>(r10)
            throw r11
        L_0x00a2:
            m1.s r10 = r9.f3533h
            if (r10 == 0) goto L_0x00b6
            g1.n r10 = r9.f3528b
            monitor-enter(r10)
            m1.s r11 = r9.f3533h     // Catch:{ all -> 0x00b3 }
            int r11 = r11.i()     // Catch:{ all -> 0x00b3 }
            r9.f3537m = r11     // Catch:{ all -> 0x00b3 }
            monitor-exit(r10)     // Catch:{ all -> 0x00b3 }
            goto L_0x00b6
        L_0x00b3:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00b3 }
            throw r11
        L_0x00b6:
            return
        L_0x00b7:
            java.net.Socket r6 = r9.e
            h1.c.d(r6)
            java.net.Socket r6 = r9.f3530d
            h1.c.d(r6)
            r9.e = r2
            r9.f3530d = r2
            r9.i = r2
            r9.f3534j = r2
            r9.f3531f = r2
            r9.f3532g = r2
            r9.f3533h = r2
            g1.F r6 = r9.f3529c
            java.net.InetSocketAddress r6 = r6.f2662c
            r14.getClass()
            if (r3 != 0) goto L_0x00de
            j1.c r3 = new j1.c
            r3.<init>(r5)
            goto L_0x00ed
        L_0x00de:
            java.io.IOException r6 = r3.f3541a
            java.lang.reflect.Method r7 = j1.c.f3540b
            if (r7 == 0) goto L_0x00eb
            java.lang.Object[] r8 = new java.lang.Object[r1]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00eb }
            r8[r0] = r6     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00eb }
            r7.invoke(r5, r8)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00eb }
        L_0x00eb:
            r3.f3541a = r5
        L_0x00ed:
            if (r13 == 0) goto L_0x0115
            r4.f3527d = r1
            boolean r6 = r4.f3526c
            if (r6 == 0) goto L_0x0115
            boolean r6 = r5 instanceof java.net.ProtocolException
            if (r6 != 0) goto L_0x0115
            boolean r6 = r5 instanceof java.io.InterruptedIOException
            if (r6 != 0) goto L_0x0115
            boolean r6 = r5 instanceof javax.net.ssl.SSLHandshakeException
            if (r6 == 0) goto L_0x0109
            java.lang.Throwable r7 = r5.getCause()
            boolean r7 = r7 instanceof java.security.cert.CertificateException
            if (r7 != 0) goto L_0x0115
        L_0x0109:
            boolean r7 = r5 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r7 != 0) goto L_0x0115
            if (r6 != 0) goto L_0x0050
            boolean r5 = r5 instanceof javax.net.ssl.SSLProtocolException
            if (r5 == 0) goto L_0x0115
            goto L_0x0050
        L_0x0115:
            throw r3
        L_0x0116:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "already connected"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.b.c(int, int, int, boolean, g1.b):void");
    }

    public final void a(s sVar) {
        synchronized (this.f3528b) {
            this.f3537m = sVar.i();
        }
    }

    public final void d(int i2, int i3, C0103b bVar) {
        Socket socket;
        F f2 = this.f3529c;
        Proxy proxy = f2.f2661b;
        InetSocketAddress inetSocketAddress = f2.f2662c;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) {
            socket = f2.f2660a.f2671c.createSocket();
        } else {
            socket = new Socket(proxy);
        }
        this.f3530d = socket;
        bVar.getClass();
        this.f3530d.setSoTimeout(i3);
        try {
            g.f4433a.f(this.f3530d, inetSocketAddress, i2);
            try {
                this.i = new q(r1.o.c(this.f3530d));
                this.f3534j = new p(r1.o.a(this.f3530d));
            } catch (NullPointerException e2) {
                if ("throw with null exception".equals(e2.getMessage())) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + inetSocketAddress);
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void e(int i2, int i3, int i4, C0103b bVar) {
        k kVar = new k(5);
        F f2 = this.f3529c;
        u uVar = f2.f2660a.f2669a;
        if (uVar != null) {
            kVar.f21f = uVar;
            kVar.j("Host", c.j(uVar, true));
            kVar.j("Proxy-Connection", "Keep-Alive");
            kVar.j("User-Agent", "okhttp/3.10.0");
            A b2 = kVar.b();
            d(i2, i3, bVar);
            q qVar = this.i;
            l1.g gVar = new l1.g((x) null, (f) null, qVar, this.f3534j);
            r1.x a2 = qVar.f4599b.a();
            long j2 = (long) i3;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            a2.g(j2, timeUnit);
            this.f3534j.f4596b.a().g((long) i4, timeUnit);
            gVar.h(b2.f2634c, "CONNECT " + c.j(b2.f2632a, true) + " HTTP/1.1");
            gVar.c();
            B f3 = gVar.f(false);
            f3.f2636a = b2;
            C a3 = f3.a();
            long a4 = d.a(a3);
            if (a4 == -1) {
                a4 = 0;
            }
            e g2 = gVar.g(a4);
            c.p(g2, Integer.MAX_VALUE, timeUnit);
            g2.close();
            int i5 = a3.f2648c;
            if (i5 != 200) {
                if (i5 == 407) {
                    f2.f2660a.f2672d.getClass();
                    throw new IOException("Failed to authenticate with proxy");
                }
                throw new IOException(E.e("Unexpected response code for CONNECT: ", i5));
            } else if (!this.i.f4598a.g() || !this.f3534j.f4595a.g()) {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        } else {
            throw new NullPointerException("url == null");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r10v21, types: [m1.m, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01b2 A[Catch:{ all -> 0x01a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01b8 A[Catch:{ all -> 0x01a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(j1.a r10, g1.C0103b r11) {
        /*
            r9 = this;
            g1.F r0 = r9.f3529c
            g1.a r0 = r0.f2660a
            javax.net.ssl.SSLSocketFactory r0 = r0.f2675h
            if (r0 != 0) goto L_0x0011
            g1.y r10 = g1.y.HTTP_1_1
            r9.f3532g = r10
            java.net.Socket r10 = r9.f3530d
            r9.e = r10
            return
        L_0x0011:
            r11.getClass()
            java.lang.String r11 = "Hostname "
            g1.F r0 = r9.f3529c
            g1.a r0 = r0.f2660a
            javax.net.ssl.SSLSocketFactory r1 = r0.f2675h
            g1.u r2 = r0.f2669a
            r3 = 0
            java.net.Socket r4 = r9.f3530d     // Catch:{ AssertionError -> 0x01ab }
            java.lang.String r5 = r2.f2777d     // Catch:{ AssertionError -> 0x01ab }
            int r6 = r2.e     // Catch:{ AssertionError -> 0x01ab }
            r7 = 1
            java.net.Socket r1 = r1.createSocket(r4, r5, r6, r7)     // Catch:{ AssertionError -> 0x01ab }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ AssertionError -> 0x01ab }
            g1.p r10 = r10.a(r1)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            boolean r10 = r10.f2748b
            if (r10 == 0) goto L_0x0046
            o1.g r4 = o1.g.f4433a     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.String r5 = r2.f2777d     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.util.List r6 = r0.e     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r4.e(r1, r5, r6)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            goto L_0x0046
        L_0x003e:
            r10 = move-exception
            r3 = r1
            goto L_0x01b9
        L_0x0042:
            r10 = move-exception
            r3 = r1
            goto L_0x01ac
        L_0x0046:
            r1.startHandshake()     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            javax.net.ssl.SSLSession r4 = r1.getSession()     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.String r5 = r4.getProtocol()     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.String r6 = "NONE"
            boolean r5 = r6.equals(r5)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            if (r5 != 0) goto L_0x01a1
            java.lang.String r5 = "SSL_NULL_WITH_NULL_NULL"
            java.lang.String r6 = r4.getCipherSuite()     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            boolean r5 = r5.equals(r6)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            if (r5 != 0) goto L_0x01a1
            g1.r r5 = g1.r.a(r4)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            q1.c r6 = r0.i     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.String r8 = r2.f2777d     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            boolean r4 = r6.verify(r8, r4)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.util.List r6 = r5.f2764c
            r8 = 0
            if (r4 == 0) goto L_0x015f
            g1.k r11 = r0.f2676j     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.String r0 = r2.f2777d     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r11.a(r0, r6)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            if (r10 == 0) goto L_0x0085
            o1.g r10 = o1.g.f4433a     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.String r3 = r10.h(r1)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
        L_0x0085:
            r9.e = r1     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r1.b r10 = r1.o.c(r1)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r1.q r11 = new r1.q     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r11.<init>(r10)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r9.i = r11     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.net.Socket r10 = r9.e     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r1.a r10 = r1.o.a(r10)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r1.p r11 = new r1.p     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r11.<init>(r10)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r9.f3534j = r11     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r9.f3531f = r5     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            if (r3 == 0) goto L_0x00a8
            g1.y r10 = g1.y.a(r3)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            goto L_0x00aa
        L_0x00a8:
            g1.y r10 = g1.y.HTTP_1_1     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
        L_0x00aa:
            r9.f3532g = r10     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            o1.g r10 = o1.g.f4433a
            r10.a(r1)
            g1.y r10 = r9.f3532g
            g1.y r11 = g1.y.HTTP_2
            if (r10 != r11) goto L_0x015e
            java.net.Socket r10 = r9.e
            r10.setSoTimeout(r8)
            m1.m r10 = new m1.m
            r10.<init>()
            m1.n r11 = m1.o.f3731a
            r10.e = r11
            r10.f3730f = r7
            java.net.Socket r11 = r9.e
            g1.F r0 = r9.f3529c
            g1.a r0 = r0.f2660a
            g1.u r0 = r0.f2669a
            java.lang.String r0 = r0.f2777d
            r1.q r1 = r9.i
            r1.p r2 = r9.f3534j
            r10.f3726a = r11
            r10.f3727b = r0
            r10.f3728c = r1
            r10.f3729d = r2
            r10.e = r9
            m1.s r11 = new m1.s
            r11.<init>(r10)
            r9.f3533h = r11
            m1.z r10 = r11.f3755r
            java.lang.String r0 = ">> CONNECTION "
            monitor-enter(r10)
            boolean r1 = r10.e     // Catch:{ all -> 0x0119 }
            if (r1 != 0) goto L_0x0154
            boolean r1 = r10.f3789b     // Catch:{ all -> 0x0119 }
            if (r1 != 0) goto L_0x00f5
            monitor-exit(r10)
            goto L_0x0130
        L_0x00f5:
            java.util.logging.Logger r1 = m1.z.f3787g     // Catch:{ all -> 0x0119 }
            java.util.logging.Level r2 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0119 }
            boolean r2 = r1.isLoggable(r2)     // Catch:{ all -> 0x0119 }
            if (r2 == 0) goto L_0x011b
            r1.h r2 = m1.f.f3702a     // Catch:{ all -> 0x0119 }
            java.lang.String r2 = r2.h()     // Catch:{ all -> 0x0119 }
            byte[] r3 = h1.c.f3086a     // Catch:{ all -> 0x0119 }
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ all -> 0x0119 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0119 }
            r3.<init>(r0)     // Catch:{ all -> 0x0119 }
            r3.append(r2)     // Catch:{ all -> 0x0119 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0119 }
            r1.fine(r0)     // Catch:{ all -> 0x0119 }
            goto L_0x011b
        L_0x0119:
            r11 = move-exception
            goto L_0x015c
        L_0x011b:
            r1.p r0 = r10.f3788a     // Catch:{ all -> 0x0119 }
            r1.h r1 = m1.f.f3702a     // Catch:{ all -> 0x0119 }
            byte[] r1 = r1.f4581a     // Catch:{ all -> 0x0119 }
            java.lang.Object r1 = r1.clone()     // Catch:{ all -> 0x0119 }
            byte[] r1 = (byte[]) r1     // Catch:{ all -> 0x0119 }
            r0.g(r1)     // Catch:{ all -> 0x0119 }
            r1.p r0 = r10.f3788a     // Catch:{ all -> 0x0119 }
            r0.flush()     // Catch:{ all -> 0x0119 }
            monitor-exit(r10)
        L_0x0130:
            m1.z r10 = r11.f3755r
            K.j r0 = r11.f3751n
            r10.m(r0)
            K.j r10 = r11.f3751n
            int r10 = r10.b()
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r10 == r0) goto L_0x0149
            m1.z r1 = r11.f3755r
            int r10 = r10 - r0
            long r2 = (long) r10
            r1.o(r8, r2)
        L_0x0149:
            java.lang.Thread r10 = new java.lang.Thread
            m1.q r11 = r11.f3756s
            r10.<init>(r11)
            r10.start()
            goto L_0x015e
        L_0x0154:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ all -> 0x0119 }
            java.lang.String r0 = "closed"
            r11.<init>(r0)     // Catch:{ all -> 0x0119 }
            throw r11     // Catch:{ all -> 0x0119 }
        L_0x015c:
            monitor-exit(r10)     // Catch:{ all -> 0x0119 }
            throw r11
        L_0x015e:
            return
        L_0x015f:
            java.lang.Object r10 = r6.get(r8)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            javax.net.ssl.SSLPeerUnverifiedException r0 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r3.<init>(r11)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.String r11 = r2.f2777d     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r3.append(r11)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.String r11 = " not verified:\n    certificate: "
            r3.append(r11)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.String r11 = g1.k.b(r10)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r3.append(r11)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.String r11 = "\n    DN: "
            r3.append(r11)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.security.Principal r11 = r10.getSubjectDN()     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.String r11 = r11.getName()     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r3.append(r11)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.String r11 = "\n    subjectAltNames: "
            r3.append(r11)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.util.ArrayList r10 = q1.c.a(r10)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r3.append(r10)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.String r10 = r3.toString()     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            r0.<init>(r10)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            throw r0     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
        L_0x01a1:
            java.io.IOException r10 = new java.io.IOException     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            java.lang.String r11 = "a valid ssl session was not established"
            r10.<init>(r11)     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
            throw r10     // Catch:{ AssertionError -> 0x0042, all -> 0x003e }
        L_0x01a9:
            r10 = move-exception
            goto L_0x01b9
        L_0x01ab:
            r10 = move-exception
        L_0x01ac:
            boolean r11 = h1.c.n(r10)     // Catch:{ all -> 0x01a9 }
            if (r11 == 0) goto L_0x01b8
            java.io.IOException r11 = new java.io.IOException     // Catch:{ all -> 0x01a9 }
            r11.<init>(r10)     // Catch:{ all -> 0x01a9 }
            throw r11     // Catch:{ all -> 0x01a9 }
        L_0x01b8:
            throw r10     // Catch:{ all -> 0x01a9 }
        L_0x01b9:
            if (r3 == 0) goto L_0x01c0
            o1.g r11 = o1.g.f4433a
            r11.a(r3)
        L_0x01c0:
            h1.c.d(r3)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.b.f(j1.a, g1.b):void");
    }

    public final boolean g(C0102a aVar, F f2) {
        Proxy.Type type;
        if (this.f3538n.size() < this.f3537m && !this.f3535k) {
            C0103b bVar = C0103b.e;
            F f3 = this.f3529c;
            C0102a aVar2 = f3.f2660a;
            bVar.getClass();
            if (!aVar2.a(aVar)) {
                return false;
            }
            u uVar = aVar.f2669a;
            if (uVar.f2777d.equals(f3.f2660a.f2669a.f2777d)) {
                return true;
            }
            if (this.f3533h == null || f2 == null || f2.f2661b.type() != (type = Proxy.Type.DIRECT) || f3.f2661b.type() != type) {
                return false;
            }
            if (!f3.f2662c.equals(f2.f2662c) || f2.f2660a.i != q1.c.f4510a || !j(uVar)) {
                return false;
            }
            try {
                aVar.f2676j.a(uVar.f2777d, this.f3531f.f2764c);
                return true;
            } catch (SSLPeerUnverifiedException unused) {
            }
        }
        return false;
    }

    public final boolean h(boolean z2) {
        int soTimeout;
        boolean z3;
        if (this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        s sVar = this.f3533h;
        if (sVar != null) {
            synchronized (sVar) {
                z3 = sVar.f3745g;
            }
            return !z3;
        }
        if (z2) {
            try {
                soTimeout = this.e.getSoTimeout();
                this.e.setSoTimeout(1);
                if (this.i.f()) {
                    this.e.setSoTimeout(soTimeout);
                    return false;
                }
                this.e.setSoTimeout(soTimeout);
                return true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            } catch (Throwable th) {
                this.e.setSoTimeout(soTimeout);
                throw th;
            }
        }
        return true;
    }

    public final k1.b i(x xVar, k1.e eVar, f fVar) {
        if (this.f3533h != null) {
            return new h(eVar, fVar, this.f3533h);
        }
        Socket socket = this.e;
        int i2 = eVar.f3581j;
        socket.setSoTimeout(i2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.i.f4599b.a().g((long) i2, timeUnit);
        this.f3534j.f4596b.a().g((long) eVar.f3582k, timeUnit);
        return new l1.g(xVar, fVar, this.i, this.f3534j);
    }

    public final boolean j(u uVar) {
        int i2 = uVar.e;
        u uVar2 = this.f3529c.f2660a.f2669a;
        if (i2 != uVar2.e) {
            return false;
        }
        String str = uVar.f2777d;
        if (str.equals(uVar2.f2777d)) {
            return true;
        }
        r rVar = this.f3531f;
        if (rVar == null || !q1.c.c(str, (X509Certificate) rVar.f2764c.get(0))) {
            return false;
        }
        return true;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        F f2 = this.f3529c;
        sb.append(f2.f2660a.f2669a.f2777d);
        sb.append(":");
        sb.append(f2.f2660a.f2669a.e);
        sb.append(", proxy=");
        sb.append(f2.f2661b);
        sb.append(" hostAddress=");
        sb.append(f2.f2662c);
        sb.append(" cipherSuite=");
        r rVar = this.f3531f;
        if (rVar != null) {
            obj = rVar.f2763b;
        } else {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f3532g);
        sb.append('}');
        return sb.toString();
    }

    public b(n nVar, F f2) {
        this.f3528b = nVar;
        this.f3529c = f2;
    }
}
