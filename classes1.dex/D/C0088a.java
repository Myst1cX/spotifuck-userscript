package d;

import T.k;
import Z0.c;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d.a  reason: case insensitive filesystem */
public final class C0088a implements Parcelable {
    public static final Parcelable.Creator<C0088a> CREATOR = new k(14);

    /* renamed from: a  reason: collision with root package name */
    public final int f2450a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f2451b;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f2450a;
        if (i == -1) {
            str = "RESULT_OK";
        } else if (i != 0) {
            str = String.valueOf(i);
        } else {
            str = "RESULT_CANCELED";
        }
        sb.append(str);
        sb.append(", data=");
        sb.append(this.f2451b);
        sb.append('}');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        c.e("dest", parcel);
        parcel.writeInt(this.f2450a);
        Intent intent = this.f2451b;
        if (intent == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        parcel.writeInt(i2);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public C0088a(Intent intent, int i) {
        this.f2450a = i;
        this.f2451b = intent;
    }
}
