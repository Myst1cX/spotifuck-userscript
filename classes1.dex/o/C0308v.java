package o;

import A.b;
import T0.g;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import g.C0096a;

/* renamed from: o.v  reason: case insensitive filesystem */
public final class C0308v {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f4306a;

    /* renamed from: b  reason: collision with root package name */
    public final b f4307b;

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((g) this.f4307b.f2g).p(inputFilterArr);
    }

    /* JADX INFO: finally extract failed */
    public final void b(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f4306a.getContext().obtainStyledAttributes(attributeSet, C0096a.i, i, 0);
        try {
            boolean z2 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z2 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            d(z2);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z2) {
        ((g) this.f4307b.f2g).L(z2);
    }

    public final void d(boolean z2) {
        ((g) this.f4307b.f2g).M(z2);
    }

    public C0308v(TextView textView) {
        this.f4306a = textView;
        this.f4307b = new b(textView);
    }
}
