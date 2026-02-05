package h;

import E.j;
import N.G;
import N.Q;
import R0.i;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.activity.o;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
import o.C0317z0;
import p0.C0320a;

/* renamed from: h.i  reason: case insensitive filesystem */
public final class C0118i extends o implements DialogInterface, C0122m {
    public D i;

    /* renamed from: j  reason: collision with root package name */
    public final E f3011j;

    /* renamed from: k  reason: collision with root package name */
    public final C0117h f3012k;

    public final void onCreate(Bundle bundle) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        ListAdapter listAdapter;
        int i3;
        int i4;
        int i5;
        View view;
        View findViewById;
        g(bundle);
        C0117h hVar = this.f3012k;
        hVar.f2988b.setContentView(hVar.f3010z);
        Window window = hVar.f2989c;
        View findViewById2 = window.findViewById(2131296624);
        View findViewById3 = findViewById2.findViewById(2131296761);
        View findViewById4 = findViewById2.findViewById(2131296394);
        View findViewById5 = findViewById2.findViewById(2131296365);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(2131296405);
        View view2 = hVar.f2992g;
        if (view2 == null) {
            view2 = null;
        }
        if (view2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !C0117h.a(view2)) {
            window.setFlags(131072, 131072);
        }
        if (z2) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(2131296404);
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (hVar.f2993h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (hVar.f2991f != null) {
                ((C0317z0) viewGroup.getLayoutParams()).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(2131296761);
        View findViewById7 = viewGroup.findViewById(2131296394);
        View findViewById8 = viewGroup.findViewById(2131296365);
        ViewGroup c2 = C0117h.c(findViewById6, findViewById3);
        ViewGroup c3 = C0117h.c(findViewById7, findViewById4);
        ViewGroup c4 = C0117h.c(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(2131296663);
        hVar.f3002r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        hVar.f3002r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) c3.findViewById(16908299);
        hVar.f3006v = textView;
        if (textView != null) {
            CharSequence charSequence = hVar.e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                hVar.f3002r.removeView(hVar.f3006v);
                if (hVar.f2991f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) hVar.f3002r.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(hVar.f3002r);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(hVar.f2991f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    c3.setVisibility(8);
                }
            }
        }
        Button button = (Button) c4.findViewById(16908313);
        hVar.i = button;
        i iVar = hVar.f2986G;
        button.setOnClickListener(iVar);
        if (TextUtils.isEmpty(hVar.f2994j)) {
            hVar.i.setVisibility(8);
            z3 = false;
        } else {
            hVar.i.setText(hVar.f2994j);
            hVar.i.setVisibility(0);
            z3 = true;
        }
        Button button2 = (Button) c4.findViewById(16908314);
        hVar.f2996l = button2;
        button2.setOnClickListener(iVar);
        if (TextUtils.isEmpty(hVar.f2997m)) {
            hVar.f2996l.setVisibility(8);
        } else {
            hVar.f2996l.setText(hVar.f2997m);
            hVar.f2996l.setVisibility(0);
            z3 |= true;
        }
        Button button3 = (Button) c4.findViewById(16908315);
        hVar.f2999o = button3;
        button3.setOnClickListener(iVar);
        if (TextUtils.isEmpty(hVar.f3000p)) {
            hVar.f2999o.setVisibility(8);
        } else {
            hVar.f2999o.setText(hVar.f3000p);
            hVar.f2999o.setVisibility(0);
            z3 |= true;
        }
        TypedValue typedValue = new TypedValue();
        hVar.f2987a.getTheme().resolveAttribute(2130968621, typedValue, true);
        if (typedValue.data != 0) {
            if (z3) {
                Button button4 = hVar.i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (z3) {
                Button button5 = hVar.f2996l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (z3) {
                Button button6 = hVar.f2999o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (!z3) {
            c4.setVisibility(8);
        }
        if (hVar.f3007w != null) {
            c2.addView(hVar.f3007w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(2131296757).setVisibility(8);
        } else {
            hVar.f3004t = (ImageView) window.findViewById(16908294);
            if (TextUtils.isEmpty(hVar.f2990d) || !hVar.f2984E) {
                window.findViewById(2131296757).setVisibility(8);
                hVar.f3004t.setVisibility(8);
                c2.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(2131296329);
                hVar.f3005u = textView2;
                textView2.setText(hVar.f2990d);
                Drawable drawable = hVar.f3003s;
                if (drawable != null) {
                    hVar.f3004t.setImageDrawable(drawable);
                } else {
                    hVar.f3005u.setPadding(hVar.f3004t.getPaddingLeft(), hVar.f3004t.getPaddingTop(), hVar.f3004t.getPaddingRight(), hVar.f3004t.getPaddingBottom());
                    hVar.f3004t.setVisibility(8);
                }
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c2 == null || c2.getVisibility() == 8) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (c4.getVisibility() != 8) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5 && (findViewById = c3.findViewById(2131296741)) != null) {
            findViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = hVar.f3002r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (hVar.e == null && hVar.f2991f == null) {
                view = null;
            } else {
                view = c2.findViewById(2131296756);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else {
            View findViewById9 = c3.findViewById(2131296742);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = hVar.f2991f;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z5 || i2 == 0) {
                int paddingLeft = alertController$RecycleListView.getPaddingLeft();
                if (i2 != 0) {
                    i4 = alertController$RecycleListView.getPaddingTop();
                } else {
                    i4 = alertController$RecycleListView.f1220f;
                }
                int paddingRight = alertController$RecycleListView.getPaddingRight();
                if (z5) {
                    i5 = alertController$RecycleListView.getPaddingBottom();
                } else {
                    i5 = alertController$RecycleListView.f1221g;
                }
                alertController$RecycleListView.setPadding(paddingLeft, i4, paddingRight, i5);
            }
        }
        if (!z4) {
            View view3 = hVar.f2991f;
            if (view3 == null) {
                view3 = hVar.f3002r;
            }
            if (view3 != null) {
                if (z5) {
                    i3 = 2;
                } else {
                    i3 = 0;
                }
                int i6 = i2 | i3;
                View findViewById10 = window.findViewById(2131296662);
                View findViewById11 = window.findViewById(2131296661);
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 23) {
                    WeakHashMap weakHashMap = Q.f509a;
                    if (i7 >= 23) {
                        G.d(view3, i6, 3);
                    }
                    if (findViewById10 != null) {
                        c3.removeView(findViewById10);
                    }
                    if (findViewById11 != null) {
                        c3.removeView(findViewById11);
                    }
                } else {
                    if (findViewById10 != null && (i6 & 1) == 0) {
                        c3.removeView(findViewById10);
                        findViewById10 = null;
                    }
                    if (findViewById11 != null && (2 & i6) == 0) {
                        c3.removeView(findViewById11);
                        findViewById11 = null;
                    }
                    if (!(findViewById10 == null && findViewById11 == null)) {
                        if (hVar.e != null) {
                            hVar.f3002r.setOnScrollChangeListener(new j((Object) findViewById10, (Object) findViewById11, 13));
                            hVar.f3002r.post(new C0110a(hVar, findViewById10, findViewById11, 0));
                        } else {
                            AlertController$RecycleListView alertController$RecycleListView2 = hVar.f2991f;
                            if (alertController$RecycleListView2 != null) {
                                alertController$RecycleListView2.setOnScrollListener(new C0111b(findViewById10, findViewById11));
                                hVar.f2991f.post(new C0110a(hVar, findViewById10, findViewById11, 1));
                            } else {
                                if (findViewById10 != null) {
                                    c3.removeView(findViewById10);
                                }
                                if (findViewById11 != null) {
                                    c3.removeView(findViewById11);
                                }
                            }
                        }
                    }
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView3 = hVar.f2991f;
        if (alertController$RecycleListView3 != null && (listAdapter = hVar.f3008x) != null) {
            alertController$RecycleListView3.setAdapter(listAdapter);
            int i8 = hVar.f3009y;
            if (i8 > -1) {
                alertController$RecycleListView3.setItemChecked(i8, true);
                alertController$RecycleListView3.setSelection(i8);
            }
        }
    }

    public final void setContentView(int i2) {
        e();
        f().h(i2);
    }

    public final void setTitle(int i2) {
        super.setTitle(i2);
        f().k(getContext().getString(i2));
    }

    public static int h(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968623, typedValue, true);
        return typedValue.resourceId;
    }

    public final s f() {
        if (this.i == null) {
            q qVar = s.f3028f;
            this.i = new D(getContext(), getWindow(), this, this);
        }
        return this.i;
    }

    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f3012k.f3002r;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i2, keyEvent);
        }
        return true;
    }

    public final boolean onKeyUp(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f3012k.f3002r;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i2, keyEvent);
        }
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0118i(android.view.ContextThemeWrapper r5, int r6) {
        /*
            r4 = this;
            int r6 = h(r5, r6)
            r0 = 1
            r1 = 2130968972(0x7f04018c, float:1.7546613E38)
            if (r6 != 0) goto L_0x0019
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L_0x001a
        L_0x0019:
            r2 = r6
        L_0x001a:
            r4.<init>(r5, r2)
            h.E r2 = new h.E
            r2.<init>(r4)
            r4.f3011j = r2
            h.s r2 = r4.f()
            if (r6 != 0) goto L_0x0038
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L_0x0038:
            r5 = r2
            h.D r5 = (h.D) r5
            r5.f2875Z = r6
            r2.b()
            h.h r5 = new h.h
            android.content.Context r6 = r4.getContext()
            android.view.Window r0 = r4.getWindow()
            r5.<init>(r6, r4, r0)
            r4.f3012k = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.C0118i.<init>(android.view.ContextThemeWrapper, int):void");
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        D d2 = (D) f();
        d2.u();
        ((ViewGroup) d2.f2857G.findViewById(16908290)).addView(view, layoutParams);
        d2.f2891r.a(d2.f2890q.getCallback());
    }

    public final void dismiss() {
        super.dismiss();
        f().c();
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0320a.C(this.f3011j, getWindow().getDecorView(), this, keyEvent);
    }

    public final View findViewById(int i2) {
        D d2 = (D) f();
        d2.u();
        return d2.f2890q.findViewById(i2);
    }

    public final void g(Bundle bundle) {
        D d2 = (D) f();
        LayoutInflater from = LayoutInflater.from(d2.f2889p);
        if (from.getFactory() == null) {
            from.setFactory2(d2);
        } else {
            boolean z2 = from.getFactory2() instanceof D;
        }
        super.onCreate(bundle);
        f().b();
    }

    public final void i(CharSequence charSequence) {
        super.setTitle(charSequence);
        f().k(charSequence);
    }

    public final void invalidateOptionsMenu() {
        D d2 = (D) f();
        if (d2.f2893t != null) {
            d2.z();
            d2.f2893t.getClass();
            d2.A(0);
        }
    }

    public final boolean j(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void onStop() {
        super.onStop();
        D d2 = (D) f();
        d2.z();
        N n2 = d2.f2893t;
        if (n2 != null) {
            n2.f2930E = false;
            m.j jVar = n2.f2929D;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    public final void setContentView(View view) {
        e();
        f().i(view);
    }

    public final void setTitle(CharSequence charSequence) {
        i(charSequence);
        C0117h hVar = this.f3012k;
        hVar.f2990d = charSequence;
        TextView textView = hVar.f3005u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        f().j(view, layoutParams);
    }
}
