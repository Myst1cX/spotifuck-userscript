package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.t;
import b.d;

class MediaBrowserCompat$ItemReceiver extends d {
    public final void a(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = t.G(bundle);
        }
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable == null || (parcelable instanceof MediaBrowserCompat$MediaItem)) {
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) parcelable;
            throw null;
        }
        throw null;
    }
}
