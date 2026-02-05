package androidx.activity;

import Z0.c;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

public final class x implements OnBackAnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f1207a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u f1208b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ v f1209c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ v f1210d;

    public final void onBackCancelled() {
        this.f1210d.a();
    }

    public final void onBackInvoked() {
        this.f1209c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        c.e("backEvent", backEvent);
        this.f1208b.b(new C0046b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        c.e("backEvent", backEvent);
        this.f1207a.b(new C0046b(backEvent));
    }

    public x(u uVar, u uVar2, v vVar, v vVar2) {
        this.f1207a = uVar;
        this.f1208b = uVar2;
        this.f1209c = vVar;
        this.f1210d = vVar2;
    }
}
