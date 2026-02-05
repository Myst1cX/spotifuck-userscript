package N0;

import N.C0002b;
import O.k;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import o.C0273d0;

public final class D extends C0002b {

    /* renamed from: d  reason: collision with root package name */
    public final TextInputLayout f611d;

    public final void d(View view, k kVar) {
        Editable editable;
        boolean z2;
        String str;
        k kVar2 = kVar;
        View.AccessibilityDelegate accessibilityDelegate = this.f523a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar2.f751a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f611d;
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(editable);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z3 = textInputLayout.f2408z0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        if (!isEmpty3 || !TextUtils.isEmpty(counterOverflowDescription)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!isEmpty2) {
            str = hint.toString();
        } else {
            str = "";
        }
        z zVar = textInputLayout.f2371g;
        C0273d0 d0Var = zVar.f727g;
        if (d0Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(d0Var);
            if (Build.VERSION.SDK_INT >= 22) {
                accessibilityNodeInfo.setTraversalAfter(d0Var);
            }
        } else if (Build.VERSION.SDK_INT >= 22) {
            accessibilityNodeInfo.setTraversalAfter(zVar.i);
        }
        if (!isEmpty) {
            kVar2.k(editable);
        } else if (!TextUtils.isEmpty(str)) {
            kVar2.k(str);
            if (!z3 && placeholderText != null) {
                kVar2.k(str + ", " + placeholderText);
            }
        } else if (placeholderText != null) {
            kVar2.k(placeholderText);
        }
        if (!TextUtils.isEmpty(str)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                kVar2.j(str);
            } else {
                if (!isEmpty) {
                    str = editable + ", " + str;
                }
                kVar2.k(str);
            }
            if (i >= 26) {
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            } else {
                kVar2.h(4, isEmpty);
            }
        }
        if (editable == null || editable.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        C0273d0 d0Var2 = textInputLayout.f2385o.f709y;
        if (d0Var2 != null) {
            accessibilityNodeInfo.setLabelFor(d0Var2);
        }
        textInputLayout.f2373h.b().n(kVar2);
    }

    public D(TextInputLayout textInputLayout) {
        this.f611d = textInputLayout;
    }

    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f611d.f2373h.b().o(accessibilityEvent);
    }
}
