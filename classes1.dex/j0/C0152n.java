package j0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: j0.n  reason: case insensitive filesystem */
public final class C0152n {

    /* renamed from: a  reason: collision with root package name */
    public int f3464a;

    /* renamed from: b  reason: collision with root package name */
    public int f3465b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f3466c;

    /* renamed from: d  reason: collision with root package name */
    public int f3467d;

    public final void b(RecyclerView recyclerView, boolean z2) {
        this.f3467d = 0;
        int[] iArr = this.f3466c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        K k2 = recyclerView.f2030r;
        if (recyclerView.f2028q != null && k2 != null && k2.i) {
            if (z2) {
                if (!recyclerView.i.j()) {
                    k2.i(recyclerView.f2028q.a(), this);
                }
            } else if (!recyclerView.K()) {
                k2.h(this.f3464a, this.f3465b, recyclerView.f2016j0, this);
            }
            int i = this.f3467d;
            if (i > k2.f3284j) {
                k2.f3284j = i;
                k2.f3285k = z2;
                recyclerView.f2010g.k();
            }
        }
    }

    public final void a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        } else if (i2 >= 0) {
            int i3 = this.f3467d;
            int i4 = i3 * 2;
            int[] iArr = this.f3466c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f3466c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[(i3 * 4)];
                this.f3466c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f3466c;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.f3467d++;
        } else {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
    }
}
