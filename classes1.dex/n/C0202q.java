package n;

import android.view.MenuItem;

/* renamed from: n.q  reason: case insensitive filesystem */
public final class C0202q implements MenuItem.OnActionExpandListener {

    /* renamed from: a  reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f3928a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0204s f3929b;

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f3928a.onMenuItemActionCollapse(this.f3929b.g(menuItem));
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f3928a.onMenuItemActionExpand(this.f3929b.g(menuItem));
    }

    public C0202q(C0204s sVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3929b = sVar;
        this.f3928a = onActionExpandListener;
    }
}
