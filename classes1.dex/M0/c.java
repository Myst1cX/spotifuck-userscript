package M0;

import G.a;
import K0.k;
import N.D;
import N.Q;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import p0.C0320a;

public abstract class c extends FrameLayout {

    /* renamed from: n  reason: collision with root package name */
    public static final b f484n = new Object();

    /* renamed from: f  reason: collision with root package name */
    public final k f485f;

    /* renamed from: g  reason: collision with root package name */
    public int f486g;

    /* renamed from: h  reason: collision with root package name */
    public final float f487h;
    public final float i;

    /* renamed from: j  reason: collision with root package name */
    public final int f488j;

    /* renamed from: k  reason: collision with root package name */
    public final int f489k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f490l;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f491m;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: K0.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r5 = P0.a.a(r5, r6, r0, r0)
            r4.<init>(r5, r6)
            android.content.Context r5 = r4.getContext()
            int[] r1 = q0.C0322a.f4505x
            android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r1)
            r2 = 6
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0023
            int r2 = r1.getDimensionPixelSize(r2, r0)
            float r2 = (float) r2
            java.util.WeakHashMap r3 = N.Q.f509a
            N.F.s(r4, r2)
        L_0x0023:
            r2 = 2
            int r2 = r1.getInt(r2, r0)
            r4.f486g = r2
            r2 = 8
            boolean r2 = r1.hasValue(r2)
            if (r2 != 0) goto L_0x003a
            r2 = 9
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x0044
        L_0x003a:
            K0.j r6 = K0.k.b(r5, r6, r0, r0)
            K0.k r6 = r6.a()
            r4.f485f = r6
        L_0x0044:
            r6 = 3
            r2 = 1065353216(0x3f800000, float:1.0)
            float r6 = r1.getFloat(r6, r2)
            r4.f487h = r6
            r6 = 4
            android.content.res.ColorStateList r5 = p0.C0320a.J(r5, r1, r6)
            r4.setBackgroundTintList(r5)
            r5 = 5
            r6 = -1
            int r5 = r1.getInt(r5, r6)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r5 = E0.m.g(r5, r3)
            r4.setBackgroundTintMode(r5)
            r5 = 1
            float r2 = r1.getFloat(r5, r2)
            r4.i = r2
            int r2 = r1.getDimensionPixelSize(r0, r6)
            r4.f488j = r2
            r2 = 7
            int r6 = r1.getDimensionPixelSize(r2, r6)
            r4.f489k = r6
            r1.recycle()
            M0.b r6 = f484n
            r4.setOnTouchListener(r6)
            r4.setFocusable(r5)
            android.graphics.drawable.Drawable r5 = r4.getBackground()
            if (r5 != 0) goto L_0x00e5
            float r5 = r4.getBackgroundOverlayColorAlpha()
            r6 = 2130968876(0x7f04012c, float:1.7546418E38)
            int r6 = p0.C0320a.H(r4, r6)
            r1 = 2130968854(0x7f040116, float:1.7546373E38)
            int r1 = p0.C0320a.H(r4, r1)
            int r5 = p0.C0320a.h0(r6, r1, r5)
            K0.k r6 = r4.f485f
            if (r6 == 0) goto L_0x00b2
            int r0 = M0.d.f492a
            K0.g r0 = new K0.g
            r0.<init>((K0.k) r6)
            android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r5)
            r0.j(r5)
            goto L_0x00ce
        L_0x00b2:
            android.content.res.Resources r6 = r4.getResources()
            int r1 = M0.d.f492a
            r1 = 2131165937(0x7f0702f1, float:1.7946105E38)
            float r6 = r6.getDimension(r1)
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            r1.setShape(r0)
            r1.setCornerRadius(r6)
            r1.setColor(r5)
            r0 = r1
        L_0x00ce:
            android.content.res.ColorStateList r5 = r4.f490l
            if (r5 == 0) goto L_0x00dc
            android.graphics.drawable.Drawable r5 = p0.C0320a.J0(r0)
            android.content.res.ColorStateList r6 = r4.f490l
            G.a.h(r5, r6)
            goto L_0x00e0
        L_0x00dc:
            android.graphics.drawable.Drawable r5 = p0.C0320a.J0(r0)
        L_0x00e0:
            java.util.WeakHashMap r6 = N.Q.f509a
            r4.setBackground(r5)
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.c.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private void setBaseTransientBottomBar(d dVar) {
    }

    public float getActionTextColorAlpha() {
        return this.i;
    }

    public int getAnimationMode() {
        return this.f486g;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f487h;
    }

    public int getMaxInlineActionWidth() {
        return this.f489k;
    }

    public int getMaxWidth() {
        return this.f488j;
    }

    public void setAnimationMode(int i2) {
        this.f486g = i2;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!(drawable == null || this.f490l == null)) {
            drawable = C0320a.J0(drawable.mutate());
            a.h(drawable, this.f490l);
            a.i(drawable, this.f491m);
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f490l = colorStateList;
        if (getBackground() != null) {
            Drawable J02 = C0320a.J0(getBackground().mutate());
            a.h(J02, colorStateList);
            a.i(J02, this.f491m);
            if (J02 != getBackground()) {
                super.setBackgroundDrawable(J02);
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f491m = mode;
        if (getBackground() != null) {
            Drawable J02 = C0320a.J0(getBackground().mutate());
            a.i(J02, mode);
            if (J02 != getBackground()) {
                super.setBackgroundDrawable(J02);
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        b bVar;
        if (onClickListener != null) {
            bVar = null;
        } else {
            bVar = f484n;
        }
        setOnTouchListener(bVar);
        super.setOnClickListener(onClickListener);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = Q.f509a;
        D.c(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int i4 = this.f488j;
        if (i4 > 0 && getMeasuredWidth() > i4) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }
}
