package androidx.preference;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import g0.C0098a;
import g0.y;

public class SwitchPreference extends TwoStatePreference {

    /* renamed from: R  reason: collision with root package name */
    public final C0098a f1941R = new C0098a(this, 1);

    /* renamed from: S  reason: collision with root package name */
    public final String f1942S;

    /* renamed from: T  reason: collision with root package name */
    public final String f1943T;

    public final void y(View view) {
        boolean z2 = view instanceof Switch;
        if (z2) {
            ((Switch) view).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f1947M);
        }
        if (z2) {
            Switch switchR = (Switch) view;
            switchR.setTextOn(this.f1942S);
            switchR.setTextOff(this.f1943T);
            switchR.setOnCheckedChangeListener(this.f1941R);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130969688(0x7f040458, float:1.7548065E38)
            r1 = 16843629(0x101036d, float:2.3696016E-38)
            int r0 = E.b.b(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            g0.a r1 = new g0.a
            r2 = 1
            r1.<init>(r3, r2)
            r3.f1941R = r1
            int[] r1 = g0.z.f2630l
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            r5 = 7
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L_0x0027
            java.lang.String r5 = r4.getString(r2)
        L_0x0027:
            r3.f1948N = r5
            boolean r5 = r3.f1947M
            if (r5 == 0) goto L_0x0030
            r3.g()
        L_0x0030:
            r5 = 6
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L_0x003c
            r5 = 1
            java.lang.String r5 = r4.getString(r5)
        L_0x003c:
            r3.f1949O = r5
            boolean r5 = r3.f1947M
            if (r5 != 0) goto L_0x0045
            r3.g()
        L_0x0045:
            r5 = 9
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L_0x0052
            r5 = 3
            java.lang.String r5 = r4.getString(r5)
        L_0x0052:
            r3.f1942S = r5
            r3.g()
            r5 = 8
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L_0x0064
            r5 = 4
            java.lang.String r5 = r4.getString(r5)
        L_0x0064:
            r3.f1943T = r5
            r3.g()
            r5 = 2
            boolean r5 = r4.getBoolean(r5, r2)
            r0 = 5
            boolean r5 = r4.getBoolean(r0, r5)
            r3.f1951Q = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.SwitchPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void k(y yVar) {
        super.k(yVar);
        y(yVar.r(16908352));
        x(yVar.r(16908304));
    }

    public final void r(View view) {
        super.r(view);
        if (((AccessibilityManager) this.f1898a.getSystemService("accessibility")).isEnabled()) {
            y(view.findViewById(16908352));
            x(view.findViewById(16908304));
        }
    }
}
