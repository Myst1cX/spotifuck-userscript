package N0;

import android.view.View;
import com.google.android.material.internal.CheckableImageButton;
import p0.C0320a;

/* renamed from: N0.f  reason: case insensitive filesystem */
public final class C0031f extends r {
    public final /* synthetic */ int e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0031f(q qVar, int i) {
        super(qVar);
        this.e = i;
    }

    public void r() {
        switch (this.e) {
            case 0:
                q qVar = this.f677b;
                qVar.f669t = null;
                CheckableImageButton checkableImageButton = qVar.f661l;
                checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
                C0320a.w0(checkableImageButton, (View.OnLongClickListener) null);
                return;
            default:
                return;
        }
    }
}
