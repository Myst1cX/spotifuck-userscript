package N;

import A.b;
import H0.e;
import T.s;
import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

public final class N implements OnReceiveContentListener {

    /* renamed from: a  reason: collision with root package name */
    public final C0018s f504a;

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0006f fVar = new C0006f(new b(contentInfo));
        C0006f a2 = ((s) this.f504a).a(view, fVar);
        if (a2 == null) {
            return null;
        }
        if (a2 == fVar) {
            return contentInfo;
        }
        ContentInfo n2 = a2.f539a.n();
        Objects.requireNonNull(n2);
        return e.h(n2);
    }

    public N(C0018s sVar) {
        this.f504a = sVar;
    }
}
