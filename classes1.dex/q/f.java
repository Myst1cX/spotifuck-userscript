package q;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class f implements Iterable {

    /* renamed from: a  reason: collision with root package name */
    public c f4478a;

    /* renamed from: b  reason: collision with root package name */
    public c f4479b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakHashMap f4480c = new WeakHashMap();

    /* renamed from: d  reason: collision with root package name */
    public int f4481d = 0;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((q.b) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof q.f
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            q.f r7 = (q.f) r7
            int r1 = r6.f4481d
            int r3 = r7.f4481d
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            r3 = r1
            q.b r3 = (q.b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            r4 = r7
            q.b r4 = (q.b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L_0x003b
            if (r4 != 0) goto L_0x0043
        L_0x003b:
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x0053
            q.b r7 = (q.b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q.f.equals(java.lang.Object):boolean");
    }

    public c a(Object obj) {
        c cVar = this.f4478a;
        while (cVar != null && !cVar.f4471a.equals(obj)) {
            cVar = cVar.f4473c;
        }
        return cVar;
    }

    public final Iterator iterator() {
        b bVar = new b(this.f4478a, this.f4479b, 0);
        this.f4480c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it2 = iterator();
        while (true) {
            b bVar = (b) it2;
            if (bVar.hasNext()) {
                sb.append(((Map.Entry) bVar.next()).toString());
                if (bVar.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }

    public Object b(Object obj) {
        c a2 = a(obj);
        if (a2 == null) {
            return null;
        }
        this.f4481d--;
        WeakHashMap weakHashMap = this.f4480c;
        if (!weakHashMap.isEmpty()) {
            for (e a3 : weakHashMap.keySet()) {
                a3.a(a2);
            }
        }
        c cVar = a2.f4474d;
        if (cVar != null) {
            cVar.f4473c = a2.f4473c;
        } else {
            this.f4478a = a2.f4473c;
        }
        c cVar2 = a2.f4473c;
        if (cVar2 != null) {
            cVar2.f4474d = cVar;
        } else {
            this.f4479b = cVar;
        }
        a2.f4473c = null;
        a2.f4474d = null;
        return a2.f4472b;
    }

    public final int hashCode() {
        Iterator it2 = iterator();
        int i = 0;
        while (true) {
            b bVar = (b) it2;
            if (!bVar.hasNext()) {
                return i;
            }
            i += ((Map.Entry) bVar.next()).hashCode();
        }
    }
}
