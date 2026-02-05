package x0;

import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

public final /* synthetic */ class a implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f4928a;

    public /* synthetic */ a(CarouselLayoutManager carouselLayoutManager) {
        this.f4928a = carouselLayoutManager;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        CarouselLayoutManager carouselLayoutManager = this.f4928a;
        carouselLayoutManager.getClass();
        if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
            view.post(new C.a(13, (Object) carouselLayoutManager));
        }
    }
}
