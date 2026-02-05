package androidx.preference;

import E.b;
import K0.e;
import R0.i;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.B;
import androidx.fragment.app.C0047a;
import androidx.fragment.app.H;
import g0.m;
import g0.n;
import g0.r;
import g0.u;
import g0.w;
import g0.z;
import java.util.ArrayList;

public class Preference implements Comparable<Preference> {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f1887A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f1888B;

    /* renamed from: C  reason: collision with root package name */
    public final boolean f1889C;

    /* renamed from: D  reason: collision with root package name */
    public int f1890D;

    /* renamed from: E  reason: collision with root package name */
    public final int f1891E;

    /* renamed from: F  reason: collision with root package name */
    public u f1892F;

    /* renamed from: G  reason: collision with root package name */
    public ArrayList f1893G;

    /* renamed from: H  reason: collision with root package name */
    public PreferenceGroup f1894H;
    public boolean I;

    /* renamed from: J  reason: collision with root package name */
    public n f1895J;

    /* renamed from: K  reason: collision with root package name */
    public e f1896K;

    /* renamed from: L  reason: collision with root package name */
    public final i f1897L;

    /* renamed from: a  reason: collision with root package name */
    public final Context f1898a;

    /* renamed from: b  reason: collision with root package name */
    public w f1899b;

    /* renamed from: c  reason: collision with root package name */
    public long f1900c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1901d;
    public m e;

    /* renamed from: f  reason: collision with root package name */
    public int f1902f;

    /* renamed from: g  reason: collision with root package name */
    public CharSequence f1903g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f1904h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f1905j;

    /* renamed from: k  reason: collision with root package name */
    public final String f1906k;

    /* renamed from: l  reason: collision with root package name */
    public Intent f1907l;

    /* renamed from: m  reason: collision with root package name */
    public final String f1908m;

    /* renamed from: n  reason: collision with root package name */
    public Bundle f1909n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f1910o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f1911p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f1912q;

    /* renamed from: r  reason: collision with root package name */
    public final String f1913r;

    /* renamed from: s  reason: collision with root package name */
    public final Object f1914s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1915t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1916u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f1917v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f1918w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f1919x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f1920y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f1921z;

