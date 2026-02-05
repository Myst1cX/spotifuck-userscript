package N;

import A.b;
import O.f;
import O.g;
import O.k;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: N.a  reason: case insensitive filesystem */
public final class C0000a extends View.AccessibilityDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final C0002b f521a;

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f521a.a(view, accessibilityEvent);
    }

    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        b b2 = this.f521a.b(view);
        if (b2 != null) {
            return (AccessibilityNodeProvider) b2.f2g;
        }
        return null;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f521a.c(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object obj;
        boolean z2;
        Object obj2;
        boolean z3;
        Object obj3;
        ClickableSpan[] clickableSpanArr;
        int i;
        View view2 = view;
        AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfo;
        int i2 = 1;
        k kVar = new k(accessibilityNodeInfo2);
        WeakHashMap weakHashMap = Q.f509a;
        Class<Boolean> cls = Boolean.class;
        if (Build.VERSION.SDK_INT >= 28) {
            obj = Boolean.valueOf(J.d(view));
        } else {
            obj = view2.getTag(2131296732);
            if (!cls.isInstance(obj)) {
                obj = null;
            }
        }
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            z2 = false;
        } else {
            z2 = true;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            accessibilityNodeInfo2.setScreenReaderFocusable(z2);
        } else {
            kVar.h(1, z2);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            obj2 = Boolean.valueOf(J.c(view));
        } else {
            obj2 = view2.getTag(2131296727);
            if (!cls.isInstance(obj2)) {
                obj2 = null;
            }
        }
        Boolean bool2 = (Boolean) obj2;
        if (bool2 == null || !bool2.booleanValue()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i3 >= 28) {
            accessibilityNodeInfo2.setHeading(z3);
        } else {
            kVar.h(2, z3);
        }
        CharSequence d2 = Q.d(view);
        if (i3 >= 28) {
            accessibilityNodeInfo2.setPaneTitle(d2);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", d2);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            obj3 = L.b(view);
        } else {
            obj3 = view2.getTag(2131296733);
            if (!CharSequence.class.isInstance(obj3)) {
                obj3 = null;
            }
        }
        CharSequence charSequence = (CharSequence) obj3;
        if (i3 >= 30) {
            g.c(accessibilityNodeInfo2, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f521a.d(view2, kVar);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i3 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view2.getTag(2131296726);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                    if (((WeakReference) sparseArray.valueAt(i4)).get() == null) {
                        arrayList.add(Integer.valueOf(i4));
                    }
                }
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    sparseArray.remove(((Integer) arrayList.get(i5)).intValue());
                }
            }
            if (text instanceof Spanned) {
                clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
            } else {
                clickableSpanArr = null;
            }
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", 2131296272);
                SparseArray sparseArray2 = (SparseArray) view2.getTag(2131296726);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view2.setTag(2131296726, sparseArray2);
                }
                for (int i6 = 0; i6 < clickableSpanArr.length; i6++) {
                    ClickableSpan clickableSpan = clickableSpanArr[i6];
                    int i7 = 0;
                    while (true) {
                        if (i7 >= sparseArray2.size()) {
                            i = k.f750c;
                            k.f750c = i + 1;
                            break;
                        } else if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i7)).get())) {
                            i = sparseArray2.keyAt(i7);
                            break;
                        } else {
                            i7 += i2;
                        }
                    }
                    sparseArray2.put(i, new WeakReference(clickableSpanArr[i6]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i6];
                    Spanned spanned = (Spanned) text;
                    kVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    kVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    kVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    kVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                    i2 = 1;
                }
            }
        }
        List list = (List) view2.getTag(2131296725);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            kVar.b((f) list.get(i8));
        }
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f521a.e(view, accessibilityEvent);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f521a.f(viewGroup, view, accessibilityEvent);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f521a.g(view, i, bundle);
    }

    public final void sendAccessibilityEvent(View view, int i) {
        this.f521a.h(view, i);
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f521a.i(view, accessibilityEvent);
    }

    public C0000a(C0002b bVar) {
        this.f521a = bVar;
    }
}
