package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

public final class s implements TextWatcher, SpanWatcher {

    /* renamed from: f  reason: collision with root package name */
    public final Object f1542f;

    /* renamed from: g  reason: collision with root package name */
    public final AtomicInteger f1543g = new AtomicInteger(0);

    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f1542f).afterTextChanged(editable);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f1542f).beforeTextChanged(charSequence, i, i2, i3);
    }

    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (this.f1543g.get() <= 0 || !(obj instanceof v)) {
            ((SpanWatcher) this.f1542f).onSpanAdded(spannable, obj, i, i2);
        }
    }

    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (this.f1543g.get() <= 0 || !(obj instanceof v)) {
            if (Build.VERSION.SDK_INT < 28) {
                if (i > i2) {
                    i = 0;
                }
                if (i3 > i4) {
                    i6 = i;
                    i5 = 0;
                    ((SpanWatcher) this.f1542f).onSpanChanged(spannable, obj, i6, i2, i5, i4);
                }
            }
            i6 = i;
            i5 = i3;
            ((SpanWatcher) this.f1542f).onSpanChanged(spannable, obj, i6, i2, i5, i4);
        }
    }

    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (this.f1543g.get() <= 0 || !(obj instanceof v)) {
            ((SpanWatcher) this.f1542f).onSpanRemoved(spannable, obj, i, i2);
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f1542f).onTextChanged(charSequence, i, i2, i3);
    }

    public s(Object obj) {
        this.f1542f = obj;
    }
}
