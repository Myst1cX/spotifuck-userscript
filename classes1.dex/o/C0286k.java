package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import j0.C0160w;
import java.util.ArrayList;
import n.C0185D;
import n.C0197l;
import n.C0199n;
import n.C0200o;
import n.C0205t;
import n.C0208w;
import n.C0209x;
import n.C0210y;
import n.C0211z;

/* renamed from: o.k  reason: case insensitive filesystem */
public final class C0286k implements C0209x {

    /* renamed from: A  reason: collision with root package name */
    public C0280h f4239A;

    /* renamed from: B  reason: collision with root package name */
    public final C0160w f4240B = new C0160w(this);

    /* renamed from: f  reason: collision with root package name */
    public final Context f4241f;

    /* renamed from: g  reason: collision with root package name */
    public Context f4242g;

    /* renamed from: h  reason: collision with root package name */
    public C0197l f4243h;
    public final LayoutInflater i;

    /* renamed from: j  reason: collision with root package name */
    public C0208w f4244j;

    /* renamed from: k  reason: collision with root package name */
    public final int f4245k = 2131492867;

    /* renamed from: l  reason: collision with root package name */
    public final int f4246l = 2131492866;

    /* renamed from: m  reason: collision with root package name */
    public C0211z f4247m;

    /* renamed from: n  reason: collision with root package name */
    public C0284j f4248n;

    /* renamed from: o  reason: collision with root package name */
    public Drawable f4249o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4250p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4251q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4252r;

    /* renamed from: s  reason: collision with root package name */
    public int f4253s;

    /* renamed from: t  reason: collision with root package name */
    public int f4254t;

    /* renamed from: u  reason: collision with root package name */
    public int f4255u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f4256v;

    /* renamed from: w  reason: collision with root package name */
    public final SparseBooleanArray f4257w = new SparseBooleanArray();

    /* renamed from: x  reason: collision with root package name */
    public C0278g f4258x;

    /* renamed from: y  reason: collision with root package name */
    public C0278g f4259y;

    /* renamed from: z  reason: collision with root package name */
    public C0282i f4260z;

    public final boolean d(C0199n nVar) {
        return false;
    }

    public final void j(C0208w wVar) {
        throw null;
    }

    public final boolean k(C0199n nVar) {
        return false;
    }

