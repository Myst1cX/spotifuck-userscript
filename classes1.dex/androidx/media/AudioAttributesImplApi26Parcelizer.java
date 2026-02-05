package androidx.media;

import android.media.AudioAttributes;
import p0.b;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(b bVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f1862a = (AudioAttributes) bVar.g(audioAttributesImplApi26.f1862a, 1);
        audioAttributesImplApi26.f1863b = bVar.f(audioAttributesImplApi26.f1863b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, b bVar) {
        bVar.getClass();
        bVar.k(audioAttributesImplApi26.f1862a, 1);
        bVar.j(audioAttributesImplApi26.f1863b, 2);
    }
}
