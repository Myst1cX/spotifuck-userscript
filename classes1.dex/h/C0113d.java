package h;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: h.d  reason: case insensitive filesystem */
public final class C0113d implements AdapterView.OnItemClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C0117h f2957f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0115f f2958g;

    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        C0115f fVar = this.f2958g;
        DialogInterface.OnClickListener onClickListener = fVar.f2973n;
        C0117h hVar = this.f2957f;
        onClickListener.onClick(hVar.f2988b, i);
        if (!fVar.f2977r) {
            hVar.f2988b.dismiss();
        }
    }

    public C0113d(C0115f fVar, C0117h hVar) {
        this.f2958g = fVar;
        this.f2957f = hVar;
    }
}
