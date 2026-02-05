package n;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: n.t  reason: case insensitive filesystem */
public abstract class C0205t implements C0183B, C0209x, AdapterView.OnItemClickListener {

    /* renamed from: f  reason: collision with root package name */
    public Rect f3934f;

    public static int m(ListAdapter listAdapter, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public final boolean d(C0199n nVar) {
        return false;
    }

    public final boolean k(C0199n nVar) {
        return false;
    }

    public abstract void l(C0197l lVar);

    public abstract void n(View view);

    public abstract void o(boolean z2);

    public abstract void p(int i);

    public abstract void q(int i);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z2);

    public abstract void t(int i);

    public static boolean u(C0197l lVar) {
        int size = lVar.f3876f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = lVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public final void f(Context context, C0197l lVar) {
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        C0194i iVar;
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            iVar = (C0194i) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            iVar = (C0194i) listAdapter;
        }
        C0197l lVar = iVar.f3866a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (!(this instanceof C0191f)) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        lVar.q(menuItem, this, i2);
    }
}
