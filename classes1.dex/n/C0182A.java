package n;

import H.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.fragment.app.C0053g;
import r.k;

/* renamed from: n.A  reason: case insensitive filesystem */
public class C0182A extends C0053g implements Menu {

    /* renamed from: c  reason: collision with root package name */
    public final C0197l f3793c;

    public final MenuItem add(CharSequence charSequence) {
        return g(this.f3793c.a(0, 0, 0, charSequence));
    }

    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        MenuItem[] menuItemArr3 = menuItemArr;
        if (menuItemArr3 != null) {
            menuItemArr2 = new MenuItem[menuItemArr3.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = this.f3793c.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr3[i5] = g(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f3793c.addSubMenu(0, 0, 0, charSequence);
    }

    public final void clear() {
        k kVar = (k) this.f1695b;
        if (kVar != null) {
            kVar.clear();
        }
        this.f3793c.clear();
    }

    public final void close() {
        this.f3793c.close();
    }

    public final MenuItem findItem(int i) {
        return g(this.f3793c.findItem(i));
    }

    public final MenuItem getItem(int i) {
        return g(this.f3793c.getItem(i));
    }

    public final boolean hasVisibleItems() {
        return this.f3793c.hasVisibleItems();
    }

    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f3793c.isShortcutKey(i, keyEvent);
    }

    public final boolean performIdentifierAction(int i, int i2) {
        return this.f3793c.performIdentifierAction(i, i2);
    }

    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f3793c.performShortcut(i, keyEvent, i2);
    }

    public final void removeGroup(int i) {
        if (((k) this.f1695b) != null) {
            int i2 = 0;
            while (true) {
                k kVar = (k) this.f1695b;
                if (i2 >= kVar.f4550c) {
                    break;
                }
                if (((a) kVar.h(i2)).getGroupId() == i) {
                    ((k) this.f1695b).i(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f3793c.removeGroup(i);
    }

    public final void removeItem(int i) {
        if (((k) this.f1695b) != null) {
            int i2 = 0;
            while (true) {
                k kVar = (k) this.f1695b;
                if (i2 >= kVar.f4550c) {
                    break;
                } else if (((a) kVar.h(i2)).getItemId() == i) {
                    ((k) this.f1695b).i(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.f3793c.removeItem(i);
    }

    public final void setGroupCheckable(int i, boolean z2, boolean z3) {
        this.f3793c.setGroupCheckable(i, z2, z3);
    }

    public final void setGroupEnabled(int i, boolean z2) {
        this.f3793c.setGroupEnabled(i, z2);
    }

    public final void setGroupVisible(int i, boolean z2) {
        this.f3793c.setGroupVisible(i, z2);
    }

    public final void setQwertyMode(boolean z2) {
        this.f3793c.setQwertyMode(z2);
    }

    public final int size() {
        return this.f3793c.size();
    }

    public C0182A(Context context, C0197l lVar) {
        super(context);
        if (lVar != null) {
            this.f3793c = lVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final SubMenu addSubMenu(int i) {
        return this.f3793c.addSubMenu(i);
    }

    public final MenuItem add(int i) {
        return g(this.f3793c.add(i));
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.f3793c.addSubMenu(i, i2, i3, charSequence);
    }

    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return g(this.f3793c.a(i, i2, i3, charSequence));
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.f3793c.addSubMenu(i, i2, i3, i4);
    }

    public final MenuItem add(int i, int i2, int i3, int i4) {
        return g(this.f3793c.add(i, i2, i3, i4));
    }
}
