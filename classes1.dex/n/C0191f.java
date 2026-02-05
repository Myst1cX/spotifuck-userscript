package n;

import N0.o;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.transition.Transition;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import j0.C0160w;
import java.util.ArrayList;
import java.util.Iterator;
import o.C0309v0;
import o.J0;
import o.M0;

/* renamed from: n.f  reason: case insensitive filesystem */
public final class C0191f extends C0205t implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A  reason: collision with root package name */
    public boolean f3835A;

    /* renamed from: B  reason: collision with root package name */
    public C0208w f3836B;

    /* renamed from: C  reason: collision with root package name */
    public ViewTreeObserver f3837C;

    /* renamed from: D  reason: collision with root package name */
    public C0206u f3838D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f3839E;

    /* renamed from: g  reason: collision with root package name */
    public final Context f3840g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3841h;
    public final int i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f3842j;

    /* renamed from: k  reason: collision with root package name */
    public final Handler f3843k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f3844l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f3845m = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    public final C0189d f3846n = new C0189d(0, this);

    /* renamed from: o  reason: collision with root package name */
    public final o f3847o = new o(2, this);

    /* renamed from: p  reason: collision with root package name */
    public final C0160w f3848p = new C0160w(this);

    /* renamed from: q  reason: collision with root package name */
    public int f3849q;

    /* renamed from: r  reason: collision with root package name */
    public int f3850r;

    /* renamed from: s  reason: collision with root package name */
    public View f3851s;

    /* renamed from: t  reason: collision with root package name */
    public View f3852t;

    /* renamed from: u  reason: collision with root package name */
    public int f3853u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f3854v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f3855w;

    /* renamed from: x  reason: collision with root package name */
    public int f3856x;

    /* renamed from: y  reason: collision with root package name */
    public int f3857y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f3858z;

    public final boolean h() {
        return false;
    }

    public final void q(int i2) {
        this.f3854v = true;
        this.f3856x = i2;
    }

    public final void t(int i2) {
        this.f3855w = true;
        this.f3857y = i2;
    }

    public final boolean a() {
        ArrayList arrayList = this.f3845m;
        if (arrayList.size() <= 0 || !((C0190e) arrayList.get(0)).f3832a.f4073E.isShowing()) {
            return false;
        }
        return true;
    }

    public final void b(C0197l lVar, boolean z2) {
        int i2;
        ArrayList arrayList = this.f3845m;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (lVar == ((C0190e) arrayList.get(i3)).f3833b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int i4 = i3 + 1;
            if (i4 < arrayList.size()) {
                ((C0190e) arrayList.get(i4)).f3833b.c(false);
            }
            C0190e eVar = (C0190e) arrayList.remove(i3);
            eVar.f3833b.r(this);
            boolean z3 = this.f3839E;
            M0 m0 = eVar.f3832a;
            if (z3) {
                if (Build.VERSION.SDK_INT >= 23) {
                    J0.b(m0.f4073E, (Transition) null);
                }
                m0.f4073E.setAnimationStyle(0);
            }
            m0.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.f3853u = ((C0190e) arrayList.get(size2 - 1)).f3834c;
            } else {
                if (this.f3851s.getLayoutDirection() == 1) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                this.f3853u = i2;
            }
            if (size2 == 0) {
                dismiss();
                C0208w wVar = this.f3836B;
                if (wVar != null) {
                    wVar.b(lVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f3837C;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f3837C.removeGlobalOnLayoutListener(this.f3846n);
                    }
                    this.f3837C = null;
                }
                this.f3852t.removeOnAttachStateChangeListener(this.f3847o);
                this.f3838D.onDismiss();
            } else if (z2) {
                ((C0190e) arrayList.get(0)).f3833b.c(false);
            }
        }
    }

    public final void c() {
        Iterator it2 = this.f3845m.iterator();
        while (it2.hasNext()) {
            ListAdapter adapter = ((C0190e) it2.next()).f3832a.f4076h.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0194i) adapter).notifyDataSetChanged();
        }
    }

    public final void dismiss() {
        ArrayList arrayList = this.f3845m;
        int size = arrayList.size();
        if (size > 0) {
            C0190e[] eVarArr = (C0190e[]) arrayList.toArray(new C0190e[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                C0190e eVar = eVarArr[i2];
                if (eVar.f3832a.f4073E.isShowing()) {
                    eVar.f3832a.dismiss();
                }
            }
        }
    }

    public final C0309v0 e() {
        ArrayList arrayList = this.f3845m;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0190e) arrayList.get(arrayList.size() - 1)).f3832a.f4076h;
    }

    public final boolean g(C0185D d2) {
        Iterator it2 = this.f3845m.iterator();
        while (it2.hasNext()) {
            C0190e eVar = (C0190e) it2.next();
            if (d2 == eVar.f3833b) {
                eVar.f3832a.f4076h.requestFocus();
                return true;
            }
        }
        if (!d2.hasVisibleItems()) {
            return false;
        }
        l(d2);
        C0208w wVar = this.f3836B;
        if (wVar != null) {
            wVar.h(d2);
        }
        return true;
    }

    public final void j(C0208w wVar) {
        this.f3836B = wVar;
    }

    public final void l(C0197l lVar) {
        lVar.b(this, this.f3840g);
        if (a()) {
            v(lVar);
        } else {
            this.f3844l.add(lVar);
        }
    }

    public final void n(View view) {
        if (this.f3851s != view) {
            this.f3851s = view;
            this.f3850r = Gravity.getAbsoluteGravity(this.f3849q, view.getLayoutDirection());
        }
    }

    public final void o(boolean z2) {
        this.f3858z = z2;
    }

    public final void onDismiss() {
        C0190e eVar;
        ArrayList arrayList = this.f3845m;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                eVar = null;
                break;
            }
            eVar = (C0190e) arrayList.get(i2);
            if (!eVar.f3832a.f4073E.isShowing()) {
                break;
            }
            i2++;
        }
        if (eVar != null) {
            eVar.f3833b.c(false);
        }
    }

    public final void p(int i2) {
        if (this.f3849q != i2) {
            this.f3849q = i2;
            this.f3850r = Gravity.getAbsoluteGravity(i2, this.f3851s.getLayoutDirection());
        }
    }

    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f3838D = (C0206u) onDismissListener;
    }

    public final void s(boolean z2) {
        this.f3835A = z2;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [o.M0, o.H0] */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0138, code lost:
        if (((r3.getWidth() + r12[0]) + r6) > r10.right) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013c, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0143, code lost:
        if ((r12[0] - r6) < 0) goto L_0x013c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(n.C0197l r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            android.content.Context r3 = r0.f3840g
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r3)
            n.i r5 = new n.i
            boolean r6 = r0.f3842j
            r7 = 2131492875(0x7f0c000b, float:1.8609214E38)
            r5.<init>(r1, r4, r6, r7)
            boolean r6 = r18.a()
            r7 = 1
            if (r6 != 0) goto L_0x0022
            boolean r6 = r0.f3858z
            if (r6 == 0) goto L_0x0022
            r5.f3868c = r7
            goto L_0x002e
        L_0x0022:
            boolean r6 = r18.a()
            if (r6 == 0) goto L_0x002e
            boolean r6 = n.C0205t.u(r19)
            r5.f3868c = r6
        L_0x002e:
            int r6 = r0.f3841h
            int r6 = n.C0205t.m(r5, r3, r6)
            o.M0 r8 = new o.M0
            int r9 = r0.i
            r10 = 0
            r8.<init>(r3, r10, r9)
            o.A r3 = r8.f4073E
            j0.w r9 = r0.f3848p
            r8.I = r9
            r8.f4088u = r0
            r3.setOnDismissListener(r0)
            android.view.View r9 = r0.f3851s
            r8.f4087t = r9
            int r9 = r0.f3850r
            r8.f4084q = r9
            r8.f4072D = r7
            r3.setFocusable(r7)
            r9 = 2
            r3.setInputMethodMode(r9)
            r8.n(r5)
            r8.r(r6)
            int r5 = r0.f3850r
            r8.f4084q = r5
            java.util.ArrayList r5 = r0.f3845m
            int r11 = r5.size()
            if (r11 <= 0) goto L_0x00e0
            int r11 = r5.size()
            int r11 = r11 - r7
            java.lang.Object r11 = r5.get(r11)
            n.e r11 = (n.C0190e) r11
            n.l r12 = r11.f3833b
            java.util.ArrayList r13 = r12.f3876f
            int r13 = r13.size()
            r14 = 0
        L_0x007e:
            if (r14 >= r13) goto L_0x0094
            android.view.MenuItem r15 = r12.getItem(r14)
            boolean r16 = r15.hasSubMenu()
            if (r16 == 0) goto L_0x0091
            android.view.SubMenu r9 = r15.getSubMenu()
            if (r1 != r9) goto L_0x0091
            goto L_0x0095
        L_0x0091:
            int r14 = r14 + r7
            r9 = 2
            goto L_0x007e
        L_0x0094:
            r15 = r10
        L_0x0095:
            if (r15 != 0) goto L_0x0099
            r2 = r10
            goto L_0x00e2
        L_0x0099:
            o.M0 r9 = r11.f3832a
            o.v0 r9 = r9.f4076h
            android.widget.ListAdapter r12 = r9.getAdapter()
            boolean r13 = r12 instanceof android.widget.HeaderViewListAdapter
            if (r13 == 0) goto L_0x00b2
            android.widget.HeaderViewListAdapter r12 = (android.widget.HeaderViewListAdapter) r12
            int r13 = r12.getHeadersCount()
            android.widget.ListAdapter r12 = r12.getWrappedAdapter()
            n.i r12 = (n.C0194i) r12
            goto L_0x00b5
        L_0x00b2:
            n.i r12 = (n.C0194i) r12
            r13 = 0
        L_0x00b5:
            int r14 = r12.getCount()
            r10 = 0
        L_0x00ba:
            if (r10 >= r14) goto L_0x00c6
            n.n r2 = r12.getItem(r10)
            if (r15 != r2) goto L_0x00c4
            r2 = -1
            goto L_0x00c8
        L_0x00c4:
            int r10 = r10 + r7
            goto L_0x00ba
        L_0x00c6:
            r2 = -1
            r10 = -1
        L_0x00c8:
            if (r10 != r2) goto L_0x00cc
        L_0x00ca:
            r2 = 0
            goto L_0x00e2
        L_0x00cc:
            int r10 = r10 + r13
            int r2 = r9.getFirstVisiblePosition()
            int r10 = r10 - r2
            if (r10 < 0) goto L_0x00ca
            int r2 = r9.getChildCount()
            if (r10 < r2) goto L_0x00db
            goto L_0x00ca
        L_0x00db:
            android.view.View r2 = r9.getChildAt(r10)
            goto L_0x00e2
        L_0x00e0:
            r2 = 0
            r11 = 0
        L_0x00e2:
            if (r2 == 0) goto L_0x01ae
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            if (r9 > r10) goto L_0x00fb
            java.lang.reflect.Method r9 = o.M0.f4107J
            if (r9 == 0) goto L_0x00ff
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x00f9 }
            java.lang.Boolean r12 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x00f9 }
            r13 = 0
            r10[r13] = r12     // Catch:{ Exception -> 0x00f9 }
            r9.invoke(r3, r10)     // Catch:{ Exception -> 0x00f9 }
            goto L_0x00ff
        L_0x00f9:
            goto L_0x00ff
        L_0x00fb:
            r9 = 0
            o.K0.a(r3, r9)
        L_0x00ff:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 23
            if (r9 < r10) goto L_0x0109
            r10 = 0
            o.J0.a(r3, r10)
        L_0x0109:
            int r3 = r5.size()
            int r3 = r3 - r7
            java.lang.Object r3 = r5.get(r3)
            n.e r3 = (n.C0190e) r3
            o.M0 r3 = r3.f3832a
            o.v0 r3 = r3.f4076h
            r10 = 2
            int[] r12 = new int[r10]
            r3.getLocationOnScreen(r12)
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            android.view.View r13 = r0.f3852t
            r13.getWindowVisibleDisplayFrame(r10)
            int r13 = r0.f3853u
            if (r13 != r7) goto L_0x013e
            r17 = 0
            r12 = r12[r17]
            int r3 = r3.getWidth()
            int r3 = r3 + r12
            int r3 = r3 + r6
            int r10 = r10.right
            if (r3 <= r10) goto L_0x013c
        L_0x013a:
            r3 = 0
            goto L_0x0146
        L_0x013c:
            r3 = 1
            goto L_0x0146
        L_0x013e:
            r17 = 0
            r3 = r12[r17]
            int r3 = r3 - r6
            if (r3 >= 0) goto L_0x013a
            goto L_0x013c
        L_0x0146:
            if (r3 != r7) goto L_0x014a
            r13 = 1
            goto L_0x014b
        L_0x014a:
            r13 = 0
        L_0x014b:
            r0.f3853u = r3
            r3 = 26
            r10 = 5
            if (r9 < r3) goto L_0x0157
            r8.f4087t = r2
            r3 = 0
            r12 = 0
            goto L_0x018c
        L_0x0157:
            r3 = 2
            int[] r9 = new int[r3]
            android.view.View r12 = r0.f3851s
            r12.getLocationOnScreen(r9)
            int[] r3 = new int[r3]
            r2.getLocationOnScreen(r3)
            int r12 = r0.f3850r
            r12 = r12 & 7
            if (r12 != r10) goto L_0x0180
            r12 = 0
            r14 = r9[r12]
            android.view.View r15 = r0.f3851s
            int r15 = r15.getWidth()
            int r15 = r15 + r14
            r9[r12] = r15
            r14 = r3[r12]
            int r15 = r2.getWidth()
            int r15 = r15 + r14
            r3[r12] = r15
            goto L_0x0181
        L_0x0180:
            r12 = 0
        L_0x0181:
            r14 = r3[r12]
            r15 = r9[r12]
            int r12 = r14 - r15
            r3 = r3[r7]
            r9 = r9[r7]
            int r3 = r3 - r9
        L_0x018c:
            int r9 = r0.f3850r
            r9 = r9 & r10
            if (r9 != r10) goto L_0x019b
            if (r13 == 0) goto L_0x0195
            int r12 = r12 + r6
            goto L_0x01a4
        L_0x0195:
            int r2 = r2.getWidth()
            int r12 = r12 - r2
            goto L_0x01a4
        L_0x019b:
            if (r13 == 0) goto L_0x01a3
            int r2 = r2.getWidth()
            int r12 = r12 + r2
            goto L_0x01a4
        L_0x01a3:
            int r12 = r12 - r6
        L_0x01a4:
            r8.f4078k = r12
            r8.f4083p = r7
            r8.f4082o = r7
            r8.l(r3)
            goto L_0x01cc
        L_0x01ae:
            boolean r2 = r0.f3854v
            if (r2 == 0) goto L_0x01b6
            int r2 = r0.f3856x
            r8.f4078k = r2
        L_0x01b6:
            boolean r2 = r0.f3855w
            if (r2 == 0) goto L_0x01bf
            int r2 = r0.f3857y
            r8.l(r2)
        L_0x01bf:
            android.graphics.Rect r2 = r0.f3934f
            if (r2 == 0) goto L_0x01c9
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>(r2)
            goto L_0x01ca
        L_0x01c9:
            r10 = 0
        L_0x01ca:
            r8.f4071C = r10
        L_0x01cc:
            n.e r2 = new n.e
            int r3 = r0.f3853u
            r2.<init>(r8, r1, r3)
            r5.add(r2)
            r8.i()
            o.v0 r2 = r8.f4076h
            r2.setOnKeyListener(r0)
            if (r11 != 0) goto L_0x020a
            boolean r3 = r0.f3835A
            if (r3 == 0) goto L_0x020a
            java.lang.CharSequence r3 = r1.f3882m
            if (r3 == 0) goto L_0x020a
            r3 = 2131492882(0x7f0c0012, float:1.8609228E38)
            r5 = 0
            android.view.View r3 = r4.inflate(r3, r2, r5)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r4 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.setEnabled(r5)
            java.lang.CharSequence r1 = r1.f3882m
            r4.setText(r1)
            r1 = 0
            r2.addHeaderView(r3, r1, r5)
            r8.i()
        L_0x020a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C0191f.v(n.l):void");
    }

    public C0191f(Context context, View view, int i2, boolean z2) {
        int i3 = 0;
        this.f3849q = 0;
        this.f3850r = 0;
        this.f3840g = context;
        this.f3851s = view;
        this.i = i2;
        this.f3842j = z2;
        this.f3858z = false;
        this.f3853u = view.getLayoutDirection() != 1 ? 1 : i3;
        Resources resources = context.getResources();
        this.f3841h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.f3843k = new Handler();
    }

    public final void i() {
        boolean z2;
        if (!a()) {
            ArrayList arrayList = this.f3844l;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                v((C0197l) it2.next());
            }
            arrayList.clear();
            View view = this.f3851s;
            this.f3852t = view;
            if (view != null) {
                if (this.f3837C == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f3837C = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f3846n);
                }
                this.f3852t.addOnAttachStateChangeListener(this.f3847o);
            }
        }
    }

    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }
}
