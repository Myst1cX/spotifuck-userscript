package C;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

public final class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public Object f38a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f39b;

    /* renamed from: c  reason: collision with root package name */
    public final int f40c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f41d = false;
    public boolean e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f42f = false;

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        if (this.f39b == activity) {
            this.f39b = null;
            this.e = true;
        }
    }

    public final void onActivityPaused(Activity activity) {
        if (this.e && !this.f42f && !this.f41d) {
            Object obj = this.f38a;
            try {
                Object obj2 = d.f45c.get(activity);
                if (obj2 == obj && activity.hashCode() == this.f40c) {
                    d.f48g.postAtFrontOfQueue(new b(d.f44b.get(activity), obj2, 2, false));
                    this.f42f = true;
                    this.f38a = null;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
        }
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        if (this.f39b == activity) {
            this.f41d = true;
        }
    }

    public final void onActivityStopped(Activity activity) {
    }

    public c(Activity activity) {
        this.f39b = activity;
        this.f40c = activity.hashCode();
    }
}
