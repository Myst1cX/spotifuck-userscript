package g1;

import h1.c;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final G f2762a;

    /* renamed from: b  reason: collision with root package name */
    public final m f2763b;

    /* renamed from: c  reason: collision with root package name */
    public final List f2764c;

    /* renamed from: d  reason: collision with root package name */
    public final List f2765d;

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!this.f2762a.equals(rVar.f2762a) || !this.f2763b.equals(rVar.f2763b) || !this.f2764c.equals(rVar.f2764c) || !this.f2765d.equals(rVar.f2765d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f2763b.hashCode();
        int hashCode2 = this.f2764c.hashCode();
        return this.f2765d.hashCode() + ((hashCode2 + ((hashCode + ((this.f2762a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public r(G g2, m mVar, List list, List list2) {
        this.f2762a = g2;
        this.f2763b = mVar;
        this.f2764c = list;
        this.f2765d = list2;
    }

    public static r a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        List list;
        List list2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            m a2 = m.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol != null) {
                G a3 = G.a(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                if (certificateArr != null) {
                    list = c.l(certificateArr);
                } else {
                    list = Collections.emptyList();
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    list2 = c.l(localCertificates);
                } else {
                    list2 = Collections.emptyList();
                }
                return new r(a3, a2, list, list2);
            }
            throw new IllegalStateException("tlsVersion == null");
        }
        throw new IllegalStateException("cipherSuite == null");
    }
}
