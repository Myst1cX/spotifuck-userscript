package n;

import H.a;
import T0.g;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.LinearLayout;
import j0.C0160w;
import java.util.ArrayList;
import p0.C0320a;

/* renamed from: n.n  reason: case insensitive filesystem */
public final class C0199n implements a {

    /* renamed from: A  reason: collision with root package name */
    public C0200o f3897A;

    /* renamed from: B  reason: collision with root package name */
    public MenuItem.OnActionExpandListener f3898B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f3899C = false;

    /* renamed from: a  reason: collision with root package name */
    public final int f3900a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3901b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3902c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3903d;
    public CharSequence e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f3904f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f3905g;

    /* renamed from: h  reason: collision with root package name */
    public char f3906h;
    public int i = 4096;

    /* renamed from: j  reason: collision with root package name */
    public char f3907j;

    /* renamed from: k  reason: collision with root package name */
    public int f3908k = 4096;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f3909l;

    /* renamed from: m  reason: collision with root package name */
    public int f3910m = 0;

    /* renamed from: n  reason: collision with root package name */
    public final C0197l f3911n;

    /* renamed from: o  reason: collision with root package name */
    public C0185D f3912o;

    /* renamed from: p  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f3913p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f3914q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f3915r;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f3916s = null;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f3917t = null;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3918u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f3919v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f3920w = false;

    /* renamed from: x  reason: collision with root package name */
    public int f3921x = 16;

    /* renamed from: y  reason: collision with root package name */
    public int f3922y;

    /* renamed from: z  reason: collision with root package name */
    public View f3923z;

