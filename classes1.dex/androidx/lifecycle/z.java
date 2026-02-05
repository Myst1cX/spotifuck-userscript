package androidx.lifecycle;

import Z0.c;
import android.app.Activity;
import android.app.Application;

public abstract class z {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        c.e("activity", activity);
        c.e("callback", activityLifecycleCallbacks);
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
