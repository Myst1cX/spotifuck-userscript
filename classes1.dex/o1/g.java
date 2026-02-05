package o1;

import Q0.E;
import g1.x;
import g1.y;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import q1.a;
import q1.b;
import q1.d;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f4433a;

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f4434b = Logger.getLogger(x.class.getName());

    public String h(SSLSocket sSLSocket) {
        return null;
    }

    public boolean j(String str) {
        return true;
    }

    public void k(int i, String str, Throwable th) {
        Level level;
        if (i == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        f4434b.log(level, str, th);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: o1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: o1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: o1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: o1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: o1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: o1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: o1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: o1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: o1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: o1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: o1.g} */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
        if (r0 != null) goto L_0x00f5;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 10
            r1 = 1
            r2 = 0
            java.lang.Class<javax.net.ssl.SSLSocket> r3 = javax.net.ssl.SSLSocket.class
            java.lang.Class<byte[]> r4 = byte[].class
            r5 = 0
            java.lang.String r6 = "com.android.org.conscrypt.SSLParametersImpl"
            java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x000f }
            goto L_0x0014
        L_0x000f:
            java.lang.String r6 = "org.apache.harmony.xnet.provider.jsse.SSLParametersImpl"
            java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x0051 }
        L_0x0014:
            android.support.v4.media.session.t r6 = new android.support.v4.media.session.t     // Catch:{ ClassNotFoundException -> 0x0051 }
            java.lang.String r7 = "setUseSessionTickets"
            java.lang.Class[] r8 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x0051 }
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x0051 }
            r8[r2] = r9     // Catch:{ ClassNotFoundException -> 0x0051 }
            r6.<init>((java.lang.Object) r5, (java.lang.Object) r7, (java.lang.Object) r8, (int) r0)     // Catch:{ ClassNotFoundException -> 0x0051 }
            android.support.v4.media.session.t r7 = new android.support.v4.media.session.t     // Catch:{ ClassNotFoundException -> 0x0051 }
            java.lang.String r8 = "setHostname"
            java.lang.Class[] r9 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x0051 }
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r9[r2] = r10     // Catch:{ ClassNotFoundException -> 0x0051 }
            r7.<init>((java.lang.Object) r5, (java.lang.Object) r8, (java.lang.Object) r9, (int) r0)     // Catch:{ ClassNotFoundException -> 0x0051 }
            java.lang.String r8 = "GMSCore_OpenSSL"
            java.security.Provider r8 = java.security.Security.getProvider(r8)     // Catch:{ ClassNotFoundException -> 0x0051 }
            if (r8 == 0) goto L_0x0037
            goto L_0x003c
        L_0x0037:
            java.lang.String r8 = "android.net.Network"
            java.lang.Class.forName(r8)     // Catch:{ ClassNotFoundException -> 0x0053 }
        L_0x003c:
            android.support.v4.media.session.t r8 = new android.support.v4.media.session.t     // Catch:{ ClassNotFoundException -> 0x0051 }
            java.lang.String r9 = "getAlpnSelectedProtocol"
            java.lang.Class[] r10 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException -> 0x0051 }
            r8.<init>((java.lang.Object) r4, (java.lang.Object) r9, (java.lang.Object) r10, (int) r0)     // Catch:{ ClassNotFoundException -> 0x0051 }
            android.support.v4.media.session.t r9 = new android.support.v4.media.session.t     // Catch:{ ClassNotFoundException -> 0x0051 }
            java.lang.String r10 = "setAlpnProtocols"
            java.lang.Class[] r11 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x0051 }
            r11[r2] = r4     // Catch:{ ClassNotFoundException -> 0x0051 }
            r9.<init>((java.lang.Object) r5, (java.lang.Object) r10, (java.lang.Object) r11, (int) r0)     // Catch:{ ClassNotFoundException -> 0x0051 }
            goto L_0x0055
        L_0x0051:
            goto L_0x005b
        L_0x0053:
            r8 = r5
            r9 = r8
        L_0x0055:
            o1.c r0 = new o1.c     // Catch:{ ClassNotFoundException -> 0x0051 }
            r0.<init>(r6, r7, r8, r9)     // Catch:{ ClassNotFoundException -> 0x0051 }
            goto L_0x005c
        L_0x005b:
            r0 = r5
        L_0x005c:
            if (r0 == 0) goto L_0x0060
            goto L_0x00f5
        L_0x0060:
            java.lang.String r0 = "okhttp.platform"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r4 = "conscrypt"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0070
            r0 = 1
            goto L_0x0080
        L_0x0070:
            java.security.Provider[] r0 = java.security.Security.getProviders()
            r0 = r0[r2]
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = "Conscrypt"
            boolean r0 = r4.equals(r0)
        L_0x0080:
            if (r0 == 0) goto L_0x008a
            o1.d r0 = o1.d.m()
            if (r0 == 0) goto L_0x008a
            goto L_0x00f5
        L_0x008a:
            java.lang.Class<javax.net.ssl.SSLParameters> r0 = javax.net.ssl.SSLParameters.class
            java.lang.String r4 = "setApplicationProtocols"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x00a5 }
            java.lang.Class<java.lang.String[]> r7 = java.lang.String[].class
            r6[r2] = r7     // Catch:{ NoSuchMethodException -> 0x00a5 }
            java.lang.reflect.Method r0 = r0.getMethod(r4, r6)     // Catch:{ NoSuchMethodException -> 0x00a5 }
            java.lang.String r4 = "getApplicationProtocol"
            java.lang.reflect.Method r4 = r3.getMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x00a5 }
            o1.e r6 = new o1.e     // Catch:{ NoSuchMethodException -> 0x00a5 }
            r6.<init>(r0, r4)     // Catch:{ NoSuchMethodException -> 0x00a5 }
            r0 = r6
            goto L_0x00a7
        L_0x00a5:
            r0 = r5
        L_0x00a7:
            if (r0 == 0) goto L_0x00aa
            goto L_0x00f5
        L_0x00aa:
            java.lang.String r0 = "org.eclipse.jetty.alpn.ALPN"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00eb }
            java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN$Provider"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00eb }
            java.lang.String r6 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
            java.lang.Class r11 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00eb }
            java.lang.String r6 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
            java.lang.Class r12 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00eb }
            java.lang.String r6 = "put"
            r7 = 2
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00eb }
            r7[r2] = r3     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00eb }
            r7[r1] = r4     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00eb }
            java.lang.reflect.Method r8 = r0.getMethod(r6, r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00eb }
            java.lang.String r4 = "get"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00eb }
            r6[r2] = r3     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00eb }
            java.lang.reflect.Method r9 = r0.getMethod(r4, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00eb }
            java.lang.String r4 = "remove"
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00eb }
            r1[r2] = r3     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00eb }
            java.lang.reflect.Method r10 = r0.getMethod(r4, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00eb }
            o1.c r0 = new o1.c     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00eb }
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00eb }
            r5 = r0
            goto L_0x00ec
        L_0x00eb:
        L_0x00ec:
            if (r5 == 0) goto L_0x00f0
            r0 = r5
            goto L_0x00f5
        L_0x00f0:
            o1.g r0 = new o1.g
            r0.<init>()
        L_0x00f5:
            f4433a = r0
            java.lang.Class<g1.x> r0 = g1.x.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f4434b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.g.<clinit>():void");
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            y yVar = (y) list.get(i);
            if (yVar != y.HTTP_1_0) {
                arrayList.add(yVar.f2826a);
            }
        }
        return arrayList;
    }

    public void a(SSLSocket sSLSocket) {
    }

    public T0.g c(X509TrustManager x509TrustManager) {
        return new a(d(x509TrustManager));
    }

    public d d(X509TrustManager x509TrustManager) {
        return new b(x509TrustManager.getAcceptedIssuers());
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
    }

    public SSLContext g() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    public Object i() {
        if (f4434b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public void l(String str, Object obj) {
        if (obj == null) {
            str = E.f(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        k(5, str, (Throwable) obj);
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }
}
