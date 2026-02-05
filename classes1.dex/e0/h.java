package E0;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

public final class h {

    /* renamed from: l  reason: collision with root package name */
    public static final int f198l;

    /* renamed from: m  reason: collision with root package name */
    public static boolean f199m;

    /* renamed from: n  reason: collision with root package name */
    public static Constructor f200n;

    /* renamed from: o  reason: collision with root package name */
    public static TextDirectionHeuristic f201o;

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f202a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f203b;

    /* renamed from: c  reason: collision with root package name */
    public final int f204c;

    /* renamed from: d  reason: collision with root package name */
    public int f205d;
    public Layout.Alignment e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f  reason: collision with root package name */
    public int f206f = Integer.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    public float f207g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    public int f208h = f198l;
    public boolean i = true;

    /* renamed from: j  reason: collision with root package name */
    public boolean f209j;

    /* renamed from: k  reason: collision with root package name */
    public TextUtils.TruncateAt f210k = null;

    static {
        int i2;
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        f198l = i2;
    }

    public final StaticLayout a() {
        boolean z2;
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2;
        if (this.f202a == null) {
            this.f202a = "";
        }
        int max = Math.max(0, this.f204c);
        CharSequence charSequence = this.f202a;
        int i2 = this.f206f;
        TextPaint textPaint = this.f203b;
        if (i2 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, (float) max, this.f210k);
        }
        int min = Math.min(charSequence.length(), this.f205d);
        this.f205d = min;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            if (this.f209j && this.f206f == 1) {
                this.e = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder d2 = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
            d2.setAlignment(this.e);
            d2.setIncludePad(this.i);
            if (this.f209j) {
                textDirectionHeuristic2 = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic2 = TextDirectionHeuristics.LTR;
            }
            d2.setTextDirection(textDirectionHeuristic2);
            TextUtils.TruncateAt truncateAt = this.f210k;
            if (truncateAt != null) {
                d2.setEllipsize(truncateAt);
            }
            d2.setMaxLines(this.f206f);
            float f2 = this.f207g;
            if (f2 != 1.0f) {
                d2.setLineSpacing(0.0f, f2);
            }
            if (this.f206f > 1) {
                d2.setHyphenationFrequency(this.f208h);
            }
            return d2.build();
        }
        if (!f199m) {
            try {
                if (!this.f209j || i3 < 23) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                } else {
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                }
                f201o = textDirectionHeuristic;
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(new Class[]{CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls});
                f200n = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f199m = true;
            } catch (Exception e2) {
                throw new g(e2);
            }
        }
        try {
            Constructor constructor = f200n;
            constructor.getClass();
            Integer valueOf = Integer.valueOf(this.f205d);
            Integer valueOf2 = Integer.valueOf(max);
            Layout.Alignment alignment = this.e;
            TextDirectionHeuristic textDirectionHeuristic3 = f201o;
            textDirectionHeuristic3.getClass();
            return (StaticLayout) constructor.newInstance(new Object[]{charSequence, 0, valueOf, textPaint, valueOf2, alignment, textDirectionHeuristic3, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.i), null, Integer.valueOf(max), Integer.valueOf(this.f206f)});
        } catch (Exception e3) {
            throw new g(e3);
        }
    }

    public h(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.f202a = charSequence;
        this.f203b = textPaint;
        this.f204c = i2;
        this.f205d = charSequence.length();
    }
}
