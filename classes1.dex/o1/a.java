package o1;

import T0.g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class a extends g {

    /* renamed from: l  reason: collision with root package name */
    public final Object f4419l;

    /* renamed from: m  reason: collision with root package name */
    public final Method f4420m;

    public final int hashCode() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return obj instanceof a;
    }

    public a(Object obj, Method method) {
        this.f4419l = obj;
        this.f4420m = method;
    }

    public final List h(String str, List list) {
        try {
            return (List) this.f4420m.invoke(this.f4419l, new Object[]{(X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str});
        } catch (InvocationTargetException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }
}
