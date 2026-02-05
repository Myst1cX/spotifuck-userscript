package Z0;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final g f1013a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: Z0.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: Z0.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: Z0.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: Z0.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: Z0.g} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 0
            java.lang.String r1 = "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x000f }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x000f }
            Z0.g r1 = (Z0.g) r1     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x000f }
            r0 = r1
            goto L_0x0010
        L_0x000f:
        L_0x0010:
            if (r0 == 0) goto L_0x0013
            goto L_0x0018
        L_0x0013:
            Z0.g r0 = new Z0.g
            r0.<init>()
        L_0x0018:
            f1013a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.f.<clinit>():void");
    }
}
