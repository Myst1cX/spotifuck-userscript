package A;

import E.j;
import M0.e;
import N.C0003c;
import N.C0005e;
import N.C0006f;
import N.Q;
import N.r;
import N.u0;
import N.w0;
import O.k;
import O.l;
import Q0.E;
import Q0.H;
import T0.g;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.StatFs;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.f;
import android.support.v4.media.session.t;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import android.view.ContentInfo;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.emoji2.text.a;
import androidx.emoji2.text.i;
import androidx.emoji2.text.n;
import androidx.emoji2.text.u;
import androidx.fragment.app.C0065t;
import androidx.fragment.app.S;
import androidx.lifecycle.K;
import androidx.lifecycle.M;
import androidx.lifecycle.O;
import androidx.profileinstaller.ProfileInstallReceiver;
import b0.d;
import g1.w;
import g1.x;
import h0.C0128e;
import h1.c;
import it.deviato.spotifuck.WebService;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r1.h;

public class b implements r, C0003c, C0005e, i, n, J.b, O, C0128e {

    /* renamed from: h  reason: collision with root package name */
    public static b f0h;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f1f;

    /* renamed from: g  reason: collision with root package name */
    public Object f2g;

    public /* synthetic */ b(int i, Object obj) {
        this.f1f = i;
        this.f2g = obj;
    }

