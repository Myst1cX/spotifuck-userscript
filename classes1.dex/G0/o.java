package g0;

import android.view.Window;
import android.view.WindowInsets;

public abstract class o {
    public static void a(Window window) {
        window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
    }
}
