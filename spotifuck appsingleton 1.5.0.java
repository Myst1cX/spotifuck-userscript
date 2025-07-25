
package it.deviato.spotifuck;

import R0.d;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;

public class AppSingleton extends Application {
    public static Context f;
    public static WeakReference g;
    public static SharedPreferences h;
    public static Editor i;
    public static WebView j;
    public static String k;
    public static String l;
    public static boolean m;
    public static boolean n;
    public static boolean o;
    public static boolean p;
    public static boolean q;
    public static boolean r;
    public static boolean s;

    public final void onCreate() {
        super.onCreate();
        f = getApplicationContext();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        h = defaultSharedPreferences;
        i = defaultSharedPreferences.edit();
        m = h.getBoolean("ServiceOn", true);
        n = h.getBoolean("LoggedIn", false);
        k = h.getString("APlayMode", "disabled");
        p = h.getBoolean("CloseNowPlay", true);
        o = h.getBoolean("TakeControl", true);
        l = h.getString("GuiMode", "csshack");
        q = h.getBoolean("AndAuto", true);
        r = h.getBoolean("SwipeStop", false);
    }

    public static WebView a() {
        if (j == null) {
            WebView webView = new WebView(f);
            j = webView;
            WebSettings settings = webView.getSettings();
            settings.setUserAgentString("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36");
            settings.setJavaScriptEnabled(true);
            settings.setSupportMultipleWindows(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setDomStorageEnabled(true);
            settings.setDatabaseEnabled(true);
            settings.setMediaPlaybackRequiresUserGesture(false);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            settings.setSupportZoom(true);
            j.setInitialScale(100);
            j.addJavascriptInterface(new d(f), "AndBridge");
            j.setWebChromeClient(new WebChromeClient());
            j.setWebViewClient(new WebViewClient());
            if (!s) {
                if (n) {
                    j.loadUrl("https://open.spotify.com/");
                } else {
                    j.loadUrl("https://accounts.spotify.com/login");
                }
            }
        }
        return j;
    }
}
