package m;

import A.k;
import E.j;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import n.C0195j;
import n.C0197l;
import o.C0286k;

/* renamed from: m.d  reason: case insensitive filesystem */
public final class C0177d extends C0174a implements C0195j {

    /* renamed from: h  reason: collision with root package name */
    public Context f3617h;
    public ActionBarContextView i;

    /* renamed from: j  reason: collision with root package name */
    public j f3618j;

    /* renamed from: k  reason: collision with root package name */
    public WeakReference f3619k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3620l;

    /* renamed from: m  reason: collision with root package name */
    public C0197l f3621m;

    public final void a() {
        if (!this.f3620l) {
            this.f3620l = true;
            this.f3618j.E(this);
        }
    }

    public final View b() {
        WeakReference weakReference = this.f3619k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final C0197l c() {
        return this.f3621m;
    }

    public final boolean d(C0197l lVar, MenuItem menuItem) {
        return ((k) this.f3618j.f108g).o(this, menuItem);
    }

    public final MenuInflater e() {
        return new h(this.i.getContext());
    }

    public final CharSequence g() {
        return this.i.getSubtitle();
    }

    public final CharSequence h() {
        return this.i.getTitle();
    }

    public final void i() {
        this.f3618j.F(this, this.f3621m);
    }

    public final boolean j() {
        return this.i.f1276x;
    }

    public final void k(View view) {
        WeakReference weakReference;
        this.i.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.f3619k = weakReference;
    }

    public final void l(int i2) {
        m(this.f3617h.getString(i2));
    }

    public final void m(CharSequence charSequence) {
        this.i.setSubtitle(charSequence);
    }

    public final void n(int i2) {
        o(this.f3617h.getString(i2));
    }

    public final void o(CharSequence charSequence) {
        this.i.setTitle(charSequence);
    }

    public final void p(boolean z2) {
        this.f3611g = z2;
        this.i.setTitleOptional(z2);
    }

    public final void f(C0197l lVar) {
        i();
        C0286k kVar = this.i.i;
        if (kVar != null) {
            kVar.l();
        }
    }
}
