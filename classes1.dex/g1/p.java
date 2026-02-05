package g1;

import h1.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.net.ssl.SSLSocket;

public final class p {
    public static final p e;

    /* renamed from: f  reason: collision with root package name */
    public static final p f2746f = new p(new o(false));

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2747a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2748b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f2749c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f2750d;

    static {
        m[] mVarArr = {m.f2729k, m.f2731m, m.f2730l, m.f2732n, m.f2734p, m.f2733o, m.i, m.f2728j, m.f2726g, m.f2727h, m.e, m.f2725f, m.f2724d};
        o oVar = new o(true);
        String[] strArr = new String[13];
        for (int i = 0; i < 13; i++) {
            strArr[i] = mVarArr[i].f2735a;
        }
        oVar.a(strArr);
        G g2 = G.TLS_1_0;
        oVar.b(G.TLS_1_3, G.TLS_1_2, G.TLS_1_1, g2);
        if (oVar.f2742a) {
            oVar.f2743b = true;
            p pVar = new p(oVar);
            e = pVar;
            o oVar2 = new o(pVar);
            oVar2.b(g2);
            if (oVar2.f2742a) {
                oVar2.f2743b = true;
                new p(oVar2);
                return;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }

    public final boolean a(SSLSocket sSLSocket) {
        if (!this.f2747a) {
            return false;
        }
        String[] strArr = this.f2750d;
        if (strArr != null && !c.o(c.f3090f, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f2749c;
        if (strArr2 == null || c.o(m.f2722b, strArr2, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        p pVar = (p) obj;
        boolean z2 = pVar.f2747a;
        boolean z3 = this.f2747a;
        if (z3 != z2) {
            return false;
        }
        if (!z3 || (Arrays.equals(this.f2749c, pVar.f2749c) && Arrays.equals(this.f2750d, pVar.f2750d) && this.f2748b == pVar.f2748b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f2747a) {
            return ((((527 + Arrays.hashCode(this.f2749c)) * 31) + Arrays.hashCode(this.f2750d)) * 31) + (this.f2748b ^ true ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String str;
        if (!this.f2747a) {
            return "ConnectionSpec()";
        }
        String str2 = "[all enabled]";
        String[] strArr = this.f2749c;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String a2 : strArr) {
                arrayList.add(m.a(a2));
            }
            str = Collections.unmodifiableList(arrayList).toString();
        } else {
            str = str2;
        }
        String[] strArr2 = this.f2750d;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String a3 : strArr2) {
                arrayList2.add(G.a(a3));
            }
            str2 = Collections.unmodifiableList(arrayList2).toString();
        }
        return "ConnectionSpec(cipherSuites=" + str + ", tlsVersions=" + str2 + ", supportsTlsExtensions=" + this.f2748b + ")";
    }

    public p(o oVar) {
        this.f2747a = oVar.f2742a;
        this.f2749c = (String[]) oVar.f2744c;
        this.f2750d = (String[]) oVar.f2745d;
        this.f2748b = oVar.f2743b;
    }
}
