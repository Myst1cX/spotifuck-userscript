package K;

import android.util.Base64;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f316a;

    /* renamed from: b  reason: collision with root package name */
    public final String f317b;

    /* renamed from: c  reason: collision with root package name */
    public final String f318c;

    /* renamed from: d  reason: collision with root package name */
    public final List f319d;
    public final String e;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f316a + ", mProviderPackage: " + this.f317b + ", mQuery: " + this.f318c + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.f319d;
            if (i < list.size()) {
                sb.append(" [");
                List list2 = (List) list.get(i);
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    sb.append(" \"");
                    sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                    sb.append("\"");
                }
                sb.append(" ]");
                i++;
            } else {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
        }
    }

    public e(String str, String str2, String str3, List list) {
        str.getClass();
        this.f316a = str;
        str2.getClass();
        this.f317b = str2;
        this.f318c = str3;
        list.getClass();
        this.f319d = list;
        this.e = str + "-" + str2 + "-" + str3;
    }
}
