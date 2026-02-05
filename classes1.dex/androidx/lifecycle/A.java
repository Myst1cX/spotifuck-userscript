package androidx.lifecycle;

import Z0.c;
import android.app.Activity;

public final class A extends C0071f {
    final /* synthetic */ C this$0;

    public A(C c2) {
        this.this$0 = c2;
    }

    public void onActivityPostResumed(Activity activity) {
        c.e("activity", activity);
        this.this$0.a();
    }

    public void onActivityPostStarted(Activity activity) {
        c.e("activity", activity);
        C c2 = this.this$0;
        int i = c2.f1790f + 1;
        c2.f1790f = i;
        if (i == 1 && c2.i) {
            c2.f1794k.d(C0077l.ON_START);
            c2.i = false;
        }
    }
}
