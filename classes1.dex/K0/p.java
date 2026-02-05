package K0;

import J0.a;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

public final class p extends t {

    /* renamed from: c  reason: collision with root package name */
    public final r f429c;

    /* renamed from: d  reason: collision with root package name */
    public final float f430d;
    public final float e;

    public final void a(Matrix matrix, a aVar, int i, Canvas canvas) {
        a aVar2 = aVar;
        int i2 = i;
        Canvas canvas2 = canvas;
        r rVar = this.f429c;
        float f2 = rVar.f438c;
        float f3 = this.e;
        float f4 = rVar.f437b;
        float f5 = this.f430d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (f2 - f3), (double) (f4 - f5)), 0.0f);
        Matrix matrix2 = this.f441a;
        matrix2.set(matrix);
        matrix2.preTranslate(f5, f3);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += (float) i2;
        rectF.offset(0.0f, (float) (-i2));
        int[] iArr = a.i;
        iArr[0] = aVar2.f307f;
        iArr[1] = aVar2.e;
        iArr[2] = aVar2.f306d;
        Paint paint = aVar2.f305c;
        float f6 = rectF.left;
        paint.setShader(new LinearGradient(f6, rectF.top, f6, rectF.bottom, iArr, a.f300j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas2.concat(matrix2);
        canvas2.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        r rVar = this.f429c;
        return (float) Math.toDegrees(Math.atan((double) ((rVar.f438c - this.e) / (rVar.f437b - this.f430d))));
    }

    public p(r rVar, float f2, float f3) {
        this.f429c = rVar;
        this.f430d = f2;
        this.e = f3;
    }
}