    public final void c() {
        C0211z zVar;
        int i2;
        C0199n nVar;
        ViewGroup viewGroup = (ViewGroup) this.f4247m;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            C0197l lVar = this.f4243h;
            if (lVar != null) {
                lVar.i();
                ArrayList l2 = this.f4243h.l();
                int size = l2.size();
                i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0199n nVar2 = (C0199n) l2.get(i3);
                    if (nVar2.f()) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt instanceof C0210y) {
                            nVar = ((C0210y) childAt).getItemData();
                        } else {
                            nVar = null;
                        }
                        View a2 = a(nVar2, childAt, viewGroup);
                        if (nVar2 != nVar) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.f4247m).addView(a2, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i2) == this.f4248n) {
                    i2++;
                } else {
                    viewGroup.removeViewAt(i2);
                }
            }
        }
        ((View) this.f4247m).requestLayout();
        C0197l lVar2 = this.f4243h;
        if (lVar2 != null) {
            lVar2.i();
            ArrayList arrayList2 = lVar2.i;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                C0200o oVar = ((C0199n) arrayList2.get(i4)).f3897A;
            }
        }
        C0197l lVar3 = this.f4243h;
        if (lVar3 != null) {
            lVar3.i();
            arrayList = lVar3.f3879j;
        }
        if (this.f4251q && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((C0199n) arrayList.get(0)).f3899C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f4248n == null) {
                this.f4248n = new C0284j(this, this.f4241f);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f4248n.getParent();
            if (viewGroup3 != this.f4247m) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f4248n);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f4247m;
                C0284j jVar = this.f4248n;
                actionMenuView.getClass();
                C0290m j2 = ActionMenuView.j();
                j2.f4262a = true;
                actionMenuView.addView(jVar, j2);
            }
        } else {
            C0284j jVar2 = this.f4248n;
            if (jVar2 != null && jVar2.getParent() == (zVar = this.f4247m)) {
                ((ViewGroup) zVar).removeView(this.f4248n);
            }
        }
        ((ActionMenuView) this.f4247m).setOverflowReserved(this.f4251q);
    }

    public final boolean e() {
        C0211z zVar;
        C0282i iVar = this.f4260z;
        if (iVar == null || (zVar = this.f4247m) == null) {
            C0278g gVar = this.f4258x;
            if (gVar == null) {
                return false;
            }
            if (gVar.b()) {
                gVar.i.dismiss();
            }
            return true;
        }
        ((View) zVar).removeCallbacks(iVar);
        this.f4260z = null;
        return true;
    }

    public final void f(Context context, C0197l lVar) {
        this.f4242g = context;
        LayoutInflater.from(context);
        this.f4243h = lVar;
        Resources resources = context.getResources();
        if (!this.f4252r) {
            this.f4251q = true;
        }
        int i2 = 2;
        this.f4253s = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600 || ((i3 > 960 && i4 > 720) || (i3 > 720 && i4 > 960))) {
            i2 = 5;
        } else if (i3 >= 500 || ((i3 > 640 && i4 > 480) || (i3 > 480 && i4 > 640))) {
            i2 = 4;
        } else if (i3 >= 360) {
            i2 = 3;
        }
        this.f4255u = i2;
        int i5 = this.f4253s;
        if (this.f4251q) {
            if (this.f4248n == null) {
                C0284j jVar = new C0284j(this, this.f4241f);
                this.f4248n = jVar;
                if (this.f4250p) {
                    jVar.setImageDrawable(this.f4249o);
                    this.f4249o = null;
                    this.f4250p = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f4248n.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i5 -= this.f4248n.getMeasuredWidth();
        } else {
            this.f4248n = null;
        }
        this.f4254t = i5;
        float f2 = resources.getDisplayMetrics().density;
    }

    public final boolean h() {
        int i2;
        ArrayList arrayList;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C0197l lVar = this.f4243h;
        if (lVar != null) {
            arrayList = lVar.l();
            i2 = arrayList.size();
        } else {
            arrayList = null;
            i2 = 0;
        }
        int i4 = this.f4255u;
        int i5 = this.f4254t;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f4247m;
        int i6 = 0;
        boolean z6 = false;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i3 = 2;
            z2 = true;
            if (i6 >= i2) {
                break;
            }
            C0199n nVar = (C0199n) arrayList.get(i6);
            int i9 = nVar.f3922y;
            if ((i9 & 2) == 2) {
                i7++;
            } else if ((i9 & 1) == 1) {
                i8++;
            } else {
                z6 = true;
            }
            if (this.f4256v && nVar.f3899C) {
                i4 = 0;
            }
            i6++;
        }
        if (this.f4251q && (z6 || i8 + i7 > i4)) {
            i4--;
        }
        int i10 = i4 - i7;
        SparseBooleanArray sparseBooleanArray = this.f4257w;
        sparseBooleanArray.clear();
        int i11 = 0;
        int i12 = 0;
        while (i11 < i2) {
            C0199n nVar2 = (C0199n) arrayList.get(i11);
            int i13 = nVar2.f3922y;
            if ((i13 & 2) == i3) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i14 = nVar2.f3901b;
            if (z3) {
                View a2 = a(nVar2, (View) null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i5 -= measuredWidth;
                if (i12 == 0) {
                    i12 = measuredWidth;
                }
                if (i14 != 0) {
                    sparseBooleanArray.put(i14, z2);
                }
                nVar2.g(z2);
            } else if ((i13 & true) == z2) {
                boolean z7 = sparseBooleanArray.get(i14);
                if ((i10 > 0 || z7) && i5 > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    View a3 = a(nVar2, (View) null, viewGroup);
                    a3.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a3.getMeasuredWidth();
                    i5 -= measuredWidth2;
                    if (i12 == 0) {
                        i12 = measuredWidth2;
                    }
                    if (i5 + i12 > 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z4 &= z5;
                }
                if (z4 && i14 != 0) {
                    sparseBooleanArray.put(i14, true);
                } else if (z7) {
                    sparseBooleanArray.put(i14, false);
                    for (int i15 = 0; i15 < i11; i15++) {
                        C0199n nVar3 = (C0199n) arrayList.get(i15);
                        if (nVar3.f3901b == i14) {
                            if (nVar3.f()) {
                                i10++;
                            }
                            nVar3.g(false);
                        }
                    }
                }
                if (z4) {
                    i10--;
                }
                nVar2.g(z4);
            } else {
                nVar2.g(false);
                i11++;
                i3 = 2;
                z2 = true;
            }
            i11++;
            i3 = 2;
            z2 = true;
        }
        return true;
    }

    public final boolean i() {
        C0278g gVar = this.f4258x;
        if (gVar == null || !gVar.b()) {
            return false;
        }
        return true;
    }

    public final boolean l() {
        C0197l lVar;
        if (!this.f4251q || i() || (lVar = this.f4243h) == null || this.f4247m == null || this.f4260z != null) {
            return false;
        }
        lVar.i();
        if (lVar.f3879j.isEmpty()) {
            return false;
        }
        C0282i iVar = new C0282i(this, new C0278g(this, this.f4242g, this.f4243h, (View) this.f4248n));
        this.f4260z = iVar;
        ((View) this.f4247m).post(iVar);
        return true;
    }

    public C0286k(Context context) {
        this.f4241f = context;
        this.i = LayoutInflater.from(context);
    }

    public final View a(C0199n nVar, View view, ViewGroup viewGroup) {
        C0210y yVar;
        View actionView = nVar.getActionView();
        int i2 = 0;
        if (actionView == null || nVar.e()) {
            if (view instanceof C0210y) {
                yVar = (C0210y) view;
            } else {
                yVar = (C0210y) this.i.inflate(this.f4246l, viewGroup, false);
            }
            yVar.a(nVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) yVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f4247m);
            if (this.f4239A == null) {
                this.f4239A = new C0280h(this);
            }
            actionMenuItemView.setPopupCallback(this.f4239A);
            actionView = (View) yVar;
        }
        if (nVar.f3899C) {
            i2 = 8;
        }
        actionView.setVisibility(i2);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0290m)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    public final void b(C0197l lVar, boolean z2) {
        e();
        C0278g gVar = this.f4259y;
        if (gVar != null && gVar.b()) {
            gVar.i.dismiss();
        }
        C0208w wVar = this.f4244j;
        if (wVar != null) {
            wVar.b(lVar, z2);
        }
    }

    public final boolean g(C0185D d2) {
        boolean z2;
        if (!d2.hasVisibleItems()) {
            return false;
        }
        C0185D d3 = d2;
        while (true) {
            C0197l lVar = d3.f3813z;
            if (lVar == this.f4243h) {
                break;
            }
            d3 = lVar;
        }
        ViewGroup viewGroup = (ViewGroup) this.f4247m;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i2);
                if ((childAt instanceof C0210y) && ((C0210y) childAt).getItemData() == d3.f3812A) {
                    view = childAt;
                    break;
                }
                i2++;
            }
        }
        if (view == null) {
            return false;
        }
        d2.f3812A.getClass();
        int size = d2.f3876f.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = d2.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i3++;
        }
        C0278g gVar = new C0278g(this, this.f4242g, d2, view);
        this.f4259y = gVar;
        gVar.f3941g = z2;
        C0205t tVar = gVar.i;
        if (tVar != null) {
            tVar.o(z2);
        }
        C0278g gVar2 = this.f4259y;
        if (!gVar2.b()) {
            if (gVar2.e != null) {
                gVar2.d(0, 0, false, false);
            } else {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
        }
        C0208w wVar = this.f4244j;
        if (wVar != null) {
            wVar.h(d2);
        }
        return true;
    }
}
