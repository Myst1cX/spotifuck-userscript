package androidx.fragment.app;

import T.k;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class I implements Parcelable {
    public static final Parcelable.Creator<I> CREATOR = new k(8);

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f1605a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f1606b;

    /* renamed from: c  reason: collision with root package name */
    public C0048b[] f1607c;

    /* renamed from: d  reason: collision with root package name */
    public int f1608d;
    public String e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f1609f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f1610g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f1611h;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f1605a);
        parcel.writeStringList(this.f1606b);
        parcel.writeTypedArray(this.f1607c, i);
        parcel.writeInt(this.f1608d);
        parcel.writeString(this.e);
        parcel.writeStringList(this.f1609f);
        parcel.writeTypedList(this.f1610g);
        parcel.writeTypedList(this.f1611h);
    }
}
