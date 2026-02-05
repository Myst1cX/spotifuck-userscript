package j0;

import T.k;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class g0 implements Parcelable {
    public static final Parcelable.Creator<g0> CREATOR = new k(23);

    /* renamed from: a  reason: collision with root package name */
    public int f3387a;

    /* renamed from: b  reason: collision with root package name */
    public int f3388b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f3389c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3390d;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f3387a + ", mGapDir=" + this.f3388b + ", mHasUnwantedGapAfter=" + this.f3390d + ", mGapPerSpan=" + Arrays.toString(this.f3389c) + '}';
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3387a);
        parcel.writeInt(this.f3388b);
        parcel.writeInt(this.f3390d ? 1 : 0);
        int[] iArr = this.f3389c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(iArr.length);
        parcel.writeIntArray(this.f3389c);
    }
}
