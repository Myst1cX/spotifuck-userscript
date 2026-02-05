package Q0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;
import t.C0339e;

public abstract /* synthetic */ class E {
    public static /* synthetic */ int d(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            default:
                throw null;
        }
    }

    public static /* synthetic */ void h(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ String i(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static int b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        throw new IllegalArgumentException(e("Unknown visibility ", i));
    }

    public static String e(String str, int i) {
        return str + i;
    }

    public static String f(String str, String str2) {
        return str + str2;
    }

    public static String g(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static final void a(View view, int i) {
        int a2 = C0339e.a(i);
        if (a2 == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.removeView(view);
            }
        } else if (a2 == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(view);
            }
            view.setVisibility(0);
        } else if (a2 == 2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(view);
            }
            view.setVisibility(8);
        } else if (a2 == 3) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(view);
            }
            view.setVisibility(4);
        }
    }

    public static int c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return b(view.getVisibility());
    }
}
