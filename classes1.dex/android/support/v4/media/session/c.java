package android.support.v4.media.session;

import T0.g;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.view.KeyEvent;

public final class c implements d {

    /* renamed from: b  reason: collision with root package name */
    public IBinder f1111b;

    public final boolean V(KeyEvent keyEvent) {
        throw null;
    }

    public final void k(String str, Bundle bundle) {
        throw null;
    }

    public final void r(b bVar) {
        throw null;
    }

    public final IBinder asBinder() {
        return this.f1111b;
    }

    public final void I() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.f1111b.transact(13, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final PlaybackStateCompat O() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.f1111b.transact(28, obtain, obtain2, 0);
            obtain2.readException();
            return (PlaybackStateCompat) g.b(obtain2, PlaybackStateCompat.CREATOR);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void next() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.f1111b.transact(20, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void previous() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.f1111b.transact(21, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void q() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.f1111b.transact(18, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
