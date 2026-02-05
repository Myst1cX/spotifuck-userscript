package n;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: n.g  reason: case insensitive filesystem */
public final class C0192g extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    public int f3859a = -1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0193h f3860b;

    public final long getItemId(int i) {
        return (long) i;
    }

    public C0192g(C0193h hVar) {
        this.f3860b = hVar;
        a();
    }

    public final void a() {
        C0197l lVar = this.f3860b.f3863h;
        C0199n nVar = lVar.f3891v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f3879j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C0199n) arrayList.get(i)) == nVar) {
                    this.f3859a = i;
                    return;
                }
            }
        }
        this.f3859a = -1;
    }

    /* renamed from: b */
    public final C0199n getItem(int i) {
        C0193h hVar = this.f3860b;
        C0197l lVar = hVar.f3863h;
        lVar.i();
        ArrayList arrayList = lVar.f3879j;
        hVar.getClass();
        int i2 = this.f3859a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0199n) arrayList.get(i);
    }

    public final int getCount() {
        C0193h hVar = this.f3860b;
        C0197l lVar = hVar.f3863h;
        lVar.i();
        int size = lVar.f3879j.size();
        hVar.getClass();
        if (this.f3859a < 0) {
            return size;
        }
        return size - 1;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f3860b.f3862g.inflate(2131492880, viewGroup, false);
        }
        ((C0210y) view).a(getItem(i));
        return view;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
