package g1;

import A.b;
import A.k;

public final class A {

    /* renamed from: a  reason: collision with root package name */
    public final u f2632a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2633b;

    /* renamed from: c  reason: collision with root package name */
    public final s f2634c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f2635d;
    public volatile j e;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, A.k] */
    public final k a() {
        ? obj = new Object();
        obj.f21f = this.f2632a;
        obj.f22g = this.f2633b;
        obj.i = this.f2635d;
        obj.f23h = this.f2634c.c();
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f2633b);
        sb.append(", url=");
        sb.append(this.f2632a);
        sb.append(", tag=");
        Object obj = this.f2635d;
        if (obj == this) {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }

    public A(k kVar) {
        this.f2632a = (u) kVar.f21f;
        this.f2633b = (String) kVar.f22g;
        b bVar = (b) kVar.f23h;
        bVar.getClass();
        this.f2634c = new s(bVar);
        Object obj = kVar.i;
        this.f2635d = obj == null ? this : obj;
    }
}
