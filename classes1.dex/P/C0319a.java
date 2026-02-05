package p;

import T0.g;

/* renamed from: p.a  reason: case insensitive filesystem */
public final class C0319a extends g {

    /* renamed from: m  reason: collision with root package name */
    public static volatile C0319a f4435m;

    /* renamed from: l  reason: collision with root package name */
    public final c f4436l = new c();

    public static C0319a V() {
        if (f4435m != null) {
            return f4435m;
        }
        synchronized (C0319a.class) {
            try {
                if (f4435m == null) {
                    f4435m = new C0319a();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return f4435m;
    }
}
