package j0;

import N.Q;
import android.database.Observable;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class D extends Observable {
    public final boolean a() {
        return !this.mObservers.isEmpty();
    }

    public final void b() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            RecyclerView recyclerView = ((T) this.mObservers.get(size)).f3307a;
            recyclerView.i((String) null);
            recyclerView.f2016j0.f3319f = true;
            recyclerView.U(true);
            if (!recyclerView.i.j()) {
                recyclerView.requestLayout();
            }
        }
    }

    public final void c(int i, int i2, Preference preference) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            T t2 = (T) this.mObservers.get(size);
            RecyclerView recyclerView = t2.f3307a;
            recyclerView.i((String) null);
            C0140b bVar = recyclerView.i;
            if (i2 < 1) {
                bVar.getClass();
            } else {
                ArrayList arrayList = (ArrayList) bVar.f3356c;
                arrayList.add(bVar.l(preference, 4, i, i2));
                bVar.f3354a = 4 | bVar.f3354a;
                if (arrayList.size() == 1) {
                    t2.getClass();
                    boolean z2 = RecyclerView.f1976B0;
                    RecyclerView recyclerView2 = t2.f3307a;
                    if (!z2 || !recyclerView2.f2040w || !recyclerView2.f2038v) {
                        recyclerView2.f1984D = true;
                        recyclerView2.requestLayout();
                    } else {
                        WeakHashMap weakHashMap = Q.f509a;
                        recyclerView2.postOnAnimation(recyclerView2.f2021m);
                    }
                }
            }
        }
    }
}
