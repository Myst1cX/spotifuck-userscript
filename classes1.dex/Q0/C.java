package Q0;

import A.b;
import android.os.HandlerThread;
import android.os.Looper;
import r1.h;

public final class C {

    /* renamed from: a  reason: collision with root package name */
    public final b f759a;

    /* renamed from: b  reason: collision with root package name */
    public final j f760b;

    /* renamed from: c  reason: collision with root package name */
    public long f761c;

    /* renamed from: d  reason: collision with root package name */
    public long f762d;
    public long e;

    /* renamed from: f  reason: collision with root package name */
    public long f763f;

    /* renamed from: g  reason: collision with root package name */
    public long f764g;

    /* renamed from: h  reason: collision with root package name */
    public long f765h;
    public long i;

    /* renamed from: j  reason: collision with root package name */
    public long f766j;

    /* renamed from: k  reason: collision with root package name */
    public int f767k;

    /* renamed from: l  reason: collision with root package name */
    public int f768l;

    /* renamed from: m  reason: collision with root package name */
    public int f769m;

    public C(b bVar) {
        this.f759a = bVar;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        h hVar = H.f783a;
        u uVar = new u(looper, 1);
        uVar.sendMessageDelayed(uVar.obtainMessage(), 1000);
        this.f760b = new j(handlerThread.getLooper(), (Object) this, 1);
    }

    public final D a() {
        b bVar = this.f759a;
        return new D(((o) bVar.f2g).maxSize(), ((o) bVar.f2g).size(), this.f761c, this.f762d, this.e, this.f763f, this.f764g, this.f765h, this.i, this.f766j, this.f767k, this.f768l, this.f769m, System.currentTimeMillis());
    }
}
