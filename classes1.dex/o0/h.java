package o0;

import android.animation.TypeEvaluator;

public final class h implements TypeEvaluator {

    /* renamed from: a  reason: collision with root package name */
    public static final h f4363a = new Object();

    public final Object evaluate(float f2, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f3 = ((float) ((intValue >> 24) & 255)) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow((double) (((float) ((intValue >> 16) & 255)) / 255.0f), 2.2d);
        float pow2 = (float) Math.pow((double) (((float) ((intValue >> 8) & 255)) / 255.0f), 2.2d);
        float pow3 = (float) Math.pow((double) (((float) (intValue & 255)) / 255.0f), 2.2d);
        float pow4 = (float) Math.pow((double) (((float) ((intValue2 >> 16) & 255)) / 255.0f), 2.2d);
        float pow5 = ((((float) Math.pow((double) (((float) (intValue2 & 255)) / 255.0f), 2.2d)) - pow3) * f2) + pow3;
        return Integer.valueOf((Math.round(((float) Math.pow((double) (((pow4 - pow) * f2) + pow), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(((((((float) ((intValue2 >> 24) & 255)) / 255.0f) - f3) * f2) + f3) * 255.0f) << 24) | (Math.round(((float) Math.pow((double) (((((float) Math.pow((double) (((float) ((intValue2 >> 8) & 255)) / 255.0f), 2.2d)) - pow2) * f2) + pow2), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow((double) pow5, 0.45454545454545453d)) * 255.0f));
    }
}
