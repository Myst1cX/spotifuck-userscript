package g1;

import E.j;
import T0.g;
import h1.c;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public final class x implements Cloneable {

    /* renamed from: w  reason: collision with root package name */
    public static final List f2799w = c.l(y.HTTP_2, y.HTTP_1_1);

    /* renamed from: x  reason: collision with root package name */
    public static final List f2800x = c.l(p.e, p.f2746f);

    /* renamed from: a  reason: collision with root package name */
    public final j f2801a;

    /* renamed from: b  reason: collision with root package name */
    public final List f2802b;

    /* renamed from: c  reason: collision with root package name */
    public final List f2803c;

    /* renamed from: d  reason: collision with root package name */
    public final C0103b f2804d;
    public final ProxySelector e;

    /* renamed from: f  reason: collision with root package name */
    public final C0103b f2805f;

    /* renamed from: g  reason: collision with root package name */
    public final h f2806g;

    /* renamed from: h  reason: collision with root package name */
    public final SocketFactory f2807h;
    public final SSLSocketFactory i;

    /* renamed from: j  reason: collision with root package name */
    public final g f2808j;

    /* renamed from: k  reason: collision with root package name */
    public final q1.c f2809k;

    /* renamed from: l  reason: collision with root package name */
    public final k f2810l;

    /* renamed from: m  reason: collision with root package name */
    public final C0103b f2811m;

    /* renamed from: n  reason: collision with root package name */
    public final C0103b f2812n;

    /* renamed from: o  reason: collision with root package name */
    public final n f2813o;

    /* renamed from: p  reason: collision with root package name */
    public final C0103b f2814p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f2815q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f2816r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f2817s;

    /* renamed from: t  reason: collision with root package name */
    public final int f2818t;

    /* renamed from: u  reason: collision with root package name */
    public final int f2819u;

    /* renamed from: v  reason: collision with root package name */
    public final int f2820v;

    /* JADX WARNING: type inference failed for: r0v3, types: [g1.b, java.lang.Object] */
    static {
        C0103b.e = new Object();
    }

    public x(w wVar) {
        boolean z2;
        this.f2801a = wVar.f2781a;
        this.f2802b = c.k(wVar.f2782b);
        this.f2803c = c.k(wVar.f2783c);
        this.f2804d = wVar.f2784d;
        this.e = wVar.e;
        this.f2805f = wVar.f2785f;
        this.f2806g = wVar.f2786g;
        this.f2807h = wVar.f2787h;
        Iterator it2 = f2800x.iterator();
        loop0:
        while (true) {
            z2 = false;
            while (true) {
                if (!it2.hasNext()) {
                    break loop0;
                }
                p pVar = (p) it2.next();
                if (z2 || pVar.f2747a) {
                    z2 = true;
                }
            }
        }
        if (!z2) {
            this.i = null;
            this.f2808j = null;
        } else {
            try {
                TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                instance.init((KeyStore) null);
                TrustManager[] trustManagers = instance.getTrustManagers();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        try {
                            o1.g gVar = o1.g.f4433a;
                            SSLContext g2 = gVar.g();
                            g2.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
                            this.i = g2.getSocketFactory();
                            this.f2808j = gVar.c(x509TrustManager);
                        } catch (GeneralSecurityException e2) {
                            throw c.a("No System TLS", e2);
                        }
                    }
                }
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            } catch (GeneralSecurityException e3) {
                throw c.a("No System TLS", e3);
            }
        }
        this.f2809k = wVar.i;
        g gVar2 = this.f2808j;
        k kVar = wVar.f2788j;
        this.f2810l = !c.i(kVar.f2721b, gVar2) ? new k(kVar.f2720a, gVar2) : kVar;
        this.f2811m = wVar.f2789k;
        this.f2812n = wVar.f2790l;
        this.f2813o = wVar.f2791m;
        this.f2814p = wVar.f2792n;
        this.f2815q = wVar.f2793o;
        this.f2816r = wVar.f2794p;
        this.f2817s = wVar.f2795q;
        this.f2818t = wVar.f2796r;
        this.f2819u = wVar.f2797s;
        this.f2820v = wVar.f2798t;
        if (this.f2802b.contains((Object) null)) {
            throw new IllegalStateException("Null interceptor: " + this.f2802b);
        } else if (this.f2803c.contains((Object) null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f2803c);
        }
    }
}
