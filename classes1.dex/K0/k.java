package K0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p0.C0320a;
import q0.C0322a;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public C0320a f405a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public C0320a f406b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public C0320a f407c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public C0320a f408d = new Object();
    public c e = new a(0.0f);

    /* renamed from: f  reason: collision with root package name */
    public c f409f = new a(0.0f);

    /* renamed from: g  reason: collision with root package name */
    public c f410g = new a(0.0f);

    /* renamed from: h  reason: collision with root package name */
    public c f411h = new a(0.0f);
    public e i = new e(0);

    /* renamed from: j  reason: collision with root package name */
    public e f412j = new e(0);

    /* renamed from: k  reason: collision with root package name */
    public e f413k = new e(0);

    /* renamed from: l  reason: collision with root package name */
    public e f414l = new e(0);

    public static j a(Context context, int i2, int i3, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
        if (i3 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i3);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(C0322a.f4503v);
        try {
            int i4 = obtainStyledAttributes.getInt(0, 0);
            int i5 = obtainStyledAttributes.getInt(3, i4);
            int i6 = obtainStyledAttributes.getInt(4, i4);
            int i7 = obtainStyledAttributes.getInt(2, i4);
            int i8 = obtainStyledAttributes.getInt(1, i4);
            c c2 = c(obtainStyledAttributes, 5, aVar);
            c c3 = c(obtainStyledAttributes, 8, c2);
            c c4 = c(obtainStyledAttributes, 9, c2);
            c c5 = c(obtainStyledAttributes, 7, c2);
            c c6 = c(obtainStyledAttributes, 6, c2);
            j jVar = new j();
            C0320a s2 = C0320a.s(i5);
            jVar.f395a = s2;
            j.b(s2);
            jVar.e = c3;
            C0320a s3 = C0320a.s(i6);
            jVar.f396b = s3;
            j.b(s3);
            jVar.f399f = c4;
            C0320a s4 = C0320a.s(i7);
            jVar.f397c = s4;
            j.b(s4);
            jVar.f400g = c5;
            C0320a s5 = C0320a.s(i8);
            jVar.f398d = s5;
            j.b(s5);
            jVar.f401h = c6;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i2, int i3) {
        a aVar = new a((float) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0322a.f4497p, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public final boolean d(RectF rectF) {
        boolean z2;
        boolean z3;
        boolean z4;
        Class<e> cls = e.class;
        if (!this.f414l.getClass().equals(cls) || !this.f412j.getClass().equals(cls) || !this.i.getClass().equals(cls) || !this.f413k.getClass().equals(cls)) {
            z2 = false;
        } else {
            z2 = true;
        }
        float a2 = this.e.a(rectF);
        if (this.f409f.a(rectF) == a2 && this.f411h.a(rectF) == a2 && this.f410g.a(rectF) == a2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!(this.f406b instanceof i) || !(this.f405a instanceof i) || !(this.f407c instanceof i) || !(this.f408d instanceof i)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!z2 || !z3 || !z4) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [K0.j, java.lang.Object] */
    public final j e() {
        ? obj = new Object();
        obj.f395a = this.f405a;
        obj.f396b = this.f406b;
        obj.f397c = this.f407c;
        obj.f398d = this.f408d;
        obj.e = this.e;
        obj.f399f = this.f409f;
        obj.f400g = this.f410g;
        obj.f401h = this.f411h;
        obj.i = this.i;
        obj.f402j = this.f412j;
        obj.f403k = this.f413k;
        obj.f404l = this.f414l;
        return obj;
    }

    public static c c(TypedArray typedArray, int i2, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue == null) {
            return cVar;
        }
        int i3 = peekValue.type;
        if (i3 == 5) {
            return new a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i3 == 6) {
            return new h(peekValue.getFraction(1.0f, 1.0f));
        }
        return cVar;
    }
}
