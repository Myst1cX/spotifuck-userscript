package androidx.media;

import p0.b;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(b bVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f1864a = bVar.f(audioAttributesImplBase.f1864a, 1);
        audioAttributesImplBase.f1865b = bVar.f(audioAttributesImplBase.f1865b, 2);
        audioAttributesImplBase.f1866c = bVar.f(audioAttributesImplBase.f1866c, 3);
        audioAttributesImplBase.f1867d = bVar.f(audioAttributesImplBase.f1867d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, b bVar) {
        bVar.getClass();
        bVar.j(audioAttributesImplBase.f1864a, 1);
        bVar.j(audioAttributesImplBase.f1865b, 2);
        bVar.j(audioAttributesImplBase.f1866c, 3);
        bVar.j(audioAttributesImplBase.f1867d, 4);
    }
}
