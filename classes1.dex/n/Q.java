package N;

import O.f;
import O.u;
import T.s;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import o.C0306u;

public abstract class Q {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap f509a;

    /* renamed from: b  reason: collision with root package name */
    public static Field f510b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f511c;

    /* renamed from: d  reason: collision with root package name */
    public static ThreadLocal f512d;
    public static final int[] e = {2131296273, 2131296274, 2131296285, 2131296296, 2131296299, 2131296300, 2131296301, 2131296302, 2131296303, 2131296304, 2131296275, 2131296276, 2131296277, 2131296278, 2131296279, 2131296280, 2131296281, 2131296282, 2131296283, 2131296284, 2131296286, 2131296287, 2131296288, 2131296289, 2131296290, 2131296291, 2131296292, 2131296293, 2131296294, 2131296295, 2131296297, 2131296298};

    /* renamed from: f  reason: collision with root package name */
    public static final C0025z f513f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static final B f514g = new B();

    public static Z a(View view) {
        if (f509a == null) {
            f509a = new WeakHashMap();
        }
        Z z2 = (Z) f509a.get(view);
        if (z2 != null) {
            return z2;
        }
        Z z3 = new Z(view);
        f509a.put(view, z3);
        return z3;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [N.P, java.lang.Object] */
    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = P.f505d;
        P p2 = (P) view.getTag(2131296735);
        P p3 = p2;
        if (p2 == null) {
            ? obj = new Object();
            obj.f506a = null;
            obj.f507b = null;
            obj.f508c = null;
            view.setTag(2131296735, obj);
            p3 = obj;
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = p3.f506a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = P.f505d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (p3.f506a == null) {
                            p3.f506a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = P.f505d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                p3.f506a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    p3.f506a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a2 = p3.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (p3.f507b == null) {
                    p3.f507b = new SparseArray();
                }
                p3.f507b.put(keyCode, new WeakReference(a2));
            }
        }
        if (a2 != null) {
            return true;
        }
        return false;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return K.a(view);
        }
        if (f511c) {
            return null;
        }
        if (f510b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f510b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f511c = true;
                return null;
            }
        }
        try {
            Object obj = f510b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f511c = true;
            return null;
        }
    }

    public static CharSequence d(View view) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            obj = J.b(view);
        } else {
            obj = view.getTag(2131296728);
            if (!CharSequence.class.isInstance(obj)) {
                obj = null;
            }
        }
        return (CharSequence) obj;
    }

    public static Rect f() {
        if (f512d == null) {
            f512d = new ThreadLocal();
        }
        Rect rect = (Rect) f512d.get();
        if (rect == null) {
            rect = new Rect();
            f512d.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static String[] g(C0306u uVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            return M.a(uVar);
        }
        return (String[]) uVar.getTag(2131296731);
    }

    public static w0 h(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return G.a(view);
        }
        return F.j(view);
    }

    public static void j(View view, int i) {
        boolean z2;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        Rect f2 = f();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            f2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z2 = !f2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z2 = false;
        }
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            s(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                s((View) parent2);
            }
        }
        if (z2 && f2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(f2);
        }
    }

    public static void k(View view, int i) {
        boolean z2;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        Rect f2 = f();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            f2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z2 = !f2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z2 = false;
        }
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            s(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                s((View) parent2);
            }
        }
        if (z2 && f2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(f2);
        }
    }

    public static C0006f l(View view, C0006f fVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(fVar);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return M.b(view, fVar);
        }
        C0018s sVar = (C0018s) view.getTag(2131296730);
        C0019t tVar = f513f;
        if (sVar != null) {
            C0006f a2 = ((s) sVar).a(view, fVar);
            if (a2 == null) {
                return null;
            }
            if (view instanceof C0019t) {
                tVar = (C0019t) view;
            }
            return tVar.a(a2);
        }
        if (view instanceof C0019t) {
            tVar = (C0019t) view;
        }
        return tVar.a(fVar);
    }

    public static void n(View view, f fVar, u uVar) {
        C0002b bVar;
        f fVar2 = new f((Object) null, fVar.f746b, (String) null, uVar, fVar.f747c);
        View.AccessibilityDelegate c2 = c(view);
        if (c2 == null) {
            bVar = null;
        } else if (c2 instanceof C0000a) {
            bVar = ((C0000a) c2).f521a;
        } else {
            bVar = new C0002b(c2);
        }
        if (bVar == null) {
            bVar = new C0002b();
        }
        p(view, bVar);
        m(view, fVar2.a());
        e(view).add(fVar2);
        i(view, 0);
    }

    public static void o(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            K.d(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void p(View view, C0002b bVar) {
        C0000a aVar;
        if (bVar == null && (c(view) instanceof C0000a)) {
            bVar = new C0002b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        if (bVar == null) {
            aVar = null;
        } else {
            aVar = bVar.f524b;
        }
        view.setAccessibilityDelegate(aVar);
    }

    public static void q(View view, CharSequence charSequence) {
        boolean z2;
        new A(2131296728, CharSequence.class, 8, 28, 1).d(view, charSequence);
        B b2 = f514g;
        if (charSequence != null) {
            WeakHashMap weakHashMap = b2.f496f;
            if (!view.isShown() || view.getWindowVisibility() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            weakHashMap.put(view, Boolean.valueOf(z2));
            view.addOnAttachStateChangeListener(b2);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(b2);
                return;
            }
            return;
        }
        b2.f496f.remove(view);
        view.removeOnAttachStateChangeListener(b2);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(b2);
    }

    public static void r(View view, ColorStateList colorStateList) {
        boolean z2;
        int i = Build.VERSION.SDK_INT;
        F.q(view, colorStateList);
        if (i == 21) {
            Drawable background = view.getBackground();
            if (F.g(view) == null && F.h(view) == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (background != null && z2) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    public static ArrayList e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(2131296725);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(2131296725, arrayList2);
        return arrayList2;
    }

    public static void i(View view, int i) {
        boolean z2;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (d(view) == null || !view.isShown() || view.getWindowVisibility() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            int i2 = 32;
            if (view.getAccessibilityLiveRegion() != 0 || z2) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z2) {
                    i2 = 2048;
                }
                obtain.setEventType(i2);
                obtain.setContentChangeTypes(i);
                if (z2) {
                    obtain.getText().add(d(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(d(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                }
            }
        }
    }

    public static void m(View view, int i) {
        ArrayList e2 = e(view);
        for (int i2 = 0; i2 < e2.size(); i2++) {
            if (((f) e2.get(i2)).a() == i) {
                e2.remove(i2);
                return;
            }
        }
    }

    public static void s(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
