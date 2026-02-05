package X;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import androidx.emoji2.text.j;

public final class g extends T0.g {

    /* renamed from: l  reason: collision with root package name */
    public final f f993l;

    public final void L(boolean z2) {
        boolean z3;
        if (j.f1514k != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            this.f993l.L(z2);
        }
    }

    public final void M(boolean z2) {
        boolean z3;
        if (j.f1514k != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        f fVar = this.f993l;
        if (!z3) {
            fVar.f992n = z2;
        } else {
            fVar.M(z2);
        }
    }

    public final TransformationMethod T(TransformationMethod transformationMethod) {
        boolean z2;
        if (j.f1514k != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return transformationMethod;
        }
        return this.f993l.T(transformationMethod);
    }

    public final InputFilter[] p(InputFilter[] inputFilterArr) {
        boolean z2;
        if (j.f1514k != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return inputFilterArr;
        }
        return this.f993l.p(inputFilterArr);
    }

    public final boolean v() {
        return this.f993l.f992n;
    }

    public g(TextView textView) {
        this.f993l = new f(textView);
    }
}
