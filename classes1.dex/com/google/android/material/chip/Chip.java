package com.google.android.material.chip;

import E0.f;
import E0.i;
import G.h;
import H0.d;
import K0.k;
import K0.v;
import L.b;
import L.j;
import N.C0002b;
import N.Q;
import T0.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import o.C0298q;
import p0.C0320a;
import r0.C0325b;
import z0.C0362c;
import z0.C0363d;
import z0.C0364e;

public class Chip extends C0298q implements C0363d, v, Checkable {

    /* renamed from: B  reason: collision with root package name */
    public static final Rect f2190B = new Rect();

    /* renamed from: C  reason: collision with root package name */
    public static final int[] f2191C = {16842913};

    /* renamed from: D  reason: collision with root package name */
    public static final int[] f2192D = {16842911};

    /* renamed from: A  reason: collision with root package name */
    public final i f2193A = new i(1, this);

    /* renamed from: j  reason: collision with root package name */
    public C0364e f2194j;

    /* renamed from: k  reason: collision with root package name */
    public InsetDrawable f2195k;

    /* renamed from: l  reason: collision with root package name */
    public RippleDrawable f2196l;

    /* renamed from: m  reason: collision with root package name */
    public View.OnClickListener f2197m;

    /* renamed from: n  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f2198n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2199o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2200p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2201q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2202r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2203s;

    /* renamed from: t  reason: collision with root package name */
    public int f2204t;

    /* renamed from: u  reason: collision with root package name */
    public int f2205u;

    /* renamed from: v  reason: collision with root package name */
    public CharSequence f2206v;

    /* renamed from: w  reason: collision with root package name */
    public final C0362c f2207w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2208x;

    /* renamed from: y  reason: collision with root package name */
    public final Rect f2209y = new Rect();

    /* renamed from: z  reason: collision with root package name */
    public final RectF f2210z = new RectF();

