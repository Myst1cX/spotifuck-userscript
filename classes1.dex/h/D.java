package h;

import C.e;
import J.f;
import N.F;
import N.Q;
import N.Z;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.t;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0053g;
import g.C0096a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import m.C0174a;
import m.C0176c;
import m.h;
import n.C0193h;
import n.C0195j;
import n.C0197l;
import n.C0199n;
import o.C0278g;
import o.C0286k;
import o.C0289l0;
import o.C0291m0;
import o.C0302s;
import o.a1;
import o.f1;
import o.n1;
import r.k;

public final class D extends s implements C0195j, LayoutInflater.Factory2 {

    /* renamed from: n0  reason: collision with root package name */
    public static final k f2848n0 = new k();

    /* renamed from: o0  reason: collision with root package name */
    public static final int[] f2849o0 = {16842836};

    /* renamed from: p0  reason: collision with root package name */
    public static final boolean f2850p0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: A  reason: collision with root package name */
    public ActionBarContextView f2851A;

    /* renamed from: B  reason: collision with root package name */
    public PopupWindow f2852B;

    /* renamed from: C  reason: collision with root package name */
    public t f2853C;

    /* renamed from: D  reason: collision with root package name */
    public Z f2854D = null;

    /* renamed from: E  reason: collision with root package name */
    public final boolean f2855E = true;

    /* renamed from: F  reason: collision with root package name */
    public boolean f2856F;

    /* renamed from: G  reason: collision with root package name */
    public ViewGroup f2857G;

    /* renamed from: H  reason: collision with root package name */
    public TextView f2858H;
    public View I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f2859J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f2860K;

    /* renamed from: L  reason: collision with root package name */
    public boolean f2861L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f2862M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f2863N;

    /* renamed from: O  reason: collision with root package name */
    public boolean f2864O;

    /* renamed from: P  reason: collision with root package name */
    public boolean f2865P;

    /* renamed from: Q  reason: collision with root package name */
    public boolean f2866Q;

    /* renamed from: R  reason: collision with root package name */
    public C[] f2867R;

    /* renamed from: S  reason: collision with root package name */
    public C f2868S;

    /* renamed from: T  reason: collision with root package name */
    public boolean f2869T;

    /* renamed from: U  reason: collision with root package name */
    public boolean f2870U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f2871V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f2872W;

    /* renamed from: X  reason: collision with root package name */
    public Configuration f2873X;

    /* renamed from: Y  reason: collision with root package name */
    public final int f2874Y = -100;

    /* renamed from: Z  reason: collision with root package name */
    public int f2875Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f2876a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f2877b0;

    /* renamed from: c0  reason: collision with root package name */
    public C0109A f2878c0;

    /* renamed from: d0  reason: collision with root package name */
    public C0109A f2879d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f2880e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f2881f0;

    /* renamed from: g0  reason: collision with root package name */
    public final t f2882g0 = new t(this, 0);

    /* renamed from: h0  reason: collision with root package name */
    public boolean f2883h0;

    /* renamed from: i0  reason: collision with root package name */
    public Rect f2884i0;

    /* renamed from: j0  reason: collision with root package name */
    public Rect f2885j0;

    /* renamed from: k0  reason: collision with root package name */
    public G f2886k0;

    /* renamed from: l0  reason: collision with root package name */
    public OnBackInvokedDispatcher f2887l0;
    public OnBackInvokedCallback m0;

    /* renamed from: o  reason: collision with root package name */
    public final Object f2888o;

    /* renamed from: p  reason: collision with root package name */
    public final Context f2889p;

    /* renamed from: q  reason: collision with root package name */
    public Window f2890q;

    /* renamed from: r  reason: collision with root package name */
    public z f2891r;

    /* renamed from: s  reason: collision with root package name */
    public final Object f2892s;

    /* renamed from: t  reason: collision with root package name */
    public N f2893t;

    /* renamed from: u  reason: collision with root package name */
    public h f2894u;

    /* renamed from: v  reason: collision with root package name */
    public CharSequence f2895v;

    /* renamed from: w  reason: collision with root package name */
    public C0289l0 f2896w;

    /* renamed from: x  reason: collision with root package name */
    public u f2897x;

    /* renamed from: y  reason: collision with root package name */
    public u f2898y;

    /* renamed from: z  reason: collision with root package name */
    public C0174a f2899z;

