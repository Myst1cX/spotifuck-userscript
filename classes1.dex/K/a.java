package K;

import E.b;
import android.util.Log;
import androidx.emoji2.text.h;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.j;
import j0.K;
import java.util.ArrayList;
import java.util.List;
import p0.C0320a;

public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f310a;

    /* renamed from: b  reason: collision with root package name */
    public final int f311b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f312c;

    public /* synthetic */ a(int i, int i2, Object obj) {
        this.f310a = i2;
        this.f312c = obj;
        this.f311b = i;
    }

    public a(List list, int i, Throwable th) {
        this.f310a = 1;
        C0320a.j("initCallbacks cannot be null", list);
        this.f312c = new ArrayList(list);
        this.f311b = i;
    }

    public final void run() {
        switch (this.f310a) {
            case 0:
                b bVar = (b) ((A.b) this.f312c).f2g;
                if (bVar != null) {
                    bVar.i(this.f311b);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f312c;
                int size = arrayList.size();
                int i = 0;
                if (this.f311b != 1) {
                    while (i < size) {
                        ((h) arrayList.get(i)).a();
                        i++;
                    }
                    return;
                }
                while (i < size) {
                    ((h) arrayList.get(i)).b();
                    i++;
                }
                return;
            default:
                RecyclerView recyclerView = ((j) this.f312c).f2242g0;
                if (!recyclerView.f1981A) {
                    K k2 = recyclerView.f2030r;
                    if (k2 == null) {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        return;
                    } else {
                        k2.x0(recyclerView, this.f311b);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
