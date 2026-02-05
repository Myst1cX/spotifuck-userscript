package N0;

import android.view.View;

/* renamed from: N0.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0027b implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f616a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f617b;

    public /* synthetic */ C0027b(r rVar, int i) {
        this.f616a = i;
        this.f617b = rVar;
    }

    public final void onFocusChange(View view, boolean z2) {
        switch (this.f616a) {
            case 0:
                C0030e eVar = (C0030e) this.f617b;
                eVar.t(eVar.u());
                return;
            default:
                l lVar = (l) this.f617b;
                lVar.f640l = z2;
                lVar.q();
                if (!z2) {
                    lVar.t(false);
                    lVar.f641m = false;
                    return;
                }
                return;
        }
    }
}
