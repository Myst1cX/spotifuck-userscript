package g0;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;
import androidx.preference.SwitchPreference;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;

/* renamed from: g0.a  reason: case insensitive filesystem */
public final class C0098a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2549a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TwoStatePreference f2550b;

    public /* synthetic */ C0098a(TwoStatePreference twoStatePreference, int i) {
        this.f2549a = i;
        this.f2550b = twoStatePreference;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
        switch (this.f2549a) {
            case 0:
                CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f2550b;
                checkBoxPreference.getClass();
                checkBoxPreference.w(z2);
                return;
            case 1:
                SwitchPreference switchPreference = (SwitchPreference) this.f2550b;
                switchPreference.getClass();
                switchPreference.w(z2);
                return;
            default:
                SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) this.f2550b;
                switchPreferenceCompat.getClass();
                switchPreferenceCompat.w(z2);
                return;
        }
    }
}
