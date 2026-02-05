package androidx.activity;

import C.h;
import C.i;
import C.t;
import C.u;
import C.v;
import D.f;
import D.g;
import M.a;
import N.C0012l;
import S0.b;
import Z0.c;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.A;
import androidx.lifecycle.C0073h;
import androidx.lifecycle.F;
import androidx.lifecycle.I;
import androidx.lifecycle.N;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import c.C0085a;
import c.C0086b;
import d.C0091d;
import h.C0121l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k0.C0168c;
import k0.C0169d;
import k0.C0170e;

public abstract class n extends h implements Q, C0073h, C0170e, B, C0091d, f, g, t, u, C0012l {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f1174w = 0;

    /* renamed from: g  reason: collision with root package name */
    public final C0085a f1175g = new C0085a();

    /* renamed from: h  reason: collision with root package name */
    public final android.support.v4.media.session.t f1176h;
    public final C0169d i;

    /* renamed from: j  reason: collision with root package name */
    public P f1177j;

    /* renamed from: k  reason: collision with root package name */
    public final k f1178k;

    /* renamed from: l  reason: collision with root package name */
    public final b f1179l;

    /* renamed from: m  reason: collision with root package name */
    public final l f1180m;

    /* renamed from: n  reason: collision with root package name */
    public final CopyOnWriteArrayList f1181n;

    /* renamed from: o  reason: collision with root package name */
    public final CopyOnWriteArrayList f1182o;

    /* renamed from: p  reason: collision with root package name */
    public final CopyOnWriteArrayList f1183p;

    /* renamed from: q  reason: collision with root package name */
    public final CopyOnWriteArrayList f1184q;

    /* renamed from: r  reason: collision with root package name */
    public final CopyOnWriteArrayList f1185r;

    /* renamed from: s  reason: collision with root package name */
    public final CopyOnWriteArrayList f1186s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1187t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1188u;

    /* renamed from: v  reason: collision with root package name */
    public final b f1189v;

    public final void onMultiWindowModeChanged(boolean z2) {
        if (!this.f1187t) {
            Iterator it2 = this.f1184q.iterator();
            while (it2.hasNext()) {
                ((a) it2.next()).a(new i(z2));
            }
        }
    }

    public final void onPictureInPictureModeChanged(boolean z2) {
        if (!this.f1188u) {
            Iterator it2 = this.f1185r.iterator();
            while (it2.hasNext()) {
                ((a) it2.next()).a(new v(z2));
            }
        }
    }

