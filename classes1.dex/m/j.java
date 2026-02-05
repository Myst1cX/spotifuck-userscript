package m;

import N.Z;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p0.C0320a;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f3665a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public long f3666b = -1;

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f3667c;

    /* renamed from: d  reason: collision with root package name */
    public C0320a f3668d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final i f3669f = new i(this);

    public final void a() {
        if (this.e) {
            Iterator it2 = this.f3665a.iterator();
            while (it2.hasNext()) {
                ((Z) it2.next()).b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (!this.e) {
            Iterator it2 = this.f3665a.iterator();
            while (it2.hasNext()) {
                Z z2 = (Z) it2.next();
                long j2 = this.f3666b;
                if (j2 >= 0) {
                    z2.c(j2);
                }
                Interpolator interpolator = this.f3667c;
                if (!(interpolator == null || (view = (View) z2.f520a.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.f3668d != null) {
                    z2.d(this.f3669f);
                }
                View view2 = (View) z2.f520a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.e = true;
        }
    }
}
