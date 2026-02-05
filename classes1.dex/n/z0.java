package N;

import android.view.View;
import android.view.Window;

public final class z0 extends y0 {
    public final void t0(boolean z2) {
        if (z2) {
            Window window = this.f599o;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
            return;
        }
        L0(16);
    }
}
