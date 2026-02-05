package N0;

import android.view.View;
import android.widget.AdapterView;
import o.C0259N;
import o.C0262Q;
import o.H0;

public final class v implements AdapterView.OnItemClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f711f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f712g;

    public /* synthetic */ v(int i, Object obj) {
        this.f711f = i;
        this.f712g = obj;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        Object obj;
        switch (this.f711f) {
            case 0:
                View view2 = null;
                x xVar = (x) this.f712g;
                if (i < 0) {
                    H0 h02 = xVar.f716j;
                    if (!h02.f4073E.isShowing()) {
                        obj = null;
                    } else {
                        obj = h02.f4076h.getSelectedItem();
                    }
                } else {
                    obj = xVar.getAdapter().getItem(i);
                }
                x.a(xVar, obj);
                AdapterView.OnItemClickListener onItemClickListener = xVar.getOnItemClickListener();
                H0 h03 = xVar.f716j;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        if (h03.f4073E.isShowing()) {
                            view2 = h03.f4076h.getSelectedView();
                        }
                        view = view2;
                        if (!h03.f4073E.isShowing()) {
                            i = -1;
                        } else {
                            i = h03.f4076h.getSelectedItemPosition();
                        }
                        if (!h03.f4073E.isShowing()) {
                            j2 = Long.MIN_VALUE;
                        } else {
                            j2 = h03.f4076h.getSelectedItemId();
                        }
                    }
                    onItemClickListener.onItemClick(h03.f4076h, view, i, j2);
                }
                h03.dismiss();
                return;
            default:
                C0259N n2 = (C0259N) this.f712g;
                n2.f4111M.setSelection(i);
                C0262Q q2 = n2.f4111M;
                if (q2.getOnItemClickListener() != null) {
                    q2.performItemClick(view, i, n2.f4108J.getItemId(i));
                }
                n2.dismiss();
                return;
        }
    }
}
