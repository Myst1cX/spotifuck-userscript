package X;

import android.text.Editable;
import androidx.emoji2.text.t;

public final class a extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f979a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile a f980b;

    /* renamed from: c  reason: collision with root package name */
    public static Class f981c;

    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f981c;
        if (cls != null) {
            return new t(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
