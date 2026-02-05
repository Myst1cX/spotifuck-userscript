package j1;

import g1.C0103b;
import g1.l;
import g1.m;
import g1.o;
import g1.p;
import h1.c;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List f3524a;

    /* renamed from: b  reason: collision with root package name */
    public int f3525b = 0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3526c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3527d;

    public final p a(SSLSocket sSLSocket) {
        p pVar;
        boolean z2;
        String[] strArr;
        String[] strArr2;
        int i = this.f3525b;
        List list = this.f3524a;
        int size = list.size();
        while (true) {
            if (i >= size) {
                pVar = null;
                break;
            }
            pVar = (p) list.get(i);
            if (pVar.a(sSLSocket)) {
                this.f3525b = i + 1;
                break;
            }
            i++;
        }
        if (pVar != null) {
            int i2 = this.f3525b;
            while (true) {
                if (i2 >= list.size()) {
                    z2 = false;
                    break;
                } else if (((p) list.get(i2)).a(sSLSocket)) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.f3526c = z2;
            C0103b bVar = C0103b.e;
            boolean z3 = this.f3527d;
            bVar.getClass();
            String[] strArr3 = pVar.f2749c;
            if (strArr3 != null) {
                strArr = c.m(m.f2722b, sSLSocket.getEnabledCipherSuites(), strArr3);
            } else {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            String[] strArr4 = pVar.f2750d;
            if (strArr4 != null) {
                strArr2 = c.m(c.f3090f, sSLSocket.getEnabledProtocols(), strArr4);
            } else {
                strArr2 = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            l lVar = m.f2722b;
            byte[] bArr = c.f3086a;
            int length = supportedCipherSuites.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    i3 = -1;
                    break;
                } else if (lVar.compare(supportedCipherSuites[i3], "TLS_FALLBACK_SCSV") == 0) {
                    break;
                } else {
                    i3++;
                }
            }
            if (z3 && i3 != -1) {
                String str = supportedCipherSuites[i3];
                int length2 = strArr.length;
                String[] strArr5 = new String[(1 + length2)];
                System.arraycopy(strArr, 0, strArr5, 0, strArr.length);
                strArr5[length2] = str;
                strArr = strArr5;
            }
            o oVar = new o(pVar);
            oVar.a(strArr);
            oVar.c(strArr2);
            p pVar2 = new p(oVar);
            String[] strArr6 = pVar2.f2750d;
            if (strArr6 != null) {
                sSLSocket.setEnabledProtocols(strArr6);
            }
            String[] strArr7 = pVar2.f2749c;
            if (strArr7 != null) {
                sSLSocket.setEnabledCipherSuites(strArr7);
            }
            return pVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f3527d + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    public a(List list) {
        this.f3524a = list;
    }
}
