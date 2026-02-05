package android.support.v4.media;

import T.k;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

@SuppressLint({"BanParcelableUsage"})
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new k(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f1056a;

    /* renamed from: b  reason: collision with root package name */
    public final MediaDescriptionCompat f1057b;

    public MediaBrowserCompat$MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        if (!TextUtils.isEmpty(mediaDescriptionCompat.f1058a)) {
            this.f1056a = i;
            this.f1057b = mediaDescriptionCompat;
            return;
        }
        throw new IllegalArgumentException("description must have a non-empty media id");
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f1056a + ", mDescription=" + this.f1057b + '}';
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1056a);
        this.f1057b.writeToParcel(parcel, i);
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f1056a = parcel.readInt();
        this.f1057b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }
}
