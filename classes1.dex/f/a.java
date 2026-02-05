package F;

import android.graphics.Color;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f224a = new ThreadLocal();

    public static int c(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * 255) * i2)) / (i5 * 255);
    }

    public static int d(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    public static int b(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i3, c(Color.red(i), alpha2, Color.red(i2), alpha, i3), c(Color.green(i), alpha2, Color.green(i2), alpha, i3), c(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    public static int a(double d2, double d3, double d4) {
        double d5;
        double d6;
        double d7;
        int i;
        int i2;
        double d8 = ((-0.4986d * d4) + ((-1.5372d * d3) + (3.2406d * d2))) / 100.0d;
        double d9 = ((0.0415d * d4) + ((1.8758d * d3) + (-0.9689d * d2))) / 100.0d;
        double d10 = ((1.057d * d4) + ((-0.204d * d3) + (0.0557d * d2))) / 100.0d;
        if (d8 > 0.0031308d) {
            d5 = (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d5 = d8 * 12.92d;
        }
        if (d9 > 0.0031308d) {
            d6 = (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d6 = d9 * 12.92d;
        }
        if (d10 > 0.0031308d) {
            d7 = (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d7 = 12.92d * d10;
        }
        int round = (int) Math.round(d5 * 255.0d);
        int i3 = 0;
        if (round < 0) {
            i = 0;
        } else {
            i = Math.min(round, 255);
        }
        int round2 = (int) Math.round(d6 * 255.0d);
        if (round2 < 0) {
            i2 = 0;
        } else {
            i2 = Math.min(round2, 255);
        }
        int round3 = (int) Math.round(d7 * 255.0d);
        if (round3 >= 0) {
            i3 = Math.min(round3, 255);
        }
        return Color.rgb(i, i2, i3);
    }
}
