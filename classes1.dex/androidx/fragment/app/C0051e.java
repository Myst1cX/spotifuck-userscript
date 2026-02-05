package androidx.fragment.app;

import N0.B;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;

/* renamed from: androidx.fragment.app.e  reason: case insensitive filesystem */
public final class C0051e implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ S f1688a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1689b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1690c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C0052f f1691d;

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        this.f1689b.post(new B(4, this));
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(this.f1688a);
        }
    }

    public final void onAnimationStart(Animation animation) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(this.f1688a);
        }
    }

    public C0051e(S s2, ViewGroup viewGroup, View view, C0052f fVar) {
        this.f1688a = s2;
        this.f1689b = viewGroup;
        this.f1690c = view;
        this.f1691d = fVar;
    }
}
