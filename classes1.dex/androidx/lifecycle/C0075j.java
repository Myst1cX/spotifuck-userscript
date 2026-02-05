package androidx.lifecycle;

import Z0.c;

/* renamed from: androidx.lifecycle.j  reason: case insensitive filesystem */
public final class C0075j {
    public static C0077l a(C0078m mVar) {
        c.e("state", mVar);
        int ordinal = mVar.ordinal();
        if (ordinal == 1) {
            return C0077l.ON_CREATE;
        }
        if (ordinal == 2) {
            return C0077l.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return C0077l.ON_RESUME;
    }
}
