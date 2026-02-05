package g0;

import android.view.View;
import android.widget.AdapterView;
import androidx.preference.DropDownPreference;
import o.C0309v0;
import o.H0;

/* renamed from: g0.b  reason: case insensitive filesystem */
public final class C0099b implements AdapterView.OnItemSelectedListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f2551f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f2552g;

    public /* synthetic */ C0099b(int i, Object obj) {
        this.f2551f = i;
        this.f2552g = obj;
    }

    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.f2551f;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j2) {
        C0309v0 v0Var;
        switch (this.f2551f) {
            case 0:
                if (i >= 0) {
                    DropDownPreference dropDownPreference = (DropDownPreference) this.f2552g;
                    String charSequence = dropDownPreference.f1880T[i].toString();
                    if (!charSequence.equals(dropDownPreference.f1881U)) {
                        dropDownPreference.getClass();
                        dropDownPreference.y(charSequence);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i != -1 && (v0Var = ((H0) this.f2552g).f4076h) != null) {
                    v0Var.setListSelectionHidden(false);
                    return;
                }
                return;
        }
    }
}