    public void setCheckedIconVisible(int i) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.z(eVar.f5220j0.getResources().getBoolean(i));
        }
    }

    public void setChipIconVisible(int i) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.E(eVar.f5220j0.getResources().getBoolean(i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setTextAppearance(d dVar) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.Q(dVar);
        }
        h();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r18, android.util.AttributeSet r19) {
        /*
            r17 = this;
            r0 = r17
            r7 = r19
            r8 = 2130968795(0x7f0400db, float:1.7546254E38)
            r1 = 2131821616(0x7f110430, float:1.927598E38)
            r2 = r18
            android.content.Context r1 = P0.a.a(r2, r7, r8, r1)
            r0.<init>(r1, r7, r8)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f2209y = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f2210z = r1
            E0.i r1 = new E0.i
            r2 = 1
            r1.<init>(r2, r0)
            r0.f2193A = r1
            android.content.Context r9 = r17.getContext()
            r10 = 1
            r11 = 8388627(0x800013, float:1.175497E-38)
            if (r7 != 0) goto L_0x0034
            goto L_0x0094
        L_0x0034:
            java.lang.String r1 = "http://schemas.android.com/apk/res/android"
            java.lang.String r2 = "background"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r3 = "Chip"
            if (r2 == 0) goto L_0x0045
            java.lang.String r2 = "Do not set the background; Chip manages its own background drawable."
            android.util.Log.w(r3, r2)
        L_0x0045:
            java.lang.String r2 = "drawableLeft"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x03de
            java.lang.String r2 = "drawableStart"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x03d6
            java.lang.String r2 = "drawableEnd"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r4 = "Please set end drawable using R.attr#closeIcon."
            if (r2 != 0) goto L_0x03d0
            java.lang.String r2 = "drawableRight"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x03ca
            java.lang.String r2 = "singleLine"
            boolean r2 = r7.getAttributeBooleanValue(r1, r2, r10)
            if (r2 == 0) goto L_0x03c2
            java.lang.String r2 = "lines"
            int r2 = r7.getAttributeIntValue(r1, r2, r10)
            if (r2 != r10) goto L_0x03c2
            java.lang.String r2 = "minLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r10)
            if (r2 != r10) goto L_0x03c2
            java.lang.String r2 = "maxLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r10)
            if (r2 != r10) goto L_0x03c2
            java.lang.String r2 = "gravity"
            int r1 = r7.getAttributeIntValue(r1, r2, r11)
            if (r1 == r11) goto L_0x0094
            java.lang.String r1 = "Chip text must be vertically center and start aligned"
            android.util.Log.w(r3, r1)
        L_0x0094:
            z0.e r12 = new z0.e
            r12.<init>(r9, r7)
            int[] r13 = q0.C0322a.f4486c
            r14 = 0
            int[] r6 = new int[r14]
            android.content.Context r1 = r12.f5220j0
            r5 = 2131821616(0x7f110430, float:1.927598E38)
            r2 = r19
            r3 = r13
            r4 = r8
            android.content.res.TypedArray r1 = E0.m.f(r1, r2, r3, r4, r5, r6)
            r15 = 37
            boolean r2 = r1.hasValue(r15)
            r12.f5194J0 = r2
            r2 = 24
            android.content.Context r3 = r12.f5220j0
            android.content.res.ColorStateList r2 = p0.C0320a.J(r3, r1, r2)
            android.content.res.ColorStateList r4 = r12.f5181C
            if (r4 == r2) goto L_0x00c8
            r12.f5181C = r2
            int[] r2 = r12.getState()
            r12.onStateChange(r2)
        L_0x00c8:
            r2 = 11
            android.content.res.ColorStateList r2 = p0.C0320a.J(r3, r1, r2)
            android.content.res.ColorStateList r4 = r12.f5183D
            if (r4 == r2) goto L_0x00db
            r12.f5183D = r2
            int[] r2 = r12.getState()
            r12.onStateChange(r2)
        L_0x00db:
            r2 = 19
            r4 = 0
            float r2 = r1.getDimension(r2, r4)
            float r5 = r12.f5185E
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x00f0
            r12.f5185E = r2
            r12.invalidateSelf()
            r12.u()
        L_0x00f0:
            r2 = 12
            boolean r5 = r1.hasValue(r2)
            if (r5 == 0) goto L_0x00ff
            float r2 = r1.getDimension(r2, r4)
            r12.A(r2)
        L_0x00ff:
            r2 = 22
            android.content.res.ColorStateList r2 = p0.C0320a.J(r3, r1, r2)
            r12.F(r2)
            r6 = 23
            float r2 = r1.getDimension(r6, r4)
            r12.G(r2)
            r2 = 36
            android.content.res.ColorStateList r2 = p0.C0320a.J(r3, r1, r2)
            r12.P(r2)
            r2 = 5
            java.lang.CharSequence r2 = r1.getText(r2)
            if (r2 != 0) goto L_0x0123
            java.lang.String r2 = ""
        L_0x0123:
            java.lang.CharSequence r5 = r12.f5193J
            boolean r5 = android.text.TextUtils.equals(r5, r2)
            if (r5 != 0) goto L_0x0137
            r12.f5193J = r2
            E0.k r2 = r12.f5225p0
            r2.f216d = r10
            r12.invalidateSelf()
            r12.u()
        L_0x0137:
            boolean r2 = r1.hasValue(r14)
            if (r2 == 0) goto L_0x0149
            int r2 = r1.getResourceId(r14, r14)
            if (r2 == 0) goto L_0x0149
            H0.d r5 = new H0.d
            r5.<init>(r3, r2)
            goto L_0x014a
        L_0x0149:
            r5 = 0
        L_0x014a:
            float r2 = r5.f280k
            float r2 = r1.getDimension(r10, r2)
            r5.f280k = r2
            int r2 = android.os.Build.VERSION.SDK_INT
            r11 = 2
            if (r2 >= r6) goto L_0x015d
            android.content.res.ColorStateList r6 = p0.C0320a.J(r3, r1, r11)
            r5.f279j = r6
        L_0x015d:
            r12.Q(r5)
            r5 = 3
            int r6 = r1.getInt(r5, r14)
            if (r6 == r10) goto L_0x0176
            if (r6 == r11) goto L_0x0171
            if (r6 == r5) goto L_0x016c
            goto L_0x017a
        L_0x016c:
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.END
            r12.f5189G0 = r5
            goto L_0x017a
        L_0x0171:
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.MIDDLE
            r12.f5189G0 = r5
            goto L_0x017a
        L_0x0176:
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.START
            r12.f5189G0 = r5
        L_0x017a:
            r5 = 18
            boolean r5 = r1.getBoolean(r5, r14)
            r12.E(r5)
            java.lang.String r5 = "http://schemas.android.com/apk/res-auto"
            if (r7 == 0) goto L_0x01a0
            java.lang.String r6 = "chipIconEnabled"
            java.lang.String r6 = r7.getAttributeValue(r5, r6)
            if (r6 == 0) goto L_0x01a0
            java.lang.String r6 = "chipIconVisible"
            java.lang.String r6 = r7.getAttributeValue(r5, r6)
            if (r6 != 0) goto L_0x01a0
            r6 = 15
            boolean r6 = r1.getBoolean(r6, r14)
            r12.E(r6)
        L_0x01a0:
            r6 = 14
            android.graphics.drawable.Drawable r6 = p0.C0320a.O(r3, r1, r6)
            r12.B(r6)
            r6 = 17
            boolean r16 = r1.hasValue(r6)
            if (r16 == 0) goto L_0x01b8
            android.content.res.ColorStateList r6 = p0.C0320a.J(r3, r1, r6)
            r12.D(r6)
        L_0x01b8:
            r6 = 16
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r6 = r1.getDimension(r6, r15)
            r12.C(r6)
            r6 = 31
            boolean r6 = r1.getBoolean(r6, r14)
            r12.M(r6)
            if (r7 == 0) goto L_0x01e7
            java.lang.String r6 = "closeIconEnabled"
            java.lang.String r6 = r7.getAttributeValue(r5, r6)
            if (r6 == 0) goto L_0x01e7
            java.lang.String r6 = "closeIconVisible"
            java.lang.String r6 = r7.getAttributeValue(r5, r6)
            if (r6 != 0) goto L_0x01e7
            r6 = 26
            boolean r6 = r1.getBoolean(r6, r14)
            r12.M(r6)
        L_0x01e7:
            r6 = 25
            android.graphics.drawable.Drawable r6 = p0.C0320a.O(r3, r1, r6)
            r12.H(r6)
            r6 = 30
            android.content.res.ColorStateList r6 = p0.C0320a.J(r3, r1, r6)
            r12.L(r6)
            r6 = 28
            float r6 = r1.getDimension(r6, r4)
            r12.J(r6)
            r6 = 6
            boolean r6 = r1.getBoolean(r6, r14)
            r12.w(r6)
            r6 = 10
            boolean r6 = r1.getBoolean(r6, r14)
            r12.z(r6)
            if (r7 == 0) goto L_0x022e
            java.lang.String r6 = "checkedIconEnabled"
            java.lang.String r6 = r7.getAttributeValue(r5, r6)
            if (r6 == 0) goto L_0x022e
            java.lang.String r6 = "checkedIconVisible"
            java.lang.String r5 = r7.getAttributeValue(r5, r6)
            if (r5 != 0) goto L_0x022e
            r5 = 8
            boolean r5 = r1.getBoolean(r5, r14)
            r12.z(r5)
        L_0x022e:
            r5 = 7
            android.graphics.drawable.Drawable r5 = p0.C0320a.O(r3, r1, r5)
            r12.x(r5)
            r5 = 9
            boolean r6 = r1.hasValue(r5)
            if (r6 == 0) goto L_0x0245
            android.content.res.ColorStateList r5 = p0.C0320a.J(r3, r1, r5)
            r12.y(r5)
        L_0x0245:
            r5 = 39
            boolean r6 = r1.hasValue(r5)
            if (r6 == 0) goto L_0x0258
            int r5 = r1.getResourceId(r5, r14)
            if (r5 == 0) goto L_0x0258
            r0.b r5 = r0.C0325b.a(r3, r5)
            goto L_0x0259
        L_0x0258:
            r5 = 0
        L_0x0259:
            r12.f5210Z = r5
            r5 = 33
            boolean r6 = r1.hasValue(r5)
            if (r6 == 0) goto L_0x026e
            int r5 = r1.getResourceId(r5, r14)
            if (r5 == 0) goto L_0x026e
            r0.b r5 = r0.C0325b.a(r3, r5)
            goto L_0x026f
        L_0x026e:
            r5 = 0
        L_0x026f:
            r12.f5211a0 = r5
            r3 = 21
            float r3 = r1.getDimension(r3, r4)
            float r5 = r12.f5212b0
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0285
            r12.f5212b0 = r3
            r12.invalidateSelf()
            r12.u()
        L_0x0285:
            r3 = 35
            float r3 = r1.getDimension(r3, r4)
            r12.O(r3)
            r3 = 34
            float r3 = r1.getDimension(r3, r4)
            r12.N(r3)
            r3 = 41
            float r3 = r1.getDimension(r3, r4)
            float r5 = r12.f5215e0
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x02ab
            r12.f5215e0 = r3
            r12.invalidateSelf()
            r12.u()
        L_0x02ab:
            r3 = 40
            float r3 = r1.getDimension(r3, r4)
            float r5 = r12.f5216f0
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x02bf
            r12.f5216f0 = r3
            r12.invalidateSelf()
            r12.u()
        L_0x02bf:
            r3 = 29
            float r3 = r1.getDimension(r3, r4)
            r12.K(r3)
            r3 = 27
            float r3 = r1.getDimension(r3, r4)
            r12.I(r3)
            r3 = 13
            float r3 = r1.getDimension(r3, r4)
            float r4 = r12.f5219i0
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x02e5
            r12.f5219i0 = r3
            r12.invalidateSelf()
            r12.u()
        L_0x02e5:
            r3 = 4
            r4 = 2147483647(0x7fffffff, float:NaN)
            int r3 = r1.getDimensionPixelSize(r3, r4)
            r12.f5192I0 = r3
            r1.recycle()
            int[] r6 = new int[r14]
            r15 = 2131821616(0x7f110430, float:1.927598E38)
            E0.m.a(r9, r7, r8, r15)
            r1 = r9
            r5 = r2
            r2 = r19
            r3 = r13
            r4 = r8
            r11 = r5
            r5 = r15
            E0.m.b(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r1 = r9.obtainStyledAttributes(r7, r13, r8, r15)
            r2 = 32
            boolean r2 = r1.getBoolean(r2, r14)
            r0.f2203s = r2
            android.content.Context r2 = r17.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 48
            float r3 = (float) r3
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = android.util.TypedValue.applyDimension(r10, r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            r3 = 20
            float r2 = r1.getDimension(r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r0.f2205u = r2
            r1.recycle()
            r0.setChipDrawable(r12)
            float r1 = N.F.i(r17)
            r12.i(r1)
            int[] r6 = new int[r14]
            r14 = 2131821616(0x7f110430, float:1.927598E38)
            E0.m.a(r9, r7, r8, r14)
            r1 = r9
            r2 = r19
            r3 = r13
            r4 = r8
            r5 = r14
            E0.m.b(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r1 = r9.obtainStyledAttributes(r7, r13, r8, r14)
            r2 = 23
            if (r11 >= r2) goto L_0x0366
            r2 = 2
            android.content.res.ColorStateList r2 = p0.C0320a.J(r9, r1, r2)
            r0.setTextColor(r2)
        L_0x0366:
            r2 = 37
            boolean r2 = r1.hasValue(r2)
            r1.recycle()
            z0.c r1 = new z0.c
            r1.<init>(r0, r0)
            r0.f2207w = r1
            r17.e()
            if (r2 != 0) goto L_0x0383
            z0.b r1 = new z0.b
            r1.<init>(r0)
            r0.setOutlineProvider(r1)
        L_0x0383:
            boolean r1 = r0.f2199o
            r0.setChecked(r1)
            java.lang.CharSequence r1 = r12.f5193J
            r0.setText(r1)
            android.text.TextUtils$TruncateAt r1 = r12.f5189G0
            r0.setEllipsize(r1)
            r17.h()
            z0.e r1 = r0.f2194j
            boolean r1 = r1.f5191H0
            if (r1 != 0) goto L_0x03a1
            r0.setLines(r10)
            r0.setHorizontallyScrolling(r10)
        L_0x03a1:
            r1 = 8388627(0x800013, float:1.175497E-38)
            r0.setGravity(r1)
            r17.g()
            boolean r1 = r0.f2203s
            if (r1 == 0) goto L_0x03b3
            int r1 = r0.f2205u
            r0.setMinHeight(r1)
        L_0x03b3:
            int r1 = r17.getLayoutDirection()
            r0.f2204t = r1
            z0.a r1 = new z0.a
            r1.<init>(r0)
            super.setOnCheckedChangeListener(r1)
            return
        L_0x03c2:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Chip does not support multi-line text"
            r1.<init>(r2)
            throw r1
        L_0x03ca:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r4)
            throw r1
        L_0x03d0:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r4)
            throw r1
        L_0x03d6:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        L_0x03de:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set left drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f2210z;
        rectF.setEmpty();
        if (c() && this.f2197m != null) {
            C0364e eVar = this.f2194j;
            Rect bounds = eVar.getBounds();
            rectF.setEmpty();
            if (eVar.T()) {
                float f2 = eVar.f5219i0 + eVar.f5218h0 + eVar.f5204T + eVar.f5217g0 + eVar.f5216f0;
                if (C0320a.R(eVar) == 0) {
                    float f3 = (float) bounds.right;
                    rectF.right = f3;
                    rectF.left = f3 - f2;
                } else {
                    float f4 = (float) bounds.left;
                    rectF.left = f4;
                    rectF.right = f4 + f2;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
        }
        return rectF;
    }

    private d getTextAppearance() {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            return eVar.f5225p0.f217f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.f2201q != z2) {
            this.f2201q = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.f2200p != z2) {
            this.f2200p = z2;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        int i2;
        int i3;
        this.f2205u = i;
        if (!this.f2203s) {
            InsetDrawable insetDrawable = this.f2195k;
            if (insetDrawable == null) {
                int[] iArr = I0.d.f287a;
                f();
            } else if (insetDrawable != null) {
                this.f2195k = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                int[] iArr2 = I0.d.f287a;
                f();
            }
        } else {
            int max = Math.max(0, i - ((int) this.f2194j.f5185E));
            int max2 = Math.max(0, i - this.f2194j.getIntrinsicWidth());
            if (max2 > 0 || max > 0) {
                if (max2 > 0) {
                    i2 = max2 / 2;
                } else {
                    i2 = 0;
                }
                if (max > 0) {
                    i3 = max / 2;
                } else {
                    i3 = 0;
                }
                if (this.f2195k != null) {
                    Rect rect = new Rect();
                    this.f2195k.getPadding(rect);
                    if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                        int[] iArr3 = I0.d.f287a;
                        f();
                        return;
                    }
                }
                if (getMinHeight() != i) {
                    setMinHeight(i);
                }
                if (getMinWidth() != i) {
                    setMinWidth(i);
                }
                this.f2195k = new InsetDrawable(this.f2194j, i2, i3, i2, i3);
                int[] iArr4 = I0.d.f287a;
                f();
                return;
            }
            InsetDrawable insetDrawable2 = this.f2195k;
            if (insetDrawable2 == null) {
                int[] iArr5 = I0.d.f287a;
                f();
            } else if (insetDrawable2 != null) {
                this.f2195k = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                int[] iArr6 = I0.d.f287a;
                f();
            }
        }
    }

    public final boolean c() {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            Drawable drawable = eVar.f5201Q;
            if (drawable == null) {
                drawable = null;
            } else if (drawable instanceof h) {
                drawable = ((G.i) ((h) drawable)).f256k;
            }
            if (drawable != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        C0364e eVar = this.f2194j;
        if (eVar == null || !eVar.f5206V) {
            return false;
        }
        return true;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        if (!this.f2208x) {
            return super.dispatchHoverEvent(motionEvent);
        }
        C0362c cVar = this.f2207w;
        AccessibilityManager accessibilityManager = cVar.f948h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                Chip chip = cVar.f5177q;
                if (!chip.c() || !chip.getCloseIconTouchBounds().contains(x2, y2)) {
                    i = 0;
                } else {
                    i = 1;
                }
                int i3 = cVar.f952m;
                if (i3 != i) {
                    cVar.f952m = i;
                    cVar.q(i, 128);
                    cVar.q(i3, 256);
                }
                if (i != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && (i2 = cVar.f952m) != Integer.MIN_VALUE) {
                if (i2 == Integer.MIN_VALUE) {
                    return true;
                }
                cVar.f952m = Integer.MIN_VALUE;
                cVar.q(i2, 256);
                return true;
            }
        }
        if (super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f2208x) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C0362c cVar = this.f2207w;
        cVar.getClass();
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                int i3 = 0;
                                while (i < repeatCount && cVar.m(i2, (Rect) null)) {
                                    i++;
                                    i3 = 1;
                                }
                                i = i3;
                                break;
                            }
                            break;
                        case 23:
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i4 = cVar.f951l;
                    if (i4 != Integer.MIN_VALUE) {
                        Chip chip = cVar.f5177q;
                        if (i4 == 0) {
                            boolean performClick = chip.performClick();
                        } else if (i4 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f2197m;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f2208x) {
                                chip.f2207w.q(1, 1);
                            }
                        }
                    }
                    i = 1;
                }
            } else if (keyEvent.hasNoModifiers()) {
                i = cVar.m(2, (Rect) null);
            } else if (keyEvent.hasModifiers(1)) {
                i = cVar.m(1, (Rect) null);
            }
        }
        if (i == 0 || cVar.f951l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public final void f() {
        this.f2196l = new RippleDrawable(I0.d.a(this.f2194j.I), getBackgroundDrawable(), (Drawable) null);
        this.f2194j.getClass();
        RippleDrawable rippleDrawable = this.f2196l;
        WeakHashMap weakHashMap = Q.f509a;
        setBackground(rippleDrawable);
        g();
    }

    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f2206v)) {
            return this.f2206v;
        }
        if (d()) {
            getParent();
            return "android.widget.Button";
        } else if (isClickable()) {
            return "android.widget.Button";
        } else {
            return "android.view.View";
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f2195k;
        if (insetDrawable == null) {
            return this.f2194j;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            return eVar.f5208X;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            return eVar.f5209Y;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            return eVar.f5183D;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            return Math.max(0.0f, eVar.r());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f2194j;
    }

    public float getChipEndPadding() {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            return eVar.f5219i0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        C0364e eVar = this.f2194j;
        if (eVar == null || (drawable = eVar.f5196L) == null) {
            return null;
        }
        if (drawable instanceof h) {
            drawable = ((G.i) ((h) drawable)).f256k;
        }
        return drawable;
    }

    public float getChipIconSize() {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            return eVar.f5198N;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            return eVar.f5197M;
        }
        return null;
    }

    public float getChipMinHeight() {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            return eVar.f5185E;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            return eVar.f5212b0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            return eVar.f5188G;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            return eVar.f5190H;
        }
        return 0.0f;
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        C0364e eVar = this.f2194j;
        if (eVar == null || (drawable = eVar.f5201Q) == null) {
            return null;
        }
        if (drawable instanceof h) {
            drawable = ((G.i) ((h) drawable)).f256k;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            return eVar.f5205U;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            return eVar.f5218h0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            return eVar.f5204T;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            return eVar.f5217g0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            return eVar.f5203S;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            return eVar.f5189G0;
        }
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        if (this.f2208x) {
            C0362c cVar = this.f2207w;
            if (cVar.f951l == 1 || cVar.f950k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C0325b getHideMotionSpec() {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            return eVar.f5211a0;
        }
        return null;
    }

    public float getIconEndPadding() {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            return eVar.f5214d0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            return eVar.f5213c0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            return eVar.I;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.f2194j.f374f.f358a;
    }

    public C0325b getShowMotionSpec() {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            return eVar.f5210Z;
        }
        return null;
    }

    public float getTextEndPadding() {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            return eVar.f5216f0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            return eVar.f5215e0;
        }
        return 0.0f;
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f2191C);
        }
        if (d()) {
            View.mergeDrawableStates(onCreateDrawableState, f2192D);
        }
        return onCreateDrawableState;
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f2206v = charSequence;
    }

    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.w(z2);
        }
    }

    public void setCheckableResource(int i) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.w(eVar.f5220j0.getResources().getBoolean(i));
        }
    }

    public void setChecked(boolean z2) {
        C0364e eVar = this.f2194j;
        if (eVar == null) {
            this.f2199o = z2;
        } else if (eVar.f5206V) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.x(drawable);
        }
    }

    public void setCheckedIconResource(int i) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.x(g.n(eVar.f5220j0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.y(C0320a.I(eVar.f5220j0, i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C0364e eVar = this.f2194j;
        if (eVar != null && eVar.f5183D != colorStateList) {
            eVar.f5183D = colorStateList;
            eVar.onStateChange(eVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList I;
        C0364e eVar = this.f2194j;
        if (eVar != null && eVar.f5183D != (I = C0320a.I(eVar.f5220j0, i))) {
            eVar.f5183D = I;
            eVar.onStateChange(eVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.A(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.A(eVar.f5220j0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C0364e eVar) {
        C0364e eVar2 = this.f2194j;
        if (eVar2 != eVar) {
            if (eVar2 != null) {
                eVar2.F0 = new WeakReference((Object) null);
            }
            this.f2194j = eVar;
            eVar.f5191H0 = false;
            eVar.F0 = new WeakReference(this);
            b(this.f2205u);
        }
    }

    public void setChipEndPadding(float f2) {
        C0364e eVar = this.f2194j;
        if (eVar != null && eVar.f5219i0 != f2) {
            eVar.f5219i0 = f2;
            eVar.invalidateSelf();
            eVar.u();
        }
    }

    public void setChipEndPaddingResource(int i) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            float dimension = eVar.f5220j0.getResources().getDimension(i);
            if (eVar.f5219i0 != dimension) {
                eVar.f5219i0 = dimension;
                eVar.invalidateSelf();
                eVar.u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.B(drawable);
        }
    }

    public void setChipIconResource(int i) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.B(g.n(eVar.f5220j0, i));
        }
    }

    public void setChipIconSize(float f2) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.C(f2);
        }
    }

    public void setChipIconSizeResource(int i) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.C(eVar.f5220j0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.D(C0320a.I(eVar.f5220j0, i));
        }
    }

    public void setChipMinHeight(float f2) {
        C0364e eVar = this.f2194j;
        if (eVar != null && eVar.f5185E != f2) {
            eVar.f5185E = f2;
            eVar.invalidateSelf();
            eVar.u();
        }
    }

    public void setChipMinHeightResource(int i) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            float dimension = eVar.f5220j0.getResources().getDimension(i);
            if (eVar.f5185E != dimension) {
                eVar.f5185E = dimension;
                eVar.invalidateSelf();
                eVar.u();
            }
        }
    }

    public void setChipStartPadding(float f2) {
        C0364e eVar = this.f2194j;
        if (eVar != null && eVar.f5212b0 != f2) {
            eVar.f5212b0 = f2;
            eVar.invalidateSelf();
            eVar.u();
        }
    }

    public void setChipStartPaddingResource(int i) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            float dimension = eVar.f5220j0.getResources().getDimension(i);
            if (eVar.f5212b0 != dimension) {
                eVar.f5212b0 = dimension;
                eVar.invalidateSelf();
                eVar.u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.F(C0320a.I(eVar.f5220j0, i));
        }
    }

    public void setChipStrokeWidth(float f2) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.G(f2);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.G(eVar.f5220j0.getResources().getDimension(i));
        }
    }

    public void setCloseIcon(Drawable drawable) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.H(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        b bVar;
        C0364e eVar = this.f2194j;
        if (eVar != null && eVar.f5205U != charSequence) {
            String str = b.f452b;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                bVar = b.e;
            } else {
                bVar = b.f454d;
            }
            bVar.getClass();
            j jVar = L.k.f464a;
            eVar.f5205U = bVar.c(charSequence);
            eVar.invalidateSelf();
        }
    }

    public void setCloseIconEndPadding(float f2) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.I(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.I(eVar.f5220j0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.H(g.n(eVar.f5220j0, i));
        }
        e();
    }

    public void setCloseIconSize(float f2) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.J(f2);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.J(eVar.f5220j0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.K(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.K(eVar.f5220j0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.L(C0320a.I(eVar.f5220j0, i));
        }
    }

    public void setCloseIconVisible(boolean z2) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.M(z2);
        }
        e();
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f2194j != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                C0364e eVar = this.f2194j;
                if (eVar != null) {
                    eVar.f5189G0 = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.f2203s = z2;
        b(this.f2205u);
    }

    public void setHideMotionSpec(C0325b bVar) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.f5211a0 = bVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.f5211a0 = C0325b.a(eVar.f5220j0, i);
        }
    }

    public void setIconEndPadding(float f2) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.N(f2);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.N(eVar.f5220j0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f2) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.O(f2);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.O(eVar.f5220j0.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(f fVar) {
    }

    public void setLayoutDirection(int i) {
        if (this.f2194j != null) {
            super.setLayoutDirection(i);
        }
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f2198n = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f2197m = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.P(colorStateList);
        }
        this.f2194j.getClass();
        f();
    }

    public void setRippleColorResource(int i) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.P(C0320a.I(eVar.f5220j0, i));
            this.f2194j.getClass();
            f();
        }
    }

    public void setShapeAppearanceModel(k kVar) {
        this.f2194j.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(C0325b bVar) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.f5210Z = bVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.f5210Z = C0325b.a(eVar.f5220j0, i);
        }
    }

    public void setSingleLine(boolean z2) {
        if (z2) {
            super.setSingleLine(z2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (eVar.f5191H0) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            super.setText(charSequence2, bufferType);
            C0364e eVar2 = this.f2194j;
            if (eVar2 != null && !TextUtils.equals(eVar2.f5193J, charSequence)) {
                eVar2.f5193J = charSequence;
                eVar2.f5225p0.f216d = true;
                eVar2.invalidateSelf();
                eVar2.u();
            }
        }
    }

    public void setTextEndPadding(float f2) {
        C0364e eVar = this.f2194j;
        if (eVar != null && eVar.f5216f0 != f2) {
            eVar.f5216f0 = f2;
            eVar.invalidateSelf();
            eVar.u();
        }
    }

    public void setTextEndPaddingResource(int i) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            float dimension = eVar.f5220j0.getResources().getDimension(i);
            if (eVar.f5216f0 != dimension) {
                eVar.f5216f0 = dimension;
                eVar.invalidateSelf();
                eVar.u();
            }
        }
    }

    public void setTextStartPadding(float f2) {
        C0364e eVar = this.f2194j;
        if (eVar != null && eVar.f5215e0 != f2) {
            eVar.f5215e0 = f2;
            eVar.invalidateSelf();
            eVar.u();
        }
    }

    public void setTextStartPaddingResource(int i) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            float dimension = eVar.f5220j0.getResources().getDimension(i);
            if (eVar.f5215e0 != dimension) {
                eVar.f5215e0 = dimension;
                eVar.invalidateSelf();
                eVar.u();
            }
        }
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        Rect rect = this.f2209y;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        C0364e eVar = this.f2194j;
        boolean z2 = false;
        if (eVar != null && C0364e.t(eVar.f5201Q)) {
            C0364e eVar2 = this.f2194j;
            int isEnabled = isEnabled();
            if (this.f2202r) {
                isEnabled++;
            }
            if (this.f2201q) {
                isEnabled++;
            }
            if (this.f2200p) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.f2202r) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f2201q) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f2200p) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(eVar2.f5184D0, iArr)) {
                eVar2.f5184D0 = iArr;
                if (eVar2.T()) {
                    z2 = eVar2.v(eVar2.getState(), iArr);
                }
            }
        }
        if (z2) {
            invalidate();
        }
    }

    public final void e() {
        C0364e eVar;
        if (!c() || (eVar = this.f2194j) == null || !eVar.f5200P || this.f2197m == null) {
            Q.p(this, (C0002b) null);
            this.f2208x = false;
            return;
        }
        Q.p(this, this.f2207w);
        this.f2208x = true;
    }

    public final void g() {
        C0364e eVar;
        if (!TextUtils.isEmpty(getText()) && (eVar = this.f2194j) != null) {
            int q2 = (int) (eVar.q() + eVar.f5219i0 + eVar.f5216f0);
            C0364e eVar2 = this.f2194j;
            int p2 = (int) (eVar2.p() + eVar2.f5212b0 + eVar2.f5215e0);
            if (this.f2195k != null) {
                Rect rect = new Rect();
                this.f2195k.getPadding(rect);
                p2 += rect.left;
                q2 += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap weakHashMap = Q.f509a;
            setPaddingRelative(p2, paddingTop, q2, paddingBottom);
        }
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public final void h() {
        TextPaint paint = getPaint();
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            paint.drawableState = eVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f2193A);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0320a.B0(this, this.f2194j);
    }

    public final void onFocusChanged(boolean z2, int i, Rect rect) {
        super.onFocusChanged(z2, i, rect);
        if (this.f2208x) {
            C0362c cVar = this.f2207w;
            int i2 = cVar.f951l;
            if (i2 != Integer.MIN_VALUE) {
                cVar.j(i2);
            }
            if (z2) {
                cVar.m(i, rect);
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(d());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f2204t != i) {
            this.f2204t = i;
            g();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0059 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 == r3) goto L_0x002c
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0045
            goto L_0x0050
        L_0x0021:
            boolean r0 = r5.f2200p
            if (r0 == 0) goto L_0x0050
            if (r1 != 0) goto L_0x002a
            r5.setCloseIconPressed(r2)
        L_0x002a:
            r0 = 1
            goto L_0x0051
        L_0x002c:
            boolean r0 = r5.f2200p
            if (r0 == 0) goto L_0x0045
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f2197m
            if (r0 == 0) goto L_0x003a
            r0.onClick(r5)
        L_0x003a:
            boolean r0 = r5.f2208x
            if (r0 == 0) goto L_0x0043
            z0.c r0 = r5.f2207w
            r0.q(r3, r3)
        L_0x0043:
            r0 = 1
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            r5.setCloseIconPressed(r2)
            goto L_0x0051
        L_0x004a:
            if (r1 == 0) goto L_0x0050
            r5.setCloseIconPressed(r3)
            goto L_0x002a
        L_0x0050:
            r0 = 0
        L_0x0051:
            if (r0 != 0) goto L_0x0059
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x005a
        L_0x0059:
            r2 = 1
        L_0x005a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f2196l) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f2196l) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.i(f2);
        }
    }

    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.f5192I0 = i;
        }
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public final void setTextSize(int i, float f2) {
        super.setTextSize(i, f2);
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            float applyDimension = TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics());
            E0.k kVar = eVar.f5225p0;
            d dVar = kVar.f217f;
            if (dVar != null) {
                dVar.f280k = applyDimension;
                kVar.f213a.setTextSize(applyDimension);
                eVar.u();
                eVar.invalidateSelf();
            }
        }
        h();
    }

    public void setCheckedIconVisible(boolean z2) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.z(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.E(z2);
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.Q(new d(eVar.f5220j0, i));
        }
        h();
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C0364e eVar = this.f2194j;
        if (eVar != null) {
            eVar.Q(new d(eVar.f5220j0, i));
        }
        h();
    }
}