    public static void s(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (!str.isEmpty()) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= ' ' || charAt >= 127) {
                    Object[] objArr = {Integer.valueOf(charAt), Integer.valueOf(i), str};
                    byte[] bArr = c.f3086a;
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", objArr));
                }
            }
            if (str2 != null) {
                int length2 = str2.length();
                int i2 = 0;
                while (i2 < length2) {
                    char charAt2 = str2.charAt(i2);
                    if ((charAt2 > 31 || charAt2 == 9) && charAt2 < 127) {
                        i2++;
                    } else {
                        Object[] objArr2 = {Integer.valueOf(charAt2), Integer.valueOf(i2), str, str2};
                        byte[] bArr2 = c.f3086a;
                        throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in %s value: %s", objArr2));
                    }
                }
                return;
            }
            throw new NullPointerException(E.g("value for name ", str, " == null"));
        } else {
            throw new IllegalArgumentException("name is empty");
        }
    }

    public boolean A(int i, int i2, Bundle bundle) {
        return false;
    }

    public void B(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f2g;
            if (i < arrayList.size()) {
                if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                    arrayList.remove(i);
                    arrayList.remove(i);
                    i -= 2;
                }
                i += 2;
            } else {
                return;
            }
        }
    }

    public w0 l(View view, w0 w0Var) {
        boolean z2;
        boolean z3;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f2g;
        if (!Objects.equals(coordinatorLayout.f1452s, w0Var)) {
            coordinatorLayout.f1452s = w0Var;
            if (w0Var.d() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            coordinatorLayout.f1453t = z2;
            if (z2 || coordinatorLayout.getBackground() != null) {
                z3 = false;
            } else {
                z3 = true;
            }
            coordinatorLayout.setWillNotDraw(z3);
            u0 u0Var = w0Var.f597a;
            if (!u0Var.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = Q.f509a;
                    if (childAt.getFitsSystemWindows() && ((f) childAt.getLayoutParams()).f4a != null && u0Var.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return w0Var;
    }

    public k t(int i) {
        return null;
    }

    public k u(int i) {
        return null;
    }

    public b(Context context, int i) {
        long j2;
        this.f1f = i;
        switch (i) {
            case 9:
                h hVar = H.f783a;
                File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
                if (!file.exists()) {
                    file.mkdirs();
                }
                try {
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    j2 = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
                } catch (IllegalArgumentException unused) {
                    j2 = 5242880;
                }
                long max = Math.max(Math.min(j2, 52428800), 5242880);
                w wVar = new w();
                wVar.f2786g = new g1.h(file, max);
                this.f2g = new x(wVar);
                return;
            case 15:
                this.f2g = context.getApplicationContext();
                return;
            default:
                h hVar2 = H.f783a;
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                this.f2g = new LruCache((int) ((((long) ((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass())) * 1048576) / 7));
                return;
        }
    }

    public void D(Object obj) {
        boolean z2 = obj instanceof List;
        ArrayList arrayList = null;
        MediaBrowserService.Result result = (MediaBrowserService.Result) this.f2g;
        if (z2) {
            List<Parcel> list = (List) obj;
            if (list != null) {
                arrayList = new ArrayList(list.size());
                for (Parcel parcel : list) {
                    parcel.setDataPosition(0);
                    arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                    parcel.recycle();
                }
            }
            result.sendResult(arrayList);
        } else if (obj instanceof Parcel) {
            Parcel parcel2 = (Parcel) obj;
            parcel2.setDataPosition(0);
            result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
            parcel2.recycle();
        } else {
            result.sendResult((Object) null);
        }
    }

    public void E() {
        synchronized (((g1.h) this.f2g)) {
        }
    }

    public int a() {
        return ((ContentInfo) this.f2g).getFlags();
    }

    public void b(Bundle bundle) {
        ((ContentInfo.Builder) this.f2g).setExtras(bundle);
    }

    public void d(Uri uri) {
        ((ContentInfo.Builder) this.f2g).setLinkUri(uri);
    }

    public M e(Class cls, b0.c cVar) {
        M m2 = null;
        for (d dVar : (d[]) this.f2g) {
            if (dVar.f2077a.equals(cls)) {
                androidx.lifecycle.H.f1802a.getClass();
                Z0.c.e("$this$initializer", cVar);
                m2 = new K();
            }
        }
        if (m2 != null) {
            return m2;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    public int f() {
        return ((ContentInfo) this.f2g).getSource();
    }

    public M g(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public Object h() {
        return this;
    }

    public ClipData i() {
        return ((ContentInfo) this.f2g).getClip();
    }

    public C0006f j() {
        return new C0006f(new b(((ContentInfo.Builder) this.f2g).build()));
    }

    public void m() {
        ((S) this.f2g).a();
    }

    public ContentInfo n() {
        return (ContentInfo) this.f2g;
    }

    public void o(g gVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new androidx.emoji2.text.k(this, gVar, threadPoolExecutor));
    }

    public void p(int i) {
        ((ContentInfo.Builder) this.f2g).setFlags(i);
    }

    public void q(String str) {
        int indexOf = str.indexOf(":", 1);
        if (indexOf != -1) {
            r(str.substring(0, indexOf), str.substring(indexOf + 1));
        } else if (str.startsWith(":")) {
            r("", str.substring(1));
        } else {
            r("", str);
        }
    }

    public void r(String str, String str2) {
        ArrayList arrayList = (ArrayList) this.f2g;
        arrayList.add(str);
        arrayList.add(str2.trim());
    }

    public String toString() {
        switch (this.f1f) {
            case 6:
                return "ContentInfoCompat{" + ((ContentInfo) this.f2g) + "}";
            default:
                return super.toString();
        }
    }

    public String v(String str) {
        ArrayList arrayList = (ArrayList) this.f2g;
        for (int size = arrayList.size() - 2; size >= 0; size -= 2) {
            if (str.equalsIgnoreCase((String) arrayList.get(size))) {
                return (String) arrayList.get(size + 1);
            }
        }
        return null;
    }

    public android.support.v4.media.session.i w() {
        MediaController.TransportControls transportControls = ((f) this.f2g).f1113a.getTransportControls();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            return new android.support.v4.media.session.i(transportControls);
        }
        if (i >= 24) {
            return new android.support.v4.media.session.i(transportControls);
        }
        if (i >= 23) {
            return new android.support.v4.media.session.i(transportControls);
        }
        return new android.support.v4.media.session.i(transportControls);
    }

    public void x() {
        ((C0065t) this.f2g).i.K();
    }

    public void y(String str, List list, Bundle bundle) {
        ArrayList arrayList;
        Bundle bundle2 = new Bundle();
        bundle2.putString("data_media_item_id", str);
        bundle2.putBundle("data_options", bundle);
        bundle2.putBundle("data_notify_children_changed_options", (Bundle) null);
        if (list != null) {
            if (list instanceof ArrayList) {
                arrayList = (ArrayList) list;
            } else {
                arrayList = new ArrayList(list);
            }
            bundle2.putParcelableArrayList("data_media_item_list", arrayList);
        }
        C(3, bundle2);
    }

    public void z() {
        synchronized (this.f2g) {
        }
    }

    public void C(int i, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = 2;
        obtain.setData(bundle);
        ((Messenger) this.f2g).send(obtain);
    }

    public boolean c(CharSequence charSequence, int i, int i2, u uVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), (String) this.f2g)) {
            return true;
        }
        uVar.f1549c = (uVar.f1549c & 3) | 4;
        return false;
    }

    public void k(int i, Serializable serializable) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
            default:
                str = "";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        }
        ((ProfileInstallReceiver) this.f2g).setResultCode(i);
    }

    public b(d[] dVarArr) {
        this.f1f = 21;
        Z0.c.e("initializers", dVarArr);
        this.f2g = dVarArr;
    }

    public b(TextView textView) {
        this.f1f = 13;
        this.f2g = new X.g(textView);
    }

    public b(EditText editText) {
        this.f1f = 12;
        this.f2g = new j(editText);
    }

    public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f1f = 10;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f2g = new S.f(uri, clipDescription, uri2);
        } else {
            this.f2g = new t((Object) uri, (Object) clipDescription, (Object) uri2, 2);
        }
    }

    public b(WebService webService, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f1f = 14;
        if (mediaSessionCompat$Token != null) {
            Collections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.f2g = new f(webService, mediaSessionCompat$Token);
            } else {
                this.f2g = new f(webService, mediaSessionCompat$Token);
            }
        } else {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
    }

    public b(int i) {
        this.f1f = i;
        switch (i) {
            case 4:
                this.f2g = new Object();
                new Handler(Looper.getMainLooper(), new e(this));
                return;
            case 7:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f2g = new l(this);
                    return;
                } else {
                    this.f2g = new l(this);
                    return;
                }
            case 27:
                this.f2g = new ArrayList(20);
                return;
            default:
                return;
        }
    }

    public b(ContentInfo contentInfo) {
        this.f1f = 6;
        contentInfo.getClass();
        this.f2g = H0.e.h(contentInfo);
    }

    public b(ClipData clipData, int i) {
        this.f1f = 5;
        this.f2g = H0.e.f(clipData, i);
    }
}
