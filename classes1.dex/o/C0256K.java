package o;

import K.j;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import h.C0115f;
import h.C0118i;

/* renamed from: o.K  reason: case insensitive filesystem */
public final class C0256K implements C0261P, DialogInterface.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public C0118i f4096f;

    /* renamed from: g  reason: collision with root package name */
    public C0257L f4097g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f4098h;
    public final /* synthetic */ C0262Q i;

    public final int d() {
        return 0;
    }

    public final int j() {
        return 0;
    }

    public final Drawable m() {
        return null;
    }

    public final boolean a() {
        C0118i iVar = this.f4096f;
        if (iVar != null) {
            return iVar.isShowing();
        }
        return false;
    }

    public final CharSequence b() {
        return this.f4098h;
    }

    public final void c(int i2) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    public final void dismiss() {
        C0118i iVar = this.f4096f;
        if (iVar != null) {
            iVar.dismiss();
            this.f4096f = null;
        }
    }

    public final void f(int i2, int i3) {
        if (this.f4097g != null) {
            C0262Q q2 = this.i;
            j jVar = new j(q2.getPopupContext());
            CharSequence charSequence = this.f4098h;
            C0115f fVar = (C0115f) jVar.f333g;
            if (charSequence != null) {
                fVar.f2965d = charSequence;
            }
            C0257L l2 = this.f4097g;
            int selectedItemPosition = q2.getSelectedItemPosition();
            fVar.f2972m = l2;
            fVar.f2973n = this;
            fVar.f2978s = selectedItemPosition;
            fVar.f2977r = true;
            C0118i a2 = jVar.a();
            this.f4096f = a2;
            AlertController$RecycleListView alertController$RecycleListView = a2.f3012k.f2991f;
            alertController$RecycleListView.setTextDirection(i2);
            alertController$RecycleListView.setTextAlignment(i3);
            this.f4096f.show();
        }
    }

    public final void h(CharSequence charSequence) {
        this.f4098h = charSequence;
    }

    public final void k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    public final void l(int i2) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    public final void n(ListAdapter listAdapter) {
        this.f4097g = (C0257L) listAdapter;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        C0262Q q2 = this.i;
        q2.setSelection(i2);
        if (q2.getOnItemClickListener() != null) {
            q2.performItemClick((View) null, i2, this.f4097g.getItemId(i2));
        }
        dismiss();
    }

    public final void p(int i2) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    public C0256K(C0262Q q2) {
        this.i = q2;
    }
}
