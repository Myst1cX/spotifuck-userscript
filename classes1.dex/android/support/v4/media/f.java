package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import f0.b;

public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f1081b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final c f1082a;

    static {
        Log.isLoggable("MediaBrowserCompat", 3);
    }

    public f(Context context, ComponentName componentName, b bVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f1082a = new c(context, componentName, bVar);
        } else if (i >= 23) {
            this.f1082a = new c(context, componentName, bVar);
        } else {
            this.f1082a = new c(context, componentName, bVar);
        }
    }
}
