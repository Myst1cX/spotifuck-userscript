package o;

import C0.a;
import T0.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import j0.C0140b;
import n.C0189d;

/* renamed from: o.Q  reason: case insensitive filesystem */
public final class C0262Q extends Spinner {

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f4122n = {16843505};

    /* renamed from: f  reason: collision with root package name */
    public final C0140b f4123f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f4124g;

    /* renamed from: h  reason: collision with root package name */
    public final C0254I f4125h;
    public SpinnerAdapter i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f4126j;

    /* renamed from: k  reason: collision with root package name */
    public final C0261P f4127k;

    /* renamed from: l  reason: collision with root package name */
    public int f4128l;

    /* renamed from: m  reason: collision with root package name */
    public final Rect f4129m = new Rect();

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        Rect rect = this.f4129m;
        drawable.getPadding(rect);
        return i3 + rect.left + rect.right;
    }

    public int getDropDownHorizontalOffset() {
        C0261P p2 = this.f4127k;
        if (p2 != null) {
            return p2.d();
        }
        return super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        C0261P p2 = this.f4127k;
        if (p2 != null) {
            return p2.j();
        }
        return super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        if (this.f4127k != null) {
            return this.f4128l;
        }
        return super.getDropDownWidth();
    }

    public final C0261P getInternalPopup() {
        return this.f4127k;
    }

    public Drawable getPopupBackground() {
        C0261P p2 = this.f4127k;
        if (p2 != null) {
            return p2.m();
        }
        return super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f4124g;
    }

    public CharSequence getPrompt() {
        C0261P p2 = this.f4127k;
        if (p2 != null) {
            return p2.b();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0140b bVar = this.f4123f;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0140b bVar = this.f4123f;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0260O o2 = (C0260O) parcelable;
        super.onRestoreInstanceState(o2.getSuperState());
        if (o2.f4112a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C0189d(2, this));
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View$BaseSavedState, o.O, android.os.Parcelable] */
    public final Parcelable onSaveInstanceState() {
        boolean z2;
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        C0261P p2 = this.f4127k;
        if (p2 == null || !p2.a()) {
            z2 = false;
        } else {
            z2 = true;
        }
        baseSavedState.f4112a = z2;
        return baseSavedState;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0254I i2 = this.f4125h;
        if (i2 == null || !i2.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final boolean performClick() {
        C0261P p2 = this.f4127k;
        if (p2 == null) {
            return super.performClick();
        }
        if (p2.a()) {
            return true;
        }
        this.f4127k.f(getTextDirection(), getTextAlignment());
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.widget.ListAdapter, java.lang.Object, o.L] */
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f4126j) {
            this.i = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        C0261P p2 = this.f4127k;
        if (p2 != null) {
            Context context = this.f4124g;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ? obj = new Object();
            obj.f4099a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.f4100b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && Build.VERSION.SDK_INT >= 23 && a.w(spinnerAdapter)) {
                C0255J.a(a.g(spinnerAdapter), theme);
            }
            p2.n(obj);
        }
    }

    public void setDropDownHorizontalOffset(int i2) {
        C0261P p2 = this.f4127k;
        if (p2 != null) {
            p2.p(i2);
            p2.c(i2);
            return;
        }
        super.setDropDownHorizontalOffset(i2);
    }

    public void setDropDownVerticalOffset(int i2) {
        C0261P p2 = this.f4127k;
        if (p2 != null) {
            p2.l(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    public void setDropDownWidth(int i2) {
        if (this.f4127k != null) {
            this.f4128l = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0261P p2 = this.f4127k;
        if (p2 != null) {
            p2.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPrompt(CharSequence charSequence) {
        C0261P p2 = this.f4127k;
        if (p2 != null) {
            p2.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0140b bVar = this.f4123f;
        if (bVar != null) {
            bVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0140b bVar = this.f4123f;
        if (bVar != null) {
            bVar.t(mode);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        if (r7 != null) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0262Q(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            r0 = 2130969631(0x7f04041f, float:1.754795E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.f4129m = r1
            android.content.Context r1 = r12.getContext()
            o.U0.a(r12, r1)
            int[] r1 = g.C0096a.f2537u
            android.support.v4.media.session.t r2 = android.support.v4.media.session.t.A(r13, r14, r1, r0)
            j0.b r3 = new j0.b
            r3.<init>((android.view.View) r12)
            r12.f4123f = r3
            java.lang.Object r3 = r2.f1132c
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L_0x0035
            m.c r6 = new m.c
            r6.<init>(r13, r4)
            r12.f4124g = r6
            goto L_0x0037
        L_0x0035:
            r12.f4124g = r13
        L_0x0037:
            r4 = -1
            r6 = 0
            int[] r7 = f4122n     // Catch:{ Exception -> 0x0055, all -> 0x0053 }
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch:{ Exception -> 0x0055, all -> 0x0053 }
            boolean r8 = r7.hasValue(r5)     // Catch:{ Exception -> 0x004d, all -> 0x004a }
            if (r8 == 0) goto L_0x004f
            int r4 = r7.getInt(r5, r5)     // Catch:{ Exception -> 0x004d, all -> 0x004a }
            goto L_0x004f
        L_0x004a:
            r13 = move-exception
            r6 = r7
            goto L_0x0058
        L_0x004d:
            goto L_0x005e
        L_0x004f:
            r7.recycle()
            goto L_0x0061
        L_0x0053:
            r13 = move-exception
            goto L_0x0058
        L_0x0055:
            r7 = r6
            goto L_0x005e
        L_0x0058:
            if (r6 == 0) goto L_0x005d
            r6.recycle()
        L_0x005d:
            throw r13
        L_0x005e:
            if (r7 == 0) goto L_0x0061
            goto L_0x004f
        L_0x0061:
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L_0x009b
            if (r4 == r8) goto L_0x0068
            goto L_0x00a8
        L_0x0068:
            o.N r4 = new o.N
            android.content.Context r9 = r12.f4124g
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.f4124g
            android.support.v4.media.session.t r1 = android.support.v4.media.session.t.A(r9, r14, r1, r0)
            r9 = 3
            r10 = -2
            java.lang.Object r11 = r1.f1132c
            android.content.res.TypedArray r11 = (android.content.res.TypedArray) r11
            int r9 = r11.getLayoutDimension(r9, r10)
            r12.f4128l = r9
            android.graphics.drawable.Drawable r9 = r1.o(r8)
            r4.k(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.I = r7
            r1.C()
            r12.f4127k = r4
            o.I r1 = new o.I
            r1.<init>(r12, r12, r4)
            r12.f4125h = r1
            goto L_0x00a8
        L_0x009b:
            o.K r1 = new o.K
            r1.<init>(r12)
            r12.f4127k = r1
            java.lang.String r4 = r3.getString(r7)
            r1.f4098h = r4
        L_0x00a8:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto L_0x00bf
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131493000(0x7f0c0088, float:1.8609468E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter((android.widget.SpinnerAdapter) r3)
        L_0x00bf:
            r2.C()
            r12.f4126j = r8
            android.widget.SpinnerAdapter r13 = r12.i
            if (r13 == 0) goto L_0x00cd
            r12.setAdapter((android.widget.SpinnerAdapter) r13)
            r12.i = r6
        L_0x00cd:
            j0.b r13 = r12.f4123f
            r13.k(r14, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0262Q.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0140b bVar = this.f4123f;
        if (bVar != null) {
            bVar.a();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0261P p2 = this.f4127k;
        if (p2 != null && p2.a()) {
            p2.dismiss();
        }
    }

    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f4127k != null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0140b bVar = this.f4123f;
        if (bVar != null) {
            bVar.m();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0140b bVar = this.f4123f;
        if (bVar != null) {
            bVar.n(i2);
        }
    }

    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(g.n(getPopupContext(), i2));
    }
}
