package g1;

import Q0.E;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import q1.c;

/* renamed from: g1.a  reason: case insensitive filesystem */
public final class C0102a {

    /* renamed from: a  reason: collision with root package name */
    public final u f2669a;

    /* renamed from: b  reason: collision with root package name */
    public final C0103b f2670b;

    /* renamed from: c  reason: collision with root package name */
    public final SocketFactory f2671c;

    /* renamed from: d  reason: collision with root package name */
    public final C0103b f2672d;
    public final List e;

    /* renamed from: f  reason: collision with root package name */
    public final List f2673f;

    /* renamed from: g  reason: collision with root package name */
    public final ProxySelector f2674g;

    /* renamed from: h  reason: collision with root package name */
    public final SSLSocketFactory f2675h;
    public final c i;

    /* renamed from: j  reason: collision with root package name */
    public final k f2676j;

    public C0102a(String str, int i2, C0103b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, c cVar, k kVar, C0103b bVar2, ProxySelector proxySelector) {
        String str2 = str;
        int i3 = i2;
        C0103b bVar3 = bVar;
        SocketFactory socketFactory2 = socketFactory;
        SSLSocketFactory sSLSocketFactory2 = sSLSocketFactory;
        C0103b bVar4 = bVar2;
        ProxySelector proxySelector2 = proxySelector;
        List list = x.f2799w;
        List list2 = x.f2800x;
        t tVar = new t();
        String str3 = sSLSocketFactory2 != null ? "https" : "http";
        if (str3.equalsIgnoreCase("http")) {
            tVar.f2767a = "http";
        } else if (str3.equalsIgnoreCase("https")) {
            tVar.f2767a = "https";
        } else {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str3));
        }
        if (str2 != null) {
            String b2 = h1.c.b(u.h(str2, 0, str.length(), false));
            if (b2 != null) {
                tVar.f2770d = b2;
                if (i3 <= 0 || i3 > 65535) {
                    throw new IllegalArgumentException(E.e("unexpected port: ", i3));
                }
                tVar.e = i3;
                this.f2669a = tVar.a();
                if (bVar3 != null) {
                    this.f2670b = bVar3;
                    if (socketFactory2 != null) {
                        this.f2671c = socketFactory2;
                        if (bVar4 != null) {
                            this.f2672d = bVar4;
                            if (list != null) {
                                this.e = h1.c.k(list);
                                if (list2 != null) {
                                    this.f2673f = h1.c.k(list2);
                                    if (proxySelector2 != null) {
                                        this.f2674g = proxySelector2;
                                        this.f2675h = sSLSocketFactory2;
                                        this.i = cVar;
                                        this.f2676j = kVar;
                                        return;
                                    }
                                    throw new NullPointerException("proxySelector == null");
                                }
                                throw new NullPointerException("connectionSpecs == null");
                            }
                            throw new NullPointerException("protocols == null");
                        }
                        throw new NullPointerException("proxyAuthenticator == null");
                    }
                    throw new NullPointerException("socketFactory == null");
                }
                throw new NullPointerException("dns == null");
            }
            throw new IllegalArgumentException("unexpected host: ".concat(str2));
        }
        throw new NullPointerException("host == null");
    }

    public final boolean a(C0102a aVar) {
        if (!this.f2670b.equals(aVar.f2670b) || !this.f2672d.equals(aVar.f2672d) || !this.e.equals(aVar.e) || !this.f2673f.equals(aVar.f2673f) || !this.f2674g.equals(aVar.f2674g) || !h1.c.i((Object) null, (Object) null) || !h1.c.i(this.f2675h, aVar.f2675h) || !h1.c.i(this.i, aVar.i) || !h1.c.i(this.f2676j, aVar.f2676j) || this.f2669a.e != aVar.f2669a.e) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0102a) {
            C0102a aVar = (C0102a) obj;
            if (!this.f2669a.equals(aVar.f2669a) || !a(aVar)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int hashCode = this.f2670b.hashCode();
        int hashCode2 = this.f2672d.hashCode();
        int hashCode3 = this.e.hashCode();
        int hashCode4 = this.f2673f.hashCode();
        int hashCode5 = (this.f2674g.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f2669a.f2780h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961;
        int i4 = 0;
        SSLSocketFactory sSLSocketFactory = this.f2675h;
        if (sSLSocketFactory != null) {
            i2 = sSLSocketFactory.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode5 + i2) * 31;
        c cVar = this.i;
        if (cVar != null) {
            i3 = cVar.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (i5 + i3) * 31;
        k kVar = this.f2676j;
        if (kVar != null) {
            i4 = kVar.hashCode();
        }
        return i6 + i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        u uVar = this.f2669a;
        sb.append(uVar.f2777d);
        sb.append(":");
        sb.append(uVar.e);
        sb.append(", proxySelector=");
        sb.append(this.f2674g);
        sb.append("}");
        return sb.toString();
    }
}
