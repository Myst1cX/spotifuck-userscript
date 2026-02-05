package androidx.emoji2.text;

import A.b;
import Q0.C0036e;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C0069d;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import l0.C0172a;
import l0.C0173b;

public class EmojiCompatInitializer implements C0173b {
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.emoji2.text.g, androidx.emoji2.text.q] */
    public final Object b(Context context) {
        ? gVar = new g((i) new b(context, 15));
        gVar.f1510a = 1;
        if (j.f1514k == null) {
            synchronized (j.f1513j) {
                try {
                    if (j.f1514k == null) {
                        j.f1514k = new j(gVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        Object obj;
        C0172a c2 = C0172a.c(context);
        Class<ProcessLifecycleInitializer> cls = ProcessLifecycleInitializer.class;
        c2.getClass();
        synchronized (C0172a.e) {
            try {
                obj = c2.f3588a.get(cls);
                if (obj == null) {
                    obj = c2.b(cls, new HashSet());
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        final t d2 = ((r) obj).d();
        d2.a(new C0069d() {
            public final void a() {
                Handler handler;
                EmojiCompatInitializer.this.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = b.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new C0036e(3), 500);
                d2.f(this);
            }
        });
    }
}
