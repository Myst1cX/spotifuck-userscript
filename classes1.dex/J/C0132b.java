package j;

import G.a;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.StateSet;
import p0.C0320a;
import r.e;
import r.l;

/* renamed from: j.b  reason: case insensitive filesystem */
public final class C0132b extends Drawable.ConstantState {

    /* renamed from: A  reason: collision with root package name */
    public boolean f3202A;

    /* renamed from: B  reason: collision with root package name */
    public ColorFilter f3203B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f3204C;

    /* renamed from: D  reason: collision with root package name */
    public ColorStateList f3205D;

    /* renamed from: E  reason: collision with root package name */
    public PorterDuff.Mode f3206E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f3207F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f3208G;

    /* renamed from: H  reason: collision with root package name */
    public int[][] f3209H;
    public e I;

    /* renamed from: J  reason: collision with root package name */
    public l f3210J;

    /* renamed from: a  reason: collision with root package name */
    public final C0135e f3211a;

    /* renamed from: b  reason: collision with root package name */
    public Resources f3212b;

    /* renamed from: c  reason: collision with root package name */
    public int f3213c;

    /* renamed from: d  reason: collision with root package name */
    public int f3214d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public SparseArray f3215f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable[] f3216g;

    /* renamed from: h  reason: collision with root package name */
    public int f3217h;
    public boolean i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3218j;

    /* renamed from: k  reason: collision with root package name */
    public Rect f3219k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3220l = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3221m;

    /* renamed from: n  reason: collision with root package name */
    public int f3222n;

    /* renamed from: o  reason: collision with root package name */
    public int f3223o;

    /* renamed from: p  reason: collision with root package name */
    public int f3224p;

    /* renamed from: q  reason: collision with root package name */
    public int f3225q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f3226r;

    /* renamed from: s  reason: collision with root package name */
    public int f3227s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3228t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3229u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f3230v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f3231w = true;

    /* renamed from: x  reason: collision with root package name */
    public int f3232x;

    /* renamed from: y  reason: collision with root package name */
    public int f3233y = 0;

    /* renamed from: z  reason: collision with root package name */
    public int f3234z = 0;

