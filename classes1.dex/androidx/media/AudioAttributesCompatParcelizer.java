package androidx.media;

import p0.b;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(b bVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object obj = audioAttributesCompat.f1861a;
        if (bVar.e(1)) {
            obj = bVar.h();
        }
        audioAttributesCompat.f1861a = (AudioAttributesImpl) obj;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, b bVar) {
        bVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f1861a;
        bVar.i(1);
        bVar.l(audioAttributesImpl);
    }
}
