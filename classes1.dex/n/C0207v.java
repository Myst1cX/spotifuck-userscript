package n;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;

/* renamed from: n.v  reason: case insensitive filesystem */
public class C0207v {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3936a;

    /* renamed from: b  reason: collision with root package name */
    public final C0197l f3937b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3938c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3939d;
    public View e;

    /* renamed from: f  reason: collision with root package name */
    public int f3940f = 8388611;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3941g;

    /* renamed from: h  reason: collision with root package name */
    public C0208w f3942h;
    public C0205t i;

    /* renamed from: j  reason: collision with root package name */
    public C0206u f3943j;

    /* renamed from: k  reason: collision with root package name */
    public final C0206u f3944k = new C0206u(this);

    public void c() {
        this.i = null;
        C0206u uVar = this.f3943j;
        if (uVar != null) {
            uVar.onDismiss();
        }
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [n.f] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n.C0205t a() {
        /*
            r11 = this;
            n.t r0 = r11.i
            if (r0 != 0) goto L_0x006b
            java.lang.String r0 = "window"
            android.content.Context r1 = r11.f3936a
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            r0.getRealSize(r2)
            int r0 = r2.x
            int r2 = r2.y
            int r0 = java.lang.Math.min(r0, r2)
            android.content.res.Resources r2 = r1.getResources()
            r3 = 2131165206(0x7f070016, float:1.7944623E38)
            int r2 = r2.getDimensionPixelSize(r3)
            if (r0 < r2) goto L_0x003b
            n.f r0 = new n.f
            android.view.View r2 = r11.e
            int r3 = r11.f3939d
            boolean r4 = r11.f3938c
            r0.<init>(r1, r2, r3, r4)
            goto L_0x004b
        L_0x003b:
            n.C r0 = new n.C
            android.view.View r8 = r11.e
            android.content.Context r7 = r11.f3936a
            boolean r10 = r11.f3938c
            n.l r9 = r11.f3937b
            int r6 = r11.f3939d
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x004b:
            n.l r1 = r11.f3937b
            r0.l(r1)
            n.u r1 = r11.f3944k
            r0.r(r1)
            android.view.View r1 = r11.e
            r0.n(r1)
            n.w r1 = r11.f3942h
            r0.j(r1)
            boolean r1 = r11.f3941g
            r0.o(r1)
            int r1 = r11.f3940f
            r0.p(r1)
            r11.i = r0
        L_0x006b:
            n.t r0 = r11.i
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0207v.a():n.t");
    }

    public final boolean b() {
        C0205t tVar = this.i;
        if (tVar == null || !tVar.a()) {
            return false;
        }
        return true;
    }

    public C0207v(int i2, Context context, View view, C0197l lVar, boolean z2) {
        this.f3936a = context;
        this.f3937b = lVar;
        this.e = view;
        this.f3938c = z2;
        this.f3939d = i2;
    }

    public final void d(int i2, int i3, boolean z2, boolean z3) {
        C0205t a2 = a();
        a2.s(z3);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.f3940f, this.e.getLayoutDirection()) & 7) == 5) {
                i2 -= this.e.getWidth();
            }
            a2.q(i2);
            a2.t(i3);
            int i4 = (int) ((this.f3936a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f3934f = new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4);
        }
        a2.i();
    }
}
