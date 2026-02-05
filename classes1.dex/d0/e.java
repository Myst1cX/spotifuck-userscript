package d0;

import A.b;
import android.content.Context;
import android.service.media.MediaBrowserService;

public class e extends d {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f f2466g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(f fVar, Context context) {
        super(fVar, context);
        this.f2466g = fVar;
    }

    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        b bVar = new b(23, (Object) result);
        c cVar = this.f2466g.f2467j.f2500h;
        bVar.D((Object) null);
    }
}
