package r1;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class p implements f {

    /* renamed from: a  reason: collision with root package name */
    public final e f4595a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final u f4596b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4597c;

    public final x a() {
        return this.f4596b.a();
    }

    public final void b(e eVar, long j2) {
        if (!this.f4597c) {
            this.f4595a.b(eVar, j2);
            f();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final f c(String str) {
        if (!this.f4597c) {
            this.f4595a.y(str, 0, str.length());
            f();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final void close() {
        u uVar = this.f4596b;
        if (!this.f4597c) {
            try {
                e eVar = this.f4595a;
                long j2 = eVar.f4579b;
                if (j2 > 0) {
                    uVar.b(eVar, j2);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                uVar.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f4597c = true;
            if (th != null) {
                Charset charset = y.f4616a;
                throw th;
            }
        }
    }

    public final f d(int i) {
        if (!this.f4597c) {
            this.f4595a.v(i);
            f();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final f f() {
        if (!this.f4597c) {
            e eVar = this.f4595a;
            long j2 = eVar.f4579b;
            if (j2 == 0) {
                j2 = 0;
            } else {
                r rVar = eVar.f4578a.f4606g;
                int i = rVar.f4603c;
                if (i < 8192 && rVar.e) {
                    j2 -= (long) (i - rVar.f4602b);
                }
            }
            if (j2 > 0) {
                this.f4596b.b(eVar, j2);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final void flush() {
        if (!this.f4597c) {
            e eVar = this.f4595a;
            long j2 = eVar.f4579b;
            u uVar = this.f4596b;
            if (j2 > 0) {
                uVar.b(eVar, j2);
            }
            uVar.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public final f g(byte[] bArr) {
        if (!this.f4597c) {
            this.f4595a.u(bArr, bArr.length);
            f();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final f h(long j2) {
        if (!this.f4597c) {
            this.f4595a.w(j2);
            f();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final f i(int i) {
        if (!this.f4597c) {
            e eVar = this.f4595a;
            r t2 = eVar.t(4);
            int i2 = t2.f4603c;
            byte[] bArr = t2.f4601a;
            bArr[i2] = (byte) ((i >>> 24) & 255);
            bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
            bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
            bArr[i2 + 3] = (byte) (i & 255);
            t2.f4603c = i2 + 4;
            eVar.f4579b += 4;
            f();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final boolean isOpen() {
        return !this.f4597c;
    }

    public final String toString() {
        return "buffer(" + this.f4596b + ")";
    }

    public final int write(ByteBuffer byteBuffer) {
        if (!this.f4597c) {
            int write = this.f4595a.write(byteBuffer);
            f();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [r1.e, java.lang.Object] */
    public p(u uVar) {
        if (uVar != null) {
            this.f4596b = uVar;
            return;
        }
        throw new NullPointerException("sink == null");
    }
}
