package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import m.C0175b;
import n.C0185D;
import n.C0197l;
import n.C0199n;
import n.C0201p;
import n.C0209x;

public final class a1 implements C0209x {

    /* renamed from: f  reason: collision with root package name */
    public C0197l f4168f;

    /* renamed from: g  reason: collision with root package name */
    public C0199n f4169g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Toolbar f4170h;

    public final boolean g(C0185D d2) {
        return false;
    }

    public final boolean h() {
        return false;
    }

    public final void b(C0197l lVar, boolean z2) {
    }

    public final void c() {
        if (this.f4169g != null) {
            C0197l lVar = this.f4168f;
            if (lVar != null) {
                int size = lVar.f3876f.size();
                int i = 0;
                while (i < size) {
                    if (this.f4168f.getItem(i) != this.f4169g) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
            k(this.f4169g);
        }
    }

    public final boolean d(C0199n nVar) {
        Toolbar toolbar = this.f4170h;
        toolbar.c();
        ViewParent parent = toolbar.f1402m.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1402m);
            }
            toolbar.addView(toolbar.f1402m);
        }
        View actionView = nVar.getActionView();
        toolbar.f1403n = actionView;
        this.f4169g = nVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1403n);
            }
            b1 h2 = Toolbar.h();
            h2.f4173a = (toolbar.f1408s & 112) | 8388611;
            h2.f4174b = 2;
            toolbar.f1403n.setLayoutParams(h2);
            toolbar.addView(toolbar.f1403n);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (!(((b1) childAt.getLayoutParams()).f4174b == 2 || childAt == toolbar.f1396f)) {
                toolbar.removeViewAt(childCount);
                toolbar.f1383J.add(childAt);
            }
        }
        toolbar.requestLayout();
        nVar.f3899C = true;
        nVar.f3911n.p(false);
        View view = toolbar.f1403n;
        if (view instanceof C0175b) {
            ((C0201p) ((C0175b) view)).f3927f.onActionViewExpanded();
        }
        toolbar.u();
        return true;
    }

    public final void f(Context context, C0197l lVar) {
        C0199n nVar;
        C0197l lVar2 = this.f4168f;
        if (!(lVar2 == null || (nVar = this.f4169g) == null)) {
            lVar2.d(nVar);
        }
        this.f4168f = lVar;
    }

    public final boolean k(C0199n nVar) {
        Toolbar toolbar = this.f4170h;
        View view = toolbar.f1403n;
        if (view instanceof C0175b) {
            ((C0201p) ((C0175b) view)).f3927f.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f1403n);
        toolbar.removeView(toolbar.f1402m);
        toolbar.f1403n = null;
        ArrayList arrayList = toolbar.f1383J;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f4169g = null;
        toolbar.requestLayout();
        nVar.f3899C = false;
        nVar.f3911n.p(false);
        toolbar.u();
        return true;
    }

    public a1(Toolbar toolbar) {
        this.f4170h = toolbar;
    }
}
