package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j0.H;
import java.util.Calendar;

public final class h extends H {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f2232a;

    public h(j jVar) {
        this.f2232a = jVar;
        v.c((Calendar) null);
        v.c((Calendar) null);
    }

    public final void b(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof x) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            x xVar = (x) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            this.f2232a.getClass();
            throw null;
        }
    }
}
