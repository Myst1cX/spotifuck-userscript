package androidx.preference;

import E.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.fragment.app.C0047a;
import androidx.fragment.app.C0059m;
import androidx.fragment.app.H;
import g0.C0101d;
import g0.h;
import g0.k;
import g0.r;
import g0.z;

public abstract class DialogPreference extends Preference {

    /* renamed from: M  reason: collision with root package name */
    public final CharSequence f1869M;

    /* renamed from: N  reason: collision with root package name */
    public final String f1870N;

    /* renamed from: O  reason: collision with root package name */
    public final Drawable f1871O;

    /* renamed from: P  reason: collision with root package name */
    public final String f1872P;

    /* renamed from: Q  reason: collision with root package name */
    public final String f1873Q;

    /* renamed from: R  reason: collision with root package name */
    public final int f1874R;

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.f2623c, i, 0);
        String string = obtainStyledAttributes.getString(9);
        string = string == null ? obtainStyledAttributes.getString(0) : string;
        this.f1869M = string;
        if (string == null) {
            this.f1869M = this.f1903g;
        }
        String string2 = obtainStyledAttributes.getString(8);
        this.f1870N = string2 == null ? obtainStyledAttributes.getString(1) : string2;
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.f1871O = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        String string3 = obtainStyledAttributes.getString(11);
        this.f1872P = string3 == null ? obtainStyledAttributes.getString(3) : string3;
        String string4 = obtainStyledAttributes.getString(10);
        this.f1873Q = string4 == null ? obtainStyledAttributes.getString(4) : string4;
        this.f1874R = obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    public void l() {
        C0059m mVar;
        r rVar = this.f1899b.i;
        if (rVar != null) {
            for (androidx.fragment.app.r rVar2 = rVar; rVar2 != null; rVar2 = rVar2.f1771z) {
            }
            if (rVar.j().A("androidx.preference.PreferenceFragment.DIALOG") == null) {
                if (this instanceof EditTextPreference) {
                    mVar = new C0101d();
                    Bundle bundle = new Bundle(1);
                    bundle.putString("key", this.f1906k);
                    mVar.I(bundle);
                } else if (this instanceof ListPreference) {
                    mVar = new h();
                    Bundle bundle2 = new Bundle(1);
                    bundle2.putString("key", this.f1906k);
                    mVar.I(bundle2);
                } else if (this instanceof MultiSelectListPreference) {
                    mVar = new k();
                    Bundle bundle3 = new Bundle(1);
                    bundle3.putString("key", this.f1906k);
                    mVar.I(bundle3);
                } else {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                }
                mVar.J(rVar);
                H j2 = rVar.j();
                mVar.f1715k0 = false;
                mVar.f1716l0 = true;
                C0047a aVar = new C0047a(j2);
                aVar.f1666p = true;
                aVar.e(0, mVar, "androidx.preference.PreferenceFragment.DIALOG", 1);
                aVar.d(false);
            }
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.b(context, 2130968970, 16842897));
    }
}
