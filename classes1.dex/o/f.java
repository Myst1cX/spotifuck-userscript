package O;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

public final class f {
    public static final f e = new f(16);

    /* renamed from: f  reason: collision with root package name */
    public static final f f739f = new f(4096);

    /* renamed from: g  reason: collision with root package name */
    public static final f f740g = new f(8192);

    /* renamed from: h  reason: collision with root package name */
    public static final f f741h = new f(262144);
    public static final f i = new f(524288);

    /* renamed from: j  reason: collision with root package name */
    public static final f f742j = new f(1048576);

    /* renamed from: k  reason: collision with root package name */
    public static final f f743k;

    /* renamed from: l  reason: collision with root package name */
    public static final f f744l;

    /* renamed from: a  reason: collision with root package name */
    public final Object f745a;

    /* renamed from: b  reason: collision with root package name */
    public final int f746b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f747c;

    /* renamed from: d  reason: collision with root package name */
    public final u f748d;

    public f(int i2) {
        this((Object) null, i2, (String) null, (u) null, (Class) null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        Object obj2 = ((f) obj).f745a;
        Object obj3 = this.f745a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        } else if (!obj3.equals(obj2)) {
            return false;
        } else {
            return true;
        }
    }

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
        new f(1);
        new f(2);
        new f(4);
        new f(8);
        new f(32);
        new f(64);
        new f(128);
        Class<n> cls = n.class;
        new f(256, cls);
        new f(512, cls);
        Class<o> cls2 = o.class;
        new f(1024, cls2);
        new f(2048, cls2);
        new f(16384);
        new f(32768);
        new f(65536);
        new f(131072, s.class);
        new f(2097152, t.class);
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction22 = null;
        if (i2 >= 23) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
        } else {
            accessibilityAction = null;
        }
        new f(accessibilityAction, 16908342, (String) null, (u) null, (Class) null);
        if (i2 >= 23) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
        } else {
            accessibilityAction2 = null;
        }
        new f(accessibilityAction2, 16908343, (String) null, (u) null, q.class);
        if (i2 >= 23) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
        } else {
            accessibilityAction3 = null;
        }
        f743k = new f(accessibilityAction3, 16908344, (String) null, (u) null, (Class) null);
        if (i2 >= 23) {
            accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
        } else {
            accessibilityAction4 = null;
        }
        new f(accessibilityAction4, 16908345, (String) null, (u) null, (Class) null);
        if (i2 >= 23) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
        } else {
            accessibilityAction5 = null;
        }
        f744l = new f(accessibilityAction5, 16908346, (String) null, (u) null, (Class) null);
        if (i2 >= 23) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
        } else {
            accessibilityAction6 = null;
        }
        new f(accessibilityAction6, 16908347, (String) null, (u) null, (Class) null);
        if (i2 >= 29) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction7 = null;
        }
        new f(accessibilityAction7, 16908358, (String) null, (u) null, (Class) null);
        if (i2 >= 29) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
        } else {
            accessibilityAction8 = null;
        }
        new f(accessibilityAction8, 16908359, (String) null, (u) null, (Class) null);
        if (i2 >= 29) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction9 = null;
        }
        new f(accessibilityAction9, 16908360, (String) null, (u) null, (Class) null);
        if (i2 >= 29) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
        } else {
            accessibilityAction10 = null;
        }
        new f(accessibilityAction10, 16908361, (String) null, (u) null, (Class) null);
        if (i2 >= 23) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
        } else {
            accessibilityAction11 = null;
        }
        new f(accessibilityAction11, 16908348, (String) null, (u) null, (Class) null);
        if (i2 >= 24) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        } else {
            accessibilityAction12 = null;
        }
        new f(accessibilityAction12, 16908349, (String) null, (u) null, r.class);
        if (i2 >= 26) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction13 = null;
        }
        new f(accessibilityAction13, 16908354, (String) null, (u) null, p.class);
        if (i2 >= 28) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        } else {
            accessibilityAction14 = null;
        }
        new f(accessibilityAction14, 16908356, (String) null, (u) null, (Class) null);
        if (i2 >= 28) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        } else {
            accessibilityAction15 = null;
        }
        new f(accessibilityAction15, 16908357, (String) null, (u) null, (Class) null);
        if (i2 >= 30) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction16 = null;
        }
        new f(accessibilityAction16, 16908362, (String) null, (u) null, (Class) null);
        if (i2 >= 30) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        } else {
            accessibilityAction17 = null;
        }
        new f(accessibilityAction17, 16908372, (String) null, (u) null, (Class) null);
        if (i2 >= 32) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction18 = null;
        }
        new f(accessibilityAction18, 16908373, (String) null, (u) null, (Class) null);
        if (i2 >= 32) {
            accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
        } else {
            accessibilityAction19 = null;
        }
        new f(accessibilityAction19, 16908374, (String) null, (u) null, (Class) null);
        if (i2 >= 32) {
            accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
        } else {
            accessibilityAction20 = null;
        }
        new f(accessibilityAction20, 16908375, (String) null, (u) null, (Class) null);
        if (i2 >= 33) {
            accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
        } else {
            accessibilityAction21 = null;
        }
        new f(accessibilityAction21, 16908376, (String) null, (u) null, (Class) null);
        if (i2 >= 34) {
            accessibilityAction22 = i.a();
        }
        new f(accessibilityAction22, 16908382, (String) null, (u) null, (Class) null);
    }

    public f(int i2, Class cls) {
        this((Object) null, i2, (String) null, (u) null, cls);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f745a).getId();
    }

    public final int hashCode() {
        Object obj = this.f745a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d2 = k.d(this.f746b);
        if (d2.equals("ACTION_UNKNOWN")) {
            Object obj = this.f745a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d2 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d2);
        return sb.toString();
    }

    public f(Object obj, int i2, String str, u uVar, Class cls) {
        this.f746b = i2;
        this.f748d = uVar;
        if (obj == null) {
            this.f745a = new AccessibilityNodeInfo.AccessibilityAction(i2, str);
        } else {
            this.f745a = obj;
        }
        this.f747c = cls;
    }
}