    public static void c(int i2, int i3, String str, StringBuilder sb) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final MenuItem setActionView(View view) {
        int i2;
        this.f3923z = view;
        this.f3897A = null;
        if (view != null && view.getId() == -1 && (i2 = this.f3900a) > 0) {
            view.setId(i2);
        }
        C0197l lVar = this.f3911n;
        lVar.f3880k = true;
        lVar.p(true);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f3907j == c2) {
            return this;
        }
        this.f3907j = Character.toLowerCase(c2);
        this.f3911n.p(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f3910m = 0;
        this.f3909l = drawable;
        this.f3920w = true;
        this.f3911n.p(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        if (this.f3906h == c2) {
            return this;
        }
        this.f3906h = c2;
        this.f3911n.p(false);
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.f3906h = c2;
        this.f3907j = Character.toLowerCase(c3);
        this.f3911n.p(false);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.f3911n.p(false);
        C0185D d2 = this.f3912o;
        if (d2 != null) {
            d2.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final C0200o a() {
        return this.f3897A;
    }

    public final a b(C0200o oVar) {
        C0200o oVar2 = this.f3897A;
        if (oVar2 != null) {
            oVar2.getClass();
        }
        this.f3923z = null;
        this.f3897A = oVar;
        this.f3911n.p(true);
        C0200o oVar3 = this.f3897A;
        if (oVar3 != null) {
            oVar3.f3924a = new C0160w(this);
            oVar3.f3925b.setVisibilityListener(oVar3);
        }
        return this;
    }

    public final boolean collapseActionView() {
        if ((this.f3922y & 8) == 0) {
            return false;
        }
        if (this.f3923z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3898B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f3911n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f3920w && (this.f3918u || this.f3919v)) {
            drawable = C0320a.J0(drawable).mutate();
            if (this.f3918u) {
                G.a.h(drawable, this.f3916s);
            }
            if (this.f3919v) {
                G.a.i(drawable, this.f3917t);
            }
            this.f3920w = false;
        }
        return drawable;
    }

    public final boolean e() {
        C0200o oVar;
        if ((this.f3922y & 8) == 0) {
            return false;
        }
        if (this.f3923z == null && (oVar = this.f3897A) != null) {
            this.f3923z = oVar.f3925b.onCreateActionView(this);
        }
        if (this.f3923z != null) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if ((this.f3921x & 32) == 32) {
            return true;
        }
        return false;
    }

    public final void g(boolean z2) {
        if (z2) {
            this.f3921x |= 32;
        } else {
            this.f3921x &= -33;
        }
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final View getActionView() {
        View view = this.f3923z;
        if (view != null) {
            return view;
        }
        C0200o oVar = this.f3897A;
        if (oVar == null) {
            return null;
        }
        View onCreateActionView = oVar.f3925b.onCreateActionView(this);
        this.f3923z = onCreateActionView;
        return onCreateActionView;
    }

    public final int getAlphabeticModifiers() {
        return this.f3908k;
    }

    public final char getAlphabeticShortcut() {
        return this.f3907j;
    }

    public final CharSequence getContentDescription() {
        return this.f3914q;
    }

    public final int getGroupId() {
        return this.f3901b;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.f3909l;
        if (drawable != null) {
            return d(drawable);
        }
        int i2 = this.f3910m;
        if (i2 == 0) {
            return null;
        }
        Drawable n2 = g.n(this.f3911n.f3872a, i2);
        this.f3910m = 0;
        this.f3909l = n2;
        return d(n2);
    }

    public final ColorStateList getIconTintList() {
        return this.f3916s;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f3917t;
    }

    public final Intent getIntent() {
        return this.f3905g;
    }

    public final int getItemId() {
        return this.f3900a;
    }

    public final int getNumericModifiers() {
        return this.i;
    }

    public final char getNumericShortcut() {
        return this.f3906h;
    }

    public final int getOrder() {
        return this.f3902c;
    }

    public final SubMenu getSubMenu() {
        return this.f3912o;
    }

    public final CharSequence getTitle() {
        return this.e;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3904f;
        if (charSequence != null) {
            return charSequence;
        }
        return this.e;
    }

    public final CharSequence getTooltipText() {
        return this.f3915r;
    }

    public final boolean hasSubMenu() {
        if (this.f3912o != null) {
            return true;
        }
        return false;
    }

    public final boolean isActionViewExpanded() {
        return this.f3899C;
    }

    public final boolean isCheckable() {
        if ((this.f3921x & 1) == 1) {
            return true;
        }
        return false;
    }

    public final boolean isChecked() {
        if ((this.f3921x & 2) == 2) {
            return true;
        }
        return false;
    }

    public final boolean isEnabled() {
        if ((this.f3921x & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isVisible() {
        C0200o oVar = this.f3897A;
        if (oVar == null || !oVar.f3925b.overridesItemVisibility()) {
            if ((this.f3921x & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f3921x & 8) != 0 || !this.f3897A.f3925b.isVisible()) {
            return false;
        } else {
            return true;
        }
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final MenuItem setCheckable(boolean z2) {
        int i2 = this.f3921x;
        boolean z3 = z2 | (i2 & true);
        this.f3921x = z3 ? 1 : 0;
        if (i2 != z3) {
            this.f3911n.p(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean z2) {
        boolean z3;
        int i2;
        int i3 = this.f3921x;
        int i4 = 2;
        if ((i3 & 4) != 0) {
            C0197l lVar = this.f3911n;
            lVar.getClass();
            ArrayList arrayList = lVar.f3876f;
            int size = arrayList.size();
            lVar.w();
            for (int i5 = 0; i5 < size; i5++) {
                C0199n nVar = (C0199n) arrayList.get(i5);
                if (nVar.f3901b == this.f3901b && (nVar.f3921x & 4) != 0 && nVar.isCheckable()) {
                    if (nVar == this) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int i6 = nVar.f3921x;
                    int i7 = i6 & -3;
                    if (z3) {
                        i2 = 2;
                    } else {
                        i2 = 0;
                    }
                    int i8 = i2 | i7;
                    nVar.f3921x = i8;
                    if (i6 != i8) {
                        nVar.f3911n.p(false);
                    }
                }
            }
            lVar.v();
        } else {
            int i9 = i3 & -3;
            if (!z2) {
                i4 = 0;
            }
            int i10 = i9 | i4;
            this.f3921x = i10;
            if (i3 != i10) {
                this.f3911n.p(false);
            }
        }
        return this;
    }

    public final a setContentDescription(CharSequence charSequence) {
        this.f3914q = charSequence;
        this.f3911n.p(false);
        return this;
    }

    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f3921x |= 16;
        } else {
            this.f3921x &= -17;
        }
        this.f3911n.p(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3916s = colorStateList;
        this.f3918u = true;
        this.f3920w = true;
        this.f3911n.p(false);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3917t = mode;
        this.f3919v = true;
        this.f3920w = true;
        this.f3911n.p(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f3905g = intent;
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3898B = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3913p = onMenuItemClickListener;
        return this;
    }

    public final void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 == 0 || i3 == 1 || i3 == 2) {
            this.f3922y = i2;
            C0197l lVar = this.f3911n;
            lVar.f3880k = true;
            lVar.p(true);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3904f = charSequence;
        this.f3911n.p(false);
        return this;
    }

    public final a setTooltipText(CharSequence charSequence) {
        this.f3915r = charSequence;
        this.f3911n.p(false);
        return this;
    }

    public final MenuItem setVisible(boolean z2) {
        int i2;
        int i3 = this.f3921x;
        int i4 = i3 & -9;
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        int i5 = i2 | i4;
        this.f3921x = i5;
        if (i3 != i5) {
            C0197l lVar = this.f3911n;
            lVar.f3878h = true;
            lVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public C0199n(C0197l lVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.f3911n = lVar;
        this.f3900a = i3;
        this.f3901b = i2;
        this.f3902c = i4;
        this.f3903d = i5;
        this.e = charSequence;
        this.f3922y = i6;
    }

    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f3898B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f3911n.f(this);
        }
        return false;
    }

    public final MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f3907j == c2 && this.f3908k == i2) {
            return this;
        }
        this.f3907j = Character.toLowerCase(c2);
        this.f3908k = KeyEvent.normalizeMetaState(i2);
        this.f3911n.p(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f3906h == c2 && this.i == i2) {
            return this;
        }
        this.f3906h = c2;
        this.i = KeyEvent.normalizeMetaState(i2);
        this.f3911n.p(false);
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f3906h = c2;
        this.i = KeyEvent.normalizeMetaState(i2);
        this.f3907j = Character.toLowerCase(c3);
        this.f3908k = KeyEvent.normalizeMetaState(i3);
        this.f3911n.p(false);
        return this;
    }

    public final MenuItem setIcon(int i2) {
        this.f3909l = null;
        this.f3910m = i2;
        this.f3920w = true;
        this.f3911n.p(false);
        return this;
    }

    public final MenuItem setTitle(int i2) {
        setTitle((CharSequence) this.f3911n.f3872a.getString(i2));
        return this;
    }

    public final MenuItem setActionView(int i2) {
        int i3;
        Context context = this.f3911n.f3872a;
        View inflate = LayoutInflater.from(context).inflate(i2, new LinearLayout(context), false);
        this.f3923z = inflate;
        this.f3897A = null;
        if (inflate != null && inflate.getId() == -1 && (i3 = this.f3900a) > 0) {
            inflate.setId(i3);
        }
        C0197l lVar = this.f3911n;
        lVar.f3880k = true;
        lVar.p(true);
        return this;
    }
}
