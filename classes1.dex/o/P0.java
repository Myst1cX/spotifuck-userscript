package o;

import D.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.TypedValue;
import f0.b;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import o0.r;
import r.e;
import r.f;
import r.k;
import r.l;

public final class P0 {

    /* renamed from: h  reason: collision with root package name */
    public static final PorterDuff.Mode f4114h = PorterDuff.Mode.SRC_IN;
    public static P0 i;

    /* renamed from: j  reason: collision with root package name */
    public static final N0 f4115j = new f(6);

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap f4116a;

    /* renamed from: b  reason: collision with root package name */
    public k f4117b;

    /* renamed from: c  reason: collision with root package name */
    public l f4118c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap f4119d = new WeakHashMap(0);
    public TypedValue e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4120f;

    /* renamed from: g  reason: collision with root package name */
    public b f4121g;

    public final synchronized void b(Context context, long j2, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                e eVar = (e) this.f4119d.get(context);
                if (eVar == null) {
                    eVar = new e();
                    this.f4119d.put(context, eVar);
                }
                eVar.f(j2, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final Drawable c(Context context, int i2) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable e2 = e(context, j2);
        if (e2 != null) {
            return e2;
        }
        LayerDrawable layerDrawable = null;
        if (this.f4121g != null) {
            if (i2 == 2131230776) {
                layerDrawable = new LayerDrawable(new Drawable[]{f(context, 2131230775), f(context, 2131230777)});
            } else if (i2 == 2131230811) {
                layerDrawable = b.d(this, context, 2131165243);
            } else if (i2 == 2131230810) {
                layerDrawable = b.d(this, context, 2131165244);
            } else if (i2 == 2131230812) {
                layerDrawable = b.d(this, context, 2131165245);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j2, layerDrawable);
        }
        return layerDrawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r5 = r0.f4528c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable e(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap r0 = r3.f4119d     // Catch:{ all -> 0x0028 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0028 }
            r.e r0 = (r.e) r0     // Catch:{ all -> 0x0028 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.e(r5, r1)     // Catch:{ all -> 0x0028 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x0041
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0028 }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x002a
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0028 }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x0028 }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r4 = move-exception
            goto L_0x0043
        L_0x002a:
            long[] r4 = r0.f4527b     // Catch:{ all -> 0x0028 }
            int r2 = r0.f4529d     // Catch:{ all -> 0x0028 }
            int r4 = r.d.b(r4, r2, r5)     // Catch:{ all -> 0x0028 }
            if (r4 < 0) goto L_0x0041
            java.lang.Object[] r5 = r0.f4528c     // Catch:{ all -> 0x0028 }
            r6 = r5[r4]     // Catch:{ all -> 0x0028 }
            java.lang.Object r2 = r.e.e     // Catch:{ all -> 0x0028 }
            if (r6 == r2) goto L_0x0041
            r5[r4] = r2     // Catch:{ all -> 0x0028 }
            r4 = 1
            r0.f4526a = r4     // Catch:{ all -> 0x0028 }
        L_0x0041:
            monitor-exit(r3)
            return r1
        L_0x0043:
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.P0.e(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable f(Context context, int i2) {
        return g(context, i2, false);
    }

    public final synchronized Drawable g(Context context, int i2, boolean z2) {
        Drawable k2;
        try {
            if (!this.f4120f) {
                this.f4120f = true;
                Drawable f2 = f(context, 2131230838);
                if (f2 == null || (!(f2 instanceof r) && !"android.graphics.drawable.VectorDrawable".equals(f2.getClass().getName()))) {
                    this.f4120f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            k2 = k(context, i2);
            if (k2 == null) {
                k2 = c(context, i2);
            }
            if (k2 == null) {
                k2 = a.b(context, i2);
            }
            if (k2 != null) {
                k2 = n(context, i2, z2, k2);
            }
            if (k2 != null) {
                C0297p0.a(k2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return k2;
    }

    public final synchronized ColorStateList i(Context context, int i2) {
        ColorStateList colorStateList;
        l lVar;
        WeakHashMap weakHashMap = this.f4116a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap == null || (lVar = (l) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            colorStateList = (ColorStateList) lVar.c(i2, (Integer) null);
        }
        if (colorStateList == null) {
            b bVar = this.f4121g;
            if (bVar != null) {
                colorStateList2 = bVar.e(context, i2);
            }
            if (colorStateList2 != null) {
                if (this.f4116a == null) {
                    this.f4116a = new WeakHashMap();
                }
                l lVar2 = (l) this.f4116a.get(context);
                if (lVar2 == null) {
                    lVar2 = new l();
                    this.f4116a.put(context, lVar2);
                }
                lVar2.a(i2, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final synchronized void l(Context context) {
        e eVar = (e) this.f4119d.get(context);
        if (eVar != null) {
            eVar.b();
        }
    }

    public final synchronized void m(b bVar) {
        this.f4121g = bVar;
    }

    public static synchronized P0 d() {
        P0 p02;
        synchronized (P0.class) {
            try {
                if (i == null) {
                    P0 p03 = new P0();
                    i = p03;
                    j(p03);
                }
                p02 = i;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return p02;
    }

    public static synchronized PorterDuffColorFilter h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (P0.class) {
            N0 n02 = f4115j;
            n02.getClass();
            int i3 = (31 + i2) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) n02.a(Integer.valueOf(mode.hashCode() + i3));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) n02.b(Integer.valueOf(mode.hashCode() + i3), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(P0 p02) {
        if (Build.VERSION.SDK_INT < 24) {
            p02.a("vector", new O0(3));
            p02.a("animated-vector", new O0(2));
            p02.a("animated-selector", new O0(1));
            p02.a("drawable", new O0(0));
        }
    }

    public final void a(String str, O0 o02) {
        if (this.f4117b == null) {
            this.f4117b = new k();
        }
        this.f4117b.put(str, o02);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079 A[Catch:{ Exception -> 0x0095 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a2 A[Catch:{ Exception -> 0x0095 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable k(android.content.Context r12, int r13) {
        /*
            r11 = this;
            r.k r0 = r11.f4117b
            r1 = 0
            if (r0 == 0) goto L_0x00b9
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b9
            r.l r0 = r11.f4118c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.c(r13, r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            r.k r3 = r11.f4117b
            java.lang.Object r0 = r3.getOrDefault(r0, r1)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            r.l r0 = new r.l
            r0.<init>()
            r11.f4118c = r0
        L_0x002f:
            android.util.TypedValue r0 = r11.e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r11.e = r0
        L_0x003a:
            android.util.TypedValue r0 = r11.e
            android.content.res.Resources r3 = r12.getResources()
            r4 = 1
            r3.getValue(r13, r0, r4)
            int r5 = r0.assetCookie
            long r5 = (long) r5
            r7 = 32
            long r5 = r5 << r7
            int r7 = r0.data
            long r7 = (long) r7
            long r5 = r5 | r7
            android.graphics.drawable.Drawable r7 = r11.e(r12, r5)
            if (r7 == 0) goto L_0x0055
            return r7
        L_0x0055:
            java.lang.CharSequence r8 = r0.string
            if (r8 == 0) goto L_0x00b1
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = ".xml"
            boolean r8 = r8.endsWith(r9)
            if (r8 == 0) goto L_0x00b1
            android.content.res.XmlResourceParser r3 = r3.getXml(r13)     // Catch:{ Exception -> 0x0095 }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r3)     // Catch:{ Exception -> 0x0095 }
        L_0x006d:
            int r9 = r3.next()     // Catch:{ Exception -> 0x0095 }
            r10 = 2
            if (r9 == r10) goto L_0x0077
            if (r9 == r4) goto L_0x0077
            goto L_0x006d
        L_0x0077:
            if (r9 != r10) goto L_0x00a2
            java.lang.String r4 = r3.getName()     // Catch:{ Exception -> 0x0095 }
            r.l r9 = r11.f4118c     // Catch:{ Exception -> 0x0095 }
            r9.a(r13, r4)     // Catch:{ Exception -> 0x0095 }
            r.k r9 = r11.f4117b     // Catch:{ Exception -> 0x0095 }
            java.lang.Object r1 = r9.getOrDefault(r4, r1)     // Catch:{ Exception -> 0x0095 }
            o.O0 r1 = (o.O0) r1     // Catch:{ Exception -> 0x0095 }
            if (r1 == 0) goto L_0x0097
            android.content.res.Resources$Theme r4 = r12.getTheme()     // Catch:{ Exception -> 0x0095 }
            android.graphics.drawable.Drawable r7 = r1.a(r12, r3, r8, r4)     // Catch:{ Exception -> 0x0095 }
            goto L_0x0097
        L_0x0095:
            r12 = move-exception
            goto L_0x00aa
        L_0x0097:
            if (r7 == 0) goto L_0x00b1
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x0095 }
            r7.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x0095 }
            r11.b(r12, r5, r7)     // Catch:{ Exception -> 0x0095 }
            goto L_0x00b1
        L_0x00a2:
            org.xmlpull.v1.XmlPullParserException r12 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0095 }
            java.lang.String r0 = "No start tag found"
            r12.<init>(r0)     // Catch:{ Exception -> 0x0095 }
            throw r12     // Catch:{ Exception -> 0x0095 }
        L_0x00aa:
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r12)
        L_0x00b1:
            if (r7 != 0) goto L_0x00b8
            r.l r12 = r11.f4118c
            r12.a(r13, r2)
        L_0x00b8:
            return r7
        L_0x00b9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.P0.k(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable n(android.content.Context r10, int r11, boolean r12, android.graphics.drawable.Drawable r13) {
        /*
            r9 = this;
            r0 = 2130968837(0x7f040105, float:1.7546339E38)
            r1 = 2130968835(0x7f040103, float:1.7546335E38)
            android.content.res.ColorStateList r2 = r9.i(r10, r11)
            r3 = 0
            if (r2 == 0) goto L_0x002b
            android.graphics.drawable.Drawable r10 = r13.mutate()
            android.graphics.drawable.Drawable r13 = p0.C0320a.J0(r10)
            G.a.h(r13, r2)
            f0.b r10 = r9.f4121g
            if (r10 != 0) goto L_0x001d
            goto L_0x0024
        L_0x001d:
            r10 = 2131230825(0x7f080069, float:1.8077714E38)
            if (r11 != r10) goto L_0x0024
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
        L_0x0024:
            if (r3 == 0) goto L_0x0109
            G.a.i(r13, r3)
            goto L_0x0109
        L_0x002b:
            f0.b r2 = r9.f4121g
            if (r2 == 0) goto L_0x009b
            r2 = 2131230820(0x7f080064, float:1.8077704E38)
            r4 = 16908301(0x102000d, float:2.3877265E-38)
            r5 = 16908303(0x102000f, float:2.387727E-38)
            r6 = 16908288(0x1020000, float:2.387723E-38)
            if (r11 != r2) goto L_0x0064
            r11 = r13
            android.graphics.drawable.LayerDrawable r11 = (android.graphics.drawable.LayerDrawable) r11
            android.graphics.drawable.Drawable r12 = r11.findDrawableByLayerId(r6)
            int r2 = o.U0.c(r10, r0)
            android.graphics.PorterDuff$Mode r3 = o.C0302s.f4294b
            f0.b.f(r12, r2)
            android.graphics.drawable.Drawable r12 = r11.findDrawableByLayerId(r5)
            int r0 = o.U0.c(r10, r0)
            f0.b.f(r12, r0)
            android.graphics.drawable.Drawable r11 = r11.findDrawableByLayerId(r4)
            int r10 = o.U0.c(r10, r1)
            f0.b.f(r11, r10)
            goto L_0x0109
        L_0x0064:
            r2 = 2131230811(0x7f08005b, float:1.8077685E38)
            if (r11 == r2) goto L_0x0073
            r2 = 2131230810(0x7f08005a, float:1.8077683E38)
            if (r11 == r2) goto L_0x0073
            r2 = 2131230812(0x7f08005c, float:1.8077687E38)
            if (r11 != r2) goto L_0x009b
        L_0x0073:
            r11 = r13
            android.graphics.drawable.LayerDrawable r11 = (android.graphics.drawable.LayerDrawable) r11
            android.graphics.drawable.Drawable r12 = r11.findDrawableByLayerId(r6)
            int r0 = o.U0.b(r10, r0)
            android.graphics.PorterDuff$Mode r2 = o.C0302s.f4294b
            f0.b.f(r12, r0)
            android.graphics.drawable.Drawable r12 = r11.findDrawableByLayerId(r5)
            int r0 = o.U0.c(r10, r1)
            f0.b.f(r12, r0)
            android.graphics.drawable.Drawable r11 = r11.findDrawableByLayerId(r4)
            int r10 = o.U0.c(r10, r1)
            f0.b.f(r11, r10)
            goto L_0x0109
        L_0x009b:
            f0.b r2 = r9.f4121g
            r4 = 0
            if (r2 == 0) goto L_0x0104
            android.graphics.PorterDuff$Mode r5 = o.C0302s.f4294b
            java.lang.Object r6 = r2.f2513a
            int[] r6 = (int[]) r6
            boolean r6 = f0.b.a(r6, r11)
            r7 = 1
            r8 = -1
            if (r6 == 0) goto L_0x00b1
            r11 = -1
        L_0x00af:
            r1 = 1
            goto L_0x00ed
        L_0x00b1:
            java.lang.Object r0 = r2.f2515c
            int[] r0 = (int[]) r0
            boolean r0 = f0.b.a(r0, r11)
            if (r0 == 0) goto L_0x00c0
            r11 = -1
            r0 = 2130968835(0x7f040103, float:1.7546335E38)
            goto L_0x00af
        L_0x00c0:
            java.lang.Cloneable r0 = r2.f2516d
            int[] r0 = (int[]) r0
            boolean r0 = f0.b.a(r0, r11)
            r1 = 16842801(0x1010031, float:2.3693695E-38)
            if (r0 == 0) goto L_0x00d4
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.MULTIPLY
        L_0x00cf:
            r11 = -1
            r0 = 16842801(0x1010031, float:2.3693695E-38)
            goto L_0x00af
        L_0x00d4:
            r0 = 2131230797(0x7f08004d, float:1.8077657E38)
            if (r11 != r0) goto L_0x00e4
            r11 = 1109603123(0x42233333, float:40.8)
            int r11 = java.lang.Math.round(r11)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            goto L_0x00af
        L_0x00e4:
            r0 = 2131230779(0x7f08003b, float:1.807762E38)
            if (r11 != r0) goto L_0x00ea
            goto L_0x00cf
        L_0x00ea:
            r11 = -1
            r0 = 0
            r1 = 0
        L_0x00ed:
            if (r1 == 0) goto L_0x0104
            android.graphics.drawable.Drawable r1 = r13.mutate()
            int r10 = o.U0.c(r10, r0)
            android.graphics.PorterDuffColorFilter r10 = o.C0302s.c(r10, r5)
            r1.setColorFilter(r10)
            if (r11 == r8) goto L_0x0103
            r1.setAlpha(r11)
        L_0x0103:
            r4 = 1
        L_0x0104:
            if (r4 != 0) goto L_0x0109
            if (r12 == 0) goto L_0x0109
            r13 = r3
        L_0x0109:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.P0.n(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }
}