    public final void startActivityForResult(Intent intent, int i2) {
        c.e("intent", intent);
        super.startActivityForResult(intent, i2);
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) {
        c.e("intent", intentSender);
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    public final b0.c a() {
        Bundle bundle;
        b0.c cVar = new b0.c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = cVar.f2076a;
        if (application != null) {
            N n2 = N.f1815a;
            Application application2 = getApplication();
            c.d("application", application2);
            linkedHashMap.put(n2, application2);
        }
        linkedHashMap.put(I.f1803a, this);
        linkedHashMap.put(I.f1804b, this);
        Intent intent = getIntent();
        if (intent != null) {
            bundle = intent.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            linkedHashMap.put(I.f1805c, bundle);
        }
        return cVar;
    }

    public final C0168c b() {
        return this.i.f3568b;
    }

    public final androidx.lifecycle.t d() {
        return this.f50f;
    }

    public final void g(a aVar) {
        c.e("listener", aVar);
        this.f1181n.add(aVar);
    }

    public final void h(C0086b bVar) {
        C0085a aVar = this.f1175g;
        aVar.getClass();
        n nVar = aVar.f2082b;
        if (nVar != null) {
            bVar.a(nVar);
        }
        aVar.f2081a.add(bVar);
    }

    public final A i() {
        return (A) this.f1189v.a();
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (!this.f1180m.a(i2, i3, intent)) {
            super.onActivityResult(i2, i3, intent);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        c.e("newConfig", configuration);
        super.onConfigurationChanged(configuration);
        Iterator it2 = this.f1181n.iterator();
        while (it2.hasNext()) {
            ((a) it2.next()).a(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        this.i.b(bundle);
        C0085a aVar = this.f1175g;
        aVar.getClass();
        aVar.f2082b = this;
        Iterator it2 = aVar.f2081a.iterator();
        while (it2.hasNext()) {
            ((C0086b) it2.next()).a(this);
        }
        super.onCreate(bundle);
        int i2 = F.f1800g;
        I.c(this);
    }

    public final boolean onCreatePanelMenu(int i2, Menu menu) {
        c.e("menu", menu);
        if (i2 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i2, menu);
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f1176h.f1132c).iterator();
        while (it2.hasNext()) {
            ((A) it2.next()).f1556a.j();
        }
        return true;
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        c.e("item", menuItem);
        boolean z2 = true;
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 != 0) {
            return false;
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.f1176h.f1132c).iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((A) it2.next()).f1556a.o()) {
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        return z2;
    }

    public final void onNewIntent(Intent intent) {
        c.e("intent", intent);
        super.onNewIntent(intent);
        Iterator it2 = this.f1183p.iterator();
        while (it2.hasNext()) {
            ((a) it2.next()).a(intent);
        }
    }

    public void onPanelClosed(int i2, Menu menu) {
        c.e("menu", menu);
        Iterator it2 = ((CopyOnWriteArrayList) this.f1176h.f1132c).iterator();
        while (it2.hasNext()) {
            ((A) it2.next()).f1556a.p();
        }
        super.onPanelClosed(i2, menu);
    }

    public final boolean onPreparePanel(int i2, View view, Menu menu) {
        c.e("menu", menu);
        if (i2 != 0) {
            return true;
        }
        super.onPreparePanel(i2, view, menu);
        Iterator it2 = ((CopyOnWriteArrayList) this.f1176h.f1132c).iterator();
        while (it2.hasNext()) {
            ((A) it2.next()).f1556a.s();
        }
        return true;
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        c.e("permissions", strArr);
        c.e("grantResults", iArr);
        if (!this.f1180m.a(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i2, strArr, iArr);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.activity.j, java.lang.Object] */
    public final Object onRetainNonConfigurationInstance() {
        j jVar;
        P p2 = this.f1177j;
        if (p2 == null && (jVar = (j) getLastNonConfigurationInstance()) != null) {
            p2 = jVar.f1161a;
        }
        if (p2 == null) {
            return null;
        }
        ? obj = new Object();
        obj.f1161a = p2;
        return obj;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        c.e("outState", bundle);
        androidx.lifecycle.t tVar = this.f50f;
        if (tVar instanceof androidx.lifecycle.t) {
            c.c("null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry", tVar);
            tVar.g();
        }
        super.onSaveInstanceState(bundle);
        this.i.c(bundle);
    }

    public final void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        c.e("intent", intent);
        super.startActivityForResult(intent, i2, bundle);
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        c.e("intent", intentSender);
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    public n() {
        C0121l lVar = (C0121l) this;
        this.f1176h = new android.support.v4.media.session.t((Runnable) new d(lVar, 0));
        C0169d dVar = new C0169d(this);
        this.i = dVar;
        this.f1178k = new k(lVar);
        this.f1179l = new b(new m(lVar, 1));
        new AtomicInteger();
        this.f1180m = new l();
        this.f1181n = new CopyOnWriteArrayList();
        this.f1182o = new CopyOnWriteArrayList();
        this.f1183p = new CopyOnWriteArrayList();
        this.f1184q = new CopyOnWriteArrayList();
        this.f1185r = new CopyOnWriteArrayList();
        this.f1186s = new CopyOnWriteArrayList();
        androidx.lifecycle.t tVar = this.f50f;
        if (tVar != null) {
            tVar.a(new e(0, lVar));
            this.f50f.a(new e(1, lVar));
            this.f50f.a(new ComponentActivity$4(lVar));
            dVar.a();
            I.b(this);
            if (Build.VERSION.SDK_INT <= 23) {
                this.f50f.a(new ImmLeaksCleaner(this));
            }
            dVar.f3568b.e("android:support:activity-result", new f(0, lVar));
            h(new g(lVar, 0));
            this.f1189v = new b(new m(lVar, 2));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public final P c() {
        if (getApplication() != null) {
            if (this.f1177j == null) {
                j jVar = (j) getLastNonConfigurationInstance();
                if (jVar != null) {
                    this.f1177j = jVar.f1161a;
                }
                if (this.f1177j == null) {
                    this.f1177j = new P();
                }
            }
            P p2 = this.f1177j;
            c.b(p2);
            return p2;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public final void j() {
        View decorView = getWindow().getDecorView();
        c.d("window.decorView", decorView);
        decorView.setTag(2131296787, this);
        View decorView2 = getWindow().getDecorView();
        c.d("window.decorView", decorView2);
        decorView2.setTag(2131296790, this);
        View decorView3 = getWindow().getDecorView();
        c.d("window.decorView", decorView3);
        decorView3.setTag(2131296789, this);
        View decorView4 = getWindow().getDecorView();
        c.d("window.decorView", decorView4);
        decorView4.setTag(2131296788, this);
        View decorView5 = getWindow().getDecorView();
        c.d("window.decorView", decorView5);
        decorView5.setTag(2131296646, this);
    }

    public final void onBackPressed() {
        i().c();
    }

    public final void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        Iterator it2 = this.f1182o.iterator();
        while (it2.hasNext()) {
            ((a) it2.next()).a(Integer.valueOf(i2));
        }
    }

    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it2 = this.f1186s.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
    }

    public final void reportFullyDrawn() {
        try {
            if (T0.g.w()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            p pVar = (p) this.f1179l.a();
            synchronized (pVar.f1193a) {
                pVar.f1194b = true;
                Iterator it2 = pVar.f1195c.iterator();
                while (it2.hasNext()) {
                    ((Y0.a) it2.next()).a();
                }
                pVar.f1195c.clear();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void setContentView(View view) {
        j();
        View decorView = getWindow().getDecorView();
        c.d("window.decorView", decorView);
        k kVar = this.f1178k;
        kVar.getClass();
        if (!kVar.f1164c) {
            kVar.f1164c = true;
            decorView.getViewTreeObserver().addOnDrawListener(kVar);
        }
        super.setContentView(view);
    }

    /* JADX INFO: finally extract failed */
    public final void onMultiWindowModeChanged(boolean z2, Configuration configuration) {
        c.e("newConfig", configuration);
        this.f1187t = true;
        try {
            super.onMultiWindowModeChanged(z2, configuration);
            this.f1187t = false;
            Iterator it2 = this.f1184q.iterator();
            while (it2.hasNext()) {
                ((a) it2.next()).a(new i(z2));
            }
        } catch (Throwable th) {
            this.f1187t = false;
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void onPictureInPictureModeChanged(boolean z2, Configuration configuration) {
        c.e("newConfig", configuration);
        this.f1188u = true;
        try {
            super.onPictureInPictureModeChanged(z2, configuration);
            this.f1188u = false;
            Iterator it2 = this.f1185r.iterator();
            while (it2.hasNext()) {
                ((a) it2.next()).a(new v(z2));
            }
        } catch (Throwable th) {
            this.f1188u = false;
            throw th;
        }
    }
}
