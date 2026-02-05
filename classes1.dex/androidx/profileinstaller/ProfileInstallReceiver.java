package androidx.profileinstaller;

import A.b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import h0.C0129f;
import java.io.File;
import java.io.Serializable;

public class ProfileInstallReceiver extends BroadcastReceiver {
    /* JADX WARNING: type inference failed for: r7v15, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        File file;
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                C0129f.t(context, new Object(), new b(29, (Object) this), true);
            } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        b bVar = new b(29, (Object) this);
                        try {
                            C0129f.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                            bVar.k(10, (Serializable) null);
                        } catch (PackageManager.NameNotFoundException e) {
                            bVar.k(7, e);
                        }
                    } else if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        setResultCode(11);
                    }
                }
            } else if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                b bVar2 = new b(29, (Object) this);
                if (Build.VERSION.SDK_INT >= 24) {
                    Process.sendSignal(Process.myPid(), 10);
                    bVar2.k(12, (Serializable) null);
                    return;
                }
                bVar2.k(13, (Serializable) null);
            } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
                String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
                b bVar3 = new b(29, (Object) this);
                if ("DROP_SHADER_CACHE".equals(string2)) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 34) {
                        file = context.createDeviceProtectedStorageContext().getCacheDir();
                    } else if (i >= 24) {
                        file = context.createDeviceProtectedStorageContext().getCodeCacheDir();
                    } else if (i == 23) {
                        file = context.getCodeCacheDir();
                    } else {
                        file = context.getCacheDir();
                    }
                    if (C0129f.c(file)) {
                        bVar3.k(14, (Serializable) null);
                    } else {
                        bVar3.k(15, (Serializable) null);
                    }
                } else {
                    bVar3.k(16, (Serializable) null);
                }
            }
        }
    }
}
