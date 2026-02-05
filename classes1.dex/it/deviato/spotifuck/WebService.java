package it.deviato.spotifuck;

import C.j;
import C.k;
import L.f;
import Q0.E;
import R0.c;
import R0.m;
import R0.n;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.media.AudioManager;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.PowerManager;
import android.os.SystemClock;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.i;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.o;
import android.support.v4.media.session.t;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media.session.MediaButtonReceiver;
import d0.q;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import r.b;

public class WebService extends q {

    /* renamed from: A  reason: collision with root package name */
    public static long f3179A = 0;

    /* renamed from: B  reason: collision with root package name */
    public static int f3180B = 8;

    /* renamed from: C  reason: collision with root package name */
    public static int f3181C;

    /* renamed from: D  reason: collision with root package name */
    public static boolean f3182D = false;

    /* renamed from: E  reason: collision with root package name */
    public static boolean f3183E = true;

    /* renamed from: F  reason: collision with root package name */
    public static MediaActionReceiver f3184F;

    /* renamed from: G  reason: collision with root package name */
    public static AudioManager f3185G;

    /* renamed from: H  reason: collision with root package name */
    public static n f3186H;

    /* renamed from: n  reason: collision with root package name */
    public static t f3187n;

    /* renamed from: o  reason: collision with root package name */
    public static Notification f3188o;

    /* renamed from: p  reason: collision with root package name */
    public static k f3189p;

    /* renamed from: q  reason: collision with root package name */
    public static WebService f3190q;

    /* renamed from: r  reason: collision with root package name */
    public static WebView f3191r;

    /* renamed from: s  reason: collision with root package name */
    public static PowerManager.WakeLock f3192s;

    /* renamed from: t  reason: collision with root package name */
    public static Boolean f3193t = Boolean.FALSE;

    /* renamed from: u  reason: collision with root package name */
    public static Boolean f3194u;

    /* renamed from: v  reason: collision with root package name */
    public static Bitmap f3195v = null;

    /* renamed from: w  reason: collision with root package name */
    public static String f3196w = "No Artist";

    /* renamed from: x  reason: collision with root package name */
    public static String f3197x = "No Track";

    /* renamed from: y  reason: collision with root package name */
    public static String f3198y = "false";

    /* renamed from: z  reason: collision with root package name */
    public static long f3199z = 0;

