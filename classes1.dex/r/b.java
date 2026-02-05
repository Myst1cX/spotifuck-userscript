package r;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class b extends k implements Map {

    /* renamed from: h  reason: collision with root package name */
    public C0323a f4515h;

    public final Set entrySet() {
        if (this.f4515h == null) {
            this.f4515h = new C0323a(0, this);
        }
        C0323a aVar = this.f4515h;
        if (aVar.f4511a == null) {
            aVar.f4511a = new h(aVar, 0);
        }
        return aVar.f4511a;
    }

    public final Set keySet() {
        if (this.f4515h == null) {
            this.f4515h = new C0323a(0, this);
        }
        C0323a aVar = this.f4515h;
        if (aVar.f4512b == null) {
            aVar.f4512b = new h(aVar, 1);
        }
        return aVar.f4512b;
    }

    public final void putAll(Map map) {
        b(map.size() + this.f4550c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final Collection values() {
        if (this.f4515h == null) {
            this.f4515h = new C0323a(0, this);
        }
        C0323a aVar = this.f4515h;
        if (aVar.f4513c == null) {
            aVar.f4513c = new j(aVar);
        }
        return aVar.f4513c;
    }

    public b(k kVar) {
        int i = kVar.f4550c;
        b(i);
        if (this.f4550c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(kVar.h(i2), kVar.j(i2));
            }
        } else if (i > 0) {
            System.arraycopy(kVar.f4548a, 0, this.f4548a, 0, i);
            System.arraycopy(kVar.f4549b, 0, this.f4549b, 0, i << 1);
            this.f4550c = i;
        }
    }
}
