package E0;

import H0.d;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import z0.C0364e;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f213a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    public final i f214b = new i(0, this);

    /* renamed from: c  reason: collision with root package name */
    public float f215c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f216d = true;
    public final WeakReference e = new WeakReference((Object) null);

    /* renamed from: f  reason: collision with root package name */
    public d f217f;

    public final float a(String str) {
        float f2;
        if (!this.f216d) {
            return this.f215c;
        }
        TextPaint textPaint = this.f213a;
        if (str == null) {
            f2 = 0.0f;
        } else {
            f2 = textPaint.measureText(str, 0, str.length());
        }
        this.f215c = f2;
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f216d = false;
        return this.f215c;
    }

    public k(C0364e eVar) {
        this.e = new WeakReference(eVar);
    }
}
