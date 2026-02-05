package n;

import H.a;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.fragment.app.C0053g;
import java.lang.reflect.Method;

/* renamed from: n.s  reason: case insensitive filesystem */
public final class C0204s extends C0053g implements MenuItem {

    /* renamed from: c  reason: collision with root package name */
    public final a f3932c;

    /* renamed from: d  reason: collision with root package name */
    public Method f3933d;

    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0201p(view);
        }
        this.f3932c.setActionView(view);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        this.f3932c.setAlphabeticShortcut(c2);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f3932c.setIcon(drawable);
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        this.f3932c.setNumericShortcut(c2);
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.f3932c.setShortcut(c2, c3);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f3932c.setTitle(charSequence);
        return this;
    }

    public final boolean collapseActionView() {
        return this.f3932c.collapseActionView();
    }

    public final boolean expandActionView() {
        return this.f3932c.expandActionView();
    }

    public final ActionProvider getActionProvider() {
        C0200o a2 = this.f3932c.a();
        if (a2 instanceof C0200o) {
            return a2.f3925b;
        }
        return null;
    }

    public final View getActionView() {
        View actionView = this.f3932c.getActionView();
        if (actionView instanceof C0201p) {
            return (View) ((C0201p) actionView).f3927f;
        }
        return actionView;
    }

    public final int getAlphabeticModifiers() {
        return this.f3932c.getAlphabeticModifiers();
    }

    public final char getAlphabeticShortcut() {
        return this.f3932c.getAlphabeticShortcut();
    }

    public final CharSequence getContentDescription() {
        return this.f3932c.getContentDescription();
    }

    public final int getGroupId() {
        return this.f3932c.getGroupId();
    }

    public final Drawable getIcon() {
        return this.f3932c.getIcon();
    }

    public final ColorStateList getIconTintList() {
        return this.f3932c.getIconTintList();
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f3932c.getIconTintMode();
    }

    public final Intent getIntent() {
        return this.f3932c.getIntent();
    }

    public final int getItemId() {
        return this.f3932c.getItemId();
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f3932c.getMenuInfo();
    }

    public final int getNumericModifiers() {
        return this.f3932c.getNumericModifiers();
    }

    public final char getNumericShortcut() {
        return this.f3932c.getNumericShortcut();
    }

    public final int getOrder() {
        return this.f3932c.getOrder();
    }

    public final SubMenu getSubMenu() {
        return this.f3932c.getSubMenu();
    }

    public final CharSequence getTitle() {
        return this.f3932c.getTitle();
    }

    public final CharSequence getTitleCondensed() {
        return this.f3932c.getTitleCondensed();
    }

    public final CharSequence getTooltipText() {
        return this.f3932c.getTooltipText();
    }

    public final boolean hasSubMenu() {
        return this.f3932c.hasSubMenu();
    }

    public final boolean isActionViewExpanded() {
        return this.f3932c.isActionViewExpanded();
    }

    public final boolean isCheckable() {
        return this.f3932c.isCheckable();
    }

    public final boolean isChecked() {
        return this.f3932c.isChecked();
    }

    public final boolean isEnabled() {
        return this.f3932c.isEnabled();
    }

    public final boolean isVisible() {
        return this.f3932c.isVisible();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        C0200o oVar = new C0200o(this, actionProvider);
        if (actionProvider == null) {
            oVar = null;
        }
        this.f3932c.b(oVar);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        this.f3932c.setAlphabeticShortcut(c2, i);
        return this;
    }

    public final MenuItem setCheckable(boolean z2) {
        this.f3932c.setCheckable(z2);
        return this;
    }

    public final MenuItem setChecked(boolean z2) {
        this.f3932c.setChecked(z2);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f3932c.setContentDescription(charSequence);
        return this;
    }

    public final MenuItem setEnabled(boolean z2) {
        this.f3932c.setEnabled(z2);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f3932c.setIcon(i);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3932c.setIconTintList(colorStateList);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3932c.setIconTintMode(mode);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f3932c.setIntent(intent);
        return this;
    }

    public final MenuItem setNumericShortcut(char c2, int i) {
        this.f3932c.setNumericShortcut(c2, i);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        C0202q qVar;
        if (onActionExpandListener != null) {
            qVar = new C0202q(this, onActionExpandListener);
        } else {
            qVar = null;
        }
        this.f3932c.setOnActionExpandListener(qVar);
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        C0203r rVar;
        if (onMenuItemClickListener != null) {
            rVar = new C0203r(this, onMenuItemClickListener);
        } else {
            rVar = null;
        }
        this.f3932c.setOnMenuItemClickListener(rVar);
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f3932c.setShortcut(c2, c3, i, i2);
        return this;
    }

    public final void setShowAsAction(int i) {
        this.f3932c.setShowAsAction(i);
    }

    public final MenuItem setShowAsActionFlags(int i) {
        this.f3932c.setShowAsActionFlags(i);
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.f3932c.setTitle(i);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3932c.setTitleCondensed(charSequence);
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f3932c.setTooltipText(charSequence);
        return this;
    }

    public final MenuItem setVisible(boolean z2) {
        return this.f3932c.setVisible(z2);
    }

    public C0204s(Context context, a aVar) {
        super(context);
        if (aVar != null) {
            this.f3932c = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final MenuItem setActionView(int i) {
        a aVar = this.f3932c;
        aVar.setActionView(i);
        View actionView = aVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            aVar.setActionView(new C0201p(actionView));
        }
        return this;
    }
}
