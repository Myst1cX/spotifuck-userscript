package N0;

import android.widget.AutoCompleteTextView;

public final /* synthetic */ class j implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f633a;

    public /* synthetic */ j(l lVar) {
        this.f633a = lVar;
    }

    public final void onDismiss() {
        l lVar = this.f633a;
        lVar.f641m = true;
        lVar.f643o = System.currentTimeMillis();
        lVar.t(false);
    }
}
