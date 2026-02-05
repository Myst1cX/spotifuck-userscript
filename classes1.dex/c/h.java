package C;

import N.C0011k;
import Z0.c;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.F;
import androidx.lifecycle.I;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import p0.C0320a;

public abstract class h extends Activity implements r, C0011k {

    /* renamed from: f  reason: collision with root package name */
    public final t f50f = new t(this);

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        c.e("event", keyEvent);
        View decorView = getWindow().getDecorView();
        c.d("window.decorView", decorView);
        if (C0320a.B(decorView, keyEvent)) {
            return true;
        }
        return C0320a.C(this, decorView, this, keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        c.e("event", keyEvent);
        View decorView = getWindow().getDecorView();
        c.d("window.decorView", decorView);
        if (C0320a.B(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean e(KeyEvent keyEvent) {
        c.e("event", keyEvent);
        return super.dispatchKeyEvent(keyEvent);
    }

    public void onSaveInstanceState(Bundle bundle) {
        c.e("outState", bundle);
        this.f50f.g();
        super.onSaveInstanceState(bundle);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = F.f1800g;
        I.c(this);
    }
}
