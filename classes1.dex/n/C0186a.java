package n;

import H.a;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p0.C0320a;

/* renamed from: n.a  reason: case insensitive filesystem */
public final class C0186a implements a {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f3814a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f3815b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f3816c;

    /* renamed from: d  reason: collision with root package name */
    public char f3817d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public char f3818f;

    /* renamed from: g  reason: collision with root package name */
    public int f3819g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f3820h;
    public Context i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f3821j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f3822k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f3823l;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f3824m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3825n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3826o;

    /* renamed from: p  reason: collision with root package name */
    public int f3827p;

    public final C0200o a() {
        return null;
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final View getActionView() {
        return null;
    }

    public final int getGroupId() {
        return 0;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getOrder() {
        return 0;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        this.f3818f = Character.toLowerCase(c2);
        return this;
    }

    public final a setContentDescription(CharSequence charSequence) {
        this.f3821j = charSequence;
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f3820h = drawable;
        c();
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        this.f3817d = c2;
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.f3817d = c2;
        this.f3818f = Character.toLowerCase(c3);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3814a = charSequence;
        return this;
    }

    public final a setTooltipText(CharSequence charSequence) {
        this.f3822k = charSequence;
        return this;
    }

    public final a b(C0200o oVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f3820h;
        if (drawable == null) {
            return;
        }
        if (this.f3825n || this.f3826o) {
            Drawable J02 = C0320a.J0(drawable);
            this.f3820h = J02;
            Drawable mutate = J02.mutate();
            this.f3820h = mutate;
            if (this.f3825n) {
                G.a.h(mutate, this.f3823l);
            }
            if (this.f3826o) {
                G.a.i(this.f3820h, this.f3824m);
            }
        }
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final int getAlphabeticModifiers() {
        return this.f3819g;
    }

    public final char getAlphabeticShortcut() {
        return this.f3818f;
    }

    public final CharSequence getContentDescription() {
        return this.f3821j;
    }

    public final Drawable getIcon() {
        return this.f3820h;
    }

    public final ColorStateList getIconTintList() {
        return this.f3823l;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f3824m;
    }

    public final Intent getIntent() {
        return this.f3816c;
    }

    public final int getNumericModifiers() {
        return this.e;
    }

    public final char getNumericShortcut() {
        return this.f3817d;
    }

    public final CharSequence getTitle() {
        return this.f3814a;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3815b;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f3814a;
    }

    public final CharSequence getTooltipText() {
        return this.f3822k;
    }

    public final boolean isCheckable() {
        if ((this.f3827p & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isChecked() {
        if ((this.f3827p & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isEnabled() {
        if ((this.f3827p & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isVisible() {
        if ((this.f3827p & 8) == 0) {
            return true;
        }
        return false;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f3818f = Character.toLowerCase(c2);
        this.f3819g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public final MenuItem setCheckable(boolean z2) {
        this.f3827p = z2 | (this.f3827p & true) ? 1 : 0;
        return this;
    }

    public final MenuItem setChecked(boolean z2) {
        int i2;
        int i3 = this.f3827p & -3;
        if (z2) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        this.f3827p = i2 | i3;
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public final MenuItem m10setContentDescription(CharSequence charSequence) {
        this.f3821j = charSequence;
        return this;
    }

    public final MenuItem setEnabled(boolean z2) {
        int i2;
        int i3 = this.f3827p & -17;
        if (z2) {
            i2 = 16;
        } else {
            i2 = 0;
        }
        this.f3827p = i2 | i3;
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3823l = colorStateList;
        this.f3825n = true;
        c();
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3824m = mode;
        this.f3826o = true;
        c();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f3816c = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c2, int i2) {
        this.f3817d = c2;
        this.e = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final void setShowAsAction(int i2) {
    }

    public final MenuItem setShowAsActionFlags(int i2) {
        return this;
    }

    public final MenuItem setTitle(int i2) {
        this.f3814a = this.i.getResources().getString(i2);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3815b = charSequence;
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public final MenuItem m11setTooltipText(CharSequence charSequence) {
        this.f3822k = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z2) {
        int i2 = 8;
        int i3 = this.f3827p & 8;
        if (z2) {
            i2 = 0;
        }
        this.f3827p = i3 | i2;
        return this;
    }

    public final int getItemId() {
        return 16908332;
    }

    public final MenuItem setIcon(int i2) {
        this.f3820h = D.a.b(this.i, i2);
        c();
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f3817d = c2;
        this.e = KeyEvent.normalizeMetaState(i2);
        this.f3818f = Character.toLowerCase(c3);
        this.f3819g = KeyEvent.normalizeMetaState(i3);
        return this;
    }
}
