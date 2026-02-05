package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j0.C0159v;
import j0.X;

public final class g extends LinearLayoutManager {

    /* renamed from: E  reason: collision with root package name */
    public final /* synthetic */ int f2230E;

    /* renamed from: F  reason: collision with root package name */
    public final /* synthetic */ j f2231F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(j jVar, int i, int i2) {
        super(i);
        this.f2231F = jVar;
        this.f2230E = i2;
    }

    public final void A0(X x2, int[] iArr) {
        int i = this.f2230E;
        j jVar = this.f2231F;
        if (i == 0) {
            iArr[0] = jVar.f2242g0.getWidth();
            iArr[1] = jVar.f2242g0.getWidth();
            return;
        }
        iArr[0] = jVar.f2242g0.getHeight();
        iArr[1] = jVar.f2242g0.getHeight();
    }

    public final void x0(RecyclerView recyclerView, int i) {
        C0159v vVar = new C0159v(recyclerView.getContext());
        vVar.f3502a = i;
        y0(vVar);
    }
}
