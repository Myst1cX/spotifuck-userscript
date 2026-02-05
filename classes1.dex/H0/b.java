package H0;

import android.graphics.Typeface;
import p0.C0320a;

public final class b extends E.b {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ C0320a f267h;
    public final /* synthetic */ d i;

    public final void i(int i2) {
        this.i.f282m = true;
        this.f267h.k0(i2);
    }

    public final void j(Typeface typeface) {
        d dVar = this.i;
        dVar.f283n = Typeface.create(typeface, dVar.f274c);
        dVar.f282m = true;
        this.f267h.l0(dVar.f283n, false);
    }

    public b(d dVar, C0320a aVar) {
        this.i = dVar;
        this.f267h = aVar;
    }
}
