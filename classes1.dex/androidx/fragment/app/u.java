package androidx.fragment.app;

import N.C0020u;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

public final class u extends AnimationSet implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f1778a;

    /* renamed from: b  reason: collision with root package name */
    public final View f1779b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1780c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1781d;
    public boolean e = true;

    public u(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f1778a = viewGroup;
        this.f1779b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    public final boolean getTransformation(long j2, Transformation transformation) {
        this.e = true;
        if (this.f1780c) {
            return !this.f1781d;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f1780c = true;
            C0020u.a(this.f1778a, this);
        }
        return true;
    }

    public final void run() {
        boolean z2 = this.f1780c;
        ViewGroup viewGroup = this.f1778a;
        if (z2 || !this.e) {
            viewGroup.endViewTransition(this.f1779b);
            this.f1781d = true;
            return;
        }
        this.e = false;
        viewGroup.post(this);
    }

    public final boolean getTransformation(long j2, Transformation transformation, float f2) {
        this.e = true;
        if (this.f1780c) {
            return !this.f1781d;
        }
        if (!super.getTransformation(j2, transformation, f2)) {
            this.f1780c = true;
            C0020u.a(this.f1778a, this);
        }
        return true;
    }
}
