package androidx.media.session;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.support.v4.media.f;
import android.util.Log;
import android.view.KeyEvent;
import f0.a;
import f0.b;
import it.deviato.spotifuck.WebService;
import java.util.List;
import java.util.Objects;
import p0.C0320a;

public class MediaButtonReceiver extends BroadcastReceiver {
    public static ComponentName b(WebService webService) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(webService.getPackageName());
        List<ResolveInfo> queryBroadcastReceivers = webService.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        } else if (queryBroadcastReceivers.size() <= 1) {
            return null;
        } else {
            Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
            return null;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) || !intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Objects.toString(intent);
            return;
        }
        ComponentName c2 = c(context, "android.intent.action.MEDIA_BUTTON");
        if (c2 != null) {
            intent.setComponent(c2);
            try {
                C0320a.G0(context, intent);
            } catch (IllegalStateException e) {
                if (Build.VERSION.SDK_INT < 31 || !a.b(e)) {
                    throw e;
                }
                ForegroundServiceStartNotAllowedException a2 = a.a(e);
                Log.e("MediaButtonReceiver", "caught exception when trying to start a foreground service from the background: " + a2.getMessage());
            }
        } else {
            ComponentName c3 = c(context, "android.media.browse.MediaBrowserService");
            if (c3 != null) {
                BroadcastReceiver.PendingResult goAsync = goAsync();
                Context applicationContext = context.getApplicationContext();
                b bVar = new b(applicationContext, intent, goAsync);
                f fVar = new f(applicationContext, c3, bVar);
                bVar.f2517f = fVar;
                fVar.f1082a.f1075b.connect();
                return;
            }
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
    }

    public static PendingIntent a(WebService webService, long j2) {
        int i;
        ComponentName b2 = b(webService);
        if (b2 == null) {
            Log.w("MediaButtonReceiver", "A unique media button receiver could not be found in the given context, so couldn't build a pending intent.");
            return null;
        }
        int i2 = 0;
        if (j2 == 4) {
            i = 126;
        } else if (j2 == 2) {
            i = 127;
        } else if (j2 == 32) {
            i = 87;
        } else if (j2 == 16) {
            i = 88;
        } else if (j2 == 1) {
            i = 86;
        } else if (j2 == 64) {
            i = 90;
        } else if (j2 == 8) {
            i = 89;
        } else if (j2 == 512) {
            i = 85;
        } else {
            i = 0;
        }
        if (i == 0) {
            Log.w("MediaButtonReceiver", "Cannot build a media button pending intent with the given action: " + j2);
            return null;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(b2);
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i));
        int i3 = Build.VERSION.SDK_INT;
        intent.addFlags(268435456);
        if (i3 >= 31) {
            i2 = 33554432;
        }
        return PendingIntent.getBroadcast(webService, i, intent, i2);
    }

    public static ComponentName c(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            throw new IllegalStateException("Expected 1 service that handles " + str + ", found " + queryIntentServices.size());
        }
    }
}
