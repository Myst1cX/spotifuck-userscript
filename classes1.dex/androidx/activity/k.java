package androidx.activity;

import C.a;
import Z0.c;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import h.C0121l;
import java.util.concurrent.Executor;

public final class k implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: a  reason: collision with root package name */
    public final long f1162a = (SystemClock.uptimeMillis() + ((long) 10000));

    /* renamed from: b  reason: collision with root package name */
    public Runnable f1163b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1164c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C0121l f1165d;

    public final void execute(Runnable runnable) {
        c.e("runnable", runnable);
        this.f1163b = runnable;
        View decorView = this.f1165d.getWindow().getDecorView();
        c.d("window.decorView", decorView);
        if (!this.f1164c) {
            decorView.postOnAnimation(new a(8, (Object) this));
        } else if (c.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f1163b;
        if (runnable != null) {
            runnable.run();
            this.f1163b = null;
            p pVar = (p) this.f1165d.f1179l.a();
            synchronized (pVar.f1193a) {
                z2 = pVar.f1194b;
            }
            if (z2) {
                this.f1164c = false;
                this.f1165d.getWindow().getDecorView().post(this);
            }
        } else if (SystemClock.uptimeMillis() > this.f1162a) {
            this.f1164c = false;
            this.f1165d.getWindow().getDecorView().post(this);
        }
    }

    public final void run() {
        this.f1165d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }

    public k(C0121l lVar) {
        this.f1165d = lVar;
    }
}
