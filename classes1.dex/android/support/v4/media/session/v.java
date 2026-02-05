package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;

public abstract class v {
    public static Bundle a(PlaybackState playbackState) {
        return playbackState.getExtras();
    }

    public static void b(PlaybackState.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }
}
