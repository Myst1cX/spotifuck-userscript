package androidx.activity;

import C.a;
import Z0.c;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0077l;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import k0.C0168c;
import k0.C0169d;
import k0.C0170e;

public class o extends Dialog implements r, B, C0170e {

    /* renamed from: f  reason: collision with root package name */
    public t f1190f;

    /* renamed from: g  reason: collision with root package name */
    public final C0169d f1191g = new C0169d(this);

    /* renamed from: h  reason: collision with root package name */
    public final A f1192h = new A(new a(9, (Object) this));

    public void setContentView(int i) {
        e();
        super.setContentView(i);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c.e("view", view);
        e();
        super.addContentView(view, layoutParams);
    }

    public final C0168c b() {
        return this.f1191g.f3568b;
    }

    public final t c() {
        t tVar = this.f1190f;
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(this);
        this.f1190f = tVar2;
        return tVar2;
    }

    public final void onBackPressed() {
        this.f1192h.c();
    }

    public o(Context context, int i) {
        super(context, i);
    }

    public static void a(o oVar) {
        super.onBackPressed();
    }

    public final t d() {
        return c();
    }

    public final void e() {
        Window window = getWindow();
        c.b(window);
        View decorView = window.getDecorView();
        c.d("window!!.decorView", decorView);
        decorView.setTag(2131296787, this);
        Window window2 = getWindow();
        c.b(window2);
        View decorView2 = window2.getDecorView();
        c.d("window!!.decorView", decorView2);
        decorView2.setTag(2131296788, this);
        Window window3 = getWindow();
        c.b(window3);
        View decorView3 = window3.getDecorView();
        c.d("window!!.decorView", decorView3);
        decorView3.setTag(2131296789, this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher d2 = getOnBackInvokedDispatcher();
            c.d("onBackInvokedDispatcher", d2);
            A a2 = this.f1192h;
            a2.e = d2;
            a2.d(a2.f1139g);
        }
        this.f1191g.b(bundle);
        c().d(C0077l.ON_CREATE);
    }

    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        c.d("super.onSaveInstanceState()", onSaveInstanceState);
        this.f1191g.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    public final void onStart() {
        super.onStart();
        c().d(C0077l.ON_RESUME);
    }

    public void onStop() {
        c().d(C0077l.ON_DESTROY);
        this.f1190f = null;
        super.onStop();
    }

    public void setContentView(View view) {
        c.e("view", view);
        e();
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c.e("view", view);
        e();
        super.setContentView(view, layoutParams);
    }
}
