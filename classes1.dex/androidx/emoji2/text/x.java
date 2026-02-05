package androidx.emoji2.text;

import K0.e;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

public final class x implements Spannable {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1554a = false;

    /* renamed from: b  reason: collision with root package name */
    public Spannable f1555b;

    public final void a() {
        e eVar;
        Spannable spannable = this.f1555b;
        if (!this.f1554a) {
            if (Build.VERSION.SDK_INT < 28) {
                eVar = new e(13);
            } else {
                eVar = new e(13);
            }
            if (eVar.j(spannable)) {
                this.f1555b = new SpannableString(spannable);
            }
        }
        this.f1554a = true;
    }

    public final char charAt(int i) {
        return this.f1555b.charAt(i);
    }

    public final IntStream chars() {
        return this.f1555b.chars();
    }

    public final IntStream codePoints() {
        return this.f1555b.codePoints();
    }

    public final int getSpanEnd(Object obj) {
        return this.f1555b.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        return this.f1555b.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        return this.f1555b.getSpanStart(obj);
    }

    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f1555b.getSpans(i, i2, cls);
    }

    public final int length() {
        return this.f1555b.length();
    }

    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f1555b.nextSpanTransition(i, i2, cls);
    }

    public final CharSequence subSequence(int i, int i2) {
        return this.f1555b.subSequence(i, i2);
    }

    public final String toString() {
        return this.f1555b.toString();
    }

    public x(Spannable spannable) {
        this.f1555b = spannable;
    }

    public final void removeSpan(Object obj) {
        a();
        this.f1555b.removeSpan(obj);
    }

    public final void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.f1555b.setSpan(obj, i, i2, i3);
    }
}
