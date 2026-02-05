package j;

import T0.g;
import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* renamed from: j.c  reason: case insensitive filesystem */
public final class C0133c extends g {

    /* renamed from: l  reason: collision with root package name */
    public final ObjectAnimator f3235l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f3236m;

    public final void K() {
        this.f3235l.reverse();
    }

    public final void O() {
        this.f3235l.start();
    }

    public final void P() {
        this.f3235l.cancel();
    }

    public final boolean e() {
        return this.f3236m;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [j.d, android.animation.TimeInterpolator, java.lang.Object] */
    public C0133c(AnimationDrawable animationDrawable, boolean z2, boolean z3) {
        int i;
        int i2;
        int i3;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        if (z2) {
            i = numberOfFrames - 1;
        } else {
            i = 0;
        }
        if (z2) {
            i2 = 0;
        } else {
            i2 = numberOfFrames - 1;
        }
        ? obj = new Object();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        obj.f3238b = numberOfFrames2;
        int[] iArr = obj.f3237a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            obj.f3237a = new int[numberOfFrames2];
        }
        int[] iArr2 = obj.f3237a;
        int i4 = 0;
        for (int i5 = 0; i5 < numberOfFrames2; i5++) {
            if (z2) {
                i3 = (numberOfFrames2 - i5) - 1;
            } else {
                i3 = i5;
            }
            int duration = animationDrawable.getDuration(i3);
            iArr2[i5] = duration;
            i4 += duration;
        }
        obj.f3239c = i4;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
        ofInt.setAutoCancel(true);
        ofInt.setDuration((long) obj.f3239c);
        ofInt.setInterpolator(obj);
        this.f3236m = z3;
        this.f3235l = ofInt;
    }
}
