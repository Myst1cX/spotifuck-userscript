package q;

import java.util.HashMap;

/* renamed from: q.a  reason: case insensitive filesystem */
public final class C0321a extends f {
    public final HashMap e = new HashMap();

    public final c a(Object obj) {
        return (c) this.e.get(obj);
    }

    public final Object b(Object obj) {
        Object b2 = super.b(obj);
        this.e.remove(obj);
        return b2;
    }
}
