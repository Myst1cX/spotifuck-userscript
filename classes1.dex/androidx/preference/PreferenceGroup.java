package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import g0.s;
import g0.z;
import java.util.ArrayList;
import r.k;

public abstract class PreferenceGroup extends Preference {

    /* renamed from: M  reason: collision with root package name */
    public final k f1922M;

    /* renamed from: N  reason: collision with root package name */
    public final ArrayList f1923N;

    /* renamed from: O  reason: collision with root package name */
    public boolean f1924O;

    /* renamed from: P  reason: collision with root package name */
    public int f1925P;

    /* renamed from: Q  reason: collision with root package name */
    public boolean f1926Q;

    /* renamed from: R  reason: collision with root package name */
    public int f1927R;

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1922M = new k();
        new Handler(Looper.getMainLooper());
        this.f1924O = true;
        this.f1925P = 0;
        this.f1926Q = false;
        this.f1927R = Integer.MAX_VALUE;
        this.f1923N = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.i, i, 0);
        this.f1924O = obtainStyledAttributes.getBoolean(2, obtainStyledAttributes.getBoolean(2, true));
        if (obtainStyledAttributes.hasValue(1)) {
            int i2 = obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i2 != Integer.MAX_VALUE && TextUtils.isEmpty(this.f1906k)) {
                Log.e("PreferenceGroup", getClass().getSimpleName().concat(" should have a key defined if it contains an expandable preference"));
            }
            this.f1927R = i2;
        }
        obtainStyledAttributes.recycle();
    }

    public final Parcelable p() {
        this.I = true;
        return new s(AbsSavedState.EMPTY_STATE, this.f1927R);
    }

    public final Preference w(String str) {
        Preference w2;
        if (str == null) {
            throw new IllegalArgumentException("Key cannot be null");
        } else if (TextUtils.equals(this.f1906k, str)) {
            return this;
        } else {
            int size = this.f1923N.size();
            for (int i = 0; i < size; i++) {
                Preference x2 = x(i);
                if (TextUtils.equals(x2.f1906k, str)) {
                    return x2;
                }
                if ((x2 instanceof PreferenceGroup) && (w2 = ((PreferenceGroup) x2).w(str)) != null) {
                    return w2;
                }
            }
            return null;
        }
    }

    public final Preference x(int i) {
        return (Preference) this.f1923N.get(i);
    }

    public final void a(Bundle bundle) {
        super.a(bundle);
        int size = this.f1923N.size();
        for (int i = 0; i < size; i++) {
            x(i).a(bundle);
        }
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        int size = this.f1923N.size();
        for (int i = 0; i < size; i++) {
            x(i).b(bundle);
        }
    }

    public final void h(boolean z2) {
        super.h(z2);
        int size = this.f1923N.size();
        for (int i = 0; i < size; i++) {
            Preference x2 = x(i);
            if (x2.f1916u == z2) {
                x2.f1916u = !z2;
                x2.h(x2.u());
                x2.g();
            }
        }
    }

    public final void i() {
        super.i();
        this.f1926Q = true;
        int size = this.f1923N.size();
        for (int i = 0; i < size; i++) {
            x(i).i();
        }
    }

    public final void m() {
        super.m();
        this.f1926Q = false;
        int size = this.f1923N.size();
        for (int i = 0; i < size; i++) {
            x(i).m();
        }
    }

    public final void o(Parcelable parcelable) {
        if (!parcelable.getClass().equals(s.class)) {
            super.o(parcelable);
            return;
        }
        s sVar = (s) parcelable;
        this.f1927R = sVar.f2591a;
        super.o(sVar.getSuperState());
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
