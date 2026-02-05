package r1;

public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public static r f4607a;

    /* renamed from: b  reason: collision with root package name */
    public static long f4608b;

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f4609c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    public static void a(r rVar) {
        if (rVar.f4605f != null || rVar.f4606g != null) {
            throw new IllegalArgumentException();
        } else if (!rVar.f4604d) {
            synchronized (s.class) {
                try {
                    long j2 = f4608b + 8192;
                    if (j2 <= 65536) {
                        f4608b = j2;
                        rVar.f4605f = f4607a;
                        rVar.f4603c = 0;
                        rVar.f4602b = 0;
                        f4607a = rVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static r b() {
        synchronized (s.class) {
            try {
                r rVar = f4607a;
                if (rVar == null) {
                    return new r();
                }
                f4607a = rVar.f4605f;
                rVar.f4605f = null;
                f4608b -= 8192;
                return rVar;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
