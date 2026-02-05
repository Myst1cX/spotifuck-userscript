package h0;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import h.C0123n;
import java.util.Random;

public final /* synthetic */ class g implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProfileInstallerInitializer f3071a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f3072b;

    public /* synthetic */ g(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f3071a = profileInstallerInitializer;
        this.f3072b = context;
    }

    public final void doFrame(long j2) {
        Handler handler;
        this.f3071a.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            handler = Handler.createAsync(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new C0123n(this.f3072b, 1), (long) (new Random().nextInt(Math.max(1000, 1)) + 5000));
    }
}
