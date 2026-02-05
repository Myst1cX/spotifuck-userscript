package g1;

import A.b;
import java.io.Closeable;

public final class C implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final A f2646a;

    /* renamed from: b  reason: collision with root package name */
    public final y f2647b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2648c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2649d;
    public final r e;

    /* renamed from: f  reason: collision with root package name */
    public final s f2650f;

    /* renamed from: g  reason: collision with root package name */
    public final E f2651g;

    /* renamed from: h  reason: collision with root package name */
    public final C f2652h;
    public final C i;

    /* renamed from: j  reason: collision with root package name */
    public final C f2653j;

    /* renamed from: k  reason: collision with root package name */
    public final long f2654k;

    /* renamed from: l  reason: collision with root package name */
    public final long f2655l;

    /* renamed from: m  reason: collision with root package name */
    public volatile j f2656m;

    public final void close() {
        E e2 = this.f2651g;
        if (e2 != null) {
            e2.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public final j f() {
        j jVar = this.f2656m;
        if (jVar != null) {
            return jVar;
        }
        j a2 = j.a(this.f2650f);
        this.f2656m = a2;
        return a2;
    }

    public final String g(String str) {
        String a2 = this.f2650f.a(str);
        if (a2 != null) {
            return a2;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [g1.B, java.lang.Object] */
    public final B h() {
        ? obj = new Object();
        obj.f2636a = this.f2646a;
        obj.f2637b = this.f2647b;
        obj.f2638c = this.f2648c;
        obj.f2639d = this.f2649d;
        obj.e = this.e;
        obj.f2640f = this.f2650f.c();
        obj.f2641g = this.f2651g;
        obj.f2642h = this.f2652h;
        obj.i = this.i;
        obj.f2643j = this.f2653j;
        obj.f2644k = this.f2654k;
        obj.f2645l = this.f2655l;
        return obj;
    }

    public final String toString() {
        return "Response{protocol=" + this.f2647b + ", code=" + this.f2648c + ", message=" + this.f2649d + ", url=" + this.f2646a.f2632a + '}';
    }

    public C(B b2) {
        this.f2646a = b2.f2636a;
        this.f2647b = b2.f2637b;
        this.f2648c = b2.f2638c;
        this.f2649d = b2.f2639d;
        this.e = b2.e;
        b bVar = b2.f2640f;
        bVar.getClass();
        this.f2650f = new s(bVar);
        this.f2651g = b2.f2641g;
        this.f2652h = b2.f2642h;
        this.i = b2.i;
        this.f2653j = b2.f2643j;
        this.f2654k = b2.f2644k;
        this.f2655l = b2.f2645l;
    }
}
