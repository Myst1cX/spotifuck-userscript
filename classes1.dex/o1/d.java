package o1;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import org.conscrypt.OpenSSLProvider;

public final class d extends g {
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, o1.d] */
    public static d m() {
        try {
            Class.forName("org.conscrypt.ConscryptEngineSocket");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            Conscrypt.setUseEngineSocketByDefault(true);
            return new Object();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static Provider n() {
        return new OpenSSLProvider();
    }

    public final SSLContext g() {
        try {
            return SSLContext.getInstance("TLS", n());
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    public final void e(SSLSocket sSLSocket, String str, List list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) g.b(list).toArray(new String[0]));
        }
    }

    public final String h(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }
}
