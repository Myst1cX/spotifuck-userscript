package h;

import A.b;
import C.e;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.f;
import androidx.activity.g;
import androidx.activity.n;
import androidx.fragment.app.C0064s;
import androidx.fragment.app.C0065t;
import androidx.fragment.app.H;
import androidx.fragment.app.O;
import androidx.fragment.app.r;
import androidx.lifecycle.C0077l;
import androidx.lifecycle.C0078m;
import androidx.lifecycle.t;
import java.util.ArrayList;
import java.util.Objects;
import m.C0176c;
import m.h;
import m.j;
import o.C0302s;
import o.f1;
import o.k1;

/* renamed from: h.l  reason: case insensitive filesystem */
public abstract class C0121l extends n implements C0122m {

    /* renamed from: A  reason: collision with root package name */
    public boolean f3016A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f3017B = true;

    /* renamed from: C  reason: collision with root package name */
    public D f3018C;

    /* renamed from: x  reason: collision with root package name */
    public final b f3019x = new b(18, (Object) new C0065t(this));

    /* renamed from: y  reason: collision with root package name */
    public final t f3020y = new t(this);

    /* renamed from: z  reason: collision with root package name */
    public boolean f3021z;

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0065t) this.f3019x.f2g).i.f1585f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    public final void setContentView(int i) {
        j();
        k().h(i);
    }

    public static boolean m(H h2) {
        C0121l lVar;
        boolean z2 = false;
        for (r rVar : h2.f1583c.i()) {
            if (rVar != null) {
                C0065t tVar = rVar.f1769x;
                if (tVar == null) {
                    lVar = null;
                } else {
                    lVar = tVar.f1777j;
                }
                if (lVar != null) {
                    z2 |= m(rVar.g());
                }
                O o2 = rVar.f1747T;
                C0078m mVar = C0078m.f1834d;
                if (o2 != null && o2.d().f1841c.compareTo(mVar) >= 0) {
                    rVar.f1747T.f1641h.g();
                    z2 = true;
                }
                if (rVar.f1746S.f1841c.compareTo(mVar) >= 0) {
                    rVar.f1746S.g();
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final Resources getResources() {
        int i = k1.f4261a;
        return super.getResources();
    }

    public final s k() {
        if (this.f3018C == null) {
            q qVar = s.f3028f;
            this.f3018C = new D(this, (Window) null, this, this);
        }
        return this.f3018C;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f3019x.x();
        super.onActivityResult(i, i2, intent);
    }

    public final void onContentChanged() {
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f3019x.x();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResume() {
        b bVar = this.f3019x;
        bVar.x();
        super.onResume();
        this.f3016A = true;
        ((C0065t) bVar.f2g).i.x(true);
    }

    public final void onStateNotSaved() {
        this.f3019x.x();
    }

    public final void q() {
        b bVar = this.f3019x;
        bVar.x();
        super.onStart();
        this.f3017B = false;
        boolean z2 = this.f3021z;
        C0065t tVar = (C0065t) bVar.f2g;
        if (!z2) {
            this.f3021z = true;
            H h2 = tVar.i;
            h2.f1573E = false;
            h2.f1574F = false;
            h2.f1579L.f1616h = false;
            h2.t(4);
        }
        tVar.i.x(true);
        this.f3020y.d(C0077l.ON_START);
        H h3 = tVar.i;
        h3.f1573E = false;
        h3.f1574F = false;
        h3.f1579L.f1616h = false;
        h3.t(5);
    }

    public C0121l() {
        this.i.f3568b.e("android:support:lifecycle", new f(1, this));
        g(new C0064s(this, 0));
        this.f1183p.add(new C0064s(this, 1));
        h(new g(this, 1));
        this.i.f3568b.e("androidx:appcompat", new C0119j(this));
        h(new C0120k(this));
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        D d2 = (D) k();
        d2.u();
        ((ViewGroup) d2.f2857G.findViewById(16908290)).addView(view, layoutParams);
        d2.f2891r.a(d2.f2890q.getCallback());
    }

    public final void attachBaseContext(Context context) {
        D d2 = (D) k();
        d2.f2870U = true;
        int i = d2.f2874Y;
        if (i == -100) {
            i = s.f3029g;
        }
        int B2 = d2.B(context, i);
        if (s.a(context) && s.a(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (s.f3035n) {
                    try {
                        J.f fVar = s.f3030h;
                        if (fVar == null) {
                            if (s.i == null) {
                                s.i = J.f.b(e.e(context));
                            }
                            if (!s.i.f294a.isEmpty()) {
                                s.f3030h = s.i;
                            }
                        } else if (!fVar.equals(s.i)) {
                            J.f fVar2 = s.f3030h;
                            s.i = fVar2;
                            e.d(context, fVar2.f294a.b());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!s.f3032k) {
                s.f3028f.execute(new C0123n(context, 0));
            }
        }
        J.f n2 = D.n(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(D.r(context, B2, n2, (Configuration) null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C0176c) {
            try {
                ((C0176c) context).a(D.r(context, B2, n2, (Configuration) null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (D.f2850p0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f2 = configuration3.fontScale;
                    float f3 = configuration4.fontScale;
                    if (f2 != f3) {
                        configuration.fontScale = f3;
                    }
                    int i2 = configuration3.mcc;
                    int i3 = configuration4.mcc;
                    if (i2 != i3) {
                        configuration.mcc = i3;
                    }
                    int i4 = configuration3.mnc;
                    int i5 = configuration4.mnc;
                    if (i4 != i5) {
                        configuration.mnc = i5;
                    }
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 24) {
                        x.a(configuration3, configuration4, configuration);
                    } else if (!Objects.equals(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                    int i7 = configuration3.touchscreen;
                    int i8 = configuration4.touchscreen;
                    if (i7 != i8) {
                        configuration.touchscreen = i8;
                    }
                    int i9 = configuration3.keyboard;
                    int i10 = configuration4.keyboard;
                    if (i9 != i10) {
                        configuration.keyboard = i10;
                    }
                    int i11 = configuration3.keyboardHidden;
                    int i12 = configuration4.keyboardHidden;
                    if (i11 != i12) {
                        configuration.keyboardHidden = i12;
                    }
                    int i13 = configuration3.navigation;
                    int i14 = configuration4.navigation;
                    if (i13 != i14) {
                        configuration.navigation = i14;
                    }
                    int i15 = configuration3.navigationHidden;
                    int i16 = configuration4.navigationHidden;
                    if (i15 != i16) {
                        configuration.navigationHidden = i16;
                    }
                    int i17 = configuration3.orientation;
                    int i18 = configuration4.orientation;
                    if (i17 != i18) {
                        configuration.orientation = i18;
                    }
                    int i19 = configuration3.screenLayout & 15;
                    int i20 = configuration4.screenLayout & 15;
                    if (i19 != i20) {
                        configuration.screenLayout |= i20;
                    }
                    int i21 = configuration3.screenLayout & 192;
                    int i22 = configuration4.screenLayout & 192;
                    if (i21 != i22) {
                        configuration.screenLayout |= i22;
                    }
                    int i23 = configuration3.screenLayout & 48;
                    int i24 = configuration4.screenLayout & 48;
                    if (i23 != i24) {
                        configuration.screenLayout |= i24;
                    }
                    int i25 = configuration3.screenLayout & 768;
                    int i26 = configuration4.screenLayout & 768;
                    if (i25 != i26) {
                        configuration.screenLayout |= i26;
                    }
                    if (i6 >= 26) {
                        if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                            configuration.colorMode = configuration.colorMode | (configuration4.colorMode & 3);
                        }
                        if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                            configuration.colorMode = configuration.colorMode | (configuration4.colorMode & 12);
                        }
                    }
                    int i27 = configuration3.uiMode & 15;
                    int i28 = configuration4.uiMode & 15;
                    if (i27 != i28) {
                        configuration.uiMode |= i28;
                    }
                    int i29 = configuration3.uiMode & 48;
                    int i30 = configuration4.uiMode & 48;
                    if (i29 != i30) {
                        configuration.uiMode |= i30;
                    }
                    int i31 = configuration3.screenWidthDp;
                    int i32 = configuration4.screenWidthDp;
                    if (i31 != i32) {
                        configuration.screenWidthDp = i32;
                    }
                    int i33 = configuration3.screenHeightDp;
                    int i34 = configuration4.screenHeightDp;
                    if (i33 != i34) {
                        configuration.screenHeightDp = i34;
                    }
                    int i35 = configuration3.smallestScreenWidthDp;
                    int i36 = configuration4.smallestScreenWidthDp;
                    if (i35 != i36) {
                        configuration.smallestScreenWidthDp = i36;
                    }
                    int i37 = configuration3.densityDpi;
                    int i38 = configuration4.densityDpi;
                    if (i37 != i38) {
                        configuration.densityDpi = i38;
                    }
                }
            }
            Configuration r2 = D.r(context, B2, n2, configuration, true);
            C0176c cVar = new C0176c(context, 2131821117);
            cVar.a(r2);
            try {
                if (context.getTheme() != null) {
                    E.b.m(cVar.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            context = cVar;
        }
        super.attachBaseContext(context);
    }

    public final void closeOptionsMenu() {
        l();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        l();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r1.equals("--list-dumpables") == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r1.equals("--dump-dumpable") == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (android.os.Build.VERSION.SDK_INT < 33) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dump(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
        /*
            r6 = this;
            super.dump(r7, r8, r9, r10)
            r0 = 0
            if (r10 == 0) goto L_0x005d
            int r1 = r10.length
            if (r1 != 0) goto L_0x000a
            goto L_0x005d
        L_0x000a:
            r1 = r10[r0]
            int r2 = r1.hashCode()
            switch(r2) {
                case -645125871: goto L_0x004d;
                case 100470631: goto L_0x003d;
                case 472614934: goto L_0x0034;
                case 1159329357: goto L_0x0024;
                case 1455016274: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x005d
        L_0x0014:
            java.lang.String r2 = "--autofill"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x001d
            goto L_0x005d
        L_0x001d:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L_0x005d
            goto L_0x005c
        L_0x0024:
            java.lang.String r2 = "--contentcapture"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x002d
            goto L_0x005d
        L_0x002d:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L_0x005d
            goto L_0x005c
        L_0x0034:
            java.lang.String r2 = "--list-dumpables"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0046
            goto L_0x005d
        L_0x003d:
            java.lang.String r2 = "--dump-dumpable"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0046
            goto L_0x005d
        L_0x0046:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L_0x005d
            goto L_0x005c
        L_0x004d:
            java.lang.String r2 = "--translation"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0056
            goto L_0x005d
        L_0x0056:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r1 < r2) goto L_0x005d
        L_0x005c:
            return
        L_0x005d:
            r9.print(r7)
            java.lang.String r1 = "Local FragmentActivity "
            r9.print(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r9.print(r1)
            java.lang.String r1 = " State:"
            r9.println(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r2 = "  "
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r9.print(r1)
            java.lang.String r2 = "mCreated="
            r9.print(r2)
            boolean r2 = r6.f3021z
            r9.print(r2)
            java.lang.String r2 = " mResumed="
            r9.print(r2)
            boolean r2 = r6.f3016A
            r9.print(r2)
            java.lang.String r2 = " mStopped="
            r9.print(r2)
            boolean r2 = r6.f3017B
            r9.print(r2)
            android.app.Application r2 = r6.getApplication()
            if (r2 == 0) goto L_0x0109
            androidx.lifecycle.P r2 = r6.c()
            android.support.v4.media.session.t r3 = new android.support.v4.media.session.t
            K0.e r4 = c0.C0087a.f2083d
            r3.<init>((androidx.lifecycle.P) r2, (androidx.lifecycle.O) r4)
            java.lang.Class<c0.a> r2 = c0.C0087a.class
            java.lang.String r4 = r2.getCanonicalName()
            if (r4 == 0) goto L_0x0101
            java.lang.String r5 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r4 = r5.concat(r4)
            androidx.lifecycle.M r2 = r3.k(r4, r2)
            c0.a r2 = (c0.C0087a) r2
            r.l r2 = r2.f2084c
            int r3 = r2.f4554c
            if (r3 <= 0) goto L_0x0109
            r9.print(r1)
            java.lang.String r3 = "Loaders:"
            r9.println(r3)
            int r3 = r2.f4554c
            if (r3 > 0) goto L_0x00df
            goto L_0x0109
        L_0x00df:
            java.lang.Object[] r7 = r2.f4553b
            r7 = r7[r0]
            if (r7 != 0) goto L_0x00fb
            r9.print(r1)
            java.lang.String r7 = "  #"
            r9.print(r7)
            int[] r7 = r2.f4552a
            r7 = r7[r0]
            r9.print(r7)
            java.lang.String r7 = ": "
            r9.print(r7)
            r7 = 0
            throw r7
        L_0x00fb:
            java.lang.ClassCastException r7 = new java.lang.ClassCastException
            r7.<init>()
            throw r7
        L_0x0101:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Local and anonymous classes can not be ViewModels"
            r7.<init>(r8)
            throw r7
        L_0x0109:
            A.b r0 = r6.f3019x
            java.lang.Object r0 = r0.f2g
            androidx.fragment.app.t r0 = (androidx.fragment.app.C0065t) r0
            androidx.fragment.app.H r0 = r0.i
            r0.u(r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.C0121l.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public final View findViewById(int i) {
        D d2 = (D) k();
        d2.u();
        return d2.f2890q.findViewById(i);
    }

    public final MenuInflater getMenuInflater() {
        Context context;
        D d2 = (D) k();
        if (d2.f2894u == null) {
            d2.z();
            N n2 = d2.f2893t;
            if (n2 != null) {
                context = n2.W();
            } else {
                context = d2.f2889p;
            }
            d2.f2894u = new h(context);
        }
        return d2.f2894u;
    }

    public final void invalidateOptionsMenu() {
        D d2 = (D) k();
        if (d2.f2893t != null) {
            d2.z();
            d2.f2893t.getClass();
            d2.A(0);
        }
    }

    public final N l() {
        D d2 = (D) k();
        d2.z();
        return d2.f2893t;
    }

    public final void n() {
        super.onDestroy();
        ((C0065t) this.f3019x.f2g).i.k();
        this.f3020y.d(C0077l.ON_DESTROY);
    }

    public final boolean o(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((C0065t) this.f3019x.f2g).i.i();
        }
        return false;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        D d2 = (D) k();
        if (d2.f2861L && d2.f2856F) {
            d2.z();
            N n2 = d2.f2893t;
            if (n2 != null) {
                n2.Y(n2.f2934l.getResources().getBoolean(2131034112));
            }
        }
        C0302s a2 = C0302s.a();
        Context context = d2.f2889p;
        synchronized (a2) {
            a2.f4296a.l(context);
        }
        d2.f2873X = new Configuration(d2.f2889p.getResources().getConfiguration());
        d2.l(false, false);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3020y.d(C0077l.ON_CREATE);
        H h2 = ((C0065t) this.f3019x.f2g).i;
        h2.f1573E = false;
        h2.f1574F = false;
        h2.f1579L.f1616h = false;
        h2.t(1);
    }

    public void onDestroy() {
        n();
        k().c();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent a2;
        if (o(i, menuItem)) {
            return true;
        }
        N l2 = l();
        if (menuItem.getItemId() != 16908332 || l2 == null || (((f1) l2.f2938p).f4189b & 4) == 0 || (a2 = e.a(this)) == null) {
            return false;
        }
        if (shouldUpRecreateTask(a2)) {
            ArrayList arrayList = new ArrayList();
            Intent a3 = e.a(this);
            if (a3 == null) {
                a3 = e.a(this);
            }
            if (a3 != null) {
                ComponentName component = a3.getComponent();
                if (component == null) {
                    component = a3.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent b2 = e.b(this, component);
                    while (b2 != null) {
                        arrayList.add(size, b2);
                        b2 = e.b(this, b2.getComponent());
                    }
                    arrayList.add(a3);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                startActivities(intentArr, (Bundle) null);
                try {
                    finishAffinity();
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            navigateUpTo(a2);
            return true;
        }
    }

    public void onPause() {
        super.onPause();
        this.f3016A = false;
        ((C0065t) this.f3019x.f2g).i.t(5);
        this.f3020y.d(C0077l.ON_PAUSE);
    }

    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((D) k()).u();
    }

    public final void onPostResume() {
        p();
        D d2 = (D) k();
        d2.z();
        N n2 = d2.f2893t;
        if (n2 != null) {
            n2.f2930E = true;
        }
    }

    public final void onStart() {
        q();
        ((D) k()).l(true, false);
    }

    public final void onStop() {
        r();
        D d2 = (D) k();
        d2.z();
        N n2 = d2.f2893t;
        if (n2 != null) {
            n2.f2930E = false;
            j jVar = n2.f2929D;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        k().k(charSequence);
    }

    public final void openOptionsMenu() {
        l();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final void p() {
        super.onPostResume();
        this.f3020y.d(C0077l.ON_RESUME);
        H h2 = ((C0065t) this.f3019x.f2g).i;
        h2.f1573E = false;
        h2.f1574F = false;
        h2.f1579L.f1616h = false;
        h2.t(7);
    }

    public final void r() {
        b bVar;
        super.onStop();
        this.f3017B = true;
        do {
            bVar = this.f3019x;
        } while (m(((C0065t) bVar.f2g).i));
        H h2 = ((C0065t) bVar.f2g).i;
        h2.f1574F = true;
        h2.f1579L.f1616h = true;
        h2.t(4);
        this.f3020y.d(C0077l.ON_STOP);
    }

    public void setContentView(View view) {
        j();
        k().i(view);
    }

    public final void setTheme(int i) {
        super.setTheme(i);
        ((D) k()).f2875Z = i;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0065t) this.f3019x.f2g).i.f1585f.onCreateView((View) null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        j();
        k().j(view, layoutParams);
    }
}
