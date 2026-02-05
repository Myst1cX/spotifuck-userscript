package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.i0  reason: case insensitive filesystem */
public final class C0283i0 {

    /* renamed from: l  reason: collision with root package name */
    public static final RectF f4208l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    public static final ConcurrentHashMap f4209m = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public int f4210a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4211b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f4212c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f4213d = -1.0f;
    public float e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f4214f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f4215g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f4216h;
    public final TextView i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f4217j;

    /* renamed from: k  reason: collision with root package name */
    public final C0281h0 f4218k;

    public static int[] b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f4209m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, (Class[]) null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    public final int c(RectF rectF) {
        StaticLayout staticLayout;
        CharSequence transformation;
        RectF rectF2 = rectF;
        int length = this.f4214f.length;
        if (length != 0) {
            int i2 = length - 1;
            int i3 = 1;
            int i4 = 0;
            while (i3 <= i2) {
                int i5 = (i3 + i2) / 2;
                int i6 = this.f4214f[i5];
                TextView textView = this.i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null)) {
                    text = transformation;
                }
                int maxLines = textView.getMaxLines();
                TextPaint textPaint = this.f4216h;
                if (textPaint == null) {
                    this.f4216h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f4216h.set(textView.getPaint());
                this.f4216h.setTextSize((float) i6);
                Layout.Alignment alignment = (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                int round = Math.round(rectF2.right);
                if (Build.VERSION.SDK_INT >= 23) {
                    staticLayout = C0275e0.a(text, alignment, round, maxLines, this.i, this.f4216h, this.f4218k);
                } else {
                    staticLayout = new StaticLayout(text, this.f4216h, round, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
                }
                if ((maxLines == -1 || (staticLayout.getLineCount() <= maxLines && staticLayout.getLineEnd(staticLayout.getLineCount() - 1) == text.length())) && ((float) staticLayout.getHeight()) <= rectF2.bottom) {
                    int i7 = i5 + 1;
                    i4 = i3;
                    i3 = i7;
                } else {
                    i4 = i5 - 1;
                    i2 = i4;
                }
            }
            return this.f4214f[i4];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final void g(int i2, float f2) {
        Resources resources;
        Context context = this.f4217j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i2, f2, resources.getDisplayMetrics());
        TextView textView = this.i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f4211b = false;
                try {
                    Method d2 = d("nullLayouts");
                    if (d2 != null) {
                        d2.invoke(textView, (Object[]) null);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (!isInLayout) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean i() {
        boolean z2;
        int[] iArr = this.f4214f;
        int length = iArr.length;
        if (length > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f4215g = z2;
        if (z2) {
            this.f4210a = 1;
            this.f4213d = (float) iArr[0];
            this.e = (float) iArr[length - 1];
            this.f4212c = -1.0f;
        }
        return z2;
    }

    public final boolean j() {
        return !(this.i instanceof C0306u);
    }

    public final void k(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        } else if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        } else if (f4 > 0.0f) {
            this.f4210a = 1;
            this.f4213d = f2;
            this.e = f3;
            this.f4212c = f4;
            this.f4215g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
    }

    public C0283i0(TextView textView) {
        this.i = textView;
        this.f4217j = textView.getContext();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.f4218k = new C0279g0();
        } else if (i2 >= 23) {
            this.f4218k = new C0277f0();
        } else {
            this.f4218k = new C0281h0();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        android.util.Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + r3 + "() method", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object e(java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
        /*
            java.lang.reflect.Method r0 = d(r3)     // Catch:{ Exception -> 0x000c, all -> 0x000a }
            r1 = 0
            java.lang.Object r4 = r0.invoke(r2, r1)     // Catch:{ Exception -> 0x000c, all -> 0x000a }
            goto L_0x0027
        L_0x000a:
            r2 = move-exception
            goto L_0x000e
        L_0x000c:
            r2 = move-exception
            goto L_0x000f
        L_0x000e:
            throw r2
        L_0x000f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to invoke TextView#"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = "() method"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "ACTVAutoSizeHelper"
            android.util.Log.w(r0, r3, r2)
        L_0x0027:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0283i0.e(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object");
    }

    public final void a() {
        int i2;
        if (f()) {
            if (this.f4211b) {
                if (this.i.getMeasuredHeight() > 0 && this.i.getMeasuredWidth() > 0) {
                    if (this.f4218k.b(this.i)) {
                        i2 = 1048576;
                    } else {
                        i2 = (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                    }
                    int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                    if (i2 > 0 && height > 0) {
                        RectF rectF = f4208l;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = (float) i2;
                                rectF.bottom = (float) height;
                                float c2 = (float) c(rectF);
                                if (c2 != this.i.getTextSize()) {
                                    g(0, c2);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f4211b = true;
        }
    }

    public final boolean f() {
        if (!j() || this.f4210a == 0) {
            return false;
        }
        return true;
    }

    public final boolean h() {
        if (!j() || this.f4210a != 1) {
            this.f4211b = false;
        } else {
            if (!this.f4215g || this.f4214f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.e - this.f4213d) / this.f4212c))) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = Math.round((((float) i2) * this.f4212c) + this.f4213d);
                }
                this.f4214f = b(iArr);
            }
            this.f4211b = true;
        }
        return this.f4211b;
    }
}
