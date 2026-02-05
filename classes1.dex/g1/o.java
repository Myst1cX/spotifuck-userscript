package g1;

import java.io.Serializable;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2742a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2743b;

    /* renamed from: c  reason: collision with root package name */
    public Object f2744c;

    /* renamed from: d  reason: collision with root package name */
    public Serializable f2745d;

    public o(boolean z2) {
        this.f2742a = z2;
    }

    public void a(String... strArr) {
        if (!this.f2742a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        } else if (strArr.length != 0) {
            this.f2744c = (String[]) strArr.clone();
        } else {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
    }

    public void b(G... gArr) {
        if (this.f2742a) {
            String[] strArr = new String[gArr.length];
            for (int i = 0; i < gArr.length; i++) {
                strArr[i] = gArr[i].f2668a;
            }
            c(strArr);
            return;
        }
        throw new IllegalStateException("no TLS versions for cleartext connections");
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.String[], java.io.Serializable] */
    public void c(String... strArr) {
        if (!this.f2742a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        } else if (strArr.length != 0) {
            this.f2745d = (String[]) strArr.clone();
        } else {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.String[], java.io.Serializable] */
    public o(p pVar) {
        this.f2742a = pVar.f2747a;
        this.f2744c = pVar.f2749c;
        this.f2745d = pVar.f2750d;
        this.f2743b = pVar.f2748b;
    }
}
