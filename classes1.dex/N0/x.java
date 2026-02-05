package N0;

import E0.m;
import K0.g;
import P0.a;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;
import o.C0294o;
import o.H0;
import p0.C0320a;
import q0.C0322a;

public final class x extends C0294o {

    /* renamed from: j  reason: collision with root package name */
    public final H0 f716j;

    /* renamed from: k  reason: collision with root package name */
    public final AccessibilityManager f717k;

    /* renamed from: l  reason: collision with root package name */
    public final Rect f718l = new Rect();

    /* renamed from: m  reason: collision with root package name */
    public final int f719m;

    /* renamed from: n  reason: collision with root package name */
    public final float f720n;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f721o;

    /* renamed from: p  reason: collision with root package name */
    public int f722p;

    /* renamed from: q  reason: collision with root package name */
    public ColorStateList f723q;

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f717k;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            if (!(accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null)) {
                for (AccessibilityServiceInfo next : enabledAccessibilityServiceList) {
                    if (next.getSettingsActivityName() == null || !next.getSettingsActivityName().contains("SwitchAccess")) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f721o;
    }

    public float getPopupElevation() {
        return this.f720n;
    }

    public int getSimpleItemSelectedColor() {
        return this.f722p;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f723q;
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f721o = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof g) {
            ((g) dropDownBackground).j(this.f721o);
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f722p = i;
        if (getAdapter() instanceof w) {
            ((w) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f723q = colorStateList;
        if (getAdapter() instanceof w) {
            ((w) getAdapter()).a();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new w(this, getContext(), this.f719m, strArr));
    }

    public x(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 2130968648, 0), attributeSet);
        Context context2 = getContext();
        TypedArray f2 = m.f(context2, attributeSet, C0322a.i, 2130968648, 2131821334, new int[0]);
        if (f2.hasValue(0) && f2.getInt(0, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f719m = f2.getResourceId(3, 2131492939);
        this.f720n = (float) f2.getDimensionPixelOffset(1, 2131165859);
        if (f2.hasValue(2)) {
            this.f721o = ColorStateList.valueOf(f2.getColor(2, 0));
        }
        this.f722p = f2.getColor(4, 0);
        this.f723q = C0320a.J(context2, f2, 5);
        this.f717k = (AccessibilityManager) context2.getSystemService("accessibility");
        H0 h02 = new H0(context2, (AttributeSet) null, 2130969326);
        this.f716j = h02;
        h02.f4072D = true;
        h02.f4073E.setFocusable(true);
        h02.f4087t = this;
        h02.f4073E.setInputMethodMode(2);
        h02.n(getAdapter());
        h02.f4088u = new v(0, this);
        if (f2.hasValue(6)) {
            setSimpleItems(f2.getResourceId(6, 0));
        }
        f2.recycle();
    }

    public static void a(x xVar, Object obj) {
        xVar.setText(xVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final void dismissDropDown() {
        if (c()) {
            this.f716j.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public CharSequence getHint() {
        TextInputLayout b2 = b();
        if (b2 == null || !b2.f2350J) {
            return super.getHint();
        }
        return b2.getHint();
    }

    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        TextInputLayout b2 = b();
        if (b2 != null && b2.f2350J && super.getHint() == null) {
            String str2 = Build.MANUFACTURER;
            if (str2 != null) {
                str = str2.toLowerCase(Locale.ENGLISH);
            } else {
                str = "";
            }
            if (str.equals("meizu")) {
                setHint("");
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f716j.dismiss();
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b2 = b();
            int i4 = 0;
            if (!(adapter == null || b2 == null)) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                H0 h02 = this.f716j;
                if (!h02.f4073E.isShowing()) {
                    i3 = -1;
                } else {
                    i3 = h02.f4076h.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, i3) + 15);
                View view = null;
                int i5 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i4) {
                        view = null;
                        i4 = itemViewType;
                    }
                    view = adapter.getView(max, view, b2);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i5 = Math.max(i5, view.getMeasuredWidth());
                }
                Drawable background = h02.f4073E.getBackground();
                if (background != null) {
                    Rect rect = this.f718l;
                    background.getPadding(rect);
                    i5 += rect.left + rect.right;
                }
                i4 = b2.getEndIconView().getMeasuredWidth() + i5;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i4), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public final void onWindowFocusChanged(boolean z2) {
        if (!c()) {
            super.onWindowFocusChanged(z2);
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t2) {
        super.setAdapter(t2);
        this.f716j.n(getAdapter());
    }

    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        H0 h02 = this.f716j;
        if (h02 != null) {
            h02.k(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f716j.f4089v = getOnItemSelectedListener();
    }

    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout b2 = b();
        if (b2 != null) {
            b2.s();
        }
    }

    public final void showDropDown() {
        if (c()) {
            this.f716j.i();
        } else {
            super.showDropDown();
        }
    }
}
