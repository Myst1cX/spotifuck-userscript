package h;

import A.k;
import E.j;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import m.C0174a;
import m.h;
import n.C0195j;
import n.C0197l;
import o.C0286k;

public final class M extends C0174a implements C0195j {

    /* renamed from: h  reason: collision with root package name */
    public final Context f2920h;
    public final C0197l i;

    /* renamed from: j  reason: collision with root package name */
    public j f2921j;

    /* renamed from: k  reason: collision with root package name */
    public WeakReference f2922k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ N f2923l;

    public final void a() {
        N n2 = this.f2923l;
        if (n2.f2942t == this) {
            if (n2.f2926A) {
                n2.f2943u = this;
                n2.f2944v = this.f2921j;
            } else {
                this.f2921j.E(this);
            }
            this.f2921j = null;
            n2.V(false);
            ActionBarContextView actionBarContextView = n2.f2939q;
            if (actionBarContextView.f1268p == null) {
                actionBarContextView.e();
            }
            n2.f2936n.setHideOnContentScrollEnabled(n2.f2931F);
            n2.f2942t = null;
        }
    }

    public final View b() {
        WeakReference weakReference = this.f2922k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final C0197l c() {
        return this.i;
    }

    public final boolean d(C0197l lVar, MenuItem menuItem) {
        j jVar = this.f2921j;
        if (jVar != null) {
            return ((k) jVar.f108g).o(this, menuItem);
        }
        return false;
    }

    public final MenuInflater e() {
        return new h(this.f2920h);
    }

    public final void f(C0197l lVar) {
        if (this.f2921j != null) {
            i();
            C0286k kVar = this.f2923l.f2939q.i;
            if (kVar != null) {
                kVar.l();
            }
        }
    }

    public final CharSequence g() {
        return this.f2923l.f2939q.getSubtitle();
    }

    public final CharSequence h() {
        return this.f2923l.f2939q.getTitle();
    }

    public final void i() {
        if (this.f2923l.f2942t == this) {
            C0197l lVar = this.i;
            lVar.w();
            try {
                this.f2921j.F(this, lVar);
            } finally {
                lVar.v();
            }
        }
    }

    public final boolean j() {
        return this.f2923l.f2939q.f1276x;
    }

    public final void k(View view) {
        this.f2923l.f2939q.setCustomView(view);
        this.f2922k = new WeakReference(view);
    }

    public final void l(int i2) {
        m(this.f2923l.f2934l.getResources().getString(i2));
    }

    public final void m(CharSequence charSequence) {
        this.f2923l.f2939q.setSubtitle(charSequence);
    }

    public final void n(int i2) {
        o(this.f2923l.f2934l.getResources().getString(i2));
    }

    public final void o(CharSequence charSequence) {
        this.f2923l.f2939q.setTitle(charSequence);
    }

    public final void p(boolean z2) {
        this.f3611g = z2;
        this.f2923l.f2939q.setTitleOptional(z2);
    }

    public M(N n2, Context context, j jVar) {
        this.f2923l = n2;
        this.f2920h = context;
        this.f2921j = jVar;
        C0197l lVar = new C0197l(context);
        lVar.f3881l = 1;
        this.i = lVar;
        lVar.e = this;
    }
}
