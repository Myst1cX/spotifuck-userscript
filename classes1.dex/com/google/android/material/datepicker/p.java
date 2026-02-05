package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

public final class p implements AdapterView.OnItemClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f2284f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ r f2285g;

    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        MaterialCalendarGridView materialCalendarGridView = this.f2284f;
        o a2 = materialCalendarGridView.a();
        if (i >= a2.a() && i <= a2.c()) {
            if (materialCalendarGridView.a().getItem(i).longValue() >= ((j) this.f2285g.f2289d.f2g).f2237b0.f2216c.f2222a) {
                throw null;
            }
        }
    }

    public p(r rVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f2285g = rVar;
        this.f2284f = materialCalendarGridView;
    }
}
