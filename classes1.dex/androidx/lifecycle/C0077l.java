package androidx.lifecycle;

/* renamed from: androidx.lifecycle.l  reason: case insensitive filesystem */
public enum C0077l {
    ;
    
    public static final C0075j Companion = null;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: androidx.lifecycle.l[]} */
    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Enum, androidx.lifecycle.l] */
    /* JADX WARNING: type inference failed for: r8v1, types: [java.lang.Enum, androidx.lifecycle.l] */
    /* JADX WARNING: type inference failed for: r9v1, types: [java.lang.Enum, androidx.lifecycle.l] */
    /* JADX WARNING: type inference failed for: r10v1, types: [java.lang.Enum, androidx.lifecycle.l] */
    /* JADX WARNING: type inference failed for: r11v1, types: [java.lang.Enum, androidx.lifecycle.l] */
    /* JADX WARNING: type inference failed for: r12v1, types: [java.lang.Enum, androidx.lifecycle.l] */
    /* JADX WARNING: type inference failed for: r13v1, types: [java.lang.Enum, androidx.lifecycle.l] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, androidx.lifecycle.j] */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 6
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            androidx.lifecycle.l r7 = new androidx.lifecycle.l
            java.lang.String r8 = "ON_CREATE"
            r7.<init>(r8, r6)
            ON_CREATE = r7
            androidx.lifecycle.l r8 = new androidx.lifecycle.l
            java.lang.String r9 = "ON_START"
            r8.<init>(r9, r5)
            ON_START = r8
            androidx.lifecycle.l r9 = new androidx.lifecycle.l
            java.lang.String r10 = "ON_RESUME"
            r9.<init>(r10, r4)
            ON_RESUME = r9
            androidx.lifecycle.l r10 = new androidx.lifecycle.l
            java.lang.String r11 = "ON_PAUSE"
            r10.<init>(r11, r3)
            ON_PAUSE = r10
            androidx.lifecycle.l r11 = new androidx.lifecycle.l
            java.lang.String r12 = "ON_STOP"
            r11.<init>(r12, r2)
            ON_STOP = r11
            androidx.lifecycle.l r12 = new androidx.lifecycle.l
            java.lang.String r13 = "ON_DESTROY"
            r12.<init>(r13, r1)
            ON_DESTROY = r12
            androidx.lifecycle.l r13 = new androidx.lifecycle.l
            java.lang.String r14 = "ON_ANY"
            r13.<init>(r14, r0)
            ON_ANY = r13
            r14 = 7
            androidx.lifecycle.l[] r14 = new androidx.lifecycle.C0077l[r14]
            r14[r6] = r7
            r14[r5] = r8
            r14[r4] = r9
            r14[r3] = r10
            r14[r2] = r11
            r14[r1] = r12
            r14[r0] = r13
            $VALUES = r14
            androidx.lifecycle.j r0 = new androidx.lifecycle.j
            r0.<init>()
            Companion = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0077l.<clinit>():void");
    }

    public final C0078m a() {
        switch (C0076k.f1830a[ordinal()]) {
            case 1:
            case 2:
                return C0078m.f1833c;
            case 3:
            case 4:
                return C0078m.f1834d;
            case 5:
                return C0078m.e;
            case 6:
                return C0078m.f1831a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
