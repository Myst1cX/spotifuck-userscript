package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;

public interface d extends IInterface {
    String A();

    void B(boolean z2);

    void C();

    void D(RatingCompat ratingCompat);

    void E(String str, Bundle bundle);

    void F(Uri uri, Bundle bundle);

    int H();

    void I();

    void J(long j2);

    void K(String str, Bundle bundle);

    void L(int i, int i2);

    void M(float f2);

    ParcelableVolumeInfo N();

    PlaybackStateCompat O();

    void P(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper);

    void Q();

    void R();

    Bundle S();

    void U(int i, int i2);

    boolean V(KeyEvent keyEvent);

    long a();

    void b(Uri uri, Bundle bundle);

    void c(MediaDescriptionCompat mediaDescriptionCompat);

    void d(int i);

    boolean e();

    void f(MediaDescriptionCompat mediaDescriptionCompat);

    void g();

    PendingIntent h();

    CharSequence i();

    int j();

    void k(String str, Bundle bundle);

    void l(long j2);

    void m(int i);

    void n(int i);

    void next();

    void o();

    void p(String str, Bundle bundle);

    void previous();

    void q();

    void r(b bVar);

    void s(RatingCompat ratingCompat, Bundle bundle);

    void stop();

    void t();

    MediaMetadataCompat u();

    void v(String str, Bundle bundle);

    Bundle w();

    void x(b bVar);

    void y(MediaDescriptionCompat mediaDescriptionCompat, int i);

    String z();
}
