package y;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import v.C0347d;
import v.i;

public abstract class c extends View {

    /* renamed from: f  reason: collision with root package name */
    public int[] f4945f;

    /* renamed from: g  reason: collision with root package name */
    public int f4946g;

    /* renamed from: h  reason: collision with root package name */
    public Context f4947h;
    public i i;

    /* renamed from: j  reason: collision with root package name */
    public String f4948j;

    /* renamed from: k  reason: collision with root package name */
    public String f4949k;

    /* renamed from: l  reason: collision with root package name */
    public HashMap f4950l;

    public final int f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f4947h.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public abstract void h(C0347d dVar, boolean z2);

    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setReferencedIds(int[] iArr) {
        this.f4948j = null;
        this.f4946g = 0;
        for (int b2 : iArr) {
            b(b2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x009b
            int r0 = r6.length()
            if (r0 != 0) goto L_0x000a
            goto L_0x009b
        L_0x000a:
            android.content.Context r0 = r5.f4947h
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L_0x0023
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L_0x0024
        L_0x0023:
            r1 = r2
        L_0x0024:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L_0x004d
            if (r1 == 0) goto L_0x004d
            boolean r3 = r6 instanceof java.lang.String
            if (r3 == 0) goto L_0x0041
            java.util.HashMap r3 = r1.f1432r
            if (r3 == 0) goto L_0x0041
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L_0x0041
            java.util.HashMap r3 = r1.f1432r
            java.lang.Object r3 = r3.get(r6)
            goto L_0x0042
        L_0x0041:
            r3 = r2
        L_0x0042:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x004d
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L_0x004e
        L_0x004d:
            r3 = 0
        L_0x004e:
            if (r3 != 0) goto L_0x0056
            if (r1 == 0) goto L_0x0056
            int r3 = r5.f(r1, r6)
        L_0x0056:
            if (r3 != 0) goto L_0x0064
            java.lang.Class<y.q> r1 = y.q.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch:{ Exception -> 0x0063 }
            int r3 = r1.getInt(r2)     // Catch:{ Exception -> 0x0063 }
            goto L_0x0064
        L_0x0063:
        L_0x0064:
            if (r3 != 0) goto L_0x0074
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L_0x0074:
            if (r3 == 0) goto L_0x0083
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r1 = r5.f4950l
            r1.put(r0, r6)
            r5.b(r3)
            goto L_0x009b
        L_0x0083:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find id of \""
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "\""
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r6)
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y.c.a(java.lang.String):void");
    }

    public final void c(String str) {
        ConstraintLayout constraintLayout;
        if (str != null && str.length() != 0 && this.f4947h != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            } else {
                constraintLayout = null;
            }
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = constraintLayout.getChildAt(i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof e) && trim.equals(((e) layoutParams).f4975Y)) {
                    if (childAt.getId() == -1) {
                        Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                    } else {
                        b(childAt.getId());
                    }
                }
            }
        }
    }

    public void e(ConstraintLayout constraintLayout) {
    }

    public void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f5137b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f4948j = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f4949k = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f4945f, this.f4946g);
    }

    public final void i() {
        if (this.i != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof e) {
                ((e) layoutParams).f5005p0 = this.i;
            }
        }
    }

    public final void onDraw(Canvas canvas) {
    }

    public void setIds(String str) {
        this.f4948j = str;
        if (str != null) {
            int i2 = 0;
            this.f4946g = 0;
            while (true) {
                int indexOf = str.indexOf(44, i2);
                if (indexOf == -1) {
                    a(str.substring(i2));
                    return;
                } else {
                    a(str.substring(i2, indexOf));
                    i2 = indexOf + 1;
                }
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f4949k = str;
        if (str != null) {
            int i2 = 0;
            this.f4946g = 0;
            while (true) {
                int indexOf = str.indexOf(44, i2);
                if (indexOf == -1) {
                    c(str.substring(i2));
                    return;
                } else {
                    c(str.substring(i2, indexOf));
                    i2 = indexOf + 1;
                }
            }
        }
    }

    public final void b(int i2) {
        if (i2 != getId()) {
            int i3 = this.f4946g + 1;
            int[] iArr = this.f4945f;
            if (i3 > iArr.length) {
                this.f4945f = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f4945f;
            int i4 = this.f4946g;
            iArr2[i4] = i2;
            this.f4946g = i4 + 1;
        }
    }

    public final void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i2 = 0; i2 < this.f4946g; i2++) {
            View view = (View) constraintLayout.f1421f.get(this.f4945f[i2]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f4948j;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f4949k;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public final void setTag(int i2, Object obj) {
        super.setTag(i2, obj);
        if (obj == null && this.f4948j == null) {
            b(i2);
        }
    }
}
