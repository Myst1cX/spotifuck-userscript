package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.media.session.t;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import n.C0196k;
import n.C0197l;
import n.C0199n;
import n.C0209x;
import n.C0211z;

public final class ExpandedMenuView extends ListView implements C0196k, C0211z, AdapterView.OnItemClickListener {

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f1233g = {16842964, 16843049};

    /* renamed from: f  reason: collision with root package name */
    public C0197l f1234f;

    public int getWindowAnimations() {
        return 0;
    }

    public final void b(C0197l lVar) {
        this.f1234f = lVar;
    }

    public final boolean c(C0199n nVar) {
        return this.f1234f.q(nVar, (C0209x) null, 0);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        t A2 = t.A(context, attributeSet, f1233g, 16842868);
        TypedArray typedArray = (TypedArray) A2.f1132c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(A2.o(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(A2.o(1));
        }
        A2.C();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        c((C0199n) getAdapter().getItem(i));
    }
}
