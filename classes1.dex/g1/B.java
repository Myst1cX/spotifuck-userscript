package g1;

import A.b;

public final class B {

    /* renamed from: a  reason: collision with root package name */
    public A f2636a;

    /* renamed from: b  reason: collision with root package name */
    public y f2637b;

    /* renamed from: c  reason: collision with root package name */
    public int f2638c = -1;

    /* renamed from: d  reason: collision with root package name */
    public String f2639d;
    public r e;

    /* renamed from: f  reason: collision with root package name */
    public b f2640f = new b(27);

    /* renamed from: g  reason: collision with root package name */
    public E f2641g;

    /* renamed from: h  reason: collision with root package name */
    public C f2642h;
    public C i;

    /* renamed from: j  reason: collision with root package name */
    public C f2643j;

    /* renamed from: k  reason: collision with root package name */
    public long f2644k;

    /* renamed from: l  reason: collision with root package name */
    public long f2645l;

    public static void b(String str, C c2) {
        if (c2.f2651g != null) {
            throw new IllegalArgumentException(str.concat(".body != null"));
        } else if (c2.f2652h != null) {
            throw new IllegalArgumentException(str.concat(".networkResponse != null"));
        } else if (c2.i != null) {
            throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
        } else if (c2.f2653j != null) {
            throw new IllegalArgumentException(str.concat(".priorResponse != null"));
        }
    }

    public final C a() {
        if (this.f2636a == null) {
            throw new IllegalStateException("request == null");
        } else if (this.f2637b == null) {
            throw new IllegalStateException("protocol == null");
        } else if (this.f2638c < 0) {
            throw new IllegalStateException("code < 0: " + this.f2638c);
        } else if (this.f2639d != null) {
            return new C(this);
        } else {
            throw new IllegalStateException("message == null");
        }
    }
}
