package o;

import N.Q;
import N.T;
import N.V;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public final class i1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: p  reason: collision with root package name */
    public static i1 f4219p;

    /* renamed from: q  reason: collision with root package name */
    public static i1 f4220q;

    /* renamed from: f  reason: collision with root package name */
    public final View f4221f;

    /* renamed from: g  reason: collision with root package name */
    public final CharSequence f4222g;

    /* renamed from: h  reason: collision with root package name */
    public final int f4223h;
    public final h1 i = new h1(this, 0);

    /* renamed from: j  reason: collision with root package name */
    public final h1 f4224j = new h1(this, 1);

    /* renamed from: k  reason: collision with root package name */
    public int f4225k;

    /* renamed from: l  reason: collision with root package name */
    public int f4226l;

    /* renamed from: m  reason: collision with root package name */
    public j1 f4227m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4228n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4229o;

    public static void b(i1 i1Var) {
        i1 i1Var2 = f4219p;
        if (i1Var2 != null) {
            i1Var2.f4221f.removeCallbacks(i1Var2.i);
        }
        f4219p = i1Var;
        if (i1Var != null) {
            i1Var.f4221f.postDelayed(i1Var.i, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        i1 i1Var = f4220q;
        View view = this.f4221f;
        if (i1Var == this) {
            f4220q = null;
            j1 j1Var = this.f4227m;
            if (j1Var != null) {
                View view2 = j1Var.f4234b;
                if (view2.getParent() != null) {
                    ((WindowManager) j1Var.f4233a.getSystemService("window")).removeView(view2);
                }
                this.f4227m = null;
                this.f4229o = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f4219p == this) {
            b((i1) null);
        }
        view.removeCallbacks(this.f4224j);
    }

    public final void c(boolean z2) {
        int i2;
        int i3;
        int i4;
        String str;
        long j2;
        long longPressTimeout;
        long j3;
        String str2;
        int i5;
        int i6;
        View view = this.f4221f;
        if (view.isAttachedToWindow()) {
            b((i1) null);
            i1 i1Var = f4220q;
            if (i1Var != null) {
                i1Var.a();
            }
            f4220q = this;
            this.f4228n = z2;
            j1 j1Var = new j1(view.getContext());
            this.f4227m = j1Var;
            int i7 = this.f4225k;
            int i8 = this.f4226l;
            boolean z3 = this.f4228n;
            View view2 = j1Var.f4234b;
            ViewParent parent = view2.getParent();
            Context context = j1Var.f4233a;
            if (!(parent == null || view2.getParent() == null)) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            j1Var.f4235c.setText(this.f4222g);
            WindowManager.LayoutParams layoutParams = j1Var.f4236d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(2131165990);
            if (view.getWidth() < dimensionPixelOffset) {
                i7 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(2131165989);
                i2 = i8 + dimensionPixelOffset2;
                i3 = i8 - dimensionPixelOffset2;
            } else {
                i2 = view.getHeight();
                i3 = 0;
            }
            layoutParams.gravity = 49;
            Resources resources = context.getResources();
            if (z3) {
                i4 = 2131165993;
            } else {
                i4 = 2131165992;
            }
            int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i4);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    } else if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    } else {
                        context2 = ((ContextWrapper) context2).getBaseContext();
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                str = "window";
            } else {
                Rect rect = j1Var.e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    str2 = "window";
                    i5 = 0;
                } else {
                    Resources resources2 = context.getResources();
                    str2 = "window";
                    int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                    if (identifier != 0) {
                        i6 = resources2.getDimensionPixelSize(identifier);
                    } else {
                        i6 = 0;
                    }
                    DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                    i5 = 0;
                    rect.set(0, i6, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = j1Var.f4238g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = j1Var.f4237f;
                view.getLocationOnScreen(iArr2);
                int i9 = iArr2[i5] - iArr[i5];
                iArr2[i5] = i9;
                iArr2[1] = iArr2[1] - iArr[1];
                layoutParams.x = (i9 + i7) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, i5);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i10 = iArr2[1];
                int i11 = ((i3 + i10) - dimensionPixelOffset3) - measuredHeight;
                int i12 = i10 + i2 + dimensionPixelOffset3;
                if (z3) {
                    if (i11 >= 0) {
                        layoutParams.y = i11;
                    } else {
                        layoutParams.y = i12;
                    }
                } else if (measuredHeight + i12 <= rect.height()) {
                    layoutParams.y = i12;
                } else {
                    layoutParams.y = i11;
                }
                str = str2;
            }
            ((WindowManager) context.getSystemService(str)).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f4228n) {
                j2 = 2500;
            } else {
                WeakHashMap weakHashMap = Q.f509a;
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = (long) ViewConfiguration.getLongPressTimeout();
                    j3 = 3000;
                } else {
                    longPressTimeout = (long) ViewConfiguration.getLongPressTimeout();
                    j3 = 15000;
                }
                j2 = j3 - longPressTimeout;
            }
            h1 h1Var = this.f4224j;
            view.removeCallbacks(h1Var);
            view.postDelayed(h1Var, j2);
        }
    }

    public final boolean onHover(View view, MotionEvent motionEvent) {
        int i2;
        if (this.f4227m != null && this.f4228n) {
            return false;
        }
        View view2 = this.f4221f;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.f4229o = true;
                a();
            }
        } else if (view2.isEnabled() && this.f4227m == null) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (this.f4229o || Math.abs(x2 - this.f4225k) > (i2 = this.f4223h) || Math.abs(y2 - this.f4226l) > i2) {
                this.f4225k = x2;
                this.f4226l = y2;
                this.f4229o = false;
                b(this);
            }
        }
        return false;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public i1(View view, CharSequence charSequence) {
        int i2;
        this.f4221f = view;
        this.f4222g = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = V.f515a;
        if (Build.VERSION.SDK_INT >= 28) {
            i2 = T.a(viewConfiguration);
        } else {
            i2 = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f4223h = i2;
        this.f4229o = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public final boolean onLongClick(View view) {
        this.f4225k = view.getWidth() / 2;
        this.f4226l = view.getHeight() / 2;
        c(true);
        return true;
    }

    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
