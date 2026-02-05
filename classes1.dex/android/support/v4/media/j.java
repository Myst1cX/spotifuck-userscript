package android.support.v4.media;

import android.media.Rating;

public abstract class j {
    public static float a(Rating rating) {
        return rating.getPercentRating();
    }

    public static int b(Rating rating) {
        return rating.getRatingStyle();
    }

    public static float c(Rating rating) {
        return rating.getStarRating();
    }

    public static boolean d(Rating rating) {
        return rating.hasHeart();
    }

    public static boolean e(Rating rating) {
        return rating.isRated();
    }

    public static boolean f(Rating rating) {
        return rating.isThumbUp();
    }

    public static Rating g(boolean z2) {
        return Rating.newHeartRating(z2);
    }

    public static Rating h(float f2) {
        return Rating.newPercentageRating(f2);
    }

    public static Rating i(int i, float f2) {
        return Rating.newStarRating(i, f2);
    }

    public static Rating j(boolean z2) {
        return Rating.newThumbRating(z2);
    }

    public static Rating k(int i) {
        return Rating.newUnratedRating(i);
    }
}
