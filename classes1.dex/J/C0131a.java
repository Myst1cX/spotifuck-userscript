package j;

import T0.g;
import android.graphics.drawable.Animatable;
import o0.f;

/* renamed from: j.a  reason: case insensitive filesystem */
public final class C0131a extends g {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f3200l;

    /* renamed from: m  reason: collision with root package name */
    public final Animatable f3201m;

    public /* synthetic */ C0131a(Animatable animatable, int i) {
        this.f3200l = i;
        this.f3201m = animatable;
    }

    public final void O() {
        switch (this.f3200l) {
            case 0:
                this.f3201m.start();
                return;
            default:
                ((f) this.f3201m).start();
                return;
        }
    }

    public final void P() {
        switch (this.f3200l) {
            case 0:
                this.f3201m.stop();
                return;
            default:
                ((f) this.f3201m).stop();
                return;
        }
    }
}
