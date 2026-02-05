package p0;

import D0.a;
import E.g;
import F.f;
import G.b;
import G.h;
import G.i;
import K.k;
import K0.u;
import N.C0001a0;
import N.F;
import N.Q;
import T.c;
import T.d;
import T.e;
import T.m;
import T.n;
import T.o;
import T.p;
import T.r;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.support.v4.media.session.t;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.CompoundButton;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import o.C0246A;
import o.C0273d0;

/* renamed from: p0.a  reason: case insensitive filesystem */
public abstract class C0320a implements C0001a0 {

    /* renamed from: a  reason: collision with root package name */
    public static Method f4440a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f4441b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f4442c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f4443d;
    public static boolean e;

    /* renamed from: f  reason: collision with root package name */
    public static Method f4444f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f4445g;

    /* renamed from: h  reason: collision with root package name */
    public static Field f4446h;
    public static Field i;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f4447j;

    /* renamed from: k  reason: collision with root package name */
    public static Method f4448k;

    /* renamed from: l  reason: collision with root package name */
    public static boolean f4449l;

    /* renamed from: m  reason: collision with root package name */
    public static Field f4450m;

    /* renamed from: n  reason: collision with root package name */
    public static boolean f4451n;

    public static f[] A(f[] fVarArr) {
        f[] fVarArr2 = new f[fVarArr.length];
        for (int i2 = 0; i2 < fVarArr.length; i2++) {
            fVarArr2[i2] = new f(fVarArr[i2]);
        }
        return fVarArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean C(N.C0011k r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
            r0 = 1
            r1 = 0
            if (r7 != 0) goto L_0x0005
            return r1
        L_0x0005:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto L_0x0010
            boolean r7 = r7.e(r10)
            return r7
        L_0x0010:
            boolean r2 = r9 instanceof android.app.Activity
            r3 = 0
            if (r2 == 0) goto L_0x0083
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L_0x0066
            android.app.ActionBar r8 = r9.getActionBar()
            int r2 = r10.getKeyCode()
            r4 = 82
            if (r2 != r4) goto L_0x0066
            if (r8 == 0) goto L_0x0066
            boolean r2 = e
            if (r2 != 0) goto L_0x004c
            java.lang.Class r2 = r8.getClass()     // Catch:{ NoSuchMethodException -> 0x004a }
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x004a }
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r1] = r6     // Catch:{ NoSuchMethodException -> 0x004a }
            java.lang.reflect.Method r2 = r2.getMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x004a }
            f4444f = r2     // Catch:{ NoSuchMethodException -> 0x004a }
        L_0x004a:
            e = r0
        L_0x004c:
            java.lang.reflect.Method r2 = f4444f
            if (r2 == 0) goto L_0x0063
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0062 }
            r4[r1] = r10     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0062 }
            java.lang.Object r8 = r2.invoke(r8, r4)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0062 }
            if (r8 != 0) goto L_0x005b
            goto L_0x0063
        L_0x005b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0062 }
            boolean r1 = r8.booleanValue()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0062 }
            goto L_0x0063
        L_0x0062:
        L_0x0063:
            if (r1 == 0) goto L_0x0066
            goto L_0x0082
        L_0x0066:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L_0x006d
            goto L_0x0082
        L_0x006d:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = N.Q.b(r7, r10)
            if (r8 == 0) goto L_0x0078
            goto L_0x0082
        L_0x0078:
            if (r7 == 0) goto L_0x007e
            android.view.KeyEvent$DispatcherState r3 = r7.getKeyDispatcherState()
        L_0x007e:
            boolean r0 = r10.dispatch(r9, r3, r9)
        L_0x0082:
            return r0
        L_0x0083:
            boolean r2 = r9 instanceof android.app.Dialog
            if (r2 == 0) goto L_0x00d7
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = f4445g
            if (r7 != 0) goto L_0x009c
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch:{ NoSuchFieldException -> 0x009a }
            f4446h = r7     // Catch:{ NoSuchFieldException -> 0x009a }
            r7.setAccessible(r0)     // Catch:{ NoSuchFieldException -> 0x009a }
        L_0x009a:
            f4445g = r0
        L_0x009c:
            java.lang.reflect.Field r7 = f4446h
            if (r7 == 0) goto L_0x00a8
            java.lang.Object r7 = r7.get(r9)     // Catch:{ IllegalAccessException -> 0x00a7 }
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch:{ IllegalAccessException -> 0x00a7 }
            goto L_0x00a9
        L_0x00a7:
        L_0x00a8:
            r7 = r3
        L_0x00a9:
            if (r7 == 0) goto L_0x00b6
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto L_0x00b6
            goto L_0x00d6
        L_0x00b6:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L_0x00c1
            goto L_0x00d6
        L_0x00c1:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = N.Q.b(r7, r10)
            if (r8 == 0) goto L_0x00cc
            goto L_0x00d6
        L_0x00cc:
            if (r7 == 0) goto L_0x00d2
            android.view.KeyEvent$DispatcherState r3 = r7.getKeyDispatcherState()
        L_0x00d2:
            boolean r0 = r10.dispatch(r9, r3, r9)
        L_0x00d6:
            return r0
        L_0x00d7:
            if (r8 == 0) goto L_0x00df
            boolean r8 = N.Q.b(r8, r10)
            if (r8 != 0) goto L_0x00e7
        L_0x00df:
            boolean r7 = r7.e(r10)
            if (r7 == 0) goto L_0x00e6
            goto L_0x00e7
        L_0x00e6:
            r0 = 0
        L_0x00e7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.C0320a.C(N.k, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    public static void E0(PopupWindow popupWindow, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            m.d(popupWindow, i2);
            return;
        }
        if (!f4449l) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                f4448k = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f4449l = true;
        }
        Method method = f4448k;
        if (method != null) {
            try {
                method.invoke(popupWindow, new Object[]{Integer.valueOf(i2)});
            } catch (Exception unused2) {
            }
        }
    }

    public static boolean g(f[] fVarArr, f[] fVarArr2) {
        if (fVarArr == null || fVarArr2 == null || fVarArr.length != fVarArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < fVarArr.length; i2++) {
            f fVar = fVarArr[i2];
            char c2 = fVar.f230a;
            f fVar2 = fVarArr2[i2];
            if (c2 != fVar2.f230a || fVar.f231b.length != fVar2.f231b.length) {
                return false;
            }
        }
        return true;
    }

    public static boolean y0(Drawable drawable, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.b(drawable, i2);
        }
        if (!f4441b) {
            Class<Drawable> cls = Drawable.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                f4440a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f4441b = true;
        }
        Method method = f4440a;
        if (method != null) {
            try {
                method.invoke(drawable, new Object[]{Integer.valueOf(i2)});
                return true;
            } catch (Exception unused2) {
                f4440a = null;
            }
        }
        return false;
    }

    public abstract boolean F0(View view, float f2);

    public abstract void I0(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3);

    public abstract void M(u uVar, float f2, float f3);

    public abstract int P();

    public abstract int Q();

    public abstract int T();

    public abstract int U();

    public abstract int V(View view);

    public abstract int W(CoordinatorLayout coordinatorLayout);

    public abstract int X();

    public abstract boolean c0(float f2);

    public abstract int e(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float f(int i2);

    public abstract boolean f0(View view);

    public abstract boolean g0(float f2, float f3);

    public abstract void k0(int i2);

    public abstract void l0(Typeface typeface, boolean z2);

    public abstract Typeface t(Context context, g gVar, Resources resources, int i2);

    public abstract Typeface u(Context context, k[] kVarArr, int i2);

    public static void A0(C0246A a2, boolean z2) {
        if (Build.VERSION.SDK_INT >= 23) {
            m.c(a2, z2);
            return;
        }
        if (!f4451n) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f4450m = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f4451n = true;
        }
        Field field = f4450m;
        if (field != null) {
            try {
                field.set(a2, Boolean.valueOf(z2));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.ref.WeakReference} */
    /* JADX WARNING: type inference failed for: r1v5, types: [N.P, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean B(android.view.View r4, android.view.KeyEvent r5) {
        /*
            java.util.WeakHashMap r0 = N.Q.f509a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            if (r0 < r1) goto L_0x000b
            goto L_0x009e
        L_0x000b:
            java.util.ArrayList r0 = N.P.f505d
            r0 = 2131296735(0x7f0901df, float:1.8211395E38)
            java.lang.Object r1 = r4.getTag(r0)
            N.P r1 = (N.P) r1
            r3 = 0
            if (r1 != 0) goto L_0x0027
            N.P r1 = new N.P
            r1.<init>()
            r1.f506a = r3
            r1.f507b = r3
            r1.f508c = r3
            r4.setTag(r0, r1)
        L_0x0027:
            java.lang.ref.WeakReference r4 = r1.f508c
            if (r4 == 0) goto L_0x0032
            java.lang.Object r4 = r4.get()
            if (r4 != r5) goto L_0x0032
            goto L_0x009e
        L_0x0032:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r5)
            r1.f508c = r4
            android.util.SparseArray r4 = r1.f507b
            if (r4 != 0) goto L_0x0044
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            r1.f507b = r4
        L_0x0044:
            android.util.SparseArray r4 = r1.f507b
            int r0 = r5.getAction()
            r1 = 1
            if (r0 != r1) goto L_0x0060
            int r0 = r5.getKeyCode()
            int r0 = r4.indexOfKey(r0)
            if (r0 < 0) goto L_0x0060
            java.lang.Object r3 = r4.valueAt(r0)
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            r4.removeAt(r0)
        L_0x0060:
            if (r3 != 0) goto L_0x006d
            int r5 = r5.getKeyCode()
            java.lang.Object r4 = r4.get(r5)
            r3 = r4
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
        L_0x006d:
            if (r3 == 0) goto L_0x009e
            java.lang.Object r4 = r3.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x009d
            boolean r5 = r4.isAttachedToWindow()
            if (r5 == 0) goto L_0x009d
            r5 = 2131296736(0x7f0901e0, float:1.8211397E38)
            java.lang.Object r4 = r4.getTag(r5)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L_0x009d
            int r5 = r4.size()
            int r5 = r5 - r1
            if (r5 >= 0) goto L_0x0090
            goto L_0x009d
        L_0x0090:
            java.lang.Object r4 = r4.get(r5)
            r4.getClass()
            java.lang.ClassCastException r4 = new java.lang.ClassCastException
            r4.<init>()
            throw r4
        L_0x009d:
            r2 = 1
        L_0x009e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.C0320a.B(android.view.View, android.view.KeyEvent):boolean");
    }

    public static void B0(View view, K0.g gVar) {
        a aVar = gVar.f374f.f359b;
        if (aVar != null && aVar.f77a) {
            float f2 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap weakHashMap = Q.f509a;
                f2 += F.i((View) parent);
            }
            K0.f fVar = gVar.f374f;
            if (fVar.f367l != f2) {
                fVar.f367l = f2;
                gVar.m();
            }
        }
    }

    public static void C0(TextView textView, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i2);
        } else {
            textView.setTextAppearance(textView.getContext(), i2);
        }
    }

    public static Drawable E(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c.a(compoundButton);
        }
        if (!f4447j) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                i = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f4447j = true;
        }
        Field field = i;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException unused2) {
                i = null;
            }
        }
        return null;
    }

    public static int F(Context context, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return D.b.a(context, i2);
        }
        return context.getResources().getColor(i2);
    }

    public static void G0(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            D.c.b(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static ActionMode.Callback H0(ActionMode.Callback callback) {
        if (!(callback instanceof r) || Build.VERSION.SDK_INT < 26) {
            return callback;
        }
        return ((r) callback).f917a;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [G.i, android.graphics.drawable.Drawable] */
    public static Drawable J0(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 || (drawable instanceof G.g)) {
            return drawable;
        }
        ? drawable2 = new Drawable();
        drawable2.i = drawable2.c();
        drawable2.h(drawable);
        i.a();
        return drawable2;
    }

    public static ColorStateList K(Context context, t tVar, int i2) {
        int resourceId;
        ColorStateList I;
        TypedArray typedArray = (TypedArray) tVar.f1132c;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (I = I(context, resourceId)) == null) {
            return tVar.n(i2);
        }
        return I;
    }

    public static ActionMode.Callback K0(ActionMode.Callback callback, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26 || i2 > 27 || (callback instanceof r) || callback == null) {
            return callback;
        }
        return new r(callback, textView);
    }

    public static ColorStateList L(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !A.a.t(drawable)) {
            return null;
        }
        return A.a.d(drawable).getColorStateList();
    }

    public static float N(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static int R(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.a(drawable);
        }
        if (!f4443d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", (Class[]) null);
                f4442c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f4443d = true;
        }
        Method method = f4442c;
        if (method == null) {
            return 0;
        }
        try {
            return ((Integer) method.invoke(drawable, (Object[]) null)).intValue();
        } catch (Exception unused2) {
            f4442c = null;
            return 0;
        }
    }

    public static float S(String[] strArr, int i2) {
        float parseFloat = Float.parseFloat(strArr[i2]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static L.g Z(C0273d0 d0Var) {
        int i2;
        int i3;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            return new L.g(p.c(d0Var));
        }
        TextPaint textPaint = new TextPaint(d0Var.getPaint());
        boolean z2 = false;
        if (i4 >= 23) {
            i3 = 1;
            i2 = 1;
        } else {
            i3 = 0;
            i2 = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (i4 >= 23) {
            i3 = n.a(d0Var);
            i2 = n.d(d0Var);
        }
        if (d0Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i4 < 28 || (d0Var.getInputType() & 15) != 3) {
            if (d0Var.getLayoutDirection() == 1) {
                z2 = true;
            }
            switch (d0Var.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z2) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(p.b(o.a(d0Var.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new L.g(textPaint, textDirectionHeuristic, i3, i2);
    }

    public static boolean a0(int i2) {
        double d2;
        double d3;
        double d4;
        if (i2 != 0) {
            ThreadLocal threadLocal = F.a.f224a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i2);
            int green = Color.green(i2);
            int blue = Color.blue(i2);
            if (dArr.length == 3) {
                double d5 = ((double) red) / 255.0d;
                if (d5 < 0.04045d) {
                    d2 = d5 / 12.92d;
                } else {
                    d2 = Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
                }
                double d6 = ((double) green) / 255.0d;
                if (d6 < 0.04045d) {
                    d3 = d6 / 12.92d;
                } else {
                    d3 = Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
                }
                double d7 = ((double) blue) / 255.0d;
                if (d7 < 0.04045d) {
                    d4 = d7 / 12.92d;
                } else {
                    d4 = Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
                }
                dArr[0] = ((0.1805d * d4) + (0.3576d * d3) + (0.4124d * d2)) * 100.0d;
                double d8 = ((0.0722d * d4) + (0.7152d * d3) + (0.2126d * d2)) * 100.0d;
                dArr[1] = d8;
                double d9 = d4 * 0.9505d;
                dArr[2] = (d9 + (d3 * 0.1192d) + (d2 * 0.0193d)) * 100.0d;
                if (d8 / 100.0d > 0.5d) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
        }
        return false;
    }

    public static boolean e0(String str, String str2) {
        if (!str.startsWith(str2.concat("(")) || !str.endsWith(")")) {
            return false;
        }
        return true;
    }

    public static void h(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void i(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static Typeface i0(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, l(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    public static void j(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int l(int i2, int i3, int i4) {
        if (i2 < i3) {
            return i3;
        }
        if (i2 > i4) {
            return i4;
        }
        return i2;
    }

    public static void m(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            m(((InsetDrawable) drawable).getDrawable());
        } else if (drawable instanceof h) {
            m(((i) ((h) drawable)).f256k);
        } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
            int childCount = drawableContainerState.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                Drawable child = drawableContainerState.getChild(i2);
                if (child != null) {
                    m(child);
                }
            }
        }
    }

    public static float m0(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e.c(edgeEffect, f2, f3);
        }
        d.a(edgeEffect, f2, f3);
        return f2;
    }

    public static void n(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static ImageView.ScaleType o(int i2) {
        if (i2 == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i2 == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i2 == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i2 == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i2 == 5) {
            return ImageView.ScaleType.CENTER_CROP;
        }
        if (i2 != 6) {
            return ImageView.ScaleType.CENTER;
        }
        return ImageView.ScaleType.CENTER_INSIDE;
    }

    public static TypedValue o0(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static float[] p(float[] fArr, int i2) {
        if (i2 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i2, length);
                float[] fArr2 = new float[i2];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static TimeInterpolator r0(Context context, int i2, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!e0(valueOf, "cubic-bezier") && !e0(valueOf, "path")) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (e0(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    return P.a.b(S(split, 0), S(split, 1), S(split, 2), S(split, 3));
                }
                throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
            } else if (e0(valueOf, "path")) {
                return P.a.c(y(valueOf.substring(5, valueOf.length() - 1)));
            } else {
                throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
            }
        } else {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [p0.a, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [p0.a, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3, types: [p0.a, java.lang.Object] */
    public static C0320a s(int i2) {
        if (i2 == 0) {
            return new Object();
        }
        if (i2 != 1) {
            return new Object();
        }
        return new Object();
    }

    public static void w0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z2;
        WeakHashMap weakHashMap = Q.f509a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z3 = false;
        int i2 = 1;
        if (onLongClickListener != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (hasOnClickListeners || z2) {
            z3 = true;
        }
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        if (!z3) {
            i2 = 2;
        }
        checkableImageButton.setImportantForAccessibility(i2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
        r13 = false;
        r15 = true;
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008f, code lost:
        r13 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0098 A[Catch:{ NumberFormatException -> 0x00ac }, LOOP:3: B:22:0x006a->B:41:0x0098, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0097 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static F.f[] x(java.lang.String r17) {
        /*
            r0 = r17
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r4 = 1
            r5 = 0
        L_0x000a:
            int r6 = r17.length()
            if (r4 >= r6) goto L_0x00e0
        L_0x0010:
            int r6 = r17.length()
            r7 = 69
            r8 = 101(0x65, float:1.42E-43)
            if (r4 >= r6) goto L_0x0036
            char r6 = r0.charAt(r4)
            int r9 = r6 + -65
            int r10 = r6 + -90
            int r10 = r10 * r9
            if (r10 <= 0) goto L_0x002e
            int r9 = r6 + -97
            int r10 = r6 + -122
            int r10 = r10 * r9
            if (r10 > 0) goto L_0x0033
        L_0x002e:
            if (r6 == r8) goto L_0x0033
            if (r6 == r7) goto L_0x0033
            goto L_0x0036
        L_0x0033:
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0036:
            java.lang.String r5 = r0.substring(r5, r4)
            java.lang.String r5 = r5.trim()
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x00d9
            char r6 = r5.charAt(r2)
            r9 = 122(0x7a, float:1.71E-43)
            if (r6 == r9) goto L_0x00cb
            char r6 = r5.charAt(r2)
            r9 = 90
            if (r6 != r9) goto L_0x0056
            goto L_0x00cb
        L_0x0056:
            int r6 = r5.length()     // Catch:{ NumberFormatException -> 0x00ac }
            float[] r6 = new float[r6]     // Catch:{ NumberFormatException -> 0x00ac }
            int r9 = r5.length()     // Catch:{ NumberFormatException -> 0x00ac }
            r10 = 1
            r11 = 0
        L_0x0062:
            if (r10 >= r9) goto L_0x00b6
            r12 = r10
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x006a:
            int r3 = r5.length()     // Catch:{ NumberFormatException -> 0x00ac }
            if (r12 >= r3) goto L_0x009c
            char r3 = r5.charAt(r12)     // Catch:{ NumberFormatException -> 0x00ac }
            r2 = 32
            if (r3 == r2) goto L_0x0093
            if (r3 == r7) goto L_0x0091
            if (r3 == r8) goto L_0x0091
            switch(r3) {
                case 44: goto L_0x0093;
                case 45: goto L_0x008a;
                case 46: goto L_0x0080;
                default: goto L_0x007f;
            }     // Catch:{ NumberFormatException -> 0x00ac }
        L_0x007f:
            goto L_0x008f
        L_0x0080:
            if (r14 != 0) goto L_0x0085
            r13 = 0
            r14 = 1
            goto L_0x0095
        L_0x0085:
            r13 = 0
            r15 = 1
            r16 = 1
            goto L_0x0095
        L_0x008a:
            if (r12 == r10) goto L_0x008f
            if (r13 != 0) goto L_0x008f
            goto L_0x0085
        L_0x008f:
            r13 = 0
            goto L_0x0095
        L_0x0091:
            r13 = 1
            goto L_0x0095
        L_0x0093:
            r13 = 0
            r15 = 1
        L_0x0095:
            if (r15 == 0) goto L_0x0098
            goto L_0x009c
        L_0x0098:
            int r12 = r12 + 1
            r2 = 0
            goto L_0x006a
        L_0x009c:
            if (r10 >= r12) goto L_0x00ae
            int r2 = r11 + 1
            java.lang.String r3 = r5.substring(r10, r12)     // Catch:{ NumberFormatException -> 0x00ac }
            float r3 = java.lang.Float.parseFloat(r3)     // Catch:{ NumberFormatException -> 0x00ac }
            r6[r11] = r3     // Catch:{ NumberFormatException -> 0x00ac }
            r11 = r2
            goto L_0x00ae
        L_0x00ac:
            r0 = move-exception
            goto L_0x00bd
        L_0x00ae:
            if (r16 == 0) goto L_0x00b3
            r10 = r12
        L_0x00b1:
            r2 = 0
            goto L_0x0062
        L_0x00b3:
            int r10 = r12 + 1
            goto L_0x00b1
        L_0x00b6:
            float[] r2 = p(r6, r11)     // Catch:{ NumberFormatException -> 0x00ac }
            r3 = r2
            r2 = 0
            goto L_0x00cd
        L_0x00bd:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "error in parsing \""
            java.lang.String r3 = "\""
            java.lang.String r2 = Q0.E.g(r2, r5, r3)
            r1.<init>(r2, r0)
            throw r1
        L_0x00cb:
            float[] r3 = new float[r2]
        L_0x00cd:
            char r5 = r5.charAt(r2)
            F.f r2 = new F.f
            r2.<init>(r5, r3)
            r1.add(r2)
        L_0x00d9:
            int r2 = r4 + 1
            r5 = r4
            r4 = r2
            r2 = 0
            goto L_0x000a
        L_0x00e0:
            int r4 = r4 - r5
            r2 = 1
            if (r4 != r2) goto L_0x00fa
            int r2 = r17.length()
            if (r5 >= r2) goto L_0x00fa
            char r0 = r0.charAt(r5)
            r2 = 0
            float[] r3 = new float[r2]
            F.f r4 = new F.f
            r4.<init>(r0, r3)
            r1.add(r4)
            goto L_0x00fb
        L_0x00fa:
            r2 = 0
        L_0x00fb:
            F.f[] r0 = new F.f[r2]
            java.lang.Object[] r0 = r1.toArray(r0)
            F.f[] r0 = (F.f[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.C0320a.x(java.lang.String):F.f[]");
    }

    public static Path y(String str) {
        Path path = new Path();
        try {
            f.b(x(str), path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing ".concat(str), e2);
        }
    }

    public static Drawable z(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        boolean z2;
        if (Build.VERSION.SDK_INT < 23) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            Drawable mutate = J0(drawable).mutate();
            if (mode == null) {
                return mutate;
            }
            G.a.i(mutate, mode);
            return mutate;
        } else if (!z2) {
            return drawable;
        } else {
            drawable.mutate();
            return drawable;
        }
    }

    public k D(int i2, k[] kVarArr) {
        int i3;
        boolean z2;
        int i4;
        new K0.e(1);
        if ((i2 & 1) == 0) {
            i3 = 400;
        } else {
            i3 = 700;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        k kVar = null;
        int i5 = Integer.MAX_VALUE;
        for (k kVar2 : kVarArr) {
            int abs = Math.abs(kVar2.f336c - i3) * 2;
            if (kVar2.f337d == z2) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            int i6 = abs + i4;
            if (kVar == null || i5 > i6) {
                kVar = kVar2;
                i5 = i6;
            }
        }
        return kVar;
    }

    public void b() {
    }

    public void c() {
    }

    public void t0(boolean z2) {
    }

    public void u0(boolean z2) {
    }

    public C0320a() {
        new ConcurrentHashMap();
    }

    public static void D0(Drawable drawable, int i2) {
        G.a.g(drawable, i2);
    }

    public static int G(Context context, int i2, int i3) {
        Integer num;
        int i4;
        TypedValue o02 = o0(context, i2);
        if (o02 != null) {
            int i5 = o02.resourceId;
            if (i5 != 0) {
                i4 = F(context, i5);
            } else {
                i4 = o02.data;
            }
            num = Integer.valueOf(i4);
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return i3;
    }

    public static int H(View view, int i2) {
        Context context = view.getContext();
        TypedValue s02 = s0(view.getContext(), i2, view.getClass().getCanonicalName());
        int i3 = s02.resourceId;
        if (i3 != 0) {
            return F(context, i3);
        }
        return s02.data;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r5.f112c == r8.hashCode()) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList I(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            E.n r1 = new E.n
            r1.<init>(r0, r8)
            java.lang.Object r2 = E.r.f123c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = E.r.f122b     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003c }
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch:{ all -> 0x003c }
            r4 = 0
            if (r3 == 0) goto L_0x004f
            int r5 = r3.size()     // Catch:{ all -> 0x003c }
            if (r5 <= 0) goto L_0x004f
            java.lang.Object r5 = r3.get(r9)     // Catch:{ all -> 0x003c }
            E.m r5 = (E.m) r5     // Catch:{ all -> 0x003c }
            if (r5 == 0) goto L_0x004f
            android.content.res.Configuration r6 = r5.f111b     // Catch:{ all -> 0x003c }
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch:{ all -> 0x003c }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x003c }
            if (r6 == 0) goto L_0x004c
            if (r8 != 0) goto L_0x003e
            int r6 = r5.f112c     // Catch:{ all -> 0x003c }
            if (r6 == 0) goto L_0x0048
            goto L_0x003e
        L_0x003c:
            r8 = move-exception
            goto L_0x009d
        L_0x003e:
            if (r8 == 0) goto L_0x004c
            int r6 = r5.f112c     // Catch:{ all -> 0x003c }
            int r7 = r8.hashCode()     // Catch:{ all -> 0x003c }
            if (r6 != r7) goto L_0x004c
        L_0x0048:
            android.content.res.ColorStateList r3 = r5.f110a     // Catch:{ all -> 0x003c }
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            goto L_0x0051
        L_0x004c:
            r3.remove(r9)     // Catch:{ all -> 0x003c }
        L_0x004f:
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            r3 = r4
        L_0x0051:
            if (r3 == 0) goto L_0x0054
            goto L_0x009c
        L_0x0054:
            java.lang.ThreadLocal r2 = E.r.f121a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L_0x0066
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L_0x0066:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L_0x0075
            r3 = 31
            if (r2 > r3) goto L_0x0075
            goto L_0x0086
        L_0x0075:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = E.c.a(r0, r2, r8)     // Catch:{ Exception -> 0x007e }
            goto L_0x0086
        L_0x007e:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L_0x0086:
            if (r4 == 0) goto L_0x008d
            E.r.a(r1, r9, r4, r8)
            r3 = r4
            goto L_0x009c
        L_0x008d:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L_0x0098
            android.content.res.ColorStateList r3 = E.l.b(r0, r9, r8)
            goto L_0x009c
        L_0x0098:
            android.content.res.ColorStateList r3 = r0.getColorStateList(r9)
        L_0x009c:
            return r3
        L_0x009d:
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.C0320a.I(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static ColorStateList J(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList I;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (I = I(context, resourceId)) == null) {
            return typedArray.getColorStateList(i2);
        }
        return I;
    }

    public static Drawable O(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable n2;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (n2 = T0.g.n(context, resourceId)) == null) {
            return typedArray.getDrawable(i2);
        }
        return n2;
    }

    public static File Y(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        int i2 = 0;
        while (i2 < 100) {
            File file = new File(cacheDir, str + i2);
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i2++;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static boolean b0(EditText editText) {
        if (editText.getInputType() != 0) {
            return true;
        }
        return false;
    }

    public static void d(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = J0(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                G.a.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                G.a.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                G.a.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static boolean d0(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static int h0(int i2, int i3, float f2) {
        return F.a.b(F.a.d(i3, Math.round(((float) Color.alpha(i3)) * f2)), i2);
    }

    public static MappedByteBuffer j0(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        FileInputStream fileInputStream;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", (CancellationSignal) null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
            fileInputStream.close();
            openFileDescriptor.close();
            return map;
            throw th;
            throw th;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int k(android.content.Context r9, java.lang.String r10) {
        /*
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = r9.getPackageName()
            int r0 = r9.checkPermission(r10, r0, r1)
            r3 = -1
            if (r0 != r3) goto L_0x0015
            goto L_0x0086
        L_0x0015:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r0 < r4) goto L_0x0020
            java.lang.String r10 = C.f.d(r10)
            goto L_0x0021
        L_0x0020:
            r10 = 0
        L_0x0021:
            r5 = 0
            if (r10 != 0) goto L_0x0026
        L_0x0024:
            r3 = 0
            goto L_0x0086
        L_0x0026:
            if (r2 != 0) goto L_0x0038
            android.content.pm.PackageManager r2 = r9.getPackageManager()
            java.lang.String[] r2 = r2.getPackagesForUid(r1)
            if (r2 == 0) goto L_0x0086
            int r6 = r2.length
            if (r6 > 0) goto L_0x0036
            goto L_0x0086
        L_0x0036:
            r2 = r2[r5]
        L_0x0038:
            int r3 = android.os.Process.myUid()
            java.lang.String r6 = r9.getPackageName()
            r7 = 1
            java.lang.Class<android.app.AppOpsManager> r8 = android.app.AppOpsManager.class
            if (r3 != r1) goto L_0x0074
            boolean r3 = java.util.Objects.equals(r6, r2)
            if (r3 == 0) goto L_0x0074
            r3 = 29
            if (r0 < r3) goto L_0x0067
            android.app.AppOpsManager r0 = C.g.c(r9)
            int r3 = android.os.Binder.getCallingUid()
            int r2 = C.g.a(r0, r10, r3, r2)
            if (r2 == 0) goto L_0x005e
            goto L_0x0081
        L_0x005e:
            java.lang.String r9 = C.g.b(r9)
            int r2 = C.g.a(r0, r10, r1, r9)
            goto L_0x0081
        L_0x0067:
            if (r0 < r4) goto L_0x0080
            java.lang.Object r9 = C.f.a(r9, r8)
            android.app.AppOpsManager r9 = (android.app.AppOpsManager) r9
            int r7 = C.f.c(r9, r10, r2)
            goto L_0x0080
        L_0x0074:
            if (r0 < r4) goto L_0x0080
            java.lang.Object r9 = C.f.a(r9, r8)
            android.app.AppOpsManager r9 = (android.app.AppOpsManager) r9
            int r7 = C.f.c(r9, r10, r2)
        L_0x0080:
            r2 = r7
        L_0x0081:
            if (r2 != 0) goto L_0x0084
            goto L_0x0024
        L_0x0084:
            r9 = -2
            r3 = -2
        L_0x0086:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.C0320a.k(android.content.Context, java.lang.String):int");
    }

    public static void n0(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = J0(drawable).mutate();
            G.a.h(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static boolean p0(Context context, int i2, boolean z2) {
        TypedValue o02 = o0(context, i2);
        if (o02 == null || o02.type != 18) {
            return z2;
        }
        if (o02.data != 0) {
            return true;
        }
        return false;
    }

    public static boolean q(File file, Resources resources, int i2) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i2);
            try {
                boolean r2 = r(file, inputStream);
                n(inputStream);
                return r2;
            } catch (Throwable th) {
                th = th;
                n(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            n(inputStream);
            throw th;
        }
    }

    public static int q0(Context context, int i2, int i3) {
        TypedValue o02 = o0(context, i2);
        if (o02 == null || o02.type != 16) {
            return i3;
        }
        return o02.data;
    }

    public static boolean r(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        n(fileOutputStream2);
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return true;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                fileOutputStream = fileOutputStream2;
                try {
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    n(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    n(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                n(fileOutputStream);
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            n(fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        }
    }

    public static TypedValue s0(Context context, int i2, String str) {
        TypedValue o02 = o0(context, i2);
        if (o02 != null) {
            return o02;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i2)}));
    }

    public static void v0(TextView textView, int i2) {
        int i3;
        i(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            p.d(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i3 = fontMetricsInt.top;
        } else {
            i3 = fontMetricsInt.ascent;
        }
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void x0(TextView textView, int i2) {
        int i3;
        i(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i3 = fontMetricsInt.bottom;
        } else {
            i3 = fontMetricsInt.descent;
        }
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static void z0(TextView textView, int i2) {
        i(i2);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i2 != fontMetricsInt) {
            textView.setLineSpacing((float) (i2 - fontMetricsInt), 1.0f);
        }
    }

    public Typeface v(Context context, InputStream inputStream) {
        File Y2 = Y(context);
        if (Y2 == null) {
            return null;
        }
        try {
            if (!r(Y2, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(Y2.getPath());
            Y2.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            Y2.delete();
        }
    }

    public Typeface w(Context context, Resources resources, int i2, String str, int i3) {
        File Y2 = Y(context);
        if (Y2 == null) {
            return null;
        }
        try {
            if (!q(Y2, resources, i2)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(Y2.getPath());
            Y2.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            Y2.delete();
        }
    }
}
