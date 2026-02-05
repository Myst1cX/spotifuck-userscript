package o;

import T0.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import g.C0096a;
import g0.C0099b;
import java.lang.reflect.Method;
import n.C0183B;
import p0.C0320a;

public class H0 implements C0183B {

    /* renamed from: F  reason: collision with root package name */
    public static final Method f4066F;

    /* renamed from: G  reason: collision with root package name */
    public static final Method f4067G;

    /* renamed from: H  reason: collision with root package name */
    public static final Method f4068H;

    /* renamed from: A  reason: collision with root package name */
    public final Handler f4069A;

    /* renamed from: B  reason: collision with root package name */
    public final Rect f4070B = new Rect();

    /* renamed from: C  reason: collision with root package name */
    public Rect f4071C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f4072D;

    /* renamed from: E  reason: collision with root package name */
    public final C0246A f4073E;

    /* renamed from: f  reason: collision with root package name */
    public final Context f4074f;

    /* renamed from: g  reason: collision with root package name */
    public ListAdapter f4075g;

    /* renamed from: h  reason: collision with root package name */
    public C0309v0 f4076h;
    public final int i = -2;

    /* renamed from: j  reason: collision with root package name */
    public int f4077j = -2;

    /* renamed from: k  reason: collision with root package name */
    public int f4078k;

    /* renamed from: l  reason: collision with root package name */
    public int f4079l;

    /* renamed from: m  reason: collision with root package name */
    public final int f4080m = 1002;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4081n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4082o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4083p;

    /* renamed from: q  reason: collision with root package name */
    public int f4084q = 0;

    /* renamed from: r  reason: collision with root package name */
    public final int f4085r = Integer.MAX_VALUE;

    /* renamed from: s  reason: collision with root package name */
    public E0 f4086s;

    /* renamed from: t  reason: collision with root package name */
    public View f4087t;

    /* renamed from: u  reason: collision with root package name */
    public AdapterView.OnItemClickListener f4088u;

    /* renamed from: v  reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f4089v;

    /* renamed from: w  reason: collision with root package name */
    public final D0 f4090w = new D0(this, 1);

    /* renamed from: x  reason: collision with root package name */
    public final G0 f4091x = new G0(this);

    /* renamed from: y  reason: collision with root package name */
    public final F0 f4092y = new F0(this);

