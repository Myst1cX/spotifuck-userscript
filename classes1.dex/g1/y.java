package g1;

import java.io.IOException;

public enum y {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    QUIC("quic");
    

    /* renamed from: a  reason: collision with root package name */
    public final String f2826a;

    public static y a(String str) {
        if (str.equals("http/1.0")) {
            return HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return HTTP_1_1;
        }
        if (str.equals("h2")) {
            return HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return SPDY_3;
        }
        if (str.equals("quic")) {
            return QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public final String toString() {
        return this.f2826a;
    }

    /* access modifiers changed from: public */
    y(String str) {
        this.f2826a = str;
    }
}
