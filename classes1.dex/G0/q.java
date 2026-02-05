package g0;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j0.H;
import j0.a0;

public final class q extends H {

    /* renamed from: a  reason: collision with root package name */
    public Drawable f2579a;

    /* renamed from: b  reason: collision with root package name */
    public int f2580b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2581c = true;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ r f2582d;

    public final void c(Canvas canvas, RecyclerView recyclerView) {
        if (this.f2579a != null) {
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (d(childAt, recyclerView)) {
                    int height = childAt.getHeight() + ((int) childAt.getY());
                    this.f2579a.setBounds(0, height, width, this.f2580b + height);
                    this.f2579a.draw(canvas);
                }
            }
        }
    }

    public q(r rVar) {
        this.f2582d = rVar;
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView) {
        if (d(view, recyclerView)) {
            rect.bottom = this.f2580b;
        }
    }

    public final boolean d(View view, RecyclerView recyclerView) {
        a0 H2 = recyclerView.H(view);
        boolean z2 = false;
        if (!(H2 instanceof y) || !((y) H2).f2620x) {
            return false;
        }
        boolean z3 = this.f2581c;
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild >= recyclerView.getChildCount() - 1) {
            return z3;
        }
        a0 H3 = recyclerView.H(recyclerView.getChildAt(indexOfChild + 1));
        if ((H3 instanceof y) && ((y) H3).f2619w) {
            z2 = true;
        }
        return z2;
    }
}
