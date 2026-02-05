package h;

import android.view.View;

/* renamed from: h.a  reason: case insensitive filesystem */
public final class C0110a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2949a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2950b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2951c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C0117h f2952d;

    public /* synthetic */ C0110a(C0117h hVar, View view, View view2, int i) {
        this.f2949a = i;
        this.f2952d = hVar;
        this.f2950b = view;
        this.f2951c = view2;
    }

    public final void run() {
        switch (this.f2949a) {
            case 0:
                C0117h.b(this.f2952d.f3002r, this.f2950b, this.f2951c);
                return;
            default:
                C0117h.b(this.f2952d.f2991f, this.f2950b, this.f2951c);
                return;
        }
    }
}
