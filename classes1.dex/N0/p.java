package N0;

import Q0.H;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.support.v4.media.session.t;
import android.util.SparseArray;
import r1.h;
import r1.v;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final int f651a;

    /* renamed from: b  reason: collision with root package name */
    public final int f652b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f653c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f654d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public p(v vVar, int i) {
        this((Bitmap) null, vVar, i, 0);
        h hVar = H.f783a;
        if (vVar != null) {
            return;
        }
        throw new NullPointerException("source == null");
    }

    public p(Bitmap bitmap, v vVar, int i, int i2) {
        if ((bitmap != null) != (vVar != null)) {
            this.f653c = bitmap;
            this.f654d = vVar;
            if (i != 0) {
                this.f651a = i;
                this.f652b = i2;
                return;
            }
            throw new NullPointerException("loadedFrom == null");
        }
        throw new AssertionError();
    }

    public p(q qVar, t tVar) {
        this.f653c = new SparseArray();
        this.f654d = qVar;
        TypedArray typedArray = (TypedArray) tVar.f1132c;
        this.f651a = typedArray.getResourceId(28, 0);
        this.f652b = typedArray.getResourceId(52, 0);
    }
}
