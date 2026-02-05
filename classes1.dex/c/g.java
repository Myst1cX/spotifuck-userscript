package C;

import android.app.AppOpsManager;
import android.content.Context;

public abstract class g {
    public static int a(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    public static AppOpsManager c(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }

    public static String b(Context context) {
        return context.getOpPackageName();
    }
}
