package o1;

import T0.g;
import android.os.Build;
import android.support.v4.media.session.t;
import android.util.Log;
import g1.y;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import q1.d;

public final class c extends g {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f4423c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final Object f4424d;
    public final Object e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f4425f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f4426g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f4427h;

    public c(t tVar, t tVar2, t tVar3, t tVar4) {
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", (Class[]) null);
            method2 = cls.getMethod("open", new Class[]{String.class});
            method = cls.getMethod("warnIfOpen", (Class[]) null);
            method3 = method4;
        } catch (Exception unused) {
            method2 = null;
            method = null;
        }
        this.f4427h = new t((Object) method3, (Object) method2, (Object) method, 9);
        this.f4424d = tVar;
        this.e = tVar2;
        this.f4425f = tVar3;
        this.f4426g = tVar4;
    }

    public static boolean m(String str, Class cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[]{String.class}).invoke(obj, new Object[]{str})).booleanValue();
        } catch (NoSuchMethodException unused) {
            try {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", (Class[]) null).invoke(obj, (Object[]) null)).booleanValue();
            } catch (NoSuchMethodException unused2) {
                return true;
            }
        }
    }

    public g c(X509TrustManager x509TrustManager) {
        switch (this.f4423c) {
            case 0:
                try {
                    Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
                    Class<String> cls2 = String.class;
                    return new a(cls.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, cls2, cls2}));
                } catch (Exception unused) {
                    return super.c(x509TrustManager);
                }
            default:
                return super.c(x509TrustManager);
        }
    }

    public d d(X509TrustManager x509TrustManager) {
        switch (this.f4423c) {
            case 0:
                try {
                    Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
                    declaredMethod.setAccessible(true);
                    return new b(x509TrustManager, declaredMethod);
                } catch (NoSuchMethodException unused) {
                    return super.d(x509TrustManager);
                }
            default:
                return super.d(x509TrustManager);
        }
    }

    public final String h(SSLSocket sSLSocket) {
        switch (this.f4423c) {
            case 0:
                t tVar = (t) this.f4425f;
                if (tVar == null || tVar.r(sSLSocket.getClass()) == null) {
                    return null;
                }
                try {
                    byte[] bArr = (byte[]) tVar.x(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, h1.c.f3089d);
                    }
                    return null;
                } catch (InvocationTargetException e2) {
                    Throwable targetException = e2.getTargetException();
                    if (targetException instanceof RuntimeException) {
                        throw ((RuntimeException) targetException);
                    }
                    AssertionError assertionError = new AssertionError("Unexpected exception");
                    assertionError.initCause(targetException);
                    throw assertionError;
                }
            default:
                try {
                    f fVar = (f) Proxy.getInvocationHandler(((Method) this.e).invoke((Object) null, new Object[]{sSLSocket}));
                    boolean z2 = fVar.f4431b;
                    if (!z2 && fVar.f4432c == null) {
                        g.f4433a.k(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                        return null;
                    } else if (z2) {
                        return null;
                    } else {
                        return fVar.f4432c;
                    }
                } catch (InvocationTargetException e3) {
                    e = e3;
                    throw h1.c.a("unable to get selected protocol", e);
                } catch (IllegalAccessException e4) {
                    e = e4;
                    throw h1.c.a("unable to get selected protocol", e);
                }
        }
    }

    public void a(SSLSocket sSLSocket) {
        switch (this.f4423c) {
            case 1:
                try {
                    ((Method) this.f4425f).invoke((Object) null, new Object[]{sSLSocket});
                    return;
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    throw h1.c.a("unable to remove alpn", e2);
                }
            default:
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r9v3, types: [r1.e, java.lang.Object] */
    public final void e(SSLSocket sSLSocket, String str, List list) {
        Object obj = this.f4424d;
        Object obj2 = this.f4426g;
        switch (this.f4423c) {
            case 0:
                if (str != null) {
                    ((t) obj).y(sSLSocket, Boolean.TRUE);
                    ((t) this.e).y(sSLSocket, str);
                }
                t tVar = (t) obj2;
                if (tVar != null && tVar.r(sSLSocket.getClass()) != null) {
                    ? obj3 = new Object();
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        y yVar = (y) list.get(i);
                        if (yVar != y.HTTP_1_0) {
                            obj3.v(yVar.f2826a.length());
                            String str2 = yVar.f2826a;
                            obj3.y(str2, 0, str2.length());
                        }
                    }
                    try {
                        try {
                            tVar.x(sSLSocket, obj3.k(obj3.f4579b));
                            return;
                        } catch (InvocationTargetException e2) {
                            Throwable targetException = e2.getTargetException();
                            if (targetException instanceof RuntimeException) {
                                throw ((RuntimeException) targetException);
                            }
                            AssertionError assertionError = new AssertionError("Unexpected exception");
                            assertionError.initCause(targetException);
                            throw assertionError;
                        }
                    } catch (EOFException e3) {
                        throw new AssertionError(e3);
                    }
                } else {
                    return;
                }
            default:
                ArrayList b2 = g.b(list);
                try {
                    ((Method) obj).invoke((Object) null, new Object[]{sSLSocket, Proxy.newProxyInstance(g.class.getClassLoader(), new Class[]{(Class) obj2, (Class) this.f4427h}, new f(b2))});
                    return;
                } catch (IllegalAccessException | InvocationTargetException e4) {
                    throw h1.c.a("unable to set alpn", e4);
                }
        }
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        switch (this.f4423c) {
            case 0:
                try {
                    socket.connect(inetSocketAddress, i);
                    return;
                } catch (AssertionError e2) {
                    if (h1.c.n(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                } catch (SecurityException e3) {
                    IOException iOException = new IOException("Exception in connect");
                    iOException.initCause(e3);
                    throw iOException;
                } catch (ClassCastException e4) {
                    if (Build.VERSION.SDK_INT == 26) {
                        IOException iOException2 = new IOException("Exception in connect");
                        iOException2.initCause(e4);
                        throw iOException2;
                    }
                    throw e4;
                }
            default:
                super.f(socket, inetSocketAddress, i);
                return;
        }
    }

    public Object i() {
        switch (this.f4423c) {
            case 0:
                t tVar = (t) this.f4427h;
                Method method = (Method) tVar.f1131b;
                if (method == null) {
                    return null;
                }
                try {
                    Object invoke = method.invoke((Object) null, (Object[]) null);
                    ((Method) tVar.f1132c).invoke(invoke, new Object[]{"response.body().close()"});
                    return invoke;
                } catch (Exception unused) {
                    return null;
                }
            default:
                return super.i();
        }
    }

    public boolean j(String str) {
        switch (this.f4423c) {
            case 0:
                try {
                    Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
                    return m(str, cls, cls.getMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null));
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    return true;
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    throw h1.c.a("unable to determine cleartext support", e2);
                }
            default:
                return super.j(str);
        }
    }

    public void k(int i, String str, Throwable th) {
        switch (this.f4423c) {
            case 0:
                int i2 = 5;
                if (i != 5) {
                    i2 = 3;
                }
                if (th != null) {
                    str = str + 10 + Log.getStackTraceString(th);
                }
                int length = str.length();
                int i3 = 0;
                while (i3 < length) {
                    int indexOf = str.indexOf(10, i3);
                    if (indexOf == -1) {
                        indexOf = length;
                    }
                    while (true) {
                        int min = Math.min(indexOf, i3 + 4000);
                        Log.println(i2, "OkHttp", str.substring(i3, min));
                        if (min >= indexOf) {
                            i3 = min + 1;
                        } else {
                            i3 = min;
                        }
                    }
                }
                return;
            default:
                super.k(i, str, th);
                return;
        }
    }

    public void l(String str, Object obj) {
        switch (this.f4423c) {
            case 0:
                t tVar = (t) this.f4427h;
                tVar.getClass();
                if (obj != null) {
                    try {
                        ((Method) tVar.f1133d).invoke(obj, (Object[]) null);
                        return;
                    } catch (Exception unused) {
                    }
                }
                k(5, str, (Throwable) null);
                return;
            default:
                super.l(str, obj);
                return;
        }
    }

    public c(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f4424d = method;
        this.e = method2;
        this.f4425f = method3;
        this.f4426g = cls;
        this.f4427h = cls2;
    }
}
