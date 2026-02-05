package g1;

import T0.g;
import h1.c;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import r1.h;

public final class k {

    /* renamed from: c  reason: collision with root package name */
    public static final k f2719c = new k(new LinkedHashSet(new ArrayList()), (g) null);

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f2720a;

    /* renamed from: b  reason: collision with root package name */
    public final g f2721b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (!c.i(this.f2721b, kVar.f2721b) || !this.f2720a.equals(kVar.f2720a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static String b(X509Certificate x509Certificate) {
        if (x509Certificate instanceof X509Certificate) {
            return "sha256/" + h.i(x509Certificate.getPublicKey().getEncoded()).e("SHA-256").a();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    public final int hashCode() {
        int i;
        g gVar = this.f2721b;
        if (gVar != null) {
            i = gVar.hashCode();
        } else {
            i = 0;
        }
        return this.f2720a.hashCode() + (i * 31);
    }

    public k(LinkedHashSet linkedHashSet, g gVar) {
        this.f2720a = linkedHashSet;
        this.f2721b = gVar;
    }

    public final void a(String str, List list) {
        List emptyList = Collections.emptyList();
        Iterator it2 = this.f2720a.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw new ClassCastException();
        } else if (!emptyList.isEmpty()) {
            g gVar = this.f2721b;
            if (gVar != null) {
                list = gVar.h(str, list);
            }
            int size = list.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                if (emptyList.size() <= 0) {
                    i2++;
                } else {
                    emptyList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
            StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
                sb.append("\n    ");
                sb.append(b(x509Certificate2));
                sb.append(": ");
                sb.append(x509Certificate2.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            int size3 = emptyList.size();
            while (i < size3) {
                if (emptyList.get(i) == null) {
                    sb.append("\n    null");
                    i++;
                } else {
                    throw new ClassCastException();
                }
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }
}
