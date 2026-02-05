package it.deviato.spotifuck;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.ValueCallback;
import android.widget.Toast;
import h.C0121l;
import java.util.List;

public class LinkHandler extends C0121l {
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        String scheme = data.getScheme();
        if ("spotify".equals(scheme)) {
            str = data.toString();
        } else {
            if ("https".equals(scheme) && "open.spotify.com".equals(data.getHost())) {
                List<String> pathSegments = data.getPathSegments();
                if (!pathSegments.isEmpty() && pathSegments.get(0).startsWith("intl-")) {
                    pathSegments = pathSegments.subList(1, pathSegments.size());
                }
                if (pathSegments.size() >= 2) {
                    StringBuilder sb = new StringBuilder("spotify");
                    for (String append : pathSegments) {
                        sb.append(":");
                        sb.append(append);
                    }
                    str = sb.toString();
                }
            }
            str = null;
        }
        if (!WebService.f3193t.booleanValue() || !AppSingleton.f3137B) {
            Toast.makeText(this, getString(2131755237), 0).show();
        } else {
            AppSingleton.f3145j.evaluateJavascript("playFromUri('" + str + "');", (ValueCallback) null);
        }
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(268435456);
        startActivity(intent);
        finish();
        overridePendingTransition(0, 0);
    }
}
