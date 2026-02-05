package androidx.fragment.app;

import A.b;
import N0.B;
import Q0.E;
import Z0.c;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.o;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import h.C0121l;

/* renamed from: androidx.fragment.app.m  reason: case insensitive filesystem */
public class C0059m extends r implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: Z  reason: collision with root package name */
    public final C0056j f1704Z = new C0056j(this);

    /* renamed from: a0  reason: collision with root package name */
    public final C0057k f1705a0 = new C0057k(this);

    /* renamed from: b0  reason: collision with root package name */
    public int f1706b0 = 0;

    /* renamed from: c0  reason: collision with root package name */
    public int f1707c0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f1708d0 = true;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f1709e0 = true;

    /* renamed from: f0  reason: collision with root package name */
    public int f1710f0 = -1;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f1711g0;

    /* renamed from: h0  reason: collision with root package name */
    public final b f1712h0 = new b(17, (Object) this);

    /* renamed from: i0  reason: collision with root package name */
    public Dialog f1713i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f1714j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f1715k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f1716l0;
    public boolean m0 = false;

    public void A() {
        this.f1736H = true;
        Dialog dialog = this.f1713i0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final void C(Bundle bundle) {
        Bundle bundle2;
        this.f1736H = true;
        if (this.f1713i0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f1713i0.onRestoreInstanceState(bundle2);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public final void r() {
        this.f1736H = true;
    }

    public final void v() {
        this.f1736H = true;
        Dialog dialog = this.f1713i0;
        if (dialog != null) {
            this.f1714j0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f1713i0.dismiss();
            if (!this.f1715k0) {
                onDismiss(this.f1713i0);
            }
            this.f1713i0 = null;
            this.m0 = false;
        }
    }

    public final void w() {
        this.f1736H = true;
        if (!this.f1716l0 && !this.f1715k0) {
            this.f1715k0 = true;
        }
        b bVar = this.f1712h0;
        x xVar = this.f1748U;
        xVar.getClass();
        x.a("removeObserver");
        w wVar = (w) xVar.f1854b.b(bVar);
        if (wVar != null) {
            wVar.d();
            wVar.c(false);
        }
    }

    public void z() {
        this.f1736H = true;
        Dialog dialog = this.f1713i0;
        if (dialog != null) {
            this.f1714j0 = false;
            dialog.show();
            View decorView = this.f1713i0.getWindow().getDecorView();
            c.e("<this>", decorView);
            decorView.setTag(2131296787, this);
            decorView.setTag(2131296790, this);
            decorView.setTag(2131296789, this);
        }
    }

    public Dialog K() {
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        return new o(F(), this.f1707c0);
    }

    public final v e() {
        return new C0058l(this, new C0061o(this));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f1714j0) {
            if (Log.isLoggable("FragmentManager", 3)) {
                toString();
            }
            if (!this.f1715k0) {
                this.f1715k0 = true;
                this.f1716l0 = false;
                Dialog dialog = this.f1713i0;
                if (dialog != null) {
                    dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                    this.f1713i0.dismiss();
                }
                this.f1714j0 = true;
                if (this.f1710f0 >= 0) {
                    H j2 = j();
                    int i = this.f1710f0;
                    if (i >= 0) {
                        j2.v(new G(j2, i), true);
                        this.f1710f0 = -1;
                        return;
                    }
                    throw new IllegalArgumentException(E.e("Bad id: ", i));
                }
                C0047a aVar = new C0047a(j());
                aVar.f1666p = true;
                H h2 = this.f1768w;
                if (h2 == null || h2 == aVar.f1667q) {
                    aVar.b(new N(3, this));
                    aVar.d(true);
                    return;
                }
                throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
            }
        }
    }

    public void y(Bundle bundle) {
        Dialog dialog = this.f1713i0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f1706b0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f1707c0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z2 = this.f1708d0;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f1709e0;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i3 = this.f1710f0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public C0059m() {
        new B(5, this);
    }

    public final void D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.D(layoutInflater, viewGroup, bundle);
        if (this.f1737J == null && this.f1713i0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f1713i0.onRestoreInstanceState(bundle2);
        }
    }

    public final void s(C0121l lVar) {
        super.s(lVar);
        this.f1748U.d(this.f1712h0);
        if (!this.f1716l0) {
            this.f1715k0 = false;
        }
    }

    public void t(Bundle bundle) {
        boolean z2;
        super.t(bundle);
        new Handler();
        if (this.f1730B == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f1709e0 = z2;
        if (bundle != null) {
            this.f1706b0 = bundle.getInt("android:style", 0);
            this.f1707c0 = bundle.getInt("android:theme", 0);
            this.f1708d0 = bundle.getBoolean("android:cancelable", true);
            this.f1709e0 = bundle.getBoolean("android:showsDialog", this.f1709e0);
            this.f1710f0 = bundle.getInt("android:backStackId", -1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046 A[Catch:{ all -> 0x004e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.LayoutInflater x(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.x(r8)
            boolean r0 = r7.f1709e0
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L_0x0087
            boolean r3 = r7.f1711g0
            if (r3 == 0) goto L_0x0011
            goto L_0x0087
        L_0x0011:
            if (r0 != 0) goto L_0x0014
            goto L_0x0071
        L_0x0014:
            boolean r0 = r7.m0
            if (r0 != 0) goto L_0x0071
            r0 = 0
            r3 = 1
            r7.f1711g0 = r3     // Catch:{ all -> 0x004e }
            android.app.Dialog r4 = r7.K()     // Catch:{ all -> 0x004e }
            r7.f1713i0 = r4     // Catch:{ all -> 0x004e }
            boolean r5 = r7.f1709e0     // Catch:{ all -> 0x004e }
            if (r5 == 0) goto L_0x0068
            int r5 = r7.f1706b0     // Catch:{ all -> 0x004e }
            if (r5 == r3) goto L_0x003b
            if (r5 == r2) goto L_0x003b
            r6 = 3
            if (r5 == r6) goto L_0x0030
            goto L_0x003e
        L_0x0030:
            android.view.Window r5 = r4.getWindow()     // Catch:{ all -> 0x004e }
            if (r5 == 0) goto L_0x003b
            r6 = 24
            r5.addFlags(r6)     // Catch:{ all -> 0x004e }
        L_0x003b:
            r4.requestWindowFeature(r3)     // Catch:{ all -> 0x004e }
        L_0x003e:
            android.content.Context r4 = r7.h()     // Catch:{ all -> 0x004e }
            boolean r5 = r4 instanceof android.app.Activity     // Catch:{ all -> 0x004e }
            if (r5 == 0) goto L_0x0050
            android.app.Dialog r5 = r7.f1713i0     // Catch:{ all -> 0x004e }
            android.app.Activity r4 = (android.app.Activity) r4     // Catch:{ all -> 0x004e }
            r5.setOwnerActivity(r4)     // Catch:{ all -> 0x004e }
            goto L_0x0050
        L_0x004e:
            r8 = move-exception
            goto L_0x006e
        L_0x0050:
            android.app.Dialog r4 = r7.f1713i0     // Catch:{ all -> 0x004e }
            boolean r5 = r7.f1708d0     // Catch:{ all -> 0x004e }
            r4.setCancelable(r5)     // Catch:{ all -> 0x004e }
            android.app.Dialog r4 = r7.f1713i0     // Catch:{ all -> 0x004e }
            androidx.fragment.app.j r5 = r7.f1704Z     // Catch:{ all -> 0x004e }
            r4.setOnCancelListener(r5)     // Catch:{ all -> 0x004e }
            android.app.Dialog r4 = r7.f1713i0     // Catch:{ all -> 0x004e }
            androidx.fragment.app.k r5 = r7.f1705a0     // Catch:{ all -> 0x004e }
            r4.setOnDismissListener(r5)     // Catch:{ all -> 0x004e }
            r7.m0 = r3     // Catch:{ all -> 0x004e }
            goto L_0x006b
        L_0x0068:
            r3 = 0
            r7.f1713i0 = r3     // Catch:{ all -> 0x004e }
        L_0x006b:
            r7.f1711g0 = r0
            goto L_0x0071
        L_0x006e:
            r7.f1711g0 = r0
            throw r8
        L_0x0071:
            boolean r0 = android.util.Log.isLoggable(r1, r2)
            if (r0 == 0) goto L_0x007a
            r7.toString()
        L_0x007a:
            android.app.Dialog r0 = r7.f1713i0
            if (r0 == 0) goto L_0x0086
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r8 = r8.cloneInContext(r0)
        L_0x0086:
            return r8
        L_0x0087:
            boolean r0 = android.util.Log.isLoggable(r1, r2)
            if (r0 == 0) goto L_0x0090
            r7.toString()
        L_0x0090:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0059m.x(android.os.Bundle):android.view.LayoutInflater");
    }
}
