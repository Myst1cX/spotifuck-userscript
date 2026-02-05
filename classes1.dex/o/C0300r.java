package o;

import T.u;
import T0.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import j0.C0140b;
import k0.C0168c;
import p0.C0320a;

/* renamed from: o.r  reason: case insensitive filesystem */
public final class C0300r extends CheckedTextView implements u {

    /* renamed from: f  reason: collision with root package name */
    public final C0168c f4287f = new C0168c(this);

    /* renamed from: g  reason: collision with root package name */
    public final C0140b f4288g;

    /* renamed from: h  reason: collision with root package name */
    public final Z f4289h;
    public C0308v i;

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0168c cVar = this.f4287f;
        if (cVar == null) {
            return;
        }
        if (cVar.f3564c) {
            cVar.f3564c = false;
            return;
        }
        cVar.f3564c = true;
        cVar.b();
    }

    private C0308v getEmojiTextViewHelper() {
        if (this.i == null) {
            this.i = new C0308v(this);
        }
        return this.i;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0140b bVar = this.f4288g;
        if (bVar != null) {
            return bVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0140b bVar = this.f4288g;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0168c cVar = this.f4287f;
        if (cVar != null) {
            return (ColorStateList) cVar.e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0168c cVar = this.f4287f;
        if (cVar != null) {
            return (PorterDuff.Mode) cVar.f3566f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4289h.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4289h.e();
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0140b bVar = this.f4288g;
        if (bVar != null) {
            bVar.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0140b bVar = this.f4288g;
        if (bVar != null) {
            bVar.t(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0168c cVar = this.f4287f;
        if (cVar != null) {
            cVar.e = colorStateList;
            cVar.f3562a = true;
            cVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0168c cVar = this.f4287f;
        if (cVar != null) {
            cVar.f3566f = mode;
            cVar.f3563b = true;
            cVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z2 = this.f4289h;
        z2.l(colorStateList);
        z2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z2 = this.f4289h;
        z2.m(mode);
        z2.b();
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|(2:6|7)|9|10|(1:14)|15|(1:17)|18|(1:20)|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0068 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0300r(android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r8 = this;
            o.V0.a(r9)
            r6 = 2130968776(0x7f0400c8, float:1.7546215E38)
            r8.<init>(r9, r10, r6)
            android.content.Context r9 = r8.getContext()
            o.U0.a(r8, r9)
            o.Z r9 = new o.Z
            r9.<init>(r8)
            r8.f4289h = r9
            r9.f(r10, r6)
            r9.b()
            j0.b r9 = new j0.b
            r9.<init>((android.view.View) r8)
            r8.f4288g = r9
            r9.k(r10, r6)
            k0.c r9 = new k0.c
            r9.<init>(r8)
            r8.f4287f = r9
            android.content.Context r9 = r8.getContext()
            int[] r2 = g.C0096a.f2528l
            android.support.v4.media.session.t r9 = android.support.v4.media.session.t.A(r9, r10, r2, r6)
            java.lang.Object r0 = r9.f1132c
            r7 = r0
            android.content.res.TypedArray r7 = (android.content.res.TypedArray) r7
            android.content.Context r1 = r8.getContext()
            java.lang.Object r0 = r9.f1132c
            r4 = r0
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r0 = r8
            r3 = r10
            r5 = r6
            N.Q.o(r0, r1, r2, r3, r4, r5)
            r0 = 1
            boolean r1 = r7.hasValue(r0)     // Catch:{ all -> 0x0066 }
            r2 = 0
            if (r1 == 0) goto L_0x0068
            int r0 = r7.getResourceId(r0, r2)     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0068
            android.content.Context r1 = r8.getContext()     // Catch:{ NotFoundException -> 0x0068 }
            android.graphics.drawable.Drawable r0 = T0.g.n(r1, r0)     // Catch:{ NotFoundException -> 0x0068 }
            r8.setCheckMarkDrawable((android.graphics.drawable.Drawable) r0)     // Catch:{ NotFoundException -> 0x0068 }
            goto L_0x007f
        L_0x0066:
            r10 = move-exception
            goto L_0x00ac
        L_0x0068:
            boolean r0 = r7.hasValue(r2)     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x007f
            int r0 = r7.getResourceId(r2, r2)     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x007f
            android.content.Context r1 = r8.getContext()     // Catch:{ all -> 0x0066 }
            android.graphics.drawable.Drawable r0 = T0.g.n(r1, r0)     // Catch:{ all -> 0x0066 }
            r8.setCheckMarkDrawable((android.graphics.drawable.Drawable) r0)     // Catch:{ all -> 0x0066 }
        L_0x007f:
            r0 = 2
            boolean r1 = r7.hasValue(r0)     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x008d
            android.content.res.ColorStateList r0 = r9.n(r0)     // Catch:{ all -> 0x0066 }
            r8.setCheckMarkTintList(r0)     // Catch:{ all -> 0x0066 }
        L_0x008d:
            r0 = 3
            boolean r1 = r7.hasValue(r0)     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x00a1
            r1 = -1
            int r0 = r7.getInt(r0, r1)     // Catch:{ all -> 0x0066 }
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = o.C0297p0.c(r0, r1)     // Catch:{ all -> 0x0066 }
            r8.setCheckMarkTintMode(r0)     // Catch:{ all -> 0x0066 }
        L_0x00a1:
            r9.C()
            o.v r9 = r8.getEmojiTextViewHelper()
            r9.b(r10, r6)
            return
        L_0x00ac:
            r9.C()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0300r.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Z z2 = this.f4289h;
        if (z2 != null) {
            z2.b();
        }
        C0140b bVar = this.f4288g;
        if (bVar != null) {
            bVar.a();
        }
        C0168c cVar = this.f4287f;
        if (cVar != null) {
            cVar.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0320a.H0(super.getCustomSelectionActionModeCallback());
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        g.z(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().c(z2);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0140b bVar = this.f4288g;
        if (bVar != null) {
            bVar.m();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0140b bVar = this.f4288g;
        if (bVar != null) {
            bVar.n(i2);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f4289h;
        if (z2 != null) {
            z2.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f4289h;
        if (z2 != null) {
            z2.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0320a.K0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().d(z2);
    }

    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        Z z2 = this.f4289h;
        if (z2 != null) {
            z2.g(context, i2);
        }
    }

    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(g.n(getContext(), i2));
    }
}
