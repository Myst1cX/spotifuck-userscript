package R0;

import A.b;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.session.MediaController;
import android.support.v4.media.session.i;
import android.support.v4.media.session.t;
import it.deviato.spotifuck.AppSingleton;
import it.deviato.spotifuck.WebService;

public final class n extends AudioDeviceCallback {
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        t tVar;
        if (WebService.f3193t.booleanValue() && AppSingleton.f3137B && (tVar = WebService.f3187n) != null) {
            i w2 = ((b) tVar.f1132c).w();
            for (AudioDeviceInfo b2 : audioDeviceInfoArr) {
                int b3 = b2.getType();
                boolean z2 = AppSingleton.f3157v;
                MediaController.TransportControls transportControls = w2.f1117a;
                if (z2 && (b3 == 3 || b3 == 4)) {
                    transportControls.play();
                } else if (AppSingleton.f3159x && (b3 == 8 || b3 == 7 || b3 == 26 || b3 == 27)) {
                    transportControls.play();
                }
            }
        }
    }

    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        t tVar;
        if (WebService.f3193t.booleanValue() && AppSingleton.f3137B && (tVar = WebService.f3187n) != null) {
            i w2 = ((b) tVar.f1132c).w();
            for (AudioDeviceInfo b2 : audioDeviceInfoArr) {
                int b3 = b2.getType();
                boolean z2 = AppSingleton.f3158w;
                MediaController.TransportControls transportControls = w2.f1117a;
                if (z2 && (b3 == 3 || b3 == 4)) {
                    transportControls.pause();
                } else if (AppSingleton.f3160y && (b3 == 8 || b3 == 7 || b3 == 26 || b3 == 27)) {
                    transportControls.pause();
                }
            }
        }
    }
}
