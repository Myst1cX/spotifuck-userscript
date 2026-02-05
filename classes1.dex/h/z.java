package h;

import E.j;
import N.D;
import N.Q;
import N.Z;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import m.C0174a;
import m.C0176c;
import m.e;
import m.l;
import m.m;
import n.C0197l;
import p0.C0320a;
import r.k;

public final class z implements Window.Callback {

    /* renamed from: f  reason: collision with root package name */
    public final Window.Callback f3042f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3043g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3044h;
    public boolean i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ D f3045j;

    /* JADX INFO: finally extract failed */
    public final void a(Window.Callback callback) {
        try {
            this.f3043g = true;
            callback.onContentChanged();
            this.f3043g = false;
        } catch (Throwable th) {
            this.f3043g = false;
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, A.k] */
    /* JADX WARNING: type inference failed for: r4v10, types: [m.a, m.d, java.lang.Object, n.j] */
    public final e e(ActionMode.Callback callback) {
        boolean z2;
        ViewGroup viewGroup;
        Context context;
        D d2 = this.f3045j;
        Context context2 = d2.f2889p;
        ? obj = new Object();
        obj.i = context2;
        obj.f21f = callback;
        obj.f23h = new ArrayList();
        obj.f22g = new k();
        C0174a aVar = d2.f2899z;
        if (aVar != null) {
            aVar.a();
        }
        j jVar = new j(d2, obj, 14, false);
        d2.z();
        N n2 = d2.f2893t;
        if (n2 != null) {
            M m2 = n2.f2942t;
            if (m2 != null) {
                m2.a();
            }
            n2.f2936n.setHideOnContentScrollEnabled(false);
            n2.f2939q.e();
            M m3 = new M(n2, n2.f2939q.getContext(), jVar);
            C0197l lVar = m3.i;
            lVar.w();
            try {
                if (((A.k) m3.f2921j.f108g).q(m3, lVar)) {
                    n2.f2942t = m3;
                    m3.i();
                    n2.f2939q.c(m3);
                    n2.V(true);
                } else {
                    m3 = null;
                }
                d2.f2899z = m3;
            } finally {
                lVar.v();
            }
        }
        if (d2.f2899z == null) {
            Z z3 = d2.f2854D;
            if (z3 != null) {
                z3.b();
            }
            C0174a aVar2 = d2.f2899z;
            if (aVar2 != null) {
                aVar2.a();
            }
            if (d2.f2851A == null) {
                boolean z4 = d2.f2864O;
                Context context3 = d2.f2889p;
                if (z4) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context3.getTheme();
                    theme.resolveAttribute(2130968587, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context3.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        C0176c cVar = new C0176c(context3, 0);
                        cVar.getTheme().setTo(newTheme);
                        context3 = cVar;
                    }
                    d2.f2851A = new ActionBarContextView(context3, (AttributeSet) null);
                    PopupWindow popupWindow = new PopupWindow(context3, (AttributeSet) null, 2130968602);
                    d2.f2852B = popupWindow;
                    C0320a.E0(popupWindow, 2);
                    d2.f2852B.setContentView(d2.f2851A);
                    d2.f2852B.setWidth(-1);
                    context3.getTheme().resolveAttribute(2130968581, typedValue, true);
                    d2.f2851A.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context3.getResources().getDisplayMetrics()));
                    d2.f2852B.setHeight(-2);
                    d2.f2853C = new t(d2, 1);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) d2.f2857G.findViewById(2131296323);
                    if (viewStubCompat != null) {
                        d2.z();
                        N n3 = d2.f2893t;
                        if (n3 != null) {
                            context = n3.W();
                        } else {
                            context = null;
                        }
                        if (context != null) {
                            context3 = context;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context3));
                        d2.f2851A = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (d2.f2851A != null) {
                Z z5 = d2.f2854D;
                if (z5 != null) {
                    z5.b();
                }
                d2.f2851A.e();
                Context context4 = d2.f2851A.getContext();
                ActionBarContextView actionBarContextView = d2.f2851A;
                ? obj2 = new Object();
                obj2.f3617h = context4;
                obj2.i = actionBarContextView;
                obj2.f3618j = jVar;
                C0197l lVar2 = new C0197l(actionBarContextView.getContext());
                lVar2.f3881l = 1;
                obj2.f3621m = lVar2;
                lVar2.e = obj2;
                if (((A.k) jVar.f108g).q(obj2, lVar2)) {
                    obj2.i();
                    d2.f2851A.c(obj2);
                    d2.f2899z = obj2;
                    if (!d2.f2856F || (viewGroup = d2.f2857G) == null || !viewGroup.isLaidOut()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        d2.f2851A.setAlpha(0.0f);
                        Z a2 = Q.a(d2.f2851A);
                        a2.a(1.0f);
                        d2.f2854D = a2;
                        a2.d(new v(1, d2));
                    } else {
                        d2.f2851A.setAlpha(1.0f);
                        d2.f2851A.setVisibility(0);
                        if (d2.f2851A.getParent() instanceof View) {
                            WeakHashMap weakHashMap = Q.f509a;
                            D.c((View) d2.f2851A.getParent());
                        }
                    }
                    if (d2.f2852B != null) {
                        d2.f2890q.getDecorView().post(d2.f2853C);
                    }
                } else {
                    d2.f2899z = null;
                }
            }
            d2.H();
            d2.f2899z = d2.f2899z;
        }
        d2.H();
        C0174a aVar3 = d2.f2899z;
        if (aVar3 != null) {
            return obj.f(aVar3);
        }
        return null;
    }

    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i2) {
        C0197l lVar = this.f3045j.y(0).f2840h;
        if (lVar != null) {
            d(list, lVar, i2);
        } else {
            d(list, menu, i2);
        }
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return m.k.a(this.f3042f, searchEvent);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
        if (!this.f3045j.f2855E || i2 != 0) {
            return m.k.b(this.f3042f, callback, i2);
        }
        return e(callback);
    }

    public final boolean b(int i2, Menu menu) {
        return this.f3042f.onMenuOpened(i2, menu);
    }

    public final void c(int i2, Menu menu) {
        this.f3042f.onPanelClosed(i2, menu);
    }

    public final void d(List list, Menu menu, int i2) {
        l.a(this.f3042f, list, menu, i2);
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f3042f.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f3044h;
        Window.Callback callback = this.f3042f;
        if (z2) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        if (this.f3045j.s(keyEvent) || callback.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r0 != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        if (r7 != false) goto L_0x003b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.view.Window$Callback r0 = r6.f3042f
            boolean r0 = r0.dispatchKeyShortcutEvent(r7)
            r1 = 1
            if (r0 != 0) goto L_0x006f
            int r0 = r7.getKeyCode()
            h.D r2 = r6.f3045j
            r2.z()
            h.N r3 = r2.f2893t
            r4 = 0
            if (r3 == 0) goto L_0x003d
            h.M r3 = r3.f2942t
            if (r3 != 0) goto L_0x001d
        L_0x001b:
            r0 = 0
            goto L_0x0039
        L_0x001d:
            n.l r3 = r3.i
            if (r3 == 0) goto L_0x001b
            int r5 = r7.getDeviceId()
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L_0x0031
            r5 = 1
            goto L_0x0032
        L_0x0031:
            r5 = 0
        L_0x0032:
            r3.setQwertyMode(r5)
            boolean r0 = r3.performShortcut(r0, r7, r4)
        L_0x0039:
            if (r0 == 0) goto L_0x003d
        L_0x003b:
            r7 = 1
            goto L_0x006b
        L_0x003d:
            h.C r0 = r2.f2868S
            if (r0 == 0) goto L_0x0052
            int r3 = r7.getKeyCode()
            boolean r0 = r2.E(r0, r3, r7)
            if (r0 == 0) goto L_0x0052
            h.C r7 = r2.f2868S
            if (r7 == 0) goto L_0x003b
            r7.f2843l = r1
            goto L_0x003b
        L_0x0052:
            h.C r0 = r2.f2868S
            if (r0 != 0) goto L_0x006a
            h.C r0 = r2.y(r4)
            r2.F(r0, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r2.E(r0, r3, r7)
            r0.f2842k = r4
            if (r7 == 0) goto L_0x006a
            goto L_0x003b
        L_0x006a:
            r7 = 0
        L_0x006b:
            if (r7 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r1 = 0
        L_0x006f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h.z.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f3042f.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f3042f.dispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f3042f.dispatchTrackballEvent(motionEvent);
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        this.f3042f.onActionModeFinished(actionMode);
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        this.f3042f.onActionModeStarted(actionMode);
    }

    public final void onAttachedToWindow() {
        this.f3042f.onAttachedToWindow();
    }

    public final void onContentChanged() {
        if (this.f3043g) {
            this.f3042f.onContentChanged();
        }
    }

    public final boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0 || (menu instanceof C0197l)) {
            return this.f3042f.onCreatePanelMenu(i2, menu);
        }
        return false;
    }

    public final View onCreatePanelView(int i2) {
        return this.f3042f.onCreatePanelView(i2);
    }

    public final void onDetachedFromWindow() {
        this.f3042f.onDetachedFromWindow();
    }

    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        return this.f3042f.onMenuItemSelected(i2, menuItem);
    }

    public final void onPanelClosed(int i2, Menu menu) {
        if (this.i) {
            this.f3042f.onPanelClosed(i2, menu);
            return;
        }
        c(i2, menu);
        D d2 = this.f3045j;
        if (i2 == 108) {
            d2.z();
            N n2 = d2.f2893t;
            if (n2 != null && n2.f2945w) {
                n2.f2945w = false;
                ArrayList arrayList = n2.f2946x;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        } else if (i2 == 0) {
            C y2 = d2.y(i2);
            if (y2.f2844m) {
                d2.q(y2, false);
            }
        } else {
            d2.getClass();
        }
    }

    public final void onPointerCaptureChanged(boolean z2) {
        m.a(this.f3042f, z2);
    }

    public final boolean onPreparePanel(int i2, View view, Menu menu) {
        C0197l lVar;
        if (menu instanceof C0197l) {
            lVar = (C0197l) menu;
        } else {
            lVar = null;
        }
        if (i2 == 0 && lVar == null) {
            return false;
        }
        if (lVar != null) {
            lVar.f3893x = true;
        }
        boolean onPreparePanel = this.f3042f.onPreparePanel(i2, view, menu);
        if (lVar != null) {
            lVar.f3893x = false;
        }
        return onPreparePanel;
    }

    public final boolean onSearchRequested() {
        return this.f3042f.onSearchRequested();
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f3042f.onWindowAttributesChanged(layoutParams);
    }

    public final void onWindowFocusChanged(boolean z2) {
        this.f3042f.onWindowFocusChanged(z2);
    }

    public z(D d2, Window.Callback callback) {
        this.f3045j = d2;
        if (callback != null) {
            this.f3042f = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final boolean onMenuOpened(int i2, Menu menu) {
        b(i2, menu);
        D d2 = this.f3045j;
        if (i2 == 108) {
            d2.z();
            N n2 = d2.f2893t;
            if (!(n2 == null || true == n2.f2945w)) {
                n2.f2945w = true;
                ArrayList arrayList = n2.f2946x;
                if (arrayList.size() > 0) {
                    arrayList.get(0).getClass();
                    throw new ClassCastException();
                }
            }
        } else {
            d2.getClass();
        }
        return true;
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        if (this.f3045j.f2855E) {
            return e(callback);
        }
        return this.f3042f.onWindowStartingActionMode(callback);
    }
}
