package T;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

public interface t {
    ColorStateList getSupportButtonTintList();

    void setSupportButtonTintList(ColorStateList colorStateList);

    void setSupportButtonTintMode(PorterDuff.Mode mode);
}
