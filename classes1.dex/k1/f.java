package k1;

import K.j;
import g1.A;
import g1.C;
import g1.C0102a;
import g1.C0103b;
import g1.k;
import g1.u;
import g1.v;
import g1.x;
import j1.d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import q1.c;

public final class f implements v {

    /* renamed from: a  reason: collision with root package name */
    public final x f3584a;

    /* renamed from: b  reason: collision with root package name */
    public Object f3585b;

    public static boolean d(C c2, u uVar) {
        u uVar2 = c2.f2646a.f2632a;
        if (!uVar2.f2777d.equals(uVar.f2777d) || uVar2.e != uVar.e || !uVar2.f2774a.equals(uVar.f2774a)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r14v0 */
    /* JADX WARNING: type inference failed for: r14v1, types: [k1.b, j1.b, g1.E] */
    /* JADX WARNING: type inference failed for: r14v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a1, code lost:
        if (r16 > 0) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e5, code lost:
        if (r16 == 0) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fa, code lost:
        if (r8.equals("HEAD") == false) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0184 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0188  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g1.C a(k1.e r18) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            g1.A r0 = r2.f3578f
            g1.z r10 = r2.f3579g
            g1.b r11 = r2.f3580h
            j1.f r12 = new j1.f
            g1.x r4 = r1.f3584a
            g1.n r5 = r4.f2813o
            g1.u r4 = r0.f2632a
            g1.a r6 = r1.b(r4)
            java.lang.Object r9 = r1.f3585b
            r4 = r12
            r7 = r10
            r8 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r14 = 0
            r4 = r0
            r5 = r14
            r6 = 0
        L_0x0022:
            r7 = 1
            g1.C r0 = r2.b(r4, r12, r14, r14)     // Catch:{ c -> 0x01ff, IOException -> 0x01ef }
            if (r5 == 0) goto L_0x004a
            g1.B r0 = r0.h()
            g1.B r4 = r5.h()
            r4.f2641g = r14
            g1.C r4 = r4.a()
            g1.E r5 = r4.f2651g
            if (r5 != 0) goto L_0x0042
            r0.f2643j = r4
            g1.C r0 = r0.a()
            goto L_0x004a
        L_0x0042:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "priorResponse.body != null"
            r0.<init>(r2)
            throw r0
        L_0x004a:
            g1.F r4 = r12.f3551c
            g1.A r5 = r0.f2646a
            java.lang.String r8 = r5.f2633b
            java.lang.String r9 = "GET"
            g1.x r15 = r1.f3584a
            int r13 = r0.f2648c
            r3 = 307(0x133, float:4.3E-43)
            if (r13 == r3) goto L_0x00ee
            r3 = 308(0x134, float:4.32E-43)
            if (r13 == r3) goto L_0x00ee
            r3 = 401(0x191, float:5.62E-43)
            if (r13 == r3) goto L_0x00e8
            g1.C r3 = r0.f2653j
            r16 = 2147483647(0x7fffffff, float:NaN)
            r14 = 503(0x1f7, float:7.05E-43)
            if (r13 == r14) goto L_0x00c5
            r14 = 407(0x197, float:5.7E-43)
            if (r13 == r14) goto L_0x00a6
            r4 = 408(0x198, float:5.72E-43)
            if (r13 == r4) goto L_0x007a
            switch(r13) {
                case 300: goto L_0x00fe;
                case 301: goto L_0x00fe;
                case 302: goto L_0x00fe;
                case 303: goto L_0x00fe;
                default: goto L_0x0076;
            }
        L_0x0076:
            r3 = 0
        L_0x0077:
            r13 = 0
            goto L_0x0182
        L_0x007a:
            boolean r7 = r15.f2817s
            if (r7 != 0) goto L_0x007f
            goto L_0x0076
        L_0x007f:
            if (r3 == 0) goto L_0x0086
            int r3 = r3.f2648c
            if (r3 != r4) goto L_0x0086
            goto L_0x0076
        L_0x0086:
            java.lang.String r3 = "Retry-After"
            java.lang.String r3 = r0.g(r3)
            if (r3 != 0) goto L_0x0091
            r16 = 0
            goto L_0x00a1
        L_0x0091:
            java.lang.String r4 = "\\d+"
            boolean r4 = r3.matches(r4)
            if (r4 == 0) goto L_0x00a1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r16 = r3.intValue()
        L_0x00a1:
            if (r16 <= 0) goto L_0x00a4
            goto L_0x0076
        L_0x00a4:
            r3 = r5
            goto L_0x0077
        L_0x00a6:
            if (r4 == 0) goto L_0x00ab
            java.net.Proxy r3 = r4.f2661b
            goto L_0x00af
        L_0x00ab:
            r15.getClass()
            r3 = 0
        L_0x00af:
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.HTTP
            if (r3 != r4) goto L_0x00bd
            g1.b r3 = r15.f2811m
            r3.getClass()
            goto L_0x0076
        L_0x00bd:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r2 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r0.<init>(r2)
            throw r0
        L_0x00c5:
            if (r3 == 0) goto L_0x00cc
            int r3 = r3.f2648c
            if (r3 != r14) goto L_0x00cc
            goto L_0x0076
        L_0x00cc:
            java.lang.String r3 = "Retry-After"
            java.lang.String r3 = r0.g(r3)
            if (r3 != 0) goto L_0x00d5
            goto L_0x00e5
        L_0x00d5:
            java.lang.String r4 = "\\d+"
            boolean r4 = r3.matches(r4)
            if (r4 == 0) goto L_0x00e5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r16 = r3.intValue()
        L_0x00e5:
            if (r16 != 0) goto L_0x0076
            goto L_0x00a4
        L_0x00e8:
            g1.b r3 = r15.f2812n
            r3.getClass()
            goto L_0x0076
        L_0x00ee:
            boolean r3 = r8.equals(r9)
            if (r3 != 0) goto L_0x00fe
            java.lang.String r3 = "HEAD"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L_0x00fe
            goto L_0x0076
        L_0x00fe:
            boolean r3 = r15.f2816r
            if (r3 != 0) goto L_0x0104
            goto L_0x0076
        L_0x0104:
            java.lang.String r3 = "Location"
            java.lang.String r3 = r0.g(r3)
            if (r3 != 0) goto L_0x010e
            goto L_0x0076
        L_0x010e:
            g1.u r4 = r5.f2632a
            r4.getClass()
            g1.t r13 = new g1.t
            r13.<init>()
            int r3 = r13.b(r4, r3)
            if (r3 != r7) goto L_0x011f
            goto L_0x0120
        L_0x011f:
            r13 = 0
        L_0x0120:
            if (r13 == 0) goto L_0x0127
            g1.u r3 = r13.a()
            goto L_0x0128
        L_0x0127:
            r3 = 0
        L_0x0128:
            if (r3 != 0) goto L_0x012c
            goto L_0x0076
        L_0x012c:
            g1.u r4 = r5.f2632a
            java.lang.String r4 = r4.f2774a
            java.lang.String r7 = r3.f2774a
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L_0x013e
            boolean r4 = r15.f2815q
            if (r4 != 0) goto L_0x013e
            goto L_0x0076
        L_0x013e:
            A.k r4 = r5.a()
            boolean r5 = T0.g.H(r8)
            if (r5 == 0) goto L_0x0170
            java.lang.String r5 = "PROPFIND"
            boolean r7 = r8.equals(r5)
            boolean r5 = r8.equals(r5)
            if (r5 != 0) goto L_0x015a
            r5 = 0
            r4.n(r9, r5)
            r13 = 0
            goto L_0x015e
        L_0x015a:
            r13 = 0
            r4.n(r8, r13)
        L_0x015e:
            if (r7 != 0) goto L_0x0171
            java.lang.String r5 = "Transfer-Encoding"
            r4.r(r5)
            java.lang.String r5 = "Content-Length"
            r4.r(r5)
            java.lang.String r5 = "Content-Type"
            r4.r(r5)
            goto L_0x0171
        L_0x0170:
            r13 = 0
        L_0x0171:
            boolean r5 = d(r0, r3)
            if (r5 != 0) goto L_0x017c
            java.lang.String r5 = "Authorization"
            r4.r(r5)
        L_0x017c:
            r4.f21f = r3
            g1.A r3 = r4.b()
        L_0x0182:
            if (r3 != 0) goto L_0x0188
            r12.f()
            return r0
        L_0x0188:
            g1.E r4 = r0.f2651g
            h1.c.c(r4)
            int r14 = r6 + 1
            r4 = 20
            if (r14 > r4) goto L_0x01dd
            g1.u r4 = r3.f2632a
            boolean r4 = d(r0, r4)
            if (r4 != 0) goto L_0x01b3
            r12.f()
            j1.f r12 = new j1.f
            g1.x r4 = r1.f3584a
            g1.n r5 = r4.f2813o
            g1.u r4 = r3.f2632a
            g1.a r6 = r1.b(r4)
            java.lang.Object r9 = r1.f3585b
            r4 = r12
            r7 = r10
            r8 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x01bb
        L_0x01b3:
            g1.n r4 = r12.f3552d
            monitor-enter(r4)
            k1.b r5 = r12.f3558l     // Catch:{ all -> 0x01da }
            monitor-exit(r4)     // Catch:{ all -> 0x01da }
            if (r5 != 0) goto L_0x01c1
        L_0x01bb:
            r5 = r0
            r4 = r3
            r6 = r14
        L_0x01be:
            r14 = 0
            goto L_0x0022
        L_0x01c1:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Closing the body of "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = " didn't close its backing stream. Bad interceptor?"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x01da:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01da }
            throw r0
        L_0x01dd:
            r12.f()
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r2 = "Too many follow-up requests: "
            java.lang.String r2 = Q0.E.e(r2, r14)
            r0.<init>(r2)
            throw r0
        L_0x01ec:
            r0 = move-exception
            r2 = 0
            goto L_0x020f
        L_0x01ef:
            r0 = move-exception
            r13 = 0
            r3 = r0
            boolean r0 = r3 instanceof m1.C0178a     // Catch:{ all -> 0x01ec }
            r0 = r0 ^ r7
            boolean r0 = r1.c(r3, r12, r0, r4)     // Catch:{ all -> 0x01ec }
            if (r0 == 0) goto L_0x01fe
            r7 = 0
            goto L_0x020b
        L_0x01fe:
            throw r3     // Catch:{ all -> 0x01ec }
        L_0x01ff:
            r0 = move-exception
            r13 = 0
            r3 = r0
            java.io.IOException r0 = r3.f3541a     // Catch:{ all -> 0x01ec }
            r7 = 0
            boolean r0 = r1.c(r0, r12, r7, r4)     // Catch:{ all -> 0x01ec }
            if (r0 == 0) goto L_0x020c
        L_0x020b:
            goto L_0x01be
        L_0x020c:
            java.io.IOException r0 = r3.f3541a     // Catch:{ all -> 0x01ec }
            throw r0     // Catch:{ all -> 0x01ec }
        L_0x020f:
            r12.g(r2)
            r12.f()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.f.a(k1.e):g1.C");
    }

    public final C0102a b(u uVar) {
        k kVar;
        c cVar;
        SSLSocketFactory sSLSocketFactory;
        boolean equals = uVar.f2774a.equals("https");
        x xVar = this.f3584a;
        if (equals) {
            sSLSocketFactory = xVar.i;
            cVar = xVar.f2809k;
            kVar = xVar.f2810l;
        } else {
            sSLSocketFactory = null;
            cVar = null;
            kVar = null;
        }
        C0103b bVar = xVar.f2814p;
        List list = x.f2799w;
        List list2 = x.f2799w;
        return new C0102a(uVar.f2777d, uVar.e, bVar, xVar.f2807h, sSLSocketFactory, cVar, kVar, xVar.f2811m, xVar.e);
    }

    public f(x xVar) {
        this.f3584a = xVar;
    }

    public final boolean c(IOException iOException, j1.f fVar, boolean z2, A a2) {
        fVar.g(iOException);
        if (!this.f3584a.f2817s) {
            return false;
        }
        if (z2) {
            a2.getClass();
        }
        if ((iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) : !((iOException instanceof SocketTimeoutException) && !z2))) {
            return false;
        }
        if (fVar.f3551c != null) {
            return true;
        }
        j jVar = fVar.f3550b;
        if (jVar != null && jVar.f332f < ((ArrayList) jVar.f333g).size()) {
            return true;
        }
        d dVar = fVar.f3554g;
        if (dVar.e >= dVar.f3545d.size() && dVar.f3547g.isEmpty()) {
            return false;
        }
        return true;
    }
}
