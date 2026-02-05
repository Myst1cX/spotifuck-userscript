package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;

public final class w implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new PlaybackStateCompat.CustomAction(parcel);
    }

    public final Object[] newArray(int i) {
        return new PlaybackStateCompat.CustomAction[i];
    }
}
