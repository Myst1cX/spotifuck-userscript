package N;

import G.a;
import N0.l;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.ArrayList;
import n0.C0232m;
import o0.f;
import y0.C0356a;
import y0.C0358c;

public final class Y extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f518a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f519b;

    public /* synthetic */ Y(int i, Object obj) {
        this.f518a = i;
        this.f519b = obj;
    }

    public Y(C0001a0 a0Var, View view) {
        this.f518a = 0;
        this.f519b = a0Var;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.f518a) {
            case 0:
                ((C0001a0) this.f519b).b();
                return;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f519b;
                actionBarOverlayLayout.f1281B = null;
                actionBarOverlayLayout.f1295o = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.f518a) {
            case 0:
                ((C0001a0) this.f519b).a();
                return;
            case 1:
                l lVar = (l) this.f519b;
                lVar.q();
                lVar.f646r.start();
                return;
            case 2:
                ((C0232m) this.f519b).m();
                animator.removeListener(this);
                return;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f519b;
                actionBarOverlayLayout.f1281B = null;
                actionBarOverlayLayout.f1295o = false;
                return;
            case 4:
                f fVar = (f) this.f519b;
                ArrayList arrayList = new ArrayList(fVar.f4360j);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((C0356a) arrayList.get(i)).f5147b.f5166t;
                    if (colorStateList != null) {
                        a.h(fVar, colorStateList);
                    }
                }
                return;
            default:
                ((HideBottomViewOnScrollBehavior) this.f519b).f2102h = null;
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.f518a) {
            case 0:
                ((C0001a0) this.f519b).c();
                return;
            case 4:
                f fVar = (f) this.f519b;
                ArrayList arrayList = new ArrayList(fVar.f4360j);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C0358c cVar = ((C0356a) arrayList.get(i)).f5147b;
                    ColorStateList colorStateList = cVar.f5166t;
                    if (colorStateList != null) {
                        a.g(fVar, colorStateList.getColorForState(cVar.f5170x, colorStateList.getDefaultColor()));
                    }
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
