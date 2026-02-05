package N0;

import N.Q;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

public final class A implements TextWatcher {

    /* renamed from: f  reason: collision with root package name */
    public int f604f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ EditText f605g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f606h;

    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f606h;
        textInputLayout.u(!textInputLayout.F0, false);
        if (textInputLayout.f2387p) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f2403x) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f605g;
        int lineCount = editText.getLineCount();
        int i = this.f604f;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = Q.f509a;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f2406y0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f604f = lineCount;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public A(TextInputLayout textInputLayout, EditText editText) {
        this.f606h = textInputLayout;
        this.f605g = editText;
        this.f604f = editText.getLineCount();
    }
}
