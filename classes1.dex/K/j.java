package K;

import O.u;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import h.C0115f;
import h.C0118i;

public final class j implements u {

    /* renamed from: f  reason: collision with root package name */
    public int f332f;

    /* renamed from: g  reason: collision with root package name */
    public Object f333g;

    public j() {
        this.f333g = new int[10];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: h.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: android.widget.ArrayAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: h.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: h.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: h.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h.C0118i a() {
        /*
            r14 = this;
            h.i r0 = new h.i
            java.lang.Object r1 = r14.f333g
            h.f r1 = (h.C0115f) r1
            android.view.ContextThemeWrapper r2 = r1.f2962a
            int r3 = r14.f332f
            r0.<init>(r2, r3)
            android.view.View r2 = r1.e
            h.h r8 = r0.f3012k
            r9 = 0
            if (r2 == 0) goto L_0x0017
            r8.f3007w = r2
            goto L_0x0036
        L_0x0017:
            java.lang.CharSequence r2 = r1.f2965d
            if (r2 == 0) goto L_0x0024
            r8.f2990d = r2
            android.widget.TextView r3 = r8.f3005u
            if (r3 == 0) goto L_0x0024
            r3.setText(r2)
        L_0x0024:
            android.graphics.drawable.Drawable r2 = r1.f2964c
            if (r2 == 0) goto L_0x0036
            r8.f3003s = r2
            android.widget.ImageView r3 = r8.f3004t
            if (r3 == 0) goto L_0x0036
            r3.setVisibility(r9)
            android.widget.ImageView r3 = r8.f3004t
            r3.setImageDrawable(r2)
        L_0x0036:
            java.lang.CharSequence r2 = r1.f2966f
            if (r2 == 0) goto L_0x0043
            r8.e = r2
            android.widget.TextView r3 = r8.f3006v
            if (r3 == 0) goto L_0x0043
            r3.setText(r2)
        L_0x0043:
            java.lang.CharSequence r2 = r1.f2967g
            if (r2 != 0) goto L_0x0048
            goto L_0x004e
        L_0x0048:
            android.content.DialogInterface$OnClickListener r3 = r1.f2968h
            r4 = -1
            r8.d(r4, r2, r3)
        L_0x004e:
            java.lang.CharSequence r2 = r1.i
            if (r2 != 0) goto L_0x0053
            goto L_0x0059
        L_0x0053:
            android.content.DialogInterface$OnClickListener r3 = r1.f2969j
            r4 = -2
            r8.d(r4, r2, r3)
        L_0x0059:
            java.lang.CharSequence[] r2 = r1.f2971l
            r10 = 1
            r11 = 0
            if (r2 != 0) goto L_0x0063
            java.lang.Object r2 = r1.f2972m
            if (r2 == 0) goto L_0x00ca
        L_0x0063:
            int r2 = r8.f2980A
            android.view.LayoutInflater r3 = r1.f2963b
            android.view.View r2 = r3.inflate(r2, r11)
            r12 = r2
            androidx.appcompat.app.AlertController$RecycleListView r12 = (androidx.appcompat.app.AlertController$RecycleListView) r12
            boolean r2 = r1.f2976q
            android.view.ContextThemeWrapper r4 = r1.f2962a
            if (r2 == 0) goto L_0x0081
            h.c r13 = new h.c
            java.lang.CharSequence[] r6 = r1.f2971l
            int r5 = r8.f2981B
            r2 = r13
            r3 = r1
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x0099
        L_0x0081:
            boolean r2 = r1.f2977r
            if (r2 == 0) goto L_0x0088
            int r2 = r8.f2982C
            goto L_0x008a
        L_0x0088:
            int r2 = r8.f2983D
        L_0x008a:
            java.lang.Object r13 = r1.f2972m
            if (r13 == 0) goto L_0x008f
            goto L_0x0099
        L_0x008f:
            h.g r13 = new h.g
            java.lang.CharSequence[] r3 = r1.f2971l
            r5 = 16908308(0x1020014, float:2.3877285E-38)
            r13.<init>(r4, r2, r5, r3)
        L_0x0099:
            r8.f3008x = r13
            int r2 = r1.f2978s
            r8.f3009y = r2
            android.content.DialogInterface$OnClickListener r2 = r1.f2973n
            if (r2 == 0) goto L_0x00ac
            h.d r2 = new h.d
            r2.<init>(r1, r8)
            r12.setOnItemClickListener(r2)
            goto L_0x00b8
        L_0x00ac:
            g0.j r2 = r1.f2979t
            if (r2 == 0) goto L_0x00b8
            h.e r2 = new h.e
            r2.<init>(r1, r12, r8)
            r12.setOnItemClickListener(r2)
        L_0x00b8:
            boolean r2 = r1.f2977r
            if (r2 == 0) goto L_0x00c0
            r12.setChoiceMode(r10)
            goto L_0x00c8
        L_0x00c0:
            boolean r2 = r1.f2976q
            if (r2 == 0) goto L_0x00c8
            r2 = 2
            r12.setChoiceMode(r2)
        L_0x00c8:
            r8.f2991f = r12
        L_0x00ca:
            android.view.View r2 = r1.f2974o
            if (r2 == 0) goto L_0x00d2
            r8.f2992g = r2
            r8.f2993h = r9
        L_0x00d2:
            r0.setCancelable(r10)
            r0.setCanceledOnTouchOutside(r10)
            r0.setOnCancelListener(r11)
            r0.setOnDismissListener(r11)
            n.m r1 = r1.f2970k
            if (r1 == 0) goto L_0x00e5
            r0.setOnKeyListener(r1)
        L_0x00e5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K.j.a():h.i");
    }

    public int b() {
        if ((this.f332f & 128) != 0) {
            return ((int[]) this.f333g)[7];
        }
        return 65535;
    }

    public boolean c(View view) {
        ((BottomSheetBehavior) this.f333g).B(this.f332f);
        return true;
    }

    public void d(int i, int i2) {
        if (i >= 0) {
            int[] iArr = (int[]) this.f333g;
            if (i < iArr.length) {
                this.f332f = (1 << i) | this.f332f;
                iArr[i] = i2;
            }
        }
    }

    public j(Context context) {
        int h2 = C0118i.h(context, 0);
        this.f333g = new C0115f(new ContextThemeWrapper(context, C0118i.h(context, h2)));
        this.f332f = h2;
    }

    public j(int i, k[] kVarArr) {
        this.f332f = i;
        this.f333g = kVarArr;
    }

    public j(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.f333g = bottomSheetBehavior;
        this.f332f = i;
    }
}
