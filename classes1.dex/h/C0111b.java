package h;

import android.view.View;
import android.widget.AbsListView;

/* renamed from: h.b  reason: case insensitive filesystem */
public final class C0111b implements AbsListView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f2953a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2954b;

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        C0117h.b(absListView, this.f2953a, this.f2954b);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public C0111b(View view, View view2) {
        this.f2953a = view;
        this.f2954b = view2;
    }
}
