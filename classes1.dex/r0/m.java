package R0;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.t;
import android.util.Log;
import android.webkit.ValueCallback;
import d0.k;
import it.deviato.spotifuck.WebService;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class m implements ValueCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WebService f870a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f871b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f872c;

    public /* synthetic */ m(WebService webService, String str, k kVar) {
        this.f870a = webService;
        this.f871b = str;
        this.f872c = kVar;
    }

    public final void onReceiveValue(Object obj) {
        String str;
        String str2 = this.f871b;
        String str3 = (String) obj;
        t tVar = WebService.f3187n;
        WebService webService = this.f870a;
        webService.getClass();
        ArrayList arrayList = new ArrayList();
        if (str3 != null && !str3.equals("null")) {
            try {
                JSONArray jSONArray = new JSONArray(str3.replaceAll("^\"|\"$", "").replace("\\\"", "\""));
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    Uri uri = null;
                    String optString = jSONObject.optString("id", (String) null);
                    String optString2 = jSONObject.optString("name", "Sconosciuto");
                    String optString3 = jSONObject.optString("image", (String) null);
                    JSONArray optJSONArray = jSONObject.optJSONArray("artists");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        str = webService.getString(2131755010) + " " + optJSONArray.join(", ").replaceAll("\"", "");
                    } else if (str2.equals("podcasts")) {
                        str = "Podcast";
                    } else {
                        str = "";
                    }
                    String str4 = str;
                    if (optString3 != null) {
                        uri = Uri.parse(optString3);
                    }
                    arrayList.add(new MediaBrowserCompat$MediaItem(new MediaDescriptionCompat(optString, optString2, str4, (CharSequence) null, (Bitmap) null, uri, (Bundle) null, (Uri) null), 2));
                }
            } catch (JSONException e) {
                Log.e("Spotifuck", "Errore parsing JSON", e);
            }
        }
        this.f872c.d(arrayList);
    }
}
