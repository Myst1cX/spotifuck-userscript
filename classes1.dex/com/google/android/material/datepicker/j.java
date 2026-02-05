package com.google.android.material.datepicker;

import K.a;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class j<S> extends s {

    /* renamed from: a0  reason: collision with root package name */
    public int f2236a0;

    /* renamed from: b0  reason: collision with root package name */
    public b f2237b0;

    /* renamed from: c0  reason: collision with root package name */
    public n f2238c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f2239d0;

    /* renamed from: e0  reason: collision with root package name */
    public c f2240e0;

    /* renamed from: f0  reason: collision with root package name */
    public RecyclerView f2241f0;

    /* renamed from: g0  reason: collision with root package name */
    public RecyclerView f2242g0;

    /* renamed from: h0  reason: collision with root package name */
    public View f2243h0;

    /* renamed from: i0  reason: collision with root package name */
    public View f2244i0;

    /* renamed from: j0  reason: collision with root package name */
    public View f2245j0;

    /* renamed from: k0  reason: collision with root package name */
    public View f2246k0;

    public final void K(n nVar) {
        boolean z2;
        r rVar = (r) this.f2242g0.getAdapter();
        int d2 = rVar.f2288c.f2214a.d(nVar);
        int d3 = d2 - rVar.f2288c.f2214a.d(this.f2238c0);
        boolean z3 = false;
        if (Math.abs(d3) > 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (d3 > 0) {
            z3 = true;
        }
        this.f2238c0 = nVar;
        if (z2 && z3) {
            this.f2242g0.a0(d2 - 3);
            this.f2242g0.post(new a(d2, 2, (Object) this));
        } else if (z2) {
            this.f2242g0.a0(d2 + 3);
            this.f2242g0.post(new a(d2, 2, (Object) this));
        } else {
            this.f2242g0.post(new a(d2, 2, (Object) this));
        }
    }

    public final void L(int i) {
        this.f2239d0 = i;
        if (i == 2) {
            this.f2241f0.getLayoutManager().n0(this.f2238c0.f2276c - ((x) this.f2241f0.getAdapter()).f2293c.f2237b0.f2214a.f2276c);
            this.f2245j0.setVisibility(0);
            this.f2246k0.setVisibility(8);
            this.f2243h0.setVisibility(8);
            this.f2244i0.setVisibility(8);
        } else if (i == 1) {
            this.f2245j0.setVisibility(8);
            this.f2246k0.setVisibility(0);
            this.f2243h0.setVisibility(0);
            this.f2244i0.setVisibility(0);
            K(this.f2238c0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0191, code lost:
        r0 = new j0.C0163z();
        r1 = r11.f2242g0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View u(android.view.LayoutInflater r12, android.view.ViewGroup r13) {
        /*
            r11 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r11.h()
            int r2 = r11.f2236a0
            r0.<init>(r1, r2)
            com.google.android.material.datepicker.c r1 = new com.google.android.material.datepicker.c
            r1.<init>(r0)
            r11.f2240e0 = r1
            android.view.LayoutInflater r12 = r12.cloneInContext(r0)
            com.google.android.material.datepicker.b r1 = r11.f2237b0
            com.google.android.material.datepicker.n r1 = r1.f2214a
            r2 = 16843277(0x101020d, float:2.369503E-38)
            boolean r3 = com.google.android.material.datepicker.l.N(r0, r2)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x002a
            r3 = 2131492948(0x7f0c0054, float:1.8609362E38)
            r6 = 1
            goto L_0x002e
        L_0x002a:
            r3 = 2131492943(0x7f0c004f, float:1.8609352E38)
            r6 = 0
        L_0x002e:
            android.view.View r12 = r12.inflate(r3, r13, r5)
            android.content.Context r13 = r11.F()
            android.content.res.Resources r13 = r13.getResources()
            r3 = 2131165836(0x7f07028c, float:1.79459E38)
            int r3 = r13.getDimensionPixelSize(r3)
            r7 = 2131165837(0x7f07028d, float:1.7945902E38)
            int r7 = r13.getDimensionPixelOffset(r7)
            int r7 = r7 + r3
            r3 = 2131165835(0x7f07028b, float:1.7945898E38)
            int r3 = r13.getDimensionPixelOffset(r3)
            int r3 = r3 + r7
            r7 = 2131165820(0x7f07027c, float:1.7945868E38)
            int r7 = r13.getDimensionPixelSize(r7)
            int r8 = com.google.android.material.datepicker.o.f2280d
            r9 = 2131165815(0x7f070277, float:1.7945858E38)
            int r9 = r13.getDimensionPixelSize(r9)
            int r9 = r9 * r8
            int r8 = r8 - r4
            r10 = 2131165834(0x7f07028a, float:1.7945896E38)
            int r10 = r13.getDimensionPixelOffset(r10)
            int r10 = r10 * r8
            int r10 = r10 + r9
            r8 = 2131165812(0x7f070274, float:1.7945852E38)
            int r13 = r13.getDimensionPixelOffset(r8)
            int r3 = r3 + r7
            int r3 = r3 + r10
            int r3 = r3 + r13
            r12.setMinimumHeight(r3)
            r13 = 2131296561(0x7f090131, float:1.8211042E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.GridView r13 = (android.widget.GridView) r13
            T.h r3 = new T.h
            r7 = 1
            r3.<init>(r7)
            N.Q.p(r13, r3)
            com.google.android.material.datepicker.b r3 = r11.f2237b0
            int r3 = r3.e
            com.google.android.material.datepicker.e r7 = new com.google.android.material.datepicker.e
            if (r3 <= 0) goto L_0x0099
            r7.<init>(r3)
            goto L_0x009c
        L_0x0099:
            r7.<init>()
        L_0x009c:
            r13.setAdapter(r7)
            int r1 = r1.f2277d
            r13.setNumColumns(r1)
            r13.setEnabled(r5)
            r13 = 2131296564(0x7f090134, float:1.8211048E38)
            android.view.View r13 = r12.findViewById(r13)
            androidx.recyclerview.widget.RecyclerView r13 = (androidx.recyclerview.widget.RecyclerView) r13
            r11.f2242g0 = r13
            com.google.android.material.datepicker.g r13 = new com.google.android.material.datepicker.g
            r13.<init>(r11, r6, r6)
            androidx.recyclerview.widget.RecyclerView r1 = r11.f2242g0
            r1.setLayoutManager(r13)
            androidx.recyclerview.widget.RecyclerView r13 = r11.f2242g0
            java.lang.String r1 = "MONTHS_VIEW_GROUP_TAG"
            r13.setTag(r1)
            com.google.android.material.datepicker.r r13 = new com.google.android.material.datepicker.r
            com.google.android.material.datepicker.b r1 = r11.f2237b0
            A.b r3 = new A.b
            r5 = 22
            r3.<init>((int) r5, (java.lang.Object) r11)
            r13.<init>(r0, r1, r3)
            androidx.recyclerview.widget.RecyclerView r1 = r11.f2242g0
            r1.setAdapter(r13)
            android.content.res.Resources r1 = r0.getResources()
            r3 = 2131361842(0x7f0a0032, float:1.8343448E38)
            int r1 = r1.getInteger(r3)
            r3 = 2131296567(0x7f090137, float:1.8211054E38)
            android.view.View r5 = r12.findViewById(r3)
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            r11.f2241f0 = r5
            if (r5 == 0) goto L_0x010f
            r5.setHasFixedSize(r4)
            androidx.recyclerview.widget.RecyclerView r5 = r11.f2241f0
            androidx.recyclerview.widget.GridLayoutManager r6 = new androidx.recyclerview.widget.GridLayoutManager
            r6.<init>(r1)
            r5.setLayoutManager(r6)
            androidx.recyclerview.widget.RecyclerView r1 = r11.f2241f0
            com.google.android.material.datepicker.x r5 = new com.google.android.material.datepicker.x
            r5.<init>(r11)
            r1.setAdapter(r5)
            androidx.recyclerview.widget.RecyclerView r1 = r11.f2241f0
            com.google.android.material.datepicker.h r5 = new com.google.android.material.datepicker.h
            r5.<init>(r11)
            r1.g(r5)
        L_0x010f:
            r1 = 2131296554(0x7f09012a, float:1.8211028E38)
            android.view.View r5 = r12.findViewById(r1)
            if (r5 == 0) goto L_0x018b
            android.view.View r1 = r12.findViewById(r1)
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            java.lang.String r5 = "SELECTOR_TOGGLE_TAG"
            r1.setTag(r5)
            E0.a r5 = new E0.a
            r6 = 2
            r5.<init>(r6, r11)
            N.Q.p(r1, r5)
            r5 = 2131296556(0x7f09012c, float:1.8211032E38)
            android.view.View r5 = r12.findViewById(r5)
            r11.f2243h0 = r5
            java.lang.String r6 = "NAVIGATION_PREV_TAG"
            r5.setTag(r6)
            r5 = 2131296555(0x7f09012b, float:1.821103E38)
            android.view.View r5 = r12.findViewById(r5)
            r11.f2244i0 = r5
            java.lang.String r6 = "NAVIGATION_NEXT_TAG"
            r5.setTag(r6)
            android.view.View r3 = r12.findViewById(r3)
            r11.f2245j0 = r3
            r3 = 2131296560(0x7f090130, float:1.821104E38)
            android.view.View r3 = r12.findViewById(r3)
            r11.f2246k0 = r3
            r11.L(r4)
            com.google.android.material.datepicker.n r3 = r11.f2238c0
            java.lang.String r3 = r3.c()
            r1.setText(r3)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f2242g0
            com.google.android.material.datepicker.i r4 = new com.google.android.material.datepicker.i
            r4.<init>(r11, r13, r1)
            r3.h(r4)
            R0.i r3 = new R0.i
            r4 = 1
            r3.<init>(r4, r11)
            r1.setOnClickListener(r3)
            android.view.View r1 = r11.f2244i0
            com.google.android.material.datepicker.f r3 = new com.google.android.material.datepicker.f
            r3.<init>(r11, r13, r4)
            r1.setOnClickListener(r3)
            android.view.View r1 = r11.f2243h0
            com.google.android.material.datepicker.f r3 = new com.google.android.material.datepicker.f
            r4 = 0
            r3.<init>(r11, r13, r4)
            r1.setOnClickListener(r3)
        L_0x018b:
            boolean r0 = com.google.android.material.datepicker.l.N(r0, r2)
            if (r0 != 0) goto L_0x01de
            j0.z r0 = new j0.z
            r0.<init>()
            androidx.recyclerview.widget.RecyclerView r1 = r11.f2242g0
            androidx.recyclerview.widget.RecyclerView r2 = r0.f3520a
            if (r2 != r1) goto L_0x019d
            goto L_0x01de
        L_0x019d:
            j0.d0 r3 = r0.f3521b
            if (r2 == 0) goto L_0x01ae
            java.util.ArrayList r2 = r2.f2020l0
            if (r2 == 0) goto L_0x01a8
            r2.remove(r3)
        L_0x01a8:
            androidx.recyclerview.widget.RecyclerView r2 = r0.f3520a
            r4 = 0
            r2.setOnFlingListener(r4)
        L_0x01ae:
            r0.f3520a = r1
            if (r1 == 0) goto L_0x01de
            j0.M r1 = r1.getOnFlingListener()
            if (r1 != 0) goto L_0x01d6
            androidx.recyclerview.widget.RecyclerView r1 = r0.f3520a
            r1.h(r3)
            androidx.recyclerview.widget.RecyclerView r1 = r0.f3520a
            r1.setOnFlingListener(r0)
            android.widget.Scroller r1 = new android.widget.Scroller
            androidx.recyclerview.widget.RecyclerView r2 = r0.f3520a
            android.content.Context r2 = r2.getContext()
            android.view.animation.DecelerateInterpolator r3 = new android.view.animation.DecelerateInterpolator
            r3.<init>()
            r1.<init>(r2, r3)
            r0.f()
            goto L_0x01de
        L_0x01d6:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "An instance of OnFlingListener already set."
            r12.<init>(r13)
            throw r12
        L_0x01de:
            androidx.recyclerview.widget.RecyclerView r0 = r11.f2242g0
            com.google.android.material.datepicker.n r1 = r11.f2238c0
            com.google.android.material.datepicker.b r13 = r13.f2288c
            com.google.android.material.datepicker.n r13 = r13.f2214a
            int r13 = r13.d(r1)
            r0.a0(r13)
            androidx.recyclerview.widget.RecyclerView r13 = r11.f2242g0
            T.h r0 = new T.h
            r1 = 2
            r0.<init>(r1)
            N.Q.p(r13, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.j.u(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public final void y(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f2236a0);
        bundle.putParcelable("GRID_SELECTOR_KEY", (Parcelable) null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f2237b0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f2238c0);
    }

    public final void t(Bundle bundle) {
        super.t(bundle);
        if (bundle == null) {
            bundle = this.f1756k;
        }
        this.f2236a0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") == null) {
            this.f2237b0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.f2238c0 = (n) bundle.getParcelable("CURRENT_MONTH_KEY");
                return;
            }
            throw new ClassCastException();
        }
        throw new ClassCastException();
    }
}
