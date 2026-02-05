package N;

import K0.e;
import android.view.View;
import android.view.Window;
import p0.C0320a;

public class x0 extends C0320a {

    /* renamed from: o  reason: collision with root package name */
    public final Window f599o;

    public final void L0(int i) {
        View decorView = this.f599o.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    public x0(Window window, e eVar) {
        this.f599o = window;
    }
}
