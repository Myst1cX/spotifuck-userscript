package androidx.recyclerview.widget;

import E.j;
import J.k;
import N.C0014n;
import N.C0017q;
import U.b;
import V.d;
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.support.v4.media.session.t;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import j0.B;
import j0.C;
import j0.C0138A;
import j0.C0139a;
import j0.C0140b;
import j0.C0141c;
import j0.C0151m;
import j0.C0152n;
import j0.C0154p;
import j0.C0159v;
import j0.E;
import j0.F;
import j0.G;
import j0.H;
import j0.K;
import j0.L;
import j0.M;
import j0.N;
import j0.O;
import j0.P;
import j0.Q;
import j0.S;
import j0.T;
import j0.U;
import j0.X;
import j0.Y;
import j0.Z;
import j0.a0;
import j0.c0;
import j0.k0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import r.e;

public class RecyclerView extends ViewGroup {
    public static final boolean A0;

    /* renamed from: B0  reason: collision with root package name */
    public static final boolean f1976B0 = true;

    /* renamed from: C0  reason: collision with root package name */
    public static final boolean f1977C0 = true;

    /* renamed from: D0  reason: collision with root package name */
    public static final Class[] f1978D0;

    /* renamed from: E0  reason: collision with root package name */
    public static final d f1979E0 = new d(1);

    /* renamed from: z0  reason: collision with root package name */
    public static final int[] f1980z0 = {16843830};

    /* renamed from: A  reason: collision with root package name */
    public boolean f1981A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f1982B;

    /* renamed from: C  reason: collision with root package name */
    public int f1983C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f1984D;

    /* renamed from: E  reason: collision with root package name */
    public final AccessibilityManager f1985E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f1986F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f1987G;

    /* renamed from: H  reason: collision with root package name */
    public int f1988H;
    public int I;

    /* renamed from: J  reason: collision with root package name */
    public F f1989J;

    /* renamed from: K  reason: collision with root package name */
    public EdgeEffect f1990K;

    /* renamed from: L  reason: collision with root package name */
    public EdgeEffect f1991L;

    /* renamed from: M  reason: collision with root package name */
    public EdgeEffect f1992M;

    /* renamed from: N  reason: collision with root package name */
    public EdgeEffect f1993N;

    /* renamed from: O  reason: collision with root package name */
    public G f1994O;

    /* renamed from: P  reason: collision with root package name */
    public int f1995P;

    /* renamed from: Q  reason: collision with root package name */
    public int f1996Q;

    /* renamed from: R  reason: collision with root package name */
    public VelocityTracker f1997R;

    /* renamed from: S  reason: collision with root package name */
    public int f1998S;

    /* renamed from: T  reason: collision with root package name */
    public int f1999T;

    /* renamed from: U  reason: collision with root package name */
    public int f2000U;

    /* renamed from: V  reason: collision with root package name */
    public int f2001V;

    /* renamed from: W  reason: collision with root package name */
    public int f2002W;

    /* renamed from: a0  reason: collision with root package name */
    public M f2003a0;

    /* renamed from: b0  reason: collision with root package name */
    public final int f2004b0;

    /* renamed from: c0  reason: collision with root package name */
    public final int f2005c0;

    /* renamed from: d0  reason: collision with root package name */
    public final float f2006d0;

    /* renamed from: e0  reason: collision with root package name */
    public final float f2007e0;

    /* renamed from: f  reason: collision with root package name */
    public final T f2008f;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f2009f0;

    /* renamed from: g  reason: collision with root package name */
    public final Q f2010g;

    /* renamed from: g0  reason: collision with root package name */
    public final Z f2011g0;

    /* renamed from: h  reason: collision with root package name */
    public U f2012h;

    /* renamed from: h0  reason: collision with root package name */
    public C0154p f2013h0;
    public final C0140b i;

    /* renamed from: i0  reason: collision with root package name */
    public final C0152n f2014i0;

    /* renamed from: j  reason: collision with root package name */
    public final t f2015j;

    /* renamed from: j0  reason: collision with root package name */
    public final X f2016j0;

    /* renamed from: k  reason: collision with root package name */
    public final j f2017k;

    /* renamed from: k0  reason: collision with root package name */
    public N f2018k0;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2019l;

    /* renamed from: l0  reason: collision with root package name */
    public ArrayList f2020l0;

    /* renamed from: m  reason: collision with root package name */
    public final C0138A f2021m;
    public boolean m0;

    /* renamed from: n  reason: collision with root package name */
    public final Rect f2022n;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f2023n0;

    /* renamed from: o  reason: collision with root package name */
    public final Rect f2024o;

    /* renamed from: o0  reason: collision with root package name */
    public final B f2025o0;

    /* renamed from: p  reason: collision with root package name */
    public final RectF f2026p;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f2027p0;

    /* renamed from: q  reason: collision with root package name */
    public C f2028q;

    /* renamed from: q0  reason: collision with root package name */
    public c0 f2029q0;

    /* renamed from: r  reason: collision with root package name */
    public K f2030r;

    /* renamed from: r0  reason: collision with root package name */
    public final int[] f2031r0;

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList f2032s;

    /* renamed from: s0  reason: collision with root package name */
    public C0014n f2033s0;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList f2034t;

    /* renamed from: t0  reason: collision with root package name */
    public final int[] f2035t0;

    /* renamed from: u  reason: collision with root package name */
    public C0151m f2036u;

    /* renamed from: u0  reason: collision with root package name */
    public final int[] f2037u0;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2038v;

    /* renamed from: v0  reason: collision with root package name */
    public final int[] f2039v0;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2040w;

    /* renamed from: w0  reason: collision with root package name */
    public final ArrayList f2041w0;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2042x;

    /* renamed from: x0  reason: collision with root package name */
    public final C0138A f2043x0;

    /* renamed from: y  reason: collision with root package name */
    public int f2044y;

    /* renamed from: y0  reason: collision with root package name */
    public final B f2045y0;

    /* renamed from: z  reason: collision with root package name */
    public boolean f2046z;

