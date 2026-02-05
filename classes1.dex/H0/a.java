package H0;

import A.b;
import E0.c;
import android.graphics.Typeface;
import p0.C0320a;

public final class a extends C0320a {

    /* renamed from: o  reason: collision with root package name */
    public final Typeface f264o;

    /* renamed from: p  reason: collision with root package name */
    public final b f265p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f266q;

    public final void k0(int i) {
        if (!this.f266q) {
            c cVar = (c) this.f265p.f2g;
            if (cVar.j(this.f264o)) {
                cVar.h(false);
            }
        }
    }

    public final void l0(Typeface typeface, boolean z2) {
        if (!this.f266q) {
            c cVar = (c) this.f265p.f2g;
            if (cVar.j(typeface)) {
                cVar.h(false);
            }
        }
    }

    public a(b bVar, Typeface typeface) {
        this.f264o = typeface;
        this.f265p = bVar;
    }
}
