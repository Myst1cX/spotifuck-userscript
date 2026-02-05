package androidx.fragment.app;

import C.t;
import C.u;
import D.f;
import D.g;
import N.C0012l;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.activity.B;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import d.C0091d;
import h.C0121l;
import k0.C0168c;
import k0.C0170e;

/* renamed from: androidx.fragment.app.t  reason: case insensitive filesystem */
public final class C0065t extends v implements f, g, t, u, Q, B, C0091d, C0170e, K, C0012l {

    /* renamed from: f  reason: collision with root package name */
    public final C0121l f1774f;

    /* renamed from: g  reason: collision with root package name */
    public final C0121l f1775g;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f1776h;
    public final H i = new H();

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ C0121l f1777j;

    public final void a() {
    }

    public final C0168c b() {
        return this.f1777j.i.f3568b;
    }

    public final P c() {
        return this.f1777j.c();
    }

    public final androidx.lifecycle.t d() {
        return this.f1777j.f3020y;
    }

    public final View e(int i2) {
        return this.f1777j.findViewById(i2);
    }

    public final boolean f() {
        Window window = this.f1777j.getWindow();
        if (window == null || window.peekDecorView() == null) {
            return false;
        }
        return true;
    }

    public C0065t(C0121l lVar) {
        this.f1777j = lVar;
        Handler handler = new Handler();
        this.f1774f = lVar;
        this.f1775g = lVar;
        this.f1776h = handler;
    }
}
