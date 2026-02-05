package android.support.v4.media;

import T.k;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new k(4);

    /* renamed from: a  reason: collision with root package name */
    public final int f1068a;

    /* renamed from: b  reason: collision with root package name */
    public final float f1069b;

    /* renamed from: c  reason: collision with root package name */
    public Object f1070c;

    public final int describeContents() {
        return this.f1068a;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f1068a);
        sb.append(" rating=");
        float f2 = this.f1069b;
        if (f2 < 0.0f) {
            str = "unrated";
        } else {
            str = String.valueOf(f2);
        }
        sb.append(str);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1068a);
        parcel.writeFloat(this.f1069b);
    }

    public RatingCompat(int i, float f2) {
        this.f1068a = i;
        this.f1069b = f2;
    }
}
