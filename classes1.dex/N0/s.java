package N0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import o.C0273d0;

public final class s extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f680a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextView f681b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f682c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TextView f683d;
    public final /* synthetic */ u e;

    public s(u uVar, int i, TextView textView, int i2, TextView textView2) {
        this.e = uVar;
        this.f680a = i;
        this.f681b = textView;
        this.f682c = i2;
        this.f683d = textView2;
    }

    public final void onAnimationEnd(Animator animator) {
        C0273d0 d0Var;
        int i = this.f680a;
        u uVar = this.e;
        uVar.f698n = i;
        uVar.f696l = null;
        TextView textView = this.f681b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f682c == 1 && (d0Var = uVar.f702r) != null) {
                d0Var.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f683d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f683d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
