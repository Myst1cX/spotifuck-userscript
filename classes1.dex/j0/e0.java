package j0;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public int f3372a;

    /* renamed from: b  reason: collision with root package name */
    public int f3373b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3374c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3375d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f3376f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f3377g;

    public final void a() {
        this.f3372a = -1;
        this.f3373b = Integer.MIN_VALUE;
        this.f3374c = false;
        this.f3375d = false;
        this.e = false;
        int[] iArr = this.f3376f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }

    public e0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f3377g = staggeredGridLayoutManager;
        a();
    }
}
