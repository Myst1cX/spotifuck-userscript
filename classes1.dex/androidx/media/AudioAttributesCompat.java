package androidx.media;

import android.util.SparseIntArray;
import p0.d;

public class AudioAttributesCompat implements d {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f1860b = 0;

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributesImpl f1861a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f1861a;
        if (audioAttributesImpl != null) {
            return audioAttributesImpl.equals(audioAttributesCompat.f1861a);
        }
        if (audioAttributesCompat.f1861a == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1861a.hashCode();
    }

    public final String toString() {
        return this.f1861a.toString();
    }
}
