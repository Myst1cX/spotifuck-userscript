package androidx.emoji2.text;

import A.k;
import W.a;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import p0.C0320a;

public final class v extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public final Paint.FontMetricsInt f1550a = new Paint.FontMetricsInt();

    /* renamed from: b  reason: collision with root package name */
    public final u f1551b;

    /* renamed from: c  reason: collision with root package name */
    public short f1552c = -1;

    /* renamed from: d  reason: collision with root package name */
    public float f1553d = 1.0f;
    public TextPaint e;

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, Paint paint) {
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = paint;
        TextPaint textPaint2 = null;
        if (charSequence2 instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence2).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (!(characterStyleArr.length == 1 && characterStyleArr[0] == this)) {
                    TextPaint textPaint3 = this.e;
                    if (textPaint3 == null) {
                        textPaint3 = new TextPaint();
                        this.e = textPaint3;
                    }
                    textPaint2 = textPaint3;
                    textPaint2.set(textPaint);
                    for (CharacterStyle updateDrawState : characterStyleArr) {
                        updateDrawState.updateDrawState(textPaint2);
                    }
                }
            }
            if (textPaint instanceof TextPaint) {
                textPaint2 = (TextPaint) textPaint;
            }
        } else if (textPaint instanceof TextPaint) {
            textPaint2 = (TextPaint) textPaint;
        }
        if (!(textPaint2 == null || textPaint2.bgColor == 0)) {
            int color = textPaint2.getColor();
            Paint.Style style = textPaint2.getStyle();
            textPaint2.setColor(textPaint2.bgColor);
            textPaint2.setStyle(Paint.Style.FILL);
            canvas.drawRect(f2, (float) i3, f2 + ((float) this.f1552c), (float) i5, textPaint2);
            textPaint2.setStyle(style);
            textPaint2.setColor(color);
        }
        j.a().getClass();
        float f3 = (float) i4;
        if (textPaint2 != null) {
            textPaint = textPaint2;
        }
        u uVar = this.f1551b;
        k kVar = uVar.f1548b;
        Typeface typeface = textPaint.getTypeface();
        textPaint.setTypeface((Typeface) kVar.i);
        canvas.drawText((char[]) kVar.f22g, uVar.f1547a * 2, 2, f2, f3, textPaint);
        textPaint.setTypeface(typeface);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        short s2;
        Paint.FontMetricsInt fontMetricsInt2 = this.f1550a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = ((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f;
        u uVar = this.f1551b;
        a c2 = uVar.c();
        int a2 = c2.a(14);
        short s3 = 0;
        if (a2 != 0) {
            s2 = ((ByteBuffer) c2.f500d).getShort(a2 + c2.f497a);
        } else {
            s2 = 0;
        }
        this.f1553d = abs / ((float) s2);
        a c3 = uVar.c();
        int a3 = c3.a(14);
        if (a3 != 0) {
            ((ByteBuffer) c3.f500d).getShort(a3 + c3.f497a);
        }
        a c4 = uVar.c();
        int a4 = c4.a(12);
        if (a4 != 0) {
            s3 = ((ByteBuffer) c4.f500d).getShort(a4 + c4.f497a);
        }
        short s4 = (short) ((int) (((float) s3) * this.f1553d));
        this.f1552c = s4;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s4;
    }

    public v(u uVar) {
        C0320a.j("rasterizer cannot be null", uVar);
        this.f1551b = uVar;
    }
}
