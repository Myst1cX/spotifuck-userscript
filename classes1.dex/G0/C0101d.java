package g0;

import N0.B;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* renamed from: g0.d  reason: case insensitive filesystem */
public class C0101d extends p {

    /* renamed from: v0  reason: collision with root package name */
    public EditText f2554v0;

    /* renamed from: w0  reason: collision with root package name */
    public CharSequence f2555w0;

    /* renamed from: x0  reason: collision with root package name */
    public final B f2556x0 = new B(8, this);

    /* renamed from: y0  reason: collision with root package name */
    public long f2557y0 = -1;

    public final void N(boolean z2) {
        if (z2) {
            String obj = this.f2554v0.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) L();
            editTextPreference.getClass();
            editTextPreference.w(obj);
        }
    }

    public final void P() {
        long j2 = this.f2557y0;
        if (j2 != -1 && j2 + 1000 > SystemClock.currentThreadTimeMillis()) {
            EditText editText = this.f2554v0;
            if (editText == null || !editText.isFocused()) {
                this.f2557y0 = -1;
            } else if (((InputMethodManager) this.f2554v0.getContext().getSystemService("input_method")).showSoftInput(this.f2554v0, 0)) {
                this.f2557y0 = -1;
            } else {
                EditText editText2 = this.f2554v0;
                B b2 = this.f2556x0;
                editText2.removeCallbacks(b2);
                this.f2554v0.postDelayed(b2, 50);
            }
        }
    }

    public final void M(View view) {
        super.M(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.f2554v0 = editText;
        if (editText != null) {
            editText.requestFocus();
            this.f2554v0.setText(this.f2555w0);
            EditText editText2 = this.f2554v0;
            editText2.setSelection(editText2.getText().length());
            ((EditTextPreference) L()).getClass();
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    public final void t(Bundle bundle) {
        super.t(bundle);
        if (bundle == null) {
            this.f2555w0 = ((EditTextPreference) L()).f1878S;
        } else {
            this.f2555w0 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    public final void y(Bundle bundle) {
        super.y(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f2555w0);
    }
}