    public C0132b(C0132b bVar, C0135e eVar, Resources resources) {
        Resources resources2;
        int i2;
        this.f3211a = eVar;
        Rect rect = null;
        if (resources != null) {
            resources2 = resources;
        } else if (bVar != null) {
            resources2 = bVar.f3212b;
        } else {
            resources2 = null;
        }
        this.f3212b = resources2;
        if (bVar != null) {
            i2 = bVar.f3213c;
        } else {
            i2 = 0;
        }
        int i3 = C0137g.f3249r;
        i2 = resources != null ? resources.getDisplayMetrics().densityDpi : i2;
        i2 = i2 == 0 ? 160 : i2;
        this.f3213c = i2;
        if (bVar != null) {
            this.f3214d = bVar.f3214d;
            this.e = bVar.e;
            this.f3229u = true;
            this.f3230v = true;
            this.i = bVar.i;
            this.f3220l = bVar.f3220l;
            this.f3231w = bVar.f3231w;
            this.f3232x = bVar.f3232x;
            this.f3233y = bVar.f3233y;
            this.f3234z = bVar.f3234z;
            this.f3202A = bVar.f3202A;
            this.f3203B = bVar.f3203B;
            this.f3204C = bVar.f3204C;
            this.f3205D = bVar.f3205D;
            this.f3206E = bVar.f3206E;
            this.f3207F = bVar.f3207F;
            this.f3208G = bVar.f3208G;
            if (bVar.f3213c == i2) {
                if (bVar.f3218j) {
                    this.f3219k = bVar.f3219k != null ? new Rect(bVar.f3219k) : rect;
                    this.f3218j = true;
                }
                if (bVar.f3221m) {
                    this.f3222n = bVar.f3222n;
                    this.f3223o = bVar.f3223o;
                    this.f3224p = bVar.f3224p;
                    this.f3225q = bVar.f3225q;
                    this.f3221m = true;
                }
            }
            if (bVar.f3226r) {
                this.f3227s = bVar.f3227s;
                this.f3226r = true;
            }
            if (bVar.f3228t) {
                this.f3228t = true;
            }
            Drawable[] drawableArr = bVar.f3216g;
            this.f3216g = new Drawable[drawableArr.length];
            this.f3217h = bVar.f3217h;
            SparseArray sparseArray = bVar.f3215f;
            if (sparseArray != null) {
                this.f3215f = sparseArray.clone();
            } else {
                this.f3215f = new SparseArray(this.f3217h);
            }
            int i4 = this.f3217h;
            for (int i5 = 0; i5 < i4; i5++) {
                Drawable drawable = drawableArr[i5];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f3215f.put(i5, constantState);
                    } else {
                        this.f3216g[i5] = drawableArr[i5];
                    }
                }
            }
        } else {
            this.f3216g = new Drawable[10];
            this.f3217h = 0;
        }
        if (bVar != null) {
            this.f3209H = bVar.f3209H;
        } else {
            this.f3209H = new int[this.f3216g.length][];
        }
        if (bVar != null) {
            this.I = bVar.I;
            this.f3210J = bVar.f3210J;
            return;
        }
        this.I = new e();
        this.f3210J = new l();
    }

    public final void b() {
        this.f3221m = true;
        c();
        int i2 = this.f3217h;
        Drawable[] drawableArr = this.f3216g;
        this.f3223o = -1;
        this.f3222n = -1;
        this.f3225q = 0;
        this.f3224p = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            Drawable drawable = drawableArr[i3];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f3222n) {
                this.f3222n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f3223o) {
                this.f3223o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f3224p) {
                this.f3224p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f3225q) {
                this.f3225q = minimumHeight;
            }
        }
    }

    public final Drawable newDrawable() {
        return new C0135e(this, (Resources) null);
    }

    public final int a(Drawable drawable) {
        int i2 = this.f3217h;
        if (i2 >= this.f3216g.length) {
            int i3 = i2 + 10;
            Drawable[] drawableArr = new Drawable[i3];
            Drawable[] drawableArr2 = this.f3216g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i2);
            }
            this.f3216g = drawableArr;
            int[][] iArr = new int[i3][];
            System.arraycopy(this.f3209H, 0, iArr, 0, i2);
            this.f3209H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f3211a);
        this.f3216g[i2] = drawable;
        this.f3217h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.f3226r = false;
        this.f3228t = false;
        this.f3219k = null;
        this.f3218j = false;
        this.f3221m = false;
        this.f3229u = false;
        return i2;
    }

    public final void c() {
        SparseArray sparseArray = this.f3215f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                int keyAt = this.f3215f.keyAt(i2);
                Drawable[] drawableArr = this.f3216g;
                Drawable newDrawable = ((Drawable.ConstantState) this.f3215f.valueAt(i2)).newDrawable(this.f3212b);
                if (Build.VERSION.SDK_INT >= 23) {
                    C0320a.y0(newDrawable, this.f3232x);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f3211a);
                drawableArr[keyAt] = mutate;
            }
            this.f3215f = null;
        }
    }

    public final boolean canApplyTheme() {
        int i2 = this.f3217h;
        Drawable[] drawableArr = this.f3216g;
        for (int i3 = 0; i3 < i2; i3++) {
            Drawable drawable = drawableArr[i3];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f3215f.get(i3);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (a.b(drawable)) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int i2) {
        int indexOfKey;
        Drawable drawable = this.f3216g[i2];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f3215f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i2)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f3215f.valueAt(indexOfKey)).newDrawable(this.f3212b);
        if (Build.VERSION.SDK_INT >= 23) {
            C0320a.y0(newDrawable, this.f3232x);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f3211a);
        this.f3216g[i2] = mutate;
        this.f3215f.removeAt(indexOfKey);
        if (this.f3215f.size() == 0) {
            this.f3215f = null;
        }
        return mutate;
    }

    public final int e(int[] iArr) {
        int[][] iArr2 = this.f3209H;
        int i2 = this.f3217h;
        for (int i3 = 0; i3 < i2; i3++) {
            if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                return i3;
            }
        }
        return -1;
    }

    public final int getChangingConfigurations() {
        return this.f3214d | this.e;
    }

    public final Drawable newDrawable(Resources resources) {
        return new C0135e(this, resources);
    }
}
