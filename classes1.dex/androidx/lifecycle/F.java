package androidx.lifecycle;

import A.b;
import Z0.c;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

public final class F extends Fragment {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f1800g = 0;

    /* renamed from: f  reason: collision with root package name */
    public b f1801f;

    public final void a(C0077l lVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            c.d("activity", activity);
            I.a(activity, lVar);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(C0077l.ON_CREATE);
    }

    public final void onDestroy() {
        super.onDestroy();
        a(C0077l.ON_DESTROY);
        this.f1801f = null;
    }

    public final void onPause() {
        super.onPause();
        a(C0077l.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        b bVar = this.f1801f;
        if (bVar != null) {
            ((C) bVar.f2g).a();
        }
        a(C0077l.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        b bVar = this.f1801f;
        if (bVar != null) {
            C c2 = (C) bVar.f2g;
            int i = c2.f1790f + 1;
            c2.f1790f = i;
            if (i == 1 && c2.i) {
                c2.f1794k.d(C0077l.ON_START);
                c2.i = false;
            }
        }
        a(C0077l.ON_START);
    }

    public final void onStop() {
        super.onStop();
        a(C0077l.ON_STOP);
    }
}
