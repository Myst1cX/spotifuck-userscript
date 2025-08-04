/*
 * Decompiled with JADX v0.9.0.
 */
package it.deviato.spotifuck;

import N.F;
import N.Q;
import N.g;
import R0.a;
import R0.f;
import R0.h;
import R0.i;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import h.l;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.WeakHashMap;

public class MainActivity extends l {
    public static LockableHScrollView F;
    public static FrameLayout G;
    public static TextView H;
    public static TextView I;
    public static TextView J;
    public static WebView K;
    public static Switch L;
    public static ProgressBar M;
    public static Intent N;
    public static int O;
    public static boolean P;
    public static boolean Q = AppSingleton.s;
    public static boolean R = false;
    public static boolean S = false;
    public final Handler D = new Handler();
    public final a E = new a(4);

    public static void t(String str) {
        M.setVisibility(0);
        J.setText(str);
        J.setVisibility(0);
        J.bringToFront();
        new Handler(Looper.getMainLooper()).postDelayed(new a(3), 2500);
    }

    public static void u() {
        if (!L.isChecked()) {
            M.setVisibility(4);
            if (VERSION.SDK_INT >= 23) {
                C0.a.s(L, new ColorStateList(new int[][]{new int[]{16842912}, new int[]{-16842912}}, new int[]{-1, -3355444}));
            }
        } else if (AppSingleton.u) {
            M.setVisibility(4);
            if (VERSION.SDK_INT >= 23) {
                C0.a.s(L, new ColorStateList(new int[][]{new int[]{16842912}, new int[]{-16842912}}, new int[]{Color.parseColor("#00C8F0"), -3355444}));
            }
        } else {
            M.setVisibility(0);
            if (VERSION.SDK_INT >= 23) {
                C0.a.s(L, new ColorStateList(new int[][]{new int[]{16842912}, new int[]{-16842912}}, new int[]{-1, -3355444}));
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (AppSingleton.s) {
            Locale.setDefault(new Locale("en"));
        }
        AppSingleton.g = new WeakReference(this);
        setContentView(2131492892);
        View findViewById = findViewById(2131296513);
        g gVar = new g(2);
        WeakHashMap weakHashMap = Q.a;
        F.u(findViewById, gVar);
        N = new Intent(AppSingleton.f, WebService.class);
        i().a(this, new h(this));
        F = (LockableHScrollView) findViewById(2131296474);
        G = (FrameLayout) findViewById(2131296784);
        H = (TextView) findViewById(2131296462);
        I = (TextView) findViewById(2131296463);
        J = (TextView) findViewById(2131296766);
        String userAgentString = new WebView(AppSingleton.f).getSettings().getUserAgentString();
        int indexOf = userAgentString.indexOf("Chrome/");
        if (indexOf != -1) {
            int indexOf2 = userAgentString.indexOf(" ", indexOf);
            if (indexOf2 == -1) {
                indexOf2 = userAgentString.length();
            }
            TextView textView = I;
            StringBuilder stringBuilder = new StringBuilder("WebView v.");
            stringBuilder.append(userAgentString.substring(indexOf + 7, indexOf2));
            textView.setText(stringBuilder.toString());
        }
        M = (ProgressBar) findViewById(2131296631);
        ((ImageView) findViewById(2131296359)).setOnClickListener(new N0.a(3, this));
        L = (Switch) findViewById(2131296714);
        if (AppSingleton.m) {
            L.setChecked(true);
            p0.a.G0(AppSingleton.f, N);
            s();
        }
        u();
        L.setOnClickListener(new i(0, this));
    }

    public final void onDestroy() {
        super.onDestroy();
        AppSingleton.g = new WeakReference(null);
    }

    public final void onResume() {
        super.onResume();
        if (AppSingleton.s) {
            Locale.setDefault(new Locale("en"));
        }
        boolean z = Q;
        boolean z2 = AppSingleton.s;
        if (z != z2) {
            R = true;
        }
        Q = z2;
        if (R) {
            R = false;
            WebView webView = new WebView(AppSingleton.f);
            webView.clearCache(true);
            webView.clearHistory();
            webView.clearFormData();
            WebStorage.getInstance().deleteAllData();
            if (AppSingleton.m) {
                K.reload();
                t(getString(2131755221));
            }
        }
        if (S) {
            S = false;
            z = WebService.t.booleanValue();
            if (z) {
                H.setText(2131755222);
                G.removeView(K);
                startService(new Intent(AppSingleton.f, WebService.class).setAction("STOP_SERVICE"));
            }
            WebView webView2 = new WebView(AppSingleton.f);
            webView2.clearCache(true);
            webView2.clearHistory();
            webView2.clearFormData();
            WebStorage.getInstance().deleteAllData();
            CookieManager.getInstance().removeAllCookies(null);
            CookieManager.getInstance().flush();
            AppSingleton.n = false;
            AppSingleton.i.putBoolean("LoggedIn", false);
            AppSingleton.i.commit();
            if (z) {
                new Handler(Looper.getMainLooper()).postDelayed(new f(this, 1), 600);
            }
            Toast.makeText(AppSingleton.f, "All Cookies Deleted!", 0).show();
        }
    }

    public final void s() {
        H.setText(2131755218);
        K = AppSingleton.b();
        if (AppSingleton.l.equals("bigwindow")) {
            F.setScrollingEnabled(true);
            O = 1600;
        } else {
            F.setScrollingEnabled(false);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            O = displayMetrics.widthPixels;
        }
        K.setLayoutParams(new LayoutParams(O, -1));
        if (K.getParent() != null) {
            ((ViewGroup) K.getParent()).removeView(K);
        }
        G.addView(K);
    }
              }
