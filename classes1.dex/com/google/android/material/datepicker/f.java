package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import j0.K;
import java.util.Calendar;

public final class f implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f2227f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ r f2228g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ j f2229h;

    public /* synthetic */ f(j jVar, r rVar, int i) {
        this.f2227f = i;
        this.f2229h = jVar;
        this.f2228g = rVar;
    }

    public final void onClick(View view) {
        int i;
        switch (this.f2227f) {
            case 0:
                j jVar = this.f2229h;
                int K02 = ((LinearLayoutManager) jVar.f2242g0.getLayoutManager()).K0() - 1;
                if (K02 >= 0) {
                    Calendar a2 = v.a(this.f2228g.f2288c.f2214a.f2274a);
                    a2.add(2, K02);
                    jVar.K(new n(a2));
                    return;
                }
                return;
            default:
                j jVar2 = this.f2229h;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) jVar2.f2242g0.getLayoutManager();
                View M02 = linearLayoutManager.M0(0, linearLayoutManager.v(), false);
                if (M02 == null) {
                    i = -1;
                } else {
                    i = K.H(M02);
                }
                int i2 = i + 1;
                if (i2 < jVar2.f2242g0.getAdapter().a()) {
                    Calendar a3 = v.a(this.f2228g.f2288c.f2214a.f2274a);
                    a3.add(2, i2);
                    jVar2.K(new n(a3));
                    return;
                }
                return;
        }
    }
}
