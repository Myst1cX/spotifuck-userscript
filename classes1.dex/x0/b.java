package x0;

import F.a;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import j0.H;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class b extends H {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f4929a;

    /* renamed from: b  reason: collision with root package name */
    public final List f4930b = Collections.unmodifiableList(new ArrayList());

    public final void c(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int i3;
        int i4;
        Paint paint = this.f4929a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(2131165421));
        for (d dVar : this.f4930b) {
            dVar.getClass();
            ThreadLocal threadLocal = a.f224a;
            float f2 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((((float) Color.alpha(-16776961)) * 0.0f) + (((float) Color.alpha(-65281)) * f2)), (int) ((((float) Color.red(-16776961)) * 0.0f) + (((float) Color.red(-65281)) * f2)), (int) ((((float) Color.green(-16776961)) * 0.0f) + (((float) Color.green(-65281)) * f2)), (int) ((((float) Color.blue(-16776961)) * 0.0f) + (((float) Color.blue(-65281)) * f2))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).A0()) {
                c cVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2188q;
                switch (cVar.f4932b) {
                    case 0:
                        i3 = 0;
                        break;
                    default:
                        i3 = cVar.f4933c.G();
                        break;
                }
                float f3 = (float) i3;
                c cVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2188q;
                switch (cVar2.f4932b) {
                    case 0:
                        i4 = cVar2.f4933c.f3289o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = cVar2.f4933c;
                        i4 = carouselLayoutManager.f3289o - carouselLayoutManager.D();
                        break;
                }
                canvas.drawLine(0.0f, f3, 0.0f, (float) i4, paint);
            } else {
                c cVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2188q;
                switch (cVar3.f4932b) {
                    case 0:
                        i = cVar3.f4933c.E();
                        break;
                    default:
                        i = 0;
                        break;
                }
                float f4 = (float) i;
                c cVar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f2188q;
                switch (cVar4.f4932b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = cVar4.f4933c;
                        i2 = carouselLayoutManager2.f3288n - carouselLayoutManager2.F();
                        break;
                    default:
                        i2 = cVar4.f4933c.f3288n;
                        break;
                }
                canvas.drawLine(f4, 0.0f, (float) i2, 0.0f, paint);
            }
        }
    }

    public b() {
        Paint paint = new Paint();
        this.f4929a = paint;
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }
}
