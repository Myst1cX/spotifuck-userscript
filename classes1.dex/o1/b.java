package o1;

import h1.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import q1.d;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final X509TrustManager f4421a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f4422b;

    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            TrustAnchor trustAnchor = (TrustAnchor) this.f4422b.invoke(this.f4421a, new Object[]{x509Certificate});
            if (trustAnchor != null) {
                return trustAnchor.getTrustedCert();
            }
            return null;
        } catch (IllegalAccessException e) {
            throw c.a("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f4421a.equals(bVar.f4421a) || !this.f4422b.equals(bVar.f4422b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f4422b.hashCode() * 31) + this.f4421a.hashCode();
    }

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f4422b = method;
        this.f4421a = x509TrustManager;
    }
}
