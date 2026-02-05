package androidx.preference;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import g0.C0098a;
import g0.y;

public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: R  reason: collision with root package name */
    public final C0098a f1868R = new C0098a(this, 0);

    public final void y(View view) {
        boolean z2 = view instanceof CompoundButton;
        if (z2) {
            ((CompoundButton) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f1947M);
        }
        if (z2) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f1868R);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CheckBoxPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130968761(0x7f0400b9, float:1.7546185E38)
            r1 = 16842895(0x101008f, float:2.369396E-38)
            int r0 = E.b.b(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            g0.a r1 = new g0.a
            r2 = 0
            r1.<init>(r3, r2)
            r3.f1868R = r1
            int[] r1 = g0.z.f2622b
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            r5 = 5
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L_0x0026
            java.lang.String r5 = r4.getString(r2)
        L_0x0026:
            r3.f1948N = r5
            boolean r5 = r3.f1947M
            if (r5 == 0) goto L_0x002f
            r3.g()
        L_0x002f:
            r5 = 4
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L_0x003b
            r5 = 1
            java.lang.String r5 = r4.getString(r5)
        L_0x003b:
            r3.f1949O = r5
            boolean r5 = r3.f1947M
            if (r5 != 0) goto L_0x0044
            r3.g()
        L_0x0044:
            r5 = 2
            boolean r5 = r4.getBoolean(r5, r2)
            r0 = 3
            boolean r5 = r4.getBoolean(r0, r5)
            r3.f1951Q = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.CheckBoxPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void k(y yVar) {
        super.k(yVar);
        y(yVar.r(16908289));
        x(yVar.r(16908304));
    }

    public final void r(View view) {
        super.r(view);
        if (((AccessibilityManager) this.f1898a.getSystemService("accessibility")).isEnabled()) {
            y(view.findViewById(16908289));
            x(view.findViewById(16908304));
        }
    }
}
