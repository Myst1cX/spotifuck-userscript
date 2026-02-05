package d0;

import A.b;
import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.t;

public final class h extends e {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ i f2470h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(i iVar, Context context) {
        super(iVar, context);
        this.f2470h = iVar;
    }

    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        t.j(bundle);
        i iVar = this.f2470h;
        q qVar = iVar.f2471k;
        c cVar = qVar.f2500h;
        g gVar = new g(iVar, str, new b(23, (Object) result), bundle);
        gVar.f2475d = 1;
        qVar.b(str, gVar);
        iVar.f2471k.getClass();
    }
}