    public static Configuration r(Context context, int i, f fVar, Configuration configuration, boolean z2) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i == 2) {
            i2 = 32;
        } else if (z2) {
            i2 = 0;
        } else {
            i2 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        if (fVar != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                x.d(configuration2, fVar);
            } else {
                J.h hVar = fVar.f294a;
                configuration2.setLocale(hVar.get(0));
                configuration2.setLayoutDirection(hVar.get(0));
            }
        }
        return configuration2;
    }

    public final void b() {
        String str;
        this.f2870U = true;
        l(false, true);
        v();
        Object obj = this.f2888o;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                str = e.c(activity, activity.getComponentName());
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException(e);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                N n2 = this.f2893t;
                if (n2 == null) {
                    this.f2883h0 = true;
                } else if (!n2.f2941s) {
                    f1 f1Var = (f1) n2.f2938p;
                    int i = f1Var.f4189b;
                    n2.f2941s = true;
                    f1Var.a((i & -5) | 4);
                }
            }
            synchronized (s.f3034m) {
                s.e(this);
                s.f3033l.add(new WeakReference(this));
            }
        }
        this.f2873X = new Configuration(this.f2889p.getResources().getConfiguration());
        this.f2871V = true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Class[], java.lang.Object[], java.lang.String] */
    /* JADX WARNING: type inference failed for: r9v1 */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f2, code lost:
        if (r0.equals("ImageButton") == false) goto L_0x007b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r18, java.lang.String r19, android.content.Context r20, android.util.AttributeSet r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = r20
            r3 = r21
            r4 = 3
            r5 = -1
            r6 = 4
            r7 = 1
            h.G r8 = r1.f2886k0
            r9 = 0
            if (r8 != 0) goto L_0x0048
            int[] r8 = g.C0096a.f2526j
            android.content.Context r10 = r1.f2889p
            android.content.res.TypedArray r8 = r10.obtainStyledAttributes(r8)
            r11 = 116(0x74, float:1.63E-43)
            java.lang.String r11 = r8.getString(r11)
            r8.recycle()
            if (r11 != 0) goto L_0x002c
            h.G r8 = new h.G
            r8.<init>()
            r1.f2886k0 = r8
            goto L_0x0048
        L_0x002c:
            java.lang.ClassLoader r8 = r10.getClassLoader()     // Catch:{ all -> 0x0041 }
            java.lang.Class r8 = r8.loadClass(r11)     // Catch:{ all -> 0x0041 }
            java.lang.reflect.Constructor r8 = r8.getDeclaredConstructor(r9)     // Catch:{ all -> 0x0041 }
            java.lang.Object r8 = r8.newInstance(r9)     // Catch:{ all -> 0x0041 }
            h.G r8 = (h.G) r8     // Catch:{ all -> 0x0041 }
            r1.f2886k0 = r8     // Catch:{ all -> 0x0041 }
            goto L_0x0048
        L_0x0041:
            h.G r8 = new h.G
            r8.<init>()
            r1.f2886k0 = r8
        L_0x0048:
            h.G r8 = r1.f2886k0
            int r10 = o.k1.f4261a
            r8.getClass()
            int[] r10 = g.C0096a.f2541y
            r15 = 0
            android.content.res.TypedArray r10 = r2.obtainStyledAttributes(r3, r10, r15, r15)
            int r11 = r10.getResourceId(r6, r15)
            r10.recycle()
            if (r11 == 0) goto L_0x0070
            boolean r10 = r2 instanceof m.C0176c
            if (r10 == 0) goto L_0x006a
            r10 = r2
            m.c r10 = (m.C0176c) r10
            int r10 = r10.f3613a
            if (r10 == r11) goto L_0x0070
        L_0x006a:
            m.c r10 = new m.c
            r10.<init>(r2, r11)
            goto L_0x0071
        L_0x0070:
            r10 = r2
        L_0x0071:
            r19.getClass()
            int r11 = r19.hashCode()
            switch(r11) {
                case -1946472170: goto L_0x0119;
                case -1455429095: goto L_0x010d;
                case -1346021293: goto L_0x0101;
                case -938935918: goto L_0x00f5;
                case -937446323: goto L_0x00ec;
                case -658531749: goto L_0x00e1;
                case -339785223: goto L_0x00d6;
                case 776382189: goto L_0x00cb;
                case 799298502: goto L_0x00bf;
                case 1125864064: goto L_0x00b2;
                case 1413872058: goto L_0x00a5;
                case 1601505219: goto L_0x0098;
                case 1666676343: goto L_0x008b;
                case 2001146706: goto L_0x007e;
                default: goto L_0x007b;
            }
        L_0x007b:
            r6 = -1
            goto L_0x0124
        L_0x007e:
            java.lang.String r6 = "Button"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0087
            goto L_0x007b
        L_0x0087:
            r6 = 13
            goto L_0x0124
        L_0x008b:
            java.lang.String r6 = "EditText"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0094
            goto L_0x007b
        L_0x0094:
            r6 = 12
            goto L_0x0124
        L_0x0098:
            java.lang.String r6 = "CheckBox"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x00a1
            goto L_0x007b
        L_0x00a1:
            r6 = 11
            goto L_0x0124
        L_0x00a5:
            java.lang.String r6 = "AutoCompleteTextView"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x00ae
            goto L_0x007b
        L_0x00ae:
            r6 = 10
            goto L_0x0124
        L_0x00b2:
            java.lang.String r6 = "ImageView"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x00bb
            goto L_0x007b
        L_0x00bb:
            r6 = 9
            goto L_0x0124
        L_0x00bf:
            java.lang.String r6 = "ToggleButton"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x00c8
            goto L_0x007b
        L_0x00c8:
            r6 = 8
            goto L_0x0124
        L_0x00cb:
            java.lang.String r6 = "RadioButton"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x00d4
            goto L_0x007b
        L_0x00d4:
            r6 = 7
            goto L_0x0124
        L_0x00d6:
            java.lang.String r6 = "Spinner"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x00df
            goto L_0x007b
        L_0x00df:
            r6 = 6
            goto L_0x0124
        L_0x00e1:
            java.lang.String r6 = "SeekBar"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x00ea
            goto L_0x007b
        L_0x00ea:
            r6 = 5
            goto L_0x0124
        L_0x00ec:
            java.lang.String r11 = "ImageButton"
            boolean r11 = r0.equals(r11)
            if (r11 != 0) goto L_0x0124
            goto L_0x007b
        L_0x00f5:
            java.lang.String r6 = "TextView"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x00ff
            goto L_0x007b
        L_0x00ff:
            r6 = 3
            goto L_0x0124
        L_0x0101:
            java.lang.String r6 = "MultiAutoCompleteTextView"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x010b
            goto L_0x007b
        L_0x010b:
            r6 = 2
            goto L_0x0124
        L_0x010d:
            java.lang.String r6 = "CheckedTextView"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0117
            goto L_0x007b
        L_0x0117:
            r6 = 1
            goto L_0x0124
        L_0x0119:
            java.lang.String r6 = "RatingBar"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0123
            goto L_0x007b
        L_0x0123:
            r6 = 0
        L_0x0124:
            switch(r6) {
                case 0: goto L_0x0175;
                case 1: goto L_0x016f;
                case 2: goto L_0x0169;
                case 3: goto L_0x0164;
                case 4: goto L_0x015b;
                case 5: goto L_0x0155;
                case 6: goto L_0x014f;
                case 7: goto L_0x014a;
                case 8: goto L_0x0144;
                case 9: goto L_0x013e;
                case 10: goto L_0x0139;
                case 11: goto L_0x0134;
                case 12: goto L_0x012e;
                case 13: goto L_0x0129;
                default: goto L_0x0127;
            }
        L_0x0127:
            r6 = r9
            goto L_0x017a
        L_0x0129:
            o.p r6 = r8.b(r10, r3)
            goto L_0x017a
        L_0x012e:
            o.u r6 = new o.u
            r6.<init>(r10, r3)
            goto L_0x017a
        L_0x0134:
            o.q r6 = r8.c(r10, r3)
            goto L_0x017a
        L_0x0139:
            o.o r6 = r8.a(r10, r3)
            goto L_0x017a
        L_0x013e:
            o.y r6 = new o.y
            r6.<init>(r10, r3, r15)
            goto L_0x017a
        L_0x0144:
            o.j0 r6 = new o.j0
            r6.<init>(r10, r3)
            goto L_0x017a
        L_0x014a:
            o.D r6 = r8.d(r10, r3)
            goto L_0x017a
        L_0x014f:
            o.Q r6 = new o.Q
            r6.<init>(r10, r3)
            goto L_0x017a
        L_0x0155:
            o.G r6 = new o.G
            r6.<init>(r10, r3)
            goto L_0x017a
        L_0x015b:
            o.w r6 = new o.w
            r11 = 2130969177(0x7f040259, float:1.7547029E38)
            r6.<init>(r10, r3, r11)
            goto L_0x017a
        L_0x0164:
            o.d0 r6 = r8.e(r10, r3)
            goto L_0x017a
        L_0x0169:
            o.z r6 = new o.z
            r6.<init>(r10, r3)
            goto L_0x017a
        L_0x016f:
            o.r r6 = new o.r
            r6.<init>(r10, r3)
            goto L_0x017a
        L_0x0175:
            o.E r6 = new o.E
            r6.<init>(r10, r3)
        L_0x017a:
            if (r6 != 0) goto L_0x01ca
            if (r2 == r10) goto L_0x01ca
            java.lang.Object[] r2 = r8.f2910a
            java.lang.String r6 = "view"
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L_0x018e
            java.lang.String r0 = "class"
            java.lang.String r0 = r3.getAttributeValue(r9, r0)
        L_0x018e:
            r2[r15] = r10     // Catch:{ Exception -> 0x01c5, all -> 0x01af }
            r2[r7] = r3     // Catch:{ Exception -> 0x01c5, all -> 0x01af }
            r6 = 46
            int r6 = r0.indexOf(r6)     // Catch:{ Exception -> 0x01c5, all -> 0x01af }
            if (r5 != r6) goto L_0x01b6
            r5 = 0
        L_0x019b:
            java.lang.String[] r6 = h.G.f2908g     // Catch:{ Exception -> 0x01c5, all -> 0x01af }
            if (r5 >= r4) goto L_0x01b1
            r6 = r6[r5]     // Catch:{ Exception -> 0x01c5, all -> 0x01af }
            android.view.View r6 = r8.f(r10, r0, r6)     // Catch:{ Exception -> 0x01c5, all -> 0x01af }
            if (r6 == 0) goto L_0x01ad
            r2[r15] = r9
            r2[r7] = r9
            r9 = r6
            goto L_0x01c9
        L_0x01ad:
            int r5 = r5 + r7
            goto L_0x019b
        L_0x01af:
            r0 = move-exception
            goto L_0x01c0
        L_0x01b1:
            r2[r15] = r9
            r2[r7] = r9
            goto L_0x01c9
        L_0x01b6:
            android.view.View r0 = r8.f(r10, r0, r9)     // Catch:{ Exception -> 0x01c5, all -> 0x01af }
            r2[r15] = r9
            r2[r7] = r9
            r9 = r0
            goto L_0x01c9
        L_0x01c0:
            r2[r15] = r9
            r2[r7] = r9
            throw r0
        L_0x01c5:
            r2[r15] = r9
            r2[r7] = r9
        L_0x01c9:
            r6 = r9
        L_0x01ca:
            if (r6 == 0) goto L_0x0269
            android.content.Context r0 = r6.getContext()
            boolean r2 = r0 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L_0x01f2
            boolean r2 = r6.hasOnClickListeners()
            if (r2 != 0) goto L_0x01db
            goto L_0x01f2
        L_0x01db:
            int[] r2 = h.G.f2905c
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r3, r2)
            java.lang.String r2 = r0.getString(r15)
            if (r2 == 0) goto L_0x01ef
            h.F r4 = new h.F
            r4.<init>(r6, r2)
            r6.setOnClickListener(r4)
        L_0x01ef:
            r0.recycle()
        L_0x01f2:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r0 <= r2) goto L_0x01fa
            goto L_0x0269
        L_0x01fa:
            int[] r0 = h.G.f2906d
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r3, r0)
            boolean r4 = r0.hasValue(r15)
            java.lang.Class<java.lang.Boolean> r5 = java.lang.Boolean.class
            if (r4 == 0) goto L_0x0225
            boolean r4 = r0.getBoolean(r15, r15)
            java.util.WeakHashMap r7 = N.Q.f509a
            N.A r7 = new N.A
            r12 = 2131296727(0x7f0901d7, float:1.8211379E38)
            r16 = 3
            r11 = r7
            r13 = r5
            r14 = r15
            r8 = 0
            r15 = r2
            r11.<init>(r12, r13, r14, r15, r16)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r7.d(r6, r4)
            goto L_0x0226
        L_0x0225:
            r8 = 0
        L_0x0226:
            r0.recycle()
            int[] r0 = h.G.e
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r3, r0)
            boolean r4 = r0.hasValue(r8)
            if (r4 == 0) goto L_0x023c
            java.lang.String r4 = r0.getString(r8)
            N.Q.q(r6, r4)
        L_0x023c:
            r0.recycle()
            int[] r0 = h.G.f2907f
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r3, r0)
            boolean r3 = r0.hasValue(r8)
            if (r3 == 0) goto L_0x0266
            boolean r3 = r0.getBoolean(r8, r8)
            java.util.WeakHashMap r4 = N.Q.f509a
            N.A r4 = new N.A
            r12 = 2131296732(0x7f0901dc, float:1.8211389E38)
            r16 = 0
            r11 = r4
            r13 = r5
            r14 = r8
            r15 = r2
            r11.<init>(r12, r13, r14, r15, r16)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r4.d(r6, r2)
        L_0x0266:
            r0.recycle()
        L_0x0269:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h.D.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final void u() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.f2856F) {
            int[] iArr = C0096a.f2526j;
            Context context2 = this.f2889p;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    g(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    g(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    g(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    g(10);
                }
                this.f2864O = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                v();
                this.f2890q.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (this.f2865P) {
                    viewGroup = this.f2863N ? (ViewGroup) from.inflate(2131492886, (ViewGroup) null) : (ViewGroup) from.inflate(2131492885, (ViewGroup) null);
                } else if (this.f2864O) {
                    viewGroup = (ViewGroup) from.inflate(2131492876, (ViewGroup) null);
                    this.f2862M = false;
                    this.f2861L = false;
                } else if (this.f2861L) {
                    TypedValue typedValue = new TypedValue();
                    context2.getTheme().resolveAttribute(2130968587, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new C0176c(context2, typedValue.resourceId);
                    } else {
                        context = context2;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(2131492887, (ViewGroup) null);
                    C0289l0 l0Var = (C0289l0) viewGroup.findViewById(2131296410);
                    this.f2896w = l0Var;
                    l0Var.setWindowCallback(this.f2890q.getCallback());
                    if (this.f2862M) {
                        ((ActionBarOverlayLayout) this.f2896w).j(109);
                    }
                    if (this.f2859J) {
                        ((ActionBarOverlayLayout) this.f2896w).j(2);
                    }
                    if (this.f2860K) {
                        ((ActionBarOverlayLayout) this.f2896w).j(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    u uVar = new u(this, 0);
                    WeakHashMap weakHashMap = Q.f509a;
                    F.u(viewGroup, uVar);
                    if (this.f2896w == null) {
                        this.f2858H = (TextView) viewGroup.findViewById(2131296755);
                    }
                    boolean z2 = n1.f4272a;
                    try {
                        Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", (Class[]) null);
                        if (!method.isAccessible()) {
                            method.setAccessible(true);
                        }
                        method.invoke(viewGroup, (Object[]) null);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(2131296310);
                    ViewGroup viewGroup2 = (ViewGroup) this.f2890q.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                        }
                    }
                    this.f2890q.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new u(this, 1));
                    this.f2857G = viewGroup;
                    Object obj = this.f2888o;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f2895v;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        C0289l0 l0Var2 = this.f2896w;
                        if (l0Var2 != null) {
                            l0Var2.setWindowTitle(charSequence);
                        } else {
                            N n2 = this.f2893t;
                            if (n2 != null) {
                                f1 f1Var = (f1) n2.f2938p;
                                if (!f1Var.f4193g) {
                                    f1Var.f4194h = charSequence;
                                    if ((f1Var.f4189b & 8) != 0) {
                                        Toolbar toolbar = f1Var.f4188a;
                                        toolbar.setTitle(charSequence);
                                        if (f1Var.f4193g) {
                                            Q.q(toolbar.getRootView(), charSequence);
                                        }
                                    }
                                }
                            } else {
                                TextView textView = this.f2858H;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f2857G.findViewById(16908290);
                    View decorView = this.f2890q.getDecorView();
                    contentFrameLayout2.f1327l.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (contentFrameLayout2.isLaidOut()) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.f2856F = true;
                    C y2 = y(0);
                    if (!this.f2872W && y2.f2840h == null) {
                        A(108);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f2861L + ", windowActionBarOverlay: " + this.f2862M + ", android:windowIsFloating: " + this.f2864O + ", windowActionModeOverlay: " + this.f2863N + ", windowNoTitle: " + this.f2865P + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public static f n(Context context) {
        f fVar;
        f fVar2;
        Locale locale;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (fVar = s.f3030h) == null) {
            return null;
        }
        f x2 = x(context.getApplicationContext().getResources().getConfiguration());
        J.h hVar = fVar.f294a;
        int i2 = 0;
        if (i >= 24) {
            if (hVar.isEmpty()) {
                fVar2 = f.f293b;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                while (true) {
                    if (i2 >= x2.f294a.size() + hVar.size()) {
                        break;
                    }
                    if (i2 < hVar.size()) {
                        locale = hVar.get(i2);
                    } else {
                        locale = x2.f294a.get(i2 - hVar.size());
                    }
                    if (locale != null) {
                        linkedHashSet.add(locale);
                    }
                    i2++;
                }
                fVar2 = f.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
            }
        } else if (hVar.isEmpty()) {
            fVar2 = f.f293b;
        } else {
            fVar2 = f.b(w.b(hVar.get(0)));
        }
        if (fVar2.f294a.isEmpty()) {
            return x2;
        }
        return fVar2;
    }

    public static f x(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return x.b(configuration);
        }
        return f.b(w.b(configuration.locale));
    }

    public final void A(int i) {
        this.f2881f0 = (1 << i) | this.f2881f0;
        if (!this.f2880e0) {
            View decorView = this.f2890q.getDecorView();
            t tVar = this.f2882g0;
            WeakHashMap weakHashMap = Q.f509a;
            decorView.postOnAnimation(tVar);
            this.f2880e0 = true;
        }
    }

    public final int B(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        if (this.f2879d0 == null) {
                            this.f2879d0 = new C0109A(this, context);
                        }
                        return this.f2879d0.f();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                return w(context).f();
            } else {
                return -1;
            }
        }
        return i;
    }

    public final boolean C() {
        C0291m0 m0Var;
        a1 a1Var;
        C0199n nVar;
        boolean z2 = this.f2869T;
        this.f2869T = false;
        C y2 = y(0);
        if (y2.f2844m) {
            if (!z2) {
                q(y2, true);
            }
            return true;
        }
        C0174a aVar = this.f2899z;
        if (aVar != null) {
            aVar.a();
            return true;
        }
        z();
        N n2 = this.f2893t;
        if (n2 == null || (m0Var = n2.f2938p) == null || (a1Var = ((f1) m0Var).f4188a.f1390Q) == null || a1Var.f4169g == null) {
            return false;
        }
        a1 a1Var2 = ((f1) m0Var).f4188a.f1390Q;
        if (a1Var2 == null) {
            nVar = null;
        } else {
            nVar = a1Var2.f4169g;
        }
        if (nVar != null) {
            nVar.collapseActionView();
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0153, code lost:
        if (r3 != null) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0173, code lost:
        if (r3.f3865k.getCount() > 0) goto L_0x0175;
     */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D(h.C r18, android.view.KeyEvent r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1.f2844m
            if (r2 != 0) goto L_0x01d7
            boolean r2 = r0.f2872W
            if (r2 == 0) goto L_0x000e
            goto L_0x01d7
        L_0x000e:
            int r2 = r1.f2834a
            android.content.Context r3 = r0.f2889p
            if (r2 != 0) goto L_0x0024
            android.content.res.Resources r4 = r3.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.screenLayout
            r4 = r4 & 15
            r5 = 4
            if (r4 != r5) goto L_0x0024
            return
        L_0x0024:
            android.view.Window r4 = r0.f2890q
            android.view.Window$Callback r4 = r4.getCallback()
            r5 = 1
            if (r4 == 0) goto L_0x0039
            n.l r6 = r1.f2840h
            boolean r4 = r4.onMenuOpened(r2, r6)
            if (r4 != 0) goto L_0x0039
            r0.q(r1, r5)
            return
        L_0x0039:
            java.lang.String r4 = "window"
            java.lang.Object r4 = r3.getSystemService(r4)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            if (r4 != 0) goto L_0x0044
            return
        L_0x0044:
            boolean r6 = r17.F(r18, r19)
            if (r6 != 0) goto L_0x004b
            return
        L_0x004b:
            h.B r6 = r1.e
            r7 = 0
            r8 = -2
            if (r6 == 0) goto L_0x0068
            boolean r9 = r1.f2845n
            if (r9 == 0) goto L_0x0056
            goto L_0x0068
        L_0x0056:
            android.view.View r3 = r1.f2839g
            if (r3 == 0) goto L_0x01ae
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 == 0) goto L_0x01ae
            int r3 = r3.width
            r6 = -1
            if (r3 != r6) goto L_0x01ae
            r10 = -1
            goto L_0x01af
        L_0x0068:
            if (r6 != 0) goto L_0x00e3
            r17.z()
            h.N r6 = r0.f2893t
            if (r6 == 0) goto L_0x0076
            android.content.Context r6 = r6.W()
            goto L_0x0077
        L_0x0076:
            r6 = 0
        L_0x0077:
            if (r6 != 0) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r3 = r6
        L_0x007b:
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources r9 = r3.getResources()
            android.content.res.Resources$Theme r9 = r9.newTheme()
            android.content.res.Resources$Theme r10 = r3.getTheme()
            r9.setTo(r10)
            r10 = 2130968580(0x7f040004, float:1.7545818E38)
            r9.resolveAttribute(r10, r6, r5)
            int r10 = r6.resourceId
            if (r10 == 0) goto L_0x009c
            r9.applyStyle(r10, r5)
        L_0x009c:
            r10 = 2130969497(0x7f040399, float:1.7547678E38)
            r9.resolveAttribute(r10, r6, r5)
            int r6 = r6.resourceId
            if (r6 == 0) goto L_0x00aa
            r9.applyStyle(r6, r5)
            goto L_0x00b0
        L_0x00aa:
            r6 = 2131821105(0x7f110231, float:1.9274944E38)
            r9.applyStyle(r6, r5)
        L_0x00b0:
            m.c r6 = new m.c
            r6.<init>(r3, r7)
            android.content.res.Resources$Theme r3 = r6.getTheme()
            r3.setTo(r9)
            r1.f2841j = r6
            int[] r3 = g.C0096a.f2526j
            android.content.res.TypedArray r3 = r6.obtainStyledAttributes(r3)
            r6 = 86
            int r6 = r3.getResourceId(r6, r7)
            r1.f2835b = r6
            int r6 = r3.getResourceId(r5, r7)
            r1.f2837d = r6
            r3.recycle()
            h.B r3 = new h.B
            m.c r6 = r1.f2841j
            r3.<init>(r0, r6)
            r1.e = r3
            r3 = 81
            r1.f2836c = r3
            goto L_0x00f2
        L_0x00e3:
            boolean r3 = r1.f2845n
            if (r3 == 0) goto L_0x00f2
            int r3 = r6.getChildCount()
            if (r3 <= 0) goto L_0x00f2
            h.B r3 = r1.e
            r3.removeAllViews()
        L_0x00f2:
            android.view.View r3 = r1.f2839g
            if (r3 == 0) goto L_0x00f9
            r1.f2838f = r3
            goto L_0x0155
        L_0x00f9:
            n.l r3 = r1.f2840h
            if (r3 != 0) goto L_0x00ff
            goto L_0x01d5
        L_0x00ff:
            h.u r3 = r0.f2898y
            if (r3 != 0) goto L_0x010b
            h.u r3 = new h.u
            r6 = 3
            r3.<init>(r0, r6)
            r0.f2898y = r3
        L_0x010b:
            h.u r3 = r0.f2898y
            n.h r6 = r1.i
            if (r6 != 0) goto L_0x0123
            n.h r6 = new n.h
            m.c r9 = r1.f2841j
            r6.<init>(r9)
            r1.i = r6
            r6.f3864j = r3
            n.l r3 = r1.f2840h
            android.content.Context r9 = r3.f3872a
            r3.b(r6, r9)
        L_0x0123:
            n.h r3 = r1.i
            h.B r6 = r1.e
            androidx.appcompat.view.menu.ExpandedMenuView r9 = r3.i
            if (r9 != 0) goto L_0x014f
            android.view.LayoutInflater r9 = r3.f3862g
            r10 = 2131492877(0x7f0c000d, float:1.8609218E38)
            android.view.View r6 = r9.inflate(r10, r6, r7)
            androidx.appcompat.view.menu.ExpandedMenuView r6 = (androidx.appcompat.view.menu.ExpandedMenuView) r6
            r3.i = r6
            n.g r6 = r3.f3865k
            if (r6 != 0) goto L_0x0143
            n.g r6 = new n.g
            r6.<init>(r3)
            r3.f3865k = r6
        L_0x0143:
            androidx.appcompat.view.menu.ExpandedMenuView r6 = r3.i
            n.g r9 = r3.f3865k
            r6.setAdapter(r9)
            androidx.appcompat.view.menu.ExpandedMenuView r6 = r3.i
            r6.setOnItemClickListener(r3)
        L_0x014f:
            androidx.appcompat.view.menu.ExpandedMenuView r3 = r3.i
            r1.f2838f = r3
            if (r3 == 0) goto L_0x01d5
        L_0x0155:
            android.view.View r3 = r1.f2838f
            if (r3 != 0) goto L_0x015b
            goto L_0x01d5
        L_0x015b:
            android.view.View r3 = r1.f2839g
            if (r3 == 0) goto L_0x0160
            goto L_0x0175
        L_0x0160:
            n.h r3 = r1.i
            n.g r6 = r3.f3865k
            if (r6 != 0) goto L_0x016d
            n.g r6 = new n.g
            r6.<init>(r3)
            r3.f3865k = r6
        L_0x016d:
            n.g r3 = r3.f3865k
            int r3 = r3.getCount()
            if (r3 <= 0) goto L_0x01d5
        L_0x0175:
            android.view.View r3 = r1.f2838f
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 != 0) goto L_0x0182
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r3.<init>(r8, r8)
        L_0x0182:
            int r6 = r1.f2835b
            h.B r9 = r1.e
            r9.setBackgroundResource(r6)
            android.view.View r6 = r1.f2838f
            android.view.ViewParent r6 = r6.getParent()
            boolean r9 = r6 instanceof android.view.ViewGroup
            if (r9 == 0) goto L_0x019a
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            android.view.View r9 = r1.f2838f
            r6.removeView(r9)
        L_0x019a:
            h.B r6 = r1.e
            android.view.View r9 = r1.f2838f
            r6.addView(r9, r3)
            android.view.View r3 = r1.f2838f
            boolean r3 = r3.hasFocus()
            if (r3 != 0) goto L_0x01ae
            android.view.View r3 = r1.f2838f
            r3.requestFocus()
        L_0x01ae:
            r10 = -2
        L_0x01af:
            r1.f2843l = r7
            android.view.WindowManager$LayoutParams r3 = new android.view.WindowManager$LayoutParams
            r13 = 0
            r14 = 1002(0x3ea, float:1.404E-42)
            r11 = -2
            r12 = 0
            r15 = 8519680(0x820000, float:1.1938615E-38)
            r16 = -3
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            int r6 = r1.f2836c
            r3.gravity = r6
            int r6 = r1.f2837d
            r3.windowAnimations = r6
            h.B r6 = r1.e
            r4.addView(r6, r3)
            r1.f2844m = r5
            if (r2 != 0) goto L_0x01d4
            r17.H()
        L_0x01d4:
            return
        L_0x01d5:
            r1.f2845n = r5
        L_0x01d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.D.D(h.C, android.view.KeyEvent):void");
    }

    public final boolean F(C c2, KeyEvent keyEvent) {
        boolean z2;
        int i;
        boolean z3;
        C0289l0 l0Var;
        C0289l0 l0Var2;
        C0289l0 l0Var3;
        Resources.Theme theme;
        C0289l0 l0Var4;
        if (this.f2872W) {
            return false;
        }
        if (c2.f2842k) {
            return true;
        }
        C c3 = this.f2868S;
        if (!(c3 == null || c3 == c2)) {
            q(c3, false);
        }
        Window.Callback callback = this.f2890q.getCallback();
        int i2 = c2.f2834a;
        if (callback != null) {
            c2.f2839g = callback.onCreatePanelView(i2);
        }
        if (i2 == 0 || i2 == 108) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && (l0Var4 = this.f2896w) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) l0Var4;
            actionBarOverlayLayout.k();
            ((f1) actionBarOverlayLayout.f1290j).f4197l = true;
        }
        if (c2.f2839g == null) {
            C0197l lVar = c2.f2840h;
            if (lVar == null || c2.f2846o) {
                if (lVar == null) {
                    Context context = this.f2889p;
                    if ((i2 == 0 || i2 == 108) && this.f2896w != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(2130968587, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(2130968588, typedValue, true);
                        } else {
                            theme2.resolveAttribute(2130968588, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            C0176c cVar = new C0176c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    C0197l lVar2 = new C0197l(context);
                    lVar2.e = this;
                    C0197l lVar3 = c2.f2840h;
                    if (lVar2 != lVar3) {
                        if (lVar3 != null) {
                            lVar3.r(c2.i);
                        }
                        c2.f2840h = lVar2;
                        C0193h hVar = c2.i;
                        if (hVar != null) {
                            lVar2.b(hVar, lVar2.f3872a);
                        }
                    }
                    if (c2.f2840h == null) {
                        return false;
                    }
                }
                if (z2 && (l0Var3 = this.f2896w) != null) {
                    if (this.f2897x == null) {
                        this.f2897x = new u(this, 2);
                    }
                    ((ActionBarOverlayLayout) l0Var3).l(c2.f2840h, this.f2897x);
                }
                c2.f2840h.w();
                if (!callback.onCreatePanelMenu(i2, c2.f2840h)) {
                    C0197l lVar4 = c2.f2840h;
                    if (lVar4 != null) {
                        if (lVar4 != null) {
                            lVar4.r(c2.i);
                        }
                        c2.f2840h = null;
                    }
                    if (z2 && (l0Var2 = this.f2896w) != null) {
                        ((ActionBarOverlayLayout) l0Var2).l((C0197l) null, this.f2897x);
                    }
                    return false;
                }
                c2.f2846o = false;
            }
            c2.f2840h.w();
            Bundle bundle = c2.f2847p;
            if (bundle != null) {
                c2.f2840h.s(bundle);
                c2.f2847p = null;
            }
            if (!callback.onPreparePanel(0, c2.f2839g, c2.f2840h)) {
                if (z2 && (l0Var = this.f2896w) != null) {
                    ((ActionBarOverlayLayout) l0Var).l((C0197l) null, this.f2897x);
                }
                c2.f2840h.v();
                return false;
            }
            if (keyEvent != null) {
                i = keyEvent.getDeviceId();
            } else {
                i = -1;
            }
            if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            c2.f2840h.setQwertyMode(z3);
            c2.f2840h.v();
        }
        c2.f2842k = true;
        c2.f2843l = false;
        this.f2868S = c2;
        return true;
    }

    public final void G() {
        if (this.f2856F) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f2887l0 != null && (y(0).f2844m || this.f2899z != null)) {
                z2 = true;
            }
            if (z2 && this.m0 == null) {
                this.m0 = y.b(this.f2887l0, this);
            } else if (!z2 && (onBackInvokedCallback = this.m0) != null) {
                y.c(this.f2887l0, onBackInvokedCallback);
                this.m0 = null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f2888o
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = h.s.f3034m
            monitor-enter(r0)
            h.s.e(r3)     // Catch:{ all -> 0x000e }
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            goto L_0x0011
        L_0x000e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            throw r1
        L_0x0011:
            boolean r0 = r3.f2880e0
            if (r0 == 0) goto L_0x0020
            android.view.Window r0 = r3.f2890q
            android.view.View r0 = r0.getDecorView()
            h.t r1 = r3.f2882g0
            r0.removeCallbacks(r1)
        L_0x0020:
            r0 = 1
            r3.f2872W = r0
            int r0 = r3.f2874Y
            r1 = -100
            if (r0 == r1) goto L_0x004d
            java.lang.Object r0 = r3.f2888o
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x004d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x004d
            r.k r0 = f2848n0
            java.lang.Object r1 = r3.f2888o
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f2874Y
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x005c
        L_0x004d:
            r.k r0 = f2848n0
            java.lang.Object r1 = r3.f2888o
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x005c:
            h.A r0 = r3.f2878c0
            if (r0 == 0) goto L_0x0063
            r0.c()
        L_0x0063:
            h.A r0 = r3.f2879d0
            if (r0 == 0) goto L_0x006a
            r0.c()
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.D.c():void");
    }

    public final boolean d(C0197l lVar, MenuItem menuItem) {
        int i;
        C c2;
        Window.Callback callback = this.f2890q.getCallback();
        if (callback != null && !this.f2872W) {
            C0197l k2 = lVar.k();
            C[] cArr = this.f2867R;
            if (cArr != null) {
                i = cArr.length;
            } else {
                i = 0;
            }
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    c2 = cArr[i2];
                    if (c2 != null && c2.f2840h == k2) {
                        break;
                    }
                    i2++;
                } else {
                    c2 = null;
                    break;
                }
            }
            if (c2 != null) {
                return callback.onMenuItemSelected(c2.f2834a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r6.i() != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(n.C0197l r6) {
        /*
            r5 = this;
            o.l0 r6 = r5.f2896w
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L_0x00e8
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            o.m0 r6 = r6.f1290j
            o.f1 r6 = (o.f1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f4188a
            int r2 = r6.getVisibility()
            if (r2 != 0) goto L_0x00e8
            androidx.appcompat.widget.ActionMenuView r6 = r6.f1396f
            if (r6 == 0) goto L_0x00e8
            boolean r6 = r6.f1315x
            if (r6 == 0) goto L_0x00e8
            android.content.Context r6 = r5.f2889p
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L_0x004a
            o.l0 r6 = r5.f2896w
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            o.m0 r6 = r6.f1290j
            o.f1 r6 = (o.f1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f4188a
            androidx.appcompat.widget.ActionMenuView r6 = r6.f1396f
            if (r6 == 0) goto L_0x00e8
            o.k r6 = r6.f1316y
            if (r6 == 0) goto L_0x00e8
            o.i r2 = r6.f4260z
            if (r2 != 0) goto L_0x004a
            boolean r6 = r6.i()
            if (r6 == 0) goto L_0x00e8
        L_0x004a:
            android.view.Window r6 = r5.f2890q
            android.view.Window$Callback r6 = r6.getCallback()
            o.l0 r2 = r5.f2896w
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.k()
            o.m0 r2 = r2.f1290j
            o.f1 r2 = (o.f1) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f4188a
            androidx.appcompat.widget.ActionMenuView r2 = r2.f1396f
            if (r2 == 0) goto L_0x006d
            o.k r2 = r2.f1316y
            if (r2 == 0) goto L_0x006d
            boolean r2 = r2.i()
            if (r2 == 0) goto L_0x006d
            r2 = 1
            goto L_0x006e
        L_0x006d:
            r2 = 0
        L_0x006e:
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L_0x0099
            o.l0 r1 = r5.f2896w
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = (androidx.appcompat.widget.ActionBarOverlayLayout) r1
            r1.k()
            o.m0 r1 = r1.f1290j
            o.f1 r1 = (o.f1) r1
            androidx.appcompat.widget.Toolbar r1 = r1.f4188a
            androidx.appcompat.widget.ActionMenuView r1 = r1.f1396f
            if (r1 == 0) goto L_0x008b
            o.k r1 = r1.f1316y
            if (r1 == 0) goto L_0x008b
            boolean r1 = r1.e()
        L_0x008b:
            boolean r1 = r5.f2872W
            if (r1 != 0) goto L_0x00f5
            h.C r0 = r5.y(r0)
            n.l r0 = r0.f2840h
            r6.onPanelClosed(r3, r0)
            goto L_0x00f5
        L_0x0099:
            if (r6 == 0) goto L_0x00f5
            boolean r2 = r5.f2872W
            if (r2 != 0) goto L_0x00f5
            boolean r2 = r5.f2880e0
            if (r2 == 0) goto L_0x00b6
            int r2 = r5.f2881f0
            r1 = r1 & r2
            if (r1 == 0) goto L_0x00b6
            android.view.Window r1 = r5.f2890q
            android.view.View r1 = r1.getDecorView()
            h.t r2 = r5.f2882g0
            r1.removeCallbacks(r2)
            r2.run()
        L_0x00b6:
            h.C r1 = r5.y(r0)
            n.l r2 = r1.f2840h
            if (r2 == 0) goto L_0x00f5
            boolean r4 = r1.f2846o
            if (r4 != 0) goto L_0x00f5
            android.view.View r4 = r1.f2839g
            boolean r0 = r6.onPreparePanel(r0, r4, r2)
            if (r0 == 0) goto L_0x00f5
            n.l r0 = r1.f2840h
            r6.onMenuOpened(r3, r0)
            o.l0 r6 = r5.f2896w
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            o.m0 r6 = r6.f1290j
            o.f1 r6 = (o.f1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f4188a
            androidx.appcompat.widget.ActionMenuView r6 = r6.f1396f
            if (r6 == 0) goto L_0x00f5
            o.k r6 = r6.f1316y
            if (r6 == 0) goto L_0x00f5
            r6.l()
            goto L_0x00f5
        L_0x00e8:
            h.C r6 = r5.y(r0)
            r6.f2845n = r1
            r5.q(r6, r0)
            r0 = 0
            r5.D(r6, r0)
        L_0x00f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.D.f(n.l):void");
    }

    public final boolean g(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.f2865P && i == 108) {
            return false;
        }
        if (this.f2861L && i == 1) {
            this.f2861L = false;
        }
        if (i == 1) {
            G();
            this.f2865P = true;
            return true;
        } else if (i == 2) {
            G();
            this.f2859J = true;
            return true;
        } else if (i == 5) {
            G();
            this.f2860K = true;
            return true;
        } else if (i == 10) {
            G();
            this.f2863N = true;
            return true;
        } else if (i == 108) {
            G();
            this.f2861L = true;
            return true;
        } else if (i != 109) {
            return this.f2890q.requestFeature(i);
        } else {
            G();
            this.f2862M = true;
            return true;
        }
    }

    public final void k(CharSequence charSequence) {
        this.f2895v = charSequence;
        C0289l0 l0Var = this.f2896w;
        if (l0Var != null) {
            l0Var.setWindowTitle(charSequence);
            return;
        }
        N n2 = this.f2893t;
        if (n2 != null) {
            f1 f1Var = (f1) n2.f2938p;
            if (!f1Var.f4193g) {
                f1Var.f4194h = charSequence;
                if ((f1Var.f4189b & 8) != 0) {
                    Toolbar toolbar = f1Var.f4188a;
                    toolbar.setTitle(charSequence);
                    if (f1Var.f4193g) {
                        Q.q(toolbar.getRootView(), charSequence);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = this.f2858H;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01d9 A[SYNTHETIC, Splitter:B:138:0x01d9] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0207 A[SYNTHETIC, Splitter:B:159:0x0207] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00fd A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean l(boolean r17, boolean r18) {
        /*
            r16 = this;
            r1 = r16
            boolean r0 = r1.f2872W
            r2 = 0
            if (r0 == 0) goto L_0x0008
            return r2
        L_0x0008:
            int r0 = r1.f2874Y
            r3 = -100
            if (r0 == r3) goto L_0x0010
        L_0x000e:
            r3 = r0
            goto L_0x0013
        L_0x0010:
            int r0 = h.s.f3029g
            goto L_0x000e
        L_0x0013:
            android.content.Context r4 = r1.f2889p
            int r0 = r1.B(r4, r3)
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 33
            r7 = 0
            if (r5 >= r6) goto L_0x0025
            J.f r6 = n(r4)
            goto L_0x0026
        L_0x0025:
            r6 = r7
        L_0x0026:
            if (r18 != 0) goto L_0x0036
            if (r6 == 0) goto L_0x0036
            android.content.res.Resources r6 = r4.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            J.f r6 = x(r6)
        L_0x0036:
            android.content.res.Configuration r0 = r(r4, r0, r6, r7, r2)
            boolean r8 = r1.f2877b0
            java.lang.Object r9 = r1.f2888o
            r10 = 24
            r11 = 1
            if (r8 != 0) goto L_0x0072
            boolean r8 = r9 instanceof android.app.Activity
            if (r8 == 0) goto L_0x0072
            android.content.pm.PackageManager r8 = r4.getPackageManager()
            if (r8 != 0) goto L_0x004f
            r5 = 0
            goto L_0x0076
        L_0x004f:
            r12 = 29
            if (r5 < r12) goto L_0x0056
            r5 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L_0x005c
        L_0x0056:
            if (r5 < r10) goto L_0x005b
            r5 = 786432(0xc0000, float:1.102026E-39)
            goto L_0x005c
        L_0x005b:
            r5 = 0
        L_0x005c:
            android.content.ComponentName r12 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0070 }
            java.lang.Class r13 = r9.getClass()     // Catch:{ NameNotFoundException -> 0x0070 }
            r12.<init>(r4, r13)     // Catch:{ NameNotFoundException -> 0x0070 }
            android.content.pm.ActivityInfo r5 = r8.getActivityInfo(r12, r5)     // Catch:{ NameNotFoundException -> 0x0070 }
            if (r5 == 0) goto L_0x0072
            int r5 = r5.configChanges     // Catch:{ NameNotFoundException -> 0x0070 }
            r1.f2876a0 = r5     // Catch:{ NameNotFoundException -> 0x0070 }
            goto L_0x0072
        L_0x0070:
            r1.f2876a0 = r2
        L_0x0072:
            r1.f2877b0 = r11
            int r5 = r1.f2876a0
        L_0x0076:
            android.content.res.Configuration r8 = r1.f2873X
            if (r8 != 0) goto L_0x0082
            android.content.res.Resources r8 = r4.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
        L_0x0082:
            int r12 = r8.uiMode
            r12 = r12 & 48
            int r13 = r0.uiMode
            r13 = r13 & 48
            J.f r8 = x(r8)
            if (r6 != 0) goto L_0x0092
            r6 = r7
            goto L_0x0096
        L_0x0092:
            J.f r6 = x(r0)
        L_0x0096:
            if (r12 == r13) goto L_0x009b
            r12 = 512(0x200, float:7.175E-43)
            goto L_0x009c
        L_0x009b:
            r12 = 0
        L_0x009c:
            if (r6 == 0) goto L_0x00a6
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L_0x00a6
            r12 = r12 | 8196(0x2004, float:1.1485E-41)
        L_0x00a6:
            int r8 = ~r5
            r8 = r8 & r12
            r14 = 28
            if (r8 == 0) goto L_0x00fa
            if (r17 == 0) goto L_0x00fa
            boolean r8 = r1.f2870U
            if (r8 == 0) goto L_0x00fa
            boolean r8 = f2850p0
            if (r8 != 0) goto L_0x00ba
            boolean r8 = r1.f2871V
            if (r8 == 0) goto L_0x00fa
        L_0x00ba:
            boolean r8 = r9 instanceof android.app.Activity
            if (r8 == 0) goto L_0x00fa
            r8 = r9
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r15 = r8.isChild()
            if (r15 != 0) goto L_0x00fa
            int r15 = android.os.Build.VERSION.SDK_INT
            r11 = 31
            if (r15 < r11) goto L_0x00e0
            r11 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x00e0
            android.view.Window r11 = r8.getWindow()
            android.view.View r11 = r11.getDecorView()
            int r0 = r0.getLayoutDirection()
            r11.setLayoutDirection(r0)
        L_0x00e0:
            if (r15 < r14) goto L_0x00e6
            r8.recreate()
            goto L_0x00f8
        L_0x00e6:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r11 = r8.getMainLooper()
            r0.<init>(r11)
            C.a r11 = new C.a
            r15 = 0
            r11.<init>((int) r15, (java.lang.Object) r8)
            r0.post(r11)
        L_0x00f8:
            r0 = 1
            goto L_0x00fb
        L_0x00fa:
            r0 = 0
        L_0x00fb:
            if (r0 != 0) goto L_0x025f
            if (r12 == 0) goto L_0x025f
            r0 = r12 & r5
            if (r0 != r12) goto L_0x0105
            r5 = 1
            goto L_0x0106
        L_0x0105:
            r5 = 0
        L_0x0106:
            android.content.res.Resources r8 = r4.getResources()
            android.content.res.Configuration r11 = new android.content.res.Configuration
            android.content.res.Configuration r0 = r8.getConfiguration()
            r11.<init>(r0)
            android.content.res.Configuration r0 = r8.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & -49
            r0 = r0 | r13
            r11.uiMode = r0
            if (r6 == 0) goto L_0x0138
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r10) goto L_0x0128
            h.x.d(r11, r6)
            goto L_0x0138
        L_0x0128:
            J.h r0 = r6.f294a
            java.util.Locale r13 = r0.get(r2)
            r11.setLocale(r13)
            java.util.Locale r0 = r0.get(r2)
            r11.setLayoutDirection(r0)
        L_0x0138:
            r8.updateConfiguration(r11, r7)
            int r0 = android.os.Build.VERSION.SDK_INT
            r13 = 26
            r15 = 23
            if (r0 >= r13) goto L_0x0219
            if (r0 < r14) goto L_0x0147
            goto L_0x0219
        L_0x0147:
            java.lang.String r13 = "mDrawableCache"
            java.lang.Class<android.content.res.Resources> r14 = android.content.res.Resources.class
            java.lang.String r7 = "ResourcesFlusher"
            if (r0 < r10) goto L_0x01b7
            boolean r0 = T0.g.f936h
            if (r0 != 0) goto L_0x016a
            java.lang.String r0 = "mResourcesImpl"
            java.lang.reflect.Field r0 = r14.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0161 }
            T0.g.f935g = r0     // Catch:{ NoSuchFieldException -> 0x0161 }
            r14 = 1
            r0.setAccessible(r14)     // Catch:{ NoSuchFieldException -> 0x0161 }
        L_0x015f:
            r14 = 1
            goto L_0x0168
        L_0x0161:
            r0 = move-exception
            java.lang.String r14 = "Could not retrieve Resources#mResourcesImpl field"
            android.util.Log.e(r7, r14, r0)
            goto L_0x015f
        L_0x0168:
            T0.g.f936h = r14
        L_0x016a:
            java.lang.reflect.Field r0 = T0.g.f935g
            if (r0 != 0) goto L_0x0170
            goto L_0x0219
        L_0x0170:
            java.lang.Object r0 = r0.get(r8)     // Catch:{ IllegalAccessException -> 0x0176 }
            r8 = r0
            goto L_0x017e
        L_0x0176:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Could not retrieve value from Resources#mResourcesImpl"
            android.util.Log.e(r7, r0, r8)
            r8 = 0
        L_0x017e:
            if (r8 != 0) goto L_0x0182
            goto L_0x0219
        L_0x0182:
            boolean r0 = T0.g.f931b
            if (r0 != 0) goto L_0x019f
            java.lang.Class r0 = r8.getClass()     // Catch:{ NoSuchFieldException -> 0x0196 }
            java.lang.reflect.Field r0 = r0.getDeclaredField(r13)     // Catch:{ NoSuchFieldException -> 0x0196 }
            T0.g.f930a = r0     // Catch:{ NoSuchFieldException -> 0x0196 }
            r13 = 1
            r0.setAccessible(r13)     // Catch:{ NoSuchFieldException -> 0x0196 }
        L_0x0194:
            r13 = 1
            goto L_0x019d
        L_0x0196:
            r0 = move-exception
            java.lang.String r13 = "Could not retrieve ResourcesImpl#mDrawableCache field"
            android.util.Log.e(r7, r13, r0)
            goto L_0x0194
        L_0x019d:
            T0.g.f931b = r13
        L_0x019f:
            java.lang.reflect.Field r0 = T0.g.f930a
            if (r0 == 0) goto L_0x01af
            java.lang.Object r7 = r0.get(r8)     // Catch:{ IllegalAccessException -> 0x01a8 }
            goto L_0x01b0
        L_0x01a8:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Could not retrieve value from ResourcesImpl#mDrawableCache"
            android.util.Log.e(r7, r0, r8)
        L_0x01af:
            r7 = 0
        L_0x01b0:
            if (r7 == 0) goto L_0x0219
            T0.g.m(r7)
            goto L_0x0219
        L_0x01b7:
            java.lang.String r2 = "Could not retrieve value from Resources#mDrawableCache"
            java.lang.String r10 = "Could not retrieve Resources#mDrawableCache field"
            if (r0 < r15) goto L_0x01eb
            boolean r0 = T0.g.f931b
            if (r0 != 0) goto L_0x01d5
            java.lang.reflect.Field r0 = r14.getDeclaredField(r13)     // Catch:{ NoSuchFieldException -> 0x01ce }
            T0.g.f930a = r0     // Catch:{ NoSuchFieldException -> 0x01ce }
            r13 = 1
            r0.setAccessible(r13)     // Catch:{ NoSuchFieldException -> 0x01cc }
            goto L_0x01d3
        L_0x01cc:
            r0 = move-exception
            goto L_0x01d0
        L_0x01ce:
            r0 = move-exception
            r13 = 1
        L_0x01d0:
            android.util.Log.e(r7, r10, r0)
        L_0x01d3:
            T0.g.f931b = r13
        L_0x01d5:
            java.lang.reflect.Field r0 = T0.g.f930a
            if (r0 == 0) goto L_0x01e3
            java.lang.Object r7 = r0.get(r8)     // Catch:{ IllegalAccessException -> 0x01de }
            goto L_0x01e4
        L_0x01de:
            r0 = move-exception
            r8 = r0
            android.util.Log.e(r7, r2, r8)
        L_0x01e3:
            r7 = 0
        L_0x01e4:
            if (r7 != 0) goto L_0x01e7
            goto L_0x0219
        L_0x01e7:
            T0.g.m(r7)
            goto L_0x0219
        L_0x01eb:
            boolean r0 = T0.g.f931b
            if (r0 != 0) goto L_0x0203
            java.lang.reflect.Field r0 = r14.getDeclaredField(r13)     // Catch:{ NoSuchFieldException -> 0x01fc }
            T0.g.f930a = r0     // Catch:{ NoSuchFieldException -> 0x01fc }
            r13 = 1
            r0.setAccessible(r13)     // Catch:{ NoSuchFieldException -> 0x01fa }
            goto L_0x0201
        L_0x01fa:
            r0 = move-exception
            goto L_0x01fe
        L_0x01fc:
            r0 = move-exception
            r13 = 1
        L_0x01fe:
            android.util.Log.e(r7, r10, r0)
        L_0x0201:
            T0.g.f931b = r13
        L_0x0203:
            java.lang.reflect.Field r0 = T0.g.f930a
            if (r0 == 0) goto L_0x0219
            java.lang.Object r0 = r0.get(r8)     // Catch:{ IllegalAccessException -> 0x020f }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ IllegalAccessException -> 0x020f }
            r7 = r0
            goto L_0x0214
        L_0x020f:
            r0 = move-exception
            android.util.Log.e(r7, r2, r0)
            r7 = 0
        L_0x0214:
            if (r7 == 0) goto L_0x0219
            r7.clear()
        L_0x0219:
            int r0 = r1.f2875Z
            if (r0 == 0) goto L_0x022f
            r4.setTheme(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r15) goto L_0x022f
            android.content.res.Resources$Theme r0 = r4.getTheme()
            int r2 = r1.f2875Z
            r7 = 1
            r0.applyStyle(r2, r7)
            goto L_0x0230
        L_0x022f:
            r7 = 1
        L_0x0230:
            if (r5 == 0) goto L_0x025d
            boolean r0 = r9 instanceof android.app.Activity
            if (r0 == 0) goto L_0x025d
            r0 = r9
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r0 instanceof androidx.lifecycle.r
            if (r2 == 0) goto L_0x0252
            r2 = r0
            androidx.lifecycle.r r2 = (androidx.lifecycle.r) r2
            androidx.lifecycle.t r2 = r2.d()
            androidx.lifecycle.m r2 = r2.f1841c
            androidx.lifecycle.m r5 = androidx.lifecycle.C0078m.f1833c
            int r2 = r2.compareTo(r5)
            if (r2 < 0) goto L_0x025d
            r0.onConfigurationChanged(r11)
            goto L_0x025d
        L_0x0252:
            boolean r2 = r1.f2871V
            if (r2 == 0) goto L_0x025d
            boolean r2 = r1.f2872W
            if (r2 != 0) goto L_0x025d
            r0.onConfigurationChanged(r11)
        L_0x025d:
            r11 = 1
            goto L_0x0260
        L_0x025f:
            r11 = r0
        L_0x0260:
            if (r11 == 0) goto L_0x0273
            boolean r0 = r9 instanceof h.C0121l
            if (r0 == 0) goto L_0x0273
            r0 = r12 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x026d
            r0 = r9
            h.l r0 = (h.C0121l) r0
        L_0x026d:
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0273
            h.l r9 = (h.C0121l) r9
        L_0x0273:
            if (r6 == 0) goto L_0x0295
            android.content.res.Resources r0 = r4.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            J.f r0 = x(r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 24
            if (r2 < r5) goto L_0x028b
            h.x.c(r0)
            goto L_0x0295
        L_0x028b:
            J.h r0 = r0.f294a
            r2 = 0
            java.util.Locale r0 = r0.get(r2)
            java.util.Locale.setDefault(r0)
        L_0x0295:
            if (r3 != 0) goto L_0x029f
            androidx.fragment.app.g r0 = r1.w(r4)
            r0.i()
            goto L_0x02a6
        L_0x029f:
            h.A r0 = r1.f2878c0
            if (r0 == 0) goto L_0x02a6
            r0.c()
        L_0x02a6:
            r0 = 3
            if (r3 != r0) goto L_0x02ba
            h.A r0 = r1.f2879d0
            if (r0 != 0) goto L_0x02b4
            h.A r0 = new h.A
            r0.<init>((h.D) r1, (android.content.Context) r4)
            r1.f2879d0 = r0
        L_0x02b4:
            h.A r0 = r1.f2879d0
            r0.i()
            goto L_0x02c1
        L_0x02ba:
            h.A r0 = r1.f2879d0
            if (r0 == 0) goto L_0x02c1
            r0.c()
        L_0x02c1:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: h.D.l(boolean, boolean):boolean");
    }

    public final void m(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f2890q == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof z)) {
                z zVar = new z(this, callback);
                this.f2891r = zVar;
                window.setCallback(zVar);
                int[] iArr = f2849o0;
                Context context = this.f2889p;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
                if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
                    drawable = null;
                } else {
                    C0302s a2 = C0302s.a();
                    synchronized (a2) {
                        drawable = a2.f4296a.g(context, resourceId, true);
                    }
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f2890q = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f2887l0) == null) {
                    if (!(onBackInvokedDispatcher == null || (onBackInvokedCallback = this.m0) == null)) {
                        y.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.m0 = null;
                    }
                    Object obj = this.f2888o;
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.f2887l0 = y.a(activity);
                            H();
                            return;
                        }
                    }
                    this.f2887l0 = null;
                    H();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX INFO: finally extract failed */
    public final void o(int i, C c2, C0197l lVar) {
        if (lVar == null) {
            if (c2 == null && i >= 0) {
                C[] cArr = this.f2867R;
                if (i < cArr.length) {
                    c2 = cArr[i];
                }
            }
            if (c2 != null) {
                lVar = c2.f2840h;
            }
        }
        if ((c2 == null || c2.f2844m) && !this.f2872W) {
            z zVar = this.f2891r;
            Window.Callback callback = this.f2890q.getCallback();
            zVar.getClass();
            try {
                zVar.i = true;
                callback.onPanelClosed(i, lVar);
                zVar.i = false;
            } catch (Throwable th) {
                zVar.i = false;
                throw th;
            }
        }
    }

    public final void p(C0197l lVar) {
        C0286k kVar;
        if (!this.f2866Q) {
            this.f2866Q = true;
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f2896w;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((f1) actionBarOverlayLayout.f1290j).f4188a.f1396f;
            if (!(actionMenuView == null || (kVar = actionMenuView.f1316y) == null)) {
                kVar.e();
                C0278g gVar = kVar.f4259y;
                if (gVar != null && gVar.b()) {
                    gVar.i.dismiss();
                }
            }
            Window.Callback callback = this.f2890q.getCallback();
            if (callback != null && !this.f2872W) {
                callback.onPanelClosed(108, lVar);
            }
            this.f2866Q = false;
        }
    }

    public final void q(C c2, boolean z2) {
        B b2;
        C0289l0 l0Var;
        C0286k kVar;
        if (z2 && c2.f2834a == 0 && (l0Var = this.f2896w) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) l0Var;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((f1) actionBarOverlayLayout.f1290j).f4188a.f1396f;
            if (!(actionMenuView == null || (kVar = actionMenuView.f1316y) == null || !kVar.i())) {
                p(c2.f2840h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f2889p.getSystemService("window");
        if (!(windowManager == null || !c2.f2844m || (b2 = c2.e) == null)) {
            windowManager.removeView(b2);
            if (z2) {
                o(c2.f2834a, c2, (C0197l) null);
            }
        }
        c2.f2842k = false;
        c2.f2843l = false;
        c2.f2844m = false;
        c2.f2838f = null;
        c2.f2845n = true;
        if (this.f2868S == c2) {
            this.f2868S = null;
        }
        if (c2.f2834a == 0) {
            H();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00db, code lost:
        if (r7.e() != false) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0101, code lost:
        if (r7.l() != false) goto L_0x0122;
     */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean s(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f2888o
            boolean r1 = r0 instanceof N.C0011k
            r2 = 1
            if (r1 != 0) goto L_0x000b
            boolean r0 = r0 instanceof h.C0118i
            if (r0 == 0) goto L_0x001a
        L_0x000b:
            android.view.Window r0 = r6.f2890q
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001a
            boolean r0 = p0.C0320a.B(r0, r7)
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            int r0 = r7.getKeyCode()
            r1 = 0
            r3 = 82
            if (r0 != r3) goto L_0x003d
            h.z r0 = r6.f2891r
            android.view.Window r4 = r6.f2890q
            android.view.Window$Callback r4 = r4.getCallback()
            r0.getClass()
            r0.f3044h = r2     // Catch:{ all -> 0x0039 }
            boolean r4 = r4.dispatchKeyEvent(r7)     // Catch:{ all -> 0x0039 }
            r0.f3044h = r1
            if (r4 == 0) goto L_0x003d
            return r2
        L_0x0039:
            r7 = move-exception
            r0.f3044h = r1
            throw r7
        L_0x003d:
            int r0 = r7.getKeyCode()
            int r4 = r7.getAction()
            r5 = 4
            if (r4 != 0) goto L_0x006f
            if (r0 == r5) goto L_0x0060
            if (r0 == r3) goto L_0x004d
            goto L_0x006c
        L_0x004d:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x014c
            h.C r0 = r6.y(r1)
            boolean r1 = r0.f2844m
            if (r1 != 0) goto L_0x014c
            r6.F(r0, r7)
            goto L_0x014c
        L_0x0060:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r2 = 0
        L_0x006a:
            r6.f2869T = r2
        L_0x006c:
            r2 = 0
            goto L_0x014c
        L_0x006f:
            if (r0 == r5) goto L_0x0146
            if (r0 == r3) goto L_0x0074
            goto L_0x006c
        L_0x0074:
            m.a r0 = r6.f2899z
            if (r0 == 0) goto L_0x007a
            goto L_0x014c
        L_0x007a:
            h.C r0 = r6.y(r1)
            o.l0 r3 = r6.f2896w
            android.content.Context r4 = r6.f2889p
            if (r3 == 0) goto L_0x0104
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = (androidx.appcompat.widget.ActionBarOverlayLayout) r3
            r3.k()
            o.m0 r3 = r3.f1290j
            o.f1 r3 = (o.f1) r3
            androidx.appcompat.widget.Toolbar r3 = r3.f4188a
            int r5 = r3.getVisibility()
            if (r5 != 0) goto L_0x0104
            androidx.appcompat.widget.ActionMenuView r3 = r3.f1396f
            if (r3 == 0) goto L_0x0104
            boolean r3 = r3.f1315x
            if (r3 == 0) goto L_0x0104
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r4)
            boolean r3 = r3.hasPermanentMenuKey()
            if (r3 != 0) goto L_0x0104
            o.l0 r3 = r6.f2896w
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = (androidx.appcompat.widget.ActionBarOverlayLayout) r3
            r3.k()
            o.m0 r3 = r3.f1290j
            o.f1 r3 = (o.f1) r3
            androidx.appcompat.widget.Toolbar r3 = r3.f4188a
            androidx.appcompat.widget.ActionMenuView r3 = r3.f1396f
            if (r3 == 0) goto L_0x00de
            o.k r3 = r3.f1316y
            if (r3 == 0) goto L_0x00de
            boolean r3 = r3.i()
            if (r3 == 0) goto L_0x00de
            o.l0 r7 = r6.f2896w
            androidx.appcompat.widget.ActionBarOverlayLayout r7 = (androidx.appcompat.widget.ActionBarOverlayLayout) r7
            r7.k()
            o.m0 r7 = r7.f1290j
            o.f1 r7 = (o.f1) r7
            androidx.appcompat.widget.Toolbar r7 = r7.f4188a
            androidx.appcompat.widget.ActionMenuView r7 = r7.f1396f
            if (r7 == 0) goto L_0x0124
            o.k r7 = r7.f1316y
            if (r7 == 0) goto L_0x0124
            boolean r7 = r7.e()
            if (r7 == 0) goto L_0x0124
        L_0x00dd:
            goto L_0x0122
        L_0x00de:
            boolean r3 = r6.f2872W
            if (r3 != 0) goto L_0x0124
            boolean r7 = r6.F(r0, r7)
            if (r7 == 0) goto L_0x0124
            o.l0 r7 = r6.f2896w
            androidx.appcompat.widget.ActionBarOverlayLayout r7 = (androidx.appcompat.widget.ActionBarOverlayLayout) r7
            r7.k()
            o.m0 r7 = r7.f1290j
            o.f1 r7 = (o.f1) r7
            androidx.appcompat.widget.Toolbar r7 = r7.f4188a
            androidx.appcompat.widget.ActionMenuView r7 = r7.f1396f
            if (r7 == 0) goto L_0x0124
            o.k r7 = r7.f1316y
            if (r7 == 0) goto L_0x0124
            boolean r7 = r7.l()
            if (r7 == 0) goto L_0x0124
            goto L_0x00dd
        L_0x0104:
            boolean r3 = r0.f2844m
            if (r3 != 0) goto L_0x0126
            boolean r5 = r0.f2843l
            if (r5 == 0) goto L_0x010d
            goto L_0x0126
        L_0x010d:
            boolean r3 = r0.f2842k
            if (r3 == 0) goto L_0x0124
            boolean r3 = r0.f2846o
            if (r3 == 0) goto L_0x011c
            r0.f2842k = r1
            boolean r3 = r6.F(r0, r7)
            goto L_0x011d
        L_0x011c:
            r3 = 1
        L_0x011d:
            if (r3 == 0) goto L_0x0124
            r6.D(r0, r7)
        L_0x0122:
            r7 = 1
            goto L_0x012a
        L_0x0124:
            r7 = 0
            goto L_0x012a
        L_0x0126:
            r6.q(r0, r2)
            r7 = r3
        L_0x012a:
            if (r7 == 0) goto L_0x014c
            android.content.Context r7 = r4.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L_0x013e
            r7.playSoundEffect(r1)
            goto L_0x014c
        L_0x013e:
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r7, r0)
            goto L_0x014c
        L_0x0146:
            boolean r7 = r6.C()
            if (r7 == 0) goto L_0x006c
        L_0x014c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h.D.s(android.view.KeyEvent):boolean");
    }

    public final void v() {
        if (this.f2890q == null) {
            Object obj = this.f2888o;
            if (obj instanceof Activity) {
                m(((Activity) obj).getWindow());
            }
        }
        if (this.f2890q == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final C0053g w(Context context) {
        if (this.f2878c0 == null) {
            if (t.f1129f == null) {
                Context applicationContext = context.getApplicationContext();
                t.f1129f = new t(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f2878c0 = new C0109A(this, t.f1129f);
        }
        return this.f2878c0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: h.C[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: h.C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: h.C[]} */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, h.C] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final h.C y(int r5) {
        /*
            r4 = this;
            h.C[] r0 = r4.f2867R
            r1 = 0
            if (r0 == 0) goto L_0x0008
            int r2 = r0.length
            if (r2 > r5) goto L_0x0015
        L_0x0008:
            int r2 = r5 + 1
            h.C[] r2 = new h.C[r2]
            if (r0 == 0) goto L_0x0012
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
        L_0x0012:
            r4.f2867R = r2
            r0 = r2
        L_0x0015:
            r2 = r0[r5]
            if (r2 != 0) goto L_0x0024
            h.C r2 = new h.C
            r2.<init>()
            r2.f2834a = r5
            r2.f2845n = r1
            r0[r5] = r2
        L_0x0024:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h.D.y(int):h.C");
    }

    public D(Context context, Window window, C0122m mVar, Object obj) {
        C0121l lVar;
        this.f2889p = context;
        this.f2888o = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof C0121l)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        lVar = (C0121l) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            lVar = null;
            if (lVar != null) {
                this.f2874Y = ((D) lVar.k()).f2874Y;
            }
        }
        if (this.f2874Y == -100) {
            k kVar = f2848n0;
            Integer num = (Integer) kVar.getOrDefault(this.f2888o.getClass().getName(), (Object) null);
            if (num != null) {
                this.f2874Y = num.intValue();
                kVar.remove(this.f2888o.getClass().getName());
            }
        }
        if (window != null) {
            m(window);
        }
        C0302s.d();
    }

    public final boolean E(C c2, int i, KeyEvent keyEvent) {
        C0197l lVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c2.f2842k || F(c2, keyEvent)) && (lVar = c2.f2840h) != null) {
            return lVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final void h(int i) {
        u();
        ViewGroup viewGroup = (ViewGroup) this.f2857G.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2889p).inflate(i, viewGroup);
        this.f2891r.a(this.f2890q.getCallback());
    }

    public final void i(View view) {
        u();
        ViewGroup viewGroup = (ViewGroup) this.f2857G.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2891r.a(this.f2890q.getCallback());
    }

    public final void j(View view, ViewGroup.LayoutParams layoutParams) {
        u();
        ViewGroup viewGroup = (ViewGroup) this.f2857G.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2891r.a(this.f2890q.getCallback());
    }

    public final void t(int i) {
        C y2 = y(i);
        if (y2.f2840h != null) {
            Bundle bundle = new Bundle();
            y2.f2840h.t(bundle);
            if (bundle.size() > 0) {
                y2.f2847p = bundle;
            }
            y2.f2840h.w();
            y2.f2840h.clear();
        }
        y2.f2846o = true;
        y2.f2845n = true;
        if ((i == 108 || i == 0) && this.f2896w != null) {
            C y3 = y(0);
            y3.f2842k = false;
            F(y3, (KeyEvent) null);
        }
    }

    public final void z() {
        int i;
        u();
        if (this.f2861L && this.f2893t == null) {
            Object obj = this.f2888o;
            if (obj instanceof Activity) {
                this.f2893t = new N((Activity) obj, this.f2862M);
            } else if (obj instanceof Dialog) {
                this.f2893t = new N((Dialog) obj);
            }
            N n2 = this.f2893t;
            if (n2 != null) {
                boolean z2 = this.f2883h0;
                if (!n2.f2941s) {
                    if (z2) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                    f1 f1Var = (f1) n2.f2938p;
                    int i2 = f1Var.f4189b;
                    n2.f2941s = true;
                    f1Var.a((i & 4) | (i2 & -5));
                }
            }
        }
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
