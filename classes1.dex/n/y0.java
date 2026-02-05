package N;

import android.view.View;
import android.view.Window;

public class y0 extends x0 {
    public final void u0(boolean z2) {
        if (z2) {
            Window window = this.f599o;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
            return;
        }
        L0(8192);
    }
}
