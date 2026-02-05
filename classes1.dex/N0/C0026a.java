package N0;

import android.content.Intent;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.datepicker.l;
import it.deviato.spotifuck.LockableHScrollView;
import it.deviato.spotifuck.MainActivity;
import it.deviato.spotifuck.SettingsActivity;

/* renamed from: N0.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0026a implements View.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f614f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f615g;

    public /* synthetic */ C0026a(int i, Object obj) {
        this.f614f = i;
        this.f615g = obj;
    }

    public final void onClick(View view) {
        Object obj = this.f615g;
        switch (this.f614f) {
            case 0:
                C0030e eVar = (C0030e) obj;
                EditText editText = eVar.i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    eVar.q();
                    return;
                }
                return;
            case 1:
                ((l) obj).u();
                return;
            case 2:
                y yVar = (y) obj;
                EditText editText2 = yVar.f724f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = yVar.f724f;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        yVar.f724f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        yVar.f724f.setTransformationMethod((TransformationMethod) null);
                    }
                    if (selectionEnd >= 0) {
                        yVar.f724f.setSelection(selectionEnd);
                    }
                    yVar.q();
                    return;
                }
                return;
            case 3:
                LockableHScrollView lockableHScrollView = MainActivity.f3163F;
                MainActivity mainActivity = (MainActivity) obj;
                mainActivity.getClass();
                mainActivity.startActivity(new Intent(mainActivity.getApplicationContext(), SettingsActivity.class));
                return;
            default:
                ((l) obj).L();
                throw null;
        }
    }
}
