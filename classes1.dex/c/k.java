package C;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.t;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import e0.C0093a;
import e0.C0094b;
import it.deviato.spotifuck.WebService;
import java.util.ArrayList;
import java.util.Iterator;
import r.c;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final WebService f58a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f59b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f60c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f61d = new ArrayList();
    public CharSequence e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f62f;

    /* renamed from: g  reason: collision with root package name */
    public PendingIntent f63g;

    /* renamed from: h  reason: collision with root package name */
    public IconCompat f64h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f65j = true;

    /* renamed from: k  reason: collision with root package name */
    public t f66k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f67l;

    /* renamed from: m  reason: collision with root package name */
    public Bundle f68m;

    /* renamed from: n  reason: collision with root package name */
    public int f69n = 0;

    /* renamed from: o  reason: collision with root package name */
    public final String f70o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f71p;

    /* renamed from: q  reason: collision with root package name */
    public final Notification f72q;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f73r;

    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11, types: [java.lang.CharSequence, android.net.Uri, java.lang.String, long[]] */
    /* JADX WARNING: type inference failed for: r2v9, types: [java.lang.CharSequence, android.app.PendingIntent] */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: type inference failed for: r3v17 */
    public final Notification a() {
        Notification.Builder builder;
        ArrayList arrayList;
        ? r3;
        ? r2;
        Notification notification;
        ArrayList arrayList2;
        Bundle bundle;
        int i2;
        ArrayList arrayList3;
        Notification.Action.Builder builder2;
        Bundle bundle2;
        int i3;
        Bitmap bitmap;
        new ArrayList();
        Bundle bundle3 = new Bundle();
        WebService webService = this.f58a;
        int i4 = Build.VERSION.SDK_INT;
        String str = this.f70o;
        if (i4 >= 26) {
            builder = p.a(webService, str);
        } else {
            builder = new Notification.Builder(this.f58a);
        }
        Notification notification2 = this.f72q;
        builder.setWhen(notification2.when).setSmallIcon(notification2.icon, notification2.iconLevel).setContent(notification2.contentView).setTicker(notification2.tickerText, (RemoteViews) null).setVibrate(notification2.vibrate).setLights(notification2.ledARGB, notification2.ledOnMS, notification2.ledOffMS).setOngoing((notification2.flags & 2) != 0).setOnlyAlertOnce((notification2.flags & 8) != 0).setAutoCancel((notification2.flags & 16) != 0).setDefaults(notification2.defaults).setContentTitle(this.e).setContentText(this.f62f).setContentInfo((CharSequence) null).setContentIntent(this.f63g).setDeleteIntent(notification2.deleteIntent).setFullScreenIntent((PendingIntent) null, (notification2.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        if (i4 < 23) {
            IconCompat iconCompat = this.f64h;
            if (iconCompat != null) {
                int i5 = iconCompat.f1464a;
                if (i5 != -1 || i4 < 23) {
                    if (i5 == 1) {
                        bitmap = (Bitmap) iconCompat.f1465b;
                    } else if (i5 == 5) {
                        bitmap = IconCompat.a((Bitmap) iconCompat.f1465b, true);
                    } else {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat);
                    }
                    builder.setLargeIcon(bitmap);
                } else {
                    Object obj = iconCompat.f1465b;
                    if (obj instanceof Bitmap) {
                        bitmap = (Bitmap) obj;
                        builder.setLargeIcon(bitmap);
                    }
                }
            }
            bitmap = null;
            builder.setLargeIcon(bitmap);
        } else {
            IconCompat iconCompat2 = this.f64h;
            n.b(builder, iconCompat2 == null ? null : iconCompat2.e(webService));
        }
        builder.setSubText((CharSequence) null).setUsesChronometer(false).setPriority(this.i);
        Iterator it2 = this.f59b.iterator();
        while (it2.hasNext()) {
            j jVar = (j) it2.next();
            int i6 = Build.VERSION.SDK_INT;
            if (jVar.f53b == null && (i3 = jVar.e) != 0) {
                jVar.f53b = IconCompat.b((Resources) null, "", i3);
            }
            IconCompat iconCompat3 = jVar.f53b;
            PendingIntent pendingIntent = jVar.f57g;
            CharSequence charSequence = jVar.f56f;
            if (i6 >= 23) {
                builder2 = n.a(iconCompat3 != null ? iconCompat3.e((WebService) null) : null, charSequence, pendingIntent);
            } else {
                builder2 = l.e(iconCompat3 != null ? iconCompat3.c() : 0, charSequence, pendingIntent);
            }
            Bundle bundle4 = jVar.f52a;
            if (bundle4 != null) {
                bundle2 = new Bundle(bundle4);
            } else {
                bundle2 = new Bundle();
            }
            boolean z2 = jVar.f54c;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z2);
            if (i6 >= 24) {
                o.a(builder2, z2);
            }
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i6 >= 28) {
                q.b(builder2, 0);
            }
            if (i6 >= 29) {
                r.c(builder2, false);
            }
            if (i6 >= 31) {
                s.a(builder2, false);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", jVar.f55d);
            l.b(builder2, bundle2);
            l.a(builder, l.d(builder2));
        }
        Bundle bundle5 = this.f68m;
        if (bundle5 != null) {
            bundle3.putAll(bundle5);
        }
        int i7 = Build.VERSION.SDK_INT;
        builder.setShowWhen(this.f65j);
        l.i(builder, false);
        l.g(builder, (String) null);
        l.j(builder, (String) null);
        l.h(builder, false);
        m.b(builder, (String) null);
        m.c(builder, 0);
        m.f(builder, this.f69n);
        m.d(builder, (Notification) null);
        m.e(builder, notification2.sound, notification2.audioAttributes);
        ArrayList<String> arrayList4 = this.f73r;
        ArrayList arrayList5 = this.f60c;
        if (i7 < 28) {
            if (arrayList5 == null) {
                arrayList3 = null;
            } else {
                arrayList3 = new ArrayList(arrayList5.size());
                Iterator it3 = arrayList5.iterator();
                if (it3.hasNext()) {
                    it3.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList3 != null) {
                if (arrayList4 == null) {
                    arrayList4 = arrayList3;
                } else {
                    c cVar = new c(arrayList4.size() + arrayList3.size());
                    cVar.addAll(arrayList3);
                    cVar.addAll(arrayList4);
                    arrayList4 = new ArrayList<>(cVar);
                }
            }
        }
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            for (String a2 : arrayList4) {
                m.a(builder, a2);
            }
        }
        ArrayList arrayList6 = this.f61d;
        if (arrayList6.size() > 0) {
            if (this.f68m == null) {
                this.f68m = new Bundle();
            }
            Bundle bundle6 = this.f68m.getBundle("android.car.EXTENSIONS");
            if (bundle6 == null) {
                bundle6 = new Bundle();
            }
            Bundle bundle7 = new Bundle(bundle6);
            Bundle bundle8 = new Bundle();
            int i8 = 0;
            while (i8 < arrayList6.size()) {
                String num = Integer.toString(i8);
                j jVar2 = (j) arrayList6.get(i8);
                Bundle bundle9 = new Bundle();
                ArrayList arrayList7 = arrayList6;
                if (jVar2.f53b != null || (i2 = jVar2.e) == 0) {
                    arrayList2 = arrayList5;
                } else {
                    arrayList2 = arrayList5;
                    jVar2.f53b = IconCompat.b((Resources) null, "", i2);
                }
                IconCompat iconCompat4 = jVar2.f53b;
                bundle9.putInt("icon", iconCompat4 != null ? iconCompat4.c() : 0);
                bundle9.putCharSequence("title", jVar2.f56f);
                bundle9.putParcelable("actionIntent", jVar2.f57g);
                Bundle bundle10 = jVar2.f52a;
                if (bundle10 != null) {
                    bundle = new Bundle(bundle10);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", jVar2.f54c);
                bundle9.putBundle("extras", bundle);
                bundle9.putParcelableArray("remoteInputs", (Parcelable[]) null);
                bundle9.putBoolean("showsUserInterface", jVar2.f55d);
                bundle9.putInt("semanticAction", 0);
                bundle8.putBundle(num, bundle9);
                i8++;
                arrayList6 = arrayList7;
                arrayList5 = arrayList2;
            }
            arrayList = arrayList5;
            bundle6.putBundle("invisible_actions", bundle8);
            bundle7.putBundle("invisible_actions", bundle8);
            if (this.f68m == null) {
                this.f68m = new Bundle();
            }
            this.f68m.putBundle("android.car.EXTENSIONS", bundle6);
            bundle3.putBundle("android.car.EXTENSIONS", bundle7);
        } else {
            arrayList = arrayList5;
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 24) {
            builder.setExtras(this.f68m);
            r3 = 0;
            o.e(builder, (CharSequence[]) null);
        } else {
            r3 = 0;
        }
        if (i9 >= 26) {
            p.b(builder, 0);
            p.e(builder, r3);
            p.f(builder, r3);
            p.g(builder, 0);
            p.d(builder, 0);
            if (this.f67l) {
                p.c(builder, false);
            }
            if (!TextUtils.isEmpty(str)) {
                builder.setSound(r3).setDefaults(0).setLights(0, 0, 0).setVibrate(r3);
            }
        }
        if (i9 >= 28) {
            Iterator it4 = arrayList.iterator();
            if (it4.hasNext()) {
                it4.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i9 >= 29) {
            r.a(builder, this.f71p);
            r2 = 0;
            r.b(builder, (Notification.BubbleMetadata) null);
        } else {
            r2 = 0;
        }
        t tVar = this.f66k;
        if (tVar != null) {
            if (Build.VERSION.SDK_INT >= 34) {
                C0093a.d(builder, C0093a.b(C0094b.a(C0093a.a(), r2, 0, r2, Boolean.FALSE), (int[]) tVar.f1132c, (MediaSessionCompat$Token) tVar.f1133d));
            } else {
                C0093a.d(builder, C0093a.b(C0093a.a(), (int[]) tVar.f1132c, (MediaSessionCompat$Token) tVar.f1133d));
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            notification = builder.build();
        } else if (i10 >= 24) {
            notification = builder.build();
        } else {
            builder.setExtras(bundle3);
            notification = builder.build();
        }
        if (tVar != null) {
            this.f66k.getClass();
        }
        if (tVar != null) {
            Bundle bundle11 = notification.extras;
        }
        return notification;
    }

    public static CharSequence b(String str) {
        if (str != null && str.length() > 5120) {
            return str.subSequence(0, 5120);
        }
        return str;
    }

    public final void c(t tVar) {
        if (this.f66k != tVar) {
            this.f66k = tVar;
            if (((k) tVar.f1131b) != this) {
                tVar.f1131b = this;
                c(tVar);
            }
        }
    }

    public k(WebService webService) {
        Notification notification = new Notification();
        this.f72q = notification;
        this.f58a = webService;
        this.f70o = "SpotifuckChannel";
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.i = 0;
        this.f73r = new ArrayList();
        this.f71p = true;
    }
}
