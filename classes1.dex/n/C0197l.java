package n;

import D.a;
import N.T;
import N.V;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: n.l  reason: case insensitive filesystem */
public class C0197l implements Menu {

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f3871y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f3872a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f3873b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3874c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3875d;
    public C0195j e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f3876f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f3877g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3878h;
    public final ArrayList i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f3879j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3880k;

    /* renamed from: l  reason: collision with root package name */
    public int f3881l = 0;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f3882m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f3883n;

    /* renamed from: o  reason: collision with root package name */
    public View f3884o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3885p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3886q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f3887r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f3888s = false;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList f3889t = new ArrayList();

    /* renamed from: u  reason: collision with root package name */
    public final CopyOnWriteArrayList f3890u = new CopyOnWriteArrayList();

    /* renamed from: v  reason: collision with root package name */
    public C0199n f3891v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f3892w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f3893x;

    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void clearHeader() {
        this.f3883n = null;
        this.f3882m = null;
        this.f3884o = null;
        p(false);
    }

    public final void close() {
        c(true);
    }

    public final void u(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        if (view != null) {
            this.f3884o = view;
            this.f3882m = null;
            this.f3883n = null;
        } else {
            if (i2 > 0) {
                this.f3882m = this.f3873b.getText(i2);
            } else if (charSequence != null) {
                this.f3882m = charSequence;
            }
            if (i3 > 0) {
                this.f3883n = a.b(this.f3872a, i3);
            } else if (drawable != null) {
                this.f3883n = drawable;
            }
            this.f3884o = null;
        }
        p(false);
    }

    public final void v() {
        this.f3885p = false;
        if (this.f3886q) {
            this.f3886q = false;
            p(this.f3887r);
        }
    }

