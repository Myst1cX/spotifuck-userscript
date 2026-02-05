package j0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: j0.y  reason: case insensitive filesystem */
public final class C0162y extends C0159v {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f3518q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ Object f3519r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0162y(Object obj, Context context, int i) {
        super(context);
        this.f3518q = i;
        this.f3519r = obj;
    }

    public int b(View view, int i) {
        switch (this.f3518q) {
            case 1:
                ((CarouselLayoutManager) this.f3519r).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    public int c(View view, int i) {
        switch (this.f3518q) {
            case 1:
                ((CarouselLayoutManager) this.f3519r).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    public float d(DisplayMetrics displayMetrics) {
        switch (this.f3518q) {
            case 0:
                return 100.0f / ((float) displayMetrics.densityDpi);
            default:
                return super.d(displayMetrics);
        }
    }

    public int e(int i) {
        switch (this.f3518q) {
            case 0:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    public PointF f(int i) {
        switch (this.f3518q) {
            case 1:
                ((CarouselLayoutManager) this.f3519r).getClass();
                return null;
            default:
                return super.f(i);
        }
    }

    public void h(View view, V v2) {
        switch (this.f3518q) {
            case 0:
                C0163z zVar = (C0163z) this.f3519r;
                int[] a2 = zVar.a(zVar.f3520a.getLayoutManager(), view);
                int i = a2[0];
                int i2 = a2[1];
                int ceil = (int) Math.ceil(((double) e(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f3509j;
                    v2.f3309a = i;
                    v2.f3310b = i2;
                    v2.f3311c = ceil;
                    v2.e = decelerateInterpolator;
                    v2.f3313f = true;
                    return;
                }
                return;
            default:
                super.h(view, v2);
                return;
        }
    }
}
