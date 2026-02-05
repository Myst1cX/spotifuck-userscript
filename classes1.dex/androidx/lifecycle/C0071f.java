package androidx.lifecycle;

import Z0.c;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: androidx.lifecycle.f  reason: case insensitive filesystem */
public abstract class C0071f implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        c.e("activity", activity);
    }

    public void onActivityDestroyed(Activity activity) {
        c.e("activity", activity);
    }

    public void onActivityPaused(Activity activity) {
        c.e("activity", activity);
    }

    public void onActivityResumed(Activity activity) {
        c.e("activity", activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c.e("activity", activity);
        c.e("outState", bundle);
    }

    public void onActivityStarted(Activity activity) {
        c.e("activity", activity);
    }

    public void onActivityStopped(Activity activity) {
        c.e("activity", activity);
    }
}
