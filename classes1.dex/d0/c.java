package d0;

import A.b;
import H0.f;
import N0.B;
import android.os.Build;
import android.os.IBinder;
import android.support.v4.media.i;
import android.text.TextUtils;
import java.util.HashMap;

public final class c implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final String f2459a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2460b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2461c;

    /* renamed from: d  reason: collision with root package name */
    public final b f2462d;
    public final HashMap e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public i f2463f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ q f2464g;

    public final void binderDied() {
        this.f2464g.f2502k.post(new B(7, this));
    }

    public c(q qVar, String str, int i, int i2, b bVar) {
        this.f2464g = qVar;
        this.f2459a = str;
        this.f2460b = i;
        this.f2461c = i2;
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        } else if (!TextUtils.isEmpty(str)) {
            if (Build.VERSION.SDK_INT >= 28) {
                f.v(str, i, i2);
            }
            this.f2462d = bVar;
        } else {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
    }
}
