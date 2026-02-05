package x0;

import com.google.android.material.carousel.CarouselLayoutManager;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f4931a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f4932b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f4933c;

    public c(int i) {
        this.f4931a = i;
    }

    public final int a() {
        switch (this.f4932b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f4933c;
                if (carouselLayoutManager.B0()) {
                    return carouselLayoutManager.f3288n;
                }
                return 0;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f4932b = i;
        switch (i) {
            case 1:
                this.f4933c = carouselLayoutManager;
                this(0);
                return;
            default:
                this.f4933c = carouselLayoutManager;
                return;
        }
    }
}
