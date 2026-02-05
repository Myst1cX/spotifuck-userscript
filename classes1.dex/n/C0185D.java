package n;

import Q0.E;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: n.D  reason: case insensitive filesystem */
public final class C0185D extends C0197l implements SubMenu {

    /* renamed from: A  reason: collision with root package name */
    public final C0199n f3812A;

    /* renamed from: z  reason: collision with root package name */
    public final C0197l f3813z;

    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        u(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.f3812A.setIcon(drawable);
        return this;
    }

    public final boolean d(C0199n nVar) {
        return this.f3813z.d(nVar);
    }

    public final boolean f(C0199n nVar) {
        return this.f3813z.f(nVar);
    }

    public final MenuItem getItem() {
        return this.f3812A;
    }

    public final String j() {
        int i;
        C0199n nVar = this.f3812A;
        if (nVar != null) {
            i = nVar.f3900a;
        } else {
            i = 0;
        }
        if (i == 0) {
            return null;
        }
        return E.e("android:menu:actionviewstates:", i);
    }

    public final C0197l k() {
        return this.f3813z.k();
    }

    public final boolean m() {
        return this.f3813z.m();
    }

    public final boolean n() {
        return this.f3813z.n();
    }

    public final boolean o() {
        return this.f3813z.o();
    }

    public final void setGroupDividerEnabled(boolean z2) {
        this.f3813z.setGroupDividerEnabled(z2);
    }

    public final SubMenu setHeaderIcon(int i) {
        u(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        u(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setIcon(int i) {
        this.f3812A.setIcon(i);
        return this;
    }

    public final void setQwertyMode(boolean z2) {
        this.f3813z.setQwertyMode(z2);
    }

    public C0185D(Context context, C0197l lVar, C0199n nVar) {
        super(context);
        this.f3813z = lVar;
        this.f3812A = nVar;
    }

    public final boolean e(C0197l lVar, MenuItem menuItem) {
        if (super.e(lVar, menuItem) || this.f3813z.e(lVar, menuItem)) {
            return true;
        }
        return false;
    }
}
