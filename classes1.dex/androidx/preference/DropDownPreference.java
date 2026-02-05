package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import g0.C0099b;
import g0.y;

public class DropDownPreference extends ListPreference {

    /* renamed from: X  reason: collision with root package name */
    public final ArrayAdapter f1875X;

    /* renamed from: Y  reason: collision with root package name */
    public Spinner f1876Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C0099b f1877Z = new C0099b(0, this);

    public final void k(y yVar) {
        int i;
        CharSequence[] charSequenceArr;
        Spinner spinner = (Spinner) yVar.f3338a.findViewById(2131296698);
        this.f1876Y = spinner;
        spinner.setAdapter(this.f1875X);
        this.f1876Y.setOnItemSelectedListener(this.f1877Z);
        Spinner spinner2 = this.f1876Y;
        String str = this.f1881U;
        if (str != null && (charSequenceArr = this.f1880T) != null) {
            i = charSequenceArr.length - 1;
            while (true) {
                if (i < 0) {
                    break;
                } else if (TextUtils.equals(charSequenceArr[i].toString(), str)) {
                    break;
                } else {
                    i--;
                }
            }
        }
        i = -1;
        spinner2.setSelection(i);
        super.k(yVar);
    }

    public final void l() {
        this.f1876Y.performClick();
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969003);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367049);
        this.f1875X = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.f1879S;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    public final void g() {
        super.g();
        ArrayAdapter arrayAdapter = this.f1875X;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
