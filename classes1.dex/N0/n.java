package N0;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f648a;

    public final void a(TextInputLayout textInputLayout) {
        q qVar = this.f648a;
        if (qVar.f673x != textInputLayout.getEditText()) {
            EditText editText = qVar.f673x;
            m mVar = qVar.f655A;
            if (editText != null) {
                editText.removeTextChangedListener(mVar);
                if (qVar.f673x.getOnFocusChangeListener() == qVar.b().e()) {
                    qVar.f673x.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            qVar.f673x = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(mVar);
            }
            qVar.b().m(qVar.f673x);
            qVar.j(qVar.b());
        }
    }

    public n(q qVar) {
        this.f648a = qVar;
    }
}
