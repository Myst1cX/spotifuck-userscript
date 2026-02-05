package com.google.android.material.datepicker;

import N.A;
import N.Q;
import android.widget.LinearLayout;
import android.widget.TextView;
import j0.a0;
import java.util.WeakHashMap;

public final class q extends a0 {

    /* renamed from: t  reason: collision with root package name */
    public final TextView f2286t;

    /* renamed from: u  reason: collision with root package name */
    public final MaterialCalendarGridView f2287u;

    public q(LinearLayout linearLayout, boolean z2) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(2131296557);
        this.f2286t = textView;
        WeakHashMap weakHashMap = Q.f509a;
        new A(2131296727, Boolean.class, 0, 28, 3).d(textView, Boolean.TRUE);
        this.f2287u = (MaterialCalendarGridView) linearLayout.findViewById(2131296552);
        if (!z2) {
            textView.setVisibility(8);
        }
    }
}
