package com.google.android.material.datepicker;

import A.b;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import j0.C;
import j0.L;
import j0.a0;
import java.util.Calendar;

public final class r extends C {

    /* renamed from: c  reason: collision with root package name */
    public final b f2288c;

    /* renamed from: d  reason: collision with root package name */
    public final b f2289d;
    public final int e;

    public final int a() {
        return this.f2288c.f2219g;
    }

    public final long b(int i) {
        Calendar a2 = v.a(this.f2288c.f2214a.f2274a);
        a2.add(2, i);
        a2.set(5, 1);
        Calendar a3 = v.a(a2);
        a3.get(2);
        a3.get(1);
        a3.getMaximum(7);
        a3.getActualMaximum(5);
        a3.getTimeInMillis();
        return a3.getTimeInMillis();
    }

    public final void d(a0 a0Var, int i) {
        q qVar = (q) a0Var;
        b bVar = this.f2288c;
        Calendar a2 = v.a(bVar.f2214a.f2274a);
        a2.add(2, i);
        n nVar = new n(a2);
        qVar.f2286t.setText(nVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) qVar.f2287u.findViewById(2131296552);
        if (materialCalendarGridView.a() == null || !nVar.equals(materialCalendarGridView.a().f2281a)) {
            new o(nVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    public r(ContextThemeWrapper contextThemeWrapper, b bVar, b bVar2) {
        int i;
        n nVar = bVar.f2214a;
        n nVar2 = bVar.f2217d;
        if (nVar.f2274a.compareTo(nVar2.f2274a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (nVar2.f2274a.compareTo(bVar.f2215b.f2274a) <= 0) {
            int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(2131165815) * o.f2280d;
            if (l.N(contextThemeWrapper, 16843277)) {
                i = contextThemeWrapper.getResources().getDimensionPixelSize(2131165815);
            } else {
                i = 0;
            }
            this.e = dimensionPixelSize + i;
            this.f2288c = bVar;
            this.f2289d = bVar2;
            f(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    public final a0 e(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(2131492945, viewGroup, false);
        if (!l.N(viewGroup.getContext(), 16843277)) {
            return new q(linearLayout, false);
        }
        linearLayout.setLayoutParams(new L(-1, this.e));
        return new q(linearLayout, true);
    }
}
