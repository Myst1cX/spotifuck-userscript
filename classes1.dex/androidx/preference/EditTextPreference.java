package androidx.preference;

import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.AbsSavedState;
import g0.C0100c;

public class EditTextPreference extends DialogPreference {

    /* renamed from: S  reason: collision with root package name */
    public String f1878S;

    public final Parcelable p() {
        this.I = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f1912q) {
            return absSavedState;
        }
        C0100c cVar = new C0100c(absSavedState);
        cVar.f2553a = this.f1878S;
        return cVar;
    }

    public final void q(Object obj) {
        w(d((String) obj));
    }

    public final boolean u() {
        if (TextUtils.isEmpty(this.f1878S) || super.u()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130969008(0x7f0401b0, float:1.7546686E38)
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = E.b.b(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            int[] r1 = g0.z.f2624d
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r5 = r4.getBoolean(r2, r2)
            boolean r5 = r4.getBoolean(r2, r5)
            if (r5 == 0) goto L_0x0032
            K0.e r5 = K0.e.f349h
            if (r5 != 0) goto L_0x002b
            K0.e r5 = new K0.e
            r0 = 18
            r5.<init>(r0)
            K0.e.f349h = r5
        L_0x002b:
            K0.e r5 = K0.e.f349h
            r3.f1896K = r5
            r3.g()
        L_0x0032:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final Object n(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public final void o(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C0100c.class)) {
            super.o(parcelable);
            return;
        }
        C0100c cVar = (C0100c) parcelable;
        super.o(cVar.getSuperState());
        w(cVar.f2553a);
    }

    public final void w(String str) {
        boolean u2 = u();
        this.f1878S = str;
        s(str);
        boolean u3 = u();
        if (u3 != u2) {
            h(u3);
        }
        g();
    }
}
