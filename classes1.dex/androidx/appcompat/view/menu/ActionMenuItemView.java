package androidx.appcompat.view.menu;

import T0.g;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import g.C0096a;
import n.C0187b;
import n.C0188c;
import n.C0196k;
import n.C0197l;
import n.C0199n;
import n.C0210y;
import o.C0273d0;
import o.C0288l;

public class ActionMenuItemView extends C0273d0 implements C0210y, View.OnClickListener, C0288l {

    /* renamed from: m  reason: collision with root package name */
    public C0199n f1222m;

    /* renamed from: n  reason: collision with root package name */
    public CharSequence f1223n;

    /* renamed from: o  reason: collision with root package name */
    public Drawable f1224o;

    /* renamed from: p  reason: collision with root package name */
    public C0196k f1225p;

    /* renamed from: q  reason: collision with root package name */
    public C0187b f1226q;

    /* renamed from: r  reason: collision with root package name */
    public C0188c f1227r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1228s = h();

    /* renamed from: t  reason: collision with root package name */
    public boolean f1229t;

    /* renamed from: u  reason: collision with root package name */
    public final int f1230u;

    /* renamed from: v  reason: collision with root package name */
    public int f1231v;

    /* renamed from: w  reason: collision with root package name */
    public final int f1232w;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0096a.f2521c, 0, 0);
        this.f1230u = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f1232w = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1231v = -1;
        setSaveEnabled(false);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public final void a(C0199n nVar) {
        int i;
        this.f1222m = nVar;
        setIcon(nVar.getIcon());
        setTitle(nVar.getTitleCondensed());
        setId(nVar.f3900a);
        if (nVar.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        setEnabled(nVar.isEnabled());
        if (nVar.hasSubMenu() && this.f1226q == null) {
            this.f1226q = new C0187b(this);
        }
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public C0199n getItemData() {
        return this.f1222m;
    }

    public final void i() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f1223n);
        if (this.f1224o != null && ((this.f1222m.f3922y & 4) != 4 || (!this.f1228s && !this.f1229t))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        CharSequence charSequence3 = null;
        if (z4) {
            charSequence = this.f1223n;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.f1222m.f3914q;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z4) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f1222m.e;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.f1222m.f3915r;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z4) {
                charSequence3 = this.f1222m.e;
            }
            g.N(this, charSequence3);
            return;
        }
        g.N(this, charSequence5);
    }

    public final void onClick(View view) {
        C0196k kVar = this.f1225p;
        if (kVar != null) {
            kVar.c(this.f1222m);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0187b bVar;
        if (!this.f1222m.hasSubMenu() || (bVar = this.f1226q) == null || !bVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f1229t != z2) {
            this.f1229t = z2;
            C0199n nVar = this.f1222m;
            if (nVar != null) {
                C0197l lVar = nVar.f3911n;
                lVar.f3880k = true;
                lVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1224o = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1232w;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        i();
    }

    public void setItemInvoker(C0196k kVar) {
        this.f1225p = kVar;
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f1231v = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0188c cVar) {
        this.f1227r = cVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1223n = charSequence;
        i();
    }

    public final boolean b() {
        if (TextUtils.isEmpty(getText()) || this.f1222m.getIcon() != null) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i >= 480 || ((i >= 640 && i2 >= 480) || configuration.orientation == 2)) {
            return true;
        }
        return false;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1228s = h();
        i();
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i4 = this.f1231v) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i5 = this.f1230u;
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, i5);
        } else {
            i3 = i5;
        }
        if (mode != 1073741824 && i5 > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (isEmpty && this.f1224o != null) {
            super.setPadding((getMeasuredWidth() - this.f1224o.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }
}
