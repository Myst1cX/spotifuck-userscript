package q1;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

public final class c implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final c f4510a = new Object();

    public static ArrayList a(X509Certificate x509Certificate) {
        List b2 = b(x509Certificate, 7);
        List b3 = b(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(b3.size() + b2.size());
        arrayList.addAll(b2);
        arrayList.addAll(b3);
        return arrayList;
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return c(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    public static List b(X509Certificate x509Certificate, int i) {
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        Integer num = (Integer) next.get(0);
                        if (num != null) {
                            if (num.intValue() == i && (str = (String) next.get(1)) != null) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e9 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(java.lang.String r8, java.security.cert.X509Certificate r9) {
        /*
            java.util.regex.Pattern r0 = h1.c.f3091g
            java.util.regex.Matcher r0 = r0.matcher(r8)
            boolean r0 = r0.matches()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002e
            r0 = 7
            java.util.List r9 = b(r9, r0)
            int r0 = r9.size()
            r3 = 0
        L_0x0018:
            if (r3 >= r0) goto L_0x002b
            java.lang.Object r4 = r9.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r8.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0028
            goto L_0x00e9
        L_0x0028:
            int r3 = r3 + 1
            goto L_0x0018
        L_0x002b:
            r1 = 0
            goto L_0x00e9
        L_0x002e:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r8 = r8.toLowerCase(r0)
            r0 = 2
            java.util.List r9 = b(r9, r0)
            java.util.Iterator r9 = r9.iterator()
        L_0x003d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.Object r0 = r9.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r8 == 0) goto L_0x00bc
            int r3 = r8.length()
            if (r3 == 0) goto L_0x00bc
            java.lang.String r3 = "."
            boolean r4 = r8.startsWith(r3)
            if (r4 != 0) goto L_0x00bc
            java.lang.String r4 = ".."
            boolean r5 = r8.endsWith(r4)
            if (r5 == 0) goto L_0x0062
            goto L_0x00bc
        L_0x0062:
            if (r0 == 0) goto L_0x00bc
            int r5 = r0.length()
            if (r5 == 0) goto L_0x00bc
            boolean r5 = r0.startsWith(r3)
            if (r5 != 0) goto L_0x00bc
            boolean r4 = r0.endsWith(r4)
            if (r4 == 0) goto L_0x0077
            goto L_0x00bc
        L_0x0077:
            boolean r4 = r8.endsWith(r3)
            if (r4 != 0) goto L_0x0082
            java.lang.String r4 = r8.concat(r3)
            goto L_0x0083
        L_0x0082:
            r4 = r8
        L_0x0083:
            boolean r5 = r0.endsWith(r3)
            if (r5 != 0) goto L_0x008d
            java.lang.String r0 = r0.concat(r3)
        L_0x008d:
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r3)
            java.lang.String r3 = "*"
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto L_0x00a0
            boolean r0 = r4.equals(r0)
            goto L_0x00e7
        L_0x00a0:
            java.lang.String r3 = "*."
            boolean r5 = r0.startsWith(r3)
            if (r5 == 0) goto L_0x00bc
            r5 = 42
            int r5 = r0.indexOf(r5, r1)
            r6 = -1
            if (r5 == r6) goto L_0x00b2
            goto L_0x00bc
        L_0x00b2:
            int r5 = r4.length()
            int r7 = r0.length()
            if (r5 >= r7) goto L_0x00be
        L_0x00bc:
            r0 = 0
            goto L_0x00e7
        L_0x00be:
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x00c5
            goto L_0x00bc
        L_0x00c5:
            java.lang.String r0 = r0.substring(r1)
            boolean r3 = r4.endsWith(r0)
            if (r3 != 0) goto L_0x00d0
            goto L_0x00bc
        L_0x00d0:
            int r3 = r4.length()
            int r0 = r0.length()
            int r3 = r3 - r0
            if (r3 <= 0) goto L_0x00e6
            int r3 = r3 + -1
            r0 = 46
            int r0 = r4.lastIndexOf(r0, r3)
            if (r0 == r6) goto L_0x00e6
            goto L_0x00bc
        L_0x00e6:
            r0 = 1
        L_0x00e7:
            if (r0 == 0) goto L_0x003d
        L_0x00e9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.c.c(java.lang.String, java.security.cert.X509Certificate):boolean");
    }
}
