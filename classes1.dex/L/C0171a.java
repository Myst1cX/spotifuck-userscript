package l;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: l.a  reason: case insensitive filesystem */
public final class C0171a implements TransformationMethod {

    /* renamed from: a  reason: collision with root package name */
    public Locale f3586a;

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f3586a);
        }
        return null;
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z2, int i, Rect rect) {
    }
}
