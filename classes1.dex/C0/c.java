package C0;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

public abstract /* synthetic */ class c {
    public static /* synthetic */ WindowInsetsAnimation.Bounds h(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation i(int i, Interpolator interpolator, long j2) {
        return new WindowInsetsAnimation(i, interpolator, j2);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation j(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInlineVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.visitors.MethodInlineVisitor.inlineMth(MethodInlineVisitor.java:57)
        	at jadx.core.dex.visitors.MethodInlineVisitor.visit(MethodInlineVisitor.java:47)
        */
    public static /* synthetic */ void l() {
        /*
            android.view.WindowInsetsAnimation$Bounds r0 = new android.view.WindowInsetsAnimation$Bounds
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.c.l():void");
    }
}
