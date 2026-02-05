package f1;

import Z0.c;

public abstract class g extends f {
    public static String V(String str) {
        c.e("<this>", str);
        c.e("missingDelimiterValue", str);
        int lastIndexOf = str.lastIndexOf(46, str.length() - 1);
        if (lastIndexOf == -1) {
            return str;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        c.d("this as java.lang.String…ing(startIndex, endIndex)", substring);
        return substring;
    }
}
