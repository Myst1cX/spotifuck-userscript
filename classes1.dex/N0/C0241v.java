package n0;

import android.view.ViewGroup;

/* renamed from: n0.v  reason: case insensitive filesystem */
public abstract class C0241v {
    public static int a(ViewGroup viewGroup, int i) {
        return viewGroup.getChildDrawingOrder(i);
    }

    public static void b(ViewGroup viewGroup, boolean z2) {
        viewGroup.suppressLayout(z2);
    }
}
