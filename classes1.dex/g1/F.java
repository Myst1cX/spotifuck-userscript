package g1;

import java.net.InetSocketAddress;
import java.net.Proxy;

public final class F {

    /* renamed from: a  reason: collision with root package name */
    public final C0102a f2660a;

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f2661b;

    /* renamed from: c  reason: collision with root package name */
    public final InetSocketAddress f2662c;

    public final boolean equals(Object obj) {
        if (obj instanceof F) {
            F f2 = (F) obj;
            if (!f2.f2660a.equals(this.f2660a) || !f2.f2661b.equals(this.f2661b) || !f2.f2662c.equals(this.f2662c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f2661b.hashCode();
        return this.f2662c.hashCode() + ((hashCode + ((this.f2660a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f2662c + "}";
    }

    public F(C0102a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        } else if (inetSocketAddress != null) {
            this.f2660a = aVar;
            this.f2661b = proxy;
            this.f2662c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }
}
