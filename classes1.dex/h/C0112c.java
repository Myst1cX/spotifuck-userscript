package h;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: h.c  reason: case insensitive filesystem */
public final class C0112c extends ArrayAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AlertController$RecycleListView f2955a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0115f f2956b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0112c(C0115f fVar, ContextThemeWrapper contextThemeWrapper, int i, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(contextThemeWrapper, i, 16908308, charSequenceArr);
        this.f2956b = fVar;
        this.f2955a = alertController$RecycleListView;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.f2956b.f2975p;
        if (zArr != null && zArr[i]) {
            this.f2955a.setItemChecked(i, true);
        }
        return view2;
    }
}
