package g0;

import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.SeekBarPreference;

/* renamed from: g0.A  reason: case insensitive filesystem */
public final class C0097A implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SeekBarPreference f2543a;

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z2) {
        SeekBarPreference seekBarPreference = this.f2543a;
        if (!z2 || (!seekBarPreference.f1938V && seekBarPreference.f1933Q)) {
            int i2 = i + seekBarPreference.f1930N;
            TextView textView = seekBarPreference.f1935S;
            if (textView != null) {
                textView.setText(String.valueOf(i2));
                return;
            }
            return;
        }
        int progress = seekBar.getProgress() + seekBarPreference.f1930N;
        if (progress != seekBarPreference.f1929M) {
            seekBarPreference.w(progress, false);
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.f2543a.f1933Q = true;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress;
        SeekBarPreference seekBarPreference = this.f2543a;
        seekBarPreference.f1933Q = false;
        int progress2 = seekBar.getProgress();
        int i = seekBarPreference.f1930N;
        if (progress2 + i != seekBarPreference.f1929M && (progress = seekBar.getProgress() + i) != seekBarPreference.f1929M) {
            seekBarPreference.w(progress, false);
        }
    }

    public C0097A(SeekBarPreference seekBarPreference) {
        this.f2543a = seekBarPreference;
    }
}
