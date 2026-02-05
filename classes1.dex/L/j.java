package L;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f462a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f463b;

    public j(i iVar, boolean z2) {
        this.f463b = iVar;
        this.f462a = z2;
    }

    public boolean b(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        } else if (((i) this.f463b) == null) {
            return a();
        } else {
            char c2 = 2;
            for (int i2 = 0; i2 < i && c2 == 2; i2++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i2));
                j jVar = k.f464a;
                if (directionality != 0) {
                    if (!(directionality == 1 || directionality == 2)) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                c2 = 2;
                                break;
                        }
                    }
                    c2 = 0;
                }
                c2 = 1;
            }
            if (c2 == 0) {
                return true;
            }
            if (c2 != 1) {
                return a();
            }
            return false;
        }
    }

    public boolean a() {
        return this.f462a;
    }

    public j(BottomSheetBehavior bottomSheetBehavior, boolean z2) {
        this.f463b = bottomSheetBehavior;
        this.f462a = z2;
    }
}
