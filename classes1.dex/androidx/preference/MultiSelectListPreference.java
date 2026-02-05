package androidx.preference;

import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.view.AbsSavedState;
import g0.i;
import java.util.HashSet;
import java.util.Set;

public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: S  reason: collision with root package name */
    public final CharSequence[] f1884S;

    /* renamed from: T  reason: collision with root package name */
    public final CharSequence[] f1885T;

    /* renamed from: U  reason: collision with root package name */
    public final HashSet f1886U = new HashSet();

    public final Parcelable p() {
        this.I = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.f1912q) {
            return absSavedState;
        }
        i iVar = new i(absSavedState);
        iVar.f2564a = this.f1886U;
        return iVar;
    }

    public final void q(Object obj) {
        Set<String> set = (Set) obj;
        if (v()) {
            set = this.f1899b.c().getStringSet(this.f1906k, set);
        }
        w(set);
    }

    public final void w(Set set) {
        HashSet hashSet = this.f1886U;
        hashSet.clear();
        hashSet.addAll(set);
        if (v()) {
            Set<String> set2 = null;
            if (v()) {
                set2 = this.f1899b.c().getStringSet(this.f1906k, (Set) null);
            }
            if (!set.equals(set2)) {
                SharedPreferences.Editor a2 = this.f1899b.a();
                a2.putStringSet(this.f1906k, set);
                if (!this.f1899b.e) {
                    a2.apply();
                }
            }
        }
        g();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultiSelectListPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130968970(0x7f04018a, float:1.7546609E38)
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = E.b.b(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r3.f1886U = r1
            int[] r1 = g0.z.f2625f
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            r5 = 2
            java.lang.CharSequence[] r5 = r4.getTextArray(r5)
            if (r5 != 0) goto L_0x0026
            java.lang.CharSequence[] r5 = r4.getTextArray(r2)
        L_0x0026:
            r3.f1884S = r5
            r5 = 3
            java.lang.CharSequence[] r5 = r4.getTextArray(r5)
            if (r5 != 0) goto L_0x0034
            r5 = 1
            java.lang.CharSequence[] r5 = r4.getTextArray(r5)
        L_0x0034:
            r3.f1885T = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.MultiSelectListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final Object n(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public final void o(Parcelable parcelable) {
        if (!parcelable.getClass().equals(i.class)) {
            super.o(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.o(iVar.getSuperState());
        w(iVar.f2564a);
    }
}
