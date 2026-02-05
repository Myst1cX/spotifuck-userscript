package m1;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import r1.h;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final C0179b[] f3700a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map f3701b;

    static {
        C0179b bVar = new C0179b(C0179b.i, "");
        h hVar = C0179b.f3680f;
        C0179b bVar2 = new C0179b(hVar, "GET");
        C0179b bVar3 = new C0179b(hVar, "POST");
        h hVar2 = C0179b.f3681g;
        C0179b bVar4 = new C0179b(hVar2, "/");
        C0179b bVar5 = new C0179b(hVar2, "/index.html");
        h hVar3 = C0179b.f3682h;
        C0179b bVar6 = new C0179b(hVar3, "http");
        C0179b bVar7 = new C0179b(hVar3, "https");
        h hVar4 = C0179b.e;
        C0179b bVar8 = new C0179b(hVar4, "200");
        C0179b bVar9 = new C0179b(hVar4, "204");
        C0179b bVar10 = new C0179b(hVar4, "206");
        C0179b bVar11 = new C0179b(hVar4, "304");
        C0179b bVar12 = new C0179b(hVar4, "400");
        C0179b bVar13 = new C0179b(hVar4, "404");
        C0179b bVar14 = new C0179b(hVar4, "500");
        C0179b bVar15 = bVar14;
        C0179b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar15, new C0179b("accept-charset", ""), new C0179b("accept-encoding", "gzip, deflate"), new C0179b("accept-language", ""), new C0179b("accept-ranges", ""), new C0179b("accept", ""), new C0179b("access-control-allow-origin", ""), new C0179b("age", ""), new C0179b("allow", ""), new C0179b("authorization", ""), new C0179b("cache-control", ""), new C0179b("content-disposition", ""), new C0179b("content-encoding", ""), new C0179b("content-language", ""), new C0179b("content-length", ""), new C0179b("content-location", ""), new C0179b("content-range", ""), new C0179b("content-type", ""), new C0179b("cookie", ""), new C0179b("date", ""), new C0179b("etag", ""), new C0179b("expect", ""), new C0179b("expires", ""), new C0179b("from", ""), new C0179b("host", ""), new C0179b("if-match", ""), new C0179b("if-modified-since", ""), new C0179b("if-none-match", ""), new C0179b("if-range", ""), new C0179b("if-unmodified-since", ""), new C0179b("last-modified", ""), new C0179b("link", ""), new C0179b("location", ""), new C0179b("max-forwards", ""), new C0179b("proxy-authenticate", ""), new C0179b("proxy-authorization", ""), new C0179b("range", ""), new C0179b("referer", ""), new C0179b("refresh", ""), new C0179b("retry-after", ""), new C0179b("server", ""), new C0179b("set-cookie", ""), new C0179b("strict-transport-security", ""), new C0179b("transfer-encoding", ""), new C0179b("user-agent", ""), new C0179b("vary", ""), new C0179b("via", ""), new C0179b("www-authenticate", "")};
        f3700a = bVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(bVarArr.length);
        for (int i = 0; i < bVarArr.length; i++) {
            if (!linkedHashMap.containsKey(bVarArr[i].f3683a)) {
                linkedHashMap.put(bVarArr[i].f3683a, Integer.valueOf(i));
            }
        }
        f3701b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(h hVar) {
        int l2 = hVar.l();
        int i = 0;
        while (i < l2) {
            byte g2 = hVar.g(i);
            if (g2 < 65 || g2 > 90) {
                i++;
            } else {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + hVar.o());
            }
        }
    }
}
