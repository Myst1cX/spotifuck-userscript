package A;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import z.C0359a;

public final class f extends ViewGroup.MarginLayoutParams {

    /* renamed from: a  reason: collision with root package name */
    public c f4a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5b = false;

    /* renamed from: c  reason: collision with root package name */
    public final int f6c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final int f7d = 0;
    public final int e = -1;

    /* renamed from: f  reason: collision with root package name */
    public final int f8f = -1;

    /* renamed from: g  reason: collision with root package name */
    public final int f9g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f10h = 0;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public int f11j;

    /* renamed from: k  reason: collision with root package name */
    public View f12k;

    /* renamed from: l  reason: collision with root package name */
    public View f13l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f14m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f15n;

    /* renamed from: o  reason: collision with root package name */
    public final Rect f16o = new Rect();

    public f() {
        super(-2, -2);
    }

    public final boolean a(int i2) {
        if (i2 == 0) {
            return this.f14m;
        }
        if (i2 != 1) {
            return false;
        }
        return this.f15n;
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0359a.f5174b);
        this.f6c = obtainStyledAttributes.getInteger(0, 0);
        this.f8f = obtainStyledAttributes.getResourceId(1, -1);
        this.f7d = obtainStyledAttributes.getInteger(2, 0);
        this.e = obtainStyledAttributes.getInteger(6, -1);
        this.f9g = obtainStyledAttributes.getInt(5, 0);
        this.f10h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f5b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1438y;
            if (TextUtils.isEmpty(string)) {
                cVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1438y;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1435A;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1439z);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    cVar = (c) constructor.newInstance(new Object[]{context, attributeSet});
                } catch (Exception e2) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e2);
                }
            }
            this.f4a = cVar;
        }
        obtainStyledAttributes.recycle();
        c cVar2 = this.f4a;
        if (cVar2 != null) {
            cVar2.c(this);
        }
    }

    public f(f fVar) {
        super(fVar);
    }

    public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public f(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
