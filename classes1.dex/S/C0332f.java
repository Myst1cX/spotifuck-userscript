package s;

/* renamed from: s.f  reason: case insensitive filesystem */
public final class C0332f extends C0327a {
    public final boolean b(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f4632a != obj) {
                    return false;
                }
                hVar.f4632a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(h hVar, C0333g gVar, C0333g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f4634c != gVar) {
                    return false;
                }
                hVar.f4634c = gVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean a(h hVar, C0330d dVar) {
        C0330d dVar2 = C0330d.f4620b;
        synchronized (hVar) {
            try {
                if (hVar.f4633b != dVar) {
                    return false;
                }
                hVar.f4633b = dVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(C0333g gVar, C0333g gVar2) {
        gVar.f4628b = gVar2;
    }

    public final void e(C0333g gVar, Thread thread) {
        gVar.f4627a = thread;
    }
}
