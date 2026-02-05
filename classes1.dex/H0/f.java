package H0;

import android.media.session.MediaSessionManager;
import android.text.PrecomputedText;
import android.text.TextPaint;

public abstract /* synthetic */ class f {
    public static /* synthetic */ PrecomputedText.Params.Builder j(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* synthetic */ void v(String str, int i, int i2) {
        new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    public static /* bridge */ /* synthetic */ boolean w(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}
