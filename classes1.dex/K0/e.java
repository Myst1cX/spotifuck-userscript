package K0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.J;
import androidx.lifecycle.M;
import androidx.lifecycle.O;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import b0.c;
import c0.C0087a;
import h0.C0128e;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import n.C0197l;
import n.C0208w;
import n0.C0243x;
import n0.C0245z;
import p0.C0320a;
import q0.C0322a;

public class e implements O, C0128e, C0208w {

    /* renamed from: g  reason: collision with root package name */
    public static e f348g = null;

    /* renamed from: h  reason: collision with root package name */
    public static e f349h = null;
    public static e i = null;

    /* renamed from: j  reason: collision with root package name */
    public static boolean f350j = true;

    /* renamed from: k  reason: collision with root package name */
    public static Method f351k = null;

    /* renamed from: l  reason: collision with root package name */
    public static boolean f352l = false;

    /* renamed from: m  reason: collision with root package name */
    public static Field f353m = null;

    /* renamed from: n  reason: collision with root package name */
    public static boolean f354n = false;

    /* renamed from: o  reason: collision with root package name */
    public static boolean f355o = true;

    /* renamed from: p  reason: collision with root package name */
    public static boolean f356p = true;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f357f;

    public /* synthetic */ e(int i2) {
        this.f357f = i2;
    }

