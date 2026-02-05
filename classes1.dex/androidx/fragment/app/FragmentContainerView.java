package androidx.fragment.app;

import N.D;
import N.Q;
import N.w0;
import Q0.E;
import Y.a;
import Z0.c;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import h.C0121l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

public final class FragmentContainerView extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f1564f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f1565g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1566h;
    public boolean i = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        c.e("context", context);
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1001b, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
            }
        }
    }

    public final <F extends r> F getFragment() {
        C0121l lVar;
        r rVar;
        H h2;
        View view = this;
        while (true) {
            lVar = null;
            if (view == null) {
                rVar = null;
                break;
            }
            Object tag = view.getTag(2131296468);
            if (tag instanceof r) {
                rVar = (r) tag;
            } else {
                rVar = null;
            }
            if (rVar != null) {
                break;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        if (rVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof C0121l) {
                    lVar = (C0121l) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (lVar != null) {
                h2 = ((C0065t) lVar.f3019x.f2g).i;
            } else {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
        } else if (rVar.o()) {
            h2 = rVar.g();
        } else {
            throw new IllegalStateException("The Fragment " + rVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        return h2.z(getId());
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        c.e("insets", windowInsets);
        return windowInsets;
    }

    public final void a(View view) {
        if (this.f1565g.contains(view)) {
            this.f1564f.add(view);
        }
    }

    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        r rVar;
        c.e("child", view);
        Object tag = view.getTag(2131296468);
        if (tag instanceof r) {
            rVar = (r) tag;
        } else {
            rVar = null;
        }
        if (rVar != null) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        w0 w0Var;
        c.e("insets", windowInsets);
        w0 g2 = w0.g((View) null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1566h;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            c.d("onApplyWindowInsetsListe…lyWindowInsets(v, insets)", onApplyWindowInsets);
            w0Var = w0.g((View) null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = Q.f509a;
            WindowInsets f2 = g2.f();
            if (f2 != null) {
                WindowInsets b2 = D.b(this, f2);
                if (!b2.equals(f2)) {
                    g2 = w0.g(this, b2);
                }
            }
            w0Var = g2;
        }
        if (!w0Var.f597a.m()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                WeakHashMap weakHashMap2 = Q.f509a;
                WindowInsets f3 = w0Var.f();
                if (f3 != null) {
                    WindowInsets a2 = D.a(childAt, f3);
                    if (!a2.equals(f3)) {
                        w0.g(childAt, a2);
                    }
                }
            }
        }
        return windowInsets;
    }

    public final void dispatchDraw(Canvas canvas) {
        c.e("canvas", canvas);
        if (this.i) {
            Iterator it2 = this.f1564f.iterator();
            while (it2.hasNext()) {
                super.drawChild(canvas, (View) it2.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public final boolean drawChild(Canvas canvas, View view, long j2) {
        c.e("canvas", canvas);
        c.e("child", view);
        if (this.i) {
            ArrayList arrayList = this.f1564f;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    public final void endViewTransition(View view) {
        c.e("view", view);
        this.f1565g.remove(view);
        if (this.f1564f.remove(view)) {
            this.i = true;
        }
        super.endViewTransition(view);
    }

    public final void removeView(View view) {
        c.e("view", view);
        a(view);
        super.removeView(view);
    }

    public final void removeViewInLayout(View view) {
        c.e("view", view);
        a(view);
        super.removeViewInLayout(view);
    }

    public final void removeViews(int i2, int i3) {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            View childAt = getChildAt(i5);
            c.d("view", childAt);
            a(childAt);
        }
        super.removeViews(i2, i3);
    }

    public final void removeViewsInLayout(int i2, int i3) {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            View childAt = getChildAt(i5);
            c.d("view", childAt);
            a(childAt);
        }
        super.removeViewsInLayout(i2, i3);
    }

    public final void setDrawDisappearingViewsLast(boolean z2) {
        this.i = z2;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        c.e("listener", onApplyWindowInsetsListener);
        this.f1566h = onApplyWindowInsetsListener;
    }

    public final void startViewTransition(View view) {
        c.e("view", view);
        if (view.getParent() == this) {
            this.f1565g.add(view);
        }
        super.startViewTransition(view);
    }

    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                c.d("view", childAt);
                a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    public final void removeViewAt(int i2) {
        View childAt = getChildAt(i2);
        c.d("view", childAt);
        a(childAt);
        super.removeViewAt(i2);
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, H h2) {
        super(context, attributeSet);
        View view;
        c.e("context", context);
        c.e("attrs", attributeSet);
        c.e("fm", h2);
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1001b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        r z2 = h2.z(id);
        if (classAttribute != null && z2 == null) {
            if (id == -1) {
                throw new IllegalStateException(E.g("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            B C2 = h2.C();
            context.getClassLoader();
            r a2 = C2.a(classAttribute);
            c.d("fm.fragmentFactory.insta…ontext.classLoader, name)", a2);
            a2.f1736H = true;
            C0065t tVar = a2.f1769x;
            if ((tVar == null ? null : tVar.f1774f) != null) {
                a2.f1736H = true;
            }
            C0047a aVar = new C0047a(h2);
            aVar.f1666p = true;
            a2.I = this;
            aVar.e(getId(), a2, string, 1);
            if (!aVar.f1658g) {
                aVar.f1659h = false;
                H h3 = aVar.f1667q;
                if (h3.f1598t != null && !h3.f1575G) {
                    h3.w(true);
                    aVar.a(h3.I, h3.f1577J);
                    h3.f1582b = true;
                    try {
                        h3.P(h3.I, h3.f1577J);
                        h3.d();
                        h3.Z();
                        if (h3.f1576H) {
                            h3.f1576H = false;
                            h3.X();
                        }
                        ((HashMap) h3.f1583c.f21f).values().removeAll(Collections.singleton((Object) null));
                    } catch (Throwable th) {
                        h3.d();
                        throw th;
                    }
                }
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it2 = h2.f1583c.g().iterator();
        while (it2.hasNext()) {
            M m2 = (M) it2.next();
            r rVar = m2.f1630c;
            if (rVar.f1730B == getId() && (view = rVar.f1737J) != null && view.getParent() == null) {
                rVar.I = this;
                m2.b();
            }
        }
    }
}
