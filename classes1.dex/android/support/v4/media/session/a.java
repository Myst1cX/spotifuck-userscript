package android.support.v4.media.session;

import android.os.IBinder;
import android.os.Parcel;

public final class a implements b {

    /* renamed from: b  reason: collision with root package name */
    public IBinder f1110b;

    public final IBinder asBinder() {
        return this.f1110b;
    }

    public final void G(PlaybackStateCompat playbackStateCompat) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (playbackStateCompat != null) {
                obtain.writeInt(1);
                playbackStateCompat.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1110b.transact(3, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
