package X;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.j;

public final class i implements TextWatcher {

    /* renamed from: f  reason: collision with root package name */
    public final EditText f996f;

    /* renamed from: g  reason: collision with root package name */
    public h f997g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f998h = true;

    public static void a(EditText editText, int i) {
        int i2;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            j a2 = j.a();
            if (editableText == null) {
                i2 = 0;
            } else {
                a2.getClass();
                i2 = editableText.length();
            }
            a2.e(editableText, 0, i2);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.f996f;
        if (!editText.isInEditMode() && this.f998h && j.f1514k != null && i2 <= i3 && (charSequence instanceof Spannable)) {
            int b2 = j.a().b();
            if (b2 != 0) {
                if (b2 == 1) {
                    j.a().e((Spannable) charSequence, i, i3 + i);
                    return;
                } else if (b2 != 3) {
                    return;
                }
            }
            j a2 = j.a();
            if (this.f997g == null) {
                this.f997g = new h(editText);
            }
            a2.f(this.f997g);
        }
    }

    public i(EditText editText) {
        this.f996f = editText;
    }
}
