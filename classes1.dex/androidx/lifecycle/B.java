package androidx.lifecycle;

import Z0.c;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

public final class B extends C0071f {
    final /* synthetic */ C this$0;

    public B(C c2) {
        this.this$0 = c2;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        c.e("activity", activity);
        if (Build.VERSION.SDK_INT < 29) {
            int i = F.f1800g;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            c.c("null cannot be cast to non-null type androidx.lifecycle.ReportFragment", findFragmentByTag);
            ((F) findFragmentByTag).f1801f = this.this$0.f1796m;
        }
    }

    public void onActivityPaused(Activity activity) {
        c.e("activity", activity);
        C c2 = this.this$0;
        int i = c2.f1791g - 1;
        c2.f1791g = i;
        if (i == 0) {
            Handler handler = c2.f1793j;
            c.b(handler);
            handler.postDelayed(c2.f1795l, 700);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        c.e("activity", activity);
        z.a(activity, new A(this.this$0));
    }

    public void onActivityStopped(Activity activity) {
        c.e("activity", activity);
        C c2 = this.this$0;
        int i = c2.f1790f - 1;
        c2.f1790f = i;
        if (i == 0 && c2.f1792h) {
            c2.f1794k.d(C0077l.ON_STOP);
            c2.i = true;
        }
    }
}
