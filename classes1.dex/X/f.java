package X;

import T0.g;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

public final class f extends g {

    /* renamed from: l  reason: collision with root package name */
    public final TextView f990l;

    /* renamed from: m  reason: collision with root package name */
    public final d f991m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f992n = true;

    public final void L(boolean z2) {
        if (z2) {
            TextView textView = this.f990l;
            textView.setTransformationMethod(T(textView.getTransformationMethod()));
        }
    }

    public final void M(boolean z2) {
        this.f992n = z2;
        TextView textView = this.f990l;
        textView.setTransformationMethod(T(textView.getTransformationMethod()));
        textView.setFilters(p(textView.getFilters()));
    }

    public final TransformationMethod T(TransformationMethod transformationMethod) {
        if (this.f992n) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                return new j(transformationMethod);
            }
            return transformationMethod;
        } else if (transformationMethod instanceof j) {
            return ((j) transformationMethod).f999a;
        } else {
            return transformationMethod;
        }
    }

    public final InputFilter[] p(InputFilter[] inputFilterArr) {
        if (!this.f992n) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof d) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - sparseArray.size())];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            d dVar = this.f991m;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[(inputFilterArr.length + 1)];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            } else if (inputFilterArr[i4] == dVar) {
                return inputFilterArr;
            } else {
                i4++;
            }
        }
    }

    public final boolean v() {
        return this.f992n;
    }

    public f(TextView textView) {
        this.f990l = textView;
        this.f991m = new d(textView);
    }
}
