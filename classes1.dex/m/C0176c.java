package m;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* renamed from: m.c  reason: case insensitive filesystem */
public final class C0176c extends ContextWrapper {

    /* renamed from: f  reason: collision with root package name */
    public static Configuration f3612f;

    /* renamed from: a  reason: collision with root package name */
    public int f3613a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f3614b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f3615c;

    /* renamed from: d  reason: collision with root package name */
    public Configuration f3616d;
    public Resources e;

    public final void a(Configuration configuration) {
        if (this.e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f3616d == null) {
            this.f3616d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public final void b() {
        if (this.f3614b == null) {
            this.f3614b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f3614b.setTo(theme);
            }
        }
        this.f3614b.applyStyle(this.f3613a, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r0.equals(f3612f) != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.e
            if (r0 != 0) goto L_0x0038
            android.content.res.Configuration r0 = r3.f3616d
            if (r0 == 0) goto L_0x0032
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L_0x0025
            android.content.res.Configuration r1 = f3612f
            if (r1 != 0) goto L_0x001c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            f3612f = r1
        L_0x001c:
            android.content.res.Configuration r1 = f3612f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0025
            goto L_0x0032
        L_0x0025:
            android.content.res.Configuration r0 = r3.f3616d
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.e = r0
            goto L_0x0038
        L_0x0032:
            android.content.res.Resources r0 = super.getResources()
            r3.e = r0
        L_0x0038:
            android.content.res.Resources r0 = r3.e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C0176c.getResources():android.content.res.Resources");
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f3615c == null) {
            this.f3615c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f3615c;
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f3614b;
        if (theme != null) {
            return theme;
        }
        if (this.f3613a == 0) {
            this.f3613a = 2131821118;
        }
        b();
        return this.f3614b;
    }

    public final void setTheme(int i) {
        if (this.f3613a != i) {
            this.f3613a = i;
            b();
        }
    }

    public C0176c(Context context, int i) {
        super(context);
        this.f3613a = i;
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }
}
