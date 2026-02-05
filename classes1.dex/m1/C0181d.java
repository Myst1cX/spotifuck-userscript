package m1;

import java.util.Arrays;
import r1.e;

/* renamed from: m1.d  reason: case insensitive filesystem */
public final class C0181d {

    /* renamed from: a  reason: collision with root package name */
    public final e f3693a;

    /* renamed from: b  reason: collision with root package name */
    public int f3694b = Integer.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3695c;

    /* renamed from: d  reason: collision with root package name */
    public int f3696d = 4096;
    public C0179b[] e = new C0179b[8];

    /* renamed from: f  reason: collision with root package name */
    public int f3697f = 7;

    /* renamed from: g  reason: collision with root package name */
    public int f3698g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f3699h = 0;

    public final void a(int i) {
        int i2;
        if (i > 0) {
            int length = this.e.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f3697f;
                if (length < i2 || i <= 0) {
                    C0179b[] bVarArr = this.e;
                    int i4 = i2 + 1;
                    System.arraycopy(bVarArr, i4, bVarArr, i4 + i3, this.f3698g);
                    C0179b[] bVarArr2 = this.e;
                    int i5 = this.f3697f + 1;
                    Arrays.fill(bVarArr2, i5, i5 + i3, (Object) null);
                    this.f3697f += i3;
                } else {
                    int i6 = this.e[length].f3685c;
                    i -= i6;
                    this.f3699h -= i6;
                    this.f3698g--;
                    i3++;
                    length--;
                }
            }
            C0179b[] bVarArr3 = this.e;
            int i42 = i2 + 1;
            System.arraycopy(bVarArr3, i42, bVarArr3, i42 + i3, this.f3698g);
            C0179b[] bVarArr22 = this.e;
            int i52 = this.f3697f + 1;
            Arrays.fill(bVarArr22, i52, i52 + i3, (Object) null);
            this.f3697f += i3;
        }
    }

    public final void b(C0179b bVar) {
        int i = this.f3696d;
        int i2 = bVar.f3685c;
        if (i2 > i) {
            Arrays.fill(this.e, (Object) null);
            this.f3697f = this.e.length - 1;
            this.f3698g = 0;
            this.f3699h = 0;
            return;
        }
        a((this.f3699h + i2) - i);
        int i3 = this.f3698g + 1;
        C0179b[] bVarArr = this.e;
        if (i3 > bVarArr.length) {
            C0179b[] bVarArr2 = new C0179b[(bVarArr.length * 2)];
            System.arraycopy(bVarArr, 0, bVarArr2, bVarArr.length, bVarArr.length);
            this.f3697f = this.e.length - 1;
            this.e = bVarArr2;
        }
        int i4 = this.f3697f;
        this.f3697f = i4 - 1;
        this.e[i4] = bVar;
        this.f3698g++;
        this.f3699h += i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: byte} */
    /* JADX WARNING: type inference failed for: r3v5, types: [r1.e, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(r1.h r12) {
        /*
            r11 = this;
            m1.B r0 = m1.B.f3675d
            r0.getClass()
            r0 = 0
            r2 = 0
            r4 = r0
            r3 = 0
        L_0x000a:
            int r6 = r12.l()
            r7 = 255(0xff, float:3.57E-43)
            if (r3 >= r6) goto L_0x0020
            byte r6 = r12.g(r3)
            r6 = r6 & r7
            byte[] r7 = m1.B.f3674c
            byte r6 = r7[r6]
            long r6 = (long) r6
            long r4 = r4 + r6
            int r3 = r3 + 1
            goto L_0x000a
        L_0x0020:
            r8 = 7
            long r4 = r4 + r8
            r3 = 3
            long r3 = r4 >> r3
            int r4 = (int) r3
            int r3 = r12.l()
            r1.e r5 = r11.f3693a
            r6 = 127(0x7f, float:1.78E-43)
            if (r4 >= r3) goto L_0x008c
            r1.e r3 = new r1.e
            r3.<init>()
            m1.B r4 = m1.B.f3675d
            r4.getClass()
            r4 = 0
        L_0x003c:
            int r8 = r12.l()
            if (r2 >= r8) goto L_0x0063
            byte r8 = r12.g(r2)
            r8 = r8 & r7
            int[] r9 = m1.B.f3673b
            r9 = r9[r8]
            byte[] r10 = m1.B.f3674c
            byte r8 = r10[r8]
            long r0 = r0 << r8
            long r9 = (long) r9
            long r0 = r0 | r9
            int r4 = r4 + r8
        L_0x0053:
            r8 = 8
            if (r4 < r8) goto L_0x0060
            int r4 = r4 + -8
            long r8 = r0 >> r4
            int r9 = (int) r8
            r3.v(r9)
            goto L_0x0053
        L_0x0060:
            int r2 = r2 + 1
            goto L_0x003c
        L_0x0063:
            if (r4 <= 0) goto L_0x0070
            int r12 = 8 - r4
            long r0 = r0 << r12
            int r12 = r7 >>> r4
            long r7 = (long) r12
            long r0 = r0 | r7
            int r12 = (int) r0
            r3.v(r12)
        L_0x0070:
            r1.h r12 = new r1.h
            long r0 = r3.f4579b     // Catch:{ EOFException -> 0x0085 }
            byte[] r0 = r3.k(r0)     // Catch:{ EOFException -> 0x0085 }
            r12.<init>(r0)
            int r0 = r0.length
            r1 = 128(0x80, float:1.794E-43)
            r11.d(r0, r6, r1)
            r12.p(r5)
            goto L_0x0096
        L_0x0085:
            r12 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r12)
            throw r0
        L_0x008c:
            int r0 = r12.l()
            r11.d(r0, r6, r2)
            r12.p(r5)
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.C0181d.c(r1.h):void");
    }

    public final void d(int i, int i2, int i3) {
        e eVar = this.f3693a;
        if (i < i2) {
            eVar.v(i | i3);
            return;
        }
        eVar.v(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            eVar.v(128 | (i4 & 127));
            i4 >>>= 7;
        }
        eVar.v(i4);
    }

    public C0181d(e eVar) {
        this.f3693a = eVar;
    }
}
