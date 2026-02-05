package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import g0.D;

public abstract class TwoStatePreference extends Preference {

    /* renamed from: M  reason: collision with root package name */
    public boolean f1947M;

    /* renamed from: N  reason: collision with root package name */
    public String f1948N;

    /* renamed from: O  reason: collision with root package name */
    public String f1949O;

    /* renamed from: P  reason: collision with root package name */
    public boolean f1950P;

    /* renamed from: Q  reason: collision with root package name */
    public boolean f1951Q;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final Object n(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    public final Parcelable p() {
        this.I = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f1912q) {
            return absSavedState;
        }
        D d2 = new D(absSavedState);
        d2.f2548a = this.f1947M;
        return d2;
    }

    public final void l() {
        w(!this.f1947M);
    }

    public final void q(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (v()) {
            booleanValue = this.f1899b.c().getBoolean(this.f1906k, booleanValue);
        }
        w(booleanValue);
    }

    public final boolean u() {
        boolean z2;
        if (this.f1951Q) {
            z2 = this.f1947M;
        } else if (!this.f1947M) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || super.u()) {
            return true;
        }
        return false;
    }

    public final void w(boolean z2) {
        boolean z3;
        if (this.f1947M != z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 || !this.f1950P) {
            this.f1947M = z2;
            this.f1950P = true;
            if (v()) {
                boolean z4 = !z2;
                if (v()) {
                    z4 = this.f1899b.c().getBoolean(this.f1906k, z4);
                }
                if (z2 != z4) {
                    SharedPreferences.Editor a2 = this.f1899b.a();
                    a2.putBoolean(this.f1906k, z2);
                    if (!this.f1899b.e) {
                        a2.apply();
                    }
                }
            }
            if (z3) {
                h(u());
                g();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4.f1947M
            r1 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.String r0 = r4.f1948N
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = r4.f1948N
            r5.setText(r0)
        L_0x0019:
            r0 = 0
            goto L_0x002e
        L_0x001b:
            boolean r0 = r4.f1947M
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = r4.f1949O
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = r4.f1949O
            r5.setText(r0)
            goto L_0x0019
        L_0x002d:
            r0 = 1
        L_0x002e:
            if (r0 == 0) goto L_0x003e
            java.lang.CharSequence r2 = r4.e()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x003e
            r5.setText(r2)
            r0 = 0
        L_0x003e:
            if (r0 != 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r1 = 8
        L_0x0043:
            int r0 = r5.getVisibility()
            if (r1 == r0) goto L_0x004c
            r5.setVisibility(r1)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.x(android.view.View):void");
    }

    public final void o(Parcelable parcelable) {
        if (!parcelable.getClass().equals(D.class)) {
            super.o(parcelable);
            return;
        }
        D d2 = (D) parcelable;
        super.o(d2.getSuperState());
        w(d2.f2548a);
    }
}
