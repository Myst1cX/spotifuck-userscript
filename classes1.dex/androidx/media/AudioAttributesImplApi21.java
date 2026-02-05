package androidx.media;

import android.media.AudioAttributes;

public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributes f1862a;

    /* renamed from: b  reason: collision with root package name */
    public int f1863b = -1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f1862a.equals(((AudioAttributesImplApi21) obj).f1862a);
    }

    public final int hashCode() {
        return this.f1862a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f1862a;
    }
}
