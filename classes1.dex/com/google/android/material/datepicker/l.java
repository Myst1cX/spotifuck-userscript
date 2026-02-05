package com.google.android.material.datepicker;

import F.a;
import K0.e;
import K0.g;
import N.A0;
import N.C0002b;
import N.F;
import N.Q;
import N.b0;
import N.x0;
import N0.C0026a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.C0059m;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p0.C0320a;
import q0.C0322a;

public final class l<S> extends C0059m {
    public CharSequence A0;

    /* renamed from: B0  reason: collision with root package name */
    public int f2250B0;

    /* renamed from: C0  reason: collision with root package name */
    public CharSequence f2251C0;

    /* renamed from: D0  reason: collision with root package name */
    public int f2252D0;

    /* renamed from: E0  reason: collision with root package name */
    public CharSequence f2253E0;
    public TextView F0;

    /* renamed from: G0  reason: collision with root package name */
    public CheckableImageButton f2254G0;

    /* renamed from: H0  reason: collision with root package name */
    public g f2255H0;

    /* renamed from: I0  reason: collision with root package name */
    public boolean f2256I0;

    /* renamed from: J0  reason: collision with root package name */
    public CharSequence f2257J0;

    /* renamed from: K0  reason: collision with root package name */
    public CharSequence f2258K0;

    /* renamed from: n0  reason: collision with root package name */
    public final LinkedHashSet f2259n0 = new LinkedHashSet();

    /* renamed from: o0  reason: collision with root package name */
    public final LinkedHashSet f2260o0 = new LinkedHashSet();

    /* renamed from: p0  reason: collision with root package name */
    public int f2261p0;

    /* renamed from: q0  reason: collision with root package name */
    public s f2262q0;

    /* renamed from: r0  reason: collision with root package name */
    public b f2263r0;

    /* renamed from: s0  reason: collision with root package name */
    public j f2264s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f2265t0;

    /* renamed from: u0  reason: collision with root package name */
    public CharSequence f2266u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f2267v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f2268w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f2269x0;

    /* renamed from: y0  reason: collision with root package name */
    public CharSequence f2270y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f2271z0;

