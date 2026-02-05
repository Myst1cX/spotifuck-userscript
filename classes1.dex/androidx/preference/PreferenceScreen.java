package androidx.preference;

import E.b;
import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.r;

public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: S  reason: collision with root package name */
    public final boolean f1928S = true;

    public final void l() {
        r rVar;
        if (this.f1907l == null && this.f1908m == null && this.f1923N.size() != 0 && (rVar = this.f1899b.f2612j) != null) {
            for (rVar = this.f1899b.f2612j; rVar != null; rVar = rVar.f1771z) {
            }
        }
    }

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, b.b(context, 2130969531, 16842891));
    }
}