    public static e a(Context context, int i2) {
        boolean z2;
        if (i2 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0320a.h("Cannot create a CalendarItemStyle with a styleResId of 0", z2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, C0322a.f4494m);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        C0320a.J(context, obtainStyledAttributes, 4);
        C0320a.J(context, obtainStyledAttributes, 9);
        C0320a.J(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        k.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new a((float) 0)).a();
        obtainStyledAttributes.recycle();
        e eVar = new e(17);
        C0320a.i(rect.left);
        C0320a.i(rect.top);
        C0320a.i(rect.right);
        C0320a.i(rect.bottom);
        return eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0075, code lost:
        if (r11 != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0082, code lost:
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean i(X.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x00ef
            if (r9 < 0) goto L_0x00ef
            if (r10 >= 0) goto L_0x0009
            goto L_0x00ef
        L_0x0009:
            int r1 = android.text.Selection.getSelectionStart(r8)
            int r2 = android.text.Selection.getSelectionEnd(r8)
            r3 = -1
            if (r1 == r3) goto L_0x00ef
            if (r2 == r3) goto L_0x00ef
            if (r1 == r2) goto L_0x001a
            goto L_0x00ef
        L_0x001a:
            r4 = 1
            if (r11 == 0) goto L_0x00a5
            int r9 = java.lang.Math.max(r9, r0)
            int r11 = r8.length()
            if (r1 < 0) goto L_0x002c
            if (r11 >= r1) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            if (r9 >= 0) goto L_0x002e
        L_0x002c:
            r1 = -1
            goto L_0x005d
        L_0x002e:
            r11 = 0
        L_0x002f:
            if (r9 != 0) goto L_0x0032
            goto L_0x005d
        L_0x0032:
            int r1 = r1 + -1
            if (r1 >= 0) goto L_0x003b
            if (r11 == 0) goto L_0x0039
            goto L_0x002c
        L_0x0039:
            r1 = 0
            goto L_0x005d
        L_0x003b:
            char r5 = r8.charAt(r1)
            if (r11 == 0) goto L_0x004b
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 != 0) goto L_0x0048
            goto L_0x002c
        L_0x0048:
            int r9 = r9 + -1
            goto L_0x002e
        L_0x004b:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L_0x0054
            int r9 = r9 + -1
            goto L_0x002f
        L_0x0054:
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 == 0) goto L_0x005b
            goto L_0x002c
        L_0x005b:
            r11 = 1
            goto L_0x002f
        L_0x005d:
            int r9 = java.lang.Math.max(r10, r0)
            int r10 = r8.length()
            if (r2 < 0) goto L_0x006c
            if (r10 >= r2) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            if (r9 >= 0) goto L_0x006e
        L_0x006c:
            r10 = -1
            goto L_0x00a0
        L_0x006e:
            r11 = 0
        L_0x006f:
            if (r9 != 0) goto L_0x0073
            r10 = r2
            goto L_0x00a0
        L_0x0073:
            if (r2 < r10) goto L_0x0078
            if (r11 == 0) goto L_0x00a0
            goto L_0x006c
        L_0x0078:
            char r5 = r8.charAt(r2)
            if (r11 == 0) goto L_0x008a
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 != 0) goto L_0x0085
            goto L_0x006c
        L_0x0085:
            int r9 = r9 + -1
            int r2 = r2 + 1
            goto L_0x006e
        L_0x008a:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L_0x0095
            int r9 = r9 + -1
            int r2 = r2 + 1
            goto L_0x006f
        L_0x0095:
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 == 0) goto L_0x009c
            goto L_0x006c
        L_0x009c:
            int r2 = r2 + 1
            r11 = 1
            goto L_0x006f
        L_0x00a0:
            if (r1 == r3) goto L_0x00ef
            if (r10 != r3) goto L_0x00b3
            goto L_0x00ef
        L_0x00a5:
            int r1 = r1 - r9
            int r1 = java.lang.Math.max(r1, r0)
            int r2 = r2 + r10
            int r9 = r8.length()
            int r10 = java.lang.Math.min(r2, r9)
        L_0x00b3:
            java.lang.Class<androidx.emoji2.text.v> r9 = androidx.emoji2.text.v.class
            java.lang.Object[] r9 = r8.getSpans(r1, r10, r9)
            androidx.emoji2.text.v[] r9 = (androidx.emoji2.text.v[]) r9
            if (r9 == 0) goto L_0x00ef
            int r11 = r9.length
            if (r11 <= 0) goto L_0x00ef
            int r11 = r9.length
            r2 = 0
        L_0x00c2:
            if (r2 >= r11) goto L_0x00d9
            r3 = r9[r2]
            int r5 = r8.getSpanStart(r3)
            int r3 = r8.getSpanEnd(r3)
            int r1 = java.lang.Math.min(r5, r1)
            int r10 = java.lang.Math.max(r3, r10)
            int r2 = r2 + 1
            goto L_0x00c2
        L_0x00d9:
            int r9 = java.lang.Math.max(r1, r0)
            int r11 = r8.length()
            int r10 = java.lang.Math.min(r10, r11)
            r7.beginBatchEdit()
            r8.delete(r9, r10)
            r7.endBatchEdit()
            r0 = 1
        L_0x00ef:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.e.i(X.b, android.text.Editable, int, int, boolean):boolean");
    }

    public boolean h(C0197l lVar) {
        return false;
    }

    public boolean j(CharSequence charSequence) {
        return false;
    }

    public void n(View view, int i2, int i3, int i4, int i5) {
        if (!f352l) {
            Class<View> cls = View.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("setFrame", new Class[]{cls2, cls2, cls2, cls2});
                f351k = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f352l = true;
        }
        Method method = f351k;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    public e(View view, int i2) {
        this.f357f = i2;
        switch (i2) {
            case 4:
                if (Build.VERSION.SDK_INT >= 30) {
                    new e(view, 3);
                    return;
                } else {
                    new e(view, 3);
                    return;
                }
            default:
                return;
        }
    }

    public static Path c(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(f2, f3);
        path.lineTo(f4, f5);
        return path;
    }

    private final void l(int i2, Serializable serializable) {
    }

    public void b(C0197l lVar, boolean z2) {
    }

    public Signature[] d(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public M e(Class cls, c cVar) {
        switch (this.f357f) {
            case 15:
                return g(cls);
            default:
                return g(cls);
        }
    }

    public float f(View view) {
        if (f350j) {
            try {
                return C0243x.a(view);
            } catch (NoSuchMethodError unused) {
                f350j = false;
            }
        }
        return view.getAlpha();
    }

    public M g(Class cls) {
        switch (this.f357f) {
            case 15:
                return new J(true);
            default:
                return new C0087a();
        }
    }

    public void k(int i2, Serializable serializable) {
        String str;
        switch (this.f357f) {
            case 20:
                return;
            default:
                switch (i2) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                    default:
                        str = "";
                        break;
                }
                if (i2 == 6 || i2 == 7 || i2 == 8) {
                    Log.e("ProfileInstaller", str, (Throwable) serializable);
                    return;
                }
                return;
        }
    }

    public CharSequence m(Preference preference) {
        switch (this.f357f) {
            case 18:
                EditTextPreference editTextPreference = (EditTextPreference) preference;
                if (TextUtils.isEmpty(editTextPreference.f1878S)) {
                    return editTextPreference.f1898a.getString(2131755216);
                }
                return editTextPreference.f1878S;
            default:
                ListPreference listPreference = (ListPreference) preference;
                if (TextUtils.isEmpty(listPreference.x())) {
                    return listPreference.f1898a.getString(2131755216);
                }
                return listPreference.x();
        }
    }

    public void o(View view, float f2) {
        if (f350j) {
            try {
                C0243x.b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                f350j = false;
            }
        }
        view.setAlpha(f2);
    }

    public void p(View view, int i2) {
        if (!f354n) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f353m = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f354n = true;
        }
        Field field = f353m;
        if (field != null) {
            try {
                f353m.setInt(view, i2 | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void q(View view, Matrix matrix) {
        if (f355o) {
            try {
                C0245z.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f355o = false;
            }
        }
    }

    public void r(View view, Matrix matrix) {
        if (f356p) {
            try {
                C0245z.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f356p = false;
            }
        }
    }
}
