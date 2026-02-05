package X;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

public final class j implements TransformationMethod {

    /* renamed from: a  reason: collision with root package name */
    public final TransformationMethod f999a;

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z2, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f999a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z2, i, rect);
        }
    }

    public j(TransformationMethod transformationMethod) {
        this.f999a = transformationMethod;
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f999a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || androidx.emoji2.text.j.a().b() != 1) {
            return charSequence;
        }
        androidx.emoji2.text.j a2 = androidx.emoji2.text.j.a();
        a2.getClass();
        return a2.e(charSequence, 0, charSequence.length());
    }
}
