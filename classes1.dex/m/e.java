package m;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import n.C0182A;

public final class e extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3622a;

    /* renamed from: b  reason: collision with root package name */
    public final C0174a f3623b;

    public final void setSubtitle(CharSequence charSequence) {
        this.f3623b.m(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f3623b.o(charSequence);
    }

    public final void finish() {
        this.f3623b.a();
    }

    public final View getCustomView() {
        return this.f3623b.b();
    }

    public final Menu getMenu() {
        return new C0182A(this.f3622a, this.f3623b.c());
    }

    public final MenuInflater getMenuInflater() {
        return this.f3623b.e();
    }

    public final CharSequence getSubtitle() {
        return this.f3623b.g();
    }

    public final Object getTag() {
        return this.f3623b.f3610f;
    }

    public final CharSequence getTitle() {
        return this.f3623b.h();
    }

    public final boolean getTitleOptionalHint() {
        return this.f3623b.f3611g;
    }

    public final void invalidate() {
        this.f3623b.i();
    }

    public final boolean isTitleOptional() {
        return this.f3623b.j();
    }

    public final void setCustomView(View view) {
        this.f3623b.k(view);
    }

    public final void setSubtitle(int i) {
        this.f3623b.l(i);
    }

    public final void setTag(Object obj) {
        this.f3623b.f3610f = obj;
    }

    public final void setTitle(int i) {
        this.f3623b.n(i);
    }

    public final void setTitleOptionalHint(boolean z2) {
        this.f3623b.p(z2);
    }

    public e(Context context, C0174a aVar) {
        this.f3622a = context;
        this.f3623b = aVar;
    }
}
