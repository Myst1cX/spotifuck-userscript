package j1;

import K.j;
import g1.C0102a;
import g1.C0103b;
import g1.F;
import g1.u;
import g1.z;
import h1.c;
import j0.C0160w;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final C0102a f3542a;

    /* renamed from: b  reason: collision with root package name */
    public final C0160w f3543b;

    /* renamed from: c  reason: collision with root package name */
    public final C0103b f3544c;

    /* renamed from: d  reason: collision with root package name */
    public final List f3545d = Collections.emptyList();
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public List f3546f = Collections.emptyList();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f3547g = new ArrayList();

    public d(C0102a aVar, C0160w wVar, z zVar, C0103b bVar) {
        List list;
        this.f3542a = aVar;
        this.f3543b = wVar;
        this.f3544c = bVar;
        List<Proxy> select = aVar.f2674g.select(aVar.f2669a.l());
        if (select == null || select.isEmpty()) {
            list = c.l(Proxy.NO_PROXY);
        } else {
            list = c.k(select);
        }
        this.f3545d = list;
        this.e = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.f3542a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(g1.F r4, java.io.IOException r5) {
        /*
            r3 = this;
            java.net.Proxy r0 = r4.f2661b
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT
            if (r0 == r1) goto L_0x001f
            g1.a r0 = r3.f3542a
            java.net.ProxySelector r1 = r0.f2674g
            if (r1 == 0) goto L_0x001f
            g1.u r0 = r0.f2669a
            java.net.URI r0 = r0.l()
            java.net.Proxy r2 = r4.f2661b
            java.net.SocketAddress r2 = r2.address()
            r1.connectFailed(r0, r2, r5)
        L_0x001f:
            j0.w r5 = r3.f3543b
            monitor-enter(r5)
            java.lang.Object r0 = r5.f3516f     // Catch:{ all -> 0x002b }
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0     // Catch:{ all -> 0x002b }
            r0.add(r4)     // Catch:{ all -> 0x002b }
            monitor-exit(r5)
            return
        L_0x002b:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x002b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.d.a(g1.F, java.io.IOException):void");
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [K.j, java.lang.Object] */
    public final j b() {
        boolean z2;
        String str;
        int i;
        boolean contains;
        if (this.e >= this.f3545d.size() && this.f3547g.isEmpty()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.e < this.f3545d.size()) {
            if (this.e < this.f3545d.size()) {
                z2 = true;
            } else {
                z2 = false;
            }
            C0102a aVar = this.f3542a;
            if (z2) {
                List list = this.f3545d;
                int i2 = this.e;
                this.e = i2 + 1;
                Proxy proxy = (Proxy) list.get(i2);
                this.f3546f = new ArrayList();
                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                    u uVar = aVar.f2669a;
                    str = uVar.f2777d;
                    i = uVar.e;
                } else {
                    SocketAddress address = proxy.address();
                    if (address instanceof InetSocketAddress) {
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                        InetAddress address2 = inetSocketAddress.getAddress();
                        if (address2 == null) {
                            str = inetSocketAddress.getHostName();
                        } else {
                            str = address2.getHostAddress();
                        }
                        i = inetSocketAddress.getPort();
                    } else {
                        throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
                    }
                }
                if (i >= 1 && i <= 65535) {
                    if (proxy.type() == Proxy.Type.SOCKS) {
                        this.f3546f.add(InetSocketAddress.createUnresolved(str, i));
                    } else {
                        this.f3544c.getClass();
                        aVar.f2670b.getClass();
                        if (str != null) {
                            try {
                                List asList = Arrays.asList(InetAddress.getAllByName(str));
                                if (!asList.isEmpty()) {
                                    int size = asList.size();
                                    for (int i3 = 0; i3 < size; i3++) {
                                        this.f3546f.add(new InetSocketAddress((InetAddress) asList.get(i3), i));
                                    }
                                } else {
                                    throw new UnknownHostException(aVar.f2670b + " returned no addresses for " + str);
                                }
                            } catch (NullPointerException e2) {
                                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                                unknownHostException.initCause(e2);
                                throw unknownHostException;
                            }
                        } else {
                            throw new UnknownHostException("hostname == null");
                        }
                    }
                    int size2 = this.f3546f.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        F f2 = new F(this.f3542a, proxy, (InetSocketAddress) this.f3546f.get(i4));
                        C0160w wVar = this.f3543b;
                        synchronized (wVar) {
                            contains = ((LinkedHashSet) wVar.f3516f).contains(f2);
                        }
                        if (contains) {
                            this.f3547g.add(f2);
                        } else {
                            arrayList.add(f2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                } else {
                    throw new SocketException("No route to " + str + ":" + i + "; port is out of range");
                }
            } else {
                throw new SocketException("No route to " + aVar.f2669a.f2777d + "; exhausted proxy configurations: " + this.f3545d);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.f3547g);
            this.f3547g.clear();
        }
        ? obj = new Object();
        obj.f332f = 0;
        obj.f333g = arrayList;
        return obj;
    }
}
