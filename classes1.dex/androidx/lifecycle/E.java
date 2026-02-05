package androidx.lifecycle;

import Z0.c;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

public final class E implements Application.ActivityLifecycleCallbacks {
    public static final D Companion = new Object();

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
        c.e("bundle", bundle);
    }

    public void onActivityStarted(Activity activity) {
        c.e("activity", activity);
    }

    public void onActivityStopped(Activity activity) {
        c.e("activity", activity);
    }

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        c.e("activity", activity);
        activity.registerActivityLifecycleCallbacks(new E());
    }

    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        c.e("activity", activity);
        int i = F.f1800g;
        I.a(activity, C0077l.ON_CREATE);
    }

    public void onActivityPostResumed(Activity activity) {
        c.e("activity", activity);
        int i = F.f1800g;
        I.a(activity, C0077l.ON_RESUME);
    }

    public void onActivityPostStarted(Activity activity) {
        c.e("activity", activity);
        int i = F.f1800g;
        I.a(activity, C0077l.ON_START);
    }

    public void onActivityPreDestroyed(Activity activity) {
        c.e("activity", activity);
        int i = F.f1800g;
        I.a(activity, C0077l.ON_DESTROY);
    }

    public void onActivityPrePaused(Activity activity) {
        c.e("activity", activity);
        int i = F.f1800g;
        I.a(activity, C0077l.ON_PAUSE);
    }

    public void onActivityPreStopped(Activity activity) {
        c.e("activity", activity);
        int i = F.f1800g;
        I.a(activity, C0077l.ON_STOP);
    }
}
