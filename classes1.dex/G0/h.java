package g0;

import K.j;
import android.os.Bundle;
import androidx.preference.ListPreference;
import h.C0115f;

public class h extends p {

    /* renamed from: v0  reason: collision with root package name */
    public int f2561v0;

    /* renamed from: w0  reason: collision with root package name */
    public CharSequence[] f2562w0;

    /* renamed from: x0  reason: collision with root package name */
    public CharSequence[] f2563x0;

    public final void N(boolean z2) {
        int i;
        if (z2 && (i = this.f2561v0) >= 0) {
            String charSequence = this.f2563x0[i].toString();
            ListPreference listPreference = (ListPreference) L();
            listPreference.getClass();
            listPreference.y(charSequence);
        }
    }

    public final void O(j jVar) {
        CharSequence[] charSequenceArr = this.f2562w0;
        int i = this.f2561v0;
        g gVar = new g(this);
        C0115f fVar = (C0115f) jVar.f333g;
        fVar.f2971l = charSequenceArr;
        fVar.f2973n = gVar;
        fVar.f2978s = i;
        fVar.f2977r = true;
        fVar.f2967g = null;
        fVar.f2968h = null;
    }

    public final void t(Bundle bundle) {
        CharSequence[] charSequenceArr;
        super.t(bundle);
        if (bundle == null) {
            ListPreference listPreference = (ListPreference) L();
            if (listPreference.f1879S == null || (charSequenceArr = listPreference.f1880T) == null) {
                throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
            }
            this.f2561v0 = listPreference.w(listPreference.f1881U);
            this.f2562w0 = listPreference.f1879S;
            this.f2563x0 = charSequenceArr;
            return;
        }
        this.f2561v0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.f2562w0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.f2563x0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    public final void y(Bundle bundle) {
        super.y(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f2561v0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f2562w0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f2563x0);
    }
}
