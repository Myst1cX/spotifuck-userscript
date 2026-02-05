package g0;

import K.j;
import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import h.C0115f;
import java.util.ArrayList;
import java.util.HashSet;

public class k extends p {

    /* renamed from: v0  reason: collision with root package name */
    public final HashSet f2566v0 = new HashSet();

    /* renamed from: w0  reason: collision with root package name */
    public boolean f2567w0;

    /* renamed from: x0  reason: collision with root package name */
    public CharSequence[] f2568x0;

    /* renamed from: y0  reason: collision with root package name */
    public CharSequence[] f2569y0;

    public final void N(boolean z2) {
        if (z2 && this.f2567w0) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) L();
            multiSelectListPreference.getClass();
            multiSelectListPreference.w(this.f2566v0);
        }
        this.f2567w0 = false;
    }

    public final void O(j jVar) {
        int length = this.f2569y0.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.f2566v0.contains(this.f2569y0[i].toString());
        }
        CharSequence[] charSequenceArr = this.f2568x0;
        j jVar2 = new j(this);
        C0115f fVar = (C0115f) jVar.f333g;
        fVar.f2971l = charSequenceArr;
        fVar.f2979t = jVar2;
        fVar.f2975p = zArr;
        fVar.f2976q = true;
    }

    public final void t(Bundle bundle) {
        CharSequence[] charSequenceArr;
        super.t(bundle);
        HashSet hashSet = this.f2566v0;
        if (bundle == null) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) L();
            if (multiSelectListPreference.f1884S == null || (charSequenceArr = multiSelectListPreference.f1885T) == null) {
                throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            hashSet.clear();
            hashSet.addAll(multiSelectListPreference.f1886U);
            this.f2567w0 = false;
            this.f2568x0 = multiSelectListPreference.f1884S;
            this.f2569y0 = charSequenceArr;
            return;
        }
        hashSet.clear();
        hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.f2567w0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.f2568x0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.f2569y0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }

    public final void y(Bundle bundle) {
        super.y(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList(this.f2566v0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f2567w0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f2568x0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f2569y0);
    }
}
