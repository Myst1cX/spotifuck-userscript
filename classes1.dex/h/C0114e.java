package h;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: h.e  reason: case insensitive filesystem */
public final class C0114e implements AdapterView.OnItemClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ AlertController$RecycleListView f2959f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0117h f2960g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ C0115f f2961h;

    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        C0115f fVar = this.f2961h;
        boolean[] zArr = fVar.f2975p;
        AlertController$RecycleListView alertController$RecycleListView = this.f2959f;
        if (zArr != null) {
            zArr[i] = alertController$RecycleListView.isItemChecked(i);
        }
        fVar.f2979t.onClick(this.f2960g.f2988b, i, alertController$RecycleListView.isItemChecked(i));
    }

    public C0114e(C0115f fVar, AlertController$RecycleListView alertController$RecycleListView, C0117h hVar) {
        this.f2961h = fVar;
        this.f2959f = alertController$RecycleListView;
        this.f2960g = hVar;
    }
}
