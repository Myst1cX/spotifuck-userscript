package com.google.android.material.datepicker;

import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.text.format.DateUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import j0.K;
import j0.N;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

public final class i extends N {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f2233a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialButton f2234b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j f2235c;

    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f2234b.getText());
        }
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        int i3;
        String str;
        j jVar = this.f2235c;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) jVar.f2242g0.getLayoutManager();
            View M02 = linearLayoutManager.M0(0, linearLayoutManager.v(), false);
            if (M02 == null) {
                i3 = -1;
            } else {
                i3 = K.H(M02);
            }
        } else {
            i3 = ((LinearLayoutManager) jVar.f2242g0.getLayoutManager()).K0();
        }
        b bVar = this.f2233a.f2288c;
        Calendar a2 = v.a(bVar.f2214a.f2274a);
        a2.add(2, i3);
        jVar.f2238c0 = new n(a2);
        Calendar a3 = v.a(bVar.f2214a.f2274a);
        a3.add(2, i3);
        a3.set(5, 1);
        Calendar a4 = v.a(a3);
        a4.get(2);
        a4.get(1);
        a4.getMaximum(7);
        a4.getActualMaximum(5);
        a4.getTimeInMillis();
        long timeInMillis = a4.getTimeInMillis();
        if (Build.VERSION.SDK_INT >= 24) {
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = v.f2291a;
            DateFormat c2 = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            c2.setTimeZone(TimeZone.getTimeZone("UTC"));
            c2.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            str = c2.format(new Date(timeInMillis));
        } else {
            str = DateUtils.formatDateTime((Context) null, timeInMillis, 8228);
        }
        this.f2234b.setText(str);
    }

    public i(j jVar, r rVar, MaterialButton materialButton) {
        this.f2235c = jVar;
        this.f2233a = rVar;
        this.f2234b = materialButton;
    }
}