    public static boolean N(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C0320a.s0(context, 2130969363, j.class.getCanonicalName()).data, new int[]{i});
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z2;
    }

    public final void A() {
        this.f2262q0.f2290Z.clear();
        super.A();
    }

    public final Dialog K() {
        Context F2 = F();
        F();
        int i = this.f2261p0;
        if (i != 0) {
            Dialog dialog = new Dialog(F2, i);
            Context context = dialog.getContext();
            this.f2267v0 = N(context, 16843277);
            this.f2255H0 = new g(context, (AttributeSet) null, 2130969363, 2131821635);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C0322a.f4493l, 2130969363, 2131821635);
            int color = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
            this.f2255H0.h(context);
            this.f2255H0.j(ColorStateList.valueOf(color));
            g gVar = this.f2255H0;
            View decorView = dialog.getWindow().getDecorView();
            WeakHashMap weakHashMap = Q.f509a;
            gVar.i(F.i(decorView));
            return dialog;
        }
        L();
        throw null;
    }

    public final void L() {
        if (this.f1756k.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it2 = this.f2259n0.iterator();
        while (it2.hasNext()) {
            ((DialogInterface.OnCancelListener) it2.next()).onCancel(dialogInterface);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it2 = this.f2260o0.iterator();
        while (it2.hasNext()) {
            ((DialogInterface.OnDismissListener) it2.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f1737J;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        String str;
        if (this.f2267v0) {
            i = 2131492955;
        } else {
            i = 2131492954;
        }
        View inflate = layoutInflater.inflate(i, viewGroup);
        Context context = inflate.getContext();
        if (this.f2267v0) {
            inflate.findViewById(2131296562).setLayoutParams(new LinearLayout.LayoutParams(M(context), -2));
        } else {
            inflate.findViewById(2131296563).setLayoutParams(new LinearLayout.LayoutParams(M(context), -1));
        }
        WeakHashMap weakHashMap = Q.f509a;
        ((TextView) inflate.findViewById(2131296574)).setAccessibilityLiveRegion(1);
        this.f2254G0 = (CheckableImageButton) inflate.findViewById(2131296576);
        this.F0 = (TextView) inflate.findViewById(2131296580);
        this.f2254G0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f2254G0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, T0.g.n(context, 2131230900));
        boolean z2 = false;
        stateListDrawable.addState(new int[0], T0.g.n(context, 2131230902));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.f2254G0;
        if (this.f2268w0 != 0) {
            z2 = true;
        }
        checkableImageButton2.setChecked(z2);
        Q.p(this.f2254G0, (C0002b) null);
        CheckableImageButton checkableImageButton3 = this.f2254G0;
        if (this.f2268w0 == 1) {
            str = checkableImageButton3.getContext().getString(2131755202);
        } else {
            str = checkableImageButton3.getContext().getString(2131755204);
        }
        this.f2254G0.setContentDescription(str);
        this.f2254G0.setOnClickListener(new C0026a(4, this));
        Button button = (Button) inflate.findViewById(2131296390);
        L();
        throw null;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, com.google.android.material.datepicker.a] */
    public final void y(Bundle bundle) {
        n nVar;
        n nVar2;
        Bundle bundle2 = bundle;
        super.y(bundle);
        bundle2.putInt("OVERRIDE_THEME_RES_ID", this.f2261p0);
        bundle2.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
        b bVar = this.f2263r0;
        ? obj = new Object();
        int i = a.f2212b;
        int i2 = a.f2212b;
        long j2 = bVar.f2214a.f2278f;
        long j3 = bVar.f2215b.f2278f;
        obj.f2213a = Long.valueOf(bVar.f2217d.f2278f);
        j jVar = this.f2264s0;
        if (jVar == null) {
            nVar = null;
        } else {
            nVar = jVar.f2238c0;
        }
        if (nVar != null) {
            obj.f2213a = Long.valueOf(nVar.f2278f);
        }
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f2216c);
        n b2 = n.b(j2);
        n b3 = n.b(j3);
        d dVar = (d) bundle3.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = obj.f2213a;
        if (l2 == null) {
            nVar2 = null;
        } else {
            nVar2 = n.b(l2.longValue());
        }
        bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(b2, b3, dVar, nVar2, bVar.e));
        bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        bundle2.putInt("TITLE_TEXT_RES_ID_KEY", this.f2265t0);
        bundle2.putCharSequence("TITLE_TEXT_KEY", this.f2266u0);
        bundle2.putInt("INPUT_MODE_KEY", this.f2268w0);
        bundle2.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f2269x0);
        bundle2.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f2270y0);
        bundle2.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f2271z0);
        bundle2.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.A0);
        bundle2.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f2250B0);
        bundle2.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f2251C0);
        bundle2.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f2252D0);
        bundle2.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f2253E0);
    }

    public final void z() {
        CharSequence charSequence;
        Integer num;
        boolean z2;
        int i;
        int i2;
        boolean z3;
        A0 a02;
        boolean z4;
        A0 a03;
        super.z();
        Dialog dialog = this.f1713i0;
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (this.f2267v0) {
                window.setLayout(-1, -1);
                window.setBackgroundDrawable(this.f2255H0);
                if (!this.f2256I0) {
                    View findViewById = G().findViewById(2131296472);
                    ColorStateList L2 = C0320a.L(findViewById.getBackground());
                    if (L2 != null) {
                        num = Integer.valueOf(L2.getDefaultColor());
                    } else {
                        num = null;
                    }
                    int i3 = Build.VERSION.SDK_INT;
                    if (num == null || num.intValue() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int G2 = C0320a.G(window.getContext(), 16842801, -16777216);
                    if (z2) {
                        num = Integer.valueOf(G2);
                    }
                    if (i3 >= 30) {
                        b0.a(window, false);
                    } else {
                        View decorView = window.getDecorView();
                        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
                    }
                    Context context = window.getContext();
                    if (i3 < 23) {
                        i = a.d(C0320a.G(context, 16843857, -16777216), 128);
                    } else {
                        i = 0;
                    }
                    Context context2 = window.getContext();
                    if (i3 < 27) {
                        i2 = a.d(C0320a.G(context2, 16843858, -16777216), 128);
                    } else {
                        i2 = 0;
                    }
                    window.setStatusBarColor(i);
                    window.setNavigationBarColor(i2);
                    boolean a04 = C0320a.a0(num.intValue());
                    if (C0320a.a0(i) || (i == 0 && a04)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    e eVar = new e(window.getDecorView(), 4);
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 30) {
                        A0 a05 = new A0(window.getInsetsController(), eVar);
                        a05.f495p = window;
                        a02 = a05;
                    } else if (i4 >= 26) {
                        a02 = new x0(window, eVar);
                    } else if (i4 >= 23) {
                        a02 = new x0(window, eVar);
                    } else {
                        a02 = new x0(window, eVar);
                    }
                    a02.u0(z3);
                    boolean a06 = C0320a.a0(G2);
                    if (C0320a.a0(i2) || (i2 == 0 && a06)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    e eVar2 = new e(window.getDecorView(), 4);
                    int i5 = Build.VERSION.SDK_INT;
                    if (i5 >= 30) {
                        A0 a07 = new A0(window.getInsetsController(), eVar2);
                        a07.f495p = window;
                        a03 = a07;
                    } else if (i5 >= 26) {
                        a03 = new x0(window, eVar2);
                    } else if (i5 >= 23) {
                        a03 = new x0(window, eVar2);
                    } else {
                        a03 = new x0(window, eVar2);
                    }
                    a03.t0(z4);
                    k kVar = new k(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingTop());
                    WeakHashMap weakHashMap = Q.f509a;
                    F.u(findViewById, kVar);
                    this.f2256I0 = true;
                }
            } else {
                window.setLayout(-2, -2);
                int dimensionPixelOffset = k().getDimensionPixelOffset(2131165821);
                Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
                window.setBackgroundDrawable(new InsetDrawable(this.f2255H0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
                View decorView2 = window.getDecorView();
                Dialog dialog2 = this.f1713i0;
                if (dialog2 != null) {
                    decorView2.setOnTouchListener(new B0.a(dialog2, rect));
                } else {
                    throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
                }
            }
            F();
            int i6 = this.f2261p0;
            if (i6 != 0) {
                L();
                b bVar = this.f2263r0;
                j jVar = new j();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", i6);
                bundle.putParcelable("GRID_SELECTOR_KEY", (Parcelable) null);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
                bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
                bundle.putParcelable("CURRENT_MONTH_KEY", bVar.f2217d);
                jVar.I(bundle);
                this.f2264s0 = jVar;
                s sVar = jVar;
                if (this.f2268w0 == 1) {
                    L();
                    b bVar2 = this.f2263r0;
                    s mVar = new m();
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("THEME_RES_ID_KEY", i6);
                    bundle2.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
                    bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
                    mVar.I(bundle2);
                    sVar = mVar;
                }
                this.f2262q0 = sVar;
                TextView textView = this.F0;
                if (this.f2268w0 == 1 && k().getConfiguration().orientation == 2) {
                    charSequence = this.f2258K0;
                } else {
                    charSequence = this.f2257J0;
                }
                textView.setText(charSequence);
                L();
                throw null;
            }
            L();
            throw null;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public l() {
        new LinkedHashSet();
        new LinkedHashSet();
    }

    public static int M(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(2131165813);
        Calendar b2 = v.b();
        b2.set(5, 1);
        Calendar a2 = v.a(b2);
        a2.get(2);
        a2.get(1);
        int maximum = a2.getMaximum(7);
        a2.getActualMaximum(5);
        a2.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(2131165819) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(2131165833)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public final void t(Bundle bundle) {
        super.t(bundle);
        if (bundle == null) {
            bundle = this.f1756k;
        }
        this.f2261p0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") == null) {
            this.f2263r0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.f2265t0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
                this.f2266u0 = bundle.getCharSequence("TITLE_TEXT_KEY");
                this.f2268w0 = bundle.getInt("INPUT_MODE_KEY");
                this.f2269x0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
                this.f2270y0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
                this.f2271z0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.A0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                this.f2250B0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
                this.f2251C0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
                this.f2252D0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.f2253E0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                CharSequence charSequence = this.f2266u0;
                if (charSequence == null) {
                    charSequence = F().getResources().getText(this.f2265t0);
                }
                this.f2257J0 = charSequence;
                if (charSequence != null) {
                    CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
                    if (split.length > 1) {
                        charSequence = split[0];
                    }
                } else {
                    charSequence = null;
                }
                this.f2258K0 = charSequence;
                return;
            }
            throw new ClassCastException();
        }
        throw new ClassCastException();
    }
}
