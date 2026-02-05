package androidx.profileinstaller;

import K0.e;
import android.content.Context;
import android.os.Build;
import android.view.Choreographer;
import h0.g;
import java.util.Collections;
import java.util.List;
import l0.C0173b;

public class ProfileInstallerInitializer implements C0173b {
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new e(22);
        }
        Choreographer.getInstance().postFrameCallback(new g(this, context.getApplicationContext()));
        return new e(22);
    }

    public final List a() {
        return Collections.emptyList();
    }
}
