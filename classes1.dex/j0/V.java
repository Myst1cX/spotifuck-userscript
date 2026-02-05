package j0;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

public final class V {

    /* renamed from: a  reason: collision with root package name */
    public int f3309a;

    /* renamed from: b  reason: collision with root package name */
    public int f3310b;

    /* renamed from: c  reason: collision with root package name */
    public int f3311c;

    /* renamed from: d  reason: collision with root package name */
    public int f3312d;
    public Interpolator e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3313f;

    /* renamed from: g  reason: collision with root package name */
    public int f3314g;

    public final void a(RecyclerView recyclerView) {
        int i = this.f3312d;
        if (i >= 0) {
            this.f3312d = -1;
            recyclerView.M(i);
            this.f3313f = false;
        } else if (this.f3313f) {
            Interpolator interpolator = this.e;
            if (interpolator == null || this.f3311c >= 1) {
                int i2 = this.f3311c;
                if (i2 >= 1) {
                    recyclerView.f2011g0.b(this.f3309a, this.f3310b, i2, interpolator);
                    int i3 = this.f3314g + 1;
                    this.f3314g = i3;
                    if (i3 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f3313f = false;
                    return;
                }
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        } else {
            this.f3314g = 0;
        }
    }
}
