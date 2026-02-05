package g0;

import E.j;
import N.Q;
import N0.B;
import T0.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import j0.C;
import j0.a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;

public final class u extends C {

    /* renamed from: c  reason: collision with root package name */
    public final PreferenceScreen f2595c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f2596d;
    public ArrayList e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f2597f;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f2598g;

    /* renamed from: h  reason: collision with root package name */
    public final B f2599h = new B(10, this);

    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.Object, androidx.preference.Preference, g0.e] */
    public final ArrayList g(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = preferenceGroup.f1923N.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Preference x2 = preferenceGroup.x(i2);
            if (x2.f1917v) {
                if (!j(preferenceGroup) || i < preferenceGroup.f1927R) {
                    arrayList.add(x2);
                } else {
                    arrayList2.add(x2);
                }
                if (!(x2 instanceof PreferenceGroup)) {
                    i++;
                } else {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) x2;
                    if (preferenceGroup2 instanceof PreferenceScreen) {
                        continue;
                    } else if (!j(preferenceGroup) || !j(preferenceGroup2)) {
                        Iterator it2 = g(preferenceGroup2).iterator();
                        while (it2.hasNext()) {
                            Preference preference = (Preference) it2.next();
                            if (!j(preferenceGroup) || i < preferenceGroup.f1927R) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    } else {
                        throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                    }
                }
            }
        }
        if (j(preferenceGroup) && i > preferenceGroup.f1927R) {
            long j2 = preferenceGroup.f1900c;
            CharSequence charSequence = null;
            ? preference2 = new Preference(preferenceGroup.f1898a, (AttributeSet) null);
            preference2.f1890D = 2131492909;
            Context context = preference2.f1898a;
            Drawable n2 = g.n(context, 2131230868);
            if (preference2.f1905j != n2) {
                preference2.f1905j = n2;
                preference2.i = 0;
                preference2.g();
            }
            preference2.i = 2131230868;
            String string = context.getString(2131755068);
            if (!TextUtils.equals(string, preference2.f1903g)) {
                preference2.f1903g = string;
                preference2.g();
            }
            if (999 != preference2.f1902f) {
                preference2.f1902f = 999;
                u uVar = preference2.f1892F;
                if (uVar != null) {
                    Handler handler = uVar.f2598g;
                    B b2 = uVar.f2599h;
                    handler.removeCallbacks(b2);
                    handler.post(b2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Preference preference3 = (Preference) it3.next();
                CharSequence charSequence2 = preference3.f1903g;
                boolean z2 = preference3 instanceof PreferenceGroup;
                if (z2 && !TextUtils.isEmpty(charSequence2)) {
                    arrayList3.add((PreferenceGroup) preference3);
                }
                if (arrayList3.contains(preference3.f1894H)) {
                    if (z2) {
                        arrayList3.add((PreferenceGroup) preference3);
                    }
                } else if (!TextUtils.isEmpty(charSequence2)) {
                    if (charSequence == null) {
                        charSequence = charSequence2;
                    } else {
                        charSequence = context.getString(2131755232, new Object[]{charSequence, charSequence2});
                    }
                }
            }
            if (preference2.f1896K == null) {
                if (!TextUtils.equals(preference2.f1904h, charSequence)) {
                    preference2.f1904h = charSequence;
                    preference2.g();
                }
                preference2.f2558M = j2 + 1000000;
                preference2.e = new j(this, preferenceGroup, 11, false);
                arrayList.add(preference2);
            } else {
                throw new IllegalStateException("Preference already has a SummaryProvider set.");
            }
        }
        return arrayList;
    }

    public final void h(ArrayList arrayList, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.f1923N);
        }
        int size = preferenceGroup.f1923N.size();
        for (int i = 0; i < size; i++) {
            Preference x2 = preferenceGroup.x(i);
            arrayList.add(x2);
            t tVar = new t(x2);
            if (!this.f2597f.contains(tVar)) {
                this.f2597f.add(tVar);
            }
            if (x2 instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) x2;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    h(arrayList, preferenceGroup2);
                }
            }
            x2.f1892F = this;
        }
    }

    public static boolean j(PreferenceGroup preferenceGroup) {
        if (preferenceGroup.f1927R != Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    public final int a() {
        return this.e.size();
    }

    public final long b(int i) {
        if (!this.f3265b) {
            return -1;
        }
        return i(i).c();
    }

    public final void d(a0 a0Var, int i) {
        ColorStateList colorStateList;
        y yVar = (y) a0Var;
        Preference i2 = i(i);
        View view = yVar.f3338a;
        Drawable background = view.getBackground();
        Drawable drawable = yVar.f2616t;
        if (background != drawable) {
            WeakHashMap weakHashMap = Q.f509a;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) yVar.r(16908310);
        if (!(textView == null || (colorStateList = yVar.f2617u) == null || textView.getTextColors().equals(colorStateList))) {
            textView.setTextColor(colorStateList);
        }
        i2.k(yVar);
    }

    public final a0 e(ViewGroup viewGroup, int i) {
        t tVar = (t) this.f2597f.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, z.f2621a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = g.n(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(tVar.f2592a, viewGroup, false);
        if (inflate.getBackground() == null) {
            WeakHashMap weakHashMap = Q.f509a;
            inflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i2 = tVar.f2593b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new y(inflate);
    }

    public final Preference i(int i) {
        if (i < 0 || i >= this.e.size()) {
            return null;
        }
        return (Preference) this.e.get(i);
    }

    public final void k() {
        Iterator it2 = this.f2596d.iterator();
        while (it2.hasNext()) {
            ((Preference) it2.next()).f1892F = null;
        }
        ArrayList arrayList = new ArrayList(this.f2596d.size());
        this.f2596d = arrayList;
        PreferenceScreen preferenceScreen = this.f2595c;
        h(arrayList, preferenceScreen);
        this.e = g(preferenceScreen);
        this.f3264a.b();
        Iterator it3 = this.f2596d.iterator();
        while (it3.hasNext()) {
            ((Preference) it3.next()).getClass();
        }
    }

    public u(PreferenceScreen preferenceScreen) {
        this.f2595c = preferenceScreen;
        this.f2598g = new Handler(Looper.getMainLooper());
        preferenceScreen.f1892F = this;
        this.f2596d = new ArrayList();
        this.e = new ArrayList();
        this.f2597f = new ArrayList();
        f(preferenceScreen.f1928S);
        k();
    }

    public final int c(int i) {
        t tVar = new t(i(i));
        ArrayList arrayList = this.f2597f;
        int indexOf = arrayList.indexOf(tVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = arrayList.size();
        arrayList.add(tVar);
        return size;
    }
}
