package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.widget.SeekBar;
import android.widget.TextView;
import g0.B;
import g0.C;
import g0.C0097A;
import g0.y;
import g0.z;

public class SeekBarPreference extends Preference {

    /* renamed from: M  reason: collision with root package name */
    public int f1929M;

    /* renamed from: N  reason: collision with root package name */
    public int f1930N;

    /* renamed from: O  reason: collision with root package name */
    public int f1931O;

    /* renamed from: P  reason: collision with root package name */
    public int f1932P;

    /* renamed from: Q  reason: collision with root package name */
    public boolean f1933Q;

    /* renamed from: R  reason: collision with root package name */
    public SeekBar f1934R;

    /* renamed from: S  reason: collision with root package name */
    public TextView f1935S;

    /* renamed from: T  reason: collision with root package name */
    public final boolean f1936T;

    /* renamed from: U  reason: collision with root package name */
    public final boolean f1937U;

    /* renamed from: V  reason: collision with root package name */
    public final boolean f1938V;

    /* renamed from: W  reason: collision with root package name */
    public final C0097A f1939W = new C0097A(this);

    /* renamed from: X  reason: collision with root package name */
    public final B f1940X = new B(this);

    public final Object n(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    public final Parcelable p() {
        this.I = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f1912q) {
            return absSavedState;
        }
        C c2 = new C(absSavedState);
        c2.f2545a = this.f1929M;
        c2.f2546b = this.f1930N;
        c2.f2547c = this.f1931O;
        return c2;
    }

    public final void q(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int intValue = ((Integer) obj).intValue();
        if (v()) {
            intValue = this.f1899b.c().getInt(this.f1906k, intValue);
        }
        w(intValue, true);
    }

    public final void w(int i, boolean z2) {
        int i2 = this.f1930N;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.f1931O;
        if (i > i3) {
            i = i3;
        }
        if (i != this.f1929M) {
            this.f1929M = i;
            TextView textView = this.f1935S;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
            if (v()) {
                int i4 = ~i;
                if (v()) {
                    i4 = this.f1899b.c().getInt(this.f1906k, i4);
                }
                if (i != i4) {
                    SharedPreferences.Editor a2 = this.f1899b.a();
                    a2.putInt(this.f1906k, i);
                    if (!this.f1899b.e) {
                        a2.apply();
                    }
                }
            }
            if (z2) {
                g();
            }
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969580);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.f2629k, 2130969580, 0);
        this.f1930N = obtainStyledAttributes.getInt(3, 0);
        int i = obtainStyledAttributes.getInt(1, 100);
        int i2 = this.f1930N;
        i = i < i2 ? i2 : i;
        if (i != this.f1931O) {
            this.f1931O = i;
            g();
        }
        int i3 = obtainStyledAttributes.getInt(4, 0);
        if (i3 != this.f1932P) {
            this.f1932P = Math.min(this.f1931O - this.f1930N, Math.abs(i3));
            g();
        }
        this.f1936T = obtainStyledAttributes.getBoolean(2, true);
        this.f1937U = obtainStyledAttributes.getBoolean(5, false);
        this.f1938V = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    public final void k(y yVar) {
        super.k(yVar);
        yVar.f3338a.setOnKeyListener(this.f1940X);
        this.f1934R = (SeekBar) yVar.r(2131296675);
        TextView textView = (TextView) yVar.r(2131296676);
        this.f1935S = textView;
        if (this.f1937U) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f1935S = null;
        }
        SeekBar seekBar = this.f1934R;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f1939W);
        this.f1934R.setMax(this.f1931O - this.f1930N);
        int i = this.f1932P;
        if (i != 0) {
            this.f1934R.setKeyProgressIncrement(i);
        } else {
            this.f1932P = this.f1934R.getKeyProgressIncrement();
        }
        this.f1934R.setProgress(this.f1929M - this.f1930N);
        int i2 = this.f1929M;
        TextView textView2 = this.f1935S;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i2));
        }
        this.f1934R.setEnabled(f());
    }

    public final void o(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C.class)) {
            super.o(parcelable);
            return;
        }
        C c2 = (C) parcelable;
        super.o(c2.getSuperState());
        this.f1929M = c2.f2545a;
        this.f1930N = c2.f2546b;
        this.f1931O = c2.f2547c;
        g();
    }
}
