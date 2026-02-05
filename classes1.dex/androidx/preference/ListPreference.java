package androidx.preference;

import E.b;
import K0.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import g0.f;
import g0.z;

public class ListPreference extends DialogPreference {

    /* renamed from: S  reason: collision with root package name */
    public final CharSequence[] f1879S;

    /* renamed from: T  reason: collision with root package name */
    public final CharSequence[] f1880T;

    /* renamed from: U  reason: collision with root package name */
    public String f1881U;

    /* renamed from: V  reason: collision with root package name */
    public final String f1882V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f1883W;

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.e, i, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.f1879S = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.f1880T = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (e.i == null) {
                e.i = new e(19);
            }
            this.f1896K = e.i;
            g();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, z.f2626g, i, 0);
        String string = obtainStyledAttributes2.getString(33);
        this.f1882V = string == null ? obtainStyledAttributes2.getString(7) : string;
        obtainStyledAttributes2.recycle();
    }

    public final Parcelable p() {
        this.I = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f1912q) {
            return absSavedState;
        }
        f fVar = new f(absSavedState);
        fVar.f2559a = this.f1881U;
        return fVar;
    }

    public final CharSequence e() {
        e eVar = this.f1896K;
        if (eVar != null) {
            return eVar.m(this);
        }
        Object x2 = x();
        CharSequence e = super.e();
        String str = this.f1882V;
        if (str == null) {
            return e;
        }
        if (x2 == null) {
            x2 = "";
        }
        String format = String.format(str, new Object[]{x2});
        if (TextUtils.equals(format, e)) {
            return e;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    public final void q(Object obj) {
        y(d((String) obj));
    }

    public final int w(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f1880T) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public final CharSequence x() {
        CharSequence[] charSequenceArr;
        int w2 = w(this.f1881U);
        if (w2 < 0 || (charSequenceArr = this.f1879S) == null) {
            return null;
        }
        return charSequenceArr[w2];
    }

    public final void y(String str) {
        boolean equals = TextUtils.equals(this.f1881U, str);
        if (!equals || !this.f1883W) {
            this.f1881U = str;
            this.f1883W = true;
            s(str);
            if (!equals) {
                g();
            }
        }
    }

    public final Object n(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public final void o(Parcelable parcelable) {
        if (!parcelable.getClass().equals(f.class)) {
            super.o(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.o(fVar.getSuperState());
        y(fVar.f2559a);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.b(context, 2130968970, 16842897));
    }
}
