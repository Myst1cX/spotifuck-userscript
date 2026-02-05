package K0;

import J0.a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

public final class n extends t {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f426c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Matrix f427d;

    public n(ArrayList arrayList, Matrix matrix) {
        this.f426c = arrayList;
        this.f427d = matrix;
    }

    public final void a(Matrix matrix, a aVar, int i, Canvas canvas) {
        Iterator it2 = this.f426c.iterator();
        while (it2.hasNext()) {
            ((t) it2.next()).a(this.f427d, aVar, i, canvas);
        }
    }
}
