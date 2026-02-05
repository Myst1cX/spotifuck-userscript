package o;

import A.b;
import N.C0004d;
import N.C0006f;
import N.C0019t;
import N.Q;
import T.s;
import T.u;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import j0.C0140b;
import p0.C0320a;

/* renamed from: o.u  reason: case insensitive filesystem */
public class C0306u extends EditText implements C0019t, u {

    /* renamed from: f  reason: collision with root package name */
    public final C0140b f4300f;

    /* renamed from: g  reason: collision with root package name */
    public final Z f4301g;

    /* renamed from: h  reason: collision with root package name */
    public final C0248C f4302h;
    public final s i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public final C0248C f4303j;

    /* renamed from: k  reason: collision with root package name */
    public C0304t f4304k;

    private C0304t getSuperCaller() {
        if (this.f4304k == null) {
            this.f4304k = new C0304t(this);
        }
        return this.f4304k;
    }

    public final C0006f a(C0006f fVar) {
        return this.i.a(this, fVar);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0140b bVar = this.f4300f;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0140b bVar = this.f4300f;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4301g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4301g.e();
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public TextClassifier getTextClassifier() {
        C0248C c2;
        if (Build.VERSION.SDK_INT >= 28 || (c2 = this.f4302h) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c2.f4051c;
        if (textClassifier == null) {
            return C0263S.a((TextView) c2.f4050b);
        }
        return textClassifier;
    }

    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = false;
        if (i2 < 31 && i2 >= 24 && dragEvent.getLocalState() == null && Q.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z2 = C0251F.a(dragEvent, this, activity);
            }
        }
        if (z2) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public final boolean onTextContextMenuItem(int i2) {
        ClipData clipData;
        b bVar;
        int i3;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31 || Q.g(this) == null || (i2 != 16908322 && i2 != 16908337)) {
            return super.onTextContextMenuItem(i2);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (clipboardManager == null) {
            clipData = null;
        } else {
            clipData = clipboardManager.getPrimaryClip();
        }
        if (clipData != null && clipData.getItemCount() > 0) {
            if (i4 >= 31) {
                bVar = new b(clipData, 1);
            } else {
                C0004d dVar = new C0004d();
                dVar.f530g = clipData;
                dVar.f531h = 1;
                bVar = dVar;
            }
            if (i2 == 16908322) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            bVar.p(i3);
            Q.l(this, bVar.j());
        }
        return true;
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f4303j.d(z2);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f4303j.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0140b bVar = this.f4300f;
        if (bVar != null) {
            bVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0140b bVar = this.f4300f;
        if (bVar != null) {
            bVar.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z2 = this.f4301g;
        z2.l(colorStateList);
        z2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z2 = this.f4301g;
        z2.m(mode);
        z2.b();
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0248C c2;
        if (Build.VERSION.SDK_INT >= 28 || (c2 = this.f4302h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c2.f4051c = textClassifier;
        }
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [T.s, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0306u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969009);
        V0.a(context);
        U0.a(this, getContext());
        C0140b bVar = new C0140b((View) this);
        this.f4300f = bVar;
        bVar.k(attributeSet, 2130969009);
        Z z2 = new Z(this);
        this.f4301g = z2;
        z2.f(attributeSet, 2130969009);
        z2.b();
        C0248C c2 = new C0248C();
        c2.f4050b = this;
        this.f4302h = c2;
        C0248C c3 = new C0248C((EditText) this);
        this.f4303j = c3;
        c3.b(attributeSet, 2130969009);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a2 = c3.a(keyListener);
            if (a2 != keyListener) {
                super.setKeyListener(a2);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0140b bVar = this.f4300f;
        if (bVar != null) {
            bVar.a();
        }
        Z z2 = this.f4301g;
        if (z2 != null) {
            z2.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0320a.H0(super.getCustomSelectionActionModeCallback());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (r1 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        if (r1 != null) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            o.Z r1 = r7.f4301g
            r1.getClass()
            o.Z.h(r8, r0, r7)
            T0.g.z(r8, r0, r7)
            if (r0 == 0) goto L_0x0076
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L_0x0076
            java.lang.String[] r2 = N.Q.g(r7)
            if (r2 == 0) goto L_0x0076
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L_0x0029
            r8.contentMimeTypes = r2
            goto L_0x003e
        L_0x0029:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L_0x0034
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L_0x0034:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L_0x003e:
            N0.k r2 = new N0.k
            r2.<init>(r7)
            if (r1 < r5) goto L_0x004c
            S.d r1 = new S.d
            r1.<init>(r0, r2)
        L_0x004a:
            r0 = r1
            goto L_0x0076
        L_0x004c:
            java.lang.String[] r6 = S.c.f878a
            if (r1 < r5) goto L_0x0058
            java.lang.String[] r1 = r8.contentMimeTypes
            if (r1 == 0) goto L_0x006c
        L_0x0056:
            r6 = r1
            goto L_0x006c
        L_0x0058:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L_0x005d
            goto L_0x006c
        L_0x005d:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L_0x0069
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L_0x0069:
            if (r1 == 0) goto L_0x006c
            goto L_0x0056
        L_0x006c:
            int r1 = r6.length
            if (r1 != 0) goto L_0x0070
            goto L_0x0076
        L_0x0070:
            S.e r1 = new S.e
            r1.<init>(r0, r2)
            goto L_0x004a
        L_0x0076:
            o.C r1 = r7.f4303j
            X.b r8 = r1.c(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0306u.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30 && i2 < 33) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0140b bVar = this.f4300f;
        if (bVar != null) {
            bVar.m();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0140b bVar = this.f4300f;
        if (bVar != null) {
            bVar.n(i2);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f4301g;
        if (z2 != null) {
            z2.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f4301g;
        if (z2 != null) {
            z2.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0320a.K0(callback, this));
    }

    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        Z z2 = this.f4301g;
        if (z2 != null) {
            z2.g(context, i2);
        }
    }
}
