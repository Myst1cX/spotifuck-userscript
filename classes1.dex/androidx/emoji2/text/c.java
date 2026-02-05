package androidx.emoji2.text;

import K0.e;
import android.content.pm.PackageManager;
import android.content.pm.Signature;

public final class c extends e {
    public final Signature[] d(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
