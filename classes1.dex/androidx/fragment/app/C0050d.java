package androidx.fragment.app;

import Q0.E;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* renamed from: androidx.fragment.app.d  reason: case insensitive filesystem */
public final class C0050d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1684a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1685b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f1686c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ S f1687d;
    public final /* synthetic */ C0052f e;

    public C0050d(ViewGroup viewGroup, View view, boolean z2, S s2, C0052f fVar) {
        this.f1684a = viewGroup;
        this.f1685b = view;
        this.f1686c = z2;
        this.f1687d = s2;
        this.e = fVar;
    }

    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f1684a;
        View view = this.f1685b;
        viewGroup.endViewTransition(view);
        S s2 = this.f1687d;
        if (this.f1686c) {
            E.a(view, s2.f1646a);
        }
        this.e.d();
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(s2);
        }
    }
}
