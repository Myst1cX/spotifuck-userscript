package com.google.android.material.datepicker;

import K0.e;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import j0.C;
import j0.a0;
import java.util.Locale;

public final class x extends C {

    /* renamed from: c  reason: collision with root package name */
    public final j f2293c;

    public final void d(a0 a0Var, int i) {
        String str;
        j jVar = this.f2293c;
        int i2 = jVar.f2237b0.f2214a.f2276c + i;
        String format = String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i2)});
        TextView textView = ((w) a0Var).f2292t;
        textView.setText(format);
        Context context = textView.getContext();
        if (v.b().get(1) == i2) {
            str = String.format(context.getString(2131755185), new Object[]{Integer.valueOf(i2)});
        } else {
            str = String.format(context.getString(2131755186), new Object[]{Integer.valueOf(i2)});
        }
        textView.setContentDescription(str);
        c cVar = jVar.f2240e0;
        if (v.b().get(1) == i2) {
            e eVar = cVar.f2221b;
        } else {
            e eVar2 = cVar.f2220a;
        }
        throw null;
    }

    public final int a() {
        return this.f2293c.f2237b0.f2218f;
    }

    public x(j jVar) {
        this.f2293c = jVar;
    }

    public final a0 e(ViewGroup viewGroup, int i) {
        return new w((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(2131492949, viewGroup, false));
    }
}
