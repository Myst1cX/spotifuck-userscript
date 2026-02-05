package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.t;
import b.d;
import java.util.ArrayList;

class MediaBrowserCompat$SearchResultReceiver extends d {
    public final void a(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = t.G(bundle);
        }
        if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        parcelableArray.getClass();
        ArrayList arrayList = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
        }
        throw null;
    }
}
