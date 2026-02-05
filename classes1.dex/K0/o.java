package K0;

import J0.a;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

public final class o extends t {

    /* renamed from: c  reason: collision with root package name */
    public final q f428c;

    public final void a(Matrix matrix, a aVar, int i, Canvas canvas) {
        boolean z2;
        a aVar2 = aVar;
        int i2 = i;
        Canvas canvas2 = canvas;
        q qVar = this.f428c;
        float f2 = qVar.f435f;
        float f3 = qVar.f436g;
        RectF rectF = new RectF(qVar.f432b, qVar.f433c, qVar.f434d, qVar.e);
        aVar.getClass();
        if (f3 < 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        Path path = aVar2.f308g;
        int[] iArr = a.f301k;
        if (z2) {
            iArr[0] = 0;
            iArr[1] = aVar2.f307f;
            iArr[2] = aVar2.e;
            iArr[3] = aVar2.f306d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = (float) (-i2);
            rectF.inset(f4, f4);
            iArr[0] = 0;
            iArr[1] = aVar2.f306d;
            iArr[2] = aVar2.e;
            iArr[3] = aVar2.f307f;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f5 = 1.0f - (((float) i2) / width);
            float[] fArr = a.f302l;
            fArr[1] = f5;
            fArr[2] = ((1.0f - f5) / 2.0f) + f5;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint = aVar2.f304b;
            paint.setShader(radialGradient);
            canvas.save();
            canvas2.concat(matrix);
            canvas2.scale(1.0f, rectF.height() / rectF.width());
            if (!z2) {
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, aVar2.f309h);
            }
            canvas.drawArc(rectF, f2, f3, true, paint);
            canvas.restore();
        }
    }

    public o(q qVar) {
        this.f428c = qVar;
    }
}
