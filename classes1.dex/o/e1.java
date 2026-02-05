package o;

import android.content.Context;
import android.view.View;
import android.view.Window;
import n.C0186a;

public final class e1 implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final C0186a f4186f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f1 f4187g;

    public final void onClick(View view) {
        f1 f1Var = this.f4187g;
        Window.Callback callback = f1Var.f4196k;
        if (callback != null && f1Var.f4197l) {
            callback.onMenuItemSelected(0, this.f4186f);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [n.a, java.lang.Object] */
    public e1(f1 f1Var) {
        this.f4187g = f1Var;
        Context context = f1Var.f4188a.getContext();
        CharSequence charSequence = f1Var.f4194h;
        ? obj = new Object();
        obj.e = 4096;
        obj.f3819g = 4096;
        obj.f3823l = null;
        obj.f3824m = null;
        obj.f3825n = false;
        obj.f3826o = false;
        obj.f3827p = 16;
        obj.i = context;
        obj.f3814a = charSequence;
        this.f4186f = obj;
    }
}
