package U0;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f941a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: U0.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: U0.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: U0.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: U0.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v34, resolved type: U0.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v35, resolved type: U0.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r0 = ", base type classloader: "
            java.lang.Class<U0.a> r1 = U0.a.class
            java.lang.String r2 = "forName(\"kotlin.internal…entations\").newInstance()"
            java.lang.String r3 = "Instance class was loaded from a different classloader: "
            java.lang.Class<W0.b> r4 = W0.b.class
            java.lang.Object r4 = r4.newInstance()     // Catch:{ ClassNotFoundException -> 0x0041 }
            Z0.c.d(r2, r4)     // Catch:{ ClassNotFoundException -> 0x0041 }
            U0.a r4 = (U0.a) r4     // Catch:{ ClassCastException -> 0x0015 }
            goto L_0x00f7
        L_0x0015:
            r5 = move-exception
            java.lang.Class r4 = r4.getClass()     // Catch:{ ClassNotFoundException -> 0x0041 }
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0041 }
            java.lang.ClassLoader r6 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0041 }
            boolean r7 = Z0.c.a(r4, r6)     // Catch:{ ClassNotFoundException -> 0x0041 }
            if (r7 != 0) goto L_0x0040
            java.lang.ClassNotFoundException r7 = new java.lang.ClassNotFoundException     // Catch:{ ClassNotFoundException -> 0x0041 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0041 }
            r8.<init>(r3)     // Catch:{ ClassNotFoundException -> 0x0041 }
            r8.append(r4)     // Catch:{ ClassNotFoundException -> 0x0041 }
            r8.append(r0)     // Catch:{ ClassNotFoundException -> 0x0041 }
            r8.append(r6)     // Catch:{ ClassNotFoundException -> 0x0041 }
            java.lang.String r4 = r8.toString()     // Catch:{ ClassNotFoundException -> 0x0041 }
            r7.<init>(r4, r5)     // Catch:{ ClassNotFoundException -> 0x0041 }
            throw r7     // Catch:{ ClassNotFoundException -> 0x0041 }
        L_0x0040:
            throw r5     // Catch:{ ClassNotFoundException -> 0x0041 }
        L_0x0041:
            java.lang.String r4 = "kotlin.internal.JRE8PlatformImplementations"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x007e }
            java.lang.Object r4 = r4.newInstance()     // Catch:{ ClassNotFoundException -> 0x007e }
            Z0.c.d(r2, r4)     // Catch:{ ClassNotFoundException -> 0x007e }
            U0.a r4 = (U0.a) r4     // Catch:{ ClassCastException -> 0x0052 }
            goto L_0x00f7
        L_0x0052:
            r5 = move-exception
            java.lang.Class r4 = r4.getClass()     // Catch:{ ClassNotFoundException -> 0x007e }
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x007e }
            java.lang.ClassLoader r6 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x007e }
            boolean r7 = Z0.c.a(r4, r6)     // Catch:{ ClassNotFoundException -> 0x007e }
            if (r7 != 0) goto L_0x007d
            java.lang.ClassNotFoundException r7 = new java.lang.ClassNotFoundException     // Catch:{ ClassNotFoundException -> 0x007e }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x007e }
            r8.<init>(r3)     // Catch:{ ClassNotFoundException -> 0x007e }
            r8.append(r4)     // Catch:{ ClassNotFoundException -> 0x007e }
            r8.append(r0)     // Catch:{ ClassNotFoundException -> 0x007e }
            r8.append(r6)     // Catch:{ ClassNotFoundException -> 0x007e }
            java.lang.String r4 = r8.toString()     // Catch:{ ClassNotFoundException -> 0x007e }
            r7.<init>(r4, r5)     // Catch:{ ClassNotFoundException -> 0x007e }
            throw r7     // Catch:{ ClassNotFoundException -> 0x007e }
        L_0x007d:
            throw r5     // Catch:{ ClassNotFoundException -> 0x007e }
        L_0x007e:
            java.lang.Class<V0.a> r4 = V0.a.class
            java.lang.Object r4 = r4.newInstance()     // Catch:{ ClassNotFoundException -> 0x00b6 }
            Z0.c.d(r2, r4)     // Catch:{ ClassNotFoundException -> 0x00b6 }
            U0.a r4 = (U0.a) r4     // Catch:{ ClassCastException -> 0x008a }
            goto L_0x00f7
        L_0x008a:
            r5 = move-exception
            java.lang.Class r4 = r4.getClass()     // Catch:{ ClassNotFoundException -> 0x00b6 }
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00b6 }
            java.lang.ClassLoader r6 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00b6 }
            boolean r7 = Z0.c.a(r4, r6)     // Catch:{ ClassNotFoundException -> 0x00b6 }
            if (r7 != 0) goto L_0x00b5
            java.lang.ClassNotFoundException r7 = new java.lang.ClassNotFoundException     // Catch:{ ClassNotFoundException -> 0x00b6 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x00b6 }
            r8.<init>(r3)     // Catch:{ ClassNotFoundException -> 0x00b6 }
            r8.append(r4)     // Catch:{ ClassNotFoundException -> 0x00b6 }
            r8.append(r0)     // Catch:{ ClassNotFoundException -> 0x00b6 }
            r8.append(r6)     // Catch:{ ClassNotFoundException -> 0x00b6 }
            java.lang.String r4 = r8.toString()     // Catch:{ ClassNotFoundException -> 0x00b6 }
            r7.<init>(r4, r5)     // Catch:{ ClassNotFoundException -> 0x00b6 }
            throw r7     // Catch:{ ClassNotFoundException -> 0x00b6 }
        L_0x00b5:
            throw r5     // Catch:{ ClassNotFoundException -> 0x00b6 }
        L_0x00b6:
            java.lang.String r4 = "kotlin.internal.JRE7PlatformImplementations"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x00f2 }
            java.lang.Object r4 = r4.newInstance()     // Catch:{ ClassNotFoundException -> 0x00f2 }
            Z0.c.d(r2, r4)     // Catch:{ ClassNotFoundException -> 0x00f2 }
            U0.a r4 = (U0.a) r4     // Catch:{ ClassCastException -> 0x00c6 }
            goto L_0x00f7
        L_0x00c6:
            r2 = move-exception
            java.lang.Class r4 = r4.getClass()     // Catch:{ ClassNotFoundException -> 0x00f2 }
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00f2 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00f2 }
            boolean r5 = Z0.c.a(r4, r1)     // Catch:{ ClassNotFoundException -> 0x00f2 }
            if (r5 != 0) goto L_0x00f1
            java.lang.ClassNotFoundException r5 = new java.lang.ClassNotFoundException     // Catch:{ ClassNotFoundException -> 0x00f2 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x00f2 }
            r6.<init>(r3)     // Catch:{ ClassNotFoundException -> 0x00f2 }
            r6.append(r4)     // Catch:{ ClassNotFoundException -> 0x00f2 }
            r6.append(r0)     // Catch:{ ClassNotFoundException -> 0x00f2 }
            r6.append(r1)     // Catch:{ ClassNotFoundException -> 0x00f2 }
            java.lang.String r0 = r6.toString()     // Catch:{ ClassNotFoundException -> 0x00f2 }
            r5.<init>(r0, r2)     // Catch:{ ClassNotFoundException -> 0x00f2 }
            throw r5     // Catch:{ ClassNotFoundException -> 0x00f2 }
        L_0x00f1:
            throw r2     // Catch:{ ClassNotFoundException -> 0x00f2 }
        L_0x00f2:
            U0.a r4 = new U0.a
            r4.<init>()
        L_0x00f7:
            f941a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.b.<clinit>():void");
    }
}
