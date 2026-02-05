package N;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import n0.C0232m;
import r.b;

public final class d0 extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f534a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f535b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f536c;

    public d0(j0 j0Var, View view) {
        this.f535b = j0Var;
        this.f536c = view;
    }

    public d0(C0232m mVar, b bVar) {
        this.f536c = mVar;
        this.f535b = bVar;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.f534a) {
            case 0:
                ((j0) this.f535b).f559a.d(1.0f);
                f0.e((View) this.f536c);
                return;
            default:
                ((b) this.f535b).remove(animator);
                ((C0232m) this.f536c).f4009n.remove(animator);
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.f534a) {
            case 1:
                ((C0232m) this.f536c).f4009n.add(animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
