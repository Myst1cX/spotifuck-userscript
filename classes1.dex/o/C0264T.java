package o;

import E.b;
import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: o.T  reason: case insensitive filesystem */
public final class C0264T extends b {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f4137h;
    public final /* synthetic */ int i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ WeakReference f4138j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Z f4139k;

    public final void i(int i2) {
    }

    public final void j(Typeface typeface) {
        int i2;
        boolean z2;
        if (Build.VERSION.SDK_INT >= 28 && (i2 = this.f4137h) != -1) {
            if ((this.i & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            typeface = Y.a(typeface, i2, z2);
        }
        Z z3 = this.f4139k;
        if (z3.f4164m) {
            z3.f4163l = typeface;
            TextView textView = (TextView) this.f4138j.get();
            if (textView == null) {
                return;
            }
            if (textView.isAttachedToWindow()) {
                textView.post(new C0265U(textView, typeface, z3.f4161j));
            } else {
                textView.setTypeface(typeface, z3.f4161j);
            }
        }
    }

    public C0264T(Z z2, int i2, int i3, WeakReference weakReference) {
        this.f4139k = z2;
        this.f4137h = i2;
        this.i = i3;
        this.f4138j = weakReference;
    }
}
