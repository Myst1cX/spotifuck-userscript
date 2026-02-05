package R0;

import C.a;
import Q0.A;
import Q0.C0036e;
import Q0.w;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.t;
import android.webkit.JavascriptInterface;
import it.deviato.spotifuck.AppSingleton;
import it.deviato.spotifuck.MainActivity;
import it.deviato.spotifuck.WebService;
import org.json.JSONException;
import org.json.JSONObject;

public final class f {
    @JavascriptInterface
    public void loginDetected() {
        AppSingleton.f3149n = true;
        AppSingleton.i.putBoolean("LoggedIn", true);
        AppSingleton.i.commit();
    }

    @JavascriptInterface
    public void playLoaded() {
        AppSingleton.f3137B = true;
        AppSingleton.a();
    }

    @JavascriptInterface
    public static void deferMessage(String str) {
        MainActivity mainActivity = (MainActivity) AppSingleton.f3143g.get();
        if (mainActivity != null) {
            if (str.equals("unlock")) {
                str = mainActivity.getString(2131755242);
            } else if (str.equals("reload")) {
                str = mainActivity.getString(2131755239);
            } else if (str.equals("adblock")) {
                str = mainActivity.getString(2131755233);
            }
            mainActivity.runOnUiThread(new a(mainActivity, str));
        }
    }

    @JavascriptInterface
    public static void manageTShut(boolean z2) {
        if (WebService.f3193t.booleanValue() && AppSingleton.f3161z > 0 && z2) {
            if (AppSingleton.f3140E != null) {
                AppSingleton.f3138C.removeCallbacks(AppSingleton.f3140E);
            }
            AppSingleton.f3140E = new C0036e(1);
            AppSingleton.f3138C.postDelayed(AppSingleton.f3140E, ((long) AppSingleton.f3161z) * 60000);
        } else if (AppSingleton.f3140E != null) {
            AppSingleton.f3138C.removeCallbacks(AppSingleton.f3140E);
        }
    }

    @JavascriptInterface
    public static void manageTSleep(boolean z2) {
        if (WebService.f3193t.booleanValue() && AppSingleton.f3136A > 0 && z2) {
            if (AppSingleton.f3141F != null) {
                AppSingleton.f3139D.removeCallbacks(AppSingleton.f3141F);
            }
            AppSingleton.f3141F = new C0036e(2);
            AppSingleton.f3139D.postDelayed(AppSingleton.f3141F, ((long) AppSingleton.f3136A) * 60000);
        } else if (AppSingleton.f3141F != null) {
            AppSingleton.f3139D.removeCallbacks(AppSingleton.f3141F);
        }
    }

    @JavascriptInterface
    public static void wakeOff() {
        new Handler(Looper.getMainLooper()).post(new a(2));
    }

    @JavascriptInterface
    public static void wakeUp() {
        new Handler(Looper.getMainLooper()).post(new a(1));
    }

    @JavascriptInterface
    public boolean isWoke() {
        if (AppSingleton.f3145j.getWindowVisibility() == 0) {
            return true;
        }
        return false;
    }

    @JavascriptInterface
    public void recMediaPosition(long j2) {
        WebService.f3179A = j2;
        WebService.e();
    }

    @JavascriptInterface
    public void recMediaStatus(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Object opt = jSONObject.opt("track");
            if (opt == null) {
                return;
            }
            if (!JSONObject.NULL.equals(opt)) {
                WebService.f3197x = opt.toString();
                WebService.f3196w = jSONObject.optString("artist");
                WebService.f3179A = jSONObject.optLong("position");
                WebService.f3199z = jSONObject.optLong("duration");
                WebService.f3182D = jSONObject.optBoolean("playing");
                WebService.f3198y = jSONObject.optString("repeat");
                WebService.f3183E = jSONObject.optBoolean("fav");
                String replace = jSONObject.optString("cover").replace("00004851", "0000b273");
                WebService.f3195v = null;
                if (replace != null && !replace.isEmpty()) {
                    try {
                        w c2 = w.c();
                        c2.getClass();
                        if (replace.trim().length() != 0) {
                            WebService.f3195v = new A(c2, Uri.parse(replace)).a();
                        } else {
                            throw new IllegalArgumentException("Path must not be empty.");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                t tVar = WebService.f3187n;
                t tVar2 = WebService.f3187n;
                t tVar3 = WebService.f3187n;
                t tVar4 = WebService.f3187n;
                t tVar5 = WebService.f3187n;
                t tVar6 = WebService.f3187n;
                t tVar7 = WebService.f3187n;
                WebService.f();
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public f(Context context) {
    }

    @JavascriptInterface
    public void cssInjected() {
        AppSingleton.a();
    }
}
