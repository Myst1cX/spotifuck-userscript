package L;

import H0.f;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import java.util.Objects;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f457a;

    /* renamed from: b  reason: collision with root package name */
    public final TextDirectionHeuristic f458b;

    /* renamed from: c  reason: collision with root package name */
    public final int f459c;

    /* renamed from: d  reason: collision with root package name */
    public final int f460d;

    public g(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            f.j(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        }
        this.f457a = textPaint;
        this.f458b = textDirectionHeuristic;
        this.f459c = i;
        this.f460d = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        if (r3.getTextLocales().equals(r5.getTextLocales()) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0095, code lost:
        if (r3.getTextLocale().equals(r5.getTextLocale()) == false) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c1 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof L.g
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            L.g r8 = (L.g) r8
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r1 < r3) goto L_0x0022
            int r3 = r8.f459c
            int r4 = r7.f459c
            if (r4 == r3) goto L_0x001b
        L_0x0018:
            r1 = 0
            goto L_0x00b7
        L_0x001b:
            int r3 = r7.f460d
            int r4 = r8.f460d
            if (r3 == r4) goto L_0x0022
            goto L_0x0018
        L_0x0022:
            android.text.TextPaint r3 = r7.f457a
            float r4 = r3.getTextSize()
            android.text.TextPaint r5 = r8.f457a
            float r5 = r5.getTextSize()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0033
            goto L_0x0018
        L_0x0033:
            float r4 = r3.getTextScaleX()
            android.text.TextPaint r5 = r8.f457a
            float r6 = r5.getTextScaleX()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0042
            goto L_0x0018
        L_0x0042:
            float r4 = r3.getTextSkewX()
            float r6 = r5.getTextSkewX()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x004f
            goto L_0x0018
        L_0x004f:
            float r4 = r3.getLetterSpacing()
            float r6 = r5.getLetterSpacing()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x005c
            goto L_0x0018
        L_0x005c:
            java.lang.String r4 = r3.getFontFeatureSettings()
            java.lang.String r6 = r5.getFontFeatureSettings()
            boolean r4 = android.text.TextUtils.equals(r4, r6)
            if (r4 != 0) goto L_0x006b
            goto L_0x0018
        L_0x006b:
            int r4 = r3.getFlags()
            int r6 = r5.getFlags()
            if (r4 == r6) goto L_0x0076
            goto L_0x0018
        L_0x0076:
            r4 = 24
            if (r1 < r4) goto L_0x0089
            android.os.LocaleList r1 = r3.getTextLocales()
            android.os.LocaleList r4 = r5.getTextLocales()
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0098
            goto L_0x0018
        L_0x0089:
            java.util.Locale r1 = r3.getTextLocale()
            java.util.Locale r4 = r5.getTextLocale()
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0098
            goto L_0x0018
        L_0x0098:
            android.graphics.Typeface r1 = r3.getTypeface()
            if (r1 != 0) goto L_0x00a6
            android.graphics.Typeface r1 = r5.getTypeface()
            if (r1 == 0) goto L_0x00b6
            goto L_0x0018
        L_0x00a6:
            android.graphics.Typeface r1 = r3.getTypeface()
            android.graphics.Typeface r3 = r5.getTypeface()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00b6
            goto L_0x0018
        L_0x00b6:
            r1 = 1
        L_0x00b7:
            if (r1 != 0) goto L_0x00ba
            return r2
        L_0x00ba:
            android.text.TextDirectionHeuristic r1 = r7.f458b
            android.text.TextDirectionHeuristic r8 = r8.f458b
            if (r1 != r8) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            r0 = 0
        L_0x00c2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: L.g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        TextDirectionHeuristic textDirectionHeuristic = this.f458b;
        int i = Build.VERSION.SDK_INT;
        int i2 = this.f460d;
        int i3 = this.f459c;
        TextPaint textPaint = this.f457a;
        if (i >= 24) {
            return Objects.hash(new Object[]{Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i3), Integer.valueOf(i2)});
        }
        return Objects.hash(new Object[]{Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i3), Integer.valueOf(i2)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f457a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i >= 24) {
            sb.append(", textLocale=" + textPaint.getTextLocales());
        } else {
            sb.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f458b);
        sb.append(", breakStrategy=" + this.f459c);
        sb.append(", hyphenationFrequency=" + this.f460d);
        sb.append("}");
        return sb.toString();
    }

    public g(PrecomputedText.Params params) {
        this.f457a = params.getTextPaint();
        this.f458b = params.getTextDirection();
        this.f459c = params.getBreakStrategy();
        this.f460d = params.getHyphenationFrequency();
    }
}
