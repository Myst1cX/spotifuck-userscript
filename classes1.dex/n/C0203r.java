package n;

import android.view.MenuItem;

/* renamed from: n.r  reason: case insensitive filesystem */
public final class C0203r implements MenuItem.OnMenuItemClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f3930f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0204s f3931g;

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f3930f.onMenuItemClick(this.f3931g.g(menuItem));
    }

    public C0203r(C0204s sVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3931g = sVar;
        this.f3930f = onMenuItemClickListener;
    }
}
