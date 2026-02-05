package androidx.emoji2.text;

import A.k;
import K.a;
import T0.g;
import android.os.Build;
import android.support.v4.media.session.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class e extends g {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ f f1506l;

    public final void A(Throwable th) {
        this.f1506l.f1507a.d(th);
    }

    /* JADX INFO: finally extract failed */
    public final void B(k kVar) {
        Set<int[]> set;
        f fVar = this.f1506l;
        fVar.f1509c = kVar;
        k kVar2 = fVar.f1509c;
        j jVar = fVar.f1507a;
        K0.e eVar = jVar.f1520g;
        d dVar = jVar.i;
        if (Build.VERSION.SDK_INT >= 34) {
            set = m.a();
        } else {
            set = g.o();
        }
        fVar.f1508b = new t(kVar2, eVar, dVar, (Set) set);
        j jVar2 = fVar.f1507a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f1515a.writeLock().lock();
        try {
            jVar2.f1517c = 1;
            arrayList.addAll(jVar2.f1516b);
            jVar2.f1516b.clear();
            jVar2.f1515a.writeLock().unlock();
            jVar2.f1518d.post(new a((List) arrayList, jVar2.f1517c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f1515a.writeLock().unlock();
            throw th;
        }
    }

    public e(f fVar) {
        this.f1506l = fVar;
    }
}