    static {
        boolean z2;
        if (Build.VERSION.SDK_INT >= 23) {
            z2 = true;
        } else {
            z2 = false;
        }
        A0 = z2;
        Class cls = Integer.TYPE;
        f1978D0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969557);
    }

    public final void Q(boolean z2) {
        int i2;
        AccessibilityManager accessibilityManager;
        int i3 = this.f1988H - 1;
        this.f1988H = i3;
        if (i3 < 1) {
            this.f1988H = 0;
            if (z2) {
                int i4 = this.f1983C;
                this.f1983C = 0;
                if (!(i4 == 0 || (accessibilityManager = this.f1985E) == null || !accessibilityManager.isEnabled())) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    obtain.setContentChangeTypes(i4);
                    sendAccessibilityEventUnchecked(obtain);
                }
                ArrayList arrayList = this.f2041w0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    a0 a0Var = (a0) arrayList.get(size);
                    if (a0Var.f3338a.getParent() == this && !a0Var.p() && (i2 = a0Var.f3352q) != -1) {
                        WeakHashMap weakHashMap = N.Q.f509a;
                        a0Var.f3338a.setImportantForAccessibility(i2);
                        a0Var.f3352q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void Z(int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        a0 a0Var;
        t tVar = this.f2015j;
        c0();
        P();
        int i6 = k.f299a;
        Trace.beginSection("RV Scroll");
        X x2 = this.f2016j0;
        z(x2);
        Q q2 = this.f2010g;
        if (i2 != 0) {
            i4 = this.f2030r.m0(i2, q2, x2);
        } else {
            i4 = 0;
        }
        if (i3 != 0) {
            i5 = this.f2030r.o0(i3, q2, x2);
        } else {
            i5 = 0;
        }
        Trace.endSection();
        int m2 = tVar.m();
        for (int i7 = 0; i7 < m2; i7++) {
            View l2 = tVar.l(i7);
            a0 H2 = H(l2);
            if (!(H2 == null || (a0Var = H2.i) == null)) {
                int left = l2.getLeft();
                int top = l2.getTop();
                View view = a0Var.f3338a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Q(true);
        d0(false);
        if (iArr != null) {
            iArr[0] = i4;
            iArr[1] = i5;
        }
    }

    public final void draw(Canvas canvas) {
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        int i3;
        boolean z5 = true;
        super.draw(canvas);
        ArrayList arrayList = this.f2032s;
        int size = arrayList.size();
        boolean z6 = false;
        for (int i4 = 0; i4 < size; i4++) {
            ((H) arrayList.get(i4)).c(canvas, this);
        }
        EdgeEffect edgeEffect = this.f1990K;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            if (this.f2019l) {
                i3 = getPaddingBottom();
            } else {
                i3 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + i3), 0.0f);
            EdgeEffect edgeEffect2 = this.f1990K;
            if (edgeEffect2 == null || !edgeEffect2.draw(canvas)) {
                z2 = false;
            } else {
                z2 = true;
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f1991L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f2019l) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1991L;
            if (edgeEffect4 == null || !edgeEffect4.draw(canvas)) {
                z4 = false;
            } else {
                z4 = true;
            }
            z2 |= z4;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f1992M;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f2019l) {
                i2 = getPaddingTop();
            } else {
                i2 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate((float) (-i2), (float) (-width));
            EdgeEffect edgeEffect6 = this.f1992M;
            if (edgeEffect6 == null || !edgeEffect6.draw(canvas)) {
                z3 = false;
            } else {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f1993N;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2019l) {
                canvas.translate((float) (getPaddingRight() + (-getWidth())), (float) (getPaddingBottom() + (-getHeight())));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.f1993N;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z6 = true;
            }
            z2 |= z6;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.f1994O == null || arrayList.size() <= 0 || !this.f1994O.f()) {
            z5 = z2;
        }
        if (z5) {
            WeakHashMap weakHashMap = N.Q.f509a;
            postInvalidateOnAnimation();
        }
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        K k2 = this.f2030r;
        if (k2 != null) {
            return k2.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    public final void m() {
        t tVar = this.f2015j;
        C0140b bVar = this.i;
        if (!this.f2042x || this.f1986F) {
            int i2 = k.f299a;
            Trace.beginSection("RV FullInvalidate");
            o();
            Trace.endSection();
        } else if (bVar.j()) {
            int i3 = bVar.f3354a;
            if ((i3 & 4) != 0 && (i3 & 11) == 0) {
                int i4 = k.f299a;
                Trace.beginSection("RV PartialInvalidate");
                c0();
                P();
                bVar.p();
                if (!this.f2046z) {
                    int m2 = tVar.m();
                    int i5 = 0;
                    while (true) {
                        if (i5 < m2) {
                            a0 I2 = I(tVar.l(i5));
                            if (I2 != null && !I2.p() && I2.l()) {
                                o();
                                break;
                            }
                            i5++;
                        } else {
                            bVar.c();
                            break;
                        }
                    }
                }
                d0(true);
                Q(true);
                Trace.endSection();
            } else if (bVar.j()) {
                int i6 = k.f299a;
                Trace.beginSection("RV FullInvalidate");
                o();
                Trace.endSection();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: j0.a0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: j0.a0} */
    /* JADX WARNING: type inference failed for: r10v0, types: [j0.a0] */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: type inference failed for: r10v4 */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: type inference failed for: r13v6, types: [N.q, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v31 */
    /* JADX WARNING: type inference failed for: r7v32 */
    /* JADX WARNING: type inference failed for: r7v33 */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0323, code lost:
        if (((java.util.ArrayList) r0.f2015j.f1133d).contains(getFocusedChild()) == false) goto L_0x03e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0382, code lost:
        if (r6.hasFocusable() != false) goto L_0x0385;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0385, code lost:
        r7 = r6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o() {
        /*
            r19 = this;
            r0 = r19
            j0.C r1 = r0.f2028q
            java.lang.String r2 = "RecyclerView"
            if (r1 != 0) goto L_0x000e
            java.lang.String r1 = "No adapter attached; skipping layout"
            android.util.Log.e(r2, r1)
            return
        L_0x000e:
            j0.K r1 = r0.f2030r
            if (r1 != 0) goto L_0x0018
            java.lang.String r1 = "No layout manager attached; skipping layout"
            android.util.Log.e(r2, r1)
            return
        L_0x0018:
            j0.X r1 = r0.f2016j0
            r3 = 0
            r1.i = r3
            int r4 = r1.f3318d
            r5 = 1
            if (r4 != r5) goto L_0x002e
            r19.p()
            j0.K r4 = r0.f2030r
            r4.p0(r0)
            r19.q()
            goto L_0x0068
        L_0x002e:
            j0.b r4 = r0.i
            java.lang.Object r6 = r4.f3357d
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0045
            java.lang.Object r4 = r4.f3356c
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0045
            goto L_0x0060
        L_0x0045:
            j0.K r4 = r0.f2030r
            int r4 = r4.f3288n
            int r6 = r19.getWidth()
            if (r4 != r6) goto L_0x0060
            j0.K r4 = r0.f2030r
            int r4 = r4.f3289o
            int r6 = r19.getHeight()
            if (r4 == r6) goto L_0x005a
            goto L_0x0060
        L_0x005a:
            j0.K r4 = r0.f2030r
            r4.p0(r0)
            goto L_0x0068
        L_0x0060:
            j0.K r4 = r0.f2030r
            r4.p0(r0)
            r19.q()
        L_0x0068:
            r4 = 4
            r1.a(r4)
            r19.c0()
            r19.P()
            r1.f3318d = r5
            boolean r6 = r1.f3322j
            r7 = 0
            j0.Q r8 = r0.f2010g
            E.j r9 = r0.f2017k
            if (r6 == 0) goto L_0x0287
            android.support.v4.media.session.t r6 = r0.f2015j
            int r6 = r6.m()
            int r6 = r6 - r5
        L_0x0084:
            if (r6 < 0) goto L_0x01ba
            android.support.v4.media.session.t r10 = r0.f2015j
            android.view.View r10 = r10.l(r6)
            j0.a0 r10 = I(r10)
            boolean r11 = r10.p()
            if (r11 == 0) goto L_0x0098
            goto L_0x01b4
        L_0x0098:
            long r11 = r0.G(r10)
            j0.G r13 = r0.f1994O
            r13.getClass()
            N.q r13 = new N.q
            r13.<init>()
            r13.a(r10)
            java.lang.Object r14 = r9.f109h
            r.e r14 = (r.e) r14
            java.lang.Object r14 = r14.e(r11, r7)
            j0.a0 r14 = (j0.a0) r14
            if (r14 == 0) goto L_0x01b1
            boolean r15 = r14.p()
            if (r15 != 0) goto L_0x01b1
            java.lang.Object r15 = r9.f108g
            r.k r15 = (r.k) r15
            java.lang.Object r16 = r15.getOrDefault(r14, r7)
            r3 = r16
            j0.k0 r3 = (j0.k0) r3
            if (r3 == 0) goto L_0x00d0
            int r3 = r3.f3431a
            r3 = r3 & r5
            if (r3 == 0) goto L_0x00d0
            r3 = 1
            goto L_0x00d1
        L_0x00d0:
            r3 = 0
        L_0x00d1:
            java.lang.Object r15 = r15.getOrDefault(r10, r7)
            j0.k0 r15 = (j0.k0) r15
            if (r15 == 0) goto L_0x00e0
            int r15 = r15.f3431a
            r15 = r15 & r5
            if (r15 == 0) goto L_0x00e0
            r15 = 1
            goto L_0x00e1
        L_0x00e0:
            r15 = 0
        L_0x00e1:
            if (r3 == 0) goto L_0x00ea
            if (r14 != r10) goto L_0x00ea
            r9.b(r10, r13)
            goto L_0x01b4
        L_0x00ea:
            N.q r7 = r9.I(r14, r4)
            r9.b(r10, r13)
            r13 = 8
            N.q r13 = r9.I(r10, r13)
            if (r7 != 0) goto L_0x0187
            android.support.v4.media.session.t r3 = r0.f2015j
            int r3 = r3.m()
            r7 = 0
        L_0x0100:
            if (r7 >= r3) goto L_0x0166
            android.support.v4.media.session.t r13 = r0.f2015j
            android.view.View r13 = r13.l(r7)
            j0.a0 r13 = I(r13)
            if (r13 != r10) goto L_0x010f
            goto L_0x0163
        L_0x010f:
            long r17 = r0.G(r13)
            int r15 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r15 != 0) goto L_0x0163
            j0.C r1 = r0.f2028q
            java.lang.String r2 = " \n View Holder 2:"
            if (r1 == 0) goto L_0x0142
            boolean r1 = r1.f3265b
            if (r1 == 0) goto L_0x0142
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r13)
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = r19.y()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x0142:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r13)
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = r19.y()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x0163:
            int r7 = r7 + 1
            goto L_0x0100
        L_0x0166:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r7 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r3.<init>(r7)
            r3.append(r14)
            java.lang.String r7 = " cannot be found but it is necessary for "
            r3.append(r7)
            r3.append(r10)
            java.lang.String r7 = r19.y()
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r2, r3)
            goto L_0x01b4
        L_0x0187:
            r11 = 0
            r14.o(r11)
            if (r3 == 0) goto L_0x0190
            r0.f(r14)
        L_0x0190:
            if (r14 == r10) goto L_0x01a5
            if (r15 == 0) goto L_0x0197
            r0.f(r10)
        L_0x0197:
            r14.f3344h = r10
            r0.f(r14)
            r8.j(r14)
            r3 = 0
            r10.o(r3)
            r10.i = r14
        L_0x01a5:
            j0.G r3 = r0.f1994O
            boolean r3 = r3.a(r14, r10, r7, r13)
            if (r3 == 0) goto L_0x01b4
            r19.S()
            goto L_0x01b4
        L_0x01b1:
            r9.b(r10, r13)
        L_0x01b4:
            int r6 = r6 + -1
            r3 = 0
            r7 = 0
            goto L_0x0084
        L_0x01ba:
            java.lang.Object r2 = r9.f108g
            r.k r2 = (r.k) r2
            int r3 = r2.f4550c
            int r3 = r3 - r5
        L_0x01c1:
            if (r3 < 0) goto L_0x0286
            java.lang.Object r4 = r2.h(r3)
            r11 = r4
            j0.a0 r11 = (j0.a0) r11
            java.lang.Object r4 = r2.i(r3)
            j0.k0 r4 = (j0.k0) r4
            int r6 = r4.f3431a
            r7 = r6 & 3
            r10 = 3
            j0.B r12 = r0.f2045y0
            if (r7 != r10) goto L_0x01e8
            androidx.recyclerview.widget.RecyclerView r6 = r12.f3263a
            j0.K r7 = r6.f2030r
            android.view.View r10 = r11.f3338a
            j0.Q r6 = r6.f2010g
            r7.i0(r10, r6)
        L_0x01e4:
            r5 = 0
            r7 = 0
            goto L_0x0276
        L_0x01e8:
            r7 = r6 & 1
            if (r7 == 0) goto L_0x0202
            N.q r6 = r4.f3432b
            if (r6 != 0) goto L_0x01fc
            androidx.recyclerview.widget.RecyclerView r6 = r12.f3263a
            j0.K r7 = r6.f2030r
            android.view.View r10 = r11.f3338a
            j0.Q r6 = r6.f2010g
            r7.i0(r10, r6)
            goto L_0x01e4
        L_0x01fc:
            N.q r7 = r4.f3433c
            r12.g(r11, r6, r7)
            goto L_0x01e4
        L_0x0202:
            r7 = r6 & 14
            r10 = 14
            if (r7 != r10) goto L_0x0210
            N.q r6 = r4.f3432b
            N.q r7 = r4.f3433c
            r12.f(r11, r6, r7)
            goto L_0x01e4
        L_0x0210:
            r7 = r6 & 12
            r10 = 12
            if (r7 != r10) goto L_0x025d
            N.q r6 = r4.f3432b
            N.q r7 = r4.f3433c
            r12.getClass()
            r10 = 0
            r11.o(r10)
            androidx.recyclerview.widget.RecyclerView r15 = r12.f3263a
            boolean r10 = r15.f1986F
            if (r10 == 0) goto L_0x0233
            j0.G r10 = r15.f1994O
            boolean r6 = r10.a(r11, r11, r6, r7)
            if (r6 == 0) goto L_0x01e4
            r15.S()
            goto L_0x01e4
        L_0x0233:
            j0.G r10 = r15.f1994O
            j0.j r10 = (j0.C0148j) r10
            r10.getClass()
            int r12 = r6.f584a
            int r14 = r7.f584a
            if (r12 != r14) goto L_0x024d
            int r13 = r6.f585b
            int r5 = r7.f585b
            if (r13 == r5) goto L_0x0247
            goto L_0x024d
        L_0x0247:
            r10.c(r11)
            r6 = r15
            r5 = 0
            goto L_0x0257
        L_0x024d:
            int r13 = r6.f585b
            int r5 = r7.f585b
            r6 = r15
            r15 = r5
            boolean r5 = r10.g(r11, r12, r13, r14, r15)
        L_0x0257:
            if (r5 == 0) goto L_0x01e4
            r6.S()
            goto L_0x01e4
        L_0x025d:
            r5 = r6 & 4
            if (r5 == 0) goto L_0x0269
            N.q r5 = r4.f3432b
            r7 = 0
            r12.g(r11, r5, r7)
        L_0x0267:
            r5 = 0
            goto L_0x0276
        L_0x0269:
            r7 = 0
            r5 = r6 & 8
            if (r5 == 0) goto L_0x0267
            N.q r5 = r4.f3432b
            N.q r6 = r4.f3433c
            r12.f(r11, r5, r6)
            goto L_0x0267
        L_0x0276:
            r4.f3431a = r5
            r4.f3432b = r7
            r4.f3433c = r7
            M.c r5 = j0.k0.f3430d
            r5.c(r4)
            int r3 = r3 + -1
            r5 = 1
            goto L_0x01c1
        L_0x0286:
            r7 = 0
        L_0x0287:
            j0.K r2 = r0.f2030r
            r2.h0(r8)
            int r2 = r1.e
            r1.f3316b = r2
            r11 = 0
            r0.f1986F = r11
            r0.f1987G = r11
            r1.f3322j = r11
            r1.f3323k = r11
            j0.K r2 = r0.f2030r
            r2.f3281f = r11
            java.util.ArrayList r2 = r8.f3301b
            if (r2 == 0) goto L_0x02a4
            r2.clear()
        L_0x02a4:
            j0.K r2 = r0.f2030r
            boolean r3 = r2.f3285k
            if (r3 == 0) goto L_0x02b1
            r2.f3284j = r11
            r2.f3285k = r11
            r8.k()
        L_0x02b1:
            j0.K r2 = r0.f2030r
            r2.c0(r1)
            r2 = 1
            r0.Q(r2)
            r0.d0(r11)
            java.lang.Object r2 = r9.f108g
            r.k r2 = (r.k) r2
            r2.clear()
            java.lang.Object r2 = r9.f109h
            r.e r2 = (r.e) r2
            r2.b()
            int[] r2 = r0.f2031r0
            r3 = r2[r11]
            r4 = 1
            r5 = r2[r4]
            r0.C(r2)
            r6 = r2[r11]
            if (r6 != r3) goto L_0x02e0
            r2 = r2[r4]
            if (r2 == r5) goto L_0x02de
            goto L_0x02e0
        L_0x02de:
            r2 = 0
            goto L_0x02e1
        L_0x02e0:
            r2 = 1
        L_0x02e1:
            if (r2 == 0) goto L_0x02e6
            r0.t(r11, r11)
        L_0x02e6:
            boolean r2 = r0.f2009f0
            r3 = -1
            r5 = -1
            if (r2 == 0) goto L_0x03e4
            j0.C r2 = r0.f2028q
            if (r2 == 0) goto L_0x03e4
            boolean r2 = r19.hasFocus()
            if (r2 == 0) goto L_0x03e4
            int r2 = r19.getDescendantFocusability()
            r6 = 393216(0x60000, float:5.51013E-40)
            if (r2 == r6) goto L_0x03e4
            int r2 = r19.getDescendantFocusability()
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r2 != r6) goto L_0x030f
            boolean r2 = r19.isFocused()
            if (r2 == 0) goto L_0x030f
            goto L_0x03e4
        L_0x030f:
            boolean r2 = r19.isFocused()
            if (r2 != 0) goto L_0x0327
            android.view.View r2 = r19.getFocusedChild()
            android.support.v4.media.session.t r6 = r0.f2015j
            java.lang.Object r6 = r6.f1133d
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r2 = r6.contains(r2)
            if (r2 != 0) goto L_0x0327
            goto L_0x03e4
        L_0x0327:
            long r8 = r1.f3325m
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x036d
            j0.C r2 = r0.f2028q
            boolean r2 = r2.f3265b
            if (r2 == 0) goto L_0x036d
            if (r2 != 0) goto L_0x0336
            goto L_0x036d
        L_0x0336:
            android.support.v4.media.session.t r2 = r0.f2015j
            int r2 = r2.u()
            r10 = r7
            r6 = 0
        L_0x033e:
            if (r6 >= r2) goto L_0x036e
            android.support.v4.media.session.t r12 = r0.f2015j
            android.view.View r12 = r12.t(r6)
            j0.a0 r12 = I(r12)
            if (r12 == 0) goto L_0x036a
            boolean r13 = r12.i()
            if (r13 != 0) goto L_0x036a
            long r13 = r12.e
            int r15 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r15 != 0) goto L_0x036a
            android.support.v4.media.session.t r10 = r0.f2015j
            java.lang.Object r10 = r10.f1133d
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            android.view.View r13 = r12.f3338a
            boolean r10 = r10.contains(r13)
            if (r10 == 0) goto L_0x0368
            r10 = r12
            goto L_0x036a
        L_0x0368:
            r10 = r12
            goto L_0x036e
        L_0x036a:
            int r6 = r6 + 1
            goto L_0x033e
        L_0x036d:
            r10 = r7
        L_0x036e:
            if (r10 == 0) goto L_0x0387
            android.support.v4.media.session.t r2 = r0.f2015j
            java.lang.Object r2 = r2.f1133d
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            android.view.View r6 = r10.f3338a
            boolean r2 = r2.contains(r6)
            if (r2 != 0) goto L_0x0387
            boolean r2 = r6.hasFocusable()
            if (r2 != 0) goto L_0x0385
            goto L_0x0387
        L_0x0385:
            r7 = r6
            goto L_0x03cb
        L_0x0387:
            android.support.v4.media.session.t r2 = r0.f2015j
            int r2 = r2.m()
            if (r2 <= 0) goto L_0x03cb
            int r2 = r1.f3324l
            if (r2 == r5) goto L_0x0394
            goto L_0x0395
        L_0x0394:
            r2 = 0
        L_0x0395:
            int r6 = r1.b()
            r8 = r2
        L_0x039a:
            if (r8 >= r6) goto L_0x03b0
            j0.a0 r9 = r0.E(r8)
            if (r9 != 0) goto L_0x03a3
            goto L_0x03b0
        L_0x03a3:
            android.view.View r9 = r9.f3338a
            boolean r10 = r9.hasFocusable()
            if (r10 == 0) goto L_0x03ad
            r7 = r9
            goto L_0x03cb
        L_0x03ad:
            int r8 = r8 + 1
            goto L_0x039a
        L_0x03b0:
            int r2 = java.lang.Math.min(r6, r2)
            r6 = 1
            int r2 = r2 - r6
        L_0x03b6:
            if (r2 < 0) goto L_0x03cb
            j0.a0 r6 = r0.E(r2)
            if (r6 != 0) goto L_0x03bf
            goto L_0x03cb
        L_0x03bf:
            android.view.View r6 = r6.f3338a
            boolean r8 = r6.hasFocusable()
            if (r8 == 0) goto L_0x03c8
            goto L_0x0385
        L_0x03c8:
            int r2 = r2 + -1
            goto L_0x03b6
        L_0x03cb:
            if (r7 == 0) goto L_0x03e4
            int r2 = r1.f3326n
            long r8 = (long) r2
            int r6 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x03e1
            android.view.View r2 = r7.findViewById(r2)
            if (r2 == 0) goto L_0x03e1
            boolean r6 = r2.isFocusable()
            if (r6 == 0) goto L_0x03e1
            r7 = r2
        L_0x03e1:
            r7.requestFocus()
        L_0x03e4:
            r1.f3325m = r3
            r1.f3324l = r5
            r1.f3326n = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o():void");
    }

    public void setAdapter(C c2) {
        setLayoutFrozen(false);
        C c3 = this.f2028q;
        T t2 = this.f2008f;
        if (c3 != null) {
            c3.f3264a.unregisterObserver(t2);
            this.f2028q.getClass();
        }
        G g2 = this.f1994O;
        if (g2 != null) {
            g2.e();
        }
        K k2 = this.f2030r;
        Q q2 = this.f2010g;
        if (k2 != null) {
            k2.g0(q2);
            this.f2030r.h0(q2);
        }
        q2.f3300a.clear();
        q2.d();
        C0140b bVar = this.i;
        bVar.q((ArrayList) bVar.f3356c);
        bVar.q((ArrayList) bVar.f3357d);
        bVar.f3354a = 0;
        C c4 = this.f2028q;
        this.f2028q = c2;
        if (c2 != null) {
            c2.f3264a.registerObserver(t2);
        }
        C c5 = this.f2028q;
        q2.f3300a.clear();
        q2.d();
        P c6 = q2.c();
        if (c4 != null) {
            c6.f3299b--;
        }
        if (c6.f3299b == 0) {
            int i2 = 0;
            while (true) {
                SparseArray sparseArray = c6.f3298a;
                if (i2 >= sparseArray.size()) {
                    break;
                }
                ((O) sparseArray.valueAt(i2)).f3294a.clear();
                i2++;
            }
        }
        if (c5 != null) {
            c6.f3299b++;
        }
        this.f2016j0.f3319f = true;
        U(false);
        requestLayout();
    }

    public void setLayoutManager(K k2) {
        RecyclerView recyclerView;
        C0159v vVar;
        if (k2 != this.f2030r) {
            setScrollState(0);
            Z z2 = this.f2011g0;
            z2.f3332g.removeCallbacks(z2);
            z2.f3329c.abortAnimation();
            K k3 = this.f2030r;
            if (!(k3 == null || (vVar = k3.e) == null)) {
                vVar.i();
            }
            K k4 = this.f2030r;
            Q q2 = this.f2010g;
            if (k4 != null) {
                G g2 = this.f1994O;
                if (g2 != null) {
                    g2.e();
                }
                this.f2030r.g0(q2);
                this.f2030r.h0(q2);
                q2.f3300a.clear();
                q2.d();
                if (this.f2038v) {
                    K k5 = this.f2030r;
                    k5.f3282g = false;
                    k5.R(this);
                }
                this.f2030r.t0((RecyclerView) null);
                this.f2030r = null;
            } else {
                q2.f3300a.clear();
                q2.d();
            }
            t tVar = this.f2015j;
            ((C0141c) tVar.f1132c).g();
            ArrayList arrayList = (ArrayList) tVar.f1133d;
            int size = arrayList.size() - 1;
            while (true) {
                recyclerView = ((B) tVar.f1131b).f3263a;
                if (size < 0) {
                    break;
                }
                a0 I2 = I((View) arrayList.get(size));
                if (I2 != null) {
                    int i2 = I2.f3351p;
                    if (recyclerView.L()) {
                        I2.f3352q = i2;
                        recyclerView.f2041w0.add(I2);
                    } else {
                        WeakHashMap weakHashMap = N.Q.f509a;
                        I2.f3338a.setImportantForAccessibility(i2);
                    }
                    I2.f3351p = 0;
                }
                arrayList.remove(size);
                size--;
            }
            int childCount = recyclerView.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = recyclerView.getChildAt(i3);
                I(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeAllViews();
            this.f2030r = k2;
            if (k2 != null) {
                if (k2.f3278b == null) {
                    k2.t0(this);
                    if (this.f2038v) {
                        K k6 = this.f2030r;
                        k6.f3282g = true;
                        k6.Q(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + k2 + " is already attached to a RecyclerView:" + k2.f3278b.y());
                }
            }
            q2.k();
            requestLayout();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: j0.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v53, resolved type: j0.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v54, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v55, resolved type: j0.n} */
    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, j0.F] */
    /* JADX WARNING: type inference failed for: r0v10, types: [j0.j, java.lang.Object, j0.G] */
    /* JADX WARNING: type inference failed for: r1v19, types: [j0.X, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RecyclerView(android.content.Context r19, android.util.AttributeSet r20, int r21) {
        /*
            r18 = this;
            r10 = r18
            r11 = r19
            r12 = r20
            r13 = r21
            r14 = 1
            r18.<init>(r19, r20, r21)
            j0.T r0 = new j0.T
            r0.<init>(r10)
            r10.f2008f = r0
            j0.Q r0 = new j0.Q
            r0.<init>(r10)
            r10.f2010g = r0
            E.j r0 = new E.j
            r1 = 19
            r0.<init>((int) r1)
            r10.f2017k = r0
            j0.A r0 = new j0.A
            r15 = 0
            r0.<init>(r10, r15)
            r10.f2021m = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.f2022n = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.f2024o = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r10.f2026p = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f2032s = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f2034t = r0
            r10.f2044y = r15
            r10.f1986F = r15
            r10.f1987G = r15
            r10.f1988H = r15
            r10.I = r15
            j0.F r0 = new j0.F
            r0.<init>()
            r10.f1989J = r0
            j0.j r0 = new j0.j
            r0.<init>()
            r9 = 0
            r0.f3266a = r9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f3267b = r1
            r1 = 120(0x78, double:5.93E-322)
            r0.f3268c = r1
            r0.f3269d = r1
            r1 = 250(0xfa, double:1.235E-321)
            r0.e = r1
            r0.f3270f = r1
            r0.f3414g = r14
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f3415h = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.i = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f3416j = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f3417k = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f3418l = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f3419m = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f3420n = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f3421o = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f3422p = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f3423q = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f3424r = r1
            r10.f1994O = r0
            r10.f1995P = r15
            r0 = -1
            r10.f1996Q = r0
            r1 = 1
            r10.f2006d0 = r1
            r10.f2007e0 = r1
            r10.f2009f0 = r14
            j0.Z r1 = new j0.Z
            r1.<init>(r10)
            r10.f2011g0 = r1
            boolean r1 = f1977C0
            if (r1 == 0) goto L_0x00e8
            j0.n r1 = new j0.n
            r1.<init>()
            goto L_0x00e9
        L_0x00e8:
            r1 = r9
        L_0x00e9:
            r10.f2014i0 = r1
            j0.X r1 = new j0.X
            r1.<init>()
            r1.f3315a = r0
            r1.f3316b = r15
            r1.f3317c = r15
            r1.f3318d = r14
            r1.e = r15
            r1.f3319f = r15
            r1.f3320g = r15
            r1.f3321h = r15
            r1.i = r15
            r1.f3322j = r15
            r1.f3323k = r15
            r10.f2016j0 = r1
            r10.m0 = r15
            r10.f2023n0 = r15
            j0.B r1 = new j0.B
            r1.<init>(r10)
            r10.f2025o0 = r1
            r10.f2027p0 = r15
            r8 = 2
            int[] r2 = new int[r8]
            r10.f2031r0 = r2
            int[] r2 = new int[r8]
            r10.f2035t0 = r2
            int[] r2 = new int[r8]
            r10.f2037u0 = r2
            int[] r2 = new int[r8]
            r10.f2039v0 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r10.f2041w0 = r2
            j0.A r2 = new j0.A
            r2.<init>(r10, r14)
            r10.f2043x0 = r2
            j0.B r2 = new j0.B
            r2.<init>(r10)
            r10.f2045y0 = r2
            r10.setScrollContainer(r14)
            r10.setFocusableInTouchMode(r14)
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r19)
            int r3 = r2.getScaledTouchSlop()
            r10.f2002W = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 < r4) goto L_0x0158
            java.lang.reflect.Method r5 = N.V.f515a
            float r5 = N.S.a(r2)
            goto L_0x015c
        L_0x0158:
            float r5 = N.V.a(r2, r11)
        L_0x015c:
            r10.f2006d0 = r5
            if (r3 < r4) goto L_0x0165
            float r5 = N.S.b(r2)
            goto L_0x0169
        L_0x0165:
            float r5 = N.V.a(r2, r11)
        L_0x0169:
            r10.f2007e0 = r5
            int r5 = r2.getScaledMinimumFlingVelocity()
            r10.f2004b0 = r5
            int r2 = r2.getScaledMaximumFlingVelocity()
            r10.f2005c0 = r2
            int r2 = r18.getOverScrollMode()
            if (r2 != r8) goto L_0x017f
            r2 = 1
            goto L_0x0180
        L_0x017f:
            r2 = 0
        L_0x0180:
            r10.setWillNotDraw(r2)
            j0.G r2 = r10.f1994O
            r2.f3266a = r1
            j0.b r1 = new j0.b
            j0.B r2 = new j0.B
            r2.<init>(r10)
            r1.<init>((j0.B) r2)
            r10.i = r1
            android.support.v4.media.session.t r1 = new android.support.v4.media.session.t
            j0.B r2 = new j0.B
            r2.<init>(r10)
            r1.<init>((j0.B) r2)
            r10.f2015j = r1
            java.util.WeakHashMap r1 = N.Q.f509a
            if (r3 < r4) goto L_0x01a8
            int r1 = N.H.c(r18)
            goto L_0x01a9
        L_0x01a8:
            r1 = 0
        L_0x01a9:
            r7 = 8
            if (r1 != 0) goto L_0x01b2
            if (r3 < r4) goto L_0x01b2
            N.H.m(r10, r7)
        L_0x01b2:
            int r1 = r18.getImportantForAccessibility()
            if (r1 != 0) goto L_0x01bb
            r10.setImportantForAccessibility(r14)
        L_0x01bb:
            android.content.Context r1 = r18.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            r10.f1985E = r1
            j0.c0 r1 = new j0.c0
            r1.<init>(r10)
            r10.setAccessibilityDelegateCompat(r1)
            int[] r4 = i0.C0130a.f3092a
            android.content.res.TypedArray r6 = r11.obtainStyledAttributes(r12, r4, r13, r15)
            r5 = 29
            if (r3 < r5) goto L_0x01ea
            r1 = r18
            r2 = r19
            r3 = r4
            r4 = r20
            r5 = r6
            r15 = r6
            r6 = r21
            r1.saveAttributeDataForStyleable(r2, r3, r4, r5, r6, 0)
            goto L_0x01eb
        L_0x01ea:
            r15 = r6
        L_0x01eb:
            java.lang.String r16 = r15.getString(r7)
            int r1 = r15.getInt(r8, r0)
            if (r1 != r0) goto L_0x01fa
            r0 = 262144(0x40000, float:3.67342E-40)
            r10.setDescendantFocusability(r0)
        L_0x01fa:
            boolean r0 = r15.getBoolean(r14, r14)
            r10.f2019l = r0
            r0 = 3
            r1 = 0
            boolean r2 = r15.getBoolean(r0, r1)
            r7 = 4
            if (r2 == 0) goto L_0x026b
            r1 = 6
            android.graphics.drawable.Drawable r1 = r15.getDrawable(r1)
            r3 = r1
            android.graphics.drawable.StateListDrawable r3 = (android.graphics.drawable.StateListDrawable) r3
            r1 = 7
            android.graphics.drawable.Drawable r4 = r15.getDrawable(r1)
            android.graphics.drawable.Drawable r1 = r15.getDrawable(r7)
            r5 = r1
            android.graphics.drawable.StateListDrawable r5 = (android.graphics.drawable.StateListDrawable) r5
            r1 = 5
            android.graphics.drawable.Drawable r6 = r15.getDrawable(r1)
            if (r3 == 0) goto L_0x0253
            if (r4 == 0) goto L_0x0253
            if (r5 == 0) goto L_0x0253
            if (r6 == 0) goto L_0x0253
            android.content.Context r1 = r18.getContext()
            android.content.res.Resources r1 = r1.getResources()
            j0.m r2 = new j0.m
            r7 = 2131165328(0x7f070090, float:1.794487E38)
            int r7 = r1.getDimensionPixelSize(r7)
            r8 = 2131165330(0x7f070092, float:1.7944874E38)
            int r8 = r1.getDimensionPixelSize(r8)
            r9 = 2131165329(0x7f070091, float:1.7944872E38)
            int r9 = r1.getDimensionPixelOffset(r9)
            r1 = r2
            r2 = r18
            r0 = 4
            r17 = 2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x026e
        L_0x0253:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Trying to set fast scroller without both required drawables."
            r1.<init>(r2)
            java.lang.String r2 = r18.y()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x026b:
            r0 = 4
            r17 = 2
        L_0x026e:
            r15.recycle()
            java.lang.String r1 = ": Could not instantiate the LayoutManager: "
            if (r16 == 0) goto L_0x03d6
            java.lang.String r2 = r16.trim()
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x03d6
            r3 = 0
            char r4 = r2.charAt(r3)
            r3 = 46
            if (r4 != r3) goto L_0x029c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r19.getPackageName()
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            goto L_0x02c1
        L_0x029c:
            java.lang.String r4 = "."
            boolean r4 = r2.contains(r4)
            if (r4 == 0) goto L_0x02a5
            goto L_0x02c1
        L_0x02a5:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class<androidx.recyclerview.widget.RecyclerView> r5 = androidx.recyclerview.widget.RecyclerView.class
            java.lang.Package r5 = r5.getPackage()
            java.lang.String r5 = r5.getName()
            r4.append(r5)
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
        L_0x02c1:
            boolean r3 = r18.isInEditMode()     // Catch:{ ClassNotFoundException -> 0x02dd, InvocationTargetException -> 0x02da, InstantiationException -> 0x02d7, IllegalAccessException -> 0x02d4, ClassCastException -> 0x02d1 }
            if (r3 == 0) goto L_0x02e0
            java.lang.Class r3 = r18.getClass()     // Catch:{ ClassNotFoundException -> 0x02dd, InvocationTargetException -> 0x02da, InstantiationException -> 0x02d7, IllegalAccessException -> 0x02d4, ClassCastException -> 0x02d1 }
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x02dd, InvocationTargetException -> 0x02da, InstantiationException -> 0x02d7, IllegalAccessException -> 0x02d4, ClassCastException -> 0x02d1 }
        L_0x02cf:
            r4 = 0
            goto L_0x02e5
        L_0x02d1:
            r0 = move-exception
            goto L_0x0344
        L_0x02d4:
            r0 = move-exception
            goto L_0x0362
        L_0x02d7:
            r0 = move-exception
            goto L_0x0380
        L_0x02da:
            r0 = move-exception
            goto L_0x039c
        L_0x02dd:
            r0 = move-exception
            goto L_0x03b8
        L_0x02e0:
            java.lang.ClassLoader r3 = r19.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x02dd, InvocationTargetException -> 0x02da, InstantiationException -> 0x02d7, IllegalAccessException -> 0x02d4, ClassCastException -> 0x02d1 }
            goto L_0x02cf
        L_0x02e5:
            java.lang.Class r3 = java.lang.Class.forName(r2, r4, r3)     // Catch:{ ClassNotFoundException -> 0x02dd, InvocationTargetException -> 0x02da, InstantiationException -> 0x02d7, IllegalAccessException -> 0x02d4, ClassCastException -> 0x02d1 }
            java.lang.Class<j0.K> r4 = j0.K.class
            java.lang.Class r3 = r3.asSubclass(r4)     // Catch:{ ClassNotFoundException -> 0x02dd, InvocationTargetException -> 0x02da, InstantiationException -> 0x02d7, IllegalAccessException -> 0x02d4, ClassCastException -> 0x02d1 }
            java.lang.Class[] r4 = f1978D0     // Catch:{ NoSuchMethodException -> 0x030a }
            java.lang.reflect.Constructor r4 = r3.getConstructor(r4)     // Catch:{ NoSuchMethodException -> 0x030a }
            java.lang.Object[] r9 = new java.lang.Object[r0]     // Catch:{ NoSuchMethodException -> 0x030a }
            r5 = 0
            r9[r5] = r11     // Catch:{ NoSuchMethodException -> 0x030a }
            r9[r14] = r12     // Catch:{ NoSuchMethodException -> 0x030a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)     // Catch:{ NoSuchMethodException -> 0x030a }
            r9[r17] = r0     // Catch:{ NoSuchMethodException -> 0x030a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ NoSuchMethodException -> 0x030a }
            r5 = 3
            r9[r5] = r0     // Catch:{ NoSuchMethodException -> 0x030a }
            goto L_0x0313
        L_0x030a:
            r0 = move-exception
            r5 = r0
            r4 = 0
            java.lang.reflect.Constructor r0 = r3.getConstructor(r4)     // Catch:{ NoSuchMethodException -> 0x0321 }
            r9 = r4
            r4 = r0
        L_0x0313:
            r4.setAccessible(r14)     // Catch:{ ClassNotFoundException -> 0x02dd, InvocationTargetException -> 0x02da, InstantiationException -> 0x02d7, IllegalAccessException -> 0x02d4, ClassCastException -> 0x02d1 }
            java.lang.Object r0 = r4.newInstance(r9)     // Catch:{ ClassNotFoundException -> 0x02dd, InvocationTargetException -> 0x02da, InstantiationException -> 0x02d7, IllegalAccessException -> 0x02d4, ClassCastException -> 0x02d1 }
            j0.K r0 = (j0.K) r0     // Catch:{ ClassNotFoundException -> 0x02dd, InvocationTargetException -> 0x02da, InstantiationException -> 0x02d7, IllegalAccessException -> 0x02d4, ClassCastException -> 0x02d1 }
            r10.setLayoutManager(r0)     // Catch:{ ClassNotFoundException -> 0x02dd, InvocationTargetException -> 0x02da, InstantiationException -> 0x02d7, IllegalAccessException -> 0x02d4, ClassCastException -> 0x02d1 }
            goto L_0x03d6
        L_0x0321:
            r0 = move-exception
            r3 = r0
            r3.initCause(r5)     // Catch:{ ClassNotFoundException -> 0x02dd, InvocationTargetException -> 0x02da, InstantiationException -> 0x02d7, IllegalAccessException -> 0x02d4, ClassCastException -> 0x02d1 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ ClassNotFoundException -> 0x02dd, InvocationTargetException -> 0x02da, InstantiationException -> 0x02d7, IllegalAccessException -> 0x02d4, ClassCastException -> 0x02d1 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x02dd, InvocationTargetException -> 0x02da, InstantiationException -> 0x02d7, IllegalAccessException -> 0x02d4, ClassCastException -> 0x02d1 }
            r4.<init>()     // Catch:{ ClassNotFoundException -> 0x02dd, InvocationTargetException -> 0x02da, InstantiationException -> 0x02d7, IllegalAccessException -> 0x02d4, ClassCastException -> 0x02d1 }
            java.lang.String r5 = r20.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x02dd, InvocationTargetException -> 0x02da, InstantiationException -> 0x02d7, IllegalAccessException -> 0x02d4, ClassCastException -> 0x02d1 }
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x02dd, InvocationTargetException -> 0x02da, InstantiationException -> 0x02d7, IllegalAccessException -> 0x02d4, ClassCastException -> 0x02d1 }
            java.lang.String r5 = ": Error creating LayoutManager "
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x02dd, InvocationTargetException -> 0x02da, InstantiationException -> 0x02d7, IllegalAccessException -> 0x02d4, ClassCastException -> 0x02d1 }
            r4.append(r2)     // Catch:{ ClassNotFoundException -> 0x02dd, InvocationTargetException -> 0x02da, InstantiationException -> 0x02d7, IllegalAccessException -> 0x02d4, ClassCastException -> 0x02d1 }
            java.lang.String r4 = r4.toString()     // Catch:{ ClassNotFoundException -> 0x02dd, InvocationTargetException -> 0x02da, InstantiationException -> 0x02d7, IllegalAccessException -> 0x02d4, ClassCastException -> 0x02d1 }
            r0.<init>(r4, r3)     // Catch:{ ClassNotFoundException -> 0x02dd, InvocationTargetException -> 0x02da, InstantiationException -> 0x02d7, IllegalAccessException -> 0x02d4, ClassCastException -> 0x02d1 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x02dd, InvocationTargetException -> 0x02da, InstantiationException -> 0x02d7, IllegalAccessException -> 0x02d4, ClassCastException -> 0x02d1 }
        L_0x0344:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r20.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Class is not a LayoutManager "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x0362:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r20.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Cannot access non-public constructor "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x0380:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r20.getPositionDescription()
            r4.append(r5)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1, r0)
            throw r3
        L_0x039c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r20.getPositionDescription()
            r4.append(r5)
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1, r0)
            throw r3
        L_0x03b8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r20.getPositionDescription()
            r3.append(r4)
            java.lang.String r4 = ": Unable to find LayoutManager "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x03d6:
            int r0 = android.os.Build.VERSION.SDK_INT
            int[] r3 = f1980z0
            r7 = 0
            android.content.res.TypedArray r8 = r11.obtainStyledAttributes(r12, r3, r13, r7)
            r1 = 29
            if (r0 < r1) goto L_0x03ef
            r1 = r18
            r2 = r19
            r4 = r20
            r5 = r8
            r6 = r21
            r1.saveAttributeDataForStyleable(r2, r3, r4, r5, r6, 0)
        L_0x03ef:
            boolean r0 = r8.getBoolean(r7, r14)
            r8.recycle()
            r10.setNestedScrollingEnabled(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static RecyclerView D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView D2 = D(viewGroup.getChildAt(i2));
            if (D2 != null) {
                return D2;
            }
        }
        return null;
    }

    public static a0 I(View view) {
        if (view == null) {
            return null;
        }
        return ((L) view.getLayoutParams()).f3290a;
    }

    private C0014n getScrollingChildHelper() {
        if (this.f2033s0 == null) {
            this.f2033s0 = new C0014n(this);
        }
        return this.f2033s0;
    }

    public static void j(a0 a0Var) {
        WeakReference weakReference = a0Var.f3339b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != a0Var.f3338a) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                } else {
                    return;
                }
            }
            a0Var.f3339b = null;
        }
    }

    public final void C(int[] iArr) {
        int m2 = this.f2015j.m();
        if (m2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < m2; i4++) {
            a0 I2 = I(this.f2015j.l(i4));
            if (!I2.p()) {
                int b2 = I2.b();
                if (b2 < i2) {
                    i2 = b2;
                }
                if (b2 > i3) {
                    i3 = b2;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public final a0 E(int i2) {
        a0 a0Var = null;
        if (this.f1986F) {
            return null;
        }
        int u2 = this.f2015j.u();
        for (int i3 = 0; i3 < u2; i3++) {
            a0 I2 = I(this.f2015j.t(i3));
            if (I2 != null && !I2.i() && F(I2) == i2) {
                if (!((ArrayList) this.f2015j.f1133d).contains(I2.f3338a)) {
                    return I2;
                }
                a0Var = I2;
            }
        }
        return a0Var;
    }

    public final int F(a0 a0Var) {
        if (a0Var.d(524) || !a0Var.f()) {
            return -1;
        }
        C0140b bVar = this.i;
        int i2 = a0Var.f3340c;
        ArrayList arrayList = (ArrayList) bVar.f3356c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0139a aVar = (C0139a) arrayList.get(i3);
            int i4 = aVar.f3333a;
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = aVar.f3334b;
                    if (i5 <= i2) {
                        int i6 = aVar.f3336d;
                        if (i5 + i6 > i2) {
                            return -1;
                        }
                        i2 -= i6;
                    } else {
                        continue;
                    }
                } else if (i4 == 8) {
                    int i7 = aVar.f3334b;
                    if (i7 == i2) {
                        i2 = aVar.f3336d;
                    } else {
                        if (i7 < i2) {
                            i2--;
                        }
                        if (aVar.f3336d <= i2) {
                            i2++;
                        }
                    }
                }
            } else if (aVar.f3334b <= i2) {
                i2 += aVar.f3336d;
            }
        }
        return i2;
    }

    public final long G(a0 a0Var) {
        if (this.f2028q.f3265b) {
            return a0Var.e;
        }
        return (long) a0Var.f3340c;
    }

    public final boolean K() {
        if (!this.f2042x || this.f1986F || this.i.j()) {
            return true;
        }
        return false;
    }

    public final boolean L() {
        if (this.f1988H > 0) {
            return true;
        }
        return false;
    }

    public final void M(int i2) {
        if (this.f2030r != null) {
            setScrollState(2);
            this.f2030r.n0(i2);
            awakenScrollBars();
        }
    }

    public final void N() {
        int u2 = this.f2015j.u();
        for (int i2 = 0; i2 < u2; i2++) {
            ((L) this.f2015j.t(i2).getLayoutParams()).f3292c = true;
        }
        ArrayList arrayList = this.f2010g.f3302c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            L l2 = (L) ((a0) arrayList.get(i3)).f3338a.getLayoutParams();
            if (l2 != null) {
                l2.f3292c = true;
            }
        }
    }

    public final void O(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int u2 = this.f2015j.u();
        for (int i5 = 0; i5 < u2; i5++) {
            a0 I2 = I(this.f2015j.t(i5));
            if (I2 != null && !I2.p()) {
                int i6 = I2.f3340c;
                X x2 = this.f2016j0;
                if (i6 >= i4) {
                    I2.m(-i3, z2);
                    x2.f3319f = true;
                } else if (i6 >= i2) {
                    I2.a(8);
                    I2.m(-i3, z2);
                    I2.f3340c = i2 - 1;
                    x2.f3319f = true;
                }
            }
        }
        Q q2 = this.f2010g;
        ArrayList arrayList = q2.f3302c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a0 a0Var = (a0) arrayList.get(size);
            if (a0Var != null) {
                int i7 = a0Var.f3340c;
                if (i7 >= i4) {
                    a0Var.m(-i3, z2);
                } else if (i7 >= i2) {
                    a0Var.a(8);
                    q2.e(size);
                }
            }
        }
        requestLayout();
    }

    public final void P() {
        this.f1988H++;
    }

    public final void S() {
        if (!this.f2027p0 && this.f2038v) {
            WeakHashMap weakHashMap = N.Q.f509a;
            postOnAnimation(this.f2043x0);
            this.f2027p0 = true;
        }
    }

    public final void T() {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (this.f1986F) {
            C0140b bVar = this.i;
            bVar.q((ArrayList) bVar.f3356c);
            bVar.q((ArrayList) bVar.f3357d);
            bVar.f3354a = 0;
            if (this.f1987G) {
                this.f2030r.X();
            }
        }
        if (this.f1994O == null || !this.f2030r.z0()) {
            this.i.d();
        } else {
            this.i.p();
        }
        if (this.m0 || this.f2023n0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!this.f2042x || this.f1994O == null || ((!(z4 = this.f1986F) && !z2 && !this.f2030r.f3281f) || (z4 && !this.f2028q.f3265b))) {
            z3 = false;
        } else {
            z3 = true;
        }
        X x2 = this.f2016j0;
        x2.f3322j = z3;
        if (z3 && z2 && !this.f1986F && this.f1994O != null && this.f2030r.z0()) {
            z5 = true;
        }
        x2.f3323k = z5;
    }

    public final void U(boolean z2) {
        this.f1987G = z2 | this.f1987G;
        this.f1986F = true;
        int u2 = this.f2015j.u();
        for (int i2 = 0; i2 < u2; i2++) {
            a0 I2 = I(this.f2015j.t(i2));
            if (I2 != null && !I2.p()) {
                I2.a(6);
            }
        }
        N();
        Q q2 = this.f2010g;
        ArrayList arrayList = q2.f3302c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            a0 a0Var = (a0) arrayList.get(i3);
            if (a0Var != null) {
                a0Var.a(6);
                a0Var.a(1024);
            }
        }
        C c2 = q2.f3306h.f2028q;
        if (c2 == null || !c2.f3265b) {
            q2.d();
        }
    }

    public final void V(a0 a0Var, C0017q qVar) {
        a0Var.f3345j &= -8193;
        boolean z2 = this.f2016j0.f3321h;
        j jVar = this.f2017k;
        if (z2 && a0Var.l() && !a0Var.i() && !a0Var.p()) {
            ((e) jVar.f109h).f(G(a0Var), a0Var);
        }
        r.k kVar = (r.k) jVar.f108g;
        k0 k0Var = (k0) kVar.getOrDefault(a0Var, (Object) null);
        if (k0Var == null) {
            k0Var = k0.a();
            kVar.put(a0Var, k0Var);
        }
        k0Var.f3432b = qVar;
        k0Var.f3431a |= 4;
    }

    public final void W(View view, View view2) {
        View view3;
        boolean z2;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f2022n;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof L) {
            L l2 = (L) layoutParams;
            if (!l2.f3292c) {
                int i2 = rect.left;
                Rect rect2 = l2.f3291b;
                rect.left = i2 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        K k2 = this.f2030r;
        boolean z3 = !this.f2042x;
        if (view2 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        k2.k0(this, view, this.f2022n, z3, z2);
    }

    public final void X() {
        VelocityTracker velocityTracker = this.f1997R;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        e0(0);
        EdgeEffect edgeEffect = this.f1990K;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.f1990K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1991L;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.f1991L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1992M;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.f1992M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1993N;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.f1993N.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = N.Q.f509a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Y(int r19, int r20, android.view.MotionEvent r21) {
        /*
            r18 = this;
            r8 = r18
            r9 = r19
            r10 = r20
            r18.m()
            j0.C r0 = r8.f2028q
            int[] r11 = r8.f2039v0
            r12 = 1
            r13 = 0
            if (r0 == 0) goto L_0x0027
            r11[r13] = r13
            r11[r12] = r13
            r8.Z(r9, r10, r11)
            r0 = r11[r13]
            r1 = r11[r12]
            int r2 = r9 - r0
            int r3 = r10 - r1
            r14 = r0
            r15 = r1
            r16 = r2
            r17 = r3
            goto L_0x002d
        L_0x0027:
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x002d:
            java.util.ArrayList r0 = r8.f2032s
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0038
            r18.invalidate()
        L_0x0038:
            r11[r13] = r13
            r11[r12] = r13
            int[] r5 = r8.f2035t0
            r6 = 0
            r0 = r18
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r7 = r11
            r0.s(r1, r2, r3, r4, r5, r6, r7)
            r0 = r11[r13]
            int r1 = r16 - r0
            r2 = r11[r12]
            int r3 = r17 - r2
            if (r0 != 0) goto L_0x005a
            if (r2 == 0) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            r0 = 0
            goto L_0x005b
        L_0x005a:
            r0 = 1
        L_0x005b:
            int r2 = r8.f2000U
            int[] r4 = r8.f2035t0
            r5 = r4[r13]
            int r2 = r2 - r5
            r8.f2000U = r2
            int r2 = r8.f2001V
            r4 = r4[r12]
            int r2 = r2 - r4
            r8.f2001V = r2
            int[] r2 = r8.f2037u0
            r6 = r2[r13]
            int r6 = r6 + r5
            r2[r13] = r6
            r5 = r2[r12]
            int r5 = r5 + r4
            r2[r12] = r5
            int r2 = r18.getOverScrollMode()
            r4 = 2
            if (r2 == r4) goto L_0x0118
            if (r21 == 0) goto L_0x0115
            int r2 = r21.getSource()
            r4 = 8194(0x2002, float:1.1482E-41)
            r2 = r2 & r4
            if (r2 != r4) goto L_0x008b
            goto L_0x0115
        L_0x008b:
            float r2 = r21.getX()
            float r1 = (float) r1
            float r4 = r21.getY()
            float r3 = (float) r3
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            int r7 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x00b5
            r18.v()
            android.widget.EdgeEffect r7 = r8.f1990K
            float r11 = -r1
            int r12 = r18.getWidth()
            float r12 = (float) r12
            float r11 = r11 / r12
            int r12 = r18.getHeight()
            float r12 = (float) r12
            float r4 = r4 / r12
            float r4 = r5 - r4
            T.d.a(r7, r11, r4)
        L_0x00b3:
            r4 = 1
            goto L_0x00d0
        L_0x00b5:
            int r7 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x00cf
            r18.w()
            android.widget.EdgeEffect r7 = r8.f1992M
            int r11 = r18.getWidth()
            float r11 = (float) r11
            float r11 = r1 / r11
            int r12 = r18.getHeight()
            float r12 = (float) r12
            float r4 = r4 / r12
            T.d.a(r7, r11, r4)
            goto L_0x00b3
        L_0x00cf:
            r4 = 0
        L_0x00d0:
            int r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x00eb
            r18.x()
            android.widget.EdgeEffect r4 = r8.f1991L
            float r5 = -r3
            int r7 = r18.getHeight()
            float r7 = (float) r7
            float r5 = r5 / r7
            int r7 = r18.getWidth()
            float r7 = (float) r7
            float r2 = r2 / r7
            T.d.a(r4, r5, r2)
        L_0x00e9:
            r4 = 1
            goto L_0x0106
        L_0x00eb:
            int r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x0106
            r18.u()
            android.widget.EdgeEffect r4 = r8.f1993N
            int r7 = r18.getHeight()
            float r7 = (float) r7
            float r7 = r3 / r7
            int r11 = r18.getWidth()
            float r11 = (float) r11
            float r2 = r2 / r11
            float r5 = r5 - r2
            T.d.a(r4, r7, r5)
            goto L_0x00e9
        L_0x0106:
            if (r4 != 0) goto L_0x0110
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0110
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x0115
        L_0x0110:
            java.util.WeakHashMap r1 = N.Q.f509a
            r18.postInvalidateOnAnimation()
        L_0x0115:
            r18.l(r19, r20)
        L_0x0118:
            if (r14 != 0) goto L_0x011c
            if (r15 == 0) goto L_0x011f
        L_0x011c:
            r8.t(r14, r15)
        L_0x011f:
            boolean r1 = r18.awakenScrollBars()
            if (r1 != 0) goto L_0x0128
            r18.invalidate()
        L_0x0128:
            if (r0 != 0) goto L_0x0131
            if (r14 != 0) goto L_0x0131
            if (r15 == 0) goto L_0x012f
            goto L_0x0131
        L_0x012f:
            r12 = 0
            goto L_0x0132
        L_0x0131:
            r12 = 1
        L_0x0132:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Y(int, int, android.view.MotionEvent):boolean");
    }

    public final void a0(int i2) {
        C0159v vVar;
        if (!this.f1981A) {
            setScrollState(0);
            Z z2 = this.f2011g0;
            z2.f3332g.removeCallbacks(z2);
            z2.f3329c.abortAnimation();
            K k2 = this.f2030r;
            if (!(k2 == null || (vVar = k2.e) == null)) {
                vVar.i();
            }
            K k3 = this.f2030r;
            if (k3 == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            k3.n0(i2);
            awakenScrollBars();
        }
    }

    public final void addFocusables(ArrayList arrayList, int i2, int i3) {
        K k2 = this.f2030r;
        if (k2 != null) {
            k2.getClass();
        }
        super.addFocusables(arrayList, i2, i3);
    }

    public final void b0(int i2, int i3, boolean z2) {
        K k2 = this.f2030r;
        if (k2 == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f1981A) {
            int i4 = 0;
            if (!k2.d()) {
                i2 = 0;
            }
            if (!this.f2030r.e()) {
                i3 = 0;
            }
            if (i2 != 0 || i3 != 0) {
                if (z2) {
                    if (i2 != 0) {
                        i4 = 1;
                    }
                    if (i3 != 0) {
                        i4 |= 2;
                    }
                    getScrollingChildHelper().g(i4, 1);
                }
                this.f2011g0.b(i2, i3, Integer.MIN_VALUE, (Interpolator) null);
            }
        }
    }

    public final void c0() {
        int i2 = this.f2044y + 1;
        this.f2044y = i2;
        if (i2 == 1 && !this.f1981A) {
            this.f2046z = false;
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof L) || !this.f2030r.f((L) layoutParams)) {
            return false;
        }
        return true;
    }

    public final int computeHorizontalScrollExtent() {
        K k2 = this.f2030r;
        if (k2 != null && k2.d()) {
            return this.f2030r.j(this.f2016j0);
        }
        return 0;
    }

    public final int computeHorizontalScrollOffset() {
        K k2 = this.f2030r;
        if (k2 != null && k2.d()) {
            return this.f2030r.k(this.f2016j0);
        }
        return 0;
    }

    public final int computeHorizontalScrollRange() {
        K k2 = this.f2030r;
        if (k2 != null && k2.d()) {
            return this.f2030r.l(this.f2016j0);
        }
        return 0;
    }

    public final int computeVerticalScrollExtent() {
        K k2 = this.f2030r;
        if (k2 != null && k2.e()) {
            return this.f2030r.m(this.f2016j0);
        }
        return 0;
    }

    public final int computeVerticalScrollOffset() {
        K k2 = this.f2030r;
        if (k2 != null && k2.e()) {
            return this.f2030r.n(this.f2016j0);
        }
        return 0;
    }

    public final int computeVerticalScrollRange() {
        K k2 = this.f2030r;
        if (k2 != null && k2.e()) {
            return this.f2030r.o(this.f2016j0);
        }
        return 0;
    }

    public final void d0(boolean z2) {
        if (this.f2044y < 1) {
            this.f2044y = 1;
        }
        if (!z2 && !this.f1981A) {
            this.f2046z = false;
        }
        if (this.f2044y == 1) {
            if (z2 && this.f2046z && !this.f1981A && this.f2030r != null && this.f2028q != null) {
                o();
            }
            if (!this.f1981A) {
                this.f2046z = false;
            }
        }
        this.f2044y--;
    }

    public final void f(a0 a0Var) {
        boolean z2;
        View view = a0Var.f3338a;
        if (view.getParent() == this) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f2010g.j(H(view));
        if (a0Var.k()) {
            this.f2015j.g(view, -1, view.getLayoutParams(), true);
        } else if (!z2) {
            this.f2015j.f(view, -1, true);
        } else {
            t tVar = this.f2015j;
            int indexOfChild = ((B) tVar.f1131b).f3263a.indexOfChild(view);
            if (indexOfChild >= 0) {
                ((C0141c) tVar.f1132c).h(indexOfChild);
                tVar.w(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x015f, code lost:
        if (r7 > 0) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x017d, code lost:
        if (r5 > 0) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0180, code lost:
        if (r7 < 0) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0183, code lost:
        if (r5 < 0) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x018c, code lost:
        if ((r5 * r6) < 0) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0195, code lost:
        if ((r5 * r6) > 0) goto L_0x00d7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            j0.K r3 = r0.f2030r
            r3.getClass()
            j0.C r3 = r0.f2028q
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0021
            j0.K r3 = r0.f2030r
            if (r3 == 0) goto L_0x0021
            boolean r3 = r16.L()
            if (r3 != 0) goto L_0x0021
            boolean r3 = r0.f1981A
            if (r3 != 0) goto L_0x0021
            r3 = 1
            goto L_0x0022
        L_0x0021:
            r3 = 0
        L_0x0022:
            android.view.FocusFinder r6 = android.view.FocusFinder.getInstance()
            j0.X r7 = r0.f2016j0
            j0.Q r8 = r0.f2010g
            r9 = 17
            r11 = 33
            r13 = 0
            r14 = 2
            if (r3 == 0) goto L_0x0095
            if (r2 == r14) goto L_0x0036
            if (r2 != r4) goto L_0x0095
        L_0x0036:
            j0.K r3 = r0.f2030r
            boolean r3 = r3.e()
            if (r3 == 0) goto L_0x004d
            if (r2 != r14) goto L_0x0043
            r3 = 130(0x82, float:1.82E-43)
            goto L_0x0045
        L_0x0043:
            r3 = 33
        L_0x0045:
            android.view.View r3 = r6.findNextFocus(r0, r1, r3)
            if (r3 != 0) goto L_0x004d
            r3 = 1
            goto L_0x004e
        L_0x004d:
            r3 = 0
        L_0x004e:
            if (r3 != 0) goto L_0x0079
            j0.K r15 = r0.f2030r
            boolean r15 = r15.d()
            if (r15 == 0) goto L_0x0079
            j0.K r3 = r0.f2030r
            int r3 = r3.C()
            if (r3 != r4) goto L_0x0062
            r3 = 1
            goto L_0x0063
        L_0x0062:
            r3 = 0
        L_0x0063:
            if (r2 != r14) goto L_0x0067
            r15 = 1
            goto L_0x0068
        L_0x0067:
            r15 = 0
        L_0x0068:
            r3 = r3 ^ r15
            if (r3 == 0) goto L_0x006e
            r3 = 66
            goto L_0x0070
        L_0x006e:
            r3 = 17
        L_0x0070:
            android.view.View r3 = r6.findNextFocus(r0, r1, r3)
            if (r3 != 0) goto L_0x0078
            r3 = 1
            goto L_0x0079
        L_0x0078:
            r3 = 0
        L_0x0079:
            if (r3 == 0) goto L_0x0090
            r16.m()
            android.view.View r3 = r16.A(r17)
            if (r3 != 0) goto L_0x0085
            return r13
        L_0x0085:
            r16.c0()
            j0.K r3 = r0.f2030r
            r3.S(r1, r2, r8, r7)
            r0.d0(r5)
        L_0x0090:
            android.view.View r3 = r6.findNextFocus(r0, r1, r2)
            goto L_0x00b5
        L_0x0095:
            android.view.View r6 = r6.findNextFocus(r0, r1, r2)
            if (r6 != 0) goto L_0x00b4
            if (r3 == 0) goto L_0x00b4
            r16.m()
            android.view.View r3 = r16.A(r17)
            if (r3 != 0) goto L_0x00a7
            return r13
        L_0x00a7:
            r16.c0()
            j0.K r3 = r0.f2030r
            android.view.View r3 = r3.S(r1, r2, r8, r7)
            r0.d0(r5)
            goto L_0x00b5
        L_0x00b4:
            r3 = r6
        L_0x00b5:
            if (r3 == 0) goto L_0x00cc
            boolean r6 = r3.hasFocusable()
            if (r6 != 0) goto L_0x00cc
            android.view.View r4 = r16.getFocusedChild()
            if (r4 != 0) goto L_0x00c8
            android.view.View r1 = super.focusSearch(r17, r18)
            return r1
        L_0x00c8:
            r0.W(r3, r13)
            return r1
        L_0x00cc:
            if (r3 == 0) goto L_0x00d7
            if (r3 != r0) goto L_0x00d1
            goto L_0x00d7
        L_0x00d1:
            android.view.View r6 = r0.A(r3)
            if (r6 != 0) goto L_0x00da
        L_0x00d7:
            r4 = 0
            goto L_0x0197
        L_0x00da:
            if (r1 != 0) goto L_0x00de
            goto L_0x0197
        L_0x00de:
            android.view.View r6 = r16.A(r17)
            if (r6 != 0) goto L_0x00e6
            goto L_0x0197
        L_0x00e6:
            int r6 = r17.getWidth()
            int r7 = r17.getHeight()
            android.graphics.Rect r8 = r0.f2022n
            r8.set(r5, r5, r6, r7)
            int r6 = r3.getWidth()
            int r7 = r3.getHeight()
            android.graphics.Rect r13 = r0.f2024o
            r13.set(r5, r5, r6, r7)
            r0.offsetDescendantRectToMyCoords(r1, r8)
            r0.offsetDescendantRectToMyCoords(r3, r13)
            j0.K r6 = r0.f2030r
            int r6 = r6.C()
            if (r6 != r4) goto L_0x0110
            r6 = -1
            goto L_0x0111
        L_0x0110:
            r6 = 1
        L_0x0111:
            int r15 = r8.left
            int r5 = r13.left
            if (r15 < r5) goto L_0x011b
            int r7 = r8.right
            if (r7 > r5) goto L_0x0123
        L_0x011b:
            int r7 = r8.right
            int r12 = r13.right
            if (r7 >= r12) goto L_0x0123
            r5 = 1
            goto L_0x0130
        L_0x0123:
            int r7 = r8.right
            int r12 = r13.right
            if (r7 > r12) goto L_0x012b
            if (r15 < r12) goto L_0x012f
        L_0x012b:
            if (r15 <= r5) goto L_0x012f
            r5 = -1
            goto L_0x0130
        L_0x012f:
            r5 = 0
        L_0x0130:
            int r7 = r8.top
            int r12 = r13.top
            if (r7 < r12) goto L_0x013a
            int r15 = r8.bottom
            if (r15 > r12) goto L_0x0142
        L_0x013a:
            int r15 = r8.bottom
            int r10 = r13.bottom
            if (r15 >= r10) goto L_0x0142
            r7 = 1
            goto L_0x014f
        L_0x0142:
            int r8 = r8.bottom
            int r10 = r13.bottom
            if (r8 > r10) goto L_0x014a
            if (r7 < r10) goto L_0x014e
        L_0x014a:
            if (r7 <= r12) goto L_0x014e
            r7 = -1
            goto L_0x014f
        L_0x014e:
            r7 = 0
        L_0x014f:
            if (r2 == r4) goto L_0x018f
            if (r2 == r14) goto L_0x0186
            if (r2 == r9) goto L_0x0183
            if (r2 == r11) goto L_0x0180
            r6 = 66
            if (r2 == r6) goto L_0x017d
            r6 = 130(0x82, float:1.82E-43)
            if (r2 != r6) goto L_0x0162
            if (r7 <= 0) goto L_0x00d7
            goto L_0x0197
        L_0x0162:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid direction: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r16.y()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x017d:
            if (r5 <= 0) goto L_0x00d7
            goto L_0x0197
        L_0x0180:
            if (r7 >= 0) goto L_0x00d7
            goto L_0x0197
        L_0x0183:
            if (r5 >= 0) goto L_0x00d7
            goto L_0x0197
        L_0x0186:
            if (r7 > 0) goto L_0x0197
            if (r7 != 0) goto L_0x00d7
            int r5 = r5 * r6
            if (r5 < 0) goto L_0x00d7
            goto L_0x0197
        L_0x018f:
            if (r7 < 0) goto L_0x0197
            if (r7 != 0) goto L_0x00d7
            int r5 = r5 * r6
            if (r5 > 0) goto L_0x00d7
        L_0x0197:
            if (r4 == 0) goto L_0x019a
            goto L_0x019e
        L_0x019a:
            android.view.View r3 = super.focusSearch(r17, r18)
        L_0x019e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(H h2) {
        K k2 = this.f2030r;
        if (k2 != null) {
            k2.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f2032s;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(h2);
        N();
        requestLayout();
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        K k2 = this.f2030r;
        if (k2 != null) {
            return k2.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public C getAdapter() {
        return this.f2028q;
    }

    public int getBaseline() {
        K k2 = this.f2030r;
        if (k2 == null) {
            return super.getBaseline();
        }
        k2.getClass();
        return -1;
    }

    public boolean getClipToPadding() {
        return this.f2019l;
    }

    public c0 getCompatAccessibilityDelegate() {
        return this.f2029q0;
    }

    public F getEdgeEffectFactory() {
        return this.f1989J;
    }

    public G getItemAnimator() {
        return this.f1994O;
    }

    public int getItemDecorationCount() {
        return this.f2032s.size();
    }

    public K getLayoutManager() {
        return this.f2030r;
    }

    public int getMaxFlingVelocity() {
        return this.f2005c0;
    }

    public int getMinFlingVelocity() {
        return this.f2004b0;
    }

    public long getNanoTime() {
        if (f1977C0) {
            return System.nanoTime();
        }
        return 0;
    }

    public M getOnFlingListener() {
        return this.f2003a0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2009f0;
    }

    public P getRecycledViewPool() {
        return this.f2010g.c();
    }

    public int getScrollState() {
        return this.f1995P;
    }

    public final void h(N n2) {
        if (this.f2020l0 == null) {
            this.f2020l0 = new ArrayList();
        }
        this.f2020l0.add(n2);
    }

    public final boolean isAttachedToWindow() {
        return this.f2038v;
    }

    public final boolean isLayoutSuppressed() {
        return this.f1981A;
    }

    public final void k() {
        int u2 = this.f2015j.u();
        for (int i2 = 0; i2 < u2; i2++) {
            a0 I2 = I(this.f2015j.t(i2));
            if (!I2.p()) {
                I2.f3341d = -1;
                I2.f3343g = -1;
            }
        }
        Q q2 = this.f2010g;
        ArrayList arrayList = q2.f3302c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            a0 a0Var = (a0) arrayList.get(i3);
            a0Var.f3341d = -1;
            a0Var.f3343g = -1;
        }
        ArrayList arrayList2 = q2.f3300a;
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            a0 a0Var2 = (a0) arrayList2.get(i4);
            a0Var2.f3341d = -1;
            a0Var2.f3343g = -1;
        }
        ArrayList arrayList3 = q2.f3301b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                a0 a0Var3 = (a0) q2.f3301b.get(i5);
                a0Var3.f3341d = -1;
                a0Var3.f3343g = -1;
            }
        }
    }

    public final void l(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.f1990K;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.f1990K.onRelease();
            z2 = this.f1990K.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1992M;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.f1992M.onRelease();
            z2 |= this.f1992M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1991L;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.f1991L.onRelease();
            z2 |= this.f1991L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1993N;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.f1993N.onRelease();
            z2 |= this.f1993N.isFinished();
        }
        if (z2) {
            WeakHashMap weakHashMap = N.Q.f509a;
            postInvalidateOnAnimation();
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (this.f2030r != null && !this.f1981A && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                if (this.f2030r.e()) {
                    f3 = -motionEvent.getAxisValue(9);
                } else {
                    f3 = 0.0f;
                }
                if (this.f2030r.d()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (!(f3 == 0.0f && f2 == 0.0f)) {
                        Y((int) (f2 * this.f2006d0), (int) (f3 * this.f2007e0), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f2030r.e()) {
                        f3 = -axisValue;
                    } else if (this.f2030r.d()) {
                        f2 = axisValue;
                        f3 = 0.0f;
                        Y((int) (f2 * this.f2006d0), (int) (f3 * this.f2007e0), motionEvent);
                    }
                }
                f3 = 0.0f;
            }
            f2 = 0.0f;
            Y((int) (f2 * this.f2006d0), (int) (f3 * this.f2007e0), motionEvent);
        }
        return false;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.f1981A) {
            return false;
        }
        this.f2036u = null;
        if (B(motionEvent)) {
            X();
            setScrollState(0);
            return true;
        }
        K k2 = this.f2030r;
        if (k2 == null) {
            return false;
        }
        boolean d2 = k2.d();
        boolean e = this.f2030r.e();
        if (this.f1997R == null) {
            this.f1997R = VelocityTracker.obtain();
        }
        this.f1997R.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f1982B) {
                this.f1982B = false;
            }
            this.f1996Q = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.f2000U = x2;
            this.f1998S = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.f2001V = y2;
            this.f1999T = y2;
            if (this.f1995P == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                e0(1);
            }
            int[] iArr = this.f2037u0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (e) {
                d2 |= true;
            }
            getScrollingChildHelper().g(d2 ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.f1997R.clear();
            e0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f1996Q);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1996Q + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f1995P != 1) {
                int i2 = x3 - this.f1998S;
                int i3 = y3 - this.f1999T;
                if (!d2 || Math.abs(i2) <= this.f2002W) {
                    z2 = false;
                } else {
                    this.f2000U = x3;
                    z2 = true;
                }
                if (e && Math.abs(i3) > this.f2002W) {
                    this.f2001V = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            X();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f1996Q = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f2000U = x4;
            this.f1998S = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f2001V = y4;
            this.f1999T = y4;
        } else if (actionMasked == 6) {
            R(motionEvent);
        }
        if (this.f1995P == 1) {
            return true;
        }
        return false;
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = k.f299a;
        Trace.beginSection("RV OnLayout");
        o();
        Trace.endSection();
        this.f2042x = true;
    }

    public final void onMeasure(int i2, int i3) {
        K k2 = this.f2030r;
        if (k2 == null) {
            n(i2, i3);
            return;
        }
        boolean L2 = k2.L();
        X x2 = this.f2016j0;
        if (L2) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.f2030r.f3278b.n(i2, i3);
            if ((mode != 1073741824 || mode2 != 1073741824) && this.f2028q != null) {
                if (x2.f3318d == 1) {
                    p();
                }
                this.f2030r.q0(i2, i3);
                x2.i = true;
                q();
                this.f2030r.s0(i2, i3);
                if (this.f2030r.v0()) {
                    this.f2030r.q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    x2.i = true;
                    q();
                    this.f2030r.s0(i2, i3);
                }
            }
        } else if (this.f2040w) {
            this.f2030r.f3278b.n(i2, i3);
        } else {
            if (this.f1984D) {
                c0();
                P();
                T();
                Q(true);
                if (x2.f3323k) {
                    x2.f3320g = true;
                } else {
                    this.i.d();
                    x2.f3320g = false;
                }
                this.f1984D = false;
                d0(false);
            } else if (x2.f3323k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C c2 = this.f2028q;
            if (c2 != null) {
                x2.e = c2.a();
            } else {
                x2.e = 0;
            }
            c0();
            this.f2030r.f3278b.n(i2, i3);
            d0(false);
            x2.f3320g = false;
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof U)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        U u2 = (U) parcelable;
        this.f2012h = u2;
        super.onRestoreInstanceState(u2.f940a);
        K k2 = this.f2030r;
        if (k2 != null && (parcelable2 = this.f2012h.f3308c) != null) {
            k2.d0(parcelable2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.os.Parcelable, U.b, j0.U] */
    public final Parcelable onSaveInstanceState() {
        ? bVar = new b(super.onSaveInstanceState());
        U u2 = this.f2012h;
        if (u2 != null) {
            bVar.f3308c = u2.f3308c;
        } else {
            K k2 = this.f2030r;
            if (k2 != null) {
                bVar.f3308c = k2.e0();
            } else {
                bVar.f3308c = null;
            }
        }
        return bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:235:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x041f  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0473  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0213  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            r23 = this;
            r6 = r23
            r7 = r24
            boolean r0 = r6.f1981A
            r8 = 0
            if (r0 != 0) goto L_0x000d
            boolean r0 = r6.f1982B
            if (r0 == 0) goto L_0x0011
        L_0x000d:
            r0 = r6
            r2 = 0
            goto L_0x04b6
        L_0x0011:
            j0.m r0 = r6.f2036u
            r9 = 1
            r1 = 2
            r2 = 0
            r3 = 3
            r4 = 0
            if (r0 != 0) goto L_0x0029
            int r0 = r24.getAction()
            if (r0 != 0) goto L_0x0023
            r0 = 0
            goto L_0x0130
        L_0x0023:
            boolean r0 = r23.B(r24)
            goto L_0x0130
        L_0x0029:
            int r5 = r0.f3459v
            if (r5 != 0) goto L_0x002f
            goto L_0x0125
        L_0x002f:
            int r5 = r24.getAction()
            if (r5 != 0) goto L_0x006f
            float r5 = r24.getX()
            float r10 = r24.getY()
            boolean r5 = r0.e(r5, r10)
            float r10 = r24.getX()
            float r11 = r24.getY()
            boolean r10 = r0.d(r10, r11)
            if (r5 != 0) goto L_0x0051
            if (r10 == 0) goto L_0x0125
        L_0x0051:
            if (r10 == 0) goto L_0x005e
            r0.f3460w = r9
            float r5 = r24.getX()
            int r5 = (int) r5
            float r5 = (float) r5
            r0.f3453p = r5
            goto L_0x006a
        L_0x005e:
            if (r5 == 0) goto L_0x006a
            r0.f3460w = r1
            float r5 = r24.getY()
            int r5 = (int) r5
            float r5 = (float) r5
            r0.f3450m = r5
        L_0x006a:
            r0.g(r1)
            goto L_0x0125
        L_0x006f:
            int r5 = r24.getAction()
            if (r5 != r9) goto L_0x0084
            int r5 = r0.f3459v
            if (r5 != r1) goto L_0x0084
            r0.f3450m = r4
            r0.f3453p = r4
            r0.g(r9)
            r0.f3460w = r8
            goto L_0x0125
        L_0x0084:
            int r5 = r24.getAction()
            if (r5 != r1) goto L_0x0125
            int r5 = r0.f3459v
            if (r5 != r1) goto L_0x0125
            r0.h()
            int r5 = r0.f3460w
            r10 = 1073741824(0x40000000, float:2.0)
            int r11 = r0.f3441b
            if (r5 != r9) goto L_0x00dd
            float r5 = r24.getX()
            int[] r14 = r0.f3462y
            r14[r8] = r11
            int r12 = r0.f3454q
            int r12 = r12 - r11
            r14[r9] = r12
            float r13 = (float) r11
            float r12 = (float) r12
            float r5 = java.lang.Math.min(r12, r5)
            float r5 = java.lang.Math.max(r13, r5)
            int r12 = r0.f3452o
            float r12 = (float) r12
            float r12 = r12 - r5
            float r12 = java.lang.Math.abs(r12)
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x00bd
            goto L_0x00dd
        L_0x00bd:
            float r12 = r0.f3453p
            androidx.recyclerview.widget.RecyclerView r13 = r0.f3456s
            int r15 = r13.computeHorizontalScrollRange()
            androidx.recyclerview.widget.RecyclerView r13 = r0.f3456s
            int r16 = r13.computeHorizontalScrollOffset()
            int r13 = r0.f3454q
            r17 = r13
            r13 = r5
            int r12 = j0.C0151m.f(r12, r13, r14, r15, r16, r17)
            if (r12 == 0) goto L_0x00db
            androidx.recyclerview.widget.RecyclerView r13 = r0.f3456s
            r13.scrollBy(r12, r8)
        L_0x00db:
            r0.f3453p = r5
        L_0x00dd:
            int r5 = r0.f3460w
            if (r5 != r1) goto L_0x0125
            float r5 = r24.getY()
            int[] r14 = r0.f3461x
            r14[r8] = r11
            int r12 = r0.f3455r
            int r12 = r12 - r11
            r14[r9] = r12
            float r11 = (float) r11
            float r12 = (float) r12
            float r5 = java.lang.Math.min(r12, r5)
            float r5 = java.lang.Math.max(r11, r5)
            int r11 = r0.f3449l
            float r11 = (float) r11
            float r11 = r11 - r5
            float r11 = java.lang.Math.abs(r11)
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x0105
            goto L_0x0125
        L_0x0105:
            float r12 = r0.f3450m
            androidx.recyclerview.widget.RecyclerView r10 = r0.f3456s
            int r15 = r10.computeVerticalScrollRange()
            androidx.recyclerview.widget.RecyclerView r10 = r0.f3456s
            int r16 = r10.computeVerticalScrollOffset()
            int r10 = r0.f3455r
            r13 = r5
            r17 = r10
            int r10 = j0.C0151m.f(r12, r13, r14, r15, r16, r17)
            if (r10 == 0) goto L_0x0123
            androidx.recyclerview.widget.RecyclerView r11 = r0.f3456s
            r11.scrollBy(r8, r10)
        L_0x0123:
            r0.f3450m = r5
        L_0x0125:
            int r0 = r24.getAction()
            if (r0 == r3) goto L_0x012d
            if (r0 != r9) goto L_0x012f
        L_0x012d:
            r6.f2036u = r2
        L_0x012f:
            r0 = 1
        L_0x0130:
            if (r0 == 0) goto L_0x0139
            r23.X()
            r6.setScrollState(r8)
            return r9
        L_0x0139:
            j0.K r0 = r6.f2030r
            if (r0 != 0) goto L_0x013e
            return r8
        L_0x013e:
            boolean r10 = r0.d()
            j0.K r0 = r6.f2030r
            boolean r11 = r0.e()
            android.view.VelocityTracker r0 = r6.f1997R
            if (r0 != 0) goto L_0x0152
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f1997R = r0
        L_0x0152:
            int r0 = r24.getActionMasked()
            int r5 = r24.getActionIndex()
            int[] r12 = r6.f2037u0
            if (r0 != 0) goto L_0x0162
            r12[r9] = r8
            r12[r8] = r8
        L_0x0162:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r24)
            r14 = r12[r8]
            float r14 = (float) r14
            r15 = r12[r9]
            float r15 = (float) r15
            r13.offsetLocation(r14, r15)
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x0480
            java.lang.String r15 = "RecyclerView"
            if (r0 == r9) goto L_0x0290
            if (r0 == r1) goto L_0x01ac
            if (r0 == r3) goto L_0x01a5
            r1 = 5
            if (r0 == r1) goto L_0x018a
            r1 = 6
            if (r0 == r1) goto L_0x0186
        L_0x0181:
            r0 = r6
            r21 = r13
            goto L_0x04aa
        L_0x0186:
            r23.R(r24)
            goto L_0x0181
        L_0x018a:
            int r0 = r7.getPointerId(r5)
            r6.f1996Q = r0
            float r0 = r7.getX(r5)
            float r0 = r0 + r14
            int r0 = (int) r0
            r6.f2000U = r0
            r6.f1998S = r0
            float r0 = r7.getY(r5)
            float r0 = r0 + r14
            int r0 = (int) r0
            r6.f2001V = r0
            r6.f1999T = r0
            goto L_0x0181
        L_0x01a5:
            r23.X()
            r6.setScrollState(r8)
            goto L_0x0181
        L_0x01ac:
            int r0 = r6.f1996Q
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x01cd
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.<init>(r1)
            int r1 = r6.f1996Q
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r15, r0)
            return r8
        L_0x01cd:
            float r1 = r7.getX(r0)
            float r1 = r1 + r14
            int r15 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r14
            int r14 = (int) r0
            int r0 = r6.f2000U
            int r0 = r0 - r15
            int r1 = r6.f2001V
            int r1 = r1 - r14
            int r2 = r6.f1995P
            if (r2 == r9) goto L_0x0216
            if (r10 == 0) goto L_0x01fa
            if (r0 <= 0) goto L_0x01ef
            int r2 = r6.f2002W
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x01f6
        L_0x01ef:
            int r2 = r6.f2002W
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x01f6:
            if (r0 == 0) goto L_0x01fa
            r2 = 1
            goto L_0x01fb
        L_0x01fa:
            r2 = 0
        L_0x01fb:
            if (r11 == 0) goto L_0x0211
            if (r1 <= 0) goto L_0x0207
            int r3 = r6.f2002W
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x020e
        L_0x0207:
            int r3 = r6.f2002W
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x020e:
            if (r1 == 0) goto L_0x0211
            r2 = 1
        L_0x0211:
            if (r2 == 0) goto L_0x0216
            r6.setScrollState(r9)
        L_0x0216:
            r16 = r0
            r17 = r1
            int r0 = r6.f1995P
            if (r0 != r9) goto L_0x0181
            int[] r5 = r6.f2039v0
            r5[r8] = r8
            r5[r9] = r8
            if (r10 == 0) goto L_0x0229
            r1 = r16
            goto L_0x022a
        L_0x0229:
            r1 = 0
        L_0x022a:
            if (r11 == 0) goto L_0x022f
            r2 = r17
            goto L_0x0230
        L_0x022f:
            r2 = 0
        L_0x0230:
            int[] r4 = r6.f2035t0
            r18 = 0
            r0 = r23
            r3 = r5
            r19 = r5
            r5 = r18
            boolean r0 = r0.r(r1, r2, r3, r4, r5)
            int[] r1 = r6.f2035t0
            if (r0 == 0) goto L_0x0260
            r0 = r19[r8]
            int r16 = r16 - r0
            r0 = r19[r9]
            int r17 = r17 - r0
            r0 = r12[r8]
            r2 = r1[r8]
            int r0 = r0 + r2
            r12[r8] = r0
            r0 = r12[r9]
            r2 = r1[r9]
            int r0 = r0 + r2
            r12[r9] = r0
            android.view.ViewParent r0 = r23.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x0260:
            r0 = r16
            r2 = r17
            r3 = r1[r8]
            int r15 = r15 - r3
            r6.f2000U = r15
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.f2001V = r14
            if (r10 == 0) goto L_0x0272
            r1 = r0
            goto L_0x0273
        L_0x0272:
            r1 = 0
        L_0x0273:
            if (r11 == 0) goto L_0x0276
            r8 = r2
        L_0x0276:
            boolean r1 = r6.Y(r1, r8, r7)
            if (r1 == 0) goto L_0x0283
            android.view.ViewParent r1 = r23.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0283:
            j0.p r1 = r6.f2013h0
            if (r1 == 0) goto L_0x0181
            if (r0 != 0) goto L_0x028b
            if (r2 == 0) goto L_0x0181
        L_0x028b:
            r1.a(r6, r0, r2)
            goto L_0x0181
        L_0x0290:
            android.view.VelocityTracker r0 = r6.f1997R
            r0.addMovement(r13)
            android.view.VelocityTracker r0 = r6.f1997R
            int r3 = r6.f2005c0
            float r5 = (float) r3
            r7 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r7, r5)
            if (r10 == 0) goto L_0x02ab
            android.view.VelocityTracker r0 = r6.f1997R
            int r5 = r6.f1996Q
            float r0 = r0.getXVelocity(r5)
            float r0 = -r0
            goto L_0x02ac
        L_0x02ab:
            r0 = 0
        L_0x02ac:
            if (r11 == 0) goto L_0x02b8
            android.view.VelocityTracker r5 = r6.f1997R
            int r7 = r6.f1996Q
            float r5 = r5.getYVelocity(r7)
            float r5 = -r5
            goto L_0x02b9
        L_0x02b8:
            r5 = 0
        L_0x02b9:
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x02c8
            int r7 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x02c2
            goto L_0x02c8
        L_0x02c2:
            r0 = r6
            r21 = r13
        L_0x02c5:
            r1 = 0
            goto L_0x0477
        L_0x02c8:
            int r0 = (int) r0
            int r5 = (int) r5
            j0.K r7 = r6.f2030r
            if (r7 != 0) goto L_0x02d4
            java.lang.String r0 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r15, r0)
            goto L_0x02c2
        L_0x02d4:
            boolean r10 = r6.f1981A
            if (r10 == 0) goto L_0x02d9
        L_0x02d8:
            goto L_0x02c2
        L_0x02d9:
            boolean r7 = r7.d()
            j0.K r10 = r6.f2030r
            boolean r10 = r10.e()
            int r11 = r6.f2004b0
            if (r7 == 0) goto L_0x02ed
            int r12 = java.lang.Math.abs(r0)
            if (r12 >= r11) goto L_0x02ee
        L_0x02ed:
            r0 = 0
        L_0x02ee:
            if (r10 == 0) goto L_0x02f6
            int r12 = java.lang.Math.abs(r5)
            if (r12 >= r11) goto L_0x02f7
        L_0x02f6:
            r5 = 0
        L_0x02f7:
            if (r0 != 0) goto L_0x02fc
            if (r5 != 0) goto L_0x02fc
            goto L_0x02d8
        L_0x02fc:
            float r11 = (float) r0
            float r12 = (float) r5
            boolean r14 = r6.dispatchNestedPreFling(r11, r12)
            if (r14 != 0) goto L_0x02c2
            if (r7 != 0) goto L_0x030b
            if (r10 == 0) goto L_0x0309
            goto L_0x030b
        L_0x0309:
            r14 = 0
            goto L_0x030c
        L_0x030b:
            r14 = 1
        L_0x030c:
            r6.dispatchNestedFling(r11, r12, r14)
            j0.M r11 = r6.f2003a0
            if (r11 == 0) goto L_0x041b
            j0.z r11 = (j0.C0163z) r11
            androidx.recyclerview.widget.RecyclerView r12 = r11.f3520a
            j0.K r12 = r12.getLayoutManager()
            if (r12 != 0) goto L_0x031f
            goto L_0x041b
        L_0x031f:
            androidx.recyclerview.widget.RecyclerView r15 = r11.f3520a
            j0.C r15 = r15.getAdapter()
            if (r15 != 0) goto L_0x0329
            goto L_0x041b
        L_0x0329:
            androidx.recyclerview.widget.RecyclerView r15 = r11.f3520a
            int r15 = r15.getMinFlingVelocity()
            int r2 = java.lang.Math.abs(r5)
            if (r2 > r15) goto L_0x033b
            int r2 = java.lang.Math.abs(r0)
            if (r2 <= r15) goto L_0x041b
        L_0x033b:
            boolean r2 = r12 instanceof j0.W
            if (r2 != 0) goto L_0x0341
            goto L_0x041b
        L_0x0341:
            if (r2 != 0) goto L_0x0345
            r15 = 0
            goto L_0x0351
        L_0x0345:
            j0.y r15 = new j0.y
            androidx.recyclerview.widget.RecyclerView r8 = r11.f3520a
            android.content.Context r8 = r8.getContext()
            r1 = 0
            r15.<init>(r11, r8, r1)
        L_0x0351:
            if (r15 != 0) goto L_0x0355
            goto L_0x041b
        L_0x0355:
            int r1 = r12.B()
            if (r1 != 0) goto L_0x0361
        L_0x035b:
            r21 = r13
        L_0x035d:
            r1 = -1
        L_0x035e:
            r2 = -1
            goto L_0x0410
        L_0x0361:
            boolean r19 = r12.e()
            if (r19 == 0) goto L_0x036c
            androidx.emoji2.text.g r11 = r11.e(r12)
            goto L_0x0378
        L_0x036c:
            boolean r19 = r12.d()
            if (r19 == 0) goto L_0x0377
            androidx.emoji2.text.g r11 = r11.d(r12)
            goto L_0x0378
        L_0x0377:
            r11 = 0
        L_0x0378:
            if (r11 != 0) goto L_0x037b
            goto L_0x035b
        L_0x037b:
            int r8 = r12.v()
            r19 = -2147483648(0xffffffff80000000, float:-0.0)
            r20 = 2147483647(0x7fffffff, float:NaN)
            r21 = r13
            r4 = 0
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r13 = 2147483647(0x7fffffff, float:NaN)
            r16 = 0
            r19 = 0
        L_0x0390:
            if (r4 >= r8) goto L_0x03b4
            r22 = r8
            android.view.View r8 = r12.u(r4)
            if (r8 != 0) goto L_0x039b
            goto L_0x03ad
        L_0x039b:
            int r6 = j0.C0163z.b(r8, r11)
            if (r6 > 0) goto L_0x03a6
            if (r6 <= r9) goto L_0x03a6
            r9 = r6
            r19 = r8
        L_0x03a6:
            if (r6 < 0) goto L_0x03ad
            if (r6 >= r13) goto L_0x03ad
            r13 = r6
            r16 = r8
        L_0x03ad:
            int r4 = r4 + 1
            r6 = r23
            r8 = r22
            goto L_0x0390
        L_0x03b4:
            boolean r4 = r12.d()
            if (r4 == 0) goto L_0x03c0
            if (r0 <= 0) goto L_0x03be
        L_0x03bc:
            r4 = 1
            goto L_0x03c3
        L_0x03be:
            r4 = 0
            goto L_0x03c3
        L_0x03c0:
            if (r5 <= 0) goto L_0x03be
            goto L_0x03bc
        L_0x03c3:
            if (r4 == 0) goto L_0x03cc
            if (r16 == 0) goto L_0x03cc
            int r1 = j0.K.H(r16)
            goto L_0x035e
        L_0x03cc:
            if (r4 != 0) goto L_0x03d5
            if (r19 == 0) goto L_0x03d5
            int r1 = j0.K.H(r19)
            goto L_0x035e
        L_0x03d5:
            if (r4 == 0) goto L_0x03d9
            r16 = r19
        L_0x03d9:
            if (r16 != 0) goto L_0x03dc
            goto L_0x035d
        L_0x03dc:
            int r6 = j0.K.H(r16)
            int r8 = r12.B()
            if (r2 == 0) goto L_0x0400
            r2 = r12
            j0.W r2 = (j0.W) r2
            r9 = 1
            int r8 = r8 - r9
            android.graphics.PointF r2 = r2.a(r8)
            if (r2 == 0) goto L_0x0400
            float r8 = r2.x
            r9 = 0
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 < 0) goto L_0x03fe
            float r2 = r2.y
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x0400
        L_0x03fe:
            r2 = 1
            goto L_0x0401
        L_0x0400:
            r2 = 0
        L_0x0401:
            if (r2 != r4) goto L_0x0405
            r2 = -1
            goto L_0x0406
        L_0x0405:
            r2 = 1
        L_0x0406:
            int r2 = r2 + r6
            if (r2 < 0) goto L_0x035d
            if (r2 < r1) goto L_0x040d
            goto L_0x035d
        L_0x040d:
            r1 = r2
            goto L_0x035e
        L_0x0410:
            if (r1 != r2) goto L_0x0413
            goto L_0x041d
        L_0x0413:
            r15.f3502a = r1
            r12.y0(r15)
            r0 = r23
            goto L_0x047a
        L_0x041b:
            r21 = r13
        L_0x041d:
            if (r14 == 0) goto L_0x0473
            if (r10 == 0) goto L_0x0423
            r7 = r7 | 2
        L_0x0423:
            N.n r1 = r23.getScrollingChildHelper()
            r2 = 1
            r1.g(r7, r2)
            int r1 = -r3
            int r0 = java.lang.Math.min(r0, r3)
            int r9 = java.lang.Math.max(r1, r0)
            int r0 = java.lang.Math.min(r5, r3)
            int r10 = java.lang.Math.max(r1, r0)
            r0 = r23
            j0.Z r1 = r0.f2011g0
            androidx.recyclerview.widget.RecyclerView r2 = r1.f3332g
            r3 = 2
            r2.setScrollState(r3)
            r3 = 0
            r1.f3328b = r3
            r1.f3327a = r3
            android.view.animation.Interpolator r3 = r1.f3330d
            V.d r4 = f1979E0
            if (r3 == r4) goto L_0x045e
            r1.f3330d = r4
            android.widget.OverScroller r3 = new android.widget.OverScroller
            android.content.Context r2 = r2.getContext()
            r3.<init>(r2, r4)
            r1.f3329c = r3
        L_0x045e:
            android.widget.OverScroller r6 = r1.f3329c
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 2147483647(0x7fffffff, float:NaN)
            r7 = 0
            r8 = 0
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r14 = 2147483647(0x7fffffff, float:NaN)
            r6.fling(r7, r8, r9, r10, r11, r12, r13, r14)
            r1.a()
            goto L_0x047a
        L_0x0473:
            r0 = r23
            goto L_0x02c5
        L_0x0477:
            r0.setScrollState(r1)
        L_0x047a:
            r23.X()
            r2 = r21
            goto L_0x04b1
        L_0x0480:
            r0 = r6
            r21 = r13
            r1 = 0
            int r2 = r7.getPointerId(r1)
            r0.f1996Q = r2
            float r1 = r24.getX()
            float r1 = r1 + r14
            int r1 = (int) r1
            r0.f2000U = r1
            r0.f1998S = r1
            float r1 = r24.getY()
            float r1 = r1 + r14
            int r1 = (int) r1
            r0.f2001V = r1
            r0.f1999T = r1
            if (r11 == 0) goto L_0x04a2
            r10 = r10 | 2
        L_0x04a2:
            N.n r1 = r23.getScrollingChildHelper()
            r2 = 0
            r1.g(r10, r2)
        L_0x04aa:
            android.view.VelocityTracker r1 = r0.f1997R
            r2 = r21
            r1.addMovement(r2)
        L_0x04b1:
            r2.recycle()
            r1 = 1
            return r1
        L_0x04b6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [N.q, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v6, types: [N.q, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p() {
        /*
            r12 = this;
            j0.X r0 = r12.f2016j0
            r1 = 1
            r0.a(r1)
            r12.z(r0)
            r2 = 0
            r0.i = r2
            r12.c0()
            E.j r3 = r12.f2017k
            java.lang.Object r4 = r3.f108g
            r.k r4 = (r.k) r4
            r4.clear()
            java.lang.Object r4 = r3.f109h
            r.e r4 = (r.e) r4
            r4.b()
            r12.P()
            r12.T()
            boolean r5 = r12.f2009f0
            r6 = 0
            if (r5 == 0) goto L_0x0039
            boolean r5 = r12.hasFocus()
            if (r5 == 0) goto L_0x0039
            j0.C r5 = r12.f2028q
            if (r5 == 0) goto L_0x0039
            android.view.View r5 = r12.getFocusedChild()
            goto L_0x003a
        L_0x0039:
            r5 = r6
        L_0x003a:
            if (r5 != 0) goto L_0x003e
        L_0x003c:
            r5 = r6
            goto L_0x0049
        L_0x003e:
            android.view.View r5 = r12.A(r5)
            if (r5 != 0) goto L_0x0045
            goto L_0x003c
        L_0x0045:
            j0.a0 r5 = r12.H(r5)
        L_0x0049:
            r7 = -1
            r9 = -1
            if (r5 != 0) goto L_0x0055
            r0.f3325m = r7
            r0.f3324l = r9
            r0.f3326n = r9
            goto L_0x00a2
        L_0x0055:
            j0.C r10 = r12.f2028q
            boolean r10 = r10.f3265b
            if (r10 == 0) goto L_0x005d
            long r7 = r5.e
        L_0x005d:
            r0.f3325m = r7
            boolean r7 = r12.f1986F
            if (r7 == 0) goto L_0x0065
        L_0x0063:
            r7 = -1
            goto L_0x0077
        L_0x0065:
            boolean r7 = r5.i()
            if (r7 == 0) goto L_0x006e
            int r7 = r5.f3341d
            goto L_0x0077
        L_0x006e:
            androidx.recyclerview.widget.RecyclerView r7 = r5.f3353r
            if (r7 != 0) goto L_0x0073
            goto L_0x0063
        L_0x0073:
            int r7 = r7.F(r5)
        L_0x0077:
            r0.f3324l = r7
            android.view.View r5 = r5.f3338a
            int r7 = r5.getId()
        L_0x007f:
            boolean r8 = r5.isFocused()
            if (r8 != 0) goto L_0x00a0
            boolean r8 = r5 instanceof android.view.ViewGroup
            if (r8 == 0) goto L_0x00a0
            boolean r8 = r5.hasFocus()
            if (r8 == 0) goto L_0x00a0
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r5 = r5.getFocusedChild()
            int r8 = r5.getId()
            if (r8 == r9) goto L_0x007f
            int r7 = r5.getId()
            goto L_0x007f
        L_0x00a0:
            r0.f3326n = r7
        L_0x00a2:
            boolean r5 = r0.f3322j
            if (r5 == 0) goto L_0x00ac
            boolean r5 = r12.f2023n0
            if (r5 == 0) goto L_0x00ac
            r5 = 1
            goto L_0x00ad
        L_0x00ac:
            r5 = 0
        L_0x00ad:
            r0.f3321h = r5
            r12.f2023n0 = r2
            r12.m0 = r2
            boolean r5 = r0.f3323k
            r0.f3320g = r5
            j0.C r5 = r12.f2028q
            int r5 = r5.a()
            r0.e = r5
            int[] r5 = r12.f2031r0
            r12.C(r5)
            boolean r5 = r0.f3322j
            java.lang.Object r3 = r3.f108g
            r.k r3 = (r.k) r3
            if (r5 == 0) goto L_0x0142
            android.support.v4.media.session.t r5 = r12.f2015j
            int r5 = r5.m()
            r7 = 0
        L_0x00d3:
            if (r7 >= r5) goto L_0x0142
            android.support.v4.media.session.t r8 = r12.f2015j
            android.view.View r8 = r8.l(r7)
            j0.a0 r8 = I(r8)
            boolean r10 = r8.p()
            if (r10 != 0) goto L_0x013f
            boolean r10 = r8.g()
            if (r10 == 0) goto L_0x00f2
            j0.C r10 = r12.f2028q
            boolean r10 = r10.f3265b
            if (r10 != 0) goto L_0x00f2
            goto L_0x013f
        L_0x00f2:
            j0.G r10 = r12.f1994O
            j0.G.b(r8)
            r8.c()
            r10.getClass()
            N.q r10 = new N.q
            r10.<init>()
            r10.a(r8)
            java.lang.Object r11 = r3.getOrDefault(r8, r6)
            j0.k0 r11 = (j0.k0) r11
            if (r11 != 0) goto L_0x0114
            j0.k0 r11 = j0.k0.a()
            r3.put(r8, r11)
        L_0x0114:
            r11.f3432b = r10
            int r10 = r11.f3431a
            r10 = r10 | 4
            r11.f3431a = r10
            boolean r10 = r0.f3321h
            if (r10 == 0) goto L_0x013f
            boolean r10 = r8.l()
            if (r10 == 0) goto L_0x013f
            boolean r10 = r8.i()
            if (r10 != 0) goto L_0x013f
            boolean r10 = r8.p()
            if (r10 != 0) goto L_0x013f
            boolean r10 = r8.g()
            if (r10 != 0) goto L_0x013f
            long r10 = r12.G(r8)
            r4.f(r10, r8)
        L_0x013f:
            int r7 = r7 + 1
            goto L_0x00d3
        L_0x0142:
            boolean r4 = r0.f3323k
            r5 = 2
            if (r4 == 0) goto L_0x01dd
            android.support.v4.media.session.t r4 = r12.f2015j
            int r4 = r4.u()
            r7 = 0
        L_0x014e:
            if (r7 >= r4) goto L_0x016b
            android.support.v4.media.session.t r8 = r12.f2015j
            android.view.View r8 = r8.t(r7)
            j0.a0 r8 = I(r8)
            boolean r10 = r8.p()
            if (r10 != 0) goto L_0x0168
            int r10 = r8.f3341d
            if (r10 != r9) goto L_0x0168
            int r10 = r8.f3340c
            r8.f3341d = r10
        L_0x0168:
            int r7 = r7 + 1
            goto L_0x014e
        L_0x016b:
            boolean r4 = r0.f3319f
            r0.f3319f = r2
            j0.K r7 = r12.f2030r
            j0.Q r8 = r12.f2010g
            r7.b0(r8, r0)
            r0.f3319f = r4
            r4 = 0
        L_0x0179:
            android.support.v4.media.session.t r7 = r12.f2015j
            int r7 = r7.m()
            if (r4 >= r7) goto L_0x01d9
            android.support.v4.media.session.t r7 = r12.f2015j
            android.view.View r7 = r7.l(r4)
            j0.a0 r7 = I(r7)
            boolean r8 = r7.p()
            if (r8 == 0) goto L_0x0192
            goto L_0x01d6
        L_0x0192:
            java.lang.Object r8 = r3.getOrDefault(r7, r6)
            j0.k0 r8 = (j0.k0) r8
            if (r8 == 0) goto L_0x01a1
            int r8 = r8.f3431a
            r8 = r8 & 4
            if (r8 == 0) goto L_0x01a1
            goto L_0x01d6
        L_0x01a1:
            j0.G.b(r7)
            r8 = 8192(0x2000, float:1.14794E-41)
            boolean r8 = r7.d(r8)
            j0.G r9 = r12.f1994O
            r7.c()
            r9.getClass()
            N.q r9 = new N.q
            r9.<init>()
            r9.a(r7)
            if (r8 == 0) goto L_0x01c0
            r12.V(r7, r9)
            goto L_0x01d6
        L_0x01c0:
            java.lang.Object r8 = r3.getOrDefault(r7, r6)
            j0.k0 r8 = (j0.k0) r8
            if (r8 != 0) goto L_0x01cf
            j0.k0 r8 = j0.k0.a()
            r3.put(r7, r8)
        L_0x01cf:
            int r7 = r8.f3431a
            r7 = r7 | r5
            r8.f3431a = r7
            r8.f3432b = r9
        L_0x01d6:
            int r4 = r4 + 1
            goto L_0x0179
        L_0x01d9:
            r12.k()
            goto L_0x01e0
        L_0x01dd:
            r12.k()
        L_0x01e0:
            r12.Q(r1)
            r12.d0(r2)
            r0.f3318d = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p():void");
    }

    public final void requestChildFocus(View view, View view2) {
        C0159v vVar = this.f2030r.e;
        if ((vVar == null || !vVar.e) && !L() && view2 != null) {
            W(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f2030r.k0(this, view, rect, z2, false);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        ArrayList arrayList = this.f2034t;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0151m) arrayList.get(i2)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public final void requestLayout() {
        if (this.f2044y != 0 || this.f1981A) {
            this.f2046z = true;
        } else {
            super.requestLayout();
        }
    }

    public final void scrollBy(int i2, int i3) {
        K k2 = this.f2030r;
        if (k2 == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f1981A) {
            boolean d2 = k2.d();
            boolean e = this.f2030r.e();
            if (d2 || e) {
                if (!d2) {
                    i2 = 0;
                }
                if (!e) {
                    i3 = 0;
                }
                Y(i2, i3, (MotionEvent) null);
            }
        }
    }

    public final void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void setAccessibilityDelegateCompat(c0 c0Var) {
        this.f2029q0 = c0Var;
        N.Q.p(this, c0Var);
    }

    public void setChildDrawingOrderCallback(E e) {
        if (e != null) {
            setChildrenDrawingOrderEnabled(false);
        }
    }

    public void setClipToPadding(boolean z2) {
        if (z2 != this.f2019l) {
            this.f1993N = null;
            this.f1991L = null;
            this.f1992M = null;
            this.f1990K = null;
        }
        this.f2019l = z2;
        super.setClipToPadding(z2);
        if (this.f2042x) {
            requestLayout();
        }
    }

    public void setHasFixedSize(boolean z2) {
        this.f2040w = z2;
    }

    public void setItemAnimator(G g2) {
        G g3 = this.f1994O;
        if (g3 != null) {
            g3.e();
            this.f1994O.f3266a = null;
        }
        this.f1994O = g2;
        if (g2 != null) {
            g2.f3266a = this.f2025o0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        Q q2 = this.f2010g;
        q2.e = i2;
        q2.k();
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setOnFlingListener(M m2) {
        this.f2003a0 = m2;
    }

    @Deprecated
    public void setOnScrollListener(N n2) {
        this.f2018k0 = n2;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f2009f0 = z2;
    }

    public void setRecycledViewPool(P p2) {
        Q q2 = this.f2010g;
        P p3 = q2.f3305g;
        if (p3 != null) {
            p3.f3299b--;
        }
        q2.f3305g = p2;
        if (p2 != null && q2.f3306h.getAdapter() != null) {
            q2.f3305g.f3299b++;
        }
    }

    public void setRecyclerListener(S s2) {
    }

    public void setScrollState(int i2) {
        C0159v vVar;
        if (i2 != this.f1995P) {
            this.f1995P = i2;
            if (i2 != 2) {
                Z z2 = this.f2011g0;
                z2.f3332g.removeCallbacks(z2);
                z2.f3329c.abortAnimation();
                K k2 = this.f2030r;
                if (!(k2 == null || (vVar = k2.e) == null)) {
                    vVar.i();
                }
            }
            K k3 = this.f2030r;
            if (k3 != null) {
                k3.f0(i2);
            }
            N n2 = this.f2018k0;
            if (n2 != null) {
                n2.a(this, i2);
            }
            ArrayList arrayList = this.f2020l0;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((N) this.f2020l0.get(size)).a(this, i2);
                }
            }
        }
    }

    public void setViewCacheExtension(Y y2) {
        this.f2010g.getClass();
    }

    public final void suppressLayout(boolean z2) {
        C0159v vVar;
        if (z2 != this.f1981A) {
            i("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.f1981A = false;
                if (!(!this.f2046z || this.f2030r == null || this.f2028q == null)) {
                    requestLayout();
                }
                this.f2046z = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f1981A = true;
            this.f1982B = true;
            setScrollState(0);
            Z z3 = this.f2011g0;
            z3.f3332g.removeCallbacks(z3);
            z3.f3329c.abortAnimation();
            K k2 = this.f2030r;
            if (k2 != null && (vVar = k2.e) != null) {
                vVar.i();
            }
        }
    }

    public final void t(int i2, int i3) {
        this.I++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        N n2 = this.f2018k0;
        if (n2 != null) {
            n2.b(this, i2, i3);
        }
        ArrayList arrayList = this.f2020l0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((N) this.f2020l0.get(size)).b(this, i2, i3);
            }
        }
        this.I--;
    }

    public final void u() {
        if (this.f1993N == null) {
            this.f1989J.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f1993N = edgeEffect;
            if (this.f2019l) {
                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final void v() {
        if (this.f1990K == null) {
            this.f1989J.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f1990K = edgeEffect;
            if (this.f2019l) {
                edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void w() {
        if (this.f1992M == null) {
            this.f1989J.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f1992M = edgeEffect;
            if (this.f2019l) {
                edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void x() {
        if (this.f1991L == null) {
            this.f1989J.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f1991L = edgeEffect;
            if (this.f2019l) {
                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.f2028q + ", layout:" + this.f2030r + ", context:" + getContext();
    }

    public final View A(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean B(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.f2034t;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0151m mVar = (C0151m) arrayList.get(i2);
            int i3 = mVar.f3459v;
            if (i3 == 1) {
                boolean e = mVar.e(motionEvent.getX(), motionEvent.getY());
                boolean d2 = mVar.d(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (e || d2)) {
                    if (d2) {
                        mVar.f3460w = 1;
                        mVar.f3453p = (float) ((int) motionEvent.getX());
                    } else if (e) {
                        mVar.f3460w = 2;
                        mVar.f3450m = (float) ((int) motionEvent.getY());
                    }
                    mVar.g(2);
                }
            } else if (i3 != 2) {
                continue;
            }
            if (action != 3) {
                this.f2036u = mVar;
                return true;
            }
        }
        return false;
    }

    public final a0 H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect J(View view) {
        L l2 = (L) view.getLayoutParams();
        boolean z2 = l2.f3292c;
        Rect rect = l2.f3291b;
        if (!z2) {
            return rect;
        }
        if (this.f2016j0.f3320g && (l2.f3290a.l() || l2.f3290a.g())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f2032s;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Rect rect2 = this.f2022n;
            rect2.set(0, 0, 0, 0);
            ((H) arrayList.get(i2)).a(rect2, view, this);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        l2.f3292c = false;
        return rect;
    }

    public final void R(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1996Q) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.f1996Q = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.f2000U = x2;
            this.f1998S = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.f2001V = y2;
            this.f1999T = y2;
        }
    }

    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, 0);
    }

    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().d(i2, i3, i4, i5, iArr, 0, (int[]) null);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public final boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public final void e0(int i2) {
        getScrollingChildHelper().h(i2);
    }

    public final int getChildDrawingOrder(int i2, int i3) {
        return super.getChildDrawingOrder(i2, i3);
    }

    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(String str) {
        if (L()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + y());
            }
            throw new IllegalStateException(str);
        } else if (this.I > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + y()));
        }
    }

    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f573d;
    }

    public final void n(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = N.Q.f509a;
        setMeasuredDimension(K.g(i2, paddingRight, getMinimumWidth()), K.g(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [j0.p, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        if (r1 >= 30.0f) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f1988H = r0
            r1 = 1
            r5.f2038v = r1
            boolean r2 = r5.f2042x
            if (r2 == 0) goto L_0x0015
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L_0x0015
            r2 = 1
            goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            r5.f2042x = r2
            j0.K r2 = r5.f2030r
            if (r2 == 0) goto L_0x0021
            r2.f3282g = r1
            r2.Q(r5)
        L_0x0021:
            r5.f2027p0 = r0
            boolean r0 = f1977C0
            if (r0 == 0) goto L_0x0076
            java.lang.ThreadLocal r0 = j0.C0154p.e
            java.lang.Object r1 = r0.get()
            j0.p r1 = (j0.C0154p) r1
            r5.f2013h0 = r1
            if (r1 != 0) goto L_0x006f
            j0.p r1 = new j0.p
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f3473a = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f3476d = r2
            r5.f2013h0 = r1
            java.util.WeakHashMap r1 = N.Q.f509a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L_0x0061
            if (r1 == 0) goto L_0x0061
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r1 = 1114636288(0x42700000, float:60.0)
        L_0x0063:
            j0.p r2 = r5.f2013h0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f3475c = r3
            r0.set(r2)
        L_0x006f:
            j0.p r0 = r5.f2013h0
            java.util.ArrayList r0 = r0.f3473a
            r0.add(r5)
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public final void onDetachedFromWindow() {
        C0154p pVar;
        C0159v vVar;
        super.onDetachedFromWindow();
        G g2 = this.f1994O;
        if (g2 != null) {
            g2.e();
        }
        setScrollState(0);
        Z z2 = this.f2011g0;
        z2.f3332g.removeCallbacks(z2);
        z2.f3329c.abortAnimation();
        K k2 = this.f2030r;
        if (!(k2 == null || (vVar = k2.e) == null)) {
            vVar.i();
        }
        this.f2038v = false;
        K k3 = this.f2030r;
        if (k3 != null) {
            k3.f3282g = false;
            k3.R(this);
        }
        this.f2041w0.clear();
        removeCallbacks(this.f2043x0);
        this.f2017k.getClass();
        do {
        } while (k0.f3430d.a() != null);
        if (f1977C0 && (pVar = this.f2013h0) != null) {
            pVar.f3473a.remove(this);
            this.f2013h0 = null;
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f2032s;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((H) arrayList.get(i2)).b(this);
        }
    }

    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            this.f1993N = null;
            this.f1991L = null;
            this.f1992M = null;
            this.f1990K = null;
        }
    }

    public final void q() {
        boolean z2;
        c0();
        P();
        X x2 = this.f2016j0;
        x2.a(6);
        this.i.d();
        x2.e = this.f2028q.a();
        x2.f3317c = 0;
        x2.f3320g = false;
        this.f2030r.b0(this.f2010g, x2);
        x2.f3319f = false;
        this.f2012h = null;
        if (!x2.f3322j || this.f1994O == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        x2.f3322j = z2;
        x2.f3318d = 4;
        Q(true);
        d0(false);
    }

    public final boolean r(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, i4);
    }

    public final void removeDetachedView(View view, boolean z2) {
        a0 I2 = I(view);
        if (I2 != null) {
            if (I2.k()) {
                I2.f3345j &= -257;
            } else if (!I2.p()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + I2 + y());
            }
        }
        view.clearAnimation();
        I(view);
        super.removeDetachedView(view, z2);
    }

    public final void s(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().d(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i2;
        if (L()) {
            int i3 = 0;
            if (accessibilityEvent != null) {
                i2 = accessibilityEvent.getContentChangeTypes();
            } else {
                i2 = 0;
            }
            if (i2 != 0) {
                i3 = i2;
            }
            this.f1983C |= i3;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setEdgeEffectFactory(F f2) {
        f2.getClass();
        this.f1989J = f2;
        this.f1993N = null;
        this.f1991L = null;
        this.f1992M = null;
        this.f1990K = null;
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setNestedScrollingEnabled(boolean z2) {
        C0014n scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f573d) {
            WeakHashMap weakHashMap = N.Q.f509a;
            N.F.z(scrollingChildHelper.f572c);
        }
        scrollingChildHelper.f573d = z2;
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
            } else {
                this.f2002W = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f2002W = viewConfiguration.getScaledTouchSlop();
    }

    public final boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().g(i2, 0);
    }

    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    public final void z(X x2) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f2011g0.f3329c;
            overScroller.getFinalX();
            overScroller.getCurrX();
            x2.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        x2.getClass();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        K k2 = this.f2030r;
        if (k2 != null) {
            return k2.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }
}
