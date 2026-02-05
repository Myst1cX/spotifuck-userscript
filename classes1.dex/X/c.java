package X;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.h;
import androidx.emoji2.text.j;
import java.lang.ref.WeakReference;

public final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f984a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference f985b;

    public final void b() {
        InputFilter[] filters;
        int i;
        TextView textView = (TextView) this.f984a.get();
        InputFilter inputFilter = (InputFilter) this.f985b.get();
        if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
            int i2 = 0;
            while (i2 < filters.length) {
                if (filters[i2] != inputFilter) {
                    i2++;
                } else if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    j a2 = j.a();
                    if (text == null) {
                        i = 0;
                    } else {
                        a2.getClass();
                        i = text.length();
                    }
                    CharSequence e = a2.e(text, 0, i);
                    if (text != e) {
                        int selectionStart = Selection.getSelectionStart(e);
                        int selectionEnd = Selection.getSelectionEnd(e);
                        textView.setText(e);
                        if (e instanceof Spannable) {
                            Spannable spannable = (Spannable) e;
                            if (selectionStart >= 0 && selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionStart, selectionEnd);
                                return;
                            } else if (selectionStart >= 0) {
                                Selection.setSelection(spannable, selectionStart);
                                return;
                            } else if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public c(TextView textView, d dVar) {
        this.f984a = new WeakReference(textView);
        this.f985b = new WeakReference(dVar);
    }
}