    public Preference(Context context, AttributeSet attributeSet, int i2) {
        this.f1902f = Integer.MAX_VALUE;
        this.f1910o = true;
        this.f1911p = true;
        this.f1912q = true;
        this.f1915t = true;
        this.f1916u = true;
        this.f1917v = true;
        this.f1918w = true;
        this.f1919x = true;
        this.f1921z = true;
        this.f1889C = true;
        this.f1890D = 2131492980;
        this.f1897L = new i(2, this);
        this.f1898a = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.f2626g, i2, 0);
        this.i = obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        String string = obtainStyledAttributes.getString(26);
        this.f1906k = string == null ? obtainStyledAttributes.getString(6) : string;
        CharSequence text = obtainStyledAttributes.getText(34);
        this.f1903g = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.f1904h = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.f1902f = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = obtainStyledAttributes.getString(22);
        this.f1908m = string2 == null ? obtainStyledAttributes.getString(13) : string2;
        this.f1890D = obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, 2131492980));
        this.f1891E = obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        this.f1910o = obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        boolean z2 = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        this.f1911p = z2;
        this.f1912q = obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        String string3 = obtainStyledAttributes.getString(19);
        this.f1913r = string3 == null ? obtainStyledAttributes.getString(10) : string3;
        this.f1918w = obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, z2));
        this.f1919x = obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, z2));
        if (obtainStyledAttributes.hasValue(18)) {
            this.f1914s = n(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f1914s = n(obtainStyledAttributes, 11);
        }
        this.f1889C = obtainStyledAttributes.getBoolean(31, obtainStyledAttributes.getBoolean(12, true));
        boolean hasValue = obtainStyledAttributes.hasValue(32);
        this.f1920y = hasValue;
        if (hasValue) {
            this.f1921z = obtainStyledAttributes.getBoolean(32, obtainStyledAttributes.getBoolean(14, true));
        }
        this.f1887A = obtainStyledAttributes.getBoolean(24, obtainStyledAttributes.getBoolean(15, false));
        this.f1917v = obtainStyledAttributes.getBoolean(25, obtainStyledAttributes.getBoolean(25, true));
        this.f1888B = obtainStyledAttributes.getBoolean(20, obtainStyledAttributes.getBoolean(20, false));
        obtainStyledAttributes.recycle();
    }

    public void l() {
    }

    public Object n(TypedArray typedArray, int i2) {
        return null;
    }

    public void o(Parcelable parcelable) {
        this.I = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public Parcelable p() {
        this.I = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public void q(Object obj) {
    }

    public void a(Bundle bundle) {
        Parcelable parcelable;
        if (!TextUtils.isEmpty(this.f1906k) && (parcelable = bundle.getParcelable(this.f1906k)) != null) {
            this.I = false;
            o(parcelable);
            if (!this.I) {
                throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    public void b(Bundle bundle) {
        if (!TextUtils.isEmpty(this.f1906k)) {
            this.I = false;
            Parcelable p2 = p();
            if (!this.I) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            } else if (p2 != null) {
                bundle.putParcelable(this.f1906k, p2);
            }
        }
    }

    public long c() {
        return this.f1900c;
    }

    public final int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i2 = this.f1902f;
        int i3 = preference.f1902f;
        if (i2 != i3) {
            return i2 - i3;
        }
        CharSequence charSequence = this.f1903g;
        CharSequence charSequence2 = preference.f1903g;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f1903g.toString());
    }

    public CharSequence e() {
        e eVar = this.f1896K;
        if (eVar != null) {
            return eVar.m(this);
        }
        return this.f1904h;
    }

    public boolean f() {
        if (!this.f1910o || !this.f1915t || !this.f1916u) {
            return false;
        }
        return true;
    }

    public void g() {
        int indexOf;
        u uVar = this.f1892F;
        if (uVar != null && (indexOf = uVar.e.indexOf(this)) != -1) {
            uVar.f3264a.c(indexOf, 1, this);
        }
    }

    public void h(boolean z2) {
        ArrayList arrayList = this.f1893G;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Preference preference = (Preference) arrayList.get(i2);
                if (preference.f1915t == z2) {
                    preference.f1915t = !z2;
                    preference.h(preference.u());
                    preference.g();
                }
            }
        }
    }

    public void i() {
        PreferenceScreen preferenceScreen;
        String str = this.f1913r;
        if (!TextUtils.isEmpty(str)) {
            w wVar = this.f1899b;
            Preference preference = null;
            if (!(wVar == null || (preferenceScreen = wVar.f2610g) == null)) {
                preference = preferenceScreen.w(str);
            }
            if (preference != null) {
                if (preference.f1893G == null) {
                    preference.f1893G = new ArrayList();
                }
                preference.f1893G.add(this);
                boolean u2 = preference.u();
                if (this.f1915t == u2) {
                    this.f1915t = !u2;
                    h(u());
                    g();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Dependency \"" + str + "\" not found for preference \"" + this.f1906k + "\" (title: \"" + this.f1903g + "\"");
        }
    }

    public final void j(w wVar) {
        SharedPreferences sharedPreferences;
        this.f1899b = wVar;
        if (!this.f1901d) {
            this.f1900c = wVar.b();
        }
        if (v()) {
            w wVar2 = this.f1899b;
            if (wVar2 != null) {
                sharedPreferences = wVar2.c();
            } else {
                sharedPreferences = null;
            }
            if (sharedPreferences.contains(this.f1906k)) {
                q((Object) null);
                return;
            }
        }
        Object obj = this.f1914s;
        if (obj != null) {
            q(obj);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(g0.y r11) {
        /*
            r10 = this;
            R0.i r0 = r10.f1897L
            android.view.View r1 = r11.f3338a
            r1.setOnClickListener(r0)
            r0 = 0
            r1.setId(r0)
            r2 = 16908304(0x1020010, float:2.3877274E-38)
            android.view.View r2 = r11.r(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 8
            r4 = 0
            if (r2 == 0) goto L_0x0035
            java.lang.CharSequence r5 = r10.e()
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0032
            r2.setText(r5)
            r2.setVisibility(r0)
            int r2 = r2.getCurrentTextColor()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0036
        L_0x0032:
            r2.setVisibility(r3)
        L_0x0035:
            r2 = r4
        L_0x0036:
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r11.r(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r6 = r10.f1911p
            if (r5 == 0) goto L_0x006f
            java.lang.CharSequence r7 = r10.f1903g
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L_0x006c
            r5.setText(r7)
            r5.setVisibility(r0)
            boolean r7 = r10.f1920y
            if (r7 == 0) goto L_0x005a
            boolean r7 = r10.f1921z
            r5.setSingleLine(r7)
        L_0x005a:
            if (r6 != 0) goto L_0x006f
            boolean r7 = r10.f()
            if (r7 == 0) goto L_0x006f
            if (r2 == 0) goto L_0x006f
            int r2 = r2.intValue()
            r5.setTextColor(r2)
            goto L_0x006f
        L_0x006c:
            r5.setVisibility(r3)
        L_0x006f:
            r2 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r2 = r11.r(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            boolean r5 = r10.f1887A
            r7 = 4
            if (r2 == 0) goto L_0x00a9
            int r8 = r10.i
            if (r8 != 0) goto L_0x0085
            android.graphics.drawable.Drawable r9 = r10.f1905j
            if (r9 == 0) goto L_0x0098
        L_0x0085:
            android.graphics.drawable.Drawable r9 = r10.f1905j
            if (r9 != 0) goto L_0x0091
            android.content.Context r9 = r10.f1898a
            android.graphics.drawable.Drawable r8 = T0.g.n(r9, r8)
            r10.f1905j = r8
        L_0x0091:
            android.graphics.drawable.Drawable r8 = r10.f1905j
            if (r8 == 0) goto L_0x0098
            r2.setImageDrawable(r8)
        L_0x0098:
            android.graphics.drawable.Drawable r8 = r10.f1905j
            if (r8 == 0) goto L_0x00a0
            r2.setVisibility(r0)
            goto L_0x00a9
        L_0x00a0:
            if (r5 == 0) goto L_0x00a4
            r8 = 4
            goto L_0x00a6
        L_0x00a4:
            r8 = 8
        L_0x00a6:
            r2.setVisibility(r8)
        L_0x00a9:
            r2 = 2131296491(0x7f0900eb, float:1.82109E38)
            android.view.View r2 = r11.r(r2)
            if (r2 != 0) goto L_0x00b9
            r2 = 16908350(0x102003e, float:2.3877403E-38)
            android.view.View r2 = r11.r(r2)
        L_0x00b9:
            if (r2 == 0) goto L_0x00c9
            android.graphics.drawable.Drawable r8 = r10.f1905j
            if (r8 == 0) goto L_0x00c3
            r2.setVisibility(r0)
            goto L_0x00c9
        L_0x00c3:
            if (r5 == 0) goto L_0x00c6
            r3 = 4
        L_0x00c6:
            r2.setVisibility(r3)
        L_0x00c9:
            boolean r0 = r10.f1889C
            if (r0 == 0) goto L_0x00d5
            boolean r0 = r10.f()
            t(r1, r0)
            goto L_0x00d9
        L_0x00d5:
            r0 = 1
            t(r1, r0)
        L_0x00d9:
            r1.setFocusable(r6)
            r1.setClickable(r6)
            boolean r0 = r10.f1918w
            r11.f2619w = r0
            boolean r0 = r10.f1919x
            r11.f2620x = r0
            boolean r11 = r10.f1888B
            if (r11 == 0) goto L_0x00f6
            g0.n r0 = r10.f1895J
            if (r0 != 0) goto L_0x00f6
            g0.n r0 = new g0.n
            r0.<init>(r10)
            r10.f1895J = r0
        L_0x00f6:
            if (r11 == 0) goto L_0x00fb
            g0.n r0 = r10.f1895J
            goto L_0x00fc
        L_0x00fb:
            r0 = r4
        L_0x00fc:
            r1.setOnCreateContextMenuListener(r0)
            r1.setLongClickable(r11)
            if (r11 == 0) goto L_0x010b
            if (r6 != 0) goto L_0x010b
            java.util.WeakHashMap r11 = N.Q.f509a
            r1.setBackground(r4)
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.k(g0.y):void");
    }

    public void m() {
        ArrayList arrayList;
        PreferenceScreen preferenceScreen;
        String str = this.f1913r;
        if (str != null) {
            w wVar = this.f1899b;
            Preference preference = null;
            if (!(wVar == null || (preferenceScreen = wVar.f2610g) == null)) {
                preference = preferenceScreen.w(str);
            }
            if (preference != null && (arrayList = preference.f1893G) != null) {
                arrayList.remove(this);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f1903g;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence e2 = e();
        if (!TextUtils.isEmpty(e2)) {
            sb.append(e2);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public final boolean v() {
        if (this.f1899b == null || !this.f1912q || TextUtils.isEmpty(this.f1906k)) {
            return false;
        }
        return true;
    }

    public static void t(View view, boolean z2) {
        view.setEnabled(z2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                t(viewGroup.getChildAt(childCount), z2);
            }
        }
    }

    public final String d(String str) {
        if (!v()) {
            return str;
        }
        return this.f1899b.c().getString(this.f1906k, str);
    }

    public void r(View view) {
        r rVar;
        String str;
        if (f() && this.f1911p) {
            l();
            m mVar = this.e;
            if (mVar != null) {
                mVar.a(this);
                return;
            }
            w wVar = this.f1899b;
            if (wVar == null || (rVar = wVar.f2611h) == null || (str = this.f1908m) == null) {
                Intent intent = this.f1907l;
                if (intent != null) {
                    this.f1898a.startActivity(intent);
                    return;
                }
                return;
            }
            for (androidx.fragment.app.r rVar2 = rVar; rVar2 != null; rVar2 = rVar2.f1771z) {
            }
            Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
            H j2 = rVar.j();
            if (this.f1909n == null) {
                this.f1909n = new Bundle();
            }
            Bundle bundle = this.f1909n;
            B C2 = j2.C();
            rVar.E().getClassLoader();
            androidx.fragment.app.r a2 = C2.a(str);
            a2.I(bundle);
            a2.J(rVar);
            C0047a aVar = new C0047a(j2);
            int id = ((View) rVar.G().getParent()).getId();
            if (id != 0) {
                aVar.e(id, a2, (String) null, 2);
                if (aVar.f1659h) {
                    aVar.f1658g = true;
                    aVar.i = null;
                    aVar.d(false);
                    return;
                }
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
    }

    public final void s(String str) {
        if (v() && !TextUtils.equals(str, d((String) null))) {
            SharedPreferences.Editor a2 = this.f1899b.a();
            a2.putString(this.f1906k, str);
            if (!this.f1899b.e) {
                a2.apply();
            }
        }
    }

    public boolean u() {
        return !f();
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.b(context, 2130969532, 16842894));
    }
}
