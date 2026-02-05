package j;

import android.animation.TimeInterpolator;

/* renamed from: j.d  reason: case insensitive filesystem */
public final class C0134d implements TimeInterpolator {

    /* renamed from: a  reason: collision with root package name */
    public int[] f3237a;

    /* renamed from: b  reason: collision with root package name */
    public int f3238b;

    /* renamed from: c  reason: collision with root package name */
    public int f3239c;

    public final float getInterpolation(float f2) {
        float f3;
        int i = (int) ((f2 * ((float) this.f3239c)) + 0.5f);
        int i2 = this.f3238b;
        int[] iArr = this.f3237a;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = iArr[i3];
            if (i < i4) {
                break;
            }
            i -= i4;
            i3++;
        }
        if (i3 < i2) {
            f3 = ((float) i) / ((float) this.f3239c);
        } else {
            f3 = 0.0f;
        }
        return (((float) i3) / ((float) i2)) + f3;
    }
}
