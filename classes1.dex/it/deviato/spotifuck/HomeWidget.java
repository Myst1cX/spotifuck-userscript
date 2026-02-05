package it.deviato.spotifuck;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import it.deviato.spotifuck.WebService;

public class HomeWidget extends AppWidgetProvider {
    public static PendingIntent a(Context context, String str) {
        Intent intent = new Intent(context, WebService.MediaActionReceiver.class);
        intent.setAction(str);
        return PendingIntent.getBroadcast(context, str.hashCode(), intent, 201326592);
    }

    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        int i;
        int i2;
        if (iArr != null && iArr.length != 0) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), 2131492910);
            if (WebService.f3193t.booleanValue()) {
                remoteViews.setTextViewText(2131296776, WebService.f3196w + " - " + WebService.f3197x);
                remoteViews.setImageViewBitmap(2131296497, WebService.f3195v);
                if (WebService.f3182D) {
                    i = 2131230961;
                } else {
                    i = 2131230962;
                }
                remoteViews.setImageViewResource(2131296362, i);
                remoteViews.setImageViewResource(2131296364, WebService.f3181C);
                if (WebService.f3183E) {
                    i2 = 2131230864;
                } else {
                    i2 = 2131230863;
                }
                remoteViews.setImageViewResource(2131296360, i2);
            }
            Intent intent = new Intent(context, MainActivity.class);
            intent.setFlags(268435456);
            remoteViews.setOnClickPendingIntent(2131296795, PendingIntent.getActivity(context, 666, intent, 201326592));
            remoteViews.setOnClickPendingIntent(2131296362, a(context, "WIDGET_PLAYPAUSE"));
            remoteViews.setOnClickPendingIntent(2131296363, a(context, "WIDGET_PREV"));
            remoteViews.setOnClickPendingIntent(2131296361, a(context, "WIDGET_NEXT"));
            remoteViews.setOnClickPendingIntent(2131296364, a(context, "REPEAT_ACTION"));
            remoteViews.setOnClickPendingIntent(2131296360, a(context, "ADDTOFAV_ACTION"));
            for (int updateAppWidget : iArr) {
                appWidgetManager.updateAppWidget(updateAppWidget, remoteViews);
            }
        }
    }
}
