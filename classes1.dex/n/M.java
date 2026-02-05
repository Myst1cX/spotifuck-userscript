package N;

import A.b;
import H0.e;
import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

public abstract class M {
    public static C0006f b(View view, C0006f fVar) {
        ContentInfo n2 = fVar.f539a.n();
        Objects.requireNonNull(n2);
        ContentInfo h2 = e.h(n2);
        ContentInfo performReceiveContent = view.performReceiveContent(h2);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == h2) {
            return fVar;
        }
        return new C0006f(new b(performReceiveContent));
    }

    public static void c(View view, String[] strArr, C0018s sVar) {
        if (sVar == null) {
            view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
        } else {
            view.setOnReceiveContentListener(strArr, new N(sVar));
        }
    }

    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }
}
