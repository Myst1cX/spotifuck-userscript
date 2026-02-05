package X;

import K0.e;
import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.f;
import androidx.emoji2.text.j;
import java.nio.ByteBuffer;

public final class b extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final EditText f982a;

    /* renamed from: b  reason: collision with root package name */
    public final e f983b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        int i;
        e eVar = new e(8);
        this.f982a = editText;
        this.f983b = eVar;
        if (j.f1514k != null) {
            j a2 = j.a();
            if (a2.b() == 1 && editorInfo != null) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                f fVar = a2.e;
                fVar.getClass();
                Bundle bundle = editorInfo.extras;
                W.b bVar = (W.b) fVar.f1509c.f21f;
                int a3 = bVar.a(4);
                if (a3 != 0) {
                    i = ((ByteBuffer) bVar.f500d).getInt(a3 + bVar.f497a);
                } else {
                    i = 0;
                }
                bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i);
                Bundle bundle2 = editorInfo.extras;
                fVar.f1507a.getClass();
                bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
            }
        }
    }

    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f982a.getEditableText();
        this.f983b.getClass();
        if (e.i(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2)) {
            return true;
        }
        return false;
    }

    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f982a.getEditableText();
        this.f983b.getClass();
        if (e.i(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2)) {
            return true;
        }
        return false;
    }
}
