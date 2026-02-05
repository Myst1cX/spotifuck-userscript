package it.deviato.spotifuck;

import N.C0007g;
import N.F;
import N.Q;
import N0.C0026a;
import R0.a;
import R0.g;
import R0.h;
import R0.i;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import h.C0121l;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.WeakHashMap;
import p0.C0320a;

public class MainActivity extends C0121l {

    /* renamed from: F  reason: collision with root package name */
    public static LockableHScrollView f3163F;

    /* renamed from: G  reason: collision with root package name */
    public static FrameLayout f3164G;

    /* renamed from: H  reason: collision with root package name */
    public static TextView f3165H;
    public static TextView I;

    /* renamed from: J  reason: collision with root package name */
    public static TextView f3166J;

    /* renamed from: K  reason: collision with root package name */
    public static WebView f3167K;

    /* renamed from: L  reason: collision with root package name */
    public static Switch f3168L;

    /* renamed from: M  reason: collision with root package name */
    public static ProgressBar f3169M;

    /* renamed from: N  reason: collision with root package name */
    public static Intent f3170N;

    /* renamed from: O  reason: collision with root package name */
    public static int f3171O;

    /* renamed from: P  reason: collision with root package name */
    public static boolean f3172P;

    /* renamed from: Q  reason: collision with root package name */
    public static boolean f3173Q = AppSingleton.f3156u;

    /* renamed from: R  reason: collision with root package name */
    public static boolean f3174R = false;

    /* renamed from: S  reason: collision with root package name */
    public static boolean f3175S = false;

    /* renamed from: D  reason: collision with root package name */
    public final Handler f3176D = new Handler();

    /* renamed from: E  reason: collision with root package name */
    public final a f3177E = new a(5);

    public static void u() {
        if (!f3168L.isChecked()) {
            f3169M.setVisibility(4);
            if (Build.VERSION.SDK_INT >= 23) {
                f3168L.setThumbTintList(new ColorStateList(new int[][]{new int[]{16842912}, new int[]{-16842912}}, new int[]{-1, -3355444}));
            }
        } else if (AppSingleton.f3137B) {
            f3169M.setVisibility(4);
            if (Build.VERSION.SDK_INT >= 23) {
                f3168L.setThumbTintList(new ColorStateList(new int[][]{new int[]{16842912}, new int[]{-16842912}}, new int[]{Color.parseColor("#00C8F0"), -3355444}));
            }
        } else {
            f3169M.setVisibility(0);
            if (Build.VERSION.SDK_INT >= 23) {
                f3168L.setThumbTintList(new ColorStateList(new int[][]{new int[]{16842912}, new int[]{-16842912}}, new int[]{-1, -3355444}));
            }
        }
    }

    public static void t(String str) {
        f3169M.setVisibility(0);
        f3166J.setText(str);
        f3166J.setVisibility(0);
        f3166J.bringToFront();
        new Handler(Looper.getMainLooper()).postDelayed(new a(6), 2500);
    }

    public final void s() {
        f3165H.setText(2131755235);
        f3167K = AppSingleton.b();
        if (AppSingleton.f3147l.equals("bigwindow")) {
            f3163F.setScrollingEnabled(true);
            f3171O = 1600;
        } else {
            f3163F.setScrollingEnabled(false);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            f3171O = displayMetrics.widthPixels;
        }
        f3167K.setLayoutParams(new FrameLayout.LayoutParams(f3171O, -1));
        if (f3167K.getParent() != null) {
            ((ViewGroup) f3167K.getParent()).removeView(f3167K);
        }
        f3164G.addView(f3167K);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (AppSingleton.f3156u) {
            Locale.setDefault(new Locale("en"));
        }
        AppSingleton.f3143g = new WeakReference(this);
        setContentView(2131492892);
        View findViewById = findViewById(2131296521);
        C0007g gVar = new C0007g(2);
        WeakHashMap weakHashMap = Q.f509a;
        F.u(findViewById, gVar);
        f3170N = new Intent(AppSingleton.f3142f, WebService.class);
        i().a(this, new h(this));
        f3163F = (LockableHScrollView) findViewById(2131296481);
        f3164G = (FrameLayout) findViewById(2131296793);
        f3165H = (TextView) findViewById(2131296469);
        I = (TextView) findViewById(2131296470);
        f3166J = (TextView) findViewById(2131296774);
        String userAgentString = new WebView(AppSingleton.f3142f).getSettings().getUserAgentString();
        int indexOf = userAgentString.indexOf("Chrome/");
        if (indexOf != -1) {
            int indexOf2 = userAgentString.indexOf(" ", indexOf);
            if (indexOf2 == -1) {
                indexOf2 = userAgentString.length();
            }
            TextView textView = I;
            textView.setText("WebView v." + userAgentString.substring(indexOf + 7, indexOf2));
        }
        f3169M = (ProgressBar) findViewById(2131296639);
        ((ImageView) findViewById(2131296359)).setOnClickListener(new C0026a(3, this));
        f3168L = (Switch) findViewById(2131296722);
        if (AppSingleton.f3148m) {
            f3168L.setChecked(true);
            C0320a.G0(AppSingleton.f3142f, f3170N);
            s();
        }
        u();
        f3168L.setOnClickListener(new i(0, this));
    }

    public final void onDestroy() {
        super.onDestroy();
        AppSingleton.f3143g = new WeakReference((Object) null);
    }

    public final void onResume() {
        super.onResume();
        if (AppSingleton.f3155t) {
            setRequestedOrientation(1);
        } else {
            setRequestedOrientation(13);
        }
        if (WebService.f3193t.booleanValue() && !f3167K.isAttachedToWindow()) {
            f3164G.removeView(f3167K);
            new Handler(Looper.getMainLooper()).postDelayed(new g(this, 0), 200);
        }
        if (AppSingleton.f3156u) {
            Locale.setDefault(new Locale("en"));
        }
        boolean z2 = f3173Q;
        boolean z3 = AppSingleton.f3156u;
        if (z2 != z3) {
            f3174R = true;
        }
        f3173Q = z3;
        if (f3174R) {
            f3174R = false;
            WebView webView = new WebView(AppSingleton.f3142f);
            webView.clearCache(true);
            webView.clearHistory();
            webView.clearFormData();
            WebStorage.getInstance().deleteAllData();
            if (AppSingleton.f3148m) {
                f3167K.reload();
                t(getString(2131755239));
            }
        }
        if (f3175S) {
            f3175S = false;
            boolean booleanValue = WebService.f3193t.booleanValue();
            if (booleanValue) {
                f3165H.setText(2131755240);
                f3164G.removeView(f3167K);
                startService(new Intent(AppSingleton.f3142f, WebService.class).setAction("STOP_SERVICE"));
            }
            WebView webView2 = new WebView(AppSingleton.f3142f);
            webView2.clearCache(true);
            webView2.clearHistory();
            webView2.clearFormData();
            WebStorage.getInstance().deleteAllData();
            CookieManager.getInstance().removeAllCookies((ValueCallback) null);
            CookieManager.getInstance().flush();
            AppSingleton.f3149n = false;
            AppSingleton.i.putBoolean("LoggedIn", false);
            AppSingleton.i.commit();
            if (booleanValue) {
                new Handler(Looper.getMainLooper()).postDelayed(new g(this, 1), 600);
            }
            Toast.makeText(AppSingleton.f3142f, "All Cookies Deleted!", 0).show();
        }
    }
}
