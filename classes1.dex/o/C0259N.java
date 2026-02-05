package o;

import N0.v;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import n.C0189d;

/* renamed from: o.N  reason: case insensitive filesystem */
public final class C0259N extends H0 implements C0261P {
    public CharSequence I;

    /* renamed from: J  reason: collision with root package name */
    public C0257L f4108J;

    /* renamed from: K  reason: collision with root package name */
    public final Rect f4109K = new Rect();

    /* renamed from: L  reason: collision with root package name */
    public int f4110L;

    /* renamed from: M  reason: collision with root package name */
    public final /* synthetic */ C0262Q f4111M;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0259N(C0262Q q2, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969631);
        this.f4111M = q2;
        this.f4087t = q2;
        this.f4072D = true;
        this.f4073E.setFocusable(true);
        this.f4088u = new v(1, this);
    }

    public final CharSequence b() {
        return this.I;
    }

    public final void f(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0246A a2 = this.f4073E;
        boolean isShowing = a2.isShowing();
        s();
        this.f4073E.setInputMethodMode(2);
        i();
        C0309v0 v0Var = this.f4076h;
        v0Var.setChoiceMode(1);
        v0Var.setTextDirection(i);
        v0Var.setTextAlignment(i2);
        C0262Q q2 = this.f4111M;
        int selectedItemPosition = q2.getSelectedItemPosition();
        C0309v0 v0Var2 = this.f4076h;
        if (a2.isShowing() && v0Var2 != null) {
            v0Var2.setListSelectionHidden(false);
            v0Var2.setSelection(selectedItemPosition);
            if (v0Var2.getChoiceMode() != 0) {
                v0Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = q2.getViewTreeObserver()) != null) {
            C0189d dVar = new C0189d(3, this);
            viewTreeObserver.addOnGlobalLayoutListener(dVar);
            this.f4073E.setOnDismissListener(new C0258M(this, dVar));
        }
    }

    public final void h(CharSequence charSequence) {
        this.I = charSequence;
    }

    public final void p(int i) {
        this.f4110L = i;
    }

    public final void s() {
        int i;
        int i2;
        C0246A a2 = this.f4073E;
        Drawable background = a2.getBackground();
        C0262Q q2 = this.f4111M;
        if (background != null) {
            background.getPadding(q2.f4129m);
            boolean z2 = n1.f4272a;
            int layoutDirection = q2.getLayoutDirection();
            Rect rect = q2.f4129m;
            if (layoutDirection == 1) {
                i = rect.right;
            } else {
                i = -rect.left;
            }
        } else {
            Rect rect2 = q2.f4129m;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = q2.getPaddingLeft();
        int paddingRight = q2.getPaddingRight();
        int width = q2.getWidth();
        int i3 = q2.f4128l;
        if (i3 == -2) {
            int a3 = q2.a(this.f4108J, a2.getBackground());
            int i4 = q2.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = q2.f4129m;
            int i5 = (i4 - rect3.left) - rect3.right;
            if (a3 > i5) {
                a3 = i5;
            }
            r(Math.max(a3, (width - paddingLeft) - paddingRight));
        } else if (i3 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i3);
        }
        boolean z3 = n1.f4272a;
        if (q2.getLayoutDirection() == 1) {
            i2 = (((width - paddingRight) - this.f4077j) - this.f4110L) + i;
        } else {
            i2 = paddingLeft + this.f4110L + i;
        }
        this.f4078k = i2;
    }

    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.f4108J = (C0257L) listAdapter;
    }
}
