package w0;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

public final class d implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MaterialButtonToggleGroup f4922a;

    public final int compare(Object obj, Object obj2) {
        MaterialButton materialButton = (MaterialButton) obj;
        MaterialButton materialButton2 = (MaterialButton) obj2;
        int compareTo = Boolean.valueOf(materialButton.f2174t).compareTo(Boolean.valueOf(materialButton2.f2174t));
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f4922a;
        return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
    }

    public d(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this.f4922a = materialButtonToggleGroup;
    }
}
