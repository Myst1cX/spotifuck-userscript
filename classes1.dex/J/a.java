package J;

import android.os.Bundle;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;

public abstract class a {
    public static <T> T a(Bundle bundle, String str, Class<T> cls) {
        return bundle.getParcelable(str, cls);
    }

    public static <T> T[] b(Bundle bundle, String str, Class<T> cls) {
        return bundle.getParcelableArray(str, cls);
    }

    public static <T> ArrayList<T> c(Bundle bundle, String str, Class<? extends T> cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static <T extends Serializable> T d(Bundle bundle, String str, Class<T> cls) {
        return bundle.getSerializable(str, cls);
    }

    public static <T> SparseArray<T> e(Bundle bundle, String str, Class<? extends T> cls) {
        return bundle.getSparseParcelableArray(str, cls);
    }
}