    /* renamed from: z  reason: collision with root package name */
    public final D0 f4093z = new D0(this, 0);

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f4066F = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
            }
            try {
                f4068H = cls.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f4067G = cls.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public final void i() {
        int i2;
        boolean z2;
        int i3;
        int i4;
        boolean z3;
        C0309v0 v0Var;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        C0309v0 v0Var2 = this.f4076h;
        C0246A a2 = this.f4073E;
        Context context = this.f4074f;
        if (v0Var2 == null) {
            C0309v0 q2 = q(context, !this.f4072D);
            this.f4076h = q2;
            q2.setAdapter(this.f4075g);
            this.f4076h.setOnItemClickListener(this.f4088u);
            this.f4076h.setFocusable(true);
            this.f4076h.setFocusableInTouchMode(true);
            this.f4076h.setOnItemSelectedListener(new C0099b(1, this));
            this.f4076h.setOnScrollListener(this.f4092y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f4089v;
            if (onItemSelectedListener != null) {
                this.f4076h.setOnItemSelectedListener(onItemSelectedListener);
            }
            a2.setContentView(this.f4076h);
        } else {
            ViewGroup viewGroup = (ViewGroup) a2.getContentView();
        }
        Drawable background = a2.getBackground();
        Rect rect = this.f4070B;
        if (background != null) {
            background.getPadding(rect);
            int i11 = rect.top;
            i2 = rect.bottom + i11;
            if (!this.f4081n) {
                this.f4079l = -i11;
            }
        } else {
            rect.setEmpty();
            i2 = 0;
        }
        if (a2.getInputMethodMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        View view = this.f4087t;
        int i12 = this.f4079l;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f4067G;
            if (method != null) {
                try {
                    i3 = ((Integer) method.invoke(a2, new Object[]{view, Integer.valueOf(i12), Boolean.valueOf(z2)})).intValue();
                } catch (Exception unused) {
                }
            }
            i3 = a2.getMaxAvailableHeight(view, i12);
        } else {
            i3 = B0.a(a2, view, i12, z2);
        }
        int i13 = this.i;
        if (i13 == -1) {
            i4 = i3 + i2;
        } else {
            int i14 = this.f4077j;
            if (i14 == -2) {
                i8 = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            } else if (i14 != -1) {
                i8 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
            } else {
                i8 = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            }
            int a3 = this.f4076h.a(i8, i3);
            if (a3 > 0) {
                i9 = this.f4076h.getPaddingBottom() + this.f4076h.getPaddingTop() + i2;
            } else {
                i9 = 0;
            }
            i4 = a3 + i9;
        }
        if (this.f4073E.getInputMethodMode() == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        C0320a.E0(a2, this.f4080m);
        if (!a2.isShowing()) {
            int i15 = this.f4077j;
            if (i15 == -1) {
                i15 = -1;
            } else if (i15 == -2) {
                i15 = this.f4087t.getWidth();
            }
            if (i13 == -1) {
                i13 = -1;
            } else if (i13 == -2) {
                i13 = i4;
            }
            a2.setWidth(i15);
            a2.setHeight(i13);
            if (Build.VERSION.SDK_INT <= 28) {
                Method method2 = f4066F;
                if (method2 != null) {
                    try {
                        method2.invoke(a2, new Object[]{Boolean.TRUE});
                    } catch (Exception unused2) {
                    }
                }
            } else {
                C0.b(a2, true);
            }
            a2.setOutsideTouchable(true);
            a2.setTouchInterceptor(this.f4091x);
            if (this.f4083p) {
                C0320a.A0(a2, this.f4082o);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method3 = f4068H;
                if (method3 != null) {
                    try {
                        method3.invoke(a2, new Object[]{this.f4071C});
                    } catch (Exception e) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                    }
                }
            } else {
                C0.a(a2, this.f4071C);
            }
            a2.showAsDropDown(this.f4087t, this.f4078k, this.f4079l, this.f4084q);
            this.f4076h.setSelection(-1);
            if ((!this.f4072D || this.f4076h.isInTouchMode()) && (v0Var = this.f4076h) != null) {
                v0Var.setListSelectionHidden(true);
                v0Var.requestLayout();
            }
            if (!this.f4072D) {
                this.f4069A.post(this.f4093z);
            }
        } else if (this.f4087t.isAttachedToWindow()) {
            int i16 = this.f4077j;
            if (i16 == -1) {
                i16 = -1;
            } else if (i16 == -2) {
                i16 = this.f4087t.getWidth();
            }
            if (i13 == -1) {
                if (z3) {
                    i13 = i4;
                } else {
                    i13 = -1;
                }
                if (z3) {
                    if (this.f4077j == -1) {
                        i7 = -1;
                    } else {
                        i7 = 0;
                    }
                    a2.setWidth(i7);
                    a2.setHeight(0);
                } else {
                    if (this.f4077j == -1) {
                        i10 = -1;
                    }
                    a2.setWidth(i10);
                    a2.setHeight(-1);
                }
            } else if (i13 == -2) {
                i13 = i4;
            }
            a2.setOutsideTouchable(true);
            View view2 = this.f4087t;
            int i17 = this.f4078k;
            int i18 = this.f4079l;
            if (i16 < 0) {
                i5 = -1;
            } else {
                i5 = i16;
            }
            if (i13 < 0) {
                i6 = -1;
            } else {
                i6 = i13;
            }
            a2.update(view2, i17, i18, i5, i6);
        }
    }

    public final boolean a() {
        return this.f4073E.isShowing();
    }

    public final void c(int i2) {
        this.f4078k = i2;
    }

    public final int d() {
        return this.f4078k;
    }

    public final void dismiss() {
        C0246A a2 = this.f4073E;
        a2.dismiss();
        a2.setContentView((View) null);
        this.f4076h = null;
        this.f4069A.removeCallbacks(this.f4090w);
    }

    public final C0309v0 e() {
        return this.f4076h;
    }

    public final int j() {
        if (!this.f4081n) {
            return 0;
        }
        return this.f4079l;
    }

    public final void k(Drawable drawable) {
        this.f4073E.setBackgroundDrawable(drawable);
    }

    public final void l(int i2) {
        this.f4079l = i2;
        this.f4081n = true;
    }

    public final Drawable m() {
        return this.f4073E.getBackground();
    }

    public void n(ListAdapter listAdapter) {
        E0 e02 = this.f4086s;
        if (e02 == null) {
            this.f4086s = new E0(this);
        } else {
            ListAdapter listAdapter2 = this.f4075g;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(e02);
            }
        }
        this.f4075g = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f4086s);
        }
        C0309v0 v0Var = this.f4076h;
        if (v0Var != null) {
            v0Var.setAdapter(this.f4075g);
        }
    }

    public C0309v0 q(Context context, boolean z2) {
        return new C0309v0(context, z2);
    }

    public final void r(int i2) {
        Drawable background = this.f4073E.getBackground();
        if (background != null) {
            Rect rect = this.f4070B;
            background.getPadding(rect);
            this.f4077j = rect.left + rect.right + i2;
            return;
        }
        this.f4077j = i2;
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [o.A, android.widget.PopupWindow] */
    public H0(Context context, AttributeSet attributeSet, int i2) {
        Drawable drawable;
        int resourceId;
        this.f4074f = context;
        this.f4069A = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0096a.f2531o, i2, 0);
        this.f4078k = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f4079l = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f4081n = true;
        }
        obtainStyledAttributes.recycle();
        ? popupWindow = new PopupWindow(context, attributeSet, i2, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0096a.f2535s, i2, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            C0320a.A0(popupWindow, obtainStyledAttributes2.getBoolean(2, false));
        }
        if (!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) {
            drawable = obtainStyledAttributes2.getDrawable(0);
        } else {
            drawable = g.n(context, resourceId);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.f4073E = popupWindow;
        popupWindow.setInputMethodMode(1);
    }
}
