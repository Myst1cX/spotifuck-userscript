package g0;

import N0.B;
import Q0.j;
import android.os.Bundle;
import android.os.Looper;
import android.util.TypedValue;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.RecyclerView;
import j0.C;

public abstract class r extends androidx.fragment.app.r {

    /* renamed from: Z  reason: collision with root package name */
    public final q f2583Z = new q(this);

    /* renamed from: a0  reason: collision with root package name */
    public w f2584a0;

    /* renamed from: b0  reason: collision with root package name */
    public RecyclerView f2585b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f2586c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f2587d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f2588e0 = 2131492988;

    /* renamed from: f0  reason: collision with root package name */
    public final j f2589f0 = new j((Object) this, Looper.getMainLooper(), 4);

    /* renamed from: g0  reason: collision with root package name */
    public final B f2590g0 = new B(9, this);

    public final void A() {
        this.f1736H = true;
        w wVar = this.f2584a0;
        wVar.f2611h = null;
        wVar.i = null;
    }

    public abstract void K(String str);

    public final void z() {
        this.f1736H = true;
        w wVar = this.f2584a0;
        wVar.f2611h = this;
        wVar.i = this;
    }

    public final void B(Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        if (!(bundle == null || (bundle2 = bundle.getBundle("android:preferences")) == null || (preferenceScreen2 = this.f2584a0.f2610g) == null)) {
            preferenceScreen2.a(bundle2);
        }
        if (this.f2586c0 && (preferenceScreen = this.f2584a0.f2610g) != null) {
            this.f2585b0.setAdapter(new u(preferenceScreen));
            preferenceScreen.i();
        }
        this.f2587d0 = true;
    }

    public final void v() {
        j jVar = this.f2589f0;
        jVar.removeCallbacks(this.f2590g0);
        jVar.removeMessages(1);
        if (this.f2586c0) {
            this.f2585b0.setAdapter((C) null);
            PreferenceScreen preferenceScreen = this.f2584a0.f2610g;
            if (preferenceScreen != null) {
                preferenceScreen.m();
            }
        }
        this.f2585b0 = null;
        this.f1736H = true;
    }

    public final void y(Bundle bundle) {
        PreferenceScreen preferenceScreen = this.f2584a0.f2610g;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.b(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    public final void t(Bundle bundle) {
        String str;
        super.t(bundle);
        TypedValue typedValue = new TypedValue();
        F().getTheme().resolveAttribute(2130969533, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = 2131820897;
        }
        F().getTheme().applyStyle(i, false);
        w wVar = new w(F());
        this.f2584a0 = wVar;
        wVar.f2612j = this;
        Bundle bundle2 = this.f1756k;
        if (bundle2 != null) {
            str = bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        } else {
            str = null;
        }
        K(str);
    }

    /* JADX WARNING: type inference failed for: r10v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View u(android.view.LayoutInflater r10, android.view.ViewGroup r11) {
        /*
            r9 = this;
            android.content.Context r0 = r9.F()
            int[] r1 = g0.z.f2627h
            r2 = 0
            r3 = 2130969527(0x7f0403b7, float:1.7547738E38)
            r4 = 0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2, r1, r3, r4)
            int r1 = r9.f2588e0
            int r1 = r0.getResourceId(r4, r1)
            r9.f2588e0 = r1
            r1 = 1
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r1)
            r3 = 2
            r5 = -1
            int r3 = r0.getDimensionPixelSize(r3, r5)
            r6 = 3
            boolean r6 = r0.getBoolean(r6, r1)
            r0.recycle()
            android.content.Context r0 = r9.F()
            android.view.LayoutInflater r10 = r10.cloneInContext(r0)
            int r0 = r9.f2588e0
            android.view.View r11 = r10.inflate(r0, r11, r4)
            r0 = 16908351(0x102003f, float:2.3877406E-38)
            android.view.View r0 = r11.findViewById(r0)
            boolean r7 = r0 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x00e4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.content.Context r7 = r9.F()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            java.lang.String r8 = "android.hardware.type.automotive"
            boolean r7 = r7.hasSystemFeature(r8)
            if (r7 == 0) goto L_0x0061
            r7 = 2131296645(0x7f090185, float:1.8211213E38)
            android.view.View r7 = r0.findViewById(r7)
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            if (r7 == 0) goto L_0x0061
            goto L_0x007e
        L_0x0061:
            r7 = 2131492990(0x7f0c007e, float:1.8609447E38)
            android.view.View r10 = r10.inflate(r7, r0, r4)
            r7 = r10
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            androidx.recyclerview.widget.LinearLayoutManager r10 = new androidx.recyclerview.widget.LinearLayoutManager
            r9.F()
            r10.<init>(r1)
            r7.setLayoutManager(r10)
            g0.x r10 = new g0.x
            r10.<init>(r7)
            r7.setAccessibilityDelegateCompat(r10)
        L_0x007e:
            r9.f2585b0 = r7
            g0.q r10 = r9.f2583Z
            r7.g(r10)
            if (r2 == 0) goto L_0x0091
            r10.getClass()
            int r1 = r2.getIntrinsicHeight()
            r10.f2580b = r1
            goto L_0x0093
        L_0x0091:
            r10.f2580b = r4
        L_0x0093:
            r10.f2579a = r2
            g0.r r1 = r10.f2582d
            androidx.recyclerview.widget.RecyclerView r2 = r1.f2585b0
            java.util.ArrayList r4 = r2.f2032s
            int r4 = r4.size()
            java.lang.String r7 = "Cannot invalidate item decorations during a scroll or layout"
            if (r4 != 0) goto L_0x00a4
            goto L_0x00b1
        L_0x00a4:
            j0.K r4 = r2.f2030r
            if (r4 == 0) goto L_0x00ab
            r4.c(r7)
        L_0x00ab:
            r2.N()
            r2.requestLayout()
        L_0x00b1:
            if (r3 == r5) goto L_0x00cd
            r10.f2580b = r3
            androidx.recyclerview.widget.RecyclerView r1 = r1.f2585b0
            java.util.ArrayList r2 = r1.f2032s
            int r2 = r2.size()
            if (r2 != 0) goto L_0x00c0
            goto L_0x00cd
        L_0x00c0:
            j0.K r2 = r1.f2030r
            if (r2 == 0) goto L_0x00c7
            r2.c(r7)
        L_0x00c7:
            r1.N()
            r1.requestLayout()
        L_0x00cd:
            r10.f2581c = r6
            androidx.recyclerview.widget.RecyclerView r10 = r9.f2585b0
            android.view.ViewParent r10 = r10.getParent()
            if (r10 != 0) goto L_0x00dc
            androidx.recyclerview.widget.RecyclerView r10 = r9.f2585b0
            r0.addView(r10)
        L_0x00dc:
            Q0.j r10 = r9.f2589f0
            N0.B r0 = r9.f2590g0
            r10.post(r0)
            return r11
        L_0x00e4:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.r.u(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }
}
