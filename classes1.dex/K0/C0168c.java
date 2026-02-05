package k0;

import G.a;
import Z0.c;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.lifecycle.C0074i;
import h.C0119j;
import java.util.LinkedHashSet;
import o.C0300r;
import p0.C0320a;
import q.f;

/* renamed from: k0.c  reason: case insensitive filesystem */
public final class C0168c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3562a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3563b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3564c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f3565d;
    public Parcelable e;

    /* renamed from: f  reason: collision with root package name */
    public Object f3566f;

    public /* synthetic */ C0168c(TextView textView) {
        this.e = null;
        this.f3566f = null;
        this.f3562a = false;
        this.f3563b = false;
        this.f3565d = textView;
    }

    public C0168c() {
        this.f3565d = new f();
        this.f3564c = true;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f3565d;
        Drawable E2 = C0320a.E(compoundButton);
        if (E2 == null) {
            return;
        }
        if (this.f3562a || this.f3563b) {
            Drawable mutate = C0320a.J0(E2).mutate();
            if (this.f3562a) {
                a.h(mutate, (ColorStateList) this.e);
            }
            if (this.f3563b) {
                a.i(mutate, (PorterDuff.Mode) this.f3566f);
            }
            if (mutate.isStateful()) {
                mutate.setState(compoundButton.getDrawableState());
            }
            compoundButton.setButtonDrawable(mutate);
        }
    }

    public void b() {
        C0300r rVar = (C0300r) this.f3565d;
        Drawable checkMarkDrawable = rVar.getCheckMarkDrawable();
        if (checkMarkDrawable == null) {
            return;
        }
        if (this.f3562a || this.f3563b) {
            Drawable mutate = C0320a.J0(checkMarkDrawable).mutate();
            if (this.f3562a) {
                a.h(mutate, (ColorStateList) this.e);
            }
            if (this.f3563b) {
                a.i(mutate, (PorterDuff.Mode) this.f3566f);
            }
            if (mutate.isStateful()) {
                mutate.setState(rVar.getDrawableState());
            }
            rVar.setCheckMarkDrawable(mutate);
        }
    }

    public Bundle c(String str) {
        if (this.f3563b) {
            Bundle bundle = (Bundle) this.e;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = (Bundle) this.e;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = (Bundle) this.e;
            if (bundle4 == null || bundle4.isEmpty()) {
                this.e = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|(2:6|7)|9|10|(1:14)|15|(1:17)|18|(1:20)|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f3565d
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            android.content.Context r1 = r0.getContext()
            int[] r3 = g.C0096a.f2529m
            android.support.v4.media.session.t r7 = android.support.v4.media.session.t.A(r1, r10, r3, r11)
            java.lang.Object r1 = r7.f1132c
            r8 = r1
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            android.content.Context r2 = r0.getContext()
            java.lang.Object r1 = r7.f1132c
            r5 = r1
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r1 = r0
            r4 = r10
            r6 = r11
            N.Q.o(r1, r2, r3, r4, r5, r6)
            r10 = 1
            boolean r11 = r8.hasValue(r10)     // Catch:{ all -> 0x003c }
            r1 = 0
            if (r11 == 0) goto L_0x003e
            int r10 = r8.getResourceId(r10, r1)     // Catch:{ all -> 0x003c }
            if (r10 == 0) goto L_0x003e
            android.content.Context r11 = r0.getContext()     // Catch:{ NotFoundException -> 0x003e }
            android.graphics.drawable.Drawable r10 = T0.g.n(r11, r10)     // Catch:{ NotFoundException -> 0x003e }
            r0.setButtonDrawable(r10)     // Catch:{ NotFoundException -> 0x003e }
            goto L_0x0055
        L_0x003c:
            r10 = move-exception
            goto L_0x007b
        L_0x003e:
            boolean r10 = r8.hasValue(r1)     // Catch:{ all -> 0x003c }
            if (r10 == 0) goto L_0x0055
            int r10 = r8.getResourceId(r1, r1)     // Catch:{ all -> 0x003c }
            if (r10 == 0) goto L_0x0055
            android.content.Context r11 = r0.getContext()     // Catch:{ all -> 0x003c }
            android.graphics.drawable.Drawable r10 = T0.g.n(r11, r10)     // Catch:{ all -> 0x003c }
            r0.setButtonDrawable(r10)     // Catch:{ all -> 0x003c }
        L_0x0055:
            r10 = 2
            boolean r11 = r8.hasValue(r10)     // Catch:{ all -> 0x003c }
            if (r11 == 0) goto L_0x0063
            android.content.res.ColorStateList r10 = r7.n(r10)     // Catch:{ all -> 0x003c }
            T.b.c(r0, r10)     // Catch:{ all -> 0x003c }
        L_0x0063:
            r10 = 3
            boolean r11 = r8.hasValue(r10)     // Catch:{ all -> 0x003c }
            if (r11 == 0) goto L_0x0077
            r11 = -1
            int r10 = r8.getInt(r10, r11)     // Catch:{ all -> 0x003c }
            r11 = 0
            android.graphics.PorterDuff$Mode r10 = o.C0297p0.c(r10, r11)     // Catch:{ all -> 0x003c }
            T.b.d(r0, r10)     // Catch:{ all -> 0x003c }
        L_0x0077:
            r7.C()
            return
        L_0x007b:
            r7.C()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.C0168c.d(android.util.AttributeSet, int):void");
    }

    public void e(String str, C0167b bVar) {
        Object obj;
        c.e("provider", bVar);
        f fVar = (f) this.f3565d;
        q.c a2 = fVar.a(str);
        if (a2 != null) {
            obj = a2.f4472b;
        } else {
            q.c cVar = new q.c(str, bVar);
            fVar.f4481d++;
            q.c cVar2 = fVar.f4479b;
            if (cVar2 == null) {
                fVar.f4478a = cVar;
                fVar.f4479b = cVar;
            } else {
                cVar2.f4473c = cVar;
                cVar.f4474d = cVar2;
                fVar.f4479b = cVar;
            }
            obj = null;
        }
        if (((C0167b) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void f() {
        Class<C0074i> cls = C0074i.class;
        if (this.f3564c) {
            C0119j jVar = (C0119j) this.f3566f;
            if (jVar == null) {
                jVar = new C0119j(this);
            }
            this.f3566f = jVar;
            try {
                cls.getDeclaredConstructor((Class[]) null);
                C0119j jVar2 = (C0119j) this.f3566f;
                if (jVar2 != null) {
                    ((LinkedHashSet) jVar2.f3014b).add(cls.getName());
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }
}
