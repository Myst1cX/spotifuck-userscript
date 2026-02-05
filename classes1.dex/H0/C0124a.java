package h0;

import java.io.Serializable;

/* renamed from: h0.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0124a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0125b f3046a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f3047b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Serializable f3048c;

    public /* synthetic */ C0124a(C0125b bVar, int i, Serializable serializable) {
        this.f3046a = bVar;
        this.f3047b = i;
        this.f3048c = serializable;
    }

    public final void run() {
        this.f3046a.f3050b.k(this.f3047b, this.f3048c);
    }
}
