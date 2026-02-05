package r1;

import java.nio.charset.Charset;

public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f4616a = Charset.forName("UTF-8");

    public static void a(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }
}
