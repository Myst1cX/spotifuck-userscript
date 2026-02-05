package g1;

import java.util.TreeMap;

public final class m {

    /* renamed from: b  reason: collision with root package name */
    public static final l f2722b;

    /* renamed from: c  reason: collision with root package name */
    public static final TreeMap f2723c;

    /* renamed from: d  reason: collision with root package name */
    public static final m f2724d = a("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final m e = a("TLS_RSA_WITH_AES_128_CBC_SHA");

    /* renamed from: f  reason: collision with root package name */
    public static final m f2725f = a("TLS_RSA_WITH_AES_256_CBC_SHA");

    /* renamed from: g  reason: collision with root package name */
    public static final m f2726g = a("TLS_RSA_WITH_AES_128_GCM_SHA256");

    /* renamed from: h  reason: collision with root package name */
    public static final m f2727h = a("TLS_RSA_WITH_AES_256_GCM_SHA384");
    public static final m i = a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");

    /* renamed from: j  reason: collision with root package name */
    public static final m f2728j = a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");

    /* renamed from: k  reason: collision with root package name */
    public static final m f2729k = a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");

    /* renamed from: l  reason: collision with root package name */
    public static final m f2730l = a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");

    /* renamed from: m  reason: collision with root package name */
    public static final m f2731m = a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");

    /* renamed from: n  reason: collision with root package name */
    public static final m f2732n = a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");

    /* renamed from: o  reason: collision with root package name */
    public static final m f2733o = a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");

    /* renamed from: p  reason: collision with root package name */
    public static final m f2734p = a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");

    /* renamed from: a  reason: collision with root package name */
    public final String f2735a;

    /* JADX WARNING: type inference failed for: r0v0, types: [g1.l, java.lang.Object, java.util.Comparator] */
    static {
        ? obj = new Object();
        f2722b = obj;
        f2723c = new TreeMap(obj);
        a("SSL_RSA_WITH_NULL_MD5");
        a("SSL_RSA_WITH_NULL_SHA");
        a("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        a("SSL_RSA_WITH_RC4_128_MD5");
        a("SSL_RSA_WITH_RC4_128_SHA");
        a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        a("SSL_RSA_WITH_DES_CBC_SHA");
        a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        a("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        a("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        a("SSL_DH_anon_WITH_RC4_128_MD5");
        a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        a("SSL_DH_anon_WITH_DES_CBC_SHA");
        a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        a("TLS_KRB5_WITH_DES_CBC_SHA");
        a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        a("TLS_KRB5_WITH_RC4_128_SHA");
        a("TLS_KRB5_WITH_DES_CBC_MD5");
        a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        a("TLS_KRB5_WITH_RC4_128_MD5");
        a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        a("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        a("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        a("TLS_RSA_WITH_NULL_SHA256");
        a("TLS_RSA_WITH_AES_128_CBC_SHA256");
        a("TLS_RSA_WITH_AES_256_CBC_SHA256");
        a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        a("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        a("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        a("TLS_PSK_WITH_RC4_128_SHA");
        a("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        a("TLS_PSK_WITH_AES_128_CBC_SHA");
        a("TLS_PSK_WITH_AES_256_CBC_SHA");
        a("TLS_RSA_WITH_SEED_CBC_SHA");
        a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        a("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        a("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        a("TLS_FALLBACK_SCSV");
        a("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        a("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        a("TLS_ECDH_RSA_WITH_NULL_SHA");
        a("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        a("TLS_ECDHE_RSA_WITH_NULL_SHA");
        a("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        a("TLS_ECDH_anon_WITH_NULL_SHA");
        a("TLS_ECDH_anon_WITH_RC4_128_SHA");
        a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
    }

    public static synchronized m a(String str) {
        m mVar;
        synchronized (m.class) {
            TreeMap treeMap = f2723c;
            mVar = (m) treeMap.get(str);
            if (mVar == null) {
                mVar = new m(str);
                treeMap.put(str, mVar);
            }
        }
        return mVar;
    }

    public final String toString() {
        return this.f2735a;
    }

    public m(String str) {
        str.getClass();
        this.f2735a = str;
    }
}
