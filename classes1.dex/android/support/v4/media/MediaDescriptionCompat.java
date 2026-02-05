package android.support.v4.media;

import T.k;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new k(2);

    /* renamed from: a  reason: collision with root package name */
    public final String f1058a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f1059b;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence f1060c;

    /* renamed from: d  reason: collision with root package name */
    public final CharSequence f1061d;
    public final Bitmap e;

    /* renamed from: f  reason: collision with root package name */
    public final Uri f1062f;

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f1063g;

    /* renamed from: h  reason: collision with root package name */
    public final Uri f1064h;
    public MediaDescription i;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f1059b + ", " + this.f1060c + ", " + this.f1061d;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        Bundle bundle;
        int i3 = Build.VERSION.SDK_INT;
        MediaDescription mediaDescription = this.i;
        if (mediaDescription == null) {
            MediaDescription.Builder b2 = g.b();
            g.n(b2, this.f1058a);
            g.p(b2, this.f1059b);
            g.o(b2, this.f1060c);
            g.j(b2, this.f1061d);
            g.l(b2, this.e);
            g.m(b2, this.f1062f);
            Bundle bundle2 = this.f1063g;
            Uri uri = this.f1064h;
            if (i3 >= 23 || uri == null) {
                g.k(b2, bundle2);
            } else {
                if (bundle2 == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                } else {
                    bundle = new Bundle(bundle2);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", uri);
                g.k(b2, bundle);
            }
            if (i3 >= 23) {
                h.b(b2, uri);
            }
            mediaDescription = g.a(b2);
            this.i = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i2);
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f1058a = str;
        this.f1059b = charSequence;
        this.f1060c = charSequence2;
        this.f1061d = charSequence3;
        this.e = bitmap;
        this.f1062f = uri;
        this.f1063g = bundle;
        this.f1064h = uri2;
    }
}
