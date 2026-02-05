package X;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.j;

public final class d implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f986a;

    /* renamed from: b  reason: collision with root package name */
    public c f987b;

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.f986a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b2 = j.a().b();
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 != 3) {
                    return charSequence;
                }
            } else if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                return charSequence;
            } else {
                if (!(i == 0 && i2 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return j.a().e(charSequence, 0, charSequence.length());
            }
        }
        j a2 = j.a();
        if (this.f987b == null) {
            this.f987b = new c(textView, this);
        }
        a2.f(this.f987b);
        return charSequence;
    }

    public d(TextView textView) {
        this.f986a = textView;
    }
}
