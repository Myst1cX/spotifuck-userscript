package com.google.android.material.textfield;

import E0.c;
import E0.m;
import F.a;
import H0.d;
import K0.e;
import K0.f;
import K0.g;
import K0.k;
import L.b;
import L.j;
import N.C0007g;
import N.Q;
import N0.A;
import N0.B;
import N0.C;
import N0.D;
import N0.E;
import N0.F;
import N0.h;
import N0.l;
import N0.n;
import N0.q;
import N0.t;
import N0.u;
import N0.x;
import N0.z;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import n0.C0227h;
import n0.C0236q;
import o.C0273d0;
import o.C0297p0;
import o.C0302s;
import p0.C0320a;
import r0.C0324a;

public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: H0  reason: collision with root package name */
    public static final int[][] f2336H0 = {new int[]{16842919}, new int[0]};

    /* renamed from: A  reason: collision with root package name */
    public int f2337A;
    public final c A0;

    /* renamed from: B  reason: collision with root package name */
    public C0227h f2338B;

    /* renamed from: B0  reason: collision with root package name */
    public boolean f2339B0;

    /* renamed from: C  reason: collision with root package name */
    public C0227h f2340C;

    /* renamed from: C0  reason: collision with root package name */
    public boolean f2341C0;

    /* renamed from: D  reason: collision with root package name */
    public ColorStateList f2342D;

    /* renamed from: D0  reason: collision with root package name */
    public ValueAnimator f2343D0;

    /* renamed from: E  reason: collision with root package name */
    public ColorStateList f2344E;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f2345E0;

    /* renamed from: F  reason: collision with root package name */
    public ColorStateList f2346F;
    public boolean F0;

    /* renamed from: G  reason: collision with root package name */
    public ColorStateList f2347G;

    /* renamed from: G0  reason: collision with root package name */
    public boolean f2348G0;

    /* renamed from: H  reason: collision with root package name */
    public boolean f2349H;
    public CharSequence I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f2350J;

    /* renamed from: K  reason: collision with root package name */
    public g f2351K;

    /* renamed from: L  reason: collision with root package name */
    public g f2352L;

    /* renamed from: M  reason: collision with root package name */
    public StateListDrawable f2353M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f2354N;

    /* renamed from: O  reason: collision with root package name */
    public g f2355O;

    /* renamed from: P  reason: collision with root package name */
    public g f2356P;

    /* renamed from: Q  reason: collision with root package name */
    public k f2357Q;

    /* renamed from: R  reason: collision with root package name */
    public boolean f2358R;

    /* renamed from: S  reason: collision with root package name */
    public final int f2359S;

    /* renamed from: T  reason: collision with root package name */
    public int f2360T;

    /* renamed from: U  reason: collision with root package name */
    public int f2361U;

    /* renamed from: V  reason: collision with root package name */
    public int f2362V;

    /* renamed from: W  reason: collision with root package name */
    public int f2363W;

    /* renamed from: a0  reason: collision with root package name */
    public int f2364a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f2365b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f2366c0;

    /* renamed from: d0  reason: collision with root package name */
    public final Rect f2367d0 = new Rect();

    /* renamed from: e0  reason: collision with root package name */
    public final Rect f2368e0 = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final FrameLayout f2369f;

    /* renamed from: f0  reason: collision with root package name */
    public final RectF f2370f0 = new RectF();

    /* renamed from: g  reason: collision with root package name */
    public final z f2371g;

    /* renamed from: g0  reason: collision with root package name */
    public Typeface f2372g0;

    /* renamed from: h  reason: collision with root package name */
    public final q f2373h;

    /* renamed from: h0  reason: collision with root package name */
    public ColorDrawable f2374h0;
    public EditText i;

    /* renamed from: i0  reason: collision with root package name */
    public int f2375i0;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f2376j;

    /* renamed from: j0  reason: collision with root package name */
    public final LinkedHashSet f2377j0 = new LinkedHashSet();

    /* renamed from: k  reason: collision with root package name */
    public int f2378k = -1;

    /* renamed from: k0  reason: collision with root package name */
    public ColorDrawable f2379k0;

    /* renamed from: l  reason: collision with root package name */
    public int f2380l = -1;

    /* renamed from: l0  reason: collision with root package name */
    public int f2381l0;

    /* renamed from: m  reason: collision with root package name */
    public int f2382m = -1;
    public Drawable m0;

    /* renamed from: n  reason: collision with root package name */
    public int f2383n = -1;

    /* renamed from: n0  reason: collision with root package name */
    public ColorStateList f2384n0;

    /* renamed from: o  reason: collision with root package name */
    public final u f2385o = new u(this);

    /* renamed from: o0  reason: collision with root package name */
    public ColorStateList f2386o0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2387p;

    /* renamed from: p0  reason: collision with root package name */
    public int f2388p0;

    /* renamed from: q  reason: collision with root package name */
    public int f2389q;

    /* renamed from: q0  reason: collision with root package name */
    public int f2390q0;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2391r;

    /* renamed from: r0  reason: collision with root package name */
    public int f2392r0;

    /* renamed from: s  reason: collision with root package name */
    public E f2393s = new C0007g(1);

    /* renamed from: s0  reason: collision with root package name */
    public ColorStateList f2394s0;

    /* renamed from: t  reason: collision with root package name */
    public C0273d0 f2395t;

    /* renamed from: t0  reason: collision with root package name */
    public int f2396t0;

    /* renamed from: u  reason: collision with root package name */
    public int f2397u;

    /* renamed from: u0  reason: collision with root package name */
    public int f2398u0;

    /* renamed from: v  reason: collision with root package name */
    public int f2399v;

    /* renamed from: v0  reason: collision with root package name */
    public int f2400v0;

    /* renamed from: w  reason: collision with root package name */
    public CharSequence f2401w;

    /* renamed from: w0  reason: collision with root package name */
    public int f2402w0;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2403x;

    /* renamed from: x0  reason: collision with root package name */
    public int f2404x0;

    /* renamed from: y  reason: collision with root package name */
    public C0273d0 f2405y;

    /* renamed from: y0  reason: collision with root package name */
    public int f2406y0;

    /* renamed from: z  reason: collision with root package name */
    public ColorStateList f2407z;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f2408z0;

    private Drawable getEditTextBoxBackground() {
        int i2;
        EditText editText = this.i;
        if (!(editText instanceof AutoCompleteTextView) || C0320a.b0(editText)) {
            return this.f2351K;
        }
        int H2 = C0320a.H(this.i, 2130968836);
        int i3 = this.f2360T;
        int[][] iArr = f2336H0;
        if (i3 == 2) {
            Context context = getContext();
            g gVar = this.f2351K;
            TypedValue s02 = C0320a.s0(context, 2130968876, "TextInputLayout");
            int i4 = s02.resourceId;
            if (i4 != 0) {
                i2 = C0320a.F(context, i4);
            } else {
                i2 = s02.data;
            }
            g gVar2 = new g(gVar.f374f.f358a);
            int h02 = C0320a.h0(H2, i2, 0.1f);
            gVar2.j(new ColorStateList(iArr, new int[]{h02, 0}));
            gVar2.setTint(i2);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{h02, i2});
            g gVar3 = new g(gVar.f374f.f358a);
            gVar3.setTint(-1);
            return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else if (i3 != 1) {
            return null;
        } else {
            g gVar4 = this.f2351K;
            int i5 = this.f2366c0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{C0320a.h0(H2, i5, 0.1f), i5}), gVar4, gVar4);
        }
    }

    public final void a(float f2) {
        c cVar = this.A0;
        if (cVar.f162b != f2) {
            if (this.f2343D0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f2343D0 = valueAnimator;
                valueAnimator.setInterpolator(C0320a.r0(getContext(), 2130969438, C0324a.f4556b));
                this.f2343D0.setDuration((long) C0320a.q0(getContext(), 2130969428, 167));
                this.f2343D0.addUpdateListener(new C(0, this));
            }
            this.f2343D0.setFloatValues(new float[]{cVar.f162b, f2});
            this.f2343D0.start();
        }
    }

    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.F0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.F0 = false;
    }

    public final void n(Editable editable) {
        int i2;
        boolean z2;
        int i3;
        b bVar;
        ((C0007g) this.f2393s).getClass();
        if (editable != null) {
            i2 = editable.length();
        } else {
            i2 = 0;
        }
        boolean z3 = this.f2391r;
        int i4 = this.f2389q;
        String str = null;
        if (i4 == -1) {
            this.f2395t.setText(String.valueOf(i2));
            this.f2395t.setContentDescription((CharSequence) null);
            this.f2391r = false;
        } else {
            if (i2 > i4) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f2391r = z2;
            Context context = getContext();
            C0273d0 d0Var = this.f2395t;
            int i5 = this.f2389q;
            if (this.f2391r) {
                i3 = 2131755058;
            } else {
                i3 = 2131755057;
            }
            d0Var.setContentDescription(context.getString(i3, new Object[]{Integer.valueOf(i2), Integer.valueOf(i5)}));
            if (z3 != this.f2391r) {
                o();
            }
            String str2 = b.f452b;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                bVar = b.e;
            } else {
                bVar = b.f454d;
            }
            C0273d0 d0Var2 = this.f2395t;
            String string = getContext().getString(2131755059, new Object[]{Integer.valueOf(i2), Integer.valueOf(this.f2389q)});
            if (string == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                j jVar = L.k.f464a;
                str = bVar.c(string).toString();
            }
            d0Var2.setText(str);
        }
        if (this.i != null && z3 != this.f2391r) {
            u(false, false);
            x();
            r();
        }
    }

    public void setEndIconContentDescription(int i2) {
        q qVar = this.f2373h;
        CharSequence text = i2 != 0 ? qVar.getResources().getText(i2) : null;
        CheckableImageButton checkableImageButton = qVar.f661l;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i2) {
        q qVar = this.f2373h;
        Drawable n2 = i2 != 0 ? T0.g.n(qVar.getContext(), i2) : null;
        CheckableImageButton checkableImageButton = qVar.f661l;
        checkableImageButton.setImageDrawable(n2);
        if (n2 != null) {
            ColorStateList colorStateList = qVar.f665p;
            PorterDuff.Mode mode = qVar.f666q;
            TextInputLayout textInputLayout = qVar.f656f;
            C0320a.d(textInputLayout, checkableImageButton, colorStateList, mode);
            C0320a.n0(textInputLayout, checkableImageButton, qVar.f665p);
        }
    }

    public void setErrorIconDrawable(int i2) {
        q qVar = this.f2373h;
        qVar.i(i2 != 0 ? T0.g.n(qVar.getContext(), i2) : null);
        C0320a.n0(qVar.f656f, qVar.f658h, qVar.i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f2349H) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
        q qVar = this.f2373h;
        qVar.f661l.setContentDescription(i2 != 0 ? qVar.getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
        q qVar = this.f2373h;
        qVar.f661l.setImageDrawable(i2 != 0 ? T0.g.n(qVar.getContext(), i2) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2371g.i;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i2) {
        setStartIconDrawable(i2 != 0 ? T0.g.n(getContext(), i2) : null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r18, android.util.AttributeSet r19) {
        /*
            r17 = this;
            r0 = r17
            r7 = r19
            r8 = 2130969780(0x7f0404b4, float:1.7548252E38)
            r9 = 2131821409(0x7f110361, float:1.927556E38)
            r1 = r18
            android.content.Context r1 = P0.a.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.f2378k = r10
            r0.f2380l = r10
            r0.f2382m = r10
            r0.f2383n = r10
            N0.u r1 = new N0.u
            r1.<init>(r0)
            r0.f2385o = r1
            N.g r1 = new N.g
            r2 = 1
            r1.<init>(r2)
            r0.f2393s = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f2367d0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f2368e0 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f2370f0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f2377j0 = r1
            E0.c r1 = new E0.c
            r1.<init>(r0)
            r0.A0 = r1
            r11 = 0
            r0.f2348G0 = r11
            android.content.Context r12 = r17.getContext()
            r13 = 1
            r0.setOrientation(r13)
            r0.setWillNotDraw(r11)
            r0.setAddStatesFromChildren(r13)
            android.widget.FrameLayout r14 = new android.widget.FrameLayout
            r14.<init>(r12)
            r0.f2369f = r14
            r14.setAddStatesFromChildren(r13)
            android.view.animation.LinearInterpolator r2 = r0.C0324a.f4555a
            r1.f150Q = r2
            r1.h(r11)
            r1.f149P = r2
            r1.h(r11)
            int r2 = r1.f171g
            r3 = 8388659(0x800033, float:1.1755015E-38)
            if (r2 == r3) goto L_0x0081
            r1.f171g = r3
            r1.h(r11)
        L_0x0081:
            int[] r15 = q0.C0322a.f4482A
            r6 = 22
            r5 = 20
            r4 = 40
            r3 = 45
            r2 = 49
            int[] r16 = new int[]{r6, r5, r4, r3, r2}
            r1 = 2131821409(0x7f110361, float:1.927556E38)
            E0.m.a(r12, r7, r8, r1)
            r18 = 2131821409(0x7f110361, float:1.927556E38)
            r1 = r12
            r2 = r19
            r3 = r15
            r4 = r8
            r5 = r18
            r6 = r16
            E0.m.b(r1, r2, r3, r4, r5, r6)
            android.support.v4.media.session.t r1 = new android.support.v4.media.session.t
            r2 = 2131821409(0x7f110361, float:1.927556E38)
            android.content.res.TypedArray r2 = r12.obtainStyledAttributes(r7, r15, r8, r2)
            r1.<init>((android.content.Context) r12, (android.content.res.TypedArray) r2)
            N0.z r3 = new N0.z
            r3.<init>(r0, r1)
            r0.f2371g = r3
            r4 = 48
            boolean r4 = r2.getBoolean(r4, r13)
            r0.f2349H = r4
            r4 = 4
            java.lang.CharSequence r4 = r2.getText(r4)
            r0.setHint((java.lang.CharSequence) r4)
            r4 = 47
            boolean r4 = r2.getBoolean(r4, r13)
            r0.f2341C0 = r4
            r4 = 42
            boolean r4 = r2.getBoolean(r4, r13)
            r0.f2339B0 = r4
            r4 = 6
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x00e8
            int r4 = r2.getInt(r4, r10)
            r0.setMinEms(r4)
            goto L_0x00f6
        L_0x00e8:
            r4 = 3
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x00f6
            int r4 = r2.getDimensionPixelSize(r4, r10)
            r0.setMinWidth(r4)
        L_0x00f6:
            r4 = 5
            boolean r5 = r2.hasValue(r4)
            r6 = 2
            if (r5 == 0) goto L_0x0106
            int r4 = r2.getInt(r4, r10)
            r0.setMaxEms(r4)
            goto L_0x0113
        L_0x0106:
            boolean r4 = r2.hasValue(r6)
            if (r4 == 0) goto L_0x0113
            int r4 = r2.getDimensionPixelSize(r6, r10)
            r0.setMaxWidth(r4)
        L_0x0113:
            K0.j r4 = K0.k.b(r12, r7, r8, r9)
            K0.k r4 = r4.a()
            r0.f2357Q = r4
            android.content.res.Resources r4 = r12.getResources()
            r5 = 2131165950(0x7f0702fe, float:1.7946132E38)
            int r4 = r4.getDimensionPixelOffset(r5)
            r0.f2359S = r4
            r4 = 9
            int r4 = r2.getDimensionPixelOffset(r4, r11)
            r0.f2361U = r4
            android.content.res.Resources r4 = r12.getResources()
            r5 = 2131165951(0x7f0702ff, float:1.7946134E38)
            int r4 = r4.getDimensionPixelSize(r5)
            r5 = 16
            int r4 = r2.getDimensionPixelSize(r5, r4)
            r0.f2363W = r4
            android.content.res.Resources r4 = r12.getResources()
            r5 = 2131165952(0x7f070300, float:1.7946136E38)
            int r4 = r4.getDimensionPixelSize(r5)
            r5 = 17
            int r4 = r2.getDimensionPixelSize(r5, r4)
            r0.f2364a0 = r4
            int r4 = r0.f2363W
            r0.f2362V = r4
            r4 = 13
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r2.getDimension(r4, r5)
            r7 = 12
            float r7 = r2.getDimension(r7, r5)
            r8 = 10
            float r8 = r2.getDimension(r8, r5)
            r9 = 11
            float r5 = r2.getDimension(r9, r5)
            K0.k r9 = r0.f2357Q
            K0.j r9 = r9.e()
            r15 = 0
            int r16 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r16 < 0) goto L_0x0188
            K0.a r6 = new K0.a
            r6.<init>(r4)
            r9.e = r6
        L_0x0188:
            int r4 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r4 < 0) goto L_0x0193
            K0.a r4 = new K0.a
            r4.<init>(r7)
            r9.f399f = r4
        L_0x0193:
            int r4 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r4 < 0) goto L_0x019e
            K0.a r4 = new K0.a
            r4.<init>(r8)
            r9.f400g = r4
        L_0x019e:
            int r4 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r4 < 0) goto L_0x01a9
            K0.a r4 = new K0.a
            r4.<init>(r5)
            r9.f401h = r4
        L_0x01a9:
            K0.k r4 = r9.a()
            r0.f2357Q = r4
            r4 = 7
            android.content.res.ColorStateList r4 = p0.C0320a.K(r12, r1, r4)
            if (r4 == 0) goto L_0x020f
            int r5 = r4.getDefaultColor()
            r0.f2396t0 = r5
            r0.f2366c0 = r5
            boolean r5 = r4.isStateful()
            r6 = 16843623(0x1010367, float:2.3696E-38)
            r7 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r5 == 0) goto L_0x01ef
            int[] r5 = new int[]{r7}
            int r5 = r4.getColorForState(r5, r10)
            r0.f2398u0 = r5
            r5 = 16842908(0x101009c, float:2.3693995E-38)
            r7 = 16842910(0x101009e, float:2.3694E-38)
            int[] r5 = new int[]{r5, r7}
            int r5 = r4.getColorForState(r5, r10)
            r0.f2400v0 = r5
            int[] r5 = new int[]{r6, r7}
            int r4 = r4.getColorForState(r5, r10)
            r0.f2402w0 = r4
            goto L_0x0219
        L_0x01ef:
            int r4 = r0.f2396t0
            r0.f2400v0 = r4
            r4 = 2131100371(0x7f0602d3, float:1.7813122E38)
            android.content.res.ColorStateList r4 = p0.C0320a.I(r12, r4)
            int[] r5 = new int[]{r7}
            int r5 = r4.getColorForState(r5, r10)
            r0.f2398u0 = r5
            int[] r5 = new int[]{r6}
            int r4 = r4.getColorForState(r5, r10)
            r0.f2402w0 = r4
            goto L_0x0219
        L_0x020f:
            r0.f2366c0 = r11
            r0.f2396t0 = r11
            r0.f2398u0 = r11
            r0.f2400v0 = r11
            r0.f2402w0 = r11
        L_0x0219:
            boolean r4 = r2.hasValue(r13)
            if (r4 == 0) goto L_0x0227
            android.content.res.ColorStateList r4 = r1.n(r13)
            r0.f2386o0 = r4
            r0.f2384n0 = r4
        L_0x0227:
            r4 = 14
            android.content.res.ColorStateList r5 = p0.C0320a.K(r12, r1, r4)
            int r4 = r2.getColor(r4, r11)
            r0.f2392r0 = r4
            r4 = 2131100398(0x7f0602ee, float:1.7813176E38)
            int r4 = p0.C0320a.F(r12, r4)
            r0.f2388p0 = r4
            r4 = 2131100399(0x7f0602ef, float:1.7813178E38)
            int r4 = p0.C0320a.F(r12, r4)
            r0.f2404x0 = r4
            r4 = 2131100402(0x7f0602f2, float:1.7813184E38)
            int r4 = p0.C0320a.F(r12, r4)
            r0.f2390q0 = r4
            if (r5 == 0) goto L_0x0253
            r0.setBoxStrokeColorStateList(r5)
        L_0x0253:
            r4 = 15
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x0262
            android.content.res.ColorStateList r4 = p0.C0320a.K(r12, r1, r4)
            r0.setBoxStrokeErrorColor(r4)
        L_0x0262:
            r4 = 49
            int r5 = r2.getResourceId(r4, r10)
            if (r5 == r10) goto L_0x0271
            int r4 = r2.getResourceId(r4, r11)
            r0.setHintTextAppearance(r4)
        L_0x0271:
            r4 = 24
            android.content.res.ColorStateList r4 = r1.n(r4)
            r0.f2346F = r4
            r4 = 25
            android.content.res.ColorStateList r4 = r1.n(r4)
            r0.f2347G = r4
            r4 = 40
            int r4 = r2.getResourceId(r4, r11)
            r5 = 35
            java.lang.CharSequence r5 = r2.getText(r5)
            r6 = 34
            int r6 = r2.getInt(r6, r13)
            r7 = 36
            boolean r7 = r2.getBoolean(r7, r11)
            r8 = 45
            int r8 = r2.getResourceId(r8, r11)
            r9 = 44
            boolean r9 = r2.getBoolean(r9, r11)
            r12 = 43
            java.lang.CharSequence r12 = r2.getText(r12)
            r15 = 57
            int r15 = r2.getResourceId(r15, r11)
            r13 = 56
            java.lang.CharSequence r13 = r2.getText(r13)
            r10 = 18
            boolean r10 = r2.getBoolean(r10, r11)
            r11 = 19
            r19 = r12
            r12 = -1
            int r11 = r2.getInt(r11, r12)
            r0.setCounterMaxLength(r11)
            r11 = 0
            r12 = 22
            int r12 = r2.getResourceId(r12, r11)
            r0.f2399v = r12
            r12 = 20
            int r12 = r2.getResourceId(r12, r11)
            r0.f2397u = r12
            r12 = 8
            int r12 = r2.getInt(r12, r11)
            r0.setBoxBackgroundMode(r12)
            r0.setErrorContentDescription(r5)
            r0.setErrorAccessibilityLiveRegion(r6)
            int r5 = r0.f2397u
            r0.setCounterOverflowTextAppearance(r5)
            r0.setHelperTextTextAppearance(r8)
            r0.setErrorTextAppearance(r4)
            int r4 = r0.f2399v
            r0.setCounterTextAppearance(r4)
            r0.setPlaceholderText(r13)
            r0.setPlaceholderTextAppearance(r15)
            r4 = 41
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x030e
            android.content.res.ColorStateList r4 = r1.n(r4)
            r0.setErrorTextColor(r4)
        L_0x030e:
            r4 = 46
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x031d
            android.content.res.ColorStateList r4 = r1.n(r4)
            r0.setHelperTextColor(r4)
        L_0x031d:
            r4 = 50
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x032c
            android.content.res.ColorStateList r4 = r1.n(r4)
            r0.setHintTextColor(r4)
        L_0x032c:
            r4 = 23
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x033b
            android.content.res.ColorStateList r4 = r1.n(r4)
            r0.setCounterTextColor(r4)
        L_0x033b:
            r4 = 21
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x034a
            android.content.res.ColorStateList r4 = r1.n(r4)
            r0.setCounterOverflowTextColor(r4)
        L_0x034a:
            r4 = 58
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x0359
            android.content.res.ColorStateList r4 = r1.n(r4)
            r0.setPlaceholderTextColor(r4)
        L_0x0359:
            N0.q r4 = new N0.q
            r4.<init>(r0, r1)
            r0.f2373h = r4
            r5 = 0
            r6 = 1
            boolean r2 = r2.getBoolean(r5, r6)
            r1.C()
            r1 = 2
            r0.setImportantForAccessibility(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r5 = 26
            if (r1 < r5) goto L_0x0378
            if (r1 < r5) goto L_0x0378
            N.H.m(r0, r6)
        L_0x0378:
            r14.addView(r3)
            r14.addView(r4)
            r0.addView(r14)
            r0.setEnabled(r2)
            r0.setHelperTextEnabled(r9)
            r0.setErrorEnabled(r7)
            r0.setCounterEnabled(r10)
            r1 = r19
            r0.setHelperText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f2353M == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f2353M = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.f2353M.addState(new int[0], f(false));
        }
        return this.f2353M;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f2352L == null) {
            this.f2352L = f(true);
        }
        return this.f2352L;
    }

    private void setEditText(EditText editText) {
        if (this.i == null) {
            if (getEndIconMode() != 3) {
                boolean z2 = editText instanceof TextInputEditText;
            }
            this.i = editText;
            int i2 = this.f2378k;
            if (i2 != -1) {
                setMinEms(i2);
            } else {
                setMinWidth(this.f2382m);
            }
            int i3 = this.f2380l;
            if (i3 != -1) {
                setMaxEms(i3);
            } else {
                setMaxWidth(this.f2383n);
            }
            this.f2354N = false;
            i();
            setTextInputAccessibilityDelegate(new D(this));
            Typeface typeface = this.i.getTypeface();
            c cVar = this.A0;
            cVar.m(typeface);
            float textSize = this.i.getTextSize();
            if (cVar.f172h != textSize) {
                cVar.f172h = textSize;
                cVar.h(false);
            }
            int i4 = Build.VERSION.SDK_INT;
            float letterSpacing = this.i.getLetterSpacing();
            if (cVar.f156W != letterSpacing) {
                cVar.f156W = letterSpacing;
                cVar.h(false);
            }
            int gravity = this.i.getGravity();
            int i5 = (gravity & -113) | 48;
            if (cVar.f171g != i5) {
                cVar.f171g = i5;
                cVar.h(false);
            }
            if (cVar.f169f != gravity) {
                cVar.f169f = gravity;
                cVar.h(false);
            }
            WeakHashMap weakHashMap = Q.f509a;
            this.f2406y0 = editText.getMinimumHeight();
            this.i.addTextChangedListener(new A(this, editText));
            if (this.f2384n0 == null) {
                this.f2384n0 = this.i.getHintTextColors();
            }
            if (this.f2349H) {
                if (TextUtils.isEmpty(this.I)) {
                    CharSequence hint = this.i.getHint();
                    this.f2376j = hint;
                    setHint(hint);
                    this.i.setHint((CharSequence) null);
                }
                this.f2350J = true;
            }
            if (i4 >= 29) {
                p();
            }
            if (this.f2395t != null) {
                n(this.i.getText());
            }
            r();
            this.f2385o.b();
            this.f2371g.bringToFront();
            q qVar = this.f2373h;
            qVar.bringToFront();
            Iterator it2 = this.f2377j0.iterator();
            while (it2.hasNext()) {
                ((n) it2.next()).a(this);
            }
            qVar.m();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            u(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.I)) {
            this.I = charSequence;
            c cVar = this.A0;
            if (charSequence == null || !TextUtils.equals(cVar.f135A, charSequence)) {
                cVar.f135A = charSequence;
                cVar.f136B = null;
                Bitmap bitmap = cVar.f139E;
                if (bitmap != null) {
                    bitmap.recycle();
                    cVar.f139E = null;
                }
                cVar.h(false);
            }
            if (!this.f2408z0) {
                j();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f2403x != z2) {
            if (z2) {
                C0273d0 d0Var = this.f2405y;
                if (d0Var != null) {
                    this.f2369f.addView(d0Var);
                    this.f2405y.setVisibility(0);
                }
            } else {
                C0273d0 d0Var2 = this.f2405y;
                if (d0Var2 != null) {
                    d0Var2.setVisibility(8);
                }
                this.f2405y = null;
            }
            this.f2403x = z2;
        }
    }

    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            FrameLayout frameLayout = this.f2369f;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            t();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i2, layoutParams);
    }

    public final void b() {
        ColorStateList colorStateList;
        int i2;
        int i3;
        g gVar = this.f2351K;
        if (gVar != null) {
            k kVar = gVar.f374f.f358a;
            k kVar2 = this.f2357Q;
            if (kVar != kVar2) {
                gVar.setShapeAppearanceModel(kVar2);
            }
            if (this.f2360T == 2 && (i2 = this.f2362V) > -1 && (i3 = this.f2365b0) != 0) {
                g gVar2 = this.f2351K;
                gVar2.f374f.f365j = (float) i2;
                gVar2.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i3);
                f fVar = gVar2.f374f;
                if (fVar.f361d != valueOf) {
                    fVar.f361d = valueOf;
                    gVar2.onStateChange(gVar2.getState());
                }
            }
            int i4 = this.f2366c0;
            if (this.f2360T == 1) {
                i4 = a.b(this.f2366c0, C0320a.G(getContext(), 2130968876, 0));
            }
            this.f2366c0 = i4;
            this.f2351K.j(ColorStateList.valueOf(i4));
            g gVar3 = this.f2355O;
            if (!(gVar3 == null || this.f2356P == null)) {
                if (this.f2362V > -1 && this.f2365b0 != 0) {
                    if (this.i.isFocused()) {
                        colorStateList = ColorStateList.valueOf(this.f2388p0);
                    } else {
                        colorStateList = ColorStateList.valueOf(this.f2365b0);
                    }
                    gVar3.j(colorStateList);
                    this.f2356P.j(ColorStateList.valueOf(this.f2365b0));
                }
                invalidate();
            }
            s();
        }
    }

    public final int c() {
        float d2;
        if (!this.f2349H) {
            return 0;
        }
        int i2 = this.f2360T;
        c cVar = this.A0;
        if (i2 == 0) {
            d2 = cVar.d();
        } else if (i2 != 2) {
            return 0;
        } else {
            d2 = cVar.d() / 2.0f;
        }
        return (int) d2;
    }

    public final C0227h d() {
        C0227h hVar = new C0227h();
        hVar.f4000c = (long) C0320a.q0(getContext(), 2130969430, 87);
        hVar.f4001d = C0320a.r0(getContext(), 2130969440, C0324a.f4555a);
        return hVar;
    }

    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText = this.i;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        if (this.f2376j != null) {
            boolean z2 = this.f2350J;
            this.f2350J = false;
            CharSequence hint = editText.getHint();
            this.i.setHint(this.f2376j);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i2);
            } finally {
                this.i.setHint(hint);
                this.f2350J = z2;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i2);
            onProvideAutofillVirtualStructure(viewStructure, i2);
            FrameLayout frameLayout = this.f2369f;
            viewStructure.setChildCount(frameLayout.getChildCount());
            for (int i3 = 0; i3 < frameLayout.getChildCount(); i3++) {
                View childAt = frameLayout.getChildAt(i3);
                ViewStructure newChild = viewStructure.newChild(i3);
                childAt.dispatchProvideAutofillStructure(newChild, i2);
                if (childAt == this.i) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    public final void draw(Canvas canvas) {
        g gVar;
        int i2;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z2 = this.f2349H;
        c cVar = this.A0;
        if (z2) {
            cVar.getClass();
            int save = canvas.save();
            if (cVar.f136B != null) {
                RectF rectF = cVar.e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = cVar.f147N;
                    textPaint.setTextSize(cVar.f141G);
                    float f2 = cVar.f179p;
                    float f3 = cVar.f180q;
                    float f4 = cVar.f140F;
                    if (f4 != 1.0f) {
                        canvas2.scale(f4, f4, f2, f3);
                    }
                    if (cVar.f167d0 <= 1 || cVar.f137C) {
                        canvas2.translate(f2, f3);
                        cVar.f158Y.draw(canvas2);
                    } else {
                        int alpha = textPaint.getAlpha();
                        canvas2.translate(cVar.f179p - ((float) cVar.f158Y.getLineStart(0)), f3);
                        float f5 = (float) alpha;
                        textPaint.setAlpha((int) (cVar.f163b0 * f5));
                        int i3 = Build.VERSION.SDK_INT;
                        if (i3 >= 31) {
                            float f6 = cVar.f142H;
                            float f7 = cVar.I;
                            float f8 = cVar.f143J;
                            int i4 = cVar.f144K;
                            textPaint.setShadowLayer(f6, f7, f8, a.d(i4, (textPaint.getAlpha() * Color.alpha(i4)) / 255));
                        }
                        cVar.f158Y.draw(canvas2);
                        textPaint.setAlpha((int) (cVar.f161a0 * f5));
                        if (i3 >= 31) {
                            float f9 = cVar.f142H;
                            float f10 = cVar.I;
                            float f11 = cVar.f143J;
                            int i5 = cVar.f144K;
                            textPaint.setShadowLayer(f9, f10, f11, a.d(i5, (Color.alpha(i5) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = cVar.f158Y.getLineBaseline(0);
                        CharSequence charSequence = cVar.f165c0;
                        float f12 = (float) lineBaseline;
                        float f13 = f12;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, textPaint);
                        if (i3 >= 31) {
                            textPaint.setShadowLayer(cVar.f142H, cVar.I, cVar.f143J, cVar.f144K);
                        }
                        String trim = cVar.f165c0.toString().trim();
                        if (trim.endsWith("…")) {
                            i2 = 0;
                            trim = trim.substring(0, trim.length() - 1);
                        } else {
                            i2 = 0;
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(cVar.f158Y.getLineEnd(i2), str.length()), 0.0f, f13, textPaint);
                    }
                    canvas2.restoreToCount(save);
                }
            }
        }
        if (this.f2356P != null && (gVar = this.f2355O) != null) {
            gVar.draw(canvas2);
            if (this.i.isFocused()) {
                Rect bounds = this.f2356P.getBounds();
                Rect bounds2 = this.f2355O.getBounds();
                float f14 = cVar.f162b;
                int centerX = bounds2.centerX();
                bounds.left = C0324a.c(centerX, bounds2.left, f14);
                bounds.right = C0324a.c(centerX, bounds2.right, f14);
                this.f2356P.draw(canvas2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.f2345E0
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r4.f2345E0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            E0.c r3 = r4.A0
            if (r3 == 0) goto L_0x002f
            r3.f145L = r1
            android.content.res.ColorStateList r1 = r3.f174k
            if (r1 == 0) goto L_0x0020
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L_0x002a
        L_0x0020:
            android.content.res.ColorStateList r1 = r3.f173j
            if (r1 == 0) goto L_0x002f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L_0x002f
        L_0x002a:
            r3.h(r2)
            r1 = 1
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            android.widget.EditText r3 = r4.i
            if (r3 == 0) goto L_0x0047
            java.util.WeakHashMap r3 = N.Q.f509a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L_0x0043
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            r4.u(r0, r2)
        L_0x0047:
            r4.r()
            r4.x()
            if (r1 == 0) goto L_0x0052
            r4.invalidate()
        L_0x0052:
            r4.f2345E0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final boolean e() {
        if (!this.f2349H || TextUtils.isEmpty(this.I) || !(this.f2351K instanceof h)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [p0.a, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v0, types: [p0.a, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v0, types: [p0.a, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v0, types: [p0.a, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v3, types: [K0.k, java.lang.Object] */
    public final g f(boolean z2) {
        float f2;
        float f3;
        ColorStateList colorStateList;
        int i2;
        float dimensionPixelOffset = (float) getResources().getDimensionPixelOffset(2131165924);
        if (z2) {
            f2 = dimensionPixelOffset;
        } else {
            f2 = 0.0f;
        }
        EditText editText = this.i;
        if (editText instanceof x) {
            f3 = ((x) editText).getPopupElevation();
        } else {
            f3 = (float) getResources().getDimensionPixelOffset(2131165517);
        }
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(2131165861);
        ? obj = new Object();
        ? obj2 = new Object();
        ? obj3 = new Object();
        ? obj4 = new Object();
        e eVar = new e(0);
        e eVar2 = new e(0);
        e eVar3 = new e(0);
        e eVar4 = new e(0);
        K0.a aVar = new K0.a(f2);
        K0.a aVar2 = new K0.a(f2);
        K0.a aVar3 = new K0.a(dimensionPixelOffset);
        K0.a aVar4 = new K0.a(dimensionPixelOffset);
        ? obj5 = new Object();
        obj5.f405a = obj;
        obj5.f406b = obj2;
        obj5.f407c = obj3;
        obj5.f408d = obj4;
        obj5.e = aVar;
        obj5.f409f = aVar2;
        obj5.f410g = aVar4;
        obj5.f411h = aVar3;
        obj5.i = eVar;
        obj5.f412j = eVar2;
        obj5.f413k = eVar3;
        obj5.f414l = eVar4;
        EditText editText2 = this.i;
        if (editText2 instanceof x) {
            colorStateList = ((x) editText2).getDropDownBackgroundTintList();
        } else {
            colorStateList = null;
        }
        Context context = getContext();
        if (colorStateList == null) {
            Paint paint = g.f372B;
            TypedValue s02 = C0320a.s0(context, 2130968876, g.class.getSimpleName());
            int i3 = s02.resourceId;
            if (i3 != 0) {
                i2 = C0320a.F(context, i3);
            } else {
                i2 = s02.data;
            }
            colorStateList = ColorStateList.valueOf(i2);
        }
        g gVar = new g();
        gVar.h(context);
        gVar.j(colorStateList);
        gVar.i(f3);
        gVar.setShapeAppearanceModel(obj5);
        f fVar = gVar.f374f;
        if (fVar.f363g == null) {
            fVar.f363g = new Rect();
        }
        gVar.f374f.f363g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i2, boolean z2) {
        int compoundPaddingLeft;
        if (!z2 && getPrefixText() != null) {
            compoundPaddingLeft = this.f2371g.a();
        } else if (!z2 || getSuffixText() == null) {
            compoundPaddingLeft = this.i.getCompoundPaddingLeft();
        } else {
            compoundPaddingLeft = this.f2373h.c();
        }
        return compoundPaddingLeft + i2;
    }

    public int getBaseline() {
        EditText editText = this.i;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public g getBoxBackground() {
        int i2 = this.f2360T;
        if (i2 == 1 || i2 == 2) {
            return this.f2351K;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f2366c0;
    }

    public int getBoxBackgroundMode() {
        return this.f2360T;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f2361U;
    }

    public int getBoxStrokeColor() {
        return this.f2392r0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f2394s0;
    }

    public int getBoxStrokeWidth() {
        return this.f2363W;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f2364a0;
    }

    public int getCounterMaxLength() {
        return this.f2389q;
    }

    public CharSequence getCounterOverflowDescription() {
        C0273d0 d0Var;
        if (!this.f2387p || !this.f2391r || (d0Var = this.f2395t) == null) {
            return null;
        }
        return d0Var.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f2344E;
    }

    public ColorStateList getCounterTextColor() {
        return this.f2342D;
    }

    public ColorStateList getCursorColor() {
        return this.f2346F;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f2347G;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f2384n0;
    }

    public EditText getEditText() {
        return this.i;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f2373h.f661l.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f2373h.f661l.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f2373h.f667r;
    }

    public int getEndIconMode() {
        return this.f2373h.f663n;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f2373h.f668s;
    }

    public CheckableImageButton getEndIconView() {
        return this.f2373h.f661l;
    }

    public CharSequence getError() {
        u uVar = this.f2385o;
        if (uVar.f701q) {
            return uVar.f700p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f2385o.f704t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f2385o.f703s;
    }

    public int getErrorCurrentTextColors() {
        C0273d0 d0Var = this.f2385o.f702r;
        if (d0Var != null) {
            return d0Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f2373h.f658h.getDrawable();
    }

    public CharSequence getHelperText() {
        u uVar = this.f2385o;
        if (uVar.f708x) {
            return uVar.f707w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0273d0 d0Var = this.f2385o.f709y;
        if (d0Var != null) {
            return d0Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f2349H) {
            return this.I;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.A0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        c cVar = this.A0;
        return cVar.e(cVar.f174k);
    }

    public ColorStateList getHintTextColor() {
        return this.f2386o0;
    }

    public E getLengthCounter() {
        return this.f2393s;
    }

    public int getMaxEms() {
        return this.f2380l;
    }

    public int getMaxWidth() {
        return this.f2383n;
    }

    public int getMinEms() {
        return this.f2378k;
    }

    public int getMinWidth() {
        return this.f2382m;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f2373h.f661l.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f2373h.f661l.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f2403x) {
            return this.f2401w;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f2337A;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f2407z;
    }

    public CharSequence getPrefixText() {
        return this.f2371g.f728h;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f2371g.f727g.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f2371g.f727g;
    }

    public k getShapeAppearanceModel() {
        return this.f2357Q;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f2371g.i.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f2371g.i.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f2371g.f731l;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f2371g.f732m;
    }

    public CharSequence getSuffixText() {
        return this.f2373h.f670u;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f2373h.f671v.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f2373h.f671v;
    }

    public Typeface getTypeface() {
        return this.f2372g0;
    }

    public final int h(int i2, boolean z2) {
        int compoundPaddingRight;
        if (!z2 && getSuffixText() != null) {
            compoundPaddingRight = this.f2373h.c();
        } else if (!z2 || getPrefixText() == null) {
            compoundPaddingRight = this.i.getCompoundPaddingRight();
        } else {
            compoundPaddingRight = this.f2371g.a();
        }
        return i2 - compoundPaddingRight;
    }

    /* JADX WARNING: type inference failed for: r0v37, types: [N0.h, K0.g] */
    public final void i() {
        int i2 = this.f2360T;
        if (i2 == 0) {
            this.f2351K = null;
            this.f2355O = null;
            this.f2356P = null;
        } else if (i2 == 1) {
            this.f2351K = new g(this.f2357Q);
            this.f2355O = new g();
            this.f2356P = new g();
        } else if (i2 == 2) {
            if (!this.f2349H || (this.f2351K instanceof h)) {
                this.f2351K = new g(this.f2357Q);
            } else {
                k kVar = this.f2357Q;
                int i3 = h.f630D;
                if (kVar == null) {
                    kVar = new k();
                }
                N0.g gVar = new N0.g(kVar, new RectF());
                ? gVar2 = new g((f) gVar);
                gVar2.f631C = gVar;
                this.f2351K = gVar2;
            }
            this.f2355O = null;
            this.f2356P = null;
        } else {
            throw new IllegalArgumentException(this.f2360T + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
        s();
        x();
        if (this.f2360T == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f2361U = getResources().getDimensionPixelSize(2131165756);
            } else if (C0320a.d0(getContext())) {
                this.f2361U = getResources().getDimensionPixelSize(2131165755);
            }
        }
        if (this.i != null && this.f2360T == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.i;
                WeakHashMap weakHashMap = Q.f509a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(2131165754), this.i.getPaddingEnd(), getResources().getDimensionPixelSize(2131165753));
            } else if (C0320a.d0(getContext())) {
                EditText editText2 = this.i;
                WeakHashMap weakHashMap2 = Q.f509a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(2131165752), this.i.getPaddingEnd(), getResources().getDimensionPixelSize(2131165751));
            }
        }
        if (this.f2360T != 0) {
            t();
        }
        EditText editText3 = this.i;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i4 = this.f2360T;
                if (i4 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i4 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final boolean m() {
        u uVar = this.f2385o;
        if (uVar.f699o != 1 || uVar.f702r == null || TextUtils.isEmpty(uVar.f700p)) {
            return false;
        }
        return true;
    }

    public final void o() {
        int i2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0273d0 d0Var = this.f2395t;
        if (d0Var != null) {
            if (this.f2391r) {
                i2 = this.f2397u;
            } else {
                i2 = this.f2399v;
            }
            l(d0Var, i2);
            if (!this.f2391r && (colorStateList2 = this.f2342D) != null) {
                this.f2395t.setTextColor(colorStateList2);
            }
            if (this.f2391r && (colorStateList = this.f2344E) != null) {
                this.f2395t.setTextColor(colorStateList);
            }
        }
    }

    public final void onGlobalLayout() {
        int max;
        q qVar = this.f2373h;
        qVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.f2348G0 = false;
        if (this.i != null && this.i.getMeasuredHeight() < (max = Math.max(qVar.getMeasuredHeight(), this.f2371g.getMeasuredHeight()))) {
            this.i.setMinimumHeight(max);
            z2 = true;
        }
        boolean q2 = q();
        if (z2 || q2) {
            this.i.post(new C.a(5, (Object) this));
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof F)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        F f2 = (F) parcelable;
        super.onRestoreInstanceState(f2.f940a);
        setError(f2.f612c);
        if (f2.f613d) {
            post(new B(0, this));
        }
        requestLayout();
    }

    public final void p() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f2346F;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue o02 = C0320a.o0(context, 2130968835);
            if (o02 != null) {
                int i2 = o02.resourceId;
                if (i2 != 0) {
                    colorStateList2 = C0320a.I(context, i2);
                } else {
                    int i3 = o02.data;
                    if (i3 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i3);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.i;
        if (editText != null && editText.getTextCursorDrawable() != null) {
            Drawable mutate = C0320a.J0(this.i.getTextCursorDrawable()).mutate();
            if ((m() || (this.f2395t != null && this.f2391r)) && (colorStateList = this.f2347G) != null) {
                colorStateList2 = colorStateList;
            }
            G.a.h(mutate, colorStateList2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.i
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.graphics.drawable.Drawable r0 = r10.getStartIconDrawable()
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            if (r0 != 0) goto L_0x0020
            java.lang.CharSequence r0 = r10.getPrefixText()
            if (r0 == 0) goto L_0x005f
            android.widget.TextView r0 = r10.getPrefixTextView()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x005f
        L_0x0020:
            N0.z r0 = r10.f2371g
            int r6 = r0.getMeasuredWidth()
            if (r6 <= 0) goto L_0x005f
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.i
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.ColorDrawable r6 = r10.f2374h0
            if (r6 == 0) goto L_0x003b
            int r6 = r10.f2375i0
            if (r6 == r0) goto L_0x0047
        L_0x003b:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f2374h0 = r6
            r10.f2375i0 = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0047:
            android.widget.EditText r0 = r10.i
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            r6 = r0[r1]
            android.graphics.drawable.ColorDrawable r7 = r10.f2374h0
            if (r6 == r7) goto L_0x0078
            android.widget.EditText r6 = r10.i
            r8 = r0[r5]
            r9 = r0[r3]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r7, r8, r9, r0)
            goto L_0x0076
        L_0x005f:
            android.graphics.drawable.ColorDrawable r0 = r10.f2374h0
            if (r0 == 0) goto L_0x0078
            android.widget.EditText r0 = r10.i
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            android.widget.EditText r6 = r10.i
            r7 = r0[r5]
            r8 = r0[r3]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r2, r7, r8, r0)
            r10.f2374h0 = r2
        L_0x0076:
            r0 = 1
            goto L_0x0079
        L_0x0078:
            r0 = 0
        L_0x0079:
            N0.q r6 = r10.f2373h
            boolean r7 = r6.e()
            if (r7 != 0) goto L_0x008f
            int r7 = r6.f663n
            if (r7 == 0) goto L_0x008b
            boolean r7 = r6.d()
            if (r7 != 0) goto L_0x008f
        L_0x008b:
            java.lang.CharSequence r7 = r6.f670u
            if (r7 == 0) goto L_0x0110
        L_0x008f:
            int r7 = r6.getMeasuredWidth()
            if (r7 <= 0) goto L_0x0110
            o.d0 r7 = r6.f671v
            int r7 = r7.getMeasuredWidth()
            android.widget.EditText r8 = r10.i
            int r8 = r8.getPaddingRight()
            int r7 = r7 - r8
            boolean r8 = r6.e()
            if (r8 == 0) goto L_0x00ab
            com.google.android.material.internal.CheckableImageButton r2 = r6.f658h
            goto L_0x00b7
        L_0x00ab:
            int r8 = r6.f663n
            if (r8 == 0) goto L_0x00b7
            boolean r8 = r6.d()
            if (r8 == 0) goto L_0x00b7
            com.google.android.material.internal.CheckableImageButton r2 = r6.f661l
        L_0x00b7:
            if (r2 == 0) goto L_0x00ca
            int r6 = r2.getMeasuredWidth()
            int r6 = r6 + r7
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r2 = r2.getMarginStart()
            int r7 = r2 + r6
        L_0x00ca:
            android.widget.EditText r2 = r10.i
            android.graphics.drawable.Drawable[] r2 = r2.getCompoundDrawablesRelative()
            android.graphics.drawable.ColorDrawable r6 = r10.f2379k0
            if (r6 == 0) goto L_0x00eb
            int r8 = r10.f2381l0
            if (r8 == r7) goto L_0x00eb
            r10.f2381l0 = r7
            r6.setBounds(r1, r1, r7, r5)
            android.widget.EditText r0 = r10.i
            r1 = r2[r1]
            r3 = r2[r5]
            android.graphics.drawable.ColorDrawable r6 = r10.f2379k0
            r2 = r2[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r6, r2)
            goto L_0x010e
        L_0x00eb:
            if (r6 != 0) goto L_0x00f9
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f2379k0 = r6
            r10.f2381l0 = r7
            r6.setBounds(r1, r1, r7, r5)
        L_0x00f9:
            r3 = r2[r3]
            android.graphics.drawable.ColorDrawable r6 = r10.f2379k0
            if (r3 == r6) goto L_0x010d
            r10.m0 = r3
            android.widget.EditText r0 = r10.i
            r1 = r2[r1]
            r3 = r2[r5]
            r2 = r2[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r6, r2)
            goto L_0x010e
        L_0x010d:
            r5 = r0
        L_0x010e:
            r0 = r5
            goto L_0x0132
        L_0x0110:
            android.graphics.drawable.ColorDrawable r6 = r10.f2379k0
            if (r6 == 0) goto L_0x0132
            android.widget.EditText r6 = r10.i
            android.graphics.drawable.Drawable[] r6 = r6.getCompoundDrawablesRelative()
            r3 = r6[r3]
            android.graphics.drawable.ColorDrawable r7 = r10.f2379k0
            if (r3 != r7) goto L_0x012e
            android.widget.EditText r0 = r10.i
            r1 = r6[r1]
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.m0
            r4 = r6[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r7, r4)
            goto L_0x012f
        L_0x012e:
            r5 = r0
        L_0x012f:
            r10.f2379k0 = r2
            goto L_0x010e
        L_0x0132:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.q():boolean");
    }

    public final void r() {
        Drawable background;
        C0273d0 d0Var;
        EditText editText = this.i;
        if (editText != null && this.f2360T == 0 && (background = editText.getBackground()) != null) {
            int[] iArr = C0297p0.f4281a;
            Drawable mutate = background.mutate();
            if (m()) {
                mutate.setColorFilter(C0302s.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
            } else if (!this.f2391r || (d0Var = this.f2395t) == null) {
                C0320a.m(mutate);
                this.i.refreshDrawableState();
            } else {
                mutate.setColorFilter(C0302s.c(d0Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public final void s() {
        EditText editText = this.i;
        if (editText != null && this.f2351K != null) {
            if ((this.f2354N || editText.getBackground() == null) && this.f2360T != 0) {
                Drawable editTextBoxBackground = getEditTextBoxBackground();
                EditText editText2 = this.i;
                WeakHashMap weakHashMap = Q.f509a;
                editText2.setBackground(editTextBoxBackground);
                this.f2354N = true;
            }
        }
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.f2366c0 != i2) {
            this.f2366c0 = i2;
            this.f2396t0 = i2;
            this.f2400v0 = i2;
            this.f2402w0 = i2;
            b();
        }
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 != this.f2360T) {
            this.f2360T = i2;
            if (this.i != null) {
                i();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i2) {
        this.f2361U = i2;
    }

    public void setBoxCornerFamily(int i2) {
        K0.j e = this.f2357Q.e();
        K0.c cVar = this.f2357Q.e;
        C0320a s2 = C0320a.s(i2);
        e.f395a = s2;
        K0.j.b(s2);
        e.e = cVar;
        K0.c cVar2 = this.f2357Q.f409f;
        C0320a s3 = C0320a.s(i2);
        e.f396b = s3;
        K0.j.b(s3);
        e.f399f = cVar2;
        K0.c cVar3 = this.f2357Q.f411h;
        C0320a s4 = C0320a.s(i2);
        e.f398d = s4;
        K0.j.b(s4);
        e.f401h = cVar3;
        K0.c cVar4 = this.f2357Q.f410g;
        C0320a s5 = C0320a.s(i2);
        e.f397c = s5;
        K0.j.b(s5);
        e.f400g = cVar4;
        this.f2357Q = e.a();
        b();
    }

    public void setBoxStrokeColor(int i2) {
        if (this.f2392r0 != i2) {
            this.f2392r0 = i2;
            x();
        }
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f2394s0 != colorStateList) {
            this.f2394s0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i2) {
        this.f2363W = i2;
        x();
    }

    public void setBoxStrokeWidthFocused(int i2) {
        this.f2364a0 = i2;
        x();
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f2387p != z2) {
            Editable editable = null;
            u uVar = this.f2385o;
            if (z2) {
                C0273d0 d0Var = new C0273d0(getContext(), (AttributeSet) null);
                this.f2395t = d0Var;
                d0Var.setId(2131296748);
                Typeface typeface = this.f2372g0;
                if (typeface != null) {
                    this.f2395t.setTypeface(typeface);
                }
                this.f2395t.setMaxLines(1);
                uVar.a(this.f2395t, 2);
                ((ViewGroup.MarginLayoutParams) this.f2395t.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(2131165953));
                o();
                if (this.f2395t != null) {
                    EditText editText = this.i;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    n(editable);
                }
            } else {
                uVar.g(this.f2395t, 2);
                this.f2395t = null;
            }
            this.f2387p = z2;
        }
    }

    public void setCounterMaxLength(int i2) {
        Editable editable;
        if (this.f2389q != i2) {
            if (i2 > 0) {
                this.f2389q = i2;
            } else {
                this.f2389q = -1;
            }
            if (this.f2387p && this.f2395t != null) {
                EditText editText = this.i;
                if (editText == null) {
                    editable = null;
                } else {
                    editable = editText.getText();
                }
                n(editable);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.f2397u != i2) {
            this.f2397u = i2;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f2344E != colorStateList) {
            this.f2344E = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.f2399v != i2) {
            this.f2399v = i2;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f2342D != colorStateList) {
            this.f2342D = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f2346F != colorStateList) {
            this.f2346F = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f2347G != colorStateList) {
            this.f2347G = colorStateList;
            if (m() || (this.f2395t != null && this.f2391r)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f2384n0 = colorStateList;
        this.f2386o0 = colorStateList;
        if (this.i != null) {
            u(false, false);
        }
    }

    public void setEndIconActivated(boolean z2) {
        this.f2373h.f661l.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f2373h.f661l.setCheckable(z2);
    }

    public void setEndIconMinSize(int i2) {
        q qVar = this.f2373h;
        if (i2 < 0) {
            qVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        } else if (i2 != qVar.f667r) {
            qVar.f667r = i2;
            CheckableImageButton checkableImageButton = qVar.f661l;
            checkableImageButton.setMinimumWidth(i2);
            checkableImageButton.setMinimumHeight(i2);
            CheckableImageButton checkableImageButton2 = qVar.f658h;
            checkableImageButton2.setMinimumWidth(i2);
            checkableImageButton2.setMinimumHeight(i2);
        }
    }

    public void setEndIconMode(int i2) {
        this.f2373h.g(i2);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f2373h;
        View.OnLongClickListener onLongClickListener = qVar.f669t;
        CheckableImageButton checkableImageButton = qVar.f661l;
        checkableImageButton.setOnClickListener(onClickListener);
        C0320a.w0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f2373h;
        qVar.f669t = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f661l;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C0320a.w0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        q qVar = this.f2373h;
        qVar.f668s = scaleType;
        qVar.f661l.setScaleType(scaleType);
        qVar.f658h.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        q qVar = this.f2373h;
        if (qVar.f665p != colorStateList) {
            qVar.f665p = colorStateList;
            C0320a.d(qVar.f656f, qVar.f661l, colorStateList, qVar.f666q);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f2373h;
        if (qVar.f666q != mode) {
            qVar.f666q = mode;
            C0320a.d(qVar.f656f, qVar.f661l, qVar.f665p, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f2373h.h(z2);
    }

    public void setError(CharSequence charSequence) {
        u uVar = this.f2385o;
        if (!uVar.f701q) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            uVar.c();
            uVar.f700p = charSequence;
            uVar.f702r.setText(charSequence);
            int i2 = uVar.f698n;
            if (i2 != 1) {
                uVar.f699o = 1;
            }
            uVar.i(i2, uVar.f699o, uVar.h(uVar.f702r, charSequence));
            return;
        }
        uVar.f();
    }

    public void setErrorAccessibilityLiveRegion(int i2) {
        u uVar = this.f2385o;
        uVar.f704t = i2;
        C0273d0 d0Var = uVar.f702r;
        if (d0Var != null) {
            WeakHashMap weakHashMap = Q.f509a;
            d0Var.setAccessibilityLiveRegion(i2);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        u uVar = this.f2385o;
        uVar.f703s = charSequence;
        C0273d0 d0Var = uVar.f702r;
        if (d0Var != null) {
            d0Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        u uVar = this.f2385o;
        if (uVar.f701q != z2) {
            uVar.c();
            TextInputLayout textInputLayout = uVar.f693h;
            if (z2) {
                C0273d0 d0Var = new C0273d0(uVar.f692g, (AttributeSet) null);
                uVar.f702r = d0Var;
                d0Var.setId(2131296749);
                uVar.f702r.setTextAlignment(5);
                Typeface typeface = uVar.f686B;
                if (typeface != null) {
                    uVar.f702r.setTypeface(typeface);
                }
                int i2 = uVar.f705u;
                uVar.f705u = i2;
                C0273d0 d0Var2 = uVar.f702r;
                if (d0Var2 != null) {
                    textInputLayout.l(d0Var2, i2);
                }
                ColorStateList colorStateList = uVar.f706v;
                uVar.f706v = colorStateList;
                C0273d0 d0Var3 = uVar.f702r;
                if (!(d0Var3 == null || colorStateList == null)) {
                    d0Var3.setTextColor(colorStateList);
                }
                CharSequence charSequence = uVar.f703s;
                uVar.f703s = charSequence;
                C0273d0 d0Var4 = uVar.f702r;
                if (d0Var4 != null) {
                    d0Var4.setContentDescription(charSequence);
                }
                int i3 = uVar.f704t;
                uVar.f704t = i3;
                C0273d0 d0Var5 = uVar.f702r;
                if (d0Var5 != null) {
                    WeakHashMap weakHashMap = Q.f509a;
                    d0Var5.setAccessibilityLiveRegion(i3);
                }
                uVar.f702r.setVisibility(4);
                uVar.a(uVar.f702r, 0);
            } else {
                uVar.f();
                uVar.g(uVar.f702r, 0);
                uVar.f702r = null;
                textInputLayout.r();
                textInputLayout.x();
            }
            uVar.f701q = z2;
        }
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f2373h;
        CheckableImageButton checkableImageButton = qVar.f658h;
        View.OnLongClickListener onLongClickListener = qVar.f660k;
        checkableImageButton.setOnClickListener(onClickListener);
        C0320a.w0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f2373h;
        qVar.f660k = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f658h;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C0320a.w0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        q qVar = this.f2373h;
        if (qVar.i != colorStateList) {
            qVar.i = colorStateList;
            C0320a.d(qVar.f656f, qVar.f658h, colorStateList, qVar.f659j);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f2373h;
        if (qVar.f659j != mode) {
            qVar.f659j = mode;
            C0320a.d(qVar.f656f, qVar.f658h, qVar.i, mode);
        }
    }

    public void setErrorTextAppearance(int i2) {
        u uVar = this.f2385o;
        uVar.f705u = i2;
        C0273d0 d0Var = uVar.f702r;
        if (d0Var != null) {
            uVar.f693h.l(d0Var, i2);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        u uVar = this.f2385o;
        uVar.f706v = colorStateList;
        C0273d0 d0Var = uVar.f702r;
        if (d0Var != null && colorStateList != null) {
            d0Var.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f2339B0 != z2) {
            this.f2339B0 = z2;
            u(false, false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        u uVar = this.f2385o;
        uVar.f685A = colorStateList;
        C0273d0 d0Var = uVar.f709y;
        if (d0Var != null && colorStateList != null) {
            d0Var.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z2) {
        u uVar = this.f2385o;
        if (uVar.f708x != z2) {
            uVar.c();
            if (z2) {
                C0273d0 d0Var = new C0273d0(uVar.f692g, (AttributeSet) null);
                uVar.f709y = d0Var;
                d0Var.setId(2131296750);
                uVar.f709y.setTextAlignment(5);
                Typeface typeface = uVar.f686B;
                if (typeface != null) {
                    uVar.f709y.setTypeface(typeface);
                }
                uVar.f709y.setVisibility(4);
                uVar.f709y.setAccessibilityLiveRegion(1);
                int i2 = uVar.f710z;
                uVar.f710z = i2;
                C0273d0 d0Var2 = uVar.f709y;
                if (d0Var2 != null) {
                    C0320a.C0(d0Var2, i2);
                }
                ColorStateList colorStateList = uVar.f685A;
                uVar.f685A = colorStateList;
                C0273d0 d0Var3 = uVar.f709y;
                if (!(d0Var3 == null || colorStateList == null)) {
                    d0Var3.setTextColor(colorStateList);
                }
                uVar.a(uVar.f709y, 1);
                uVar.f709y.setAccessibilityDelegate(new t(uVar));
            } else {
                uVar.c();
                int i3 = uVar.f698n;
                if (i3 == 2) {
                    uVar.f699o = 0;
                }
                uVar.i(i3, uVar.f699o, uVar.h(uVar.f709y, ""));
                uVar.g(uVar.f709y, 1);
                uVar.f709y = null;
                TextInputLayout textInputLayout = uVar.f693h;
                textInputLayout.r();
                textInputLayout.x();
            }
            uVar.f708x = z2;
        }
    }

    public void setHelperTextTextAppearance(int i2) {
        u uVar = this.f2385o;
        uVar.f710z = i2;
        C0273d0 d0Var = uVar.f709y;
        if (d0Var != null) {
            C0320a.C0(d0Var, i2);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f2341C0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f2349H) {
            this.f2349H = z2;
            if (!z2) {
                this.f2350J = false;
                if (!TextUtils.isEmpty(this.I) && TextUtils.isEmpty(this.i.getHint())) {
                    this.i.setHint(this.I);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.i.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.I)) {
                        setHint(hint);
                    }
                    this.i.setHint((CharSequence) null);
                }
                this.f2350J = true;
            }
            if (this.i != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i2) {
        c cVar = this.A0;
        TextInputLayout textInputLayout = cVar.f160a;
        d dVar = new d(textInputLayout.getContext(), i2);
        ColorStateList colorStateList = dVar.f279j;
        if (colorStateList != null) {
            cVar.f174k = colorStateList;
        }
        float f2 = dVar.f280k;
        if (f2 != 0.0f) {
            cVar.i = f2;
        }
        ColorStateList colorStateList2 = dVar.f272a;
        if (colorStateList2 != null) {
            cVar.f154U = colorStateList2;
        }
        cVar.f152S = dVar.e;
        cVar.f153T = dVar.f276f;
        cVar.f151R = dVar.f277g;
        cVar.f155V = dVar.i;
        H0.a aVar = cVar.f188y;
        if (aVar != null) {
            aVar.f266q = true;
        }
        A.b bVar = new A.b(1, (Object) cVar);
        dVar.a();
        cVar.f188y = new H0.a(bVar, dVar.f283n);
        dVar.c(textInputLayout.getContext(), cVar.f188y);
        cVar.h(false);
        this.f2386o0 = cVar.f174k;
        if (this.i != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f2386o0 != colorStateList) {
            if (this.f2384n0 == null) {
                c cVar = this.A0;
                if (cVar.f174k != colorStateList) {
                    cVar.f174k = colorStateList;
                    cVar.h(false);
                }
            }
            this.f2386o0 = colorStateList;
            if (this.i != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(E e) {
        this.f2393s = e;
    }

    public void setMaxEms(int i2) {
        this.f2380l = i2;
        EditText editText = this.i;
        if (editText != null && i2 != -1) {
            editText.setMaxEms(i2);
        }
    }

    public void setMaxWidth(int i2) {
        this.f2383n = i2;
        EditText editText = this.i;
        if (editText != null && i2 != -1) {
            editText.setMaxWidth(i2);
        }
    }

    public void setMinEms(int i2) {
        this.f2378k = i2;
        EditText editText = this.i;
        if (editText != null && i2 != -1) {
            editText.setMinEms(i2);
        }
    }

    public void setMinWidth(int i2) {
        this.f2382m = i2;
        EditText editText = this.i;
        if (editText != null && i2 != -1) {
            editText.setMinWidth(i2);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        q qVar = this.f2373h;
        if (z2 && qVar.f663n != 1) {
            qVar.g(1);
        } else if (!z2) {
            qVar.g(0);
        } else {
            qVar.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        q qVar = this.f2373h;
        qVar.f665p = colorStateList;
        C0320a.d(qVar.f656f, qVar.f661l, colorStateList, qVar.f666q);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        q qVar = this.f2373h;
        qVar.f666q = mode;
        C0320a.d(qVar.f656f, qVar.f661l, qVar.f665p, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.f2405y == null) {
            C0273d0 d0Var = new C0273d0(getContext(), (AttributeSet) null);
            this.f2405y = d0Var;
            d0Var.setId(2131296751);
            this.f2405y.setImportantForAccessibility(2);
            C0227h d2 = d();
            this.f2338B = d2;
            d2.f3999b = 67;
            this.f2340C = d();
            setPlaceholderTextAppearance(this.f2337A);
            setPlaceholderTextColor(this.f2407z);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f2403x) {
                setPlaceholderTextEnabled(true);
            }
            this.f2401w = charSequence;
        }
        EditText editText = this.i;
        if (editText != null) {
            editable = editText.getText();
        }
        v(editable);
    }

    public void setPlaceholderTextAppearance(int i2) {
        this.f2337A = i2;
        C0273d0 d0Var = this.f2405y;
        if (d0Var != null) {
            C0320a.C0(d0Var, i2);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f2407z != colorStateList) {
            this.f2407z = colorStateList;
            C0273d0 d0Var = this.f2405y;
            if (d0Var != null && colorStateList != null) {
                d0Var.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        z zVar = this.f2371g;
        zVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        zVar.f728h = charSequence2;
        zVar.f727g.setText(charSequence);
        zVar.e();
    }

    public void setPrefixTextAppearance(int i2) {
        C0320a.C0(this.f2371g.f727g, i2);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f2371g.f727g.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.f2351K;
        if (gVar != null && gVar.f374f.f358a != kVar) {
            this.f2357Q = kVar;
            b();
        }
    }

    public void setStartIconCheckable(boolean z2) {
        this.f2371g.i.setCheckable(z2);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f2371g.b(drawable);
    }

    public void setStartIconMinSize(int i2) {
        z zVar = this.f2371g;
        if (i2 < 0) {
            zVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        } else if (i2 != zVar.f731l) {
            zVar.f731l = i2;
            CheckableImageButton checkableImageButton = zVar.i;
            checkableImageButton.setMinimumWidth(i2);
            checkableImageButton.setMinimumHeight(i2);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        z zVar = this.f2371g;
        View.OnLongClickListener onLongClickListener = zVar.f733n;
        CheckableImageButton checkableImageButton = zVar.i;
        checkableImageButton.setOnClickListener(onClickListener);
        C0320a.w0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        z zVar = this.f2371g;
        zVar.f733n = onLongClickListener;
        CheckableImageButton checkableImageButton = zVar.i;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C0320a.w0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        z zVar = this.f2371g;
        zVar.f732m = scaleType;
        zVar.i.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        z zVar = this.f2371g;
        if (zVar.f729j != colorStateList) {
            zVar.f729j = colorStateList;
            C0320a.d(zVar.f726f, zVar.i, colorStateList, zVar.f730k);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        z zVar = this.f2371g;
        if (zVar.f730k != mode) {
            zVar.f730k = mode;
            C0320a.d(zVar.f726f, zVar.i, zVar.f729j, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f2371g.c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        q qVar = this.f2373h;
        qVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        qVar.f670u = charSequence2;
        qVar.f671v.setText(charSequence);
        qVar.n();
    }

    public void setSuffixTextAppearance(int i2) {
        C0320a.C0(this.f2373h.f671v, i2);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f2373h.f671v.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(D d2) {
        EditText editText = this.i;
        if (editText != null) {
            Q.p(editText, d2);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f2372g0) {
            this.f2372g0 = typeface;
            this.A0.m(typeface);
            u uVar = this.f2385o;
            if (typeface != uVar.f686B) {
                uVar.f686B = typeface;
                C0273d0 d0Var = uVar.f702r;
                if (d0Var != null) {
                    d0Var.setTypeface(typeface);
                }
                C0273d0 d0Var2 = uVar.f709y;
                if (d0Var2 != null) {
                    d0Var2.setTypeface(typeface);
                }
            }
            C0273d0 d0Var3 = this.f2395t;
            if (d0Var3 != null) {
                d0Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f2360T != 1) {
            FrameLayout frameLayout = this.f2369f;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c2 = c();
            if (c2 != layoutParams.topMargin) {
                layoutParams.topMargin = c2;
                frameLayout.requestLayout();
            }
        }
    }

    public final void v(Editable editable) {
        int i2;
        ((C0007g) this.f2393s).getClass();
        if (editable != null) {
            i2 = editable.length();
        } else {
            i2 = 0;
        }
        FrameLayout frameLayout = this.f2369f;
        if (i2 != 0 || this.f2408z0) {
            C0273d0 d0Var = this.f2405y;
            if (d0Var != null && this.f2403x) {
                d0Var.setText((CharSequence) null);
                C0236q.a(frameLayout, this.f2340C);
                this.f2405y.setVisibility(4);
            }
        } else if (this.f2405y != null && this.f2403x && !TextUtils.isEmpty(this.f2401w)) {
            this.f2405y.setText(this.f2401w);
            C0236q.a(frameLayout, this.f2338B);
            this.f2405y.setVisibility(0);
            this.f2405y.bringToFront();
            announceForAccessibility(this.f2401w);
        }
    }

    public final void w(boolean z2, boolean z3) {
        int defaultColor = this.f2394s0.getDefaultColor();
        int colorForState = this.f2394s0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f2394s0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z2) {
            this.f2365b0 = colorForState2;
        } else if (z3) {
            this.f2365b0 = colorForState;
        } else {
            this.f2365b0 = defaultColor;
        }
    }

    public final void x() {
        boolean z2;
        C0273d0 d0Var;
        EditText editText;
        EditText editText2;
        if (this.f2351K != null && this.f2360T != 0) {
            boolean z3 = false;
            if (isFocused() || ((editText2 = this.i) != null && editText2.hasFocus())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (isHovered() || ((editText = this.i) != null && editText.isHovered())) {
                z3 = true;
            }
            if (!isEnabled()) {
                this.f2365b0 = this.f2404x0;
            } else if (m()) {
                if (this.f2394s0 != null) {
                    w(z2, z3);
                } else {
                    this.f2365b0 = getErrorCurrentTextColors();
                }
            } else if (!this.f2391r || (d0Var = this.f2395t) == null) {
                if (z2) {
                    this.f2365b0 = this.f2392r0;
                } else if (z3) {
                    this.f2365b0 = this.f2390q0;
                } else {
                    this.f2365b0 = this.f2388p0;
                }
            } else if (this.f2394s0 != null) {
                w(z2, z3);
            } else {
                this.f2365b0 = d0Var.getCurrentTextColor();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                p();
            }
            q qVar = this.f2373h;
            qVar.l();
            CheckableImageButton checkableImageButton = qVar.f658h;
            ColorStateList colorStateList = qVar.i;
            TextInputLayout textInputLayout = qVar.f656f;
            C0320a.n0(textInputLayout, checkableImageButton, colorStateList);
            ColorStateList colorStateList2 = qVar.f665p;
            CheckableImageButton checkableImageButton2 = qVar.f661l;
            C0320a.n0(textInputLayout, checkableImageButton2, colorStateList2);
            if (qVar.b() instanceof l) {
                if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                    C0320a.d(textInputLayout, checkableImageButton2, qVar.f665p, qVar.f666q);
                } else {
                    Drawable mutate = C0320a.J0(checkableImageButton2.getDrawable()).mutate();
                    G.a.g(mutate, textInputLayout.getErrorCurrentTextColors());
                    checkableImageButton2.setImageDrawable(mutate);
                }
            }
            z zVar = this.f2371g;
            C0320a.n0(zVar.f726f, zVar.i, zVar.f729j);
            if (this.f2360T == 2) {
                int i2 = this.f2362V;
                if (!z2 || !isEnabled()) {
                    this.f2362V = this.f2363W;
                } else {
                    this.f2362V = this.f2364a0;
                }
                if (this.f2362V != i2 && e() && !this.f2408z0) {
                    if (e()) {
                        ((h) this.f2351K).n(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    j();
                }
            }
            if (this.f2360T == 1) {
                if (!isEnabled()) {
                    this.f2366c0 = this.f2398u0;
                } else if (z3 && !z2) {
                    this.f2366c0 = this.f2402w0;
                } else if (z2) {
                    this.f2366c0 = this.f2400v0;
                } else {
                    this.f2366c0 = this.f2396t0;
                }
            }
            b();
        }
    }

    public static void k(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z2);
            }
        }
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean e = m.e(this);
        RectF rectF = this.f2370f0;
        if (e) {
            return this.f2357Q.f411h.a(rectF);
        }
        return this.f2357Q.f410g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean e = m.e(this);
        RectF rectF = this.f2370f0;
        if (e) {
            return this.f2357Q.f410g.a(rectF);
        }
        return this.f2357Q.f411h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean e = m.e(this);
        RectF rectF = this.f2370f0;
        if (e) {
            return this.f2357Q.e.a(rectF);
        }
        return this.f2357Q.f409f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean e = m.e(this);
        RectF rectF = this.f2370f0;
        if (e) {
            return this.f2357Q.f409f.a(rectF);
        }
        return this.f2357Q.e.a(rectF);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r12 = this;
            boolean r0 = r12.e()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.widget.EditText r0 = r12.i
            int r0 = r0.getWidth()
            android.widget.EditText r1 = r12.i
            int r1 = r1.getGravity()
            E0.c r2 = r12.A0
            java.lang.CharSequence r3 = r2.f135A
            boolean r3 = r2.b(r3)
            r2.f137C = r3
            r4 = 5
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = 8388613(0x800005, float:1.175495E-38)
            r7 = 1
            r8 = 17
            android.graphics.Rect r9 = r2.f166d
            if (r1 == r8) goto L_0x004f
            r10 = r1 & 7
            if (r10 != r7) goto L_0x002f
            goto L_0x004f
        L_0x002f:
            r10 = r1 & r6
            if (r10 == r6) goto L_0x0044
            r10 = r1 & 5
            if (r10 != r4) goto L_0x0038
            goto L_0x0044
        L_0x0038:
            if (r3 == 0) goto L_0x0040
            int r3 = r9.right
            float r3 = (float) r3
            float r10 = r2.f159Z
            goto L_0x0054
        L_0x0040:
            int r3 = r9.left
        L_0x0042:
            float r3 = (float) r3
            goto L_0x0055
        L_0x0044:
            if (r3 == 0) goto L_0x0049
            int r3 = r9.left
            goto L_0x0042
        L_0x0049:
            int r3 = r9.right
            float r3 = (float) r3
            float r10 = r2.f159Z
            goto L_0x0054
        L_0x004f:
            float r3 = (float) r0
            float r3 = r3 / r5
            float r10 = r2.f159Z
            float r10 = r10 / r5
        L_0x0054:
            float r3 = r3 - r10
        L_0x0055:
            int r10 = r9.left
            float r10 = (float) r10
            float r3 = java.lang.Math.max(r3, r10)
            android.graphics.RectF r10 = r12.f2370f0
            r10.left = r3
            int r11 = r9.top
            float r11 = (float) r11
            r10.top = r11
            if (r1 == r8) goto L_0x008d
            r8 = r1 & 7
            if (r8 != r7) goto L_0x006c
            goto L_0x008d
        L_0x006c:
            r0 = r1 & r6
            if (r0 == r6) goto L_0x0081
            r0 = r1 & 5
            if (r0 != r4) goto L_0x0075
            goto L_0x0081
        L_0x0075:
            boolean r0 = r2.f137C
            if (r0 == 0) goto L_0x007d
            int r0 = r9.right
        L_0x007b:
            float r0 = (float) r0
            goto L_0x0093
        L_0x007d:
            float r0 = r2.f159Z
            float r0 = r0 + r3
            goto L_0x0093
        L_0x0081:
            boolean r0 = r2.f137C
            if (r0 == 0) goto L_0x008a
            float r0 = r2.f159Z
            float r3 = r3 + r0
            r0 = r3
            goto L_0x0093
        L_0x008a:
            int r0 = r9.right
            goto L_0x007b
        L_0x008d:
            float r0 = (float) r0
            float r0 = r0 / r5
            float r1 = r2.f159Z
            float r1 = r1 / r5
            float r0 = r0 + r1
        L_0x0093:
            int r1 = r9.right
            float r1 = (float) r1
            float r0 = java.lang.Math.min(r0, r1)
            r10.right = r0
            int r0 = r9.top
            float r0 = (float) r0
            float r1 = r2.d()
            float r1 = r1 + r0
            r10.bottom = r1
            float r0 = r10.width()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f0
            float r0 = r10.height()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00b8
            goto L_0x00f0
        L_0x00b8:
            float r0 = r10.left
            int r1 = r12.f2359S
            float r1 = (float) r1
            float r0 = r0 - r1
            r10.left = r0
            float r0 = r10.right
            float r0 = r0 + r1
            r10.right = r0
            int r0 = r12.getPaddingLeft()
            int r0 = -r0
            float r0 = (float) r0
            int r1 = r12.getPaddingTop()
            int r1 = -r1
            float r1 = (float) r1
            float r2 = r10.height()
            float r2 = r2 / r5
            float r1 = r1 - r2
            int r2 = r12.f2362V
            float r2 = (float) r2
            float r1 = r1 + r2
            r10.offset(r0, r1)
            K0.g r0 = r12.f2351K
            N0.h r0 = (N0.h) r0
            r0.getClass()
            float r1 = r10.left
            float r2 = r10.top
            float r3 = r10.right
            float r4 = r10.bottom
            r0.n(r1, r2, r3, r4)
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.j():void");
    }

    public final void l(C0273d0 d0Var, int i2) {
        try {
            C0320a.C0(d0Var, i2);
            if (Build.VERSION.SDK_INT < 23 || d0Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        C0320a.C0(d0Var, 2131820983);
        d0Var.setTextColor(C0320a.F(getContext(), 2131099725));
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0.g(configuration);
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        super.onLayout(z2, i2, i3, i4, i5);
        EditText editText = this.i;
        if (editText != null) {
            ThreadLocal threadLocal = E0.d.f190a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f2367d0;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = E0.d.f190a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            E0.d.a(this, editText, matrix);
            ThreadLocal threadLocal3 = E0.d.f191b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f2355O;
            if (gVar != null) {
                int i8 = rect.bottom;
                gVar.setBounds(rect.left, i8 - this.f2363W, rect.right, i8);
            }
            g gVar2 = this.f2356P;
            if (gVar2 != null) {
                int i9 = rect.bottom;
                gVar2.setBounds(rect.left, i9 - this.f2364a0, rect.right, i9);
            }
            if (this.f2349H) {
                float textSize = this.i.getTextSize();
                c cVar = this.A0;
                if (cVar.f172h != textSize) {
                    cVar.f172h = textSize;
                    cVar.h(false);
                }
                int gravity = this.i.getGravity();
                int i10 = (gravity & -113) | 48;
                if (cVar.f171g != i10) {
                    cVar.f171g = i10;
                    cVar.h(false);
                }
                if (cVar.f169f != gravity) {
                    cVar.f169f = gravity;
                    cVar.h(false);
                }
                if (this.i != null) {
                    boolean e = m.e(this);
                    int i11 = rect.bottom;
                    Rect rect2 = this.f2368e0;
                    rect2.bottom = i11;
                    int i12 = this.f2360T;
                    if (i12 == 1) {
                        rect2.left = g(rect.left, e);
                        rect2.top = rect.top + this.f2361U;
                        rect2.right = h(rect.right, e);
                    } else if (i12 != 2) {
                        rect2.left = g(rect.left, e);
                        rect2.top = getPaddingTop();
                        rect2.right = h(rect.right, e);
                    } else {
                        rect2.left = this.i.getPaddingLeft() + rect.left;
                        rect2.top = rect.top - c();
                        rect2.right = rect.right - this.i.getPaddingRight();
                    }
                    int i13 = rect2.left;
                    int i14 = rect2.top;
                    int i15 = rect2.right;
                    int i16 = rect2.bottom;
                    Rect rect3 = cVar.f166d;
                    if (!(rect3.left == i13 && rect3.top == i14 && rect3.right == i15 && rect3.bottom == i16)) {
                        rect3.set(i13, i14, i15, i16);
                        cVar.f146M = true;
                    }
                    if (this.i != null) {
                        TextPaint textPaint = cVar.f148O;
                        textPaint.setTextSize(cVar.f172h);
                        textPaint.setTypeface(cVar.f184u);
                        textPaint.setLetterSpacing(cVar.f156W);
                        float f2 = -textPaint.ascent();
                        rect2.left = this.i.getCompoundPaddingLeft() + rect.left;
                        if (this.f2360T != 1 || this.i.getMinLines() > 1) {
                            i6 = rect.top + this.i.getCompoundPaddingTop();
                        } else {
                            i6 = (int) (((float) rect.centerY()) - (f2 / 2.0f));
                        }
                        rect2.top = i6;
                        rect2.right = rect.right - this.i.getCompoundPaddingRight();
                        if (this.f2360T != 1 || this.i.getMinLines() > 1) {
                            i7 = rect.bottom - this.i.getCompoundPaddingBottom();
                        } else {
                            i7 = (int) (((float) rect2.top) + f2);
                        }
                        rect2.bottom = i7;
                        int i17 = rect2.left;
                        int i18 = rect2.top;
                        int i19 = rect2.right;
                        Rect rect4 = cVar.f164c;
                        if (!(rect4.left == i17 && rect4.top == i18 && rect4.right == i19 && rect4.bottom == i7)) {
                            rect4.set(i17, i18, i19, i7);
                            cVar.f146M = true;
                        }
                        cVar.h(false);
                        if (e() && !this.f2408z0) {
                            j();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    public final void onMeasure(int i2, int i3) {
        EditText editText;
        super.onMeasure(i2, i3);
        boolean z2 = this.f2348G0;
        q qVar = this.f2373h;
        if (!z2) {
            qVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f2348G0 = true;
        }
        if (!(this.f2405y == null || (editText = this.i) == null)) {
            this.f2405y.setGravity(editText.getGravity());
            this.f2405y.setPadding(this.i.getCompoundPaddingLeft(), this.i.getCompoundPaddingTop(), this.i.getCompoundPaddingRight(), this.i.getCompoundPaddingBottom());
        }
        qVar.m();
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [K0.k, java.lang.Object] */
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        if (z2 != this.f2358R) {
            K0.c cVar = this.f2357Q.e;
            RectF rectF = this.f2370f0;
            float a2 = cVar.a(rectF);
            float a3 = this.f2357Q.f409f.a(rectF);
            float a4 = this.f2357Q.f411h.a(rectF);
            float a5 = this.f2357Q.f410g.a(rectF);
            k kVar = this.f2357Q;
            C0320a aVar = kVar.f405a;
            C0320a aVar2 = kVar.f406b;
            C0320a aVar3 = kVar.f408d;
            C0320a aVar4 = kVar.f407c;
            e eVar = new e(0);
            e eVar2 = new e(0);
            e eVar3 = new e(0);
            e eVar4 = new e(0);
            K0.j.b(aVar2);
            K0.j.b(aVar);
            K0.j.b(aVar4);
            K0.j.b(aVar3);
            K0.a aVar5 = new K0.a(a3);
            K0.a aVar6 = new K0.a(a2);
            K0.a aVar7 = new K0.a(a5);
            K0.a aVar8 = new K0.a(a4);
            ? obj = new Object();
            obj.f405a = aVar2;
            obj.f406b = aVar;
            obj.f407c = aVar3;
            obj.f408d = aVar4;
            obj.e = aVar5;
            obj.f409f = aVar6;
            obj.f410g = aVar8;
            obj.f411h = aVar7;
            obj.i = eVar;
            obj.f412j = eVar2;
            obj.f413k = eVar3;
            obj.f414l = eVar4;
            this.f2358R = z2;
            setShapeAppearanceModel(obj);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.Parcelable, U.b, N0.F] */
    public final Parcelable onSaveInstanceState() {
        boolean z2;
        ? bVar = new U.b(super.onSaveInstanceState());
        if (m()) {
            bVar.f612c = getError();
        }
        q qVar = this.f2373h;
        if (qVar.f663n == 0 || !qVar.f661l.i) {
            z2 = false;
        } else {
            z2 = true;
        }
        bVar.f613d = z2;
        return bVar;
    }

    public void setBoxBackgroundColorResource(int i2) {
        setBoxBackgroundColor(C0320a.F(getContext(), i2));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f2396t0 = defaultColor;
        this.f2366c0 = defaultColor;
        this.f2398u0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f2400v0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f2402w0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        b();
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f2388p0 = colorStateList.getDefaultColor();
            this.f2404x0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f2390q0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f2392r0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f2392r0 != colorStateList.getDefaultColor()) {
            this.f2392r0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(int i2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setEnabled(boolean z2) {
        k(this, z2);
        super.setEnabled(z2);
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        u uVar = this.f2385o;
        if (!isEmpty) {
            if (!uVar.f708x) {
                setHelperTextEnabled(true);
            }
            uVar.c();
            uVar.f707w = charSequence;
            uVar.f709y.setText(charSequence);
            int i2 = uVar.f698n;
            if (i2 != 2) {
                uVar.f699o = 2;
            }
            uVar.i(i2, uVar.f699o, uVar.h(uVar.f709y, charSequence));
        } else if (uVar.f708x) {
            setHelperTextEnabled(false);
        }
    }

    public void setMaxWidthResource(int i2) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    public void setMinWidthResource(int i2) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    public final void u(boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        ColorStateList colorStateList;
        C0273d0 d0Var;
        ColorStateList colorStateList2;
        int i2;
        boolean isEnabled = isEnabled();
        EditText editText = this.i;
        if (editText == null || TextUtils.isEmpty(editText.getText())) {
            z4 = false;
        } else {
            z4 = true;
        }
        EditText editText2 = this.i;
        if (editText2 == null || !editText2.hasFocus()) {
            z5 = false;
        } else {
            z5 = true;
        }
        ColorStateList colorStateList3 = this.f2384n0;
        c cVar = this.A0;
        if (colorStateList3 != null) {
            cVar.i(colorStateList3);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.f2384n0;
            if (colorStateList4 != null) {
                i2 = colorStateList4.getColorForState(new int[]{-16842910}, this.f2404x0);
            } else {
                i2 = this.f2404x0;
            }
            cVar.i(ColorStateList.valueOf(i2));
        } else if (m()) {
            C0273d0 d0Var2 = this.f2385o.f702r;
            if (d0Var2 != null) {
                colorStateList2 = d0Var2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            cVar.i(colorStateList2);
        } else if (this.f2391r && (d0Var = this.f2395t) != null) {
            cVar.i(d0Var.getTextColors());
        } else if (!(!z5 || (colorStateList = this.f2386o0) == null || cVar.f174k == colorStateList)) {
            cVar.f174k = colorStateList;
            cVar.h(false);
        }
        q qVar = this.f2373h;
        z zVar = this.f2371g;
        if (z4 || !this.f2339B0 || (isEnabled() && z5)) {
            if (z3 || this.f2408z0) {
                ValueAnimator valueAnimator = this.f2343D0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f2343D0.cancel();
                }
                if (!z2 || !this.f2341C0) {
                    cVar.k(1.0f);
                } else {
                    a(1.0f);
                }
                this.f2408z0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.i;
                if (editText3 != null) {
                    editable = editText3.getText();
                }
                v(editable);
                zVar.f734o = false;
                zVar.e();
                qVar.f672w = false;
                qVar.n();
            }
        } else if (z3 || !this.f2408z0) {
            ValueAnimator valueAnimator2 = this.f2343D0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f2343D0.cancel();
            }
            if (!z2 || !this.f2341C0) {
                cVar.k(0.0f);
            } else {
                a(0.0f);
            }
            if (e() && !((h) this.f2351K).f631C.f629q.isEmpty() && e()) {
                ((h) this.f2351K).n(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f2408z0 = true;
            C0273d0 d0Var3 = this.f2405y;
            if (d0Var3 != null && this.f2403x) {
                d0Var3.setText((CharSequence) null);
                C0236q.a(this.f2369f, this.f2340C);
                this.f2405y.setVisibility(4);
            }
            zVar.f734o = true;
            zVar.e();
            qVar.f672w = true;
            qVar.n();
        }
    }

    public void setHint(int i2) {
        setHint(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconContentDescription(int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f2373h.f661l.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f2373h.f661l.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f2373h.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2373h.f661l;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        q qVar = this.f2373h;
        CheckableImageButton checkableImageButton = qVar.f661l;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = qVar.f665p;
            PorterDuff.Mode mode = qVar.f666q;
            TextInputLayout textInputLayout = qVar.f656f;
            C0320a.d(textInputLayout, checkableImageButton, colorStateList, mode);
            C0320a.n0(textInputLayout, checkableImageButton, qVar.f665p);
        }
    }
}