    public static class MediaActionReceiver extends BroadcastReceiver {
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onReceive(android.content.Context r7, android.content.Intent r8) {
            /*
                r6 = this;
                r7 = 2
                r0 = 1
                r1 = 0
                r2 = -1
                java.lang.Boolean r3 = it.deviato.spotifuck.WebService.f3193t
                boolean r3 = r3.booleanValue()
                if (r3 == 0) goto L_0x00ea
                boolean r3 = it.deviato.spotifuck.AppSingleton.f3137B
                if (r3 == 0) goto L_0x00ea
                android.support.v4.media.session.t r3 = it.deviato.spotifuck.WebService.f3187n
                if (r3 != 0) goto L_0x0016
                goto L_0x00ea
            L_0x0016:
                java.lang.Object r3 = r3.f1132c
                A.b r3 = (A.b) r3
                android.support.v4.media.session.i r3 = r3.w()
                java.lang.String r4 = r8.getAction()
                r4.getClass()
                android.media.session.MediaController$TransportControls r3 = r3.f1117a
                int r5 = r4.hashCode()
                switch(r5) {
                    case -1676458352: goto L_0x0072;
                    case -1483581094: goto L_0x0067;
                    case 244797366: goto L_0x005c;
                    case 545516589: goto L_0x0051;
                    case 967298791: goto L_0x0046;
                    case 1259288590: goto L_0x003b;
                    case 1259360078: goto L_0x0030;
                    default: goto L_0x002e;
                }
            L_0x002e:
                r5 = -1
                goto L_0x007c
            L_0x0030:
                java.lang.String r5 = "WIDGET_PREV"
                boolean r5 = r4.equals(r5)
                if (r5 != 0) goto L_0x0039
                goto L_0x002e
            L_0x0039:
                r5 = 6
                goto L_0x007c
            L_0x003b:
                java.lang.String r5 = "WIDGET_NEXT"
                boolean r5 = r4.equals(r5)
                if (r5 != 0) goto L_0x0044
                goto L_0x002e
            L_0x0044:
                r5 = 5
                goto L_0x007c
            L_0x0046:
                java.lang.String r5 = "WIDGET_PLAYPAUSE"
                boolean r5 = r4.equals(r5)
                if (r5 != 0) goto L_0x004f
                goto L_0x002e
            L_0x004f:
                r5 = 4
                goto L_0x007c
            L_0x0051:
                java.lang.String r5 = "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"
                boolean r5 = r4.equals(r5)
                if (r5 != 0) goto L_0x005a
                goto L_0x002e
            L_0x005a:
                r5 = 3
                goto L_0x007c
            L_0x005c:
                java.lang.String r5 = "ADDTOFAV_ACTION"
                boolean r5 = r4.equals(r5)
                if (r5 != 0) goto L_0x0065
                goto L_0x002e
            L_0x0065:
                r5 = 2
                goto L_0x007c
            L_0x0067:
                java.lang.String r5 = "REPEAT_ACTION"
                boolean r5 = r4.equals(r5)
                if (r5 != 0) goto L_0x0070
                goto L_0x002e
            L_0x0070:
                r5 = 1
                goto L_0x007c
            L_0x0072:
                java.lang.String r5 = "android.intent.action.HEADSET_PLUG"
                boolean r5 = r4.equals(r5)
                if (r5 != 0) goto L_0x007b
                goto L_0x002e
            L_0x007b:
                r5 = 0
            L_0x007c:
                switch(r5) {
                    case 0: goto L_0x00d1;
                    case 1: goto L_0x00ae;
                    case 2: goto L_0x00ae;
                    case 3: goto L_0x0089;
                    case 4: goto L_0x00a2;
                    case 5: goto L_0x0085;
                    case 6: goto L_0x0081;
                    default: goto L_0x007f;
                }
            L_0x007f:
                goto L_0x00ea
            L_0x0081:
                r3.skipToPrevious()
                goto L_0x00ea
            L_0x0085:
                r3.skipToNext()
                goto L_0x00ea
            L_0x0089:
                java.lang.String r0 = "android.bluetooth.profile.extra.STATE"
                int r8 = r8.getIntExtra(r0, r1)
                boolean r0 = it.deviato.spotifuck.AppSingleton.f3159x
                if (r0 == 0) goto L_0x0099
                if (r8 != r7) goto L_0x0099
                r3.play()
                goto L_0x00a2
            L_0x0099:
                boolean r7 = it.deviato.spotifuck.AppSingleton.f3160y
                if (r7 == 0) goto L_0x00a2
                if (r8 != 0) goto L_0x00a2
                r3.pause()
            L_0x00a2:
                boolean r7 = it.deviato.spotifuck.WebService.f3182D
                if (r7 == 0) goto L_0x00aa
                r3.pause()
                goto L_0x00ea
            L_0x00aa:
                r3.play()
                goto L_0x00ea
            L_0x00ae:
                java.lang.String r7 = "android.support.v4.media.session.action.FOLLOW"
                boolean r7 = r4.equals(r7)
                if (r7 != 0) goto L_0x00c3
                java.lang.String r7 = "android.support.v4.media.session.action.UNFOLLOW"
                boolean r7 = r4.equals(r7)
                if (r7 != 0) goto L_0x00c3
                r7 = 0
                r3.sendCustomAction(r4, r7)
                goto L_0x00ea
            L_0x00c3:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r8 = "An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action "
                java.lang.String r0 = "."
                java.lang.String r8 = Q0.E.g(r8, r4, r0)
                r7.<init>(r8)
                throw r7
            L_0x00d1:
                java.lang.String r7 = "state"
                int r7 = r8.getIntExtra(r7, r2)
                boolean r8 = it.deviato.spotifuck.AppSingleton.f3157v
                if (r8 == 0) goto L_0x00e1
                if (r7 != r0) goto L_0x00e1
                r3.play()
                goto L_0x00ea
            L_0x00e1:
                boolean r8 = it.deviato.spotifuck.AppSingleton.f3158w
                if (r8 == 0) goto L_0x00ea
                if (r7 != 0) goto L_0x00ea
                r3.pause()
            L_0x00ea:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: it.deviato.spotifuck.WebService.MediaActionReceiver.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    public static void f() {
        int i;
        int i2;
        k kVar;
        int i3;
        int i4;
        k kVar2;
        IconCompat iconCompat = null;
        if (f3198y.equals("true")) {
            f3181C = 2131230966;
        } else if (f3198y.equals("mixed")) {
            f3181C = 2131230967;
        } else {
            f3181C = 2131230965;
        }
        boolean z2 = f3182D;
        if (z2) {
            i = 3;
        } else {
            i = 2;
        }
        f3180B = i;
        if (z2) {
            if (!f3192s.isHeld()) {
                f3192s.acquire();
            }
        } else if (f3192s.isHeld()) {
            f3192s.release();
        }
        if (f3183E) {
            i2 = 2131230864;
        } else {
            i2 = 2131230863;
        }
        if (TextUtils.isEmpty("ADDTOFAV_ACTION")) {
            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
        } else if (TextUtils.isEmpty("Add to Favorites")) {
            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
        } else if (i2 != 0) {
            int i5 = f3181C;
            if (TextUtils.isEmpty("REPEAT_ACTION")) {
                throw new IllegalArgumentException("You must specify an action to build a CustomAction");
            } else if (TextUtils.isEmpty("Repeat")) {
                throw new IllegalArgumentException("You must specify a name to build a CustomAction");
            } else if (i5 != 0) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new PlaybackStateCompat.CustomAction("ADDTOFAV_ACTION", "Add to Favorites", i2, (Bundle) null));
                arrayList.add(new PlaybackStateCompat.CustomAction("REPEAT_ACTION", "Repeat", i5, (Bundle) null));
                f3187n.D(new PlaybackStateCompat(f3180B, f3179A, 0, 1.0f, 1846, 0, (CharSequence) null, SystemClock.elapsedRealtime(), arrayList, -1, (Bundle) null));
                i iVar = new i();
                Bundle bundle = iVar.f1083a;
                iVar.a("android.media.metadata.TITLE", f3197x);
                iVar.a("android.media.metadata.ARTIST", f3196w);
                long j2 = f3199z;
                b bVar = MediaMetadataCompat.f1065c;
                if (!bVar.containsKey("android.media.metadata.DURATION") || ((Integer) bVar.getOrDefault("android.media.metadata.DURATION", (Object) null)).intValue() == 0) {
                    bundle.putLong("android.media.metadata.DURATION", j2);
                    Bitmap bitmap = f3195v;
                    b bVar2 = MediaMetadataCompat.f1065c;
                    if (!bVar2.containsKey("android.media.metadata.ALBUM_ART") || ((Integer) bVar2.getOrDefault("android.media.metadata.ALBUM_ART", (Object) null)).intValue() == 2) {
                        bundle.putParcelable("android.media.metadata.ALBUM_ART", bitmap);
                        MediaMetadataCompat mediaMetadataCompat = new MediaMetadataCompat(bundle);
                        o oVar = (o) f3187n.f1131b;
                        oVar.f1126g = mediaMetadataCompat;
                        if (mediaMetadataCompat.f1067b == null) {
                            Parcel obtain = Parcel.obtain();
                            mediaMetadataCompat.writeToParcel(obtain, 0);
                            obtain.setDataPosition(0);
                            mediaMetadataCompat.f1067b = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
                            obtain.recycle();
                        }
                        oVar.f1121a.setMetadata(mediaMetadataCompat.f1067b);
                        k kVar3 = new k(f3190q);
                        ArrayList arrayList2 = kVar3.f59b;
                        kVar3.e = k.b(f3197x);
                        kVar3.f62f = k.b(f3196w);
                        Bitmap bitmap2 = f3195v;
                        if (bitmap2 == null) {
                            kVar = kVar3;
                        } else {
                            if (Build.VERSION.SDK_INT < 27) {
                                Resources resources = kVar3.f58a.getResources();
                                int dimensionPixelSize = resources.getDimensionPixelSize(2131165276);
                                int dimensionPixelSize2 = resources.getDimensionPixelSize(2131165275);
                                if (bitmap2.getWidth() > dimensionPixelSize || bitmap2.getHeight() > dimensionPixelSize2) {
                                    kVar2 = kVar3;
                                    double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap2.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap2.getHeight())));
                                    bitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) Math.ceil(((double) bitmap2.getWidth()) * min), (int) Math.ceil(((double) bitmap2.getHeight()) * min), true);
                                    PorterDuff.Mode mode = IconCompat.f1463k;
                                    bitmap2.getClass();
                                    iconCompat = new IconCompat(1);
                                    iconCompat.f1465b = bitmap2;
                                    kVar = kVar2;
                                }
                            }
                            kVar2 = kVar3;
                            PorterDuff.Mode mode2 = IconCompat.f1463k;
                            bitmap2.getClass();
                            iconCompat = new IconCompat(1);
                            iconCompat.f1465b = bitmap2;
                            kVar = kVar2;
                        }
                        kVar.f64h = iconCompat;
                        kVar.f72q.icon = 2131230968;
                        kVar.f63g = PendingIntent.getActivity(AppSingleton.f3142f, 0, new Intent(AppSingleton.f3142f, MainActivity.class), 67108864);
                        kVar.f69n = 1;
                        kVar.i = -1;
                        arrayList2.add(new j(2131230964, "Previous", MediaButtonReceiver.a(f3190q, 16)));
                        if (f3182D) {
                            i3 = 2131230961;
                        } else {
                            i3 = 2131230962;
                        }
                        arrayList2.add(new j(i3, "Play/Pause", MediaButtonReceiver.a(f3190q, 512)));
                        arrayList2.add(new j(2131230947, "Next", MediaButtonReceiver.a(f3190q, 32)));
                        if (f3183E) {
                            i4 = 2131230864;
                        } else {
                            i4 = 2131230863;
                        }
                        Class<MediaActionReceiver> cls = MediaActionReceiver.class;
                        arrayList2.add(new j(i4, "Add to Fav", PendingIntent.getBroadcast(f3190q, 1, new Intent(f3190q, cls).setAction("ADDTOFAV_ACTION"), 67108864)));
                        arrayList2.add(new j(f3181C, "Repeat", PendingIntent.getBroadcast(f3190q, 1, new Intent(f3190q, cls).setAction("REPEAT_ACTION"), 67108864)));
                        kVar.f67l = true;
                        t tVar = new t(5);
                        tVar.f1133d = ((o) f3187n.f1131b).f1123c;
                        tVar.f1132c = new int[]{1, 2, 3};
                        kVar.c(tVar);
                        f3189p = kVar;
                        ((NotificationManager) f3190q.getSystemService("notification")).notify(1337, f3189p.a());
                        AppWidgetManager instance = AppWidgetManager.getInstance(AppSingleton.f3142f);
                        new HomeWidget().onUpdate(AppSingleton.f3142f, instance, instance.getAppWidgetIds(new ComponentName(AppSingleton.f3142f, HomeWidget.class)));
                        return;
                    }
                    throw new IllegalArgumentException(E.g("The ", "android.media.metadata.ALBUM_ART", " key cannot be used to put a Bitmap"));
                }
                throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
            } else {
                throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
            }
        } else {
            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
        }
    }

    public static MediaBrowserCompat$MediaItem c(String str, String str2) {
        return new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(str, str2, (CharSequence) null, (CharSequence) null, (Bitmap) null, (Uri) null, (Bundle) null, (Uri) null), 1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: android.support.v4.media.session.PlaybackStateCompat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: android.support.v4.media.session.PlaybackStateCompat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: android.support.v4.media.session.PlaybackStateCompat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: android.support.v4.media.session.PlaybackStateCompat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: android.support.v4.media.session.PlaybackStateCompat} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e() {
        /*
            android.support.v4.media.session.t r0 = f3187n
            java.lang.Object r0 = r0.f1132c
            A.b r0 = (A.b) r0
            java.lang.Object r0 = r0.f2g
            r1 = r0
            android.support.v4.media.session.f r1 = (android.support.v4.media.session.f) r1
            android.support.v4.media.session.MediaSessionCompat$Token r0 = r1.e
            android.support.v4.media.session.d r2 = r0.a()
            if (r2 == 0) goto L_0x0025
            android.support.v4.media.session.d r0 = r0.a()     // Catch:{ RemoteException -> 0x001d }
            android.support.v4.media.session.PlaybackStateCompat r0 = r0.O()     // Catch:{ RemoteException -> 0x001d }
            goto L_0x00ae
        L_0x001d:
            r0 = move-exception
            java.lang.String r2 = "MediaControllerCompat"
            java.lang.String r3 = "Dead object in getPlaybackState."
            android.util.Log.e(r2, r3, r0)
        L_0x0025:
            android.media.session.MediaController r0 = r1.f1113a
            android.media.session.PlaybackState r0 = r0.getPlaybackState()
            r1 = 0
            if (r0 == 0) goto L_0x00ad
            java.util.List r2 = android.support.v4.media.session.u.j(r0)
            if (r2 == 0) goto L_0x0072
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.size()
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x0041:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x006f
            java.lang.Object r4 = r2.next()
            if (r4 == 0) goto L_0x006a
            android.media.session.PlaybackState$CustomAction r4 = (android.media.session.PlaybackState.CustomAction) r4
            android.os.Bundle r5 = android.support.v4.media.session.u.l(r4)
            android.support.v4.media.session.t.j(r5)
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r6 = new android.support.v4.media.session.PlaybackStateCompat$CustomAction
            java.lang.String r7 = android.support.v4.media.session.u.f(r4)
            java.lang.CharSequence r8 = android.support.v4.media.session.u.o(r4)
            int r9 = android.support.v4.media.session.u.m(r4)
            r6.<init>(r7, r8, r9, r5)
            r6.e = r4
            goto L_0x006b
        L_0x006a:
            r6 = r1
        L_0x006b:
            r3.add(r6)
            goto L_0x0041
        L_0x006f:
            r20 = r3
            goto L_0x0074
        L_0x0072:
            r20 = r1
        L_0x0074:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 22
            if (r2 < r3) goto L_0x0081
            android.os.Bundle r1 = android.support.v4.media.session.v.a(r0)
            android.support.v4.media.session.t.j(r1)
        L_0x0081:
            r23 = r1
            android.support.v4.media.session.PlaybackStateCompat r1 = new android.support.v4.media.session.PlaybackStateCompat
            r7 = r1
            int r8 = android.support.v4.media.session.u.r(r0)
            long r9 = android.support.v4.media.session.u.q(r0)
            long r11 = android.support.v4.media.session.u.i(r0)
            float r13 = android.support.v4.media.session.u.p(r0)
            long r14 = android.support.v4.media.session.u.g(r0)
            java.lang.CharSequence r17 = android.support.v4.media.session.u.k(r0)
            long r18 = android.support.v4.media.session.u.n(r0)
            long r21 = android.support.v4.media.session.u.h(r0)
            r16 = 0
            r7.<init>(r8, r9, r11, r13, r14, r16, r17, r18, r20, r21, r23)
            r1.f1105l = r0
        L_0x00ad:
            r0 = r1
        L_0x00ae:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            long r8 = r0.e
            int r2 = f3180B
            long r3 = f3179A
            long r12 = android.os.SystemClock.elapsedRealtime()
            java.util.ArrayList r0 = r0.i
            java.util.Iterator r0 = r0.iterator()
        L_0x00c3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00dd
            java.lang.Object r1 = r0.next()
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r1 = (android.support.v4.media.session.PlaybackStateCompat.CustomAction) r1
            if (r1 == 0) goto L_0x00d5
            r14.add(r1)
            goto L_0x00c3
        L_0x00d5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "You may not add a null CustomAction to PlaybackStateCompat"
            r0.<init>(r1)
            throw r0
        L_0x00dd:
            android.support.v4.media.session.t r0 = f3187n
            android.support.v4.media.session.PlaybackStateCompat r15 = new android.support.v4.media.session.PlaybackStateCompat
            r1 = r15
            r5 = 0
            r17 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r11 = 0
            r18 = -1
            r24 = r15
            r15 = r18
            r1.<init>(r2, r3, r5, r7, r8, r10, r11, r12, r14, r15, r17)
            r1 = r24
            r0.D(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: it.deviato.spotifuck.WebService.e():void");
    }

    public final void b(String str, d0.k kVar) {
        if (f3194u.booleanValue() || str.equals("sfroot")) {
            f3194u = Boolean.FALSE;
            ArrayList arrayList = new ArrayList();
            arrayList.add(c("playlists", "🎵 " + getString(2131755011)));
            arrayList.add(c("albums", "💿 " + getString(2131755008)));
            arrayList.add(c("artists", "👤 " + getString(2131755009)));
            arrayList.add(c("podcasts", "🎙 " + getString(2131755012)));
            kVar.d(arrayList);
            return;
        }
        kVar.a();
        f3191r.evaluateJavascript(E.g("JSON.stringify(", "window.mediaLib?.[" + JSONObject.quote(str) + "]", ")"), new m(this, str, kVar));
    }

    public final void d() {
        f3193t = Boolean.FALSE;
        PowerManager.WakeLock wakeLock = f3192s;
        if (wakeLock != null && wakeLock.isHeld()) {
            f3192s.release();
        }
        t tVar = f3187n;
        if (tVar != null) {
            ((o) tVar.f1131b).f1121a.setActive(false);
            Iterator it2 = ((ArrayList) tVar.f1133d).iterator();
            if (!it2.hasNext()) {
                o oVar = (o) f3187n.f1131b;
                oVar.e.kill();
                int i = Build.VERSION.SDK_INT;
                MediaSession mediaSession = oVar.f1121a;
                if (i == 27) {
                    try {
                        Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                        declaredField.setAccessible(true);
                        Handler handler = (Handler) declaredField.get(mediaSession);
                        if (handler != null) {
                            handler.removeCallbacksAndMessages((Object) null);
                        }
                    } catch (Exception e) {
                        Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e);
                    }
                }
                mediaSession.setCallback((MediaSession.Callback) null);
                oVar.f1122b.f1120b.set((Object) null);
                mediaSession.release();
            } else {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
        stopForeground(true);
        stopSelf();
        c cVar = AppSingleton.f3145j;
        if (cVar != null) {
            cVar.loadUrl("about:blank");
            AppSingleton.f3145j.stopLoading();
            AppSingleton.f3145j.destroy();
            AppSingleton.f3145j = null;
        }
        AppSingleton.f3137B = false;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (!f3193t.booleanValue()) {
            Boolean bool = Boolean.TRUE;
            f3193t = bool;
            f3194u = bool;
            if (AppSingleton.f3153r) {
                t tVar = new t(this, getString(2131755041));
                f3187n = tVar;
                ((o) tVar.f1131b).f1121a.setFlags(3);
                t tVar2 = f3187n;
                ((o) tVar2.f1131b).e(new R0.o(0), new Handler());
                MediaSessionCompat$Token mediaSessionCompat$Token = ((o) f3187n.f1131b).f1123c;
                if (mediaSessionCompat$Token == null) {
                    throw new IllegalArgumentException("Session token may not be null");
                } else if (this.f2503l == null) {
                    this.f2503l = mediaSessionCompat$Token;
                    A.k kVar = this.f2498f;
                    ((q) kVar.i).f2502k.a(new C.b(kVar, mediaSessionCompat$Token, 5, false));
                    t tVar3 = f3187n;
                    ((o) tVar3.f1131b).f1121a.setActive(true);
                    Iterator it2 = ((ArrayList) tVar3.f1133d).iterator();
                    if (it2.hasNext()) {
                        it2.next().getClass();
                        throw new ClassCastException();
                    }
                } else {
                    throw new IllegalStateException("The session token has already been set");
                }
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, "Spotifuck:KeepAlive");
            f3192s = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            f3191r = AppSingleton.b();
            if (AppSingleton.f3153r) {
                k kVar2 = new k(this);
                kVar2.e = k.b(getString(2131755041));
                kVar2.f62f = k.b(getString(2131755243));
                kVar2.f63g = PendingIntent.getActivity(this, 0, new Intent(this, MainActivity.class), 67108864);
                kVar2.f72q.icon = 2131230968;
                kVar2.i = -1;
                kVar2.f69n = 1;
                t tVar4 = new t(5);
                tVar4.f1133d = ((o) f3187n.f1131b).f1123c;
                kVar2.c(tVar4);
                f3189p = kVar2;
            } else {
                k kVar3 = new k(this);
                kVar3.e = k.b(getString(2131755230));
                kVar3.f62f = k.b(getString(2131755229));
                kVar3.f72q.icon = 2131230968;
                kVar3.i = -1;
                f3189p = kVar3;
            }
            f3188o = f3189p.a();
            if (Build.VERSION.SDK_INT >= 29) {
                startForeground(1337, f3188o, 2);
            } else {
                startForeground(1337, f3188o);
            }
        } else if (intent != null && "STOP_SERVICE".equals(intent.getAction())) {
            d();
            return 2;
        }
        return 1;
    }

    public WebService() {
        new ArrayList();
    }

    public final void onCreate() {
        super.onCreate();
        f3190q = this;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && ((NotificationManager) getSystemService(NotificationManager.class)).getNotificationChannel("SpotifuckChannel") == null) {
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(f.b());
        }
        if (i >= 26) {
            f3185G = (AudioManager) getSystemService("audio");
            n nVar = new n();
            f3186H = nVar;
            f3185G.registerAudioDeviceCallback(nVar, new Handler());
            return;
        }
        f3184F = new MediaActionReceiver();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        registerReceiver(new MediaActionReceiver(), intentFilter);
    }

    public final void onDestroy() {
        n nVar;
        super.onDestroy();
        if (Build.VERSION.SDK_INT >= 26 && (nVar = f3186H) != null) {
            f3185G.unregisterAudioDeviceCallback(nVar);
        }
        MediaActionReceiver mediaActionReceiver = f3184F;
        if (mediaActionReceiver != null) {
            unregisterReceiver(mediaActionReceiver);
        }
    }

    public final void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        if (AppSingleton.f3154s) {
            d();
        }
    }
}
