package androidx.fragment.app;

import Q0.E;
import Y.a;
import Z.c;
import Z.d;
import Z.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import h.C0121l;

public final class x implements LayoutInflater.Factory2 {

    /* renamed from: f  reason: collision with root package name */
    public final H f1784f;

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z2;
        M m2;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        H h2 = this.f1784f;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, h2);
        }
        C0121l lVar = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1000a);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                z2 = r.class.isAssignableFrom(B.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                z2 = false;
            }
            if (z2) {
                if (view != null) {
                    i = view.getId();
                }
                if (i == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                r z3 = resourceId != -1 ? h2.z(resourceId) : null;
                if (z3 == null && string != null) {
                    z3 = h2.A(string);
                }
                if (z3 == null && i != -1) {
                    z3 = h2.z(i);
                }
                if (z3 == null) {
                    B C2 = h2.C();
                    context.getClassLoader();
                    z3 = C2.a(attributeValue);
                    z3.f1763r = true;
                    z3.f1729A = resourceId != 0 ? resourceId : i;
                    z3.f1730B = i;
                    z3.f1731C = string;
                    z3.f1764s = true;
                    z3.f1768w = h2;
                    C0065t tVar = h2.f1598t;
                    z3.f1769x = tVar;
                    C0121l lVar2 = tVar.f1775g;
                    z3.f1736H = true;
                    if (tVar != null) {
                        lVar = tVar.f1774f;
                    }
                    if (lVar != null) {
                        z3.f1736H = true;
                    }
                    m2 = h2.a(z3);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        z3.toString();
                        Integer.toHexString(resourceId);
                    }
                } else if (!z3.f1764s) {
                    z3.f1764s = true;
                    z3.f1768w = h2;
                    C0065t tVar2 = h2.f1598t;
                    z3.f1769x = tVar2;
                    C0121l lVar3 = tVar2.f1775g;
                    z3.f1736H = true;
                    if (tVar2 != null) {
                        lVar = tVar2.f1774f;
                    }
                    if (lVar != null) {
                        z3.f1736H = true;
                    }
                    m2 = h2.f(z3);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        z3.toString();
                        Integer.toHexString(resourceId);
                    }
                } else {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i) + " with another fragment for " + attributeValue);
                }
                ViewGroup viewGroup = (ViewGroup) view;
                c cVar = d.f1007a;
                d.b(new f(z3, "Attempting to use <fragment> tag to add fragment " + z3 + " to container " + viewGroup));
                d.a(z3).getClass();
                z3.I = viewGroup;
                m2.k();
                m2.j();
                View view2 = z3.f1737J;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (z3.f1737J.getTag() == null) {
                        z3.f1737J.setTag(string);
                    }
                    z3.f1737J.addOnAttachStateChangeListener(new w(this, m2));
                    return z3.f1737J;
                }
                throw new IllegalStateException(E.g("Fragment ", attributeValue, " did not create a view."));
            }
        }
        return null;
    }

    public x(H h2) {
        this.f1784f = h2;
    }
}
