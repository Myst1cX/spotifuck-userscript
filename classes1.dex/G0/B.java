package g0;

import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

public final class B implements View.OnKeyListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SeekBarPreference f2544f;

    public B(SeekBarPreference seekBarPreference) {
        this.f2544f = seekBarPreference;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        SeekBarPreference seekBarPreference = this.f2544f;
        if ((!seekBarPreference.f1936T && (i == 21 || i == 22)) || i == 23 || i == 66) {
            return false;
        }
        SeekBar seekBar = seekBarPreference.f1934R;
        if (seekBar != null) {
            return seekBar.onKeyDown(i, keyEvent);
        }
        Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
        return false;
    }
}
