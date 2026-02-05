package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

@SuppressLint({"BanParcelableUsage"})
final class MediaSessionCompat$ResultReceiverWrapper implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$ResultReceiverWrapper> CREATOR = new s(0);

    /* renamed from: a  reason: collision with root package name */
    public ResultReceiver f1087a;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.f1087a.writeToParcel(parcel, i);
    }
}
