package r0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import r.k;

/* renamed from: r0.b  reason: case insensitive filesystem */
public final class C0325b {

    /* renamed from: a  reason: collision with root package name */
    public final k f4559a = new k();

    /* renamed from: b  reason: collision with root package name */
    public final k f4560b = new k();

    public static C0325b a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return b(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [r0.c, java.lang.Object] */
    public static C0325b b(ArrayList arrayList) {
        C0325b bVar = new C0325b();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Animator animator = (Animator) arrayList.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                bVar.f4560b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = C0324a.f4556b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = C0324a.f4557c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = C0324a.f4558d;
                }
                ? obj = new Object();
                obj.f4564d = 0;
                obj.e = 1;
                obj.f4561a = startDelay;
                obj.f4562b = duration;
                obj.f4563c = interpolator;
                obj.f4564d = objectAnimator.getRepeatCount();
                obj.e = objectAnimator.getRepeatMode();
                bVar.f4559a.put(propertyName, obj);
                i++;
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0325b)) {
            return false;
        }
        return this.f4559a.equals(((C0325b) obj).f4559a);
    }

    public final int hashCode() {
        return this.f4559a.hashCode();
    }

    public final String toString() {
        return "\n" + C0325b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f4559a + "}\n";
    }
}
