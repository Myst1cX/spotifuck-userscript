package N;

import android.view.WindowInsets;

public abstract class v0 {
    public static int a(int i) {
        int b2;
        int i2 = 0;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    b2 = WindowInsets.Type.statusBars();
                } else if (i3 == 2) {
                    b2 = WindowInsets.Type.navigationBars();
                } else if (i3 == 4) {
                    b2 = WindowInsets.Type.captionBar();
                } else if (i3 == 8) {
                    b2 = WindowInsets.Type.ime();
                } else if (i3 == 16) {
                    b2 = WindowInsets.Type.systemGestures();
                } else if (i3 == 32) {
                    b2 = WindowInsets.Type.mandatorySystemGestures();
                } else if (i3 == 64) {
                    b2 = WindowInsets.Type.tappableElement();
                } else if (i3 == 128) {
                    b2 = WindowInsets.Type.displayCutout();
                }
                i2 |= b2;
            }
        }
        return i2;
    }
}
