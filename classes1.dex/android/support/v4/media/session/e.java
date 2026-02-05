package android.support.v4.media.session;

import Q0.E;
import T0.g;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import java.lang.ref.WeakReference;

public final class e extends Binder implements b {

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference f1112b = new WeakReference((Object) null);

    public final void G(PlaybackStateCompat playbackStateCompat) {
        E.h(this.f1112b.get());
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i) {
            case 1:
                parcel.readString();
                Bundle bundle = (Bundle) g.a(parcel, Bundle.CREATOR);
                E.h(this.f1112b.get());
                break;
            case 2:
                throw new AssertionError();
            case 3:
                G((PlaybackStateCompat) g.a(parcel, PlaybackStateCompat.CREATOR));
                break;
            case 4:
                MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) g.a(parcel, MediaMetadataCompat.CREATOR);
                throw new AssertionError();
            case 5:
                parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR);
                throw new AssertionError();
            case 6:
                CharSequence charSequence = (CharSequence) g.a(parcel, TextUtils.CHAR_SEQUENCE_CREATOR);
                throw new AssertionError();
            case 7:
                Bundle bundle2 = (Bundle) g.a(parcel, Bundle.CREATOR);
                throw new AssertionError();
            case 8:
                ParcelableVolumeInfo parcelableVolumeInfo = (ParcelableVolumeInfo) g.a(parcel, ParcelableVolumeInfo.CREATOR);
                throw new AssertionError();
            case 9:
                parcel.readInt();
                E.h(this.f1112b.get());
                break;
            case 10:
                parcel.readInt();
                break;
            case 11:
                parcel.readInt();
                E.h(this.f1112b.get());
                break;
            case 12:
                parcel.readInt();
                E.h(this.f1112b.get());
                break;
            case 13:
                E.h(this.f1112b.get());
                break;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
        return true;
    }

    public e() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
    }
}
