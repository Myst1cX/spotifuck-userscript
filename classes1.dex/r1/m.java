package r1;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class m implements v {

    /* renamed from: a  reason: collision with root package name */
    public final q f4590a;

    /* renamed from: b  reason: collision with root package name */
    public final Inflater f4591b;

    /* renamed from: c  reason: collision with root package name */
    public int f4592c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4593d;

    public final x a() {
        return this.f4590a.f4599b.a();
    }

    public final void close() {
        if (!this.f4593d) {
            this.f4591b.end();
            this.f4593d = true;
            this.f4590a.close();
        }
    }

    public final long e(e eVar, long j2) {
        Inflater inflater;
        q qVar;
        r t2;
        if (!this.f4593d) {
            while (true) {
                inflater = this.f4591b;
                boolean needsInput = inflater.needsInput();
                qVar = this.f4590a;
                boolean z2 = false;
                if (needsInput) {
                    int i = this.f4592c;
                    if (i != 0) {
                        int remaining = i - inflater.getRemaining();
                        this.f4592c -= remaining;
                        qVar.q((long) remaining);
                    }
                    if (inflater.getRemaining() != 0) {
                        throw new IllegalStateException("?");
                    } else if (qVar.f()) {
                        z2 = true;
                    } else {
                        r rVar = qVar.f4598a.f4578a;
                        int i2 = rVar.f4603c;
                        int i3 = rVar.f4602b;
                        int i4 = i2 - i3;
                        this.f4592c = i4;
                        inflater.setInput(rVar.f4601a, i3, i4);
                    }
                }
                try {
                    t2 = eVar.t(1);
                    int inflate = inflater.inflate(t2.f4601a, t2.f4603c, (int) Math.min(8192, (long) (8192 - t2.f4603c)));
                    if (inflate > 0) {
                        t2.f4603c += inflate;
                        long j3 = (long) inflate;
                        eVar.f4579b += j3;
                        return j3;
                    } else if (inflater.finished()) {
                        break;
                    } else if (inflater.needsDictionary()) {
                        break;
                    } else if (z2) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            int i5 = this.f4592c;
            if (i5 != 0) {
                int remaining2 = i5 - inflater.getRemaining();
                this.f4592c -= remaining2;
                qVar.q((long) remaining2);
            }
            if (t2.f4602b != t2.f4603c) {
                return -1;
            }
            eVar.f4578a = t2.a();
            s.a(t2);
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    public m(q qVar, Inflater inflater) {
        this.f4590a = qVar;
        this.f4591b = inflater;
    }
}
