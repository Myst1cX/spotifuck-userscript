package androidx.activity;

import E.o;
import S0.c;
import Y0.a;
import Z0.d;
import Z0.f;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.t;
import androidx.lifecycle.C0073h;
import androidx.lifecycle.K;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import b0.C0084a;
import b0.b;
import h.C0121l;
import java.util.ArrayList;
import java.util.Arrays;

public final class m extends d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1172a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Q f1173b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Q q2, int i) {
        super(0);
        this.f1172a = i;
        this.f1173b = q2;
    }

    public final Object a() {
        b bVar;
        switch (this.f1172a) {
            case 0:
                ((C0121l) this.f1173b).reportFullyDrawn();
                return c.f888c;
            case 1:
                C0121l lVar = (C0121l) this.f1173b;
                return new p(lVar.f1178k, new m(lVar, 0));
            case 2:
                C0121l lVar2 = (C0121l) this.f1173b;
                A a2 = new A(new d(lVar2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (!Z0.c.a(Looper.myLooper(), Looper.getMainLooper())) {
                        new Handler(Looper.getMainLooper()).post(new o(lVar2, a2, 1));
                    } else {
                        lVar2.f50f.a(new h(a2, lVar2));
                    }
                }
                return a2;
            default:
                Q q2 = this.f1173b;
                ArrayList arrayList = new ArrayList();
                f.f1013a.getClass();
                Class<K> cls = K.class;
                Class a3 = new Z0.b(cls).a();
                Z0.c.c("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>", a3);
                arrayList.add(new b0.d(a3));
                b0.d[] dVarArr = (b0.d[]) arrayList.toArray(new b0.d[0]);
                A.b bVar2 = new A.b((b0.d[]) Arrays.copyOf(dVarArr, dVarArr.length));
                P c2 = q2.c();
                if (q2 instanceof C0073h) {
                    bVar = ((C0073h) q2).a();
                } else {
                    bVar = C0084a.f2075b;
                }
                return (K) new t(c2, bVar2, bVar).k("androidx.lifecycle.internal.SavedStateHandlesVM", cls);
        }
    }
}
