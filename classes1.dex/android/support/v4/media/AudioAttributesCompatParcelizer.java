package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import p0.b;

public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(b bVar) {
        return androidx.media.AudioAttributesCompatParcelizer.read(bVar);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, b bVar) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, bVar);
    }
}
