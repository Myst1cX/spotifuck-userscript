package androidx.lifecycle;

import T0.d;
import Z0.c;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import l0.C0172a;
import l0.C0173b;

public final class ProcessLifecycleInitializer implements C0173b {
    public final List a() {
        return d.f927a;
    }

    public final Object b(Context context) {
        c.e("context", context);
        C0172a c2 = C0172a.c(context);
        c.d("getInstance(context)", c2);
        if (c2.f3589b.contains(ProcessLifecycleInitializer.class)) {
            if (!C0080o.f1836a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                c.c("null cannot be cast to non-null type android.app.Application", applicationContext);
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0079n());
            }
            C c3 = C.f1789n;
            c3.getClass();
            c3.f1793j = new Handler();
            c3.f1794k.d(C0077l.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            c.c("null cannot be cast to non-null type android.app.Application", applicationContext2);
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new B(c3));
            return c3;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
    }
}
