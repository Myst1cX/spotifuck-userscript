package K0;

import A.b;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;
import p0.C0320a;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final u[] f416a = new u[4];

    /* renamed from: b  reason: collision with root package name */
    public final Matrix[] f417b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix[] f418c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    public final PointF f419d = new PointF();
    public final Path e = new Path();

    /* renamed from: f  reason: collision with root package name */
    public final Path f420f = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final u f421g = new u();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f422h = new float[2];
    public final float[] i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    public final Path f423j = new Path();

    /* renamed from: k  reason: collision with root package name */
    public final Path f424k = new Path();

    /* renamed from: l  reason: collision with root package name */
    public final boolean f425l = true;

    public final void a(k kVar, float f2, RectF rectF, b bVar, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        u[] uVarArr;
        int i2;
        float[] fArr;
        e eVar;
        c cVar;
        C0320a aVar;
        int i3;
        m mVar = this;
        k kVar2 = kVar;
        RectF rectF2 = rectF;
        b bVar2 = bVar;
        Path path2 = path;
        path.rewind();
        Path path3 = mVar.e;
        path3.rewind();
        Path path4 = mVar.f420f;
        path4.rewind();
        path4.addRect(rectF2, Path.Direction.CW);
        int i4 = 0;
        while (true) {
            matrixArr = mVar.f418c;
            matrixArr2 = mVar.f417b;
            uVarArr = mVar.f416a;
            i2 = 4;
            fArr = mVar.f422h;
            if (i4 >= 4) {
                break;
            }
            if (i4 == 1) {
                cVar = kVar2.f410g;
            } else if (i4 == 2) {
                cVar = kVar2.f411h;
            } else if (i4 != 3) {
                cVar = kVar2.f409f;
            } else {
                cVar = kVar2.e;
            }
            if (i4 == 1) {
                aVar = kVar2.f407c;
            } else if (i4 == 2) {
                aVar = kVar2.f408d;
            } else if (i4 != 3) {
                aVar = kVar2.f406b;
            } else {
                aVar = kVar2.f405a;
            }
            u uVar = uVarArr[i4];
            aVar.getClass();
            aVar.M(uVar, f2, cVar.a(rectF2));
            int i5 = i4 + 1;
            float f3 = (float) ((i5 % 4) * 90);
            matrixArr2[i4].reset();
            PointF pointF = mVar.f419d;
            if (i4 == 1) {
                i3 = i5;
                pointF.set(rectF2.right, rectF2.bottom);
            } else if (i4 == 2) {
                i3 = i5;
                pointF.set(rectF2.left, rectF2.bottom);
            } else if (i4 != 3) {
                i3 = i5;
                pointF.set(rectF2.right, rectF2.top);
            } else {
                i3 = i5;
                pointF.set(rectF2.left, rectF2.top);
            }
            matrixArr2[i4].setTranslate(pointF.x, pointF.y);
            matrixArr2[i4].preRotate(f3);
            u uVar2 = uVarArr[i4];
            fArr[0] = uVar2.f443b;
            fArr[1] = uVar2.f444c;
            matrixArr2[i4].mapPoints(fArr);
            matrixArr[i4].reset();
            matrixArr[i4].setTranslate(fArr[0], fArr[1]);
            matrixArr[i4].preRotate(f3);
            i4 = i3;
        }
        int i6 = 0;
        while (i6 < i2) {
            u uVar3 = uVarArr[i6];
            uVar3.getClass();
            fArr[0] = 0.0f;
            fArr[1] = uVar3.f442a;
            matrixArr2[i6].mapPoints(fArr);
            if (i6 == 0) {
                path2.moveTo(fArr[0], fArr[1]);
            } else {
                path2.lineTo(fArr[0], fArr[1]);
            }
            uVarArr[i6].b(matrixArr2[i6], path2);
            if (bVar2 != null) {
                u uVar4 = uVarArr[i6];
                Matrix matrix = matrixArr2[i6];
                g gVar = (g) bVar2.f2g;
                BitSet bitSet = gVar.i;
                uVar4.getClass();
                bitSet.set(i6, false);
                uVar4.a(uVar4.e);
                gVar.f375g[i6] = new n(new ArrayList(uVar4.f447g), new Matrix(matrix));
            }
            int i7 = i6 + 1;
            int i8 = i7 % 4;
            u uVar5 = uVarArr[i6];
            fArr[0] = uVar5.f443b;
            fArr[1] = uVar5.f444c;
            matrixArr2[i6].mapPoints(fArr);
            u uVar6 = uVarArr[i8];
            uVar6.getClass();
            float[] fArr2 = mVar.i;
            fArr2[0] = 0.0f;
            fArr2[1] = uVar6.f442a;
            matrixArr2[i8].mapPoints(fArr2);
            int i9 = i7;
            float max = Math.max(((float) Math.hypot((double) (fArr[0] - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
            u uVar7 = uVarArr[i6];
            fArr[0] = uVar7.f443b;
            fArr[1] = uVar7.f444c;
            matrixArr2[i6].mapPoints(fArr);
            if (i6 == 1 || i6 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            u uVar8 = mVar.f421g;
            uVar8.d(0.0f, 270.0f, 0.0f);
            if (i6 == 1) {
                eVar = kVar2.f413k;
            } else if (i6 == 2) {
                eVar = kVar2.f414l;
            } else if (i6 != 3) {
                eVar = kVar2.f412j;
            } else {
                eVar = kVar2.i;
            }
            eVar.getClass();
            uVar8.c(max, 0.0f);
            Path path5 = mVar.f423j;
            path5.reset();
            uVar8.b(matrixArr[i6], path5);
            if (!mVar.f425l || (!mVar.b(path5, i6) && !mVar.b(path5, i8))) {
                uVar8.b(matrixArr[i6], path2);
            } else {
                path5.op(path5, path4, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = uVar8.f442a;
                matrixArr[i6].mapPoints(fArr);
                path3.moveTo(fArr[0], fArr[1]);
                uVar8.b(matrixArr[i6], path3);
            }
            if (bVar2 != null) {
                Matrix matrix2 = matrixArr[i6];
                g gVar2 = (g) bVar2.f2g;
                gVar2.i.set(i6 + 4, false);
                uVar8.a(uVar8.e);
                gVar2.f376h[i6] = new n(new ArrayList(uVar8.f447g), new Matrix(matrix2));
            }
            i2 = 4;
            mVar = this;
            RectF rectF3 = rectF;
            i6 = i9;
        }
        path.close();
        path3.close();
        if (!path3.isEmpty()) {
            path2.op(path3, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i2) {
        Path path2 = this.f424k;
        path2.reset();
        this.f416a[i2].b(this.f417b[i2], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }

    public m() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f416a[i2] = new u();
            this.f417b[i2] = new Matrix();
            this.f418c[i2] = new Matrix();
        }
    }
}
