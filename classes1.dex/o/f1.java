package o;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

public final class f1 implements C0291m0 {

    /* renamed from: a  reason: collision with root package name */
    public Toolbar f4188a;

    /* renamed from: b  reason: collision with root package name */
    public int f4189b;

    /* renamed from: c  reason: collision with root package name */
    public View f4190c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f4191d;
    public Drawable e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f4192f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4193g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f4194h;
    public CharSequence i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f4195j;

    /* renamed from: k  reason: collision with root package name */
    public Window.Callback f4196k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4197l;

    /* renamed from: m  reason: collision with root package name */
    public C0286k f4198m;

    /* renamed from: n  reason: collision with root package name */
    public int f4199n;

    /* renamed from: o  reason: collision with root package name */
    public Drawable f4200o;

    public final void a(int i2) {
        View view;
        int i3 = this.f4189b ^ i2;
        this.f4189b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    b();
                }
                int i4 = this.f4189b & 4;
                Toolbar toolbar = this.f4188a;
                if (i4 != 0) {
                    Drawable drawable = this.f4192f;
                    if (drawable == null) {
                        drawable = this.f4200o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i3 & 3) != 0) {
                c();
            }
            int i5 = i3 & 8;
            Toolbar toolbar2 = this.f4188a;
            if (i5 != 0) {
                if ((i2 & 8) != 0) {
                    toolbar2.setTitle(this.f4194h);
                    toolbar2.setSubtitle(this.i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) != 0 && (view = this.f4190c) != null) {
                if ((i2 & 16) != 0) {
                    toolbar2.addView(view);
                } else {
                    toolbar2.removeView(view);
                }
            }
        }
    }

    public final void b() {
        if ((this.f4189b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f4195j);
            Toolbar toolbar = this.f4188a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f4199n);
            } else {
                toolbar.setNavigationContentDescription(this.f4195j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i2 = this.f4189b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) != 0) {
            drawable = this.e;
            if (drawable == null) {
                drawable = this.f4191d;
            }
        } else {
            drawable = this.f4191d;
        }
        this.f4188a.setLogo(drawable);
    }
}
