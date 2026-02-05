package j0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: j0.k  reason: case insensitive filesystem */
public final class C0149k extends N {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0151m f3429a;

    public C0149k(C0151m mVar) {
        this.f3429a = mVar;
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        boolean z2;
        boolean z3;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0151m mVar = this.f3429a;
        int computeVerticalScrollRange = mVar.f3456s.computeVerticalScrollRange();
        int i3 = mVar.f3455r;
        int i4 = computeVerticalScrollRange - i3;
        int i5 = mVar.f3440a;
        if (i4 <= 0 || i3 < i5) {
            z2 = false;
        } else {
            z2 = true;
        }
        mVar.f3457t = z2;
        int computeHorizontalScrollRange = mVar.f3456s.computeHorizontalScrollRange();
        int i6 = mVar.f3454q;
        if (computeHorizontalScrollRange - i6 <= 0 || i6 < i5) {
            z3 = false;
        } else {
            z3 = true;
        }
        mVar.f3458u = z3;
        boolean z4 = mVar.f3457t;
        if (z4 || z3) {
            if (z4) {
                float f2 = (float) i3;
                mVar.f3449l = (int) ((((f2 / 2.0f) + ((float) computeVerticalScrollOffset)) * f2) / ((float) computeVerticalScrollRange));
                mVar.f3448k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (mVar.f3458u) {
                float f3 = (float) computeHorizontalScrollOffset;
                float f4 = (float) i6;
                mVar.f3452o = (int) ((((f4 / 2.0f) + f3) * f4) / ((float) computeHorizontalScrollRange));
                mVar.f3451n = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
            }
            int i7 = mVar.f3459v;
            if (i7 == 0 || i7 == 1) {
                mVar.g(1);
            }
        } else if (mVar.f3459v != 0) {
            mVar.g(0);
        }
    }
}
