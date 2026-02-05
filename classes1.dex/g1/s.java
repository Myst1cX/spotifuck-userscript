package g1;

import A.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final String[] f2766a;

    public final String a(String str) {
        String[] strArr = this.f2766a;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public final String b(int i) {
        return this.f2766a[i * 2];
    }

    public final b c() {
        b bVar = new b(27);
        Collections.addAll((ArrayList) bVar.f2g, this.f2766a);
        return bVar;
    }

    public final int d() {
        return this.f2766a.length / 2;
    }

    public final String e(int i) {
        return this.f2766a[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s) || !Arrays.equals(((s) obj).f2766a, this.f2766a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2766a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int d2 = d();
        for (int i = 0; i < d2; i++) {
            sb.append(b(i));
            sb.append(": ");
            sb.append(e(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    public s(b bVar) {
        ArrayList arrayList = (ArrayList) bVar.f2g;
        this.f2766a = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final List f(String str) {
        int d2 = d();
        ArrayList arrayList = null;
        for (int i = 0; i < d2; i++) {
            if (str.equalsIgnoreCase(b(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(e(i));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }
}
