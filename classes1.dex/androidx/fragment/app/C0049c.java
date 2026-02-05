package androidx.fragment.app;

import T.k;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.c  reason: case insensitive filesystem */
public final class C0049c implements Parcelable {
    public static final Parcelable.Creator<C0049c> CREATOR = new k(6);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1682a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f1683b;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f1682a);
        parcel.writeTypedList(this.f1683b);
    }

    public C0049c(Parcel parcel) {
        this.f1682a = parcel.createStringArrayList();
        this.f1683b = parcel.createTypedArrayList(C0048b.CREATOR);
    }
}
