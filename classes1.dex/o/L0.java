package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import n.C0194i;
import n.C0197l;
import n.C0199n;

public final class L0 extends C0309v0 {

    /* renamed from: r  reason: collision with root package name */
    public final int f4101r;

    /* renamed from: s  reason: collision with root package name */
    public final int f4102s;

    /* renamed from: t  reason: collision with root package name */
    public I0 f4103t;

    /* renamed from: u  reason: collision with root package name */
    public C0199n f4104u;

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int i;
        C0194i iVar;
        C0199n nVar;
        int pointToPosition;
        int i2;
        if (this.f4103t != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                iVar = (C0194i) headerViewListAdapter.getWrappedAdapter();
            } else {
                iVar = (C0194i) adapter;
                i = 0;
            }
            if (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= iVar.getCount()) {
                nVar = null;
            } else {
                nVar = iVar.getItem(i2);
            }
            C0199n nVar2 = this.f4104u;
            if (nVar2 != nVar) {
                C0197l lVar = iVar.f3866a;
                if (nVar2 != null) {
                    this.f4103t.g(lVar, nVar2);
                }
                this.f4104u = nVar;
                if (nVar != null) {
                    this.f4103t.o(lVar, nVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    public void setHoverListener(I0 i02) {
        this.f4103t = i02;
    }

    public L0(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f4101r = 21;
            this.f4102s = 22;
            return;
        }
        this.f4101r = 22;
        this.f4102s = 21;
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C0194i iVar;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f4101r) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView == null || i != this.f4102s) {
            return super.onKeyDown(i, keyEvent);
        } else {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                iVar = (C0194i) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                iVar = (C0194i) adapter;
            }
            iVar.f3866a.c(false);
            return true;
        }
    }

    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
