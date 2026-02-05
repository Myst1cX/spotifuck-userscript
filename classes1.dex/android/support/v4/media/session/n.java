package android.support.v4.media.session;

import T0.g;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import d0.r;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class n extends Binder implements d {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f1119c = 0;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference f1120b;

    public final String A() {
        throw new AssertionError();
    }

    public final void B(boolean z2) {
        throw new AssertionError();
    }

    public final void C() {
        throw new AssertionError();
    }

    public final void D(RatingCompat ratingCompat) {
        throw new AssertionError();
    }

    public final void E(String str, Bundle bundle) {
        throw new AssertionError();
    }

    public final void F(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    public final int H() {
        if (((o) this.f1120b.get()) != null) {
            return 0;
        }
        return -1;
    }

    public final void I() {
        throw new AssertionError();
    }

    public final void J(long j2) {
        throw new AssertionError();
    }

    public final void K(String str, Bundle bundle) {
        throw new AssertionError();
    }

    public final void L(int i, int i2) {
        throw new AssertionError();
    }

    public final void M(float f2) {
        throw new AssertionError();
    }

    public final ParcelableVolumeInfo N() {
        throw new AssertionError();
    }

    public final PlaybackStateCompat O() {
        long j2;
        o oVar = (o) this.f1120b.get();
        if (oVar == null) {
            return null;
        }
        PlaybackStateCompat playbackStateCompat = oVar.f1125f;
        MediaMetadataCompat mediaMetadataCompat = oVar.f1126g;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j3 = -1;
        long j4 = playbackStateCompat.f1097b;
        if (j4 == -1) {
            return playbackStateCompat;
        }
        int i = playbackStateCompat.f1096a;
        if (i != 3 && i != 4 && i != 5) {
            return playbackStateCompat;
        }
        long j5 = playbackStateCompat.f1102h;
        if (j5 <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j6 = ((long) (playbackStateCompat.f1099d * ((float) (elapsedRealtime - j5)))) + j4;
        if (mediaMetadataCompat != null) {
            Bundle bundle = mediaMetadataCompat.f1066a;
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                j3 = bundle.getLong("android.media.metadata.DURATION", 0);
            }
        }
        if (j3 >= 0 && j6 > j3) {
            j2 = j3;
        } else if (j6 < 0) {
            j2 = 0;
        } else {
            j2 = j6;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = playbackStateCompat.i;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return new PlaybackStateCompat(playbackStateCompat.f1096a, j2, playbackStateCompat.f1098c, playbackStateCompat.f1099d, playbackStateCompat.e, playbackStateCompat.f1100f, playbackStateCompat.f1101g, elapsedRealtime, arrayList, playbackStateCompat.f1103j, playbackStateCompat.f1104k);
    }

    public final void P(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper) {
        throw new AssertionError();
    }

    public final void Q() {
    }

    public final void R() {
        throw new AssertionError();
    }

    public final Bundle S() {
        throw new AssertionError();
    }

    public final void U(int i, int i2) {
        throw new AssertionError();
    }

    public final boolean V(KeyEvent keyEvent) {
        throw new AssertionError();
    }

    public final long a() {
        throw new AssertionError();
    }

    public final IBinder asBinder() {
        return this;
    }

    public final void b(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    public final void c(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    public final void d(int i) {
        throw new AssertionError();
    }

    public final boolean e() {
        throw new AssertionError();
    }

    public final void f(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    public final void g() {
        throw new AssertionError();
    }

    public final PendingIntent h() {
        throw new AssertionError();
    }

    public final CharSequence i() {
        throw new AssertionError();
    }

    public final int j() {
        if (((o) this.f1120b.get()) != null) {
            return 0;
        }
        return -1;
    }

    public final void k(String str, Bundle bundle) {
        throw new AssertionError();
    }

    public final void l(long j2) {
        throw new AssertionError();
    }

    public final void m(int i) {
        throw new AssertionError();
    }

    public final void n(int i) {
        throw new AssertionError();
    }

    public final void next() {
        throw new AssertionError();
    }

    public final void o() {
        o oVar = (o) this.f1120b.get();
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [android.support.v4.media.session.a, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v7, types: [android.support.v4.media.session.a, java.lang.Object] */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        b bVar = null;
        boolean z2 = false;
        switch (i) {
            case 1:
                P(parcel.readString(), (Bundle) g.b(parcel, Bundle.CREATOR), (MediaSessionCompat$ResultReceiverWrapper) g.b(parcel, MediaSessionCompat$ResultReceiverWrapper.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                boolean V2 = V((KeyEvent) g.b(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(V2 ? 1 : 0);
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    Object queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                        ? obj = new Object();
                        obj.f1110b = readStrongBinder;
                        bVar = obj;
                    } else {
                        bVar = (b) queryLocalInterface;
                    }
                }
                r(bVar);
                parcel2.writeNoException();
                break;
            case 4:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    Object queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof b)) {
                        ? obj2 = new Object();
                        obj2.f1110b = readStrongBinder2;
                        bVar = obj2;
                    } else {
                        bVar = (b) queryLocalInterface2;
                    }
                }
                x(bVar);
                parcel2.writeNoException();
                break;
            case 5:
                boolean e = e();
                parcel2.writeNoException();
                parcel2.writeInt(e ? 1 : 0);
                break;
            case 6:
                String A2 = A();
                parcel2.writeNoException();
                parcel2.writeString(A2);
                break;
            case 7:
                String z3 = z();
                parcel2.writeNoException();
                parcel2.writeString(z3);
                break;
            case 8:
                PendingIntent h2 = h();
                parcel2.writeNoException();
                g.U(parcel2, h2, 1);
                break;
            case 9:
                long a2 = a();
                parcel2.writeNoException();
                parcel2.writeLong(a2);
                break;
            case 10:
                ParcelableVolumeInfo N2 = N();
                parcel2.writeNoException();
                g.U(parcel2, N2, 1);
                break;
            case 11:
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                parcel.readString();
                U(readInt, readInt2);
                parcel2.writeNoException();
                break;
            case 12:
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                parcel.readString();
                L(readInt3, readInt4);
                parcel2.writeNoException();
                break;
            case 13:
                I();
                parcel2.writeNoException();
                break;
            case 14:
                E(parcel.readString(), (Bundle) g.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 15:
                K(parcel.readString(), (Bundle) g.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 16:
                b((Uri) g.b(parcel, Uri.CREATOR), (Bundle) g.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 17:
                J(parcel.readLong());
                parcel2.writeNoException();
                break;
            case 18:
                q();
                parcel2.writeNoException();
                break;
            case 19:
                stop();
                parcel2.writeNoException();
                break;
            case 20:
                next();
                parcel2.writeNoException();
                break;
            case 21:
                previous();
                parcel2.writeNoException();
                break;
            case 22:
                R();
                parcel2.writeNoException();
                break;
            case 23:
                g();
                parcel2.writeNoException();
                break;
            case 24:
                l(parcel.readLong());
                parcel2.writeNoException();
                break;
            case 25:
                D((RatingCompat) g.b(parcel, RatingCompat.CREATOR));
                parcel2.writeNoException();
                break;
            case 26:
                k(parcel.readString(), (Bundle) g.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 27:
                MediaMetadataCompat u2 = u();
                parcel2.writeNoException();
                g.U(parcel2, u2, 1);
                break;
            case 28:
                PlaybackStateCompat O2 = O();
                parcel2.writeNoException();
                g.U(parcel2, O2, 1);
                break;
            case 29:
                parcel2.writeNoException();
                parcel2.writeInt(-1);
                break;
            case 30:
                CharSequence i3 = i();
                parcel2.writeNoException();
                if (i3 == null) {
                    parcel2.writeInt(0);
                    break;
                } else {
                    parcel2.writeInt(1);
                    TextUtils.writeToParcel(i3, parcel2, 1);
                    break;
                }
            case 31:
                Bundle S2 = S();
                parcel2.writeNoException();
                g.U(parcel2, S2, 1);
                break;
            case 32:
                o();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                break;
            case 33:
                C();
                parcel2.writeNoException();
                break;
            case 34:
                v(parcel.readString(), (Bundle) g.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 35:
                p(parcel.readString(), (Bundle) g.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 36:
                F((Uri) g.b(parcel, Uri.CREATOR), (Bundle) g.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 37:
                int H2 = H();
                parcel2.writeNoException();
                parcel2.writeInt(H2);
                break;
            case 38:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                break;
            case 39:
                d(parcel.readInt());
                parcel2.writeNoException();
                break;
            case 40:
                parcel.readInt();
                parcel2.writeNoException();
                break;
            case 41:
                f((MediaDescriptionCompat) g.b(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                break;
            case 42:
                y((MediaDescriptionCompat) g.b(parcel, MediaDescriptionCompat.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 43:
                c((MediaDescriptionCompat) g.b(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                break;
            case 44:
                n(parcel.readInt());
                parcel2.writeNoException();
                break;
            case 45:
                t();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                break;
            case 46:
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                B(z2);
                parcel2.writeNoException();
                break;
            case 47:
                int j2 = j();
                parcel2.writeNoException();
                parcel2.writeInt(j2);
                break;
            case 48:
                m(parcel.readInt());
                parcel2.writeNoException();
                break;
            case 49:
                M(parcel.readFloat());
                parcel2.writeNoException();
                break;
            case 50:
                Bundle w2 = w();
                parcel2.writeNoException();
                g.U(parcel2, w2, 1);
                break;
            case 51:
                s((RatingCompat) g.b(parcel, RatingCompat.CREATOR), (Bundle) g.b(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
        return true;
    }

    public final void p(String str, Bundle bundle) {
        throw new AssertionError();
    }

    public final void previous() {
        throw new AssertionError();
    }

    public final void q() {
        throw new AssertionError();
    }

    public final void r(b bVar) {
        o oVar = (o) this.f1120b.get();
        if (oVar != null) {
            oVar.e.register(bVar, new r("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
            synchronized (oVar.f1124d) {
            }
        }
    }

    public final void s(RatingCompat ratingCompat, Bundle bundle) {
        throw new AssertionError();
    }

    public final void stop() {
        throw new AssertionError();
    }

    public final void t() {
        o oVar = (o) this.f1120b.get();
    }

    public final MediaMetadataCompat u() {
        throw new AssertionError();
    }

    public final void v(String str, Bundle bundle) {
        throw new AssertionError();
    }

    public final Bundle w() {
        ((o) this.f1120b.get()).getClass();
        return null;
    }

    public final void x(b bVar) {
        o oVar = (o) this.f1120b.get();
        if (oVar != null) {
            oVar.e.unregister(bVar);
            Binder.getCallingPid();
            Binder.getCallingUid();
            synchronized (oVar.f1124d) {
            }
        }
    }

    public final void y(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        throw new AssertionError();
    }

    public final String z() {
        throw new AssertionError();
    }

    public n(o oVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.f1120b = new AtomicReference(oVar);
    }
}
