package androidx.activity;

import R0.h;
import T0.a;
import Z0.c;
import android.os.Build;
import android.widget.Toast;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.H;
import androidx.lifecycle.C0078m;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import it.deviato.spotifuck.AppSingleton;
import it.deviato.spotifuck.MainActivity;
import it.deviato.spotifuck.WebService;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public final class A {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f1134a;

    /* renamed from: b  reason: collision with root package name */
    public final a f1135b = new a();

    /* renamed from: c  reason: collision with root package name */
    public h f1136c;

    /* renamed from: d  reason: collision with root package name */
    public final OnBackInvokedCallback f1137d;
    public OnBackInvokedDispatcher e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1138f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1139g;

    public final void a(r rVar, h hVar) {
        c.e("onBackPressedCallback", hVar);
        t d2 = rVar.d();
        if (d2.f1841c != C0078m.f1831a) {
            hVar.f862b.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, d2, hVar));
            e();
            hVar.f863c = new z(0, this);
        }
    }

    public final void b() {
        Object obj;
        if (this.f1136c == null) {
            a aVar = this.f1135b;
            ListIterator listIterator = aVar.listIterator(aVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((h) obj).f861a) {
                    break;
                }
            }
            h hVar = (h) obj;
        }
        this.f1136c = null;
    }

    public final void c() {
        Object obj;
        h hVar = this.f1136c;
        if (hVar == null) {
            a aVar = this.f1135b;
            ListIterator listIterator = aVar.listIterator(aVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((h) obj).f861a) {
                    break;
                }
            }
            hVar = (h) obj;
        }
        this.f1136c = null;
        if (hVar != null) {
            switch (hVar.f864d) {
                case 0:
                    boolean booleanValue = WebService.f3193t.booleanValue();
                    MainActivity mainActivity = (MainActivity) hVar.e;
                    if (!booleanValue) {
                        mainActivity.finish();
                        return;
                    }
                    String url = MainActivity.f3167K.getUrl();
                    if (!url.equals("https://open.spotify.com/") && !url.matches("https://open\\.spotify\\.com/intl-[a-zA-Z]{2}/") && MainActivity.f3167K.canGoBack()) {
                        MainActivity.f3167K.goBack();
                        MainActivity.t(mainActivity.getString(2131755236));
                        return;
                    } else if (MainActivity.f3172P) {
                        mainActivity.moveTaskToBack(true);
                        return;
                    } else {
                        MainActivity.f3172P = true;
                        Toast.makeText(AppSingleton.f3142f, mainActivity.getString(2131755238), 0).show();
                        mainActivity.f3176D.postDelayed(mainActivity.f3177E, 2000);
                        return;
                    }
                default:
                    H h2 = (H) hVar.e;
                    h2.x(true);
                    if (h2.f1587h.f861a) {
                        h2.L();
                        return;
                    } else {
                        h2.f1586g.c();
                        return;
                    }
            }
        } else {
            Runnable runnable = this.f1134a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void d(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        OnBackInvokedCallback onBackInvokedCallback = this.f1137d;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            if (z2 && !this.f1138f) {
                i.b(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f1138f = true;
            } else if (!z2 && this.f1138f) {
                i.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f1138f = false;
            }
        }
    }

    public final void e() {
        boolean z2 = this.f1139g;
        a aVar = this.f1135b;
        boolean z3 = false;
        if (!(aVar instanceof Collection) || !aVar.isEmpty()) {
            Iterator it2 = aVar.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((h) it2.next()).f861a) {
                        z3 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.f1139g = z3;
        if (z3 != z2 && Build.VERSION.SDK_INT >= 33) {
            d(z3);
        }
    }

    public A(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallback;
        this.f1134a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                onBackInvokedCallback = new x(new u(this, 0), new u(this, 1), new v(this, 0), new v(this, 1));
            } else {
                onBackInvokedCallback = new w(0, new v(this, 2));
            }
            this.f1137d = onBackInvokedCallback;
        }
    }
}
