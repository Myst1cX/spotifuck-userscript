package C;

import A.k;
import K.g;
import N.Q;
import V.e;
import android.app.Application;
import android.graphics.Typeface;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.d;
import android.util.Log;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f35a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f36b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f37c;

    public /* synthetic */ b(Object obj, Object obj2, int i) {
        this.f35a = i;
        this.f36b = obj;
        this.f37c = obj2;
    }

    public final void run() {
        Object obj = this.f36b;
        Object obj2 = this.f37c;
        switch (this.f35a) {
            case 0:
                ((c) obj).f38a = obj2;
                return;
            case 1:
                ((Application) obj2).unregisterActivityLifecycleCallbacks((c) obj);
                return;
            case 2:
                try {
                    Method method = d.f46d;
                    if (method != null) {
                        method.invoke(obj2, new Object[]{obj, Boolean.FALSE, "AppCompat recreation"});
                        return;
                    }
                    d.e.invoke(obj2, new Object[]{obj, Boolean.FALSE});
                    return;
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 3:
                E.b bVar = (E.b) ((A.b) obj).f2g;
                if (bVar != null) {
                    bVar.j((Typeface) obj2);
                    return;
                }
                return;
            case 4:
                ((g) obj).a(obj2);
                return;
            case 5:
                k kVar = (k) obj2;
                ArrayList arrayList = (ArrayList) kVar.f23h;
                MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
                if (!arrayList.isEmpty()) {
                    d a2 = mediaSessionCompat$Token.a();
                    if (a2 != null) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((Bundle) it2.next()).putBinder("extra_session_binder", a2.asBinder());
                        }
                    }
                    arrayList.clear();
                }
                ((d0.d) kVar.f21f).setSessionToken((MediaSession.Token) mediaSessionCompat$Token.f1089b);
                return;
            default:
                e eVar = ((SwipeDismissBehavior) obj2).f2103a;
                if (eVar != null && eVar.f()) {
                    WeakHashMap weakHashMap = Q.f509a;
                    ((View) obj).postOnAnimation(this);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, int i, boolean z2) {
        this.f35a = i;
        this.f37c = obj;
        this.f36b = obj2;
    }

    public b(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z2) {
        this.f35a = 6;
        this.f37c = swipeDismissBehavior;
        this.f36b = view;
    }
}
