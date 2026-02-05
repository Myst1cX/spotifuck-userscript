package i1;

import h1.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Logger;
import n1.a;
import r1.o;
import r1.v;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f3106a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f3107b;

    /* renamed from: c  reason: collision with root package name */
    public final File[] f3108c;

    /* renamed from: d  reason: collision with root package name */
    public final File[] f3109d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public d f3110f;

    /* renamed from: g  reason: collision with root package name */
    public long f3111g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ g f3112h;

    public final f a() {
        v vVar;
        g gVar = this.f3112h;
        if (Thread.holdsLock(gVar)) {
            v[] vVarArr = new v[gVar.f3124h];
            int i = 0;
            int i2 = 0;
            while (i2 < gVar.f3124h) {
                try {
                    a aVar = gVar.f3118a;
                    File file = this.f3108c[i2];
                    aVar.getClass();
                    Logger logger = o.f4594a;
                    if (file != null) {
                        vVarArr[i2] = o.b(new FileInputStream(file));
                        i2++;
                    } else {
                        throw new IllegalArgumentException("file == null");
                    }
                } catch (FileNotFoundException unused) {
                    while (i < gVar.f3124h && (vVar = vVarArr[i]) != null) {
                        c.c(vVar);
                        i++;
                    }
                    try {
                        gVar.r(this);
                        return null;
                    } catch (IOException unused2) {
                        return null;
                    }
                }
            }
            return new f(gVar, this.f3106a, this.f3111g, vVarArr);
        }
        throw new AssertionError();
    }

    public e(g gVar, String str) {
        this.f3112h = gVar;
        this.f3106a = str;
        int i = gVar.f3124h;
        this.f3107b = new long[i];
        this.f3108c = new File[i];
        this.f3109d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < gVar.f3124h; i2++) {
            sb.append(i2);
            File[] fileArr = this.f3108c;
            String sb2 = sb.toString();
            File file = gVar.f3119b;
            fileArr[i2] = new File(file, sb2);
            sb.append(".tmp");
            this.f3109d[i2] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }
}