    public final C0199n a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = (-65536 & i4) >> 16;
        if (i6 < 0 || i6 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i7 = (f3871y[i6] << 16) | (65535 & i4);
        C0199n nVar = new C0199n(this, i2, i3, i4, i7, charSequence, this.f3881l);
        ArrayList arrayList = this.f3876f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i5 = 0;
                break;
            } else if (((C0199n) arrayList.get(size)).f3903d <= i7) {
                i5 = size + 1;
                break;
            } else {
                size--;
            }
        }
        arrayList.add(i5, nVar);
        p(true);
        return nVar;
    }

    public final MenuItem add(int i2) {
        return a(0, 0, 0, this.f3873b.getString(i2));
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [android.view.MenuItem[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int addIntentOptions(int r8, int r9, int r10, android.content.ComponentName r11, android.content.Intent[] r12, android.content.Intent r13, int r14, android.view.MenuItem[] r15) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f3872a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            java.util.List r11 = r0.queryIntentActivityOptions(r11, r12, r13, r1)
            if (r11 == 0) goto L_0x0012
            int r2 = r11.size()
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r14 = r14 & 1
            if (r14 != 0) goto L_0x001a
            r7.removeGroup(r8)
        L_0x001a:
            if (r1 >= r2) goto L_0x005b
            java.lang.Object r14 = r11.get(r1)
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14
            android.content.Intent r3 = new android.content.Intent
            int r4 = r14.specificIndex
            if (r4 >= 0) goto L_0x002a
            r4 = r13
            goto L_0x002c
        L_0x002a:
            r4 = r12[r4]
        L_0x002c:
            r3.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.pm.ActivityInfo r5 = r14.activityInfo
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo
            java.lang.String r6 = r6.packageName
            java.lang.String r5 = r5.name
            r4.<init>(r6, r5)
            r3.setComponent(r4)
            java.lang.CharSequence r4 = r14.loadLabel(r0)
            n.n r4 = r7.a(r8, r9, r10, r4)
            android.graphics.drawable.Drawable r5 = r14.loadIcon(r0)
            r4.setIcon((android.graphics.drawable.Drawable) r5)
            r4.f3905g = r3
            if (r15 == 0) goto L_0x0058
            int r14 = r14.specificIndex
            if (r14 < 0) goto L_0x0058
            r15[r14] = r4
        L_0x0058:
            int r1 = r1 + 1
            goto L_0x001a
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0197l.addIntentOptions(int, int, int, android.content.ComponentName, android.content.Intent[], android.content.Intent, int, android.view.MenuItem[]):int");
    }

    public final SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f3873b.getString(i2));
    }

    public final void b(C0209x xVar, Context context) {
        this.f3890u.add(new WeakReference(xVar));
        xVar.f(context, this);
        this.f3880k = true;
    }

    public final void c(boolean z2) {
        if (!this.f3888s) {
            this.f3888s = true;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f3890u;
            Iterator it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                WeakReference weakReference = (WeakReference) it2.next();
                C0209x xVar = (C0209x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    xVar.b(this, z2);
                }
            }
            this.f3888s = false;
        }
    }

    public final void clear() {
        C0199n nVar = this.f3891v;
        if (nVar != null) {
            d(nVar);
        }
        this.f3876f.clear();
        p(true);
    }

    public boolean d(C0199n nVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3890u;
        boolean z2 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f3891v == nVar) {
            w();
            Iterator it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                WeakReference weakReference = (WeakReference) it2.next();
                C0209x xVar = (C0209x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 = xVar.k(nVar);
                    if (z2) {
                        break;
                    }
                }
            }
            v();
            if (z2) {
                this.f3891v = null;
            }
        }
        return z2;
    }

    public boolean e(C0197l lVar, MenuItem menuItem) {
        C0195j jVar = this.e;
        if (jVar == null || !jVar.d(lVar, menuItem)) {
            return false;
        }
        return true;
    }

    public boolean f(C0199n nVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3890u;
        boolean z2 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            WeakReference weakReference = (WeakReference) it2.next();
            C0209x xVar = (C0209x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z2 = xVar.d(nVar);
                if (z2) {
                    break;
                }
            }
        }
        v();
        if (z2) {
            this.f3891v = nVar;
        }
        return z2;
    }

    public final MenuItem findItem(int i2) {
        MenuItem findItem;
        ArrayList arrayList = this.f3876f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0199n nVar = (C0199n) arrayList.get(i3);
            if (nVar.f3900a == i2) {
                return nVar;
            }
            if (nVar.hasSubMenu() && (findItem = nVar.f3912o.findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final C0199n g(int i2, KeyEvent keyEvent) {
        char c2;
        ArrayList arrayList = this.f3889t;
        arrayList.clear();
        h(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0199n) arrayList.get(0);
        }
        boolean n2 = n();
        for (int i3 = 0; i3 < size; i3++) {
            C0199n nVar = (C0199n) arrayList.get(i3);
            if (n2) {
                c2 = nVar.f3907j;
            } else {
                c2 = nVar.f3906h;
            }
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (n2 && c2 == 8 && i2 == 67))) {
                return nVar;
            }
        }
        return null;
    }

    public final MenuItem getItem(int i2) {
        return (MenuItem) this.f3876f.get(i2);
    }

    public final void h(ArrayList arrayList, int i2, KeyEvent keyEvent) {
        char c2;
        int i3;
        ArrayList arrayList2 = arrayList;
        int i4 = i2;
        KeyEvent keyEvent2 = keyEvent;
        boolean n2 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent2.getKeyData(keyData) || i4 == 67) {
            ArrayList arrayList3 = this.f3876f;
            int size = arrayList3.size();
            for (int i5 = 0; i5 < size; i5++) {
                C0199n nVar = (C0199n) arrayList3.get(i5);
                if (nVar.hasSubMenu()) {
                    nVar.f3912o.h(arrayList2, i4, keyEvent2);
                }
                if (n2) {
                    c2 = nVar.f3907j;
                } else {
                    c2 = nVar.f3906h;
                }
                if (n2) {
                    i3 = nVar.f3908k;
                } else {
                    i3 = nVar.i;
                }
                if ((modifiers & 69647) == (i3 & 69647) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if (c2 != cArr[0] && c2 != cArr[2]) {
                        if (n2 && c2 == 8) {
                            if (i4 != 67) {
                            }
                        }
                    }
                    if (nVar.isEnabled()) {
                        arrayList2.add(nVar);
                    }
                }
            }
        }
    }

    public final boolean hasVisibleItems() {
        if (this.f3893x) {
            return true;
        }
        ArrayList arrayList = this.f3876f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C0199n) arrayList.get(i2)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public C0197l k() {
        return this;
    }

    public final ArrayList l() {
        boolean z2 = this.f3878h;
        ArrayList arrayList = this.f3877g;
        if (!z2) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f3876f;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0199n nVar = (C0199n) arrayList2.get(i2);
            if (nVar.isVisible()) {
                arrayList.add(nVar);
            }
        }
        this.f3878h = false;
        this.f3880k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f3892w;
    }

    public boolean n() {
        return this.f3874c;
    }

    public boolean o() {
        return this.f3875d;
    }

    public final void p(boolean z2) {
        if (!this.f3885p) {
            if (z2) {
                this.f3878h = true;
                this.f3880k = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f3890u;
            if (!copyOnWriteArrayList.isEmpty()) {
                w();
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    WeakReference weakReference = (WeakReference) it2.next();
                    C0209x xVar = (C0209x) weakReference.get();
                    if (xVar == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        xVar.c();
                    }
                }
                v();
                return;
            }
            return;
        }
        this.f3886q = true;
        if (z2) {
            this.f3887r = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q(android.view.MenuItem r7, n.C0209x r8, int r9) {
        /*
            r6 = this;
            n.n r7 = (n.C0199n) r7
            r0 = 0
            if (r7 == 0) goto L_0x00d7
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000d
            goto L_0x00d7
        L_0x000d:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f3913p
            r2 = 1
            if (r1 == 0) goto L_0x001a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L_0x001a
        L_0x0018:
            r1 = 1
            goto L_0x0043
        L_0x001a:
            n.l r1 = r7.f3911n
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L_0x0023
            goto L_0x0018
        L_0x0023:
            android.content.Intent r3 = r7.f3905g
            if (r3 == 0) goto L_0x0035
            android.content.Context r1 = r1.f3872a     // Catch:{ ActivityNotFoundException -> 0x002d }
            r1.startActivity(r3)     // Catch:{ ActivityNotFoundException -> 0x002d }
            goto L_0x0018
        L_0x002d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L_0x0035:
            n.o r1 = r7.f3897A
            if (r1 == 0) goto L_0x0042
            android.view.ActionProvider r1 = r1.f3925b
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L_0x0042
            goto L_0x0018
        L_0x0042:
            r1 = 0
        L_0x0043:
            n.o r3 = r7.f3897A
            if (r3 == 0) goto L_0x0051
            android.view.ActionProvider r4 = r3.f3925b
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L_0x0051
            r4 = 1
            goto L_0x0052
        L_0x0051:
            r4 = 0
        L_0x0052:
            boolean r5 = r7.e()
            if (r5 == 0) goto L_0x0064
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x00d6
            r6.c(r2)
            goto L_0x00d6
        L_0x0064:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x0075
            if (r4 == 0) goto L_0x006d
            goto L_0x0075
        L_0x006d:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x00d6
            r6.c(r2)
            goto L_0x00d6
        L_0x0075:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x007c
            r6.c(r0)
        L_0x007c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0090
            n.D r9 = new n.D
            android.content.Context r5 = r6.f3872a
            r9.<init>(r5, r6, r7)
            r7.f3912o = r9
            java.lang.CharSequence r5 = r7.e
            r9.setHeaderTitle((java.lang.CharSequence) r5)
        L_0x0090:
            n.D r7 = r7.f3912o
            if (r4 == 0) goto L_0x009e
            n.s r9 = r3.f3926c
            r9.getClass()
            android.view.ActionProvider r9 = r3.f3925b
            r9.onPrepareSubMenu(r7)
        L_0x009e:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f3890u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L_0x00a7
            goto L_0x00d0
        L_0x00a7:
            if (r8 == 0) goto L_0x00ad
            boolean r0 = r8.g(r7)
        L_0x00ad:
            java.util.Iterator r8 = r9.iterator()
        L_0x00b1:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x00d0
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            n.x r4 = (n.C0209x) r4
            if (r4 != 0) goto L_0x00c9
            r9.remove(r3)
            goto L_0x00b1
        L_0x00c9:
            if (r0 != 0) goto L_0x00b1
            boolean r0 = r4.g(r7)
            goto L_0x00b1
        L_0x00d0:
            r1 = r1 | r0
            if (r1 != 0) goto L_0x00d6
            r6.c(r2)
        L_0x00d6:
            return r1
        L_0x00d7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0197l.q(android.view.MenuItem, n.x, int):boolean");
    }

    public final void r(C0209x xVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f3890u;
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            WeakReference weakReference = (WeakReference) it2.next();
            C0209x xVar2 = (C0209x) weakReference.get();
            if (xVar2 == null || xVar2 == xVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public final void removeGroup(int i2) {
        ArrayList arrayList = this.f3876f;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            } else if (((C0199n) arrayList.get(i4)).f3901b == i2) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 >= 0) {
            int size2 = arrayList.size() - i4;
            while (true) {
                int i5 = i3 + 1;
                if (i3 >= size2 || ((C0199n) arrayList.get(i4)).f3901b != i2) {
                    p(true);
                } else {
                    if (i4 >= 0) {
                        ArrayList arrayList2 = this.f3876f;
                        if (i4 < arrayList2.size()) {
                            arrayList2.remove(i4);
                        }
                    }
                    i3 = i5;
                }
            }
            p(true);
        }
    }

    public final void removeItem(int i2) {
        ArrayList arrayList = this.f3876f;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C0199n) arrayList.get(i3)).f3900a == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            ArrayList arrayList2 = this.f3876f;
            if (i3 < arrayList2.size()) {
                arrayList2.remove(i3);
                p(true);
            }
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(j());
            int size = this.f3876f.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = getItem(i2);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0185D) item.getSubMenu()).s(bundle);
                }
            }
            int i3 = bundle.getInt("android:menu:expandedactionview");
            if (i3 > 0 && (findItem = findItem(i3)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public final void setGroupCheckable(int i2, boolean z2, boolean z3) {
        int i3;
        ArrayList arrayList = this.f3876f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0199n nVar = (C0199n) arrayList.get(i4);
            if (nVar.f3901b == i2) {
                int i5 = nVar.f3921x & -5;
                if (z3) {
                    i3 = 4;
                } else {
                    i3 = 0;
                }
                nVar.f3921x = i5 | i3;
                nVar.setCheckable(z2);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z2) {
        this.f3892w = z2;
    }

    public final void setGroupEnabled(int i2, boolean z2) {
        ArrayList arrayList = this.f3876f;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0199n nVar = (C0199n) arrayList.get(i3);
            if (nVar.f3901b == i2) {
                nVar.setEnabled(z2);
            }
        }
    }

    public final void setGroupVisible(int i2, boolean z2) {
        int i3;
        ArrayList arrayList = this.f3876f;
        int size = arrayList.size();
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            C0199n nVar = (C0199n) arrayList.get(i4);
            if (nVar.f3901b == i2) {
                int i5 = nVar.f3921x;
                int i6 = i5 & -9;
                if (z2) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                int i7 = i6 | i3;
                nVar.f3921x = i7;
                if (i5 != i7) {
                    z3 = true;
                }
            }
        }
        if (z3) {
            p(true);
        }
    }

    public void setQwertyMode(boolean z2) {
        this.f3874c = z2;
        p(false);
    }

    public final int size() {
        return this.f3876f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f3876f.size();
        SparseArray sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0185D) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void w() {
        if (!this.f3885p) {
            this.f3885p = true;
            this.f3886q = false;
            this.f3887r = false;
        }
    }

    public C0197l(Context context) {
        boolean z2;
        boolean z3 = false;
        this.f3872a = context;
        Resources resources = context.getResources();
        this.f3873b = resources;
        this.f3876f = new ArrayList();
        this.f3877g = new ArrayList();
        this.f3878h = true;
        this.i = new ArrayList();
        this.f3879j = new ArrayList();
        this.f3880k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = V.f515a;
            if (Build.VERSION.SDK_INT >= 28) {
                z2 = T.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier == 0 || !resources2.getBoolean(identifier)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            }
            if (z2) {
                z3 = true;
            }
        }
        this.f3875d = z3;
    }

    public final MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        C0199n a2 = a(i2, i3, i4, charSequence);
        C0185D d2 = new C0185D(this.f3872a, this, a2);
        a2.f3912o = d2;
        d2.setHeaderTitle(a2.e);
        return d2;
    }

    public final void i() {
        ArrayList l2 = l();
        if (this.f3880k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f3890u;
            Iterator it2 = copyOnWriteArrayList.iterator();
            boolean z2 = false;
            while (it2.hasNext()) {
                WeakReference weakReference = (WeakReference) it2.next();
                C0209x xVar = (C0209x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z2 |= xVar.h();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.f3879j;
            if (z2) {
                arrayList.clear();
                arrayList2.clear();
                int size = l2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C0199n nVar = (C0199n) l2.get(i2);
                    if (nVar.f()) {
                        arrayList.add(nVar);
                    } else {
                        arrayList2.add(nVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f3880k = false;
        }
    }

    public final boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        if (g(i2, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public final boolean performIdentifierAction(int i2, int i3) {
        return q(findItem(i2), (C0209x) null, i3);
    }

    public final boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        boolean z2;
        C0199n g2 = g(i2, keyEvent);
        if (g2 != null) {
            z2 = q(g2, (C0209x) null, i3);
        } else {
            z2 = false;
        }
        if ((i3 & 2) != 0) {
            c(true);
        }
        return z2;
    }

    public final MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.f3873b.getString(i5));
    }

    public final SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, (CharSequence) this.f3873b.getString(i5));
    }
}
