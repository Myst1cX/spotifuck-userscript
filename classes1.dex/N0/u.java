package N0;

import N.Q;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.C0273d0;
import p0.C0320a;
import r0.C0324a;

public final class u {

    /* renamed from: A  reason: collision with root package name */
    public ColorStateList f685A;

    /* renamed from: B  reason: collision with root package name */
    public Typeface f686B;

    /* renamed from: a  reason: collision with root package name */
    public final int f687a;

    /* renamed from: b  reason: collision with root package name */
    public final int f688b;

    /* renamed from: c  reason: collision with root package name */
    public final int f689c;

    /* renamed from: d  reason: collision with root package name */
    public final TimeInterpolator f690d;
    public final TimeInterpolator e;

    /* renamed from: f  reason: collision with root package name */
    public final TimeInterpolator f691f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f692g;

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout f693h;
    public LinearLayout i;

    /* renamed from: j  reason: collision with root package name */
    public int f694j;

    /* renamed from: k  reason: collision with root package name */
    public FrameLayout f695k;

    /* renamed from: l  reason: collision with root package name */
    public AnimatorSet f696l;

    /* renamed from: m  reason: collision with root package name */
    public final float f697m;

    /* renamed from: n  reason: collision with root package name */
    public int f698n;

    /* renamed from: o  reason: collision with root package name */
    public int f699o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f700p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f701q;

    /* renamed from: r  reason: collision with root package name */
    public C0273d0 f702r;

    /* renamed from: s  reason: collision with root package name */
    public CharSequence f703s;

    /* renamed from: t  reason: collision with root package name */
    public int f704t;

    /* renamed from: u  reason: collision with root package name */
    public int f705u;

    /* renamed from: v  reason: collision with root package name */
    public ColorStateList f706v;

    /* renamed from: w  reason: collision with root package name */
    public CharSequence f707w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f708x;

    /* renamed from: y  reason: collision with root package name */
    public C0273d0 f709y;

    /* renamed from: z  reason: collision with root package name */
    public int f710z;

    public final void d(ArrayList arrayList, boolean z2, C0273d0 d0Var, int i2, int i3, int i4) {
        boolean z3;
        float f2;
        long j2;
        TimeInterpolator timeInterpolator;
        if (d0Var != null && z2) {
            if (i2 == i4 || i2 == i3) {
                if (i4 == i2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(d0Var, View.ALPHA, new float[]{f2});
                int i5 = this.f689c;
                if (z3) {
                    j2 = (long) this.f688b;
                } else {
                    j2 = (long) i5;
                }
                ofFloat.setDuration(j2);
                if (z3) {
                    timeInterpolator = this.e;
                } else {
                    timeInterpolator = this.f691f;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i2 == i4 && i3 != 0) {
                    ofFloat.setStartDelay((long) i5);
                }
                arrayList.add(ofFloat);
                if (i4 == i2 && i3 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(d0Var, View.TRANSLATION_Y, new float[]{-this.f697m, 0.0f});
                    ofFloat2.setDuration((long) this.f687a);
                    ofFloat2.setInterpolator(this.f690d);
                    ofFloat2.setStartDelay((long) i5);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final TextView e(int i2) {
        if (i2 == 1) {
            return this.f702r;
        }
        if (i2 != 2) {
            return null;
        }
        return this.f709y;
    }

    public final void f() {
        this.f700p = null;
        c();
        if (this.f698n == 1) {
            if (!this.f708x || TextUtils.isEmpty(this.f707w)) {
                this.f699o = 0;
            } else {
                this.f699o = 2;
            }
        }
        i(this.f698n, this.f699o, h(this.f702r, ""));
    }

    public final void a(C0273d0 d0Var, int i2) {
        if (this.i == null && this.f695k == null) {
            Context context = this.f692g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.f693h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f695k = new FrameLayout(context);
            this.i.addView(this.f695k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i2 == 0 || i2 == 1) {
            this.f695k.setVisibility(0);
            this.f695k.addView(d0Var);
        } else {
            this.i.addView(d0Var, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f694j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.f693h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f692g;
                boolean d02 = C0320a.d0(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap weakHashMap = Q.f509a;
                int paddingStart = editText.getPaddingStart();
                if (d02) {
                    paddingStart = context.getResources().getDimensionPixelSize(2131165758);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165757);
                if (d02) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165759);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (d02) {
                    paddingEnd = context.getResources().getDimensionPixelSize(2131165758);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f696l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void g(C0273d0 d0Var, int i2) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout != null) {
            if ((i2 == 0 || i2 == 1) && (frameLayout = this.f695k) != null) {
                frameLayout.removeView(d0Var);
            } else {
                linearLayout.removeView(d0Var);
            }
            int i3 = this.f694j - 1;
            this.f694j = i3;
            LinearLayout linearLayout2 = this.i;
            if (i3 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public final boolean h(C0273d0 d0Var, CharSequence charSequence) {
        WeakHashMap weakHashMap = Q.f509a;
        TextInputLayout textInputLayout = this.f693h;
        if (!textInputLayout.isLaidOut() || !textInputLayout.isEnabled() || (this.f699o == this.f698n && d0Var != null && TextUtils.equals(d0Var.getText(), charSequence))) {
            return false;
        }
        return true;
    }

    public final void i(int i2, int i3, boolean z2) {
        TextView e2;
        TextView e3;
        int i4 = i2;
        int i5 = i3;
        boolean z3 = z2;
        if (i4 != i5) {
            if (z3) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f696l = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i6 = i2;
                int i7 = i3;
                d(arrayList2, this.f708x, this.f709y, 2, i6, i7);
                d(arrayList2, this.f701q, this.f702r, 1, i6, i7);
                int size = arrayList.size();
                long j2 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    Animator animator = (Animator) arrayList.get(i8);
                    j2 = Math.max(j2, animator.getDuration() + animator.getStartDelay());
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
                ofInt.setDuration(j2);
                arrayList.add(0, ofInt);
                animatorSet.playTogether(arrayList);
                animatorSet.addListener(new s(this, i3, e(i2), i2, e(i5)));
                animatorSet.start();
            } else if (i4 != i5) {
                if (!(i5 == 0 || (e3 = e(i5)) == null)) {
                    e3.setVisibility(0);
                    e3.setAlpha(1.0f);
                }
                if (!(i4 == 0 || (e2 = e(i2)) == null)) {
                    e2.setVisibility(4);
                    if (i4 == 1) {
                        e2.setText((CharSequence) null);
                    }
                }
                this.f698n = i5;
            }
            TextInputLayout textInputLayout = this.f693h;
            textInputLayout.r();
            textInputLayout.u(z3, false);
            textInputLayout.x();
        }
    }

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f692g = context;
        this.f693h = textInputLayout;
        this.f697m = (float) context.getResources().getDimensionPixelSize(2131165325);
        this.f687a = C0320a.q0(context, 2130969432, 217);
        this.f688b = C0320a.q0(context, 2130969428, 167);
        this.f689c = C0320a.q0(context, 2130969432, 167);
        this.f690d = C0320a.r0(context, 2130969437, C0324a.f4558d);
        LinearInterpolator linearInterpolator = C0324a.f4555a;
        this.e = C0320a.r0(context, 2130969437, linearInterpolator);
        this.f691f = C0320a.r0(context, 2130969440, linearInterpolator);
    }
}
