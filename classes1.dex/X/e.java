package X;

import android.support.v4.media.session.t;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

public final class e implements KeyListener {

    /* renamed from: a  reason: collision with root package name */
    public final KeyListener f988a;

    /* renamed from: b  reason: collision with root package name */
    public final K0.e f989b;

    public e(KeyListener keyListener) {
        K0.e eVar = new K0.e(9);
        this.f988a = keyListener;
        this.f989b = eVar;
    }

    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f988a.clearMetaKeyState(view, editable, i);
    }

    public final int getInputType() {
        return this.f988a.getInputType();
    }

    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z2;
        boolean z3;
        this.f989b.getClass();
        if (i == 67) {
            z2 = t.h(editable, keyEvent, false);
        } else if (i != 112) {
            z2 = false;
        } else {
            z2 = t.h(editable, keyEvent, true);
        }
        if (z2) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 || this.f988a.onKeyDown(view, editable, i, keyEvent)) {
            return true;
        }
        return false;
    }

    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f988a.onKeyOther(view, editable, keyEvent);
    }

    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f988a.onKeyUp(view, editable, i, keyEvent);
    }
}
