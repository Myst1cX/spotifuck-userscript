package n;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: n.i  reason: case insensitive filesystem */
public final class C0194i extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final C0197l f3866a;

    /* renamed from: b  reason: collision with root package name */
    public int f3867b = -1;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3868c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3869d;
    public final LayoutInflater e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3870f;

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z2 = false;
        if (view == null) {
            view = this.e.inflate(this.f3870f, viewGroup, false);
        }
        int i3 = getItem(i).f3901b;
        int i4 = i - 1;
        if (i4 >= 0) {
            i2 = getItem(i4).f3901b;
        } else {
            i2 = i3;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f3866a.m() && i3 != i2) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        C0210y yVar = (C0210y) view;
        if (this.f3868c) {
            listMenuItemView.setForceShowIcon(true);
        }
        yVar.a(getItem(i));
        return view;
    }

    public final void a() {
        C0197l lVar = this.f3866a;
        C0199n nVar = lVar.f3891v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f3879j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0199n) arrayList.get(i)) == nVar) {
                    this.f3867b = i;
                    return;
                }
            }
        }
        this.f3867b = -1;
    }

    /* renamed from: b */
    public final C0199n getItem(int i) {
        ArrayList arrayList;
        C0197l lVar = this.f3866a;
        if (this.f3869d) {
            lVar.i();
            arrayList = lVar.f3879j;
        } else {
            arrayList = lVar.l();
        }
        int i2 = this.f3867b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0199n) arrayList.get(i);
    }

    public final int getCount() {
        ArrayList arrayList;
        C0197l lVar = this.f3866a;
        if (this.f3869d) {
            lVar.i();
            arrayList = lVar.f3879j;
        } else {
            arrayList = lVar.l();
        }
        if (this.f3867b < 0) {
            return arrayList.size();
        }
        return arrayList.size() - 1;
    }

    public C0194i(C0197l lVar, LayoutInflater layoutInflater, boolean z2, int i) {
        this.f3869d = z2;
        this.e = layoutInflater;
        this.f3866a = lVar;
        this.f3870f = i;
        a();
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
