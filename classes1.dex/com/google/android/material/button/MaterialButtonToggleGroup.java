package com.google.android.material.button;

import E0.a;
import E0.m;
import K0.j;
import K0.k;
import N.Q;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.f;
import j0.C0160w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import q0.C0322a;
import w0.C0352a;
import w0.d;
import w0.e;

public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ int f2177p = 0;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f2178f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final C0160w f2179g = new C0160w(this);

    /* renamed from: h  reason: collision with root package name */
    public final LinkedHashSet f2180h = new LinkedHashSet();
    public final d i = new d(this);

    /* renamed from: j  reason: collision with root package name */
    public Integer[] f2181j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2182k = false;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2183l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2184m;

    /* renamed from: n  reason: collision with root package name */
    public final int f2185n;

    /* renamed from: o  reason: collision with root package name */
    public HashSet f2186o = new HashSet();

    private int getVisibleButtonCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if ((getChildAt(i3) instanceof MaterialButton) && c(i3)) {
                i2++;
            }
        }
        return i2;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f2179g);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void b(int i2, boolean z2) {
        if (i2 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i2);
            return;
        }
        HashSet hashSet = new HashSet(this.f2186o);
        if (z2 && !hashSet.contains(Integer.valueOf(i2))) {
            if (this.f2183l && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i2));
        } else if (!z2 && hashSet.contains(Integer.valueOf(i2))) {
            if (!this.f2184m || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i2));
            }
        } else {
            return;
        }
        d(hashSet);
    }

    public void setSingleSelection(boolean z2) {
        if (this.f2183l != z2) {
            this.f2183l = z2;
            d(new HashSet());
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((MaterialButton) getChildAt(i2)).setA11yClassName((this.f2183l ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i2, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.f2174t);
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f2178f.add(new e(shapeAppearanceModel.e, shapeAppearanceModel.f411h, shapeAppearanceModel.f409f, shapeAppearanceModel.f410g));
        materialButton.setEnabled(isEnabled());
        Q.p(materialButton, new a(4, this));
    }

    public final void d(Set set) {
        HashSet hashSet = this.f2186o;
        this.f2186o = new HashSet(set);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = ((MaterialButton) getChildAt(i2)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f2182k = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f2182k = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it2 = this.f2180h.iterator();
                while (it2.hasNext()) {
                    ((f) it2.next()).a();
                }
            }
        }
        invalidate();
    }

    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            treeMap.put((MaterialButton) getChildAt(i2), Integer.valueOf(i2));
        }
        this.f2181j = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public int getCheckedButtonId() {
        if (!this.f2183l || this.f2186o.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f2186o.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = ((MaterialButton) getChildAt(i2)).getId();
            if (this.f2186o.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    public final int getChildDrawingOrder(int i2, int i3) {
        Integer[] numArr = this.f2181j;
        if (numArr != null && i3 < numArr.length) {
            return numArr[i3].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i3;
    }

    public void setSelectionRequired(boolean z2) {
        this.f2184m = z2;
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(P0.a.a(context, attributeSet, 2130969350, 2131821634), attributeSet, 2130969350);
        TypedArray f2 = m.f(getContext(), attributeSet, C0322a.f4492k, 2130969350, 2131821634, new int[0]);
        setSingleSelection(f2.getBoolean(3, false));
        this.f2185n = f2.getResourceId(1, -1);
        this.f2184m = f2.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(f2.getBoolean(0, true));
        f2.recycle();
        WeakHashMap weakHashMap = Q.f509a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (c(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = Q.f509a;
            materialButton.setId(View.generateViewId());
        }
    }

    public final void a() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i2 - 1)).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams2 = materialButton.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (LinearLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                }
                if (getOrientation() == 0) {
                    layoutParams.setMarginEnd(0);
                    layoutParams.setMarginStart(-min);
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = -min;
                    layoutParams.setMarginStart(0);
                }
                materialButton.setLayoutParams(layoutParams);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                    return;
                }
                layoutParams3.setMarginEnd(0);
                layoutParams3.setMarginStart(0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    public final boolean c(int i2) {
        if (getChildAt(i2).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final void e() {
        boolean z2;
        e eVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i2 = 0; i2 < childCount; i2++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i2);
            if (materialButton.getVisibility() != 8) {
                j e = materialButton.getShapeAppearanceModel().e();
                e eVar2 = (e) this.f2178f.get(i2);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    if (getOrientation() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    K0.a aVar = e.e;
                    if (i2 == firstVisibleChildIndex) {
                        if (!z2) {
                            eVar = new e(eVar2.f4923a, aVar, eVar2.f4924b, aVar);
                        } else if (m.e(this)) {
                            eVar = new e(aVar, aVar, eVar2.f4924b, eVar2.f4925c);
                        } else {
                            eVar = new e(eVar2.f4923a, eVar2.f4926d, aVar, aVar);
                        }
                    } else if (i2 != lastVisibleChildIndex) {
                        eVar2 = null;
                    } else if (!z2) {
                        eVar = new e(aVar, eVar2.f4926d, aVar, eVar2.f4925c);
                    } else if (m.e(this)) {
                        eVar = new e(eVar2.f4923a, eVar2.f4926d, aVar, aVar);
                    } else {
                        eVar = new e(aVar, aVar, eVar2.f4924b, eVar2.f4925c);
                    }
                    eVar2 = eVar;
                }
                if (eVar2 == null) {
                    e.e = new K0.a(0.0f);
                    e.f399f = new K0.a(0.0f);
                    e.f400g = new K0.a(0.0f);
                    e.f401h = new K0.a(0.0f);
                } else {
                    e.e = eVar2.f4923a;
                    e.f401h = eVar2.f4926d;
                    e.f399f = eVar2.f4924b;
                    e.f400g = eVar2.f4925c;
                }
                materialButton.setShapeAppearanceModel(e.a());
            }
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.f2185n;
        if (i2 != -1) {
            d(Collections.singleton(Integer.valueOf(i2)));
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.f2183l) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, visibleButtonCount, false, i2));
    }

    public final void onMeasure(int i2, int i3) {
        e();
        a();
        super.onMeasure(i2, i3);
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal((C0352a) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f2178f.remove(indexOfChild);
        }
        e();
        a();
    }

    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((MaterialButton) getChildAt(i2)).setEnabled(z2);
        }
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }
}
