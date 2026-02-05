package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

@Deprecated
class ReflectiveGenericLifecycleObserver implements C0081p {

    /* renamed from: a  reason: collision with root package name */
    public final C0082q f1818a;

    /* renamed from: b  reason: collision with root package name */
    public final C0066a f1819b;

    public final void b(r rVar, C0077l lVar) {
        HashMap hashMap = this.f1819b.f1822a;
        C0082q qVar = this.f1818a;
        C0066a.a((List) hashMap.get(lVar), rVar, lVar, qVar);
        C0066a.a((List) hashMap.get(C0077l.ON_ANY), rVar, lVar, qVar);
    }

    public ReflectiveGenericLifecycleObserver(C0082q qVar) {
        this.f1818a = qVar;
        C0068c cVar = C0068c.f1826c;
        Class<?> cls = qVar.getClass();
        C0066a aVar = (C0066a) cVar.f1827a.get(cls);
        this.f1819b = aVar == null ? cVar.a(cls, (Method[]) null) : aVar;
    }
}
