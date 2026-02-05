package T0;

import A.k;
import N.C;
import Z0.a;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Trace;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import d1.b;
import g1.u;
import h1.c;
import j0.K;
import j0.X;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import n0.C0241v;
import o.P0;
import o.g1;
import o.i1;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static Field f930a = null;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f931b = false;

    /* renamed from: c  reason: collision with root package name */
    public static Class f932c = null;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f933d = false;
    public static Field e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f934f = false;

    /* renamed from: g  reason: collision with root package name */
    public static Field f935g = null;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f936h = false;
    public static long i = 0;

    /* renamed from: j  reason: collision with root package name */
    public static Method f937j = null;

    /* renamed from: k  reason: collision with root package name */
    public static boolean f938k = true;

    public static boolean w() {
        try {
            if (f937j == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        Class<Trace> cls = Trace.class;
        try {
            if (f937j == null) {
                i = cls.getField("TRACE_TAG_APP").getLong((Object) null);
                f937j = cls.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f937j.invoke((Object) null, new Object[]{Long.valueOf(i)})).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public abstract void A(Throwable th);

    public abstract void B(k kVar);

    public abstract void D(int i2);

    public abstract void E(View view, int i2, int i3);

    public abstract void F(View view, float f2, float f3);

    public abstract Object G(Intent intent, int i2);

    public abstract void L(boolean z2);

    public abstract void M(boolean z2);

    public abstract void O();

    public abstract void P();

    public abstract boolean S(View view, int i2);

    public abstract TransformationMethod T(TransformationMethod transformationMethod);

    public boolean e() {
        return false;
    }

    public abstract int f(View view, int i2);

    public abstract int g(View view, int i2);

    public abstract List h(String str, List list);

    public abstract InputFilter[] p(InputFilter[] inputFilterArr);

    public int r(View view) {
        return 0;
    }

    public int s() {
        return 0;
    }

    public abstract boolean v();

    public static boolean H(String str) {
        if (str.equals("GET") || str.equals("HEAD")) {
            return false;
        }
        return true;
    }

    public static String J(u uVar) {
        String str = uVar.f2780h;
        int indexOf = str.indexOf(47, uVar.f2774a.length() + 3);
        String substring = str.substring(indexOf, c.h(str, indexOf, str.length(), "?#"));
        String e2 = uVar.e();
        if (e2 == null) {
            return substring;
        }
        return substring + '?' + e2;
    }

    public static void N(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            g1.a(view, charSequence);
            return;
        }
        i1 i1Var = i1.f4219p;
        if (i1Var != null && i1Var.f4221f == view) {
            i1.b((i1) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            i1 i1Var2 = i1.f4220q;
            if (i1Var2 != null && i1Var2.f4221f == view) {
                i1Var2.a();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new i1(view, charSequence);
    }

    public static void Q(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C0241v.b(viewGroup, z2);
        } else if (f938k) {
            try {
                C0241v.b(viewGroup, z2);
            } catch (NoSuchMethodError unused) {
                f938k = false;
            }
        }
    }

    public static void U(Parcel parcel, Parcelable parcelable, int i2) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i2);
            return;
        }
        parcel.writeInt(0);
    }

    public static boolean d(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [androidx.emoji2.text.g, androidx.emoji2.text.q] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.emoji2.text.q l(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x000e
            androidx.emoji2.text.c r0 = new androidx.emoji2.text.c
            r1 = 10
            r0.<init>(r1)
            goto L_0x0015
        L_0x000e:
            K0.e r0 = new K0.e
            r1 = 10
            r0.<init>(r1)
        L_0x0015:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            p0.C0320a.j(r2, r1)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x002e:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x004a
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L_0x002e
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L_0x002e
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L_0x002e
            goto L_0x004b
        L_0x004a:
            r4 = r5
        L_0x004b:
            if (r4 != 0) goto L_0x004f
        L_0x004d:
            r1 = r5
            goto L_0x007e
        L_0x004f:
            java.lang.String r2 = r4.authority     // Catch:{ NameNotFoundException -> 0x0077 }
            java.lang.String r4 = r4.packageName     // Catch:{ NameNotFoundException -> 0x0077 }
            android.content.pm.Signature[] r0 = r0.d(r1, r4)     // Catch:{ NameNotFoundException -> 0x0077 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x0077 }
            r1.<init>()     // Catch:{ NameNotFoundException -> 0x0077 }
            int r6 = r0.length     // Catch:{ NameNotFoundException -> 0x0077 }
        L_0x005d:
            if (r3 >= r6) goto L_0x006b
            r7 = r0[r3]     // Catch:{ NameNotFoundException -> 0x0077 }
            byte[] r7 = r7.toByteArray()     // Catch:{ NameNotFoundException -> 0x0077 }
            r1.add(r7)     // Catch:{ NameNotFoundException -> 0x0077 }
            int r3 = r3 + 1
            goto L_0x005d
        L_0x006b:
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch:{ NameNotFoundException -> 0x0077 }
            K.e r1 = new K.e     // Catch:{ NameNotFoundException -> 0x0077 }
            java.lang.String r3 = "emojicompat-emoji-font"
            r1.<init>(r2, r4, r3, r0)     // Catch:{ NameNotFoundException -> 0x0077 }
            goto L_0x007e
        L_0x0077:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L_0x004d
        L_0x007e:
            if (r1 != 0) goto L_0x0081
            goto L_0x008b
        L_0x0081:
            androidx.emoji2.text.q r5 = new androidx.emoji2.text.q
            androidx.emoji2.text.p r0 = new androidx.emoji2.text.p
            r0.<init>(r8, r1)
            r5.<init>((androidx.emoji2.text.i) r0)
        L_0x008b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.g.l(android.content.Context):androidx.emoji2.text.q");
    }

    public static void m(Object obj) {
        LongSparseArray longSparseArray;
        if (!f933d) {
            try {
                f932c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f933d = true;
        }
        Class cls = f932c;
        if (cls != null) {
            if (!f934f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
                }
                f934f = true;
            }
            Field field = e;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e4) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }

    public static Set o() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", (Class[]) null).invoke((Object) null, (Object[]) null);
            if (invoke == null) {
                return Collections.emptySet();
            }
            Set<Object> set = (Set) invoke;
            for (Object obj : set) {
                if (!(obj instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static final Class q(b bVar) {
        Z0.c.e("<this>", bVar);
        Class a2 = ((a) bVar).a();
        if (!a2.isPrimitive()) {
            return a2;
        }
        String name = a2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                    return a2;
                }
                return Double.class;
            case 104431:
                if (!name.equals("int")) {
                    return a2;
                }
                return Integer.class;
            case 3039496:
                if (!name.equals("byte")) {
                    return a2;
                }
                return Byte.class;
            case 3052374:
                if (!name.equals("char")) {
                    return a2;
                }
                return Character.class;
            case 3327612:
                if (!name.equals("long")) {
                    return a2;
                }
                return Long.class;
            case 3625364:
                if (!name.equals("void")) {
                    return a2;
                }
                return Void.class;
            case 64711720:
                if (!name.equals("boolean")) {
                    return a2;
                }
                return Boolean.class;
            case 97526364:
                if (!name.equals("float")) {
                    return a2;
                }
                return Float.class;
            case 109413500:
                if (!name.equals("short")) {
                    return a2;
                }
                return Short.class;
            default:
                return a2;
        }
    }

    public static boolean t(String str) {
        if (str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE")) {
            return true;
        }
        return false;
    }

    public static boolean u(int i2, Rect rect, Rect rect2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            if ((i3 > i4 || rect.left >= i4) && rect.left > rect2.left) {
                return true;
            }
            return false;
        } else if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if ((i5 > i6 || rect.top >= i6) && rect.top > rect2.top) {
                return true;
            }
            return false;
        } else if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            if ((i7 < i8 || rect.right <= i8) && rect.right < rect2.right) {
                return true;
            }
            return false;
        } else if (i2 == 130) {
            int i9 = rect.top;
            int i10 = rect2.top;
            if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
                return true;
            }
            return false;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public static int x(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else if (i2 == 130) {
            i3 = rect2.top;
            i4 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return Math.max(0, i3 - i4);
    }

    public static int y(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static void z(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
    }

    public void C(View view, int i2) {
    }

    public void K() {
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [N.C, W.b] */
    public static W.b I(MappedByteBuffer mappedByteBuffer) {
        long j2;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i2 = duplicate.getShort() & 65535;
        if (i2 <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    j2 = -1;
                    break;
                }
                int i4 = duplicate.getInt();
                duplicate.position(duplicate.position() + 4);
                j2 = ((long) duplicate.getInt()) & 4294967295L;
                duplicate.position(duplicate.position() + 4);
                if (1835365473 == i4) {
                    break;
                }
                i3++;
            }
            if (j2 != -1) {
                duplicate.position(duplicate.position() + ((int) (j2 - ((long) duplicate.position()))));
                duplicate.position(duplicate.position() + 12);
                long j3 = ((long) duplicate.getInt()) & 4294967295L;
                for (int i5 = 0; ((long) i5) < j3; i5++) {
                    int i6 = duplicate.getInt();
                    long j4 = ((long) duplicate.getInt()) & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i6 || 1701669481 == i6) {
                        duplicate.position((int) (j4 + j2));
                        ? c2 = new C();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        c2.f500d = duplicate;
                        c2.f497a = position;
                        int i7 = position - duplicate.getInt(position);
                        c2.f498b = i7;
                        c2.f499c = ((ByteBuffer) c2.f500d).getShort(i7);
                        return c2;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static int R(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i2});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static Object b(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r10.right <= r12.left) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r10.top >= r12.bottom) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r10.left >= r12.right) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = d(r9, r10, r11)
            boolean r1 = d(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L_0x0078
            if (r0 != 0) goto L_0x000f
            goto L_0x0078
        L_0x000f:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L_0x003d
            if (r9 == r3) goto L_0x0036
            if (r9 == r4) goto L_0x002f
            if (r9 != r1) goto L_0x0029
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L_0x0077
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x002f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L_0x0077
            goto L_0x0043
        L_0x0036:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L_0x0077
            goto L_0x0043
        L_0x003d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L_0x0077
        L_0x0043:
            if (r9 == r5) goto L_0x0077
            if (r9 != r4) goto L_0x0048
            goto L_0x0077
        L_0x0048:
            int r11 = x(r9, r10, r11)
            if (r9 == r5) goto L_0x006a
            if (r9 == r3) goto L_0x0065
            if (r9 == r4) goto L_0x0060
            if (r9 != r1) goto L_0x005a
            int r9 = r12.bottom
            int r10 = r10.bottom
        L_0x0058:
            int r9 = r9 - r10
            goto L_0x006f
        L_0x005a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x0060:
            int r9 = r12.right
            int r10 = r10.right
            goto L_0x0058
        L_0x0065:
            int r9 = r10.top
            int r10 = r12.top
            goto L_0x0058
        L_0x006a:
            int r9 = r10.left
            int r10 = r12.left
            goto L_0x0058
        L_0x006f:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L_0x0076
            r2 = 1
        L_0x0076:
            return r2
        L_0x0077:
            return r6
        L_0x0078:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.g.c(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static int i(X x2, androidx.emoji2.text.g gVar, View view, View view2, K k2, boolean z2) {
        if (k2.v() == 0 || x2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(K.H(view) - K.H(view2)) + 1;
        }
        return Math.min(gVar.l(), gVar.b(view2) - gVar.e(view));
    }

    public static int j(X x2, androidx.emoji2.text.g gVar, View view, View view2, K k2, boolean z2, boolean z3) {
        int i2;
        if (k2.v() == 0 || x2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(K.H(view), K.H(view2));
        int max = Math.max(K.H(view), K.H(view2));
        if (z3) {
            i2 = Math.max(0, (x2.b() - max) - 1);
        } else {
            i2 = Math.max(0, min);
        }
        if (!z2) {
            return i2;
        }
        return Math.round((((float) i2) * (((float) Math.abs(gVar.b(view2) - gVar.e(view))) / ((float) (Math.abs(K.H(view) - K.H(view2)) + 1)))) + ((float) (gVar.k() - gVar.e(view))));
    }

    public static int k(X x2, androidx.emoji2.text.g gVar, View view, View view2, K k2, boolean z2) {
        if (k2.v() == 0 || x2.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return x2.b();
        }
        return (int) ((((float) (gVar.b(view2) - gVar.e(view))) / ((float) (Math.abs(K.H(view) - K.H(view2)) + 1))) * ((float) x2.b()));
    }

    public static Drawable n(Context context, int i2) {
        return P0.d().f(context, i2);
    }
}
