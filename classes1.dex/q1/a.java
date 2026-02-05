package q1;

import T0.g;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class a extends g {

    /* renamed from: l  reason: collision with root package name */
    public final d f4508l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a) || !((a) obj).f4508l.equals(this.f4508l)) {
            return false;
        }
        return true;
    }

    public final List h(String str, List list) {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z2 = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate a2 = this.f4508l.a(x509Certificate);
            if (a2 != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(a2)) {
                    arrayList.add(a2);
                }
                if (a2.getIssuerDN().equals(a2.getSubjectDN())) {
                    try {
                        a2.verify(a2.getPublicKey());
                        return arrayList;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                z2 = true;
            } else {
                Iterator it2 = arrayDeque.iterator();
                while (it2.hasNext()) {
                    X509Certificate x509Certificate2 = (X509Certificate) it2.next();
                    if (x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it2.remove();
                            arrayList.add(x509Certificate2);
                        } catch (GeneralSecurityException unused2) {
                            continue;
                        }
                    }
                }
                if (z2) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final int hashCode() {
        return this.f4508l.hashCode();
    }

    public a(d dVar) {
        this.f4508l = dVar;
    }
}
