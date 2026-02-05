package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

@SuppressLint({"BanParcelableUsage"})
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new s(1);

    /* renamed from: a  reason: collision with root package name */
    public final MediaDescriptionCompat f1085a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1086b;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaSession.QueueItem {Description=" + this.f1085a + ", Id=" + this.f1086b + " }";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.f1085a.writeToParcel(parcel, i);
        parcel.writeLong(this.f1086b);
    }

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.f1085a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f1086b = parcel.readLong();
    }
}
