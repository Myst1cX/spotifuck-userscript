package d0;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import b.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class b extends k {
    public final /* synthetic */ int e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f2458f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, int i) {
        super(obj);
        this.e = i;
        this.f2458f = obj2;
    }

    public void a() {
        switch (this.e) {
            case 2:
                ((MediaBrowserService.Result) ((A.b) this.f2458f).f2g).detach();
                return;
            default:
                super.a();
                return;
        }
    }

    public final void c(ArrayList arrayList) {
        List list;
        switch (this.e) {
            case 0:
                MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) arrayList;
                int i = this.f2475d & 2;
                d dVar = (d) this.f2458f;
                if (i != 0) {
                    dVar.b(-1, (Bundle) null);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("media_item", mediaBrowserCompat$MediaItem);
                dVar.b(0, bundle);
                return;
            case 1:
                int i2 = this.f2475d & 4;
                d dVar2 = (d) this.f2458f;
                if (i2 != 0 || arrayList == null) {
                    dVar2.b(-1, (Bundle) null);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putParcelableArray("search_results", (Parcelable[]) arrayList.toArray(new MediaBrowserCompat$MediaItem[0]));
                dVar2.b(0, bundle2);
                return;
            default:
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Parcel obtain = Parcel.obtain();
                        ((MediaBrowserCompat$MediaItem) it2.next()).writeToParcel(obtain, 0);
                        arrayList2.add(obtain);
                    }
                    list = arrayList2;
                } else if (Build.VERSION.SDK_INT >= 24) {
                    list = null;
                } else {
                    list = Collections.emptyList();
                }
                ((A.b) this.f2458f).D(list);
                return;
        }
    }
}
