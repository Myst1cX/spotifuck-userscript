package w0;

import K0.f;
import K0.g;
import K0.k;
import K0.v;
import N.Q;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;
import p0.C0320a;

public final class c {

    /* renamed from: u  reason: collision with root package name */
    public static final boolean f4902u = true;

    /* renamed from: v  reason: collision with root package name */
    public static final boolean f4903v;

    /* renamed from: a  reason: collision with root package name */
    public final MaterialButton f4904a;

    /* renamed from: b  reason: collision with root package name */
    public k f4905b;

    /* renamed from: c  reason: collision with root package name */
    public int f4906c;

    /* renamed from: d  reason: collision with root package name */
    public int f4907d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f4908f;

    /* renamed from: g  reason: collision with root package name */
    public int f4909g;

    /* renamed from: h  reason: collision with root package name */
    public int f4910h;
    public PorterDuff.Mode i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f4911j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f4912k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f4913l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f4914m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4915n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4916o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4917p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4918q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4919r = true;

    /* renamed from: s  reason: collision with root package name */
    public LayerDrawable f4920s;

    /* renamed from: t  reason: collision with root package name */
    public int f4921t;

    /* JADX WARNING: type inference failed for: r8v2, types: [android.graphics.drawable.Drawable$ConstantState, I0.a] */
    /* JADX WARNING: type inference failed for: r6v11, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r14 = this;
            r0 = 1
            r1 = 2
            r2 = 0
            K0.g r3 = new K0.g
            K0.k r4 = r14.f4905b
            r3.<init>((K0.k) r4)
            com.google.android.material.button.MaterialButton r4 = r14.f4904a
            android.content.Context r5 = r4.getContext()
            r3.h(r5)
            android.content.res.ColorStateList r5 = r14.f4911j
            G.a.h(r3, r5)
            android.graphics.PorterDuff$Mode r5 = r14.i
            if (r5 == 0) goto L_0x001f
            G.a.i(r3, r5)
        L_0x001f:
            int r5 = r14.f4910h
            float r5 = (float) r5
            android.content.res.ColorStateList r6 = r14.f4912k
            K0.f r7 = r3.f374f
            r7.f365j = r5
            r3.invalidateSelf()
            K0.f r5 = r3.f374f
            android.content.res.ColorStateList r7 = r5.f361d
            if (r7 == r6) goto L_0x003a
            r5.f361d = r6
            int[] r5 = r3.getState()
            r3.onStateChange(r5)
        L_0x003a:
            K0.g r5 = new K0.g
            K0.k r6 = r14.f4905b
            r5.<init>((K0.k) r6)
            r5.setTint(r2)
            int r6 = r14.f4910h
            float r6 = (float) r6
            boolean r7 = r14.f4915n
            if (r7 == 0) goto L_0x0053
            r7 = 2130968876(0x7f04012c, float:1.7546418E38)
            int r7 = p0.C0320a.H(r4, r7)
            goto L_0x0054
        L_0x0053:
            r7 = 0
        L_0x0054:
            K0.f r8 = r5.f374f
            r8.f365j = r6
            r5.invalidateSelf()
            android.content.res.ColorStateList r6 = android.content.res.ColorStateList.valueOf(r7)
            K0.f r7 = r5.f374f
            android.content.res.ColorStateList r8 = r7.f361d
            if (r8 == r6) goto L_0x006e
            r7.f361d = r6
            int[] r6 = r5.getState()
            r5.onStateChange(r6)
        L_0x006e:
            boolean r6 = f4902u
            if (r6 == 0) goto L_0x00a8
            K0.g r6 = new K0.g
            K0.k r7 = r14.f4905b
            r6.<init>((K0.k) r7)
            r14.f4914m = r6
            r7 = -1
            G.a.g(r6, r7)
            android.graphics.drawable.RippleDrawable r6 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r7 = r14.f4913l
            android.content.res.ColorStateList r7 = I0.d.a(r7)
            android.graphics.drawable.LayerDrawable r9 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r1]
            r1[r2] = r5
            r1[r0] = r3
            r9.<init>(r1)
            android.graphics.drawable.InsetDrawable r0 = new android.graphics.drawable.InsetDrawable
            int r10 = r14.f4906c
            int r11 = r14.e
            int r12 = r14.f4907d
            int r13 = r14.f4908f
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            android.graphics.drawable.Drawable r1 = r14.f4914m
            r6.<init>(r7, r0, r1)
            r14.f4920s = r6
            goto L_0x00e8
        L_0x00a8:
            I0.b r6 = new I0.b
            K0.k r7 = r14.f4905b
            I0.a r8 = new I0.a
            K0.g r9 = new K0.g
            r9.<init>((K0.k) r7)
            r8.<init>()
            r8.f284a = r9
            r8.f285b = r2
            r6.<init>(r8)
            r14.f4914m = r6
            android.content.res.ColorStateList r7 = r14.f4913l
            android.content.res.ColorStateList r7 = I0.d.a(r7)
            G.a.h(r6, r7)
            android.graphics.drawable.LayerDrawable r9 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable r6 = r14.f4914m
            r7 = 3
            android.graphics.drawable.Drawable[] r7 = new android.graphics.drawable.Drawable[r7]
            r7[r2] = r5
            r7[r0] = r3
            r7[r1] = r6
            r9.<init>(r7)
            r14.f4920s = r9
            android.graphics.drawable.InsetDrawable r6 = new android.graphics.drawable.InsetDrawable
            int r10 = r14.f4906c
            int r11 = r14.e
            int r12 = r14.f4907d
            int r13 = r14.f4908f
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x00e8:
            r4.setInternalBackground(r6)
            K0.g r0 = r14.b(r2)
            if (r0 == 0) goto L_0x00fe
            int r1 = r14.f4921t
            float r1 = (float) r1
            r0.i(r1)
            int[] r1 = r4.getDrawableState()
            r0.setState(r1)
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.c.e():void");
    }

    public final void f() {
        int i2 = 0;
        g b2 = b(false);
        g b3 = b(true);
        if (b2 != null) {
            ColorStateList colorStateList = this.f4912k;
            b2.f374f.f365j = (float) this.f4910h;
            b2.invalidateSelf();
            f fVar = b2.f374f;
            if (fVar.f361d != colorStateList) {
                fVar.f361d = colorStateList;
                b2.onStateChange(b2.getState());
            }
            if (b3 != null) {
                float f2 = (float) this.f4910h;
                if (this.f4915n) {
                    i2 = C0320a.H(this.f4904a, 2130968876);
                }
                b3.f374f.f365j = f2;
                b3.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i2);
                f fVar2 = b3.f374f;
                if (fVar2.f361d != valueOf) {
                    fVar2.f361d = valueOf;
                    b3.onStateChange(b3.getState());
                }
            }
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = true;
        if (i2 > 22) {
            z2 = false;
        }
        f4903v = z2;
    }

    public final v a() {
        LayerDrawable layerDrawable = this.f4920s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f4920s.getNumberOfLayers() > 2) {
            return (v) this.f4920s.getDrawable(2);
        }
        return (v) this.f4920s.getDrawable(1);
    }

    public final g b(boolean z2) {
        LayerDrawable layerDrawable = this.f4920s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f4902u) {
            return (g) ((LayerDrawable) ((InsetDrawable) this.f4920s.getDrawable(0)).getDrawable()).getDrawable(z2 ^ true ? 1 : 0);
        }
        return (g) this.f4920s.getDrawable(z2 ^ true ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f4905b = kVar;
        if (!f4903v || this.f4916o) {
            if (b(false) != null) {
                b(false).setShapeAppearanceModel(kVar);
            }
            if (b(true) != null) {
                b(true).setShapeAppearanceModel(kVar);
            }
            if (a() != null) {
                a().setShapeAppearanceModel(kVar);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = Q.f509a;
        MaterialButton materialButton = this.f4904a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        e();
        materialButton.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
    }

    public final void d(int i2, int i3) {
        WeakHashMap weakHashMap = Q.f509a;
        MaterialButton materialButton = this.f4904a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i4 = this.e;
        int i5 = this.f4908f;
        this.f4908f = i3;
        this.e = i2;
        if (!this.f4916o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i2) - i4, paddingEnd, (paddingBottom + i3) - i5);
    }

    public c(MaterialButton materialButton, k kVar) {
        this.f4904a = materialButton;
        this.f4905b = kVar;
    }
}
