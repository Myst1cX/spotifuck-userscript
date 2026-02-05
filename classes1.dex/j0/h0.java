package j0;

import T.k;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class h0 implements Parcelable {
    public static final Parcelable.Creator<h0> CREATOR = new k(24);

    /* renamed from: a  reason: collision with root package name */
    public int f3396a;

    /* renamed from: b  reason: collision with root package name */
    public int f3397b;

    /* renamed from: c  reason: collision with root package name */
    public int f3398c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f3399d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f3400f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f3401g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3402h;
    public boolean i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3403j;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f3396a);
        parcel.writeInt(this.f3397b);
        parcel.writeInt(this.f3398c);
        if (this.f3398c > 0) {
            parcel.writeIntArray(this.f3399d);
        }
        parcel.writeInt(this.e);
        if (this.e > 0) {
            parcel.writeIntArray(this.f3400f);
        }
        parcel.writeInt(this.f3402h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f3403j ? 1 : 0);
        parcel.writeList(this.f3401g);
    }
}
