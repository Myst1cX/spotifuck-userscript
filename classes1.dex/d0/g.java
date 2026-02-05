package d0;

import A.b;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.ArrayList;
import java.util.List;

public final class g extends k {
    public final /* synthetic */ b e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Bundle f2468f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ i f2469g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(i iVar, String str, b bVar, Bundle bundle) {
        super(str);
        this.f2469g = iVar;
        this.e = bVar;
        this.f2468f = bundle;
    }

    public final void a() {
        ((MediaBrowserService.Result) this.e.f2g).detach();
    }

    public final void c(ArrayList arrayList) {
        b bVar = this.e;
        if (arrayList == null) {
            bVar.D((Object) null);
            return;
        }
        List<MediaBrowserCompat$MediaItem> list = arrayList;
        if ((this.f2475d & 1) != 0) {
            this.f2469g.f2471k.getClass();
            list = q.a(arrayList, this.f2468f);
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        for (MediaBrowserCompat$MediaItem writeToParcel : list) {
            Parcel obtain = Parcel.obtain();
            writeToParcel.writeToParcel(obtain, 0);
            arrayList2.add(obtain);
        }
        bVar.D(arrayList2);
    }
}
