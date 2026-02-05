package it.deviato.spotifuck;

import Q0.C0036e;
import R0.a;
import R0.c;
import R0.f;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;

public class AppSingleton extends Application {

    /* renamed from: A  reason: collision with root package name */
    public static int f3136A;

    /* renamed from: B  reason: collision with root package name */
    public static boolean f3137B;

    /* renamed from: C  reason: collision with root package name */
    public static final Handler f3138C = new Handler(Looper.getMainLooper());

    /* renamed from: D  reason: collision with root package name */
    public static final Handler f3139D = new Handler(Looper.getMainLooper());

    /* renamed from: E  reason: collision with root package name */
    public static C0036e f3140E;

    /* renamed from: F  reason: collision with root package name */
    public static C0036e f3141F;

    /* renamed from: f  reason: collision with root package name */
    public static Context f3142f;

    /* renamed from: g  reason: collision with root package name */
    public static WeakReference f3143g;

    /* renamed from: h  reason: collision with root package name */
    public static SharedPreferences f3144h;
    public static SharedPreferences.Editor i;

    /* renamed from: j  reason: collision with root package name */
    public static c f3145j;

    /* renamed from: k  reason: collision with root package name */
    public static String f3146k;

    /* renamed from: l  reason: collision with root package name */
    public static String f3147l;

    /* renamed from: m  reason: collision with root package name */
    public static boolean f3148m;

    /* renamed from: n  reason: collision with root package name */
    public static boolean f3149n;

    /* renamed from: o  reason: collision with root package name */
    public static boolean f3150o;

    /* renamed from: p  reason: collision with root package name */
    public static boolean f3151p;

    /* renamed from: q  reason: collision with root package name */
    public static boolean f3152q;

    /* renamed from: r  reason: collision with root package name */
    public static boolean f3153r;

    /* renamed from: s  reason: collision with root package name */
    public static boolean f3154s;

    /* renamed from: t  reason: collision with root package name */
    public static boolean f3155t;

    /* renamed from: u  reason: collision with root package name */
    public static boolean f3156u;

    /* renamed from: v  reason: collision with root package name */
    public static boolean f3157v;

    /* renamed from: w  reason: collision with root package name */
    public static boolean f3158w;

    /* renamed from: x  reason: collision with root package name */
    public static boolean f3159x;

    /* renamed from: y  reason: collision with root package name */
    public static boolean f3160y;

    /* renamed from: z  reason: collision with root package name */
    public static int f3161z;

    public static void a() {
        MainActivity mainActivity = (MainActivity) f3143g.get();
        if (mainActivity != null) {
            mainActivity.runOnUiThread(new a(mainActivity, 0));
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [R0.c, android.webkit.WebView] */
    public static WebView b() {
        if (f3145j == null) {
            ? webView = new WebView(f3142f);
            f3145j = webView;
            WebSettings settings = webView.getSettings();
            settings.setUserAgentString("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
            settings.setJavaScriptEnabled(true);
            settings.setSupportMultipleWindows(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setDomStorageEnabled(true);
            settings.setDatabaseEnabled(true);
            settings.setMediaPlaybackRequiresUserGesture(false);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            settings.setSupportZoom(true);
            f3145j.setInitialScale(100);
            f3145j.setBackgroundColor(-12303292);
            f3145j.addJavascriptInterface(new f(f3142f), "AndBridge");
            f3145j.setWebChromeClient(new WebChromeClient());
            f3145j.setWebViewClient(new WebViewClient());
            if (!f3137B) {
                if (!f3149n) {
                    f3145j.loadUrl("https://accounts.spotify.com/login");
                } else {
                    f3145j.loadUrl("https://open.spotify.com/");
                }
            }
        }
        return f3145j;
    }

    public final void onCreate() {
        super.onCreate();
        f3142f = getApplicationContext();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        f3144h = defaultSharedPreferences;
        i = defaultSharedPreferences.edit();
        f3148m = f3144h.getBoolean("ServiceOn", true);
        f3149n = f3144h.getBoolean("LoggedIn", false);
        f3146k = f3144h.getString("APlayMode", "disabled");
        f3151p = f3144h.getBoolean("CloseNowPlay", false);
        f3150o = f3144h.getBoolean("TakeControl", true);
        f3147l = f3144h.getString("GuiMode", "csshack");
        f3152q = f3144h.getBoolean("Amoled", false);
        f3153r = f3144h.getBoolean("AndAuto", true);
        f3154s = f3144h.getBoolean("SwipeStop", true);
        f3161z = Integer.parseInt(f3144h.getString("AutoShut", "0"));
        f3136A = Integer.parseInt(f3144h.getString("AutoSleep", "0"));
        f3155t = f3144h.getBoolean("ForcePortrait", false);
        f3156u = f3144h.getBoolean("ForceEn", false);
        f3157v = f3144h.getBoolean("HPAP", false);
        f3158w = f3144h.getBoolean("HPAS", false);
        f3159x = f3144h.getBoolean("BTAP", false);
        f3160y = f3144h.getBoolean("BTAS", false);
    }
}
