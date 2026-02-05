package android.support.v4.media;

import T.k;
import android.annotation.SuppressLint;
import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.t;
import r.b;

@SuppressLint({"BanParcelableUsage"})
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new k(3);

    /* renamed from: c  reason: collision with root package name */
    public static final b f1065c;

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f1066a;

    /* renamed from: b  reason: collision with root package name */
    public MediaMetadata f1067b;

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f1066a = bundle2;
        t.j(bundle2);
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [r.b, r.k] */
    static {
        ? kVar = new r.k();
        f1065c = kVar;
        kVar.put("android.media.metadata.TITLE", 1);
        kVar.put("android.media.metadata.ARTIST", 1);
        kVar.put("android.media.metadata.DURATION", 0);
        kVar.put("android.media.metadata.ALBUM", 1);
        kVar.put("android.media.metadata.AUTHOR", 1);
        kVar.put("android.media.metadata.WRITER", 1);
        kVar.put("android.media.metadata.COMPOSER", 1);
        kVar.put("android.media.metadata.COMPILATION", 1);
        kVar.put("android.media.metadata.DATE", 1);
        kVar.put("android.media.metadata.YEAR", 0);
        kVar.put("android.media.metadata.GENRE", 1);
        kVar.put("android.media.metadata.TRACK_NUMBER", 0);
        kVar.put("android.media.metadata.NUM_TRACKS", 0);
        kVar.put("android.media.metadata.DISC_NUMBER", 0);
        kVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        kVar.put("android.media.metadata.ART", 2);
        kVar.put("android.media.metadata.ART_URI", 1);
        kVar.put("android.media.metadata.ALBUM_ART", 2);
        kVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        kVar.put("android.media.metadata.USER_RATING", 3);
        kVar.put("android.media.metadata.RATING", 3);
        kVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        kVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        kVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        kVar.put("android.media.metadata.DISPLAY_ICON", 2);
        kVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        kVar.put("android.media.metadata.MEDIA_ID", 1);
        kVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        kVar.put("android.media.metadata.MEDIA_URI", 1);
        kVar.put("android.media.metadata.ADVERTISEMENT", 0);
        kVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f1066a);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f1066a = parcel.readBundle(t.class.getClassLoader());
    }
}
