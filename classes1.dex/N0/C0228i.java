package n0;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* renamed from: n0.i  reason: case insensitive filesystem */
public abstract class C0228i {
    public static <T, V> ObjectAnimator a(T t2, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t2, property, (TypeConverter) null, path);
    }
}
