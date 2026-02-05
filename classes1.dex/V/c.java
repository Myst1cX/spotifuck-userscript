package V;

import K0.e;
import O.k;
import android.graphics.Rect;
import java.util.Comparator;

public final class c implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f953a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public final Rect f954b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public final boolean f955c;

    /* renamed from: d  reason: collision with root package name */
    public final e f956d;

    public final int compare(Object obj, Object obj2) {
        this.f956d.getClass();
        Rect rect = this.f953a;
        ((k) obj).f(rect);
        Rect rect2 = this.f954b;
        ((k) obj2).f(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z2 = this.f955c;
        if (i3 < i4) {
            if (z2) {
                return 1;
            }
            return -1;
        } else if (i3 <= i4) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            int i7 = rect.right;
            int i8 = rect2.right;
            if (i7 < i8) {
                if (z2) {
                    return 1;
                }
                return -1;
            } else if (i7 <= i8) {
                return 0;
            } else {
                if (z2) {
                    return -1;
                }
                return 1;
            }
        } else if (z2) {
            return -1;
        } else {
            return 1;
        }
    }

    public c(boolean z2, e eVar) {
        this.f955c = z2;
        this.f956d = eVar;
    }
}
