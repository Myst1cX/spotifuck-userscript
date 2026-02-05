package android.support.v4.media.session;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;
import d0.r;
import d0.t;

public class q extends p {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, d0.r] */
    public final r c() {
        MediaSessionManager.RemoteUserInfo f2 = this.f1121a.getCurrentControllerInfo();
        ? obj = new Object();
        String q2 = f2.getPackageName();
        if (q2 == null) {
            throw new NullPointerException("package shouldn't be null");
        } else if (!TextUtils.isEmpty(q2)) {
            obj.f2504a = new t(f2.getPackageName(), f2.getPid(), f2.getUid());
            return obj;
        } else {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
    }

    public final void f(r rVar) {
    }
}
