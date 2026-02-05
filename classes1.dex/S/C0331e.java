package s;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: s.e  reason: case insensitive filesystem */
public final class C0331e extends C0327a {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4622a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4623b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4624c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f4625d;
    public final AtomicReferenceFieldUpdater e;

    public final boolean a(h hVar, C0330d dVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0330d dVar2 = C0330d.f4620b;
        do {
            atomicReferenceFieldUpdater = this.f4625d;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == dVar);
        return false;
    }

    public final boolean b(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    public final boolean c(h hVar, C0333g gVar, C0333g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f4624c;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }

    public final void d(C0333g gVar, C0333g gVar2) {
        this.f4623b.lazySet(gVar, gVar2);
    }

    public final void e(C0333g gVar, Thread thread) {
        this.f4622a.lazySet(gVar, thread);
    }

    public C0331e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f4622a = atomicReferenceFieldUpdater;
        this.f4623b = atomicReferenceFieldUpdater2;
        this.f4624c = atomicReferenceFieldUpdater3;
        this.f4625d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }
}
