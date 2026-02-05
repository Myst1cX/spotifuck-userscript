package n;

import N0.o;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import o.C0309v0;
import o.H0;
import o.M0;

/* renamed from: n.C  reason: case insensitive filesystem */
public final class C0184C extends C0205t implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: g  reason: collision with root package name */
    public final Context f3794g;

    /* renamed from: h  reason: collision with root package name */
    public final C0197l f3795h;
    public final C0194i i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f3796j;

    /* renamed from: k  reason: collision with root package name */
    public final int f3797k;

    /* renamed from: l  reason: collision with root package name */
    public final int f3798l;

    /* renamed from: m  reason: collision with root package name */
    public final M0 f3799m;

    /* renamed from: n  reason: collision with root package name */
    public final C0189d f3800n = new C0189d(1, this);

    /* renamed from: o  reason: collision with root package name */
    public final o f3801o = new o(3, this);

    /* renamed from: p  reason: collision with root package name */
    public C0206u f3802p;

    /* renamed from: q  reason: collision with root package name */
    public View f3803q;

    /* renamed from: r  reason: collision with root package name */
    public View f3804r;

    /* renamed from: s  reason: collision with root package name */
    public C0208w f3805s;

    /* renamed from: t  reason: collision with root package name */
    public ViewTreeObserver f3806t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3807u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f3808v;

    /* renamed from: w  reason: collision with root package name */
    public int f3809w;

    /* renamed from: x  reason: collision with root package name */
    public int f3810x = 0;

    /* renamed from: y  reason: collision with root package name */
    public boolean f3811y;

    public final void c() {
        this.f3808v = false;
        C0194i iVar = this.i;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    public final boolean h() {
        return false;
    }

    public final void onDismiss() {
        this.f3807u = true;
        this.f3795h.c(true);
        ViewTreeObserver viewTreeObserver = this.f3806t;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f3806t = this.f3804r.getViewTreeObserver();
            }
            this.f3806t.removeGlobalOnLayoutListener(this.f3800n);
            this.f3806t = null;
        }
        this.f3804r.removeOnAttachStateChangeListener(this.f3801o);
        C0206u uVar = this.f3802p;
        if (uVar != null) {
            uVar.onDismiss();
        }
    }

    public final boolean a() {
        if (this.f3807u || !this.f3799m.f4073E.isShowing()) {
            return false;
        }
        return true;
    }

    public final void b(C0197l lVar, boolean z2) {
        if (lVar == this.f3795h) {
            dismiss();
            C0208w wVar = this.f3805s;
            if (wVar != null) {
                wVar.b(lVar, z2);
            }
        }
    }

    public final C0309v0 e() {
        return this.f3799m.f4076h;
    }

    public final void j(C0208w wVar) {
        this.f3805s = wVar;
    }

    public final void l(C0197l lVar) {
    }

    public final void n(View view) {
        this.f3803q = view;
    }

    public final void o(boolean z2) {
        this.i.f3868c = z2;
    }

    public final void p(int i2) {
        this.f3810x = i2;
    }

    public final void q(int i2) {
        this.f3799m.f4078k = i2;
    }

    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f3802p = (C0206u) onDismissListener;
    }

    public final void s(boolean z2) {
        this.f3811y = z2;
    }

    public final void t(int i2) {
        this.f3799m.l(i2);
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [o.M0, o.H0] */
    public C0184C(int i2, Context context, View view, C0197l lVar, boolean z2) {
        this.f3794g = context;
        this.f3795h = lVar;
        this.f3796j = z2;
        this.i = new C0194i(lVar, LayoutInflater.from(context), z2, 2131492883);
        this.f3798l = i2;
        Resources resources = context.getResources();
        this.f3797k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f3803q = view;
        this.f3799m = new H0(context, (AttributeSet) null, i2);
        lVar.b(this, context);
    }

    public final void dismiss() {
        if (a()) {
            this.f3799m.dismiss();
        }
    }

    public final boolean g(C0185D d2) {
        if (d2.hasVisibleItems()) {
            View view = this.f3804r;
            C0207v vVar = new C0207v(this.f3798l, this.f3794g, view, d2, this.f3796j);
            C0208w wVar = this.f3805s;
            vVar.f3942h = wVar;
            C0205t tVar = vVar.i;
            if (tVar != null) {
                tVar.j(wVar);
            }
            boolean u2 = C0205t.u(d2);
            vVar.f3941g = u2;
            C0205t tVar2 = vVar.i;
            if (tVar2 != null) {
                tVar2.o(u2);
            }
            vVar.f3943j = this.f3802p;
            this.f3802p = null;
            this.f3795h.c(false);
            M0 m0 = this.f3799m;
            int i2 = m0.f4078k;
            int j2 = m0.j();
            if ((Gravity.getAbsoluteGravity(this.f3810x, this.f3803q.getLayoutDirection()) & 7) == 5) {
                i2 += this.f3803q.getWidth();
            }
            if (!vVar.b()) {
                if (vVar.e != null) {
                    vVar.d(i2, j2, true, true);
                }
            }
            C0208w wVar2 = this.f3805s;
            if (wVar2 != null) {
                wVar2.h(d2);
            }
            return true;
        }
        return false;
    }

    public final void i() {
        View view;
        boolean z2;
        Rect rect;
        if (!a()) {
            if (this.f3807u || (view = this.f3803q) == null) {
                throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
            }
            this.f3804r = view;
            M0 m0 = this.f3799m;
            m0.f4073E.setOnDismissListener(this);
            m0.f4088u = this;
            m0.f4072D = true;
            m0.f4073E.setFocusable(true);
            View view2 = this.f3804r;
            if (this.f3806t == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.f3806t = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f3800n);
            }
            view2.addOnAttachStateChangeListener(this.f3801o);
            m0.f4087t = view2;
            m0.f4084q = this.f3810x;
            boolean z3 = this.f3808v;
            Context context = this.f3794g;
            C0194i iVar = this.i;
            if (!z3) {
                this.f3809w = C0205t.m(iVar, context, this.f3797k);
                this.f3808v = true;
            }
            m0.r(this.f3809w);
            m0.f4073E.setInputMethodMode(2);
            Rect rect2 = this.f3934f;
            if (rect2 != null) {
                rect = new Rect(rect2);
            } else {
                rect = null;
            }
            m0.f4071C = rect;
            m0.i();
            C0309v0 v0Var = m0.f4076h;
            v0Var.setOnKeyListener(this);
            if (this.f3811y) {
                C0197l lVar = this.f3795h;
                if (lVar.f3882m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(2131492882, v0Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(lVar.f3882m);
                    }
                    frameLayout.setEnabled(false);
                    v0Var.addHeaderView(frameLayout, (Object) null, false);
                }
            }
            m0.n(iVar);
            m0.i();
        }
    }

    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }
}
