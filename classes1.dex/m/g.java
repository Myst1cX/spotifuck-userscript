package m;

import H.a;
import N.C0013m;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import n.C0199n;
import n.C0200o;
import n.C0204s;

public final class g {

    /* renamed from: A  reason: collision with root package name */
    public CharSequence f3627A;

    /* renamed from: B  reason: collision with root package name */
    public CharSequence f3628B;

    /* renamed from: C  reason: collision with root package name */
    public ColorStateList f3629C = null;

    /* renamed from: D  reason: collision with root package name */
    public PorterDuff.Mode f3630D = null;

    /* renamed from: E  reason: collision with root package name */
    public final /* synthetic */ h f3631E;

    /* renamed from: a  reason: collision with root package name */
    public final Menu f3632a;

    /* renamed from: b  reason: collision with root package name */
    public int f3633b;

    /* renamed from: c  reason: collision with root package name */
    public int f3634c;

    /* renamed from: d  reason: collision with root package name */
    public int f3635d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3636f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3637g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3638h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public int f3639j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f3640k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f3641l;

    /* renamed from: m  reason: collision with root package name */
    public int f3642m;

    /* renamed from: n  reason: collision with root package name */
    public char f3643n;

    /* renamed from: o  reason: collision with root package name */
    public int f3644o;

    /* renamed from: p  reason: collision with root package name */
    public char f3645p;

    /* renamed from: q  reason: collision with root package name */
    public int f3646q;

    /* renamed from: r  reason: collision with root package name */
    public int f3647r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f3648s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3649t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3650u;

    /* renamed from: v  reason: collision with root package name */
    public int f3651v;

    /* renamed from: w  reason: collision with root package name */
    public int f3652w;

    /* renamed from: x  reason: collision with root package name */
    public String f3653x;

    /* renamed from: y  reason: collision with root package name */
    public String f3654y;

    /* renamed from: z  reason: collision with root package name */
    public C0200o f3655z;

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f3631E.f3659c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v33, types: [android.view.MenuItem$OnMenuItemClickListener, m.f, java.lang.Object] */
    public final void b(MenuItem menuItem) {
        boolean z2;
        MenuItem enabled = menuItem.setChecked(this.f3648s).setVisible(this.f3649t).setEnabled(this.f3650u);
        boolean z3 = false;
        if (this.f3647r >= 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        enabled.setCheckable(z2).setTitleCondensed(this.f3641l).setIcon(this.f3642m);
        int i2 = this.f3651v;
        if (i2 >= 0) {
            menuItem.setShowAsAction(i2);
        }
        String str = this.f3654y;
        h hVar = this.f3631E;
        if (str != null) {
            if (!hVar.f3659c.isRestricted()) {
                if (hVar.f3660d == null) {
                    hVar.f3660d = h.a(hVar.f3659c);
                }
                Object obj = hVar.f3660d;
                String str2 = this.f3654y;
                ? obj2 = new Object();
                obj2.f3625f = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f3626g = cls.getMethod(str2, f.f3624h);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e2) {
                    InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                    inflateException.initCause(e2);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f3647r >= 2) {
            if (menuItem instanceof C0199n) {
                C0199n nVar = (C0199n) menuItem;
                nVar.f3921x = (nVar.f3921x & -5) | 4;
            } else if (menuItem instanceof C0204s) {
                C0204s sVar = (C0204s) menuItem;
                try {
                    Method method = sVar.f3933d;
                    a aVar = sVar.f3932c;
                    if (method == null) {
                        sVar.f3933d = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                    }
                    sVar.f3933d.invoke(aVar, new Object[]{Boolean.TRUE});
                } catch (Exception e3) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e3);
                }
            }
        }
        String str3 = this.f3653x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, h.e, hVar.f3657a));
            z3 = true;
        }
        int i3 = this.f3652w;
        if (i3 > 0) {
            if (!z3) {
                menuItem.setActionView(i3);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        C0200o oVar = this.f3655z;
        if (oVar != null) {
            if (menuItem instanceof a) {
                ((a) menuItem).b(oVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f3627A;
        boolean z4 = menuItem instanceof a;
        if (z4) {
            ((a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0013m.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f3628B;
        if (z4) {
            ((a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0013m.m(menuItem, charSequence2);
        }
        char c2 = this.f3643n;
        int i4 = this.f3644o;
        if (z4) {
            ((a) menuItem).setAlphabeticShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0013m.g(menuItem, c2, i4);
        }
        char c3 = this.f3645p;
        int i5 = this.f3646q;
        if (z4) {
            ((a) menuItem).setNumericShortcut(c3, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0013m.k(menuItem, c3, i5);
        }
        PorterDuff.Mode mode = this.f3630D;
        if (mode != null) {
            if (z4) {
                ((a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C0013m.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f3629C;
        if (colorStateList == null) {
            return;
        }
        if (z4) {
            ((a) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C0013m.i(menuItem, colorStateList);
        }
    }

    public g(h hVar, Menu menu) {
        this.f3631E = hVar;
        this.f3632a = menu;
        this.f3633b = 0;
        this.f3634c = 0;
        this.f3635d = 0;
        this.e = 0;
        this.f3636f = true;
        this.f3637g = true;
    }
}
