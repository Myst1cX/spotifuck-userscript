package o0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import r.b;

public final class l extends m {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f4374a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f4375b;

    /* renamed from: c  reason: collision with root package name */
    public float f4376c;

    /* renamed from: d  reason: collision with root package name */
    public float f4377d;
    public float e;

    /* renamed from: f  reason: collision with root package name */
    public float f4378f;

    /* renamed from: g  reason: collision with root package name */
    public float f4379g;

    /* renamed from: h  reason: collision with root package name */
    public float f4380h;
    public float i;

    /* renamed from: j  reason: collision with root package name */
    public final Matrix f4381j;

    /* renamed from: k  reason: collision with root package name */
    public String f4382k;

    public l() {
        this.f4374a = new Matrix();
        this.f4375b = new ArrayList();
        this.f4376c = 0.0f;
        this.f4377d = 0.0f;
        this.e = 0.0f;
        this.f4378f = 1.0f;
        this.f4379g = 1.0f;
        this.f4380h = 0.0f;
        this.i = 0.0f;
        this.f4381j = new Matrix();
        this.f4382k = null;
    }

    public final boolean a() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f4375b;
            if (i2 >= arrayList.size()) {
                return false;
            }
            if (((m) arrayList.get(i2)).a()) {
                return true;
            }
            i2++;
        }
    }

    public final boolean b(int[] iArr) {
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f4375b;
            if (i2 >= arrayList.size()) {
                return z2;
            }
            z2 |= ((m) arrayList.get(i2)).b(iArr);
            i2++;
        }
    }

    public final void c() {
        Matrix matrix = this.f4381j;
        matrix.reset();
        matrix.postTranslate(-this.f4377d, -this.e);
        matrix.postScale(this.f4378f, this.f4379g);
        matrix.postRotate(this.f4376c, 0.0f, 0.0f);
        matrix.postTranslate(this.f4380h + this.f4377d, this.i + this.e);
    }

    public String getGroupName() {
        return this.f4382k;
    }

    public Matrix getLocalMatrix() {
        return this.f4381j;
    }

    public float getPivotX() {
        return this.f4377d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.f4376c;
    }

    public float getScaleX() {
        return this.f4378f;
    }

    public float getScaleY() {
        return this.f4379g;
    }

    public float getTranslateX() {
        return this.f4380h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f2) {
        if (f2 != this.f4377d) {
            this.f4377d = f2;
            c();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.e) {
            this.e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f4376c) {
            this.f4376c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f4378f) {
            this.f4378f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f4379g) {
            this.f4379g = f2;
            c();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.f4380h) {
            this.f4380h = f2;
            c();
        }
    }

    public void setTranslateY(float f2) {
        if (f2 != this.i) {
            this.i = f2;
            c();
        }
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [o0.n, o0.k] */
    public l(l lVar, b bVar) {
        n nVar;
        this.f4374a = new Matrix();
        this.f4375b = new ArrayList();
        this.f4376c = 0.0f;
        this.f4377d = 0.0f;
        this.e = 0.0f;
        this.f4378f = 1.0f;
        this.f4379g = 1.0f;
        this.f4380h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.f4381j = matrix;
        this.f4382k = null;
        this.f4376c = lVar.f4376c;
        this.f4377d = lVar.f4377d;
        this.e = lVar.e;
        this.f4378f = lVar.f4378f;
        this.f4379g = lVar.f4379g;
        this.f4380h = lVar.f4380h;
        this.i = lVar.i;
        String str = lVar.f4382k;
        this.f4382k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(lVar.f4381j);
        ArrayList arrayList = lVar.f4375b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof l) {
                this.f4375b.add(new l((l) obj, bVar));
            } else {
                if (obj instanceof k) {
                    k kVar = (k) obj;
                    ? nVar2 = new n(kVar);
                    nVar2.e = 0.0f;
                    nVar2.f4367g = 1.0f;
                    nVar2.f4368h = 1.0f;
                    nVar2.i = 0.0f;
                    nVar2.f4369j = 1.0f;
                    nVar2.f4370k = 0.0f;
                    nVar2.f4371l = Paint.Cap.BUTT;
                    nVar2.f4372m = Paint.Join.MITER;
                    nVar2.f4373n = 4.0f;
                    nVar2.f4365d = kVar.f4365d;
                    nVar2.e = kVar.e;
                    nVar2.f4367g = kVar.f4367g;
                    nVar2.f4366f = kVar.f4366f;
                    nVar2.f4385c = kVar.f4385c;
                    nVar2.f4368h = kVar.f4368h;
                    nVar2.i = kVar.i;
                    nVar2.f4369j = kVar.f4369j;
                    nVar2.f4370k = kVar.f4370k;
                    nVar2.f4371l = kVar.f4371l;
                    nVar2.f4372m = kVar.f4372m;
                    nVar2.f4373n = kVar.f4373n;
                    nVar = nVar2;
                } else if (obj instanceof j) {
                    nVar = new n((j) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f4375b.add(nVar);
                String str2 = nVar.f4384b;
                if (str2 != null) {
                    bVar.put(str2, nVar);
                }
            }
        }
    }
}
