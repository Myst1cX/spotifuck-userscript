package N0;

import F.a;
import N.Q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;

public final class w extends ArrayAdapter {

    /* renamed from: a  reason: collision with root package name */
    public ColorStateList f713a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f714b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ x f715c;

    public final void a() {
        boolean z2;
        ColorStateList colorStateList;
        x xVar = this.f715c;
        ColorStateList colorStateList2 = xVar.f723q;
        if (colorStateList2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        ColorStateList colorStateList3 = null;
        if (!z2) {
            colorStateList = null;
        } else {
            int[] iArr = {16842919};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        }
        this.f714b = colorStateList;
        if (!(xVar.f722p == 0 || xVar.f723q == null)) {
            int[] iArr2 = {16843623, -16842919};
            int[] iArr3 = {16842913, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{a.b(xVar.f723q.getColorForState(iArr3, 0), xVar.f722p), a.b(xVar.f723q.getColorForState(iArr2, 0), xVar.f722p), xVar.f722p});
        }
        this.f713a = colorStateList3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(x xVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f715c = xVar;
        a();
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            x xVar = this.f715c;
            RippleDrawable rippleDrawable = null;
            if (xVar.getText().toString().contentEquals(textView.getText()) && xVar.f722p != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(xVar.f722p);
                if (this.f714b != null) {
                    G.a.h(colorDrawable, this.f713a);
                    rippleDrawable = new RippleDrawable(this.f714b, colorDrawable, (Drawable) null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = Q.f509a;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
