package n;

import K.j;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import h.C0115f;
import h.C0118i;

/* renamed from: n.h  reason: case insensitive filesystem */
public final class C0193h implements C0209x, AdapterView.OnItemClickListener {

    /* renamed from: f  reason: collision with root package name */
    public Context f3861f;

    /* renamed from: g  reason: collision with root package name */
    public LayoutInflater f3862g;

    /* renamed from: h  reason: collision with root package name */
    public C0197l f3863h;
    public ExpandedMenuView i;

    /* renamed from: j  reason: collision with root package name */
    public C0208w f3864j;

    /* renamed from: k  reason: collision with root package name */
    public C0192g f3865k;

    public final boolean d(C0199n nVar) {
        return false;
    }

    public final boolean h() {
        return false;
    }

    public final void j(C0208w wVar) {
        throw null;
    }

    public final boolean k(C0199n nVar) {
        return false;
    }

    public final void b(C0197l lVar, boolean z2) {
        C0208w wVar = this.f3864j;
        if (wVar != null) {
            wVar.b(lVar, z2);
        }
    }

    public final void c() {
        C0192g gVar = this.f3865k;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    public final void f(Context context, C0197l lVar) {
        if (this.f3861f != null) {
            this.f3861f = context;
            if (this.f3862g == null) {
                this.f3862g = LayoutInflater.from(context);
            }
        }
        this.f3863h = lVar;
        C0192g gVar = this.f3865k;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        this.f3863h.q(this.f3865k.getItem(i2), this, 0);
    }

    public C0193h(ContextWrapper contextWrapper) {
        this.f3861f = contextWrapper;
        this.f3862g = LayoutInflater.from(contextWrapper);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.content.DialogInterface$OnClickListener, n.w, java.lang.Object, n.m, android.content.DialogInterface$OnDismissListener] */
    public final boolean g(C0185D d2) {
        if (!d2.hasVisibleItems()) {
            return false;
        }
        ? obj = new Object();
        obj.f3894f = d2;
        Context context = d2.f3872a;
        j jVar = new j(context);
        C0115f fVar = (C0115f) jVar.f333g;
        C0193h hVar = new C0193h(fVar.f2962a);
        obj.f3896h = hVar;
        hVar.f3864j = obj;
        d2.b(hVar, context);
        C0193h hVar2 = obj.f3896h;
        if (hVar2.f3865k == null) {
            hVar2.f3865k = new C0192g(hVar2);
        }
        fVar.f2972m = hVar2.f3865k;
        fVar.f2973n = obj;
        View view = d2.f3884o;
        if (view != null) {
            fVar.e = view;
        } else {
            fVar.f2964c = d2.f3883n;
            fVar.f2965d = d2.f3882m;
        }
        fVar.f2970k = obj;
        C0118i a2 = jVar.a();
        obj.f3895g = a2;
        a2.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f3895g.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f3895g.show();
        C0208w wVar = this.f3864j;
        if (wVar == null) {
            return true;
        }
        wVar.h(d2);
        return true;
    }
}
